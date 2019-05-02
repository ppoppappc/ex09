package tku.cs2c.ex09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


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
}
