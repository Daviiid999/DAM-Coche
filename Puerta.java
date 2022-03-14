class Puerta{
    private boolean estado;
    private Ventana ventana;

    public Puerta(){
        this.estado = false;
        this.ventana = new Ventana();
    }

    public boolean getEstado(){
        return this.estado;
    }

    public Ventana getVentana(){
        return this.ventana;
    }

    public void abrir(){
        this.estado = true;
    }

    public void cerrar(){
        this.estado = false;
    }

    public String toString(){
        String resultado = "Puerta : Cerrada";

        if (this.estado){
            resultado = "Puerta : Abierta";
        }

        return resultado+" | "+this.ventana;
    }

}
