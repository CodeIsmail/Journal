package com.idealorb.journal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements JournalAdapter.JournalAdapterOnClickHandler{

    private RecyclerView appRecyclerView;
    private JournalAdapter journalAdapter;

    private ArrayList<Journal> journalArrayList;
    private Journal journal;
    private int listCount = 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appRecyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        appRecyclerView.setLayoutManager(layoutManager);

        appRecyclerView.setHasFixedSize(true);

        JournalAdapter adapter = new JournalAdapter(this);

        journalArrayList = new ArrayList<>();
        for (int i =0; i<listCount; i++){
            journal = new Journal("World Cup", "Goooooooooo" +
                    "ooooooooooooooaaaaaaaaaaaaaL", "30/06/2018");
            journalArrayList.add(journal);
        }

        adapter.setJournalList(journalArrayList);
        appRecyclerView.setAdapter(adapter);

        FloatingActionButton fabButton = findViewById(R.id.fab);

        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You've clicked FAB", Toast.LENGTH_LONG).show();
                //Intent addJournalIntent = new Intent(MainActivity.this, AddTaskActivity.class);
                //startActivity(addJournalIntent);
            }
        });

        setTitle("Ismail");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /* Use AppCompatActivity's method getMenuInflater to get a handle on the menu inflater */
        MenuInflater inflater = getMenuInflater();
        /* Use the inflater's inflate method to inflate our menu layout to this menu */
        inflater.inflate(R.menu.app_menu, menu);
        /* Return true so that the menu is displayed in the Toolbar */
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.search) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(Journal journal) {

    }
}
