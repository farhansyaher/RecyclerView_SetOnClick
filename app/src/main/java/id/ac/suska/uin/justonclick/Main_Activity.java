package id.ac.suska.uin.justonclick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Main_Activity extends AppCompatActivity {

    private ArrayList<Data_List> datalist;
    private RecyclerView recyclerView;
    private RecyclerView_Adapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        datalist = new ArrayList<>();

        set_ListData();
        set_Adapter();
    }
    private void set_Adapter() {
        setOnClickListener();
        RecyclerView_Adapter adapter = new RecyclerView_Adapter(datalist, listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
    private void setOnClickListener() {
        listener = new RecyclerView_Adapter.RecyclerViewClickListener() {
            @Override
            public void onCLick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), Profile_Activity.class);
                intent.putExtra("username", datalist.get(position).getUsername());
                intent.putExtra("email", datalist.get(position).getEmail());
                intent.putExtra("image", datalist.get(position).getImg());
                startActivity(intent);
            }
        };
    }
    private void set_ListData() {
        datalist.add(new Data_List("Adakadabra", "pun10@gmail.com", R.drawable.pun10));
        datalist.add(new Data_List("Peko", "pardun@gmail.com", R.drawable.pardun));
        datalist.add(new Data_List("Suhu", "sasuga100@gmail.com", R.drawable.suhu));
        datalist.add(new Data_List("Yu Gi Oh", "fniswkasebf@yahoo.com", R.drawable.yugi));
        datalist.add(new Data_List("Elemen Tal", "gogogagigo@uin-suska.ac.id", R.drawable.elemental));
        datalist.add(new Data_List("Marine_ori", "Marine@gmail.com", R.drawable.marine));
        datalist.add(new Data_List("Marine_onna", "onna_marine@gmail.com", R.drawable.houshou_marine));
        datalist.add(new Data_List("Co-Pun", "kangen@gmail.com", R.drawable.copun));
        datalist.add(new Data_List("Panda", "kungfupanda@gmail.com", R.drawable.panda));
        datalist.add(new Data_List("Oh-Hi", "vtuber@gmail.com", R.drawable.oh_hi));
        datalist.add(new Data_List("Hololive", "hololive@gmail.com", R.drawable.hololive));
        datalist.add(new Data_List("Nijisanji", "nijisanji@gmail.com", R.drawable.nijisanji));
        datalist.add(new Data_List("Unknown", "0123456789@uin-suska.ac.id", R.drawable.unknown));
        datalist.add(new Data_List("Goku109", "kamehameha@yahoo.com", R.drawable.goku));
        datalist.add(new Data_List("Dota_2", "roshan297@gmail.com", R.drawable.roshan));
        datalist.add(new Data_List("Keyboard", "qwerty@yahoo.com", R.drawable.keyboard));
        datalist.add(new Data_List("Num baaaaa", "0927368asdhuy@gmail.com", R.drawable.number));
        datalist.add(new Data_List("Apalah Daya", "santuy1278@gmail.com", R.drawable.apalah_daya));
    }
}