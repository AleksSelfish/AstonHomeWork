import java.util.Arrays;
import java.util.List;

public class MyArray<E> {
    private Object[] elements;
    private int size;

    MyArray(int startValue) {
        this.elements = new Object[startValue];

    }
    public boolean addAll(MyArray<E> list) {
        try {
            Object[] temp = elements;
            elements = (Object[]) new Object[temp.length + 1];
            for (int i = 0; i <= list.size; i++) {
                add(list.elements[i]);
            }
            System.arraycopy(temp, 0, elements, 0, temp.length);
            size++;
        } catch (ClassCastException ex) {
            ex.printStackTrace();

        }

        return false;

    }

    public boolean add(Object elem) {
        try {
            Object[] temp = elements;
            elements = (Object[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, elements, 0, temp.length);
            elements[elements.length - 1] = elem;
            size++;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }

        return false;

    }


    public Object get(int num) {
        return elements[num];
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else return false;
    }

    public int size() {
        return size;
    }

    public Object remove(int index) {
        try {


            Object[] temp = elements;
            elements = (Object[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, elements, 0, index);
            int amountAtefRemove = temp.length - index - 1;
            System.arraycopy(temp, index + 1, elements, index, amountAtefRemove);
            size--;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }

        return false;

    }

}