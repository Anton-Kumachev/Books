package chap06;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> loc)
    {
        locationCells = loc;
    }

    public String checkYourself(String userInput)
    {
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
            }
            else
            {
                result = "Попал";
            }
        }
        return result;
    }

    //TODO:  all the following code was added and should have been included in the book
    private String name;
    public void setName(String string) {
        name = string;
    }
}
