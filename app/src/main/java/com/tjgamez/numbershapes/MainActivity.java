package com.tjgamez.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void makeToast(String string){

        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();

    }

    class Number {

        int number;

        public boolean isTriangular(){

            int x = 1;

            int triangularNumber = 1;

            while (triangularNumber < number) {

                x++;

                triangularNumber = triangularNumber + x;
            }

            if (triangularNumber == number){

                return true;

            } else {

                return false;

            }


        }

        public boolean isSquare() {

            int root = (int) Math.sqrt(number);

            int m = root * root;

            if (m == number) {

                return true;

            } else {

                return false;
            }
        }
    }

    public void numberCheck(View view) {

        EditText usersNumber = (EditText) findViewById(R.id.usersNumber);

        if (usersNumber.getText().toString().isEmpty()) {

            makeToast("Please Enter a Number");

        } else {

            Number myNumber = new Number();

            myNumber.number = Integer.parseInt(usersNumber.getText().toString());

            if (myNumber.isTriangular()) {

                makeToast("Number is Triangular");

            } else {

                makeToast("Number is not Triangular");

            }

            if (myNumber.isSquare()) {

                makeToast("Number is Square");

            } else {

                makeToast("Number is not Square");

            }

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
