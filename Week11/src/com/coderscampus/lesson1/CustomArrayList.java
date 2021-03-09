package com.coderscampus.lesson1;

public class CustomArrayList<T> implements CustomList<T>{
    Object[] items = new Object[10];
    int size = 0;

    @Override
    public boolean add(T item) {
        items[size++] = item;
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
        return (T) items[index];
    }
}
