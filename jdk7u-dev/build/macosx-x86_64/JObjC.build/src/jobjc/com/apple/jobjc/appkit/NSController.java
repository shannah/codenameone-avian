package com.apple.jobjc.appkit;

public  class NSController extends com.apple.jobjc.foundation.NSObject {
	public NSController(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSController(final NSController obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend commitEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_commitEditing_IMetInst(){
		return ((commitEditing_IMetInst != null)
	? (commitEditing_IMetInst)
	: (commitEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "commitEditing", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean commitEditing(){
			final com.apple.jobjc.Invoke.MsgSend commitEditing_IMetInst = get_commitEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		commitEditing_IMetInst.init(nativeBuffer, this);
		commitEditing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst(){
		return ((commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst != null)
	? (commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst)
	: (commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "commitEditingWithDelegate:didCommitSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void commitEditingWithDelegate_didCommitSelector_contextInfo(final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didCommitSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst = get_commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didCommitSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend discardEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_discardEditing_IMetInst(){
		return ((discardEditing_IMetInst != null)
	? (discardEditing_IMetInst)
	: (discardEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "discardEditing", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void discardEditing(){
			final com.apple.jobjc.Invoke.MsgSend discardEditing_IMetInst = get_discardEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		discardEditing_IMetInst.init(nativeBuffer, this);
		discardEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEditing_IMetInst(){
		return ((isEditing_IMetInst != null)
	? (isEditing_IMetInst)
	: (isEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEditing", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isEditing(){
			final com.apple.jobjc.Invoke.MsgSend isEditing_IMetInst = get_isEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEditing_IMetInst.init(nativeBuffer, this);
		isEditing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectDidBeginEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectDidBeginEditing_IMetInst(){
		return ((objectDidBeginEditing_IMetInst != null)
	? (objectDidBeginEditing_IMetInst)
	: (objectDidBeginEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectDidBeginEditing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void objectDidBeginEditing(final com.apple.jobjc.ID editor){
			final com.apple.jobjc.Invoke.MsgSend objectDidBeginEditing_IMetInst = get_objectDidBeginEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectDidBeginEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, editor);
		objectDidBeginEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend objectDidEndEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectDidEndEditing_IMetInst(){
		return ((objectDidEndEditing_IMetInst != null)
	? (objectDidEndEditing_IMetInst)
	: (objectDidEndEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectDidEndEditing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void objectDidEndEditing(final com.apple.jobjc.ID editor){
			final com.apple.jobjc.Invoke.MsgSend objectDidEndEditing_IMetInst = get_objectDidEndEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectDidEndEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, editor);
		objectDidEndEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

}
