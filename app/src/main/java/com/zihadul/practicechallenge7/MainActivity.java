package com.zihadul.practicechallenge7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView plyer1,plyer2,plyer3,plyer4,plyer5,flag;
    TextView plyerName,plyerType,plyerDec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plyer1 = findViewById(R.id.plyer1);
        plyer2 = findViewById(R.id.plyer2);
        plyer3 = findViewById(R.id.plyer3);
        plyer4 = findViewById(R.id.plyer4);
        plyer5 = findViewById(R.id.plyer5);
        flag = findViewById(R.id.flag);
        plyerName = findViewById(R.id.plyerName);
        plyerType =findViewById(R.id.plyerType);
        plyerDec = findViewById(R.id.plyerDec);

        plyer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             flag.setVisibility(View.GONE);
                Picasso.get().load("https://i.imgur.com/DvpvklR.png").into(flag);
                plyerName.setText("\n" +
                        "Shakib Al Hasan");
                plyerType.setText("all-rounder");
                plyerDec.setText("Shakib Al Hasan is without a doubt the biggest name to have emerged from Bangladesh cricket circles. Being a genuine all-rounder, Shakib is a vital cog in Bangladesh's line-up. He has been a consistent performer for his country, over the years. Shakib first came into notice when he played cricket for several villages near his hometown of Magura. He spent time honing his skills at a government run sports facility and was picked for the Under-19 squad for the tri-series featuring England and Sri Lanka. He scored a 86-ball century and picked up three wickets in the final to help the team defeat Sri Lanka. This earned him selection for the series against Zimbabwe.\n" +
                        "\n" +
                        "He cracked his first ODI ton against Canada in the tri-series played in the West Indies, just before the 2007 World Cup. He scored a composed fifty and bowled 10 tight overs for 44 runs without a wicket as Bangladesh secured a big win over India. His consistent performances enhanced his reputation. He went on to score a century against Pakistan, later in the year.");
             
            }
        });


        plyer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag.setVisibility(View.GONE);
                Picasso.get().load("https://i.imgur.com/DvpvklR.png").into(flag);
                plyerName.setText("\n" +
                        "Mahmudullah");
                plyerType.setText("all-rounder");
                plyerDec.setText("Like Sanath Jayasuriya, Kevin Pietersen, Shoaib Malik, Steve Smith and many more, Mahmudullah started his career as a bowler and then converted into a batsman who could bowl handy off-breaks. He became the first Bangladeshi World Cup centurion when he scored 103 against England at the Adelaide Oval that helped his team reach the knockout stage for the first time.\n" +
                        "\n" +
                        "Born in Mymensingh, Mahmudullah made his first-class debut for Bangladesh A at the age of 19 and posted scores of 55 and 42 against Zimbabwe A. He made his debut in international cricket in an ODI against Sri Lanka in July 2007 and made an instant impact picking up 2 wickets and scored 36 runs but the effort went in vain as Bangladesh came up short. The performance was enough to convince the selectors to pick him for the tour to Kenya and the T20 World Cup later that year. He was briefly dropped from the side in 2008 but worked his way back with phenomenal domestic performances to earn a recall.");

            }
        });



    }
}