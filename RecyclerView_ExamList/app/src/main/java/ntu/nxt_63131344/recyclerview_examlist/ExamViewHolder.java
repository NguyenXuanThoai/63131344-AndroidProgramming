package ntu.nxt_63131344.recyclerview_examlist;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ExamViewHolder extends RecyclerView.ViewHolder {
    TextView examMessage;
    TextView examName;
    TextView examDate;
    ExamViewHolder( View itemView) {
        super(itemView);
        examName = (TextView)itemView.findViewById(R.id.examName);
        examDate = (TextView)itemView.findViewById(R.id.examDate);
        examMessage = (TextView)itemView.findViewById(R.id.examMessage);
    }
}