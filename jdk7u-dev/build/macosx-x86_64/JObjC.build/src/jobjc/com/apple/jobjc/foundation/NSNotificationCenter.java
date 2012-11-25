package com.apple.jobjc.foundation;

public  class NSNotificationCenter extends com.apple.jobjc.foundation.NSObject {
	public NSNotificationCenter(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSNotificationCenter(final NSNotificationCenter obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addObserver_selector_name_object_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addObserver_selector_name_object_IMetInst(){
		return ((addObserver_selector_name_object_IMetInst != null)
	? (addObserver_selector_name_object_IMetInst)
	: (addObserver_selector_name_object_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addObserver:selector:name:object:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addObserver_selector_name_object(final com.apple.jobjc.ID observer, final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.foundation.NSString aName, final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend addObserver_selector_name_object_IMetInst = get_addObserver_selector_name_object_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addObserver_selector_name_object_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, observer);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		addObserver_selector_name_object_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addObserverForName_object_queue_usingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addObserverForName_object_queue_usingBlock_IMetInst(){
		return ((addObserverForName_object_queue_usingBlock_IMetInst != null)
	? (addObserverForName_object_queue_usingBlock_IMetInst)
	: (addObserverForName_object_queue_usingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addObserverForName:object:queue:usingBlock:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T addObserverForName_object_queue_usingBlock(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.ID obj, final com.apple.jobjc.foundation.NSOperationQueue queue, final Object /* void(^)(NSNotification*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend addObserverForName_object_queue_usingBlock_IMetInst = get_addObserverForName_object_queue_usingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addObserverForName_object_queue_usingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, queue);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		addObserverForName_object_queue_usingBlock_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend postNotification_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_postNotification_IMetInst(){
		return ((postNotification_IMetInst != null)
	? (postNotification_IMetInst)
	: (postNotification_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "postNotification:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void postNotification(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend postNotification_IMetInst = get_postNotification_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		postNotification_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		postNotification_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend postNotificationName_object_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_postNotificationName_object_IMetInst(){
		return ((postNotificationName_object_IMetInst != null)
	? (postNotificationName_object_IMetInst)
	: (postNotificationName_object_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "postNotificationName:object:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void postNotificationName_object(final com.apple.jobjc.foundation.NSString aName, final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend postNotificationName_object_IMetInst = get_postNotificationName_object_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		postNotificationName_object_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		postNotificationName_object_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend postNotificationName_object_userInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_postNotificationName_object_userInfo_IMetInst(){
		return ((postNotificationName_object_userInfo_IMetInst != null)
	? (postNotificationName_object_userInfo_IMetInst)
	: (postNotificationName_object_userInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "postNotificationName:object:userInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void postNotificationName_object_userInfo(final com.apple.jobjc.foundation.NSString aName, final com.apple.jobjc.ID anObject, final com.apple.jobjc.foundation.NSDictionary aUserInfo){
			final com.apple.jobjc.Invoke.MsgSend postNotificationName_object_userInfo_IMetInst = get_postNotificationName_object_userInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		postNotificationName_object_userInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aUserInfo);
		postNotificationName_object_userInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObserver_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObserver_IMetInst(){
		return ((removeObserver_IMetInst != null)
	? (removeObserver_IMetInst)
	: (removeObserver_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObserver:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObserver(final com.apple.jobjc.ID observer){
			final com.apple.jobjc.Invoke.MsgSend removeObserver_IMetInst = get_removeObserver_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObserver_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, observer);
		removeObserver_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObserver_name_object_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObserver_name_object_IMetInst(){
		return ((removeObserver_name_object_IMetInst != null)
	? (removeObserver_name_object_IMetInst)
	: (removeObserver_name_object_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObserver:name:object:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObserver_name_object(final com.apple.jobjc.ID observer, final com.apple.jobjc.foundation.NSString aName, final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend removeObserver_name_object_IMetInst = get_removeObserver_name_object_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObserver_name_object_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, observer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		removeObserver_name_object_IMetInst.invoke(nativeBuffer);
		
		
	}

}
