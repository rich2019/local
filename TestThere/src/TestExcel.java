import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import static org.apache.poi.hssf.record.cf.BorderFormatting.BORDER_THIN;

/**
 * 打开Excel文档；添加工作表；获得工作表中一个单元格；
 * 获得一个范围的单元格；设置行高；单元格添加文字；
 * 设置单元格字体颜色、字体；设置边框；设置文字对齐方式；
 * 合并单元格。
 */
public class TestExcel {
    public static void main(String[] args) throws IOException {

        //打开Excel文档；添加工作表；获得工作表中一个单元格
        File file = new File("G:/java/hello.xls");
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("第一页");
        HSSFRow row = sheet.createRow(3);
        HSSFCell cell = row.createCell(3);
        cell.setCellValue("hello world");

        /*设置单元格字体颜色、字体；设置边框；设置文字对齐方式；*/
        // 创建样式和字体
        CellStyle style = wb.createCellStyle();
        HSSFFont redFont = wb.createFont();
        //颜色
        redFont.setColor(Font.COLOR_RED);
        //设置字体大小
        redFont.setFontHeightInPoints((short) 10);
        //字体
        redFont.setFontName("宋体");
        style.setFont(redFont);
        
        //设置边框
        style.setBorderBottom(BorderStyle.valueOf(BORDER_THIN));
        style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderLeft(BorderStyle.valueOf(BORDER_THIN));
        style.setLeftBorderColor(IndexedColors.GREEN.getIndex());
        style.setBorderRight(BorderStyle.valueOf(BORDER_THIN));
        style.setRightBorderColor(IndexedColors.BLUE.getIndex());
        style.setBorderTop(BorderStyle.valueOf(BORDER_THIN));
        style.setTopBorderColor(IndexedColors.BLACK.getIndex());
        cell.setCellStyle(style);
        

        /*获得一个范围的单元格；设置行高；单元格添加文字；*/
        int height = 3;
        int width = 3;
        HSSFRow[] rows = new HSSFRow[height];
        HSSFCell[] cells = new HSSFCell[width];
        for (int i = 0; i < height; i++) {
            //创建行
            rows[i] = sheet.createRow(i);
            //设置行高
            rows[i].setHeightInPoints(50);
            for (int j = 0; j < width; j++) {
                //创建列
                cells[j] = (HSSFCell) rows[i].createCell(j);

                //设置列宽
                sheet.setColumnWidth(j, 30 * 256);
                //设置字体
                cells[j].setCellStyle(style);
                //在列中添加文字
                cells[j].setCellValue("这是第" + i + "行" + "第" + j + "列");

            }
        }

        //这里代表在第0行开始,到3行结束,从0列开始,到3列结束,进行合并,也就是合并第0行的0-10个单元格
        /*CellRangeAddress cellRange1 = new CellRangeAddress(0, 3, (short) 0, (short) 3);
        sheet.addMergedRegion(cellRange1);*/


        FileOutputStream out = new FileOutputStream(file);
        wb.write(out);
        out.flush();
        out.close();
        System.out.println("请输入你的名字");
        new Scanner(System.in).next();


    }
}
