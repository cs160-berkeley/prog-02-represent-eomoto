package com.example.ellenomoto.proj2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ellenomoto on 3/2/16.
 */

public class PeopleArrayAdapter extends BaseAdapter{
    private final Context context;
    private final int[] info;
    private final int[] photos;

    public PeopleArrayAdapter(Context context, int[] info, int[] photos) {
        this.context = context;
        this.info = info;
        this.photos = photos;}

    public Object getItem(int id){
        return id;
    }
    public long getItemId(int id){
        return id;
    }
    public int getCount() {
        return info.length;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.round_activity_main, parent, false);
        TextView nameView = (TextView) row.findViewById(R.id.editText);
        ImageView pictureView = (ImageView) row.findViewById(R.id.imageView);
        nameView.setText(info[position]);
        pictureView.setImageResource(photos[position]);

        final int position2 = position;
        //Attaching onClickListener

        row.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(context, WatchToPhoneService.class);
                sendIntent.putExtra("TYPE", position2);
                context.startService(sendIntent);
                Toast.makeText(context, info[position2], Toast.LENGTH_SHORT).show();
            }
        });

        return row;

    }
}
