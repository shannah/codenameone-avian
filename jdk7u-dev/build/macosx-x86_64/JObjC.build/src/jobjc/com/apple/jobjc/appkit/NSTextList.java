package com.apple.jobjc.appkit;

public  class NSTextList extends com.apple.jobjc.foundation.NSObject {
	public NSTextList(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTextList(final NSTextList obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend initWithMarkerFormat_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithMarkerFormat_options_IMetInst(){
		return ((initWithMarkerFormat_options_IMetInst != null)
	? (initWithMarkerFormat_options_IMetInst)
	: (initWithMarkerFormat_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithMarkerFormat:options:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithMarkerFormat_options(final com.apple.jobjc.foundation.NSString format, final long mask){
			final com.apple.jobjc.Invoke.MsgSend initWithMarkerFormat_options_IMetInst = get_initWithMarkerFormat_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithMarkerFormat_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		initWithMarkerFormat_options_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend listOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_listOptions_IMetInst(){
		return ((listOptions_IMetInst != null)
	? (listOptions_IMetInst)
	: (listOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "listOptions", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long listOptions(){
			final com.apple.jobjc.Invoke.MsgSend listOptions_IMetInst = get_listOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		listOptions_IMetInst.init(nativeBuffer, this);
		listOptions_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend markerForItemNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_markerForItemNumber_IMetInst(){
		return ((markerForItemNumber_IMetInst != null)
	? (markerForItemNumber_IMetInst)
	: (markerForItemNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "markerForItemNumber:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString markerForItemNumber(final long itemNum){
			final com.apple.jobjc.Invoke.MsgSend markerForItemNumber_IMetInst = get_markerForItemNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		markerForItemNumber_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, itemNum);
		markerForItemNumber_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend markerFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_markerFormat_IMetInst(){
		return ((markerFormat_IMetInst != null)
	? (markerFormat_IMetInst)
	: (markerFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "markerFormat", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString markerFormat(){
			final com.apple.jobjc.Invoke.MsgSend markerFormat_IMetInst = get_markerFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		markerFormat_IMetInst.init(nativeBuffer, this);
		markerFormat_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setStartingItemNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStartingItemNumber_IMetInst(){
		return ((setStartingItemNumber_IMetInst != null)
	? (setStartingItemNumber_IMetInst)
	: (setStartingItemNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStartingItemNumber:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setStartingItemNumber(final long itemNum){
			final com.apple.jobjc.Invoke.MsgSend setStartingItemNumber_IMetInst = get_setStartingItemNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStartingItemNumber_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, itemNum);
		setStartingItemNumber_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend startingItemNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startingItemNumber_IMetInst(){
		return ((startingItemNumber_IMetInst != null)
	? (startingItemNumber_IMetInst)
	: (startingItemNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startingItemNumber", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long startingItemNumber(){
			final com.apple.jobjc.Invoke.MsgSend startingItemNumber_IMetInst = get_startingItemNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startingItemNumber_IMetInst.init(nativeBuffer, this);
		startingItemNumber_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
