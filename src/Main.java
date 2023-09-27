import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        SocialMedia socialMedia = new SocialMedia("Instagram");
        SocialMedia socialMedia1 = new SocialMedia("FaceBook");
        List<SocialMedia> allSocialMedia = List.of(socialMedia, socialMedia1);




        SocialMedia socialMedia2 = new SocialMedia("WhatsApp");


        Person person = new Person("Adel", 22, allSocialMedia);
        Person person1=new Person("Elina", 20, new ArrayList<>());
        List<Person> people =new ArrayList<>();
        people.add(person);
        people.add(person1);


        Database database = new Database(people);

        SocialMediaImpl socialMedia3=new SocialMediaImpl(database);
        System.out.println(socialMedia3.saveSocialMedia(socialMedia2));
        System.out.println(socialMedia3.getSocialMediaById(1));
        System.out.println(socialMedia3.getAllSocialMediaByPersonId(0));
        System.out.println("===================");
        socialMedia3.deleteSocialMediaById(0);
        socialMedia3.deleteAllSocialMediaByPersonId(0);
        socialMedia3.getAll();
        System.out.println(people);



    }
}