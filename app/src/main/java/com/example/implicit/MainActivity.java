package com.example.implicit;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button openBrowserButton = findViewById(R.id.openYoutubeButton);
        openBrowserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an implicit intent
                Intent intent = new Intent(Intent.ACTION_VIEW);
                // Set the URL to be opened
                intent.setData(Uri.parse("https://www.youtube.com"));
                // Start the activity
                startActivity(intent);
            }
        });
    }
}
