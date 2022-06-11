import processing.core.PApplet;

public class MainClass extends PApplet {
    int x=0;
    int y=0,i=0,j=0;
    public static void main(String[] args)
    {
        PApplet.main("MainClass" , args);
    }

    @Override
    public void settings()
    {
        super.settings();
        size(800,900);
    }

    @Override
    public void setup()
        {}

    @Override
    public void draw()
    {
        paintWhite();
        drawCircle();


    }

    private void drawCircle()
    {
        ellipse(x ,200,14,14);
        x=x+1;
        ellipse(y,300,14,14);
        y=y+2;
        ellipse(i ,400,14,14);
        i=i+3;
        ellipse(j,500,14,14);
        j=j+4;

    }

    private void paintWhite()
    {
//        background(255);
    }
}
