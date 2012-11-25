package com.apple.jobjc.appkit;

public  class NSHelpManager extends com.apple.jobjc.foundation.NSObject {
	public NSHelpManager(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSHelpManager(final NSHelpManager obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend contextHelpForObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contextHelpForObject_IMetInst(){
		return ((contextHelpForObject_IMetInst != null)
	? (contextHelpForObject_IMetInst)
	: (contextHelpForObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contextHelpForObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAttributedString contextHelpForObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend contextHelpForObject_IMetInst = get_contextHelpForObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contextHelpForObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		contextHelpForObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend findString_inBook_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_findString_inBook_IMetInst(){
		return ((findString_inBook_IMetInst != null)
	? (findString_inBook_IMetInst)
	: (findString_inBook_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "findString:inBook:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void findString_inBook(final com.apple.jobjc.foundation.NSString query, final com.apple.jobjc.foundation.NSString book){
			final com.apple.jobjc.Invoke.MsgSend findString_inBook_IMetInst = get_findString_inBook_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		findString_inBook_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, query);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, book);
		findString_inBook_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend openHelpAnchor_inBook_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openHelpAnchor_inBook_IMetInst(){
		return ((openHelpAnchor_inBook_IMetInst != null)
	? (openHelpAnchor_inBook_IMetInst)
	: (openHelpAnchor_inBook_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openHelpAnchor:inBook:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void openHelpAnchor_inBook(final com.apple.jobjc.foundation.NSString anchor, final com.apple.jobjc.foundation.NSString book){
			final com.apple.jobjc.Invoke.MsgSend openHelpAnchor_inBook_IMetInst = get_openHelpAnchor_inBook_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openHelpAnchor_inBook_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anchor);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, book);
		openHelpAnchor_inBook_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend registerBooksInBundle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerBooksInBundle_IMetInst(){
		return ((registerBooksInBundle_IMetInst != null)
	? (registerBooksInBundle_IMetInst)
	: (registerBooksInBundle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerBooksInBundle:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean registerBooksInBundle(final com.apple.jobjc.foundation.NSBundle bundle){
			final com.apple.jobjc.Invoke.MsgSend registerBooksInBundle_IMetInst = get_registerBooksInBundle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerBooksInBundle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bundle);
		registerBooksInBundle_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeContextHelpForObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeContextHelpForObject_IMetInst(){
		return ((removeContextHelpForObject_IMetInst != null)
	? (removeContextHelpForObject_IMetInst)
	: (removeContextHelpForObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeContextHelpForObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeContextHelpForObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend removeContextHelpForObject_IMetInst = get_removeContextHelpForObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeContextHelpForObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		removeContextHelpForObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContextHelp_forObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContextHelp_forObject_IMetInst(){
		return ((setContextHelp_forObject_IMetInst != null)
	? (setContextHelp_forObject_IMetInst)
	: (setContextHelp_forObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContextHelp:forObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setContextHelp_forObject(final com.apple.jobjc.foundation.NSAttributedString attrString, final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend setContextHelp_forObject_IMetInst = get_setContextHelp_forObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContextHelp_forObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrString);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		setContextHelp_forObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showContextHelpForObject_locationHint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showContextHelpForObject_locationHint_IMetInst(){
		return ((showContextHelpForObject_locationHint_IMetInst != null)
	? (showContextHelpForObject_locationHint_IMetInst)
	: (showContextHelpForObject_locationHint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showContextHelpForObject:locationHint:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public boolean showContextHelpForObject_locationHint(final com.apple.jobjc.ID object, final com.apple.jobjc.foundation.NSPoint pt){
			final com.apple.jobjc.Invoke.MsgSend showContextHelpForObject_locationHint_IMetInst = get_showContextHelpForObject_locationHint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showContextHelpForObject_locationHint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, pt);
		showContextHelpForObject_locationHint_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
