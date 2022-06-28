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

public class HistoriaFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_historia, container, false);

        String[] kategorie = {"Zamówienie 1 - 22.06.2022","Zamówienie 2 - 17.04.2022","Zamówienie 3 - 13.03.2021"};

        ListView listView = (ListView) view.findViewById(R.id.historia_listview);

        ArrayAdapter<String> listviewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                kategorie
        );
        listView.setAdapter(listviewAdapter);

        return view;

    }
}
