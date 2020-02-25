package libraryActivity;

public class DigitalArticle implements Media {
    private
    String title;
    String author;
    String preview;

    public DigitalArticle(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public DigitalArticle(String title, String author, String preview) {
        this.title = title;
        this.author = author;
        this.preview = preview;
    }

    @Override
    public boolean checkIn() {
        return true;
    }

    @Override
    public boolean checkOut() {
        return true;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }

    @Override
    public String preview() {
        if (preview == null) {
            return "No preview found";
        }
        return preview;
    }
}
