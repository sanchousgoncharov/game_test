package com.example.test_git;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import static com.example.test_git.MainActivity.value_of_Countries;

public class Navigator extends AppCompatActivity {
    public static NavController navController;
    public static int countries = value_of_Countries.getSteps();
    public static Country china = new Country("Китай", 1);
    public static Country britain = new Country("Великобритания", 2);
    public static Country india = new Country("Индия", 3);
    public static Country russia = new Country("Россия", 4);
    public static Country germany = new Country("Германия", 5);
    public static Country usa = new Country("США", 6);
    public static Country france = new Country("Франция", 7);
    public static Country kndr = new Country("КНДР", 8);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigator);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);



    }

}