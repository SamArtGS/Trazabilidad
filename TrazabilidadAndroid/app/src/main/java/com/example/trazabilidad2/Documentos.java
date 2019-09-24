package com.example.trazabilidad2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Documentos extends Fragment {


    public Documentos() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static Documentos newInstance() {
        Documentos fragment = new Documentos();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_documentos, container, false);
    }


}
