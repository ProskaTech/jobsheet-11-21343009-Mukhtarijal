/*
 * Crated by 21343009_Mukhtarijal
 */
package Latihan4_Inheritance;

public class DemoOverride2 {
    public static void main(String[] args){
        B obj = new B();
        obj.setA(50);
        obj.setB(150);
        //akan memanggil method yang terdapat pada kelas B
        obj.tampilkanNilai();
    }
}