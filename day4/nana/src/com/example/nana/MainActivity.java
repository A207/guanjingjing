package com.example.nana;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
     private EditText height =null;
     private EditText weight =null;
     private Button button = null;
     private TextView show =null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.BMIbutton);
        height=(EditText)findViewById(R.id.height);
        weight=(EditText)findViewById(R.id.weight);
        show=(TextView)findViewById(R.id.show);
    
        button.setOnClickListener(new OnClickListener(){
        	double bmi=0;
        	public void onClick(View v){
        		double h=new Double(height.getText().toString());
        		double w=new Double(weight.getText().toString());
        		bmi=w/(h*h);

        		double final_resault=exchangeResault(bmi);
        		if(bmi<18.5){
        			show.setText("������������ָ��Ϊ��"+final_resault+""+"�����е���Ŷ��ע��������ʳ�����Լ����һ��С�Ի���~");
        		}
        		else if(bmi>=18.5||bmi<24){
        			show.setText("������������ָ��Ϊ��"+final_resault+""+"�����������������ֹ�~");
        		}
        		else if(bmi>=24||bmi<27){
        			show.setText("������������ָ��Ϊ��"+final_resault+""+"�������أ��ǵö�����ߺ~");
        		}
        		else if(bmi>=27||bmi<30){
        			show.setText("������������ָ��Ϊ��"+final_resault+""+"��ȷ��֣�ע����ʳ��������~"); 
        		}
        		else if(bmi>=30||bmi<35){
        			show.setText("������������ָ��Ϊ��"+final_resault+""+"�жȷ��֣�Ϊ��ӵ�к����壬�ʵ����ƣ��ʵ�����~");
        		}
        		else if(bmi>=35){
        			show.setText("������������ָ��Ϊ��"+final_resault+""+"�ضȷ��֣�Ϊ���⻼���ַ�������ļ�����������Ҫ�����~");
        		}
        	}
        });
    }


        public double exchangeResault(double resault){
        	double first=resault*100;
        	double second=(int)first;
        	double second_first=first-second;

        	if (second_first>0.5){
        		second++;
        	}
        	double jirguo=(double)second/100;
        	return jirguo;
        }
    }
