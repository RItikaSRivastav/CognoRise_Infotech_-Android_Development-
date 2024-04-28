package com.example.to_dolist;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class Addtasks extends AppCompatActivity {


    Button add;
    AlertDialog dialog;
    LinearLayout layout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addtasks);


        add=findViewById(R.id.add);
        layout=findViewById(R.id.container);

        buildDialog();
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                dialog.show();
            }
        });
    }

    private void buildDialog() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        View view = getLayoutInflater().inflate(R.layout.dialog, null);

        final EditText name= view.findViewById(R.id.nameEdit);

        builder.setView(view);
        builder.setTitle("Enter your Task")
                .setPositiveButton("SAVE",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick (DialogInterface dialog,int which){
                        addCard(name.getText().toString());
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                    dialog = builder.create();
    }
    private void addCard(String name) {
        final View view = getLayoutInflater().inflate(R.layout.activity_addtasks, null);


            TextView nameView = view.findViewById(R.id.name);
            Button delete = view.findViewById(R.id.delete);
            nameView.setText(name);
            delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    layout.removeView(view);
                }
            });
            layout.addView(view);
        }

    }
