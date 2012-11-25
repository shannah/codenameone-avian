package com.apple.jobjc.foundation;

public  class NSXPCConnection extends com.apple.jobjc.foundation.NSObject {
	public NSXPCConnection(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSXPCConnection(final NSXPCConnection obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend auditSessionIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_auditSessionIdentifier_IMetInst(){
		return ((auditSessionIdentifier_IMetInst != null)
	? (auditSessionIdentifier_IMetInst)
	: (auditSessionIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "auditSessionIdentifier", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int auditSessionIdentifier(){
			final com.apple.jobjc.Invoke.MsgSend auditSessionIdentifier_IMetInst = get_auditSessionIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		auditSessionIdentifier_IMetInst.init(nativeBuffer, this);
		auditSessionIdentifier_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend effectiveGroupIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_effectiveGroupIdentifier_IMetInst(){
		return ((effectiveGroupIdentifier_IMetInst != null)
	? (effectiveGroupIdentifier_IMetInst)
	: (effectiveGroupIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "effectiveGroupIdentifier", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public int effectiveGroupIdentifier(){
			final com.apple.jobjc.Invoke.MsgSend effectiveGroupIdentifier_IMetInst = get_effectiveGroupIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		effectiveGroupIdentifier_IMetInst.init(nativeBuffer, this);
		effectiveGroupIdentifier_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend effectiveUserIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_effectiveUserIdentifier_IMetInst(){
		return ((effectiveUserIdentifier_IMetInst != null)
	? (effectiveUserIdentifier_IMetInst)
	: (effectiveUserIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "effectiveUserIdentifier", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public int effectiveUserIdentifier(){
			final com.apple.jobjc.Invoke.MsgSend effectiveUserIdentifier_IMetInst = get_effectiveUserIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		effectiveUserIdentifier_IMetInst.init(nativeBuffer, this);
		effectiveUserIdentifier_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend endpoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_endpoint_IMetInst(){
		return ((endpoint_IMetInst != null)
	? (endpoint_IMetInst)
	: (endpoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "endpoint", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* NSXPCListenerEndpoint* (@, @) */ endpoint(){
			final com.apple.jobjc.Invoke.MsgSend endpoint_IMetInst = get_endpoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		endpoint_IMetInst.init(nativeBuffer, this);
		endpoint_IMetInst.invoke(nativeBuffer);
		final Object /* NSXPCListenerEndpoint* (@, @) */ returnValue = (Object /* NSXPCListenerEndpoint* (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend exportedInterface_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_exportedInterface_IMetInst(){
		return ((exportedInterface_IMetInst != null)
	? (exportedInterface_IMetInst)
	: (exportedInterface_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "exportedInterface", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXPCInterface exportedInterface(){
			final com.apple.jobjc.Invoke.MsgSend exportedInterface_IMetInst = get_exportedInterface_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		exportedInterface_IMetInst.init(nativeBuffer, this);
		exportedInterface_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXPCInterface returnValue = (com.apple.jobjc.foundation.NSXPCInterface) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend exportedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_exportedObject_IMetInst(){
		return ((exportedObject_IMetInst != null)
	? (exportedObject_IMetInst)
	: (exportedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "exportedObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T exportedObject(){
			final com.apple.jobjc.Invoke.MsgSend exportedObject_IMetInst = get_exportedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		exportedObject_IMetInst.init(nativeBuffer, this);
		exportedObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithListenerEndpoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithListenerEndpoint_IMetInst(){
		return ((initWithListenerEndpoint_IMetInst != null)
	? (initWithListenerEndpoint_IMetInst)
	: (initWithListenerEndpoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithListenerEndpoint:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithListenerEndpoint(final Object /* NSXPCListenerEndpoint* (@, @) */ endpoint){
			final com.apple.jobjc.Invoke.MsgSend initWithListenerEndpoint_IMetInst = get_initWithListenerEndpoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithListenerEndpoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, endpoint);
		initWithListenerEndpoint_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithMachServiceName_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithMachServiceName_options_IMetInst(){
		return ((initWithMachServiceName_options_IMetInst != null)
	? (initWithMachServiceName_options_IMetInst)
	: (initWithMachServiceName_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithMachServiceName:options:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithMachServiceName_options(final com.apple.jobjc.foundation.NSString name, final long options){
			final com.apple.jobjc.Invoke.MsgSend initWithMachServiceName_options_IMetInst = get_initWithMachServiceName_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithMachServiceName_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		initWithMachServiceName_options_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithServiceName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithServiceName_IMetInst(){
		return ((initWithServiceName_IMetInst != null)
	? (initWithServiceName_IMetInst)
	: (initWithServiceName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithServiceName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithServiceName(final com.apple.jobjc.foundation.NSString serviceName){
			final com.apple.jobjc.Invoke.MsgSend initWithServiceName_IMetInst = get_initWithServiceName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithServiceName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, serviceName);
		initWithServiceName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend interruptionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_interruptionHandler_IMetInst(){
		return ((interruptionHandler_IMetInst != null)
	? (interruptionHandler_IMetInst)
	: (interruptionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "interruptionHandler", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* void(^)(void) (@, @) */ interruptionHandler(){
			final com.apple.jobjc.Invoke.MsgSend interruptionHandler_IMetInst = get_interruptionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		interruptionHandler_IMetInst.init(nativeBuffer, this);
		interruptionHandler_IMetInst.invoke(nativeBuffer);
		final Object /* void(^)(void) (@, @) */ returnValue = (Object /* void(^)(void) (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend invalidationHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidationHandler_IMetInst(){
		return ((invalidationHandler_IMetInst != null)
	? (invalidationHandler_IMetInst)
	: (invalidationHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidationHandler", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* void(^)(void) (@, @) */ invalidationHandler(){
			final com.apple.jobjc.Invoke.MsgSend invalidationHandler_IMetInst = get_invalidationHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidationHandler_IMetInst.init(nativeBuffer, this);
		invalidationHandler_IMetInst.invoke(nativeBuffer);
		final Object /* void(^)(void) (@, @) */ returnValue = (Object /* void(^)(void) (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend processIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_processIdentifier_IMetInst(){
		return ((processIdentifier_IMetInst != null)
	? (processIdentifier_IMetInst)
	: (processIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "processIdentifier", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int processIdentifier(){
			final com.apple.jobjc.Invoke.MsgSend processIdentifier_IMetInst = get_processIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		processIdentifier_IMetInst.init(nativeBuffer, this);
		processIdentifier_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend remoteObjectInterface_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_remoteObjectInterface_IMetInst(){
		return ((remoteObjectInterface_IMetInst != null)
	? (remoteObjectInterface_IMetInst)
	: (remoteObjectInterface_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "remoteObjectInterface", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXPCInterface remoteObjectInterface(){
			final com.apple.jobjc.Invoke.MsgSend remoteObjectInterface_IMetInst = get_remoteObjectInterface_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		remoteObjectInterface_IMetInst.init(nativeBuffer, this);
		remoteObjectInterface_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXPCInterface returnValue = (com.apple.jobjc.foundation.NSXPCInterface) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend remoteObjectProxy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_remoteObjectProxy_IMetInst(){
		return ((remoteObjectProxy_IMetInst != null)
	? (remoteObjectProxy_IMetInst)
	: (remoteObjectProxy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "remoteObjectProxy", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T remoteObjectProxy(){
			final com.apple.jobjc.Invoke.MsgSend remoteObjectProxy_IMetInst = get_remoteObjectProxy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		remoteObjectProxy_IMetInst.init(nativeBuffer, this);
		remoteObjectProxy_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend remoteObjectProxyWithErrorHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_remoteObjectProxyWithErrorHandler_IMetInst(){
		return ((remoteObjectProxyWithErrorHandler_IMetInst != null)
	? (remoteObjectProxyWithErrorHandler_IMetInst)
	: (remoteObjectProxyWithErrorHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "remoteObjectProxyWithErrorHandler:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T remoteObjectProxyWithErrorHandler(final Object /* void(^)(NSError*) (@, @) */ handler){
			final com.apple.jobjc.Invoke.MsgSend remoteObjectProxyWithErrorHandler_IMetInst = get_remoteObjectProxyWithErrorHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		remoteObjectProxyWithErrorHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, handler);
		remoteObjectProxyWithErrorHandler_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resume_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resume_IMetInst(){
		return ((resume_IMetInst != null)
	? (resume_IMetInst)
	: (resume_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resume", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void resume(){
			final com.apple.jobjc.Invoke.MsgSend resume_IMetInst = get_resume_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resume_IMetInst.init(nativeBuffer, this);
		resume_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend serviceName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_serviceName_IMetInst(){
		return ((serviceName_IMetInst != null)
	? (serviceName_IMetInst)
	: (serviceName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "serviceName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString serviceName(){
			final com.apple.jobjc.Invoke.MsgSend serviceName_IMetInst = get_serviceName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		serviceName_IMetInst.init(nativeBuffer, this);
		serviceName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setExportedInterface_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setExportedInterface_IMetInst(){
		return ((setExportedInterface_IMetInst != null)
	? (setExportedInterface_IMetInst)
	: (setExportedInterface_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setExportedInterface:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setExportedInterface(final com.apple.jobjc.foundation.NSXPCInterface exportedInterface){
			final com.apple.jobjc.Invoke.MsgSend setExportedInterface_IMetInst = get_setExportedInterface_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setExportedInterface_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, exportedInterface);
		setExportedInterface_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setExportedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setExportedObject_IMetInst(){
		return ((setExportedObject_IMetInst != null)
	? (setExportedObject_IMetInst)
	: (setExportedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setExportedObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setExportedObject(final com.apple.jobjc.ID exportedObject){
			final com.apple.jobjc.Invoke.MsgSend setExportedObject_IMetInst = get_setExportedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setExportedObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, exportedObject);
		setExportedObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setInterruptionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setInterruptionHandler_IMetInst(){
		return ((setInterruptionHandler_IMetInst != null)
	? (setInterruptionHandler_IMetInst)
	: (setInterruptionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setInterruptionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setInterruptionHandler(final Object /* void(^)(void) (@, @) */ interruptionHandler){
			final com.apple.jobjc.Invoke.MsgSend setInterruptionHandler_IMetInst = get_setInterruptionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setInterruptionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, interruptionHandler);
		setInterruptionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setInvalidationHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setInvalidationHandler_IMetInst(){
		return ((setInvalidationHandler_IMetInst != null)
	? (setInvalidationHandler_IMetInst)
	: (setInvalidationHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setInvalidationHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setInvalidationHandler(final Object /* void(^)(void) (@, @) */ invalidationHandler){
			final com.apple.jobjc.Invoke.MsgSend setInvalidationHandler_IMetInst = get_setInvalidationHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setInvalidationHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, invalidationHandler);
		setInvalidationHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRemoteObjectInterface_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRemoteObjectInterface_IMetInst(){
		return ((setRemoteObjectInterface_IMetInst != null)
	? (setRemoteObjectInterface_IMetInst)
	: (setRemoteObjectInterface_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRemoteObjectInterface:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRemoteObjectInterface(final com.apple.jobjc.foundation.NSXPCInterface remoteObjectInterface){
			final com.apple.jobjc.Invoke.MsgSend setRemoteObjectInterface_IMetInst = get_setRemoteObjectInterface_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRemoteObjectInterface_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, remoteObjectInterface);
		setRemoteObjectInterface_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend suspend_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_suspend_IMetInst(){
		return ((suspend_IMetInst != null)
	? (suspend_IMetInst)
	: (suspend_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "suspend", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void suspend(){
			final com.apple.jobjc.Invoke.MsgSend suspend_IMetInst = get_suspend_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		suspend_IMetInst.init(nativeBuffer, this);
		suspend_IMetInst.invoke(nativeBuffer);
		
		
	}

}
