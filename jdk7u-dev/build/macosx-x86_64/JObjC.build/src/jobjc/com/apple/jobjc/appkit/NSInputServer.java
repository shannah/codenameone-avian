package com.apple.jobjc.appkit;

public  class NSInputServer extends com.apple.jobjc.foundation.NSObject {
	public NSInputServer(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSInputServer(final NSInputServer obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend initWithDelegate_name_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithDelegate_name_IMetInst(){
		return ((initWithDelegate_name_IMetInst != null)
	? (initWithDelegate_name_IMetInst)
	: (initWithDelegate_name_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithDelegate:name:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithDelegate_name(final com.apple.jobjc.ID aDelegate, final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend initWithDelegate_name_IMetInst = get_initWithDelegate_name_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithDelegate_name_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aDelegate);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		initWithDelegate_name_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
