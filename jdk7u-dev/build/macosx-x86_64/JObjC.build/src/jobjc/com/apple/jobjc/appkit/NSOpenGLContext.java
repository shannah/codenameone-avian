package com.apple.jobjc.appkit;

public  class NSOpenGLContext extends com.apple.jobjc.foundation.NSObject {
	public NSOpenGLContext(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSOpenGLContext(final NSOpenGLContext obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend CGLContextObj_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_CGLContextObj_IMetInst(){
		return ((CGLContextObj_IMetInst != null)
	? (CGLContextObj_IMetInst)
	: (CGLContextObj_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "CGLContextObj", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> CGLContextObj(){
			final com.apple.jobjc.Invoke.MsgSend CGLContextObj_IMetInst = get_CGLContextObj_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		CGLContextObj_IMetInst.init(nativeBuffer, this);
		CGLContextObj_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend clearDrawable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_clearDrawable_IMetInst(){
		return ((clearDrawable_IMetInst != null)
	? (clearDrawable_IMetInst)
	: (clearDrawable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "clearDrawable", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void clearDrawable(){
			final com.apple.jobjc.Invoke.MsgSend clearDrawable_IMetInst = get_clearDrawable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		clearDrawable_IMetInst.init(nativeBuffer, this);
		clearDrawable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend copyAttributesFromContext_withMask_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_copyAttributesFromContext_withMask_IMetInst(){
		return ((copyAttributesFromContext_withMask_IMetInst != null)
	? (copyAttributesFromContext_withMask_IMetInst)
	: (copyAttributesFromContext_withMask_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "copyAttributesFromContext:withMask:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public void copyAttributesFromContext_withMask(final com.apple.jobjc.appkit.NSOpenGLContext context, final int mask){
			final com.apple.jobjc.Invoke.MsgSend copyAttributesFromContext_withMask_IMetInst = get_copyAttributesFromContext_withMask_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		copyAttributesFromContext_withMask_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, context);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, mask);
		copyAttributesFromContext_withMask_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend createTexture_fromView_internalFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_createTexture_fromView_internalFormat_IMetInst(){
		return ((createTexture_fromView_internalFormat_IMetInst != null)
	? (createTexture_fromView_internalFormat_IMetInst)
	: (createTexture_fromView_internalFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "createTexture:fromView:internalFormat:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public void createTexture_fromView_internalFormat(final int target, final com.apple.jobjc.appkit.NSView view, final int format){
			final com.apple.jobjc.Invoke.MsgSend createTexture_fromView_internalFormat_IMetInst = get_createTexture_fromView_internalFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		createTexture_fromView_internalFormat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, format);
		createTexture_fromView_internalFormat_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend currentVirtualScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentVirtualScreen_IMetInst(){
		return ((currentVirtualScreen_IMetInst != null)
	? (currentVirtualScreen_IMetInst)
	: (currentVirtualScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentVirtualScreen", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int currentVirtualScreen(){
			final com.apple.jobjc.Invoke.MsgSend currentVirtualScreen_IMetInst = get_currentVirtualScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentVirtualScreen_IMetInst.init(nativeBuffer, this);
		currentVirtualScreen_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend flushBuffer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_flushBuffer_IMetInst(){
		return ((flushBuffer_IMetInst != null)
	? (flushBuffer_IMetInst)
	: (flushBuffer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "flushBuffer", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void flushBuffer(){
			final com.apple.jobjc.Invoke.MsgSend flushBuffer_IMetInst = get_flushBuffer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		flushBuffer_IMetInst.init(nativeBuffer, this);
		flushBuffer_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getValues_forParameter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getValues_forParameter_IMetInst(){
		return ((getValues_forParameter_IMetInst != null)
	? (getValues_forParameter_IMetInst)
	: (getValues_forParameter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getValues:forParameter:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public void getValues_forParameter(final com.apple.jobjc.Pointer<java.lang.Integer> vals, final int param){
			final com.apple.jobjc.Invoke.MsgSend getValues_forParameter_IMetInst = get_getValues_forParameter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getValues_forParameter_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, vals);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, param);
		getValues_forParameter_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCGLContextObj_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCGLContextObj_IMetInst(){
		return ((initWithCGLContextObj_IMetInst != null)
	? (initWithCGLContextObj_IMetInst)
	: (initWithCGLContextObj_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCGLContextObj:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCGLContextObj(final com.apple.jobjc.Pointer<Void> context){
			final com.apple.jobjc.Invoke.MsgSend initWithCGLContextObj_IMetInst = get_initWithCGLContextObj_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCGLContextObj_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, context);
		initWithCGLContextObj_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithFormat_shareContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFormat_shareContext_IMetInst(){
		return ((initWithFormat_shareContext_IMetInst != null)
	? (initWithFormat_shareContext_IMetInst)
	: (initWithFormat_shareContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFormat:shareContext:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFormat_shareContext(final com.apple.jobjc.appkit.NSOpenGLPixelFormat format, final com.apple.jobjc.appkit.NSOpenGLContext share){
			final com.apple.jobjc.Invoke.MsgSend initWithFormat_shareContext_IMetInst = get_initWithFormat_shareContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFormat_shareContext_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, share);
		initWithFormat_shareContext_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend makeCurrentContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeCurrentContext_IMetInst(){
		return ((makeCurrentContext_IMetInst != null)
	? (makeCurrentContext_IMetInst)
	: (makeCurrentContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeCurrentContext", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void makeCurrentContext(){
			final com.apple.jobjc.Invoke.MsgSend makeCurrentContext_IMetInst = get_makeCurrentContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeCurrentContext_IMetInst.init(nativeBuffer, this);
		makeCurrentContext_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pixelBuffer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pixelBuffer_IMetInst(){
		return ((pixelBuffer_IMetInst != null)
	? (pixelBuffer_IMetInst)
	: (pixelBuffer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pixelBuffer", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSOpenGLPixelBuffer pixelBuffer(){
			final com.apple.jobjc.Invoke.MsgSend pixelBuffer_IMetInst = get_pixelBuffer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pixelBuffer_IMetInst.init(nativeBuffer, this);
		pixelBuffer_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSOpenGLPixelBuffer returnValue = (com.apple.jobjc.appkit.NSOpenGLPixelBuffer) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pixelBufferCubeMapFace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pixelBufferCubeMapFace_IMetInst(){
		return ((pixelBufferCubeMapFace_IMetInst != null)
	? (pixelBufferCubeMapFace_IMetInst)
	: (pixelBufferCubeMapFace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pixelBufferCubeMapFace", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public int pixelBufferCubeMapFace(){
			final com.apple.jobjc.Invoke.MsgSend pixelBufferCubeMapFace_IMetInst = get_pixelBufferCubeMapFace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pixelBufferCubeMapFace_IMetInst.init(nativeBuffer, this);
		pixelBufferCubeMapFace_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pixelBufferMipMapLevel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pixelBufferMipMapLevel_IMetInst(){
		return ((pixelBufferMipMapLevel_IMetInst != null)
	? (pixelBufferMipMapLevel_IMetInst)
	: (pixelBufferMipMapLevel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pixelBufferMipMapLevel", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int pixelBufferMipMapLevel(){
			final com.apple.jobjc.Invoke.MsgSend pixelBufferMipMapLevel_IMetInst = get_pixelBufferMipMapLevel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pixelBufferMipMapLevel_IMetInst.init(nativeBuffer, this);
		pixelBufferMipMapLevel_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setCurrentVirtualScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCurrentVirtualScreen_IMetInst(){
		return ((setCurrentVirtualScreen_IMetInst != null)
	? (setCurrentVirtualScreen_IMetInst)
	: (setCurrentVirtualScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCurrentVirtualScreen:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public void setCurrentVirtualScreen(final int screen){
			final com.apple.jobjc.Invoke.MsgSend setCurrentVirtualScreen_IMetInst = get_setCurrentVirtualScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCurrentVirtualScreen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, screen);
		setCurrentVirtualScreen_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFullScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFullScreen_IMetInst(){
		return ((setFullScreen_IMetInst != null)
	? (setFullScreen_IMetInst)
	: (setFullScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFullScreen", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void setFullScreen(){
			final com.apple.jobjc.Invoke.MsgSend setFullScreen_IMetInst = get_setFullScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFullScreen_IMetInst.init(nativeBuffer, this);
		setFullScreen_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setOffScreen_width_height_rowbytes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOffScreen_width_height_rowbytes_IMetInst(){
		return ((setOffScreen_width_height_rowbytes_IMetInst != null)
	? (setOffScreen_width_height_rowbytes_IMetInst)
	: (setOffScreen_width_height_rowbytes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOffScreen:width:height:rowbytes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public void setOffScreen_width_height_rowbytes(final com.apple.jobjc.Pointer<Void> baseaddr, final int width, final int height, final int rowbytes){
			final com.apple.jobjc.Invoke.MsgSend setOffScreen_width_height_rowbytes_IMetInst = get_setOffScreen_width_height_rowbytes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOffScreen_width_height_rowbytes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, baseaddr);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, width);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, height);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, rowbytes);
		setOffScreen_width_height_rowbytes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPixelBuffer_cubeMapFace_mipMapLevel_currentVirtualScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPixelBuffer_cubeMapFace_mipMapLevel_currentVirtualScreen_IMetInst(){
		return ((setPixelBuffer_cubeMapFace_mipMapLevel_currentVirtualScreen_IMetInst != null)
	? (setPixelBuffer_cubeMapFace_mipMapLevel_currentVirtualScreen_IMetInst)
	: (setPixelBuffer_cubeMapFace_mipMapLevel_currentVirtualScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPixelBuffer:cubeMapFace:mipMapLevel:currentVirtualScreen:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public void setPixelBuffer_cubeMapFace_mipMapLevel_currentVirtualScreen(final com.apple.jobjc.appkit.NSOpenGLPixelBuffer pixelBuffer, final int face, final int level, final int screen){
			final com.apple.jobjc.Invoke.MsgSend setPixelBuffer_cubeMapFace_mipMapLevel_currentVirtualScreen_IMetInst = get_setPixelBuffer_cubeMapFace_mipMapLevel_currentVirtualScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPixelBuffer_cubeMapFace_mipMapLevel_currentVirtualScreen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pixelBuffer);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, face);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, level);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, screen);
		setPixelBuffer_cubeMapFace_mipMapLevel_currentVirtualScreen_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextureImageToPixelBuffer_colorBuffer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextureImageToPixelBuffer_colorBuffer_IMetInst(){
		return ((setTextureImageToPixelBuffer_colorBuffer_IMetInst != null)
	? (setTextureImageToPixelBuffer_colorBuffer_IMetInst)
	: (setTextureImageToPixelBuffer_colorBuffer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextureImageToPixelBuffer:colorBuffer:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public void setTextureImageToPixelBuffer_colorBuffer(final com.apple.jobjc.appkit.NSOpenGLPixelBuffer pixelBuffer, final int source){
			final com.apple.jobjc.Invoke.MsgSend setTextureImageToPixelBuffer_colorBuffer_IMetInst = get_setTextureImageToPixelBuffer_colorBuffer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextureImageToPixelBuffer_colorBuffer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pixelBuffer);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, source);
		setTextureImageToPixelBuffer_colorBuffer_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setValues_forParameter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setValues_forParameter_IMetInst(){
		return ((setValues_forParameter_IMetInst != null)
	? (setValues_forParameter_IMetInst)
	: (setValues_forParameter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setValues:forParameter:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public void setValues_forParameter(final com.apple.jobjc.Pointer<java.lang.Integer> vals, final int param){
			final com.apple.jobjc.Invoke.MsgSend setValues_forParameter_IMetInst = get_setValues_forParameter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setValues_forParameter_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, vals);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, param);
		setValues_forParameter_IMetInst.invoke(nativeBuffer);
		
		
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
