package CaseStudy.Task1;

public class House extends Services {
    private String roomStandard;
    private String otherFacilities;
    private String numberOfFloors;

    public House() {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getMoTaTienNghiKhac() {
        return otherFacilities;
    }

    public void setOtherFacilities(String otherFacilities) {
        this.otherFacilities = otherFacilities;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public House(String roomStandard, String otherFacilities, String numberOfFloors) {
        this.roomStandard = roomStandard;
        this.otherFacilities = otherFacilities;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String serviceCode, String serviceName, String areaUsed, String rentalCosts, String maximumPeople, String rentalType, String roomStandard, String otherFacilities, String numberOfFloors) {
        super(serviceCode, serviceName, areaUsed, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.otherFacilities = otherFacilities;
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInfor() {
        return  super.toString() + "," +
                 roomStandard + "," +
                 otherFacilities + ","+
                 numberOfFloors;
    }

    @Override
    public String show() {
        return super.show() +
                "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", otherFacilities='" + otherFacilities + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                '}';
    }
}
