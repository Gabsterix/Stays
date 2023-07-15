package com.example.stays.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.stays.R;


public class LoginFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    Button btnLogin;
    EditText etLoginUser, etLoginPassword;

    TextView signupTextView, forgottenPasswordTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_login, container, false);
//          Reference the fields on the activity
        etLoginUser = view.findViewById(R.id.etLoginUsername);
        etLoginPassword = view.findViewById(R.id.etLoginPassword);
//        Reference the login button
        btnLogin = view.findViewById(R.id.btnLoginPage_Login);

//        create event listener handlers
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Check for empty fields

//                Check if data exists in database

//                Show invalid user message

//                Send user to home dashboard page if credentials are correct
                FragmentTransaction fragmentTransaction;

            }
        });





        return view;
    }
}