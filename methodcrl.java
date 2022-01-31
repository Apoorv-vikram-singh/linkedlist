//INSERTION THE DATA AT THE END OF THE LINKED LIST
class node
{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
    }
}
public class methodcrl
{
    node head;
    public void insertAtEnd(int data)//Create fuction ........
    {
        node n=new node(data);
        if(head==null)
        {
            head=n;
        }
        else
        {
            node temp =head;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    public static void main(String args[])
    {
        methodcrl o=new methodcrl();
        o.insertAtEnd(4);
        o.insertAtEnd(20);
        o.insertAtEnd(30);
    }
}
