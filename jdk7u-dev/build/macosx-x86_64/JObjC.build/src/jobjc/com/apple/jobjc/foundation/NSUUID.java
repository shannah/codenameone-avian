package com.apple.jobjc.foundation;

public  class NSUUID extends com.apple.jobjc.foundation.NSObject {
	public NSUUID(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSUUID(final NSUUID obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend UUIDString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_UUIDString_IMetInst(){
		return ((UUIDString_IMetInst != null)
	? (UUIDString_IMetInst)
	: (UUIDString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "UUIDString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString UUIDString(){
			final com.apple.jobjc.Invoke.MsgSend UUIDString_IMetInst = get_UUIDString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		UUIDString_IMetInst.init(nativeBuffer, this);
		UUIDString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getUUIDBytes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getUUIDBytes_IMetInst(){
		return ((getUUIDBytes_IMetInst != null)
	? (getUUIDBytes_IMetInst)
	: (getUUIDBytes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getUUIDBytes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getUUIDBytes(final com.apple.jobjc.Pointer<java.lang.Byte> uuid){
			final com.apple.jobjc.Invoke.MsgSend getUUIDBytes_IMetInst = get_getUUIDBytes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getUUIDBytes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, uuid);
		getUUIDBytes_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend initWithUUIDBytes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithUUIDBytes_IMetInst(){
		return ((initWithUUIDBytes_IMetInst != null)
	? (initWithUUIDBytes_IMetInst)
	: (initWithUUIDBytes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithUUIDBytes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithUUIDBytes(final com.apple.jobjc.Pointer<java.lang.Byte> bytes){
			final com.apple.jobjc.Invoke.MsgSend initWithUUIDBytes_IMetInst = get_initWithUUIDBytes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithUUIDBytes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		initWithUUIDBytes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithUUIDString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithUUIDString_IMetInst(){
		return ((initWithUUIDString_IMetInst != null)
	? (initWithUUIDString_IMetInst)
	: (initWithUUIDString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithUUIDString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithUUIDString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend initWithUUIDString_IMetInst = get_initWithUUIDString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithUUIDString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		initWithUUIDString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
