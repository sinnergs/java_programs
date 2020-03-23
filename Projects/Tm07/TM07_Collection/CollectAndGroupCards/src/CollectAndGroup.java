import java.util.*;

public class CollectAndGroup {
    ArrayList<Integer> arr = new ArrayList<>();
    HashMap<String, CollectAndGroup> map = new HashMap<>();
    TreeSet<String> set = new TreeSet<>();

    void add(String symbol, CollectAndGroup Str) {
        this.map.put(symbol, Str);
        set.add(symbol);
    }

    void add(int n) {
        this.arr.add(n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, num;
        String symbol;
        System.out.println("Enter Number of Cards :");
        N = Integer.parseInt(in.nextLine());
        CollectAndGroup col = new CollectAndGroup();
        int top, sum, count ;
        for (int i = 0; i < N; i++) {
            top = 0;
            System.out.println("Enter card " + (i + 1) + ":");
            symbol = in.nextLine();
            num = Integer.parseInt(in.nextLine());
            for (String m : col.map.keySet()) {
                if (m.equals(symbol)) {
                    col.map.get(symbol).add(num);
                    top = -1;
                }
            }
            if (top == 0) {
                CollectAndGroup obj = new CollectAndGroup();
                col.add(symbol,obj);
                col.map.get(symbol).add(num);
            }
        }
        System.out.println("Distinct Symbols are :");
        for (String symb : col.set) System.out.print(symb + " ");
        System.out.println();
        for (String symb : col.set) {
            count = 0;
            sum = 0;
            System.out.println("Cards in " + symb + " Symbol");
            for (int val : col.map.get(symb).arr) {
                System.out.println(symb + " " + val);
                count++;
                sum = sum + val;
            }
            System.out.println("Number of cards :" + count);
            System.out.println("Sum of Numbers : " + sum);
        }
    }
}