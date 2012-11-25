package com.apple.jobjc.appkit;

public  class NSDockTile extends com.apple.jobjc.foundation.NSObject {
	public NSDockTile(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDockTile(final NSDockTile obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend badgeLabel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_badgeLabel_IMetInst(){
		return ((badgeLabel_IMetInst != null)
	? (badgeLabel_IMetInst)
	: (badgeLabel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "badgeLabel", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString badgeLabel(){
			final com.apple.jobjc.Invoke.MsgSend badgeLabel_IMetInst = get_badgeLabel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		badgeLabel_IMetInst.init(nativeBuffer, this);
		badgeLabel_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentView_IMetInst(){
		return ((contentView_IMetInst != null)
	? (contentView_IMetInst)
	: (contentView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView contentView(){
			final com.apple.jobjc.Invoke.MsgSend contentView_IMetInst = get_contentView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentView_IMetInst.init(nativeBuffer, this);
		contentView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend display_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_display_IMetInst(){
		return ((display_IMetInst != null)
	? (display_IMetInst)
	: (display_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "display", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void display(){
			final com.apple.jobjc.Invoke.MsgSend display_IMetInst = get_display_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		display_IMetInst.init(nativeBuffer, this);
		display_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setBadgeLabel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBadgeLabel_IMetInst(){
		return ((setBadgeLabel_IMetInst != null)
	? (setBadgeLabel_IMetInst)
	: (setBadgeLabel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBadgeLabel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setBadgeLabel(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setBadgeLabel_IMetInst = get_setBadgeLabel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBadgeLabel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setBadgeLabel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContentView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContentView_IMetInst(){
		return ((setContentView_IMetInst != null)
	? (setContentView_IMetInst)
	: (setContentView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContentView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setContentView(final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend setContentView_IMetInst = get_setContentView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContentView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		setContentView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShowsApplicationBadge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShowsApplicationBadge_IMetInst(){
		return ((setShowsApplicationBadge_IMetInst != null)
	? (setShowsApplicationBadge_IMetInst)
	: (setShowsApplicationBadge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShowsApplicationBadge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShowsApplicationBadge(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setShowsApplicationBadge_IMetInst = get_setShowsApplicationBadge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShowsApplicationBadge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setShowsApplicationBadge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showsApplicationBadge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showsApplicationBadge_IMetInst(){
		return ((showsApplicationBadge_IMetInst != null)
	? (showsApplicationBadge_IMetInst)
	: (showsApplicationBadge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showsApplicationBadge", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean showsApplicationBadge(){
			final com.apple.jobjc.Invoke.MsgSend showsApplicationBadge_IMetInst = get_showsApplicationBadge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showsApplicationBadge_IMetInst.init(nativeBuffer, this);
		showsApplicationBadge_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend size_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_size_IMetInst(){
		return ((size_IMetInst != null)
	? (size_IMetInst)
	: (size_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "size", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize size(){
			final com.apple.jobjc.Invoke.MsgSend size_IMetInst = get_size_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		size_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		size_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

}
