class Main {
    public static void main(String[] args) {

        Motor miMotor = new Motor();
        Puerta miPuerta = new Puerta();
        Puerta miPuerta2 = new Puerta();
        Coche miCoche = new Coche();
        Ventana ventanaDerCoxe = new Ventana();
        /*
        System.out.println(miPuerta);
        miPuerta.abrir();
        System.out.println(miPuerta);
        miPuerta.getVentana().abrir();
        System.out.println(miPuerta);
        miPuerta.cerrar();
        System.out.println(miPuerta);
        */
        /*
        miMotor.encender();
        System.out.println(miMotor);
        miPuerta.getVentana().abrir();
        System.out.println(miPuerta);
        miPuerta2.abrir();
        System.out.println(miPuerta2);
        */
        /*
        // Ver el estado de mi motor
        System.out.println(miCoche.getMotor());
        //Para abrir la puerta derecha
        miCoche.getPuertaD().abrir();
        System.out.println(miCoche);
        //Ver como esta la ventana derecha
        System.out.println(miCoche.getPuertaD().getVentana());
        */
        /*
        //Queremos trabajar con la ventana derecha(Crear una variable para no tener que estar repitiendo cada vez q la vamos a imprimir)
        ventanaDerCoxe = miCoche.getPuertaDelD().getVentana();
        ventanaDerCoxe.abrir();
        System.out.println(ventanaDerCoxe);
        ventanaDerCoxe.cerrar();
        System.out.println(ventanaDerCoxe);
        miCoche.abrirVentanaD();
        System.out.println(miCoche);
        */
        System.out.println(abrirPuertas(2));
        System.out.println(abrirVentanas(1));
        //No se imprime porque me da fallos en las funciones y no se como solucionarlos
      }
}
