package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView choose, qua, summ,sumcr,sumch,sumqua,price, ed_qua, num, yes, no,ed_price,thank;
    ImageView   imageView;
    CheckBox cr,ch;
    Button in,de,order;

int number=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView =(ImageView)findViewById(R.id.image);
        choose =(TextView)findViewById(R.id.choose);
        cr =(CheckBox)findViewById(R.id.cr);
        ch =(CheckBox)findViewById(R.id.ch);
         qua =(TextView)findViewById(R.id.qua);
        in=(Button)findViewById(R.id.in);
        num =( TextView)findViewById(R.id.num);
        de=(Button)findViewById(R.id.de);
         summ =(TextView)findViewById(R.id.summ);
        sumcr =(TextView)findViewById(R.id.sumcr);
         sumch =(TextView)findViewById(R.id.sumch);
        sumqua =(TextView)findViewById(R.id.sumqua);
        price =(TextView)findViewById(R.id.price);
         yes =( TextView)findViewById(R.id.yes);
        no =( TextView)findViewById(R.id.no);
        ed_qua=( TextView)findViewById(R.id.ed_qua);
         ed_price =( TextView)findViewById(R.id.ed_pri);
       thank =(TextView)findViewById(R.id.thank);
       order=(Button)findViewById(R.id.order);







        in.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

number++;
                num.setText(""+number);

                if (number<0){
                    number=0;

                }

            }

        });


        de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number--;
                if (number<0){
                    number=0;
                }num.setText(""+number);



            }
        });
order.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        ed_price.setText(""+number*9);
        ed_qua.setText(""+number);
        if (number<0){ ed_price.setText(""+0);
            ed_qua.setText(""+0);}


    }
});

    }
    public void oncheck(View view) {
        boolean checked =((CheckBox)view).isChecked();
        switch (view.getId()){
            case  R.id.cr: if (checked)yes.setText("yes");
            else yes.setText("no");
            break;
            case R.id.ch: if (checked)no.setText("yes");
            else no.setText("no");
            break;
        }
    }
}
