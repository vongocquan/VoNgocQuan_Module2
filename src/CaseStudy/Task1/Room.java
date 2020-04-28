package CaseStudy.Task1;

public class Room extends Services {
    private String accompaniedService;

    public Room() {
    }

    public String getAccompaniedService() {
        return accompaniedService;
    }

    public void setAccompaniedService(String accompaniedService) {
        this.accompaniedService = accompaniedService;
    }

    @Override
    public String showInfor() {
        return "Room{" + super.toString() +
                "accompaniedService='" + accompaniedService + '\'' +
                '}';
    }


    public Room(String accompaniedService) {
        this.accompaniedService = accompaniedService;
    }

    public Room(String serviceName, String areaUsed, String rentalCosts, String maximumPeople, String rentalType, String accompaniedService) {
        super(serviceName, areaUsed, rentalCosts, maximumPeople, rentalType);
        this.accompaniedService = accompaniedService;
    }
}
