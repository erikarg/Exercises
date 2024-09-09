public class Resident {

    public String name;
    public int age;
    public double weight;
    public double height;

    public Resident(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public static void main(String[] args) {
        Resident firstGuy = new Resident("João", 22, 72, 1.72);
        System.out.println("Nome: " + firstGuy.name + "\nIdade: " + firstGuy.age + "\nPeso: " + firstGuy.weight + "\nAltura: " + firstGuy.height);
    }
}
