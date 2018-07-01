package com.idealorb.journal;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class JournalAdapter extends RecyclerView.Adapter<JournalAdapter.JournalViewHolder> {

    private ArrayList<Journal> journalList;

    private final JournalAdapterOnClickHandler clickHandler;

    public interface JournalAdapterOnClickHandler{
        void onClick(Journal journal);
    }

    public  JournalAdapter(JournalAdapterOnClickHandler clickHandler){
        this.clickHandler = clickHandler;
    }
    @NonNull
    @Override
    public JournalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.journal_list_item, parent, false);

        return new JournalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JournalViewHolder holder, int position) {

        Journal journal = journalList.get(position);
        holder.titleTextView.setText(journal.getTitle());
        holder.detailTextView.setText(journal.getStory());
        holder.dateTimeTextView.setText(journal.getDateTime());
    }

    @Override
    public int getItemCount() {

        if(journalList == null)
            return 0;
        else
            return journalList.size();
    }

    public void  setJournalList(ArrayList<Journal> journalList){
        this.journalList = journalList;
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
            int adapterPosition = getAdapterPosition();
            Journal journal = journalList.get(adapterPosition);
            clickHandler.onClick(journal);

        }
    }
}
