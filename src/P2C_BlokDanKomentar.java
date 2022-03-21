public class P2C_BlokDanKomentar {
    public static void main(String[] args) {
        int x = 4, y=-8, z=7;
        System.out.println("x= "+x);
        System.out.println("y= "+y);
        System.out.println("");

        System.out.println("x= "+ ++x);
        System.out.println("y= "+ y++);
        System.out.println("");

        System.out.println("x= "+ x--);
        System.out.println("x= "+ --y);
        System.out.println("");

        System.out.println(-x++ - y++ + ++z *x);
        System.out.println(x);
        System.out.println(y);
    }
}
