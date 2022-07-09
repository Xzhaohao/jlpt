package org.kuro.jlpt;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.kuro.jlpt.base.BaseUIActivity;
import org.kuro.jlpt.entity.QuestionCount;
import org.kuro.jlpt.ui.QuestionActivity;
import org.kuro.jlpt.utils.JsonUtil;
import org.kuro.jlpt.utils.LocalJsonResolution;

public class MainActivity extends BaseUIActivity {

    private RelativeLayout n1Row;
    private RelativeLayout n2Row;
    private RelativeLayout n3Row;
    private RelativeLayout n4Row;
    private RelativeLayout n5Row;

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
        initData();
    }


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

        n1Row.setOnClickListener(view -> goQuestionPage("N1"));
        n2Row.setOnClickListener(view -> goQuestionPage("N2"));
        n3Row.setOnClickListener(view -> goQuestionPage("N3"));
        n4Row.setOnClickListener(view -> goQuestionPage("N4"));
        n5Row.setOnClickListener(view -> goQuestionPage("N5"));
    }


    @SuppressLint("SetTextI18n")
    private void initData() {
        String exam = LocalJsonResolution.getJson(this, "exam.json");
        QuestionCount count = JsonUtil.JsonToPojo(exam, QuestionCount.class);
        n1RowCount.setText("真题：" + count.getN1Count());
        n2RowCount.setText("真题：" + count.getN2Count());
        n3RowCount.setText("真题：" + count.getN3Count());
        n4RowCount.setText("真题：" + count.getN4Count());
        n5RowCount.setText("真题：" + count.getN5Count());
    }


    private void goQuestionPage(String title) {
        Intent intent = new Intent(this, QuestionActivity.class);
        intent.putExtra("title", title);
        startActivity(intent);
    }
}