package com.apple.jobjc.appkit;

public  class NSOpenGLPixelFormat extends com.apple.jobjc.foundation.NSObject {
	public NSOpenGLPixelFormat(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSOpenGLPixelFormat(final NSOpenGLPixelFormat obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend CGLPixelFormatObj_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_CGLPixelFormatObj_IMetInst(){
		return ((CGLPixelFormatObj_IMetInst != null)
	? (CGLPixelFormatObj_IMetInst)
	: (CGLPixelFormatObj_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "CGLPixelFormatObj", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> CGLPixelFormatObj(){
			final com.apple.jobjc.Invoke.MsgSend CGLPixelFormatObj_IMetInst = get_CGLPixelFormatObj_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		CGLPixelFormatObj_IMetInst.init(nativeBuffer, this);
		CGLPixelFormatObj_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributes_IMetInst(){
		return ((attributes_IMetInst != null)
	? (attributes_IMetInst)
	: (attributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData attributes(){
			final com.apple.jobjc.Invoke.MsgSend attributes_IMetInst = get_attributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributes_IMetInst.init(nativeBuffer, this);
		attributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getValues_forAttribute_forVirtualScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getValues_forAttribute_forVirtualScreen_IMetInst(){
		return ((getValues_forAttribute_forVirtualScreen_IMetInst != null)
	? (getValues_forAttribute_forVirtualScreen_IMetInst)
	: (getValues_forAttribute_forVirtualScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getValues:forAttribute:forVirtualScreen:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public void getValues_forAttribute_forVirtualScreen(final com.apple.jobjc.Pointer<java.lang.Integer> vals, final int attrib, final int screen){
			final com.apple.jobjc.Invoke.MsgSend getValues_forAttribute_forVirtualScreen_IMetInst = get_getValues_forAttribute_forVirtualScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getValues_forAttribute_forVirtualScreen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, vals);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, attrib);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, screen);
		getValues_forAttribute_forVirtualScreen_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithAttributes_IMetInst(){
		return ((initWithAttributes_IMetInst != null)
	? (initWithAttributes_IMetInst)
	: (initWithAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithAttributes(final com.apple.jobjc.Pointer<java.lang.Integer> attribs){
			final com.apple.jobjc.Invoke.MsgSend initWithAttributes_IMetInst = get_initWithAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, attribs);
		initWithAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCGLPixelFormatObj_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCGLPixelFormatObj_IMetInst(){
		return ((initWithCGLPixelFormatObj_IMetInst != null)
	? (initWithCGLPixelFormatObj_IMetInst)
	: (initWithCGLPixelFormatObj_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCGLPixelFormatObj:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCGLPixelFormatObj(final com.apple.jobjc.Pointer<Void> format){
			final com.apple.jobjc.Invoke.MsgSend initWithCGLPixelFormatObj_IMetInst = get_initWithCGLPixelFormatObj_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCGLPixelFormatObj_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, format);
		initWithCGLPixelFormatObj_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithData_IMetInst(){
		return ((initWithData_IMetInst != null)
	? (initWithData_IMetInst)
	: (initWithData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithData(final com.apple.jobjc.foundation.NSData attribs){
			final com.apple.jobjc.Invoke.MsgSend initWithData_IMetInst = get_initWithData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attribs);
		initWithData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfVirtualScreens_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfVirtualScreens_IMetInst(){
		return ((numberOfVirtualScreens_IMetInst != null)
	? (numberOfVirtualScreens_IMetInst)
	: (numberOfVirtualScreens_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfVirtualScreens", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int numberOfVirtualScreens(){
			final com.apple.jobjc.Invoke.MsgSend numberOfVirtualScreens_IMetInst = get_numberOfVirtualScreens_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfVirtualScreens_IMetInst.init(nativeBuffer, this);
		numberOfVirtualScreens_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttributes_IMetInst(){
		return ((setAttributes_IMetInst != null)
	? (setAttributes_IMetInst)
	: (setAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttributes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAttributes(final com.apple.jobjc.foundation.NSData attribs){
			final com.apple.jobjc.Invoke.MsgSend setAttributes_IMetInst = get_setAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attribs);
		setAttributes_IMetInst.invoke(nativeBuffer);
		
		
	}

}
