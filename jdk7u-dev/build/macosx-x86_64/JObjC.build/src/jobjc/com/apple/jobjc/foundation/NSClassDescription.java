package com.apple.jobjc.foundation;

public  class NSClassDescription extends com.apple.jobjc.foundation.NSObject {
	public NSClassDescription(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSClassDescription(final NSClassDescription obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend attributeKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributeKeys_IMetInst(){
		return ((attributeKeys_IMetInst != null)
	? (attributeKeys_IMetInst)
	: (attributeKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributeKeys", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray attributeKeys(){
			final com.apple.jobjc.Invoke.MsgSend attributeKeys_IMetInst = get_attributeKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributeKeys_IMetInst.init(nativeBuffer, this);
		attributeKeys_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend inverseForRelationshipKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_inverseForRelationshipKey_IMetInst(){
		return ((inverseForRelationshipKey_IMetInst != null)
	? (inverseForRelationshipKey_IMetInst)
	: (inverseForRelationshipKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "inverseForRelationshipKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString inverseForRelationshipKey(final com.apple.jobjc.foundation.NSString relationshipKey){
			final com.apple.jobjc.Invoke.MsgSend inverseForRelationshipKey_IMetInst = get_inverseForRelationshipKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		inverseForRelationshipKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, relationshipKey);
		inverseForRelationshipKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend toManyRelationshipKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toManyRelationshipKeys_IMetInst(){
		return ((toManyRelationshipKeys_IMetInst != null)
	? (toManyRelationshipKeys_IMetInst)
	: (toManyRelationshipKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toManyRelationshipKeys", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray toManyRelationshipKeys(){
			final com.apple.jobjc.Invoke.MsgSend toManyRelationshipKeys_IMetInst = get_toManyRelationshipKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toManyRelationshipKeys_IMetInst.init(nativeBuffer, this);
		toManyRelationshipKeys_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend toOneRelationshipKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toOneRelationshipKeys_IMetInst(){
		return ((toOneRelationshipKeys_IMetInst != null)
	? (toOneRelationshipKeys_IMetInst)
	: (toOneRelationshipKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toOneRelationshipKeys", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray toOneRelationshipKeys(){
			final com.apple.jobjc.Invoke.MsgSend toOneRelationshipKeys_IMetInst = get_toOneRelationshipKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toOneRelationshipKeys_IMetInst.init(nativeBuffer, this);
		toOneRelationshipKeys_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
