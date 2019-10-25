import java.io.PrintWriter;
import java.util.Random;

public class Gerador {
    public static void main (String[] args) throws Exception {
        if (args.length!=2) {
            System.err.println ("Gerador: gera arrays de comprimento n e armazena no arquivo arq.");
            System.err.println ("Uso: java Gerador <n> <arg>");
            System.exit (0);
        }
        Random r = new Random();
        PrintWriter fout = new PrintWriter (args[1]);
        int n=Integer.parseInt(args[0]);
        fout.printf ("%d\n", n);
        for (int i=0;i<n;i++)
            fout.printf ("%d\n", r.nextInt(1000000));
        fout.close();
    }
}