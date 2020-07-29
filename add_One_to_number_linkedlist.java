class Node{
      Node next;
      int data;

      Node(int data){
            this.data = data;
            next = null;
      }
static Node addOne(Node head){
      Node res = head;
      Node temp = null;

      int carry = 1, sum;
      while(head != null){
            sum = carry + head.data;
            carry = (sum >= 10)? 1 : 0 ;
            sum = sum % 10;
            head.data = sum;
            temp = head; // Question : temp add values and we are returning res? How?
            head = head.next;
      }
      if(carry > 0){
            Node x = new Node(carry);
            temp.next = x;
      }
      return res;
      }
}
