package CaseStudy.ShowServices;

import CaseStudy.Task1.House;

import java.io.IOException;
import java.util.ArrayList;

import static CaseStudy.Controllers.NewServies.houseList;
import static CaseStudy.Controllers.SaveFile.saveListHouse;

public class ShowHouse {
    public static void showHouse() throws IOException {
        houseList = new ArrayList<>();
        saveListHouse();
        for (House house : houseList){
            System.out.println(house.show());
        }
    }
}
