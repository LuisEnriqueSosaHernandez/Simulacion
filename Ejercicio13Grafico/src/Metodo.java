
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LESH
 */
public class Metodo {
    public ArrayList datos(){
    int cont=1;
      ArrayList<String> piezas=new ArrayList<String>();
      Random  rnd = new Random();
      Pieza1 p=new Pieza1();
       DecimalFormat df = new DecimalFormat("0.0000"); 

double horallegada=0;
double tiempollegadatorno=0;
double tiempotardatorno=0;
double tiemposalidatorno=0;
double horasalidatorno=0;
double transporteinspeccion=0;
double horallegadainspeccion=0;
double tiempoinspector=0;
double salidainpeccion=0;

                 horallegada=-8*Math.log(1-rnd.nextDouble());

         tiempollegadatorno=4+1*(p.sumatoria()-6)*rnd.nextDouble();
              tiempotardatorno=-3*Math.log(1-rnd.nextDouble());
          horasalidatorno=horallegada+tiempollegadatorno+tiempotardatorno;
               transporteinspeccion=3+5*rnd.nextDouble();
             horallegadainspeccion=horasalidatorno+transporteinspeccion;
tiempoinspector=4+4*rnd.nextDouble();
salidainpeccion=horallegadainspeccion+tiempoinspector;

    
     String s=Integer.toString(cont)+" "+df.format(horallegada)+" "+df.format(tiempollegadatorno)+" "+df.format(tiempotardatorno)+" "+df.format(horasalidatorno)+" "+df.format(transporteinspeccion)+" "+df.format(horallegadainspeccion)+" "+df.format(tiempoinspector)+" "+df.format(salidainpeccion);
     piezas.add(s);
     while(cont<50&&salidainpeccion<480){
         cont++;
        horallegada=horallegada+(-8*Math.log(1-rnd.nextDouble()));

    tiempollegadatorno=tiempollegadatorno+(4+1*(p.sumatoria()-6)*rnd.nextDouble());
           tiempotardatorno=-3*Math.log(1-rnd.nextDouble());
        horasalidatorno=horallegada+tiempollegadatorno+tiempotardatorno;
          transporteinspeccion=3+5*rnd.nextDouble();
            horallegadainspeccion=horasalidatorno+transporteinspeccion;
           tiempoinspector=4+4*rnd.nextDouble();
            salidainpeccion=horallegadainspeccion+tiempoinspector;

    if(salidainpeccion<480){
         s=Integer.toString(cont)+" "+df.format(horallegada)+" "+df.format(tiempollegadatorno)+" "+df.format(tiempotardatorno)+" "+df.format(horasalidatorno)+" "+df.format(transporteinspeccion)+" "+df.format(horallegadainspeccion)+" "+df.format(tiempoinspector)+" "+df.format(salidainpeccion);
      piezas.add(s);
     }else{
        
    }
     }
     
     return piezas;
}
}

class Pieza1{
public double sumatoria(){
    double sum=0;
    Random  rnd = new Random();
    for(int i=0;i<12;i++){
        sum+=rnd.nextDouble();
       
    }
    return sum;
}
}
