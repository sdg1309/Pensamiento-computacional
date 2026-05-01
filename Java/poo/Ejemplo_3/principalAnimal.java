package poo.Ejemplo_3;

public class principalAnimal {
    public static void main(String[] args) {

        Animal animal = new Animal("Gustavo", "insectos", 3);
        Animal animal2 = new Animal();
        animal2.setNombre("pepito");

        Mamifero mamifero = new Mamifero("Moby Dick", "plancton", 5, 12);
        Caballito caballo = new Caballito("Rocinante", "hierba", 8, 12, "español", 2);

        System.out.println(animal2);
        System.out.println(mamifero);
        System.out.println(animal);
        System.out.println(caballo);
        caballo.setNombre("Rucio");
        caballo.setEjercicio(3);
        System.out.println(caballo);
    }
}
