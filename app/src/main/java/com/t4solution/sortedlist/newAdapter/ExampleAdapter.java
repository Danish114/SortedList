package com.t4solution.sortedlist.newAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.wrdlbrnft.sortedlistadapter.SortedListAdapter;
import com.t4solution.sortedlist.R;

import java.util.Comparator;

public class ExampleAdapter extends SortedListAdapter<ExampleModel> {

    public ExampleAdapter(Context context, Comparator<ExampleModel> comparator) {
        super(context, ExampleModel.class, comparator);
    }

    @Override
    protected ViewHolder<? extends ExampleModel> onCreateViewHolder(LayoutInflater inflater, ViewGroup parent, int viewType) {
        final View itemView = inflater.inflate(R.layout.select_user_card, parent, false);
        return new ExampleViewHolder(itemView);
    }
}