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
    
    public static int getYear(long millis) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTimeInMillis(millis);
        return rightNow.get(Calendar.YEAR);
    }
    
    public static String getMonth(long millis) {
        return new SimpleDateFormat("MMMM").format(new Date(millis));
    }

    public static int getDayOfMonth(long millis) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTimeInMillis(millis);
        return rightNow.get(Calendar.DAY_OF_MONTH);
    }

    public static int getHour(long millis) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTimeInMillis(millis);
        return rightNow.get(Calendar.HOUR_OF_DAY);
    }

    public static int getMinutes(long millis) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTimeInMillis(millis);
        return rightNow.get(Calendar.MINUTE);
    }

    public static int getSeconds(long millis) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTimeInMillis(millis);
        return rightNow.get(Calendar.SECOND);
    }

    public static String getDayOfWeek(long millis) {
        return new SimpleDateFormat("EEEE").format(new Date(millis));
    }
    
    public static int getDayOfYear(long millis) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTimeInMillis(millis);
        return rightNow.get(Calendar.DAY_OF_YEAR);
    }
    
    public static String getTZ() {
        TimeZone tz = TimeZone.getDefault();
        return tz.getDisplayName();
    } 
    
    public static boolean getIsDST() {
        return TimeZone.getDefault().inDaylightTime( new Date() );    
    }
    
    public static int getCtTz(long millis) {
        // Returns milliseconds - so you have to convert it to seconds
        return TimeZone.getDefault().getOffset(millis);
    }
}
