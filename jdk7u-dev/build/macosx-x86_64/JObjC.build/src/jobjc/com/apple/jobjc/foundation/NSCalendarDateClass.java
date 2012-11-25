package com.apple.jobjc.foundation;

public  class NSCalendarDateClass extends com.apple.jobjc.foundation.NSDateClass {
	public NSCalendarDateClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSCalendarDateClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSCalendarDateClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend calendarDate_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_calendarDate_CMetInst(){
		return ((calendarDate_CMetInst != null)
	? (calendarDate_CMetInst)
	: (calendarDate_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "calendarDate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T calendarDate(){
			final com.apple.jobjc.Invoke.MsgSend calendarDate_CMetInst = get_calendarDate_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		calendarDate_CMetInst.init(nativeBuffer, this);
		calendarDate_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateWithString_calendarFormat_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateWithString_calendarFormat_CMetInst(){
		return ((dateWithString_calendarFormat_CMetInst != null)
	? (dateWithString_calendarFormat_CMetInst)
	: (dateWithString_calendarFormat_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateWithString:calendarFormat:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dateWithString_calendarFormat(final com.apple.jobjc.foundation.NSString description, final com.apple.jobjc.foundation.NSString format){
			final com.apple.jobjc.Invoke.MsgSend dateWithString_calendarFormat_CMetInst = get_dateWithString_calendarFormat_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateWithString_calendarFormat_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, description);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		dateWithString_calendarFormat_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateWithString_calendarFormat_locale_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateWithString_calendarFormat_locale_CMetInst(){
		return ((dateWithString_calendarFormat_locale_CMetInst != null)
	? (dateWithString_calendarFormat_locale_CMetInst)
	: (dateWithString_calendarFormat_locale_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateWithString:calendarFormat:locale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dateWithString_calendarFormat_locale(final com.apple.jobjc.foundation.NSString description, final com.apple.jobjc.foundation.NSString format, final com.apple.jobjc.ID locale){
			final com.apple.jobjc.Invoke.MsgSend dateWithString_calendarFormat_locale_CMetInst = get_dateWithString_calendarFormat_locale_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateWithString_calendarFormat_locale_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, description);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		dateWithString_calendarFormat_locale_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateWithYear_month_day_hour_minute_second_timeZone_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateWithYear_month_day_hour_minute_second_timeZone_CMetInst(){
		return ((dateWithYear_month_day_hour_minute_second_timeZone_CMetInst != null)
	? (dateWithYear_month_day_hour_minute_second_timeZone_CMetInst)
	: (dateWithYear_month_day_hour_minute_second_timeZone_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateWithYear:month:day:hour:minute:second:timeZone:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dateWithYear_month_day_hour_minute_second_timeZone(final long year, final long month, final long day, final long hour, final long minute, final long second, final com.apple.jobjc.foundation.NSTimeZone aTimeZone){
			final com.apple.jobjc.Invoke.MsgSend dateWithYear_month_day_hour_minute_second_timeZone_CMetInst = get_dateWithYear_month_day_hour_minute_second_timeZone_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateWithYear_month_day_hour_minute_second_timeZone_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, year);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, month);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, day);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, hour);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, minute);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, second);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aTimeZone);
		dateWithYear_month_day_hour_minute_second_timeZone_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
