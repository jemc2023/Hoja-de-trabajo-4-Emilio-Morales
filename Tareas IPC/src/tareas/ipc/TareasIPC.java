package tareas.ipc;
import java.util.Scanner;


public class TareasIPC {

   
    public static void main(String[] args) {
        
        int numfig;
        double radio, ancho, largo, altura = 0;
        boolean verificador = false;
        
        Figuras esfera = new Figuras();
        Figuras paralelepipedo = new Figuras();
        Figuras cono = new Figuras();
        Figuras cilindro = new Figuras();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escoga un número correspondiente a alguna figura geométrica");
        System.out.println("1- Esfera\n2- Paralelepípedo\n3- Cono\n4- Cilindro\n");
        
        numfig = sc.nextInt();
                
        do {            
          
            switch (numfig) {
            case 1:
                
                System.out.println("Ustede ha escogido la esfera\nPor favor ingrese el valor del radio: ");
                radio = sc.nextDouble();
                
                esfera.area = Math.PI*4*radio*radio;
                esfera.volumen = 4/3*Math.PI*radio*radio*radio;
                esfera.perimetro = 2*Math.PI*radio;
                                
                System.out.println("\nEl área superficial es: "+esfera.getArea());
                System.out.println("El perimetro es: "+esfera.getPerimetro());
                System.out.println("El volúmen es: "+esfera.getVolumen());
                
                verificador = true;
                break;
                
            case 2:
                
                System.out.println("Ustede ha escogido el paralelepípedo\nPor favor ingrese el valor del ancho: ");
                ancho = sc.nextDouble();
                System.out.println("Ingrese el valor del largo: ");
                largo = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura: ");
                altura = sc.nextDouble();
                
                paralelepipedo.area = 2*altura*ancho + 2*ancho*largo + 2*altura*largo;
                paralelepipedo.perimetro = altura*largo;
                paralelepipedo.volumen = altura*ancho*largo;
                
                System.out.println("\nEl área superficial es: " +paralelepipedo.getArea());
                System.out.println("El perimetro es: " +paralelepipedo.getPerimetro());
                System.out.println("El volumen es: " +paralelepipedo.getVolumen());
                
                verificador = true;
                break;
                
            case 3:
                
                System.out.println("Ustede ha escogido el cono\nPor favor ingrese el valor del radio: ");
                radio = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura: ");
                altura = sc.nextDouble();
                
                cono.volumen = Math.PI*radio*radio*altura/3;
                cono.area = Math.PI*radio*(radio+(Math.sqrt(Math.pow(radio, 2)+Math.pow(altura, 2))));
                cono.perimetro = 2*(Math.sqrt(Math.pow(radio, 2)+Math.pow(altura, 2)))+2*radio;
                
                System.out.println("\nEl área superficial es: " +cono.getArea());
                System.out.println("El perimetro es: " +cono.getPerimetro());
                System.out.println("El volumen es: " +cono.getVolumen());
                
                verificador = true;
                break;
            
            case 4: 
                
                System.out.println("Ustede ha escogido el cilindro\nPor favor ingrese el valor del radio: ");
                radio = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura: ");
                altura = sc.nextDouble();
                
                cilindro.volumen = Math.PI*radio*radio*altura;
                cilindro.area = 2*Math.PI*radio*(radio+altura);
                cilindro.perimetro = 2*Math.PI*radio;
                
                System.out.println("\nEl área superficial es: " +cilindro.getArea());
                System.out.println("El perimetro es: " +cilindro.getPerimetro());
                System.out.println("El volumen es: " +cilindro.getVolumen());
                
                verificador = true;
                break;
                
            default:
                System.out.println("Por favor solamente escoga un número de los mostrados anteriormente");
                numfig = sc.nextInt();
            }
            
        } while (verificador == false);
        
        
        
        
        
        
        
        
                        
    }
    
}
