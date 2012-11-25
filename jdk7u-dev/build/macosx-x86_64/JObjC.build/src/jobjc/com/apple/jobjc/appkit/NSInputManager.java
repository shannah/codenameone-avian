package com.apple.jobjc.appkit;

public  class NSInputManager extends com.apple.jobjc.foundation.NSObject {
	public NSInputManager(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSInputManager(final NSInputManager obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend handleMouseEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_handleMouseEvent_IMetInst(){
		return ((handleMouseEvent_IMetInst != null)
	? (handleMouseEvent_IMetInst)
	: (handleMouseEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "handleMouseEvent:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean handleMouseEvent(final com.apple.jobjc.appkit.NSEvent theMouseEvent){
			final com.apple.jobjc.Invoke.MsgSend handleMouseEvent_IMetInst = get_handleMouseEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		handleMouseEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theMouseEvent);
		handleMouseEvent_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend image_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_image_IMetInst(){
		return ((image_IMetInst != null)
	? (image_IMetInst)
	: (image_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "image", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage image(){
			final com.apple.jobjc.Invoke.MsgSend image_IMetInst = get_image_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		image_IMetInst.init(nativeBuffer, this);
		image_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithName_host_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithName_host_IMetInst(){
		return ((initWithName_host_IMetInst != null)
	? (initWithName_host_IMetInst)
	: (initWithName_host_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithName:host:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSInputManager initWithName_host(final com.apple.jobjc.foundation.NSString inputServerName, final com.apple.jobjc.foundation.NSString hostName){
			final com.apple.jobjc.Invoke.MsgSend initWithName_host_IMetInst = get_initWithName_host_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithName_host_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, inputServerName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, hostName);
		initWithName_host_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSInputManager returnValue = (com.apple.jobjc.appkit.NSInputManager) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend language_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_language_IMetInst(){
		return ((language_IMetInst != null)
	? (language_IMetInst)
	: (language_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "language", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString language(){
			final com.apple.jobjc.Invoke.MsgSend language_IMetInst = get_language_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		language_IMetInst.init(nativeBuffer, this);
		language_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedInputManagerName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedInputManagerName_IMetInst(){
		return ((localizedInputManagerName_IMetInst != null)
	? (localizedInputManagerName_IMetInst)
	: (localizedInputManagerName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedInputManagerName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localizedInputManagerName(){
			final com.apple.jobjc.Invoke.MsgSend localizedInputManagerName_IMetInst = get_localizedInputManagerName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedInputManagerName_IMetInst.init(nativeBuffer, this);
		localizedInputManagerName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend markedTextAbandoned_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_markedTextAbandoned_IMetInst(){
		return ((markedTextAbandoned_IMetInst != null)
	? (markedTextAbandoned_IMetInst)
	: (markedTextAbandoned_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "markedTextAbandoned:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void markedTextAbandoned(final com.apple.jobjc.ID cli){
			final com.apple.jobjc.Invoke.MsgSend markedTextAbandoned_IMetInst = get_markedTextAbandoned_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		markedTextAbandoned_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cli);
		markedTextAbandoned_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend markedTextSelectionChanged_client_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_markedTextSelectionChanged_client_IMetInst(){
		return ((markedTextSelectionChanged_client_IMetInst != null)
	? (markedTextSelectionChanged_client_IMetInst)
	: (markedTextSelectionChanged_client_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "markedTextSelectionChanged:client:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void markedTextSelectionChanged_client(final com.apple.jobjc.foundation.NSRange newSel, final com.apple.jobjc.ID cli){
			final com.apple.jobjc.Invoke.MsgSend markedTextSelectionChanged_client_IMetInst = get_markedTextSelectionChanged_client_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		markedTextSelectionChanged_client_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, newSel);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cli);
		markedTextSelectionChanged_client_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend server_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_server_IMetInst(){
		return ((server_IMetInst != null)
	? (server_IMetInst)
	: (server_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "server", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSInputServer server(){
			final com.apple.jobjc.Invoke.MsgSend server_IMetInst = get_server_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		server_IMetInst.init(nativeBuffer, this);
		server_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSInputServer returnValue = (com.apple.jobjc.appkit.NSInputServer) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend wantsToDelayTextChangeNotifications_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_wantsToDelayTextChangeNotifications_IMetInst(){
		return ((wantsToDelayTextChangeNotifications_IMetInst != null)
	? (wantsToDelayTextChangeNotifications_IMetInst)
	: (wantsToDelayTextChangeNotifications_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "wantsToDelayTextChangeNotifications", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean wantsToDelayTextChangeNotifications(){
			final com.apple.jobjc.Invoke.MsgSend wantsToDelayTextChangeNotifications_IMetInst = get_wantsToDelayTextChangeNotifications_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		wantsToDelayTextChangeNotifications_IMetInst.init(nativeBuffer, this);
		wantsToDelayTextChangeNotifications_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend wantsToHandleMouseEvents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_wantsToHandleMouseEvents_IMetInst(){
		return ((wantsToHandleMouseEvents_IMetInst != null)
	? (wantsToHandleMouseEvents_IMetInst)
	: (wantsToHandleMouseEvents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "wantsToHandleMouseEvents", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean wantsToHandleMouseEvents(){
			final com.apple.jobjc.Invoke.MsgSend wantsToHandleMouseEvents_IMetInst = get_wantsToHandleMouseEvents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		wantsToHandleMouseEvents_IMetInst.init(nativeBuffer, this);
		wantsToHandleMouseEvents_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend wantsToInterpretAllKeystrokes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_wantsToInterpretAllKeystrokes_IMetInst(){
		return ((wantsToInterpretAllKeystrokes_IMetInst != null)
	? (wantsToInterpretAllKeystrokes_IMetInst)
	: (wantsToInterpretAllKeystrokes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "wantsToInterpretAllKeystrokes", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean wantsToInterpretAllKeystrokes(){
			final com.apple.jobjc.Invoke.MsgSend wantsToInterpretAllKeystrokes_IMetInst = get_wantsToInterpretAllKeystrokes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		wantsToInterpretAllKeystrokes_IMetInst.init(nativeBuffer, this);
		wantsToInterpretAllKeystrokes_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
