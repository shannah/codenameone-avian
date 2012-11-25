package com.apple.jobjc.appkit;

public  class NSDatePickerCell extends com.apple.jobjc.appkit.NSActionCell {
	public NSDatePickerCell(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDatePickerCell(final NSDatePickerCell obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend backgroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backgroundColor_IMetInst(){
		return ((backgroundColor_IMetInst != null)
	? (backgroundColor_IMetInst)
	: (backgroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backgroundColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor backgroundColor(){
			final com.apple.jobjc.Invoke.MsgSend backgroundColor_IMetInst = get_backgroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backgroundColor_IMetInst.init(nativeBuffer, this);
		backgroundColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend datePickerElements_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_datePickerElements_IMetInst(){
		return ((datePickerElements_IMetInst != null)
	? (datePickerElements_IMetInst)
	: (datePickerElements_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "datePickerElements", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long datePickerElements(){
			final com.apple.jobjc.Invoke.MsgSend datePickerElements_IMetInst = get_datePickerElements_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		datePickerElements_IMetInst.init(nativeBuffer, this);
		datePickerElements_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend datePickerMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_datePickerMode_IMetInst(){
		return ((datePickerMode_IMetInst != null)
	? (datePickerMode_IMetInst)
	: (datePickerMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "datePickerMode", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long datePickerMode(){
			final com.apple.jobjc.Invoke.MsgSend datePickerMode_IMetInst = get_datePickerMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		datePickerMode_IMetInst.init(nativeBuffer, this);
		datePickerMode_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend datePickerStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_datePickerStyle_IMetInst(){
		return ((datePickerStyle_IMetInst != null)
	? (datePickerStyle_IMetInst)
	: (datePickerStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "datePickerStyle", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long datePickerStyle(){
			final com.apple.jobjc.Invoke.MsgSend datePickerStyle_IMetInst = get_datePickerStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		datePickerStyle_IMetInst.init(nativeBuffer, this);
		datePickerStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateValue_IMetInst(){
		return ((dateValue_IMetInst != null)
	? (dateValue_IMetInst)
	: (dateValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateValue", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate dateValue(){
			final com.apple.jobjc.Invoke.MsgSend dateValue_IMetInst = get_dateValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateValue_IMetInst.init(nativeBuffer, this);
		dateValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_delegate_IMetInst(){
		return ((delegate_IMetInst != null)
	? (delegate_IMetInst)
	: (delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "delegate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T delegate(){
			final com.apple.jobjc.Invoke.MsgSend delegate_IMetInst = get_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		delegate_IMetInst.init(nativeBuffer, this);
		delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawsBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawsBackground_IMetInst(){
		return ((drawsBackground_IMetInst != null)
	? (drawsBackground_IMetInst)
	: (drawsBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawsBackground", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean drawsBackground(){
			final com.apple.jobjc.Invoke.MsgSend drawsBackground_IMetInst = get_drawsBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawsBackground_IMetInst.init(nativeBuffer, this);
		drawsBackground_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend maxDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maxDate_IMetInst(){
		return ((maxDate_IMetInst != null)
	? (maxDate_IMetInst)
	: (maxDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maxDate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate maxDate(){
			final com.apple.jobjc.Invoke.MsgSend maxDate_IMetInst = get_maxDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maxDate_IMetInst.init(nativeBuffer, this);
		maxDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minDate_IMetInst(){
		return ((minDate_IMetInst != null)
	? (minDate_IMetInst)
	: (minDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minDate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate minDate(){
			final com.apple.jobjc.Invoke.MsgSend minDate_IMetInst = get_minDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minDate_IMetInst.init(nativeBuffer, this);
		minDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setBackgroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBackgroundColor_IMetInst(){
		return ((setBackgroundColor_IMetInst != null)
	? (setBackgroundColor_IMetInst)
	: (setBackgroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBackgroundColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setBackgroundColor(final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend setBackgroundColor_IMetInst = get_setBackgroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBackgroundColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		setBackgroundColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCalendar_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCalendar_IMetInst(){
		return ((setCalendar_IMetInst != null)
	? (setCalendar_IMetInst)
	: (setCalendar_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCalendar:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCalendar(final com.apple.jobjc.foundation.NSCalendar newCalendar){
			final com.apple.jobjc.Invoke.MsgSend setCalendar_IMetInst = get_setCalendar_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCalendar_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newCalendar);
		setCalendar_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDatePickerElements_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDatePickerElements_IMetInst(){
		return ((setDatePickerElements_IMetInst != null)
	? (setDatePickerElements_IMetInst)
	: (setDatePickerElements_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDatePickerElements:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setDatePickerElements(final long elementFlags){
			final com.apple.jobjc.Invoke.MsgSend setDatePickerElements_IMetInst = get_setDatePickerElements_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDatePickerElements_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, elementFlags);
		setDatePickerElements_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDatePickerMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDatePickerMode_IMetInst(){
		return ((setDatePickerMode_IMetInst != null)
	? (setDatePickerMode_IMetInst)
	: (setDatePickerMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDatePickerMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setDatePickerMode(final long newMode){
			final com.apple.jobjc.Invoke.MsgSend setDatePickerMode_IMetInst = get_setDatePickerMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDatePickerMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, newMode);
		setDatePickerMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDatePickerStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDatePickerStyle_IMetInst(){
		return ((setDatePickerStyle_IMetInst != null)
	? (setDatePickerStyle_IMetInst)
	: (setDatePickerStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDatePickerStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setDatePickerStyle(final long newStyle){
			final com.apple.jobjc.Invoke.MsgSend setDatePickerStyle_IMetInst = get_setDatePickerStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDatePickerStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, newStyle);
		setDatePickerStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDateValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDateValue_IMetInst(){
		return ((setDateValue_IMetInst != null)
	? (setDateValue_IMetInst)
	: (setDateValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDateValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDateValue(final com.apple.jobjc.foundation.NSDate newStartDate){
			final com.apple.jobjc.Invoke.MsgSend setDateValue_IMetInst = get_setDateValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDateValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newStartDate);
		setDateValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDrawsBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDrawsBackground_IMetInst(){
		return ((setDrawsBackground_IMetInst != null)
	? (setDrawsBackground_IMetInst)
	: (setDrawsBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDrawsBackground:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDrawsBackground(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setDrawsBackground_IMetInst = get_setDrawsBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDrawsBackground_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setDrawsBackground_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLocale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLocale_IMetInst(){
		return ((setLocale_IMetInst != null)
	? (setLocale_IMetInst)
	: (setLocale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLocale:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setLocale(final com.apple.jobjc.foundation.NSLocale newLocale){
			final com.apple.jobjc.Invoke.MsgSend setLocale_IMetInst = get_setLocale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLocale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newLocale);
		setLocale_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaxDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaxDate_IMetInst(){
		return ((setMaxDate_IMetInst != null)
	? (setMaxDate_IMetInst)
	: (setMaxDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaxDate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMaxDate(final com.apple.jobjc.foundation.NSDate date){
			final com.apple.jobjc.Invoke.MsgSend setMaxDate_IMetInst = get_setMaxDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaxDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
		setMaxDate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinDate_IMetInst(){
		return ((setMinDate_IMetInst != null)
	? (setMinDate_IMetInst)
	: (setMinDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinDate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMinDate(final com.apple.jobjc.foundation.NSDate date){
			final com.apple.jobjc.Invoke.MsgSend setMinDate_IMetInst = get_setMinDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
		setMinDate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextColor_IMetInst(){
		return ((setTextColor_IMetInst != null)
	? (setTextColor_IMetInst)
	: (setTextColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTextColor(final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend setTextColor_IMetInst = get_setTextColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		setTextColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTimeInterval_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTimeInterval_IMetInst(){
		return ((setTimeInterval_IMetInst != null)
	? (setTimeInterval_IMetInst)
	: (setTimeInterval_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTimeInterval:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setTimeInterval(final double newTimeInterval){
			final com.apple.jobjc.Invoke.MsgSend setTimeInterval_IMetInst = get_setTimeInterval_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTimeInterval_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, newTimeInterval);
		setTimeInterval_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTimeZone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTimeZone_IMetInst(){
		return ((setTimeZone_IMetInst != null)
	? (setTimeZone_IMetInst)
	: (setTimeZone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTimeZone:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTimeZone(final com.apple.jobjc.foundation.NSTimeZone newTimeZone){
			final com.apple.jobjc.Invoke.MsgSend setTimeZone_IMetInst = get_setTimeZone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTimeZone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newTimeZone);
		setTimeZone_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textColor_IMetInst(){
		return ((textColor_IMetInst != null)
	? (textColor_IMetInst)
	: (textColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor textColor(){
			final com.apple.jobjc.Invoke.MsgSend textColor_IMetInst = get_textColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textColor_IMetInst.init(nativeBuffer, this);
		textColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend timeInterval_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timeInterval_IMetInst(){
		return ((timeInterval_IMetInst != null)
	? (timeInterval_IMetInst)
	: (timeInterval_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timeInterval", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double timeInterval(){
			final com.apple.jobjc.Invoke.MsgSend timeInterval_IMetInst = get_timeInterval_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timeInterval_IMetInst.init(nativeBuffer, this);
		timeInterval_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
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

}
