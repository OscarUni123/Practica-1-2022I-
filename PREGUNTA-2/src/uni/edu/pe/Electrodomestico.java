package uni.edu.pe;

import java.util.Objects;

public class Electrodomestico {
    private String tipo;
    private String codigo;
    private Double precio_base;
    private String color;
    private Character consumo;
    private Double peso;
    private static Integer id = 1000;

    private final String TIPO = "General";
    private final String COLOR = "Blanco";
    private final Character CONSUMO = 'F';
    private final Double PRECIO_BASE = 100.0;
    private final Double PESO =  5.0;

    @Override
    public String toString() {
        return  "#" + id.toString() + '|' +
                "consumo=" + consumo +
                "codigo='" + codigo + '|' +
                "precio_base=" + precio_base + "$|" +
                "color='" + color + '|' +
                "peso=" + peso +
                "gr";
    }

    public boolean comprobarConsumoEnergetico (Character letra) {
        Character[] correctos = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (Character chr : correctos) {
            if (chr == letra){
                return true;
            }
        }
        return false;
    }


    public Double calcularPrecioFinal() {
        double valor_consumo = 0;
        switch (this.consumo) {
            case 'A' -> valor_consumo = 100.0;
            case 'B' -> valor_consumo = 80.0;
            case 'C' -> valor_consumo = 60.0;
            case 'D' -> valor_consumo = 50.0;
            case 'E' -> valor_consumo = 30.0;
            case 'F' -> valor_consumo = 10.0;
        }
        double valor_tamanio;

        if (this.peso < 19.0) {
            valor_tamanio = 10.0;
        } else if (this.peso <  49.0) {
            valor_tamanio = 50.0;
        } else if (this.peso < 79.0) {
            valor_tamanio = 80.0;
        } else {
            valor_tamanio = 100.0;
        }

        return this.precio_base + valor_consumo+ valor_tamanio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Electrodomestico that = (Electrodomestico) o;
        return Objects.equals(tipo, that.tipo) && Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, codigo);
    }

    public Electrodomestico() {
        System.out.println("Ingrese los parámetros");
    }

    public Electrodomestico(String tipo, String codigo, Double precio_base) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.precio_base = precio_base;
        this.color = COLOR;
        this.consumo = CONSUMO;
        this.peso = PESO;
        id += 1;
    }

    public Electrodomestico(String tipo, String codigo, Double precio_base, String color, Character consumo, Double peso) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.precio_base = precio_base;
        this.color = color;
        if (comprobarConsumoEnergetico(consumo)) {
            this.consumo = consumo;
        } else {
            this.consumo = CONSUMO;
        }
        this.peso = peso;
        id += 1;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(Double precio_base) {
        this.precio_base = precio_base;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Electrodomestico.id = id;
    }
}

