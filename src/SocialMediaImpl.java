import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class SocialMediaImpl implements SocialMediaInterface{



    private Database database;

    public SocialMediaImpl(Database database) {
        this.database = database;
    }

    @Override
    public void assignSocialMediaToPerson(int id, int idOfMedia) {
        for(Person person:database.getPeople()){
            if (person.getInstanceId()==id){
                for(SocialMedia socialMedia:person.getSocialMedia()){
                    if(socialMedia.getInstanceId()==idOfMedia){
                        person.getSocialMedia().add(socialMedia);
                        database.getPeople().add(person);
                    }
                }
            }
        }

    }

    @Override
    public String saveSocialMedia(SocialMedia socialMedia) {
        for (Person person : database.getPeople()) {
            for (SocialMedia socialMedia1 : person.getSocialMedia()) {
                if (!socialMedia1.equals(socialMedia)) {
                    person.getSocialMedia().add(socialMedia);
                    return "Added" + socialMedia1;
                }
            }
        }
        return null;
    }



    @Override
    public SocialMedia getSocialMediaById(int id) {
        for (Person person : database.getPeople()) {
            for (SocialMedia socialMedia : person.getSocialMedia()) {
                if (socialMedia.getInstanceId() == id) {
                    return socialMedia;
                }
            }
        }
        return null;
    }

    @Override
    public List<SocialMedia> getAllSocialMediaByPersonId(int id) {
        for(Person person:database.getPeople()){
            if(person.getInstanceId()==id){
                return person.getSocialMedia();
            }
        }
        return null;
    }

    @Override
    public void deleteAllSocialMediaByPersonId(int id) {
        for(Person person:database.getPeople()){
            if(person.getInstanceId()==id){
                person.getSocialMedia().clear();
            }
        }
    }

    @Override
    public void deleteSocialMediaById(int id) {
        for(Person person:database.getPeople()){
           for(int i=0; i<person.getSocialMedia().size(); i++){
               if(person.getSocialMedia().get(i).getInstanceId()==id){
                   person.getSocialMedia().remove(i);
               }
           }
        }
    }

    @Override
    public void getAll() {
        for(Person person:database.getPeople()){
            System.out.println(person.getSocialMedia());
        }
    }
}
