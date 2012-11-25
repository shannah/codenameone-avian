package com.apple.jobjc.foundation;

public  class NSTimeZoneClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSTimeZoneClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSTimeZoneClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSTimeZoneClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend abbreviationDictionary_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_abbreviationDictionary_CMetInst(){
		return ((abbreviationDictionary_CMetInst != null)
	? (abbreviationDictionary_CMetInst)
	: (abbreviationDictionary_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "abbreviationDictionary", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary abbreviationDictionary(){
			final com.apple.jobjc.Invoke.MsgSend abbreviationDictionary_CMetInst = get_abbreviationDictionary_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		abbreviationDictionary_CMetInst.init(nativeBuffer, this);
		abbreviationDictionary_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultTimeZone_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultTimeZone_CMetInst(){
		return ((defaultTimeZone_CMetInst != null)
	? (defaultTimeZone_CMetInst)
	: (defaultTimeZone_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultTimeZone", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTimeZone defaultTimeZone(){
			final com.apple.jobjc.Invoke.MsgSend defaultTimeZone_CMetInst = get_defaultTimeZone_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultTimeZone_CMetInst.init(nativeBuffer, this);
		defaultTimeZone_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTimeZone returnValue = (com.apple.jobjc.foundation.NSTimeZone) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend knownTimeZoneNames_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_knownTimeZoneNames_CMetInst(){
		return ((knownTimeZoneNames_CMetInst != null)
	? (knownTimeZoneNames_CMetInst)
	: (knownTimeZoneNames_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "knownTimeZoneNames", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray knownTimeZoneNames(){
			final com.apple.jobjc.Invoke.MsgSend knownTimeZoneNames_CMetInst = get_knownTimeZoneNames_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		knownTimeZoneNames_CMetInst.init(nativeBuffer, this);
		knownTimeZoneNames_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localTimeZone_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localTimeZone_CMetInst(){
		return ((localTimeZone_CMetInst != null)
	? (localTimeZone_CMetInst)
	: (localTimeZone_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localTimeZone", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTimeZone localTimeZone(){
			final com.apple.jobjc.Invoke.MsgSend localTimeZone_CMetInst = get_localTimeZone_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localTimeZone_CMetInst.init(nativeBuffer, this);
		localTimeZone_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTimeZone returnValue = (com.apple.jobjc.foundation.NSTimeZone) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resetSystemTimeZone_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resetSystemTimeZone_CMetInst(){
		return ((resetSystemTimeZone_CMetInst != null)
	? (resetSystemTimeZone_CMetInst)
	: (resetSystemTimeZone_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resetSystemTimeZone", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void resetSystemTimeZone(){
			final com.apple.jobjc.Invoke.MsgSend resetSystemTimeZone_CMetInst = get_resetSystemTimeZone_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resetSystemTimeZone_CMetInst.init(nativeBuffer, this);
		resetSystemTimeZone_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAbbreviationDictionary_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAbbreviationDictionary_CMetInst(){
		return ((setAbbreviationDictionary_CMetInst != null)
	? (setAbbreviationDictionary_CMetInst)
	: (setAbbreviationDictionary_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAbbreviationDictionary:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAbbreviationDictionary(final com.apple.jobjc.foundation.NSDictionary dict){
			final com.apple.jobjc.Invoke.MsgSend setAbbreviationDictionary_CMetInst = get_setAbbreviationDictionary_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAbbreviationDictionary_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dict);
		setAbbreviationDictionary_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultTimeZone_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultTimeZone_CMetInst(){
		return ((setDefaultTimeZone_CMetInst != null)
	? (setDefaultTimeZone_CMetInst)
	: (setDefaultTimeZone_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultTimeZone:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDefaultTimeZone(final com.apple.jobjc.foundation.NSTimeZone aTimeZone){
			final com.apple.jobjc.Invoke.MsgSend setDefaultTimeZone_CMetInst = get_setDefaultTimeZone_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultTimeZone_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aTimeZone);
		setDefaultTimeZone_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend systemTimeZone_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_systemTimeZone_CMetInst(){
		return ((systemTimeZone_CMetInst != null)
	? (systemTimeZone_CMetInst)
	: (systemTimeZone_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "systemTimeZone", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTimeZone systemTimeZone(){
			final com.apple.jobjc.Invoke.MsgSend systemTimeZone_CMetInst = get_systemTimeZone_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		systemTimeZone_CMetInst.init(nativeBuffer, this);
		systemTimeZone_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTimeZone returnValue = (com.apple.jobjc.foundation.NSTimeZone) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend timeZoneDataVersion_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timeZoneDataVersion_CMetInst(){
		return ((timeZoneDataVersion_CMetInst != null)
	? (timeZoneDataVersion_CMetInst)
	: (timeZoneDataVersion_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timeZoneDataVersion", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString timeZoneDataVersion(){
			final com.apple.jobjc.Invoke.MsgSend timeZoneDataVersion_CMetInst = get_timeZoneDataVersion_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timeZoneDataVersion_CMetInst.init(nativeBuffer, this);
		timeZoneDataVersion_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend timeZoneForSecondsFromGMT_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timeZoneForSecondsFromGMT_CMetInst(){
		return ((timeZoneForSecondsFromGMT_CMetInst != null)
	? (timeZoneForSecondsFromGMT_CMetInst)
	: (timeZoneForSecondsFromGMT_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timeZoneForSecondsFromGMT:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T timeZoneForSecondsFromGMT(final long seconds){
			final com.apple.jobjc.Invoke.MsgSend timeZoneForSecondsFromGMT_CMetInst = get_timeZoneForSecondsFromGMT_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timeZoneForSecondsFromGMT_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, seconds);
		timeZoneForSecondsFromGMT_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend timeZoneWithAbbreviation_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timeZoneWithAbbreviation_CMetInst(){
		return ((timeZoneWithAbbreviation_CMetInst != null)
	? (timeZoneWithAbbreviation_CMetInst)
	: (timeZoneWithAbbreviation_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timeZoneWithAbbreviation:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T timeZoneWithAbbreviation(final com.apple.jobjc.foundation.NSString abbreviation){
			final com.apple.jobjc.Invoke.MsgSend timeZoneWithAbbreviation_CMetInst = get_timeZoneWithAbbreviation_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timeZoneWithAbbreviation_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, abbreviation);
		timeZoneWithAbbreviation_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend timeZoneWithName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timeZoneWithName_CMetInst(){
		return ((timeZoneWithName_CMetInst != null)
	? (timeZoneWithName_CMetInst)
	: (timeZoneWithName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timeZoneWithName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T timeZoneWithName(final com.apple.jobjc.foundation.NSString tzName){
			final com.apple.jobjc.Invoke.MsgSend timeZoneWithName_CMetInst = get_timeZoneWithName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timeZoneWithName_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tzName);
		timeZoneWithName_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend timeZoneWithName_data_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timeZoneWithName_data_CMetInst(){
		return ((timeZoneWithName_data_CMetInst != null)
	? (timeZoneWithName_data_CMetInst)
	: (timeZoneWithName_data_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timeZoneWithName:data:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T timeZoneWithName_data(final com.apple.jobjc.foundation.NSString tzName, final com.apple.jobjc.foundation.NSData aData){
			final com.apple.jobjc.Invoke.MsgSend timeZoneWithName_data_CMetInst = get_timeZoneWithName_data_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timeZoneWithName_data_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tzName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aData);
		timeZoneWithName_data_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
