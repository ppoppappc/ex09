package tku.cs2c.ex09;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.content.Intent;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


public class EX09 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* 以findViewById()取得Button对象，并加入onClickListener */
        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(EX09.this,EX09_1.class);
                startActivity(intent);
                EX09.this.finish();
            }
        });
    }

    public void changeColor(View v){
        TextView tx1 = (TextView)findViewById(R.id.text1);
        AbsoluteLayout mLayout = (AbsoluteLayout) findViewById(R.id.layout);

        tx1.setTextColor(Color.rgb(0,255,255));
        mLayout.setBackgroundColor(Color.rgb(255,0,0));
    }
}


