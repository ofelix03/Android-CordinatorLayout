package com.felix.cordinatorlayoutapp.cordinatorlayoutapp;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private FloatingActionButton floatingActionButtonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Game of Thrones");

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.drawable.ic_filter_list_black_24dp);

        floatingActionButtonView = (FloatingActionButton) findViewById(R.id.floating_action_btn);
        floatingActionButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(toolbar, "You just clicked on the floating action button", Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
