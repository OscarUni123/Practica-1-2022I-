package uni.edu.pe;

public class Contrasenia {
    private float longitud_contrasenia;
    private String clave_contrasenia;

    public float getLongitud_contrasenia() {
        return longitud_contrasenia;
    }

    public void setLongitud_contrasenia(float longitud_contrasenia) {
        this.longitud_contrasenia = longitud_contrasenia;
    }

    public String getClave_contrasenia() {
        return clave_contrasenia;
    }

    public void setClave_contrasenia(String clave_contrasenia) {
        this.clave_contrasenia = clave_contrasenia;
    }

    public boolean esClaveFuerte() {
        if (this.longitud_contrasenia < 10) {
            return false;
        }
        int lower_case = 0;
        int upper_case = 0;
        int numbers = 0;
        char[] str_pwr = this.clave_contrasenia.toCharArray();
        for (Character chr : str_pwr) {
            System.out.println(chr.charValue());
        }
        return true;
    }

    public String generarClave() {
        return "aleatorio";
    }

    public Contrasenia() {
        this.longitud_contrasenia = 8;
    }

    public Contrasenia(float longitud_contrasenia) {
        this.clave_contrasenia = "aleatorio";
    }
}
