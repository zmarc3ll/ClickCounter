package hu.petrik.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button felGomb;
    private TextView szamlalo;
    private Button leGomb;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        felGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                //string.valueof
                szamlalo.setText(String.valueOf(counter));
                if (counter<0) {
                    szamlalo.setTextColor(Color.RED);
                } else {
                    szamlalo.setTextColor(Color.GREEN);
                }
            }
        });

        leGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                szamlalo.setText(String.valueOf(counter));
                if (counter<0) {
                    szamlalo.setTextColor(Color.RED);
                } else {
                    szamlalo.setTextColor(Color.GREEN);
                }
            }
        });
    }

    public void init(){

        felGomb=(Button) findViewById(R.id.felGomb);
        szamlalo=(TextView) findViewById(R.id.szamlalo);
        leGomb=(Button) findViewById(R.id.leGomb);
        counter=0;

    }
}