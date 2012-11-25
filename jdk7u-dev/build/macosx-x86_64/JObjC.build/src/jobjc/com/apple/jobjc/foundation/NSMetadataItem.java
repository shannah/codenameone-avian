package com.apple.jobjc.foundation;

public  class NSMetadataItem extends com.apple.jobjc.foundation.NSObject {
	public NSMetadataItem(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMetadataItem(final NSMetadataItem obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend attributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributes_IMetInst(){
		return ((attributes_IMetInst != null)
	? (attributes_IMetInst)
	: (attributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray attributes(){
			final com.apple.jobjc.Invoke.MsgSend attributes_IMetInst = get_attributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributes_IMetInst.init(nativeBuffer, this);
		attributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueForAttribute_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueForAttribute_IMetInst(){
		return ((valueForAttribute_IMetInst != null)
	? (valueForAttribute_IMetInst)
	: (valueForAttribute_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueForAttribute:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T valueForAttribute(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend valueForAttribute_IMetInst = get_valueForAttribute_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueForAttribute_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		valueForAttribute_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valuesForAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valuesForAttributes_IMetInst(){
		return ((valuesForAttributes_IMetInst != null)
	? (valuesForAttributes_IMetInst)
	: (valuesForAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valuesForAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary valuesForAttributes(final com.apple.jobjc.foundation.NSArray keys){
			final com.apple.jobjc.Invoke.MsgSend valuesForAttributes_IMetInst = get_valuesForAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valuesForAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keys);
		valuesForAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
