package com.example.myapplication.Manage_Folder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class MngfolderAdapter extends RecyclerView.Adapter<MngfolderAdapter.UserViewHoler> {

    private Context mContext;
    private List<Mngfolder> mLisMngfolder;

    public MngfolderAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<Mngfolder> list) {
        this.mLisMngfolder = list;
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public UserViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mngfolder, parent, false);
        return new UserViewHoler(view);

    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHoler holder, int position) {
        Mngfolder mngfolder = mLisMngfolder.get(position);
        if(mngfolder == null) {
            return;
        }
//        holder.imgUser.setImageResource(mngfolder.getResouceImage());
        holder.tv_name_folder.setText(mngfolder.getName_folder());
        holder.tv_content_folder.setText(mngfolder.getContent_folder());

    }

    @Override
    public int getItemCount() {
        if(mLisMngfolder != null) {
            return mLisMngfolder.size();
        }
        return 0;
    }

    public class UserViewHoler extends RecyclerView.ViewHolder {

//        private ImageView imgUser;
        private TextView tv_name_folder;
        private TextView tv_content_folder;

        public UserViewHoler(@NonNull View itemView) {
            super(itemView);

//            imgUser = itemView.findViewById(R.id.img_shapeblue);
            tv_name_folder = itemView.findViewById(R.id.tv_name_folder);
            tv_content_folder = itemView.findViewById(R.id.tv_content);
        }
    }
}
