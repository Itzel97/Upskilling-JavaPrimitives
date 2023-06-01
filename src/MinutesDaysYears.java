public class MinutesDaysYears {
    public static void ToDaysAndYears(int minutes) {
        double Days = (double)minutes / 1440.0;
        double Years = (double)minutes / 525600.0;
        System.out.println("" + minutes + " minutes is approximately " + Years + " years and " + Days + " days");
    }
}
