package prj5;

import student.TestCase;

public class SongTest extends student.TestCase {

    private Song s;


    public void setUp() {
        s = new Song("Thriller", "Michael Jackson", 1996, "Pop");
    }


    public void testConstructor() {
        assertEquals("Thriller", s.getTitle());
        assertEquals("Michael Jackson", s.getArtist());
        assertEquals(1996, s.getYear());
        assertEquals("Pop", s.getGenre());
    }


    public void testGetName() {
        assertEquals("Thriller", s.getTitle());
    }


    public void testGetArtist() {
        assertEquals("Michael Jackson", s.getArtist());
    }


    public void testGetYear() {
        assertEquals(1996, s.getYear());

    }


    public void testGetGenre() {
        assertEquals("Pop",s.getGenre());
    }


    public void testToString() {

        assertEquals("Title: Thriller Artist: Michael Jackson Year: 1996 Genre: Pop"
           , s.toString());
    }


    public void testEquals() {
        Song noSong = null;
        Song sameSong = new Song("Thriller", "Michael Jackson", 1996, "Pop");
        Song diffSong = new Song("Beat It", "Michael Jackson", 1997, "Pop");
        assertTrue(s.equals(sameSong));
        assertFalse(s.equals(noSong));
        assertFalse(s.equals(diffSong));
    }


}
