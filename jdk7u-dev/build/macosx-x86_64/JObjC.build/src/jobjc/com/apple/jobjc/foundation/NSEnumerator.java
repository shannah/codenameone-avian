package com.apple.jobjc.foundation;

public  class NSEnumerator extends com.apple.jobjc.foundation.NSObject {
	public NSEnumerator(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSEnumerator(final NSEnumerator obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend allObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allObjects_IMetInst(){
		return ((allObjects_IMetInst != null)
	? (allObjects_IMetInst)
	: (allObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allObjects", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray allObjects(){
			final com.apple.jobjc.Invoke.MsgSend allObjects_IMetInst = get_allObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allObjects_IMetInst.init(nativeBuffer, this);
		allObjects_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nextObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nextObject_IMetInst(){
		return ((nextObject_IMetInst != null)
	? (nextObject_IMetInst)
	: (nextObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nextObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T nextObject(){
			final com.apple.jobjc.Invoke.MsgSend nextObject_IMetInst = get_nextObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nextObject_IMetInst.init(nativeBuffer, this);
		nextObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
