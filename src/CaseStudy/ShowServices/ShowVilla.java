package CaseStudy.ShowServices;

import CaseStudy.Task1.House;
import CaseStudy.Task1.Villa;

import java.io.IOException;
import java.util.ArrayList;

import static CaseStudy.Controllers.NewServies.houseList;
import static CaseStudy.Controllers.NewServies.villaList;
import static CaseStudy.Controllers.SaveFile.saveListHouse;
import static CaseStudy.Controllers.SaveFile.saveListVilla;

public class ShowVilla{
    public static void showVilla() throws IOException {
        villaList = new ArrayList<>();
        saveListVilla();
        for (Villa villa : villaList){
            System.out.println(villa.show());
        }
    }
}
