package MyLinkedList;

interface ListMethods<T> {

    void addFirst(T element);
    void addLast(T element);
    int size();
    T getByIndex(int index);
}
