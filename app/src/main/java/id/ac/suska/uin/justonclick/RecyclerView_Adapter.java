package id.ac.suska.uin.justonclick;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerView_Adapter extends RecyclerView.Adapter<RecyclerView_Adapter.MyViewHolder> {
    private ArrayList<Data_List> datalist;
    private RecyclerViewClickListener listener;

    public RecyclerView_Adapter(ArrayList<Data_List> datalist, RecyclerViewClickListener listener){
        this.datalist = datalist;
        this.listener = listener;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView name;
        private TextView email;
        private ImageView img;

        public MyViewHolder(final View view){
            super(view);
            name = view.findViewById(R.id.name);
            email = view.findViewById(R.id.email);
            img = view.findViewById(R.id.imgview);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onCLick(view, getAdapterPosition());
        }
    }

    @NonNull
    @Override
    public RecyclerView_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView_Adapter.MyViewHolder holder, int position) {
        String name = datalist.get(position).getUsername();
        String email = datalist.get(position).getEmail();
        int img = datalist.get(position).getImg();
        holder.name.setText(name);
        holder.email.setText(email);
        holder.img.setImageResource(img);

    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public interface RecyclerViewClickListener{
        void onCLick(View v, int position);
    }
}