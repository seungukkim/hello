package GamePackage;
import javax.swing.*;
import java.awt.*;
 
public class GameView extends JPanel{
    Image back,character1;
    int x=15,y=15;
    public GameView()
    {
    	
        back=Toolkit.getDefaultToolkit().
                getImage("C:\\Users\\gogob\\Desktop\\background.jpg");
        character1=Toolkit.getDefaultToolkit().
                getImage("C:\\\\Users\\\\gogob\\\\Desktop\\rpg.jpg");
                
    }
    //이미지출력
    public void paint(Graphics g)
    {
        g.drawImage(back,0,0,getWidth(),getHeight(),this);
        g.drawImage(character1,x,y,100,100,this);
    } 
}