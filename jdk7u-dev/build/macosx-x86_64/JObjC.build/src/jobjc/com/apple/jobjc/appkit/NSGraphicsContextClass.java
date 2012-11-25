package com.apple.jobjc.appkit;

public  class NSGraphicsContextClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSGraphicsContextClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSGraphicsContextClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSGraphicsContextClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend currentContext_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentContext_CMetInst(){
		return ((currentContext_CMetInst != null)
	? (currentContext_CMetInst)
	: (currentContext_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentContext", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSGraphicsContext currentContext(){
			final com.apple.jobjc.Invoke.MsgSend currentContext_CMetInst = get_currentContext_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentContext_CMetInst.init(nativeBuffer, this);
		currentContext_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSGraphicsContext returnValue = (com.apple.jobjc.appkit.NSGraphicsContext) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentContextDrawingToScreen_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentContextDrawingToScreen_CMetInst(){
		return ((currentContextDrawingToScreen_CMetInst != null)
	? (currentContextDrawingToScreen_CMetInst)
	: (currentContextDrawingToScreen_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentContextDrawingToScreen", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean currentContextDrawingToScreen(){
			final com.apple.jobjc.Invoke.MsgSend currentContextDrawingToScreen_CMetInst = get_currentContextDrawingToScreen_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentContextDrawingToScreen_CMetInst.init(nativeBuffer, this);
		currentContextDrawingToScreen_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend graphicsContextWithAttributes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_graphicsContextWithAttributes_CMetInst(){
		return ((graphicsContextWithAttributes_CMetInst != null)
	? (graphicsContextWithAttributes_CMetInst)
	: (graphicsContextWithAttributes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "graphicsContextWithAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSGraphicsContext graphicsContextWithAttributes(final com.apple.jobjc.foundation.NSDictionary attributes){
			final com.apple.jobjc.Invoke.MsgSend graphicsContextWithAttributes_CMetInst = get_graphicsContextWithAttributes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		graphicsContextWithAttributes_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributes);
		graphicsContextWithAttributes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSGraphicsContext returnValue = (com.apple.jobjc.appkit.NSGraphicsContext) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend graphicsContextWithBitmapImageRep_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_graphicsContextWithBitmapImageRep_CMetInst(){
		return ((graphicsContextWithBitmapImageRep_CMetInst != null)
	? (graphicsContextWithBitmapImageRep_CMetInst)
	: (graphicsContextWithBitmapImageRep_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "graphicsContextWithBitmapImageRep:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSGraphicsContext graphicsContextWithBitmapImageRep(final com.apple.jobjc.appkit.NSBitmapImageRep bitmapRep){
			final com.apple.jobjc.Invoke.MsgSend graphicsContextWithBitmapImageRep_CMetInst = get_graphicsContextWithBitmapImageRep_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		graphicsContextWithBitmapImageRep_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bitmapRep);
		graphicsContextWithBitmapImageRep_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSGraphicsContext returnValue = (com.apple.jobjc.appkit.NSGraphicsContext) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend graphicsContextWithGraphicsPort_flipped_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_graphicsContextWithGraphicsPort_flipped_CMetInst(){
		return ((graphicsContextWithGraphicsPort_flipped_CMetInst != null)
	? (graphicsContextWithGraphicsPort_flipped_CMetInst)
	: (graphicsContextWithGraphicsPort_flipped_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "graphicsContextWithGraphicsPort:flipped:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSGraphicsContext graphicsContextWithGraphicsPort_flipped(final com.apple.jobjc.Pointer<Void> graphicsPort, final boolean initialFlippedState){
			final com.apple.jobjc.Invoke.MsgSend graphicsContextWithGraphicsPort_flipped_CMetInst = get_graphicsContextWithGraphicsPort_flipped_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		graphicsContextWithGraphicsPort_flipped_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, graphicsPort);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, initialFlippedState);
		graphicsContextWithGraphicsPort_flipped_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSGraphicsContext returnValue = (com.apple.jobjc.appkit.NSGraphicsContext) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend graphicsContextWithWindow_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_graphicsContextWithWindow_CMetInst(){
		return ((graphicsContextWithWindow_CMetInst != null)
	? (graphicsContextWithWindow_CMetInst)
	: (graphicsContextWithWindow_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "graphicsContextWithWindow:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSGraphicsContext graphicsContextWithWindow(final com.apple.jobjc.appkit.NSWindow window){
			final com.apple.jobjc.Invoke.MsgSend graphicsContextWithWindow_CMetInst = get_graphicsContextWithWindow_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		graphicsContextWithWindow_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		graphicsContextWithWindow_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSGraphicsContext returnValue = (com.apple.jobjc.appkit.NSGraphicsContext) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend restoreGraphicsState_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_restoreGraphicsState_CMetInst(){
		return ((restoreGraphicsState_CMetInst != null)
	? (restoreGraphicsState_CMetInst)
	: (restoreGraphicsState_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "restoreGraphicsState", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void restoreGraphicsState(){
			final com.apple.jobjc.Invoke.MsgSend restoreGraphicsState_CMetInst = get_restoreGraphicsState_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		restoreGraphicsState_CMetInst.init(nativeBuffer, this);
		restoreGraphicsState_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend saveGraphicsState_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_saveGraphicsState_CMetInst(){
		return ((saveGraphicsState_CMetInst != null)
	? (saveGraphicsState_CMetInst)
	: (saveGraphicsState_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "saveGraphicsState", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void saveGraphicsState(){
			final com.apple.jobjc.Invoke.MsgSend saveGraphicsState_CMetInst = get_saveGraphicsState_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		saveGraphicsState_CMetInst.init(nativeBuffer, this);
		saveGraphicsState_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCurrentContext_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCurrentContext_CMetInst(){
		return ((setCurrentContext_CMetInst != null)
	? (setCurrentContext_CMetInst)
	: (setCurrentContext_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCurrentContext:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCurrentContext(final com.apple.jobjc.appkit.NSGraphicsContext context){
			final com.apple.jobjc.Invoke.MsgSend setCurrentContext_CMetInst = get_setCurrentContext_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCurrentContext_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, context);
		setCurrentContext_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setGraphicsState_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setGraphicsState_CMetInst(){
		return ((setGraphicsState_CMetInst != null)
	? (setGraphicsState_CMetInst)
	: (setGraphicsState_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setGraphicsState:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setGraphicsState(final long gState){
			final com.apple.jobjc.Invoke.MsgSend setGraphicsState_CMetInst = get_setGraphicsState_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setGraphicsState_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, gState);
		setGraphicsState_CMetInst.invoke(nativeBuffer);
		
		
	}

}
