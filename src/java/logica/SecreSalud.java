package logica;

public class SecreSalud 
{
 public static void main(String[] args) {
        Persona pad = new Persona();
        pad.Imprimir();
        Paciente p = new Paciente();
        p.Imprimir();
        Medico m = new Medico();
        m.Imprimir();
        CentrosSalud c = new CentrosSalud();
        c.Imprimir();
         
    }
      public String informe(){
          
        Persona pad = new Persona();
       
        pad.Imprimir();
        Paciente p = new Paciente();
        p.Imprimir();
        Medico m = new Medico();
        m.Imprimir();
        CentrosSalud c = new CentrosSalud();
        c.Imprimir();
        return pad.getApell() + pad.getSexo();
      }

}
