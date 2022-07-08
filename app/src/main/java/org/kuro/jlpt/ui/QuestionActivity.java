package org.kuro.jlpt.ui;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.kuro.jlpt.R;
import org.kuro.jlpt.adapter.QuestionAdapter;
import org.kuro.jlpt.base.BaseBackActivity;
import org.kuro.jlpt.entity.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionActivity extends BaseBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        RecyclerView recyclerView = findViewById(R.id.questionRecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        // 给layoutManager 的展示方式设置为竖直方向
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        List<Question> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String name = "201" + i + "年7月 N1真题";
            Question question = new Question(name, 103);
            list.add(question);
        }
        recyclerView.setAdapter(new QuestionAdapter(list));
    }
}