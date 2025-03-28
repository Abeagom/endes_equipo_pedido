
import java.util.*;


/**
 * Class Producto
 */
public class Producto {

  //
  // Fields
  //

  private int id;
  private String nombre;
  private double precio;
  private Categoria categoria;
  private Pedido nuevo_atributo;
  private Producto nuevo_atributo_1;
  
  //
  // Constructors
  //
  public Producto () { };
  
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
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of precio
   * @param newVar the new value of precio
   */
  public void setPrecio (double newVar) {
    precio = newVar;
  }

  /**
   * Get the value of precio
   * @return the value of precio
   */
  public double getPrecio () {
    return precio;
  }

  /**
   * Set the value of categoria
   * @param newVar the new value of categoria
   */
  public void setCategoria (Categoria newVar) {
    categoria = newVar;
  }

  /**
   * Get the value of categoria
   * @return the value of categoria
   */
  public Categoria getCategoria () {
    return categoria;
  }

  /**
   * Set the value of nuevo_atributo
   * @param newVar the new value of nuevo_atributo
   */
  public void setNuevo_atributo (Pedido newVar) {
    nuevo_atributo = newVar;
  }

  /**
   * Get the value of nuevo_atributo
   * @return the value of nuevo_atributo
   */
  public Pedido getNuevo_atributo () {
    return nuevo_atributo;
  }

  /**
   * Set the value of nuevo_atributo_1
   * @param newVar the new value of nuevo_atributo_1
   */
  public void setNuevo_atributo_1 (Producto newVar) {
    nuevo_atributo_1 = newVar;
  }

  /**
   * Get the value of nuevo_atributo_1
   * @return the value of nuevo_atributo_1
   */
  public Producto getNuevo_atributo_1 () {
    return nuevo_atributo_1;
  }

  //
  // Other methods
  //

  /**
   * @return       List<Producto>
   */
  public List<Producto> obtenerAccesorios()
  {
  }


}
