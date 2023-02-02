import java.util.Scanner;

public class UpdateTest extends DBConnection{
    Scanner scan = new Scanner(System.in);

    public UpdateTest(){
        start();
    }
    public void start(){
        // 수정할 사원번호 입력,
        // 담당업무, 급여, 보너스 수정

        try{
            System.out.print("수정할 사원 번호 : ");
            int empno = Integer.parseInt(scan.nextLine());
            System.out.print("담당 업무 : ");
            String job = scan.nextLine();
            System.out.print("급여 : ");
            double sal = Double.parseDouble(scan.nextLine());
            System.out.print("보너스 :");
            double comm = Double.parseDouble(scan.nextLine());

            getConnection();
            sql = "update emp2 set job=?, sal=?, comm=? where empno=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, job);
            ps.setDouble(2, sal);
            ps.setDouble(3, comm);
            ps.setInt(4, empno);

            int result = ps.executeUpdate();
            System.out.println(result);
            if(result>0){
                System.out.printf("%d 사원번호에 대한 정보가 수정되었습니다.\n", empno);
            }else{
                System.out.printf("%d 사원번호에 대한 정보 수정에 실패하였습니다.\n", empno);
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            dbClose();
        }
    }

    public static void main(String[] args) {
        new UpdateTest();
    }

}
