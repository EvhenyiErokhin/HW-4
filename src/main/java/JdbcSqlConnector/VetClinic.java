package JdbcSqlConnector;

public class VetClinic {
    private String pet;
    private String name;
    private int age;
    private int weight;
    private String condition;

    public String getPet() {
        return pet;
    }
    public void setPet(String pit) {
        this.pet = pet;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    @Override
    public String toString(){
        return "VetClinic{" +
                    "pet ='" + pet + '\'' +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    ", condition='" + condition + '}';
        }
    }
