package Models;

/**
 * Created by jon on 2/3/14.
 */
public class TVShow {
    public TVShow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;
}