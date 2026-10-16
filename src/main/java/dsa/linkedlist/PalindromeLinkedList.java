package dsa.linkedlist;

import collections_frmwrk.implementations.linkedlist.MyLinkedList;
import collections_frmwrk.implementations.linkedlist.Node;
import algorithms.linkedlist.LinkedListUtil;


/**
 * 30->8->24->15->45->9
 */
public class PalindromeLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = LinkedListUtil.prepareLinkedList();
        myLinkedList.printList(myLinkedList.get(0));

        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        System.out.println(palindromeLinkedList.checkPalindrome(myLinkedList.get(0),myLinkedList.get(0)));
    }


    private  boolean checkPalindrome(Node left, Node right) {
        if(right==null){
            return true;
        }
        boolean resultSublist=checkPalindrome(left, right.next);

        if(resultSublist==false){
            return false;
        }
        boolean result= (left.getData()==right.getData()) ;
        left=left.next;
        return  result;
    }
}
