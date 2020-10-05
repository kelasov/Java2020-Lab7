package Pr7;


public class Ovcharka extends Dog{
    private String name;
    private int weight;
    public Ovcharka(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Ovcharka{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
    @Override
    public void Run() {

    }
}