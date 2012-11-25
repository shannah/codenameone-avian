package com.apple.jobjc.foundation;

public  class NSUserNotification extends com.apple.jobjc.foundation.NSObject {
	public NSUserNotification(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSUserNotification(final NSUserNotification obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend actionButtonTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_actionButtonTitle_IMetInst(){
		return ((actionButtonTitle_IMetInst != null)
	? (actionButtonTitle_IMetInst)
	: (actionButtonTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "actionButtonTitle", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString actionButtonTitle(){
			final com.apple.jobjc.Invoke.MsgSend actionButtonTitle_IMetInst = get_actionButtonTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		actionButtonTitle_IMetInst.init(nativeBuffer, this);
		actionButtonTitle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend activationType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_activationType_IMetInst(){
		return ((activationType_IMetInst != null)
	? (activationType_IMetInst)
	: (activationType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "activationType", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long activationType(){
			final com.apple.jobjc.Invoke.MsgSend activationType_IMetInst = get_activationType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		activationType_IMetInst.init(nativeBuffer, this);
		activationType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend actualDeliveryDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_actualDeliveryDate_IMetInst(){
		return ((actualDeliveryDate_IMetInst != null)
	? (actualDeliveryDate_IMetInst)
	: (actualDeliveryDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "actualDeliveryDate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate actualDeliveryDate(){
			final com.apple.jobjc.Invoke.MsgSend actualDeliveryDate_IMetInst = get_actualDeliveryDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		actualDeliveryDate_IMetInst.init(nativeBuffer, this);
		actualDeliveryDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deliveryDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deliveryDate_IMetInst(){
		return ((deliveryDate_IMetInst != null)
	? (deliveryDate_IMetInst)
	: (deliveryDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deliveryDate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate deliveryDate(){
			final com.apple.jobjc.Invoke.MsgSend deliveryDate_IMetInst = get_deliveryDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deliveryDate_IMetInst.init(nativeBuffer, this);
		deliveryDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deliveryRepeatInterval_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deliveryRepeatInterval_IMetInst(){
		return ((deliveryRepeatInterval_IMetInst != null)
	? (deliveryRepeatInterval_IMetInst)
	: (deliveryRepeatInterval_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deliveryRepeatInterval", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDateComponents deliveryRepeatInterval(){
			final com.apple.jobjc.Invoke.MsgSend deliveryRepeatInterval_IMetInst = get_deliveryRepeatInterval_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deliveryRepeatInterval_IMetInst.init(nativeBuffer, this);
		deliveryRepeatInterval_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDateComponents returnValue = (com.apple.jobjc.foundation.NSDateComponents) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deliveryTimeZone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deliveryTimeZone_IMetInst(){
		return ((deliveryTimeZone_IMetInst != null)
	? (deliveryTimeZone_IMetInst)
	: (deliveryTimeZone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deliveryTimeZone", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTimeZone deliveryTimeZone(){
			final com.apple.jobjc.Invoke.MsgSend deliveryTimeZone_IMetInst = get_deliveryTimeZone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deliveryTimeZone_IMetInst.init(nativeBuffer, this);
		deliveryTimeZone_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTimeZone returnValue = (com.apple.jobjc.foundation.NSTimeZone) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasActionButton_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasActionButton_IMetInst(){
		return ((hasActionButton_IMetInst != null)
	? (hasActionButton_IMetInst)
	: (hasActionButton_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasActionButton", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasActionButton(){
			final com.apple.jobjc.Invoke.MsgSend hasActionButton_IMetInst = get_hasActionButton_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasActionButton_IMetInst.init(nativeBuffer, this);
		hasActionButton_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend informativeText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_informativeText_IMetInst(){
		return ((informativeText_IMetInst != null)
	? (informativeText_IMetInst)
	: (informativeText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "informativeText", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString informativeText(){
			final com.apple.jobjc.Invoke.MsgSend informativeText_IMetInst = get_informativeText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		informativeText_IMetInst.init(nativeBuffer, this);
		informativeText_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isPresented_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isPresented_IMetInst(){
		return ((isPresented_IMetInst != null)
	? (isPresented_IMetInst)
	: (isPresented_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isPresented", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isPresented(){
			final com.apple.jobjc.Invoke.MsgSend isPresented_IMetInst = get_isPresented_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isPresented_IMetInst.init(nativeBuffer, this);
		isPresented_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isRemote_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isRemote_IMetInst(){
		return ((isRemote_IMetInst != null)
	? (isRemote_IMetInst)
	: (isRemote_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isRemote", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isRemote(){
			final com.apple.jobjc.Invoke.MsgSend isRemote_IMetInst = get_isRemote_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isRemote_IMetInst.init(nativeBuffer, this);
		isRemote_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend otherButtonTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_otherButtonTitle_IMetInst(){
		return ((otherButtonTitle_IMetInst != null)
	? (otherButtonTitle_IMetInst)
	: (otherButtonTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "otherButtonTitle", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString otherButtonTitle(){
			final com.apple.jobjc.Invoke.MsgSend otherButtonTitle_IMetInst = get_otherButtonTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		otherButtonTitle_IMetInst.init(nativeBuffer, this);
		otherButtonTitle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setActionButtonTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setActionButtonTitle_IMetInst(){
		return ((setActionButtonTitle_IMetInst != null)
	? (setActionButtonTitle_IMetInst)
	: (setActionButtonTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setActionButtonTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setActionButtonTitle(final com.apple.jobjc.foundation.NSString actionButtonTitle){
			final com.apple.jobjc.Invoke.MsgSend setActionButtonTitle_IMetInst = get_setActionButtonTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setActionButtonTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, actionButtonTitle);
		setActionButtonTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDeliveryDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDeliveryDate_IMetInst(){
		return ((setDeliveryDate_IMetInst != null)
	? (setDeliveryDate_IMetInst)
	: (setDeliveryDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDeliveryDate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDeliveryDate(final com.apple.jobjc.foundation.NSDate deliveryDate){
			final com.apple.jobjc.Invoke.MsgSend setDeliveryDate_IMetInst = get_setDeliveryDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDeliveryDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, deliveryDate);
		setDeliveryDate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDeliveryRepeatInterval_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDeliveryRepeatInterval_IMetInst(){
		return ((setDeliveryRepeatInterval_IMetInst != null)
	? (setDeliveryRepeatInterval_IMetInst)
	: (setDeliveryRepeatInterval_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDeliveryRepeatInterval:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDeliveryRepeatInterval(final com.apple.jobjc.foundation.NSDateComponents deliveryRepeatInterval){
			final com.apple.jobjc.Invoke.MsgSend setDeliveryRepeatInterval_IMetInst = get_setDeliveryRepeatInterval_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDeliveryRepeatInterval_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, deliveryRepeatInterval);
		setDeliveryRepeatInterval_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDeliveryTimeZone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDeliveryTimeZone_IMetInst(){
		return ((setDeliveryTimeZone_IMetInst != null)
	? (setDeliveryTimeZone_IMetInst)
	: (setDeliveryTimeZone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDeliveryTimeZone:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDeliveryTimeZone(final com.apple.jobjc.foundation.NSTimeZone deliveryTimeZone){
			final com.apple.jobjc.Invoke.MsgSend setDeliveryTimeZone_IMetInst = get_setDeliveryTimeZone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDeliveryTimeZone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, deliveryTimeZone);
		setDeliveryTimeZone_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHasActionButton_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHasActionButton_IMetInst(){
		return ((setHasActionButton_IMetInst != null)
	? (setHasActionButton_IMetInst)
	: (setHasActionButton_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHasActionButton:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHasActionButton(final boolean hasActionButton){
			final com.apple.jobjc.Invoke.MsgSend setHasActionButton_IMetInst = get_setHasActionButton_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHasActionButton_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, hasActionButton);
		setHasActionButton_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setInformativeText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setInformativeText_IMetInst(){
		return ((setInformativeText_IMetInst != null)
	? (setInformativeText_IMetInst)
	: (setInformativeText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setInformativeText:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setInformativeText(final com.apple.jobjc.foundation.NSString informativeText){
			final com.apple.jobjc.Invoke.MsgSend setInformativeText_IMetInst = get_setInformativeText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setInformativeText_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, informativeText);
		setInformativeText_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setOtherButtonTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOtherButtonTitle_IMetInst(){
		return ((setOtherButtonTitle_IMetInst != null)
	? (setOtherButtonTitle_IMetInst)
	: (setOtherButtonTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOtherButtonTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setOtherButtonTitle(final com.apple.jobjc.foundation.NSString otherButtonTitle){
			final com.apple.jobjc.Invoke.MsgSend setOtherButtonTitle_IMetInst = get_setOtherButtonTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOtherButtonTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherButtonTitle);
		setOtherButtonTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSoundName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSoundName_IMetInst(){
		return ((setSoundName_IMetInst != null)
	? (setSoundName_IMetInst)
	: (setSoundName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSoundName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSoundName(final com.apple.jobjc.foundation.NSString soundName){
			final com.apple.jobjc.Invoke.MsgSend setSoundName_IMetInst = get_setSoundName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSoundName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, soundName);
		setSoundName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSubtitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSubtitle_IMetInst(){
		return ((setSubtitle_IMetInst != null)
	? (setSubtitle_IMetInst)
	: (setSubtitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSubtitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSubtitle(final com.apple.jobjc.foundation.NSString subtitle){
			final com.apple.jobjc.Invoke.MsgSend setSubtitle_IMetInst = get_setSubtitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSubtitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subtitle);
		setSubtitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitle_IMetInst(){
		return ((setTitle_IMetInst != null)
	? (setTitle_IMetInst)
	: (setTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTitle(final com.apple.jobjc.foundation.NSString title){
			final com.apple.jobjc.Invoke.MsgSend setTitle_IMetInst = get_setTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		setTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUserInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUserInfo_IMetInst(){
		return ((setUserInfo_IMetInst != null)
	? (setUserInfo_IMetInst)
	: (setUserInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUserInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setUserInfo(final com.apple.jobjc.foundation.NSDictionary userInfo){
			final com.apple.jobjc.Invoke.MsgSend setUserInfo_IMetInst = get_setUserInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUserInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, userInfo);
		setUserInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend soundName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_soundName_IMetInst(){
		return ((soundName_IMetInst != null)
	? (soundName_IMetInst)
	: (soundName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "soundName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString soundName(){
			final com.apple.jobjc.Invoke.MsgSend soundName_IMetInst = get_soundName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		soundName_IMetInst.init(nativeBuffer, this);
		soundName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend subtitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_subtitle_IMetInst(){
		return ((subtitle_IMetInst != null)
	? (subtitle_IMetInst)
	: (subtitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "subtitle", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString subtitle(){
			final com.apple.jobjc.Invoke.MsgSend subtitle_IMetInst = get_subtitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		subtitle_IMetInst.init(nativeBuffer, this);
		subtitle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend title_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_title_IMetInst(){
		return ((title_IMetInst != null)
	? (title_IMetInst)
	: (title_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "title", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString title(){
			final com.apple.jobjc.Invoke.MsgSend title_IMetInst = get_title_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		title_IMetInst.init(nativeBuffer, this);
		title_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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
