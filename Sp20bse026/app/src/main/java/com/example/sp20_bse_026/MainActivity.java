package com.example.sp20_bse_026;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Configuration;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ActionFragment actionFragment;
    private msgFragment msgfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int orientation = getResources().getConfiguration().orientation;

        if(orientation== Configuration.ORIENTATION_LANDSCAPE){
            //FragmentManager fragmentManager = getSupportFragmentManager();
            //actionFragment = (ActionFragment) fragmentManager.findFragmentById(R.id.actionFrag);
           // msgfragment = (msgFragment) fragmentManager.findFragmentById(R.id.msgfragment);
            getSupportFragmentManager().beginTransaction().replace(R.id.leftFrag, new ActionFragment()).commit();

            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.rightFrag, msgFragment.class,null)
                    .setReorderingAllowed(true)
                    .addToBackStack("name") // name can be null
                    .commit();
        }
    }



}