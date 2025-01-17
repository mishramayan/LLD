package imageService;

import java.awt.image.BufferedImage;

public interface ImageService {
    void loadImage(long userId, int imageId);
    void getImage(long userId, int imageId);
    void deleteImage(long userId, int imageId);
}
