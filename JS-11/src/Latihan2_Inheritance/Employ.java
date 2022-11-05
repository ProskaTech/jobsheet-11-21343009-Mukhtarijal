/*
 * Crated by 21343009_Mukhtarijal
 */
package Latihan2_Inheritance;

public class Employ extends Person {
    private String noKaryawan;

    //kontruktor
    public Employ (String noKaryawan, String name, int age){
        super(name, age);
        this.noKaryawan = noKaryawan;
    }
    //metode
    public void info(){
        System.out.println("No. Karyawan : " + this.noKaryawan);
        super.info();
    }
}
