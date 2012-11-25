package com.apple.jobjc.appkit;

public  class NSViewClass extends com.apple.jobjc.appkit.NSResponderClass {
	public NSViewClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSViewClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSViewClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend focusView_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_focusView_CMetInst(){
		return ((focusView_CMetInst != null)
	? (focusView_CMetInst)
	: (focusView_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "focusView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView focusView(){
			final com.apple.jobjc.Invoke.MsgSend focusView_CMetInst = get_focusView_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		focusView_CMetInst.init(nativeBuffer, this);
		focusView_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend requiresConstraintBasedLayout_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_requiresConstraintBasedLayout_CMetInst(){
		return ((requiresConstraintBasedLayout_CMetInst != null)
	? (requiresConstraintBasedLayout_CMetInst)
	: (requiresConstraintBasedLayout_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "requiresConstraintBasedLayout", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean requiresConstraintBasedLayout(){
			final com.apple.jobjc.Invoke.MsgSend requiresConstraintBasedLayout_CMetInst = get_requiresConstraintBasedLayout_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		requiresConstraintBasedLayout_CMetInst.init(nativeBuffer, this);
		requiresConstraintBasedLayout_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
