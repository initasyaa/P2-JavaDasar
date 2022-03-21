public class P2B_BlokDanKomentar {
    public static void main(String[] args) {
        float total = 14000;
        System.out.println("Original Investment:$"+total);
        //increases by 40 percent the first year
        total = total+(total*.4F);
        System.out.println("After one years:$"+total);
        //increases by 12 percent the third year
        total = total+(total*.12F);
        System.out.println("After three years:$"+total);
    }
}
