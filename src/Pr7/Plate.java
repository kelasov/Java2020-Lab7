package Pr7;

public class Plate extends Dish {
    private int diameter;
    private String material;

    public Plate(int diameter, String material) {
        this.diameter = diameter;
        this.material = material;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "diameter=" + diameter +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public void Break() {

    }
}
