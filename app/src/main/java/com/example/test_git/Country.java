package com.example.test_git;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import static com.example.test_git.MainActivity.value_of_Countries;
import static com.example.test_git.Navigator.britain;
import static com.example.test_git.Navigator.china;
import static com.example.test_git.Navigator.france;
import static com.example.test_git.Navigator.germany;
import static com.example.test_git.Navigator.india;
import static com.example.test_git.Navigator.kndr;
import static com.example.test_git.Navigator.russia;
import static com.example.test_git.Navigator.usa;
import static com.example.test_git.ui.notifications.NotificationsFragment.spinnerFight;
import static com.example.test_git.ui.notifications.NotificationsFragment.spinnerGuardChoose;

public class Country {
    private String name;
    private int lifeLevel = 50;
    private int guard = 0;
    private int ecology = 100;
    private int nukeRockets = 0;
    private int steps = 0;

    public Country(String name){ this.name = name; } //задаём имя страны

    public String getName(){ return name; } //возращает имя

    public int getLifeLevel(){ return lifeLevel; } //возращает уровень жизни

    public int getGuard(){ return guard; } //возращает уровень защиты

    public int getEcology(){ return ecology; } //возращает процент экологии

    public int getNukeRockets(){ return nukeRockets; } //возращает кол-во ядерных ракет

    public int getSteps(){ return steps; } //возращает кол-во шагов

    public void oneStep(){ //механика за один ход
        steps++;
        lifeLevel -= 10;
        ecology -= 5 * value_of_Countries.getSteps();
        if (lifeLevel >= 50){
            guard += (lifeLevel - 50)/10;
        }
        if (steps >= 3 && steps % 2 != 0) nukeRockets++;
    }

    public void lifeLevelUp(){ //если выбрали увеличить уровень жизни
        if (guard > 0) {
            lifeLevel = (int) (lifeLevel + lifeLevel * 0.05);
            guard--;
        }
    }

    public void ecologyUp(){ //если выбрали увеличить уровень экологии
        if (guard > 0) {
            ecology = (int) (ecology + ecology * 0.05);
            guard--;
        }
    }

    public void nukeDanger(){ //механика нападения на страну
        if (guard > 0) guard--;
         else {
            lifeLevel -= 20;
            ecology -= 20;
        }
    }

    public void checkSpinnerValues(){ //проверка защиты и ракеты чтобы не ноль
        if (guard <= 0) spinnerGuardChoose.setEnabled(false);
        if (nukeRockets <= 0) spinnerFight.setEnabled(false);
    }

    //поднятие уровня жизни и экологи за очки
    public void itemSelected(Country country){ if (spinnerGuardChoose.getSelectedItemPosition() == 1) country.lifeLevelUp();  else if(spinnerGuardChoose.getSelectedItemPosition() == 2) country.ecologyUp(); }

    public void rocketHit(){ //механика удара по стране
        switch (spinnerFight.getSelectedItemPosition()){
            case(8)://kndr
                if (nukeRockets > 0){
                    kndr.nukeDanger();
                    nukeRockets--;
                }
                break;
            case(7)://france
                if (nukeRockets > 0){
                    france.nukeDanger();
                    nukeRockets--;
                }
                break;
            case(6)://usa
                if (nukeRockets > 0){
                    usa.nukeDanger();
                    nukeRockets--;
                }
                break;
            case(5)://germany
                if (nukeRockets > 0){
                    germany.nukeDanger();
                    nukeRockets--;
                }
                break;
            case(4)://russia
                if (nukeRockets > 0){
                    russia.nukeDanger();
                    nukeRockets--;
                }
                break;
            case(3)://india
                if (nukeRockets > 0){
                    india.nukeDanger();
                    nukeRockets--;
                }
                break;
            case(2)://britain
                if (nukeRockets > 0){
                    britain.nukeDanger();
                    nukeRockets--;
                }
                break;
            case(1)://china
                if (nukeRockets > 0){
                    china.nukeDanger();
                    nukeRockets--;
                }
                break;
        }
    }
}
