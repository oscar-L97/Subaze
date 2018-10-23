package com.cimatronics.subaze;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ceylonlabs.imageviewpopup.ImagePopup;
import com.github.chrisbanes.photoview.PhotoView;

public class info_ruta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_ruta);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        int ruta = Integer.parseInt(message);

        switch (ruta){

            case 9:
                TextView textView = findViewById(R.id.text);
                textView.setText("Trasporte\tTaxi\n" +
                        "Color\t\tBlanco y Marrones\n" +
                        "Horario\t\t24 Horas\n" +
                        "Precios\t\tDe  8AM a 10PM – 17$\n" +
                        "\t\tDe 10PM a 7AM – 25$\n");
                ImageView imageView = findViewById(R.id.imagen1);
                imageView.setImageResource(R.mipmap.insurgentes_centro);

                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AlertDialog.Builder mBuilder = new AlertDialog.Builder(info_ruta.this);
                        View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                        PhotoView photoView = mView.findViewById(R.id.imageView);
                        photoView.setImageResource(R.mipmap.insurgentes_centro);
                        mBuilder.setView(mView);
                        AlertDialog mDialog = mBuilder.create();
                        mDialog.show();
                    }
                });
                break;


        }

    }
}
