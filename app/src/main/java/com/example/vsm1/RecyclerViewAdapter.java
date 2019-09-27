package com.example.vsm1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Context context;
    private List <SharesData> shareList;
    private final String TAG="Main";
    public RecyclerViewAdapter(Context context, List<SharesData> list) {
        this.context = context;
        this.shareList = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.shares_recycler_view,parent,false);


        return new ViewHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: Called");
        SharesData sharesData=shareList.get(position);
        holder.companyName.setText("Name: "+sharesData.getCompanyName ());
        holder.sharePrice.setText("Average cost: "+sharesData.getPriceOfShare ());
        holder.comapanyImage.setImageResource (sharesData.getCompanyPhotoResource ());
        holder.arrow.setImageResource (sharesData.getArrowResource ());
        /*Image resources of arrow and company image*/



    }

    @Override
    public int getItemCount() {
        return shareList.size();
    }



    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView comapanyImage,arrow;
        TextView companyName,sharePrice;
        LinearLayout linearLayout;
        ViewHolder(@NonNull View itemView) {
            super(itemView);


        }
    }
}
