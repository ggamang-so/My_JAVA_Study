import java.util.Scanner;

public class DeleteTest extends DBConnection{

    Scanner scan = new Scanner(System.in);

    public DeleteTest(){
        start();
    }

    public void start(){
        try{
            System.out.print("삭제할 사원명 : ");
            String ename = scan.nextLine();

            getConnection();
            sql = "delete from emp2 where ename=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, ename);

            int result = ps.executeUpdate();

            if(result>0){
                System.out.println("성공");
            }else{
                System.out.println("실패");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            dbClose();
        }
    }
    public static void main(String[] args) {
        new DeleteTest();
    }
}
