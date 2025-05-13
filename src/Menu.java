import java.util.Scanner;

public class Menu {
    public void mostrarMenu(){
        System.out.println("*************************************************");
        System.out.println("******Bienvenido al convertidor de monedas*******");
        System.out.println("""
                1. USD ->> CLP
                2. CLP ->> USD
                3. USD ->> BRL
                4. BRL ->> USD
                5. CLP ->> BRL
                6. BRL ->> CLP
                7. Consulta Personalizada.
                8. Salir del convertidor.
                """);
        System.out.println("*************************************************");
    }

    public boolean escogerOpcion() {
        Scanner consola = new Scanner(System.in);
        boolean salir = false;

        try{
            System.out.println("Escoja una opcion: ");
            int opcion = Integer.valueOf(consola.nextLine());
            switch (opcion){
                case 1: {
                    String monedaBase = "USD";
                    MonedaAPI monedaAPI = new ConsultaAPI().datosDivisaBase(monedaBase);
                    Moneda USDaCLP = new Moneda(monedaAPI, "CLP");

                    System.out.println("Ingrese la cantidad en " + monedaBase + ": ");
                    double cantidadAConvertir = Double.parseDouble(consola.nextLine());
                    USDaCLP.convertirMonedas(cantidadAConvertir, USDaCLP);
                    return salir = false;

                }
                case 2: {
                    String monedaBase = "CLP";
                    MonedaAPI monedaAPI = new ConsultaAPI().datosDivisaBase(monedaBase);
                    Moneda CLPaUSD = new Moneda(monedaAPI, "USD");

                    System.out.println("Ingrese la cantidad en " + monedaBase + ": ");
                    double cantidadAConvertir = Double.parseDouble(consola.nextLine());
                    CLPaUSD.convertirMonedas(cantidadAConvertir, CLPaUSD);
                    return salir = false;


                }
                case 3: {
                    String monedaBase = "USD";
                    MonedaAPI monedaAPI = new ConsultaAPI().datosDivisaBase(monedaBase);
                    Moneda USDaBRL = new Moneda(monedaAPI, "BRL");

                    System.out.println("Ingrese la cantidad en " + monedaBase + ": ");
                    double cantidadAConvertir = Double.parseDouble(consola.nextLine());
                    USDaBRL.convertirMonedas(cantidadAConvertir, USDaBRL);
                    return  salir = false;


                }
                case 4: {
                    String monedaBase = "BRL";
                    MonedaAPI monedaAPI = new ConsultaAPI().datosDivisaBase(monedaBase);
                    Moneda BRLaUSD = new Moneda(monedaAPI, "USD");

                    System.out.println("Ingrese la cantidad en " + monedaBase + ": ");
                    double cantidadAConvertir = Double.parseDouble(consola.nextLine());
                    BRLaUSD.convertirMonedas(cantidadAConvertir, BRLaUSD);
                    return salir = false;


                }
                case 5:{
                    String monedaBase = "CLP";
                    MonedaAPI monedaAPI = new ConsultaAPI().datosDivisaBase(monedaBase);
                    Moneda CLPaBRL = new Moneda(monedaAPI, "BRL");

                    System.out.println("Ingrese la cantidad en " + monedaBase + ": ");
                    double cantidadAConvertir = Double.parseDouble(consola.nextLine());
                    CLPaBRL.convertirMonedas(cantidadAConvertir, CLPaBRL);
                    return salir = false;

                }
                case 6:{
                    String monedaBase = "BRL";
                    MonedaAPI monedaAPI = new ConsultaAPI().datosDivisaBase(monedaBase);
                    Moneda BRLaCLP = new Moneda(monedaAPI, "CLP");

                    System.out.println("Ingrese la cantidad en " + monedaBase + ": ");
                    double cantidadAConvertir = Double.parseDouble(consola.nextLine());
                    BRLaCLP.convertirMonedas(cantidadAConvertir, BRLaCLP);
                    return salir = false;

                }
                case 7: {
                    System.out.println("Ingrese la Moneda Base: ");
                    String monedaBase = consola.nextLine();
                    MonedaAPI monedaAPI = new ConsultaAPI().datosDivisaBase(monedaBase);
                    System.out.println("Ingrese la Moneda a Convertir: ");
                    String monedaAConvertir = consola.nextLine();
                    Moneda cambioDivisas = new Moneda(monedaAPI, monedaAConvertir);

                    System.out.println("Ingrese la cantidad en " + monedaBase + ": ");
                    double cantidadAConvertir = Double.parseDouble(consola.nextLine());
                    cambioDivisas.convertirMonedas(cantidadAConvertir, cambioDivisas);
                    return salir = false;

                }
                case 8:{
                    System.out.println("Saliendo del programa...");
                    System.out.println("Saliste del programa. Hasta pronto!");
                    return  salir = true;
                }
            }
            return salir;
        } catch (Exception e){
            System.out.println("Ingresa un valor valido. ");
            return salir = false;
        }

    }
}


