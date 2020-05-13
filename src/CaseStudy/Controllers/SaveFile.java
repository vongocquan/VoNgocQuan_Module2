package CaseStudy.Controllers;



import CaseStudy.Task1.House;
import CaseStudy.Task1.Room;
import CaseStudy.Task1.Villa;


import java.io.*;

import static CaseStudy.Controllers.NewServies.*;

public class SaveFile {

//    doc file Villa.csv--------------------------------------------------------------------------------------
    public static void writeVila()throws IOException, ClassNotFoundException{
        saveListVilla();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Data\\Villa.csv"));
        for (Villa villa : villaList) {
            bufferedWriter.write(villa.showInfor());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        addNewServices();
    }

//  luu villa vao list-------------------------------------------------------------------------------------
    public static void saveListVilla() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Data\\Villa.csv"));
        String str = "";
        do {
            str = bufferedReader.readLine();
            if (str != null){

                String[] arr = str.split(",");
                Villa villa = new Villa(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9],arr[10], arr[11], arr[12]);
                villaList.add(villa);

            }
        }while (str != null);
    }

//    doc file House.csv--------------------------------------------------------------------------------------------
    public static void writeHouse() throws IOException, ClassNotFoundException {
        saveListHouse();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Data\\House.csv"));
        for (House house : houseList){
            bufferedWriter.write(house.showInfor());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        addNewServices();
    }

//    luu house vao list-----------------------------------------------------------------------------------------
    public static void saveListHouse() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Data\\House.csv"));
        String str = "";
        do {
            str = bufferedReader.readLine();
            if (str != null){
                String[] arr = str.split(",");
                House house = new House(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7],arr[8]);
                houseList.add(house);
            }
        }while (str != null);
    }

//    doc file Room.csv----------------------------------------------------------------
    public static void writeRoom() throws IOException, ClassNotFoundException {
        saveListRoom();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Data\\Room.csv"));
        for (Room room : roomList){
            bufferedWriter.write(room.showInfor());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        addNewServices();

    }

//    luu room vao list ---------------------------------------------------------------------
    public static void saveListRoom() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Data\\Room.csv"));
        String str = "";
        do {
            str = bufferedReader.readLine();
            if (str != null){
                String[] arr = str.split(",");
                Room room = new Room(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7],arr[8],arr[9]);
                roomList.add(room);
            }
        }while (str != null);
    }
}
