package com.apple.jobjc.appkit;

public  class NSFontCollection extends com.apple.jobjc.foundation.NSObject {
	public NSFontCollection(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSFontCollection(final NSFontCollection obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend exclusionDescriptors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_exclusionDescriptors_IMetInst(){
		return ((exclusionDescriptors_IMetInst != null)
	? (exclusionDescriptors_IMetInst)
	: (exclusionDescriptors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "exclusionDescriptors", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray exclusionDescriptors(){
			final com.apple.jobjc.Invoke.MsgSend exclusionDescriptors_IMetInst = get_exclusionDescriptors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		exclusionDescriptors_IMetInst.init(nativeBuffer, this);
		exclusionDescriptors_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend matchingDescriptors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_matchingDescriptors_IMetInst(){
		return ((matchingDescriptors_IMetInst != null)
	? (matchingDescriptors_IMetInst)
	: (matchingDescriptors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "matchingDescriptors", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray matchingDescriptors(){
			final com.apple.jobjc.Invoke.MsgSend matchingDescriptors_IMetInst = get_matchingDescriptors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		matchingDescriptors_IMetInst.init(nativeBuffer, this);
		matchingDescriptors_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend matchingDescriptorsForFamily_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_matchingDescriptorsForFamily_IMetInst(){
		return ((matchingDescriptorsForFamily_IMetInst != null)
	? (matchingDescriptorsForFamily_IMetInst)
	: (matchingDescriptorsForFamily_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "matchingDescriptorsForFamily:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray matchingDescriptorsForFamily(final com.apple.jobjc.foundation.NSString family){
			final com.apple.jobjc.Invoke.MsgSend matchingDescriptorsForFamily_IMetInst = get_matchingDescriptorsForFamily_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		matchingDescriptorsForFamily_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, family);
		matchingDescriptorsForFamily_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend matchingDescriptorsForFamily_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_matchingDescriptorsForFamily_options_IMetInst(){
		return ((matchingDescriptorsForFamily_options_IMetInst != null)
	? (matchingDescriptorsForFamily_options_IMetInst)
	: (matchingDescriptorsForFamily_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "matchingDescriptorsForFamily:options:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray matchingDescriptorsForFamily_options(final com.apple.jobjc.foundation.NSString family, final com.apple.jobjc.foundation.NSDictionary options){
			final com.apple.jobjc.Invoke.MsgSend matchingDescriptorsForFamily_options_IMetInst = get_matchingDescriptorsForFamily_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		matchingDescriptorsForFamily_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, family);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		matchingDescriptorsForFamily_options_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend matchingDescriptorsWithOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_matchingDescriptorsWithOptions_IMetInst(){
		return ((matchingDescriptorsWithOptions_IMetInst != null)
	? (matchingDescriptorsWithOptions_IMetInst)
	: (matchingDescriptorsWithOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "matchingDescriptorsWithOptions:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray matchingDescriptorsWithOptions(final com.apple.jobjc.foundation.NSDictionary options){
			final com.apple.jobjc.Invoke.MsgSend matchingDescriptorsWithOptions_IMetInst = get_matchingDescriptorsWithOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		matchingDescriptorsWithOptions_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		matchingDescriptorsWithOptions_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend queryDescriptors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_queryDescriptors_IMetInst(){
		return ((queryDescriptors_IMetInst != null)
	? (queryDescriptors_IMetInst)
	: (queryDescriptors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "queryDescriptors", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray queryDescriptors(){
			final com.apple.jobjc.Invoke.MsgSend queryDescriptors_IMetInst = get_queryDescriptors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		queryDescriptors_IMetInst.init(nativeBuffer, this);
		queryDescriptors_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
