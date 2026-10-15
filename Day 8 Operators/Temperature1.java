
class Temperature1 {
    public static void main(String args[]) {

        int temMin = 20;
        int temMax = 40;

        int userTemp = Integer.parseInt(args[0]);

        System.out.println("Temperature=" + userTemp);

        System.out.println("Normal Temperature=" +
            (temMin < userTemp && temMax > userTemp));
    }
}

