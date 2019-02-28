package com.example.hieptq.roomdbdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HiepTQ on 2/25/2019.
 */
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    List<User> users;
    Context context;

    public UserAdapter(List<User> users, Context context) {
        this.users = users;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tvFullname.setText(users.get(i).getId() + " " + users.get(i).getFirstName() +
                " " + users.get(i).getLastName() + " " + users.get(i).getEmail());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvFullname;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvFullname = itemView.findViewById(R.id.tvFullName);
        }
    }
}
