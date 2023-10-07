package com.example.lab2;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // установка файла second_layout.xml в качестве интерфейса
        //setContentView(R.layout.second_layout);
        super.onCreate(savedInstanceState);
        // получаем элемент TextView
        //TextView textView = findViewById(R.id.header);
        //устанавливаем новое значение для этого айди
        //textView.setText("5238975138907123");
        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        TextView textView = new TextView(this);
        textView.setText("8356904-2345");
        textView.setTextSize(60);
        // устанавливаем параметры размеров и расположение элемента
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        // эквивалент app:layout_constraintLeft_toLeftOf="parent"
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        // эквивалент app:layoutParams.topToTop="parent"
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        // устанавливаем параметры для textView
        textView.setLayoutParams(layoutParams);
        // добавляем TextView в ConstraintLayout
        constraintLayout.addView(textView);

        setContentView(constraintLayout);
        /* перевод из 1 единицы , например dp в другую, например Px (Установка размера)
        int valueInDp = 6700;
        int valueInPx = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_PX, valueInDp, getResources(). getDisplayMetrics()); */
    }
}