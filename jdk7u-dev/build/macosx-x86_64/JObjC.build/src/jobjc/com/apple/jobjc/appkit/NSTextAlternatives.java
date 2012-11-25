package com.apple.jobjc.appkit;

public  class NSTextAlternatives extends com.apple.jobjc.foundation.NSObject {
	public NSTextAlternatives(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTextAlternatives(final NSTextAlternatives obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend alternativeStrings_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alternativeStrings_IMetInst(){
		return ((alternativeStrings_IMetInst != null)
	? (alternativeStrings_IMetInst)
	: (alternativeStrings_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alternativeStrings", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray alternativeStrings(){
			final com.apple.jobjc.Invoke.MsgSend alternativeStrings_IMetInst = get_alternativeStrings_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alternativeStrings_IMetInst.init(nativeBuffer, this);
		alternativeStrings_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithPrimaryString_alternativeStrings_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithPrimaryString_alternativeStrings_IMetInst(){
		return ((initWithPrimaryString_alternativeStrings_IMetInst != null)
	? (initWithPrimaryString_alternativeStrings_IMetInst)
	: (initWithPrimaryString_alternativeStrings_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithPrimaryString:alternativeStrings:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithPrimaryString_alternativeStrings(final com.apple.jobjc.foundation.NSString primaryString, final com.apple.jobjc.foundation.NSArray alternativeStrings){
			final com.apple.jobjc.Invoke.MsgSend initWithPrimaryString_alternativeStrings_IMetInst = get_initWithPrimaryString_alternativeStrings_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithPrimaryString_alternativeStrings_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, primaryString);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, alternativeStrings);
		initWithPrimaryString_alternativeStrings_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend noteSelectedAlternativeString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_noteSelectedAlternativeString_IMetInst(){
		return ((noteSelectedAlternativeString_IMetInst != null)
	? (noteSelectedAlternativeString_IMetInst)
	: (noteSelectedAlternativeString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "noteSelectedAlternativeString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void noteSelectedAlternativeString(final com.apple.jobjc.foundation.NSString alternativeString){
			final com.apple.jobjc.Invoke.MsgSend noteSelectedAlternativeString_IMetInst = get_noteSelectedAlternativeString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		noteSelectedAlternativeString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, alternativeString);
		noteSelectedAlternativeString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend primaryString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_primaryString_IMetInst(){
		return ((primaryString_IMetInst != null)
	? (primaryString_IMetInst)
	: (primaryString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "primaryString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString primaryString(){
			final com.apple.jobjc.Invoke.MsgSend primaryString_IMetInst = get_primaryString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		primaryString_IMetInst.init(nativeBuffer, this);
		primaryString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
