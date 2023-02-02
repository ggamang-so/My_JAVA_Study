import java.sql.*;

public class DBConnection {

    protected Connection con =  null;
    protected PreparedStatement ps = null;
    protected ResultSet rs = null;

    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String username = "scott";
    String password = "tiger";

    protected String sql = null;

    static {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch(Exception e){
            System.out.println("드라이버 로딩 예외");
            e.printStackTrace();
        }
    }

    //DB 연결 메서드
    public void getConnection(){
    try{
        con= DriverManager.getConnection(url, username, password);
    }catch(Exception e){
        System.out.println("DB 연결 예외 발생");
        e.printStackTrace();
    }



    }


    //DB 닫는 메서드
    public void dbClose(){
        try{
            if(rs != null) rs.close();
            if(ps != null) ps.close();
            if(con != null) con.close();
        }catch(Exception a){
            System.out.println("DB닫기 예외");
            a.printStackTrace();
        }
    }



}
