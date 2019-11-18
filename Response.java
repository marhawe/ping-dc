package prj5;

import java.util.LinkedList;

public class Response{
    
    private StateEnum state;
    private MajorEnum major;
    private HobbyEnum hobby;
    LinkedList<Opinion> opinions;
   
    public Response (StateEnum s , MajorEnum m, HobbyEnum h , LinkedList<Opinion> o) {
            this.hobby = h ; 
            this.major = m ;
            this.state = s ;
            this.opinions = o;
    }
    public MajorEnum getMajor(){
        return major;
    }   
    public HobbyEnum getHobby(){
        return hobby;
    }
    
    public StateEnum getState(){
        return state;   
    }
    public LinkedList<Opinion> getOpinions(){
        return opinions;
    }
    
 }    
    
    
