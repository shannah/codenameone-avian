package com.apple.jobjc.appkit;

public  class NSOpenGLView extends com.apple.jobjc.appkit.NSView {
	public NSOpenGLView(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSOpenGLView(final NSOpenGLView obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend clearGLContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_clearGLContext_IMetInst(){
		return ((clearGLContext_IMetInst != null)
	? (clearGLContext_IMetInst)
	: (clearGLContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "clearGLContext", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void clearGLContext(){
			final com.apple.jobjc.Invoke.MsgSend clearGLContext_IMetInst = get_clearGLContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		clearGLContext_IMetInst.init(nativeBuffer, this);
		clearGLContext_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithFrame_pixelFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFrame_pixelFormat_IMetInst(){
		return ((initWithFrame_pixelFormat_IMetInst != null)
	? (initWithFrame_pixelFormat_IMetInst)
	: (initWithFrame_pixelFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFrame:pixelFormat:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFrame_pixelFormat(final com.apple.jobjc.foundation.NSRect frameRect, final com.apple.jobjc.appkit.NSOpenGLPixelFormat format){
			final com.apple.jobjc.Invoke.MsgSend initWithFrame_pixelFormat_IMetInst = get_initWithFrame_pixelFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFrame_pixelFormat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frameRect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		initWithFrame_pixelFormat_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend pixelFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pixelFormat_IMetInst(){
		return ((pixelFormat_IMetInst != null)
	? (pixelFormat_IMetInst)
	: (pixelFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pixelFormat", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSOpenGLPixelFormat pixelFormat(){
			final com.apple.jobjc.Invoke.MsgSend pixelFormat_IMetInst = get_pixelFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pixelFormat_IMetInst.init(nativeBuffer, this);
		pixelFormat_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSOpenGLPixelFormat returnValue = (com.apple.jobjc.appkit.NSOpenGLPixelFormat) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend prepareOpenGL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_prepareOpenGL_IMetInst(){
		return ((prepareOpenGL_IMetInst != null)
	? (prepareOpenGL_IMetInst)
	: (prepareOpenGL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "prepareOpenGL", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void prepareOpenGL(){
			final com.apple.jobjc.Invoke.MsgSend prepareOpenGL_IMetInst = get_prepareOpenGL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		prepareOpenGL_IMetInst.init(nativeBuffer, this);
		prepareOpenGL_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend reshape_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reshape_IMetInst(){
		return ((reshape_IMetInst != null)
	? (reshape_IMetInst)
	: (reshape_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reshape", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void reshape(){
			final com.apple.jobjc.Invoke.MsgSend reshape_IMetInst = get_reshape_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reshape_IMetInst.init(nativeBuffer, this);
		reshape_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setOpenGLContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOpenGLContext_IMetInst(){
		return ((setOpenGLContext_IMetInst != null)
	? (setOpenGLContext_IMetInst)
	: (setOpenGLContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOpenGLContext:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setOpenGLContext(final com.apple.jobjc.appkit.NSOpenGLContext context){
			final com.apple.jobjc.Invoke.MsgSend setOpenGLContext_IMetInst = get_setOpenGLContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOpenGLContext_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, context);
		setOpenGLContext_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPixelFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPixelFormat_IMetInst(){
		return ((setPixelFormat_IMetInst != null)
	? (setPixelFormat_IMetInst)
	: (setPixelFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPixelFormat:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPixelFormat(final com.apple.jobjc.appkit.NSOpenGLPixelFormat pixelFormat){
			final com.apple.jobjc.Invoke.MsgSend setPixelFormat_IMetInst = get_setPixelFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPixelFormat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pixelFormat);
		setPixelFormat_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend update_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_update_IMetInst(){
		return ((update_IMetInst != null)
	? (update_IMetInst)
	: (update_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "update", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void update(){
			final com.apple.jobjc.Invoke.MsgSend update_IMetInst = get_update_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		update_IMetInst.init(nativeBuffer, this);
		update_IMetInst.invoke(nativeBuffer);
		
		
	}

}
