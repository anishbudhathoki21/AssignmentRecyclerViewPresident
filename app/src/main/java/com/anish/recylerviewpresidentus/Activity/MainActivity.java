package com.anish.recylerviewpresidentus.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.anish.recylerviewpresidentus.Adapter.Adapter;
import com.anish.recylerviewpresidentus.Model.ModelPresident;
import com.anish.recylerviewpresidentus.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    private RecyclerView recyclerView;
    List<ModelPresident> presidentsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvPresidents);


        presidentsList = new ArrayList<>();
        presidentsList.add(new ModelPresident(R.drawable.trump, "Donald Trump", "Donald John Trump is the 45th and current president of the United States. Before entering politics, he was a businessman and television personality. Trump was born and raised in the New York City borough of Queens, and received a B.S. degree in economics from the Wharton School at the University of Pennsylvania."));
        presidentsList.add(new ModelPresident(R.drawable.obama, "Barack Obama", "Barack Hussein Obama II is an American attorney and politician who served as the 44th president of the United States from 2009 to 2017. A member of the Democratic Party, he was the first African American to be elected to the presidency."));
        presidentsList.add(new ModelPresident(R.drawable.bush, "George W. Bush", "George Walker Bush is an American politician and businessman who served as the 43rd president of the United States from 2001 to 2009. He had previously served as the 46th governor of Texas from 1995 to 2000."));
        presidentsList.add(new ModelPresident(R.drawable.clinton, "Bill Clinton", "William Jefferson Clinton is an American politician who served as the 42nd president of the United States from 1993 to 2001. Prior to his presidency, he served as governor of Arkansas and as attorney general of Arkansas. A member of the Democratic Party, Clinton was known as a New Democrat, and many of his policies reflected a centrist \"Third Way\" political philosophy."));
        presidentsList.add(new ModelPresident(R.drawable.bush1, "George Bush", "George Herbert Walker Bush was an American politician and businessman who served as the 41st president of the United States from 1989 to 1993 and the 43rd vice president from 1981 to 1989."));
        presidentsList.add(new ModelPresident(R.drawable.reagan, "Ronald Reagan", "Ronald Wilson Reagan was an American politician who served as the 40th president of the United States from 1981 to 1989 and became the highly influential voice of modern conservatism. Prior to his presidency, he was a Hollywood actor and union leader before serving as the 33rd governor of California from 1967 to 1975."));
        presidentsList.add(new ModelPresident(R.drawable.carter, "Jimmy Carter", "James Earl Carter Jr. is an American politician and philanthropist who served as the 39th president of the United States from 1977 to 1981. A member of the Democratic Party."));
        presidentsList.add(new ModelPresident(R.drawable.ford, "Gerald Ford", "Gerald Rudolph Ford Jr. was an American politician who served as the 38th president of the United States from August 1974 to January 1977. Before his accession to the presidency, Ford served as the 40th vice president of the United States from December 1973 to August 1974."));

        Adapter mAdapter = new Adapter(this, presidentsList);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

    }

}
