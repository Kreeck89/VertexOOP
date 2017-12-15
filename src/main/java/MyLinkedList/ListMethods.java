package MyLinkedList;

interface ListMethods<T> {

    void addFirst(T element);
    void addLast(T element);
    void remove(int index);
    void clear();
    void set(int index, T element);
    int size();
    T getByIndex(int index);
}
