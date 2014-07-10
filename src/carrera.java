public class carrera {
    //Definir Atributos de la clase
    private corredor [] vecCorredores = null;
    private int cantCorredores = 0;
    private double distancia = 0;
    private String lugar = null;
    
    //Constructores
    public carrera(String parametro1, int parametro2, double parametro3) {
        lugar = parametro1;
        vecCorredores = new corredor[parametro2];
        distancia = parametro3;
        cantCorredores = parametro2;
    }
    
    //Métodos
    public int getCantCorredores(){
        return cantCorredores;
    }
    
    public void setCantCorredores(int numero){
    
        this.cantCorredores = numero;
        
    }
    public double getDistancia(){
        return distancia;
    }
    
    public String getLugar(){
        return lugar;
    }
    
    public void agregarCorredor(int dorsal, String nombre, String equipo, char talla){
        corredor c = new corredor(dorsal, nombre, equipo, talla);
        vecCorredores[cantCorredores] = c;
        cantCorredores ++;
    }
    
    public corredor [] mostrarVectorCorredores(){
        return vecCorredores;
    }
    
    @Override
    public String toString(){
        return ("Nombre: " + this.lugar + "\nKilómetros: " + this.distancia + "\nNúmero de participantes: " + this.cantCorredores);
    }
    
}