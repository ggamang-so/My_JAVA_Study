import java.sql.*;

public class SelectTest {
    public SelectTest(){
        start();
    }
    public void start(){
        //oracle 데이터 베이스 레코드 선택하기
        Connection con =null;
        PreparedStatement pstmt = null;
        ResultSet rs=null;

        try {//1. JDBC드라이버를 자바 가상 머신에 등록한다.
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //2. DB연결
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String username = "scott";
            String password = "tiger";
            //                      서버주소, 계정, 비번
            con = DriverManager.getConnection(url, username, password);

            String sql = "select empno, ename,job,mgr, hiredate,sal, comm, deptno from emp"
                    +" order by ename asc";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()){  //recode가 있으면 true, 없으면 false 반환해줌
                int empno = rs.getInt(1);
                String ename = rs.getString(2);
                String job = rs.getString(3);
                int mgr = rs.getInt(4);
                String hiredate = rs.getString(5);
                double sal = rs.getDouble(6);
                double comm = rs.getDouble(7);
                int deptno = rs.getInt(8);
                System.out.println(empno+"\t"+ename+"\t"+job+"\t"+mgr+"\t"+hiredate+"\t"+sal+"\t"+comm+"\t"+deptno);
            }
        } catch (ClassNotFoundException e){
            System.out.println("JDBC드라이버 오류..."+e.getMessage());
        } catch(SQLException b){
            System.out.println("DB 연결 오류..."+b.getMessage());
        }finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            }catch(SQLException s){
                System.out.println("DB 닫기 예외 발생...");
            }
        }
    }
    public static void main(String[] args) {
        SelectTest st = new SelectTest();

    }
}
