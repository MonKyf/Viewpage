package org.monky.bai2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        displayData();
    }

    private void displayData() {
        DatabaseHandler db = new DatabaseHandler(this);
        List<Student> userList = db.getAllStudents();
        UserAdapte adapter = new UserAdapte(this, userList);
        recyclerView.setAdapter(adapter);
    }

    private void crod(){

    }
}