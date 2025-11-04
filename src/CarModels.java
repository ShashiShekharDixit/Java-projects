public class CarModels extends CarToString{
    private String name;
    private int model;
    public CarModels(String name, int model) {
        this.name = name;
        this.model = model;
    }
    @Override
    public String toString() {
        return "Car : [name=" + name + ", model=" + model + "]";
    }
}
