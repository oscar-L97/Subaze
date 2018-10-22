package com.cimatronics.subaze.Models;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class TitleCreator {
    static TitleCreator _titleCreator;
    List<TitleParent> _titleParents;
    public int rutas = 0;


    public TitleCreator(Context context, int ruta) {
        rutas = ruta;
        _titleParents = new ArrayList<>();

        for (int i = 1; i<=rutas; i++)
        {
            TitleParent title = new TitleParent(String.format("Ruta #%d",i));
            _titleParents.add(title);
        }
    }

    public static TitleCreator get(Context context, int ruta){
        if (_titleCreator == null) {
            _titleCreator = new TitleCreator(context, ruta);
        }
        return _titleCreator;
    }

    public List<TitleParent> getAll() {
        return _titleParents;
    }
}
