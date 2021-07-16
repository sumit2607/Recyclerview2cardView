package com.sumit.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder>{
    List<CourseModel> course_List;


    public CourseAdapter(List<CourseModel> courselist) {
        course_List =courselist;

    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent , false);
        CourseViewHolder  courseViewHolder = new CourseViewHolder(view);
        return courseViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull CourseAdapter.CourseViewHolder holder, int position) {
     holder.courseImg.setImageResource(course_List.get(position).imageid);
     holder.cursename.setText(course_List.get(position).name);
        holder.cursedesc.setText(course_List.get(position).Desc);
    }

    @Override
    public int getItemCount() {
        return course_List.size();
    }

    public class CourseViewHolder extends RecyclerView.ViewHolder {
        TextView cursename , cursedesc;
        ImageView courseImg;
        public CourseViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            cursename = itemView.findViewById(R.id.cursename);
            cursedesc = itemView.findViewById(R.id.cursedesc);
            courseImg = itemView.findViewById(R.id.courseImg);

        }
    }
}
