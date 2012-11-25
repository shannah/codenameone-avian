package com.apple.jobjc.foundation;

public  class NSDateComponents extends com.apple.jobjc.foundation.NSObject {
	public NSDateComponents(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDateComponents(final NSDateComponents obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend calendar_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_calendar_IMetInst(){
		return ((calendar_IMetInst != null)
	? (calendar_IMetInst)
	: (calendar_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "calendar", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSCalendar calendar(){
			final com.apple.jobjc.Invoke.MsgSend calendar_IMetInst = get_calendar_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		calendar_IMetInst.init(nativeBuffer, this);
		calendar_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSCalendar returnValue = (com.apple.jobjc.foundation.NSCalendar) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend date_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_date_IMetInst(){
		return ((date_IMetInst != null)
	? (date_IMetInst)
	: (date_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "date", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate date(){
			final com.apple.jobjc.Invoke.MsgSend date_IMetInst = get_date_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		date_IMetInst.init(nativeBuffer, this);
		date_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend day_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_day_IMetInst(){
		return ((day_IMetInst != null)
	? (day_IMetInst)
	: (day_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "day", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long day(){
			final com.apple.jobjc.Invoke.MsgSend day_IMetInst = get_day_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		day_IMetInst.init(nativeBuffer, this);
		day_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend era_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_era_IMetInst(){
		return ((era_IMetInst != null)
	? (era_IMetInst)
	: (era_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "era", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long era(){
			final com.apple.jobjc.Invoke.MsgSend era_IMetInst = get_era_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		era_IMetInst.init(nativeBuffer, this);
		era_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hour_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hour_IMetInst(){
		return ((hour_IMetInst != null)
	? (hour_IMetInst)
	: (hour_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hour", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long hour(){
			final com.apple.jobjc.Invoke.MsgSend hour_IMetInst = get_hour_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hour_IMetInst.init(nativeBuffer, this);
		hour_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isLeapMonth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isLeapMonth_IMetInst(){
		return ((isLeapMonth_IMetInst != null)
	? (isLeapMonth_IMetInst)
	: (isLeapMonth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isLeapMonth", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isLeapMonth(){
			final com.apple.jobjc.Invoke.MsgSend isLeapMonth_IMetInst = get_isLeapMonth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isLeapMonth_IMetInst.init(nativeBuffer, this);
		isLeapMonth_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minute_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minute_IMetInst(){
		return ((minute_IMetInst != null)
	? (minute_IMetInst)
	: (minute_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minute", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long minute(){
			final com.apple.jobjc.Invoke.MsgSend minute_IMetInst = get_minute_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minute_IMetInst.init(nativeBuffer, this);
		minute_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend month_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_month_IMetInst(){
		return ((month_IMetInst != null)
	? (month_IMetInst)
	: (month_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "month", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long month(){
			final com.apple.jobjc.Invoke.MsgSend month_IMetInst = get_month_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		month_IMetInst.init(nativeBuffer, this);
		month_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend quarter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_quarter_IMetInst(){
		return ((quarter_IMetInst != null)
	? (quarter_IMetInst)
	: (quarter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "quarter", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long quarter(){
			final com.apple.jobjc.Invoke.MsgSend quarter_IMetInst = get_quarter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		quarter_IMetInst.init(nativeBuffer, this);
		quarter_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend second_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_second_IMetInst(){
		return ((second_IMetInst != null)
	? (second_IMetInst)
	: (second_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "second", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long second(){
			final com.apple.jobjc.Invoke.MsgSend second_IMetInst = get_second_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		second_IMetInst.init(nativeBuffer, this);
		second_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setCalendar_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCalendar_IMetInst(){
		return ((setCalendar_IMetInst != null)
	? (setCalendar_IMetInst)
	: (setCalendar_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCalendar:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCalendar(final com.apple.jobjc.foundation.NSCalendar cal){
			final com.apple.jobjc.Invoke.MsgSend setCalendar_IMetInst = get_setCalendar_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCalendar_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cal);
		setCalendar_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDay_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDay_IMetInst(){
		return ((setDay_IMetInst != null)
	? (setDay_IMetInst)
	: (setDay_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDay:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setDay(final long v){
			final com.apple.jobjc.Invoke.MsgSend setDay_IMetInst = get_setDay_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDay_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, v);
		setDay_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setEra_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEra_IMetInst(){
		return ((setEra_IMetInst != null)
	? (setEra_IMetInst)
	: (setEra_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEra:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setEra(final long v){
			final com.apple.jobjc.Invoke.MsgSend setEra_IMetInst = get_setEra_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEra_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, v);
		setEra_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHour_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHour_IMetInst(){
		return ((setHour_IMetInst != null)
	? (setHour_IMetInst)
	: (setHour_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHour:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setHour(final long v){
			final com.apple.jobjc.Invoke.MsgSend setHour_IMetInst = get_setHour_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHour_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, v);
		setHour_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLeapMonth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLeapMonth_IMetInst(){
		return ((setLeapMonth_IMetInst != null)
	? (setLeapMonth_IMetInst)
	: (setLeapMonth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLeapMonth:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setLeapMonth(final boolean lm){
			final com.apple.jobjc.Invoke.MsgSend setLeapMonth_IMetInst = get_setLeapMonth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLeapMonth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, lm);
		setLeapMonth_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinute_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinute_IMetInst(){
		return ((setMinute_IMetInst != null)
	? (setMinute_IMetInst)
	: (setMinute_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinute:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setMinute(final long v){
			final com.apple.jobjc.Invoke.MsgSend setMinute_IMetInst = get_setMinute_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinute_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, v);
		setMinute_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMonth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMonth_IMetInst(){
		return ((setMonth_IMetInst != null)
	? (setMonth_IMetInst)
	: (setMonth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMonth:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setMonth(final long v){
			final com.apple.jobjc.Invoke.MsgSend setMonth_IMetInst = get_setMonth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMonth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, v);
		setMonth_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setQuarter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setQuarter_IMetInst(){
		return ((setQuarter_IMetInst != null)
	? (setQuarter_IMetInst)
	: (setQuarter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setQuarter:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setQuarter(final long v){
			final com.apple.jobjc.Invoke.MsgSend setQuarter_IMetInst = get_setQuarter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setQuarter_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, v);
		setQuarter_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSecond_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSecond_IMetInst(){
		return ((setSecond_IMetInst != null)
	? (setSecond_IMetInst)
	: (setSecond_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSecond:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setSecond(final long v){
			final com.apple.jobjc.Invoke.MsgSend setSecond_IMetInst = get_setSecond_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSecond_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, v);
		setSecond_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTimeZone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTimeZone_IMetInst(){
		return ((setTimeZone_IMetInst != null)
	? (setTimeZone_IMetInst)
	: (setTimeZone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTimeZone:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTimeZone(final com.apple.jobjc.foundation.NSTimeZone tz){
			final com.apple.jobjc.Invoke.MsgSend setTimeZone_IMetInst = get_setTimeZone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTimeZone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tz);
		setTimeZone_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWeek_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWeek_IMetInst(){
		return ((setWeek_IMetInst != null)
	? (setWeek_IMetInst)
	: (setWeek_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWeek:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setWeek(final long v){
			final com.apple.jobjc.Invoke.MsgSend setWeek_IMetInst = get_setWeek_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWeek_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, v);
		setWeek_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWeekOfMonth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWeekOfMonth_IMetInst(){
		return ((setWeekOfMonth_IMetInst != null)
	? (setWeekOfMonth_IMetInst)
	: (setWeekOfMonth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWeekOfMonth:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setWeekOfMonth(final long w){
			final com.apple.jobjc.Invoke.MsgSend setWeekOfMonth_IMetInst = get_setWeekOfMonth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWeekOfMonth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, w);
		setWeekOfMonth_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWeekOfYear_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWeekOfYear_IMetInst(){
		return ((setWeekOfYear_IMetInst != null)
	? (setWeekOfYear_IMetInst)
	: (setWeekOfYear_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWeekOfYear:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setWeekOfYear(final long w){
			final com.apple.jobjc.Invoke.MsgSend setWeekOfYear_IMetInst = get_setWeekOfYear_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWeekOfYear_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, w);
		setWeekOfYear_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWeekday_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWeekday_IMetInst(){
		return ((setWeekday_IMetInst != null)
	? (setWeekday_IMetInst)
	: (setWeekday_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWeekday:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setWeekday(final long v){
			final com.apple.jobjc.Invoke.MsgSend setWeekday_IMetInst = get_setWeekday_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWeekday_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, v);
		setWeekday_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWeekdayOrdinal_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWeekdayOrdinal_IMetInst(){
		return ((setWeekdayOrdinal_IMetInst != null)
	? (setWeekdayOrdinal_IMetInst)
	: (setWeekdayOrdinal_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWeekdayOrdinal:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setWeekdayOrdinal(final long v){
			final com.apple.jobjc.Invoke.MsgSend setWeekdayOrdinal_IMetInst = get_setWeekdayOrdinal_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWeekdayOrdinal_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, v);
		setWeekdayOrdinal_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setYear_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setYear_IMetInst(){
		return ((setYear_IMetInst != null)
	? (setYear_IMetInst)
	: (setYear_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setYear:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setYear(final long v){
			final com.apple.jobjc.Invoke.MsgSend setYear_IMetInst = get_setYear_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setYear_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, v);
		setYear_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setYearForWeekOfYear_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setYearForWeekOfYear_IMetInst(){
		return ((setYearForWeekOfYear_IMetInst != null)
	? (setYearForWeekOfYear_IMetInst)
	: (setYearForWeekOfYear_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setYearForWeekOfYear:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setYearForWeekOfYear(final long y){
			final com.apple.jobjc.Invoke.MsgSend setYearForWeekOfYear_IMetInst = get_setYearForWeekOfYear_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setYearForWeekOfYear_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, y);
		setYearForWeekOfYear_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend timeZone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timeZone_IMetInst(){
		return ((timeZone_IMetInst != null)
	? (timeZone_IMetInst)
	: (timeZone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timeZone", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTimeZone timeZone(){
			final com.apple.jobjc.Invoke.MsgSend timeZone_IMetInst = get_timeZone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timeZone_IMetInst.init(nativeBuffer, this);
		timeZone_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTimeZone returnValue = (com.apple.jobjc.foundation.NSTimeZone) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend week_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_week_IMetInst(){
		return ((week_IMetInst != null)
	? (week_IMetInst)
	: (week_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "week", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long week(){
			final com.apple.jobjc.Invoke.MsgSend week_IMetInst = get_week_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		week_IMetInst.init(nativeBuffer, this);
		week_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend weekOfMonth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_weekOfMonth_IMetInst(){
		return ((weekOfMonth_IMetInst != null)
	? (weekOfMonth_IMetInst)
	: (weekOfMonth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "weekOfMonth", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long weekOfMonth(){
			final com.apple.jobjc.Invoke.MsgSend weekOfMonth_IMetInst = get_weekOfMonth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		weekOfMonth_IMetInst.init(nativeBuffer, this);
		weekOfMonth_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend weekOfYear_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_weekOfYear_IMetInst(){
		return ((weekOfYear_IMetInst != null)
	? (weekOfYear_IMetInst)
	: (weekOfYear_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "weekOfYear", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long weekOfYear(){
			final com.apple.jobjc.Invoke.MsgSend weekOfYear_IMetInst = get_weekOfYear_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		weekOfYear_IMetInst.init(nativeBuffer, this);
		weekOfYear_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend weekday_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_weekday_IMetInst(){
		return ((weekday_IMetInst != null)
	? (weekday_IMetInst)
	: (weekday_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "weekday", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long weekday(){
			final com.apple.jobjc.Invoke.MsgSend weekday_IMetInst = get_weekday_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		weekday_IMetInst.init(nativeBuffer, this);
		weekday_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend weekdayOrdinal_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_weekdayOrdinal_IMetInst(){
		return ((weekdayOrdinal_IMetInst != null)
	? (weekdayOrdinal_IMetInst)
	: (weekdayOrdinal_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "weekdayOrdinal", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long weekdayOrdinal(){
			final com.apple.jobjc.Invoke.MsgSend weekdayOrdinal_IMetInst = get_weekdayOrdinal_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		weekdayOrdinal_IMetInst.init(nativeBuffer, this);
		weekdayOrdinal_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend year_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_year_IMetInst(){
		return ((year_IMetInst != null)
	? (year_IMetInst)
	: (year_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "year", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long year(){
			final com.apple.jobjc.Invoke.MsgSend year_IMetInst = get_year_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		year_IMetInst.init(nativeBuffer, this);
		year_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend yearForWeekOfYear_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_yearForWeekOfYear_IMetInst(){
		return ((yearForWeekOfYear_IMetInst != null)
	? (yearForWeekOfYear_IMetInst)
	: (yearForWeekOfYear_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "yearForWeekOfYear", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long yearForWeekOfYear(){
			final com.apple.jobjc.Invoke.MsgSend yearForWeekOfYear_IMetInst = get_yearForWeekOfYear_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		yearForWeekOfYear_IMetInst.init(nativeBuffer, this);
		yearForWeekOfYear_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
