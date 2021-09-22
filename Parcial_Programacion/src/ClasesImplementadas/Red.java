
package ClasesImplementadas;

public class Red {
    private String nombrered;
    private char clasered;
    private int nohost;
    private int hostcreado;
    
    public String getNombrered() {
        return nombrered;
    }

    public void setNombrered(String nombrered) {
        this.nombrered = nombrered;
    }

    public char getClasered() {
        return clasered;
    }

    public void setClasered(char clasered) {
        this.clasered = clasered;
    }   
    
    public int getNohost() {
        return nohost;
    }

    public void setNohost(int nohost) {
        this.nohost = nohost;
    }

    public Red(String nombrered, char clasered){
        if (clasered=='A') {
            nohost=3 ;
        }
        else {
            if (clasered=='B') {
            nohost=5 ;
            }
            else {
                if (clasered=='C') {
            nohost=7 ;
                }
        
            }
        }
    }
    public void details() {
        System.out.println("host: "+ Hots.getNombrehost);
    }
    
     public void Hostagregado() {
        this.hostcreado= this.hostcreado+1 ;
    }
      
    public boolean isLimitHost(){
        if (hostcreado>nohost) {
            return true ;
        }
        else {
            return false ;
        }       
    }
     
 


   

}