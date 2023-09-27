public class SocialMedia {


    public static int id;
    private int instanceId;
    private String picture;
    private String name;

    public SocialMedia(String name) {
        this.instanceId = id++;
        this.name = name;
    }



    public int getInstanceId() {
        return instanceId;
    }





    @Override
    public String toString() {
        return "SocialMedia{" +
                "instanceId=" + instanceId +
                ", picture='" + "😇" + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

