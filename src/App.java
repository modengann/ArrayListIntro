import processing.core.*;
import java.util.*;

public class App extends PApplet{
    ArrayList<Integer> xs = new ArrayList<>();
    ArrayList<Integer> ys = new ArrayList<>();
    ArrayList<Integer> colors = new ArrayList<>();
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void setup(){
        
    }

    public void settings(){
        size(800, 600);
    }

    public void draw(){
        background(120);
        for(int i = 0; i < xs.size(); i++){
            fill(colors.get(i));
            ellipse(xs.get(i), ys.get(i), 50, 50);
        }
       

    }

    public void mousePressed(){
        xs.add(mouseX);
        ys.add(mouseY);
        colors.add(255);
        
    }

    public void keyPressed(){
        if(keyCode == RIGHT){
            for(int i = 0; i < xs.size(); i++){
                xs.set(i, xs.get(i) + 5);
            }
        }else if(keyCode == LEFT){
            for(int i = 0; i < xs.size(); i++){
                xs.set(i, xs.get(i) - 5);
            }
        }else if(keyCode == UP){
            for(int i = 0; i < xs.size(); i++){
                ys.set(i, ys.get(i) - 5);
            }
        }else if(keyCode == DOWN){
            for(int i = 0; i < xs.size(); i++){
                ys.set(i, ys.get(i) + 5);
            }
        }else if(key == ' '){
            for(int i = 0; i < xs.size(); i++){
                colors.set(i, color(random(255), random(255), random(255)));
            }
        }
    }
}
