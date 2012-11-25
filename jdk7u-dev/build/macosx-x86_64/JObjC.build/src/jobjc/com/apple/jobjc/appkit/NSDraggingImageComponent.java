package com.apple.jobjc.appkit;

public  class NSDraggingImageComponent extends com.apple.jobjc.foundation.NSObject {
	public NSDraggingImageComponent(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDraggingImageComponent(final NSDraggingImageComponent obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend contents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contents_IMetInst(){
		return ((contents_IMetInst != null)
	? (contents_IMetInst)
	: (contents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contents", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T contents(){
			final com.apple.jobjc.Invoke.MsgSend contents_IMetInst = get_contents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contents_IMetInst.init(nativeBuffer, this);
		contents_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend frame_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frame_IMetInst(){
		return ((frame_IMetInst != null)
	? (frame_IMetInst)
	: (frame_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frame", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect frame(){
			final com.apple.jobjc.Invoke.MsgSend frame_IMetInst = get_frame_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frame_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		frame_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithKey_IMetInst(){
		return ((initWithKey_IMetInst != null)
	? (initWithKey_IMetInst)
	: (initWithKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend initWithKey_IMetInst = get_initWithKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		initWithKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend key_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_key_IMetInst(){
		return ((key_IMetInst != null)
	? (key_IMetInst)
	: (key_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "key", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString key(){
			final com.apple.jobjc.Invoke.MsgSend key_IMetInst = get_key_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		key_IMetInst.init(nativeBuffer, this);
		key_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setContents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContents_IMetInst(){
		return ((setContents_IMetInst != null)
	? (setContents_IMetInst)
	: (setContents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContents:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setContents(final com.apple.jobjc.ID contents){
			final com.apple.jobjc.Invoke.MsgSend setContents_IMetInst = get_setContents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContents_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, contents);
		setContents_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFrame_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFrame_IMetInst(){
		return ((setFrame_IMetInst != null)
	? (setFrame_IMetInst)
	: (setFrame_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFrame:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void setFrame(final com.apple.jobjc.foundation.NSRect frame){
			final com.apple.jobjc.Invoke.MsgSend setFrame_IMetInst = get_setFrame_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFrame_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frame);
		setFrame_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setKey_IMetInst(){
		return ((setKey_IMetInst != null)
	? (setKey_IMetInst)
	: (setKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend setKey_IMetInst = get_setKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		setKey_IMetInst.invoke(nativeBuffer);
		
		
	}

}
