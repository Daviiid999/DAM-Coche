class Coche{
    private Motor motorCoche;
    private Puerta puertaDelI;
    private Puerta puertaDelD;

    public Coche(){
      this.motorCoche = new Motor();
      this.puertaDelI = new Puerta();
      this.puertaDelD = new Puerta();
    }

    public Puerta getPuertaDelI(){
      return this.puertaDelI;
    }
    public Puerta getPuertaDelD(){
      return this.puertaDelD;
    }
    public Motor getMotor(){
      return this.motorCoche;
    }
    public void abrirVentanaDelD(){
      this.puertaDelD.getVentana().abrir();
    }
    public void abrirVentanaDelI(){
      this.puertaDelD.getVentana().abrir();
    }

    //Funcion para abrir la puerta que quiera
    public void abrirPuertas(int numero){
      if (numero == 1) {
        System.out.println(miCoche.getPuertaDelI().abrir() + "La puerta delantera izquierda se ha abierto");
      } else if (numero == 2) {
        System.out.println(miCoche.getPuertaDelD().abrir() + "La puerta delantera derecha se ha abierto");
      }
    }

    //Funcion para abrir la ventana que quiera
    public void abrirVentanas(int numero){
      if (numero == 1) {
        System.out.println(miCoche.getPuertaDelI().getVentanaDelD().abrir() + "La ventana delantera izquierda se ha abierto");
      } else if (numero == 2) {
        System.out.println(miCoche.getPuertaDelD().getVentanaDelI().abrir() + "La ventana delantera derecha se ha abierto");
      }
    }

    public String toString(){
      return this.motorCoche + "\n" + this.puertaDelD + "\n" + this.puertaDelI + ".";
    }
}
