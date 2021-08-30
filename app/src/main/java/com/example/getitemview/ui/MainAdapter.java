package com.example.getitemview.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.getitemview.R;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final int TYPE_WITH_TXT = 0;
    private final int TYPE_WITH_IMG = 1;
    private final int TYPE_WITH_BTN = 2;

    private ArrayList<Item> list = new ArrayList<>();

    public void setList(ArrayList<Item> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        int i = 0;
        switch (list.get(position).getType()) {
            case 0:
                i = TYPE_WITH_TXT;
                break;
            case 1:
                i = TYPE_WITH_IMG;
                break;
            case 2:
                i = TYPE_WITH_BTN;
                break;
        }
        return i;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case TYPE_WITH_TXT:
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tv, parent, false);
                return new ViewHolderTxt(view);
            case TYPE_WITH_IMG:
                View imageView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_iv, parent, false);
                return new ViewHolderImage(imageView);
            case TYPE_WITH_BTN:
                View btnView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_btn, parent, false);
                return new ViewHolderBtn(btnView);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case TYPE_WITH_TXT:
                ((ViewHolderTxt) holder).onBind(list.get(position));
                break;
            case TYPE_WITH_IMG:
                ((ViewHolderImage) holder).onBind(list.get(position));
                break;
            case TYPE_WITH_BTN:
                ((ViewHolderBtn) holder).onBind(list.get(position));
                break;
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolderTxt extends RecyclerView.ViewHolder {

        private TextView text;

        public ViewHolderTxt(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.mainTv);
        }

        public void onBind(Item item) {
            text.setText(item.getTitle());
        }
    }

    public class ViewHolderImage extends RecyclerView.ViewHolder {

        private ImageView imageView;

        public ViewHolderImage(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.mainIv);
        }

        public void onBind(Item item) {
            imageView.setImageResource(item.getImage());
        }
    }

    public class ViewHolderBtn extends RecyclerView.ViewHolder {
        private Button btn;
        public ViewHolderBtn(@NonNull View itemView) {
            super(itemView);
            btn = itemView.findViewById(R.id.mainBtn);
        }

        public void onBind(Item item) {
            btn.setText(item.getTitle());

        }
    }
}
