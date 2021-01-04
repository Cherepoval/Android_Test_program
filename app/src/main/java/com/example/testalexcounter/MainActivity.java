package com.example.testalexcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import com.example.testalexcounter.R.string;

public class MainActivity extends AppCompatActivity {
    private TextView T1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T1= this.findViewById(R.id.texthello);
    }

    public void onClickChenge(View view) {
        T1.setText("С новым годом !");
    }
}