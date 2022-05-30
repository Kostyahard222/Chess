package com.example.chess;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

class figure{
    int X,Y,id; //хз зачем х и у пусть пока будут
    //id работают
    //1 символ w (white) белые или b (black) черные
    //2 символ r (rook) ладья h (horse) конь b (bishop)
    //слон q (queen) ферзь k (king) король p (pawn) пешка (навального)
    //3 символ чтобы была уникальность а именно буква столбца в котором изначально стоит фигура
    public figure(int x, int y){
        X=x;
        Y=y;
    }
    public void availablemoves(){}
}
class wpawn extends figure{ //пешка
    public wpawn(int x, int y, int id){
        super(x,y);
        id = 1;
    }
    @Override
    public void availablemoves() {
        
    }
}
class bpawn extends figure{ //пешка
    public bpawn(int x, int y, int id){
        super(x,y);
        id = 1;
    }
    @Override
    public void availablemoves() {

    }
}
class wrook extends figure{ //пешка
    public wrook(int x, int y, int id){
        super(x,y);
        id = 1;
    }
    @Override
    public void availablemoves() {

    }
}
class brook extends figure{ //пешка
    public brook(int x, int y, int id){
        super(x,y);
        id = 1;
    }
    @Override
    public void availablemoves() {

    }
}

public class MainActivity extends AppCompatActivity {
    static String[][] grid =
            {
                    {"wr", "wh", "wb", "wq", "wk", "wb", "wh", "wr"},
                    {"wp", "wp", "wp", "wp", "wp", "wp", "wp", "wp"},
                    {"00", "00", "00", "00", "00", "00", "00", "00"},
                    {"00", "00", "00", "00", "00", "00", "00", "00"},
                    {"00", "00", "00", "00", "00", "00", "00", "00"},
                    {"00", "00", "00", "00", "00", "00", "00", "00"},
                    {"bp", "bp", "bp", "bp", "bp", "bp", "bp", "bp"},
                    {"br", "bh", "bb", "bq", "bk", "bb", "bh", "br"}
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        MyDraw z = new MyDraw(getApplicationContext()); // z не потому что Россия, а потому что первое пришло в голову
        setContentView(z); // я в душе не ебу что я тут сделал, но кажется оно работает (нет)
    }
}
class MyDraw extends View {
    static Paint paint = new Paint();
    int center = getHeight() / 2, tilewidth = (getWidth() - 30) / 8;
    public MyDraw(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(55.0f);
        paint.setARGB(255, 157, 224, 180); //задний фон изумрудного цвета
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
        paint.setColor(Color.argb(255,255,0,0));
        Bitmap b;
        int zc = (tilewidth - 60)/2;
        for (int i = 0; i<8; i=i+1){
            for (int j = 0; j<8; j=j+1){
                int YY = center - (tilewidth * 4) + (tilewidth * i);
                switch (MainActivity.grid[7-i][j]){
                    case "wp":
                        b = BitmapFactory.decodeResource(getResources(), R.drawable.wp);
                        canvas.drawBitmap(b,
                                15+(tilewidth*j),
                                YY,
                                paint);
                        break;
                    case "wr":
                         b = BitmapFactory.decodeResource(getResources(), R.drawable.wr);
                        canvas.drawBitmap(b,
                                15+(tilewidth*j),
                                YY,
                                paint);
                        break;
                    case "wh":
                        b = BitmapFactory.decodeResource(getResources(), R.drawable.wh);
                        canvas.drawBitmap(b,
                                15+(tilewidth*j),
                                YY,
                                paint);
                        break;
                    case "wb":
                        b = BitmapFactory.decodeResource(getResources(), R.drawable.wb);
                        canvas.drawBitmap(b,
                                15+(tilewidth*j),
                                YY,
                                paint);
                        break;
                    case "wq":
                        b = BitmapFactory.decodeResource(getResources(), R.drawable.wq);
                        canvas.drawBitmap(b,
                                15+(tilewidth*j),
                                YY,
                                paint);
                        break;
                    case "wk":
                        b = BitmapFactory.decodeResource(getResources(), R.drawable.wk);
                        canvas.drawBitmap(b,
                                15+(tilewidth*j),
                                YY,
                                paint);
                        break;
                    case "bp":
                        b = BitmapFactory.decodeResource(getResources(), R.drawable.bp);
                        canvas.drawBitmap(b,
                                15+(tilewidth*j),
                                YY,
                                paint);
                        break;
                    case "br":
                        b = BitmapFactory.decodeResource(getResources(), R.drawable.br);
                        canvas.drawBitmap(b,
                                15+(tilewidth*j),
                                YY,
                                paint);
                        break;
                    case "bh":
                        b = BitmapFactory.decodeResource(getResources(), R.drawable.bh);
                        canvas.drawBitmap(b,
                                15+(tilewidth*j),
                                YY,
                                paint);
                        break;
                    case "bb":
                        b = BitmapFactory.decodeResource(getResources(), R.drawable.bb);
                        canvas.drawBitmap(b,
                                15+(tilewidth*j),
                                YY,
                                paint);
                        break;
                    case "bq":
                        b = BitmapFactory.decodeResource(getResources(), R.drawable.bq);
                        canvas.drawBitmap(b,
                                15+(tilewidth*j),
                                YY,
                                paint);
                        break;
                    case "bk":
                        b = BitmapFactory.decodeResource(getResources(), R.drawable.bk);
                        canvas.drawBitmap(b,
                                15+(tilewidth*j) ,
                                YY,
                                paint);
                        break;
                }
            }
        }
    }
}