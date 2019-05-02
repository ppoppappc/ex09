package tku.cs2c.ex09;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.text.NoCopySpan;
import android.view.View;
import android.widget.Button;

public class EX09_1 extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayout);

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(EX09_1.this,EX09.class);
                startActivity(intent);
                EX09_1.this.finish();
            }
        });
    }
}
