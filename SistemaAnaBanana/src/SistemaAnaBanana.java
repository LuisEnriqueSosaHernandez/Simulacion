
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class SistemaAnaBanana {

    public ArrayList retorna() {
        DecimalFormat df = new DecimalFormat("0.0000");
        Random rnd = new Random();
        int numpieza = 1;
        double horallegada = 0;
        double Tinspeccion;
        double horasalida;
        double horallegadaempaque;
        double Tempacado = 0;
        double exit = 0;
        String datos = "";
        ArrayList<String> l = new ArrayList<>();
        while (exit <= 2400) {
            if (numpieza <= 5) {
                    horallegada += (6 + (rnd.nextDouble() * 8));
                Tinspeccion = -5 * Math.log(1 - rnd.nextDouble());
                horasalida = horallegada + Tinspeccion;
                horallegadaempaque = horasalida;
                Tempacado = -8 * Math.log(1 - rnd.nextDouble());
                exit = horallegadaempaque + Tempacado;
                l.add(Integer.toString(numpieza) +" "+df.format(horallegada) +" " +df.format(Tinspeccion) +" " +df.format(horasalida) +" " +df.format(horallegadaempaque) +" "+df.format(Tempacado) +" " +df.format(exit));
                numpieza++;
            } else {
                horallegada += (6 + (rnd.nextDouble() * 8));
                Tinspeccion = -5 * Math.log(1 - rnd.nextDouble());
                horasalida = horallegada + Tinspeccion;
                horallegadaempaque = horasalida + exit;
                Tempacado = -8 * Math.log(1 - rnd.nextDouble());
                exit = horallegadaempaque + Tempacado;
                l.add(Integer.toString(numpieza) +" "+df.format(horallegada) +" " +df.format(Tinspeccion) +" " +df.format(horasalida) +" " +df.format(horallegadaempaque) +" "+df.format(Tempacado) +" " +df.format(exit));
                numpieza++;
            }
        }
        for(int i=0;i<l.size();i++){
        System.out.println(l.get(i));
        }
        return l;
    }

}
