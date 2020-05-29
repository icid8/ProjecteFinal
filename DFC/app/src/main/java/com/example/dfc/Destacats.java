package com.example.dfc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Destacats extends AppCompatActivity {
    String items[]=new String[]{"https://www.marca.com/","https://www.mundodeportivo.com/", "https://www.elmundo.es/deportes.html", "https://www.sportlife.es/noticias"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destacats);

        ListView llistanoticies=findViewById(R.id.id_llistanoticies);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        llistanoticies.setAdapter(adapter);

        llistanoticies.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                WebView web= (WebView) findViewById(R.id.id_pantallanoticies);
                web.loadUrl(items[position]);
                web.setWebViewClient(new WebViewClient(){
                    @Override
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {

                        return super.shouldOverrideUrlLoading(view, url);
                    }
                });
            }
        });
    }

}
