package com.example.smartbusinesscard;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_text, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home){
            Toast.makeText(this, "홈아이콘 이벤트", Toast.LENGTH_SHORT).show();
            return true;
        }

        if (id == R.id.action_button) {
            Toast.makeText(this, "액션버튼 이벤트", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.sub_1) {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
