import java.sql.*;
import java.util.Scanner;

public class SelectSearchTest {
    Connection con=null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String username = "scott";
    String password = "tiger";

    static{
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch(Exception e){
            System.out.println("드라이버 로딩 예외 발생");
        }
    }


    Scanner scan = new Scanner(System.in);
    public SelectSearchTest() {
        employee();
    }
    public void employee(){
        // 이름 입력받아 DB 조회하기
        try {
            con =DriverManager.getConnection(url, username, password);
            System.out.print("찾을 이름은? : ");
            String name = scan.nextLine();
            String sql = "select empno, ename, job, hiredate, sal from emp where ename = upper(?)";
            ps = con.prepareStatement(sql);
            // 쿼리문에 ?가 있을 경우에 대해 처리 해줘야함
            //                      index, 쿼리문
            ps.setString(1, name); // 1번째 ?에 name 변수 넣기
            rs = ps.executeQuery();
            if(rs.next()){ // 사원정보가 있을때
                System.out.printf("%d\t%s\t%s\t%s\t%.1f\n",rs.getInt(1),rs.getString(2),rs.getString(3),
                        rs.getString(4).substring(0, 10),rs.getDouble(5));
            }else { //사원 정보가 없을때
            }
        }catch(Exception a){
            System.out.println("사원 검색 예외 발생"+ a.getMessage());
            a.printStackTrace();

        }finally{
            try {
                if (rs != null) rs.close();
                if (ps !=null) ps.close();
                if (con !=null) con.close();
            }catch(Exception e ){
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args) {
        new SelectSearchTest();

    }
}
