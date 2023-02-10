import oracle.jdbc.internal.OracleTypes;

import java.sql.ResultSet;
import java.util.Scanner;

public class SelectAllProcedure extends DBConnection{
    public SelectAllProcedure(){}
    Scanner scan = new Scanner(System.in);

    public void AllStart(){
        try{
            getConnection();
            sql = "{call book_all_select(?)}";
            cstmt = con.prepareCall(sql);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            //실행
            cstmt.executeLargeUpdate();
            rs = (ResultSet) cstmt.getObject(1);
            while(rs.next()){
                System.out.printf("%d\t%s\t%d\t%s\t%s\t%s\t%s\t%s\n",
                        rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4),
                         rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            dbClose();
        }

    }

    public static void main(String[] args) {
        SelectAllProcedure sap = new SelectAllProcedure();
        sap.AllStart();
    }
}
