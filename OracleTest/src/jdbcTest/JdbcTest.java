package jdbcTest;

import java.sql.*;

public class JdbcTest {
    public static void main(String[] args) {
        String driver = "oracle.jdbc.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        //"jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "scott";
        String password = "tiger";
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        boolean flag = false;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            String sql = "select * from emp";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                double sal = rs.getDouble("sal");
                Date hiredate = rs.getDate("hiredate");
                int deptno = rs.getInt(("deptno"));
                System.out.println(empno + "\t" + ename + "\t" + sal + "\t" + hiredate + "\t" + deptno);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            rs.close();
            pst.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
