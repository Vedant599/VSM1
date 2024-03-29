package com.example.vsm1.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vsm1.R;
import com.example.vsm1.RecyclerViewAdapter;
import com.example.vsm1.SharesData;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of (this).get (HomeViewModel.class);
        View root = inflater.inflate (R.layout.fragment_news, container, false);
        final TextView textView = root.findViewById (R.id.text_home);
        homeViewModel.getText ().observe (this, new Observer<String> () {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText (s);
            }
        });

        return root;
    }

}