package IntListInterface;

import java.util.ArrayList;

public class IntVector implements IntList{


    private ArrayList<Integer> list;
    private int size;
    private static final int DefaultSize= 20;
    private static final double IncreaseBy = 2;

    public IntVector() {
        this.list =new ArrayList<>(DefaultSize);
        this.size = 10;
    }

    @Override
    public void add(int value) {
        if(list.size()==size){
            size = (int) (size * IncreaseBy);
            ArrayList<Integer> newList = new ArrayList<>(size);
            newList.addAll(list); // Copy existing elements
            list = newList; // Update reference to new list
        }
        list.add(value);

    }

    @Override
    public int get(int index) {
        if (index >= list.size() || index < 0) {
            System.out.println("ID is out of bounds");
        }
        return list.get(index);
    }
}
