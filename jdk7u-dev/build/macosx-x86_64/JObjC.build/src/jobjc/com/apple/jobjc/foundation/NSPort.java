package com.apple.jobjc.foundation;

public  class NSPort extends com.apple.jobjc.foundation.NSObject {
	public NSPort(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPort(final NSPort obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addConnection_toRunLoop_forMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addConnection_toRunLoop_forMode_IMetInst(){
		return ((addConnection_toRunLoop_forMode_IMetInst != null)
	? (addConnection_toRunLoop_forMode_IMetInst)
	: (addConnection_toRunLoop_forMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addConnection:toRunLoop:forMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addConnection_toRunLoop_forMode(final com.apple.jobjc.foundation.NSConnection conn, final com.apple.jobjc.foundation.NSRunLoop runLoop, final com.apple.jobjc.foundation.NSString mode){
			final com.apple.jobjc.Invoke.MsgSend addConnection_toRunLoop_forMode_IMetInst = get_addConnection_toRunLoop_forMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addConnection_toRunLoop_forMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, conn);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, runLoop);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		addConnection_toRunLoop_forMode_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend invalidate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidate_IMetInst(){
		return ((invalidate_IMetInst != null)
	? (invalidate_IMetInst)
	: (invalidate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidate", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void invalidate(){
			final com.apple.jobjc.Invoke.MsgSend invalidate_IMetInst = get_invalidate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidate_IMetInst.init(nativeBuffer, this);
		invalidate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isValid_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isValid_IMetInst(){
		return ((isValid_IMetInst != null)
	? (isValid_IMetInst)
	: (isValid_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isValid", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isValid(){
			final com.apple.jobjc.Invoke.MsgSend isValid_IMetInst = get_isValid_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isValid_IMetInst.init(nativeBuffer, this);
		isValid_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeConnection_fromRunLoop_forMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeConnection_fromRunLoop_forMode_IMetInst(){
		return ((removeConnection_fromRunLoop_forMode_IMetInst != null)
	? (removeConnection_fromRunLoop_forMode_IMetInst)
	: (removeConnection_fromRunLoop_forMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeConnection:fromRunLoop:forMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeConnection_fromRunLoop_forMode(final com.apple.jobjc.foundation.NSConnection conn, final com.apple.jobjc.foundation.NSRunLoop runLoop, final com.apple.jobjc.foundation.NSString mode){
			final com.apple.jobjc.Invoke.MsgSend removeConnection_fromRunLoop_forMode_IMetInst = get_removeConnection_fromRunLoop_forMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeConnection_fromRunLoop_forMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, conn);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, runLoop);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		removeConnection_fromRunLoop_forMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeFromRunLoop_forMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeFromRunLoop_forMode_IMetInst(){
		return ((removeFromRunLoop_forMode_IMetInst != null)
	? (removeFromRunLoop_forMode_IMetInst)
	: (removeFromRunLoop_forMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeFromRunLoop:forMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeFromRunLoop_forMode(final com.apple.jobjc.foundation.NSRunLoop runLoop, final com.apple.jobjc.foundation.NSString mode){
			final com.apple.jobjc.Invoke.MsgSend removeFromRunLoop_forMode_IMetInst = get_removeFromRunLoop_forMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeFromRunLoop_forMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, runLoop);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		removeFromRunLoop_forMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend reservedSpaceLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reservedSpaceLength_IMetInst(){
		return ((reservedSpaceLength_IMetInst != null)
	? (reservedSpaceLength_IMetInst)
	: (reservedSpaceLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reservedSpaceLength", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long reservedSpaceLength(){
			final com.apple.jobjc.Invoke.MsgSend reservedSpaceLength_IMetInst = get_reservedSpaceLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reservedSpaceLength_IMetInst.init(nativeBuffer, this);
		reservedSpaceLength_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scheduleInRunLoop_forMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scheduleInRunLoop_forMode_IMetInst(){
		return ((scheduleInRunLoop_forMode_IMetInst != null)
	? (scheduleInRunLoop_forMode_IMetInst)
	: (scheduleInRunLoop_forMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scheduleInRunLoop:forMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void scheduleInRunLoop_forMode(final com.apple.jobjc.foundation.NSRunLoop runLoop, final com.apple.jobjc.foundation.NSString mode){
			final com.apple.jobjc.Invoke.MsgSend scheduleInRunLoop_forMode_IMetInst = get_scheduleInRunLoop_forMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scheduleInRunLoop_forMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, runLoop);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		scheduleInRunLoop_forMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sendBeforeDate_components_from_reserved_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendBeforeDate_components_from_reserved_IMetInst(){
		return ((sendBeforeDate_components_from_reserved_IMetInst != null)
	? (sendBeforeDate_components_from_reserved_IMetInst)
	: (sendBeforeDate_components_from_reserved_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendBeforeDate:components:from:reserved:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean sendBeforeDate_components_from_reserved(final com.apple.jobjc.foundation.NSDate limitDate, final com.apple.jobjc.foundation.NSMutableArray components, final com.apple.jobjc.foundation.NSPort receivePort, final long headerSpaceReserved){
			final com.apple.jobjc.Invoke.MsgSend sendBeforeDate_components_from_reserved_IMetInst = get_sendBeforeDate_components_from_reserved_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendBeforeDate_components_from_reserved_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, limitDate);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, components);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, receivePort);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, headerSpaceReserved);
		sendBeforeDate_components_from_reserved_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sendBeforeDate_msgid_components_from_reserved_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendBeforeDate_msgid_components_from_reserved_IMetInst(){
		return ((sendBeforeDate_msgid_components_from_reserved_IMetInst != null)
	? (sendBeforeDate_msgid_components_from_reserved_IMetInst)
	: (sendBeforeDate_msgid_components_from_reserved_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendBeforeDate:msgid:components:from:reserved:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean sendBeforeDate_msgid_components_from_reserved(final com.apple.jobjc.foundation.NSDate limitDate, final long msgID, final com.apple.jobjc.foundation.NSMutableArray components, final com.apple.jobjc.foundation.NSPort receivePort, final long headerSpaceReserved){
			final com.apple.jobjc.Invoke.MsgSend sendBeforeDate_msgid_components_from_reserved_IMetInst = get_sendBeforeDate_msgid_components_from_reserved_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendBeforeDate_msgid_components_from_reserved_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, limitDate);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, msgID);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, components);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, receivePort);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, headerSpaceReserved);
		sendBeforeDate_msgid_components_from_reserved_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

}
