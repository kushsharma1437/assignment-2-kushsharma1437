
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("Kush ",15);
        obj.insert("Vishal ",56);
        obj.insert("Aryan ",5);
        obj.insert("Priyanshu ",34);
        obj.insert("Shubham ",48);
        obj.peek();
    }
}
