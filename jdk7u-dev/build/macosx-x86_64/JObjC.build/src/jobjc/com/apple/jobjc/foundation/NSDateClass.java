package com.apple.jobjc.foundation;

public  class NSDateClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSDateClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSDateClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSDateClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend date_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_date_CMetInst(){
		return ((date_CMetInst != null)
	? (date_CMetInst)
	: (date_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "date", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T date(){
			final com.apple.jobjc.Invoke.MsgSend date_CMetInst = get_date_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		date_CMetInst.init(nativeBuffer, this);
		date_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateWithNaturalLanguageString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateWithNaturalLanguageString_CMetInst(){
		return ((dateWithNaturalLanguageString_CMetInst != null)
	? (dateWithNaturalLanguageString_CMetInst)
	: (dateWithNaturalLanguageString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateWithNaturalLanguageString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dateWithNaturalLanguageString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend dateWithNaturalLanguageString_CMetInst = get_dateWithNaturalLanguageString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateWithNaturalLanguageString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		dateWithNaturalLanguageString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateWithNaturalLanguageString_locale_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateWithNaturalLanguageString_locale_CMetInst(){
		return ((dateWithNaturalLanguageString_locale_CMetInst != null)
	? (dateWithNaturalLanguageString_locale_CMetInst)
	: (dateWithNaturalLanguageString_locale_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateWithNaturalLanguageString:locale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dateWithNaturalLanguageString_locale(final com.apple.jobjc.foundation.NSString string, final com.apple.jobjc.ID locale){
			final com.apple.jobjc.Invoke.MsgSend dateWithNaturalLanguageString_locale_CMetInst = get_dateWithNaturalLanguageString_locale_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateWithNaturalLanguageString_locale_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		dateWithNaturalLanguageString_locale_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateWithString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateWithString_CMetInst(){
		return ((dateWithString_CMetInst != null)
	? (dateWithString_CMetInst)
	: (dateWithString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateWithString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dateWithString(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend dateWithString_CMetInst = get_dateWithString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateWithString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		dateWithString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateWithTimeInterval_sinceDate_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateWithTimeInterval_sinceDate_CMetInst(){
		return ((dateWithTimeInterval_sinceDate_CMetInst != null)
	? (dateWithTimeInterval_sinceDate_CMetInst)
	: (dateWithTimeInterval_sinceDate_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateWithTimeInterval:sinceDate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dateWithTimeInterval_sinceDate(final double ti, final com.apple.jobjc.foundation.NSDate date){
			final com.apple.jobjc.Invoke.MsgSend dateWithTimeInterval_sinceDate_CMetInst = get_dateWithTimeInterval_sinceDate_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateWithTimeInterval_sinceDate_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, ti);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
		dateWithTimeInterval_sinceDate_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateWithTimeIntervalSince1970_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateWithTimeIntervalSince1970_CMetInst(){
		return ((dateWithTimeIntervalSince1970_CMetInst != null)
	? (dateWithTimeIntervalSince1970_CMetInst)
	: (dateWithTimeIntervalSince1970_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateWithTimeIntervalSince1970:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dateWithTimeIntervalSince1970(final double secs){
			final com.apple.jobjc.Invoke.MsgSend dateWithTimeIntervalSince1970_CMetInst = get_dateWithTimeIntervalSince1970_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateWithTimeIntervalSince1970_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, secs);
		dateWithTimeIntervalSince1970_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateWithTimeIntervalSinceNow_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateWithTimeIntervalSinceNow_CMetInst(){
		return ((dateWithTimeIntervalSinceNow_CMetInst != null)
	? (dateWithTimeIntervalSinceNow_CMetInst)
	: (dateWithTimeIntervalSinceNow_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateWithTimeIntervalSinceNow:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dateWithTimeIntervalSinceNow(final double secs){
			final com.apple.jobjc.Invoke.MsgSend dateWithTimeIntervalSinceNow_CMetInst = get_dateWithTimeIntervalSinceNow_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateWithTimeIntervalSinceNow_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, secs);
		dateWithTimeIntervalSinceNow_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateWithTimeIntervalSinceReferenceDate_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateWithTimeIntervalSinceReferenceDate_CMetInst(){
		return ((dateWithTimeIntervalSinceReferenceDate_CMetInst != null)
	? (dateWithTimeIntervalSinceReferenceDate_CMetInst)
	: (dateWithTimeIntervalSinceReferenceDate_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateWithTimeIntervalSinceReferenceDate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dateWithTimeIntervalSinceReferenceDate(final double secs){
			final com.apple.jobjc.Invoke.MsgSend dateWithTimeIntervalSinceReferenceDate_CMetInst = get_dateWithTimeIntervalSinceReferenceDate_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateWithTimeIntervalSinceReferenceDate_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, secs);
		dateWithTimeIntervalSinceReferenceDate_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend distantFuture_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_distantFuture_CMetInst(){
		return ((distantFuture_CMetInst != null)
	? (distantFuture_CMetInst)
	: (distantFuture_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "distantFuture", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T distantFuture(){
			final com.apple.jobjc.Invoke.MsgSend distantFuture_CMetInst = get_distantFuture_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		distantFuture_CMetInst.init(nativeBuffer, this);
		distantFuture_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend distantPast_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_distantPast_CMetInst(){
		return ((distantPast_CMetInst != null)
	? (distantPast_CMetInst)
	: (distantPast_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "distantPast", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T distantPast(){
			final com.apple.jobjc.Invoke.MsgSend distantPast_CMetInst = get_distantPast_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		distantPast_CMetInst.init(nativeBuffer, this);
		distantPast_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend timeIntervalSinceReferenceDate_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timeIntervalSinceReferenceDate_CMetInst(){
		return ((timeIntervalSinceReferenceDate_CMetInst != null)
	? (timeIntervalSinceReferenceDate_CMetInst)
	: (timeIntervalSinceReferenceDate_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timeIntervalSinceReferenceDate", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double timeIntervalSinceReferenceDate(){
			final com.apple.jobjc.Invoke.MsgSend timeIntervalSinceReferenceDate_CMetInst = get_timeIntervalSinceReferenceDate_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timeIntervalSinceReferenceDate_CMetInst.init(nativeBuffer, this);
		timeIntervalSinceReferenceDate_CMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

}
