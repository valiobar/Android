package com.example.lozenec.tic_tac_toe;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class DrawView extends View {
    Paint paint = new Paint();

    public DrawView(Context context,AttributeSet attrs) {
        super(context,attrs);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(10);

    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawLine(400, 300, 400, 900, paint);
        canvas.drawLine(600, 300, 600, 900, paint);
        canvas.drawLine(200, 500, 800, 500, paint);
        canvas.drawLine(200, 700, 800, 700, paint);
    }

}