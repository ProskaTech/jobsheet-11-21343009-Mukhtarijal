/*
 * Crated by 21343009_Mukhtarijal
 */
package Latihan6_Inheritace;

public class Bus2 {
    private int penumpang;
    private int maxPenumpang;

    //kontruktor
    public Bus2(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if(temp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }
        else {
            this.penumpang = temp;
        }
    }

    public void cetak(){
        System.out.println("Penumpang bus sekarang : " + penumpang);
        System.out.println("Penumpang maks seharusya : " + maxPenumpang);
    }
}
