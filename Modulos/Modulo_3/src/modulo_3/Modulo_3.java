
package modulo_3;


public class Modulo_3 
{

  
    public static void main(String[] args) 
    {
        //Objeto
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Lucas Mendez");
        estudiante.setCuenta("201030010175");
        estudiante.setCarrera("Ing. En Produccion Industrial");
        
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Cuenta: " + estudiante.getCuenta());
        System.out.println("Carrera: " + estudiante.getCarrera());
    }
    
    public static class Estudiante
    {
       private String nombre;
       private String carrera;
       private String cuenta;
       
       //Acceder a Datos
       public String getNombre()
       {
           return nombre;
       }
       public String getCarrera()
       {
           return carrera; 
       }
       
       public String getCuenta()
       {
           return cuenta; 
       }
       
       //Establecer datos
    public void setNombre(String nombre)
       {
           this.nombre = nombre;
       }
    
    public void setCarrera(String carrera)
       {
           this.carrera = carrera;
       }
    
    public void setCuenta(String cuenta)
       {
           this.cuenta = cuenta;
       }
    }   
}
