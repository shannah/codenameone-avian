package com.apple.jobjc.appkit;

public  class NSTrackingArea extends com.apple.jobjc.foundation.NSObject {
	public NSTrackingArea(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTrackingArea(final NSTrackingArea obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend initWithRect_options_owner_userInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithRect_options_owner_userInfo_IMetInst(){
		return ((initWithRect_options_owner_userInfo_IMetInst != null)
	? (initWithRect_options_owner_userInfo_IMetInst)
	: (initWithRect_options_owner_userInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithRect:options:owner:userInfo:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithRect_options_owner_userInfo(final com.apple.jobjc.foundation.NSRect rect, final long options, final com.apple.jobjc.ID owner, final com.apple.jobjc.foundation.NSDictionary userInfo){
			final com.apple.jobjc.Invoke.MsgSend initWithRect_options_owner_userInfo_IMetInst = get_initWithRect_options_owner_userInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithRect_options_owner_userInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, owner);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, userInfo);
		initWithRect_options_owner_userInfo_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_options_IMetInst(){
		return ((options_IMetInst != null)
	? (options_IMetInst)
	: (options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "options", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long options(){
			final com.apple.jobjc.Invoke.MsgSend options_IMetInst = get_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		options_IMetInst.init(nativeBuffer, this);
		options_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend owner_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_owner_IMetInst(){
		return ((owner_IMetInst != null)
	? (owner_IMetInst)
	: (owner_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "owner", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T owner(){
			final com.apple.jobjc.Invoke.MsgSend owner_IMetInst = get_owner_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		owner_IMetInst.init(nativeBuffer, this);
		owner_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rect_IMetInst(){
		return ((rect_IMetInst != null)
	? (rect_IMetInst)
	: (rect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rect", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect rect(){
			final com.apple.jobjc.Invoke.MsgSend rect_IMetInst = get_rect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rect_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		rect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend userInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_userInfo_IMetInst(){
		return ((userInfo_IMetInst != null)
	? (userInfo_IMetInst)
	: (userInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "userInfo", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary userInfo(){
			final com.apple.jobjc.Invoke.MsgSend userInfo_IMetInst = get_userInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		userInfo_IMetInst.init(nativeBuffer, this);
		userInfo_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
