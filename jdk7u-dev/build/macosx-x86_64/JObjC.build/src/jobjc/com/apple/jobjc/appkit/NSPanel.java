package com.apple.jobjc.appkit;

public  class NSPanel extends com.apple.jobjc.appkit.NSWindow {
	public NSPanel(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPanel(final NSPanel obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend becomesKeyOnlyIfNeeded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_becomesKeyOnlyIfNeeded_IMetInst(){
		return ((becomesKeyOnlyIfNeeded_IMetInst != null)
	? (becomesKeyOnlyIfNeeded_IMetInst)
	: (becomesKeyOnlyIfNeeded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "becomesKeyOnlyIfNeeded", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean becomesKeyOnlyIfNeeded(){
			final com.apple.jobjc.Invoke.MsgSend becomesKeyOnlyIfNeeded_IMetInst = get_becomesKeyOnlyIfNeeded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		becomesKeyOnlyIfNeeded_IMetInst.init(nativeBuffer, this);
		becomesKeyOnlyIfNeeded_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isFloatingPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isFloatingPanel_IMetInst(){
		return ((isFloatingPanel_IMetInst != null)
	? (isFloatingPanel_IMetInst)
	: (isFloatingPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isFloatingPanel", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isFloatingPanel(){
			final com.apple.jobjc.Invoke.MsgSend isFloatingPanel_IMetInst = get_isFloatingPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isFloatingPanel_IMetInst.init(nativeBuffer, this);
		isFloatingPanel_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setBecomesKeyOnlyIfNeeded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBecomesKeyOnlyIfNeeded_IMetInst(){
		return ((setBecomesKeyOnlyIfNeeded_IMetInst != null)
	? (setBecomesKeyOnlyIfNeeded_IMetInst)
	: (setBecomesKeyOnlyIfNeeded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBecomesKeyOnlyIfNeeded:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setBecomesKeyOnlyIfNeeded(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setBecomesKeyOnlyIfNeeded_IMetInst = get_setBecomesKeyOnlyIfNeeded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBecomesKeyOnlyIfNeeded_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setBecomesKeyOnlyIfNeeded_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFloatingPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFloatingPanel_IMetInst(){
		return ((setFloatingPanel_IMetInst != null)
	? (setFloatingPanel_IMetInst)
	: (setFloatingPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFloatingPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setFloatingPanel(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setFloatingPanel_IMetInst = get_setFloatingPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFloatingPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setFloatingPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWorksWhenModal_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWorksWhenModal_IMetInst(){
		return ((setWorksWhenModal_IMetInst != null)
	? (setWorksWhenModal_IMetInst)
	: (setWorksWhenModal_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWorksWhenModal:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setWorksWhenModal(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setWorksWhenModal_IMetInst = get_setWorksWhenModal_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWorksWhenModal_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setWorksWhenModal_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend worksWhenModal_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_worksWhenModal_IMetInst(){
		return ((worksWhenModal_IMetInst != null)
	? (worksWhenModal_IMetInst)
	: (worksWhenModal_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "worksWhenModal", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean worksWhenModal(){
			final com.apple.jobjc.Invoke.MsgSend worksWhenModal_IMetInst = get_worksWhenModal_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		worksWhenModal_IMetInst.init(nativeBuffer, this);
		worksWhenModal_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
