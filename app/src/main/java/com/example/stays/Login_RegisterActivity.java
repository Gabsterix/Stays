package com.example.stays;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.stays.Fragments.LoginFragment;
import com.example.stays.Fragments.RegisterFragment;

public class Login_RegisterActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);

        //    Create an object of the frame layout class
        FrameLayout masterFrameLayout;

//    Create an object of thee fragment transaction class
        FragmentTransaction fragmentTransaction;

        masterFrameLayout = findViewById(R.id.masterFrameLayout);

//        Create objects of the fragment class and initialise them
        LoginFragment objLoginFragment = new LoginFragment();

        RegisterFragment objRegisterFragment = new RegisterFragment();

//        Retrieve the Action variable
        String strAction = getIntent().getStringExtra("ACTION");
//        Check which intent sent you here

        if (strAction.equals("login")){
//            Fragment transaction to show login fragment as default view
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
//            Replace the current fragment
            fragmentTransaction.replace(R.id.masterFrameLayout, objLoginFragment);
//            Execute the transaction
            fragmentTransaction.commit();

        } else if (strAction.equals("register")) {
//            Fragment transaction to show signup/register fragment as default view
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
//            Replace the current fragment
            fragmentTransaction.replace(R.id.masterFrameLayout, objRegisterFragment);
//            Execute the transaction
            fragmentTransaction.commit();

        }




    }
}