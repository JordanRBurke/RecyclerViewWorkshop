package com.jordanburke.recyclerviewworkshop;

/**
 * Created by jordanburke on 4/16/18.
 */
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter {

    private List<Students> studentList;

    public Adapter(List<Students> studentList) {
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view, parent, false);

        return ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position, @NonNull List payloads) {
        super.onBindViewHolder(holder, position, payloads);
        holder.bind(position);

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder implements
            View.OnClickListener {

        private TextView studentName;
        private TextView studentAge;
        private TextView studentPhoneType;
        private TextView studentSummary;

        public ViewHolder (View itemView) {
            super(itemView);

            studentName = itemView.findViewById(R.id.item_name_view);
            studentAge = itemView.findViewById(R.id.item_age_view);
            studentSummary = itemView.findViewById(R.id.item_summary);
            studentPhoneType = itemView.findViewById(R.id.item_phone_type_view);
            itemView.setOnClickListener(this);

        }

        public void bind(int position) {
            studentName.setText(studentList.get(position));


        }



    }
}
