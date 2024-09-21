import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        int index= list.indexOf(20);
        list.toArray();
        System.out.println(list);
        System.out.println(index);
    }
}