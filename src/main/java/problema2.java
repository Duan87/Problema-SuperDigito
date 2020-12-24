//java
/**
 *d
 *
 * @author duanr
 */
public class problema2 {

    public static void main(String[] args) {
        System.out.println(super_digit("148",3));
    }

    public static int super_digit(String d) {
        int a = 0;
        while (d.length() != 1) {//se ejecutara el codigo mientras el valor de la longitud de la variable sea diferente de 1
            a = 0;
            for (int n = 0; n < d.length(); n++) {

                a = a + Character.getNumericValue(d.charAt(n));//obtenemos cada digito, lo convetimos a entero y lo sumamos
            }
            d = Integer.toString(a);//convetimos de nuevo a string para reutilizar el codigo de arriba
        }
        return Integer.parseInt(d);//retornamos el supernumero

    }

    public static int super_digit(String d, int c) {//contructor sobre cargado por si se desea concatenar el mismo valor varias veces
        String f = d;
        for (int l = 0; l < c - 1; l++) {//concatenamos n veces el valor de la cadena
            d = d.concat(f);
        }
        int a = 0;
        while (d.length() != 1) {//repetimos el rpoceso de arriba
            a = 0;
            for (int n = 0; n < d.length(); n++) {

                a = a + Character.getNumericValue(d.charAt(n));
            }
            d = Integer.toString(a);
        }
        return Integer.parseInt(d);
    }
}
