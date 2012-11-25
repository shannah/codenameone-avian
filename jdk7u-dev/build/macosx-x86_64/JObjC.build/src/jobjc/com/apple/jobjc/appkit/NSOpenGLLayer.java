package com.apple.jobjc.appkit;

public  class NSOpenGLLayer extends com.apple.jobjc.foundation.NSObject {
	public NSOpenGLLayer(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSOpenGLLayer(final NSOpenGLLayer obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend canDrawInOpenGLContext_pixelFormat_forLayerTime_displayTime_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canDrawInOpenGLContext_pixelFormat_forLayerTime_displayTime_IMetInst(){
		return ((canDrawInOpenGLContext_pixelFormat_forLayerTime_displayTime_IMetInst != null)
	? (canDrawInOpenGLContext_pixelFormat_forLayerTime_displayTime_IMetInst)
	: (canDrawInOpenGLContext_pixelFormat_forLayerTime_displayTime_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canDrawInOpenGLContext:pixelFormat:forLayerTime:displayTime:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public boolean canDrawInOpenGLContext_pixelFormat_forLayerTime_displayTime(final com.apple.jobjc.appkit.NSOpenGLContext context, final com.apple.jobjc.appkit.NSOpenGLPixelFormat pixelFormat, final double t, final Object /* CVTimeStamp* (^{_CVTimeStamp=IiqQdq{CVSMPTETime=ssIIIssss}QQ}, ^{_CVTimeStamp=IiqQdq{CVSMPTETime=ssIIIssss}QQ}) */ ts){
			final com.apple.jobjc.Invoke.MsgSend canDrawInOpenGLContext_pixelFormat_forLayerTime_displayTime_IMetInst = get_canDrawInOpenGLContext_pixelFormat_forLayerTime_displayTime_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canDrawInOpenGLContext_pixelFormat_forLayerTime_displayTime_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, context);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pixelFormat);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, t);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, ts);
		canDrawInOpenGLContext_pixelFormat_forLayerTime_displayTime_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawInOpenGLContext_pixelFormat_forLayerTime_displayTime_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawInOpenGLContext_pixelFormat_forLayerTime_displayTime_IMetInst(){
		return ((drawInOpenGLContext_pixelFormat_forLayerTime_displayTime_IMetInst != null)
	? (drawInOpenGLContext_pixelFormat_forLayerTime_displayTime_IMetInst)
	: (drawInOpenGLContext_pixelFormat_forLayerTime_displayTime_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawInOpenGLContext:pixelFormat:forLayerTime:displayTime:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void drawInOpenGLContext_pixelFormat_forLayerTime_displayTime(final com.apple.jobjc.appkit.NSOpenGLContext context, final com.apple.jobjc.appkit.NSOpenGLPixelFormat pixelFormat, final double t, final Object /* CVTimeStamp* (^{_CVTimeStamp=IiqQdq{CVSMPTETime=ssIIIssss}QQ}, ^{_CVTimeStamp=IiqQdq{CVSMPTETime=ssIIIssss}QQ}) */ ts){
			final com.apple.jobjc.Invoke.MsgSend drawInOpenGLContext_pixelFormat_forLayerTime_displayTime_IMetInst = get_drawInOpenGLContext_pixelFormat_forLayerTime_displayTime_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawInOpenGLContext_pixelFormat_forLayerTime_displayTime_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, context);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pixelFormat);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, t);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, ts);
		drawInOpenGLContext_pixelFormat_forLayerTime_displayTime_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend openGLContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openGLContext_IMetInst(){
		return ((openGLContext_IMetInst != null)
	? (openGLContext_IMetInst)
	: (openGLContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openGLContext", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSOpenGLContext openGLContext(){
			final com.apple.jobjc.Invoke.MsgSend openGLContext_IMetInst = get_openGLContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openGLContext_IMetInst.init(nativeBuffer, this);
		openGLContext_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSOpenGLContext returnValue = (com.apple.jobjc.appkit.NSOpenGLContext) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend openGLContextForPixelFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openGLContextForPixelFormat_IMetInst(){
		return ((openGLContextForPixelFormat_IMetInst != null)
	? (openGLContextForPixelFormat_IMetInst)
	: (openGLContextForPixelFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openGLContextForPixelFormat:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSOpenGLContext openGLContextForPixelFormat(final com.apple.jobjc.appkit.NSOpenGLPixelFormat pixelFormat){
			final com.apple.jobjc.Invoke.MsgSend openGLContextForPixelFormat_IMetInst = get_openGLContextForPixelFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openGLContextForPixelFormat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pixelFormat);
		openGLContextForPixelFormat_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSOpenGLContext returnValue = (com.apple.jobjc.appkit.NSOpenGLContext) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend openGLPixelFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openGLPixelFormat_IMetInst(){
		return ((openGLPixelFormat_IMetInst != null)
	? (openGLPixelFormat_IMetInst)
	: (openGLPixelFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openGLPixelFormat", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSOpenGLPixelFormat openGLPixelFormat(){
			final com.apple.jobjc.Invoke.MsgSend openGLPixelFormat_IMetInst = get_openGLPixelFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openGLPixelFormat_IMetInst.init(nativeBuffer, this);
		openGLPixelFormat_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSOpenGLPixelFormat returnValue = (com.apple.jobjc.appkit.NSOpenGLPixelFormat) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend openGLPixelFormatForDisplayMask_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openGLPixelFormatForDisplayMask_IMetInst(){
		return ((openGLPixelFormatForDisplayMask_IMetInst != null)
	? (openGLPixelFormatForDisplayMask_IMetInst)
	: (openGLPixelFormatForDisplayMask_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openGLPixelFormatForDisplayMask:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSOpenGLPixelFormat openGLPixelFormatForDisplayMask(final int mask){
			final com.apple.jobjc.Invoke.MsgSend openGLPixelFormatForDisplayMask_IMetInst = get_openGLPixelFormatForDisplayMask_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openGLPixelFormatForDisplayMask_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, mask);
		openGLPixelFormatForDisplayMask_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSOpenGLPixelFormat returnValue = (com.apple.jobjc.appkit.NSOpenGLPixelFormat) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setOpenGLContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOpenGLContext_IMetInst(){
		return ((setOpenGLContext_IMetInst != null)
	? (setOpenGLContext_IMetInst)
	: (setOpenGLContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOpenGLContext:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setOpenGLContext(final com.apple.jobjc.appkit.NSOpenGLContext openGLContext){
			final com.apple.jobjc.Invoke.MsgSend setOpenGLContext_IMetInst = get_setOpenGLContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOpenGLContext_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, openGLContext);
		setOpenGLContext_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setOpenGLPixelFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOpenGLPixelFormat_IMetInst(){
		return ((setOpenGLPixelFormat_IMetInst != null)
	? (setOpenGLPixelFormat_IMetInst)
	: (setOpenGLPixelFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOpenGLPixelFormat:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setOpenGLPixelFormat(final com.apple.jobjc.appkit.NSOpenGLPixelFormat openGLPixelFormat){
			final com.apple.jobjc.Invoke.MsgSend setOpenGLPixelFormat_IMetInst = get_setOpenGLPixelFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOpenGLPixelFormat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, openGLPixelFormat);
		setOpenGLPixelFormat_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setView_IMetInst(){
		return ((setView_IMetInst != null)
	? (setView_IMetInst)
	: (setView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setView(final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend setView_IMetInst = get_setView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		setView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend view_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_view_IMetInst(){
		return ((view_IMetInst != null)
	? (view_IMetInst)
	: (view_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "view", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView view(){
			final com.apple.jobjc.Invoke.MsgSend view_IMetInst = get_view_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		view_IMetInst.init(nativeBuffer, this);
		view_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
