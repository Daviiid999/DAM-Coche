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
    public void abrirVentanaD(){
      this.puertaDelD.getVentana().abrir();
    }


    //Funcion para abrir la puerta que quiera
    public void abrirPuertas(int numero){
      if (numero == 1) {
        this.puertaDelI.abrir();
      }
      else if (numero == 2) {
        this.puertaDelD.abrir();
      }
    }

    //Funcion para abrir la ventana que quiera
    public void abrirVentanas(int numero){
      if (numero == 1) {
        this.puertaDelI.getVentana().abrir();
      }
      else if (numero == 2) {
        this.puertaDelD.getVentana().abrir() ;
      }
    }

    public String toString(){
      return this.motorCoche + "\n" + this.puertaDelD + "\n" + this.puertaDelI + ".";
    }
}
