package com.enjoy.interntask;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    MyAdapter myAdapter;

    private ArrayList<Model> getDays(){
        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setDay("Monday");
        models.add(m);

        m = new Model();
        m.setDay("Tuesday");
        models.add(m);

        m = new Model();
        m.setDay("Wednesday");
        models.add(m);

        m = new Model();
        m.setDay("Thursday");
        models.add(m);

        m = new Model();
        m.setDay("Friday");
        models.add(m);

        m = new Model();
        m.setDay("Saturday");
        models.add(m);

        m = new Model();
        m.setDay("Sunday");
        models.add(m);

        return models;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = (RecyclerView) getView().findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        myAdapter = new MyAdapter(getContext(),getDays());
        recyclerView.setAdapter(myAdapter);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_frag,container,false);

    }
}
