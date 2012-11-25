package com.apple.jobjc.appkit;

public  class NSSharingServiceClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSSharingServiceClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSSharingServiceClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSSharingServiceClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend sharingServiceNamed_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharingServiceNamed_CMetInst(){
		return ((sharingServiceNamed_CMetInst != null)
	? (sharingServiceNamed_CMetInst)
	: (sharingServiceNamed_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharingServiceNamed:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSSharingService sharingServiceNamed(final com.apple.jobjc.foundation.NSString serviceName){
			final com.apple.jobjc.Invoke.MsgSend sharingServiceNamed_CMetInst = get_sharingServiceNamed_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharingServiceNamed_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, serviceName);
		sharingServiceNamed_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSSharingService returnValue = (com.apple.jobjc.appkit.NSSharingService) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sharingServicesForItems_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharingServicesForItems_CMetInst(){
		return ((sharingServicesForItems_CMetInst != null)
	? (sharingServicesForItems_CMetInst)
	: (sharingServicesForItems_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharingServicesForItems:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray sharingServicesForItems(final com.apple.jobjc.foundation.NSArray items){
			final com.apple.jobjc.Invoke.MsgSend sharingServicesForItems_CMetInst = get_sharingServicesForItems_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharingServicesForItems_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, items);
		sharingServicesForItems_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
