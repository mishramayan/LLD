package pojos;

public class Image {
    long userId;
    long imageId;
    String fileURL;

    public Image(long userId, long imageId, String fileURL) {
        this.userId = userId;
        this.imageId = imageId;
        this.fileURL = fileURL;
    }
}
