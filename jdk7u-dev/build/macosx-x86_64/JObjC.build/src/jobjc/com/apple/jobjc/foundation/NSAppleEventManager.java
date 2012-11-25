package com.apple.jobjc.foundation;

public  class NSAppleEventManager extends com.apple.jobjc.foundation.NSObject {
	public NSAppleEventManager(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSAppleEventManager(final NSAppleEventManager obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend appleEventForSuspensionID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appleEventForSuspensionID_IMetInst(){
		return ((appleEventForSuspensionID_IMetInst != null)
	? (appleEventForSuspensionID_IMetInst)
	: (appleEventForSuspensionID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appleEventForSuspensionID:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor appleEventForSuspensionID(final com.apple.jobjc.foundation.NSAppleEventManagerSuspensionIDOpaque suspensionID){
			final com.apple.jobjc.Invoke.MsgSend appleEventForSuspensionID_IMetInst = get_appleEventForSuspensionID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appleEventForSuspensionID_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, suspensionID);
		appleEventForSuspensionID_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentAppleEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentAppleEvent_IMetInst(){
		return ((currentAppleEvent_IMetInst != null)
	? (currentAppleEvent_IMetInst)
	: (currentAppleEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentAppleEvent", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor currentAppleEvent(){
			final com.apple.jobjc.Invoke.MsgSend currentAppleEvent_IMetInst = get_currentAppleEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentAppleEvent_IMetInst.init(nativeBuffer, this);
		currentAppleEvent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentReplyAppleEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentReplyAppleEvent_IMetInst(){
		return ((currentReplyAppleEvent_IMetInst != null)
	? (currentReplyAppleEvent_IMetInst)
	: (currentReplyAppleEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentReplyAppleEvent", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor currentReplyAppleEvent(){
			final com.apple.jobjc.Invoke.MsgSend currentReplyAppleEvent_IMetInst = get_currentReplyAppleEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentReplyAppleEvent_IMetInst.init(nativeBuffer, this);
		currentReplyAppleEvent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dispatchRawAppleEvent_withRawReply_handlerRefCon_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dispatchRawAppleEvent_withRawReply_handlerRefCon_IMetInst(){
		return ((dispatchRawAppleEvent_withRawReply_handlerRefCon_IMetInst != null)
	? (dispatchRawAppleEvent_withRawReply_handlerRefCon_IMetInst)
	: (dispatchRawAppleEvent_withRawReply_handlerRefCon_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dispatchRawAppleEvent:withRawReply:handlerRefCon:", com.apple.jobjc.PrimitiveCoder.SShortCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public short dispatchRawAppleEvent_withRawReply_handlerRefCon(final Object /* AppleEvent* (^{AEDesc=I^^{OpaqueAEDataStorageType}}, ^{AEDesc=I^^{OpaqueAEDataStorageType}}) */ theAppleEvent, final Object /* AppleEvent* (^{AEDesc=I^^{OpaqueAEDataStorageType}}, ^{AEDesc=I^^{OpaqueAEDataStorageType}}) */ theReply, final Object /* SRefCon (l, ^v) */ handlerRefCon){
			final com.apple.jobjc.Invoke.MsgSend dispatchRawAppleEvent_withRawReply_handlerRefCon_IMetInst = get_dispatchRawAppleEvent_withRawReply_handlerRefCon_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dispatchRawAppleEvent_withRawReply_handlerRefCon_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, theAppleEvent);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, theReply);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, handlerRefCon);
		dispatchRawAppleEvent_withRawReply_handlerRefCon_IMetInst.invoke(nativeBuffer);
		final short returnValue = (short) (com.apple.jobjc.PrimitiveCoder.SShortCoder.INST.popShort(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeEventHandlerForEventClass_andEventID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeEventHandlerForEventClass_andEventID_IMetInst(){
		return ((removeEventHandlerForEventClass_andEventID_IMetInst != null)
	? (removeEventHandlerForEventClass_andEventID_IMetInst)
	: (removeEventHandlerForEventClass_andEventID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeEventHandlerForEventClass:andEventID:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public void removeEventHandlerForEventClass_andEventID(final int eventClass, final int eventID){
			final com.apple.jobjc.Invoke.MsgSend removeEventHandlerForEventClass_andEventID_IMetInst = get_removeEventHandlerForEventClass_andEventID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeEventHandlerForEventClass_andEventID_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, eventClass);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, eventID);
		removeEventHandlerForEventClass_andEventID_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replyAppleEventForSuspensionID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replyAppleEventForSuspensionID_IMetInst(){
		return ((replyAppleEventForSuspensionID_IMetInst != null)
	? (replyAppleEventForSuspensionID_IMetInst)
	: (replyAppleEventForSuspensionID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replyAppleEventForSuspensionID:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor replyAppleEventForSuspensionID(final com.apple.jobjc.foundation.NSAppleEventManagerSuspensionIDOpaque suspensionID){
			final com.apple.jobjc.Invoke.MsgSend replyAppleEventForSuspensionID_IMetInst = get_replyAppleEventForSuspensionID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replyAppleEventForSuspensionID_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, suspensionID);
		replyAppleEventForSuspensionID_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resumeWithSuspensionID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resumeWithSuspensionID_IMetInst(){
		return ((resumeWithSuspensionID_IMetInst != null)
	? (resumeWithSuspensionID_IMetInst)
	: (resumeWithSuspensionID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resumeWithSuspensionID:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void resumeWithSuspensionID(final com.apple.jobjc.foundation.NSAppleEventManagerSuspensionIDOpaque suspensionID){
			final com.apple.jobjc.Invoke.MsgSend resumeWithSuspensionID_IMetInst = get_resumeWithSuspensionID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resumeWithSuspensionID_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, suspensionID);
		resumeWithSuspensionID_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCurrentAppleEventAndReplyEventWithSuspensionID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCurrentAppleEventAndReplyEventWithSuspensionID_IMetInst(){
		return ((setCurrentAppleEventAndReplyEventWithSuspensionID_IMetInst != null)
	? (setCurrentAppleEventAndReplyEventWithSuspensionID_IMetInst)
	: (setCurrentAppleEventAndReplyEventWithSuspensionID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCurrentAppleEventAndReplyEventWithSuspensionID:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void setCurrentAppleEventAndReplyEventWithSuspensionID(final com.apple.jobjc.foundation.NSAppleEventManagerSuspensionIDOpaque suspensionID){
			final com.apple.jobjc.Invoke.MsgSend setCurrentAppleEventAndReplyEventWithSuspensionID_IMetInst = get_setCurrentAppleEventAndReplyEventWithSuspensionID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCurrentAppleEventAndReplyEventWithSuspensionID_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, suspensionID);
		setCurrentAppleEventAndReplyEventWithSuspensionID_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setEventHandler_andSelector_forEventClass_andEventID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEventHandler_andSelector_forEventClass_andEventID_IMetInst(){
		return ((setEventHandler_andSelector_forEventClass_andEventID_IMetInst != null)
	? (setEventHandler_andSelector_forEventClass_andEventID_IMetInst)
	: (setEventHandler_andSelector_forEventClass_andEventID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEventHandler:andSelector:forEventClass:andEventID:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public void setEventHandler_andSelector_forEventClass_andEventID(final com.apple.jobjc.ID handler, final com.apple.jobjc.SEL handleEventSelector, final int eventClass, final int eventID){
			final com.apple.jobjc.Invoke.MsgSend setEventHandler_andSelector_forEventClass_andEventID_IMetInst = get_setEventHandler_andSelector_forEventClass_andEventID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEventHandler_andSelector_forEventClass_andEventID_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, handler);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, handleEventSelector);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, eventClass);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, eventID);
		setEventHandler_andSelector_forEventClass_andEventID_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend suspendCurrentAppleEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_suspendCurrentAppleEvent_IMetInst(){
		return ((suspendCurrentAppleEvent_IMetInst != null)
	? (suspendCurrentAppleEvent_IMetInst)
	: (suspendCurrentAppleEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "suspendCurrentAppleEvent", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventManagerSuspensionIDOpaque suspendCurrentAppleEvent(){
			final com.apple.jobjc.Invoke.MsgSend suspendCurrentAppleEvent_IMetInst = get_suspendCurrentAppleEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		suspendCurrentAppleEvent_IMetInst.init(nativeBuffer, this);
		suspendCurrentAppleEvent_IMetInst.invoke(nativeBuffer);
				final com.apple.jobjc.foundation.NSAppleEventManagerSuspensionIDOpaque returnValue = (com.apple.jobjc.foundation.NSAppleEventManagerSuspensionIDOpaque) new com.apple.jobjc.foundation.NSAppleEventManagerSuspensionIDOpaque(com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
