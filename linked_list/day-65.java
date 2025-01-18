/*
Reverse a linked list
Given the head of a linked list, the task is to reverse this list and return the reversed head.

Examples:

Input: head: 1 -> 2 -> 3 -> 4 -> NULL
Output: head: 4 -> 3 -> 2 -> 1 -> NULL
*/


// function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution {
    Node reverseList(Node head) {
       Node temHead = null;
       while(head!=null){
           Node nex= head.next;
           if(temHead==null){
                temHead=head;
                temHead.next=null;
           }else{
               head.next=temHead;
               temHead=head;
           }
           head=nex;
       }
       return temHead;
    }
}
