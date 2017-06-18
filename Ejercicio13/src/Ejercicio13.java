
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;


public class Ejercicio13 {

   
    public static void main(String[] args) {
        int cont=1;
      ArrayList<Pieza> piezas=new ArrayList<Pieza>();
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

    
     piezas.add(new Pieza(cont,horallegada,tiempollegadatorno,tiempotardatorno,tiemposalidatorno,horasalidatorno,transporteinspeccion,horallegadainspeccion,tiempoinspector,salidainpeccion));
     while(cont<49&&salidainpeccion<480){
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
     piezas.add(new Pieza(cont,horallegada,tiempollegadatorno,tiempotardatorno,tiemposalidatorno,horasalidatorno,transporteinspeccion,horallegadainspeccion,tiempoinspector,salidainpeccion)); 
     
     }else{
        
    }
     }
        System.out.println("Resultados");
        for(int i=0;i<piezas.size();i++){
            System.out.println(piezas.get(i).cont+" "+df.format(piezas.get(i).horallegada)+" "+df.format(piezas.get(i).tiempollegadatorno)+" "+df.format(piezas.get(i).tiempotardatorno)+" "+df.format(piezas.get(i).horasalidatorno)+" "+df.format(piezas.get(i).transporteinspeccion)+" "+df.format(piezas.get(i).horallegadainspeccion)+" "+df.format(piezas.get(i).tiempoinspector)+" "+df.format(piezas.get(i).salidainpeccion));
        }
        
    }
    }
   
class Pieza{
    int cont;
double horallegada;
double tiempollegadatorno;
double tiempotardatorno;
double tiemposalidatorno;
double horasalidatorno;
double transporteinspeccion;
double horallegadainspeccion;
double tiempoinspector;
double salidainpeccion;
String nombre;
public Pieza(int cont,double horallegada,double tiempollegadatorno,double tiempotardatorno,double tiemposalidatorno,double horasalidatorno,double transporteinspeccion,double horallegadainspeccion,double tiempoinspector,double salidainpeccion){
this.cont=cont;
this.horallegada=horallegada;
this.tiempollegadatorno=tiempollegadatorno;
this.tiempotardatorno=tiempotardatorno;
this.tiemposalidatorno=tiemposalidatorno;
this.horasalidatorno=horasalidatorno;
this.transporteinspeccion=transporteinspeccion;
this.horallegadainspeccion=horallegadainspeccion;
this.tiempoinspector=tiempoinspector;
this.salidainpeccion=salidainpeccion;
}
public int cont(){
return cont;
}
public double horallegada(){
return horallegada;
}
public double tiempollegadatorno(){
return tiempollegadatorno;
}
public double tiempotardatorno(){
    return tiempotardatorno;
}
public double tiemposalidatorno(){
return tiemposalidatorno;
}
public double horasalidatorno(){
return horasalidatorno;
}
public double transporteinspeccion(){
return transporteinspeccion;
}
public double horallegadainspeccion(){
return horallegadainspeccion;
}
public double tiempoinspector(){
    return tiempoinspector;
}
public double salidainpeccion(){
return salidainpeccion;
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