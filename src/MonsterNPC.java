/**
 * Created by johndavid on 2/20/17.
 */
public abstract class MonsterNPC {
    public MonsterNPC() {



    }


    public int atkPower(int weaponPower, int foeArmor){
        return (weaponPower - foeArmor);
    }


    public abstract void yourArmor(int arm);

    public abstract void yourStr(int str);

    public abstract void yourHealth(int hp);




    public void speak(){
        System.out.println("I am your end!");
    }



}
