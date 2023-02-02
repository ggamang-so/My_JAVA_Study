import java.util.Stack;

public class StackTest {

	public StackTest() {
		// Stack 객체 생성

		Stack<String> nameStack = new Stack<String>();

		nameStack.push("이순신");
		nameStack.push("세종대왕");
		nameStack.push("BTS");
		nameStack.push("BlackPink");
		nameStack.push("김삿갓");
		// 먼저 push한 정보부터 차례대로 들어감\

		while(!nameStack.empty()) {
			System.out.println(nameStack.pop() + ", " + nameStack.size());
		}
	}

	public static void main(String[] args) {
		new StackTest();

	}

}
