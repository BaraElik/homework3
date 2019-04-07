package com.example.homework3;

import android.app.Activity;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Adapter extends ArrayAdapter {
    private final ArrayList<Movies> movies;
    private final Activity activity;

    public Adapter(Activity activity, ArrayList<Movies> movies) {
        super(activity, R.layout.list_item, movies);
        this.activity = activity;
        this.movies = movies;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item, null, true);
        // get from xml list item
        TextView title = rowView.findViewById(R.id.title);
        TextView rating = rowView.findViewById(R.id.rating);
        TextView info = rowView.findViewById(R.id.info);
        ImageView image = rowView.findViewById(R.id.image);
        //set from movies java
        title.setText(movies.get(position).title);
        rating.setText(movies.get(position).rating);
        info.setText(movies.get(position).info);
        image.setImageResource(movies.get(position).image);
        return rowView;
    }
}
