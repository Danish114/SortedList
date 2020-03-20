package com.t4solution.sortedlist.newAdapter;

import android.view.View;
import android.widget.TextView;

import com.github.wrdlbrnft.sortedlistadapter.SortedListAdapter;
import com.t4solution.sortedlist.R;


public class ExampleViewHolder extends SortedListAdapter.ViewHolder<ExampleModel> {

    private final TextView mValueView;

    public ExampleViewHolder(View itemView) {
        super(itemView);

        mValueView = itemView.findViewById(R.id.userNameTextView);
    }

    @Override
    protected void performBind(ExampleModel item) {
        mValueView.setText(item.getValue());
    }
}