package com.apple.jobjc.appkit;

public  class NSMutableFontCollection extends com.apple.jobjc.appkit.NSFontCollection {
	public NSMutableFontCollection(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMutableFontCollection(final NSMutableFontCollection obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addQueryForDescriptors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addQueryForDescriptors_IMetInst(){
		return ((addQueryForDescriptors_IMetInst != null)
	? (addQueryForDescriptors_IMetInst)
	: (addQueryForDescriptors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addQueryForDescriptors:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addQueryForDescriptors(final com.apple.jobjc.foundation.NSArray descriptors){
			final com.apple.jobjc.Invoke.MsgSend addQueryForDescriptors_IMetInst = get_addQueryForDescriptors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addQueryForDescriptors_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, descriptors);
		addQueryForDescriptors_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeQueryForDescriptors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeQueryForDescriptors_IMetInst(){
		return ((removeQueryForDescriptors_IMetInst != null)
	? (removeQueryForDescriptors_IMetInst)
	: (removeQueryForDescriptors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeQueryForDescriptors:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeQueryForDescriptors(final com.apple.jobjc.foundation.NSArray descriptors){
			final com.apple.jobjc.Invoke.MsgSend removeQueryForDescriptors_IMetInst = get_removeQueryForDescriptors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeQueryForDescriptors_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, descriptors);
		removeQueryForDescriptors_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setExclusionDescriptors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setExclusionDescriptors_IMetInst(){
		return ((setExclusionDescriptors_IMetInst != null)
	? (setExclusionDescriptors_IMetInst)
	: (setExclusionDescriptors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setExclusionDescriptors:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setExclusionDescriptors(final com.apple.jobjc.foundation.NSArray descriptors){
			final com.apple.jobjc.Invoke.MsgSend setExclusionDescriptors_IMetInst = get_setExclusionDescriptors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setExclusionDescriptors_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, descriptors);
		setExclusionDescriptors_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setQueryDescriptors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setQueryDescriptors_IMetInst(){
		return ((setQueryDescriptors_IMetInst != null)
	? (setQueryDescriptors_IMetInst)
	: (setQueryDescriptors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setQueryDescriptors:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setQueryDescriptors(final com.apple.jobjc.foundation.NSArray descriptors){
			final com.apple.jobjc.Invoke.MsgSend setQueryDescriptors_IMetInst = get_setQueryDescriptors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setQueryDescriptors_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, descriptors);
		setQueryDescriptors_IMetInst.invoke(nativeBuffer);
		
		
	}

}
