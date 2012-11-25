package com.apple.jobjc.foundation;

public  class NSCalendar extends com.apple.jobjc.foundation.NSObject {
	public NSCalendar(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSCalendar(final NSCalendar obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend calendarIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_calendarIdentifier_IMetInst(){
		return ((calendarIdentifier_IMetInst != null)
	? (calendarIdentifier_IMetInst)
	: (calendarIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "calendarIdentifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString calendarIdentifier(){
			final com.apple.jobjc.Invoke.MsgSend calendarIdentifier_IMetInst = get_calendarIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		calendarIdentifier_IMetInst.init(nativeBuffer, this);
		calendarIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend components_fromDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_components_fromDate_IMetInst(){
		return ((components_fromDate_IMetInst != null)
	? (components_fromDate_IMetInst)
	: (components_fromDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "components:fromDate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDateComponents components_fromDate(final long unitFlags, final com.apple.jobjc.foundation.NSDate date){
			final com.apple.jobjc.Invoke.MsgSend components_fromDate_IMetInst = get_components_fromDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		components_fromDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, unitFlags);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
		components_fromDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDateComponents returnValue = (com.apple.jobjc.foundation.NSDateComponents) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend components_fromDate_toDate_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_components_fromDate_toDate_options_IMetInst(){
		return ((components_fromDate_toDate_options_IMetInst != null)
	? (components_fromDate_toDate_options_IMetInst)
	: (components_fromDate_toDate_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "components:fromDate:toDate:options:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSDateComponents components_fromDate_toDate_options(final long unitFlags, final com.apple.jobjc.foundation.NSDate startingDate, final com.apple.jobjc.foundation.NSDate resultDate, final long opts){
			final com.apple.jobjc.Invoke.MsgSend components_fromDate_toDate_options_IMetInst = get_components_fromDate_toDate_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		components_fromDate_toDate_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, unitFlags);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, startingDate);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, resultDate);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		components_fromDate_toDate_options_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDateComponents returnValue = (com.apple.jobjc.foundation.NSDateComponents) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateByAddingComponents_toDate_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateByAddingComponents_toDate_options_IMetInst(){
		return ((dateByAddingComponents_toDate_options_IMetInst != null)
	? (dateByAddingComponents_toDate_options_IMetInst)
	: (dateByAddingComponents_toDate_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateByAddingComponents:toDate:options:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSDate dateByAddingComponents_toDate_options(final com.apple.jobjc.foundation.NSDateComponents comps, final com.apple.jobjc.foundation.NSDate date, final long opts){
			final com.apple.jobjc.Invoke.MsgSend dateByAddingComponents_toDate_options_IMetInst = get_dateByAddingComponents_toDate_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateByAddingComponents_toDate_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, comps);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		dateByAddingComponents_toDate_options_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateFromComponents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateFromComponents_IMetInst(){
		return ((dateFromComponents_IMetInst != null)
	? (dateFromComponents_IMetInst)
	: (dateFromComponents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateFromComponents:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate dateFromComponents(final com.apple.jobjc.foundation.NSDateComponents comps){
			final com.apple.jobjc.Invoke.MsgSend dateFromComponents_IMetInst = get_dateFromComponents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateFromComponents_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, comps);
		dateFromComponents_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend firstWeekday_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_firstWeekday_IMetInst(){
		return ((firstWeekday_IMetInst != null)
	? (firstWeekday_IMetInst)
	: (firstWeekday_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "firstWeekday", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long firstWeekday(){
			final com.apple.jobjc.Invoke.MsgSend firstWeekday_IMetInst = get_firstWeekday_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		firstWeekday_IMetInst.init(nativeBuffer, this);
		firstWeekday_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCalendarIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCalendarIdentifier_IMetInst(){
		return ((initWithCalendarIdentifier_IMetInst != null)
	? (initWithCalendarIdentifier_IMetInst)
	: (initWithCalendarIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCalendarIdentifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCalendarIdentifier(final com.apple.jobjc.foundation.NSString ident){
			final com.apple.jobjc.Invoke.MsgSend initWithCalendarIdentifier_IMetInst = get_initWithCalendarIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCalendarIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ident);
		initWithCalendarIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend locale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_locale_IMetInst(){
		return ((locale_IMetInst != null)
	? (locale_IMetInst)
	: (locale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "locale", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSLocale locale(){
			final com.apple.jobjc.Invoke.MsgSend locale_IMetInst = get_locale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		locale_IMetInst.init(nativeBuffer, this);
		locale_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSLocale returnValue = (com.apple.jobjc.foundation.NSLocale) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maximumRangeOfUnit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maximumRangeOfUnit_IMetInst(){
		return ((maximumRangeOfUnit_IMetInst != null)
	? (maximumRangeOfUnit_IMetInst)
	: (maximumRangeOfUnit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maximumRangeOfUnit:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRange maximumRangeOfUnit(final long unit){
			final com.apple.jobjc.Invoke.MsgSend maximumRangeOfUnit_IMetInst = get_maximumRangeOfUnit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maximumRangeOfUnit_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, unit);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		maximumRangeOfUnit_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minimumDaysInFirstWeek_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minimumDaysInFirstWeek_IMetInst(){
		return ((minimumDaysInFirstWeek_IMetInst != null)
	? (minimumDaysInFirstWeek_IMetInst)
	: (minimumDaysInFirstWeek_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minimumDaysInFirstWeek", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long minimumDaysInFirstWeek(){
			final com.apple.jobjc.Invoke.MsgSend minimumDaysInFirstWeek_IMetInst = get_minimumDaysInFirstWeek_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minimumDaysInFirstWeek_IMetInst.init(nativeBuffer, this);
		minimumDaysInFirstWeek_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minimumRangeOfUnit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minimumRangeOfUnit_IMetInst(){
		return ((minimumRangeOfUnit_IMetInst != null)
	? (minimumRangeOfUnit_IMetInst)
	: (minimumRangeOfUnit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minimumRangeOfUnit:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRange minimumRangeOfUnit(final long unit){
			final com.apple.jobjc.Invoke.MsgSend minimumRangeOfUnit_IMetInst = get_minimumRangeOfUnit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minimumRangeOfUnit_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, unit);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		minimumRangeOfUnit_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ordinalityOfUnit_inUnit_forDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ordinalityOfUnit_inUnit_forDate_IMetInst(){
		return ((ordinalityOfUnit_inUnit_forDate_IMetInst != null)
	? (ordinalityOfUnit_inUnit_forDate_IMetInst)
	: (ordinalityOfUnit_inUnit_forDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ordinalityOfUnit:inUnit:forDate:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long ordinalityOfUnit_inUnit_forDate(final long smaller, final long larger, final com.apple.jobjc.foundation.NSDate date){
			final com.apple.jobjc.Invoke.MsgSend ordinalityOfUnit_inUnit_forDate_IMetInst = get_ordinalityOfUnit_inUnit_forDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ordinalityOfUnit_inUnit_forDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, smaller);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, larger);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
		ordinalityOfUnit_inUnit_forDate_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeOfUnit_inUnit_forDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeOfUnit_inUnit_forDate_IMetInst(){
		return ((rangeOfUnit_inUnit_forDate_IMetInst != null)
	? (rangeOfUnit_inUnit_forDate_IMetInst)
	: (rangeOfUnit_inUnit_forDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeOfUnit:inUnit:forDate:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRange rangeOfUnit_inUnit_forDate(final long smaller, final long larger, final com.apple.jobjc.foundation.NSDate date){
			final com.apple.jobjc.Invoke.MsgSend rangeOfUnit_inUnit_forDate_IMetInst = get_rangeOfUnit_inUnit_forDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeOfUnit_inUnit_forDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, smaller);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, larger);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeOfUnit_inUnit_forDate_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeOfUnit_startDate_interval_forDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeOfUnit_startDate_interval_forDate_IMetInst(){
		return ((rangeOfUnit_startDate_interval_forDate_IMetInst != null)
	? (rangeOfUnit_startDate_interval_forDate_IMetInst)
	: (rangeOfUnit_startDate_interval_forDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeOfUnit:startDate:interval:forDate:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean rangeOfUnit_startDate_interval_forDate(final long unit, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDate> datep, final com.apple.jobjc.Pointer<java.lang.Double> tip, final com.apple.jobjc.foundation.NSDate date){
			final com.apple.jobjc.Invoke.MsgSend rangeOfUnit_startDate_interval_forDate_IMetInst = get_rangeOfUnit_startDate_interval_forDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeOfUnit_startDate_interval_forDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, unit);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, datep);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, tip);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
		rangeOfUnit_startDate_interval_forDate_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setFirstWeekday_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFirstWeekday_IMetInst(){
		return ((setFirstWeekday_IMetInst != null)
	? (setFirstWeekday_IMetInst)
	: (setFirstWeekday_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFirstWeekday:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setFirstWeekday(final long weekday){
			final com.apple.jobjc.Invoke.MsgSend setFirstWeekday_IMetInst = get_setFirstWeekday_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFirstWeekday_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, weekday);
		setFirstWeekday_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLocale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLocale_IMetInst(){
		return ((setLocale_IMetInst != null)
	? (setLocale_IMetInst)
	: (setLocale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLocale:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setLocale(final com.apple.jobjc.foundation.NSLocale locale){
			final com.apple.jobjc.Invoke.MsgSend setLocale_IMetInst = get_setLocale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLocale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		setLocale_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinimumDaysInFirstWeek_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinimumDaysInFirstWeek_IMetInst(){
		return ((setMinimumDaysInFirstWeek_IMetInst != null)
	? (setMinimumDaysInFirstWeek_IMetInst)
	: (setMinimumDaysInFirstWeek_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinimumDaysInFirstWeek:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setMinimumDaysInFirstWeek(final long mdw){
			final com.apple.jobjc.Invoke.MsgSend setMinimumDaysInFirstWeek_IMetInst = get_setMinimumDaysInFirstWeek_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinimumDaysInFirstWeek_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mdw);
		setMinimumDaysInFirstWeek_IMetInst.invoke(nativeBuffer);
		
		
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

}
