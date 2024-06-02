import java.util.Collection;

public class MyArrayList<T>  {
    private T[] data;
    private int size;

    private static final int DEFAULT_SIZE = 16;

    public MyArrayList() {
        this.data = (T[]) new Object[DEFAULT_SIZE];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(T data) {
        if (size == this.data.length) {
            increaseSize();
        }
        this.data[size++] = data;
    }

    public T get(int index) {
        try {
            return data[index];
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    private void increaseSize() {
        T[] newData = (T[]) new Object[this.data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;
    }

    public void addAll(Collection<? extends T> collection) {
        for (T element : collection) {
            add(element);
        }
    }
    public void bubbleSort() {
        boolean swapped;
        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - 1 - i; j++) {
                if (((Comparable<T>) data[j]).compareTo(data[j + 1]) > 0) {
                    T temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static <T extends Comparable<? super T>> void sort(MyArrayList<T> list) {
        list.bubbleSort();
    }
}
