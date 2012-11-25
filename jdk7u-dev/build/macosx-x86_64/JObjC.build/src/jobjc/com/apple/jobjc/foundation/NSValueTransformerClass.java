package com.apple.jobjc.foundation;

public  class NSValueTransformerClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSValueTransformerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSValueTransformerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSValueTransformerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend allowsReverseTransformation_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsReverseTransformation_CMetInst(){
		return ((allowsReverseTransformation_CMetInst != null)
	? (allowsReverseTransformation_CMetInst)
	: (allowsReverseTransformation_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsReverseTransformation", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsReverseTransformation(){
			final com.apple.jobjc.Invoke.MsgSend allowsReverseTransformation_CMetInst = get_allowsReverseTransformation_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsReverseTransformation_CMetInst.init(nativeBuffer, this);
		allowsReverseTransformation_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setValueTransformer_forName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setValueTransformer_forName_CMetInst(){
		return ((setValueTransformer_forName_CMetInst != null)
	? (setValueTransformer_forName_CMetInst)
	: (setValueTransformer_forName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setValueTransformer:forName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setValueTransformer_forName(final com.apple.jobjc.foundation.NSValueTransformer transformer, final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend setValueTransformer_forName_CMetInst = get_setValueTransformer_forName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setValueTransformer_forName_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, transformer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		setValueTransformer_forName_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend transformedValueClass_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_transformedValueClass_CMetInst(){
		return ((transformedValueClass_CMetInst != null)
	? (transformedValueClass_CMetInst)
	: (transformedValueClass_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "transformedValueClass", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T transformedValueClass(){
			final com.apple.jobjc.Invoke.MsgSend transformedValueClass_CMetInst = get_transformedValueClass_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		transformedValueClass_CMetInst.init(nativeBuffer, this);
		transformedValueClass_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueTransformerForName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueTransformerForName_CMetInst(){
		return ((valueTransformerForName_CMetInst != null)
	? (valueTransformerForName_CMetInst)
	: (valueTransformerForName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueTransformerForName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSValueTransformer valueTransformerForName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend valueTransformerForName_CMetInst = get_valueTransformerForName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueTransformerForName_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		valueTransformerForName_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSValueTransformer returnValue = (com.apple.jobjc.foundation.NSValueTransformer) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueTransformerNames_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueTransformerNames_CMetInst(){
		return ((valueTransformerNames_CMetInst != null)
	? (valueTransformerNames_CMetInst)
	: (valueTransformerNames_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueTransformerNames", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray valueTransformerNames(){
			final com.apple.jobjc.Invoke.MsgSend valueTransformerNames_CMetInst = get_valueTransformerNames_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueTransformerNames_CMetInst.init(nativeBuffer, this);
		valueTransformerNames_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
