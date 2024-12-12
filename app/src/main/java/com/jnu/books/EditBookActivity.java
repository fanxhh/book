package com.jnu.books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class EditBookActivity extends AppCompatActivity {

    public static final int RESULT_CODE_SUCCESS = 666;
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_shopitem);

        position=this.getIntent().getIntExtra("position",0);
        String title=this.getIntent().getStringExtra("title");
        String author=this.getIntent().getStringExtra("author");
        String date=this.getIntent().getStringExtra("date");
        int resourceId=this.getIntent().getIntExtra("resourceId",0);

        EditText editTextTitle=findViewById(R.id.edittext_shop_item_title);
        EditText editTextAuthor=findViewById(R.id.edittext_book_item_author);
        EditText editTextDate=findViewById(R.id.edittext_book_item_date);
        if(null!=title){
            editTextTitle.setText(title);
           editTextAuthor.setText(author);
           editTextDate.setText(date);
        }

        Button buttonOk=findViewById(R.id.button_ok);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent();
                Bundle bundle=new Bundle();
                bundle.putString("title",editTextTitle.getText().toString());
                bundle.putString("author",editTextAuthor.getText().toString());
                bundle.putString("date",editTextDate.getText().toString());
//                double price= Double.parseDouble(editTextAuthor.getText().toString());
//                bundle.putDouble("price",price);

                intent.putExtras(bundle);
                setResult(RESULT_CODE_SUCCESS,intent);
                EditBookActivity.this.finish();
            }
        });

    }
}