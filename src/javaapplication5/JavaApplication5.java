import java.util.Date;
class JavaApplication5 {
    static int tetraedron(int x,int y, int z){
        return x*y*z;
    }
    static int cube(int x){
        return x*x*x;
    }
   
    public static void main(String[] args) {
        int result = JavaApplication5.tetraedron(8,4,12);
        int result2 = JavaApplication5.cube(12);
        
        Date vmi_time = new Date();
        double etime;
        etime = vmi_time.getTime();
        System.out.println("erdekel h mit ad ki: " +etime);        
        
        
        System.out.println("the result is: " +result);
        System.out.println("the another result is: " +result2);
        
    }
}
//van itt egy erdekesseg a lefutasi ido meresere
//tehat az a lenyeg h krealok egy objektumot a fo szamitasi feladat eleje
//egyet meg a vegen, aztan kiiratom a kulonbseguket
//es az fogja megadni az eltelt idot, kiprobalom a Pi monte carlo szamitasnal