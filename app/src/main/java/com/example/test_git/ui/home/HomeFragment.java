package com.example.test_git.ui.home;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.example.test_git.R;
import com.example.test_git.ResBetweenSteps;

import static com.example.test_git.MainActivity.value_of_Countries;
import static com.example.test_git.Navigator.britain;
import static com.example.test_git.Navigator.china;
import static com.example.test_git.Navigator.countries;
import static com.example.test_git.Navigator.france;
import static com.example.test_git.Navigator.germany;
import static com.example.test_git.Navigator.india;
import static com.example.test_git.Navigator.kndr;
import static com.example.test_git.Navigator.navController;
import static com.example.test_git.Navigator.russia;
import static com.example.test_git.Navigator.usa;
import static com.example.test_git.ui.notifications.NotificationsFragment.spinnerGuardChoose;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    public static ProgressBar pb_lifeLevel;
    public static ProgressBar pb_ecology;
    public static TextView tv_lifeLevel;
    public static TextView tv_ecology;
    public static TextView tv_guard;
    public static TextView tv_rockets;
    public static TextView tv_name;
//    public static boolean[] loseCountry;
    @SuppressLint("SetTextI18n")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        pb_lifeLevel = (ProgressBar) root.findViewById(R.id.lifeLevel);
        pb_ecology = (ProgressBar) root.findViewById(R.id.ecology);
        tv_lifeLevel = (TextView) root.findViewById(R.id.textViewLifeLevel);
        tv_ecology = (TextView) root.findViewById(R.id.textViewEcology);
        tv_guard = (TextView) root.findViewById(R.id.textViewGuard);
        tv_rockets = (TextView) root.findViewById(R.id.textViewRockets);
        tv_name = (TextView) root.findViewById(R.id.textViewName);

//        loseCountry = new boolean[]{china.checkCountry(), britain.checkCountry(), india.checkCountry(), russia.checkCountry(), germany.checkCountry(), usa.checkCountry(), france.checkCountry(), kndr.checkCountry()};

        switch (countries){
            case (1):
                if (china.checkCountry()){
                    pb_lifeLevel.setEnabled(false);
                    tv_lifeLevel.setEnabled(false);
                    pb_ecology.setEnabled(false);
                    tv_ecology.setEnabled(false);
                    tv_guard.setEnabled(false);
                    tv_rockets.setEnabled(false);
                    Toast.makeText(getContext(), "???????? ???????????? ????????????????????!", Toast.LENGTH_LONG).show();
                }else {
                    pb_lifeLevel.setProgress(china.getLifeLevel());
                    tv_lifeLevel.setText("?????????????? ?????????? " + china.getLifeLevel() + "%");
                    pb_ecology.setProgress(china.getEcology());
                    tv_ecology.setText("?????????????? ???????????????? " + china.getEcology() + "%");
                    tv_guard.setText("?????????? ???????????? " + china.getGuard());
                    tv_rockets.setText("?????????????? ?????????? " + china.getNukeRockets());

                }
                tv_name.setText(china.getName());
                break;
            case (2):
                if (britain.checkCountry()){
                    pb_lifeLevel.setEnabled(false);
                    tv_lifeLevel.setEnabled(false);
                    pb_ecology.setEnabled(false);
                    tv_ecology.setEnabled(false);
                    tv_guard.setEnabled(false);
                    tv_rockets.setEnabled(false);
                    Toast.makeText(getContext(), "???????? ???????????? ????????????????????!", Toast.LENGTH_LONG).show();
                }else {
                    pb_lifeLevel.setProgress(britain.getLifeLevel());
                    tv_lifeLevel.setText("?????????????? ?????????? " + britain.getLifeLevel() + "%");
                    pb_ecology.setProgress(britain.getEcology());
                    tv_ecology.setText("?????????????? ???????????????? " + britain.getEcology() + "%");
                    tv_guard.setText("?????????? ???????????? " + britain.getGuard());
                    tv_rockets.setText("?????????????? ?????????? " + britain.getNukeRockets());
                }
                tv_name.setText(britain.getName());

                break;
            case (3):
                if (india.checkCountry()){
                    pb_lifeLevel.setEnabled(false);
                    tv_lifeLevel.setEnabled(false);
                    pb_ecology.setEnabled(false);
                    tv_ecology.setEnabled(false);
                    tv_guard.setEnabled(false);
                    tv_rockets.setEnabled(false);
                    Toast.makeText(getContext(), "???????? ???????????? ????????????????????!", Toast.LENGTH_LONG).show();
                }else {
                    pb_lifeLevel.setProgress(india.getLifeLevel());
                    tv_lifeLevel.setText("?????????????? ?????????? " + india.getLifeLevel() + "%");
                    pb_ecology.setProgress(india.getEcology());
                    tv_ecology.setText("?????????????? ???????????????? " + india.getEcology() + "%");
                    tv_guard.setText("?????????? ???????????? " + india.getGuard());
                    tv_rockets.setText("?????????????? ?????????? " + india.getNukeRockets());
                }
                tv_name.setText(india.getName());

                break;
            case (4):
                if (russia.checkCountry()){
                    pb_lifeLevel.setEnabled(false);
                    tv_lifeLevel.setEnabled(false);
                    pb_ecology.setEnabled(false);
                    tv_ecology.setEnabled(false);
                    tv_guard.setEnabled(false);
                    tv_rockets.setEnabled(false);
                    Toast.makeText(getContext(), "???????? ???????????? ????????????????????!", Toast.LENGTH_LONG).show();
                }else {
                    pb_lifeLevel.setProgress(russia.getLifeLevel());
                    tv_lifeLevel.setText("?????????????? ?????????? " + russia.getLifeLevel() + "%");
                    pb_ecology.setProgress(russia.getEcology());
                    tv_ecology.setText("?????????????? ???????????????? " + russia.getEcology() + "%");
                    tv_guard.setText("?????????? ???????????? " + russia.getGuard());
                    tv_rockets.setText("?????????????? ?????????? " + russia.getNukeRockets());
                }
                tv_name.setText(russia.getName());

                break;
            case (5):
                if (germany.checkCountry()){
                    pb_lifeLevel.setEnabled(false);
                    tv_lifeLevel.setEnabled(false);
                    pb_ecology.setEnabled(false);
                    tv_ecology.setEnabled(false);
                    tv_guard.setEnabled(false);
                    tv_rockets.setEnabled(false);
                    Toast.makeText(getContext(), "???????? ???????????? ????????????????????!", Toast.LENGTH_LONG).show();
                }else {
                    pb_lifeLevel.setProgress(germany.getLifeLevel());
                    tv_lifeLevel.setText("?????????????? ?????????? " + germany.getLifeLevel() + "%");
                    pb_ecology.setProgress(germany.getEcology());
                    tv_ecology.setText("?????????????? ???????????????? " + germany.getEcology() + "%");
                    tv_guard.setText("?????????? ???????????? " + germany.getGuard());
                    tv_rockets.setText("?????????????? ?????????? " + germany.getNukeRockets());
                }
                tv_name.setText(germany.getName());
                break;
            case (6):
                if (usa.checkCountry()){
                    pb_lifeLevel.setEnabled(false);
                    tv_lifeLevel.setEnabled(false);
                    pb_ecology.setEnabled(false);
                    tv_ecology.setEnabled(false);
                    tv_guard.setEnabled(false);
                    tv_rockets.setEnabled(false);
                    Toast.makeText(getContext(), "???????? ???????????? ????????????????????!", Toast.LENGTH_LONG).show();
                }else {
                    pb_lifeLevel.setProgress(usa.getLifeLevel());
                    tv_lifeLevel.setText("?????????????? ?????????? " + usa.getLifeLevel() + "%");
                    pb_ecology.setProgress(usa.getEcology());
                    tv_ecology.setText("?????????????? ???????????????? " + usa.getEcology() + "%");
                    tv_guard.setText("?????????? ???????????? " + usa.getGuard());
                    tv_rockets.setText("?????????????? ?????????? " + usa.getNukeRockets());
                }
                tv_name.setText(usa.getName());
                break;
            case (7):
                if (france.checkCountry()){
                    pb_lifeLevel.setEnabled(false);
                    tv_lifeLevel.setEnabled(false);
                    pb_ecology.setEnabled(false);
                    tv_ecology.setEnabled(false);
                    tv_guard.setEnabled(false);
                    tv_rockets.setEnabled(false);
                    Toast.makeText(getContext(), "???????? ???????????? ????????????????????!", Toast.LENGTH_LONG).show();
                }else {
                    pb_lifeLevel.setProgress(france.getLifeLevel());
                    tv_lifeLevel.setText("?????????????? ?????????? " + france.getLifeLevel() + "%");
                    pb_ecology.setProgress(france.getEcology());
                    tv_ecology.setText("?????????????? ???????????????? " + france.getEcology() + "%");
                    tv_guard.setText("?????????? ???????????? " + france.getGuard());
                    tv_rockets.setText("?????????????? ?????????? " + france.getNukeRockets());
                }
                tv_name.setText(france.getName());
                break;
            case (8):
                if (kndr.checkCountry()){
                    pb_lifeLevel.setEnabled(false);
                    tv_lifeLevel.setEnabled(false);
                    pb_ecology.setEnabled(false);
                    tv_ecology.setEnabled(false);
                    tv_guard.setEnabled(false);
                    tv_rockets.setEnabled(false);
                    Toast.makeText(getContext(), "???????? ???????????? ????????????????????!", Toast.LENGTH_LONG).show();
                }else {
                    pb_lifeLevel.setProgress(kndr.getLifeLevel());
                    tv_lifeLevel.setText("?????????????? ?????????? " + kndr.getLifeLevel() + "%");
                    pb_ecology.setProgress(kndr.getEcology());
                    tv_ecology.setText("?????????????? ???????????????? " + kndr.getEcology() + "%");
                    tv_guard.setText("?????????? ???????????? " + kndr.getGuard());
                    tv_rockets.setText("?????????????? ?????????? " + kndr.getNukeRockets());
                }
                tv_name.setText(kndr.getName());
                break;

        }

        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}