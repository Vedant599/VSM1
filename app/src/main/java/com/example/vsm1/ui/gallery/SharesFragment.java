package com.example.vsm1.ui.gallery;

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

public class SharesFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<SharesData> sharesDataList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of (this).get (GalleryViewModel.class);
        View root = inflater.inflate (R.layout.fragment_shares, container, false);
        recyclerView=root.findViewById(R.id.sharesRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager (getActivity()));
        char c='A';
        for(int i=0;i<5;i++)
        {
            new SharesData (R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,c+"",i+"");
            c++;
        }
        showView ();

        return root;
    }
    private void showView(){
        sharesDataList=new ArrayList<> ();      //We re-initialize the arraylist everytime the search button is clicked
        //as it should reload the list when new item is searched.
        adapter=new RecyclerViewAdapter (getActivity(),sharesDataList);





        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);

        //  search.setText("");
    }
}