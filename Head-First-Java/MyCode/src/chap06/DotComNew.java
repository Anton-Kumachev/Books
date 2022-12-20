package chap06;
//Новый и улучшенный класс DotCom! Теперь со вкусом ArrayList

import java.util.ArrayList;

public class DotComNew {
    private ArrayList<String> locationCells;
    // private int numOfHits = 0;
    // сейчас это нам не нужно

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";
            int index = locationCells.indexOf(userInput);
            if (index >= 0) {
                locationCells.remove(index);
                if (locationCells.isEmpty()) {
                result = "Потопил";
                } else {
                    result = "Попал";
                } // Конец if
            } // Конец внешнего if
       return result;
    } // Конец метода
} // Конец класса
