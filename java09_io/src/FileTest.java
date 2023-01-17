import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

public class FileTest {

	public FileTest() {
		// File : 
		File file1 = new File("F://java_test");
		File file2 = new File("F://java_test//file_test.txt");
		File file3 = new File(file1, "file_test.txt");
		File file4 = new File("F://java_test", "file_test.txt");
		
		
		//mkdir() : 하위 폴더 없이 폴더 생성
		//mkdirs() : 하위의 폴더까지 같이 폴더 생성
		//isDirectory : 파일인지 폴더인지 폴더면 : true / 파일이면 : false
		//exists() : 폴더나 파일이 존재하는지 boolean으로 반환;
		File file5 = new File("F://sample");
		File file6 = new File("F://goguma//folder");
		
		file5.mkdir(); //mkdir() 폴더만들기 DOS 명령어
		file6.mkdirs(); // mkdirs()
		
		File file7 = new File(file5, "dddd.txt");
		try {
			boolean result = file7.createNewFile(); // 
			if (result) {
				System.out.println("파일생성됨");
			}else {
				System.out.println("파일생성 안됨");
			}
			
			//마지막 수정일
			//마지막 수정일을 ms 단위로 구해줌
			//기준일 = > 1970년 01월 01년 00:00:00 
			long lastSave = file3.lastModified();
			System.out.println(lastSave);
			Calendar dateTime= Calendar.getInstance();
			dateTime.setTimeInMillis(lastSave);
			
			// 2023-01-16 오후 04:05
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
			String dateStr = fmt.format(dateTime.getTime());
			System.out.println("file2 마지막 수정일 : " + dateStr);
			
			//특정위치
			File file8 = new File("C://");
			File[] fa = file8.listFiles();
			for (File a : fa) {
				if (a.isDirectory()) {
					if (a.isHidden()) {
						System.out.println("[숨긴폴더] : " + a.getPath());
					}else {
						System.out.println("[일반폴더] : " + a.getPath());
					}
				}else {
					if (a.isHidden()) {
						System.out.println("[숨긴폴더] : " + a.getPath());
					}else {
						System.out.println("[일반파일] : " + a.getPath());
					}
				}
				
//				System.out.println(a.getPath());
			}
			//File 객체에
			// .getPath() : 드라이브//경로//파일명(파일인경우)
			// .getName() : 파일명(확장자포함) or 폴더명
			// .getAbsolutePath() : 드라이브//경로//파일명(파일인경우)
			// .getParent() : 드라이브//경로
			// 폴더나 파일명 앞에 $가 붙은것은 숨긴파일(폴더)
			
			//현재 컴퓨터의 드라이브 목록
			File[] drive = File.listRoots();
			for (File a : drive) {
				System.out.println(a.getPath());
			}
			
			
			//파일 크기(byte)
			System.out.println("파일크기 = "+ file2.length());
			
			//파일 삭제
//			file7.delete();
			file5.delete(); // 폴더 삭제시 빈 폴더일 경우만 가능함
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				
	}

	public static void main(String[] args) {
		new FileTest();

	}

}
