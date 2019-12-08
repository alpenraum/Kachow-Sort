import Util.KachowSort;

import java.util.*;

public class KachowSortedList<T extends Object> implements List<T> {

    private ArrayList<T> data;

    public KachowSortedList(ArrayList<T> data) {
        this.data = data;
    }

    public KachowSortedList() {
        this.data = new ArrayList<>();
    }

    public KachowSortedList(Collection<T> x) {
        this.data = new ArrayList<>();
        data.addAll(x);
    }

    public KachowSortedList(T[] x) {
        this.data = new ArrayList<>();
        data.addAll(Arrays.asList(x));
    }


    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return data.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return data.iterator();
    }

    @Override
    public Object[] toArray() {
        return data.toArray();
    }

    @Override
    public boolean add(T o) {
        data.add(o);
        KachowSort.sort(data);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        data.addAll(c);
        KachowSort.sort(data);
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        data.addAll(index, c);
        KachowSort.sort(data);
        return true;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return data.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return data.listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return new ArrayList<>();
    }

    @Override
    public boolean retainAll(Collection c) {
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        return true;
    }

    //TODO: fix that
    @Deprecated
    @Override
    public <T1> T1[] toArray(T1[] a) {
        return a;
    }
}
