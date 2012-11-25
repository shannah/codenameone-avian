package com.apple.jobjc.appkit;

public  class NSMovie extends com.apple.jobjc.foundation.NSObject {
	public NSMovie(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMovie(final NSMovie obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend QTMovie_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_QTMovie_IMetInst(){
		return ((QTMovie_IMetInst != null)
	? (QTMovie_IMetInst)
	: (QTMovie_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "QTMovie", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> QTMovie(){
			final com.apple.jobjc.Invoke.MsgSend QTMovie_IMetInst = get_QTMovie_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		QTMovie_IMetInst.init(nativeBuffer, this);
		QTMovie_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URL_IMetInst(){
		return ((URL_IMetInst != null)
	? (URL_IMetInst)
	: (URL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URL(){
			final com.apple.jobjc.Invoke.MsgSend URL_IMetInst = get_URL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URL_IMetInst.init(nativeBuffer, this);
		URL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithMovie_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithMovie_IMetInst(){
		return ((initWithMovie_IMetInst != null)
	? (initWithMovie_IMetInst)
	: (initWithMovie_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithMovie:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithMovie(final com.apple.jobjc.Pointer<Void> movie){
			final com.apple.jobjc.Invoke.MsgSend initWithMovie_IMetInst = get_initWithMovie_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithMovie_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, movie);
		initWithMovie_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithPasteboard_IMetInst(){
		return ((initWithPasteboard_IMetInst != null)
	? (initWithPasteboard_IMetInst)
	: (initWithPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithPasteboard:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithPasteboard(final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend initWithPasteboard_IMetInst = get_initWithPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		initWithPasteboard_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithURL_byReference_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithURL_byReference_IMetInst(){
		return ((initWithURL_byReference_IMetInst != null)
	? (initWithURL_byReference_IMetInst)
	: (initWithURL_byReference_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithURL:byReference:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithURL_byReference(final com.apple.jobjc.foundation.NSURL url, final boolean byRef){
			final com.apple.jobjc.Invoke.MsgSend initWithURL_byReference_IMetInst = get_initWithURL_byReference_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithURL_byReference_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, byRef);
		initWithURL_byReference_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
