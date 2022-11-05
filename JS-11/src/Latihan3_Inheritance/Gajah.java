/*
 * Crated by 21343009_Mukhtarijal
 */
package Latihan3_Inheritance;

public class Gajah extends Hewan{
    //meng-overwrite method pada class hewan
    public static void testClassMethod(){
        System.out.println("The Class method in Hewan");
    }

    //meng-overwrite method pada class hewan
    public void testIntanceMethode(){
        System.out.println("The Intance methode in Gajah");
    }

    public static void main(String args[]){
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testIntanceMethode();
    }
}
