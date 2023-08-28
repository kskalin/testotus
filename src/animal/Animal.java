package animal;

public abstract class Animal implements IAnimal {
    private String name;
    private int age;
    private double weight;
    private String color;

    public Animal() {
    }

    public Animal(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String yearsOld = "";
        int ageLastNumber = age % 10;
        boolean isExclusion = (age % 100 >= 11) && (age % 100 <= 14);

        if (ageLastNumber == 1) {
            yearsOld = "год";

        } else if (ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9) {
            yearsOld = "лет";

        } else if (ageLastNumber >= 2 && ageLastNumber <= 4) {
            yearsOld = "года";
        }
        if (isExclusion == true) {
            yearsOld = "лет";
        }
        return "Привет! Меня зовут " + name +
                ", мне " + age + " "+ yearsOld +
                ", я вешу - " + weight + "кг "+
                ", мой цвет - " + color + ".";
    }

    @Override
    public abstract void say();
    @Override
    public void go() {
        System.out.println("Я иду");
    }

    @Override
    public void drink() {
        System.out.println("Я пью");
    }

    @Override
    public void eat() {
        System.out.println("Я ем");
    }
}