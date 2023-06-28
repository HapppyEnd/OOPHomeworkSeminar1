public abstract class Animal {
    private String name;
    private int age;
    private String color;
    private String sex;
    protected Owner owner;
    private int satiety;

    public Animal() {
        this("Unknown", 1, "Black", "Undefined", null);
    }

    public Animal(String name, int age, String color, String sex, Owner owner) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
        this.owner = owner;
        this.satiety = (int)(Math.random()* 100 + 1);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getColor() {
        return this.color;
    }

    public String getSex() {
        return this.sex;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public int getSatiety(){
        return this.satiety;
    }

    public abstract String vote();

    public abstract String eatFood();

    public abstract String move();

    public abstract String sleep();
}
