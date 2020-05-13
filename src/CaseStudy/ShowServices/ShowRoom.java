package CaseStudy.ShowServices;

import CaseStudy.Task1.Room;

import java.io.IOException;
import java.util.ArrayList;

import static CaseStudy.Controllers.NewServies.roomList;
import static CaseStudy.Controllers.SaveFile.saveListRoom;

public class ShowRoom {
    public static void showRoom() throws IOException {
        roomList = new ArrayList<>();
        saveListRoom();
        for (Room room : roomList){
            System.out.println(room.show());
        }
    }
}
