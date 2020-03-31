
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
    Node head;
    public MyPriorityQueue(){
        head = null;
    }

    public void insert(String name,int roll){
        Node newnode = new Node();
        newnode.setName(name);
        newnode.setRoll(roll);
        Node temp = head;
        if(head==null){
            head = newnode;
        }
        else{
            if(head.getRoll()>roll){
                newnode.setNext(head);
                head = temp;
            }
            else{
                while(temp.getNext()!=null && temp.getNext().getRoll()<roll){
                    temp = temp.getNext();
                }
                newnode.setNext(temp.getNext());
                temp.setNext(newnode);
            }
        }
    }

    public void peek(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.getName()+"\t"+temp.getRoll());
            temp = temp.getNext();
        }
    }
}
