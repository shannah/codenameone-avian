package com.apple.jobjc.foundation;

public  class NSGarbageCollector extends com.apple.jobjc.foundation.NSObject {
	public NSGarbageCollector(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSGarbageCollector(final NSGarbageCollector obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend collectExhaustively_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_collectExhaustively_IMetInst(){
		return ((collectExhaustively_IMetInst != null)
	? (collectExhaustively_IMetInst)
	: (collectExhaustively_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "collectExhaustively", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void collectExhaustively(){
			final com.apple.jobjc.Invoke.MsgSend collectExhaustively_IMetInst = get_collectExhaustively_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		collectExhaustively_IMetInst.init(nativeBuffer, this);
		collectExhaustively_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend collectIfNeeded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_collectIfNeeded_IMetInst(){
		return ((collectIfNeeded_IMetInst != null)
	? (collectIfNeeded_IMetInst)
	: (collectIfNeeded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "collectIfNeeded", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void collectIfNeeded(){
			final com.apple.jobjc.Invoke.MsgSend collectIfNeeded_IMetInst = get_collectIfNeeded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		collectIfNeeded_IMetInst.init(nativeBuffer, this);
		collectIfNeeded_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend disable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_disable_IMetInst(){
		return ((disable_IMetInst != null)
	? (disable_IMetInst)
	: (disable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "disable", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void disable(){
			final com.apple.jobjc.Invoke.MsgSend disable_IMetInst = get_disable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		disable_IMetInst.init(nativeBuffer, this);
		disable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend disableCollectorForPointer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_disableCollectorForPointer_IMetInst(){
		return ((disableCollectorForPointer_IMetInst != null)
	? (disableCollectorForPointer_IMetInst)
	: (disableCollectorForPointer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "disableCollectorForPointer:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void disableCollectorForPointer(final com.apple.jobjc.Pointer<Void> ptr){
			final com.apple.jobjc.Invoke.MsgSend disableCollectorForPointer_IMetInst = get_disableCollectorForPointer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		disableCollectorForPointer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, ptr);
		disableCollectorForPointer_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enable_IMetInst(){
		return ((enable_IMetInst != null)
	? (enable_IMetInst)
	: (enable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enable", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void enable(){
			final com.apple.jobjc.Invoke.MsgSend enable_IMetInst = get_enable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enable_IMetInst.init(nativeBuffer, this);
		enable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enableCollectorForPointer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enableCollectorForPointer_IMetInst(){
		return ((enableCollectorForPointer_IMetInst != null)
	? (enableCollectorForPointer_IMetInst)
	: (enableCollectorForPointer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enableCollectorForPointer:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void enableCollectorForPointer(final com.apple.jobjc.Pointer<Void> ptr){
			final com.apple.jobjc.Invoke.MsgSend enableCollectorForPointer_IMetInst = get_enableCollectorForPointer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enableCollectorForPointer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, ptr);
		enableCollectorForPointer_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isCollecting_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isCollecting_IMetInst(){
		return ((isCollecting_IMetInst != null)
	? (isCollecting_IMetInst)
	: (isCollecting_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isCollecting", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isCollecting(){
			final com.apple.jobjc.Invoke.MsgSend isCollecting_IMetInst = get_isCollecting_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isCollecting_IMetInst.init(nativeBuffer, this);
		isCollecting_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEnabled_IMetInst(){
		return ((isEnabled_IMetInst != null)
	? (isEnabled_IMetInst)
	: (isEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isEnabled_IMetInst = get_isEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEnabled_IMetInst.init(nativeBuffer, this);
		isEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend zone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_zone_IMetInst(){
		return ((zone_IMetInst != null)
	? (zone_IMetInst)
	: (zone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "zone", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone(){
			final com.apple.jobjc.Invoke.MsgSend zone_IMetInst = get_zone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		zone_IMetInst.init(nativeBuffer, this);
		zone_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> returnValue = (com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
