package prj5;


public class Song {
 
    
    private String title;
    private String artist; 
    private int year;
    private String genre;
    
    public Song(String title, String artist, int year, String genre) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public int getYear() {
        return year;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Title: ");
        builder.append(title);
        builder.append(" Artist: ");
        builder.append(artist);
        builder.append(" Year: ");
        builder.append(year);
        builder.append(" Genre: ");
        builder.append(genre);
        return builder.toString();
    }
    
    public boolean equals(Object obj) {
        if (obj == null || this.getClass()!= obj.getClass()) {
            return false;
        }
        else if (this == obj) {
            return true;
        }
        return this.toString().equals(((Song)obj).toString());
    }
   
 }
