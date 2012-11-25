package com.apple.jobjc.foundation;

public  class NSWhoseSpecifier extends com.apple.jobjc.foundation.NSScriptObjectSpecifier {
	public NSWhoseSpecifier(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSWhoseSpecifier(final NSWhoseSpecifier obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend endSubelementIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_endSubelementIdentifier_IMetInst(){
		return ((endSubelementIdentifier_IMetInst != null)
	? (endSubelementIdentifier_IMetInst)
	: (endSubelementIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "endSubelementIdentifier", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long endSubelementIdentifier(){
			final com.apple.jobjc.Invoke.MsgSend endSubelementIdentifier_IMetInst = get_endSubelementIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		endSubelementIdentifier_IMetInst.init(nativeBuffer, this);
		endSubelementIdentifier_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend endSubelementIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_endSubelementIndex_IMetInst(){
		return ((endSubelementIndex_IMetInst != null)
	? (endSubelementIndex_IMetInst)
	: (endSubelementIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "endSubelementIndex", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long endSubelementIndex(){
			final com.apple.jobjc.Invoke.MsgSend endSubelementIndex_IMetInst = get_endSubelementIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		endSubelementIndex_IMetInst.init(nativeBuffer, this);
		endSubelementIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContainerClassDescription_containerSpecifier_key_test_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContainerClassDescription_containerSpecifier_key_test_IMetInst(){
		return ((initWithContainerClassDescription_containerSpecifier_key_test_IMetInst != null)
	? (initWithContainerClassDescription_containerSpecifier_key_test_IMetInst)
	: (initWithContainerClassDescription_containerSpecifier_key_test_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContainerClassDescription:containerSpecifier:key:test:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContainerClassDescription_containerSpecifier_key_test(final com.apple.jobjc.foundation.NSScriptClassDescription classDesc, final com.apple.jobjc.foundation.NSScriptObjectSpecifier container, final com.apple.jobjc.foundation.NSString property, final com.apple.jobjc.foundation.NSScriptWhoseTest test){
			final com.apple.jobjc.Invoke.MsgSend initWithContainerClassDescription_containerSpecifier_key_test_IMetInst = get_initWithContainerClassDescription_containerSpecifier_key_test_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContainerClassDescription_containerSpecifier_key_test_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, classDesc);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, property);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, test);
		initWithContainerClassDescription_containerSpecifier_key_test_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setEndSubelementIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEndSubelementIdentifier_IMetInst(){
		return ((setEndSubelementIdentifier_IMetInst != null)
	? (setEndSubelementIdentifier_IMetInst)
	: (setEndSubelementIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEndSubelementIdentifier:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setEndSubelementIdentifier(final long subelement){
			final com.apple.jobjc.Invoke.MsgSend setEndSubelementIdentifier_IMetInst = get_setEndSubelementIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEndSubelementIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, subelement);
		setEndSubelementIdentifier_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setEndSubelementIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEndSubelementIndex_IMetInst(){
		return ((setEndSubelementIndex_IMetInst != null)
	? (setEndSubelementIndex_IMetInst)
	: (setEndSubelementIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEndSubelementIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setEndSubelementIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend setEndSubelementIndex_IMetInst = get_setEndSubelementIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEndSubelementIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		setEndSubelementIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setStartSubelementIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStartSubelementIdentifier_IMetInst(){
		return ((setStartSubelementIdentifier_IMetInst != null)
	? (setStartSubelementIdentifier_IMetInst)
	: (setStartSubelementIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStartSubelementIdentifier:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setStartSubelementIdentifier(final long subelement){
			final com.apple.jobjc.Invoke.MsgSend setStartSubelementIdentifier_IMetInst = get_setStartSubelementIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStartSubelementIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, subelement);
		setStartSubelementIdentifier_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setStartSubelementIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStartSubelementIndex_IMetInst(){
		return ((setStartSubelementIndex_IMetInst != null)
	? (setStartSubelementIndex_IMetInst)
	: (setStartSubelementIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStartSubelementIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setStartSubelementIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend setStartSubelementIndex_IMetInst = get_setStartSubelementIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStartSubelementIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		setStartSubelementIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTest_IMetInst(){
		return ((setTest_IMetInst != null)
	? (setTest_IMetInst)
	: (setTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTest:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTest(final com.apple.jobjc.foundation.NSScriptWhoseTest test){
			final com.apple.jobjc.Invoke.MsgSend setTest_IMetInst = get_setTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, test);
		setTest_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend startSubelementIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startSubelementIdentifier_IMetInst(){
		return ((startSubelementIdentifier_IMetInst != null)
	? (startSubelementIdentifier_IMetInst)
	: (startSubelementIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startSubelementIdentifier", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long startSubelementIdentifier(){
			final com.apple.jobjc.Invoke.MsgSend startSubelementIdentifier_IMetInst = get_startSubelementIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startSubelementIdentifier_IMetInst.init(nativeBuffer, this);
		startSubelementIdentifier_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend startSubelementIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startSubelementIndex_IMetInst(){
		return ((startSubelementIndex_IMetInst != null)
	? (startSubelementIndex_IMetInst)
	: (startSubelementIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startSubelementIndex", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long startSubelementIndex(){
			final com.apple.jobjc.Invoke.MsgSend startSubelementIndex_IMetInst = get_startSubelementIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startSubelementIndex_IMetInst.init(nativeBuffer, this);
		startSubelementIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend test_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_test_IMetInst(){
		return ((test_IMetInst != null)
	? (test_IMetInst)
	: (test_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "test", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptWhoseTest test(){
			final com.apple.jobjc.Invoke.MsgSend test_IMetInst = get_test_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		test_IMetInst.init(nativeBuffer, this);
		test_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptWhoseTest returnValue = (com.apple.jobjc.foundation.NSScriptWhoseTest) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
