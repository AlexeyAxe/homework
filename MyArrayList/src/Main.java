import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        MyNewArrayClass array = new MyNewArrayClass();
        Object o1 = new Object();
        System.out.println(array.isEmpty());
        array.add("Александр");
        array.add("Ольга");
        array.add("Ксения");
        array.add("Александр");
        System.out.println(array.size());
        System.out.println(array.get(1));
        ArrayList<Object> list = new ArrayList<>();
        {
            {
                list.add("12");
                list.add("22");
                list.add("32");
                list.add("42");
            }
        }
        array.addAll(1, list);
        array.remove("Александр");
        array.sortedArray();
        array.print();
    }
}