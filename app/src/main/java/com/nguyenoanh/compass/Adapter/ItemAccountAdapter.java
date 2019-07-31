package com.nguyenoanh.compass.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.nguyenoanh.compass.Model.ItemAccount;
import com.nguyenoanh.compass.R;

import java.util.ArrayList;

public class ItemAccountAdapter extends RecyclerView.Adapter<ItemAccountAdapter.ViewHolder> {

    Context context;
    ArrayList<ItemAccount> accountArrayList;

    public ItemAccountAdapter(Context context, ArrayList<ItemAccount> accountArrayList) {
        this.context = context;
        this.accountArrayList = accountArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.item_menu_icon, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        ItemAccount itemAccount = accountArrayList.get(i);

        holder.tvName.setText(itemAccount.getName());
        holder.tvJob.setText(itemAccount.getJob());
        holder.imageView.setImageDrawable(context.getResources().getDrawable(itemAccount.getImage()));

//        holder.imvPlus.setImageDrawable(context.getResources().getDrawable(itemAccount.getImvPlus()));
        Glide.with(context).load(itemAccount.getViewGroup());
    }

    @Override
    public int getItemCount() {
        return accountArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvJob;
        ImageView imageView;
//        ImageView imvPlus;

        LinearLayout linearMenu;
        RelativeLayout relativeAccount;

        public ViewHolder(View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tv_name);
            tvJob = itemView.findViewById(R.id.tv_job);
            imageView = itemView.findViewById(R.id.imv_avatar);

//            imvPlus = imageView.findViewById(R.id.imv_plus);

            linearMenu = itemView.findViewById(R.id.linear_menu);
            relativeAccount = itemView.findViewById(R.id.relative_item_account);
        }

    }
}
