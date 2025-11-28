
package figuras;
 import java.awt.Graphics;

public abstract class FiguraGeometrica {
    static float area;
    static float perimetro;

    public static float getArea() {
        return area;
    }

    public static void setArea(float area) {
        FiguraGeometrica.area = area;
    }

    public static float getPerimetro() {
        return perimetro;
    }

    public static void setPerimetro(float perimetro) {
        FiguraGeometrica.perimetro = perimetro;
    }
    
    public abstract void drawFigure(Graphics g);
    public abstract float Area();
    public abstract float Perimetro();
    
    
       
    
}
