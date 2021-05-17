package com.example.test_git;

import static com.example.test_git.MainActivity.value_of_Countries;

public class Country {
    private String name;
    private int lifeLevel = 50;
    private int guard = 0;
    private int ecology = 100;
    private int nukeRockets = 0;

    public Country(String name){ this.name = name; } //задаём имя страны

    public String getName(){ return name; } //возращает имя

    public int getLifeLevel(){ return lifeLevel; } //возращает уровень жизни

    public int getGuard(){ return guard; } //возращает уровень защиты

    public int getEcology(){ return ecology; } //возращает процент экологии

    public int getNukeRockets(){ return nukeRockets; } //возращает кол-во ядерных ракет

    public void oneStepLifeLevel(){ lifeLevel -= 10; } //уменьшение уровня жизни за один ход

    public void oneStepEcology(){ ecology -= 5 * value_of_Countries.getSteps(); } //уменьшение экологии за ход




}
