package org.kuro.jlpt.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.kuro.jlpt.R;
import org.kuro.jlpt.entity.Question;

import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.ViewHolder> {

    private final List<Question> list;

    public QuestionAdapter(List<Question> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public QuestionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.question_item, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull QuestionAdapter.ViewHolder holder, int position) {
        Question question = list.get(position);
        holder.questionName.setText(question.getName());
        holder.questionCount.setText("题数：" + question.getCount());
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
