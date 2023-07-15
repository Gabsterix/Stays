package com.example.stays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnboardingActivity extends AppCompatActivity {
//  Create a string to hold the message passed along with the intent
    String strSender = "login";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding2);
//        Create and reference an object of the button class and reference it to the buttons
        Button objLoginBTN = findViewById(R.id.btn_Onboarding_Login);
        Button objSignupBTN = findViewById(R.id.btn_Onboarding_Signup);

//        Create the event listeners for the buttons
        objLoginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Prepare the string variable
                strSender = "login";

//                Create and Initialise the intent
                Intent intent = new Intent(OnboardingActivity.this, Login_RegisterActivity.class);
//                Pass the Key name and value
                intent.putExtra("ACTION", strSender);
//                Execute the activity
                startActivity(intent);
            }
        });


        objSignupBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Prepare the string variable
                strSender = "register";

                //                Create and Initialise the intent
                Intent intent = new Intent(OnboardingActivity.this, Login_RegisterActivity.class);
//                Pass the Key name and value
                intent.putExtra("ACTION", strSender);
//                Execute the activity
                startActivity(intent);
            }
        });




    }
}