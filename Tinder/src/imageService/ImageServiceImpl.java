package imageService;

import java.util.*;

public class ImageServiceImpl implements ImageService {

    Map<Long, Map<Integer, String>> imageMap = new HashMap<>();

    @Override
    public void loadImage(long userId, int imageId) {
        imageMap.computeIfAbsent(userId, k -> new HashMap<>()).put(imageId, "Image data placeholder");
        System.out.println("Image " + imageId + " uploaded successfully for user " + userId);
    }

    @Override
    public void getImage(long userId, int imageId) {
        try {
            if (imageMap.containsKey(userId) && imageMap.get(userId).containsKey(imageId)) {
                System.out.println("Fetched image " + imageId + " for user " + userId);
            } else {
                System.out.println("Image " + imageId + " not found for user " + userId);
            }
        } catch (Exception e) {
            System.out.println("Error fetching image " + imageId + " for user " + userId + ": " + e.getMessage());
        }
    }

    @Override
    public void deleteImage(long userId, int imageId) {
        try {
            if (imageMap.containsKey(userId) && imageMap.get(userId).remove(imageId) != null) {
                System.out.println("Deleted image " + imageId + " for user " + userId);
            } else {
                System.out.println("Image " + imageId + " not found for user " + userId);
            }
        } catch (Exception e) {
            System.out.println("Error deleting image " + imageId + " for user " + userId + ": " + e.getMessage());
        }
    }
}
