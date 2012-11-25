package com.apple.jobjc.appkit;

public  class NSOpenGLPixelBuffer extends com.apple.jobjc.foundation.NSObject {
	public NSOpenGLPixelBuffer(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSOpenGLPixelBuffer(final NSOpenGLPixelBuffer obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend CGLPBufferObj_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_CGLPBufferObj_IMetInst(){
		return ((CGLPBufferObj_IMetInst != null)
	? (CGLPBufferObj_IMetInst)
	: (CGLPBufferObj_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "CGLPBufferObj", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> CGLPBufferObj(){
			final com.apple.jobjc.Invoke.MsgSend CGLPBufferObj_IMetInst = get_CGLPBufferObj_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		CGLPBufferObj_IMetInst.init(nativeBuffer, this);
		CGLPBufferObj_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCGLPBufferObj_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCGLPBufferObj_IMetInst(){
		return ((initWithCGLPBufferObj_IMetInst != null)
	? (initWithCGLPBufferObj_IMetInst)
	: (initWithCGLPBufferObj_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCGLPBufferObj:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCGLPBufferObj(final com.apple.jobjc.Pointer<Void> pbuffer){
			final com.apple.jobjc.Invoke.MsgSend initWithCGLPBufferObj_IMetInst = get_initWithCGLPBufferObj_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCGLPBufferObj_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, pbuffer);
		initWithCGLPBufferObj_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithTextureTarget_textureInternalFormat_textureMaxMipMapLevel_pixelsWide_pixelsHigh_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithTextureTarget_textureInternalFormat_textureMaxMipMapLevel_pixelsWide_pixelsHigh_IMetInst(){
		return ((initWithTextureTarget_textureInternalFormat_textureMaxMipMapLevel_pixelsWide_pixelsHigh_IMetInst != null)
	? (initWithTextureTarget_textureInternalFormat_textureMaxMipMapLevel_pixelsWide_pixelsHigh_IMetInst)
	: (initWithTextureTarget_textureInternalFormat_textureMaxMipMapLevel_pixelsWide_pixelsHigh_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithTextureTarget:textureInternalFormat:textureMaxMipMapLevel:pixelsWide:pixelsHigh:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithTextureTarget_textureInternalFormat_textureMaxMipMapLevel_pixelsWide_pixelsHigh(final int target, final int format, final int maxLevel, final int pixelsWide, final int pixelsHigh){
			final com.apple.jobjc.Invoke.MsgSend initWithTextureTarget_textureInternalFormat_textureMaxMipMapLevel_pixelsWide_pixelsHigh_IMetInst = get_initWithTextureTarget_textureInternalFormat_textureMaxMipMapLevel_pixelsWide_pixelsHigh_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithTextureTarget_textureInternalFormat_textureMaxMipMapLevel_pixelsWide_pixelsHigh_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, format);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, maxLevel);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, pixelsWide);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, pixelsHigh);
		initWithTextureTarget_textureInternalFormat_textureMaxMipMapLevel_pixelsWide_pixelsHigh_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pixelsHigh_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pixelsHigh_IMetInst(){
		return ((pixelsHigh_IMetInst != null)
	? (pixelsHigh_IMetInst)
	: (pixelsHigh_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pixelsHigh", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int pixelsHigh(){
			final com.apple.jobjc.Invoke.MsgSend pixelsHigh_IMetInst = get_pixelsHigh_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pixelsHigh_IMetInst.init(nativeBuffer, this);
		pixelsHigh_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pixelsWide_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pixelsWide_IMetInst(){
		return ((pixelsWide_IMetInst != null)
	? (pixelsWide_IMetInst)
	: (pixelsWide_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pixelsWide", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int pixelsWide(){
			final com.apple.jobjc.Invoke.MsgSend pixelsWide_IMetInst = get_pixelsWide_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pixelsWide_IMetInst.init(nativeBuffer, this);
		pixelsWide_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textureInternalFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textureInternalFormat_IMetInst(){
		return ((textureInternalFormat_IMetInst != null)
	? (textureInternalFormat_IMetInst)
	: (textureInternalFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textureInternalFormat", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public int textureInternalFormat(){
			final com.apple.jobjc.Invoke.MsgSend textureInternalFormat_IMetInst = get_textureInternalFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textureInternalFormat_IMetInst.init(nativeBuffer, this);
		textureInternalFormat_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textureMaxMipMapLevel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textureMaxMipMapLevel_IMetInst(){
		return ((textureMaxMipMapLevel_IMetInst != null)
	? (textureMaxMipMapLevel_IMetInst)
	: (textureMaxMipMapLevel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textureMaxMipMapLevel", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int textureMaxMipMapLevel(){
			final com.apple.jobjc.Invoke.MsgSend textureMaxMipMapLevel_IMetInst = get_textureMaxMipMapLevel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textureMaxMipMapLevel_IMetInst.init(nativeBuffer, this);
		textureMaxMipMapLevel_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textureTarget_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textureTarget_IMetInst(){
		return ((textureTarget_IMetInst != null)
	? (textureTarget_IMetInst)
	: (textureTarget_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textureTarget", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public int textureTarget(){
			final com.apple.jobjc.Invoke.MsgSend textureTarget_IMetInst = get_textureTarget_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textureTarget_IMetInst.init(nativeBuffer, this);
		textureTarget_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

}
