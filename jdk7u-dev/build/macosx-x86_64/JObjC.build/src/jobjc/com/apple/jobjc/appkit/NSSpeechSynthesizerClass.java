package com.apple.jobjc.appkit;

public  class NSSpeechSynthesizerClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSSpeechSynthesizerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSSpeechSynthesizerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSSpeechSynthesizerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend attributesForVoice_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributesForVoice_CMetInst(){
		return ((attributesForVoice_CMetInst != null)
	? (attributesForVoice_CMetInst)
	: (attributesForVoice_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributesForVoice:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary attributesForVoice(final com.apple.jobjc.foundation.NSString voice){
			final com.apple.jobjc.Invoke.MsgSend attributesForVoice_CMetInst = get_attributesForVoice_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributesForVoice_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, voice);
		attributesForVoice_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend availableVoices_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_availableVoices_CMetInst(){
		return ((availableVoices_CMetInst != null)
	? (availableVoices_CMetInst)
	: (availableVoices_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "availableVoices", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray availableVoices(){
			final com.apple.jobjc.Invoke.MsgSend availableVoices_CMetInst = get_availableVoices_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		availableVoices_CMetInst.init(nativeBuffer, this);
		availableVoices_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultVoice_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultVoice_CMetInst(){
		return ((defaultVoice_CMetInst != null)
	? (defaultVoice_CMetInst)
	: (defaultVoice_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultVoice", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString defaultVoice(){
			final com.apple.jobjc.Invoke.MsgSend defaultVoice_CMetInst = get_defaultVoice_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultVoice_CMetInst.init(nativeBuffer, this);
		defaultVoice_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isAnyApplicationSpeaking_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isAnyApplicationSpeaking_CMetInst(){
		return ((isAnyApplicationSpeaking_CMetInst != null)
	? (isAnyApplicationSpeaking_CMetInst)
	: (isAnyApplicationSpeaking_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isAnyApplicationSpeaking", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isAnyApplicationSpeaking(){
			final com.apple.jobjc.Invoke.MsgSend isAnyApplicationSpeaking_CMetInst = get_isAnyApplicationSpeaking_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isAnyApplicationSpeaking_CMetInst.init(nativeBuffer, this);
		isAnyApplicationSpeaking_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
