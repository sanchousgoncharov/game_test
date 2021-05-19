package com.example.test_git.ui.dashboard;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.test_git.Country;
import com.example.test_git.R;
import com.example.test_git.Stat;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    public static TextView tv1;
    public static ProgressBar pb1;
    public static TextView tv2;
    public static ProgressBar pb2;
    public static TextView tv3;
    public static ProgressBar pb3;
    public static TextView tv4;
    public static ProgressBar pb4;
    public static TextView tv5;
    public static ProgressBar pb5;
    public static TextView tv6;
    public static ProgressBar pb6;
    public static TextView tv7;
    public static ProgressBar pb7;
    public static TextView tv8;
    public static ProgressBar pb8;
    private Stat statView = new Stat();

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        tv1 = (TextView) root.findViewById(R.id.tv1);
        pb1 = (ProgressBar) root.findViewById(R.id.pb1);
        tv2 = (TextView) root.findViewById(R.id.tv2);
        pb2 = (ProgressBar) root.findViewById(R.id.pb2);
        tv3 = (TextView) root.findViewById(R.id.tv3);
        pb3 = (ProgressBar) root.findViewById(R.id.pb3);
        tv4 = (TextView) root.findViewById(R.id.tv4);
        pb4 = (ProgressBar) root.findViewById(R.id.pb4);
        tv5 = (TextView) root.findViewById(R.id.tv5);
        pb5 = (ProgressBar) root.findViewById(R.id.pb5);
        tv6 = (TextView) root.findViewById(R.id.tv6);
        pb6 = (ProgressBar) root.findViewById(R.id.pb6);
        tv7 = (TextView) root.findViewById(R.id.tv7);
        pb7 = (ProgressBar) root.findViewById(R.id.pb7);
        tv8 = (TextView) root.findViewById(R.id.tv8);
        pb8 = (ProgressBar) root.findViewById(R.id.pb8);
        statView.statView();

        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}