/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Tayyab Raza
 */
// this is the singleton class in which singleton pattern implemented
// i used it to make Music app because only one object is required to bring music insted of keep making
public class singleton {
    private static singleton obj;
    private MusicApp music = new MusicApp();

    public void setMusic(MusicApp music) {
        this.music = music;
    }

    public MusicApp getMusic() {
        return music;
    }
    
    // In this function the instance is created if not created aleady
    public static singleton getInstance()
    {
     if (obj==null) 
            obj = new singleton(); 
        return obj; 
    }
    
    
}
