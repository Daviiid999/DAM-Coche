class Motor{
    private boolean encendido;

    public Motor(){
        this.encendido = false;
    }

    public boolean getEncendido(){
        return this.encendido;
    }

    public void encender(){
        this.encendido = true;
    }

    public void apagar(){
        this.encendido = false;
    }

    public String toString(){
        String resultado = "Motor : Apagado";

        if (this.encendido){
            resultado = "Motor : Encendido";
        }

        return resultado;
    }
}
