
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(10);
        obj.insert(3);
        obj.insert(30);
        obj.insert(37);
        obj.insert(13);
        obj.insert(1);
        obj.insert(7);
        obj.insert(6);
        obj.insert(5);
        obj.insert(4);
        obj.insert(17);


        MyQueue mq = new MyQueue();
        mq.preSuccessor(obj.getroot());
        mq.getPreSuccessor();
    }
}
