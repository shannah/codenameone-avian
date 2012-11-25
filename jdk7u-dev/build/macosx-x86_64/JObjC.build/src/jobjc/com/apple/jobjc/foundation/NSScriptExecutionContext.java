package com.apple.jobjc.foundation;

public  class NSScriptExecutionContext extends com.apple.jobjc.foundation.NSObject {
	public NSScriptExecutionContext(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSScriptExecutionContext(final NSScriptExecutionContext obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend objectBeingTested_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectBeingTested_IMetInst(){
		return ((objectBeingTested_IMetInst != null)
	? (objectBeingTested_IMetInst)
	: (objectBeingTested_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectBeingTested", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectBeingTested(){
			final com.apple.jobjc.Invoke.MsgSend objectBeingTested_IMetInst = get_objectBeingTested_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectBeingTested_IMetInst.init(nativeBuffer, this);
		objectBeingTested_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeContainerObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeContainerObject_IMetInst(){
		return ((rangeContainerObject_IMetInst != null)
	? (rangeContainerObject_IMetInst)
	: (rangeContainerObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeContainerObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T rangeContainerObject(){
			final com.apple.jobjc.Invoke.MsgSend rangeContainerObject_IMetInst = get_rangeContainerObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeContainerObject_IMetInst.init(nativeBuffer, this);
		rangeContainerObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setObjectBeingTested_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setObjectBeingTested_IMetInst(){
		return ((setObjectBeingTested_IMetInst != null)
	? (setObjectBeingTested_IMetInst)
	: (setObjectBeingTested_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setObjectBeingTested:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setObjectBeingTested(final com.apple.jobjc.ID obj){
			final com.apple.jobjc.Invoke.MsgSend setObjectBeingTested_IMetInst = get_setObjectBeingTested_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setObjectBeingTested_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		setObjectBeingTested_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRangeContainerObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRangeContainerObject_IMetInst(){
		return ((setRangeContainerObject_IMetInst != null)
	? (setRangeContainerObject_IMetInst)
	: (setRangeContainerObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRangeContainerObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRangeContainerObject(final com.apple.jobjc.ID obj){
			final com.apple.jobjc.Invoke.MsgSend setRangeContainerObject_IMetInst = get_setRangeContainerObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRangeContainerObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		setRangeContainerObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTopLevelObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTopLevelObject_IMetInst(){
		return ((setTopLevelObject_IMetInst != null)
	? (setTopLevelObject_IMetInst)
	: (setTopLevelObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTopLevelObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTopLevelObject(final com.apple.jobjc.ID obj){
			final com.apple.jobjc.Invoke.MsgSend setTopLevelObject_IMetInst = get_setTopLevelObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTopLevelObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		setTopLevelObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend topLevelObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_topLevelObject_IMetInst(){
		return ((topLevelObject_IMetInst != null)
	? (topLevelObject_IMetInst)
	: (topLevelObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "topLevelObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T topLevelObject(){
			final com.apple.jobjc.Invoke.MsgSend topLevelObject_IMetInst = get_topLevelObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		topLevelObject_IMetInst.init(nativeBuffer, this);
		topLevelObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
