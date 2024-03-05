package AccesoDatos;





public class Empleado {

  
    private int id;
    private String nombre;
    private double salario;

    public Empleado() {
        // Constructor por defecto necesario para Hibernate
    }

    public Empleado(int id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    // Métodos Getter
    public int  getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    // Métodos Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
