import java.util.ArrayList;

public class Zombie {
    static ArrayList<Zombie> arrayZombiesDataBase = new ArrayList<Zombie>();

    //Atributes
    private String name;
    private int health;
    private int birth;
    private String rh;
    static int i = 0;

    public Zombie(String n, int h, int b, String r){
        this.name = n;
        this.health = h;
        this.birth = b;
        this.rh = r;
        i++;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public int getBirth(){
        return this.birth;
    }

    public String getRh(){
        return this.rh;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setHealth(int n){
        this.health = n;
    }

    public void setBirth(int n){
        this.birth = n;
    }

    public void setRh(String n){
        this.rh = n;
    }

    public static void numeroUno(String n, int h, int b, String r){
        Zombie z = new Zombie(n,h,b,r);
        Zombie.arrayZombiesDataBase.add(z);
    }   

    public static String numeroDos(ArrayList<Zombie> array){
        String info="";
        for(int i=0; i<array.size(); i++){
            info = info + "\n" + array.get(i).getName()+" - "+array.get(i).getHealth()+" - "+array.get(i).getBirth()+
            " - "+array.get(i).getRh();
        }
        return info; 
    }

    public static int numeroTres(){
        return Zombie.i;
    }

    public static String numeroCuatro(ArrayList<Zombie> array){
        String info="";
        for(int i=0; i<array.size(); i++){ 
            if(array.get(i).getRh().equals("AB+")||array.get(i).getRh().equals("O+")){
                info = info + "\n" + array.get(i).getName()+" - "+array.get(i).getHealth()+" - "+array.get(i).getBirth()+
                " - "+array.get(i).getRh();
            }
        }
        return info;  
    }

    public static String numeroCinco(ArrayList<Zombie> array){
        String info="";
        for(int i=0; i<array.size(); i++){ 
            if(array.get(i).getBirth()>2000){
                info = info + "\n" + array.get(i).getName()+" - "+array.get(i).getHealth()+" - "+array.get(i).getBirth()+
                " - "+array.get(i).getRh();
            }
        }
        return info;  
    }

    public static void numeroSeis(ArrayList<Zombie> array){
        for(int i=0; i<array.size(); i++){ 
            int ibomb= array.get(i).getHealth()/2;
            array.get(i).setHealth(ibomb);
        } 
    }

    public static String numeroDoce(ArrayList<Zombie> array, String e){
        String baile="";
        String xd=e;
        for(int i=0; i<array.size(); i++){ 
            if(array.get(i).getRh().equals(e)){
                baile=baile +"El zombie "+array.get(i).getName()+" esta bailando *inserte cancion de Michael Jackson";
                 
            }
        }
        return baile; 
    }
}

