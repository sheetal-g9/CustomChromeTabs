package com.example.android.customchrometabs;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CustomChromeAdapter extends RecyclerView.Adapter<CustomChromeAdapter.UrlHolder> {
    Context context;
    List<Url> urls;

    public CustomChromeAdapter(List<Url> urls) {
        this.urls = urls;
    }

    @NonNull
    @Override
    public UrlHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        return new UrlHolder(layoutInflater.inflate(R.layout.url_itemview,viewGroup,false));

    }

    @Override
    public void onBindViewHolder(@NonNull UrlHolder urlHolder, int i) {
        urlHolder.getUrlTextView().setText(urls.get(i).getUrl());
        urlHolder.getWebsite_textview().setText(urls.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return urls !=null?urls.size():0;
    }

    public class UrlHolder extends RecyclerView.ViewHolder {
        TextView urlTextView;

        public TextView getWebsite_textview() {
            return website_textview;
        }

        TextView website_textview;
        public UrlHolder(@NonNull final View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((ChromeActivity) v.getContext()).onUrlClick(urls.get(getAdapterPosition()));
                }
            });
            urlTextView = itemView.findViewById(R.id.url_textView);
            website_textview = itemView.findViewById(R.id.website_name_textview);
        }

        public TextView getUrlTextView() {
            return urlTextView;
        }
    }
}
