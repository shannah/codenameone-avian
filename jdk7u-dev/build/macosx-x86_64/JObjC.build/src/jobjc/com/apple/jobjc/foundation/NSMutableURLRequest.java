package com.apple.jobjc.foundation;

public  class NSMutableURLRequest extends com.apple.jobjc.foundation.NSURLRequest {
	public NSMutableURLRequest(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMutableURLRequest(final NSMutableURLRequest obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addValue_forHTTPHeaderField_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addValue_forHTTPHeaderField_IMetInst(){
		return ((addValue_forHTTPHeaderField_IMetInst != null)
	? (addValue_forHTTPHeaderField_IMetInst)
	: (addValue_forHTTPHeaderField_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addValue:forHTTPHeaderField:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addValue_forHTTPHeaderField(final com.apple.jobjc.foundation.NSString value, final com.apple.jobjc.foundation.NSString field){
			final com.apple.jobjc.Invoke.MsgSend addValue_forHTTPHeaderField_IMetInst = get_addValue_forHTTPHeaderField_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addValue_forHTTPHeaderField_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, field);
		addValue_forHTTPHeaderField_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllHTTPHeaderFields_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllHTTPHeaderFields_IMetInst(){
		return ((setAllHTTPHeaderFields_IMetInst != null)
	? (setAllHTTPHeaderFields_IMetInst)
	: (setAllHTTPHeaderFields_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllHTTPHeaderFields:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAllHTTPHeaderFields(final com.apple.jobjc.foundation.NSDictionary headerFields){
			final com.apple.jobjc.Invoke.MsgSend setAllHTTPHeaderFields_IMetInst = get_setAllHTTPHeaderFields_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllHTTPHeaderFields_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, headerFields);
		setAllHTTPHeaderFields_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsCellularAccess_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsCellularAccess_IMetInst(){
		return ((setAllowsCellularAccess_IMetInst != null)
	? (setAllowsCellularAccess_IMetInst)
	: (setAllowsCellularAccess_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsCellularAccess:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsCellularAccess(final boolean allow){
			final com.apple.jobjc.Invoke.MsgSend setAllowsCellularAccess_IMetInst = get_setAllowsCellularAccess_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsCellularAccess_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, allow);
		setAllowsCellularAccess_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCachePolicy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCachePolicy_IMetInst(){
		return ((setCachePolicy_IMetInst != null)
	? (setCachePolicy_IMetInst)
	: (setCachePolicy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCachePolicy:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setCachePolicy(final long policy){
			final com.apple.jobjc.Invoke.MsgSend setCachePolicy_IMetInst = get_setCachePolicy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCachePolicy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, policy);
		setCachePolicy_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHTTPBody_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHTTPBody_IMetInst(){
		return ((setHTTPBody_IMetInst != null)
	? (setHTTPBody_IMetInst)
	: (setHTTPBody_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHTTPBody:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setHTTPBody(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend setHTTPBody_IMetInst = get_setHTTPBody_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHTTPBody_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		setHTTPBody_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHTTPBodyStream_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHTTPBodyStream_IMetInst(){
		return ((setHTTPBodyStream_IMetInst != null)
	? (setHTTPBodyStream_IMetInst)
	: (setHTTPBodyStream_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHTTPBodyStream:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setHTTPBodyStream(final com.apple.jobjc.foundation.NSInputStream inputStream){
			final com.apple.jobjc.Invoke.MsgSend setHTTPBodyStream_IMetInst = get_setHTTPBodyStream_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHTTPBodyStream_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, inputStream);
		setHTTPBodyStream_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHTTPMethod_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHTTPMethod_IMetInst(){
		return ((setHTTPMethod_IMetInst != null)
	? (setHTTPMethod_IMetInst)
	: (setHTTPMethod_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHTTPMethod:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setHTTPMethod(final com.apple.jobjc.foundation.NSString method){
			final com.apple.jobjc.Invoke.MsgSend setHTTPMethod_IMetInst = get_setHTTPMethod_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHTTPMethod_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, method);
		setHTTPMethod_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHTTPShouldHandleCookies_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHTTPShouldHandleCookies_IMetInst(){
		return ((setHTTPShouldHandleCookies_IMetInst != null)
	? (setHTTPShouldHandleCookies_IMetInst)
	: (setHTTPShouldHandleCookies_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHTTPShouldHandleCookies:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHTTPShouldHandleCookies(final boolean should){
			final com.apple.jobjc.Invoke.MsgSend setHTTPShouldHandleCookies_IMetInst = get_setHTTPShouldHandleCookies_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHTTPShouldHandleCookies_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, should);
		setHTTPShouldHandleCookies_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHTTPShouldUsePipelining_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHTTPShouldUsePipelining_IMetInst(){
		return ((setHTTPShouldUsePipelining_IMetInst != null)
	? (setHTTPShouldUsePipelining_IMetInst)
	: (setHTTPShouldUsePipelining_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHTTPShouldUsePipelining:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHTTPShouldUsePipelining(final boolean shouldUsePipelining){
			final com.apple.jobjc.Invoke.MsgSend setHTTPShouldUsePipelining_IMetInst = get_setHTTPShouldUsePipelining_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHTTPShouldUsePipelining_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, shouldUsePipelining);
		setHTTPShouldUsePipelining_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMainDocumentURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMainDocumentURL_IMetInst(){
		return ((setMainDocumentURL_IMetInst != null)
	? (setMainDocumentURL_IMetInst)
	: (setMainDocumentURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMainDocumentURL:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMainDocumentURL(final com.apple.jobjc.foundation.NSURL URL){
			final com.apple.jobjc.Invoke.MsgSend setMainDocumentURL_IMetInst = get_setMainDocumentURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMainDocumentURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URL);
		setMainDocumentURL_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNetworkServiceType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNetworkServiceType_IMetInst(){
		return ((setNetworkServiceType_IMetInst != null)
	? (setNetworkServiceType_IMetInst)
	: (setNetworkServiceType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNetworkServiceType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setNetworkServiceType(final long networkServiceType){
			final com.apple.jobjc.Invoke.MsgSend setNetworkServiceType_IMetInst = get_setNetworkServiceType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNetworkServiceType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, networkServiceType);
		setNetworkServiceType_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTimeoutInterval_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTimeoutInterval_IMetInst(){
		return ((setTimeoutInterval_IMetInst != null)
	? (setTimeoutInterval_IMetInst)
	: (setTimeoutInterval_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTimeoutInterval:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setTimeoutInterval(final double seconds){
			final com.apple.jobjc.Invoke.MsgSend setTimeoutInterval_IMetInst = get_setTimeoutInterval_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTimeoutInterval_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, seconds);
		setTimeoutInterval_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setURL_IMetInst(){
		return ((setURL_IMetInst != null)
	? (setURL_IMetInst)
	: (setURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setURL:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setURL(final com.apple.jobjc.foundation.NSURL URL){
			final com.apple.jobjc.Invoke.MsgSend setURL_IMetInst = get_setURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URL);
		setURL_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setValue_forHTTPHeaderField_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setValue_forHTTPHeaderField_IMetInst(){
		return ((setValue_forHTTPHeaderField_IMetInst != null)
	? (setValue_forHTTPHeaderField_IMetInst)
	: (setValue_forHTTPHeaderField_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setValue:forHTTPHeaderField:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setValue_forHTTPHeaderField(final com.apple.jobjc.foundation.NSString value, final com.apple.jobjc.foundation.NSString field){
			final com.apple.jobjc.Invoke.MsgSend setValue_forHTTPHeaderField_IMetInst = get_setValue_forHTTPHeaderField_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setValue_forHTTPHeaderField_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, field);
		setValue_forHTTPHeaderField_IMetInst.invoke(nativeBuffer);
		
		
	}

}
