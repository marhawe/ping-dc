package prj5;

public class Opinion {
    
    private Song song;
    private boolean heard;
    private boolean likes;

    public Opinion(Song song, boolean heard, boolean likes) {
        this.heard = heard;
        this.likes = likes;
        this.song = song;    
        
    }
    
    public Song getSong(){
        return song;
    }    
    
    public boolean getHeard() {
        return heard;
    }
    
    public boolean getLikes() {
        return likes;
    }
    
}



