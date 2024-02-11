import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyNewArrayClass array = new MyNewArrayClass();
        System.out.println(array.isEmpty());//пустой список?
        array.add("Александр");
        array.add("Ольга");
        array.add("Ксения");
        array.add("Александр");
        System.out.println(array.size());//размер списка
        System.out.println(array.get(1));// получить второй элемент списка
        List<Object> list = new ArrayList<>();
        {
            {
                list.add("12");
                list.add("22");
                list.add("32");
                list.add("42");
                list.add("32");
            }
        }
        array.addAll(1, list);
        array.remove("Александр");
        array.sortedArray();
        array.print();
    }
}