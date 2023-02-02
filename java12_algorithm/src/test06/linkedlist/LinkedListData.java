package test06.linkedlist;

public class LinkedListData<E> {
    // 노드
    //Data에 저장된 번호와 이름을 보관
    //다음 객체 주소를 보관한다.
    class Node<E>{
        private E data;
        private Node<E> next;

        Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }
    }
    private Node<E> head; //머리노드가 가질 변수
    private Node<E> ctrl; //선택노드를 가질 변수


    LinkedListData(){
        //최초 객체생성시 머리노드, 선택노드는 없으므로 null로 초기화
        head = ctrl = null;
    }
    //꼬리에 노드삽입
    public void addLast(E obj){
        if (head == null){// 노드가 한개도 없으면
            addFirst(obj);
        }else{//노드가 한개 이상이면
            Node<E> ptr = head;
            while(ptr.next !=null){
                ptr = ptr.next;

            }
            ptr.next = ctrl = new Node(obj, null);
        }
    }

    //머리에 노드 삽입
    public void addFirst(E obj){
        //머리 노드 null list 비어있고
        // 머리 노드 null이 아니면 현재 노드의 next로 설정한다.
        Node<E> ptr = head;
        head = ctrl = new Node(obj, ptr);
    }
    //머리 노드 삭제
    public void removeFirst(){
        if (head != null){
            head = ctrl = head.next;
        }
    }
    // 선택노드 삭제
    public void remove(Node n){
        if(head != null){
            if(head ==n){
                removeFirst();
            }else{
                Node<E> ptr = head;
                while(ptr.next !=n){
                    ptr =ptr.next;
                    if(ptr == null){

                    }
                }
            }
        }
    }
    public void removeCurrentNode(){
        remove(ctrl);
    }
    //모든 노드 출력
    public void dump(){
        Node<E> ptr = head;
        while(ptr != null){ //ptr가 null이 아니면 노드가 존재한다
            System.out.println(ptr.data.toString());
            ptr = ptr.next;
        }
    }
}
