package com.wanouri.yommat.tapbeats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  TextView textView;
    Button[] button;

    private int idx = 0;

    int[] ids = new int[] {R.id.button, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6 };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = new Button[ids.length];

        final Tuner tuner = new Tuner(this);

        for (int i = 0; i < ids.length; i++) {
            button[i]=(Button)findViewById(ids[i]);

            button[i].setTag(i);

            button[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    tuner.play((int)view.getTag());
                }
            });
        }
    }

}
