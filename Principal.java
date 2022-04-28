import java.util.Scanner;

public class Principal {
    public static void run(){
        Scanner sc = new Scanner(System.in);
        
        String menu = " MENU DE ALCALDESA: \n Pulsa la tecla 0 para salir \n "+
         "Pulsa la tecla 1 para registrar un nuevo Zombie \n "+
         "Pulsa la tecla 2 para conocer todos los zombies registrados hasta el momento \n "+
         "Pulsa la tecla 3 para conocer la cantidad total de zombies \n "+
         "Pulsa la tecla 4 para conocer la informacion de todos los zombies con sangre O+ o AB+ \n "+
         "Pulsa la tecla 5 para conocer la informacion de todos los zombies transformados despues del 2000 \n "+
         "Pulsa la tecla 6 para bombardear (Disminuye la vida de todos los zombies a la mitad) \n "+
         "Pulsa la tecla 7 para crear una nueva ubicacion \n "+
         "Pulsa la tecla 8 para conocer todas las ubicaciones creadas hasta el momento \n "+
         "Pulsa la tecla 9 para mostrar la ubicacion mas segura (Menos zombies) \n "+
         "Pulsa la tecla 10 para conocer todas las ubicaciones, de la mas cercana a la mas lejana de Alexandria \n "+
         "Pulsa la tecla 11 para mostrar una frase aleatoria sobre zombies \n "+
         "Pulsa la tecla 12 para Bomber Guy (Destruye a todos los zombies de la ubicacion que ingreses)";
         
         System.out.println(menu);
         int centinel = sc.nextInt();
        
        while(centinel!=0){
            switch(centinel){
                
                case 1: 
                    System.out.println("Ingresa el nombre del nuevo Zombie (Si deseas nombres compuestos, no pongas espacios en blanco, agregalos con _): ");
                    String name = sc.next();
                    System.out.println("Ingresa la salud del nuevo Zombie: (En numeros) ");
                    int health = sc.nextInt();
                    System.out.println("Ingresa el año de transformacion del nuevo Zombie (En numeros):  ");
                    int date = sc.nextInt();
                    System.out.println("Ingresa el tipo de sangre del nuevo Zombie (En mayusculas y todo junto): ");
                    String rh = sc.next();
                    Zombie.numeroUno(name, health, date, rh);
                    System.out.println("Zombie registrado con exito");
                    System.out.println("\n Si desea conocer el menu de nuevo, pulse la tecla 13");
                    centinel = sc.nextInt();
                    break;
                
                case 2: 
                    System.out.println("Info Zombie ");
                    System.out.println(Zombie.numeroDos(Zombie.arrayZombiesDataBase));
                    System.out.println("\n Si desea conocer el menu de nuevo, pulse la tecla 13");
                    centinel = sc.nextInt();
                    break;
                
                case 3:
                    System.out.println("El total de zombies es de:" + Zombie.numeroTres());
                    System.out.println("\n Si desea conocer el menu de nuevo, pulse la tecla 13");
                    centinel = sc.nextInt();
                    break;
                
                case 4: 
                    System.out.println("Info Zombie ");
                    System.out.println(Zombie.numeroCuatro(Zombie.arrayZombiesDataBase));
                    System.out.println("\n Si desea conocer el menu de nuevo, pulse la tecla 13");
                    centinel = sc.nextInt();
                    break;
                    
                case 5:
                    System.out.println("Info Zombie ");
                    System.out.println(Zombie.numeroCinco(Zombie.arrayZombiesDataBase));
                    System.out.println("\n Si desea conocer el menu de nuevo, pulse la tecla 13");
                    centinel = sc.nextInt();
                    break;
                
                case 6: 
                    System.out.println("Bomba lanzada en 3...2...1... ¡Boom!");
                    Zombie.numeroSeis(Zombie.arrayZombiesDataBase);
                    System.out.println("\n Si desea conocer el menu de nuevo, pulse la tecla 13");
                    centinel = sc.nextInt();
                    break;
                    
                case 7:
                    System.out.println("Ingresa el nombre de la nueva ubicacion(Si deseas nombres compuestos, no pongas espacios en blanco, agregalos con _): ");
                    String location = sc.next();
                    System.out.println("Ingresa la distancia de la ubicacion respecto a Alexandria:(En metros, separado por comas) ");
                    float distance = sc.nextFloat();
                    System.out.println("Ingresa la cantidad de zombies en la zona(En numeros):  ");
                    int amount = sc.nextInt();
                    Location.numeroSiete(location, distance, amount);
                    System.out.println("Ubicacion registrada con exito");
                    System.out.println("\n Si desea conocer el menu de nuevo, pulse la tecla 13");
                    centinel = sc.nextInt();
                    break;
                    
                case 8: 
                    System.out.println("Info Location ");
                    System.out.println(Location.numeroOcho(Location.arrayLocationDataBase));
                    System.out.println("\n Si desea conocer el menu de nuevo, pulse la tecla 13");
                    centinel = sc.nextInt();
                    break;
                    
                case 9:
                    System.out.println("La Zona Mas segura Es : ");
                    System.out.println(Location.numeroNueve(Location.arrayLocationDataBase));
                    System.out.println("\n Si desea conocer el menu de nuevo, pulse la tecla 13");
                    centinel = sc.nextInt();
                    break;
                
                case 10:
                    System.out.println("Cercania de zonas ");
                    System.out.println(Location.numeroDiez(Location.arrayLocationDataBase));
                    System.out.println("\n Si desea conocer el menu de nuevo, pulse la tecla 13");
                    centinel = sc.nextInt();
                    break;
                
                case 11: 
                    Location.numeroOnce();
                    System.out.println("\n Si desea conocer el menu de nuevo, pulse la tecla 13");
                    centinel = sc.nextInt();
                    break;
                
                case 12: 
                    System.out.println("Ingrese tipo de sangre");
                    String city = sc.next();
                    Zombie.numeroDoce(Zombie.arrayZombiesDataBase,city);
                    System.out.println("\n Si desea conocer el menu de nuevo, pulse la tecla 13");
                    centinel = sc.nextInt();
                    break;
                    
                case 13: 
                    System.out.println("\n"+menu);
                    centinel = sc.nextInt();
                    break;
                
                default: 
                    System.out.println("Ingresa una opcion valida");
                    System.out.println("\n"+menu);
                    centinel = sc.nextInt();
                    break;
            }
        }
    }
}

