package com.moringaschool.myrestaurants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mFindRestaurantButton;
    private EditText mlocationEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlocationEditText = (EditText) findViewById(R.id.locationEditText);
        mFindRestaurantButton = (Button)findViewById(R.id.findRestaurantsButton);
        mFindRestaurantButton.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      String location = mlocationEditText.getText().toString();
                      Log.d(TAG, location);
                      Intent intent = new Intent(MainActivity.this,RestaurantsActivity.class);
                      intent.putExtra("location",location);
                      startActivity(intent);
                  }
              });
    }
}