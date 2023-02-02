import java.util.Scanner;

public class InsertTest extends DBConnection {
    public InsertTest(){
        start();
    }
    public void start(){
        Scanner scan = new Scanner(System.in);

        // ------사원등록-------

        System.out.print("사원번호 : ");
        int empno = Integer.parseInt(scan.nextLine());
        System.out.print("사원명 : ");
        String ename = scan.nextLine();
        System.out.print("담당업무 : ");
        String job = scan.nextLine();
        System.out.print("관리자 사원번호 : ");
        int mgr = Integer.parseInt(scan.nextLine());
        System.out.print("입사일 : ");
        String hiredate = scan.nextLine();
        System.out.print("급여 : ");
        double sal = Double.parseDouble(scan.nextLine());
        System.out.print("보너스 : ");
        double comm = Double.parseDouble(scan.nextLine());
        System.out.print("부서코드 : ");
        int deptno = Integer.parseInt(scan.nextLine());

        try {
            getConnection();
            sql = "insert into emp2(empno, ename, job, mgr, hiredate, sal, comm, deptno)"
                    + " values(?, ?, ?, ?, to_date(?, 'YYYY-MM-DD'), ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, empno);
            ps.setString(2, ename);
            ps.setString(3, job);
            ps.setInt(4, mgr);
            ps.setString(5, hiredate);
            ps.setDouble(6, sal);
            ps.setDouble(7, comm);
            ps.setInt(8, deptno);


            // 실행
            int result = ps.executeUpdate();
            if(result > 0){
                System.out.println("사원이 등록되었습니다.");
            }else{
                System.out.println("사원 등록이 실패하였습니다.");
            }
            //commit은 프로그램에서 연동해서 insert, update, delete는 자동커밋이 된다.
        }catch(Exception e){
            e.printStackTrace();
        }finally{ // DB 닫기
            dbClose();
        }





    }

    public static void main(String[] args) {
        new InsertTest();
    }
}
