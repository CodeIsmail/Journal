package com.idealorb.journal;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class JournalAdapter extends RecyclerView.Adapter<JournalAdapter.JournalViewHolder> {

    @NonNull
    @Override
    public JournalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull JournalViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class JournalViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView titleTextView;
        private TextView detailTextView;
        private TextView dateTimeTextView;
        private ImageView favoriteTextView;

        public JournalViewHolder(View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.title_tv);
            detailTextView = itemView.findViewById(R.id.detail_tv);
            dateTimeTextView = itemView.findViewById(R.id.date_time_tv);
            favoriteTextView = itemView.findViewById(R.id.fav_iv);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {


        }
    }
}
