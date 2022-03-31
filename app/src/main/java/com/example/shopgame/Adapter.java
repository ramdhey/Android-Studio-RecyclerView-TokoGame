package com.example.shopgame;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;


class holder extends RecyclerView.ViewHolder{
    ImageView gmbrgame;
    CircleImageView logogme;
    TextView namagame,hrga;



    public holder(@NonNull View itemView) {
        super(itemView);

        gmbrgame = itemView.findViewById(R.id.gambarGame);
        logogme = itemView.findViewById(R.id.logoGame);
        namagame = itemView.findViewById(R.id.judul);
        hrga = itemView.findViewById(R.id.harga);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context,Order.class);
                context.startActivity(intent);
            }
        });

    }

}

public class Adapter extends RecyclerView.Adapter<holder> {
    Context context;
    ArrayList<gamenya> listgame;

    public Adapter(Context context, ArrayList<gamenya> listgame) {
        this.context = context;
        this.listgame = listgame;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.layout_adapter,parent,false);

        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        gamenya game = listgame.get(position);
        holder.namagame.setText(game.getNama());
        holder.hrga.setText("Rp "+game.getHarga());
        holder.logogme.setImageResource(game.getImg());
        holder.gmbrgame.setImageResource(game.getGmbar());










    }

    @Override
    public int getItemCount() {



        return listgame.size();


    }



}
