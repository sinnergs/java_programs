import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;

public class ManagerEmployeeDetails {
    public static void main(String[] args) {
        TreeMap<String, Integer> firstName = new TreeMap<String, Integer>();
        ArrayList<Long> mobile = new ArrayList<Long>();
        ArrayList<String> lastName = new ArrayList<String>();
        ArrayList<String> email = new ArrayList<String>();
        ArrayList<String> address = new ArrayList<String>();
        String FirstName, LastName, Email, Address;
        Long number;
        int index;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Employees ");
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Employee " + (i + 1) + " Details:");
            System.out.println("Enter the Firstname ");
            FirstName = in.nextLine();
            firstName.put(FirstName, i);
            System.out.println("Enter the Lastname ");
            LastName = in.nextLine();
            lastName.add(LastName);
            System.out.println("Enter the mobile");
            number = Long.parseLong(in.nextLine());
            mobile.add(number);
            System.out.println("Enter the Email");
            Email = in.nextLine();
            email.add(Email);
            System.out.println("Enter the Address");
            Address = in.nextLine();
            address.add(Address);
        }
        System.out.println("Employee List:");
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");
        for (String first : firstName.keySet()) {
            index=firstName.get(first);
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n", first, lastName.get(index), mobile.get(index), email.get(index), address.get(index));
        }
    }
}
