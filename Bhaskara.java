/**
 * a.xˆ2 + b.x + c = 0
 * 
 * TODO: completar comentários
 */
public class Bhaskara
{
    private double a;
    private double b;
    private double c;
    private double[] raizes;
    
    public Bhaskara(double a, double b, double c)
    {        
        if (a == 0)
        {
            throw new IllegalArgumentException();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getA()
    {
        return a;
    }
    
    public double getB()
    {
        return b;
    }
    
    public double getC()
    {
        return c;
    }
    
    public double[] getRaizes()
    {
        if (raizes != null)
        {
            return raizes;
        }
        
        double[] solucao;
        double delta;
        // calcular o delta
        delta = b*b - 4*a*c;
        // decidir quantas raizes temos que retornar
        // calcular raizes
        // Math.sqrt
        if (delta < 0)
        {
            solucao = new double[0];
        }
        else 
        {
            if (delta == 0)
            {
                solucao = new double[1];
                solucao[0] = (-b) / (2 * a);
            }
            else
            {
                solucao = new double[2];
                solucao[0] = (-b + Math.sqrt(delta)) / (2 * a);
                solucao[1] = (-b - Math.sqrt(delta)) / (2 * a);
                
            }
        }
        raizes = solucao;
        return solucao;
    }    
        
    @Override
    public String toString()
    {
        return String.format("Equação: %.3f.xˆ2 + %.3f.x + %.3f = 0", a, b, c);
    }
    
    
}
