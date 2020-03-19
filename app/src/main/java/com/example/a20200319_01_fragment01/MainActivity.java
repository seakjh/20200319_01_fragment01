package com.example.a20200319_01_fragment01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.a20200319_01_fragment01.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        binding.firstFragCallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                첫 프래그버튼 호출 버튼이 눌ㄹ면?
//                first 보이게 = > firstFrag자체는 기능이 별로 없다
//                firstfrag를 감싸는 레이아웃을 추가 => 예를 보이게
                binding.firstFragLayout.setVisibility(View.VISIBLE);
//                second 숨기게
                binding.secondFragLayout.setVisibility(View.GONE);

            }
        });

        binding.secondFragCallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.firstFragLayout.setVisibility(View.GONE);

                binding.secondFragLayout.setVisibility(View.VISIBLE);
            }
        });

    }

    @Override
    public void setValues() {

    }
}
