package com.apple.jobjc.appkit;

public  class NSSliderCellClass extends com.apple.jobjc.appkit.NSActionCellClass {
	public NSSliderCellClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSSliderCellClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSSliderCellClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
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
