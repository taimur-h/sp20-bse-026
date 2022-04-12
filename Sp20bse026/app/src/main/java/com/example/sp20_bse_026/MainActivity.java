package com.example.sp20_bse_026;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            getSupportFragmentManager().beginTransaction().replace(R.id.leftFrag, ActionFragment.class, null).commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.rightFrag, msgFragment.class, null).commit();
        }

    }

}