package com.quanghoa.androidbindview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.user_name) TextView txtUserName;
    @BindView(R.id.user_age) TextView txtUserAge;
    @BindView(R.id.user_email) TextView txtUserEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        binData();
    }

    private void binData(){
        txtUserName.setText("Vo Quang Hoa");
        txtUserEmail.setText("voquanghoa@Gmail.com");
        txtUserAge.setText(30+"");
    }

}
