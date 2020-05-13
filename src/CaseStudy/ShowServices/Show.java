package CaseStudy.ShowServices;

import CaseStudy.Task1.House;
import CaseStudy.Task1.Room;
import CaseStudy.Task1.Villa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import static CaseStudy.Controllers.MainController.displayMainMenu;
import static CaseStudy.Controllers.NewServies.*;
import static CaseStudy.Controllers.SaveFile.*;
import static CaseStudy.ShowServices.ShowHouse.showHouse;

import static CaseStudy.ShowServices.ShowRoom.showRoom;
import static CaseStudy.ShowServices.ShowVilla.showVilla;

public class Show {
    public  static Scanner scanner = new Scanner(System.in);
    public static void showServices() throws IOException, ClassNotFoundException {
        System.out.println("1. Show all Villa"+
        "\n2. Show all House" +
        "\n3. Show all Room" +
        "\n4. Show All Name Villa Not Duplicate" +
        "\n5. Show All Name House Not Duplicate" +
        "\n6. Show All Name Name Not Duplicate"+
        "\n7. Back to menu" +
        "\n8. Exit");
        System.out.println("----------------------input-----------------------");
        int num = scanner.nextInt();
        switch (num){
            case 1:{
                showVilla();
                showServices();
                break;
            } case 2:{
                showHouse();
                showServices();
                break;
            } case 3:{
                showRoom();
                showServices();
                break;
            } case 4:{
                villaList  = new ArrayList<>();
                saveListVilla();
                TreeSet<String> treeSet = new TreeSet<>(new HashSet<>());
                for (Villa villa : villaList) {
                    treeSet.add(villa.getserviceName());
                }
                System.out.println(treeSet);
                showServices();
                break;
            } case 5:{
                houseList = new ArrayList<>();
                saveListHouse();
                TreeSet<String> treeSet = new TreeSet<>(new HashSet<>());
                for (House house : houseList){
                    treeSet.add(house.getserviceName());
                }
                System.out.println(treeSet);
                showServices();
                break;
            } case 6:{
                roomList = new ArrayList<>();
                saveListRoom();
                TreeSet<String> treeSet = new TreeSet<>(new HashSet<>());
                for (Room room : roomList){
                    treeSet.add(room.getserviceName());
                }System.out.println(treeSet);
                showServices();
                break;
            } case 7:{
                displayMainMenu();
            }
        }
    }

}
