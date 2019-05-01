package sutton.net;

public class Photo {
    int albumId;
    int id;
    String title;
    String url;
    String thumbnailUrl;

    @Override
    public String toString() {
        return "Photo{" +
                "albumId=" + albumId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                '}';
    }
}
