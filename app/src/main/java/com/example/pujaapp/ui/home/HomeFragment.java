package com.example.pujaapp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.pujaapp.VidOpActivty;
import com.example.pujaapp.VideoActivity;
import com.example.pujaapp.ui.courses.CourseActivity;
import com.example.pujaapp.R;
import com.example.pujaapp.ui.source.SourceActivity;
import com.example.pujaapp.ui.web.WebViewActivity;
import com.example.pujaapp.utils.Constants;

import javax.xml.transform.Source;

public class HomeFragment extends Fragment {

    LinearLayout layoutCourse,layoutSubject,layoutGoal;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.frag_home, container, false);
        layoutCourse = root.findViewById(R.id.layoutCourse);
        layoutSubject = root.findViewById(R.id.layoutSubject);
        layoutGoal = root.findViewById(R.id.layoutGoal);
        layoutGoal.setOnClickListener(v->{
            Intent intent = new Intent(getContext(), SourceActivity.class);
            startActivity(intent);
        });
        layoutCourse.setOnClickListener(v->{
            Intent intent = new Intent(getContext(), CourseActivity.class);
            startActivity(intent);
        });

        layoutSubject.setOnClickListener(v->{
            Intent intent = new Intent(getContext(), VidOpActivty.class);
            startActivity(intent);
        });

        return root;
    }
}
