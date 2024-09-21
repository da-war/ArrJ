import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        MyArray numbers=new MyArray(2);
        numbers.insert(0,1);
        numbers.insert(1,2);
        numbers.print();
        numbers.displayArray();
    }
}