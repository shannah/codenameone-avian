package com.apple.jobjc.foundation;

public  class NSPipe extends com.apple.jobjc.foundation.NSObject {
	public NSPipe(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPipe(final NSPipe obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend fileHandleForReading_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileHandleForReading_IMetInst(){
		return ((fileHandleForReading_IMetInst != null)
	? (fileHandleForReading_IMetInst)
	: (fileHandleForReading_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileHandleForReading", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSFileHandle fileHandleForReading(){
			final com.apple.jobjc.Invoke.MsgSend fileHandleForReading_IMetInst = get_fileHandleForReading_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileHandleForReading_IMetInst.init(nativeBuffer, this);
		fileHandleForReading_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSFileHandle returnValue = (com.apple.jobjc.foundation.NSFileHandle) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileHandleForWriting_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileHandleForWriting_IMetInst(){
		return ((fileHandleForWriting_IMetInst != null)
	? (fileHandleForWriting_IMetInst)
	: (fileHandleForWriting_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileHandleForWriting", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSFileHandle fileHandleForWriting(){
			final com.apple.jobjc.Invoke.MsgSend fileHandleForWriting_IMetInst = get_fileHandleForWriting_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileHandleForWriting_IMetInst.init(nativeBuffer, this);
		fileHandleForWriting_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSFileHandle returnValue = (com.apple.jobjc.foundation.NSFileHandle) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend init_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_init_IMetInst(){
		return ((init_IMetInst != null)
	? (init_IMetInst)
	: (init_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "init", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T init(){
			final com.apple.jobjc.Invoke.MsgSend init_IMetInst = get_init_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		init_IMetInst.init(nativeBuffer, this);
		init_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
