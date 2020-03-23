import java.util.Scanner;
import  java.util.TreeSet;
public class UniquesCardSet {
    public static void main(String[] args){
        TreeSet<String> set= new TreeSet<>();
        Scanner in = new Scanner(System.in);
        int[] arr = {-1,-1,-1,-1};
        String colour;
        int count=0,temp;
        while(set.size()!=4){
                System.out.println("Enter a card :");
                colour = in.nextLine();
                set.add(colour);
                temp=Integer.parseInt(in.nextLine());
                if (colour.equals("a") && arr[0]==-1){
                    arr[0]=temp;
                }
                else if (colour.equals("b")&&arr[1]==-1){
                    arr[1]=temp;
                }
                else if (colour.equals("c")&&arr[2]==-1){
                    arr[2]=temp;
                }
                else if (colour.equals("d")&&arr[3]==-1){
                    arr[3]=temp;
                }
                count++;
        }
        System.out.println("Four symbols gathered in "+count+" cards.");
        System.out.println("Cards in Set are :");
        int i=0;
        for (String colo:set){
            System.out.println(colo+" "+arr[i]);
            i++;
        }

    }
}
