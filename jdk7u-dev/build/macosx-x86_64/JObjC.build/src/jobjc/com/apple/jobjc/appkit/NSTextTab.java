package com.apple.jobjc.appkit;

public  class NSTextTab extends com.apple.jobjc.foundation.NSObject {
	public NSTextTab(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTextTab(final NSTextTab obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend alignment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alignment_IMetInst(){
		return ((alignment_IMetInst != null)
	? (alignment_IMetInst)
	: (alignment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alignment", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long alignment(){
			final com.apple.jobjc.Invoke.MsgSend alignment_IMetInst = get_alignment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alignment_IMetInst.init(nativeBuffer, this);
		alignment_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithTextAlignment_location_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithTextAlignment_location_options_IMetInst(){
		return ((initWithTextAlignment_location_options_IMetInst != null)
	? (initWithTextAlignment_location_options_IMetInst)
	: (initWithTextAlignment_location_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithTextAlignment:location:options:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithTextAlignment_location_options(final long alignment, final double loc, final com.apple.jobjc.foundation.NSDictionary options){
			final com.apple.jobjc.Invoke.MsgSend initWithTextAlignment_location_options_IMetInst = get_initWithTextAlignment_location_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithTextAlignment_location_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, alignment);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, loc);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		initWithTextAlignment_location_options_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithType_location_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithType_location_IMetInst(){
		return ((initWithType_location_IMetInst != null)
	? (initWithType_location_IMetInst)
	: (initWithType_location_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithType:location:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithType_location(final long type, final double loc){
			final com.apple.jobjc.Invoke.MsgSend initWithType_location_IMetInst = get_initWithType_location_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithType_location_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, type);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, loc);
		initWithType_location_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend location_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_location_IMetInst(){
		return ((location_IMetInst != null)
	? (location_IMetInst)
	: (location_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "location", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double location(){
			final com.apple.jobjc.Invoke.MsgSend location_IMetInst = get_location_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		location_IMetInst.init(nativeBuffer, this);
		location_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_options_IMetInst(){
		return ((options_IMetInst != null)
	? (options_IMetInst)
	: (options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "options", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary options(){
			final com.apple.jobjc.Invoke.MsgSend options_IMetInst = get_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		options_IMetInst.init(nativeBuffer, this);
		options_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tabStopType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tabStopType_IMetInst(){
		return ((tabStopType_IMetInst != null)
	? (tabStopType_IMetInst)
	: (tabStopType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tabStopType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long tabStopType(){
			final com.apple.jobjc.Invoke.MsgSend tabStopType_IMetInst = get_tabStopType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tabStopType_IMetInst.init(nativeBuffer, this);
		tabStopType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
