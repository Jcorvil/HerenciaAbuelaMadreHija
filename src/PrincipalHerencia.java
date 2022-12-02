public class PrincipalHerencia {
    public static void  main(String[]args){
        Abuela persona1 = new Abuela();
        System.out.println("La abuela se llama " + persona1.nombre + " " + persona1.apellido1);
        System.out.println(persona1.edad);

        Madre persona2 = new Madre();
        System.out.println(persona2.nombre + " " + persona2.apellido1);
        System.out.println(persona2.estadoCivil);

        Hija persona3 = new Hija();
        System.out.println(persona3.nombre + " " + persona3.apellido1 + " " + persona3.apellido2 + " " + persona3.edad + " " + persona3.estadoCivil);
    }
}