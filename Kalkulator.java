
/**
 * Write a description of class Kakulator here.
 *
 * @author hyuhin
 * @version 0.1-20/04/2021
 */
public class Kalkulator
{
    // op1
    public double op1=0;
    public double op2=0;
    public static final String info = "Kalkulatorku Mantappu Djiwa";
    public static int jumlahobject = 0;

    /**
     * Constructor for objects of class Kalkulator
     */
    public Kalkulator()
    {
        // initialise instance variables
        this.jumlahobject += 1;
    }
    
    /**
     * Constructor for objects of class Kalkulator
     * @param  double, double inisialisasi nilai dari op1 dan op2
    */
  
    public Kalkulator(double op1, double op2)
    {
        this.op1 = op1;
        this.op2 = op2;
        this.jumlahobject += 1;
    
    }
    
    /**
     * Constructor for objects of class Kalkulator
     * @param  double, double inisialisasi nilai dari op1 dan op2
    */
  
    public Kalkulator(double op2)
    {
        this.op2 = op2;
        this.jumlahobject += 1;
    
    }
    
    
    
    
    /**
     * set op1
     *
     * @param  double op1  
     * @return  void
     */
    public void setOp1(double op1)
    {
        this.op1 = op1;
    }
    
    /**
     * get op1
     *
     * @param  double op1  
     * @return  void
     */
    public double  getOp1()
    {
        return this.op1;
    }
    
    /**
     * jumlah tanpa parameter
     *
     * @param  
     * @return  double hasil penjumlahan op1 + op2
     */
    public double jumlah() 
    {
        return this.op1 + this.op2;
    }
    
     /**
     * jumlah dengan parameter
     *
     * @param  double op1
     *         double op2
     * @return double hasil penjumlahan op1 + op2
     */
    public double jumlah(double op1, double op2) 
    {
        this.op1 = op1;
        this.op2 = op2;
        return jumlah();
    }
    
    /**
     * kurang tanpa parameter
     *
     * @param  
     * @return  double hasil perkurangan op1 + op2
     */
    public double kurang() 
    {
        return this.op1 - this.op2;
    }
    
     /**
     * kurang dengan parameter
     *
     * @param  double op1
     *         double op2
     * @return double hasil perkurangan op1 - op2
     */
    public double kurang(double op1, double op2) 
    {
        this.op1 = op1;
        this.op2 = op2;
        return kurang();
    }
    
    /**
     * kali tanpa parameter
     *
     * @param  
     * @return  double hasil Perkalian op1 * op2
     */
    public double kali() 
    {
        return this.op1 * this.op2;
    }
    
     /**
     * kali dengan parameter
     *
     * @param  double op1
     *         double op2
     * @return double hasil Perkalian op1 * op2
     */
    public double kali(double op1, double op2) 
    {
        this.op1 = op1;
        this.op2 = op2;
        return kali();
    }
    
    /**
     * bagi tanpa parameter
     *
     * @param  
     * @return  double hasil Pembagian op1 / op2
     */
    public double bagi() 
    {
        return this.op1 / this.op2;
    }
    
     /**
     * bagi dengan parameter
     *
     * @param  double op1
     *         double op2
     * @return double hasil Pembagian op1 * op2
     */
    public double bagi(double op1, double op2) 
    {
        this.op1 = op1;
        this.op2 = op2;
        return bagi();
    }
    
}