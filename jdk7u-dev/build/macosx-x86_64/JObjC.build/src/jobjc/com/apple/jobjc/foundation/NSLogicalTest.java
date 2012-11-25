package com.apple.jobjc.foundation;

public  class NSLogicalTest extends com.apple.jobjc.foundation.NSScriptWhoseTest {
	public NSLogicalTest(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSLogicalTest(final NSLogicalTest obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend initAndTestWithTests_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initAndTestWithTests_IMetInst(){
		return ((initAndTestWithTests_IMetInst != null)
	? (initAndTestWithTests_IMetInst)
	: (initAndTestWithTests_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initAndTestWithTests:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initAndTestWithTests(final com.apple.jobjc.foundation.NSArray subTests){
			final com.apple.jobjc.Invoke.MsgSend initAndTestWithTests_IMetInst = get_initAndTestWithTests_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initAndTestWithTests_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subTests);
		initAndTestWithTests_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initNotTestWithTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initNotTestWithTest_IMetInst(){
		return ((initNotTestWithTest_IMetInst != null)
	? (initNotTestWithTest_IMetInst)
	: (initNotTestWithTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initNotTestWithTest:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initNotTestWithTest(final com.apple.jobjc.foundation.NSScriptWhoseTest subTest){
			final com.apple.jobjc.Invoke.MsgSend initNotTestWithTest_IMetInst = get_initNotTestWithTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initNotTestWithTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subTest);
		initNotTestWithTest_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initOrTestWithTests_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initOrTestWithTests_IMetInst(){
		return ((initOrTestWithTests_IMetInst != null)
	? (initOrTestWithTests_IMetInst)
	: (initOrTestWithTests_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initOrTestWithTests:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initOrTestWithTests(final com.apple.jobjc.foundation.NSArray subTests){
			final com.apple.jobjc.Invoke.MsgSend initOrTestWithTests_IMetInst = get_initOrTestWithTests_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initOrTestWithTests_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subTests);
		initOrTestWithTests_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
