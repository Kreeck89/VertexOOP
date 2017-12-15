package MyLinkedList;

import java.util.Iterator;

public class MyLinkedList<T> implements ListMethods<T>, Iterable<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size = 0;

    public MyLinkedList() {
        lastNode = new Node<T>(null, firstNode, null);
        firstNode = new Node<T>(null, null, lastNode);
    }

    @Override
    public void addFirst(T element) {
        Node<T> newNode = firstNode;
        newNode.setElement(element);
        firstNode = new Node<T>(null, null, newNode);
        newNode.setPrev(firstNode);
        size++;
    }

    @Override
    public void addLast(T element) {
        Node<T> newNode = lastNode;
        newNode.setElement(element);
        lastNode = new Node<T>(null, newNode, null);
        newNode.setNext(lastNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T getByIndex(int index) {
        Node<T> elemByIndex = firstNode.getNext();
        for (int i = 0; i < index; i++) {
            elemByIndex = getNextElement(elemByIndex);
        }
        return elemByIndex.getElement();
    }

    @Override
    public void remove(int index) {
        Node<T> removeByIndex = firstNode.getNext();
        for (int i = 0; i < index; i++) {
            removeByIndex = getNextElement(removeByIndex);
        }
        Node<T> prevNode = removeByIndex.getPrev();
        Node<T> nextNode = removeByIndex.getNext();
        prevNode.setNext(removeByIndex.getNext());
        nextNode.setPrev(removeByIndex.getPrev());
        removeByIndex = null;
        size--;
    }

    @Override
    public void clear() {
        while (size != 0){
        Node<T> clearAll = firstNode.getNext();
            firstNode.setNext(clearAll.getNext());
            clearAll = null;
            size--;
        }
        firstNode.setPrev(null);
        firstNode.setNext(lastNode);
        lastNode.setPrev(firstNode);
        lastNode.setNext(null);
    }

    @Override
    public void set(int index, T element) {
        Node<T> setElement = firstNode.getNext();
        for (int i = 0; i < index; i++) {
                setElement = getNextElement(setElement);
        }
        Node<T> tNode = setElement;
        Node<T> nwNode = new Node<>(tNode.getElement(), tNode, tNode.getNext());
        tNode.setNext(nwNode);
        tNode.setElement(element);
        size++;
    }

    private Node<T> getNextElement(Node<T> elemByIndex) {
        return elemByIndex.getNext();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public T next() {
                return getByIndex(counter++);
            }
        };
    }

    private class Node<T> {
        T element;
        Node<T> next;
        Node<T> prev;


        public Node(T element, Node<T> prev, Node<T> next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }
    }
}
