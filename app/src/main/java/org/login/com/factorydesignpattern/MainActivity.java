package org.login.com.factorydesignpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.login.com.factorydesignpattern.factory.address_factory.AddressFactory;

public class MainActivity extends AppCompatActivity {

    TextView mTvAddressTitle;
    Button mBtnHome;
    Button mBtnOffice;
    Button mBtnOthers;

    AddressFactory addressFactory = new AddressFactory();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvAddressTitle = findViewById(R.id.tv_address_title);
        mBtnHome = findViewById(R.id.btn_home);
        mBtnOffice = findViewById(R.id.btn_office);
        mBtnOthers = findViewById(R.id.btn_others);

        mBtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvAddressTitle.setText(addressFactory.getAddress("Home"));
            }
        });
        mBtnOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvAddressTitle.setText(addressFactory.getAddress("Office"));
            }
        });
        mBtnOthers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvAddressTitle.setText(addressFactory.getAddress("Others"));
            }
        });
    }
}
