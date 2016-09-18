package com.quinnbanet.relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void rockClicker(View view) {
        Toast toast = Toast.makeText(this, "Rock was clicked", Toast.LENGTH_SHORT);
        toast.show();
        Log.d("ClickEvent", "Rock");
    }    public void paperClicker(View view) {
        Toast toast = Toast.makeText(this, "Paper was clicked", Toast.LENGTH_SHORT);
        toast.show();
        Log.d("ClickEvent", "Paper");
    }    public void scissorsClicker(View view) {
        Toast toast = Toast.makeText(this, "Scissors was clicked", Toast.LENGTH_SHORT);
        toast.show();
        Log.d("ClickEvent", "Scissors");
    }
    public void lizardClicker(View view) {
        Toast toast = Toast.makeText(this, "Lizard was clicked", Toast.LENGTH_SHORT);
        toast.show();
        Log.d("ClickEvent", "lizard");
    }
    public void spockClicker(View view) {
        Toast toast = Toast.makeText(this, "Spock was clicked", Toast.LENGTH_SHORT);
        toast.show();
        Log.d("ClickEvent", "Spock");
    }
}
