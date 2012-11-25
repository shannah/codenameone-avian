package com.apple.jobjc.appkit;

public  class NSPredicateEditor extends com.apple.jobjc.appkit.NSRuleEditor {
	public NSPredicateEditor(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPredicateEditor(final NSPredicateEditor obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend rowTemplates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rowTemplates_IMetInst(){
		return ((rowTemplates_IMetInst != null)
	? (rowTemplates_IMetInst)
	: (rowTemplates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rowTemplates", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray rowTemplates(){
			final com.apple.jobjc.Invoke.MsgSend rowTemplates_IMetInst = get_rowTemplates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rowTemplates_IMetInst.init(nativeBuffer, this);
		rowTemplates_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setRowTemplates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRowTemplates_IMetInst(){
		return ((setRowTemplates_IMetInst != null)
	? (setRowTemplates_IMetInst)
	: (setRowTemplates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRowTemplates:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRowTemplates(final com.apple.jobjc.foundation.NSArray rowTemplates){
			final com.apple.jobjc.Invoke.MsgSend setRowTemplates_IMetInst = get_setRowTemplates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRowTemplates_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rowTemplates);
		setRowTemplates_IMetInst.invoke(nativeBuffer);
		
		
	}

}
