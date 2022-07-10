package org.kuro.jlpt.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.kuro.jlpt.R;
import org.kuro.jlpt.entity.QuestionDetail;

import java.util.List;

public class QuestionDetailAdapter extends RecyclerView.Adapter<QuestionDetailAdapter.ViewHolder> {

    private final List<QuestionDetail> list;

    public QuestionDetailAdapter(List<QuestionDetail> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.question_item, parent, false);
        return new QuestionDetailAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        QuestionDetail question = list.get(position);
        holder.questionName.setText(question.getQuestion());
        holder.answerOptionA.setText(question.getAnswerA());
        holder.answerOptionB.setText(question.getAnswerB());
        holder.answerOptionC.setText(question.getAnswerC());
        holder.answerOptionD.setText(question.getAnswerD());
        holder.rightAnswer.setText(question.getRight());
        holder.analyze.setText(question.getAnalyze());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView questionName;
        RadioGroup answerGroup;
        RadioButton answerOptionA;
        RadioButton answerOptionB;
        RadioButton answerOptionC;
        RadioButton answerOptionD;
        TextView rightAnswer;
        TextView analyze;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            questionName = itemView.findViewById(R.id.question_name);
            answerGroup = itemView.findViewById(R.id.answer_group);
            answerOptionA = itemView.findViewById(R.id.answer_option_A);
            answerOptionB = itemView.findViewById(R.id.answer_option_B);
            answerOptionC = itemView.findViewById(R.id.answer_option_C);
            answerOptionD = itemView.findViewById(R.id.answer_option_D);
            rightAnswer = itemView.findViewById(R.id.right_answer);
            analyze = itemView.findViewById(R.id.analyze);
        }
    }
}
