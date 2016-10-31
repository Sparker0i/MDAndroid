package com.a5corp.materialdesign;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class ViewHolder extends RecyclerView.ViewHolder {
    public ViewHolder(LayoutInflater inflater, ViewGroup parent) {
        super(inflater.inflate(R.layout.item_tile, parent, false));
    }
}