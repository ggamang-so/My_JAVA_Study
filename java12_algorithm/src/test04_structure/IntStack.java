package test04_structure;

public class IntStack {
    int max; // 스택의 크기 - 스택에 넣을 수 있는 데이터의 갯수
    int pointer; //
    int stack[];
    public IntStack(){
        // 스택(배열)의 크기를 설정하지 않았을 때 20개의 데이터를 저장할 수 있도록 배열을 생성한다.
    this(20);

    }
    public IntStack(int capacity){
        try {
            stack = new int[capacity];
            max = capacity;
            pointer = 0;

        }catch (OutOfMemoryError oome){
            max = 0; // 에러 발생시 스택의 크기를 초기화
        }

    }

//    실행시 데이터가 넘칠 때 발생시킬 예외 클래스
    public class OverflowInStackException extends RuntimeException{
        public OverflowInStackException(){
            System.out.println("스택이 가득 찼습니다");
        }

    }
    public  class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){
            System.out.println("스택이 비었습니다.");
        }
    }

    public int size(){
        return pointer; // pointer가 곧 스택의 크기가 됨
    }
    public int capacity(){
        return max;
    }
    public int push(int data) throws OverflowInStackException{  // 데이터 담기
        // 스택이 오버플로우 일때 데이터를 푸시하면 예외 발생시킴
        if (max <= pointer) {
            throw new OverflowInStackException();
        }
        return stack[pointer++] = data;

    }
    public int pop() throws EmptyIntStackException{
        if(pointer <= 0){
            throw new EmptyIntStackException();
        }
        return stack[--pointer];
    }
    public int peek() throws EmptyIntStackException{
        if(pointer <= 0){
            throw new EmptyIntStackException();
        }
        return stack[pointer-1];
    }
    public String dump() throws EmptyIntStackException{
        if(pointer <= 0){
            throw new EmptyIntStackException();
        }
//        for (int i = pointer-1; i>=0; i--) {
//            if (i == pointer-1){
//                System.out.print("["+stack[i] + ", ");
//            }else if (i <= 0 ){
//                System.out.print(stack[i] + "]");
//            }else {
//                System.out.print(stack[i] + ", ");
//            }
//
//
//        }
        String stackStr = "[";
        for (int i = pointer-1; i >=0 ; i--) {
            stackStr += stack[i] ;
            if (i>0){
                stackStr+= ", ";
            }
        }
        stackStr += "]";
        return stackStr;
    }

    //데이터 찾기(Search) -> 데이터의 인덱스 검색
    public int indexOf(int data){
        for (int i = pointer-1; i>=0; i-- ){
            if(stack[i] == data){
                return i;
            }
        }
        return -1;
    }
    //데이터 비우기(Empty)
    public void clear(){
        pointer = 0; // pointer가 0이 되면 초기화나 마찬가지
    }
    //데이터 없는지 확인
    public boolean isEmpty(){
        return pointer <=0;
    }
    // 데이터 가득 찼는지
    public boolean isFull(){
        return pointer == max;
    }
    // 특정 데이터 삭제
    public boolean remove(int data){
        //비어있을 때
        if (isEmpty()) return false;
        // 비어있지 않을때
        int idx = indexOf(data);
        // 값이 스택에 없을 때
        if(idx == -1) return false;
        // 값이 스택에 없을 때
        pointer--;
        for (int i = idx; i< pointer; i++){
            stack[i] = stack[i+1];
        }
        return true;
    }
}
