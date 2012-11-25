package com.apple.jobjc.appkit;

public  class NSCursor extends com.apple.jobjc.foundation.NSObject {
	public NSCursor(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSCursor(final NSCursor obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend hotSpot_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hotSpot_IMetInst(){
		return ((hotSpot_IMetInst != null)
	? (hotSpot_IMetInst)
	: (hotSpot_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hotSpot", com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint hotSpot(){
			final com.apple.jobjc.Invoke.MsgSend hotSpot_IMetInst = get_hotSpot_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hotSpot_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		hotSpot_IMetInst.invoke(nativeBuffer, returnValue);
		
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

	private static com.apple.jobjc.Invoke.MsgSend initWithImage_foregroundColorHint_backgroundColorHint_hotSpot_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithImage_foregroundColorHint_backgroundColorHint_hotSpot_IMetInst(){
		return ((initWithImage_foregroundColorHint_backgroundColorHint_hotSpot_IMetInst != null)
	? (initWithImage_foregroundColorHint_backgroundColorHint_hotSpot_IMetInst)
	: (initWithImage_foregroundColorHint_backgroundColorHint_hotSpot_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithImage:foregroundColorHint:backgroundColorHint:hotSpot:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public <T extends com.apple.jobjc.ID> T initWithImage_foregroundColorHint_backgroundColorHint_hotSpot(final com.apple.jobjc.appkit.NSImage newImage, final com.apple.jobjc.appkit.NSColor fg, final com.apple.jobjc.appkit.NSColor bg, final com.apple.jobjc.foundation.NSPoint hotSpot){
			final com.apple.jobjc.Invoke.MsgSend initWithImage_foregroundColorHint_backgroundColorHint_hotSpot_IMetInst = get_initWithImage_foregroundColorHint_backgroundColorHint_hotSpot_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithImage_foregroundColorHint_backgroundColorHint_hotSpot_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newImage);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fg);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bg);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, hotSpot);
		initWithImage_foregroundColorHint_backgroundColorHint_hotSpot_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithImage_hotSpot_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithImage_hotSpot_IMetInst(){
		return ((initWithImage_hotSpot_IMetInst != null)
	? (initWithImage_hotSpot_IMetInst)
	: (initWithImage_hotSpot_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithImage:hotSpot:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public <T extends com.apple.jobjc.ID> T initWithImage_hotSpot(final com.apple.jobjc.appkit.NSImage newImage, final com.apple.jobjc.foundation.NSPoint aPoint){
			final com.apple.jobjc.Invoke.MsgSend initWithImage_hotSpot_IMetInst = get_initWithImage_hotSpot_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithImage_hotSpot_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newImage);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
		initWithImage_hotSpot_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSetOnMouseEntered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSetOnMouseEntered_IMetInst(){
		return ((isSetOnMouseEntered_IMetInst != null)
	? (isSetOnMouseEntered_IMetInst)
	: (isSetOnMouseEntered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSetOnMouseEntered", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isSetOnMouseEntered(){
			final com.apple.jobjc.Invoke.MsgSend isSetOnMouseEntered_IMetInst = get_isSetOnMouseEntered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSetOnMouseEntered_IMetInst.init(nativeBuffer, this);
		isSetOnMouseEntered_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSetOnMouseExited_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSetOnMouseExited_IMetInst(){
		return ((isSetOnMouseExited_IMetInst != null)
	? (isSetOnMouseExited_IMetInst)
	: (isSetOnMouseExited_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSetOnMouseExited", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isSetOnMouseExited(){
			final com.apple.jobjc.Invoke.MsgSend isSetOnMouseExited_IMetInst = get_isSetOnMouseExited_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSetOnMouseExited_IMetInst.init(nativeBuffer, this);
		isSetOnMouseExited_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseEntered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseEntered_IMetInst(){
		return ((mouseEntered_IMetInst != null)
	? (mouseEntered_IMetInst)
	: (mouseEntered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseEntered:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void mouseEntered(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend mouseEntered_IMetInst = get_mouseEntered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseEntered_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		mouseEntered_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseExited_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseExited_IMetInst(){
		return ((mouseExited_IMetInst != null)
	? (mouseExited_IMetInst)
	: (mouseExited_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseExited:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void mouseExited(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend mouseExited_IMetInst = get_mouseExited_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseExited_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		mouseExited_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pop_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pop_IMetInst(){
		return ((pop_IMetInst != null)
	? (pop_IMetInst)
	: (pop_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pop", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void pop(){
			final com.apple.jobjc.Invoke.MsgSend pop_IMetInst = get_pop_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pop_IMetInst.init(nativeBuffer, this);
		pop_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend push_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_push_IMetInst(){
		return ((push_IMetInst != null)
	? (push_IMetInst)
	: (push_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "push", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void push(){
			final com.apple.jobjc.Invoke.MsgSend push_IMetInst = get_push_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		push_IMetInst.init(nativeBuffer, this);
		push_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setOnMouseEntered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOnMouseEntered_IMetInst(){
		return ((setOnMouseEntered_IMetInst != null)
	? (setOnMouseEntered_IMetInst)
	: (setOnMouseEntered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOnMouseEntered:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setOnMouseEntered(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setOnMouseEntered_IMetInst = get_setOnMouseEntered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOnMouseEntered_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setOnMouseEntered_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setOnMouseExited_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOnMouseExited_IMetInst(){
		return ((setOnMouseExited_IMetInst != null)
	? (setOnMouseExited_IMetInst)
	: (setOnMouseExited_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOnMouseExited:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setOnMouseExited(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setOnMouseExited_IMetInst = get_setOnMouseExited_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOnMouseExited_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setOnMouseExited_IMetInst.invoke(nativeBuffer);
		
		
	}

}
