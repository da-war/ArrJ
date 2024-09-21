import java.util.Arrays;

public class MyArray {
    private int[] items;
    public MyArray (int length){
        items=new int[length];
    }
    public void print(){
        for(int item:items){
            System.out.println(item);
        }
    }
    public void insert (int index,int value){
        items[index]=value;
    }
    public void displayArray(){
        System.out.println(Arrays.toString(items));
    }
}
