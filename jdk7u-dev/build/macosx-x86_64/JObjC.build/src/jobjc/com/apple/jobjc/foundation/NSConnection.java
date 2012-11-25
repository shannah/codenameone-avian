package com.apple.jobjc.foundation;

public  class NSConnection extends com.apple.jobjc.foundation.NSObject {
	public NSConnection(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSConnection(final NSConnection obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addRequestMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addRequestMode_IMetInst(){
		return ((addRequestMode_IMetInst != null)
	? (addRequestMode_IMetInst)
	: (addRequestMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addRequestMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addRequestMode(final com.apple.jobjc.foundation.NSString rmode){
			final com.apple.jobjc.Invoke.MsgSend addRequestMode_IMetInst = get_addRequestMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addRequestMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rmode);
		addRequestMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addRunLoop_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addRunLoop_IMetInst(){
		return ((addRunLoop_IMetInst != null)
	? (addRunLoop_IMetInst)
	: (addRunLoop_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addRunLoop:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addRunLoop(final com.apple.jobjc.foundation.NSRunLoop runloop){
			final com.apple.jobjc.Invoke.MsgSend addRunLoop_IMetInst = get_addRunLoop_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addRunLoop_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, runloop);
		addRunLoop_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend dispatchWithComponents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dispatchWithComponents_IMetInst(){
		return ((dispatchWithComponents_IMetInst != null)
	? (dispatchWithComponents_IMetInst)
	: (dispatchWithComponents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dispatchWithComponents:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void dispatchWithComponents(final com.apple.jobjc.foundation.NSArray components){
			final com.apple.jobjc.Invoke.MsgSend dispatchWithComponents_IMetInst = get_dispatchWithComponents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dispatchWithComponents_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, components);
		dispatchWithComponents_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enableMultipleThreads_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enableMultipleThreads_IMetInst(){
		return ((enableMultipleThreads_IMetInst != null)
	? (enableMultipleThreads_IMetInst)
	: (enableMultipleThreads_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enableMultipleThreads", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void enableMultipleThreads(){
			final com.apple.jobjc.Invoke.MsgSend enableMultipleThreads_IMetInst = get_enableMultipleThreads_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enableMultipleThreads_IMetInst.init(nativeBuffer, this);
		enableMultipleThreads_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend independentConversationQueueing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_independentConversationQueueing_IMetInst(){
		return ((independentConversationQueueing_IMetInst != null)
	? (independentConversationQueueing_IMetInst)
	: (independentConversationQueueing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "independentConversationQueueing", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean independentConversationQueueing(){
			final com.apple.jobjc.Invoke.MsgSend independentConversationQueueing_IMetInst = get_independentConversationQueueing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		independentConversationQueueing_IMetInst.init(nativeBuffer, this);
		independentConversationQueueing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithReceivePort_sendPort_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithReceivePort_sendPort_IMetInst(){
		return ((initWithReceivePort_sendPort_IMetInst != null)
	? (initWithReceivePort_sendPort_IMetInst)
	: (initWithReceivePort_sendPort_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithReceivePort:sendPort:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithReceivePort_sendPort(final com.apple.jobjc.foundation.NSPort receivePort, final com.apple.jobjc.foundation.NSPort sendPort){
			final com.apple.jobjc.Invoke.MsgSend initWithReceivePort_sendPort_IMetInst = get_initWithReceivePort_sendPort_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithReceivePort_sendPort_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, receivePort);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sendPort);
		initWithReceivePort_sendPort_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidate_IMetInst(){
		return ((invalidate_IMetInst != null)
	? (invalidate_IMetInst)
	: (invalidate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidate", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void invalidate(){
			final com.apple.jobjc.Invoke.MsgSend invalidate_IMetInst = get_invalidate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidate_IMetInst.init(nativeBuffer, this);
		invalidate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isValid_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isValid_IMetInst(){
		return ((isValid_IMetInst != null)
	? (isValid_IMetInst)
	: (isValid_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isValid", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isValid(){
			final com.apple.jobjc.Invoke.MsgSend isValid_IMetInst = get_isValid_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isValid_IMetInst.init(nativeBuffer, this);
		isValid_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localObjects_IMetInst(){
		return ((localObjects_IMetInst != null)
	? (localObjects_IMetInst)
	: (localObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localObjects", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray localObjects(){
			final com.apple.jobjc.Invoke.MsgSend localObjects_IMetInst = get_localObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localObjects_IMetInst.init(nativeBuffer, this);
		localObjects_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend multipleThreadsEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_multipleThreadsEnabled_IMetInst(){
		return ((multipleThreadsEnabled_IMetInst != null)
	? (multipleThreadsEnabled_IMetInst)
	: (multipleThreadsEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "multipleThreadsEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean multipleThreadsEnabled(){
			final com.apple.jobjc.Invoke.MsgSend multipleThreadsEnabled_IMetInst = get_multipleThreadsEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		multipleThreadsEnabled_IMetInst.init(nativeBuffer, this);
		multipleThreadsEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend receivePort_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_receivePort_IMetInst(){
		return ((receivePort_IMetInst != null)
	? (receivePort_IMetInst)
	: (receivePort_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "receivePort", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPort receivePort(){
			final com.apple.jobjc.Invoke.MsgSend receivePort_IMetInst = get_receivePort_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		receivePort_IMetInst.init(nativeBuffer, this);
		receivePort_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPort returnValue = (com.apple.jobjc.foundation.NSPort) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend registerName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerName_IMetInst(){
		return ((registerName_IMetInst != null)
	? (registerName_IMetInst)
	: (registerName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerName:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean registerName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend registerName_IMetInst = get_registerName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		registerName_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend registerName_withNameServer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerName_withNameServer_IMetInst(){
		return ((registerName_withNameServer_IMetInst != null)
	? (registerName_withNameServer_IMetInst)
	: (registerName_withNameServer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerName:withNameServer:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean registerName_withNameServer(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSPortNameServer server){
			final com.apple.jobjc.Invoke.MsgSend registerName_withNameServer_IMetInst = get_registerName_withNameServer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerName_withNameServer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, server);
		registerName_withNameServer_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend remoteObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_remoteObjects_IMetInst(){
		return ((remoteObjects_IMetInst != null)
	? (remoteObjects_IMetInst)
	: (remoteObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "remoteObjects", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray remoteObjects(){
			final com.apple.jobjc.Invoke.MsgSend remoteObjects_IMetInst = get_remoteObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		remoteObjects_IMetInst.init(nativeBuffer, this);
		remoteObjects_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeRequestMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeRequestMode_IMetInst(){
		return ((removeRequestMode_IMetInst != null)
	? (removeRequestMode_IMetInst)
	: (removeRequestMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeRequestMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeRequestMode(final com.apple.jobjc.foundation.NSString rmode){
			final com.apple.jobjc.Invoke.MsgSend removeRequestMode_IMetInst = get_removeRequestMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeRequestMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rmode);
		removeRequestMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeRunLoop_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeRunLoop_IMetInst(){
		return ((removeRunLoop_IMetInst != null)
	? (removeRunLoop_IMetInst)
	: (removeRunLoop_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeRunLoop:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeRunLoop(final com.apple.jobjc.foundation.NSRunLoop runloop){
			final com.apple.jobjc.Invoke.MsgSend removeRunLoop_IMetInst = get_removeRunLoop_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeRunLoop_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, runloop);
		removeRunLoop_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replyTimeout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replyTimeout_IMetInst(){
		return ((replyTimeout_IMetInst != null)
	? (replyTimeout_IMetInst)
	: (replyTimeout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replyTimeout", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double replyTimeout(){
			final com.apple.jobjc.Invoke.MsgSend replyTimeout_IMetInst = get_replyTimeout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replyTimeout_IMetInst.init(nativeBuffer, this);
		replyTimeout_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend requestModes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_requestModes_IMetInst(){
		return ((requestModes_IMetInst != null)
	? (requestModes_IMetInst)
	: (requestModes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "requestModes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray requestModes(){
			final com.apple.jobjc.Invoke.MsgSend requestModes_IMetInst = get_requestModes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		requestModes_IMetInst.init(nativeBuffer, this);
		requestModes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend requestTimeout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_requestTimeout_IMetInst(){
		return ((requestTimeout_IMetInst != null)
	? (requestTimeout_IMetInst)
	: (requestTimeout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "requestTimeout", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double requestTimeout(){
			final com.apple.jobjc.Invoke.MsgSend requestTimeout_IMetInst = get_requestTimeout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		requestTimeout_IMetInst.init(nativeBuffer, this);
		requestTimeout_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rootObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rootObject_IMetInst(){
		return ((rootObject_IMetInst != null)
	? (rootObject_IMetInst)
	: (rootObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rootObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T rootObject(){
			final com.apple.jobjc.Invoke.MsgSend rootObject_IMetInst = get_rootObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rootObject_IMetInst.init(nativeBuffer, this);
		rootObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rootProxy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rootProxy_IMetInst(){
		return ((rootProxy_IMetInst != null)
	? (rootProxy_IMetInst)
	: (rootProxy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rootProxy", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDistantObject rootProxy(){
			final com.apple.jobjc.Invoke.MsgSend rootProxy_IMetInst = get_rootProxy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rootProxy_IMetInst.init(nativeBuffer, this);
		rootProxy_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDistantObject returnValue = (com.apple.jobjc.foundation.NSDistantObject) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend runInNewThread_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runInNewThread_IMetInst(){
		return ((runInNewThread_IMetInst != null)
	? (runInNewThread_IMetInst)
	: (runInNewThread_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runInNewThread", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void runInNewThread(){
			final com.apple.jobjc.Invoke.MsgSend runInNewThread_IMetInst = get_runInNewThread_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runInNewThread_IMetInst.init(nativeBuffer, this);
		runInNewThread_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sendPort_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendPort_IMetInst(){
		return ((sendPort_IMetInst != null)
	? (sendPort_IMetInst)
	: (sendPort_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendPort", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPort sendPort(){
			final com.apple.jobjc.Invoke.MsgSend sendPort_IMetInst = get_sendPort_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendPort_IMetInst.init(nativeBuffer, this);
		sendPort_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPort returnValue = (com.apple.jobjc.foundation.NSPort) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIndependentConversationQueueing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIndependentConversationQueueing_IMetInst(){
		return ((setIndependentConversationQueueing_IMetInst != null)
	? (setIndependentConversationQueueing_IMetInst)
	: (setIndependentConversationQueueing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIndependentConversationQueueing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setIndependentConversationQueueing(final boolean yorn){
			final com.apple.jobjc.Invoke.MsgSend setIndependentConversationQueueing_IMetInst = get_setIndependentConversationQueueing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIndependentConversationQueueing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, yorn);
		setIndependentConversationQueueing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setReplyTimeout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setReplyTimeout_IMetInst(){
		return ((setReplyTimeout_IMetInst != null)
	? (setReplyTimeout_IMetInst)
	: (setReplyTimeout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setReplyTimeout:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setReplyTimeout(final double ti){
			final com.apple.jobjc.Invoke.MsgSend setReplyTimeout_IMetInst = get_setReplyTimeout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setReplyTimeout_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, ti);
		setReplyTimeout_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRequestTimeout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRequestTimeout_IMetInst(){
		return ((setRequestTimeout_IMetInst != null)
	? (setRequestTimeout_IMetInst)
	: (setRequestTimeout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRequestTimeout:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setRequestTimeout(final double ti){
			final com.apple.jobjc.Invoke.MsgSend setRequestTimeout_IMetInst = get_setRequestTimeout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRequestTimeout_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, ti);
		setRequestTimeout_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRootObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRootObject_IMetInst(){
		return ((setRootObject_IMetInst != null)
	? (setRootObject_IMetInst)
	: (setRootObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRootObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRootObject(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setRootObject_IMetInst = get_setRootObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRootObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setRootObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend statistics_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_statistics_IMetInst(){
		return ((statistics_IMetInst != null)
	? (statistics_IMetInst)
	: (statistics_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "statistics", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary statistics(){
			final com.apple.jobjc.Invoke.MsgSend statistics_IMetInst = get_statistics_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		statistics_IMetInst.init(nativeBuffer, this);
		statistics_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
