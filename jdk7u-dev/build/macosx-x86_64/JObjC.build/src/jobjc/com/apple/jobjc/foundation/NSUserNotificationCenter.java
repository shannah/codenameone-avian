package com.apple.jobjc.foundation;

public  class NSUserNotificationCenter extends com.apple.jobjc.foundation.NSObject {
	public NSUserNotificationCenter(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSUserNotificationCenter(final NSUserNotificationCenter obj, final com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend deliverNotification_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deliverNotification_IMetInst(){
		return ((deliverNotification_IMetInst != null)
	? (deliverNotification_IMetInst)
	: (deliverNotification_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deliverNotification:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void deliverNotification(final com.apple.jobjc.foundation.NSUserNotification notification){
			final com.apple.jobjc.Invoke.MsgSend deliverNotification_IMetInst = get_deliverNotification_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deliverNotification_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		deliverNotification_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend deliveredNotifications_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deliveredNotifications_IMetInst(){
		return ((deliveredNotifications_IMetInst != null)
	? (deliveredNotifications_IMetInst)
	: (deliveredNotifications_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deliveredNotifications", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray deliveredNotifications(){
			final com.apple.jobjc.Invoke.MsgSend deliveredNotifications_IMetInst = get_deliveredNotifications_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deliveredNotifications_IMetInst.init(nativeBuffer, this);
		deliveredNotifications_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeAllDeliveredNotifications_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeAllDeliveredNotifications_IMetInst(){
		return ((removeAllDeliveredNotifications_IMetInst != null)
	? (removeAllDeliveredNotifications_IMetInst)
	: (removeAllDeliveredNotifications_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeAllDeliveredNotifications", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void removeAllDeliveredNotifications(){
			final com.apple.jobjc.Invoke.MsgSend removeAllDeliveredNotifications_IMetInst = get_removeAllDeliveredNotifications_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeAllDeliveredNotifications_IMetInst.init(nativeBuffer, this);
		removeAllDeliveredNotifications_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeDeliveredNotification_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeDeliveredNotification_IMetInst(){
		return ((removeDeliveredNotification_IMetInst != null)
	? (removeDeliveredNotification_IMetInst)
	: (removeDeliveredNotification_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeDeliveredNotification:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeDeliveredNotification(final com.apple.jobjc.foundation.NSUserNotification notification){
			final com.apple.jobjc.Invoke.MsgSend removeDeliveredNotification_IMetInst = get_removeDeliveredNotification_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeDeliveredNotification_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		removeDeliveredNotification_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeScheduledNotification_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeScheduledNotification_IMetInst(){
		return ((removeScheduledNotification_IMetInst != null)
	? (removeScheduledNotification_IMetInst)
	: (removeScheduledNotification_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeScheduledNotification:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeScheduledNotification(final com.apple.jobjc.foundation.NSUserNotification notification){
			final com.apple.jobjc.Invoke.MsgSend removeScheduledNotification_IMetInst = get_removeScheduledNotification_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeScheduledNotification_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		removeScheduledNotification_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scheduleNotification_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scheduleNotification_IMetInst(){
		return ((scheduleNotification_IMetInst != null)
	? (scheduleNotification_IMetInst)
	: (scheduleNotification_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scheduleNotification:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void scheduleNotification(final com.apple.jobjc.foundation.NSUserNotification notification){
			final com.apple.jobjc.Invoke.MsgSend scheduleNotification_IMetInst = get_scheduleNotification_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scheduleNotification_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		scheduleNotification_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scheduledNotifications_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scheduledNotifications_IMetInst(){
		return ((scheduledNotifications_IMetInst != null)
	? (scheduledNotifications_IMetInst)
	: (scheduledNotifications_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scheduledNotifications", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray scheduledNotifications(){
			final com.apple.jobjc.Invoke.MsgSend scheduledNotifications_IMetInst = get_scheduledNotifications_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scheduledNotifications_IMetInst.init(nativeBuffer, this);
		scheduledNotifications_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend setScheduledNotifications_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setScheduledNotifications_IMetInst(){
		return ((setScheduledNotifications_IMetInst != null)
	? (setScheduledNotifications_IMetInst)
	: (setScheduledNotifications_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setScheduledNotifications:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setScheduledNotifications(final com.apple.jobjc.foundation.NSArray scheduledNotifications){
			final com.apple.jobjc.Invoke.MsgSend setScheduledNotifications_IMetInst = get_setScheduledNotifications_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setScheduledNotifications_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, scheduledNotifications);
		setScheduledNotifications_IMetInst.invoke(nativeBuffer);
		
		
	}

}
