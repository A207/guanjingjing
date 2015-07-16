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
    private double result = 0;   //最终结果
    private static ArrayList<String> I = new ArrayList<String>(); //初始化值
    private static String jia1 = null;  //最初输入的数
    private static String jia2 = null;  //输入符号后的数
    private static String operator = null;    //变量 识别判断加减乘除
    private dengyuListener Listener = new dengyuListener();
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
         * 1.找到控件 2.实例化监听器，并给按钮绑定监听器
         */
 
        // 1.找到控件
 
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
 
        // 2.设置监听器
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
     * 监听器要实现的功能 1，取出EditText里面的第一次值，并把值保存起来 2.取出EditText的里面的第二次值，并保存起来
     * 3.根据运算符号来执行相关运算
     */
 
    class dengyuListener implements OnClickListener {
        public void onClick(View view) {
            text1.setInputType(InputType.TYPE_NULL);
            Button button = (Button) view;
            switch (view.getId()) {
            case R.id.b0: {                                                             //依次输入的数
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
                     
                String name1 = name.subSequence(0, name.length() - 1).toString();//删除上一个字符
                 
                 
                text1.setText(name1);
                break;
            }
 
            case R.id.C: {                           //清除键
                text1.setText("");
                I = new ArrayList<String>();           //初始化变量
                break;
            }
 
            case R.id.jia: {
                jia1 = text1.getText().toString();
                operator = "1";                             //给jia标识为1
                text1.setText("+");
                I = new ArrayList<String>();          //初始化变量
                break;
            }
            case R.id.jian: {
                jia1 = text1.getText().toString();
                operator = "2";                                      //给jia标识为2
                text1.setText("-");
                I = new ArrayList<String>();
                break;
            }
            case R.id.cheng: {
                jia1 = text1.getText().toString();
                operator = "3";                                     //同上
                text1.setText("*");
                break;
            }
            case R.id.chu: {
                jia1 = text1.getText().toString();
                operator = "4";                                 //同上
                text1.setText("/");
                break;
            }
                 
            case R.id.dengyu: {
                String S = text1.getText().toString();
                jia2 = new StringBuffer(S).deleteCharAt(0).toString();          //清楚text1的符号
                x = Double.valueOf(jia1);
                y = Double.valueOf(jia2);   
                //赋值x，y并强制转换jia1，jia2为double形
                  if (operator.equals("1")) {                        //当识别为1，即加法时，执行x，y
                    result = x + y;
                } else if (operator.equals("2")) {
                    result = x - y;
                } else if (operator.equals("3")) {
                    result = x * y;
                }
 
                  else if (operator.equals("4") && y != 0) {                     
                    result = x / y;
                } else if (operator.equals("4") && y == 0) {
                    Toast.makeText(MainActivity.this, "除数为零啦", 0).show();         //运行除法时判断是否被除数为0，为0时提示
 
                } else {
  
                    result = x;
                }
                 
                   
                String jieguo = result + "";                                        //输出最后结果
                text1.setText(jieguo);
                I = new ArrayList<String>();
                 
                break;
 
               }
 
            }
 
        }
 
    }
 
}