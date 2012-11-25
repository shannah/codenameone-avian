package com.apple.jobjc.foundation;

public  class NSValueTransformer extends com.apple.jobjc.foundation.NSObject {
	public NSValueTransformer(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSValueTransformer(final NSValueTransformer obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend reverseTransformedValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reverseTransformedValue_IMetInst(){
		return ((reverseTransformedValue_IMetInst != null)
	? (reverseTransformedValue_IMetInst)
	: (reverseTransformedValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reverseTransformedValue:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T reverseTransformedValue(final com.apple.jobjc.ID value){
			final com.apple.jobjc.Invoke.MsgSend reverseTransformedValue_IMetInst = get_reverseTransformedValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reverseTransformedValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		reverseTransformedValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend transformedValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_transformedValue_IMetInst(){
		return ((transformedValue_IMetInst != null)
	? (transformedValue_IMetInst)
	: (transformedValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "transformedValue:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T transformedValue(final com.apple.jobjc.ID value){
			final com.apple.jobjc.Invoke.MsgSend transformedValue_IMetInst = get_transformedValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		transformedValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		transformedValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
