package com.example.sezamek;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class KategorieFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_kategorie, container, false);

        String[] kategorie = {"Chemia","Pieczywo","Nabiał","Mięso","Alkohol","Napoje"};

        ListView listView = (ListView) view.findViewById(R.id.categoryRecycler);

        ArrayAdapter<String> listviewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                kategorie
        );
        listView.setAdapter(listviewAdapter);

        return view;
    }
}
