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

    public void deleteItem(int index) {
        if (index < 0 || index >= items.length) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        // Create a new array with size reduced by 1
        int[] newItems = new int[items.length - 1];

        // Copy the elements up to the index
        for (int i = 0; i < index; i++) {
            newItems[i] = items[i];
        }

        // Skip the element at 'index' and copy the rest
        for (int i = index; i < newItems.length; i++) {
            newItems[i] = items[i + 1];
        }

        // Replace the old array with the new one
        items = newItems;
    }

}
