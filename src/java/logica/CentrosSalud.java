package logica;

public class CentrosSalud extends Persona
{
    private String hospitales = "SANTA ANA";
    private String clinica = "";
    private String seguroMed = "SANITAS";

    public CentrosSalud() {
    super();
}

public CentrosSalud(String hospitales, String clinica, String seguroMed){

    
    this.hospitales = hospitales;
    this.clinica = clinica;
    this.seguroMed = seguroMed;

} 


    public String getHospitales() {
        return hospitales;
    }

    public void setHospitales(String hospitales) {
        this.hospitales = hospitales;
    }

    public String getClinica() {
        return clinica;
    }

    public void setClinica(String clinica) {
        this.clinica = clinica;
    }

    public String getSeguroMed() {
        return seguroMed;
    }

    public void setSeguroMed(String seguroMed) {
        this.seguroMed = seguroMed;
    }
    @Override
    public String Imprimir() {
        String imp = "";
//        System.out.println("Hospital/clinica donde fue atendido: "+" "+hospitales);    
//        System.out.println("EPS del paciente: "+" "+seguroMed);
        imp = "Hospital/clinica donde fue atendido: "+hospitales+"EPS del paciente: "+seguroMed;
        return imp;
 
    }
}
