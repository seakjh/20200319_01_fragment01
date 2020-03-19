package com.example.a20200319_01_fragment01.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.a20200319_01_fragment01.R;
import com.example.a20200319_01_fragment01.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    FragmentSecondBinding binding = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = binding.idEdt.getText().toString();
                String pw = binding.pwEdt.getText().toString();

                String admin = "admin";
                String adminpw = "asdf1234";

                if (id.equals(admin) && pw.equals(adminpw)){
                    Toast.makeText(getActivity(), "관리자 로그인", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getActivity(), "잘못된 사용자 정보입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
