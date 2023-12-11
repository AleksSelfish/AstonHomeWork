import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        MyArray<Object> a = new MyArray<>(2);
        MyArray<Object> b = new MyArray<>(2);
        a.add(2);
        a.add(3);
        a.add(5);
        a.remove(1);
        b.add(32);
        b.add(a);
        a.addAll(b);


        System.out.println(a.size());
        System.out.println(a.get(3));


        }


    }


