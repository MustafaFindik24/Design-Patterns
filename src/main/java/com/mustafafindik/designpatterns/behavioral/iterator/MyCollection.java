package com.mustafafindik.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollection implements Iterable<Integer> {
    private List<Integer> list;

    public MyCollection() {
        this.list = new ArrayList<>();
    } // creating arraylist in the constructor
    public void addElement(int element){
        list.add(element);
    }
    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<Integer> {
        private int index;
        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public Integer next() {
            if (hasNext()){
                return list.get(index++);
            }
            return null;
        }

        @Override
        public void remove() {
            if (index > 0)
                list.remove(--index);
        }
    }
}
