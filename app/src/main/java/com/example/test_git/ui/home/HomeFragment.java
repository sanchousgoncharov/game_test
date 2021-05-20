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
                    Toast.makeText(getContext(), "Ваша страна уничтожена!", Toast.LENGTH_LONG).show();
                }else {
                    pb_lifeLevel.setProgress(china.getLifeLevel());
                    tv_lifeLevel.setText("Уровень жизни " + china.getLifeLevel() + "%");
                    pb_ecology.setProgress(china.getEcology());
                    tv_ecology.setText("Уровень экологии " + china.getEcology() + "%");
                    tv_guard.setText("Очков защиты " + china.getGuard());
                    tv_rockets.setText("Ядерных ракет " + china.getNukeRockets());

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
                    Toast.makeText(getContext(), "Ваша страна уничтожена!", Toast.LENGTH_LONG).show();
                }else {
                    pb_lifeLevel.setProgress(britain.getLifeLevel());
                    tv_lifeLevel.setText("Уровень жизни " + britain.getLifeLevel() + "%");
                    pb_ecology.setProgress(britain.getEcology());
                    tv_ecology.setText("Уровень экологии " + britain.getEcology() + "%");
                    tv_guard.setText("Очков защиты " + britain.getGuard());
                    tv_rockets.setText("Ядерных ракет " + britain.getNukeRockets());
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
                    Toast.makeText(getContext(), "Ваша страна уничтожена!", Toast.LENGTH_LONG).show();
                }else {
                    pb_lifeLevel.setProgress(india.getLifeLevel());
                    tv_lifeLevel.setText("Уровень жизни " + india.getLifeLevel() + "%");
                    pb_ecology.setProgress(india.getEcology());
                    tv_ecology.setText("Уровень экологии " + india.getEcology() + "%");
                    tv_guard.setText("Очков защиты " + india.getGuard());
                    tv_rockets.setText("Ядерных ракет " + india.getNukeRockets());
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
                    Toast.makeText(getContext(), "Ваша страна уничтожена!", Toast.LENGTH_LONG).show();
                }else {
                    pb_lifeLevel.setProgress(russia.getLifeLevel());
                    tv_lifeLevel.setText("Уровень жизни " + russia.getLifeLevel() + "%");
                    pb_ecology.setProgress(russia.getEcology());
                    tv_ecology.setText("Уровень экологии " + russia.getEcology() + "%");
                    tv_guard.setText("Очков защиты " + russia.getGuard());
                    tv_rockets.setText("Ядерных ракет " + russia.getNukeRockets());
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
                    Toast.makeText(getContext(), "Ваша страна уничтожена!", Toast.LENGTH_LONG).show();
                }else {
                    pb_lifeLevel.setProgress(germany.getLifeLevel());
                    tv_lifeLevel.setText("Уровень жизни " + germany.getLifeLevel() + "%");
                    pb_ecology.setProgress(germany.getEcology());
                    tv_ecology.setText("Уровень экологии " + germany.getEcology() + "%");
                    tv_guard.setText("Очков защиты " + germany.getGuard());
                    tv_rockets.setText("Ядерных ракет " + germany.getNukeRockets());
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
                    Toast.makeText(getContext(), "Ваша страна уничтожена!", Toast.LENGTH_LONG).show();
                }else {
                    pb_lifeLevel.setProgress(usa.getLifeLevel());
                    tv_lifeLevel.setText("Уровень жизни " + usa.getLifeLevel() + "%");
                    pb_ecology.setProgress(usa.getEcology());
                    tv_ecology.setText("Уровень экологии " + usa.getEcology() + "%");
                    tv_guard.setText("Очков защиты " + usa.getGuard());
                    tv_rockets.setText("Ядерных ракет " + usa.getNukeRockets());
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
                    Toast.makeText(getContext(), "Ваша страна уничтожена!", Toast.LENGTH_LONG).show();
                }else {
                    pb_lifeLevel.setProgress(france.getLifeLevel());
                    tv_lifeLevel.setText("Уровень жизни " + france.getLifeLevel() + "%");
                    pb_ecology.setProgress(france.getEcology());
                    tv_ecology.setText("Уровень экологии " + france.getEcology() + "%");
                    tv_guard.setText("Очков защиты " + france.getGuard());
                    tv_rockets.setText("Ядерных ракет " + france.getNukeRockets());
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
                    Toast.makeText(getContext(), "Ваша страна уничтожена!", Toast.LENGTH_LONG).show();
                }else {
                    pb_lifeLevel.setProgress(kndr.getLifeLevel());
                    tv_lifeLevel.setText("Уровень жизни " + kndr.getLifeLevel() + "%");
                    pb_ecology.setProgress(kndr.getEcology());
                    tv_ecology.setText("Уровень экологии " + kndr.getEcology() + "%");
                    tv_guard.setText("Очков защиты " + kndr.getGuard());
                    tv_rockets.setText("Ядерных ракет " + kndr.getNukeRockets());
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