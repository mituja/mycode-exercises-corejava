package exercises.exercises.objects;

public class Human {

    private Integer age;
    private Integer weight;
    private Integer height;
    private String name;
    private boolean sex;

    public Human(Integer age, Integer weight, Integer height, String name, boolean sex) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return sex;
    }
}
