import java.util.Collection;


public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public MyLinkedList(Collection<? extends T> collection) {
        this();
        addAll(collection);
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T get(int index) {
        checkIndex(index);
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public T remove(int index) {
        checkIndex(index);
        if (index == 0) {
            T data = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return data;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            T data = current.next.data;
            current.next = current.next.next;
            if (current.next == null) {
                tail = current;
            }
            size--;
            return data;
        }
    }

    public void addAll(Collection<? extends T> collection) {
        for (T element : collection) {
            add(element);
        }
    }

    public int size() {
        return size;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public static <T extends Comparable<? super T>> void bubbleSort(MyLinkedList<T> list) {
        boolean sorted;
        for (int i = 0; i < list.size() - 1; i++) {
            sorted = true;
            Node<T> current = list.head;
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (current.data.compareTo(current.next.data) > 0) {
                    T temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    sorted = false;
                }
                current = current.next;
            }
            if (sorted) {
                break;
            }
        }
    }
}
