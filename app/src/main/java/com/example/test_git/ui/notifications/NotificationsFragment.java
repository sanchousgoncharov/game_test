package com.example.test_git.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.test_git.Country;
import com.example.test_git.MainActivity;
import com.example.test_git.Navigator;
import com.example.test_git.R;
import com.example.test_git.ResBetweenSteps;

import java.util.Arrays;

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
    private final String[] guardChooseList = { "Не тратить", "Уровень жизни", "Уровень экологии" };
    private final String[] ListOfCountries = { "Не запускать", china.getName(), britain.getName(),india.getName(), russia.getName(),germany.getName(),usa.getName(), france.getName(), kndr.getName() };
    private final String[] fightListOfCountries = Arrays.copyOf(ListOfCountries, value_of_Countries.getSteps()+1);
    public static Spinner spinnerGuardChoose;
    public static Spinner spinnerFight;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel = new ViewModelProvider(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this.getActivity(), android.R.layout.simple_spinner_item, guardChooseList); // адаптер
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerGuardChoose = (Spinner) root.findViewById(R.id.guardPointChoose);
        spinnerGuardChoose.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this.getActivity(), android.R.layout.simple_spinner_item, fightListOfCountries); // адаптер
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFight = (Spinner) root.findViewById(R.id.fightChoose);
        spinnerFight.setAdapter(adapter2);
        switch (countries){
            case (1): //китай
                china.checkSpinnerValues(china);
                break;
            case (2): //британия
                britain.checkSpinnerValues(britain);
                break;
            case (3): //индия
                india.checkSpinnerValues(india);
                break;
            case (4): //россия
                russia.checkSpinnerValues(russia);
                break;
            case (5): //германия
                germany.checkSpinnerValues(germany);
                break;
            case (6): //сша
                usa.checkSpinnerValues(usa);
                break;
            case (7): //франция
                france.checkSpinnerValues(france);
                break;
            case (8): //кндр
                kndr.checkSpinnerValues(kndr);
                break;
        }
        final Button decree = (Button) root.findViewById(R.id.decree);
        decree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                switch (countries){
                    case (1): //китай
                        Intent intent = new Intent(getContext(), ResBetweenSteps.class);
                        intent.putExtra("china", china.getLifeLevel());

                        startActivity(intent);
                        countries = value_of_Countries.getSteps();
                        china.oneStep();
                        britain.oneStep();
                        india.oneStep();
                        russia.oneStep();
                        germany.oneStep();
                        usa.oneStep();
                        france.oneStep();
                        kndr.oneStep();

                        china.itemSelected(china);
                        china.rocketHit();
                        break;
                    case (2): //британия
                        britain.itemSelected(britain);
                        britain.rocketHit();
                        countries--;
                        navController.navigate(R.id.navigation_home);
                        break;
                    case (3): //индия
                        india.itemSelected(india);
                        india.rocketHit();
                        countries--;
                        navController.navigate(R.id.navigation_home);
                        break;
                    case (4): //россия
                        russia.itemSelected(russia);
                        russia.rocketHit();
                        countries--;
                        navController.navigate(R.id.navigation_home);
                        break;
                    case (5): //германия
                        germany.itemSelected(germany);
                        germany.rocketHit();
                        countries--;
                        navController.navigate(R.id.navigation_home);
                        break;
                    case (6): //сша
                        usa.itemSelected(usa);
                        usa.rocketHit();
                        countries--;
                        navController.navigate(R.id.navigation_home);
                        break;
                    case (7): //франция
                        france.itemSelected(france);
                        france.rocketHit();
                        countries--;
                        navController.navigate(R.id.navigation_home);
                        break;
                    case (8): //кндр
                        kndr.itemSelected(kndr);
                        kndr.rocketHit();
                        countries--;
                        navController.navigate(R.id.navigation_home);
                        break;
                }
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