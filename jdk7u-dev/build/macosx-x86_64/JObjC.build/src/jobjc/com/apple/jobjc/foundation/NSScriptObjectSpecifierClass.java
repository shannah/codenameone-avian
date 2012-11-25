package com.apple.jobjc.foundation;

public  class NSScriptObjectSpecifierClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSScriptObjectSpecifierClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSScriptObjectSpecifierClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSScriptObjectSpecifierClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend objectSpecifierWithDescriptor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectSpecifierWithDescriptor_CMetInst(){
		return ((objectSpecifierWithDescriptor_CMetInst != null)
	? (objectSpecifierWithDescriptor_CMetInst)
	: (objectSpecifierWithDescriptor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectSpecifierWithDescriptor:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptObjectSpecifier objectSpecifierWithDescriptor(final com.apple.jobjc.foundation.NSAppleEventDescriptor descriptor){
			final com.apple.jobjc.Invoke.MsgSend objectSpecifierWithDescriptor_CMetInst = get_objectSpecifierWithDescriptor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectSpecifierWithDescriptor_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, descriptor);
		objectSpecifierWithDescriptor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptObjectSpecifier returnValue = (com.apple.jobjc.foundation.NSScriptObjectSpecifier) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
