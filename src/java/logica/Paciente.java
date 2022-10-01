package logica;

public class Paciente extends Persona{
    private int cod = 1315;
    private String direcVivienda = "Calle 3 este #1A-35 sur";
    private String lugAtendido = "Hospital de Patio Bonito";
    private String motConsulta = "Dolor de Cabeza y vomito";
    private String medAtendio = "Deiby Ruiz";
    private String fecha = "12 - Septiembre - 2022";
    
public Paciente() {
    super();
}

public Paciente(String apell,String nomb, String sexo, int edad, int cod, String direcVivienda, String lugAtendido, String motConsulta, String medAtendio, String fecha){

    super (apell, nomb, sexo, edad);
    this.cod = cod;
    this.direcVivienda = direcVivienda;
    this.lugAtendido = lugAtendido;
    this.motConsulta = motConsulta;
    this.medAtendio = medAtendio;
    this.fecha = fecha;
} 

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDirecVivienda() {
        return direcVivienda;
    }

    public void setDirecVivienda(String direcVivienda) {
        this.direcVivienda = direcVivienda;
    }

    public String getLugAtendido() {
        return lugAtendido;
    }

    public void setLugAtendido(String lugAtendido) {
        this.lugAtendido = lugAtendido;
    }

    public String getMotConsulta() {
        return motConsulta;
    }

    public void setMotConsulta(String motConsulta) {
        this.motConsulta = motConsulta;
    }

    public String getMedAtendio() {
        return medAtendio;
    }

    public void setMedAtendio(String medAtendio) {
        this.medAtendio = medAtendio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
   
    @Override
    public String Imprimir() {
        String imp = "";
//         
        imp = "\n Coidgo: "+ cod +"\n Direccion de vivienda: "+direcVivienda+"\n Motivo de consulta: "+motConsulta+"\n Medico que lo atendio: "+medAtendio+"\n Fecha en que fue atendido: "+fecha;
        return imp; 
    }
}
