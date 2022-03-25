import java.util.*;

public class DCircularmain{
    public static void main(String args[]){
        DoubleCircular dc = new DoubleCircular();
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("\n1. Insert at first\n2. Insert at specific location\n3. Insert at last\n4. Delete specific node\n5. Search data\n6. Show Data\n7. Exit\nEnter your choice : ");
            int choice = in.nextInt();
            switch(choice){
                case 1:
                    
                    System.out.print("Enter the integer data to be inserted at first: ");
                    int data = in.nextInt();
                    dc.insertatfirst(data);
                    break;
                case 2:
                    System.out.print("Enter the position to insert : ");
                    int index = in.nextInt();
                    System.out.print("Enter the integer data to be inserted : ");
                    data = in.nextInt();
                    dc.insertinspecific(index, data);
                    break;
                case 3:
                    System.out.print("Enter the integer data to be inserted at first: ");
                    data = in.nextInt();
                    dc.insertatend(data);
                    break;
                case 4:
                    System.out.print("Enter the integer data to be deleted: ");
                    data = in.nextInt();
                    dc.delete(data);
                    break;
                case 5:
                    System.out.print("Enter the data to be searched : ");
                    data = in.nextInt();
                    dc.search(data);
                    break;
                case 6:
                    System.out.print("Data present : ");
                    dc.display();
                    break;
                case 7:
                    System.out.println("GoodBye!!!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}