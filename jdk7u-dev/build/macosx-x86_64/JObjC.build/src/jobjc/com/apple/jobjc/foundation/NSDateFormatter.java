package com.apple.jobjc.foundation;

public  class NSDateFormatter extends com.apple.jobjc.foundation.NSFormatter {
	public NSDateFormatter(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDateFormatter(final NSDateFormatter obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend AMSymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_AMSymbol_IMetInst(){
		return ((AMSymbol_IMetInst != null)
	? (AMSymbol_IMetInst)
	: (AMSymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "AMSymbol", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString AMSymbol(){
			final com.apple.jobjc.Invoke.MsgSend AMSymbol_IMetInst = get_AMSymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		AMSymbol_IMetInst.init(nativeBuffer, this);
		AMSymbol_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend PMSymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_PMSymbol_IMetInst(){
		return ((PMSymbol_IMetInst != null)
	? (PMSymbol_IMetInst)
	: (PMSymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "PMSymbol", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString PMSymbol(){
			final com.apple.jobjc.Invoke.MsgSend PMSymbol_IMetInst = get_PMSymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		PMSymbol_IMetInst.init(nativeBuffer, this);
		PMSymbol_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsNaturalLanguage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsNaturalLanguage_IMetInst(){
		return ((allowsNaturalLanguage_IMetInst != null)
	? (allowsNaturalLanguage_IMetInst)
	: (allowsNaturalLanguage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsNaturalLanguage", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsNaturalLanguage(){
			final com.apple.jobjc.Invoke.MsgSend allowsNaturalLanguage_IMetInst = get_allowsNaturalLanguage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsNaturalLanguage_IMetInst.init(nativeBuffer, this);
		allowsNaturalLanguage_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend dateFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateFormat_IMetInst(){
		return ((dateFormat_IMetInst != null)
	? (dateFormat_IMetInst)
	: (dateFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateFormat", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString dateFormat(){
			final com.apple.jobjc.Invoke.MsgSend dateFormat_IMetInst = get_dateFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateFormat_IMetInst.init(nativeBuffer, this);
		dateFormat_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateFromString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateFromString_IMetInst(){
		return ((dateFromString_IMetInst != null)
	? (dateFromString_IMetInst)
	: (dateFromString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateFromString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate dateFromString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend dateFromString_IMetInst = get_dateFromString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateFromString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		dateFromString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateStyle_IMetInst(){
		return ((dateStyle_IMetInst != null)
	? (dateStyle_IMetInst)
	: (dateStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateStyle", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long dateStyle(){
			final com.apple.jobjc.Invoke.MsgSend dateStyle_IMetInst = get_dateStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateStyle_IMetInst.init(nativeBuffer, this);
		dateStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultDate_IMetInst(){
		return ((defaultDate_IMetInst != null)
	? (defaultDate_IMetInst)
	: (defaultDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultDate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate defaultDate(){
			final com.apple.jobjc.Invoke.MsgSend defaultDate_IMetInst = get_defaultDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultDate_IMetInst.init(nativeBuffer, this);
		defaultDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend doesRelativeDateFormatting_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_doesRelativeDateFormatting_IMetInst(){
		return ((doesRelativeDateFormatting_IMetInst != null)
	? (doesRelativeDateFormatting_IMetInst)
	: (doesRelativeDateFormatting_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "doesRelativeDateFormatting", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean doesRelativeDateFormatting(){
			final com.apple.jobjc.Invoke.MsgSend doesRelativeDateFormatting_IMetInst = get_doesRelativeDateFormatting_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		doesRelativeDateFormatting_IMetInst.init(nativeBuffer, this);
		doesRelativeDateFormatting_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend eraSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_eraSymbols_IMetInst(){
		return ((eraSymbols_IMetInst != null)
	? (eraSymbols_IMetInst)
	: (eraSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "eraSymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray eraSymbols(){
			final com.apple.jobjc.Invoke.MsgSend eraSymbols_IMetInst = get_eraSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		eraSymbols_IMetInst.init(nativeBuffer, this);
		eraSymbols_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend formatterBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_formatterBehavior_IMetInst(){
		return ((formatterBehavior_IMetInst != null)
	? (formatterBehavior_IMetInst)
	: (formatterBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "formatterBehavior", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long formatterBehavior(){
			final com.apple.jobjc.Invoke.MsgSend formatterBehavior_IMetInst = get_formatterBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		formatterBehavior_IMetInst.init(nativeBuffer, this);
		formatterBehavior_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend generatesCalendarDates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_generatesCalendarDates_IMetInst(){
		return ((generatesCalendarDates_IMetInst != null)
	? (generatesCalendarDates_IMetInst)
	: (generatesCalendarDates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "generatesCalendarDates", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean generatesCalendarDates(){
			final com.apple.jobjc.Invoke.MsgSend generatesCalendarDates_IMetInst = get_generatesCalendarDates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		generatesCalendarDates_IMetInst.init(nativeBuffer, this);
		generatesCalendarDates_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getObjectValue_forString_range_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getObjectValue_forString_range_error_IMetInst(){
		return ((getObjectValue_forString_range_error_IMetInst != null)
	? (getObjectValue_forString_range_error_IMetInst)
	: (getObjectValue_forString_range_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getObjectValue:forString:range:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean getObjectValue_forString_range_error(final com.apple.jobjc.Pointer<com.apple.jobjc.ID> obj, final com.apple.jobjc.foundation.NSString string, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRange> rangep, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend getObjectValue_forString_range_error_IMetInst = get_getObjectValue_forString_range_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getObjectValue_forString_range_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, obj);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, rangep);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		getObjectValue_forString_range_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend gregorianStartDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_gregorianStartDate_IMetInst(){
		return ((gregorianStartDate_IMetInst != null)
	? (gregorianStartDate_IMetInst)
	: (gregorianStartDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "gregorianStartDate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate gregorianStartDate(){
			final com.apple.jobjc.Invoke.MsgSend gregorianStartDate_IMetInst = get_gregorianStartDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		gregorianStartDate_IMetInst.init(nativeBuffer, this);
		gregorianStartDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithDateFormat_allowNaturalLanguage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithDateFormat_allowNaturalLanguage_IMetInst(){
		return ((initWithDateFormat_allowNaturalLanguage_IMetInst != null)
	? (initWithDateFormat_allowNaturalLanguage_IMetInst)
	: (initWithDateFormat_allowNaturalLanguage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithDateFormat:allowNaturalLanguage:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithDateFormat_allowNaturalLanguage(final com.apple.jobjc.foundation.NSString format, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend initWithDateFormat_allowNaturalLanguage_IMetInst = get_initWithDateFormat_allowNaturalLanguage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithDateFormat_allowNaturalLanguage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		initWithDateFormat_allowNaturalLanguage_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isLenient_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isLenient_IMetInst(){
		return ((isLenient_IMetInst != null)
	? (isLenient_IMetInst)
	: (isLenient_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isLenient", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isLenient(){
			final com.apple.jobjc.Invoke.MsgSend isLenient_IMetInst = get_isLenient_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isLenient_IMetInst.init(nativeBuffer, this);
		isLenient_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend longEraSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_longEraSymbols_IMetInst(){
		return ((longEraSymbols_IMetInst != null)
	? (longEraSymbols_IMetInst)
	: (longEraSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "longEraSymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray longEraSymbols(){
			final com.apple.jobjc.Invoke.MsgSend longEraSymbols_IMetInst = get_longEraSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		longEraSymbols_IMetInst.init(nativeBuffer, this);
		longEraSymbols_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend monthSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_monthSymbols_IMetInst(){
		return ((monthSymbols_IMetInst != null)
	? (monthSymbols_IMetInst)
	: (monthSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "monthSymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray monthSymbols(){
			final com.apple.jobjc.Invoke.MsgSend monthSymbols_IMetInst = get_monthSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		monthSymbols_IMetInst.init(nativeBuffer, this);
		monthSymbols_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend quarterSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_quarterSymbols_IMetInst(){
		return ((quarterSymbols_IMetInst != null)
	? (quarterSymbols_IMetInst)
	: (quarterSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "quarterSymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray quarterSymbols(){
			final com.apple.jobjc.Invoke.MsgSend quarterSymbols_IMetInst = get_quarterSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		quarterSymbols_IMetInst.init(nativeBuffer, this);
		quarterSymbols_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAMSymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAMSymbol_IMetInst(){
		return ((setAMSymbol_IMetInst != null)
	? (setAMSymbol_IMetInst)
	: (setAMSymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAMSymbol:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAMSymbol(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setAMSymbol_IMetInst = get_setAMSymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAMSymbol_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setAMSymbol_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCalendar_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCalendar_IMetInst(){
		return ((setCalendar_IMetInst != null)
	? (setCalendar_IMetInst)
	: (setCalendar_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCalendar:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCalendar(final com.apple.jobjc.foundation.NSCalendar calendar){
			final com.apple.jobjc.Invoke.MsgSend setCalendar_IMetInst = get_setCalendar_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCalendar_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, calendar);
		setCalendar_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDateFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDateFormat_IMetInst(){
		return ((setDateFormat_IMetInst != null)
	? (setDateFormat_IMetInst)
	: (setDateFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDateFormat:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDateFormat(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setDateFormat_IMetInst = get_setDateFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDateFormat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setDateFormat_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDateStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDateStyle_IMetInst(){
		return ((setDateStyle_IMetInst != null)
	? (setDateStyle_IMetInst)
	: (setDateStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDateStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setDateStyle(final long style){
			final com.apple.jobjc.Invoke.MsgSend setDateStyle_IMetInst = get_setDateStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDateStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, style);
		setDateStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultDate_IMetInst(){
		return ((setDefaultDate_IMetInst != null)
	? (setDefaultDate_IMetInst)
	: (setDefaultDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultDate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDefaultDate(final com.apple.jobjc.foundation.NSDate date){
			final com.apple.jobjc.Invoke.MsgSend setDefaultDate_IMetInst = get_setDefaultDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
		setDefaultDate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDoesRelativeDateFormatting_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDoesRelativeDateFormatting_IMetInst(){
		return ((setDoesRelativeDateFormatting_IMetInst != null)
	? (setDoesRelativeDateFormatting_IMetInst)
	: (setDoesRelativeDateFormatting_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDoesRelativeDateFormatting:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDoesRelativeDateFormatting(final boolean b){
			final com.apple.jobjc.Invoke.MsgSend setDoesRelativeDateFormatting_IMetInst = get_setDoesRelativeDateFormatting_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDoesRelativeDateFormatting_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, b);
		setDoesRelativeDateFormatting_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setEraSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEraSymbols_IMetInst(){
		return ((setEraSymbols_IMetInst != null)
	? (setEraSymbols_IMetInst)
	: (setEraSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEraSymbols:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setEraSymbols(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setEraSymbols_IMetInst = get_setEraSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEraSymbols_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setEraSymbols_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFormatterBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFormatterBehavior_IMetInst(){
		return ((setFormatterBehavior_IMetInst != null)
	? (setFormatterBehavior_IMetInst)
	: (setFormatterBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFormatterBehavior:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setFormatterBehavior(final long behavior){
			final com.apple.jobjc.Invoke.MsgSend setFormatterBehavior_IMetInst = get_setFormatterBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFormatterBehavior_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, behavior);
		setFormatterBehavior_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setGeneratesCalendarDates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setGeneratesCalendarDates_IMetInst(){
		return ((setGeneratesCalendarDates_IMetInst != null)
	? (setGeneratesCalendarDates_IMetInst)
	: (setGeneratesCalendarDates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setGeneratesCalendarDates:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setGeneratesCalendarDates(final boolean b){
			final com.apple.jobjc.Invoke.MsgSend setGeneratesCalendarDates_IMetInst = get_setGeneratesCalendarDates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setGeneratesCalendarDates_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, b);
		setGeneratesCalendarDates_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setGregorianStartDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setGregorianStartDate_IMetInst(){
		return ((setGregorianStartDate_IMetInst != null)
	? (setGregorianStartDate_IMetInst)
	: (setGregorianStartDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setGregorianStartDate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setGregorianStartDate(final com.apple.jobjc.foundation.NSDate date){
			final com.apple.jobjc.Invoke.MsgSend setGregorianStartDate_IMetInst = get_setGregorianStartDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setGregorianStartDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
		setGregorianStartDate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLenient_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLenient_IMetInst(){
		return ((setLenient_IMetInst != null)
	? (setLenient_IMetInst)
	: (setLenient_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLenient:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setLenient(final boolean b){
			final com.apple.jobjc.Invoke.MsgSend setLenient_IMetInst = get_setLenient_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLenient_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, b);
		setLenient_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setLongEraSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLongEraSymbols_IMetInst(){
		return ((setLongEraSymbols_IMetInst != null)
	? (setLongEraSymbols_IMetInst)
	: (setLongEraSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLongEraSymbols:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setLongEraSymbols(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setLongEraSymbols_IMetInst = get_setLongEraSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLongEraSymbols_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setLongEraSymbols_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMonthSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMonthSymbols_IMetInst(){
		return ((setMonthSymbols_IMetInst != null)
	? (setMonthSymbols_IMetInst)
	: (setMonthSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMonthSymbols:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMonthSymbols(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setMonthSymbols_IMetInst = get_setMonthSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMonthSymbols_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setMonthSymbols_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPMSymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPMSymbol_IMetInst(){
		return ((setPMSymbol_IMetInst != null)
	? (setPMSymbol_IMetInst)
	: (setPMSymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPMSymbol:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPMSymbol(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setPMSymbol_IMetInst = get_setPMSymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPMSymbol_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setPMSymbol_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setQuarterSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setQuarterSymbols_IMetInst(){
		return ((setQuarterSymbols_IMetInst != null)
	? (setQuarterSymbols_IMetInst)
	: (setQuarterSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setQuarterSymbols:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setQuarterSymbols(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setQuarterSymbols_IMetInst = get_setQuarterSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setQuarterSymbols_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setQuarterSymbols_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShortMonthSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShortMonthSymbols_IMetInst(){
		return ((setShortMonthSymbols_IMetInst != null)
	? (setShortMonthSymbols_IMetInst)
	: (setShortMonthSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShortMonthSymbols:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setShortMonthSymbols(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setShortMonthSymbols_IMetInst = get_setShortMonthSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShortMonthSymbols_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setShortMonthSymbols_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShortQuarterSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShortQuarterSymbols_IMetInst(){
		return ((setShortQuarterSymbols_IMetInst != null)
	? (setShortQuarterSymbols_IMetInst)
	: (setShortQuarterSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShortQuarterSymbols:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setShortQuarterSymbols(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setShortQuarterSymbols_IMetInst = get_setShortQuarterSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShortQuarterSymbols_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setShortQuarterSymbols_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShortStandaloneMonthSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShortStandaloneMonthSymbols_IMetInst(){
		return ((setShortStandaloneMonthSymbols_IMetInst != null)
	? (setShortStandaloneMonthSymbols_IMetInst)
	: (setShortStandaloneMonthSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShortStandaloneMonthSymbols:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setShortStandaloneMonthSymbols(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setShortStandaloneMonthSymbols_IMetInst = get_setShortStandaloneMonthSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShortStandaloneMonthSymbols_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setShortStandaloneMonthSymbols_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShortStandaloneQuarterSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShortStandaloneQuarterSymbols_IMetInst(){
		return ((setShortStandaloneQuarterSymbols_IMetInst != null)
	? (setShortStandaloneQuarterSymbols_IMetInst)
	: (setShortStandaloneQuarterSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShortStandaloneQuarterSymbols:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setShortStandaloneQuarterSymbols(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setShortStandaloneQuarterSymbols_IMetInst = get_setShortStandaloneQuarterSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShortStandaloneQuarterSymbols_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setShortStandaloneQuarterSymbols_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShortStandaloneWeekdaySymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShortStandaloneWeekdaySymbols_IMetInst(){
		return ((setShortStandaloneWeekdaySymbols_IMetInst != null)
	? (setShortStandaloneWeekdaySymbols_IMetInst)
	: (setShortStandaloneWeekdaySymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShortStandaloneWeekdaySymbols:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setShortStandaloneWeekdaySymbols(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setShortStandaloneWeekdaySymbols_IMetInst = get_setShortStandaloneWeekdaySymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShortStandaloneWeekdaySymbols_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setShortStandaloneWeekdaySymbols_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShortWeekdaySymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShortWeekdaySymbols_IMetInst(){
		return ((setShortWeekdaySymbols_IMetInst != null)
	? (setShortWeekdaySymbols_IMetInst)
	: (setShortWeekdaySymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShortWeekdaySymbols:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setShortWeekdaySymbols(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setShortWeekdaySymbols_IMetInst = get_setShortWeekdaySymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShortWeekdaySymbols_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setShortWeekdaySymbols_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setStandaloneMonthSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStandaloneMonthSymbols_IMetInst(){
		return ((setStandaloneMonthSymbols_IMetInst != null)
	? (setStandaloneMonthSymbols_IMetInst)
	: (setStandaloneMonthSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStandaloneMonthSymbols:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setStandaloneMonthSymbols(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setStandaloneMonthSymbols_IMetInst = get_setStandaloneMonthSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStandaloneMonthSymbols_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setStandaloneMonthSymbols_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setStandaloneQuarterSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStandaloneQuarterSymbols_IMetInst(){
		return ((setStandaloneQuarterSymbols_IMetInst != null)
	? (setStandaloneQuarterSymbols_IMetInst)
	: (setStandaloneQuarterSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStandaloneQuarterSymbols:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setStandaloneQuarterSymbols(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setStandaloneQuarterSymbols_IMetInst = get_setStandaloneQuarterSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStandaloneQuarterSymbols_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setStandaloneQuarterSymbols_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setStandaloneWeekdaySymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStandaloneWeekdaySymbols_IMetInst(){
		return ((setStandaloneWeekdaySymbols_IMetInst != null)
	? (setStandaloneWeekdaySymbols_IMetInst)
	: (setStandaloneWeekdaySymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStandaloneWeekdaySymbols:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setStandaloneWeekdaySymbols(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setStandaloneWeekdaySymbols_IMetInst = get_setStandaloneWeekdaySymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStandaloneWeekdaySymbols_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setStandaloneWeekdaySymbols_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTimeStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTimeStyle_IMetInst(){
		return ((setTimeStyle_IMetInst != null)
	? (setTimeStyle_IMetInst)
	: (setTimeStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTimeStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setTimeStyle(final long style){
			final com.apple.jobjc.Invoke.MsgSend setTimeStyle_IMetInst = get_setTimeStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTimeStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, style);
		setTimeStyle_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setTwoDigitStartDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTwoDigitStartDate_IMetInst(){
		return ((setTwoDigitStartDate_IMetInst != null)
	? (setTwoDigitStartDate_IMetInst)
	: (setTwoDigitStartDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTwoDigitStartDate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTwoDigitStartDate(final com.apple.jobjc.foundation.NSDate date){
			final com.apple.jobjc.Invoke.MsgSend setTwoDigitStartDate_IMetInst = get_setTwoDigitStartDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTwoDigitStartDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
		setTwoDigitStartDate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVeryShortMonthSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVeryShortMonthSymbols_IMetInst(){
		return ((setVeryShortMonthSymbols_IMetInst != null)
	? (setVeryShortMonthSymbols_IMetInst)
	: (setVeryShortMonthSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVeryShortMonthSymbols:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setVeryShortMonthSymbols(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setVeryShortMonthSymbols_IMetInst = get_setVeryShortMonthSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVeryShortMonthSymbols_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setVeryShortMonthSymbols_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVeryShortStandaloneMonthSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVeryShortStandaloneMonthSymbols_IMetInst(){
		return ((setVeryShortStandaloneMonthSymbols_IMetInst != null)
	? (setVeryShortStandaloneMonthSymbols_IMetInst)
	: (setVeryShortStandaloneMonthSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVeryShortStandaloneMonthSymbols:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setVeryShortStandaloneMonthSymbols(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setVeryShortStandaloneMonthSymbols_IMetInst = get_setVeryShortStandaloneMonthSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVeryShortStandaloneMonthSymbols_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setVeryShortStandaloneMonthSymbols_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVeryShortStandaloneWeekdaySymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVeryShortStandaloneWeekdaySymbols_IMetInst(){
		return ((setVeryShortStandaloneWeekdaySymbols_IMetInst != null)
	? (setVeryShortStandaloneWeekdaySymbols_IMetInst)
	: (setVeryShortStandaloneWeekdaySymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVeryShortStandaloneWeekdaySymbols:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setVeryShortStandaloneWeekdaySymbols(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setVeryShortStandaloneWeekdaySymbols_IMetInst = get_setVeryShortStandaloneWeekdaySymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVeryShortStandaloneWeekdaySymbols_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setVeryShortStandaloneWeekdaySymbols_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVeryShortWeekdaySymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVeryShortWeekdaySymbols_IMetInst(){
		return ((setVeryShortWeekdaySymbols_IMetInst != null)
	? (setVeryShortWeekdaySymbols_IMetInst)
	: (setVeryShortWeekdaySymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVeryShortWeekdaySymbols:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setVeryShortWeekdaySymbols(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setVeryShortWeekdaySymbols_IMetInst = get_setVeryShortWeekdaySymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVeryShortWeekdaySymbols_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setVeryShortWeekdaySymbols_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWeekdaySymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWeekdaySymbols_IMetInst(){
		return ((setWeekdaySymbols_IMetInst != null)
	? (setWeekdaySymbols_IMetInst)
	: (setWeekdaySymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWeekdaySymbols:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setWeekdaySymbols(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setWeekdaySymbols_IMetInst = get_setWeekdaySymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWeekdaySymbols_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setWeekdaySymbols_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend shortMonthSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shortMonthSymbols_IMetInst(){
		return ((shortMonthSymbols_IMetInst != null)
	? (shortMonthSymbols_IMetInst)
	: (shortMonthSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shortMonthSymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray shortMonthSymbols(){
			final com.apple.jobjc.Invoke.MsgSend shortMonthSymbols_IMetInst = get_shortMonthSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shortMonthSymbols_IMetInst.init(nativeBuffer, this);
		shortMonthSymbols_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend shortQuarterSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shortQuarterSymbols_IMetInst(){
		return ((shortQuarterSymbols_IMetInst != null)
	? (shortQuarterSymbols_IMetInst)
	: (shortQuarterSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shortQuarterSymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray shortQuarterSymbols(){
			final com.apple.jobjc.Invoke.MsgSend shortQuarterSymbols_IMetInst = get_shortQuarterSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shortQuarterSymbols_IMetInst.init(nativeBuffer, this);
		shortQuarterSymbols_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend shortStandaloneMonthSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shortStandaloneMonthSymbols_IMetInst(){
		return ((shortStandaloneMonthSymbols_IMetInst != null)
	? (shortStandaloneMonthSymbols_IMetInst)
	: (shortStandaloneMonthSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shortStandaloneMonthSymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray shortStandaloneMonthSymbols(){
			final com.apple.jobjc.Invoke.MsgSend shortStandaloneMonthSymbols_IMetInst = get_shortStandaloneMonthSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shortStandaloneMonthSymbols_IMetInst.init(nativeBuffer, this);
		shortStandaloneMonthSymbols_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend shortStandaloneQuarterSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shortStandaloneQuarterSymbols_IMetInst(){
		return ((shortStandaloneQuarterSymbols_IMetInst != null)
	? (shortStandaloneQuarterSymbols_IMetInst)
	: (shortStandaloneQuarterSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shortStandaloneQuarterSymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray shortStandaloneQuarterSymbols(){
			final com.apple.jobjc.Invoke.MsgSend shortStandaloneQuarterSymbols_IMetInst = get_shortStandaloneQuarterSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shortStandaloneQuarterSymbols_IMetInst.init(nativeBuffer, this);
		shortStandaloneQuarterSymbols_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend shortStandaloneWeekdaySymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shortStandaloneWeekdaySymbols_IMetInst(){
		return ((shortStandaloneWeekdaySymbols_IMetInst != null)
	? (shortStandaloneWeekdaySymbols_IMetInst)
	: (shortStandaloneWeekdaySymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shortStandaloneWeekdaySymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray shortStandaloneWeekdaySymbols(){
			final com.apple.jobjc.Invoke.MsgSend shortStandaloneWeekdaySymbols_IMetInst = get_shortStandaloneWeekdaySymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shortStandaloneWeekdaySymbols_IMetInst.init(nativeBuffer, this);
		shortStandaloneWeekdaySymbols_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend shortWeekdaySymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shortWeekdaySymbols_IMetInst(){
		return ((shortWeekdaySymbols_IMetInst != null)
	? (shortWeekdaySymbols_IMetInst)
	: (shortWeekdaySymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shortWeekdaySymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray shortWeekdaySymbols(){
			final com.apple.jobjc.Invoke.MsgSend shortWeekdaySymbols_IMetInst = get_shortWeekdaySymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shortWeekdaySymbols_IMetInst.init(nativeBuffer, this);
		shortWeekdaySymbols_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend standaloneMonthSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_standaloneMonthSymbols_IMetInst(){
		return ((standaloneMonthSymbols_IMetInst != null)
	? (standaloneMonthSymbols_IMetInst)
	: (standaloneMonthSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "standaloneMonthSymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray standaloneMonthSymbols(){
			final com.apple.jobjc.Invoke.MsgSend standaloneMonthSymbols_IMetInst = get_standaloneMonthSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		standaloneMonthSymbols_IMetInst.init(nativeBuffer, this);
		standaloneMonthSymbols_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend standaloneQuarterSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_standaloneQuarterSymbols_IMetInst(){
		return ((standaloneQuarterSymbols_IMetInst != null)
	? (standaloneQuarterSymbols_IMetInst)
	: (standaloneQuarterSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "standaloneQuarterSymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray standaloneQuarterSymbols(){
			final com.apple.jobjc.Invoke.MsgSend standaloneQuarterSymbols_IMetInst = get_standaloneQuarterSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		standaloneQuarterSymbols_IMetInst.init(nativeBuffer, this);
		standaloneQuarterSymbols_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend standaloneWeekdaySymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_standaloneWeekdaySymbols_IMetInst(){
		return ((standaloneWeekdaySymbols_IMetInst != null)
	? (standaloneWeekdaySymbols_IMetInst)
	: (standaloneWeekdaySymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "standaloneWeekdaySymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray standaloneWeekdaySymbols(){
			final com.apple.jobjc.Invoke.MsgSend standaloneWeekdaySymbols_IMetInst = get_standaloneWeekdaySymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		standaloneWeekdaySymbols_IMetInst.init(nativeBuffer, this);
		standaloneWeekdaySymbols_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringFromDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringFromDate_IMetInst(){
		return ((stringFromDate_IMetInst != null)
	? (stringFromDate_IMetInst)
	: (stringFromDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringFromDate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringFromDate(final com.apple.jobjc.foundation.NSDate date){
			final com.apple.jobjc.Invoke.MsgSend stringFromDate_IMetInst = get_stringFromDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringFromDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
		stringFromDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend timeStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timeStyle_IMetInst(){
		return ((timeStyle_IMetInst != null)
	? (timeStyle_IMetInst)
	: (timeStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timeStyle", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long timeStyle(){
			final com.apple.jobjc.Invoke.MsgSend timeStyle_IMetInst = get_timeStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timeStyle_IMetInst.init(nativeBuffer, this);
		timeStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend twoDigitStartDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_twoDigitStartDate_IMetInst(){
		return ((twoDigitStartDate_IMetInst != null)
	? (twoDigitStartDate_IMetInst)
	: (twoDigitStartDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "twoDigitStartDate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate twoDigitStartDate(){
			final com.apple.jobjc.Invoke.MsgSend twoDigitStartDate_IMetInst = get_twoDigitStartDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		twoDigitStartDate_IMetInst.init(nativeBuffer, this);
		twoDigitStartDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend veryShortMonthSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_veryShortMonthSymbols_IMetInst(){
		return ((veryShortMonthSymbols_IMetInst != null)
	? (veryShortMonthSymbols_IMetInst)
	: (veryShortMonthSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "veryShortMonthSymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray veryShortMonthSymbols(){
			final com.apple.jobjc.Invoke.MsgSend veryShortMonthSymbols_IMetInst = get_veryShortMonthSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		veryShortMonthSymbols_IMetInst.init(nativeBuffer, this);
		veryShortMonthSymbols_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend veryShortStandaloneMonthSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_veryShortStandaloneMonthSymbols_IMetInst(){
		return ((veryShortStandaloneMonthSymbols_IMetInst != null)
	? (veryShortStandaloneMonthSymbols_IMetInst)
	: (veryShortStandaloneMonthSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "veryShortStandaloneMonthSymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray veryShortStandaloneMonthSymbols(){
			final com.apple.jobjc.Invoke.MsgSend veryShortStandaloneMonthSymbols_IMetInst = get_veryShortStandaloneMonthSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		veryShortStandaloneMonthSymbols_IMetInst.init(nativeBuffer, this);
		veryShortStandaloneMonthSymbols_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend veryShortStandaloneWeekdaySymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_veryShortStandaloneWeekdaySymbols_IMetInst(){
		return ((veryShortStandaloneWeekdaySymbols_IMetInst != null)
	? (veryShortStandaloneWeekdaySymbols_IMetInst)
	: (veryShortStandaloneWeekdaySymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "veryShortStandaloneWeekdaySymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray veryShortStandaloneWeekdaySymbols(){
			final com.apple.jobjc.Invoke.MsgSend veryShortStandaloneWeekdaySymbols_IMetInst = get_veryShortStandaloneWeekdaySymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		veryShortStandaloneWeekdaySymbols_IMetInst.init(nativeBuffer, this);
		veryShortStandaloneWeekdaySymbols_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend veryShortWeekdaySymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_veryShortWeekdaySymbols_IMetInst(){
		return ((veryShortWeekdaySymbols_IMetInst != null)
	? (veryShortWeekdaySymbols_IMetInst)
	: (veryShortWeekdaySymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "veryShortWeekdaySymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray veryShortWeekdaySymbols(){
			final com.apple.jobjc.Invoke.MsgSend veryShortWeekdaySymbols_IMetInst = get_veryShortWeekdaySymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		veryShortWeekdaySymbols_IMetInst.init(nativeBuffer, this);
		veryShortWeekdaySymbols_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend weekdaySymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_weekdaySymbols_IMetInst(){
		return ((weekdaySymbols_IMetInst != null)
	? (weekdaySymbols_IMetInst)
	: (weekdaySymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "weekdaySymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray weekdaySymbols(){
			final com.apple.jobjc.Invoke.MsgSend weekdaySymbols_IMetInst = get_weekdaySymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		weekdaySymbols_IMetInst.init(nativeBuffer, this);
		weekdaySymbols_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
