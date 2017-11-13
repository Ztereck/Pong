import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddle extends Actor
{
    private static final int WIDTH = 10;
    private static final int HEIGHT = 60;
    private String upKey;
    private String downKey;
    
    /**
     * Act - do whatever the Paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeyPressed();
    }
    
    public Paddle( boolean isLeft )
    {
        GreenfootImage paddleImage = new GreenfootImage( WIDTH, HEIGHT );
        if( isLeft == true )
        {
            upKey = "w";
            downKey = "s";
            paddleImage.setColor( Color.BLUE );
        }
        else
        {
            upKey = "up";
            downKey = "down";
            paddleImage.setColor( Color.GREEN );
        }
        paddleImage.fillRect( 0, 0, WIDTH, HEIGHT );
        setImage( paddleImage );
    }
    
    private void checkKeyPressed()
    {
        if(Greenfoot.isKeyDown( upKey ) )
        {
            setLocation( getX(), getY() - 4 );
        }
        
        if(Greenfoot.isKeyDown( downKey ) )
        {
            setLocation( getX(), getY() + 4 );
        }
    }
}
