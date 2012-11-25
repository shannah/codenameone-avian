package com.apple.jobjc.appkit;

public  class NSPageController extends com.apple.jobjc.appkit.NSViewController {
	public NSPageController(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPageController(final NSPageController obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend arrangedObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arrangedObjects_IMetInst(){
		return ((arrangedObjects_IMetInst != null)
	? (arrangedObjects_IMetInst)
	: (arrangedObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arrangedObjects", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray arrangedObjects(){
			final com.apple.jobjc.Invoke.MsgSend arrangedObjects_IMetInst = get_arrangedObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arrangedObjects_IMetInst.init(nativeBuffer, this);
		arrangedObjects_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend completeTransition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_completeTransition_IMetInst(){
		return ((completeTransition_IMetInst != null)
	? (completeTransition_IMetInst)
	: (completeTransition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "completeTransition", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void completeTransition(){
			final com.apple.jobjc.Invoke.MsgSend completeTransition_IMetInst = get_completeTransition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		completeTransition_IMetInst.init(nativeBuffer, this);
		completeTransition_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend navigateBack_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_navigateBack_IMetInst(){
		return ((navigateBack_IMetInst != null)
	? (navigateBack_IMetInst)
	: (navigateBack_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "navigateBack:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void navigateBack(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend navigateBack_IMetInst = get_navigateBack_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		navigateBack_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		navigateBack_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend navigateForward_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_navigateForward_IMetInst(){
		return ((navigateForward_IMetInst != null)
	? (navigateForward_IMetInst)
	: (navigateForward_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "navigateForward:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void navigateForward(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend navigateForward_IMetInst = get_navigateForward_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		navigateForward_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		navigateForward_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend navigateForwardToObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_navigateForwardToObject_IMetInst(){
		return ((navigateForwardToObject_IMetInst != null)
	? (navigateForwardToObject_IMetInst)
	: (navigateForwardToObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "navigateForwardToObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void navigateForwardToObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend navigateForwardToObject_IMetInst = get_navigateForwardToObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		navigateForwardToObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		navigateForwardToObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedIndex_IMetInst(){
		return ((selectedIndex_IMetInst != null)
	? (selectedIndex_IMetInst)
	: (selectedIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedIndex", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long selectedIndex(){
			final com.apple.jobjc.Invoke.MsgSend selectedIndex_IMetInst = get_selectedIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedIndex_IMetInst.init(nativeBuffer, this);
		selectedIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedViewController_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedViewController_IMetInst(){
		return ((selectedViewController_IMetInst != null)
	? (selectedViewController_IMetInst)
	: (selectedViewController_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedViewController", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSViewController selectedViewController(){
			final com.apple.jobjc.Invoke.MsgSend selectedViewController_IMetInst = get_selectedViewController_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedViewController_IMetInst.init(nativeBuffer, this);
		selectedViewController_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSViewController returnValue = (com.apple.jobjc.appkit.NSViewController) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setArrangedObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setArrangedObjects_IMetInst(){
		return ((setArrangedObjects_IMetInst != null)
	? (setArrangedObjects_IMetInst)
	: (setArrangedObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setArrangedObjects:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setArrangedObjects(final com.apple.jobjc.foundation.NSArray arrangedObjects){
			final com.apple.jobjc.Invoke.MsgSend setArrangedObjects_IMetInst = get_setArrangedObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setArrangedObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, arrangedObjects);
		setArrangedObjects_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setSelectedIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectedIndex_IMetInst(){
		return ((setSelectedIndex_IMetInst != null)
	? (setSelectedIndex_IMetInst)
	: (setSelectedIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectedIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setSelectedIndex(final long selectedIndex){
			final com.apple.jobjc.Invoke.MsgSend setSelectedIndex_IMetInst = get_setSelectedIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectedIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, selectedIndex);
		setSelectedIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTransitionStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTransitionStyle_IMetInst(){
		return ((setTransitionStyle_IMetInst != null)
	? (setTransitionStyle_IMetInst)
	: (setTransitionStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTransitionStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setTransitionStyle(final long transitionStyle){
			final com.apple.jobjc.Invoke.MsgSend setTransitionStyle_IMetInst = get_setTransitionStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTransitionStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, transitionStyle);
		setTransitionStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend takeSelectedIndexFrom_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_takeSelectedIndexFrom_IMetInst(){
		return ((takeSelectedIndexFrom_IMetInst != null)
	? (takeSelectedIndexFrom_IMetInst)
	: (takeSelectedIndexFrom_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "takeSelectedIndexFrom:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void takeSelectedIndexFrom(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend takeSelectedIndexFrom_IMetInst = get_takeSelectedIndexFrom_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		takeSelectedIndexFrom_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		takeSelectedIndexFrom_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend transitionStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_transitionStyle_IMetInst(){
		return ((transitionStyle_IMetInst != null)
	? (transitionStyle_IMetInst)
	: (transitionStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "transitionStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long transitionStyle(){
			final com.apple.jobjc.Invoke.MsgSend transitionStyle_IMetInst = get_transitionStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		transitionStyle_IMetInst.init(nativeBuffer, this);
		transitionStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
