package com.dharani.circleimagedemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView circularImageView = (ImageView)findViewById(R.id.imageView);
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.drawable.img);
        Bitmap resized = Bitmap.createScaledBitmap(bitmap,100,100,true);
        Bitmap circularBitmap = ImageConverter.getRoundedCornerBitmap(resized,100);
        circularImageView.setImageBitmap(circularBitmap);
    }
}
