package com.apple.jobjc.appkit;

public  class NSNibConnector extends com.apple.jobjc.foundation.NSObject {
	public NSNibConnector(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSNibConnector(final NSNibConnector obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend destination_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_destination_IMetInst(){
		return ((destination_IMetInst != null)
	? (destination_IMetInst)
	: (destination_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "destination", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T destination(){
			final com.apple.jobjc.Invoke.MsgSend destination_IMetInst = get_destination_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		destination_IMetInst.init(nativeBuffer, this);
		destination_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend establishConnection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_establishConnection_IMetInst(){
		return ((establishConnection_IMetInst != null)
	? (establishConnection_IMetInst)
	: (establishConnection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "establishConnection", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void establishConnection(){
			final com.apple.jobjc.Invoke.MsgSend establishConnection_IMetInst = get_establishConnection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		establishConnection_IMetInst.init(nativeBuffer, this);
		establishConnection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend label_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_label_IMetInst(){
		return ((label_IMetInst != null)
	? (label_IMetInst)
	: (label_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "label", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString label(){
			final com.apple.jobjc.Invoke.MsgSend label_IMetInst = get_label_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		label_IMetInst.init(nativeBuffer, this);
		label_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceObject_withObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceObject_withObject_IMetInst(){
		return ((replaceObject_withObject_IMetInst != null)
	? (replaceObject_withObject_IMetInst)
	: (replaceObject_withObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceObject:withObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void replaceObject_withObject(final com.apple.jobjc.ID oldObject, final com.apple.jobjc.ID newObject){
			final com.apple.jobjc.Invoke.MsgSend replaceObject_withObject_IMetInst = get_replaceObject_withObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceObject_withObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, oldObject);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newObject);
		replaceObject_withObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDestination_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDestination_IMetInst(){
		return ((setDestination_IMetInst != null)
	? (setDestination_IMetInst)
	: (setDestination_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDestination:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDestination(final com.apple.jobjc.ID destination){
			final com.apple.jobjc.Invoke.MsgSend setDestination_IMetInst = get_setDestination_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDestination_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, destination);
		setDestination_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLabel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLabel_IMetInst(){
		return ((setLabel_IMetInst != null)
	? (setLabel_IMetInst)
	: (setLabel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLabel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setLabel(final com.apple.jobjc.foundation.NSString label){
			final com.apple.jobjc.Invoke.MsgSend setLabel_IMetInst = get_setLabel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLabel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, label);
		setLabel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSource_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSource_IMetInst(){
		return ((setSource_IMetInst != null)
	? (setSource_IMetInst)
	: (setSource_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSource:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSource(final com.apple.jobjc.ID source){
			final com.apple.jobjc.Invoke.MsgSend setSource_IMetInst = get_setSource_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSource_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, source);
		setSource_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend source_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_source_IMetInst(){
		return ((source_IMetInst != null)
	? (source_IMetInst)
	: (source_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "source", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T source(){
			final com.apple.jobjc.Invoke.MsgSend source_IMetInst = get_source_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		source_IMetInst.init(nativeBuffer, this);
		source_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
