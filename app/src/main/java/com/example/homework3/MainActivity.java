package com.example.homework3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ArrayList<Movies> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movies = new ArrayList<>();
        movies.add(new Movies(R.drawable.ant_man, "Ant-man", "73%", "Akční / Sci-Fi / Dobrodružný / Komedie"));
        movies.add(new Movies(R.drawable.avengers, "Avengers", "83%", "Akční / Dobrodružný / Sci-Fi / Fantasy"));
        movies.add(new Movies(R.drawable.captain_marvel, "Captain Marvel", "75%", "Akční / Dobrodružný / Sci-Fi"));
        movies.add(new Movies(R.drawable.doctor_strange, "Doctor Strange", "76%", "Akční / Dobrodružný / Fantasy / Sci-Fi"));
        movies.add(new Movies(R.drawable.hvezdna_brana, "Hvězdná brána", "76%", "Sci-Fi / Dobrodružný / Akční"));
        movies.add(new Movies(R.drawable.iron_man, "Iron Man", "82%", "Akční / Dobrodružný / Sci-Fi"));
        movies.add(new Movies(R.drawable.jessica_jones, "Jessica Jones", "77%", "Akční / Krimi / Drama / Sci-Fi / Thriller"));
        movies.add(new Movies(R.drawable.paty_element, "Pátý element ", "84%", "Sci-Fi / Akční / Komedie / Thriller"));
        movies.add(new Movies(R.drawable.strazci_galaxie, "Strážci Galaxie", "81%", "Akční / Dobrodružný / Sci-Fi"));
        movies.add(new Movies(R.drawable.the_punisher, "The Punisher", "88%", "Akční / Dobrodružný / Krimi / Sci-Fi / Thriller"));
        movies.add(new Movies(R.drawable.thor, "Thor", "74%", "Akční / Dobrodružný / Fantasy"));

        Adapter adapter = new Adapter(this, movies);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
}
