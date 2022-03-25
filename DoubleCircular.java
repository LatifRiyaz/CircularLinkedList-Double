public class DoubleCircular{
    
    Node head;
    Node tail;
    public void insertatfirst(int data){
        
        Node node = new Node();
        node.data = data;
        node.prev = null;
        node.next = null;
        head = node;
        tail = node;
    }
    
    public void insertinspecific(int index, int data){
        
        Node node = new Node();
        node.data = data;
        if(index == 0){
            insertatfirst(data);
        }
        else{
            Node n = head;
            for(int i=0; i<index-1; i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
            node.prev = n;
            node.next.prev = node;
        }
    }
    
    public void insertatend(int data){
        
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n = tail;
        n.next = node.next;
        n.next = node;
        node.next = head;
        head.prev = node;
        tail = node;
    }
    
    public void delete(int data){
        
        Node n = head;
        if(head == null){
            System.out.println("No data here");
        }
        if(n.data == data){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node node = n.next;
            if(node.data == data){
                n.next = node.next;
                System.out.print("Data Deleted : " + node.data + "\n");
                break;
            }
            n = n.next;
        }while(n != head);
    }
    
    public void search(int data){
        
        int i=1;
        if(head == null){
            System.out.println("No data present here");
        }
        else{
            Node searchnode = head;
            do{
                if(searchnode.data == data){
                    System.out.print("Data found at location : " + i);
                }
                searchnode = searchnode.next;
                i++;
            }while(searchnode != head);
        }
    }
    public void display(){
        
        Node node = head;
        if(head == null){
            System.out.println("No elements present here");
        }
        else{
            do{
                System.out.print(node.data + " <--> ");
                node = node.next;
            }while(node != head);
        }
        System.out.print("END\n");
    }
}