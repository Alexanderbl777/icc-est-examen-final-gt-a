package models;
import static java.lang.Integer.compare;
import java.util.List;

public class Maquina implements Comparable<Maquina>{

    private String nombre;
    private String ip;
    private List<Integer> codigos;
    private int subred;
    private int riesgo;
    public Maquina(String nombre, String ip, List<Integer> codigos) {
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = codigos;
    }

   
    private int calcularSubred(){
        ip.split("\\.");
        return Integer.parseInt(ip);
    }
    
    private int calcularRiesgo(){
        int total=0;
        for (Integer i : codigos) {
            if((i%3)==0){
                total += i;
            }
        }
        return total;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getIp() {
        return ip;
    }


    public void setIp(String ip) {
        this.ip = ip;
    }


    public List<Integer> getCodigos() {
        return codigos;
    }


    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }


    public int getSubred() {
        return subred;
    }


    public void setSubred(int subred) {
        this.subred = subred;
    }


    public int getRiesgo() {
        return riesgo;
    }


    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }


    @Override
    public int compareTo(Maquina o) {
        int com = compare(o.getSubred(), this.subred);
        return com;
    }

    
    
    
}
