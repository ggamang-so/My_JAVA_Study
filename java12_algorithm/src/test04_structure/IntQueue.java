package test04_structure;

import java.util.concurrent.LinkedTransferQueue;

public class IntQueue {
    private int max; // 용량
    private int front; // 앞쪽(dequeue)위치
    private int rear; // 뒤쪽(enqueue)위치
    private int num; // 데이터의 수
    private int queue[]; //queue 처리할 배열

    public IntQueue(){
        this(10);
    }

    public IntQueue(int capacity){
        num = front = rear = 0;
        max = capacity;
        try{
            queue = new int[max];
        }catch(OutOfMemoryError oome){
            max = 0;
        }
    }
    // 데이터 넣기(Enqueue)
    public int enqueue(int data){
        // queue가 가득 찼을 때 예외 발생
        if (max == num){
            throw new OverFlowIntQueueException();
        }
        //queue 가 가득차지 않았을 때
        queue[rear++] = data; // queue의 rear 위치에 데이터 담고 rear 1증가
        num++; // 데이터수 증가

        // 용량과 rear가 가으면 배열의 범위를 벗어남. -> rear = 0; 으로 초기화
        if(max==rear) rear =0;

        return data;
    }
    // 데이터 빼기(Dequeue)
    public int dequeue(){
        if(num==0){ // queue가 비어있는지 확인 -> 비어 있으면 예외 발생
            throw new EmptyIntQueueException();
        }
        int data = queue[front++]; // front 위치의 데이터 받고 front 1증가
        num--; // 데이터 수 1 감소
        return data;
    }
    //데이터 확인하기(데이터 유지)
    public int peek(){
        if(num ==0){
            throw new EmptyIntQueueException();
        }
        return queue[front];
    }

    // 데이터 전체 보기(Dump)
    public String dataView(){
        String str = "";
        for (int i = 0; i < max; i++) {
            str+="queue["+i+"]=" + queue[i];
            if(i!=max-1) str += ",";
        }
        return str;
    }
    // 데이터 찾기(indexOf)
    public int indexOf(int data){
        // 데이터가 있으면 index 반환
        for (int i=0; i<num; i++){
            int index = (front+i)%max;
            if(queue[index] == data)
                return index;
        }
        // 데이터가 없으면 -1반환

        return -1;
    }
    public int capacity(){
        return max;
    }
    public int size(){
        return num;
    }
    public boolean isEmpty(){
        if (num==0) return true;
        return false;
    }
    public boolean isFull(){
        if(num==max) return true;
        return false;
    }
    public int peekLast(){
        if (isEmpty()){
            return -1;
        }
        if (rear == 0){
            return queue[max-1];
        }
        return queue[rear-1];
    }
    public int pollLast(){
        if (isEmpty()){
            return -1;
        }
        num--;
        if (rear == 0){
            rear = max-1;

            return queue[rear];
        }
        return queue[--rear];


    }

    public  static class OverFlowIntQueueException extends RuntimeException{
        public OverFlowIntQueueException(){
            System.out.println("Queue가 가득 찼습니다");
        }
    }
    public static class EmptyIntQueueException extends RuntimeException{
        public EmptyIntQueueException(){
            System.out.println("Queue가 비어 있습니다.");
        }
    }
}
