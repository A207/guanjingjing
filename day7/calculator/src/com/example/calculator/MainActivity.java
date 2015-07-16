package com.example.calculator;

import java.util.ArrayList;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
 
public class MainActivity extends Activity {
 
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, jia, jian, cheng,
            chu, C, DEL, dian, dengyu = null;
    private EditText text1 = null;
    private double x = 0;
    private double y = 0;
    private double result = 0;   //���ս��
    private static ArrayList<String> I = new ArrayList<String>(); //��ʼ��ֵ
    private static String jia1 = null;  //����������
    private static String jia2 = null;  //������ź����
    private static String operator = null;    //���� ʶ���жϼӼ��˳�
    private dengyuListener Listener = new dengyuListener();
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
         * 1.�ҵ��ؼ� 2.ʵ������������������ť�󶨼�����
         */
 
        // 1.�ҵ��ؼ�
 
        jia = (Button) findViewById(R.id.jia);
        jian = (Button) findViewById(R.id.jian);
        cheng = (Button) findViewById(R.id.cheng);
        chu = (Button) findViewById(R.id.chu);
        C = (Button) findViewById(R.id.C);
        DEL = (Button) findViewById(R.id.DEL);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        dian = (Button) findViewById(R.id.dian);
        dengyu = (Button) findViewById(R.id.dengyu);
        text1 = (EditText) findViewById(R.id.text);
 
        // 2.���ü�����
        jia.setOnClickListener(Listener);
        jian.setOnClickListener(Listener);
        cheng.setOnClickListener(Listener);
        chu.setOnClickListener(Listener);
        C.setOnClickListener(Listener);
        DEL.setOnClickListener(Listener);
        dian.setOnClickListener(Listener);
        b1.setOnClickListener(Listener);
        b2.setOnClickListener(Listener);
        b3.setOnClickListener(Listener);
        b4.setOnClickListener(Listener);
        b5.setOnClickListener(Listener);
        b6.setOnClickListener(Listener);
        b7.setOnClickListener(Listener);
        b8.setOnClickListener(Listener);
        b9.setOnClickListener(Listener);
        b0.setOnClickListener(Listener);
        dengyu.setOnClickListener(Listener);
    }
 
    /*
     * ������Ҫʵ�ֵĹ��� 1��ȡ��EditText����ĵ�һ��ֵ������ֵ�������� 2.ȡ��EditText������ĵڶ���ֵ������������
     * 3.�������������ִ���������
     */
 
    class dengyuListener implements OnClickListener {
        public void onClick(View view) {
            text1.setInputType(InputType.TYPE_NULL);
            Button button = (Button) view;
            switch (view.getId()) {
            case R.id.b0: {                                                             //�����������
                text1.setText(text1.getText().toString()
                        + button.getText().toString());
                break;
            }
            case R.id.b1: {
                text1.setText(text1.getText().toString()
                        + button.getText().toString());
                break;
            }
            case R.id.b2: {
                text1.setText(text1.getText().toString()
                        + button.getText().toString());
                break;
            }
            case R.id.b3: {
                text1.setText(text1.getText().toString()
                        + button.getText().toString());
                break;
            }
            case R.id.b4: {
                text1.setText(text1.getText().toString()
                        + button.getText().toString());
                break;
            }
            case R.id.b5: {
                text1.setText(text1.getText().toString()
                        + button.getText().toString());
                break;
            }
            case R.id.b6: {
                text1.setText(text1.getText().toString()
                        + button.getText().toString());
                break;
            }
            case R.id.b7: {
                text1.setText(text1.getText().toString()
                        + button.getText().toString());
                break;
            }
            case R.id.b8: {
                text1.setText(text1.getText().toString()
                        + button.getText().toString());
                break;
            }
            case R.id.b9: {
                text1.setText(text1.getText().toString()
                        + button.getText().toString());
                break;
            }
 
            case R.id.dian: {
                text1.setText(text1.getText().toString()
                        + button.getText().toString());
                break;
            }
 
            case R.id.DEL: {                                                        
                String name = text1.getText().toString();   
                if(name==null){
                text1.setText("");}
                else
                name = text1.getText().toString();  
                     
                String name1 = name.subSequence(0, name.length() - 1).toString();//ɾ����һ���ַ�
                 
                 
                text1.setText(name1);
                break;
            }
 
            case R.id.C: {                           //�����
                text1.setText("");
                I = new ArrayList<String>();           //��ʼ������
                break;
            }
 
            case R.id.jia: {
                jia1 = text1.getText().toString();
                operator = "1";                             //��jia��ʶΪ1
                text1.setText("+");
                I = new ArrayList<String>();          //��ʼ������
                break;
            }
            case R.id.jian: {
                jia1 = text1.getText().toString();
                operator = "2";                                      //��jia��ʶΪ2
                text1.setText("-");
                I = new ArrayList<String>();
                break;
            }
            case R.id.cheng: {
                jia1 = text1.getText().toString();
                operator = "3";                                     //ͬ��
                text1.setText("*");
                break;
            }
            case R.id.chu: {
                jia1 = text1.getText().toString();
                operator = "4";                                 //ͬ��
                text1.setText("/");
                break;
            }
                 
            case R.id.dengyu: {
                String S = text1.getText().toString();
                jia2 = new StringBuffer(S).deleteCharAt(0).toString();          //���text1�ķ���
                x = Double.valueOf(jia1);
                y = Double.valueOf(jia2);   
                //��ֵx��y��ǿ��ת��jia1��jia2Ϊdouble��
                  if (operator.equals("1")) {                        //��ʶ��Ϊ1�����ӷ�ʱ��ִ��x��y
                    result = x + y;
                } else if (operator.equals("2")) {
                    result = x - y;
                } else if (operator.equals("3")) {
                    result = x * y;
                }
 
                  else if (operator.equals("4") && y != 0) {                     
                    result = x / y;
                } else if (operator.equals("4") && y == 0) {
                    Toast.makeText(MainActivity.this, "����Ϊ����", 0).show();         //���г���ʱ�ж��Ƿ񱻳���Ϊ0��Ϊ0ʱ��ʾ
 
                } else {
  
                    result = x;
                }
                 
                   
                String jieguo = result + "";                                        //��������
                text1.setText(jieguo);
                I = new ArrayList<String>();
                 
                break;
 
               }
 
            }
 
        }
 
    }
 
}