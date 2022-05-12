package com.legarz.ctl_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.legarz.ctl_manager.databinding.ActivityProfileBinding;

public class Profile extends AppCompatActivity {

    ActivityProfileBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}