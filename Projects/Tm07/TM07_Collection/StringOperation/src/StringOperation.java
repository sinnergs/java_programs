import java.util.Scanner;
import java.util.ArrayList;
public class StringOperation {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        System.out.print("S1 = ");
        String S1 = in.nextLine();
        System.out.print("\nS2 = ");
        String S2 = in.nextLine();
        String out="";
        char val;
        int count=0,i,j;
        for (i=0;i<S1.length();i++){
            if(i%2==0){
                out=out+S2;
            }
            else{
                out=out+S1.charAt(i);
            }
        }
        arr.add(out);
        out="";
        for(i=0;i<S1.length();i++){
            if (S1.charAt(i) == S2.charAt(0)){
                for (j=0;j<S2.length() && (i+j)<S1.length();j++){
                    if(S1.charAt(i+j) != S2.charAt(j)){
                        j=0;
                        break;
                    }
                }
                if (j!=0){
                    i=i+j;
                    count++;
                }
            }if (count==2){
                break;
            }
        }

        if (count>1){
                out= S1.substring(0, S1.lastIndexOf(S2));;
                for(i=S2.length()-1;i>-1;i--){
                    out=out+S2.charAt(i);
                }
                out=out+S1.substring(S1.lastIndexOf(S2)+S2.length(),S1.length());
        }
        else{
            out=S1+S2;
        }
        arr.add(out);
        out="";
        if (count>1){
            out= S1.substring(0, S1.indexOf(S2));;
            out=out+S1.substring(S1.indexOf(S2)+S2.length(),S1.length());
        }
        else{
            out=S1;
        }
        arr.add(out);
        out="";
        if (S2.length()%2==0){
            out=S2.substring(0,S2.length()/2);
            out=out+S1;
            out=out+S2.substring(S2.length()/2,S2.length());
        }
        else{
            out=S2.substring(0,S2.length()/2+1);
            out=out+S1;
            out=out+S2.substring(S2.length()/2,S2.length());
        }
        arr.add(out);
        out="";
        for (i=0;i<S1.length();i++){
            for(j=0;j<S2.length();j++){
                if(S1.charAt(i)==S2.charAt(j)){
                    break;
                }
            }
            if (j!=S2.length()){
                out=out+"*";

            }
            else{
                out=out+S1.charAt(i);
            }
        }
        arr.add(out);
        System.out.println(arr);
    }
}
