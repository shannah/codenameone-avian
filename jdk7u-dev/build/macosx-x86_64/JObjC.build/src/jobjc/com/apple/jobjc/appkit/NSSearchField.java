package com.apple.jobjc.appkit;

public  class NSSearchField extends com.apple.jobjc.appkit.NSTextField {
	public NSSearchField(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSSearchField(final NSSearchField obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend recentSearches_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_recentSearches_IMetInst(){
		return ((recentSearches_IMetInst != null)
	? (recentSearches_IMetInst)
	: (recentSearches_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "recentSearches", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray recentSearches(){
			final com.apple.jobjc.Invoke.MsgSend recentSearches_IMetInst = get_recentSearches_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		recentSearches_IMetInst.init(nativeBuffer, this);
		recentSearches_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend recentsAutosaveName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_recentsAutosaveName_IMetInst(){
		return ((recentsAutosaveName_IMetInst != null)
	? (recentsAutosaveName_IMetInst)
	: (recentsAutosaveName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "recentsAutosaveName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString recentsAutosaveName(){
			final com.apple.jobjc.Invoke.MsgSend recentsAutosaveName_IMetInst = get_recentsAutosaveName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		recentsAutosaveName_IMetInst.init(nativeBuffer, this);
		recentsAutosaveName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setRecentSearches_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRecentSearches_IMetInst(){
		return ((setRecentSearches_IMetInst != null)
	? (setRecentSearches_IMetInst)
	: (setRecentSearches_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRecentSearches:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRecentSearches(final com.apple.jobjc.foundation.NSArray searches){
			final com.apple.jobjc.Invoke.MsgSend setRecentSearches_IMetInst = get_setRecentSearches_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRecentSearches_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, searches);
		setRecentSearches_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRecentsAutosaveName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRecentsAutosaveName_IMetInst(){
		return ((setRecentsAutosaveName_IMetInst != null)
	? (setRecentsAutosaveName_IMetInst)
	: (setRecentsAutosaveName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRecentsAutosaveName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRecentsAutosaveName(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setRecentsAutosaveName_IMetInst = get_setRecentsAutosaveName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRecentsAutosaveName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setRecentsAutosaveName_IMetInst.invoke(nativeBuffer);
		
		
	}

}
