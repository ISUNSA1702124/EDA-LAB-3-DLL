package datastructures;

import java.util.Collection;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class DoublyLinkedList<E> extends LinkedList<E> {

    //TODO Implement `ALL` the methods for a Doubly Linked List

    /**
     * Constructs an empty list.
     */
    public DoublyLinkedList() {

        super();
    }

    /**
     * Returns the first element in this list.
     *
     * @return the first element in this list
     * @throws NoSuchElementException if this list is empty
     */
    @Override
    public E getFirst() {
        //TODO complete here
        return null;
    }

    /**
     * Returns the last element in this list.
     *
     * @return the last element in this list
     * @throws NoSuchElementException if this list is empty
     */
    @Override
    public E getLast() {
        //TODO complete here
        return null;
    }

    /**
     * Removes and returns the first element from this list.
     *
     * @return the first element from this list
     * @throws NoSuchElementException if this list is empty
     */
    @Override
    public E removeFirst() {
        //TODO complete here
        return null;
    }

    /**
     * Removes and returns the last element from this list.
     *
     * @return the last element from this list
     * @throws NoSuchElementException if this list is empty
     */
    @Override
    public E removeLast() {
        //TODO complete here
        return null;
    }

    /**
     * Inserts the specified element at the beginning of this list.
     *
     * @param e the element to add
     */
    @Override
    public void addFirst(E e) {
        //TODO complete here
    }

    /**
     * Appends the specified element to the end of this list.
     * <p>
     * This method is equivalent to {@link #add}.
     *
     * @param e the element to add
     */
    @Override
    public void addLast(E e) {
        //TODO complete here
    }

    /**
     * Returns true if this list contains the specified element.
     * More formally, returns true if and only if this list contains
     * at least one element 'o'
     *
     * @param o element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     * false, otherwise
     */
    @Override
    public boolean contains(Object o) {
        //TODO complete here
        return false;
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    @Override
    public int size() {
        //TODO complete here
        return 0;
    }

    /**
     * Appends the specified element to the end of this list.
     *
     * <p>This method is equivalent to {@link #addLast}.
     *
     * @param e element to be appended to this list
     * @return true if list is modified after perform append the element
     * false if definition of list does not allow duplicated elements
     * Note: for this case always return true
     */
    @Override
    public boolean add(E e) {
        //TODO complete here
        return false;
    }

    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present.  If this list does not contain the element, it is
     * unchanged.  More formally, removes the element with the lowest index i
     *
     * @param o element to be removed from this list, if present
     * @return true if this list contained the specified element
     */
    @Override
    public boolean remove(Object o) {
        //TODO complete here
        return false;
    }

    /**
     * Appends all of the elements in the specified collection to the end of
     * this list, in the order that they are returned by the specified
     * collection's iterator.
     *
     * @param c collection containing elements to be added to this list
     * @return true if this list changed as a result of the call
     * @throws NullPointerException if the specified collection is null
     */
    @Override
    public boolean addAll(Collection<? extends E> c) {
        //TODO complete here
        return false;
    }

    /**
     * Inserts all of the elements in the specified collection into this
     * list, starting at the specified position.  Shifts the element
     * currently at that position (if any) and any subsequent elements to
     * the right (increases their indices).
     *
     * @param index index at which to insert the first element
     *              from the specified collection
     * @param c     collection containing elements to be added to this list
     * @return true if this list changed as a result of the call
     * @throws IndexOutOfBoundsException if index to be inserted is not found
     * @throws NullPointerException      if the specified collection is null
     */
    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        //TODO complete here
        return false;
    }

    /**
     * Removes all of the elements from this list.
     * The list will be empty after this call returns.
     */
    @Override
    public void clear() {
        //TODO complete here
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public E get(int index) {
        //TODO complete here
        return null;
    }

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     *
     * @param index   index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public E set(int index, E element) {
        //TODO complete here
        return null;
    }

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any
     * subsequent elements to the right (adds one to their indices).
     *
     * @param index   index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public void add(int index, E element) {
        //TODO complete here
    }

    /**
     * Removes the element at the specified position in this list.
     * Returns the element that was removed from the list.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index does not exist
     */
    @Override
    public E remove(int index) {
        //TODO complete here
        return null;
    }

    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     *
     * @param o element to search for
     * @return the index of the first occurrence of the specified element in
     * this list, or -1 if this list does not contain the element
     */
    @Override
    public int indexOf(Object o) {
        //TODO complete here
        return 0;
    }

    /**
     * Returns the index of the last occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     *
     * @param o element to search for
     * @return the index of the last occurrence of the specified element in
     * this list, or -1 if this list does not contain the element
     */
    @Override
    public int lastIndexOf(Object o) {
        //TODO complete here
        return 0;
    }

    /**
     * Retrieves, but does not remove, the head (first element) of this list.
     *
     * @return the head of this list, or null if this list is empty
     */
    @Override
    public E peek() {
        //TODO complete here
        return null;
    }

    /**
     * Retrieves, but does not remove, the head (first element) of this list.
     *
     * @return the head of this list
     * @throws NoSuchElementException if this list is empty
     */
    @Override
    public E element() {
        //TODO complete here
        return null;
    }

    /**
     * Retrieves and removes the head (first element) of this list.
     *
     * @return the head of this list, or null if this list is empty
     */
    @Override
    public E poll() {
        //TODO complete here
        return null;
    }

    /**
     * Retrieves and removes the head (first element) of this list.
     *
     * @return the head of this list
     * @throws NoSuchElementException if this list is empty
     */
    @Override
    public E remove() {
        //TODO complete here
        return null;
    }

    /**
     * Adds the specified element as the tail (last element) of this list.
     *
     * @param e the element to add
     * @return true if the element was added to the list
     * false, otherwise
     */
    @Override
    public boolean offer(E e) {
        //TODO complete here
        return false;
    }

    /**
     * Inserts the specified element at the front of this list.
     *
     * @param e the element to insert
     * @return true if element was inserted
     * false, otherwise
     */
    @Override
    public boolean offerFirst(E e) {
        //TODO complete here
        return super.offerFirst(e);
    }

    /**
     * Inserts the specified element at the end of this list.
     *
     * @param e the element to insert
     * @return true if element was inserted
     * false, otherwise
     */
    @Override
    public boolean offerLast(E e) {
        //TODO complete here
        return super.offerLast(e);
    }

    /**
     * Retrieves, but does not remove, the first element of this list,
     * or returns null if this list is empty.
     *
     * @return the first element of this list, or null
     * if this list is empty
     */
    @Override
    public E peekFirst() {
        //TODO complete here
        return null;
    }

    /**
     * Retrieves, but does not remove, the last element of this list,
     * or returns null if this list is empty.
     *
     * @return the last element of this list, or  null
     * if this list is empty
     */
    @Override
    public E peekLast() {
        //TODO complete here
        return null;
    }

    /**
     * Retrieves and removes the first element of this list,
     * or returns null if this list is empty.
     *
     * @return the first element of this list, or null if
     * this list is empty
     */
    @Override
    public E pollFirst() {
        //TODO complete here
        return null;
    }

    /**
     * Retrieves and removes the last element of this list,
     * or returns null if this list is empty.
     *
     * @return the last element of this list, or null if
     * this list is empty
     */
    @Override
    public E pollLast() {
        //TODO complete here
        return null;
    }

    /**
     * Pushes an element onto the stack represented by this list.  In other
     * words, inserts the element at the front of this list.
     *
     * <p>This method is equivalent to {@link #addFirst}.
     */
    @Override
    public void push(E e) {
        //TODO complete here
    }

    /**
     * Pops an element from the stack represented by this list.  In other
     * words, removes and returns the first element of this list.
     *
     * <p>This method is equivalent to {@link #removeFirst()}.
     *
     * @return the element at the front of this list (which is the top
     * of the stack represented by this list)
     * @throws NoSuchElementException if this list is empty
     */
    @Override
    public E pop() {
        //TODO complete here
        return null;
    }

    /**
     * Removes the first occurrence of the specified element in this
     * list (when traversing the list from head to tail).  If the list
     * does not contain the element, it is unchanged.
     *
     * @param o element to be removed from this list, if present
     * @return true if the list contained the specified element
     */
    @Override
    public boolean removeFirstOccurrence(Object o) {
        //TODO complete here
        return false;
    }

    /**
     * Removes the last occurrence of the specified element in this
     * list (when traversing the list from head to tail).  If the list
     * does not contain the element, it is unchanged.
     *
     * @param o element to be removed from this list, if present
     * @return true if the list contained the specified element
     */
    @Override
    public boolean removeLastOccurrence(Object o) {
        //TODO complete here
        return false;
    }

}
