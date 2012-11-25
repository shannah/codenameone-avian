package com.apple.jobjc.appkit;

public  class NSCustomImageRep extends com.apple.jobjc.appkit.NSImageRep {
	public NSCustomImageRep(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSCustomImageRep(final NSCustomImageRep obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_delegate_IMetInst(){
		return ((delegate_IMetInst != null)
	? (delegate_IMetInst)
	: (delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "delegate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T delegate(){
			final com.apple.jobjc.Invoke.MsgSend delegate_IMetInst = get_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		delegate_IMetInst.init(nativeBuffer, this);
		delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawSelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawSelector_IMetInst(){
		return ((drawSelector_IMetInst != null)
	? (drawSelector_IMetInst)
	: (drawSelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawSelector", com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public com.apple.jobjc.SEL drawSelector(){
			final com.apple.jobjc.Invoke.MsgSend drawSelector_IMetInst = get_drawSelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawSelector_IMetInst.init(nativeBuffer, this);
		drawSelector_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.SEL returnValue = (com.apple.jobjc.SEL) (com.apple.jobjc.Coder.SELCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawingHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawingHandler_IMetInst(){
		return ((drawingHandler_IMetInst != null)
	? (drawingHandler_IMetInst)
	: (drawingHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawingHandler", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* BOOL(^)(NSRect) (@, @) */ drawingHandler(){
			final com.apple.jobjc.Invoke.MsgSend drawingHandler_IMetInst = get_drawingHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawingHandler_IMetInst.init(nativeBuffer, this);
		drawingHandler_IMetInst.invoke(nativeBuffer);
		final Object /* BOOL(^)(NSRect) (@, @) */ returnValue = (Object /* BOOL(^)(NSRect) (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithDrawSelector_delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithDrawSelector_delegate_IMetInst(){
		return ((initWithDrawSelector_delegate_IMetInst != null)
	? (initWithDrawSelector_delegate_IMetInst)
	: (initWithDrawSelector_delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithDrawSelector:delegate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithDrawSelector_delegate(final com.apple.jobjc.SEL aMethod, final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend initWithDrawSelector_delegate_IMetInst = get_initWithDrawSelector_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithDrawSelector_delegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aMethod);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		initWithDrawSelector_delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithSize_flipped_drawingHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithSize_flipped_drawingHandler_IMetInst(){
		return ((initWithSize_flipped_drawingHandler_IMetInst != null)
	? (initWithSize_flipped_drawingHandler_IMetInst)
	: (initWithSize_flipped_drawingHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithSize:flipped:drawingHandler:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithSize_flipped_drawingHandler(final com.apple.jobjc.foundation.NSSize size, final boolean drawingHandlerShouldBeCalledWithFlippedContext, final Object /* BOOL(^)(NSRect) (@, @) */ drawingHandler){
			final com.apple.jobjc.Invoke.MsgSend initWithSize_flipped_drawingHandler_IMetInst = get_initWithSize_flipped_drawingHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithSize_flipped_drawingHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, drawingHandlerShouldBeCalledWithFlippedContext);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, drawingHandler);
		initWithSize_flipped_drawingHandler_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
