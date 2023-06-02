package ru.startandroid.develop.image;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText fio;
    EditText phone;
    EditText adress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AlertDialog(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(title)
                .setMessage(message)
                .setCancelable((false))
                .setNegativeButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void start (View view){
        fio = findViewById(R.id.fio);
        phone= findViewById(R.id.phone);
        adress = findViewById(R.id.adress);

        if(fio.getText().length() == 0) AlertDialog("Уведомление", "Пожалуйста, укажите Фамилию, Имя и Отчество.");
        else if(phone.getText().length() == 0) AlertDialog("Уведомление", "Пожалуйста, укажите номер телефона");
        else if(phone.getText().length() == 0) AlertDialog("Уведомление", "Пожалуйста, укажите адрес");
        else {
            AlertDialog("Уведомление", "Заказ оформлен");
        }
    }
}