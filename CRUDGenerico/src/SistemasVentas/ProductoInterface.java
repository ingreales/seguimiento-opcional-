package SistemasVentas;
    public interface ProductoInterface<T> {
        String getNombreProducto();
        void setNombreProducto(String nombreProducto);
        int getCedula();
        void setCedula(int cedula);
        int getId();
        void setId(int id);
    }


