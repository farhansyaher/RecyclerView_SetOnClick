package id.ac.suska.uin.justonclick;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile_Activity extends AppCompatActivity {
    ImageView img;
    TextView username, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);
        img = findViewById(R.id.gambar);
        username= findViewById(R.id.nama);
        email = findViewById(R.id.email);

        img.setImageResource(getIntent().getIntExtra("img", 0));
        username.setText(getIntent().getStringExtra("username"));
        email.setText(getIntent().getStringExtra("email"));
    }
}