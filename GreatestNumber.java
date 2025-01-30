class GreatestNumber {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 78;
        int num3 = 34;
        int greatest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        System.out.println("The greatest number is: " + greatest);
    }
}
