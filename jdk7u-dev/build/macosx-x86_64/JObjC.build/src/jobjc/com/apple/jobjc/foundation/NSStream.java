package com.apple.jobjc.foundation;

public  class NSStream extends com.apple.jobjc.foundation.NSObject {
	public NSStream(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSStream(final NSStream obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend close_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_close_IMetInst(){
		return ((close_IMetInst != null)
	? (close_IMetInst)
	: (close_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "close", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void close(){
			final com.apple.jobjc.Invoke.MsgSend close_IMetInst = get_close_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		close_IMetInst.init(nativeBuffer, this);
		close_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend open_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_open_IMetInst(){
		return ((open_IMetInst != null)
	? (open_IMetInst)
	: (open_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "open", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void open(){
			final com.apple.jobjc.Invoke.MsgSend open_IMetInst = get_open_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		open_IMetInst.init(nativeBuffer, this);
		open_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend propertyForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_propertyForKey_IMetInst(){
		return ((propertyForKey_IMetInst != null)
	? (propertyForKey_IMetInst)
	: (propertyForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "propertyForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T propertyForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend propertyForKey_IMetInst = get_propertyForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		propertyForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		propertyForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeFromRunLoop_forMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeFromRunLoop_forMode_IMetInst(){
		return ((removeFromRunLoop_forMode_IMetInst != null)
	? (removeFromRunLoop_forMode_IMetInst)
	: (removeFromRunLoop_forMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeFromRunLoop:forMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeFromRunLoop_forMode(final com.apple.jobjc.foundation.NSRunLoop aRunLoop, final com.apple.jobjc.foundation.NSString mode){
			final com.apple.jobjc.Invoke.MsgSend removeFromRunLoop_forMode_IMetInst = get_removeFromRunLoop_forMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeFromRunLoop_forMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aRunLoop);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		removeFromRunLoop_forMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scheduleInRunLoop_forMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scheduleInRunLoop_forMode_IMetInst(){
		return ((scheduleInRunLoop_forMode_IMetInst != null)
	? (scheduleInRunLoop_forMode_IMetInst)
	: (scheduleInRunLoop_forMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scheduleInRunLoop:forMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void scheduleInRunLoop_forMode(final com.apple.jobjc.foundation.NSRunLoop aRunLoop, final com.apple.jobjc.foundation.NSString mode){
			final com.apple.jobjc.Invoke.MsgSend scheduleInRunLoop_forMode_IMetInst = get_scheduleInRunLoop_forMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scheduleInRunLoop_forMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aRunLoop);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		scheduleInRunLoop_forMode_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setProperty_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setProperty_forKey_IMetInst(){
		return ((setProperty_forKey_IMetInst != null)
	? (setProperty_forKey_IMetInst)
	: (setProperty_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setProperty:forKey:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setProperty_forKey(final com.apple.jobjc.ID property, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend setProperty_forKey_IMetInst = get_setProperty_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setProperty_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, property);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		setProperty_forKey_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend streamError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_streamError_IMetInst(){
		return ((streamError_IMetInst != null)
	? (streamError_IMetInst)
	: (streamError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "streamError", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSError streamError(){
			final com.apple.jobjc.Invoke.MsgSend streamError_IMetInst = get_streamError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		streamError_IMetInst.init(nativeBuffer, this);
		streamError_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSError returnValue = (com.apple.jobjc.foundation.NSError) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend streamStatus_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_streamStatus_IMetInst(){
		return ((streamStatus_IMetInst != null)
	? (streamStatus_IMetInst)
	: (streamStatus_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "streamStatus", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long streamStatus(){
			final com.apple.jobjc.Invoke.MsgSend streamStatus_IMetInst = get_streamStatus_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		streamStatus_IMetInst.init(nativeBuffer, this);
		streamStatus_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
