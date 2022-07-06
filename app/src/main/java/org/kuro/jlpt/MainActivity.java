package org.kuro.jlpt;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.kuro.jlpt.base.BaseUIActivity;

public class MainActivity extends BaseUIActivity {

    private LinearLayout n1Row;
    private LinearLayout n2Row;
    private LinearLayout n3Row;
    private LinearLayout n4Row;
    private LinearLayout n5Row;

    private TextView n1RowCount;
    private TextView n2RowCount;
    private TextView n3RowCount;
    private TextView n4RowCount;
    private TextView n5RowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }


    @SuppressLint("SetTextI18n")
    private void initView() {
        n1Row = findViewById(R.id.n1_row);
        n2Row = findViewById(R.id.n2_row);
        n3Row = findViewById(R.id.n3_row);
        n4Row = findViewById(R.id.n4_row);
        n5Row = findViewById(R.id.n5_row);

        n1RowCount = findViewById(R.id.n1_row_count);
        n2RowCount = findViewById(R.id.n2_row_count);
        n3RowCount = findViewById(R.id.n3_row_count);
        n4RowCount = findViewById(R.id.n4_row_count);
        n5RowCount = findViewById(R.id.n5_row_count);

        n1RowCount.setText("真题：" + 0);
        n2RowCount.setText("真题：" + 0);
        n3RowCount.setText("真题：" + 0);
        n4RowCount.setText("真题：" + 0);
        n5RowCount.setText("真题：" + 0);
    }
}