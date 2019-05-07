package sutton.net;

public class Photo {
    private int id;
    private int albumId;
    private String title;

    public String getUrl() {
        return url;
    }

    private String url;
    private String thumbnailUrl;

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

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
