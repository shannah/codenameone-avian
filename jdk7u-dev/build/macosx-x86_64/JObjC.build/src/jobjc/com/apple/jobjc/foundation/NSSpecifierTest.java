package com.apple.jobjc.foundation;

public  class NSSpecifierTest extends com.apple.jobjc.foundation.NSScriptWhoseTest {
	public NSSpecifierTest(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSSpecifierTest(final NSSpecifierTest obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend initWithObjectSpecifier_comparisonOperator_testObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithObjectSpecifier_comparisonOperator_testObject_IMetInst(){
		return ((initWithObjectSpecifier_comparisonOperator_testObject_IMetInst != null)
	? (initWithObjectSpecifier_comparisonOperator_testObject_IMetInst)
	: (initWithObjectSpecifier_comparisonOperator_testObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithObjectSpecifier:comparisonOperator:testObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithObjectSpecifier_comparisonOperator_testObject(final com.apple.jobjc.foundation.NSScriptObjectSpecifier obj1, final long compOp, final com.apple.jobjc.ID obj2){
			final com.apple.jobjc.Invoke.MsgSend initWithObjectSpecifier_comparisonOperator_testObject_IMetInst = get_initWithObjectSpecifier_comparisonOperator_testObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithObjectSpecifier_comparisonOperator_testObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj1);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, compOp);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj2);
		initWithObjectSpecifier_comparisonOperator_testObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
