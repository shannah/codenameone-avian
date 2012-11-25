package com.apple.jobjc.appkit;

public  class NSCellClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSCellClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSCellClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSCellClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend defaultFocusRingType_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultFocusRingType_CMetInst(){
		return ((defaultFocusRingType_CMetInst != null)
	? (defaultFocusRingType_CMetInst)
	: (defaultFocusRingType_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultFocusRingType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long defaultFocusRingType(){
			final com.apple.jobjc.Invoke.MsgSend defaultFocusRingType_CMetInst = get_defaultFocusRingType_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultFocusRingType_CMetInst.init(nativeBuffer, this);
		defaultFocusRingType_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultMenu_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultMenu_CMetInst(){
		return ((defaultMenu_CMetInst != null)
	? (defaultMenu_CMetInst)
	: (defaultMenu_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultMenu", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu defaultMenu(){
			final com.apple.jobjc.Invoke.MsgSend defaultMenu_CMetInst = get_defaultMenu_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultMenu_CMetInst.init(nativeBuffer, this);
		defaultMenu_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend prefersTrackingUntilMouseUp_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_prefersTrackingUntilMouseUp_CMetInst(){
		return ((prefersTrackingUntilMouseUp_CMetInst != null)
	? (prefersTrackingUntilMouseUp_CMetInst)
	: (prefersTrackingUntilMouseUp_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "prefersTrackingUntilMouseUp", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean prefersTrackingUntilMouseUp(){
			final com.apple.jobjc.Invoke.MsgSend prefersTrackingUntilMouseUp_CMetInst = get_prefersTrackingUntilMouseUp_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		prefersTrackingUntilMouseUp_CMetInst.init(nativeBuffer, this);
		prefersTrackingUntilMouseUp_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
