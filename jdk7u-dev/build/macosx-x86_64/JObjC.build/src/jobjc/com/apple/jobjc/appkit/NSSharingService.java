package com.apple.jobjc.appkit;

public  class NSSharingService extends com.apple.jobjc.foundation.NSObject {
	public NSSharingService(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSSharingService(final NSSharingService obj, final com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend canPerformWithItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canPerformWithItems_IMetInst(){
		return ((canPerformWithItems_IMetInst != null)
	? (canPerformWithItems_IMetInst)
	: (canPerformWithItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canPerformWithItems:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean canPerformWithItems(final com.apple.jobjc.foundation.NSArray items){
			final com.apple.jobjc.Invoke.MsgSend canPerformWithItems_IMetInst = get_canPerformWithItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canPerformWithItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, items);
		canPerformWithItems_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend initWithTitle_image_alternateImage_handler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithTitle_image_alternateImage_handler_IMetInst(){
		return ((initWithTitle_image_alternateImage_handler_IMetInst != null)
	? (initWithTitle_image_alternateImage_handler_IMetInst)
	: (initWithTitle_image_alternateImage_handler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithTitle:image:alternateImage:handler:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithTitle_image_alternateImage_handler(final com.apple.jobjc.foundation.NSString title, final com.apple.jobjc.appkit.NSImage image, final com.apple.jobjc.appkit.NSImage alternateImage, final Object /* void(^)(void) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend initWithTitle_image_alternateImage_handler_IMetInst = get_initWithTitle_image_alternateImage_handler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithTitle_image_alternateImage_handler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, alternateImage);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		initWithTitle_image_alternateImage_handler_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend performWithItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performWithItems_IMetInst(){
		return ((performWithItems_IMetInst != null)
	? (performWithItems_IMetInst)
	: (performWithItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performWithItems:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void performWithItems(final com.apple.jobjc.foundation.NSArray items){
			final com.apple.jobjc.Invoke.MsgSend performWithItems_IMetInst = get_performWithItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performWithItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, items);
		performWithItems_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID delegate){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend title_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_title_IMetInst(){
		return ((title_IMetInst != null)
	? (title_IMetInst)
	: (title_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "title", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString title(){
			final com.apple.jobjc.Invoke.MsgSend title_IMetInst = get_title_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		title_IMetInst.init(nativeBuffer, this);
		title_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
