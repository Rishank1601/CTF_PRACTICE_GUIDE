package com.yk.ctfguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class web_q4 extends AppCompatActivity {
    private TextView head,point,chal;
    private EditText ans;
    Button sub;
    Score sb;
    int marks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_q4);

        head = (TextView) findViewById(R.id.head_wq1);
        point = (TextView) findViewById(R.id.point_wq4);
        chal = (TextView) findViewById(R.id.chal_wq4);
        ans = (EditText) findViewById(R.id.ans_wq4);
        sub = (Button) findViewById(R.id.sub_wq4);
        sb = new Score();
        marks = 0;

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = ans.getText().toString();
                if(answer.equals("")){
                    Toast.makeText(web_q4.this, "Please enter the flag", Toast.LENGTH_SHORT).show();
                }else{
                    if( answer.equals("flag{h4shbr0wns_0n_th3_s3rv3r_@!#$<>[]}")){
                        Toast.makeText(web_q4.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                        marks = 10;
                        sb.Calculate(marks);
                    }
                    else
                        Toast.makeText(web_q4.this, "Incorrect Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}