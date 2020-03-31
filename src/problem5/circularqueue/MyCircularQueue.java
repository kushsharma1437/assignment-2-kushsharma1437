
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    Node front;
    Node rear;
    int count;

    public MyCircularQueue(){
        front = null;
        rear = null;
        count = 0;
    }

    public void enqueue(int roll,int backlog,int a_count){
        Student stu = new Student(roll,backlog,a_count);
        Node newnode = new Node();
        newnode.setStudent(stu);

        if(front==null){
            front = newnode;
        }
        else{
            rear.setNext(newnode);
        }

        rear = newnode;
        rear.setNext(front);
        count++;
    }

    public void removeBackLog(){
        while(count-->0){
            Student stu1 = front.getStudent();
            if((stu1.getBacklog()-stu1.getA_count())>0){
                front = front.getNext();
                rear = rear.getNext();
            }
            else{
                rear.setNext(front.getNext());
                front = front.getNext();
            }
        }
    }

    public void printcirqueue(){
        Node temp = front;
        System.out.println();
        while(temp.getNext()!=front){
            System.out.println(temp.getStudent());
            temp = temp.getNext();
        }
        System.out.println(temp.getStudent());
    }


}
