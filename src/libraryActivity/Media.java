package libraryActivity;

public interface Media {
    String getTitle();
    boolean checkOut();
    boolean checkIn();
    String preview();
}
