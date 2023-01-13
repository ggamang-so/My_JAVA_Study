import java.util.Scanner;

//2148
public class StandardWeight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이 = ");
		int age = scan.nextInt();
		System.out.print("성별(1:남성, 2:여성) = ");
		int gender= scan.nextInt();
		System.out.print("키(cm) = ");
		int height = scan.nextInt();
		System.out.print("현재체중(kg) = ");
		int weight = scan.nextInt();
		
		double aveWeight; // 표준체중
		
		if (age<=35) {
			switch (gender) {
			case 1: aveWeight = (height-100)*0.9;
			default: aveWeight = (height-100)*0.85;
			}
		}else {
			switch (gender) {
			case 1: aveWeight = (height-100)*0.95;
			default: aveWeight = (height-100)*0.9;
			}
		}
		
		double index = (weight/aveWeight)*100; //표준체중지수
		String bodyType; // 표준체중지수 평가기준
		if(126<=index){
			bodyType = "비만형";
		}else if(116<=index && index<125){
			bodyType = "조금 비만형";
		}else if(96<=index && index<116){
			bodyType = "표준형";
		}else if(86<=index && index<96){
			bodyType = "조금 마른형";
		}else {
			bodyType = "마른형";
		}
		System.out.println("표준체중 = "+(int)aveWeight);
		System.out.println("당신의 표준체중지수는 "+index+"으로 '"+bodyType+"' 입니다.");
		
		

	}

}

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//다음기준에 맞는 프로그램을 작성하라. 
//클래스명 : StandardWeight
//표준체중 기준
//35세 이하
//    남성 : (키 - 100)*0.90
//    여성 : (키 - 100)*0.85
//36세 이상
//   남성 : (키 - 100)*0.95
//   여성 : (키 - 100)*0.90
//
//표준체중 지수 = (현재체중/표준체중) * 100
//
//   표준체중지수 평가기준
//     마른형 : 85이하
//     조금마른형 : 86~95
//     표준형 : 96~115
//     조금 비만형 : 116~125
//     비만형 : 126이상
//
//======================================================
//실행결과
//나이 = 36
//성별(1:남성,2:여성)=1
//키 =176
//현재체중 =79
//표준체중 = 72
//당신은 표준체중지수는 92.10526315789474으로 조금마른형입니다.
//
//+++++++++++++++++++++++++++++++++++++++++++++++
