import java.util.Scanner;
import java.util.TreeMap;

public class Box {
    double length,width, height;
    public static void main(String[] args){
        TreeMap<Double,Box> map = new TreeMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Box");
        double length,width,height;
        int N=Integer.parseInt(in.nextLine());
        for (int i=0;i<N;i++){
            System.out.println("Enter the Box "+(i+1)+" details");
            System.out.println("Enter Length");
            length = Double.parseDouble(in.nextLine());
            System.out.println("Enter Width");
            width= Double.parseDouble(in.nextLine());
            System.out.println("Enter height");
            height = Double.parseDouble(in.nextLine());
            if(map.get(length*height*width)==null){
                Box box = new Box();
                box.length=length;
                box.width=width;
                box.height=height;
                map.put(length*height*width,box);
            }
        }
        System.out.println("Unique Boxes in the Set are");
        for (Double vol : map.keySet()){
            System.out.println("Length = "+map.get(vol).length+"Width = "+map.get(vol).width+"Height = "+map.get(vol).height+"Volume = "+vol);
        }
    }
}
