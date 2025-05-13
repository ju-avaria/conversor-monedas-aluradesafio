public class Principal {
    public static void main(String[] args) {
        boolean salir = false;
        while (!salir){
            Menu menu = new Menu();
            menu.mostrarMenu();
            salir = menu.escogerOpcion();
        }
    }
}
