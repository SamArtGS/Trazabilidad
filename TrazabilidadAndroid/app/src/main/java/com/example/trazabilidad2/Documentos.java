package com.example.trazabilidad2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

public class Documentos extends Fragment {


    public Documentos() {

    }

    public static Documentos newInstance() {
        Documentos fragment = new Documentos();
        return fragment;
    }
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        GridView gridView = (GridView) getView().findViewById(R.id.Documentos);
        AdaptadorDocumentos booksAdapter = new AdaptadorDocumentos(getView().getContext());
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.linearlayout_book, null);
        }



        gridView.setAdapter(booksAdapter);

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_documentos, container, false);
    }


}
