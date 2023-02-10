import oracle.jdbc.internal.OracleTypes;

import java.sql.ResultSet;
import java.util.Scanner;

public class SelectSearchProcedure extends DBConnection{
    Scanner scan = new Scanner(System.in);
    public SelectSearchProcedure(){

    }
    public void SearchStart(){
        System.out.print("검색할 도서명 : " );
        String searchWord = scan.nextLine();

        try{
            getConnection();
            while(true) {
                sql = "{call book_search(?,?)}";
                cstmt = con.prepareCall(sql);
                cstmt.setString(1,searchWord);
                cstmt.registerOutParameter(2, OracleTypes.CURSOR);
                cstmt.executeLargeUpdate();
                rs = (ResultSet)cstmt.getObject(2);
                while(rs.next()){
                    System.out.printf("%d\t%s\t%d\t%s\t%s\n",rs.getInt(1), rs.getString(2), rs.getInt(3),
                            rs.getString(4), rs.getString(5));
                }
                break;




            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            dbClose();
        }
    }

    public static void main(String[] args) {
        new SelectSearchProcedure().SearchStart();
    }
}
