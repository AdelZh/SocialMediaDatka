import java.util.List;

public class Person {
    public static int id;
    private int instanceId;
    private String name;
    private int age;

    private List<SocialMedia> socialMedia;

    public Person(String name, int age, List<SocialMedia> socialMedia) {
        this.instanceId = id++;
        this.name = name;
        this.age = age;
        this.socialMedia = socialMedia;
    }



    public List<SocialMedia> getSocialMedia() {
        return socialMedia;
    }



    public int getInstanceId() {
        return instanceId;
    }



    @Override
    public String toString() {
        return "Person{" +
                "instanceId=" + instanceId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", socialMedia=" + socialMedia +
                '}';
    }
}

