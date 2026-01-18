package com.mussa1.myfacebook;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class Postadapter extends RecyclerView.Adapter<Postadapter.ViewHolder>
{
    private List<Post> posts;

    public Postadapter(List<Post> posts)
    {
        this.posts = posts;
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView textUsername, textCaption;
        ImageView imageProfilePic, imagePost;

        public ViewHolder(View itemView) {
            super(itemView);
            textUsername = itemView.findViewById(R.id.text_username);
            imageProfilePic = itemView.findViewById(R.id.image_profile_pic);
            imagePost = itemView.findViewById(R.id.image_post);
            textCaption = itemView.findViewById(R.id.text_caption);

        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Post post = posts.get(position);
        holder.textUsername.setText(post.getUsername());
        holder.textCaption.setText(post.getCaption());
        holder.imageProfilePic.setImageResource(post.getProfilePicResId());
        holder.imagePost.setImageResource(post.getImageResId());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
}

