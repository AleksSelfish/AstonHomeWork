public class MyArray<Obj> {
    private final Object[] elements;
    private int size;

    MyArray(int startValue) {
        this.elements = new Object[startValue];

    }

    public void add(Object elem) {
        elements[size] = elem;
        size++;

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

    public Object remove(int num) {
        size--;
        return elements[num] = null;

    }


}
