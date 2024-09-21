import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        MyArray numbers=new MyArray(4);
        numbers.insert(0,1);
        numbers.insert(1,2);
        numbers.insert(2,3);
        numbers.insert(3,4);
        numbers.displayArray();
        numbers.deleteItem(0);
        numbers.displayArray();
    }
}