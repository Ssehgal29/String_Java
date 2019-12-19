public class RunnerLinkedList {
    public static void main(String args[]){
        LinkedList linkedList=new LinkedList();

        linkedList.insert(25);
        linkedList.insert(40);
        linkedList.insert(50);
        linkedList.insert(60);
        linkedList.insertAtStart(18);
        linkedList.insertAt(2,20);
        linkedList.deleteAt(3);

        linkedList.show();
    }
}
class Node{
    int data;
    Node next;
}
class LinkedList{
    Node head;
    public void insert(int num){
        Node node=new Node();
        node.data=num;
        node.next=null;

        if (head==null){
            head=node;
        }else {
            Node n=head;
            while (n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }

    public void insertAtStart(int num){
        Node node=new Node();
        node.data=num;
        node.next=head;

        head=node;
    }

    public void insertAt(int index,int num){
        Node node=new Node();
        node.data=num;
        node.next=null;
        if (index==0){
            insertAtStart(num);
        }else{
            Node n=head;
            for (int i=0;i<index-1;i++){
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }
    }
    public void deleteAt(int index){
        if (index==0){
            head=head.next;
        }else {
            Node n=head;
            Node n1=null;
            for (int i=0;i<index-1;i++){
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
            n1=null;
        }
    }

    public void show(){
        Node node =head;
        while (node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);// for last element because it has null
    }
}
