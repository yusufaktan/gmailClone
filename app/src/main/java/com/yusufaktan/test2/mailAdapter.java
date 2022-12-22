package com.yusufaktan.test2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.yusufaktan.test2.R;

public class mailAdapter extends ArrayAdapter<mailClass> {

    private mailClass[] mailListe;
    private int resource;

    public mailAdapter(@NonNull Context context, int resource, @NonNull mailClass[] mailListe) {
        super(context, resource, mailListe);
        this.resource=resource;
        this.mailListe=mailListe;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View satir;
        LayoutInflater layoutInflater=(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        satir=layoutInflater.inflate(resource,null);

        TextView mailAd = (TextView)satir.findViewById(R.id.mailAd);
        TextView mailMesaj = (TextView)satir.findViewById(R.id.mailMesaj);
        ImageView foto = (ImageView)satir.findViewById(R.id.foto);

        mailClass mailler = mailListe[position];
        mailAd.setText(mailler.getMailAd());
        mailMesaj.setText(mailler.getMailMesaj());
        foto.setImageResource(mailler.getFoto());

        return satir;



    }
}
