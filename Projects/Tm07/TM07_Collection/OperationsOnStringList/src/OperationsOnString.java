
import java.util.Scanner;
import java.util.ArrayList;
public class OperationsOnString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int choice;
        String name;
        do{
            System.out.println("1. Insert\n" +
                    "2. Search\n" +
                    "3. Delete\n" +
                    "4. Display\n" +
                    "5. Exit\n" +
                    "Enter your choice :");
            choice=Integer.parseInt(in.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Enter the item to be inserted:");
                    name=in.nextLine();
                    list.add(name);
                    System.out.println("Inserted Successfully");
                    break;

                case 2:
                    System.out.println("Enter the item to Search:");
                    name=in.nextLine();
                    for (String s : list) {
                        if (s.equals(name)) {
                            System.out.println("Item found in the list");
                            break;
                        }
                    }
                    System.out.println("Item not found in the list");
                    break;

                case 3:
                    System.out.println("Enter the item to delete:");
                    name=in.nextLine();
                    try{
                        list.remove(name);
                        System.out.println("Deleted Succesfully");
                    }
                    catch (Exception e){
                        System.out.println("Item does not exist");
                    }
                    break;

                case 4:
                    System.out.println("The items in the list are :");
                    for (String s : list) System.out.println(s);
                    break;

                case 5:
                    choice=-1;
                    break;
                default:
                    System.out.println("Invalid Option...\n Try again");
            }
        }while (choice>0);
    }
}
