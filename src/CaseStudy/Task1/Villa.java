package CaseStudy.Task1;

public class Villa extends Services {
    private String roomStandard;
    private String otherFacilities;
    private String poolArea;
    private String numberOfFloors;

    public Villa() {
    }

    @Override
    public String showInfor() {
        return "Villa{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", otherFacilities='" + otherFacilities + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                '}';
    }



    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOtherFacilities() {
        return otherFacilities;
    }

    public void setOtherFacilities(String otherFacilities) {
        this.otherFacilities = otherFacilities;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String roomStandard, String otherFacilities, String poolArea, String numberOfFloors) {
        this.roomStandard = roomStandard;
        this.otherFacilities = otherFacilities;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceName, String areaUsed, String rentalCosts, String maximumPeople, String rentalType, String roomStandard, String otherFacilities, String poolArea, String numberOfFloors) {
        super(serviceName, areaUsed, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.otherFacilities = otherFacilities;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

}
