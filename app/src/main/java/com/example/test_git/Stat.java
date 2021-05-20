package com.example.test_git;

import android.view.View;

import static android.view.View.VISIBLE;
import static com.example.test_git.MainActivity.value_of_Countries;
import static com.example.test_git.Navigator.britain;
import static com.example.test_git.Navigator.china;
import static com.example.test_git.Navigator.france;
import static com.example.test_git.Navigator.germany;
import static com.example.test_git.Navigator.india;
import static com.example.test_git.Navigator.kndr;
import static com.example.test_git.Navigator.russia;
import static com.example.test_git.Navigator.usa;
import static com.example.test_git.ResBetweenSteps.pb_1;
import static com.example.test_git.ResBetweenSteps.pb_2;
import static com.example.test_git.ResBetweenSteps.pb_3;
import static com.example.test_git.ResBetweenSteps.pb_4;
import static com.example.test_git.ResBetweenSteps.pb_5;
import static com.example.test_git.ResBetweenSteps.pb_6;
import static com.example.test_git.ResBetweenSteps.pb_7;
import static com.example.test_git.ResBetweenSteps.pb_8;
import static com.example.test_git.ResBetweenSteps.tv_1;
import static com.example.test_git.ResBetweenSteps.tv_2;
import static com.example.test_git.ResBetweenSteps.tv_3;
import static com.example.test_git.ResBetweenSteps.tv_4;
import static com.example.test_git.ResBetweenSteps.tv_5;
import static com.example.test_git.ResBetweenSteps.tv_6;
import static com.example.test_git.ResBetweenSteps.tv_7;
import static com.example.test_git.ResBetweenSteps.tv_8;
import static com.example.test_git.ui.dashboard.DashboardFragment.pb1;
import static com.example.test_git.ui.dashboard.DashboardFragment.pb2;
import static com.example.test_git.ui.dashboard.DashboardFragment.pb3;
import static com.example.test_git.ui.dashboard.DashboardFragment.pb4;
import static com.example.test_git.ui.dashboard.DashboardFragment.pb5;
import static com.example.test_git.ui.dashboard.DashboardFragment.pb6;
import static com.example.test_git.ui.dashboard.DashboardFragment.pb7;
import static com.example.test_git.ui.dashboard.DashboardFragment.pb8;
import static com.example.test_git.ui.dashboard.DashboardFragment.tv1;
import static com.example.test_git.ui.dashboard.DashboardFragment.tv2;
import static com.example.test_git.ui.dashboard.DashboardFragment.tv3;
import static com.example.test_git.ui.dashboard.DashboardFragment.tv4;
import static com.example.test_git.ui.dashboard.DashboardFragment.tv5;
import static com.example.test_git.ui.dashboard.DashboardFragment.tv6;
import static com.example.test_git.ui.dashboard.DashboardFragment.tv7;
import static com.example.test_git.ui.dashboard.DashboardFragment.tv8;

public class Stat {

//    public void statView(){ //показ статы
//        tv8.setEnabled(false);
//        pb8.setEnabled(false);
//        tv7.setEnabled(false);
//        pb7.setEnabled(false);
//        tv6.setEnabled(false);
//        pb6.setEnabled(false);
//        tv5.setEnabled(false);
//        pb5.setEnabled(false);
//        tv4.setEnabled(false);
//        pb4.setEnabled(false);
//        tv3.setEnabled(false);
//        pb3.setEnabled(false);
//        tv2.setVisibility(View.INVISIBLE);
//        pb2.setEnabled(false);
//        tv1.setEnabled(false);
//        pb1.setEnabled(false);
//        switch (value_of_Countries.getSteps()) {
//            case (8)://kndr
//                tv8.setEnabled(true);
//                pb8.setEnabled(true);
//                tv7.setEnabled(true);
//                pb7.setEnabled(true);
//                tv6.setEnabled(true);
//                pb6.setEnabled(true);
//                tv5.setEnabled(true);
//                pb5.setEnabled(true);
//                tv4.setEnabled(true);
//                pb4.setEnabled(true);
//                tv3.setEnabled(true);
//                pb3.setEnabled(true);
//                tv2.setEnabled(true);
//                pb2.setEnabled(true);
//                tv1.setEnabled(true);
//                pb1.setEnabled(true);
//                break;
//            case (7)://france
//                tv7.setEnabled(true);
//                pb7.setEnabled(true);
//                tv6.setEnabled(true);
//                pb6.setEnabled(true);
//                tv5.setEnabled(true);
//                pb5.setEnabled(true);
//                tv4.setEnabled(true);
//                pb4.setEnabled(true);
//                tv3.setEnabled(true);
//                pb3.setEnabled(true);
//                tv2.setEnabled(true);
//                pb2.setEnabled(true);
//                tv1.setEnabled(true);
//                pb1.setEnabled(true);
//                break;
//            case (6)://usa
//                tv6.setEnabled(true);
//                pb6.setEnabled(true);
//                tv5.setEnabled(true);
//                pb5.setEnabled(true);
//                tv4.setEnabled(true);
//                pb4.setEnabled(true);
//                tv3.setEnabled(true);
//                pb3.setEnabled(true);
//                tv2.setEnabled(true);
//                pb2.setEnabled(true);
//                tv1.setEnabled(true);
//                pb1.setEnabled(true);
//                break;
//            case (5)://germany
//                tv5.setEnabled(true);
//                pb5.setEnabled(true);
//                tv4.setEnabled(true);
//                pb4.setEnabled(true);
//                tv3.setEnabled(true);
//                pb3.setEnabled(true);
//                tv2.setEnabled(true);
//                pb2.setEnabled(true);
//                tv1.setEnabled(true);
//                pb1.setEnabled(true);
//                break;
//            case (4)://russia
//                tv4.setEnabled(true);
//                pb4.setEnabled(true);
//                tv3.setEnabled(true);
//                pb3.setEnabled(true);
//                tv2.setEnabled(true);
//                pb2.setEnabled(true);
//                tv1.setEnabled(true);
//                pb1.setEnabled(true);
//                break;
//            case (3)://india
//                tv3.setEnabled(true);
//                pb3.setEnabled(true);
//                tv2.setEnabled(true);
//                pb2.setEnabled(true);
//                tv1.setEnabled(true);
//                pb1.setEnabled(true);
//                break;
//            case (2)://britain
//                tv2.setEnabled(true);
//                pb2.setEnabled(true);
//                tv1.setEnabled(true);
//                pb1.setEnabled(true);
//                break;
//        }
//
//    }

    public void statViewDashboard(){ //показ статы
        tv8.setVisibility(View.INVISIBLE);
        pb8.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.INVISIBLE);
        pb7.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        pb6.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        pb5.setVisibility(View.INVISIBLE);
        tv4.setVisibility(View.INVISIBLE);
        pb4.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        pb3.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        pb2.setVisibility(View.INVISIBLE);
        tv1.setVisibility(View.INVISIBLE);
        pb1.setVisibility(View.INVISIBLE);
        switch (value_of_Countries.getSteps()) {
            case (8)://kndr
                tv8.setVisibility(VISIBLE);
                pb8.setVisibility(VISIBLE);
                tv7.setVisibility(VISIBLE);
                pb7.setVisibility(VISIBLE);
                tv6.setVisibility(VISIBLE);
                pb6.setVisibility(VISIBLE);
                tv5.setVisibility(VISIBLE);
                pb5.setVisibility(VISIBLE);
                tv4.setVisibility(VISIBLE);
                pb4.setVisibility(VISIBLE);
                tv3.setVisibility(VISIBLE);
                pb3.setVisibility(VISIBLE);
                tv2.setVisibility(VISIBLE);
                pb2.setVisibility(VISIBLE);
                tv1.setVisibility(VISIBLE);
                pb1.setVisibility(VISIBLE);
                break;
            case (7)://france
                tv7.setVisibility(VISIBLE);
                pb7.setVisibility(VISIBLE);
                tv6.setVisibility(VISIBLE);
                pb6.setVisibility(VISIBLE);
                tv5.setVisibility(VISIBLE);
                pb5.setVisibility(VISIBLE);
                tv4.setVisibility(VISIBLE);
                pb4.setVisibility(VISIBLE);
                tv3.setVisibility(VISIBLE);
                pb3.setVisibility(VISIBLE);
                tv2.setVisibility(VISIBLE);
                pb2.setVisibility(VISIBLE);
                tv1.setVisibility(VISIBLE);
                pb1.setVisibility(VISIBLE);
                break;
            case (6)://usa
                tv6.setVisibility(VISIBLE);
                pb6.setVisibility(VISIBLE);
                tv5.setVisibility(VISIBLE);
                pb5.setVisibility(VISIBLE);
                tv4.setVisibility(VISIBLE);
                pb4.setVisibility(VISIBLE);
                tv3.setVisibility(VISIBLE);
                pb3.setVisibility(VISIBLE);
                tv2.setVisibility(VISIBLE);
                pb2.setVisibility(VISIBLE);
                tv1.setVisibility(VISIBLE);
                pb1.setVisibility(VISIBLE);
                break;
            case (5)://germany
                tv5.setVisibility(VISIBLE);
                pb5.setVisibility(VISIBLE);
                tv4.setVisibility(VISIBLE);
                pb4.setVisibility(VISIBLE);
                tv3.setVisibility(VISIBLE);
                pb3.setVisibility(VISIBLE);
                tv2.setVisibility(VISIBLE);
                pb2.setVisibility(VISIBLE);
                tv1.setVisibility(VISIBLE);
                pb1.setVisibility(VISIBLE);
                break;
            case (4)://russia
                tv4.setVisibility(VISIBLE);
                pb4.setVisibility(VISIBLE);
                tv3.setVisibility(VISIBLE);
                pb3.setVisibility(VISIBLE);
                tv2.setVisibility(VISIBLE);
                pb2.setVisibility(VISIBLE);
                tv1.setVisibility(VISIBLE);
                pb1.setVisibility(VISIBLE);
                break;
            case (3)://india
                tv3.setVisibility(VISIBLE);
                pb3.setVisibility(VISIBLE);
                tv2.setVisibility(VISIBLE);
                pb2.setVisibility(VISIBLE);
                tv1.setVisibility(VISIBLE);
                pb1.setVisibility(VISIBLE);
                break;
            case (2)://britain
                tv2.setVisibility(VISIBLE);
                pb2.setVisibility(VISIBLE);
                tv1.setVisibility(VISIBLE);
                pb1.setVisibility(VISIBLE);
                break;
        }

    }

    public void statViewResBetweenSteps(){
        tv_8.setVisibility(View.INVISIBLE);
        pb_8.setVisibility(View.INVISIBLE);
        tv_7.setVisibility(View.INVISIBLE);
        pb_7.setVisibility(View.INVISIBLE);
        tv_6.setVisibility(View.INVISIBLE);
        pb_6.setVisibility(View.INVISIBLE);
        tv_5.setVisibility(View.INVISIBLE);
        pb_5.setVisibility(View.INVISIBLE);
        tv_4.setVisibility(View.INVISIBLE);
        pb_4.setVisibility(View.INVISIBLE);
        tv_3.setVisibility(View.INVISIBLE);
        pb_3.setVisibility(View.INVISIBLE);
        tv_2.setVisibility(View.INVISIBLE);
        pb_2.setVisibility(View.INVISIBLE);
        tv_1.setVisibility(View.INVISIBLE);
        pb_1.setVisibility(View.INVISIBLE);
        pb_1.setProgress(china.getLifeLevel());
        pb_2.setProgress(britain.getLifeLevel());
        pb_3.setProgress(india.getLifeLevel());
        pb_4.setProgress(russia.getLifeLevel());
        pb_5.setProgress(germany.getLifeLevel());
        pb_6.setProgress(usa.getLifeLevel());
        pb_7.setProgress(france.getLifeLevel());
        pb_8.setProgress(kndr.getLifeLevel());
        switch (value_of_Countries.getSteps()) {
            case (8)://kndr
                tv_8.setVisibility(VISIBLE);
                pb_8.setVisibility(VISIBLE);
                tv_7.setVisibility(VISIBLE);
                pb_7.setVisibility(VISIBLE);
                tv_6.setVisibility(VISIBLE);
                pb_6.setVisibility(VISIBLE);
                tv_5.setVisibility(VISIBLE);
                pb_5.setVisibility(VISIBLE);
                tv_4.setVisibility(VISIBLE);
                pb_4.setVisibility(VISIBLE);
                tv_3.setVisibility(VISIBLE);
                pb_3.setVisibility(VISIBLE);
                tv_2.setVisibility(VISIBLE);
                pb_2.setVisibility(VISIBLE);
                tv_1.setVisibility(VISIBLE);
                pb_1.setVisibility(VISIBLE);
                break;
            case (7)://france
                tv_7.setVisibility(VISIBLE);
                pb_7.setVisibility(VISIBLE);
                tv_6.setVisibility(VISIBLE);
                pb_6.setVisibility(VISIBLE);
                tv_5.setVisibility(VISIBLE);
                pb_5.setVisibility(VISIBLE);
                tv_4.setVisibility(VISIBLE);
                pb_4.setVisibility(VISIBLE);
                tv_3.setVisibility(VISIBLE);
                pb_3.setVisibility(VISIBLE);
                tv_2.setVisibility(VISIBLE);
                pb_2.setVisibility(VISIBLE);
                tv_1.setVisibility(VISIBLE);
                pb_1.setVisibility(VISIBLE);
                break;
            case (6)://usa
                tv_6.setVisibility(VISIBLE);
                pb_6.setVisibility(VISIBLE);
                tv_5.setVisibility(VISIBLE);
                pb_5.setVisibility(VISIBLE);
                tv_4.setVisibility(VISIBLE);
                pb_4.setVisibility(VISIBLE);
                tv_3.setVisibility(VISIBLE);
                pb_3.setVisibility(VISIBLE);
                tv_2.setVisibility(VISIBLE);
                pb_2.setVisibility(VISIBLE);
                tv_1.setVisibility(VISIBLE);
                pb_1.setVisibility(VISIBLE);
                break;
            case (5)://germany
                tv_5.setVisibility(VISIBLE);
                pb_5.setVisibility(VISIBLE);
                tv_4.setVisibility(VISIBLE);
                pb_4.setVisibility(VISIBLE);
                tv_3.setVisibility(VISIBLE);
                pb_3.setVisibility(VISIBLE);
                tv_2.setVisibility(VISIBLE);
                pb_2.setVisibility(VISIBLE);
                tv_1.setVisibility(VISIBLE);
                pb_1.setVisibility(VISIBLE);
                break;
            case (4)://russia
                tv_4.setVisibility(VISIBLE);
                pb_4.setVisibility(VISIBLE);
                tv_3.setVisibility(VISIBLE);
                pb_3.setVisibility(VISIBLE);
                tv_2.setVisibility(VISIBLE);
                pb_2.setVisibility(VISIBLE);
                tv_1.setVisibility(VISIBLE);
                pb_1.setVisibility(VISIBLE);
                break;
            case (3)://india
                tv_3.setVisibility(VISIBLE);
                pb_3.setVisibility(VISIBLE);
                tv_2.setVisibility(VISIBLE);
                pb_2.setVisibility(VISIBLE);
                tv_1.setVisibility(VISIBLE);
                pb_1.setVisibility(VISIBLE);
                break;
            case (2)://britain
                tv_2.setVisibility(VISIBLE);
                pb_2.setVisibility(VISIBLE);
                tv_1.setVisibility(VISIBLE);
                pb_1.setVisibility(VISIBLE);
                break;
        }
    }
}
