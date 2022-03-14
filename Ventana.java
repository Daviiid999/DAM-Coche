class Ventana{
    private boolean estado;

    public Ventana(){
        this.estado = false;
    }

    public boolean getEstado(){
        return this.estado;
    }

    public void abrir(){
        this.estado = true;
    }

    public void cerrar(){
        this.estado = false;
    }

    public String toString(){
        String resultado = "Ventana : Cerrada";

        if (this.estado){
            resultado = "Ventana : Abierta";
        }

        return resultado;
    }
}
