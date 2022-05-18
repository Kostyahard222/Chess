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
        paint.setARGB(255, 157, 224, 180); //задний фон изумрудного цвета
        canvas.drawPaint(paint);
        paint.setAntiAlias(true);
        int center = getHeight() / 2;
        int tilewidth = (getWidth() - 30) / 8;
        paint.setColor(Color.argb(255, 252, 252, 238)); //белые клетки
        canvas.drawRect(15, center - (tilewidth * 4), 15 + tilewidth * 8, center + (tilewidth * 4), paint);
        paint.setColor(Color.argb(255, 144, 77, 48)); //черные клетки
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
class figure{
    int X,Y,id; //хз зачем х и у пусть пока будут
    //id работают с 1 по 6 у белых фигур с 7 по 12 у черных
    //1 и 7 это пешка 2 и 8 это король 3 и 9 это ферзь
    //4 и 10 это ладья 5 и 11 это слон 6 и 12 это конь
    public figure(int x, int y){
        X=x;
        Y=y;
    }
    public void availablemoves(){}
}
class wpawn extends figure{ //белая пешка
    public wpawn(int x, int y, int id){
        super(x,y);
        id = 1;
    }
    @Override
    public void availablemoves() {
    }
}
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int[][] grid = new int[8][8];
        for (int i=0;i<8;i++) for (int j =0;j<8;j++) grid[i][j]=0;
        for (int i=0;i<8;i++){
            grid[1][i]=1;
            grid[6][i]=7;
        }
        grid[0][0]=4;grid[0][7]=4;grid[0][1]=6;grid[0][6]=6;grid[0][2]=5;grid[0][5]=5;grid[0][3]=2;grid[0][4]=3;
        grid[7][0]=10;grid[7][7]=10;grid[7][1]=12;grid[7][6]=12;grid[7][2]=11;grid[7][5]=11;grid[7][3]=8;grid[7][4]=9;
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        setContentView(new MyDraw(this));
    }
}