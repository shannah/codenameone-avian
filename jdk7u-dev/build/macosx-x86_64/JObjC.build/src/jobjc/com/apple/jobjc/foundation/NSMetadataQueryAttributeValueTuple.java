package com.apple.jobjc.foundation;

public  class NSMetadataQueryAttributeValueTuple extends com.apple.jobjc.foundation.NSObject {
	public NSMetadataQueryAttributeValueTuple(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMetadataQueryAttributeValueTuple(final NSMetadataQueryAttributeValueTuple obj, final com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend count_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_count_IMetInst(){
		return ((count_IMetInst != null)
	? (count_IMetInst)
	: (count_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "count", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long count(){
			final com.apple.jobjc.Invoke.MsgSend count_IMetInst = get_count_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		count_IMetInst.init(nativeBuffer, this);
		count_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
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
