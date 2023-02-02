package test04_structure;

import java.util.Scanner;

public class IntQueueTest {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        IntQueue que = new IntQueue(5); //queue 객체 생성하기

        while(true){
            System.out.print("(1)Enqueue (2)Dequeue (3)Peek (4)데이터보기 (5)Dump (6)IndexOf (7)Exit : ");
            int menu = scan.nextInt();

            switch(menu){
                case 1: //Enqueue : 데이터 넣기
                    System.out.print("데이터 입력 : ");
                    int data = scan.nextInt();
                    try {
                        que.enqueue(data);
                    }catch(IntQueue.OverFlowIntQueueException o){
                    }
                    break;
                case 2: //Dequeue : 데이터 빼기
                    try{
                        int dequeData = que.dequeue();
                        System.out.println("큐의 제일 앞 값 : " + dequeData);
                    }catch(IntQueue.EmptyIntQueueException e){}
                    break;
                case 3: //Peek : 데이터 확인
                    try{
                        int firstData = que.peek();
                        System.out.println("큐의 제일 앞 값 : " + firstData);
                    }catch(IntQueue.EmptyIntQueueException e){}
                    break;
                case 4: //Dump : 데이터 전체 출력
                    System.out.println("데이터 용량 : "+que.capacity()); // 큐의 용량
                    System.out.println("데이터의 수 : "+que.size());     // 데이터의 수
                    System.out.println("큐가 비어 "+(que.isEmpty()? "있습니다":"있지 않습니다"));  // 큐가 비었는지
                    System.out.println("큐가 가득 차"+(que.isFull()? " 있습니다":"있지 않습니다"));   // 큐가 가득찼는지
                    System.out.println("마지막 데이터는 "+que.peekLast() + " 입니다"); // 큐의 마지막 데이터
                    System.out.println("마지막 데이터는 "+que.pollLast() + " 입니다");// 큐의 마지막 데이터 가지고 나오고 지우기
                    break;
                case 5: //Dump : 데이터 전체 출력
                    System.out.println(que.dataView());
                    break;
                case 6: //DataSearch : 데이터 전체 출력
                    System.out.print("찾을 데이터 : ");
                    int searchData = scan.nextInt();
                    int index = que.indexOf(searchData);
                    System.out.println(index + " 위치에 " +searchData + "가 있습니다.");
                    break;

                default:
                    break;
            }


        }
    }
}
