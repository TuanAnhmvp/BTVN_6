package com.example.myapplication.Manage_Folder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.myapplication.Add_Folder.Activity_AddFolder;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Mngfolder extends AppCompatActivity {
    private RecyclerView rcv_Mngfolder;
    private List<Mngfolder> mngModelList;
    private int index = 1;
    private MngfolderAdapter mMngfolderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mngfolder);

        rcv_Mngfolder = findViewById(R.id.rcv_mngfolder);
        mMngfolderAdapter = new MngfolderAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcv_Mngfolder.setLayoutManager(linearLayoutManager);

        mMngfolderAdapter.setData(getListMngfolder());
        rcv_Mngfolder.setAdapter(mMngfolderAdapter);
        setToolbar();
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.tbar_mngfolder);

        toolbar.setNavigationIcon(R.drawable.icon_back);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

//        toolbar.inflateMenu(R.menu.menu_item_mngfolder);
//
//        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.add_menu:
//                        mngModelList.add(new Mngfolder("",""));
//                        mMngfolderAdapter.notifyDataSetChanged();
//                        //LinearLayoutManager.scrollToPosition(mngModelList.size() - 1);
//                }
//                return true;
//
//            }
//        });

    }


    private List<Mngfolder> getListMngfolder() {
        List<Mngfolder> list = new ArrayList<>();
        list.add(new Mngfolder("Tổng hợp tin tức thời sự", "Tổng hợp tin tức thời sự nóng hổi nhất, của tất cả các ..."));
        list.add(new Mngfolder("Do It Your Self", "Sơn tùng MTP quá đẹp trai hát hay"));
        list.add(new Mngfolder("Cảm hứng sáng tạo", "Tổng hợp tin tức thời sự nóng hổi nhất, của tất cả các ..."));
        list.add(new Mngfolder("Tổng hợp tin tức thời sự", "Tổng hợp tin tức thời sự nóng hổi nhất, của tất cả các ..."));
        list.add(new Mngfolder("Do It Your Self", "Tổng hợp tin tức thời sự nóng hổi nhất, của tất cả các ..."));
        list.add(new Mngfolder("Cảm hứng sáng tạo", "Tổng hợp tin tức thời sự nóng hổi nhất, của tất cả các ..."));

        return list;

    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//