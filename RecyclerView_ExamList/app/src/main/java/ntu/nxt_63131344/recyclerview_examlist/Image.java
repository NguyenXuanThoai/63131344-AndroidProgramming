package ntu.nxt_63131344.recyclerview_examlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class Image extends RecyclerView.Adapter<ExamViewHolder> {
    List<ExamData> list;
    Context context;
    public Image(List<ExamData> list, Context context) {
        this.list = list;
        this.context = context;
    }
    @Override
    public ExamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context
                = parent.getContext();
        LayoutInflater inflater
                = LayoutInflater.from(context);
        View photoView
                = inflater
                .inflate(R.layout.exam_card,
                        parent, false);

        ExamViewHolder viewHolder = new ExamViewHolder(photoView);
        return viewHolder;
    }
    @Override
    public void
    onBindViewHolder(final ExamViewHolder viewHolder, final int position) {
        viewHolder.examName
                .setText(list.get(position).getName());
        viewHolder.examDate
                .setText(list.get(position).getDate());
        viewHolder.examMessage
                .setText(list.get(position).getMassage());
    }
    @Override
    public int getItemCount(){
        return list.size();
    }

}