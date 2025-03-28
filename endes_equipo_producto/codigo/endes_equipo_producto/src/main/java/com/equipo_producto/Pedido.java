
import java.util.*;


/**
 * Class Pedido
 */
public class Pedido {

  //
  // Fields
  //

  private int id;
  private Date fecha;
  private Producto nuevo_atributo;
  
  //
  // Constructors
  //
  public Pedido () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId () {
    return id;
  }

  /**
   * Set the value of fecha
   * @param newVar the new value of fecha
   */
  public void setFecha (Date newVar) {
    fecha = newVar;
  }

  /**
   * Get the value of fecha
   * @return the value of fecha
   */
  public Date getFecha () {
    return fecha;
  }

  /**
   * Set the value of nuevo_atributo
   * @param newVar the new value of nuevo_atributo
   */
  public void setNuevo_atributo (Producto newVar) {
    nuevo_atributo = newVar;
  }

  /**
   * Get the value of nuevo_atributo
   * @return the value of nuevo_atributo
   */
  public Producto getNuevo_atributo () {
    return nuevo_atributo;
  }

  //
  // Other methods
  //

  /**
   * @param        producto
   * @param        cantidad
   */
  public void agregarProducto(Producto producto, int cantidad)
  {
  }


  /**
   * @param        producto
   */
  public void eliminarProducto(Producto producto)
  {
  }


}
