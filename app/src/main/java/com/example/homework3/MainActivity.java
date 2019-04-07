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
        movies.add(new Movies(R.drawable.ant_man, "Ant-man", "73%", "Podvodník Scott Lang (Paul Rudd), získá oblek, díky kterému dokáže zmenšit své fyzické rozměry a současně znásobit svou sílu."));
        movies.add(new Movies(R.drawable.avengers, "Avengers", "83%", "V Avengers se přestaví ikoničtí super hrdinové – Iron Man, Neuvěřitelný Hulk, Thor, Captain America, Hawkeye a Black Widow."));
        movies.add(new Movies(R.drawable.captain_marvel, "Captain Marvel", "75%", "Odehrává v devadesátých letech dvacátého století sledující příběh Carol Danversové, ze které stala jedna z nejmocnějších superhrdinek světa."));
        movies.add(new Movies(R.drawable.hvezdna_brana, "Hvězdná brána", "76%", "Vědecká expedice objevila poblíž pyramid zvláštní objekt pokrytý neznámými symboly umožňující cestování napříč vesmírem."));
        movies.add(new Movies(R.drawable.iron_man, "Iron Man", "82%", "Další člen slavné rodiny Starků - Tony Stark a jeho super jetpack obleček."));
        movies.add(new Movies(R.drawable.jessica_jones, "Jessica Jones", "77%", "Jessica Jones je soukromým očkem ve čtvrti Hell's Kitchen v New York City."));
        movies.add(new Movies(R.drawable.paty_element, "Pátý element ", "84%", "New York, dvacáté třetí století. Země má být co nevidět zničena obří ohnivou koulí, tu dokáže zastavit jedině Pátým element."));
        movies.add(new Movies(R.drawable.the_punisher, "The Punisher", "88%", "Vojenského veterán Frank Castle,toho po zavraždění milované dcerky a manželky živí nenávist a chuť zabít každého, kdo se mu postaví do cesty."));
        movies.add(new Movies(R.drawable.thor, "Thor", "74%", "Thorovu otci, vládci bohů Odinovi, trvalo spoustu let, než ve své říši nastolil křehký mír. Jeho arogantní a domýšlivý syn ale dělá všechno proto, aby tuhle rovnováhu narušil."));

        Adapter adapter = new Adapter(this, movies);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
}
