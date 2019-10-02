package com.example.trazabilidad2.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.trazabilidad2.Documentos;
import com.example.trazabilidad2.Perfil;
import com.example.trazabilidad2.R;


public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.Documentos, R.string.Mapas, R.string.Perfil};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragmentoElegido;
        switch (position){
            case 0:
                return Documentos.newInstance();
            case 1:
                return PlaceholderFragment.newInstance(position+1);
            case 2:
                return Perfil.newInstance();
            default:
                return PlaceholderFragment.newInstance(position+1);
        }


    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return TAB_TITLES.length;
    }
}