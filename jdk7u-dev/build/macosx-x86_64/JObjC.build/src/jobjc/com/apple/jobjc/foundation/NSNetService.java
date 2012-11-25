package com.apple.jobjc.foundation;

public  class NSNetService extends com.apple.jobjc.foundation.NSObject {
	public NSNetService(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSNetService(final NSNetService obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend TXTRecordData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_TXTRecordData_IMetInst(){
		return ((TXTRecordData_IMetInst != null)
	? (TXTRecordData_IMetInst)
	: (TXTRecordData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "TXTRecordData", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData TXTRecordData(){
			final com.apple.jobjc.Invoke.MsgSend TXTRecordData_IMetInst = get_TXTRecordData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		TXTRecordData_IMetInst.init(nativeBuffer, this);
		TXTRecordData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addresses_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addresses_IMetInst(){
		return ((addresses_IMetInst != null)
	? (addresses_IMetInst)
	: (addresses_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addresses", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray addresses(){
			final com.apple.jobjc.Invoke.MsgSend addresses_IMetInst = get_addresses_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addresses_IMetInst.init(nativeBuffer, this);
		addresses_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend domain_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_domain_IMetInst(){
		return ((domain_IMetInst != null)
	? (domain_IMetInst)
	: (domain_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "domain", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString domain(){
			final com.apple.jobjc.Invoke.MsgSend domain_IMetInst = get_domain_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		domain_IMetInst.init(nativeBuffer, this);
		domain_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getInputStream_outputStream_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getInputStream_outputStream_IMetInst(){
		return ((getInputStream_outputStream_IMetInst != null)
	? (getInputStream_outputStream_IMetInst)
	: (getInputStream_outputStream_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getInputStream:outputStream:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean getInputStream_outputStream(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSInputStream> inputStream, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSOutputStream> outputStream){
			final com.apple.jobjc.Invoke.MsgSend getInputStream_outputStream_IMetInst = get_getInputStream_outputStream_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getInputStream_outputStream_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, inputStream);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outputStream);
		getInputStream_outputStream_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hostName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hostName_IMetInst(){
		return ((hostName_IMetInst != null)
	? (hostName_IMetInst)
	: (hostName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hostName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString hostName(){
			final com.apple.jobjc.Invoke.MsgSend hostName_IMetInst = get_hostName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hostName_IMetInst.init(nativeBuffer, this);
		hostName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithDomain_type_name_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithDomain_type_name_IMetInst(){
		return ((initWithDomain_type_name_IMetInst != null)
	? (initWithDomain_type_name_IMetInst)
	: (initWithDomain_type_name_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithDomain:type:name:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithDomain_type_name(final com.apple.jobjc.foundation.NSString domain, final com.apple.jobjc.foundation.NSString type, final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend initWithDomain_type_name_IMetInst = get_initWithDomain_type_name_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithDomain_type_name_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, domain);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		initWithDomain_type_name_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithDomain_type_name_port_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithDomain_type_name_port_IMetInst(){
		return ((initWithDomain_type_name_port_IMetInst != null)
	? (initWithDomain_type_name_port_IMetInst)
	: (initWithDomain_type_name_port_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithDomain:type:name:port:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithDomain_type_name_port(final com.apple.jobjc.foundation.NSString domain, final com.apple.jobjc.foundation.NSString type, final com.apple.jobjc.foundation.NSString name, final int port){
			final com.apple.jobjc.Invoke.MsgSend initWithDomain_type_name_port_IMetInst = get_initWithDomain_type_name_port_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithDomain_type_name_port_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, domain);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, port);
		initWithDomain_type_name_port_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend name_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_name_IMetInst(){
		return ((name_IMetInst != null)
	? (name_IMetInst)
	: (name_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "name", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString name(){
			final com.apple.jobjc.Invoke.MsgSend name_IMetInst = get_name_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		name_IMetInst.init(nativeBuffer, this);
		name_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend port_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_port_IMetInst(){
		return ((port_IMetInst != null)
	? (port_IMetInst)
	: (port_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "port", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long port(){
			final com.apple.jobjc.Invoke.MsgSend port_IMetInst = get_port_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		port_IMetInst.init(nativeBuffer, this);
		port_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend protocolSpecificInformation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_protocolSpecificInformation_IMetInst(){
		return ((protocolSpecificInformation_IMetInst != null)
	? (protocolSpecificInformation_IMetInst)
	: (protocolSpecificInformation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "protocolSpecificInformation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString protocolSpecificInformation(){
			final com.apple.jobjc.Invoke.MsgSend protocolSpecificInformation_IMetInst = get_protocolSpecificInformation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		protocolSpecificInformation_IMetInst.init(nativeBuffer, this);
		protocolSpecificInformation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend publish_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_publish_IMetInst(){
		return ((publish_IMetInst != null)
	? (publish_IMetInst)
	: (publish_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "publish", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void publish(){
			final com.apple.jobjc.Invoke.MsgSend publish_IMetInst = get_publish_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		publish_IMetInst.init(nativeBuffer, this);
		publish_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend publishWithOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_publishWithOptions_IMetInst(){
		return ((publishWithOptions_IMetInst != null)
	? (publishWithOptions_IMetInst)
	: (publishWithOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "publishWithOptions:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void publishWithOptions(final long options){
			final com.apple.jobjc.Invoke.MsgSend publishWithOptions_IMetInst = get_publishWithOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		publishWithOptions_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		publishWithOptions_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeFromRunLoop_forMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeFromRunLoop_forMode_IMetInst(){
		return ((removeFromRunLoop_forMode_IMetInst != null)
	? (removeFromRunLoop_forMode_IMetInst)
	: (removeFromRunLoop_forMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeFromRunLoop:forMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeFromRunLoop_forMode(final com.apple.jobjc.foundation.NSRunLoop aRunLoop, final com.apple.jobjc.foundation.NSString mode){
			final com.apple.jobjc.Invoke.MsgSend removeFromRunLoop_forMode_IMetInst = get_removeFromRunLoop_forMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeFromRunLoop_forMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aRunLoop);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		removeFromRunLoop_forMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend resolve_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resolve_IMetInst(){
		return ((resolve_IMetInst != null)
	? (resolve_IMetInst)
	: (resolve_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resolve", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void resolve(){
			final com.apple.jobjc.Invoke.MsgSend resolve_IMetInst = get_resolve_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resolve_IMetInst.init(nativeBuffer, this);
		resolve_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend resolveWithTimeout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resolveWithTimeout_IMetInst(){
		return ((resolveWithTimeout_IMetInst != null)
	? (resolveWithTimeout_IMetInst)
	: (resolveWithTimeout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resolveWithTimeout:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void resolveWithTimeout(final double timeout){
			final com.apple.jobjc.Invoke.MsgSend resolveWithTimeout_IMetInst = get_resolveWithTimeout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resolveWithTimeout_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, timeout);
		resolveWithTimeout_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scheduleInRunLoop_forMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scheduleInRunLoop_forMode_IMetInst(){
		return ((scheduleInRunLoop_forMode_IMetInst != null)
	? (scheduleInRunLoop_forMode_IMetInst)
	: (scheduleInRunLoop_forMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scheduleInRunLoop:forMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void scheduleInRunLoop_forMode(final com.apple.jobjc.foundation.NSRunLoop aRunLoop, final com.apple.jobjc.foundation.NSString mode){
			final com.apple.jobjc.Invoke.MsgSend scheduleInRunLoop_forMode_IMetInst = get_scheduleInRunLoop_forMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scheduleInRunLoop_forMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aRunLoop);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		scheduleInRunLoop_forMode_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setProtocolSpecificInformation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setProtocolSpecificInformation_IMetInst(){
		return ((setProtocolSpecificInformation_IMetInst != null)
	? (setProtocolSpecificInformation_IMetInst)
	: (setProtocolSpecificInformation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setProtocolSpecificInformation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setProtocolSpecificInformation(final com.apple.jobjc.foundation.NSString specificInformation){
			final com.apple.jobjc.Invoke.MsgSend setProtocolSpecificInformation_IMetInst = get_setProtocolSpecificInformation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setProtocolSpecificInformation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, specificInformation);
		setProtocolSpecificInformation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTXTRecordData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTXTRecordData_IMetInst(){
		return ((setTXTRecordData_IMetInst != null)
	? (setTXTRecordData_IMetInst)
	: (setTXTRecordData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTXTRecordData:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setTXTRecordData(final com.apple.jobjc.foundation.NSData recordData){
			final com.apple.jobjc.Invoke.MsgSend setTXTRecordData_IMetInst = get_setTXTRecordData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTXTRecordData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, recordData);
		setTXTRecordData_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend startMonitoring_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startMonitoring_IMetInst(){
		return ((startMonitoring_IMetInst != null)
	? (startMonitoring_IMetInst)
	: (startMonitoring_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startMonitoring", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void startMonitoring(){
			final com.apple.jobjc.Invoke.MsgSend startMonitoring_IMetInst = get_startMonitoring_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startMonitoring_IMetInst.init(nativeBuffer, this);
		startMonitoring_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stop_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stop_IMetInst(){
		return ((stop_IMetInst != null)
	? (stop_IMetInst)
	: (stop_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stop", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void stop(){
			final com.apple.jobjc.Invoke.MsgSend stop_IMetInst = get_stop_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stop_IMetInst.init(nativeBuffer, this);
		stop_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stopMonitoring_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stopMonitoring_IMetInst(){
		return ((stopMonitoring_IMetInst != null)
	? (stopMonitoring_IMetInst)
	: (stopMonitoring_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stopMonitoring", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void stopMonitoring(){
			final com.apple.jobjc.Invoke.MsgSend stopMonitoring_IMetInst = get_stopMonitoring_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stopMonitoring_IMetInst.init(nativeBuffer, this);
		stopMonitoring_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend type_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_type_IMetInst(){
		return ((type_IMetInst != null)
	? (type_IMetInst)
	: (type_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "type", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString type(){
			final com.apple.jobjc.Invoke.MsgSend type_IMetInst = get_type_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		type_IMetInst.init(nativeBuffer, this);
		type_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
