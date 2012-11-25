package com.apple.jobjc.appkit;

public  class NSColorWell extends com.apple.jobjc.appkit.NSControl {
	public NSColorWell(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSColorWell(final NSColorWell obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend activate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_activate_IMetInst(){
		return ((activate_IMetInst != null)
	? (activate_IMetInst)
	: (activate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "activate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void activate(final boolean exclusive){
			final com.apple.jobjc.Invoke.MsgSend activate_IMetInst = get_activate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		activate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, exclusive);
		activate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend color_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_color_IMetInst(){
		return ((color_IMetInst != null)
	? (color_IMetInst)
	: (color_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "color", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor color(){
			final com.apple.jobjc.Invoke.MsgSend color_IMetInst = get_color_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		color_IMetInst.init(nativeBuffer, this);
		color_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deactivate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deactivate_IMetInst(){
		return ((deactivate_IMetInst != null)
	? (deactivate_IMetInst)
	: (deactivate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deactivate", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void deactivate(){
			final com.apple.jobjc.Invoke.MsgSend deactivate_IMetInst = get_deactivate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deactivate_IMetInst.init(nativeBuffer, this);
		deactivate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawWellInside_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawWellInside_IMetInst(){
		return ((drawWellInside_IMetInst != null)
	? (drawWellInside_IMetInst)
	: (drawWellInside_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawWellInside:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawWellInside(final com.apple.jobjc.foundation.NSRect insideRect){
			final com.apple.jobjc.Invoke.MsgSend drawWellInside_IMetInst = get_drawWellInside_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawWellInside_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, insideRect);
		drawWellInside_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isActive_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isActive_IMetInst(){
		return ((isActive_IMetInst != null)
	? (isActive_IMetInst)
	: (isActive_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isActive", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isActive(){
			final com.apple.jobjc.Invoke.MsgSend isActive_IMetInst = get_isActive_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isActive_IMetInst.init(nativeBuffer, this);
		isActive_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isBordered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isBordered_IMetInst(){
		return ((isBordered_IMetInst != null)
	? (isBordered_IMetInst)
	: (isBordered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isBordered", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isBordered(){
			final com.apple.jobjc.Invoke.MsgSend isBordered_IMetInst = get_isBordered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isBordered_IMetInst.init(nativeBuffer, this);
		isBordered_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setBordered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBordered_IMetInst(){
		return ((setBordered_IMetInst != null)
	? (setBordered_IMetInst)
	: (setBordered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBordered:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setBordered(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setBordered_IMetInst = get_setBordered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBordered_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setBordered_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setColor_IMetInst(){
		return ((setColor_IMetInst != null)
	? (setColor_IMetInst)
	: (setColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setColor(final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend setColor_IMetInst = get_setColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		setColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend takeColorFrom_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_takeColorFrom_IMetInst(){
		return ((takeColorFrom_IMetInst != null)
	? (takeColorFrom_IMetInst)
	: (takeColorFrom_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "takeColorFrom:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void takeColorFrom(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend takeColorFrom_IMetInst = get_takeColorFrom_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		takeColorFrom_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		takeColorFrom_IMetInst.invoke(nativeBuffer);
		
		
	}

}
