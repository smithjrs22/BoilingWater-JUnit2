import java.util.Scanner;

public class BoilingWater {
    public static  void main(String[] args){
        int num= inputNum();
        System.out.println(isWaterBoiling(num));
    }
    public static int inputNum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number greater than 212:");
        return input.nextInt();
    }
    public static String isWaterBoiling(int num) {
        if (num > 212) {
            return "Water is boiling!";
        } else if (num == 212) {
            return "Water is not yet boiling";
        } else {
            return "Water is not boiling";
        }
    }
}


