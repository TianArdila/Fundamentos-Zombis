import java.util.*;
import java.lang.Math;
public class Location {
    
    static ArrayList<Location> arrayLocationDataBase = new ArrayList<>();
 
    private String location;
    private float distance;
    private int amount;

    public Location(String l, float d, int a){
        this.location=l;
        this.distance=d;
        this.amount=a;      
    }

    public String getLocation(){
        return this.location;
    }

    public float getDistance(){
        return this.distance;
    }

    public int getAmount(){
        return this.amount;
    }

        
    public void setLocation(String n){
        this.location = n;
    }

    public void setDistance(float n){
        this.distance = n;
    }

    public void setAmount(int n){
        this.amount = n;
    }

    public static void numeroSiete(String n, float d, int a){
        Location l = new Location(n,d,a);
        Location.arrayLocationDataBase.add(l);
    }   

    public static String numeroOcho(ArrayList<Location> array){
        String info="";
        for(int i=0; i<array.size(); i++){
            info = info + "\n" + array.get(i).getLocation()+" - "+array.get(i).getDistance()+" - "+array.get(i).getAmount();
        }
        return info; 
    }

    public static String numeroNueve(ArrayList<Location> array){
        int min=array.get(0).getAmount();
        Location last= new Location("",0,0);
        for(int i=0; i<array.size(); i++){ 
            if(array.get(i).getAmount()<min){
                min=array.get(i).getAmount();
                last=array.get(i);
            }
        } 
        String result = last.getLocation() + last.getDistance()+ last.getAmount(); 
        return result;
    }

    public static String numeroDiez(ArrayList<Location> array){
        Location[] orderedLocations = new Location[array.size()];
        for (int i = 0; i < array.size(); i++) {
            orderedLocations[i] = array.get(i);
        }
        
        
        for (int i = 0; i < orderedLocations.length; i++) {
            Location minLocation = orderedLocations[i];
            float minDistance = orderedLocations[i].getDistance();
            int minID = i;
            for (int j = i+1; j < orderedLocations.length; j++) {
                if(orderedLocations[j].getDistance()<minDistance){
                    minDistance = orderedLocations[j].getDistance();
                    minLocation = orderedLocations[j];
                    minID = j;
                }
            }
            Location temp = orderedLocations[i];
            orderedLocations[i] = minLocation;
            orderedLocations[minID] = temp;
        }
        
        
        String info="";
        for(int i=0; i<orderedLocations.length; i++){
            info = info + "\n" + orderedLocations[i].getLocation()+" - "+orderedLocations[i].getDistance()+
                    " - "+orderedLocations[i].getAmount();
        }
        return info;
       
        
    }

    public static String numeroOnce(){
        String phrase;
        String random[] = {"Viene por nosotros... Peleamos o Morimos!!!","Podran quitarnos la vida, pero nunca la voluntad",
        "La clave para derrotar a los zombies es dividir... Si divides, vencerás","No es mal momento para arrojar una bomba","Negan es un bastardo!!!"};
        int randomizer = (int) (Math.random()*4);
        phrase = random[randomizer];
        return phrase;
    }
    
    
}



