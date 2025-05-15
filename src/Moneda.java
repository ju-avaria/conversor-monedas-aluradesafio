public class Moneda {
    private String monedaBase;
    private String monedaAConvertir;
    private double tasaConversion;
    private double resultadoConversion;

    public Moneda(MonedaAPI moneda , String monedaAConvertir ){
        this.monedaBase = moneda.base_code();
        this.monedaAConvertir = monedaAConvertir;
        this.tasaConversion = moneda.conversion_rates().get(monedaAConvertir);
    }

    public void convertirMonedas(double cantidadAConvertir, Moneda moneda){
        this.resultadoConversion = cantidadAConvertir * moneda.tasaConversion;
        System.out.println(cantidadAConvertir + " " + moneda.monedaBase);
        System.out.println("Convirtiendo a ->> " + moneda.monedaAConvertir);
        System.out.println("Resultado: " + (Math.round(resultadoConversion * 100.0) / 100.0) +
                " " + moneda.monedaAConvertir);
    }
}
