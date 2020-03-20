package com.t4solution.sortedlist.newAdapter;

import com.github.wrdlbrnft.sortedlistadapter.SortedListAdapter;

public class ExampleModel implements SortedListAdapter.ViewModel {

    private final String mValue;

    public ExampleModel( String value) {
        mValue = value;
    }


    public String getValue() {
        return mValue;
    }

    @Override
    public <T> boolean isSameModelAs(T item) {
        if (item instanceof ExampleModel) {
            final ExampleModel other = (ExampleModel) item;
        }
        return false;
    }

    @Override
    public <T> boolean isContentTheSameAs(T item) {
        if (item instanceof ExampleModel) {
            final ExampleModel other = (ExampleModel) item;
            return mValue != null ? mValue.equals(other.mValue) : other.mValue == null;
        }
        return false;
    }
}
