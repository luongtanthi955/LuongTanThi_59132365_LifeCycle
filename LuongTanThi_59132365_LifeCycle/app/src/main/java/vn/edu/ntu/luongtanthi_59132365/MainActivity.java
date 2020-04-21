package vn.edu.ntu.luongtanthi_59132365;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView Time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCle","onCreate called");
        Toast.makeText(getApplicationContext(), "onCreate called", Toast.LENGTH_SHORT).show();

        Time = findViewById(R.id.thi123);
        SimpleDateFormat ngaygio = new SimpleDateFormat("HH:mm:ss");
        String thoigian = ngaygio.format(new Date());
        Time.setText(thoigian);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCle","onStart called");
        Toast.makeText(getApplicationContext(), "onCreate called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCle","onStart called");
        Toast.makeText(getApplicationContext(), "onRestart called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCle","onStart called");
        Toast.makeText(getApplicationContext(), "onResume called", Toast.LENGTH_SHORT).show();
        Time = findViewById(R.id.thi123);
        SimpleDateFormat ngaygio = new SimpleDateFormat("HH:mm:ss");
        String thoigian = ngaygio.format(new Date());
        Time.setText(thoigian);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCle","onStart called");
        Toast.makeText(getApplicationContext(), "onPause called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCle","onStart called");
        Toast.makeText(getApplicationContext(), "onStop called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCle","onStart called");
        Toast.makeText(getApplicationContext(), "onDestroy called", Toast.LENGTH_SHORT).show();
    }
}
