package test04_structure;

import java.util.Arrays;
import java.util.Scanner;

public class IntStackTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //스택 생성
        IntStack stack = new IntStack(5);

        while (true) {
            System.out.println("현재 데이터 수 : " + stack.size() + ",  스택의 크기 : " + stack.capacity());
            System.out.print("(1)PUSH (2)POP (3)PEEK (4)DUMP (5)SEARCH (6)EMPTY (7) 스택정보표시 (0)종료 ->");
            int menu = scan.nextInt();

            if (menu == 0) {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }
            switch (menu) {
                case 1:  //push - 데이터 담기
                    System.out.print("데이터 값 : ");
                    int data = scan.nextInt();
                    try {
                        stack.push(data);

                    } catch (IntStack.OverflowInStackException oise) {

                    }
                    break;
                case 2:  //pop - 스택의 마지막 데이터 빼기
                    try {
                        int popData = stack.pop();
                        System.out.println("pop한 데이터는 [ " + popData + " ] 입니다");
                    } catch (IntStack.EmptyIntStackException eise) {

                    }
                    break;
                case 3:  //PEEK - 스택에서 마지막 데이터를 확인하기
                    try {
                        int peekData = stack.peek();
                        System.out.println("스택의 꼭대기 값은 [ " + peekData + " ]입니다.");
                    } catch (IntStack.EmptyIntStackException eise) {
                    }
                    break;
                case 4:  //dump - 스택의 모든 데이터 출력
                    try {
                        System.out.println(stack.dump());
                    } catch (IntStack.EmptyIntStackException eise) {
                    }
                    break;
                case 5:  //search - 데이터 찾기
                    System.out.print("찾을 데이터 : ");
                    int searchData = scan.nextInt();
                    int result = stack.indexOf(searchData);
                    if (result >= 0) {
                        System.out.println("찾는 데이터는 인덱스 [" + result + "] 위치에 있습니다.");
                    } else {
                        System.out.println(searchData + " 는 스택에 없습니다. ");
                    }
                    break;
                case 6:  //Empty - 데이터 비움
                    stack.clear();
                    break;
                case 7:  //스택정보표시 (
                    System.out.println("스택 용량 : "+ stack.max);// 용량,
                    System.out.println("스택 데이터수 : "+ stack.pointer);// 데이터 수 ,
                    System.out.println("스택이 비어" + (stack.isEmpty()?"있습니다.":"있지 않습니다."));// 스택비어있는지,
                    System.out.println("스택이 가득" + (stack.isFull()?"찼습니다.":"차지 않았습니다."));// 가득 찼는지,
                    break;
                case 8:
                    System.out.print("삭제할 값 : ");
                    int delData = scan.nextInt();
                    boolean delResult = stack.remove(delData);
                    if(delResult){
                        System.out.println(delData + "가 스택에서 삭제 되었습니다.");
                    }else{
                        System.out.println(delData + "를 삭제하지 못했습니다.");
                    }
                    break;

                default:
                    System.out.println("메뉴를 잘못입력하였습니다.");
            }


        }

    }
}
