package org.kuro.jlpt.ui;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.kuro.jlpt.R;
import org.kuro.jlpt.adapter.QuestionDetailAdapter;
import org.kuro.jlpt.base.BaseUIActivity;
import org.kuro.jlpt.entity.QuestionDetailRes;
import org.kuro.jlpt.utils.LocalJsonResolution;

import java.util.List;

public class QuestionDetailActivity extends BaseUIActivity {

    private String examId;
    private String paramTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_detail);

        initView();
    }


    private void initView() {
        examId = getIntent().getStringExtra("id");
        paramTitle = getIntent().getStringExtra("title");

        List<QuestionDetailRes> list = fetchQuestionList();
        if (list.size() > 0) {
            RecyclerView recyclerView = findViewById(R.id.questionDetailRecyclerView);
            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            // 给layoutManager 的展示方式设置为竖直方向
            layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(new QuestionDetailAdapter(list.get(0).getList()));
        }
    }


    // 获取题目列表
    private List<QuestionDetailRes> fetchQuestionList() {
        String filename = paramTitle + "/" + examId + ".json";
        String totalJson = LocalJsonResolution.getJson(this, filename);

        return new Gson().fromJson(totalJson, new TypeToken<List<QuestionDetailRes>>() {
        }.getType());
    }
}