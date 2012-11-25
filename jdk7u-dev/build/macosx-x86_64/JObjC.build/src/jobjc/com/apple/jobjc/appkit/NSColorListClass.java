package com.apple.jobjc.appkit;

public  class NSColorListClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSColorListClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSColorListClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSColorListClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend availableColorLists_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_availableColorLists_CMetInst(){
		return ((availableColorLists_CMetInst != null)
	? (availableColorLists_CMetInst)
	: (availableColorLists_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "availableColorLists", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray availableColorLists(){
			final com.apple.jobjc.Invoke.MsgSend availableColorLists_CMetInst = get_availableColorLists_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		availableColorLists_CMetInst.init(nativeBuffer, this);
		availableColorLists_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorListNamed_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorListNamed_CMetInst(){
		return ((colorListNamed_CMetInst != null)
	? (colorListNamed_CMetInst)
	: (colorListNamed_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorListNamed:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColorList colorListNamed(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend colorListNamed_CMetInst = get_colorListNamed_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorListNamed_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		colorListNamed_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColorList returnValue = (com.apple.jobjc.appkit.NSColorList) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
