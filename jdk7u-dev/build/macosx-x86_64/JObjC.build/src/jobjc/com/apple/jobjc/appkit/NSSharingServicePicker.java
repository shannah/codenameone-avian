package com.apple.jobjc.appkit;

public  class NSSharingServicePicker extends com.apple.jobjc.foundation.NSObject {
	public NSSharingServicePicker(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSSharingServicePicker(final NSSharingServicePicker obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
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

	private static com.apple.jobjc.Invoke.MsgSend initWithItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithItems_IMetInst(){
		return ((initWithItems_IMetInst != null)
	? (initWithItems_IMetInst)
	: (initWithItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithItems:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithItems(final com.apple.jobjc.foundation.NSArray items){
			final com.apple.jobjc.Invoke.MsgSend initWithItems_IMetInst = get_initWithItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, items);
		initWithItems_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID delegate){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showRelativeToRect_ofView_preferredEdge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showRelativeToRect_ofView_preferredEdge_IMetInst(){
		return ((showRelativeToRect_ofView_preferredEdge_IMetInst != null)
	? (showRelativeToRect_ofView_preferredEdge_IMetInst)
	: (showRelativeToRect_ofView_preferredEdge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showRelativeToRect:ofView:preferredEdge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder)));
	}

	 public void showRelativeToRect_ofView_preferredEdge(final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.appkit.NSView view, final long preferredEdge){
			final com.apple.jobjc.Invoke.MsgSend showRelativeToRect_ofView_preferredEdge_IMetInst = get_showRelativeToRect_ofView_preferredEdge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showRelativeToRect_ofView_preferredEdge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder.push(nativeBuffer, preferredEdge);
		showRelativeToRect_ofView_preferredEdge_IMetInst.invoke(nativeBuffer);
		
		
	}

}
