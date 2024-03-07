package Animals;

public class Animal {
    private String name;
    private int age;
    private float weight;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void say() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        return "Привет! меня зовут " + name + ", мне " + age + postfixOfAge(age) + ", я вешу - " + weight + " кг, мой цвет - "
                + color;
    }

    public String postfixOfAge(int age){
        if (age == 1) {
            return " год";
        } else if (age > 1 & age <=4) {
            return " года";
        } else {
            return " лет";
        }
    };
}
