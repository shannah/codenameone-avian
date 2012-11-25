package com.apple.jobjc.foundation;

public  class NSCalendarDate extends com.apple.jobjc.foundation.NSDate {
	public NSCalendarDate(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSCalendarDate(final NSCalendarDate obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend calendarFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_calendarFormat_IMetInst(){
		return ((calendarFormat_IMetInst != null)
	? (calendarFormat_IMetInst)
	: (calendarFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "calendarFormat", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString calendarFormat(){
			final com.apple.jobjc.Invoke.MsgSend calendarFormat_IMetInst = get_calendarFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		calendarFormat_IMetInst.init(nativeBuffer, this);
		calendarFormat_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateByAddingYears_months_days_hours_minutes_seconds_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateByAddingYears_months_days_hours_minutes_seconds_IMetInst(){
		return ((dateByAddingYears_months_days_hours_minutes_seconds_IMetInst != null)
	? (dateByAddingYears_months_days_hours_minutes_seconds_IMetInst)
	: (dateByAddingYears_months_days_hours_minutes_seconds_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateByAddingYears:months:days:hours:minutes:seconds:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSCalendarDate dateByAddingYears_months_days_hours_minutes_seconds(final long year, final long month, final long day, final long hour, final long minute, final long second){
			final com.apple.jobjc.Invoke.MsgSend dateByAddingYears_months_days_hours_minutes_seconds_IMetInst = get_dateByAddingYears_months_days_hours_minutes_seconds_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateByAddingYears_months_days_hours_minutes_seconds_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, year);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, month);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, day);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, hour);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, minute);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, second);
		dateByAddingYears_months_days_hours_minutes_seconds_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSCalendarDate returnValue = (com.apple.jobjc.foundation.NSCalendarDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dayOfCommonEra_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dayOfCommonEra_IMetInst(){
		return ((dayOfCommonEra_IMetInst != null)
	? (dayOfCommonEra_IMetInst)
	: (dayOfCommonEra_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dayOfCommonEra", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long dayOfCommonEra(){
			final com.apple.jobjc.Invoke.MsgSend dayOfCommonEra_IMetInst = get_dayOfCommonEra_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dayOfCommonEra_IMetInst.init(nativeBuffer, this);
		dayOfCommonEra_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dayOfMonth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dayOfMonth_IMetInst(){
		return ((dayOfMonth_IMetInst != null)
	? (dayOfMonth_IMetInst)
	: (dayOfMonth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dayOfMonth", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long dayOfMonth(){
			final com.apple.jobjc.Invoke.MsgSend dayOfMonth_IMetInst = get_dayOfMonth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dayOfMonth_IMetInst.init(nativeBuffer, this);
		dayOfMonth_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dayOfWeek_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dayOfWeek_IMetInst(){
		return ((dayOfWeek_IMetInst != null)
	? (dayOfWeek_IMetInst)
	: (dayOfWeek_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dayOfWeek", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long dayOfWeek(){
			final com.apple.jobjc.Invoke.MsgSend dayOfWeek_IMetInst = get_dayOfWeek_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dayOfWeek_IMetInst.init(nativeBuffer, this);
		dayOfWeek_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dayOfYear_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dayOfYear_IMetInst(){
		return ((dayOfYear_IMetInst != null)
	? (dayOfYear_IMetInst)
	: (dayOfYear_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dayOfYear", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long dayOfYear(){
			final com.apple.jobjc.Invoke.MsgSend dayOfYear_IMetInst = get_dayOfYear_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dayOfYear_IMetInst.init(nativeBuffer, this);
		dayOfYear_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptionWithCalendarFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptionWithCalendarFormat_IMetInst(){
		return ((descriptionWithCalendarFormat_IMetInst != null)
	? (descriptionWithCalendarFormat_IMetInst)
	: (descriptionWithCalendarFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptionWithCalendarFormat:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString descriptionWithCalendarFormat(final com.apple.jobjc.foundation.NSString format){
			final com.apple.jobjc.Invoke.MsgSend descriptionWithCalendarFormat_IMetInst = get_descriptionWithCalendarFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptionWithCalendarFormat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		descriptionWithCalendarFormat_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptionWithCalendarFormat_locale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptionWithCalendarFormat_locale_IMetInst(){
		return ((descriptionWithCalendarFormat_locale_IMetInst != null)
	? (descriptionWithCalendarFormat_locale_IMetInst)
	: (descriptionWithCalendarFormat_locale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptionWithCalendarFormat:locale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString descriptionWithCalendarFormat_locale(final com.apple.jobjc.foundation.NSString format, final com.apple.jobjc.ID locale){
			final com.apple.jobjc.Invoke.MsgSend descriptionWithCalendarFormat_locale_IMetInst = get_descriptionWithCalendarFormat_locale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptionWithCalendarFormat_locale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		descriptionWithCalendarFormat_locale_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptionWithLocale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptionWithLocale_IMetInst(){
		return ((descriptionWithLocale_IMetInst != null)
	? (descriptionWithLocale_IMetInst)
	: (descriptionWithLocale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptionWithLocale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString descriptionWithLocale(final com.apple.jobjc.ID locale){
			final com.apple.jobjc.Invoke.MsgSend descriptionWithLocale_IMetInst = get_descriptionWithLocale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptionWithLocale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		descriptionWithLocale_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hourOfDay_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hourOfDay_IMetInst(){
		return ((hourOfDay_IMetInst != null)
	? (hourOfDay_IMetInst)
	: (hourOfDay_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hourOfDay", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long hourOfDay(){
			final com.apple.jobjc.Invoke.MsgSend hourOfDay_IMetInst = get_hourOfDay_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hourOfDay_IMetInst.init(nativeBuffer, this);
		hourOfDay_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithString_IMetInst(){
		return ((initWithString_IMetInst != null)
	? (initWithString_IMetInst)
	: (initWithString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithString(final com.apple.jobjc.foundation.NSString description){
			final com.apple.jobjc.Invoke.MsgSend initWithString_IMetInst = get_initWithString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, description);
		initWithString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithString_calendarFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithString_calendarFormat_IMetInst(){
		return ((initWithString_calendarFormat_IMetInst != null)
	? (initWithString_calendarFormat_IMetInst)
	: (initWithString_calendarFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithString:calendarFormat:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithString_calendarFormat(final com.apple.jobjc.foundation.NSString description, final com.apple.jobjc.foundation.NSString format){
			final com.apple.jobjc.Invoke.MsgSend initWithString_calendarFormat_IMetInst = get_initWithString_calendarFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithString_calendarFormat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, description);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		initWithString_calendarFormat_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithString_calendarFormat_locale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithString_calendarFormat_locale_IMetInst(){
		return ((initWithString_calendarFormat_locale_IMetInst != null)
	? (initWithString_calendarFormat_locale_IMetInst)
	: (initWithString_calendarFormat_locale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithString:calendarFormat:locale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithString_calendarFormat_locale(final com.apple.jobjc.foundation.NSString description, final com.apple.jobjc.foundation.NSString format, final com.apple.jobjc.ID locale){
			final com.apple.jobjc.Invoke.MsgSend initWithString_calendarFormat_locale_IMetInst = get_initWithString_calendarFormat_locale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithString_calendarFormat_locale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, description);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		initWithString_calendarFormat_locale_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithYear_month_day_hour_minute_second_timeZone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithYear_month_day_hour_minute_second_timeZone_IMetInst(){
		return ((initWithYear_month_day_hour_minute_second_timeZone_IMetInst != null)
	? (initWithYear_month_day_hour_minute_second_timeZone_IMetInst)
	: (initWithYear_month_day_hour_minute_second_timeZone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithYear:month:day:hour:minute:second:timeZone:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithYear_month_day_hour_minute_second_timeZone(final long year, final long month, final long day, final long hour, final long minute, final long second, final com.apple.jobjc.foundation.NSTimeZone aTimeZone){
			final com.apple.jobjc.Invoke.MsgSend initWithYear_month_day_hour_minute_second_timeZone_IMetInst = get_initWithYear_month_day_hour_minute_second_timeZone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithYear_month_day_hour_minute_second_timeZone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, year);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, month);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, day);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, hour);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, minute);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, second);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aTimeZone);
		initWithYear_month_day_hour_minute_second_timeZone_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minuteOfHour_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minuteOfHour_IMetInst(){
		return ((minuteOfHour_IMetInst != null)
	? (minuteOfHour_IMetInst)
	: (minuteOfHour_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minuteOfHour", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long minuteOfHour(){
			final com.apple.jobjc.Invoke.MsgSend minuteOfHour_IMetInst = get_minuteOfHour_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minuteOfHour_IMetInst.init(nativeBuffer, this);
		minuteOfHour_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend monthOfYear_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_monthOfYear_IMetInst(){
		return ((monthOfYear_IMetInst != null)
	? (monthOfYear_IMetInst)
	: (monthOfYear_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "monthOfYear", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long monthOfYear(){
			final com.apple.jobjc.Invoke.MsgSend monthOfYear_IMetInst = get_monthOfYear_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		monthOfYear_IMetInst.init(nativeBuffer, this);
		monthOfYear_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend secondOfMinute_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_secondOfMinute_IMetInst(){
		return ((secondOfMinute_IMetInst != null)
	? (secondOfMinute_IMetInst)
	: (secondOfMinute_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "secondOfMinute", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long secondOfMinute(){
			final com.apple.jobjc.Invoke.MsgSend secondOfMinute_IMetInst = get_secondOfMinute_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		secondOfMinute_IMetInst.init(nativeBuffer, this);
		secondOfMinute_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setCalendarFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCalendarFormat_IMetInst(){
		return ((setCalendarFormat_IMetInst != null)
	? (setCalendarFormat_IMetInst)
	: (setCalendarFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCalendarFormat:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCalendarFormat(final com.apple.jobjc.foundation.NSString format){
			final com.apple.jobjc.Invoke.MsgSend setCalendarFormat_IMetInst = get_setCalendarFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCalendarFormat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		setCalendarFormat_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTimeZone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTimeZone_IMetInst(){
		return ((setTimeZone_IMetInst != null)
	? (setTimeZone_IMetInst)
	: (setTimeZone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTimeZone:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTimeZone(final com.apple.jobjc.foundation.NSTimeZone aTimeZone){
			final com.apple.jobjc.Invoke.MsgSend setTimeZone_IMetInst = get_setTimeZone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTimeZone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aTimeZone);
		setTimeZone_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend yearOfCommonEra_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_yearOfCommonEra_IMetInst(){
		return ((yearOfCommonEra_IMetInst != null)
	? (yearOfCommonEra_IMetInst)
	: (yearOfCommonEra_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "yearOfCommonEra", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long yearOfCommonEra(){
			final com.apple.jobjc.Invoke.MsgSend yearOfCommonEra_IMetInst = get_yearOfCommonEra_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		yearOfCommonEra_IMetInst.init(nativeBuffer, this);
		yearOfCommonEra_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend years_months_days_hours_minutes_seconds_sinceDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_years_months_days_hours_minutes_seconds_sinceDate_IMetInst(){
		return ((years_months_days_hours_minutes_seconds_sinceDate_IMetInst != null)
	? (years_months_days_hours_minutes_seconds_sinceDate_IMetInst)
	: (years_months_days_hours_minutes_seconds_sinceDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "years:months:days:hours:minutes:seconds:sinceDate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void years_months_days_hours_minutes_seconds_sinceDate(final com.apple.jobjc.Pointer<java.lang.Long> yp, final com.apple.jobjc.Pointer<java.lang.Long> mop, final com.apple.jobjc.Pointer<java.lang.Long> dp, final com.apple.jobjc.Pointer<java.lang.Long> hp, final com.apple.jobjc.Pointer<java.lang.Long> mip, final com.apple.jobjc.Pointer<java.lang.Long> sp, final com.apple.jobjc.foundation.NSCalendarDate date){
			final com.apple.jobjc.Invoke.MsgSend years_months_days_hours_minutes_seconds_sinceDate_IMetInst = get_years_months_days_hours_minutes_seconds_sinceDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		years_months_days_hours_minutes_seconds_sinceDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, yp);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, mop);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dp);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, hp);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, mip);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, sp);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
		years_months_days_hours_minutes_seconds_sinceDate_IMetInst.invoke(nativeBuffer);
		
		
	}

}
