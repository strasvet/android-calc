package pro.sosnovsky.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;

    private Button one, two, three, four, five, six, seven, eight, nine, multiply, divide, plus, minus, reset, res;
    private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textView = findViewById(R.id.result);

        one = findViewById(R.id.one);
        one.setOnClickListener(this);
        list.add("one");
        two = findViewById(R.id.two);
        two.setOnClickListener(this);
        list.add("two");
        three = findViewById(R.id.three);
        three.setOnClickListener(this);
        list.add("three");
        four = findViewById(R.id.four);
        four.setOnClickListener(this);
        list.add("four");
        five = findViewById(R.id.five);
        five.setOnClickListener(this);
        list.add("five");
        six = findViewById(R.id.six);
        six.setOnClickListener(this);
        list.add("six");
        seven = findViewById(R.id.seven);
        seven.setOnClickListener(this);
        list.add("seven");
        eight = findViewById(R.id.eight);
        eight.setOnClickListener(this);
        list.add("eight");
        nine = findViewById(R.id.nine);
        nine.setOnClickListener(this);
        list.add("nine");
        multiply = findViewById(R.id.multiply);
        multiply.setOnClickListener(this);
        list.add("multiply");
        divide = findViewById(R.id.divide);
        divide.setOnClickListener(this);
        list.add("divide");
        plus = findViewById(R.id.plus);
        plus.setOnClickListener(this);
        list.add("plus");
        minus = findViewById(R.id.minus);
        minus.setOnClickListener(this);
        list.add("minus");
        reset = findViewById(R.id.reset);
        reset.setOnClickListener(this);
        list.add("reset");
        res = findViewById(R.id.res);
        res.setOnClickListener(this);
        list.add("res");
    }

    @Override
    public void onClick(View v) {
        if (list.contains(v.getId())){
            textView.setText("Was clicked button:" + String.valueOf(v.getId()));
        }
    }
}
