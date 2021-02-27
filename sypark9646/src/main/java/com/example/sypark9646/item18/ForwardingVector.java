package com.example.sypark9646.item18;

import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ForwardingVector<E> extends Vector<E> {

    private final Vector<E> vector;

    public ForwardingVector(Vector<E> vector) {
        this.vector = vector;
    }

    public synchronized void copyInto(Object[] anArray) {
        vector.copyInto(anArray);
    }

    public synchronized void trimToSize() {
        vector.trimToSize();
    }

    public synchronized void ensureCapacity(int minCapacity) {
        vector.ensureCapacity(minCapacity);
    }

    public synchronized void setSize(int newSize) {
        vector.setSize(newSize);
    }

    public synchronized int capacity() {
        return vector.capacity();
    }

    public synchronized int size() {
        return vector.size();
    }

    public synchronized boolean isEmpty() {
        return vector.isEmpty();
    }

    public Enumeration<E> elements() {
        return vector.elements();
    }

    public boolean contains(Object o) {
        return vector.contains(o);
    }

    public int indexOf(Object o) {
        return vector.indexOf(o);
    }

    public synchronized int indexOf(Object o, int index) {
        return vector.indexOf(o, index);
    }

    public synchronized int lastIndexOf(Object o) {
        return vector.lastIndexOf(o);
    }

    public synchronized int lastIndexOf(Object o, int index) {
        return vector.lastIndexOf(o, index);
    }

    public synchronized E elementAt(int index) {
        return vector.elementAt(index);
    }

    public synchronized E firstElement() {
        return vector.firstElement();
    }

    public synchronized E lastElement() {
        return vector.lastElement();
    }

    public synchronized void setElementAt(E obj, int index) {
        vector.setElementAt(obj, index);
    }

    public synchronized void removeElementAt(int index) {
        vector.removeElementAt(index);
    }

    public synchronized void insertElementAt(E obj, int index) {
        vector.insertElementAt(obj, index);
    }

    public synchronized void addElement(E obj) {
        vector.addElement(obj);
    }

    public synchronized boolean removeElement(Object obj) {
        return vector.removeElement(obj);
    }

    public synchronized void removeAllElements() {
        vector.removeAllElements();
    }

    public synchronized Object clone() {
        return vector.clone();
    }

    public synchronized Object[] toArray() {
        return vector.toArray();
    }

    public synchronized <T> T[] toArray(T[] a) {
        return vector.toArray(a);
    }

    public synchronized E get(int index) {
        return vector.get(index);
    }

    public synchronized E set(int index, E element) {
        return vector.set(index, element);
    }

    public synchronized boolean add(E e) {
        return vector.add(e);
    }

    public boolean remove(Object o) {
        return vector.removeElement(o);
    }

    public void add(int index, E element) {
        vector.insertElementAt(element, index);
    }

    public synchronized E remove(int index) {
        return vector.remove(index);
    }

    public void clear() {
        vector.removeAllElements();
    }

    public synchronized boolean containsAll(Collection<?> c) {
        return vector.containsAll(c);
    }

    public boolean addAll(Collection<? extends E> c) {
        return vector.addAll(c);
    }

    public boolean removeAll(Collection<?> c) {
        return vector.removeAll(c);
    }

    public boolean retainAll(Collection<?> c) {
        return vector.retainAll(c);
    }

    public boolean removeIf(Predicate<? super E> filter) {
        return vector.removeIf(filter);
    }

    public synchronized boolean addAll(int index, Collection<? extends E> c) {
        return vector.addAll(index, c);
    }

    @Override
    public synchronized boolean equals(Object o) {
        return vector.equals(o);
    }

    @Override
    public synchronized int hashCode() {
        return vector.hashCode();
    }

    @Override
    public synchronized String toString() {
        return vector.toString();
    }

    public synchronized List<E> subList(int fromIndex, int toIndex) {
        return vector.subList(fromIndex, toIndex);
    }

    public synchronized ListIterator<E> listIterator(int index) {
        return vector.listIterator(index);
    }

    public synchronized ListIterator<E> listIterator() {
        return vector.listIterator();
    }

    public synchronized Iterator<E> iterator() {
        return vector.iterator();
    }

    public synchronized void forEach(Consumer<? super E> action) {
        vector.forEach(action);
    }

    public synchronized void replaceAll(UnaryOperator<E> operator) {
        vector.replaceAll(operator);
    }

    public synchronized void sort(Comparator<? super E> c) {
        vector.sort(c);
    }

    public Spliterator<E> spliterator() {
        return vector.spliterator();
    }
}
