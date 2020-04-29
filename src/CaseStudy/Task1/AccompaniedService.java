package CaseStudy.Task1;

public class AccompaniedService {
    private String nameAccompaniedService;
    private String unit;
    private String price;


    public String getNameAccompaniedService() {
        return nameAccompaniedService;
    }

    public void setNameAccompaniedService(String nameAccompaniedService) {
        this.nameAccompaniedService = nameAccompaniedService;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public AccompaniedService() {
    }

    public AccompaniedService(String nameAccompaniedService, String unit, String price) {
        this.nameAccompaniedService = nameAccompaniedService;
        this.unit = unit;
        this.price = price;
    }

    @Override
    public String toString() {
        return "AccompaniedService: nameAccompaniedService =" + this.nameAccompaniedService + ", unit = " + this.unit + ", price = " + this.price;
    }
}
