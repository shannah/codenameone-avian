package com.apple.jobjc.appkit;

public  class NSColorPanel extends com.apple.jobjc.appkit.NSPanel {
	public NSColorPanel(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSColorPanel(final NSColorPanel obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend accessoryView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessoryView_IMetInst(){
		return ((accessoryView_IMetInst != null)
	? (accessoryView_IMetInst)
	: (accessoryView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessoryView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView accessoryView(){
			final com.apple.jobjc.Invoke.MsgSend accessoryView_IMetInst = get_accessoryView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessoryView_IMetInst.init(nativeBuffer, this);
		accessoryView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend alpha_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alpha_IMetInst(){
		return ((alpha_IMetInst != null)
	? (alpha_IMetInst)
	: (alpha_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alpha", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double alpha(){
			final com.apple.jobjc.Invoke.MsgSend alpha_IMetInst = get_alpha_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alpha_IMetInst.init(nativeBuffer, this);
		alpha_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attachColorList_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attachColorList_IMetInst(){
		return ((attachColorList_IMetInst != null)
	? (attachColorList_IMetInst)
	: (attachColorList_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attachColorList:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void attachColorList(final com.apple.jobjc.appkit.NSColorList colorList){
			final com.apple.jobjc.Invoke.MsgSend attachColorList_IMetInst = get_attachColorList_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attachColorList_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, colorList);
		attachColorList_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend detachColorList_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_detachColorList_IMetInst(){
		return ((detachColorList_IMetInst != null)
	? (detachColorList_IMetInst)
	: (detachColorList_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "detachColorList:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void detachColorList(final com.apple.jobjc.appkit.NSColorList colorList){
			final com.apple.jobjc.Invoke.MsgSend detachColorList_IMetInst = get_detachColorList_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		detachColorList_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, colorList);
		detachColorList_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isContinuous_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isContinuous_IMetInst(){
		return ((isContinuous_IMetInst != null)
	? (isContinuous_IMetInst)
	: (isContinuous_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isContinuous", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isContinuous(){
			final com.apple.jobjc.Invoke.MsgSend isContinuous_IMetInst = get_isContinuous_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isContinuous_IMetInst.init(nativeBuffer, this);
		isContinuous_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mode_IMetInst(){
		return ((mode_IMetInst != null)
	? (mode_IMetInst)
	: (mode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mode", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long mode(){
			final com.apple.jobjc.Invoke.MsgSend mode_IMetInst = get_mode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mode_IMetInst.init(nativeBuffer, this);
		mode_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAccessoryView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAccessoryView_IMetInst(){
		return ((setAccessoryView_IMetInst != null)
	? (setAccessoryView_IMetInst)
	: (setAccessoryView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAccessoryView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAccessoryView(final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend setAccessoryView_IMetInst = get_setAccessoryView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAccessoryView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
		setAccessoryView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAction_IMetInst(){
		return ((setAction_IMetInst != null)
	? (setAction_IMetInst)
	: (setAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public void setAction(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.MsgSend setAction_IMetInst = get_setAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		setAction_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setContinuous_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContinuous_IMetInst(){
		return ((setContinuous_IMetInst != null)
	? (setContinuous_IMetInst)
	: (setContinuous_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContinuous:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setContinuous(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setContinuous_IMetInst = get_setContinuous_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContinuous_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setContinuous_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMode_IMetInst(){
		return ((setMode_IMetInst != null)
	? (setMode_IMetInst)
	: (setMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setMode(final long mode){
			final com.apple.jobjc.Invoke.MsgSend setMode_IMetInst = get_setMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, mode);
		setMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShowsAlpha_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShowsAlpha_IMetInst(){
		return ((setShowsAlpha_IMetInst != null)
	? (setShowsAlpha_IMetInst)
	: (setShowsAlpha_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShowsAlpha:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShowsAlpha(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setShowsAlpha_IMetInst = get_setShowsAlpha_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShowsAlpha_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setShowsAlpha_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTarget_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTarget_IMetInst(){
		return ((setTarget_IMetInst != null)
	? (setTarget_IMetInst)
	: (setTarget_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTarget:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTarget(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setTarget_IMetInst = get_setTarget_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTarget_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setTarget_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showsAlpha_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showsAlpha_IMetInst(){
		return ((showsAlpha_IMetInst != null)
	? (showsAlpha_IMetInst)
	: (showsAlpha_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showsAlpha", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean showsAlpha(){
			final com.apple.jobjc.Invoke.MsgSend showsAlpha_IMetInst = get_showsAlpha_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showsAlpha_IMetInst.init(nativeBuffer, this);
		showsAlpha_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
