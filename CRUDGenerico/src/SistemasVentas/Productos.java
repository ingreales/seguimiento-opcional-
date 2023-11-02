package SistemasVentas;

public class Productos <T>{
    private  String nombreProducto;
    private int cedula;
    private  int id;

    public Productos(String nombreProducto, int cedula, int id) {
        this.nombreProducto = nombreProducto;
        this.cedula = cedula;
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return"nombre del Producto= '" + nombreProducto + '\'' +
                ", cedula=" + cedula +
                ", id=" + id
                ;
    }
}
