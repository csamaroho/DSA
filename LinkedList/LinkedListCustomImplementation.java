class Node
{
    int data;
    Node next;
    Node()
    {
        data=0;
        next=null;
    }
    Node(int d,Node n)
    {
        data=d;
        next=n;
    }
}
class LinkedList
{
    Node head;
    int size;
    LinkedList()
    {
        head=null;
        size=0;
    }
    public void insert(int d)
    {
        Node n=new Node();
        n.data=d;
        if(head==null)
            head=n;
        else
        {
            Node t=head;
            while(t.next!=null)
                t=t.next;
            t.next=n;

        }
    }
    public void listview()
    {
        Node t=head;
        while(t.next!=null) {
            System.out.println(t.data);
            t = t.next;
        }
        System.out.println(t.data);
    }
}
     public class LinkedListCustomImplementation {
         public static void main(String[] args)
         {
             LinkedList l=new LinkedList();
             l.insert(2);
             l.insert(3);
             l.insert(7);
             l.listview();
        }

     }
