
package vo;

/**
 * Clase Objeto donde almacenamos todos los atributos del objeto Frances que referencia a la tabla Frances de la base de datos
 * @author manue
 */
public class Frances {
    
    private String original;
    private String traduccion;
    private String letra;

    /**
     * Constructor de la clase con los distintos atributos y parametros
     * @param original Referencia a la palabra en frances
     * @param traduccion Referencia a la palabra traducida al español
     * @param letra  Referencia a la primera letra de la palabra original
     */
    public Frances(String original, String traduccion, String letra) {
        this.original = original;
        this.traduccion = traduccion;
        this.letra = letra;
    }

    public Frances() {
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getTraduccion() {
        return traduccion;
    }

    public void setTraduccion(String traduccion) {
        this.traduccion = traduccion;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
}
