package com.apple.jobjc.appkit;

public  class NSStatusBar extends com.apple.jobjc.foundation.NSObject {
	public NSStatusBar(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSStatusBar(final NSStatusBar obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend isVertical_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isVertical_IMetInst(){
		return ((isVertical_IMetInst != null)
	? (isVertical_IMetInst)
	: (isVertical_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isVertical", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isVertical(){
			final com.apple.jobjc.Invoke.MsgSend isVertical_IMetInst = get_isVertical_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isVertical_IMetInst.init(nativeBuffer, this);
		isVertical_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeStatusItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeStatusItem_IMetInst(){
		return ((removeStatusItem_IMetInst != null)
	? (removeStatusItem_IMetInst)
	: (removeStatusItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeStatusItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeStatusItem(final com.apple.jobjc.appkit.NSStatusItem item){
			final com.apple.jobjc.Invoke.MsgSend removeStatusItem_IMetInst = get_removeStatusItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeStatusItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		removeStatusItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend statusItemWithLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_statusItemWithLength_IMetInst(){
		return ((statusItemWithLength_IMetInst != null)
	? (statusItemWithLength_IMetInst)
	: (statusItemWithLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "statusItemWithLength:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSStatusItem statusItemWithLength(final double length){
			final com.apple.jobjc.Invoke.MsgSend statusItemWithLength_IMetInst = get_statusItemWithLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		statusItemWithLength_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, length);
		statusItemWithLength_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSStatusItem returnValue = (com.apple.jobjc.appkit.NSStatusItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend thickness_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_thickness_IMetInst(){
		return ((thickness_IMetInst != null)
	? (thickness_IMetInst)
	: (thickness_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "thickness", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double thickness(){
			final com.apple.jobjc.Invoke.MsgSend thickness_IMetInst = get_thickness_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		thickness_IMetInst.init(nativeBuffer, this);
		thickness_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

}
