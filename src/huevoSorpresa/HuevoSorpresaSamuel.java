package huevoSorpresa;

/**
 * Clase que crea huevos sorpresa
 *
 * @author Samuel Daniel Ciocan
 * @since 14/05/2024
 * @version 1.0
 */
public class HuevoSorpresaSamuel {

    private int unidades; //número de huevos que quedan 
    private double precio; //precio actual de un huevo sorpresa
    private String sorpresa; //nombre de la sorpresa que incluye huevo sorpresa
    private double precio_max; //precio máximo que puede tener un huevo sorpresa

    /**
     * Constructor sin parámetros
     */
    public HuevoSorpresaSamuel() {
    }

    /**
     * Constructor que se le pasan parámetros
     *
     * @param unidades Indica la cantidad de huevos que hay
     * @param precio Indica el precio del huevo
     * @param sorpresa Indica la sorpresa que contiene un huevo
     * @param precio_max Indica el precio máximo
     */
    public HuevoSorpresaSamuel(int unidades, double precio, String sorpresa, double precio_max) {
        this.unidades = unidades;
        this.precio = precio;
        this.sorpresa = sorpresa;
        this.precio_max = precio_max;
    }

    /**
     * Método para obtener las unidades
     *
     * @return Devuelve las cantidad de huevos
     */
    public int obtenerUnidades() {
        return this.getUnidades();
    }

    /**
     * Método para obtener el precio
     *
     * @return Devuelve el precio del huevo
     */
    public double obtenerPrecio() {
        return this.getPrecio();
    }

    /**
     * Método para modificar las unidades
     *
     * @param unidades Indica el valor que tendrá las unidades
     */
    public void modificarUnidades(int unidades) {
        this.setUnidades(unidades);
    }

    /**
     * Método para la accion de sacar huevos sorpresa
     *
     * @param unidades Indica cuantas unidades se van a sacar
     * @param dinero Indica el dinero que se introduce
     * @param sorpresa Indica la sorpresa que contiene el huevo
     * @throws Exception Se lanza excepcion cuando no se cumplen las condiciones
     */
    public void sacarHuevosSorpresas(int unidades, double dinero, String sorpresa) throws Exception {
        if (dinero <= 0) {
            throw new Exception("Se necesita una cantidad de dinero positiva");
        }
        if (dinero < (unidades * getPrecio())) {
            throw new Exception("No tiene suficiente dinero");
        }
        if (unidades <= 0) {
            throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
        }
        if (this.getUnidades() < unidades) {
            throw new Exception("No hay suficientes huevos sorpresa en la tienda");
        }
        this.modificarUnidades(this.obtenerUnidades() - unidades);
    }

    /**
     * Método para aumentar el precio de los huevo
     *
     * @param aumento Indica cuanto se quiere aumentar
     * @throws Exception Lanza excpeciones cuando no se cumplen las condiciones
     */
    public void aumentarPrecio(double aumento) throws Exception {
        if (aumento <= 0) {
            throw new Exception("El aumento debe ser positivo");
        }
        if (getPrecio_max() < getPrecio() + aumento) {
            throw new Exception("No se puede superar el precio máximo");
        }
        setPrecio(getPrecio() + aumento);
    }

    /**
     * Método para devolver las unidades
     *
     * @return Devuelve las unidades
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * Método para asignar cuantas unidades hay
     *
     * @param unidades Indica las unidades que se asignarán
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * Método que devuelve el precio
     *
     * @return Devuelve el precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método que asigna el precio de un huevo
     *
     * @param precio Indica el precio que se asignará
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método que devuelve la sorpresa que contiene el huevo
     *
     * @return Devuelve la sorpresa que contiene el huevo
     */
    public String getSorpresa() {
        return sorpresa;
    }

    /**
     * Método que asigna la sorpresa a un huevo
     *
     * @param sorpresa Indica la sorpresa que tendrá el huevo
     */
    public void setSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }

    /**
     * Método que devuelve el precio máximo de un huevo
     *
     * @return Devuelve el precio máximo de un huevo
     */
    public double getPrecio_max() {
        return precio_max;
    }

    /**
     * Método que asigna un precio máximo a un huevo
     *
     * @param precio_max Indica el precio máximo que tendrá un huevo
     */
    public void setPrecio_max(double precio_max) {
        this.precio_max = precio_max;
    }
}
