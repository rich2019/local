package test;

/**
 * Debug调试程序,
 *  可以让代码逐行运行,查看代码的运行过程
 *     行号的右边鼠标左键单击,添加断点(每个方法的第一行,或者哪里有bug添加到哪里)
 *  执行程序:
 *      f8:逐行执行
 *      f7:进入到方法中
 *      shift+f8:跳出方法
 *      f9:调到下一断点(没有就结束程序)
 *      ctrl+f2:退出debug,停止程序
 */
public class TestDebug {
    public static void main(String[] args) {
        /*int a = 1;
        int b =32;
        int sum = a+b;
        System.out.println(sum  );*/
       /* for(int i = 0; i < 3;i++){
            System.out.println(i);
        }*/
           priny();
    }

    private static void priny() {
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
    }
}
