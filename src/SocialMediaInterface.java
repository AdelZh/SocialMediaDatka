import java.util.List;

public interface SocialMediaInterface {

    void assignSocialMediaToPerson(int id, int idOfMedia);
    String saveSocialMedia(SocialMedia socialMedia);
    SocialMedia getSocialMediaById(int id);
    List<SocialMedia> getAllSocialMediaByPersonId(int id);
    void deleteAllSocialMediaByPersonId(int id);
    void deleteSocialMediaById(int id);
    void getAll();
}
