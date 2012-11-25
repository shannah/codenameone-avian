package com.apple.jobjc.appkit;

public final class NSObjectCategoryClass extends com.apple.jobjc.foundation.NSObjectClass {
	NSObjectCategoryClass(com.apple.jobjc.JObjCRuntime runtime) {
		super("NSObject", runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend defaultAnimationForKey_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultAnimationForKey_CMetInst(){
		return ((defaultAnimationForKey_CMetInst != null)
	? (defaultAnimationForKey_CMetInst)
	: (defaultAnimationForKey_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultAnimationForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T defaultAnimationForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend defaultAnimationForKey_CMetInst = get_defaultAnimationForKey_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultAnimationForKey_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		defaultAnimationForKey_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultPlaceholderForMarker_withBinding_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultPlaceholderForMarker_withBinding_CMetInst(){
		return ((defaultPlaceholderForMarker_withBinding_CMetInst != null)
	? (defaultPlaceholderForMarker_withBinding_CMetInst)
	: (defaultPlaceholderForMarker_withBinding_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultPlaceholderForMarker:withBinding:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T defaultPlaceholderForMarker_withBinding(final com.apple.jobjc.ID marker, final com.apple.jobjc.foundation.NSString binding){
			final com.apple.jobjc.Invoke.MsgSend defaultPlaceholderForMarker_withBinding_CMetInst = get_defaultPlaceholderForMarker_withBinding_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultPlaceholderForMarker_withBinding_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, binding);
		defaultPlaceholderForMarker_withBinding_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend exposeBinding_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_exposeBinding_CMetInst(){
		return ((exposeBinding_CMetInst != null)
	? (exposeBinding_CMetInst)
	: (exposeBinding_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "exposeBinding:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void exposeBinding(final com.apple.jobjc.foundation.NSString binding){
			final com.apple.jobjc.Invoke.MsgSend exposeBinding_CMetInst = get_exposeBinding_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		exposeBinding_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, binding);
		exposeBinding_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend readableTypesForPasteboard_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readableTypesForPasteboard_CMetInst(){
		return ((readableTypesForPasteboard_CMetInst != null)
	? (readableTypesForPasteboard_CMetInst)
	: (readableTypesForPasteboard_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readableTypesForPasteboard:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray readableTypesForPasteboard(final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend readableTypesForPasteboard_CMetInst = get_readableTypesForPasteboard_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readableTypesForPasteboard_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		readableTypesForPasteboard_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readingOptionsForType_pasteboard_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readingOptionsForType_pasteboard_CMetInst(){
		return ((readingOptionsForType_pasteboard_CMetInst != null)
	? (readingOptionsForType_pasteboard_CMetInst)
	: (readingOptionsForType_pasteboard_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readingOptionsForType:pasteboard:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long readingOptionsForType_pasteboard(final com.apple.jobjc.foundation.NSString type, final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend readingOptionsForType_pasteboard_CMetInst = get_readingOptionsForType_pasteboard_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readingOptionsForType_pasteboard_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		readingOptionsForType_pasteboard_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend restoreWindowWithIdentifier_state_completionHandler_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_restoreWindowWithIdentifier_state_completionHandler_CMetInst(){
		return ((restoreWindowWithIdentifier_state_completionHandler_CMetInst != null)
	? (restoreWindowWithIdentifier_state_completionHandler_CMetInst)
	: (restoreWindowWithIdentifier_state_completionHandler_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "restoreWindowWithIdentifier:state:completionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void restoreWindowWithIdentifier_state_completionHandler(final com.apple.jobjc.foundation.NSString identifier, final com.apple.jobjc.foundation.NSCoder state, final Object /* void(^)(NSWindow*,NSError*) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend restoreWindowWithIdentifier_state_completionHandler_CMetInst = get_restoreWindowWithIdentifier_state_completionHandler_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		restoreWindowWithIdentifier_state_completionHandler_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, identifier);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, state);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		restoreWindowWithIdentifier_state_completionHandler_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultPlaceholder_forMarker_withBinding_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultPlaceholder_forMarker_withBinding_CMetInst(){
		return ((setDefaultPlaceholder_forMarker_withBinding_CMetInst != null)
	? (setDefaultPlaceholder_forMarker_withBinding_CMetInst)
	: (setDefaultPlaceholder_forMarker_withBinding_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultPlaceholder:forMarker:withBinding:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDefaultPlaceholder_forMarker_withBinding(final com.apple.jobjc.ID placeholder, final com.apple.jobjc.ID marker, final com.apple.jobjc.foundation.NSString binding){
			final com.apple.jobjc.Invoke.MsgSend setDefaultPlaceholder_forMarker_withBinding_CMetInst = get_setDefaultPlaceholder_forMarker_withBinding_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultPlaceholder_forMarker_withBinding_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, placeholder);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, binding);
		setDefaultPlaceholder_forMarker_withBinding_CMetInst.invoke(nativeBuffer);
		
		
	}

}
