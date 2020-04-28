package CaseStudy.Task1;

public abstract class Services{
    private String serviceName;
    private String areaUsed;
    private String rentalCosts;
    private String maximumPeople;
    private String rentalType;

    public Services() {
    }

    public Services(String serviceName, String areaUsed, String rentalCosts, String maximumPeople, String rentalType) {
        this.serviceName = serviceName;
        this.areaUsed = areaUsed;
        this.rentalCosts = rentalCosts;
        this.maximumPeople = maximumPeople;
        this.rentalType = rentalType;
    }

    public String getserviceName() {
        return serviceName;
    }

    public void setserviceName(String tenDichVu) {
        this.serviceName = tenDichVu;
    }

    public String getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(String areaUsed) {
        this.areaUsed = areaUsed;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(String maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Services{" +
                "serviceName='" + serviceName + '\'' +
                ", areaUsed='" + areaUsed + '\'' +
                ", rentalCosts='" + rentalCosts + '\'' +
                ", maximumPeople='" + maximumPeople + '\'' +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    public abstract String showInfor();
}
