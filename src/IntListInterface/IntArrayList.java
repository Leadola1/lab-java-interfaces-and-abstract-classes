package IntListInterface;

import java.util.ArrayList;

public class IntArrayList implements IntList{
   private ArrayList<Integer> list;
   private int size;
   private static final int DefaultSize= 10;
   private static final double IncreaseBy = 1.5;

    public IntArrayList() {
        this.list =new ArrayList<>(DefaultSize);
        this.size = 10;
    }

    @Override
    public void add(int value) {
        System.out.println(list.size());
      if(list.size()==size){
          System.out.println("in hers");
          size = (int) (size * IncreaseBy);
          ArrayList<Integer> newList = new ArrayList<>(size);
          newList.addAll(list); // Copy existing elements
          list = newList; // Update reference to new list
          System.out.println("in hers");
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
