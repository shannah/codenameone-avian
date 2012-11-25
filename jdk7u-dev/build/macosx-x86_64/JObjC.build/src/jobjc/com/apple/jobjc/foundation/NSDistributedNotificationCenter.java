package com.apple.jobjc.foundation;

public  class NSDistributedNotificationCenter extends com.apple.jobjc.foundation.NSNotificationCenter {
	public NSDistributedNotificationCenter(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDistributedNotificationCenter(final NSDistributedNotificationCenter obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addObserver_selector_name_object_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addObserver_selector_name_object_IMetInst(){
		return ((addObserver_selector_name_object_IMetInst != null)
	? (addObserver_selector_name_object_IMetInst)
	: (addObserver_selector_name_object_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addObserver:selector:name:object:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addObserver_selector_name_object(final com.apple.jobjc.ID observer, final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.foundation.NSString aName, final com.apple.jobjc.foundation.NSString anObject){
			final com.apple.jobjc.Invoke.MsgSend addObserver_selector_name_object_IMetInst = get_addObserver_selector_name_object_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addObserver_selector_name_object_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, observer);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		addObserver_selector_name_object_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addObserver_selector_name_object_suspensionBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addObserver_selector_name_object_suspensionBehavior_IMetInst(){
		return ((addObserver_selector_name_object_suspensionBehavior_IMetInst != null)
	? (addObserver_selector_name_object_suspensionBehavior_IMetInst)
	: (addObserver_selector_name_object_suspensionBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addObserver:selector:name:object:suspensionBehavior:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void addObserver_selector_name_object_suspensionBehavior(final com.apple.jobjc.ID observer, final com.apple.jobjc.SEL selector, final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString object, final long suspensionBehavior){
			final com.apple.jobjc.Invoke.MsgSend addObserver_selector_name_object_suspensionBehavior_IMetInst = get_addObserver_selector_name_object_suspensionBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addObserver_selector_name_object_suspensionBehavior_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, observer);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, selector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, suspensionBehavior);
		addObserver_selector_name_object_suspensionBehavior_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend postNotificationName_object_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_postNotificationName_object_IMetInst(){
		return ((postNotificationName_object_IMetInst != null)
	? (postNotificationName_object_IMetInst)
	: (postNotificationName_object_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "postNotificationName:object:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void postNotificationName_object(final com.apple.jobjc.foundation.NSString aName, final com.apple.jobjc.foundation.NSString anObject){
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

	 public void postNotificationName_object_userInfo(final com.apple.jobjc.foundation.NSString aName, final com.apple.jobjc.foundation.NSString anObject, final com.apple.jobjc.foundation.NSDictionary aUserInfo){
			final com.apple.jobjc.Invoke.MsgSend postNotificationName_object_userInfo_IMetInst = get_postNotificationName_object_userInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		postNotificationName_object_userInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aUserInfo);
		postNotificationName_object_userInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend postNotificationName_object_userInfo_deliverImmediately_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_postNotificationName_object_userInfo_deliverImmediately_IMetInst(){
		return ((postNotificationName_object_userInfo_deliverImmediately_IMetInst != null)
	? (postNotificationName_object_userInfo_deliverImmediately_IMetInst)
	: (postNotificationName_object_userInfo_deliverImmediately_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "postNotificationName:object:userInfo:deliverImmediately:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void postNotificationName_object_userInfo_deliverImmediately(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString object, final com.apple.jobjc.foundation.NSDictionary userInfo, final boolean deliverImmediately){
			final com.apple.jobjc.Invoke.MsgSend postNotificationName_object_userInfo_deliverImmediately_IMetInst = get_postNotificationName_object_userInfo_deliverImmediately_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		postNotificationName_object_userInfo_deliverImmediately_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, userInfo);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, deliverImmediately);
		postNotificationName_object_userInfo_deliverImmediately_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend postNotificationName_object_userInfo_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_postNotificationName_object_userInfo_options_IMetInst(){
		return ((postNotificationName_object_userInfo_options_IMetInst != null)
	? (postNotificationName_object_userInfo_options_IMetInst)
	: (postNotificationName_object_userInfo_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "postNotificationName:object:userInfo:options:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void postNotificationName_object_userInfo_options(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString object, final com.apple.jobjc.foundation.NSDictionary userInfo, final long options){
			final com.apple.jobjc.Invoke.MsgSend postNotificationName_object_userInfo_options_IMetInst = get_postNotificationName_object_userInfo_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		postNotificationName_object_userInfo_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, userInfo);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		postNotificationName_object_userInfo_options_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObserver_name_object_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObserver_name_object_IMetInst(){
		return ((removeObserver_name_object_IMetInst != null)
	? (removeObserver_name_object_IMetInst)
	: (removeObserver_name_object_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObserver:name:object:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObserver_name_object(final com.apple.jobjc.ID observer, final com.apple.jobjc.foundation.NSString aName, final com.apple.jobjc.foundation.NSString anObject){
			final com.apple.jobjc.Invoke.MsgSend removeObserver_name_object_IMetInst = get_removeObserver_name_object_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObserver_name_object_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, observer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		removeObserver_name_object_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSuspended_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSuspended_IMetInst(){
		return ((setSuspended_IMetInst != null)
	? (setSuspended_IMetInst)
	: (setSuspended_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSuspended:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSuspended(final boolean suspended){
			final com.apple.jobjc.Invoke.MsgSend setSuspended_IMetInst = get_setSuspended_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSuspended_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, suspended);
		setSuspended_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend suspended_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_suspended_IMetInst(){
		return ((suspended_IMetInst != null)
	? (suspended_IMetInst)
	: (suspended_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "suspended", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean suspended(){
			final com.apple.jobjc.Invoke.MsgSend suspended_IMetInst = get_suspended_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		suspended_IMetInst.init(nativeBuffer, this);
		suspended_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
