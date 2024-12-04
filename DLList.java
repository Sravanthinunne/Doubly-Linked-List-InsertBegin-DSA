class DLList {
    Node head;
    
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }
    
    public void InsertBeg(int data) {
        
        Node newNode = new Node(data);
        
        
        if (head != null) {
            newNode.next = head;  
            head.prev = newNode;   
        }
        
        
        head = newNode;
    }
    
    
    public void printNodes() {
        Node temp = head;
        
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLList list = new DLList();
        list.InsertBeg(100);
        list.InsertBeg(200);
        list.InsertBeg(300);
        
        list.printNodes(); 
        
       
    }
}
