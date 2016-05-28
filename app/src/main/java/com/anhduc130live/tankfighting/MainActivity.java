package com.anhduc130live.tankfighting;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageButton;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {
    ImageButton upArrow, downArrow, leftArrow, rightArrow;
    ImageView imageTank;
    float distance = 20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        addListenerOnUpArrow();
        addListenerOnDownArrow();
        addListenerOnLeftArrow();
        addListenerOnRightArrow();
        addListenerOnUpArrowTEST();
    }

    public void addListenerOnUpArrow(){
        upArrow = (ImageButton) findViewById(R.id.upArrow);
        imageTank = (ImageView) findViewById(R.id.tank);
        upArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                imageTank.setRotation(0);
                imageTank.setY(imageTank.getY() - distance);
            }
        });
    }

    public void addListenerOnUpArrowTEST(){
        Button button = (Button) findViewById(R.id.button);
        imageTank = (ImageView) findViewById(R.id.tank);
        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                //imageTank.setRotation(0);
                imageTank.setY(imageTank.getY() - distance);
                //return true;
                return false;
            }
        });
    }

    public void addListenerOnDownArrow(){
        downArrow = (ImageButton) findViewById(R.id.downArrow);
        imageTank = (ImageView) findViewById(R.id.tank);
        downArrow.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                float x;
                float y;
                float i  = imageTank.getY();
                switch (event.getAction()){
                    //float i  = imageTank.getY();
                    //;
                    //imageTank.setY(i + 20);
                    //i += 10;
                    case MotionEvent.ACTION_DOWN:
                        imageTank.setRotation(180);
                        x = event.getX();
                        y = event.getY();
                        break;
                    case MotionEvent.ACTION_UP:

                        break;

                }
                return false;
            }
        });
    }

    public void addListenerOnLeftArrow(){
        leftArrow = (ImageButton) findViewById(R.id.leftArrow);
        imageTank = (ImageView) findViewById(R.id.tank);
        leftArrow.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                imageTank.setRotation(-90);
                imageTank.setX(imageTank.getX() - distance);
            }
        });
    }

    public void addListenerOnRightArrow(){
        rightArrow = (ImageButton) findViewById(R.id.rightArrow);
        imageTank = (ImageView) findViewById(R.id.tank);
        rightArrow.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                imageTank.setRotation(90);
                imageTank.setX(imageTank.getX() + distance);
            }
        });
    }


}
