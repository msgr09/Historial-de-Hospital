
package logica;

public class Persona{
    private String apell="Gonzalez Rondon";
    private String nomb="Marlon Santiago"; 
    private String sexo="Masculino" ;
    private int edad=18;
    
public Persona(){
} 

public Persona(String apell,String nomb, String sexo, int edad )
{    
    this.apell = apell;
    this.nomb = nomb;
    this.sexo = sexo;
    this.edad = edad;

}
public String Imprimir()
{
    
    String imprimir = "";

    imprimir = "DATOS DEL PACIENTE:"+"\n Apellidos: "+apell+ "\nNombres: "+nomb+ "\nSexo: "+sexo+"\nEdad: "+edad;
    return imprimir;
    
}

    public String getApell() {
        return apell;
    }

    public void setApell(String apell) {
        this.apell = apell;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
