package com.apple.jobjc.foundation;

public  class NSNetServiceBrowser extends com.apple.jobjc.foundation.NSObject {
	public NSNetServiceBrowser(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSNetServiceBrowser(final NSNetServiceBrowser obj, final com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend init_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_init_IMetInst(){
		return ((init_IMetInst != null)
	? (init_IMetInst)
	: (init_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "init", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T init(){
			final com.apple.jobjc.Invoke.MsgSend init_IMetInst = get_init_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		init_IMetInst.init(nativeBuffer, this);
		init_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend searchForAllDomains_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_searchForAllDomains_IMetInst(){
		return ((searchForAllDomains_IMetInst != null)
	? (searchForAllDomains_IMetInst)
	: (searchForAllDomains_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "searchForAllDomains", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void searchForAllDomains(){
			final com.apple.jobjc.Invoke.MsgSend searchForAllDomains_IMetInst = get_searchForAllDomains_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		searchForAllDomains_IMetInst.init(nativeBuffer, this);
		searchForAllDomains_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend searchForBrowsableDomains_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_searchForBrowsableDomains_IMetInst(){
		return ((searchForBrowsableDomains_IMetInst != null)
	? (searchForBrowsableDomains_IMetInst)
	: (searchForBrowsableDomains_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "searchForBrowsableDomains", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void searchForBrowsableDomains(){
			final com.apple.jobjc.Invoke.MsgSend searchForBrowsableDomains_IMetInst = get_searchForBrowsableDomains_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		searchForBrowsableDomains_IMetInst.init(nativeBuffer, this);
		searchForBrowsableDomains_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend searchForRegistrationDomains_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_searchForRegistrationDomains_IMetInst(){
		return ((searchForRegistrationDomains_IMetInst != null)
	? (searchForRegistrationDomains_IMetInst)
	: (searchForRegistrationDomains_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "searchForRegistrationDomains", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void searchForRegistrationDomains(){
			final com.apple.jobjc.Invoke.MsgSend searchForRegistrationDomains_IMetInst = get_searchForRegistrationDomains_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		searchForRegistrationDomains_IMetInst.init(nativeBuffer, this);
		searchForRegistrationDomains_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend searchForServicesOfType_inDomain_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_searchForServicesOfType_inDomain_IMetInst(){
		return ((searchForServicesOfType_inDomain_IMetInst != null)
	? (searchForServicesOfType_inDomain_IMetInst)
	: (searchForServicesOfType_inDomain_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "searchForServicesOfType:inDomain:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void searchForServicesOfType_inDomain(final com.apple.jobjc.foundation.NSString type, final com.apple.jobjc.foundation.NSString domainString){
			final com.apple.jobjc.Invoke.MsgSend searchForServicesOfType_inDomain_IMetInst = get_searchForServicesOfType_inDomain_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		searchForServicesOfType_inDomain_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, domainString);
		searchForServicesOfType_inDomain_IMetInst.invoke(nativeBuffer);
		
		
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

}
