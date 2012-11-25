package com.apple.jobjc.foundation;

public  class NSMetadataQueryResultGroup extends com.apple.jobjc.foundation.NSObject {
	public NSMetadataQueryResultGroup(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMetadataQueryResultGroup(final NSMetadataQueryResultGroup obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend attribute_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attribute_IMetInst(){
		return ((attribute_IMetInst != null)
	? (attribute_IMetInst)
	: (attribute_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attribute", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString attribute(){
			final com.apple.jobjc.Invoke.MsgSend attribute_IMetInst = get_attribute_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attribute_IMetInst.init(nativeBuffer, this);
		attribute_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resultAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resultAtIndex_IMetInst(){
		return ((resultAtIndex_IMetInst != null)
	? (resultAtIndex_IMetInst)
	: (resultAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resultAtIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T resultAtIndex(final long idx){
			final com.apple.jobjc.Invoke.MsgSend resultAtIndex_IMetInst = get_resultAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resultAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, idx);
		resultAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resultCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resultCount_IMetInst(){
		return ((resultCount_IMetInst != null)
	? (resultCount_IMetInst)
	: (resultCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resultCount", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long resultCount(){
			final com.apple.jobjc.Invoke.MsgSend resultCount_IMetInst = get_resultCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resultCount_IMetInst.init(nativeBuffer, this);
		resultCount_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend results_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_results_IMetInst(){
		return ((results_IMetInst != null)
	? (results_IMetInst)
	: (results_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "results", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray results(){
			final com.apple.jobjc.Invoke.MsgSend results_IMetInst = get_results_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		results_IMetInst.init(nativeBuffer, this);
		results_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend subgroups_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_subgroups_IMetInst(){
		return ((subgroups_IMetInst != null)
	? (subgroups_IMetInst)
	: (subgroups_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "subgroups", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray subgroups(){
			final com.apple.jobjc.Invoke.MsgSend subgroups_IMetInst = get_subgroups_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		subgroups_IMetInst.init(nativeBuffer, this);
		subgroups_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend value_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_value_IMetInst(){
		return ((value_IMetInst != null)
	? (value_IMetInst)
	: (value_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "value", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T value(){
			final com.apple.jobjc.Invoke.MsgSend value_IMetInst = get_value_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		value_IMetInst.init(nativeBuffer, this);
		value_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
