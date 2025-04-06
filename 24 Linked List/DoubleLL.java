public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;
        
        public  Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public  void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void print(){
        Node curr=head;
        while (curr!=null) {
            System.out.print(curr.data +"<->");
            curr=curr.next;
        }
        System.out.print("null");
    }

    public int removeFirst(){
        if(head==null){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }

        if(size==1){
            int var=head.data;
            head=tail=null;
            size--;
        }
        int var=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return var;
    }

    public void reverse(){
            Node curr=head;
            Node prev=null;
            Node next;

            while (curr!=null) {
                next=curr.next;
                curr.next=prev;
                curr.prev=next;
                prev=curr;
                curr=next;
            }
            head=prev;
    }

    public static void main(String[] args) {
        DoubleLL ll=new DoubleLL();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        // ll.print();
        // System.out.println();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.removeFirst();
        // ll.print();
        // System.out.println();

        // System.out.println(ll.size);

        ll.print();
        System.out.println();
        ll.reverse();
        ll.print();
       
    }
}
