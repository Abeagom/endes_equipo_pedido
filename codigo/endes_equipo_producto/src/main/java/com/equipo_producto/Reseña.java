
import java.util.*;


/**
 * Class Reseña
 */
public class Reseña {

  //
  // Fields
  //

  private int id;
  private String comentario;
  private int puntuaje;
  
  //
  // Constructors
  //
  public Reseña () { };
  
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
   * Set the value of comentario
   * @param newVar the new value of comentario
   */
  public void setComentario (String newVar) {
    comentario = newVar;
  }

  /**
   * Get the value of comentario
   * @return the value of comentario
   */
  public String getComentario () {
    return comentario;
  }

  /**
   * Set the value of puntuaje
   * @param newVar the new value of puntuaje
   */
  public void setPuntuaje (int newVar) {
    puntuaje = newVar;
  }

  /**
   * Get the value of puntuaje
   * @return the value of puntuaje
   */
  public int getPuntuaje () {
    return puntuaje;
  }

  //
  // Other methods
  //

}
