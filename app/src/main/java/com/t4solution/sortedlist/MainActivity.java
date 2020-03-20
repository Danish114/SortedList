package com.t4solution.sortedlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.t4solution.sortedlist.newAdapter.ExampleAdapter;
import com.t4solution.sortedlist.newAdapter.ExampleModel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Comparator<ExampleModel> alphabeticalComparator = new Comparator<ExampleModel>() {
            @Override
            public int compare(ExampleModel a, ExampleModel b) {
                return a.getValue().compareTo(b.getValue());
            }
        };
        RecyclerView recyclerView=findViewById(R.id.selectUserRecyclerView);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        List<ExampleModel> models=new ArrayList<>();
        models.add(new ExampleModel("mudassar"));
        models.add(new ExampleModel("ali"));
        models.add(new ExampleModel("asd"));
        models.add(new ExampleModel("dfdds"));

        final ExampleAdapter adapter = new ExampleAdapter(this, alphabeticalComparator);
        recyclerView.setAdapter(adapter);

        adapter.edit()
                .add(models)
                .commit();
    }
}
