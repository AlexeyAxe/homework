import java.util.Collection;

public class MyNewArrayClass {
    public Object[] array;
    private int size;
    private int capacity;

    public MyNewArrayClass() {
        capacity = 10;
        size = 0;
        array = new Object[capacity];
    }

    private void grow() {
        capacity = (int) (capacity * 1.5 + 1);
        Object[] arrayClone = new Object[capacity];
        for (int i = 0; i < array.length; i++) {
            arrayClone[i] = array[i];
        }
        array = arrayClone;


    }

    public Object get(int index) {
        return array[index];
    }

    public Object remove(int index) {
        Object obj = array[index];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = null;
        size--;
        return obj;
    }

    public boolean remove(Object obj) {
        for (int i = 0; i < size; i++) {
            if (obj.equals(array[i])) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public void add(Object obj) {
        if (size == capacity) {
            grow();
        }
        array[size] = obj;
        size++;
    }

    public void add(int index, Object obj) {
        if (size == capacity) {
            grow();
        }
        for (int i = size; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = obj;
    }

    public boolean addAll(Collection<Object> col) {
        while ((size + col.size()) > capacity) {
            grow();
        }
        for (Object o : col) {
            array[size] = o;
            size++;
        }
        return true;
    }

    public boolean addAll(int index, Collection<Object> col) {
        while ((size + col.size()) > capacity) {
            grow();
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + col.size()] = array[i];
        }
        for (Object o : col) {
            array[index] = o;
            index++;
            size++;
        }
        return true;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void sortedArray() {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < size - 1; i++) {
                if (((Comparable) array[i]).compareTo(array[i + 1]) > 0) {
                    isSorted = false;
                    Object temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i].toString());
        }
    }
}
