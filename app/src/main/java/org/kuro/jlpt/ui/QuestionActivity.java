package org.kuro.jlpt.ui;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.kuro.jlpt.R;
import org.kuro.jlpt.adapter.QuestionAdapter;
import org.kuro.jlpt.base.BaseBackActivity;
import org.kuro.jlpt.entity.Question;
import org.kuro.jlpt.utils.LocalJsonResolution;

import java.util.List;

public class QuestionActivity extends BaseBackActivity {

    private String paramTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        initView();
    }


    private void initView() {
        paramTitle = getIntent().getStringExtra("title");
        setTitle(paramTitle + "真题");

        List<Question> list = fetchQuestionList();
        if (list.size() > 0) {
            RecyclerView recyclerView = findViewById(R.id.questionRecyclerView);

            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            // 给layoutManager 的展示方式设置为竖直方向
            layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(new QuestionAdapter(list));
        }

    }


    // 获取真题列表
    private List<Question> fetchQuestionList() {
        String filename = paramTitle + "/total.json";
        String totalJson = LocalJsonResolution.getJson(this, filename);

        return new Gson().fromJson(totalJson, new TypeToken<List<Question>>() {
        }.getType());
    }
}