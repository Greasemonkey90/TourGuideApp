package com.bunny.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<TabInfo> mInformation;


    public RecyclerViewAdapter(Context context, List<TabInfo> information) {
        this.mContext = context;
        this.mInformation = information;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.list_item_view, parent, false);

        final MyViewHolder viewHolder = new MyViewHolder(view);


        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Toast.makeText(mContext, mContext.getString(R.string.show_pos_view) + (viewHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        holder.tv_placeName.setText(mInformation.get(position).getPlaceName());
        holder.tv_address.setText(mInformation.get(position).getAddress());
        holder.tv_placeInfo.setText(mInformation.get(position).getInfo());
        holder.image.setImageResource(mInformation.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return mInformation.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {


        private TextView tv_placeName;
        private TextView tv_address;
        private TextView tv_placeInfo;
        private ImageView image;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_placeName = itemView.findViewById(R.id.place_name);
            tv_address = itemView.findViewById(R.id.address);
            tv_placeInfo = itemView.findViewById(R.id.placeInfo);
            image = itemView.findViewById(R.id.image_view);
        }
    }


}
