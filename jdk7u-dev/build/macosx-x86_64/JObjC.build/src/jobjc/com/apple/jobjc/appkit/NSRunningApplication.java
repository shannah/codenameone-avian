package com.apple.jobjc.appkit;

public  class NSRunningApplication extends com.apple.jobjc.foundation.NSObject {
	public NSRunningApplication(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSRunningApplication(final NSRunningApplication obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend activateWithOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_activateWithOptions_IMetInst(){
		return ((activateWithOptions_IMetInst != null)
	? (activateWithOptions_IMetInst)
	: (activateWithOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "activateWithOptions:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean activateWithOptions(final long options){
			final com.apple.jobjc.Invoke.MsgSend activateWithOptions_IMetInst = get_activateWithOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		activateWithOptions_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		activateWithOptions_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend activationPolicy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_activationPolicy_IMetInst(){
		return ((activationPolicy_IMetInst != null)
	? (activationPolicy_IMetInst)
	: (activationPolicy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "activationPolicy", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long activationPolicy(){
			final com.apple.jobjc.Invoke.MsgSend activationPolicy_IMetInst = get_activationPolicy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		activationPolicy_IMetInst.init(nativeBuffer, this);
		activationPolicy_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bundleIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bundleIdentifier_IMetInst(){
		return ((bundleIdentifier_IMetInst != null)
	? (bundleIdentifier_IMetInst)
	: (bundleIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bundleIdentifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString bundleIdentifier(){
			final com.apple.jobjc.Invoke.MsgSend bundleIdentifier_IMetInst = get_bundleIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bundleIdentifier_IMetInst.init(nativeBuffer, this);
		bundleIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bundleURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bundleURL_IMetInst(){
		return ((bundleURL_IMetInst != null)
	? (bundleURL_IMetInst)
	: (bundleURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bundleURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL bundleURL(){
			final com.apple.jobjc.Invoke.MsgSend bundleURL_IMetInst = get_bundleURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bundleURL_IMetInst.init(nativeBuffer, this);
		bundleURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend executableArchitecture_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_executableArchitecture_IMetInst(){
		return ((executableArchitecture_IMetInst != null)
	? (executableArchitecture_IMetInst)
	: (executableArchitecture_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "executableArchitecture", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long executableArchitecture(){
			final com.apple.jobjc.Invoke.MsgSend executableArchitecture_IMetInst = get_executableArchitecture_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		executableArchitecture_IMetInst.init(nativeBuffer, this);
		executableArchitecture_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend executableURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_executableURL_IMetInst(){
		return ((executableURL_IMetInst != null)
	? (executableURL_IMetInst)
	: (executableURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "executableURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL executableURL(){
			final com.apple.jobjc.Invoke.MsgSend executableURL_IMetInst = get_executableURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		executableURL_IMetInst.init(nativeBuffer, this);
		executableURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend forceTerminate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_forceTerminate_IMetInst(){
		return ((forceTerminate_IMetInst != null)
	? (forceTerminate_IMetInst)
	: (forceTerminate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "forceTerminate", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean forceTerminate(){
			final com.apple.jobjc.Invoke.MsgSend forceTerminate_IMetInst = get_forceTerminate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		forceTerminate_IMetInst.init(nativeBuffer, this);
		forceTerminate_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hide_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hide_IMetInst(){
		return ((hide_IMetInst != null)
	? (hide_IMetInst)
	: (hide_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hide", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hide(){
			final com.apple.jobjc.Invoke.MsgSend hide_IMetInst = get_hide_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hide_IMetInst.init(nativeBuffer, this);
		hide_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend icon_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_icon_IMetInst(){
		return ((icon_IMetInst != null)
	? (icon_IMetInst)
	: (icon_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "icon", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage icon(){
			final com.apple.jobjc.Invoke.MsgSend icon_IMetInst = get_icon_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		icon_IMetInst.init(nativeBuffer, this);
		icon_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isActive_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isActive_IMetInst(){
		return ((isActive_IMetInst != null)
	? (isActive_IMetInst)
	: (isActive_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isActive", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isActive(){
			final com.apple.jobjc.Invoke.MsgSend isActive_IMetInst = get_isActive_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isActive_IMetInst.init(nativeBuffer, this);
		isActive_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isFinishedLaunching_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isFinishedLaunching_IMetInst(){
		return ((isFinishedLaunching_IMetInst != null)
	? (isFinishedLaunching_IMetInst)
	: (isFinishedLaunching_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isFinishedLaunching", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isFinishedLaunching(){
			final com.apple.jobjc.Invoke.MsgSend isFinishedLaunching_IMetInst = get_isFinishedLaunching_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isFinishedLaunching_IMetInst.init(nativeBuffer, this);
		isFinishedLaunching_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isHidden_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isHidden_IMetInst(){
		return ((isHidden_IMetInst != null)
	? (isHidden_IMetInst)
	: (isHidden_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isHidden", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isHidden(){
			final com.apple.jobjc.Invoke.MsgSend isHidden_IMetInst = get_isHidden_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isHidden_IMetInst.init(nativeBuffer, this);
		isHidden_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isTerminated_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isTerminated_IMetInst(){
		return ((isTerminated_IMetInst != null)
	? (isTerminated_IMetInst)
	: (isTerminated_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isTerminated", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isTerminated(){
			final com.apple.jobjc.Invoke.MsgSend isTerminated_IMetInst = get_isTerminated_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isTerminated_IMetInst.init(nativeBuffer, this);
		isTerminated_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend launchDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_launchDate_IMetInst(){
		return ((launchDate_IMetInst != null)
	? (launchDate_IMetInst)
	: (launchDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "launchDate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate launchDate(){
			final com.apple.jobjc.Invoke.MsgSend launchDate_IMetInst = get_launchDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		launchDate_IMetInst.init(nativeBuffer, this);
		launchDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedName_IMetInst(){
		return ((localizedName_IMetInst != null)
	? (localizedName_IMetInst)
	: (localizedName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localizedName(){
			final com.apple.jobjc.Invoke.MsgSend localizedName_IMetInst = get_localizedName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedName_IMetInst.init(nativeBuffer, this);
		localizedName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ownsMenuBar_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ownsMenuBar_IMetInst(){
		return ((ownsMenuBar_IMetInst != null)
	? (ownsMenuBar_IMetInst)
	: (ownsMenuBar_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ownsMenuBar", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean ownsMenuBar(){
			final com.apple.jobjc.Invoke.MsgSend ownsMenuBar_IMetInst = get_ownsMenuBar_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ownsMenuBar_IMetInst.init(nativeBuffer, this);
		ownsMenuBar_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend terminate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_terminate_IMetInst(){
		return ((terminate_IMetInst != null)
	? (terminate_IMetInst)
	: (terminate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "terminate", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean terminate(){
			final com.apple.jobjc.Invoke.MsgSend terminate_IMetInst = get_terminate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		terminate_IMetInst.init(nativeBuffer, this);
		terminate_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unhide_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unhide_IMetInst(){
		return ((unhide_IMetInst != null)
	? (unhide_IMetInst)
	: (unhide_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unhide", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean unhide(){
			final com.apple.jobjc.Invoke.MsgSend unhide_IMetInst = get_unhide_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unhide_IMetInst.init(nativeBuffer, this);
		unhide_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
