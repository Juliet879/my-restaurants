package com.moringaschool.myrestaurants.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.moringaschool.myrestaurants.R;
import com.moringaschool.myrestaurants.RestaurantsActivity;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity{

private static final String TAG = RestaurantsActivity.class.getSimpleName();

    @BindView(R.id.findRestaurantsButton) Button mFindRestaurantsButton;
    @BindView(R.id.locationEditText) EditText mLocationEditText;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        View mFindRestaurantButton;
        mFindRestaurantButton.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      String location = mlocationEditText.getText().toString();
                      Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                      intent.putExtra("location",location);
                      startActivity(intent);
                  }
              });
    }
}