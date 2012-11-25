package com.apple.jobjc.foundation;

public  class NSDate extends com.apple.jobjc.foundation.NSObject {
	public NSDate(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDate(final NSDate obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addTimeInterval_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addTimeInterval_IMetInst(){
		return ((addTimeInterval_IMetInst != null)
	? (addTimeInterval_IMetInst)
	: (addTimeInterval_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addTimeInterval:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T addTimeInterval(final double seconds){
			final com.apple.jobjc.Invoke.MsgSend addTimeInterval_IMetInst = get_addTimeInterval_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addTimeInterval_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, seconds);
		addTimeInterval_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend compare_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compare_IMetInst(){
		return ((compare_IMetInst != null)
	? (compare_IMetInst)
	: (compare_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compare:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long compare(final com.apple.jobjc.foundation.NSDate other){
			final com.apple.jobjc.Invoke.MsgSend compare_IMetInst = get_compare_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compare_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		compare_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateByAddingTimeInterval_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateByAddingTimeInterval_IMetInst(){
		return ((dateByAddingTimeInterval_IMetInst != null)
	? (dateByAddingTimeInterval_IMetInst)
	: (dateByAddingTimeInterval_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateByAddingTimeInterval:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dateByAddingTimeInterval(final double ti){
			final com.apple.jobjc.Invoke.MsgSend dateByAddingTimeInterval_IMetInst = get_dateByAddingTimeInterval_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateByAddingTimeInterval_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, ti);
		dateByAddingTimeInterval_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateWithCalendarFormat_timeZone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateWithCalendarFormat_timeZone_IMetInst(){
		return ((dateWithCalendarFormat_timeZone_IMetInst != null)
	? (dateWithCalendarFormat_timeZone_IMetInst)
	: (dateWithCalendarFormat_timeZone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateWithCalendarFormat:timeZone:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSCalendarDate dateWithCalendarFormat_timeZone(final com.apple.jobjc.foundation.NSString format, final com.apple.jobjc.foundation.NSTimeZone aTimeZone){
			final com.apple.jobjc.Invoke.MsgSend dateWithCalendarFormat_timeZone_IMetInst = get_dateWithCalendarFormat_timeZone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateWithCalendarFormat_timeZone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aTimeZone);
		dateWithCalendarFormat_timeZone_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSCalendarDate returnValue = (com.apple.jobjc.foundation.NSCalendarDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend description_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_description_IMetInst(){
		return ((description_IMetInst != null)
	? (description_IMetInst)
	: (description_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "description", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString description(){
			final com.apple.jobjc.Invoke.MsgSend description_IMetInst = get_description_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		description_IMetInst.init(nativeBuffer, this);
		description_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptionWithCalendarFormat_timeZone_locale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptionWithCalendarFormat_timeZone_locale_IMetInst(){
		return ((descriptionWithCalendarFormat_timeZone_locale_IMetInst != null)
	? (descriptionWithCalendarFormat_timeZone_locale_IMetInst)
	: (descriptionWithCalendarFormat_timeZone_locale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptionWithCalendarFormat:timeZone:locale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString descriptionWithCalendarFormat_timeZone_locale(final com.apple.jobjc.foundation.NSString format, final com.apple.jobjc.foundation.NSTimeZone aTimeZone, final com.apple.jobjc.ID locale){
			final com.apple.jobjc.Invoke.MsgSend descriptionWithCalendarFormat_timeZone_locale_IMetInst = get_descriptionWithCalendarFormat_timeZone_locale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptionWithCalendarFormat_timeZone_locale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aTimeZone);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		descriptionWithCalendarFormat_timeZone_locale_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend earlierDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_earlierDate_IMetInst(){
		return ((earlierDate_IMetInst != null)
	? (earlierDate_IMetInst)
	: (earlierDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "earlierDate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate earlierDate(final com.apple.jobjc.foundation.NSDate anotherDate){
			final com.apple.jobjc.Invoke.MsgSend earlierDate_IMetInst = get_earlierDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		earlierDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anotherDate);
		earlierDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend init_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_init_IMetInst(){
		return ((init_IMetInst != null)
	? (init_IMetInst)
	: (init_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "init", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T init(){
			final com.apple.jobjc.Invoke.MsgSend init_IMetInst = get_init_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		init_IMetInst.init(nativeBuffer, this);
		init_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend initWithTimeInterval_sinceDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithTimeInterval_sinceDate_IMetInst(){
		return ((initWithTimeInterval_sinceDate_IMetInst != null)
	? (initWithTimeInterval_sinceDate_IMetInst)
	: (initWithTimeInterval_sinceDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithTimeInterval:sinceDate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithTimeInterval_sinceDate(final double secsToBeAdded, final com.apple.jobjc.foundation.NSDate anotherDate){
			final com.apple.jobjc.Invoke.MsgSend initWithTimeInterval_sinceDate_IMetInst = get_initWithTimeInterval_sinceDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithTimeInterval_sinceDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, secsToBeAdded);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anotherDate);
		initWithTimeInterval_sinceDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithTimeIntervalSince1970_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithTimeIntervalSince1970_IMetInst(){
		return ((initWithTimeIntervalSince1970_IMetInst != null)
	? (initWithTimeIntervalSince1970_IMetInst)
	: (initWithTimeIntervalSince1970_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithTimeIntervalSince1970:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithTimeIntervalSince1970(final double ti){
			final com.apple.jobjc.Invoke.MsgSend initWithTimeIntervalSince1970_IMetInst = get_initWithTimeIntervalSince1970_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithTimeIntervalSince1970_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, ti);
		initWithTimeIntervalSince1970_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithTimeIntervalSinceNow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithTimeIntervalSinceNow_IMetInst(){
		return ((initWithTimeIntervalSinceNow_IMetInst != null)
	? (initWithTimeIntervalSinceNow_IMetInst)
	: (initWithTimeIntervalSinceNow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithTimeIntervalSinceNow:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithTimeIntervalSinceNow(final double secs){
			final com.apple.jobjc.Invoke.MsgSend initWithTimeIntervalSinceNow_IMetInst = get_initWithTimeIntervalSinceNow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithTimeIntervalSinceNow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, secs);
		initWithTimeIntervalSinceNow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithTimeIntervalSinceReferenceDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithTimeIntervalSinceReferenceDate_IMetInst(){
		return ((initWithTimeIntervalSinceReferenceDate_IMetInst != null)
	? (initWithTimeIntervalSinceReferenceDate_IMetInst)
	: (initWithTimeIntervalSinceReferenceDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithTimeIntervalSinceReferenceDate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithTimeIntervalSinceReferenceDate(final double secsToBeAdded){
			final com.apple.jobjc.Invoke.MsgSend initWithTimeIntervalSinceReferenceDate_IMetInst = get_initWithTimeIntervalSinceReferenceDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithTimeIntervalSinceReferenceDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, secsToBeAdded);
		initWithTimeIntervalSinceReferenceDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEqualToDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEqualToDate_IMetInst(){
		return ((isEqualToDate_IMetInst != null)
	? (isEqualToDate_IMetInst)
	: (isEqualToDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEqualToDate:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isEqualToDate(final com.apple.jobjc.foundation.NSDate otherDate){
			final com.apple.jobjc.Invoke.MsgSend isEqualToDate_IMetInst = get_isEqualToDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEqualToDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherDate);
		isEqualToDate_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend laterDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_laterDate_IMetInst(){
		return ((laterDate_IMetInst != null)
	? (laterDate_IMetInst)
	: (laterDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "laterDate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate laterDate(final com.apple.jobjc.foundation.NSDate anotherDate){
			final com.apple.jobjc.Invoke.MsgSend laterDate_IMetInst = get_laterDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		laterDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anotherDate);
		laterDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend timeIntervalSince1970_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timeIntervalSince1970_IMetInst(){
		return ((timeIntervalSince1970_IMetInst != null)
	? (timeIntervalSince1970_IMetInst)
	: (timeIntervalSince1970_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timeIntervalSince1970", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double timeIntervalSince1970(){
			final com.apple.jobjc.Invoke.MsgSend timeIntervalSince1970_IMetInst = get_timeIntervalSince1970_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timeIntervalSince1970_IMetInst.init(nativeBuffer, this);
		timeIntervalSince1970_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend timeIntervalSinceDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timeIntervalSinceDate_IMetInst(){
		return ((timeIntervalSinceDate_IMetInst != null)
	? (timeIntervalSinceDate_IMetInst)
	: (timeIntervalSinceDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timeIntervalSinceDate:", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public double timeIntervalSinceDate(final com.apple.jobjc.foundation.NSDate anotherDate){
			final com.apple.jobjc.Invoke.MsgSend timeIntervalSinceDate_IMetInst = get_timeIntervalSinceDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timeIntervalSinceDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anotherDate);
		timeIntervalSinceDate_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend timeIntervalSinceNow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timeIntervalSinceNow_IMetInst(){
		return ((timeIntervalSinceNow_IMetInst != null)
	? (timeIntervalSinceNow_IMetInst)
	: (timeIntervalSinceNow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timeIntervalSinceNow", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double timeIntervalSinceNow(){
			final com.apple.jobjc.Invoke.MsgSend timeIntervalSinceNow_IMetInst = get_timeIntervalSinceNow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timeIntervalSinceNow_IMetInst.init(nativeBuffer, this);
		timeIntervalSinceNow_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend timeIntervalSinceReferenceDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timeIntervalSinceReferenceDate_IMetInst(){
		return ((timeIntervalSinceReferenceDate_IMetInst != null)
	? (timeIntervalSinceReferenceDate_IMetInst)
	: (timeIntervalSinceReferenceDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timeIntervalSinceReferenceDate", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double timeIntervalSinceReferenceDate(){
			final com.apple.jobjc.Invoke.MsgSend timeIntervalSinceReferenceDate_IMetInst = get_timeIntervalSinceReferenceDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timeIntervalSinceReferenceDate_IMetInst.init(nativeBuffer, this);
		timeIntervalSinceReferenceDate_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

}
