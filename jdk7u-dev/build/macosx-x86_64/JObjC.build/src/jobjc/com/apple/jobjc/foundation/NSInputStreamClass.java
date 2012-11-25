package com.apple.jobjc.foundation;

public  class NSInputStreamClass extends com.apple.jobjc.foundation.NSStreamClass {
	public NSInputStreamClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSInputStreamClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSInputStreamClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend inputStreamWithData_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_inputStreamWithData_CMetInst(){
		return ((inputStreamWithData_CMetInst != null)
	? (inputStreamWithData_CMetInst)
	: (inputStreamWithData_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "inputStreamWithData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T inputStreamWithData(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend inputStreamWithData_CMetInst = get_inputStreamWithData_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		inputStreamWithData_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		inputStreamWithData_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend inputStreamWithFileAtPath_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_inputStreamWithFileAtPath_CMetInst(){
		return ((inputStreamWithFileAtPath_CMetInst != null)
	? (inputStreamWithFileAtPath_CMetInst)
	: (inputStreamWithFileAtPath_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "inputStreamWithFileAtPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T inputStreamWithFileAtPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend inputStreamWithFileAtPath_CMetInst = get_inputStreamWithFileAtPath_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		inputStreamWithFileAtPath_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		inputStreamWithFileAtPath_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend inputStreamWithURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_inputStreamWithURL_CMetInst(){
		return ((inputStreamWithURL_CMetInst != null)
	? (inputStreamWithURL_CMetInst)
	: (inputStreamWithURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "inputStreamWithURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T inputStreamWithURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend inputStreamWithURL_CMetInst = get_inputStreamWithURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		inputStreamWithURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		inputStreamWithURL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
