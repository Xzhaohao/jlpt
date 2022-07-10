package org.kuro.jlpt.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.kuro.jlpt.R;
import org.kuro.jlpt.entity.Question;
import org.kuro.jlpt.ui.QuestionDetailActivity;

import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.ViewHolder> {

    private final List<Question> list;
    private final Context context;
    private final String title;

    public QuestionAdapter(List<Question> list, Context context, String title) {
        this.list = list;
        this.context = context;
        this.title = title;
    }

    @NonNull
    @Override
    public QuestionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.question_card, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull QuestionAdapter.ViewHolder holder, int position) {
        Question question = list.get(position);
        holder.questionName.setText(question.getName());
        holder.questionCount.setText("题数：" + question.getCount());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, QuestionDetailActivity.class);
            intent.putExtra("id", question.getId().toString());
            intent.putExtra("title", title);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView questionName;
        TextView questionCount;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            questionName = itemView.findViewById(R.id.question_name);
            questionCount = itemView.findViewById(R.id.question_count);
        }
    }
}
