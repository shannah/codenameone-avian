package com.apple.jobjc.appkit;

public  class NSTextInputContext extends com.apple.jobjc.foundation.NSObject {
	public NSTextInputContext(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTextInputContext(final NSTextInputContext obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend acceptsGlyphInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_acceptsGlyphInfo_IMetInst(){
		return ((acceptsGlyphInfo_IMetInst != null)
	? (acceptsGlyphInfo_IMetInst)
	: (acceptsGlyphInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "acceptsGlyphInfo", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean acceptsGlyphInfo(){
			final com.apple.jobjc.Invoke.MsgSend acceptsGlyphInfo_IMetInst = get_acceptsGlyphInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		acceptsGlyphInfo_IMetInst.init(nativeBuffer, this);
		acceptsGlyphInfo_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend activate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_activate_IMetInst(){
		return ((activate_IMetInst != null)
	? (activate_IMetInst)
	: (activate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "activate", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void activate(){
			final com.apple.jobjc.Invoke.MsgSend activate_IMetInst = get_activate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		activate_IMetInst.init(nativeBuffer, this);
		activate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend allowedInputSourceLocales_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowedInputSourceLocales_IMetInst(){
		return ((allowedInputSourceLocales_IMetInst != null)
	? (allowedInputSourceLocales_IMetInst)
	: (allowedInputSourceLocales_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowedInputSourceLocales", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray allowedInputSourceLocales(){
			final com.apple.jobjc.Invoke.MsgSend allowedInputSourceLocales_IMetInst = get_allowedInputSourceLocales_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowedInputSourceLocales_IMetInst.init(nativeBuffer, this);
		allowedInputSourceLocales_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend client_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_client_IMetInst(){
		return ((client_IMetInst != null)
	? (client_IMetInst)
	: (client_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "client", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T client(){
			final com.apple.jobjc.Invoke.MsgSend client_IMetInst = get_client_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		client_IMetInst.init(nativeBuffer, this);
		client_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deactivate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deactivate_IMetInst(){
		return ((deactivate_IMetInst != null)
	? (deactivate_IMetInst)
	: (deactivate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deactivate", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void deactivate(){
			final com.apple.jobjc.Invoke.MsgSend deactivate_IMetInst = get_deactivate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deactivate_IMetInst.init(nativeBuffer, this);
		deactivate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend discardMarkedText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_discardMarkedText_IMetInst(){
		return ((discardMarkedText_IMetInst != null)
	? (discardMarkedText_IMetInst)
	: (discardMarkedText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "discardMarkedText", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void discardMarkedText(){
			final com.apple.jobjc.Invoke.MsgSend discardMarkedText_IMetInst = get_discardMarkedText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		discardMarkedText_IMetInst.init(nativeBuffer, this);
		discardMarkedText_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend handleEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_handleEvent_IMetInst(){
		return ((handleEvent_IMetInst != null)
	? (handleEvent_IMetInst)
	: (handleEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "handleEvent:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean handleEvent(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend handleEvent_IMetInst = get_handleEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		handleEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		handleEvent_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithClient_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithClient_IMetInst(){
		return ((initWithClient_IMetInst != null)
	? (initWithClient_IMetInst)
	: (initWithClient_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithClient:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithClient(final com.apple.jobjc.ID theClient){
			final com.apple.jobjc.Invoke.MsgSend initWithClient_IMetInst = get_initWithClient_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithClient_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theClient);
		initWithClient_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidateCharacterCoordinates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidateCharacterCoordinates_IMetInst(){
		return ((invalidateCharacterCoordinates_IMetInst != null)
	? (invalidateCharacterCoordinates_IMetInst)
	: (invalidateCharacterCoordinates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidateCharacterCoordinates", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void invalidateCharacterCoordinates(){
			final com.apple.jobjc.Invoke.MsgSend invalidateCharacterCoordinates_IMetInst = get_invalidateCharacterCoordinates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidateCharacterCoordinates_IMetInst.init(nativeBuffer, this);
		invalidateCharacterCoordinates_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend keyboardInputSources_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyboardInputSources_IMetInst(){
		return ((keyboardInputSources_IMetInst != null)
	? (keyboardInputSources_IMetInst)
	: (keyboardInputSources_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyboardInputSources", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray keyboardInputSources(){
			final com.apple.jobjc.Invoke.MsgSend keyboardInputSources_IMetInst = get_keyboardInputSources_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyboardInputSources_IMetInst.init(nativeBuffer, this);
		keyboardInputSources_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedKeyboardInputSource_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedKeyboardInputSource_IMetInst(){
		return ((selectedKeyboardInputSource_IMetInst != null)
	? (selectedKeyboardInputSource_IMetInst)
	: (selectedKeyboardInputSource_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedKeyboardInputSource", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString selectedKeyboardInputSource(){
			final com.apple.jobjc.Invoke.MsgSend selectedKeyboardInputSource_IMetInst = get_selectedKeyboardInputSource_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedKeyboardInputSource_IMetInst.init(nativeBuffer, this);
		selectedKeyboardInputSource_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAcceptsGlyphInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAcceptsGlyphInfo_IMetInst(){
		return ((setAcceptsGlyphInfo_IMetInst != null)
	? (setAcceptsGlyphInfo_IMetInst)
	: (setAcceptsGlyphInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAcceptsGlyphInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAcceptsGlyphInfo(final boolean acceptsGlyphInfo){
			final com.apple.jobjc.Invoke.MsgSend setAcceptsGlyphInfo_IMetInst = get_setAcceptsGlyphInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAcceptsGlyphInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, acceptsGlyphInfo);
		setAcceptsGlyphInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowedInputSourceLocales_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowedInputSourceLocales_IMetInst(){
		return ((setAllowedInputSourceLocales_IMetInst != null)
	? (setAllowedInputSourceLocales_IMetInst)
	: (setAllowedInputSourceLocales_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowedInputSourceLocales:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAllowedInputSourceLocales(final com.apple.jobjc.foundation.NSArray allowedInputSourceLocales){
			final com.apple.jobjc.Invoke.MsgSend setAllowedInputSourceLocales_IMetInst = get_setAllowedInputSourceLocales_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowedInputSourceLocales_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, allowedInputSourceLocales);
		setAllowedInputSourceLocales_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectedKeyboardInputSource_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectedKeyboardInputSource_IMetInst(){
		return ((setSelectedKeyboardInputSource_IMetInst != null)
	? (setSelectedKeyboardInputSource_IMetInst)
	: (setSelectedKeyboardInputSource_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectedKeyboardInputSource:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSelectedKeyboardInputSource(final com.apple.jobjc.foundation.NSString selectedKeyboardInputSource){
			final com.apple.jobjc.Invoke.MsgSend setSelectedKeyboardInputSource_IMetInst = get_setSelectedKeyboardInputSource_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectedKeyboardInputSource_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, selectedKeyboardInputSource);
		setSelectedKeyboardInputSource_IMetInst.invoke(nativeBuffer);
		
		
	}

}
