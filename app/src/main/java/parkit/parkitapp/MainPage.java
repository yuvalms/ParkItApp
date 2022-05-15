package parkit.parkitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainPage extends AppCompatActivity {
    ImageView fbBtn;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        fbBtn = findViewById(R.id.fb_btn);
        fbBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Login to Facebook
            }
        });
    }




}