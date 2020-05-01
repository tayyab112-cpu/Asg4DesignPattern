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
// this is the musix app class
public class MusicApp {
String music;
public MusicApp()
{}
public MusicApp(String mg)
{
    music=mg;
     System.out.println(mg);
}

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }
    
}
