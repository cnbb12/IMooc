package com.example.lenovo.moocclass.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.moocclass.R;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Lenovo on 2018/2/7.
 */

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder> {

    private List<MessageItem> listItems = new ArrayList<>();

    public MessageAdapter(List<MessageItem> listItems){
        this.listItems = listItems;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_message_frsgment_layout,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MessageAdapter.ViewHolder holder, int position) {

        MessageItem messageItem = listItems.get(position);
        holder.messageIcon.setImageResource(messageItem.getIconId());
        holder.messageIconBackgroud.setImageResource(messageItem.getColor());
        holder.messageTitle.setText(messageItem.getMessageTitle());
        holder.messageContent.setText(messageItem.getMessageContent());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView messageIconBackgroud;
        ImageView messageIcon;
        TextView messageTitle;
        TextView messageContent;


        public ViewHolder(View itemView) {
            super(itemView);
            messageIconBackgroud = (CircleImageView)itemView.findViewById(R.id.message_icon_background) ;
            messageIcon = (ImageView) itemView.findViewById(R.id.message_icon);
            messageTitle = (TextView) itemView.findViewById(R.id.message_title);
            messageContent = (TextView) itemView.findViewById(R.id.message_content);
        }
    }
}
