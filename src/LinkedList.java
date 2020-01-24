// Complete the implementation of this class

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
        //elements = new NodeL<>(elements.getFirst(), elements.getRest().addLast(elem));
    }

    public E getFirst() throws NoSuchElementE {
        if (elements.isEmpty())
            throw new NoSuchElementE();
        else
            return elements.getFirst();
    }

    public E getLast() throws NoSuchElementE {
        if (elements.isEmpty())
            throw new NoSuchElementE();
        else
            return elements.getLast();
    }

    public E removeFirst() throws NoSuchElementE {
        E temp = elements.getFirst();
        if (elements.isEmpty())
            throw new NoSuchElementE();
        else
            elements = new NodeL<>(elements.getRest().getFirst(), elements.getRest().getRest());
            return temp;
    }
}
