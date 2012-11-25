package com.apple.jobjc.appkit;

public  class NSSpeechSynthesizer extends com.apple.jobjc.foundation.NSObject {
	public NSSpeechSynthesizer(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSSpeechSynthesizer(final NSSpeechSynthesizer obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addSpeechDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addSpeechDictionary_IMetInst(){
		return ((addSpeechDictionary_IMetInst != null)
	? (addSpeechDictionary_IMetInst)
	: (addSpeechDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addSpeechDictionary:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addSpeechDictionary(final com.apple.jobjc.foundation.NSDictionary speechDictionary){
			final com.apple.jobjc.Invoke.MsgSend addSpeechDictionary_IMetInst = get_addSpeechDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addSpeechDictionary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, speechDictionary);
		addSpeechDictionary_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend continueSpeaking_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_continueSpeaking_IMetInst(){
		return ((continueSpeaking_IMetInst != null)
	? (continueSpeaking_IMetInst)
	: (continueSpeaking_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "continueSpeaking", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void continueSpeaking(){
			final com.apple.jobjc.Invoke.MsgSend continueSpeaking_IMetInst = get_continueSpeaking_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		continueSpeaking_IMetInst.init(nativeBuffer, this);
		continueSpeaking_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_delegate_IMetInst(){
		return ((delegate_IMetInst != null)
	? (delegate_IMetInst)
	: (delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "delegate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T delegate(){
			final com.apple.jobjc.Invoke.MsgSend delegate_IMetInst = get_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		delegate_IMetInst.init(nativeBuffer, this);
		delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithVoice_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithVoice_IMetInst(){
		return ((initWithVoice_IMetInst != null)
	? (initWithVoice_IMetInst)
	: (initWithVoice_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithVoice:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithVoice(final com.apple.jobjc.foundation.NSString voice){
			final com.apple.jobjc.Invoke.MsgSend initWithVoice_IMetInst = get_initWithVoice_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithVoice_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, voice);
		initWithVoice_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSpeaking_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSpeaking_IMetInst(){
		return ((isSpeaking_IMetInst != null)
	? (isSpeaking_IMetInst)
	: (isSpeaking_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSpeaking", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isSpeaking(){
			final com.apple.jobjc.Invoke.MsgSend isSpeaking_IMetInst = get_isSpeaking_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSpeaking_IMetInst.init(nativeBuffer, this);
		isSpeaking_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectForProperty_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectForProperty_error_IMetInst(){
		return ((objectForProperty_error_IMetInst != null)
	? (objectForProperty_error_IMetInst)
	: (objectForProperty_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectForProperty:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectForProperty_error(final com.apple.jobjc.foundation.NSString property, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend objectForProperty_error_IMetInst = get_objectForProperty_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectForProperty_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, property);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		objectForProperty_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pauseSpeakingAtBoundary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pauseSpeakingAtBoundary_IMetInst(){
		return ((pauseSpeakingAtBoundary_IMetInst != null)
	? (pauseSpeakingAtBoundary_IMetInst)
	: (pauseSpeakingAtBoundary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pauseSpeakingAtBoundary:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void pauseSpeakingAtBoundary(final long boundary){
			final com.apple.jobjc.Invoke.MsgSend pauseSpeakingAtBoundary_IMetInst = get_pauseSpeakingAtBoundary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pauseSpeakingAtBoundary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, boundary);
		pauseSpeakingAtBoundary_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend phonemesFromText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_phonemesFromText_IMetInst(){
		return ((phonemesFromText_IMetInst != null)
	? (phonemesFromText_IMetInst)
	: (phonemesFromText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "phonemesFromText:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString phonemesFromText(final com.apple.jobjc.foundation.NSString text){
			final com.apple.jobjc.Invoke.MsgSend phonemesFromText_IMetInst = get_phonemesFromText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		phonemesFromText_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, text);
		phonemesFromText_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rate_IMetInst(){
		return ((rate_IMetInst != null)
	? (rate_IMetInst)
	: (rate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rate", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public float rate(){
			final com.apple.jobjc.Invoke.MsgSend rate_IMetInst = get_rate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rate_IMetInst.init(nativeBuffer, this);
		rate_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setObject_forProperty_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setObject_forProperty_error_IMetInst(){
		return ((setObject_forProperty_error_IMetInst != null)
	? (setObject_forProperty_error_IMetInst)
	: (setObject_forProperty_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setObject:forProperty:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean setObject_forProperty_error(final com.apple.jobjc.ID object, final com.apple.jobjc.foundation.NSString property, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend setObject_forProperty_error_IMetInst = get_setObject_forProperty_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setObject_forProperty_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, property);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		setObject_forProperty_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setRate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRate_IMetInst(){
		return ((setRate_IMetInst != null)
	? (setRate_IMetInst)
	: (setRate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public void setRate(final float rate){
			final com.apple.jobjc.Invoke.MsgSend setRate_IMetInst = get_setRate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, rate);
		setRate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesFeedbackWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesFeedbackWindow_IMetInst(){
		return ((setUsesFeedbackWindow_IMetInst != null)
	? (setUsesFeedbackWindow_IMetInst)
	: (setUsesFeedbackWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesFeedbackWindow:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesFeedbackWindow(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setUsesFeedbackWindow_IMetInst = get_setUsesFeedbackWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesFeedbackWindow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setUsesFeedbackWindow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVoice_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVoice_IMetInst(){
		return ((setVoice_IMetInst != null)
	? (setVoice_IMetInst)
	: (setVoice_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVoice:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setVoice(final com.apple.jobjc.foundation.NSString voice){
			final com.apple.jobjc.Invoke.MsgSend setVoice_IMetInst = get_setVoice_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVoice_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, voice);
		setVoice_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setVolume_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVolume_IMetInst(){
		return ((setVolume_IMetInst != null)
	? (setVolume_IMetInst)
	: (setVolume_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVolume:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public void setVolume(final float volume){
			final com.apple.jobjc.Invoke.MsgSend setVolume_IMetInst = get_setVolume_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVolume_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, volume);
		setVolume_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend startSpeakingString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startSpeakingString_IMetInst(){
		return ((startSpeakingString_IMetInst != null)
	? (startSpeakingString_IMetInst)
	: (startSpeakingString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startSpeakingString:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean startSpeakingString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend startSpeakingString_IMetInst = get_startSpeakingString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startSpeakingString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		startSpeakingString_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend startSpeakingString_toURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startSpeakingString_toURL_IMetInst(){
		return ((startSpeakingString_toURL_IMetInst != null)
	? (startSpeakingString_toURL_IMetInst)
	: (startSpeakingString_toURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startSpeakingString:toURL:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean startSpeakingString_toURL(final com.apple.jobjc.foundation.NSString string, final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend startSpeakingString_toURL_IMetInst = get_startSpeakingString_toURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startSpeakingString_toURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		startSpeakingString_toURL_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stopSpeaking_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stopSpeaking_IMetInst(){
		return ((stopSpeaking_IMetInst != null)
	? (stopSpeaking_IMetInst)
	: (stopSpeaking_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stopSpeaking", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void stopSpeaking(){
			final com.apple.jobjc.Invoke.MsgSend stopSpeaking_IMetInst = get_stopSpeaking_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stopSpeaking_IMetInst.init(nativeBuffer, this);
		stopSpeaking_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stopSpeakingAtBoundary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stopSpeakingAtBoundary_IMetInst(){
		return ((stopSpeakingAtBoundary_IMetInst != null)
	? (stopSpeakingAtBoundary_IMetInst)
	: (stopSpeakingAtBoundary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stopSpeakingAtBoundary:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void stopSpeakingAtBoundary(final long boundary){
			final com.apple.jobjc.Invoke.MsgSend stopSpeakingAtBoundary_IMetInst = get_stopSpeakingAtBoundary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stopSpeakingAtBoundary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, boundary);
		stopSpeakingAtBoundary_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend usesFeedbackWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesFeedbackWindow_IMetInst(){
		return ((usesFeedbackWindow_IMetInst != null)
	? (usesFeedbackWindow_IMetInst)
	: (usesFeedbackWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesFeedbackWindow", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesFeedbackWindow(){
			final com.apple.jobjc.Invoke.MsgSend usesFeedbackWindow_IMetInst = get_usesFeedbackWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesFeedbackWindow_IMetInst.init(nativeBuffer, this);
		usesFeedbackWindow_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend voice_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_voice_IMetInst(){
		return ((voice_IMetInst != null)
	? (voice_IMetInst)
	: (voice_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "voice", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString voice(){
			final com.apple.jobjc.Invoke.MsgSend voice_IMetInst = get_voice_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		voice_IMetInst.init(nativeBuffer, this);
		voice_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend volume_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_volume_IMetInst(){
		return ((volume_IMetInst != null)
	? (volume_IMetInst)
	: (volume_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "volume", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public float volume(){
			final com.apple.jobjc.Invoke.MsgSend volume_IMetInst = get_volume_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		volume_IMetInst.init(nativeBuffer, this);
		volume_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

}
