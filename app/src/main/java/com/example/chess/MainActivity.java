package com.example.chess;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

class MyDraw extends View {
    public MyDraw(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setARGB(255, 157, 224, 180);
        canvas.drawPaint(paint);
        paint.setAntiAlias(true);
        int center = getHeight() / 2;
        int tilewidth = (getWidth() - 30) / 8;
        paint.setColor(Color.argb(255, 144, 77, 48)); //черные клетки
        canvas.drawRect(15, center - (tilewidth * 4), 15 + tilewidth * 8, center + (tilewidth * 4), paint);
        paint.setColor(Color.argb(255, 252, 252, 238)); //белые клетки
        canvas.drawRect(15, center - (tilewidth * 4), 15 + tilewidth, center - (tilewidth * 4) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 2, center - (tilewidth * 4), 15 + tilewidth * 2 + tilewidth, center - (tilewidth * 4) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 4, center - (tilewidth * 4), 15 + tilewidth * 4 + tilewidth, center - (tilewidth * 4) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 6, center - (tilewidth * 4), 15 + tilewidth * 6 + tilewidth, center - (tilewidth * 4) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth, center - (tilewidth * 3), 15 + tilewidth * 2, center - (tilewidth * 3) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 3, center - (tilewidth * 3), 15 + tilewidth * 3 + tilewidth, center - (tilewidth * 3) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 5, center - (tilewidth * 3), 15 + tilewidth * 5 + tilewidth, center - (tilewidth * 3) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 7, center - (tilewidth * 3), 15 + tilewidth * 7 + tilewidth, center - (tilewidth * 3) + tilewidth, paint);
        canvas.drawRect(15, center - (tilewidth * 2), 15 + tilewidth, center - (tilewidth * 2) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 2, center - (tilewidth * 2), 15 + tilewidth * 2 + tilewidth, center - (tilewidth * 2) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 4, center - (tilewidth * 2), 15 + tilewidth * 4 + tilewidth, center - (tilewidth * 2) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 6, center - (tilewidth * 2), 15 + tilewidth * 6 + tilewidth, center - (tilewidth * 2) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth, center - (tilewidth), 15 + tilewidth * 2, center - (tilewidth) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 3, center - (tilewidth), 15 + tilewidth * 3 + tilewidth, center - (tilewidth) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 5, center - (tilewidth), 15 + tilewidth * 5 + tilewidth, center - (tilewidth) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 7, center - (tilewidth), 15 + tilewidth * 7 + tilewidth, center - (tilewidth) + tilewidth, paint);
        canvas.drawRect(15, center , 15 + tilewidth, center  + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 2, center , 15 + tilewidth * 2 + tilewidth, center  + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 4, center , 15 + tilewidth * 4 + tilewidth, center  + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 6, center , 15 + tilewidth * 6 + tilewidth, center  + tilewidth, paint);
        canvas.drawRect(15 + tilewidth, center - (tilewidth * (-1)), 15 + tilewidth * 2, center - (tilewidth * (-1)) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 3, center - (tilewidth * (-1)), 15 + tilewidth * 3 + tilewidth, center - (tilewidth * (-1)) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 5, center - (tilewidth * (-1)), 15 + tilewidth * 5 + tilewidth, center - (tilewidth * (-1)) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 7, center - (tilewidth * (-1)), 15 + tilewidth * 7 + tilewidth, center - (tilewidth * (-1)) + tilewidth, paint);
        canvas.drawRect(15, center - (tilewidth * (-2)), 15 + tilewidth, center - (tilewidth * (-2)) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 2, center - (tilewidth * (-2)), 15 + tilewidth * 2 + tilewidth, center - (tilewidth * (-2)) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 4, center - (tilewidth * (-2)), 15 + tilewidth * 4 + tilewidth, center - (tilewidth * (-2)) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 6, center - (tilewidth * (-2)), 15 + tilewidth * 6 + tilewidth, center - (tilewidth * (-2)) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth, center - (tilewidth * (-3)), 15 + tilewidth * 2, center - (tilewidth * (-3)) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 3, center - (tilewidth * (-3)), 15 + tilewidth * 3 + tilewidth, center - (tilewidth * (-3)) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 5, center - (tilewidth * (-3)), 15 + tilewidth * 5 + tilewidth, center - (tilewidth * (-3)) + tilewidth, paint);
        canvas.drawRect(15 + tilewidth * 7, center - (tilewidth * (-3)), 15 + tilewidth * 7 + tilewidth, center - (tilewidth * (-3)) + tilewidth, paint);
        paint.setColor(Color.argb(255, 144, 77, 48)); //черные клетки
    }
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        setContentView(new MyDraw(this));
    }
}