package CaseStudy.Task1;

public class Room extends Services {
    private String accompaniedServiceFrre;

    public Room() {
    }

    public String getAccompaniedServiceFrre() {
        return accompaniedServiceFrre;
    }

    public void setAccompaniedServiceFrre(String accompaniedServiceFrre) {
        this.accompaniedServiceFrre = accompaniedServiceFrre;
    }

    @Override
    public String showInfor() {
        return "Room{" + super.toString() +
                ", accompaniedService= " + accompaniedServiceFrre +
                "}";
    }


    public Room(String accompaniedServiceFrre) {
        this.accompaniedServiceFrre = accompaniedServiceFrre;
    }

    public Room(String serviceCode, String serviceName, String areaUsed, String rentalCosts, String maximumPeople, String rentalType, String accompaniedServiceFrre) {
        super(serviceCode, serviceName, areaUsed, rentalCosts, maximumPeople, rentalType);
        this.accompaniedServiceFrre = accompaniedServiceFrre;
    }
}
