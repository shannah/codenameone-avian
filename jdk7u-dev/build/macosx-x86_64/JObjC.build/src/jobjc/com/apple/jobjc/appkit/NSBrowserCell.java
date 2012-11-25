package com.apple.jobjc.appkit;

public  class NSBrowserCell extends com.apple.jobjc.appkit.NSCell {
	public NSBrowserCell(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSBrowserCell(final NSBrowserCell obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend alternateImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alternateImage_IMetInst(){
		return ((alternateImage_IMetInst != null)
	? (alternateImage_IMetInst)
	: (alternateImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alternateImage", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage alternateImage(){
			final com.apple.jobjc.Invoke.MsgSend alternateImage_IMetInst = get_alternateImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alternateImage_IMetInst.init(nativeBuffer, this);
		alternateImage_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend highlightColorInView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_highlightColorInView_IMetInst(){
		return ((highlightColorInView_IMetInst != null)
	? (highlightColorInView_IMetInst)
	: (highlightColorInView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "highlightColorInView:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor highlightColorInView(final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend highlightColorInView_IMetInst = get_highlightColorInView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		highlightColorInView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		highlightColorInView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend image_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_image_IMetInst(){
		return ((image_IMetInst != null)
	? (image_IMetInst)
	: (image_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "image", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage image(){
			final com.apple.jobjc.Invoke.MsgSend image_IMetInst = get_image_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		image_IMetInst.init(nativeBuffer, this);
		image_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isLeaf_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isLeaf_IMetInst(){
		return ((isLeaf_IMetInst != null)
	? (isLeaf_IMetInst)
	: (isLeaf_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isLeaf", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isLeaf(){
			final com.apple.jobjc.Invoke.MsgSend isLeaf_IMetInst = get_isLeaf_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isLeaf_IMetInst.init(nativeBuffer, this);
		isLeaf_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isLoaded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isLoaded_IMetInst(){
		return ((isLoaded_IMetInst != null)
	? (isLoaded_IMetInst)
	: (isLoaded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isLoaded", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isLoaded(){
			final com.apple.jobjc.Invoke.MsgSend isLoaded_IMetInst = get_isLoaded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isLoaded_IMetInst.init(nativeBuffer, this);
		isLoaded_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend reset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reset_IMetInst(){
		return ((reset_IMetInst != null)
	? (reset_IMetInst)
	: (reset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reset", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void reset(){
			final com.apple.jobjc.Invoke.MsgSend reset_IMetInst = get_reset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reset_IMetInst.init(nativeBuffer, this);
		reset_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend set_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_set_IMetInst(){
		return ((set_IMetInst != null)
	? (set_IMetInst)
	: (set_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "set", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void set(){
			final com.apple.jobjc.Invoke.MsgSend set_IMetInst = get_set_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		set_IMetInst.init(nativeBuffer, this);
		set_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAlternateImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAlternateImage_IMetInst(){
		return ((setAlternateImage_IMetInst != null)
	? (setAlternateImage_IMetInst)
	: (setAlternateImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAlternateImage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAlternateImage(final com.apple.jobjc.appkit.NSImage newAltImage){
			final com.apple.jobjc.Invoke.MsgSend setAlternateImage_IMetInst = get_setAlternateImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAlternateImage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newAltImage);
		setAlternateImage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImage_IMetInst(){
		return ((setImage_IMetInst != null)
	? (setImage_IMetInst)
	: (setImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setImage(final com.apple.jobjc.appkit.NSImage image){
			final com.apple.jobjc.Invoke.MsgSend setImage_IMetInst = get_setImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		setImage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLeaf_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLeaf_IMetInst(){
		return ((setLeaf_IMetInst != null)
	? (setLeaf_IMetInst)
	: (setLeaf_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLeaf:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setLeaf(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setLeaf_IMetInst = get_setLeaf_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLeaf_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setLeaf_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLoaded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLoaded_IMetInst(){
		return ((setLoaded_IMetInst != null)
	? (setLoaded_IMetInst)
	: (setLoaded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLoaded:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setLoaded(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setLoaded_IMetInst = get_setLoaded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLoaded_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setLoaded_IMetInst.invoke(nativeBuffer);
		
		
	}

}
