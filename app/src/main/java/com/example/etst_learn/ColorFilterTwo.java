package com.example.etst_learn;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ColorFilterTwo extends AppCompatActivity implements View.OnClickListener{

    private ImageView img_meizi;
    private EditText edit_mul;
    private EditText edit_add;
    private Button btn_change;
    private Bitmap mBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_filter_activity_two);
        mBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.img_meizi);
        bindViews();
    }

    private void bindViews() {
        img_meizi = (ImageView) findViewById(R.id.img_meizi);
        edit_mul = (EditText) findViewById(R.id.edit_mul);
        edit_add = (EditText) findViewById(R.id.edit_add);
        btn_change = (Button) findViewById(R.id.btn_change);

        btn_change.setOnClickListener(this);

    }


    private Bitmap ProcessImage(Bitmap bp,int mul,int add){
        Bitmap bitmap = Bitmap.createBitmap(bp.getWidth(),bp.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColorFilter(new LightingColorFilter(mul,add));
        canvas.drawBitmap(bp,0,0,paint);
        return bitmap;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_change:
                int mul = Integer.parseInt(edit_mul.getText().toString());
                int add = Integer.parseInt(edit_add.getText().toString());
                img_meizi.setImageBitmap(ProcessImage(mBitmap,mul,add));
                break;
        }
    }
}