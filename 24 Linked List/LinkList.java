import java.util.HashSet;

public class LinkList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static  Node head;
    public static  Node tail;
    public static  int  size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode; 
        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println("Null");

    }
    public void add(int idx,int data){
        
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst() {
        if(size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size --;
        return val;
    }
    public int removeLast() {
        if(size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev =prev.next;
        }
        int val=prev.next.data; //tail.data
        prev.next=null;
        tail=prev;
        size--; 
        return val;
    }
    public int itrSearch(int key){ //O(n)
        Node temp=head;
        int indx=0;
        while(temp!=null){
            if(temp.data==key){
                return indx;
            }
            indx++;
            temp=temp.next;
        }
        return -1;
    }
    public int helper(Node head,int key){ //Time=>O(n) space=>O(n)
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

    }
    public void deleteNthFromEnd(int n){
        int sz=0;
        Node temp=head;
        while (temp!=null) {
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        Node prev=head;
        while (i<sz-n) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while (fast !=null && fast.next !=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkPlindrome(){
        if(head==null){
            return true;
        }
        Node midNode=findMid(head);
        Node prev=null;
        Node curr=midNode;
        Node next;

        while (curr !=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while (right !=null) {
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public  boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        slow=head;
        Node prev=null;
         // Special case: when the cycle starts at the head
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }

        while (slow!=fast) {
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }

    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;

        while (fast !=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next; 
        }
        return slow;
    }

    private Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;

        while (head1 !=null && head2!=null) {
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }

        while (head1!=null) {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }

        while (head2 !=null) {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node mid=getMid(head);

        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);

        return merge(newLeft,newRight);
    }

    public void zigZag(){
        // find mid
        Node slow=head;
        Node fast=head.next;

        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        // Right ka reverse

        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;

        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right=prev;
        Node nextL;
        Node nextR;
        // alt merge zig zag merge
        while (left!=null && right!=null) {
            nextL=left.next;
            left.next=right;

            nextR=right.next;
            right.next=nextL;


            left=nextL;
            right=nextR;

        } 
    }

    public static void main(String[] args) {
        // LinkList ll=new LinkList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(2);
        // ll.addLast(1);
        // //ll.addLast(5);
        // ll.print();
        // // ll.reverse();
        // //ll.deleteNthFromEnd(3);
        // System.out.println(ll.checkPlindrome());

        // ll.add(2,9);
        // ll.print();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        // System.out.println(ll.itrSearch(4));
        // System.out.println(ll.itrSearch(10));
        // System.out.println(ll.recSearch(4));
        LinkList ll = new LinkList();

        // Node first = ll.new Node(1);
        // Node second = ll.new Node(2);
        // Node third = ll.new Node(3);
        // Node fourth = ll.new Node(4);
        
        // ll.head = first;
        // first.next = second;
        // second.next = third;
        // //third.next = first;   // Special case: when the cycle starts at the head
        // third.next = fourth;
        // fourth.next = first.next;
        
        // System.out.println(ll.isCycle()); 
        // ll.removeCycle();
        // System.out.println(ll.isCycle()); 
        // ll.addFirst(1);
        // ll.addFirst(5);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(2);

        // ll.print();

        // ll.head = ll.mergeSort(ll.head);
        // ll.print();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();
        ll.zigZag();
        ll.print();

    }
}