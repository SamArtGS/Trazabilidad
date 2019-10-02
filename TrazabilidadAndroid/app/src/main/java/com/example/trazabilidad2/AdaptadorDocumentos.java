package com.example.trazabilidad2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorDocumentos extends BaseAdapter {


    private Context mContext;
    private Documento[] documentos;

    // 1
    public AdaptadorDocumentos(Context context) {
        this.mContext = context;
        //this.documentos = documentos;
    }

    // 2
    @Override
    public int getCount() {
        return documentos.length;
    }

    // 3
    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView dummyTextView = new TextView(mContext);
        dummyTextView.setText(String.valueOf(i));
        return dummyTextView;
    }

    // 4
    @Override
    public Object getItem(int position) {
        return null;
    }

}
