
public class MainApp
{
    public static void main(String[] args)
    {
       Bhaskara b1;
       Bhaskara b2;
       
       b1 = new Bhaskara(1, 2, 3);
       b2 = new Bhaskara(3, 4, 5);
       
       // TODO: mostrar os valores das raízes,
       // no momento mostra o endereço do vetor
       System.out.println(b1.getRaizes());
       System.out.println(b2.getRaizes());
    }
}
