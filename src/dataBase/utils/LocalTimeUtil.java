package dataBase.utils;

import java.sql.Time;
import java.time.LocalTime;

public class LocalTimeUtil {
	public static  long currentTime() {
		 //Write logic here
		 LocalTime localTime =LocalTime.now();
		  long cTime =localTime.getHour()*60*60*1000+localTime.getMinute()*60*1000+localTime.getSecond()*1000;
		  return cTime;
	}

	
	public static  long getTimeInMillis(Time timeToBeConverted) {
		  long timeinMillis = timeToBeConverted.getHours()*60*60*1000+timeToBeConverted.getMinutes()*60*1000+timeToBeConverted.getSeconds()*1000;
		  return timeinMillis;
	}
	
	
	
}
