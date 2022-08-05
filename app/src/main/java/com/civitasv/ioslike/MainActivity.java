package com.civitasv.ioslike;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.civitasv.ioslike.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //    private DialogBottom dialogBottoms;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bindOperation();
    }

    private void bindOperation() {
        binding.normal.setOnClickListener(v -> {
            // 跳转至查看普通弹窗效果
            Intent intent = new Intent(MainActivity.this, DialogNormalActivity.class);
            startActivity(intent);
        });

        binding.bottom.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DialogBottomActivity.class);
            startActivity(intent);
        });

        binding.hud.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DialogHudActivity.class);
            startActivity(intent);
        });

    }
}