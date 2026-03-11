public class Display_Current_Time {
    public static void main (String[] args){
        long seconds = System.currentTimeMillis() / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;

        long current_seconds = seconds % 60;
        long current_minutes = minutes % 60;
        long current_hours = hours % 24;

        System.out.println("Current time is " + current_hours + ":" + current_minutes + ":" + current_seconds);
    }
}
