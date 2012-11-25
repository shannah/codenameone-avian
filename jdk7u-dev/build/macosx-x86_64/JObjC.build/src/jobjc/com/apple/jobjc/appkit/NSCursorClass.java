package com.apple.jobjc.appkit;

public  class NSCursorClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSCursorClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSCursorClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSCursorClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend IBeamCursor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_IBeamCursor_CMetInst(){
		return ((IBeamCursor_CMetInst != null)
	? (IBeamCursor_CMetInst)
	: (IBeamCursor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "IBeamCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor IBeamCursor(){
			final com.apple.jobjc.Invoke.MsgSend IBeamCursor_CMetInst = get_IBeamCursor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		IBeamCursor_CMetInst.init(nativeBuffer, this);
		IBeamCursor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend IBeamCursorForVerticalLayout_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_IBeamCursorForVerticalLayout_CMetInst(){
		return ((IBeamCursorForVerticalLayout_CMetInst != null)
	? (IBeamCursorForVerticalLayout_CMetInst)
	: (IBeamCursorForVerticalLayout_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "IBeamCursorForVerticalLayout", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor IBeamCursorForVerticalLayout(){
			final com.apple.jobjc.Invoke.MsgSend IBeamCursorForVerticalLayout_CMetInst = get_IBeamCursorForVerticalLayout_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		IBeamCursorForVerticalLayout_CMetInst.init(nativeBuffer, this);
		IBeamCursorForVerticalLayout_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend arrowCursor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arrowCursor_CMetInst(){
		return ((arrowCursor_CMetInst != null)
	? (arrowCursor_CMetInst)
	: (arrowCursor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arrowCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor arrowCursor(){
			final com.apple.jobjc.Invoke.MsgSend arrowCursor_CMetInst = get_arrowCursor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arrowCursor_CMetInst.init(nativeBuffer, this);
		arrowCursor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend closedHandCursor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_closedHandCursor_CMetInst(){
		return ((closedHandCursor_CMetInst != null)
	? (closedHandCursor_CMetInst)
	: (closedHandCursor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "closedHandCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor closedHandCursor(){
			final com.apple.jobjc.Invoke.MsgSend closedHandCursor_CMetInst = get_closedHandCursor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		closedHandCursor_CMetInst.init(nativeBuffer, this);
		closedHandCursor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contextualMenuCursor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contextualMenuCursor_CMetInst(){
		return ((contextualMenuCursor_CMetInst != null)
	? (contextualMenuCursor_CMetInst)
	: (contextualMenuCursor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contextualMenuCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor contextualMenuCursor(){
			final com.apple.jobjc.Invoke.MsgSend contextualMenuCursor_CMetInst = get_contextualMenuCursor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contextualMenuCursor_CMetInst.init(nativeBuffer, this);
		contextualMenuCursor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend crosshairCursor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_crosshairCursor_CMetInst(){
		return ((crosshairCursor_CMetInst != null)
	? (crosshairCursor_CMetInst)
	: (crosshairCursor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "crosshairCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor crosshairCursor(){
			final com.apple.jobjc.Invoke.MsgSend crosshairCursor_CMetInst = get_crosshairCursor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		crosshairCursor_CMetInst.init(nativeBuffer, this);
		crosshairCursor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentCursor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentCursor_CMetInst(){
		return ((currentCursor_CMetInst != null)
	? (currentCursor_CMetInst)
	: (currentCursor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor currentCursor(){
			final com.apple.jobjc.Invoke.MsgSend currentCursor_CMetInst = get_currentCursor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentCursor_CMetInst.init(nativeBuffer, this);
		currentCursor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentSystemCursor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentSystemCursor_CMetInst(){
		return ((currentSystemCursor_CMetInst != null)
	? (currentSystemCursor_CMetInst)
	: (currentSystemCursor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentSystemCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor currentSystemCursor(){
			final com.apple.jobjc.Invoke.MsgSend currentSystemCursor_CMetInst = get_currentSystemCursor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentSystemCursor_CMetInst.init(nativeBuffer, this);
		currentSystemCursor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend disappearingItemCursor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_disappearingItemCursor_CMetInst(){
		return ((disappearingItemCursor_CMetInst != null)
	? (disappearingItemCursor_CMetInst)
	: (disappearingItemCursor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "disappearingItemCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor disappearingItemCursor(){
			final com.apple.jobjc.Invoke.MsgSend disappearingItemCursor_CMetInst = get_disappearingItemCursor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		disappearingItemCursor_CMetInst.init(nativeBuffer, this);
		disappearingItemCursor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dragCopyCursor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dragCopyCursor_CMetInst(){
		return ((dragCopyCursor_CMetInst != null)
	? (dragCopyCursor_CMetInst)
	: (dragCopyCursor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dragCopyCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor dragCopyCursor(){
			final com.apple.jobjc.Invoke.MsgSend dragCopyCursor_CMetInst = get_dragCopyCursor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dragCopyCursor_CMetInst.init(nativeBuffer, this);
		dragCopyCursor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dragLinkCursor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dragLinkCursor_CMetInst(){
		return ((dragLinkCursor_CMetInst != null)
	? (dragLinkCursor_CMetInst)
	: (dragLinkCursor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dragLinkCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor dragLinkCursor(){
			final com.apple.jobjc.Invoke.MsgSend dragLinkCursor_CMetInst = get_dragLinkCursor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dragLinkCursor_CMetInst.init(nativeBuffer, this);
		dragLinkCursor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hide_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hide_CMetInst(){
		return ((hide_CMetInst != null)
	? (hide_CMetInst)
	: (hide_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hide", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void hide(){
			final com.apple.jobjc.Invoke.MsgSend hide_CMetInst = get_hide_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hide_CMetInst.init(nativeBuffer, this);
		hide_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend openHandCursor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openHandCursor_CMetInst(){
		return ((openHandCursor_CMetInst != null)
	? (openHandCursor_CMetInst)
	: (openHandCursor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openHandCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor openHandCursor(){
			final com.apple.jobjc.Invoke.MsgSend openHandCursor_CMetInst = get_openHandCursor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openHandCursor_CMetInst.init(nativeBuffer, this);
		openHandCursor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend operationNotAllowedCursor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_operationNotAllowedCursor_CMetInst(){
		return ((operationNotAllowedCursor_CMetInst != null)
	? (operationNotAllowedCursor_CMetInst)
	: (operationNotAllowedCursor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "operationNotAllowedCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor operationNotAllowedCursor(){
			final com.apple.jobjc.Invoke.MsgSend operationNotAllowedCursor_CMetInst = get_operationNotAllowedCursor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		operationNotAllowedCursor_CMetInst.init(nativeBuffer, this);
		operationNotAllowedCursor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pointingHandCursor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pointingHandCursor_CMetInst(){
		return ((pointingHandCursor_CMetInst != null)
	? (pointingHandCursor_CMetInst)
	: (pointingHandCursor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pointingHandCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor pointingHandCursor(){
			final com.apple.jobjc.Invoke.MsgSend pointingHandCursor_CMetInst = get_pointingHandCursor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pointingHandCursor_CMetInst.init(nativeBuffer, this);
		pointingHandCursor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pop_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pop_CMetInst(){
		return ((pop_CMetInst != null)
	? (pop_CMetInst)
	: (pop_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pop", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void pop(){
			final com.apple.jobjc.Invoke.MsgSend pop_CMetInst = get_pop_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pop_CMetInst.init(nativeBuffer, this);
		pop_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend resizeDownCursor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resizeDownCursor_CMetInst(){
		return ((resizeDownCursor_CMetInst != null)
	? (resizeDownCursor_CMetInst)
	: (resizeDownCursor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resizeDownCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor resizeDownCursor(){
			final com.apple.jobjc.Invoke.MsgSend resizeDownCursor_CMetInst = get_resizeDownCursor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resizeDownCursor_CMetInst.init(nativeBuffer, this);
		resizeDownCursor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resizeLeftCursor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resizeLeftCursor_CMetInst(){
		return ((resizeLeftCursor_CMetInst != null)
	? (resizeLeftCursor_CMetInst)
	: (resizeLeftCursor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resizeLeftCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor resizeLeftCursor(){
			final com.apple.jobjc.Invoke.MsgSend resizeLeftCursor_CMetInst = get_resizeLeftCursor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resizeLeftCursor_CMetInst.init(nativeBuffer, this);
		resizeLeftCursor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resizeLeftRightCursor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resizeLeftRightCursor_CMetInst(){
		return ((resizeLeftRightCursor_CMetInst != null)
	? (resizeLeftRightCursor_CMetInst)
	: (resizeLeftRightCursor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resizeLeftRightCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor resizeLeftRightCursor(){
			final com.apple.jobjc.Invoke.MsgSend resizeLeftRightCursor_CMetInst = get_resizeLeftRightCursor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resizeLeftRightCursor_CMetInst.init(nativeBuffer, this);
		resizeLeftRightCursor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resizeRightCursor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resizeRightCursor_CMetInst(){
		return ((resizeRightCursor_CMetInst != null)
	? (resizeRightCursor_CMetInst)
	: (resizeRightCursor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resizeRightCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor resizeRightCursor(){
			final com.apple.jobjc.Invoke.MsgSend resizeRightCursor_CMetInst = get_resizeRightCursor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resizeRightCursor_CMetInst.init(nativeBuffer, this);
		resizeRightCursor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resizeUpCursor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resizeUpCursor_CMetInst(){
		return ((resizeUpCursor_CMetInst != null)
	? (resizeUpCursor_CMetInst)
	: (resizeUpCursor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resizeUpCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor resizeUpCursor(){
			final com.apple.jobjc.Invoke.MsgSend resizeUpCursor_CMetInst = get_resizeUpCursor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resizeUpCursor_CMetInst.init(nativeBuffer, this);
		resizeUpCursor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resizeUpDownCursor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resizeUpDownCursor_CMetInst(){
		return ((resizeUpDownCursor_CMetInst != null)
	? (resizeUpDownCursor_CMetInst)
	: (resizeUpDownCursor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resizeUpDownCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor resizeUpDownCursor(){
			final com.apple.jobjc.Invoke.MsgSend resizeUpDownCursor_CMetInst = get_resizeUpDownCursor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resizeUpDownCursor_CMetInst.init(nativeBuffer, this);
		resizeUpDownCursor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setHiddenUntilMouseMoves_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHiddenUntilMouseMoves_CMetInst(){
		return ((setHiddenUntilMouseMoves_CMetInst != null)
	? (setHiddenUntilMouseMoves_CMetInst)
	: (setHiddenUntilMouseMoves_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHiddenUntilMouseMoves:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHiddenUntilMouseMoves(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setHiddenUntilMouseMoves_CMetInst = get_setHiddenUntilMouseMoves_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHiddenUntilMouseMoves_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setHiddenUntilMouseMoves_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unhide_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unhide_CMetInst(){
		return ((unhide_CMetInst != null)
	? (unhide_CMetInst)
	: (unhide_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unhide", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void unhide(){
			final com.apple.jobjc.Invoke.MsgSend unhide_CMetInst = get_unhide_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unhide_CMetInst.init(nativeBuffer, this);
		unhide_CMetInst.invoke(nativeBuffer);
		
		
	}

}
