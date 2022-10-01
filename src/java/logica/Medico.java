package logica;


public class Medico extends Persona
{
    private String especializacionMed = "Urologia";
    
    public Medico() {
    super();
}

public Medico(String apell,String nomb, String sexo, int edad, String especializacionMed){

    super(apell, nomb, sexo, edad);
    this.especializacionMed = especializacionMed;

} 

    public String getEspecializacionMed() {
        return especializacionMed;
    }

    public void setEspecializacionMed(String especializacionMed) {
        this.especializacionMed = especializacionMed;
    }
    @Override
    public String Imprimir() {
        String imp = "";
        //System.out.println("La especializacion del medico es: "+" "+especializacionMed);
        imp = "Especializacion del medico: "+especializacionMed;
        return imp;
    }
}
