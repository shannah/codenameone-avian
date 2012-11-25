package com.apple.jobjc.foundation;

public  class NSNotificationQueue extends com.apple.jobjc.foundation.NSObject {
	public NSNotificationQueue(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSNotificationQueue(final NSNotificationQueue obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend dequeueNotificationsMatching_coalesceMask_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dequeueNotificationsMatching_coalesceMask_IMetInst(){
		return ((dequeueNotificationsMatching_coalesceMask_IMetInst != null)
	? (dequeueNotificationsMatching_coalesceMask_IMetInst)
	: (dequeueNotificationsMatching_coalesceMask_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dequeueNotificationsMatching:coalesceMask:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void dequeueNotificationsMatching_coalesceMask(final com.apple.jobjc.foundation.NSNotification notification, final long coalesceMask){
			final com.apple.jobjc.Invoke.MsgSend dequeueNotificationsMatching_coalesceMask_IMetInst = get_dequeueNotificationsMatching_coalesceMask_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dequeueNotificationsMatching_coalesceMask_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, coalesceMask);
		dequeueNotificationsMatching_coalesceMask_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enqueueNotification_postingStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enqueueNotification_postingStyle_IMetInst(){
		return ((enqueueNotification_postingStyle_IMetInst != null)
	? (enqueueNotification_postingStyle_IMetInst)
	: (enqueueNotification_postingStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enqueueNotification:postingStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void enqueueNotification_postingStyle(final com.apple.jobjc.foundation.NSNotification notification, final long postingStyle){
			final com.apple.jobjc.Invoke.MsgSend enqueueNotification_postingStyle_IMetInst = get_enqueueNotification_postingStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enqueueNotification_postingStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, postingStyle);
		enqueueNotification_postingStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enqueueNotification_postingStyle_coalesceMask_forModes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enqueueNotification_postingStyle_coalesceMask_forModes_IMetInst(){
		return ((enqueueNotification_postingStyle_coalesceMask_forModes_IMetInst != null)
	? (enqueueNotification_postingStyle_coalesceMask_forModes_IMetInst)
	: (enqueueNotification_postingStyle_coalesceMask_forModes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enqueueNotification:postingStyle:coalesceMask:forModes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void enqueueNotification_postingStyle_coalesceMask_forModes(final com.apple.jobjc.foundation.NSNotification notification, final long postingStyle, final long coalesceMask, final com.apple.jobjc.foundation.NSArray modes){
			final com.apple.jobjc.Invoke.MsgSend enqueueNotification_postingStyle_coalesceMask_forModes_IMetInst = get_enqueueNotification_postingStyle_coalesceMask_forModes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enqueueNotification_postingStyle_coalesceMask_forModes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, postingStyle);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, coalesceMask);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, modes);
		enqueueNotification_postingStyle_coalesceMask_forModes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithNotificationCenter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithNotificationCenter_IMetInst(){
		return ((initWithNotificationCenter_IMetInst != null)
	? (initWithNotificationCenter_IMetInst)
	: (initWithNotificationCenter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithNotificationCenter:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithNotificationCenter(final com.apple.jobjc.foundation.NSNotificationCenter notificationCenter){
			final com.apple.jobjc.Invoke.MsgSend initWithNotificationCenter_IMetInst = get_initWithNotificationCenter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithNotificationCenter_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notificationCenter);
		initWithNotificationCenter_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
