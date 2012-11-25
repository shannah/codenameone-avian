package com.apple.jobjc.appkit;

public  class NSTextAttachment extends com.apple.jobjc.foundation.NSObject {
	public NSTextAttachment(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTextAttachment(final NSTextAttachment obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend attachmentCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attachmentCell_IMetInst(){
		return ((attachmentCell_IMetInst != null)
	? (attachmentCell_IMetInst)
	: (attachmentCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attachmentCell", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T attachmentCell(){
			final com.apple.jobjc.Invoke.MsgSend attachmentCell_IMetInst = get_attachmentCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attachmentCell_IMetInst.init(nativeBuffer, this);
		attachmentCell_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileWrapper_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileWrapper_IMetInst(){
		return ((fileWrapper_IMetInst != null)
	? (fileWrapper_IMetInst)
	: (fileWrapper_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileWrapper", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSFileWrapper fileWrapper(){
			final com.apple.jobjc.Invoke.MsgSend fileWrapper_IMetInst = get_fileWrapper_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileWrapper_IMetInst.init(nativeBuffer, this);
		fileWrapper_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSFileWrapper returnValue = (com.apple.jobjc.foundation.NSFileWrapper) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithFileWrapper_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFileWrapper_IMetInst(){
		return ((initWithFileWrapper_IMetInst != null)
	? (initWithFileWrapper_IMetInst)
	: (initWithFileWrapper_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFileWrapper:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFileWrapper(final com.apple.jobjc.foundation.NSFileWrapper fileWrapper){
			final com.apple.jobjc.Invoke.MsgSend initWithFileWrapper_IMetInst = get_initWithFileWrapper_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFileWrapper_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileWrapper);
		initWithFileWrapper_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttachmentCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttachmentCell_IMetInst(){
		return ((setAttachmentCell_IMetInst != null)
	? (setAttachmentCell_IMetInst)
	: (setAttachmentCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttachmentCell:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAttachmentCell(final com.apple.jobjc.ID cell){
			final com.apple.jobjc.Invoke.MsgSend setAttachmentCell_IMetInst = get_setAttachmentCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttachmentCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		setAttachmentCell_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFileWrapper_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFileWrapper_IMetInst(){
		return ((setFileWrapper_IMetInst != null)
	? (setFileWrapper_IMetInst)
	: (setFileWrapper_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFileWrapper:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFileWrapper(final com.apple.jobjc.foundation.NSFileWrapper fileWrapper){
			final com.apple.jobjc.Invoke.MsgSend setFileWrapper_IMetInst = get_setFileWrapper_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFileWrapper_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileWrapper);
		setFileWrapper_IMetInst.invoke(nativeBuffer);
		
		
	}

}
