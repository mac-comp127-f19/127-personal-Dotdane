package libraryActivity;

public class Video implements Media {
    private
        String title;
    String director;
    int copies;
    int availableCopies;
    String preview;

    public Video(String title, String director, int copies) {
        this.title = title;
        this.director = director;
        this.copies = copies;
        availableCopies = copies;
    }

    public Video(String title, String director, int copies, String preview) {
        this.title = title;
        this.director = director;
        this.copies = copies;
        availableCopies = copies;
        this.preview = preview;
    }

    @Override
    public boolean checkIn() {
        if(availableCopies<copies) {
            availableCopies++;
            return true;
        }
        return false;
    }

    @Override
    public boolean checkOut() {
        if(copies>0) {
            availableCopies--;
            return true;
        }
        return false;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " by " + director + "\nAvailable Copies: " + availableCopies;
    }

    @Override
    public String preview() {
        if (preview == null) {
            return "No preview found";
        }
        return preview;
    }
}
