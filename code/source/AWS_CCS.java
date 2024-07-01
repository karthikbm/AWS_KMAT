

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
// --- <<IS-END-IMPORTS>> ---

public final class AWS_CCS

{
	// ---( internal utility methods )---

	final static AWS_CCS _instance = new AWS_CCS();

	static AWS_CCS _newInstance() { return new AWS_CCS(); }

	static AWS_CCS _cast(Object o) { return (AWS_CCS)o; }

	// ---( server methods )---




	public static final void getEpochTimeinMilli (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getEpochTimeinMilli)>> ---
		// @sigtype java 3.5
		// [o] field:0:required curEpochTime
		/*
		 * System.out.println( "curEpochTime (toEpochMilli) : " +
		 * Instant.now().toEpochMilli()); ValuesEmulator.put(pipeline, "curEpochTime",
		 * String.valueOf(Instant.now().toEpochMilli()));
		 */
		String randInt = String.valueOf(ThreadLocalRandom.current().nextInt());
		System.out.println( "ThreadLocalRandom.current().nextInt()) : " + randInt);
		ValuesEmulator.put(pipeline, "curEpochTime", randInt);
		// --- <<IS-END>> ---

                
	}
}

