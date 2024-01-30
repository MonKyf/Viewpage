package org.monky.bai2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapte extends RecyclerView.Adapter<UserAdapte.ViewHolder> {

    private List<Student> userList;
    private Context context;

    public UserAdapte(Context context, List<Student> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Student user = userList.get(position);

        holder.idTextView.setText("ID: " + user.getId());
        holder.emailTextView.setText("Email: " + user.getName());
        holder.passwordTextView.setText("Password: " + user.getAddress());
        holder.roleTextView.setText("Role: " + user.getPhone_number());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView idTextView;
        public TextView emailTextView;
        public TextView passwordTextView;
        public TextView roleTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idTextView = itemView.findViewById(R.id.idTextView);
            emailTextView = itemView.findViewById(R.id.emailTextView);
            passwordTextView = itemView.findViewById(R.id.passwordTextView);
            roleTextView = itemView.findViewById(R.id.roleTextView);
        }
    }
}

