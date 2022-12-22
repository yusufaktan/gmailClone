package com.yusufaktan.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.yusufaktan.test2.R;

public class MainActivity extends AppCompatActivity {

    ListView goster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        goster = (ListView)findViewById(R.id.listview);

        mailClass[] mailler = new mailClass[]{
                new mailClass("Rıza","Müsait misin ?",R.drawable.foto1),
                new mailClass("Deniz","Attığım dosyalara baktın mı ?",R.drawable.foto2),
                new mailClass("Yusuf","Hadi seni bekliyoruz.",R.drawable.foto3),
                new mailClass("Selma","Nasılsın",R.drawable.foto4),
                new mailClass("Derya","Projeyi bitirdin mi ?",R.drawable.foto2),
                new mailClass("Recep","Dönüş yapacağım.",R.drawable.foto1),
                new mailClass("Selçuk","İyi günler...",R.drawable.foto4),
                new mailClass("Yasemin","Naber",R.drawable.foto3),
                new mailClass("Yaren","Saat kaçta buluşuyoruz ?",R.drawable.foto3),
                new mailClass("Rümeysa","Müsait olunca beni ara.",R.drawable.foto1),
                new mailClass("Sibel","Toplantı saati 14:00. Geç kalma.",R.drawable.foto4),
                new mailClass("Doruk","Sınav saat kaçta ?",R.drawable.foto2)

        };

        mailAdapter adapter = new mailAdapter(this,R.layout.customlist,mailler);
        goster.setAdapter(adapter);
    }
}