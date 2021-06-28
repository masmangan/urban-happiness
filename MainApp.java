
public class MainApp
{
    public static void main(String[] args)
    {
       Bhaskara b1;
       Bhaskara b2;
       
       b1 = new Bhaskara(1, 0, -4); // -2, 2
       b2 = new Bhaskara(2, -10, 8); // 4, 1
        
       // TODO: mostrar os valores das raízes,
       // no momento mostra o endereço do vetor
       double[] rs1 = b1.getRaizes();
       double[] rs2 = b2.getRaizes();
       
       for (double r : rs1)
       {
           System.out.println(r);
       }
       System.out.println();
       
       for (int i = 0; i < rs2.length; i++)
       {
           System.out.println(rs2[i]);
       }
       
    }
}
