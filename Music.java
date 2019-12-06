/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highschooldrama;
import sun.audio.*;
import java.io.*;
/**
 *
 * @author 805619
 */
public class Music {
    
    public  void music() {
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
        ContinuousAudioDataStream loop = null;
        
        try{
        BGM = new AudioStream(getClass().getResourceAsStream("lofi.wav"));
        MD = BGM.getData();
        loop = new ContinuousAudioDataStream(MD);
        }catch(IOException error){System.out.println(error);}
        
       
        MGP.start(loop);
    }
    
}
