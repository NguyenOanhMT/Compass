package com.nguyenoanh.compass.Activity;

import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.nguyenoanh.compass.Adapter.ItemAccountAdapter;
import com.nguyenoanh.compass.Adapter.RecyclerItemTouchHelper;
import com.nguyenoanh.compass.Model.ItemAccount;
import com.nguyenoanh.compass.R;

import java.util.ArrayList;

public class Profile extends AppCompatActivity implements RecyclerItemTouchHelper.RecyclerItemTouchHelperListener {

    RecyclerView recyclerView;
    ArrayList<ItemAccount> accountArrayList;

    CoordinatorLayout coordinatorLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        accountArrayList = new ArrayList<>();
        coordinatorLayout = findViewById(R.id.coordinator_layout);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager((this));
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        accountArrayList.add(
                new ItemAccount(getResources().getString(R.string.ronald),
                        getResources().getString(R.string.graphiscal),
                        R.drawable.ronald_pic));
        accountArrayList.add(
                new ItemAccount(getResources().getString(R.string.jacod_burton),
                        getResources().getString(R.string.ios_developer),
                        R.drawable.jacob_pic));
        accountArrayList.add(
                new ItemAccount(getResources().getString(R.string.alice_perez),
                        getResources().getString(R.string.ruby_developer),
                        R.drawable.alice_pic));
        accountArrayList.add(
                new ItemAccount(getResources().getString(R.string.johny_meyer),
                        getResources().getString(R.string.uiux_developer),
                        R.drawable.johnny_pic));

        ItemAccountAdapter adapter = new ItemAccountAdapter(this, accountArrayList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);

        ItemTouchHelper.SimpleCallback itemTouchHelperCallback = new RecyclerItemTouchHelper(0, ItemTouchHelper.LEFT,  this);
        new ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(recyclerView);
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction, int position) {
    }
}
