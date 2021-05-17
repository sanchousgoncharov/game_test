package com.example.test_git.ui.notifications;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.test_git.MainActivity;
import com.example.test_git.Navigator;
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

public class NotificationsFragment extends Fragment {
    private Fragment fragment = null;
    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        final Button decree = (Button) root.findViewById(R.id.decree);
        decree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                switch (countries){
                    case (1):

                        Intent intent = new Intent(getContext(), ResBetweenSteps.class);
                        startActivity(intent);
                        countries = value_of_Countries.getSteps();
                        china.oneStepEcology();
                        china.oneStepLifeLevel();
                        britain.oneStepLifeLevel();
                        britain.oneStepEcology();
                        india.oneStepLifeLevel();
                        india.oneStepEcology();
                        russia.oneStepLifeLevel();
                        russia.oneStepEcology();
                        germany.oneStepLifeLevel();
                        germany.oneStepEcology();
                        usa.oneStepLifeLevel();
                        usa.oneStepEcology();
                        france.oneStepLifeLevel();
                        france.oneStepEcology();
                        kndr.oneStepLifeLevel();
                        kndr.oneStepEcology();
                        break;
                    case (2):
                        countries--;
                        navController.navigate(R.id.navigation_home);
                        break;
                    case (3):
                        countries--;
                        navController.navigate(R.id.navigation_home);
                        break;
                    case (4):
                        countries--;
                        navController.navigate(R.id.navigation_home);
                        break;
                    case (5):
                        countries--;
                        navController.navigate(R.id.navigation_home);
                        break;
                    case (6):
                        countries--;
                        navController.navigate(R.id.navigation_home);
                        break;
                    case (7):
                        countries--;
                        navController.navigate(R.id.navigation_home);
                        break;
                    case (8):
                        countries--;
                        navController.navigate(R.id.navigation_home);
                        break;

                }
                navController.navigate(R.id.navigation_home);
            }
        });

        notificationsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}