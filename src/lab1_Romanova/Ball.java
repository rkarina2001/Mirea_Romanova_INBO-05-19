package lab1_Romanova;

import java.lang.*;
public class Ball {
    private String colour;
    private int diametr;

    public Ball(String n, int a) {
        colour=n;
        diametr=a;
    }

    public Ball(String n) {
        colour=n;
        diametr=1;
    }

    public Ball()
    {
        colour = "red";
        diametr=1;
    }
    public void setDiametr(int diametr)
    {
        this.diametr=diametr;
    }
    public void setColour(String colour)
    {
        this.colour = colour;
    }
    public String getColour(String colour)
    {
        return colour;
    }
    public int getDiametr()
    {
        return diametr;
    }
public void totals()
{
    System.out.println(colour+" ball diametr multiplied by 2 is "+diametr*2);
}
}