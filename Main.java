

    /**
 * class Main 
 *
 * @author hyuhin
 * @version 0.2
 */
public class Main
{
    public static void main(String args[])
    {
       System.out.println(Kalkulator.info);
       
       Kalkulator calculator1 = new Kalkulator();
       Kalkulator calculator2 = new Kalkulator(3,5);
       Kalkulator calculator3 = new Kalkulator(3);
       Kalkulator calculator4 = new Kalkulator();

       System.out.println("");
       System.out.println("Nilai setelah op1 dan op2 diganti");
       
       calculator1.setOp1(10);
       calculator2.setOp1(50);
       calculator3.setOp1(60);
       System.out.println("Nilai op1 Constructor tanpa parameter: "+calculator1.getOp1());
       System.out.println("Nilai op1 Constructor dengan 2 parameter: "+calculator2.getOp1());
       System.out.println("Nilai op1 Constructor dengan 3 parameter: "+calculator3.getOp1());
       
       System.out.println("");
       calculator1.op2 = 5;
       calculator2.op2 = 20;
       calculator3.op2 = 30;
       System.out.println("Nilai op2 Constructor tanpa parameter: "+calculator1.op2);
       System.out.println("Nilai op2 Constructor dengan 2 parameter: "+calculator2.op2);
       System.out.println("Nilai op2 Constructor dengan 3 parameter: "+calculator3.op2);

       System.out.println("");
       System.out.println(Kalkulator.jumlahobject);
       
       System.out.println("");
       double hasil1 = calculator1.jumlah();
       double hasil2 = calculator1.jumlah(3.4, 5.4);
       System.out.println("Hasil penjumlahan method jumlah tanpa parameter: "+ hasil1);
       System.out.println("Hasil penjumlahan method jumlah dengan parameter: "+ hasil2);

       System.out.println("");
       double hasil3 = calculator1.kurang();
       double hasil4 = calculator1.kurang(10, 5);
       System.out.println("Hasil perkurangan method kurang tanpa parameter: "+ hasil3);
       System.out.println("Hasil perkurangan method kurang dengan parameter: "+ hasil4);
    
       System.out.println("");
       double hasil5 = calculator1.kali();
       double hasil6 = calculator1.kali(3, 5);
       System.out.println("Hasil perkalian method kali tanpa parameter: "+ hasil5);
       System.out.println("Hasil perkalian method kali dengan parameter: "+ hasil6);

       System.out.println("");
       double hasil7 = calculator1.bagi();
       double hasil8 = calculator1.bagi(10, 2);
       System.out.println("Hasil Pembagian method bagi tanpa parameter: "+ hasil7);
       System.out.println("Hasil Pembagian method bagi dengan parameter: "+ hasil8);
    
    }
}