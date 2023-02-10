import java.sql.Types;
import java.util.Scanner;

public class InsertProcedure extends DBConnection{
    Scanner scan = new Scanner(System.in);

    public InsertProcedure() {
    }

    public void insertStart() {
        // 콘솔에서 책정보를 입력받아 DB에 등록하는 클래스
        System.out.print("도서명 : ");
        String bookname = scan.nextLine();
        System.out.print("가격 : ");
        int price = Integer.parseInt(scan.nextLine());
        System.out.print("출판일(예 : 2022-09-10) : ");
        String pub_date = scan.nextLine();
        System.out.print("카테고리 : ");
        String category = scan.nextLine();
        System.out.print("작가명 : ");
        String author_name = scan.nextLine();
        System.out.print("출판사 명 : ");
        String pub_name = scan.nextLine();
        try {
            //DB 연결
            getConnection();

            //Procedure 호출
            sql = "{call booksInsert(?, ?, ?, ?, ?, ?, ?)}"; // procedure와 매개변수 갯수 맞아야 함, in, out 다 포함
            cstmt = con.prepareCall(sql); //callableStatement 객체로 불러옴
            //데이터 세팅 ( in parameter )
            cstmt.setString(1, bookname);
            cstmt.setInt(2, price);
            cstmt.setString(3, pub_date);
            cstmt.setString(4, category);
            cstmt.setString(5, author_name);
            cstmt.setString(6, pub_name);
            //데이터 받기 (out parameter)
            cstmt.registerOutParameter(7, Types.INTEGER);
            //procedure 실행하기
            cstmt.executeUpdate();

            //실행 결과
            if (cstmt.getInt(7) > 0) { //도서가 등록되었을 때
                System.out.println(bookname + " 도서가 등록되었습니다.");
            } else { // 도서 등록에 실패했을 때
                System.out.println(bookname + " 도서가 등록되지 않았습니다.");
            }


        }catch(Exception e){
            e.printStackTrace();
        }finally{
            dbClose();
        }

    }
    public static void main(String[] args) {
        InsertProcedure ip = new InsertProcedure();
        ip.insertStart();
    }

}
