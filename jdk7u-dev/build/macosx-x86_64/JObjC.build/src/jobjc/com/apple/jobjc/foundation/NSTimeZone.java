package com.apple.jobjc.foundation;

public  class NSTimeZone extends com.apple.jobjc.foundation.NSObject {
	public NSTimeZone(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTimeZone(final NSTimeZone obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend abbreviation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_abbreviation_IMetInst(){
		return ((abbreviation_IMetInst != null)
	? (abbreviation_IMetInst)
	: (abbreviation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "abbreviation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString abbreviation(){
			final com.apple.jobjc.Invoke.MsgSend abbreviation_IMetInst = get_abbreviation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		abbreviation_IMetInst.init(nativeBuffer, this);
		abbreviation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend abbreviationForDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_abbreviationForDate_IMetInst(){
		return ((abbreviationForDate_IMetInst != null)
	? (abbreviationForDate_IMetInst)
	: (abbreviationForDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "abbreviationForDate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString abbreviationForDate(final com.apple.jobjc.foundation.NSDate aDate){
			final com.apple.jobjc.Invoke.MsgSend abbreviationForDate_IMetInst = get_abbreviationForDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		abbreviationForDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aDate);
		abbreviationForDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend data_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_data_IMetInst(){
		return ((data_IMetInst != null)
	? (data_IMetInst)
	: (data_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "data", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData data(){
			final com.apple.jobjc.Invoke.MsgSend data_IMetInst = get_data_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		data_IMetInst.init(nativeBuffer, this);
		data_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend daylightSavingTimeOffset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_daylightSavingTimeOffset_IMetInst(){
		return ((daylightSavingTimeOffset_IMetInst != null)
	? (daylightSavingTimeOffset_IMetInst)
	: (daylightSavingTimeOffset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "daylightSavingTimeOffset", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double daylightSavingTimeOffset(){
			final com.apple.jobjc.Invoke.MsgSend daylightSavingTimeOffset_IMetInst = get_daylightSavingTimeOffset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		daylightSavingTimeOffset_IMetInst.init(nativeBuffer, this);
		daylightSavingTimeOffset_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend daylightSavingTimeOffsetForDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_daylightSavingTimeOffsetForDate_IMetInst(){
		return ((daylightSavingTimeOffsetForDate_IMetInst != null)
	? (daylightSavingTimeOffsetForDate_IMetInst)
	: (daylightSavingTimeOffsetForDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "daylightSavingTimeOffsetForDate:", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public double daylightSavingTimeOffsetForDate(final com.apple.jobjc.foundation.NSDate aDate){
			final com.apple.jobjc.Invoke.MsgSend daylightSavingTimeOffsetForDate_IMetInst = get_daylightSavingTimeOffsetForDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		daylightSavingTimeOffsetForDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aDate);
		daylightSavingTimeOffsetForDate_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend initWithName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithName_IMetInst(){
		return ((initWithName_IMetInst != null)
	? (initWithName_IMetInst)
	: (initWithName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithName(final com.apple.jobjc.foundation.NSString tzName){
			final com.apple.jobjc.Invoke.MsgSend initWithName_IMetInst = get_initWithName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tzName);
		initWithName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithName_data_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithName_data_IMetInst(){
		return ((initWithName_data_IMetInst != null)
	? (initWithName_data_IMetInst)
	: (initWithName_data_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithName:data:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithName_data(final com.apple.jobjc.foundation.NSString tzName, final com.apple.jobjc.foundation.NSData aData){
			final com.apple.jobjc.Invoke.MsgSend initWithName_data_IMetInst = get_initWithName_data_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithName_data_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tzName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aData);
		initWithName_data_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isDaylightSavingTime_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isDaylightSavingTime_IMetInst(){
		return ((isDaylightSavingTime_IMetInst != null)
	? (isDaylightSavingTime_IMetInst)
	: (isDaylightSavingTime_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isDaylightSavingTime", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isDaylightSavingTime(){
			final com.apple.jobjc.Invoke.MsgSend isDaylightSavingTime_IMetInst = get_isDaylightSavingTime_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isDaylightSavingTime_IMetInst.init(nativeBuffer, this);
		isDaylightSavingTime_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isDaylightSavingTimeForDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isDaylightSavingTimeForDate_IMetInst(){
		return ((isDaylightSavingTimeForDate_IMetInst != null)
	? (isDaylightSavingTimeForDate_IMetInst)
	: (isDaylightSavingTimeForDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isDaylightSavingTimeForDate:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isDaylightSavingTimeForDate(final com.apple.jobjc.foundation.NSDate aDate){
			final com.apple.jobjc.Invoke.MsgSend isDaylightSavingTimeForDate_IMetInst = get_isDaylightSavingTimeForDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isDaylightSavingTimeForDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aDate);
		isDaylightSavingTimeForDate_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEqualToTimeZone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEqualToTimeZone_IMetInst(){
		return ((isEqualToTimeZone_IMetInst != null)
	? (isEqualToTimeZone_IMetInst)
	: (isEqualToTimeZone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEqualToTimeZone:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isEqualToTimeZone(final com.apple.jobjc.foundation.NSTimeZone aTimeZone){
			final com.apple.jobjc.Invoke.MsgSend isEqualToTimeZone_IMetInst = get_isEqualToTimeZone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEqualToTimeZone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aTimeZone);
		isEqualToTimeZone_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedName_locale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedName_locale_IMetInst(){
		return ((localizedName_locale_IMetInst != null)
	? (localizedName_locale_IMetInst)
	: (localizedName_locale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedName:locale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localizedName_locale(final long style, final com.apple.jobjc.foundation.NSLocale locale){
			final com.apple.jobjc.Invoke.MsgSend localizedName_locale_IMetInst = get_localizedName_locale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedName_locale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, style);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		localizedName_locale_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend name_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_name_IMetInst(){
		return ((name_IMetInst != null)
	? (name_IMetInst)
	: (name_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "name", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString name(){
			final com.apple.jobjc.Invoke.MsgSend name_IMetInst = get_name_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		name_IMetInst.init(nativeBuffer, this);
		name_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nextDaylightSavingTimeTransition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nextDaylightSavingTimeTransition_IMetInst(){
		return ((nextDaylightSavingTimeTransition_IMetInst != null)
	? (nextDaylightSavingTimeTransition_IMetInst)
	: (nextDaylightSavingTimeTransition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nextDaylightSavingTimeTransition", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate nextDaylightSavingTimeTransition(){
			final com.apple.jobjc.Invoke.MsgSend nextDaylightSavingTimeTransition_IMetInst = get_nextDaylightSavingTimeTransition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nextDaylightSavingTimeTransition_IMetInst.init(nativeBuffer, this);
		nextDaylightSavingTimeTransition_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nextDaylightSavingTimeTransitionAfterDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nextDaylightSavingTimeTransitionAfterDate_IMetInst(){
		return ((nextDaylightSavingTimeTransitionAfterDate_IMetInst != null)
	? (nextDaylightSavingTimeTransitionAfterDate_IMetInst)
	: (nextDaylightSavingTimeTransitionAfterDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nextDaylightSavingTimeTransitionAfterDate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate nextDaylightSavingTimeTransitionAfterDate(final com.apple.jobjc.foundation.NSDate aDate){
			final com.apple.jobjc.Invoke.MsgSend nextDaylightSavingTimeTransitionAfterDate_IMetInst = get_nextDaylightSavingTimeTransitionAfterDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nextDaylightSavingTimeTransitionAfterDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aDate);
		nextDaylightSavingTimeTransitionAfterDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend secondsFromGMT_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_secondsFromGMT_IMetInst(){
		return ((secondsFromGMT_IMetInst != null)
	? (secondsFromGMT_IMetInst)
	: (secondsFromGMT_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "secondsFromGMT", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long secondsFromGMT(){
			final com.apple.jobjc.Invoke.MsgSend secondsFromGMT_IMetInst = get_secondsFromGMT_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		secondsFromGMT_IMetInst.init(nativeBuffer, this);
		secondsFromGMT_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend secondsFromGMTForDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_secondsFromGMTForDate_IMetInst(){
		return ((secondsFromGMTForDate_IMetInst != null)
	? (secondsFromGMTForDate_IMetInst)
	: (secondsFromGMTForDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "secondsFromGMTForDate:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long secondsFromGMTForDate(final com.apple.jobjc.foundation.NSDate aDate){
			final com.apple.jobjc.Invoke.MsgSend secondsFromGMTForDate_IMetInst = get_secondsFromGMTForDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		secondsFromGMTForDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aDate);
		secondsFromGMTForDate_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
