public class ShowCurrentTime {
    public static void main(String[] args) {
        long totalMilliseconds =System.currentTimeMillis();
        long totalSecond = totalMilliseconds / 1000;
        long currentSecond = totalSecond % 60;
        long totalMinutes = totalSecond / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours %24;
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + "GMT");
    }
}
