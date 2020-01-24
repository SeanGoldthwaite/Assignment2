// Complete the implementation of this class


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class LinkedList<E> implements LinkedListI<E> {
    private List<E> elements;

    LinkedList () {
        elements = new EmptyL<>();
    }

    public void clear() {
        elements = new EmptyL<>();
    }

    public int size() {
        return elements.length();
    }

    public void addFirst(E elem) {
        elements = new NodeL<>(elem, elements);
    }

    public void addLast(E elem) {
        elements = elements.addLast(elem);
    }

    public E getFirst() throws NoSuchElementE {
        return elements.getFirst();
    }

    public E getLast() throws NoSuchElementE {
        return elements.getLast();
    }

    public E removeFirst() throws NoSuchElementE {
        E temp = elements.getFirst();
        elements = new NodeL<>(elements.getRest().getFirst(), elements.getRest().getRest());
        return temp;
    }
    public String toString() {
        return elements.toString();
    }
    public static void main(String[] args) throws NoSuchElementE{
        ArrayList<Integer> vals = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            vals.add((int)(Math.random() * 1000));
            list.addFirst(vals.get(i));
            list.addLast(vals.get(i));
        }
        System.out.println(vals);
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.removeFirst());
        list.clear();
        System.out.println(list);
        System.out.println(list2);
    }
}