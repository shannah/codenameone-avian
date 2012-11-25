package com.apple.jobjc.foundation;

public  class NSHost extends com.apple.jobjc.foundation.NSObject {
	public NSHost(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSHost(final NSHost obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend address_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_address_IMetInst(){
		return ((address_IMetInst != null)
	? (address_IMetInst)
	: (address_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "address", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString address(){
			final com.apple.jobjc.Invoke.MsgSend address_IMetInst = get_address_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		address_IMetInst.init(nativeBuffer, this);
		address_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addresses_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addresses_IMetInst(){
		return ((addresses_IMetInst != null)
	? (addresses_IMetInst)
	: (addresses_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addresses", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray addresses(){
			final com.apple.jobjc.Invoke.MsgSend addresses_IMetInst = get_addresses_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addresses_IMetInst.init(nativeBuffer, this);
		addresses_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEqualToHost_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEqualToHost_IMetInst(){
		return ((isEqualToHost_IMetInst != null)
	? (isEqualToHost_IMetInst)
	: (isEqualToHost_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEqualToHost:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isEqualToHost(final com.apple.jobjc.foundation.NSHost aHost){
			final com.apple.jobjc.Invoke.MsgSend isEqualToHost_IMetInst = get_isEqualToHost_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEqualToHost_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aHost);
		isEqualToHost_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedName_IMetInst(){
		return ((localizedName_IMetInst != null)
	? (localizedName_IMetInst)
	: (localizedName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localizedName(){
			final com.apple.jobjc.Invoke.MsgSend localizedName_IMetInst = get_localizedName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedName_IMetInst.init(nativeBuffer, this);
		localizedName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend name_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_name_IMetInst(){
		return ((name_IMetInst != null)
	? (name_IMetInst)
	: (name_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "name", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString name(){
			final com.apple.jobjc.Invoke.MsgSend name_IMetInst = get_name_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		name_IMetInst.init(nativeBuffer, this);
		name_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend names_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_names_IMetInst(){
		return ((names_IMetInst != null)
	? (names_IMetInst)
	: (names_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "names", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray names(){
			final com.apple.jobjc.Invoke.MsgSend names_IMetInst = get_names_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		names_IMetInst.init(nativeBuffer, this);
		names_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
