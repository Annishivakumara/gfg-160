class Solution {
    static Node addTwoLists(Node num1, Node num2) {
        
      Node dummyNode=new Node(0);
      Node curr= dummyNode;
     Node first=reverse(num1);
     Node second=reverse(num2);
      int carry=0;
      while(first!=null ||second!=null || carry>0){
          int sum=carry;
          if(first!=null){
              sum+=first.data;
              num1=first.next;
          }
          if(second!=null){
           sum+=second.data;
           num2=second.next;
          }
          curr.next=new Node(sum%10);
          carry=sum/10;
          curr= curr.next;
      }
      return reverse(dummyNode);
    }
    static Node reverse(Node head){
        Node prev= null;
        Node current=head;
        while(current!=null){
            Node next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}
