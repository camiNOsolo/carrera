public class corredor  {
        //Definir Atributos de la clase
        private int dorsal = 0;
        private String equipo = null;
        private String nombre = null;
        private char talla = 'M';
        
        //Constructores
        public corredor(int parametro1, String parametro2, String parametro3, char parametro4) {
            dorsal = parametro1;
            equipo = parametro2;
            nombre = parametro3;
            talla = parametro4;
        }
        
        //Métodos
        public int getDorsal(){
            return dorsal;
        }

        public String getEquipo(){
            return equipo;
        }
        
        public String getNombre(){
            return nombre;
        }
        
        public char getTalla(){
            return talla;
        }
        
        @Override
        public String toString(){
            return ("Dorsal: " + dorsal + " Nombre: " + nombre + " Equipo: " + equipo + " Talla camiseta: " + talla);
        }
        
    }