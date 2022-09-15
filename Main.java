public class Main {
    public static void main(String[] args) {

    Persona persona1 = new Persona();
    persona1.setEdad(21);
    persona1.setNombre("Jarol Espaillat");
    persona1.setTelefono("849-450-5552");
    System.out.println("***Datos***\nEdad: "+persona1.getEdad()+"\nNombre: "+persona1.getNombre()+"\nTelefono: "+persona1.getTelefono());

    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
}
