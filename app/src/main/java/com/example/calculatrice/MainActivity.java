package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText c1;
    private EditText c2;
    private Button bplus, bmoins, bdiv, bmult;
    private TextView resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.resultat = (TextView) this.findViewById(R.id.resultat);

        this.bplus = (Button) this.findViewById(R.id.bplus);
        this.bplus.setOnClickListener((View) -> {
            EditText c1 = (EditText) findViewById(R.id.c1);
            EditText c2 = (EditText) findViewById(R.id.c2);
            String add = c1.getText().toString();
            String add2 = c2.getText().toString();
            int res = Integer.parseInt(add) + Integer.parseInt(add2);

            resultat.setText("" + res);
        });


        this.bmoins = (Button) this.findViewById(R.id.bmoins);
        this.bmoins.setOnClickListener((View) -> {
            EditText num1 = (EditText) findViewById(R.id.c1);
            EditText num2 = (EditText) findViewById(R.id.c2);
            String add = c1.getText().toString();
            String add2 = c2.getText().toString();
            int res = Integer.parseInt(add) - Integer.parseInt(add2);

            resultat.setText("" + resultat);
        });


        this.bmult = (Button) this.findViewById(R.id.bmult);
        this.bmult.setOnClickListener((View) -> {
            EditText c1 = (EditText) findViewById(R.id.c1);
            EditText c2 = (EditText) findViewById(R.id.c2);
            String add = c1.getText().toString();
            String add2 = c2.getText().toString();
            int res = Integer.parseInt(add) * Integer.parseInt(add2);

            resultat.setText("" + res);
        });


        this.bdiv = (Button) this.findViewById(R.id.bdiv);
        this.bdiv.setOnClickListener((View) -> {
            EditText c1 = (EditText) findViewById(R.id.c1);
            EditText c2 = (EditText) findViewById(R.id.c2);
            String add = c1.getText().toString();
            String add2 = c2.getText().toString();

            if (Integer.parseInt(add) == 0) {
                Context context = getApplicationContext();
                CharSequence text = "division par zero impossible";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            } else {
                int res = Integer.parseInt(add) / Integer.parseInt(add2);
                resultat.setText("" + res);
                ;
            }
        });
    }
}
