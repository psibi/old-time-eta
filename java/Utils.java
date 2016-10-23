package ghcvm.oldtime;

import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;
import java.text.SimpleDateFormat;

public class Utils {

    public static long getClockTimePrim() {
        Date date = new Date();
        return date.getTime();
    }

    public static long getTimeInMillis(Calendar cal) {
        return cal.getTimeInMillis();
    }
    
    public static String getMonth(long millis) {
        return new SimpleDateFormat("MMMM").format(new Date(millis));
    }

    public static String getDayOfWeek(long millis) {
        return new SimpleDateFormat("EEEE").format(new Date(millis));
    }
    
    public static boolean getIsDST() {
        return TimeZone.getDefault().inDaylightTime( new Date() );    
    }

    public static String getTZ() {
        return TimeZone.getDefault().getDisplayName();
    }
    
    public static int getCtTz(long millis) {
        // Returns milliseconds - so you have to convert it to seconds
        return TimeZone.getDefault().getOffset(millis);
    }
    
    public static Calendar setTimeInMillis(long millis) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(millis);
        return cal;
    }
}
