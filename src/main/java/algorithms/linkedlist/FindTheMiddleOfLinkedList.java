package algorithms.linkedlist;

import collections_frmwrk.implementations.linkedlist.MyLinkedList;
import collections_frmwrk.implementations.linkedlist.Node;

public class FindTheMiddleOfLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = LinkedListUtil.prepareLinkedList();
        myLinkedList.printList(myLinkedList.get(0));
        myLinkedList.printList(findMiddle(myLinkedList.get(0)));

    }

    private static Node findMiddle(Node node) {
        Node slow=node;
        Node fast=node;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
