package problem5.node;

import problem5.student.Student;

// to define node properties
public class Node {
    Student student;
    Node next;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Student getStudent() {
        return student;
    }

    public Node getNext() {
        return next;
    }
}
