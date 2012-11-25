package com.apple.jobjc.foundation;

public  class NSQuitCommand extends com.apple.jobjc.foundation.NSScriptCommand {
	public NSQuitCommand(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSQuitCommand(final NSQuitCommand obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend saveOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_saveOptions_IMetInst(){
		return ((saveOptions_IMetInst != null)
	? (saveOptions_IMetInst)
	: (saveOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "saveOptions", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long saveOptions(){
			final com.apple.jobjc.Invoke.MsgSend saveOptions_IMetInst = get_saveOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		saveOptions_IMetInst.init(nativeBuffer, this);
		saveOptions_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
