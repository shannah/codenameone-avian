package com.apple.jobjc.appkit;

public  class NSDraggingItem extends com.apple.jobjc.foundation.NSObject {
	public NSDraggingItem(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDraggingItem(final NSDraggingItem obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend draggingFrame_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingFrame_IMetInst(){
		return ((draggingFrame_IMetInst != null)
	? (draggingFrame_IMetInst)
	: (draggingFrame_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingFrame", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect draggingFrame(){
			final com.apple.jobjc.Invoke.MsgSend draggingFrame_IMetInst = get_draggingFrame_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingFrame_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		draggingFrame_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageComponents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageComponents_IMetInst(){
		return ((imageComponents_IMetInst != null)
	? (imageComponents_IMetInst)
	: (imageComponents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageComponents", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray imageComponents(){
			final com.apple.jobjc.Invoke.MsgSend imageComponents_IMetInst = get_imageComponents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageComponents_IMetInst.init(nativeBuffer, this);
		imageComponents_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageComponentsProvider_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageComponentsProvider_IMetInst(){
		return ((imageComponentsProvider_IMetInst != null)
	? (imageComponentsProvider_IMetInst)
	: (imageComponentsProvider_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageComponentsProvider", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* NSArray*(^)(void) (@, @) */ imageComponentsProvider(){
			final com.apple.jobjc.Invoke.MsgSend imageComponentsProvider_IMetInst = get_imageComponentsProvider_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageComponentsProvider_IMetInst.init(nativeBuffer, this);
		imageComponentsProvider_IMetInst.invoke(nativeBuffer);
		final Object /* NSArray*(^)(void) (@, @) */ returnValue = (Object /* NSArray*(^)(void) (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithPasteboardWriter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithPasteboardWriter_IMetInst(){
		return ((initWithPasteboardWriter_IMetInst != null)
	? (initWithPasteboardWriter_IMetInst)
	: (initWithPasteboardWriter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithPasteboardWriter:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithPasteboardWriter(final com.apple.jobjc.ID pasteboardWriter){
			final com.apple.jobjc.Invoke.MsgSend initWithPasteboardWriter_IMetInst = get_initWithPasteboardWriter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithPasteboardWriter_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboardWriter);
		initWithPasteboardWriter_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend item_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_item_IMetInst(){
		return ((item_IMetInst != null)
	? (item_IMetInst)
	: (item_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "item", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T item(){
			final com.apple.jobjc.Invoke.MsgSend item_IMetInst = get_item_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		item_IMetInst.init(nativeBuffer, this);
		item_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setDraggingFrame_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDraggingFrame_IMetInst(){
		return ((setDraggingFrame_IMetInst != null)
	? (setDraggingFrame_IMetInst)
	: (setDraggingFrame_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDraggingFrame:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void setDraggingFrame(final com.apple.jobjc.foundation.NSRect draggingFrame){
			final com.apple.jobjc.Invoke.MsgSend setDraggingFrame_IMetInst = get_setDraggingFrame_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDraggingFrame_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, draggingFrame);
		setDraggingFrame_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDraggingFrame_contents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDraggingFrame_contents_IMetInst(){
		return ((setDraggingFrame_contents_IMetInst != null)
	? (setDraggingFrame_contents_IMetInst)
	: (setDraggingFrame_contents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDraggingFrame:contents:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDraggingFrame_contents(final com.apple.jobjc.foundation.NSRect frame, final com.apple.jobjc.ID contents){
			final com.apple.jobjc.Invoke.MsgSend setDraggingFrame_contents_IMetInst = get_setDraggingFrame_contents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDraggingFrame_contents_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, contents);
		setDraggingFrame_contents_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setImageComponentsProvider_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImageComponentsProvider_IMetInst(){
		return ((setImageComponentsProvider_IMetInst != null)
	? (setImageComponentsProvider_IMetInst)
	: (setImageComponentsProvider_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImageComponentsProvider:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setImageComponentsProvider(final Object /* NSArray*(^)(void) (@, @) */ imageComponentsProvider){
			final com.apple.jobjc.Invoke.MsgSend setImageComponentsProvider_IMetInst = get_setImageComponentsProvider_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImageComponentsProvider_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, imageComponentsProvider);
		setImageComponentsProvider_IMetInst.invoke(nativeBuffer);
		
		
	}

}
