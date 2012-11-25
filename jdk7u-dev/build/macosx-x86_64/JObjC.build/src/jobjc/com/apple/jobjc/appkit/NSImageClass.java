package com.apple.jobjc.appkit;

public  class NSImageClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSImageClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSImageClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSImageClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend canInitWithPasteboard_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canInitWithPasteboard_CMetInst(){
		return ((canInitWithPasteboard_CMetInst != null)
	? (canInitWithPasteboard_CMetInst)
	: (canInitWithPasteboard_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canInitWithPasteboard:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean canInitWithPasteboard(final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend canInitWithPasteboard_CMetInst = get_canInitWithPasteboard_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canInitWithPasteboard_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		canInitWithPasteboard_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageFileTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageFileTypes_CMetInst(){
		return ((imageFileTypes_CMetInst != null)
	? (imageFileTypes_CMetInst)
	: (imageFileTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageFileTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray imageFileTypes(){
			final com.apple.jobjc.Invoke.MsgSend imageFileTypes_CMetInst = get_imageFileTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageFileTypes_CMetInst.init(nativeBuffer, this);
		imageFileTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageNamed_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageNamed_CMetInst(){
		return ((imageNamed_CMetInst != null)
	? (imageNamed_CMetInst)
	: (imageNamed_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageNamed:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T imageNamed(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend imageNamed_CMetInst = get_imageNamed_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageNamed_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		imageNamed_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imagePasteboardTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imagePasteboardTypes_CMetInst(){
		return ((imagePasteboardTypes_CMetInst != null)
	? (imagePasteboardTypes_CMetInst)
	: (imagePasteboardTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imagePasteboardTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray imagePasteboardTypes(){
			final com.apple.jobjc.Invoke.MsgSend imagePasteboardTypes_CMetInst = get_imagePasteboardTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imagePasteboardTypes_CMetInst.init(nativeBuffer, this);
		imagePasteboardTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageTypes_CMetInst(){
		return ((imageTypes_CMetInst != null)
	? (imageTypes_CMetInst)
	: (imageTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray imageTypes(){
			final com.apple.jobjc.Invoke.MsgSend imageTypes_CMetInst = get_imageTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageTypes_CMetInst.init(nativeBuffer, this);
		imageTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageUnfilteredFileTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageUnfilteredFileTypes_CMetInst(){
		return ((imageUnfilteredFileTypes_CMetInst != null)
	? (imageUnfilteredFileTypes_CMetInst)
	: (imageUnfilteredFileTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageUnfilteredFileTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray imageUnfilteredFileTypes(){
			final com.apple.jobjc.Invoke.MsgSend imageUnfilteredFileTypes_CMetInst = get_imageUnfilteredFileTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageUnfilteredFileTypes_CMetInst.init(nativeBuffer, this);
		imageUnfilteredFileTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageUnfilteredPasteboardTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageUnfilteredPasteboardTypes_CMetInst(){
		return ((imageUnfilteredPasteboardTypes_CMetInst != null)
	? (imageUnfilteredPasteboardTypes_CMetInst)
	: (imageUnfilteredPasteboardTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageUnfilteredPasteboardTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray imageUnfilteredPasteboardTypes(){
			final com.apple.jobjc.Invoke.MsgSend imageUnfilteredPasteboardTypes_CMetInst = get_imageUnfilteredPasteboardTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageUnfilteredPasteboardTypes_CMetInst.init(nativeBuffer, this);
		imageUnfilteredPasteboardTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageUnfilteredTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageUnfilteredTypes_CMetInst(){
		return ((imageUnfilteredTypes_CMetInst != null)
	? (imageUnfilteredTypes_CMetInst)
	: (imageUnfilteredTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageUnfilteredTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray imageUnfilteredTypes(){
			final com.apple.jobjc.Invoke.MsgSend imageUnfilteredTypes_CMetInst = get_imageUnfilteredTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageUnfilteredTypes_CMetInst.init(nativeBuffer, this);
		imageUnfilteredTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageWithSize_flipped_drawingHandler_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageWithSize_flipped_drawingHandler_CMetInst(){
		return ((imageWithSize_flipped_drawingHandler_CMetInst != null)
	? (imageWithSize_flipped_drawingHandler_CMetInst)
	: (imageWithSize_flipped_drawingHandler_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageWithSize:flipped:drawingHandler:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T imageWithSize_flipped_drawingHandler(final com.apple.jobjc.foundation.NSSize size, final boolean drawingHandlerShouldBeCalledWithFlippedContext, final Object /* BOOL(^)(NSRect) (@, @) */ drawingHandler){
			final com.apple.jobjc.Invoke.MsgSend imageWithSize_flipped_drawingHandler_CMetInst = get_imageWithSize_flipped_drawingHandler_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageWithSize_flipped_drawingHandler_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, drawingHandlerShouldBeCalledWithFlippedContext);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, drawingHandler);
		imageWithSize_flipped_drawingHandler_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
