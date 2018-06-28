package org.login.com.factorydesignpattern;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.login.com.factorydesignpattern.fragment.HomeAddressFragment;

public class MainActivity extends AppCompatActivity {

    Button mBtnHome;
    Button mBtnOffice;
    Button mBtnOthers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnHome = findViewById(R.id.btn_home);
        mBtnOffice = findViewById(R.id.btn_office);
        mBtnOthers = findViewById(R.id.btn_others);

        mBtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initFragment(new HomeAddressFragment());
            }
        });
        mBtnOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   }
        });
        mBtnOthers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  }
        });
    }

    public void initFragment(Fragment fragment)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container,fragment);
        fragmentTransaction.commit();

    }
}
