import com.sun.org.apache.xpath.internal.operations.String;

class Sobaka {
    int age;
    double weight;
    java.lang.String name;
    java.lang.String color;

}
class SobakaDemo    {
    public static void main(String[] args) {
        Sobaka  Sharik = new Sobaka();
        Sobaka  Drugok = new Sobaka();

        Sharik.age = 4;
        Sharik.weight = 9;
        Sharik.name = "Sharik";
        Sharik.color = "Black";

        Drugok.age = 7;
        Drugok.weight = 19;
        Drugok.name = "Drugok";
        Drugok.color = "Коричневый";

        System.out.println("Первой собаке " + Sharik.age + " года");
        System.out.println("Она весит " + Sharik.weight + " кг");
        System.out.println("Ее зовут " + Sharik.name);
        System.out.println("Она имеет " + Sharik.color + " Окрас");
        System.out.println("");
        System.out.println("Второй собаке " + Drugok.age + " лет");
        System.out.println("Она весит " + Sharik.weight + " кг" );
        System.out.println("Ее зовут " + Drugok.name);
        System.out.println("Она имеет " + Drugok.color + " окрас");
    }
}
