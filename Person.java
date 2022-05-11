public class Person implements Comparable<Person> {
    private String nombre;
    private String Apellido;
    public Person(String nombre, String Apellido){
        this.nombre = nombre;
        this.Apellido = Apellido;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellido() {return Apellido;}
    public void setApellido(String apellido) {Apellido = apellido;}

    public boolean equals(Object o) {
        if(o instanceof Person){
            Person p = (Person) o;
            return this.getNombre().equals(p.getNombre());
        }
        return false;
    }
    public int compareTo(Person p) {return this.nombre.compareTo(p.getNombre());}
    public String toString() { return this.getNombre() + " " + this.getApellido();}
}
