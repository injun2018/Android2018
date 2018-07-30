package com.injun.doitmission_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView2;
    int imageIndex=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.imageView);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
    }

    public void onButton1Clicked(View v){
        ImageUp();
    }

    private void ImageUp(){

            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);

    }

    public void onButton2Clicked(View v){
        ImageDown();
    }

    private void ImageDown(){
        imageView.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.VISIBLE);

    }
}
