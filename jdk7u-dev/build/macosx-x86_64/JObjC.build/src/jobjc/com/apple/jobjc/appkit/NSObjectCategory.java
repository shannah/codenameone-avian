package com.apple.jobjc.appkit;

public  class NSObjectCategory extends com.apple.jobjc.foundation.NSObject {
	public NSObjectCategory(final com.apple.jobjc.foundation.NSObject obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	public NSObjectCategory(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSObjectCategory(final NSObjectCategory obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend accessibilityActionDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessibilityActionDescription_IMetInst(){
		return ((accessibilityActionDescription_IMetInst != null)
	? (accessibilityActionDescription_IMetInst)
	: (accessibilityActionDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessibilityActionDescription:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString accessibilityActionDescription(final com.apple.jobjc.foundation.NSString action){
			final com.apple.jobjc.Invoke.MsgSend accessibilityActionDescription_IMetInst = get_accessibilityActionDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessibilityActionDescription_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, action);
		accessibilityActionDescription_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend accessibilityActionNames_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessibilityActionNames_IMetInst(){
		return ((accessibilityActionNames_IMetInst != null)
	? (accessibilityActionNames_IMetInst)
	: (accessibilityActionNames_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessibilityActionNames", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray accessibilityActionNames(){
			final com.apple.jobjc.Invoke.MsgSend accessibilityActionNames_IMetInst = get_accessibilityActionNames_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessibilityActionNames_IMetInst.init(nativeBuffer, this);
		accessibilityActionNames_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend accessibilityArrayAttributeCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessibilityArrayAttributeCount_IMetInst(){
		return ((accessibilityArrayAttributeCount_IMetInst != null)
	? (accessibilityArrayAttributeCount_IMetInst)
	: (accessibilityArrayAttributeCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessibilityArrayAttributeCount:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long accessibilityArrayAttributeCount(final com.apple.jobjc.foundation.NSString attribute){
			final com.apple.jobjc.Invoke.MsgSend accessibilityArrayAttributeCount_IMetInst = get_accessibilityArrayAttributeCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessibilityArrayAttributeCount_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attribute);
		accessibilityArrayAttributeCount_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend accessibilityArrayAttributeValues_index_maxCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessibilityArrayAttributeValues_index_maxCount_IMetInst(){
		return ((accessibilityArrayAttributeValues_index_maxCount_IMetInst != null)
	? (accessibilityArrayAttributeValues_index_maxCount_IMetInst)
	: (accessibilityArrayAttributeValues_index_maxCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessibilityArrayAttributeValues:index:maxCount:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSArray accessibilityArrayAttributeValues_index_maxCount(final com.apple.jobjc.foundation.NSString attribute, final long index, final long maxCount){
			final com.apple.jobjc.Invoke.MsgSend accessibilityArrayAttributeValues_index_maxCount_IMetInst = get_accessibilityArrayAttributeValues_index_maxCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessibilityArrayAttributeValues_index_maxCount_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attribute);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, maxCount);
		accessibilityArrayAttributeValues_index_maxCount_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend accessibilityAttributeNames_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessibilityAttributeNames_IMetInst(){
		return ((accessibilityAttributeNames_IMetInst != null)
	? (accessibilityAttributeNames_IMetInst)
	: (accessibilityAttributeNames_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessibilityAttributeNames", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray accessibilityAttributeNames(){
			final com.apple.jobjc.Invoke.MsgSend accessibilityAttributeNames_IMetInst = get_accessibilityAttributeNames_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessibilityAttributeNames_IMetInst.init(nativeBuffer, this);
		accessibilityAttributeNames_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend accessibilityAttributeValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessibilityAttributeValue_IMetInst(){
		return ((accessibilityAttributeValue_IMetInst != null)
	? (accessibilityAttributeValue_IMetInst)
	: (accessibilityAttributeValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessibilityAttributeValue:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T accessibilityAttributeValue(final com.apple.jobjc.foundation.NSString attribute){
			final com.apple.jobjc.Invoke.MsgSend accessibilityAttributeValue_IMetInst = get_accessibilityAttributeValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessibilityAttributeValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attribute);
		accessibilityAttributeValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend accessibilityAttributeValue_forParameter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessibilityAttributeValue_forParameter_IMetInst(){
		return ((accessibilityAttributeValue_forParameter_IMetInst != null)
	? (accessibilityAttributeValue_forParameter_IMetInst)
	: (accessibilityAttributeValue_forParameter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessibilityAttributeValue:forParameter:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T accessibilityAttributeValue_forParameter(final com.apple.jobjc.foundation.NSString attribute, final com.apple.jobjc.ID parameter){
			final com.apple.jobjc.Invoke.MsgSend accessibilityAttributeValue_forParameter_IMetInst = get_accessibilityAttributeValue_forParameter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessibilityAttributeValue_forParameter_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attribute);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parameter);
		accessibilityAttributeValue_forParameter_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend accessibilityFocusedUIElement_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessibilityFocusedUIElement_IMetInst(){
		return ((accessibilityFocusedUIElement_IMetInst != null)
	? (accessibilityFocusedUIElement_IMetInst)
	: (accessibilityFocusedUIElement_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessibilityFocusedUIElement", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T accessibilityFocusedUIElement(){
			final com.apple.jobjc.Invoke.MsgSend accessibilityFocusedUIElement_IMetInst = get_accessibilityFocusedUIElement_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessibilityFocusedUIElement_IMetInst.init(nativeBuffer, this);
		accessibilityFocusedUIElement_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend accessibilityHitTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessibilityHitTest_IMetInst(){
		return ((accessibilityHitTest_IMetInst != null)
	? (accessibilityHitTest_IMetInst)
	: (accessibilityHitTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessibilityHitTest:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public <T extends com.apple.jobjc.ID> T accessibilityHitTest(final com.apple.jobjc.foundation.NSPoint point){
			final com.apple.jobjc.Invoke.MsgSend accessibilityHitTest_IMetInst = get_accessibilityHitTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessibilityHitTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		accessibilityHitTest_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend accessibilityIndexOfChild_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessibilityIndexOfChild_IMetInst(){
		return ((accessibilityIndexOfChild_IMetInst != null)
	? (accessibilityIndexOfChild_IMetInst)
	: (accessibilityIndexOfChild_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessibilityIndexOfChild:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long accessibilityIndexOfChild(final com.apple.jobjc.ID child){
			final com.apple.jobjc.Invoke.MsgSend accessibilityIndexOfChild_IMetInst = get_accessibilityIndexOfChild_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessibilityIndexOfChild_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, child);
		accessibilityIndexOfChild_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend accessibilityIsAttributeSettable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessibilityIsAttributeSettable_IMetInst(){
		return ((accessibilityIsAttributeSettable_IMetInst != null)
	? (accessibilityIsAttributeSettable_IMetInst)
	: (accessibilityIsAttributeSettable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessibilityIsAttributeSettable:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean accessibilityIsAttributeSettable(final com.apple.jobjc.foundation.NSString attribute){
			final com.apple.jobjc.Invoke.MsgSend accessibilityIsAttributeSettable_IMetInst = get_accessibilityIsAttributeSettable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessibilityIsAttributeSettable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attribute);
		accessibilityIsAttributeSettable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend accessibilityIsIgnored_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessibilityIsIgnored_IMetInst(){
		return ((accessibilityIsIgnored_IMetInst != null)
	? (accessibilityIsIgnored_IMetInst)
	: (accessibilityIsIgnored_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessibilityIsIgnored", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean accessibilityIsIgnored(){
			final com.apple.jobjc.Invoke.MsgSend accessibilityIsIgnored_IMetInst = get_accessibilityIsIgnored_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessibilityIsIgnored_IMetInst.init(nativeBuffer, this);
		accessibilityIsIgnored_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend accessibilityParameterizedAttributeNames_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessibilityParameterizedAttributeNames_IMetInst(){
		return ((accessibilityParameterizedAttributeNames_IMetInst != null)
	? (accessibilityParameterizedAttributeNames_IMetInst)
	: (accessibilityParameterizedAttributeNames_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessibilityParameterizedAttributeNames", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray accessibilityParameterizedAttributeNames(){
			final com.apple.jobjc.Invoke.MsgSend accessibilityParameterizedAttributeNames_IMetInst = get_accessibilityParameterizedAttributeNames_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessibilityParameterizedAttributeNames_IMetInst.init(nativeBuffer, this);
		accessibilityParameterizedAttributeNames_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend accessibilityPerformAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessibilityPerformAction_IMetInst(){
		return ((accessibilityPerformAction_IMetInst != null)
	? (accessibilityPerformAction_IMetInst)
	: (accessibilityPerformAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessibilityPerformAction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void accessibilityPerformAction(final com.apple.jobjc.foundation.NSString action){
			final com.apple.jobjc.Invoke.MsgSend accessibilityPerformAction_IMetInst = get_accessibilityPerformAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessibilityPerformAction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, action);
		accessibilityPerformAction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend accessibilitySetOverrideValue_forAttribute_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessibilitySetOverrideValue_forAttribute_IMetInst(){
		return ((accessibilitySetOverrideValue_forAttribute_IMetInst != null)
	? (accessibilitySetOverrideValue_forAttribute_IMetInst)
	: (accessibilitySetOverrideValue_forAttribute_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessibilitySetOverrideValue:forAttribute:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean accessibilitySetOverrideValue_forAttribute(final com.apple.jobjc.ID value, final com.apple.jobjc.foundation.NSString attribute){
			final com.apple.jobjc.Invoke.MsgSend accessibilitySetOverrideValue_forAttribute_IMetInst = get_accessibilitySetOverrideValue_forAttribute_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessibilitySetOverrideValue_forAttribute_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attribute);
		accessibilitySetOverrideValue_forAttribute_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend accessibilitySetValue_forAttribute_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessibilitySetValue_forAttribute_IMetInst(){
		return ((accessibilitySetValue_forAttribute_IMetInst != null)
	? (accessibilitySetValue_forAttribute_IMetInst)
	: (accessibilitySetValue_forAttribute_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessibilitySetValue:forAttribute:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void accessibilitySetValue_forAttribute(final com.apple.jobjc.ID value, final com.apple.jobjc.foundation.NSString attribute){
			final com.apple.jobjc.Invoke.MsgSend accessibilitySetValue_forAttribute_IMetInst = get_accessibilitySetValue_forAttribute_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessibilitySetValue_forAttribute_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attribute);
		accessibilitySetValue_forAttribute_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend action_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_action_IMetInst(){
		return ((action_IMetInst != null)
	? (action_IMetInst)
	: (action_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "action", com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public com.apple.jobjc.SEL action(){
			final com.apple.jobjc.Invoke.MsgSend action_IMetInst = get_action_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		action_IMetInst.init(nativeBuffer, this);
		action_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.SEL returnValue = (com.apple.jobjc.SEL) (com.apple.jobjc.Coder.SELCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend activeConversationChanged_toNewConversation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_activeConversationChanged_toNewConversation_IMetInst(){
		return ((activeConversationChanged_toNewConversation_IMetInst != null)
	? (activeConversationChanged_toNewConversation_IMetInst)
	: (activeConversationChanged_toNewConversation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "activeConversationChanged:toNewConversation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void activeConversationChanged_toNewConversation(final com.apple.jobjc.ID sender, final long newConversation){
			final com.apple.jobjc.Invoke.MsgSend activeConversationChanged_toNewConversation_IMetInst = get_activeConversationChanged_toNewConversation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		activeConversationChanged_toNewConversation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, newConversation);
		activeConversationChanged_toNewConversation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend activeConversationWillChange_fromOldConversation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_activeConversationWillChange_fromOldConversation_IMetInst(){
		return ((activeConversationWillChange_fromOldConversation_IMetInst != null)
	? (activeConversationWillChange_fromOldConversation_IMetInst)
	: (activeConversationWillChange_fromOldConversation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "activeConversationWillChange:fromOldConversation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void activeConversationWillChange_fromOldConversation(final com.apple.jobjc.ID sender, final long oldConversation){
			final com.apple.jobjc.Invoke.MsgSend activeConversationWillChange_fromOldConversation_IMetInst = get_activeConversationWillChange_fromOldConversation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		activeConversationWillChange_fromOldConversation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, oldConversation);
		activeConversationWillChange_fromOldConversation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend alertShowHelp_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alertShowHelp_IMetInst(){
		return ((alertShowHelp_IMetInst != null)
	? (alertShowHelp_IMetInst)
	: (alertShowHelp_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alertShowHelp:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean alertShowHelp(final com.apple.jobjc.appkit.NSAlert alert){
			final com.apple.jobjc.Invoke.MsgSend alertShowHelp_IMetInst = get_alertShowHelp_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alertShowHelp_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, alert);
		alertShowHelp_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsMultipleSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsMultipleSelection_IMetInst(){
		return ((allowsMultipleSelection_IMetInst != null)
	? (allowsMultipleSelection_IMetInst)
	: (allowsMultipleSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsMultipleSelection", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsMultipleSelection(){
			final com.apple.jobjc.Invoke.MsgSend allowsMultipleSelection_IMetInst = get_allowsMultipleSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsMultipleSelection_IMetInst.init(nativeBuffer, this);
		allowsMultipleSelection_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend alphaControlAddedOrRemoved_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alphaControlAddedOrRemoved_IMetInst(){
		return ((alphaControlAddedOrRemoved_IMetInst != null)
	? (alphaControlAddedOrRemoved_IMetInst)
	: (alphaControlAddedOrRemoved_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alphaControlAddedOrRemoved:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void alphaControlAddedOrRemoved(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend alphaControlAddedOrRemoved_IMetInst = get_alphaControlAddedOrRemoved_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alphaControlAddedOrRemoved_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		alphaControlAddedOrRemoved_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend animatesToDestination_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_animatesToDestination_IMetInst(){
		return ((animatesToDestination_IMetInst != null)
	? (animatesToDestination_IMetInst)
	: (animatesToDestination_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "animatesToDestination", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean animatesToDestination(){
			final com.apple.jobjc.Invoke.MsgSend animatesToDestination_IMetInst = get_animatesToDestination_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		animatesToDestination_IMetInst.init(nativeBuffer, this);
		animatesToDestination_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend animation_didReachProgressMark_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_animation_didReachProgressMark_IMetInst(){
		return ((animation_didReachProgressMark_IMetInst != null)
	? (animation_didReachProgressMark_IMetInst)
	: (animation_didReachProgressMark_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "animation:didReachProgressMark:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public void animation_didReachProgressMark(final com.apple.jobjc.appkit.NSAnimation animation, final float progress){
			final com.apple.jobjc.Invoke.MsgSend animation_didReachProgressMark_IMetInst = get_animation_didReachProgressMark_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		animation_didReachProgressMark_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, animation);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, progress);
		animation_didReachProgressMark_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend animation_valueForProgress_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_animation_valueForProgress_IMetInst(){
		return ((animation_valueForProgress_IMetInst != null)
	? (animation_valueForProgress_IMetInst)
	: (animation_valueForProgress_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "animation:valueForProgress:", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public float animation_valueForProgress(final com.apple.jobjc.appkit.NSAnimation animation, final float progress){
			final com.apple.jobjc.Invoke.MsgSend animation_valueForProgress_IMetInst = get_animation_valueForProgress_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		animation_valueForProgress_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, animation);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, progress);
		animation_valueForProgress_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend animationDidEnd_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_animationDidEnd_IMetInst(){
		return ((animationDidEnd_IMetInst != null)
	? (animationDidEnd_IMetInst)
	: (animationDidEnd_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "animationDidEnd:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void animationDidEnd(final com.apple.jobjc.appkit.NSAnimation animation){
			final com.apple.jobjc.Invoke.MsgSend animationDidEnd_IMetInst = get_animationDidEnd_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		animationDidEnd_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, animation);
		animationDidEnd_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend animationDidStop_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_animationDidStop_IMetInst(){
		return ((animationDidStop_IMetInst != null)
	? (animationDidStop_IMetInst)
	: (animationDidStop_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "animationDidStop:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void animationDidStop(final com.apple.jobjc.appkit.NSAnimation animation){
			final com.apple.jobjc.Invoke.MsgSend animationDidStop_IMetInst = get_animationDidStop_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		animationDidStop_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, animation);
		animationDidStop_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend animationForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_animationForKey_IMetInst(){
		return ((animationForKey_IMetInst != null)
	? (animationForKey_IMetInst)
	: (animationForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "animationForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T animationForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend animationForKey_IMetInst = get_animationForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		animationForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		animationForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend animationShouldStart_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_animationShouldStart_IMetInst(){
		return ((animationShouldStart_IMetInst != null)
	? (animationShouldStart_IMetInst)
	: (animationShouldStart_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "animationShouldStart:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean animationShouldStart(final com.apple.jobjc.appkit.NSAnimation animation){
			final com.apple.jobjc.Invoke.MsgSend animationShouldStart_IMetInst = get_animationShouldStart_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		animationShouldStart_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, animation);
		animationShouldStart_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend animations_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_animations_IMetInst(){
		return ((animations_IMetInst != null)
	? (animations_IMetInst)
	: (animations_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "animations", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary animations(){
			final com.apple.jobjc.Invoke.MsgSend animations_IMetInst = get_animations_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		animations_IMetInst.init(nativeBuffer, this);
		animations_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend animator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_animator_IMetInst(){
		return ((animator_IMetInst != null)
	? (animator_IMetInst)
	: (animator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "animator", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T animator(){
			final com.apple.jobjc.Invoke.MsgSend animator_IMetInst = get_animator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		animator_IMetInst.init(nativeBuffer, this);
		animator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend application_delegateHandlesKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_application_delegateHandlesKey_IMetInst(){
		return ((application_delegateHandlesKey_IMetInst != null)
	? (application_delegateHandlesKey_IMetInst)
	: (application_delegateHandlesKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "application:delegateHandlesKey:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean application_delegateHandlesKey(final com.apple.jobjc.appkit.NSApplication sender, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend application_delegateHandlesKey_IMetInst = get_application_delegateHandlesKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		application_delegateHandlesKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		application_delegateHandlesKey_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend application_didDecodeRestorableState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_application_didDecodeRestorableState_IMetInst(){
		return ((application_didDecodeRestorableState_IMetInst != null)
	? (application_didDecodeRestorableState_IMetInst)
	: (application_didDecodeRestorableState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "application:didDecodeRestorableState:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void application_didDecodeRestorableState(final com.apple.jobjc.appkit.NSApplication app, final com.apple.jobjc.foundation.NSCoder coder){
			final com.apple.jobjc.Invoke.MsgSend application_didDecodeRestorableState_IMetInst = get_application_didDecodeRestorableState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		application_didDecodeRestorableState_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, app);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, coder);
		application_didDecodeRestorableState_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend application_didFailToRegisterForRemoteNotificationsWithError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_application_didFailToRegisterForRemoteNotificationsWithError_IMetInst(){
		return ((application_didFailToRegisterForRemoteNotificationsWithError_IMetInst != null)
	? (application_didFailToRegisterForRemoteNotificationsWithError_IMetInst)
	: (application_didFailToRegisterForRemoteNotificationsWithError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "application:didFailToRegisterForRemoteNotificationsWithError:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void application_didFailToRegisterForRemoteNotificationsWithError(final com.apple.jobjc.appkit.NSApplication application, final com.apple.jobjc.foundation.NSError error){
			final com.apple.jobjc.Invoke.MsgSend application_didFailToRegisterForRemoteNotificationsWithError_IMetInst = get_application_didFailToRegisterForRemoteNotificationsWithError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		application_didFailToRegisterForRemoteNotificationsWithError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, application);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		application_didFailToRegisterForRemoteNotificationsWithError_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend application_didReceiveRemoteNotification_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_application_didReceiveRemoteNotification_IMetInst(){
		return ((application_didReceiveRemoteNotification_IMetInst != null)
	? (application_didReceiveRemoteNotification_IMetInst)
	: (application_didReceiveRemoteNotification_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "application:didReceiveRemoteNotification:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void application_didReceiveRemoteNotification(final com.apple.jobjc.appkit.NSApplication application, final com.apple.jobjc.foundation.NSDictionary userInfo){
			final com.apple.jobjc.Invoke.MsgSend application_didReceiveRemoteNotification_IMetInst = get_application_didReceiveRemoteNotification_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		application_didReceiveRemoteNotification_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, application);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, userInfo);
		application_didReceiveRemoteNotification_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend application_didRegisterForRemoteNotificationsWithDeviceToken_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_application_didRegisterForRemoteNotificationsWithDeviceToken_IMetInst(){
		return ((application_didRegisterForRemoteNotificationsWithDeviceToken_IMetInst != null)
	? (application_didRegisterForRemoteNotificationsWithDeviceToken_IMetInst)
	: (application_didRegisterForRemoteNotificationsWithDeviceToken_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "application:didRegisterForRemoteNotificationsWithDeviceToken:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void application_didRegisterForRemoteNotificationsWithDeviceToken(final com.apple.jobjc.appkit.NSApplication application, final com.apple.jobjc.foundation.NSData deviceToken){
			final com.apple.jobjc.Invoke.MsgSend application_didRegisterForRemoteNotificationsWithDeviceToken_IMetInst = get_application_didRegisterForRemoteNotificationsWithDeviceToken_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		application_didRegisterForRemoteNotificationsWithDeviceToken_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, application);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, deviceToken);
		application_didRegisterForRemoteNotificationsWithDeviceToken_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend application_openFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_application_openFile_IMetInst(){
		return ((application_openFile_IMetInst != null)
	? (application_openFile_IMetInst)
	: (application_openFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "application:openFile:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean application_openFile(final com.apple.jobjc.appkit.NSApplication sender, final com.apple.jobjc.foundation.NSString filename){
			final com.apple.jobjc.Invoke.MsgSend application_openFile_IMetInst = get_application_openFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		application_openFile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filename);
		application_openFile_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend application_openFileWithoutUI_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_application_openFileWithoutUI_IMetInst(){
		return ((application_openFileWithoutUI_IMetInst != null)
	? (application_openFileWithoutUI_IMetInst)
	: (application_openFileWithoutUI_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "application:openFileWithoutUI:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean application_openFileWithoutUI(final com.apple.jobjc.ID sender, final com.apple.jobjc.foundation.NSString filename){
			final com.apple.jobjc.Invoke.MsgSend application_openFileWithoutUI_IMetInst = get_application_openFileWithoutUI_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		application_openFileWithoutUI_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filename);
		application_openFileWithoutUI_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend application_openFiles_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_application_openFiles_IMetInst(){
		return ((application_openFiles_IMetInst != null)
	? (application_openFiles_IMetInst)
	: (application_openFiles_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "application:openFiles:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void application_openFiles(final com.apple.jobjc.appkit.NSApplication sender, final com.apple.jobjc.foundation.NSArray filenames){
			final com.apple.jobjc.Invoke.MsgSend application_openFiles_IMetInst = get_application_openFiles_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		application_openFiles_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filenames);
		application_openFiles_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend application_openTempFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_application_openTempFile_IMetInst(){
		return ((application_openTempFile_IMetInst != null)
	? (application_openTempFile_IMetInst)
	: (application_openTempFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "application:openTempFile:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean application_openTempFile(final com.apple.jobjc.appkit.NSApplication sender, final com.apple.jobjc.foundation.NSString filename){
			final com.apple.jobjc.Invoke.MsgSend application_openTempFile_IMetInst = get_application_openTempFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		application_openTempFile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filename);
		application_openTempFile_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend application_printFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_application_printFile_IMetInst(){
		return ((application_printFile_IMetInst != null)
	? (application_printFile_IMetInst)
	: (application_printFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "application:printFile:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean application_printFile(final com.apple.jobjc.appkit.NSApplication sender, final com.apple.jobjc.foundation.NSString filename){
			final com.apple.jobjc.Invoke.MsgSend application_printFile_IMetInst = get_application_printFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		application_printFile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filename);
		application_printFile_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend application_printFiles_withSettings_showPrintPanels_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_application_printFiles_withSettings_showPrintPanels_IMetInst(){
		return ((application_printFiles_withSettings_showPrintPanels_IMetInst != null)
	? (application_printFiles_withSettings_showPrintPanels_IMetInst)
	: (application_printFiles_withSettings_showPrintPanels_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "application:printFiles:withSettings:showPrintPanels:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public long application_printFiles_withSettings_showPrintPanels(final com.apple.jobjc.appkit.NSApplication application, final com.apple.jobjc.foundation.NSArray fileNames, final com.apple.jobjc.foundation.NSDictionary printSettings, final boolean showPrintPanels){
			final com.apple.jobjc.Invoke.MsgSend application_printFiles_withSettings_showPrintPanels_IMetInst = get_application_printFiles_withSettings_showPrintPanels_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		application_printFiles_withSettings_showPrintPanels_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, application);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileNames);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, printSettings);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, showPrintPanels);
		application_printFiles_withSettings_showPrintPanels_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend application_willEncodeRestorableState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_application_willEncodeRestorableState_IMetInst(){
		return ((application_willEncodeRestorableState_IMetInst != null)
	? (application_willEncodeRestorableState_IMetInst)
	: (application_willEncodeRestorableState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "application:willEncodeRestorableState:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void application_willEncodeRestorableState(final com.apple.jobjc.appkit.NSApplication app, final com.apple.jobjc.foundation.NSCoder coder){
			final com.apple.jobjc.Invoke.MsgSend application_willEncodeRestorableState_IMetInst = get_application_willEncodeRestorableState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		application_willEncodeRestorableState_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, app);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, coder);
		application_willEncodeRestorableState_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend application_willPresentError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_application_willPresentError_IMetInst(){
		return ((application_willPresentError_IMetInst != null)
	? (application_willPresentError_IMetInst)
	: (application_willPresentError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "application:willPresentError:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSError application_willPresentError(final com.apple.jobjc.appkit.NSApplication application, final com.apple.jobjc.foundation.NSError error){
			final com.apple.jobjc.Invoke.MsgSend application_willPresentError_IMetInst = get_application_willPresentError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		application_willPresentError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, application);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		application_willPresentError_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSError returnValue = (com.apple.jobjc.foundation.NSError) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationDidBecomeActive_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationDidBecomeActive_IMetInst(){
		return ((applicationDidBecomeActive_IMetInst != null)
	? (applicationDidBecomeActive_IMetInst)
	: (applicationDidBecomeActive_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationDidBecomeActive:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void applicationDidBecomeActive(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend applicationDidBecomeActive_IMetInst = get_applicationDidBecomeActive_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationDidBecomeActive_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		applicationDidBecomeActive_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationDidChangeScreenParameters_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationDidChangeScreenParameters_IMetInst(){
		return ((applicationDidChangeScreenParameters_IMetInst != null)
	? (applicationDidChangeScreenParameters_IMetInst)
	: (applicationDidChangeScreenParameters_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationDidChangeScreenParameters:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void applicationDidChangeScreenParameters(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend applicationDidChangeScreenParameters_IMetInst = get_applicationDidChangeScreenParameters_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationDidChangeScreenParameters_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		applicationDidChangeScreenParameters_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationDidFinishLaunching_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationDidFinishLaunching_IMetInst(){
		return ((applicationDidFinishLaunching_IMetInst != null)
	? (applicationDidFinishLaunching_IMetInst)
	: (applicationDidFinishLaunching_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationDidFinishLaunching:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void applicationDidFinishLaunching(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend applicationDidFinishLaunching_IMetInst = get_applicationDidFinishLaunching_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationDidFinishLaunching_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		applicationDidFinishLaunching_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationDidHide_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationDidHide_IMetInst(){
		return ((applicationDidHide_IMetInst != null)
	? (applicationDidHide_IMetInst)
	: (applicationDidHide_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationDidHide:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void applicationDidHide(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend applicationDidHide_IMetInst = get_applicationDidHide_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationDidHide_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		applicationDidHide_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationDidResignActive_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationDidResignActive_IMetInst(){
		return ((applicationDidResignActive_IMetInst != null)
	? (applicationDidResignActive_IMetInst)
	: (applicationDidResignActive_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationDidResignActive:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void applicationDidResignActive(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend applicationDidResignActive_IMetInst = get_applicationDidResignActive_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationDidResignActive_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		applicationDidResignActive_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationDidUnhide_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationDidUnhide_IMetInst(){
		return ((applicationDidUnhide_IMetInst != null)
	? (applicationDidUnhide_IMetInst)
	: (applicationDidUnhide_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationDidUnhide:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void applicationDidUnhide(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend applicationDidUnhide_IMetInst = get_applicationDidUnhide_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationDidUnhide_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		applicationDidUnhide_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationDidUpdate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationDidUpdate_IMetInst(){
		return ((applicationDidUpdate_IMetInst != null)
	? (applicationDidUpdate_IMetInst)
	: (applicationDidUpdate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationDidUpdate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void applicationDidUpdate(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend applicationDidUpdate_IMetInst = get_applicationDidUpdate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationDidUpdate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		applicationDidUpdate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationDockMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationDockMenu_IMetInst(){
		return ((applicationDockMenu_IMetInst != null)
	? (applicationDockMenu_IMetInst)
	: (applicationDockMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationDockMenu:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu applicationDockMenu(final com.apple.jobjc.appkit.NSApplication sender){
			final com.apple.jobjc.Invoke.MsgSend applicationDockMenu_IMetInst = get_applicationDockMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationDockMenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		applicationDockMenu_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationOpenUntitledFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationOpenUntitledFile_IMetInst(){
		return ((applicationOpenUntitledFile_IMetInst != null)
	? (applicationOpenUntitledFile_IMetInst)
	: (applicationOpenUntitledFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationOpenUntitledFile:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean applicationOpenUntitledFile(final com.apple.jobjc.appkit.NSApplication sender){
			final com.apple.jobjc.Invoke.MsgSend applicationOpenUntitledFile_IMetInst = get_applicationOpenUntitledFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationOpenUntitledFile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		applicationOpenUntitledFile_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationShouldHandleReopen_hasVisibleWindows_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationShouldHandleReopen_hasVisibleWindows_IMetInst(){
		return ((applicationShouldHandleReopen_hasVisibleWindows_IMetInst != null)
	? (applicationShouldHandleReopen_hasVisibleWindows_IMetInst)
	: (applicationShouldHandleReopen_hasVisibleWindows_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationShouldHandleReopen:hasVisibleWindows:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean applicationShouldHandleReopen_hasVisibleWindows(final com.apple.jobjc.appkit.NSApplication sender, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend applicationShouldHandleReopen_hasVisibleWindows_IMetInst = get_applicationShouldHandleReopen_hasVisibleWindows_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationShouldHandleReopen_hasVisibleWindows_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		applicationShouldHandleReopen_hasVisibleWindows_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationShouldOpenUntitledFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationShouldOpenUntitledFile_IMetInst(){
		return ((applicationShouldOpenUntitledFile_IMetInst != null)
	? (applicationShouldOpenUntitledFile_IMetInst)
	: (applicationShouldOpenUntitledFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationShouldOpenUntitledFile:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean applicationShouldOpenUntitledFile(final com.apple.jobjc.appkit.NSApplication sender){
			final com.apple.jobjc.Invoke.MsgSend applicationShouldOpenUntitledFile_IMetInst = get_applicationShouldOpenUntitledFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationShouldOpenUntitledFile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		applicationShouldOpenUntitledFile_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationShouldTerminate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationShouldTerminate_IMetInst(){
		return ((applicationShouldTerminate_IMetInst != null)
	? (applicationShouldTerminate_IMetInst)
	: (applicationShouldTerminate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationShouldTerminate:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long applicationShouldTerminate(final com.apple.jobjc.appkit.NSApplication sender){
			final com.apple.jobjc.Invoke.MsgSend applicationShouldTerminate_IMetInst = get_applicationShouldTerminate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationShouldTerminate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		applicationShouldTerminate_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationShouldTerminateAfterLastWindowClosed_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationShouldTerminateAfterLastWindowClosed_IMetInst(){
		return ((applicationShouldTerminateAfterLastWindowClosed_IMetInst != null)
	? (applicationShouldTerminateAfterLastWindowClosed_IMetInst)
	: (applicationShouldTerminateAfterLastWindowClosed_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationShouldTerminateAfterLastWindowClosed:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean applicationShouldTerminateAfterLastWindowClosed(final com.apple.jobjc.appkit.NSApplication sender){
			final com.apple.jobjc.Invoke.MsgSend applicationShouldTerminateAfterLastWindowClosed_IMetInst = get_applicationShouldTerminateAfterLastWindowClosed_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationShouldTerminateAfterLastWindowClosed_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		applicationShouldTerminateAfterLastWindowClosed_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationWillBecomeActive_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationWillBecomeActive_IMetInst(){
		return ((applicationWillBecomeActive_IMetInst != null)
	? (applicationWillBecomeActive_IMetInst)
	: (applicationWillBecomeActive_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationWillBecomeActive:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void applicationWillBecomeActive(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend applicationWillBecomeActive_IMetInst = get_applicationWillBecomeActive_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationWillBecomeActive_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		applicationWillBecomeActive_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationWillFinishLaunching_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationWillFinishLaunching_IMetInst(){
		return ((applicationWillFinishLaunching_IMetInst != null)
	? (applicationWillFinishLaunching_IMetInst)
	: (applicationWillFinishLaunching_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationWillFinishLaunching:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void applicationWillFinishLaunching(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend applicationWillFinishLaunching_IMetInst = get_applicationWillFinishLaunching_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationWillFinishLaunching_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		applicationWillFinishLaunching_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationWillHide_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationWillHide_IMetInst(){
		return ((applicationWillHide_IMetInst != null)
	? (applicationWillHide_IMetInst)
	: (applicationWillHide_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationWillHide:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void applicationWillHide(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend applicationWillHide_IMetInst = get_applicationWillHide_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationWillHide_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		applicationWillHide_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationWillResignActive_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationWillResignActive_IMetInst(){
		return ((applicationWillResignActive_IMetInst != null)
	? (applicationWillResignActive_IMetInst)
	: (applicationWillResignActive_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationWillResignActive:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void applicationWillResignActive(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend applicationWillResignActive_IMetInst = get_applicationWillResignActive_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationWillResignActive_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		applicationWillResignActive_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationWillTerminate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationWillTerminate_IMetInst(){
		return ((applicationWillTerminate_IMetInst != null)
	? (applicationWillTerminate_IMetInst)
	: (applicationWillTerminate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationWillTerminate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void applicationWillTerminate(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend applicationWillTerminate_IMetInst = get_applicationWillTerminate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationWillTerminate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		applicationWillTerminate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationWillUnhide_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationWillUnhide_IMetInst(){
		return ((applicationWillUnhide_IMetInst != null)
	? (applicationWillUnhide_IMetInst)
	: (applicationWillUnhide_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationWillUnhide:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void applicationWillUnhide(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend applicationWillUnhide_IMetInst = get_applicationWillUnhide_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationWillUnhide_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		applicationWillUnhide_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationWillUpdate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationWillUpdate_IMetInst(){
		return ((applicationWillUpdate_IMetInst != null)
	? (applicationWillUpdate_IMetInst)
	: (applicationWillUpdate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationWillUpdate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void applicationWillUpdate(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend applicationWillUpdate_IMetInst = get_applicationWillUpdate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationWillUpdate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		applicationWillUpdate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend attachColorList_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attachColorList_IMetInst(){
		return ((attachColorList_IMetInst != null)
	? (attachColorList_IMetInst)
	: (attachColorList_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attachColorList:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void attachColorList(final com.apple.jobjc.appkit.NSColorList colorList){
			final com.apple.jobjc.Invoke.MsgSend attachColorList_IMetInst = get_attachColorList_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attachColorList_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, colorList);
		attachColorList_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend attachment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attachment_IMetInst(){
		return ((attachment_IMetInst != null)
	? (attachment_IMetInst)
	: (attachment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attachment", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTextAttachment attachment(){
			final com.apple.jobjc.Invoke.MsgSend attachment_IMetInst = get_attachment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attachment_IMetInst.init(nativeBuffer, this);
		attachment_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTextAttachment returnValue = (com.apple.jobjc.appkit.NSTextAttachment) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributedString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributedString_IMetInst(){
		return ((attributedString_IMetInst != null)
	? (attributedString_IMetInst)
	: (attributedString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributedString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAttributedString attributedString(){
			final com.apple.jobjc.Invoke.MsgSend attributedString_IMetInst = get_attributedString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributedString_IMetInst.init(nativeBuffer, this);
		attributedString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributedSubstringForProposedRange_actualRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributedSubstringForProposedRange_actualRange_IMetInst(){
		return ((attributedSubstringForProposedRange_actualRange_IMetInst != null)
	? (attributedSubstringForProposedRange_actualRange_IMetInst)
	: (attributedSubstringForProposedRange_actualRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributedSubstringForProposedRange:actualRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAttributedString attributedSubstringForProposedRange_actualRange(final com.apple.jobjc.foundation.NSRange aRange, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ actualRange){
			final com.apple.jobjc.Invoke.MsgSend attributedSubstringForProposedRange_actualRange_IMetInst = get_attributedSubstringForProposedRange_actualRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributedSubstringForProposedRange_actualRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, aRange);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, actualRange);
		attributedSubstringForProposedRange_actualRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributedSubstringFromRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributedSubstringFromRange_IMetInst(){
		return ((attributedSubstringFromRange_IMetInst != null)
	? (attributedSubstringFromRange_IMetInst)
	: (attributedSubstringFromRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributedSubstringFromRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSAttributedString attributedSubstringFromRange(final com.apple.jobjc.foundation.NSRange theRange){
			final com.apple.jobjc.Invoke.MsgSend attributedSubstringFromRange_IMetInst = get_attributedSubstringFromRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributedSubstringFromRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, theRange);
		attributedSubstringFromRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend awakeFromNib_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_awakeFromNib_IMetInst(){
		return ((awakeFromNib_IMetInst != null)
	? (awakeFromNib_IMetInst)
	: (awakeFromNib_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "awakeFromNib", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void awakeFromNib(){
			final com.apple.jobjc.Invoke.MsgSend awakeFromNib_IMetInst = get_awakeFromNib_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		awakeFromNib_IMetInst.init(nativeBuffer, this);
		awakeFromNib_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend baselineDeltaForCharacterAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_baselineDeltaForCharacterAtIndex_IMetInst(){
		return ((baselineDeltaForCharacterAtIndex_IMetInst != null)
	? (baselineDeltaForCharacterAtIndex_IMetInst)
	: (baselineDeltaForCharacterAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "baselineDeltaForCharacterAtIndex:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public double baselineDeltaForCharacterAtIndex(final long anIndex){
			final com.apple.jobjc.Invoke.MsgSend baselineDeltaForCharacterAtIndex_IMetInst = get_baselineDeltaForCharacterAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		baselineDeltaForCharacterAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, anIndex);
		baselineDeltaForCharacterAtIndex_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bind_toObject_withKeyPath_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bind_toObject_withKeyPath_options_IMetInst(){
		return ((bind_toObject_withKeyPath_options_IMetInst != null)
	? (bind_toObject_withKeyPath_options_IMetInst)
	: (bind_toObject_withKeyPath_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bind:toObject:withKeyPath:options:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void bind_toObject_withKeyPath_options(final com.apple.jobjc.foundation.NSString binding, final com.apple.jobjc.ID observable, final com.apple.jobjc.foundation.NSString keyPath, final com.apple.jobjc.foundation.NSDictionary options){
			final com.apple.jobjc.Invoke.MsgSend bind_toObject_withKeyPath_options_IMetInst = get_bind_toObject_withKeyPath_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bind_toObject_withKeyPath_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, binding);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, observable);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		bind_toObject_withKeyPath_options_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_acceptDrop_atRow_column_dropOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_acceptDrop_atRow_column_dropOperation_IMetInst(){
		return ((browser_acceptDrop_atRow_column_dropOperation_IMetInst != null)
	? (browser_acceptDrop_atRow_column_dropOperation_IMetInst)
	: (browser_acceptDrop_atRow_column_dropOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:acceptDrop:atRow:column:dropOperation:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean browser_acceptDrop_atRow_column_dropOperation(final com.apple.jobjc.appkit.NSBrowser browser, final com.apple.jobjc.ID info, final long row, final long column, final long dropOperation){
			final com.apple.jobjc.Invoke.MsgSend browser_acceptDrop_atRow_column_dropOperation_IMetInst = get_browser_acceptDrop_atRow_column_dropOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_acceptDrop_atRow_column_dropOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, info);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, dropOperation);
		browser_acceptDrop_atRow_column_dropOperation_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_canDragRowsWithIndexes_inColumn_withEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_canDragRowsWithIndexes_inColumn_withEvent_IMetInst(){
		return ((browser_canDragRowsWithIndexes_inColumn_withEvent_IMetInst != null)
	? (browser_canDragRowsWithIndexes_inColumn_withEvent_IMetInst)
	: (browser_canDragRowsWithIndexes_inColumn_withEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:canDragRowsWithIndexes:inColumn:withEvent:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean browser_canDragRowsWithIndexes_inColumn_withEvent(final com.apple.jobjc.appkit.NSBrowser browser, final com.apple.jobjc.foundation.NSIndexSet rowIndexes, final long column, final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend browser_canDragRowsWithIndexes_inColumn_withEvent_IMetInst = get_browser_canDragRowsWithIndexes_inColumn_withEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_canDragRowsWithIndexes_inColumn_withEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rowIndexes);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		browser_canDragRowsWithIndexes_inColumn_withEvent_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_child_ofItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_child_ofItem_IMetInst(){
		return ((browser_child_ofItem_IMetInst != null)
	? (browser_child_ofItem_IMetInst)
	: (browser_child_ofItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:child:ofItem:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T browser_child_ofItem(final com.apple.jobjc.appkit.NSBrowser browser, final long index, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend browser_child_ofItem_IMetInst = get_browser_child_ofItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_child_ofItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		browser_child_ofItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_createRowsForColumn_inMatrix_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_createRowsForColumn_inMatrix_IMetInst(){
		return ((browser_createRowsForColumn_inMatrix_IMetInst != null)
	? (browser_createRowsForColumn_inMatrix_IMetInst)
	: (browser_createRowsForColumn_inMatrix_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:createRowsForColumn:inMatrix:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void browser_createRowsForColumn_inMatrix(final com.apple.jobjc.appkit.NSBrowser sender, final long column, final com.apple.jobjc.appkit.NSMatrix matrix){
			final com.apple.jobjc.Invoke.MsgSend browser_createRowsForColumn_inMatrix_IMetInst = get_browser_createRowsForColumn_inMatrix_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_createRowsForColumn_inMatrix_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, matrix);
		browser_createRowsForColumn_inMatrix_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_didChangeLastColumn_toColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_didChangeLastColumn_toColumn_IMetInst(){
		return ((browser_didChangeLastColumn_toColumn_IMetInst != null)
	? (browser_didChangeLastColumn_toColumn_IMetInst)
	: (browser_didChangeLastColumn_toColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:didChangeLastColumn:toColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void browser_didChangeLastColumn_toColumn(final com.apple.jobjc.appkit.NSBrowser browser, final long oldLastColumn, final long column){
			final com.apple.jobjc.Invoke.MsgSend browser_didChangeLastColumn_toColumn_IMetInst = get_browser_didChangeLastColumn_toColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_didChangeLastColumn_toColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, oldLastColumn);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		browser_didChangeLastColumn_toColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_draggingImageForRowsWithIndexes_inColumn_withEvent_offset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_draggingImageForRowsWithIndexes_inColumn_withEvent_offset_IMetInst(){
		return ((browser_draggingImageForRowsWithIndexes_inColumn_withEvent_offset_IMetInst != null)
	? (browser_draggingImageForRowsWithIndexes_inColumn_withEvent_offset_IMetInst)
	: (browser_draggingImageForRowsWithIndexes_inColumn_withEvent_offset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:draggingImageForRowsWithIndexes:inColumn:withEvent:offset:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage browser_draggingImageForRowsWithIndexes_inColumn_withEvent_offset(final com.apple.jobjc.appkit.NSBrowser browser, final com.apple.jobjc.foundation.NSIndexSet rowIndexes, final long column, final com.apple.jobjc.appkit.NSEvent event, final Object /* NSPointPointer (^{_NSPoint=ff}, ^{CGPoint=dd}) */ dragImageOffset){
			final com.apple.jobjc.Invoke.MsgSend browser_draggingImageForRowsWithIndexes_inColumn_withEvent_offset_IMetInst = get_browser_draggingImageForRowsWithIndexes_inColumn_withEvent_offset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_draggingImageForRowsWithIndexes_inColumn_withEvent_offset_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rowIndexes);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, dragImageOffset);
		browser_draggingImageForRowsWithIndexes_inColumn_withEvent_offset_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_headerViewControllerForItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_headerViewControllerForItem_IMetInst(){
		return ((browser_headerViewControllerForItem_IMetInst != null)
	? (browser_headerViewControllerForItem_IMetInst)
	: (browser_headerViewControllerForItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:headerViewControllerForItem:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSViewController browser_headerViewControllerForItem(final com.apple.jobjc.appkit.NSBrowser browser, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend browser_headerViewControllerForItem_IMetInst = get_browser_headerViewControllerForItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_headerViewControllerForItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		browser_headerViewControllerForItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSViewController returnValue = (com.apple.jobjc.appkit.NSViewController) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_heightOfRow_inColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_heightOfRow_inColumn_IMetInst(){
		return ((browser_heightOfRow_inColumn_IMetInst != null)
	? (browser_heightOfRow_inColumn_IMetInst)
	: (browser_heightOfRow_inColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:heightOfRow:inColumn:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public double browser_heightOfRow_inColumn(final com.apple.jobjc.appkit.NSBrowser browser, final long row, final long columnIndex){
			final com.apple.jobjc.Invoke.MsgSend browser_heightOfRow_inColumn_IMetInst = get_browser_heightOfRow_inColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_heightOfRow_inColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, columnIndex);
		browser_heightOfRow_inColumn_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_isColumnValid_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_isColumnValid_IMetInst(){
		return ((browser_isColumnValid_IMetInst != null)
	? (browser_isColumnValid_IMetInst)
	: (browser_isColumnValid_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:isColumnValid:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean browser_isColumnValid(final com.apple.jobjc.appkit.NSBrowser sender, final long column){
			final com.apple.jobjc.Invoke.MsgSend browser_isColumnValid_IMetInst = get_browser_isColumnValid_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_isColumnValid_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		browser_isColumnValid_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_isLeafItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_isLeafItem_IMetInst(){
		return ((browser_isLeafItem_IMetInst != null)
	? (browser_isLeafItem_IMetInst)
	: (browser_isLeafItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:isLeafItem:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean browser_isLeafItem(final com.apple.jobjc.appkit.NSBrowser browser, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend browser_isLeafItem_IMetInst = get_browser_isLeafItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_isLeafItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		browser_isLeafItem_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_inColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_inColumn_IMetInst(){
		return ((browser_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_inColumn_IMetInst != null)
	? (browser_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_inColumn_IMetInst)
	: (browser_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_inColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:namesOfPromisedFilesDroppedAtDestination:forDraggedRowsWithIndexes:inColumn:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSArray browser_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_inColumn(final com.apple.jobjc.appkit.NSBrowser browser, final com.apple.jobjc.foundation.NSURL dropDestination, final com.apple.jobjc.foundation.NSIndexSet rowIndexes, final long column){
			final com.apple.jobjc.Invoke.MsgSend browser_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_inColumn_IMetInst = get_browser_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_inColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_inColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dropDestination);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rowIndexes);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		browser_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_inColumn_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_nextTypeSelectMatchFromRow_toRow_inColumn_forString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_nextTypeSelectMatchFromRow_toRow_inColumn_forString_IMetInst(){
		return ((browser_nextTypeSelectMatchFromRow_toRow_inColumn_forString_IMetInst != null)
	? (browser_nextTypeSelectMatchFromRow_toRow_inColumn_forString_IMetInst)
	: (browser_nextTypeSelectMatchFromRow_toRow_inColumn_forString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:nextTypeSelectMatchFromRow:toRow:inColumn:forString:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long browser_nextTypeSelectMatchFromRow_toRow_inColumn_forString(final com.apple.jobjc.appkit.NSBrowser browser, final long startRow, final long endRow, final long column, final com.apple.jobjc.foundation.NSString searchString){
			final com.apple.jobjc.Invoke.MsgSend browser_nextTypeSelectMatchFromRow_toRow_inColumn_forString_IMetInst = get_browser_nextTypeSelectMatchFromRow_toRow_inColumn_forString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_nextTypeSelectMatchFromRow_toRow_inColumn_forString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, startRow);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, endRow);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, searchString);
		browser_nextTypeSelectMatchFromRow_toRow_inColumn_forString_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_numberOfChildrenOfItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_numberOfChildrenOfItem_IMetInst(){
		return ((browser_numberOfChildrenOfItem_IMetInst != null)
	? (browser_numberOfChildrenOfItem_IMetInst)
	: (browser_numberOfChildrenOfItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:numberOfChildrenOfItem:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long browser_numberOfChildrenOfItem(final com.apple.jobjc.appkit.NSBrowser browser, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend browser_numberOfChildrenOfItem_IMetInst = get_browser_numberOfChildrenOfItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_numberOfChildrenOfItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		browser_numberOfChildrenOfItem_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_numberOfRowsInColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_numberOfRowsInColumn_IMetInst(){
		return ((browser_numberOfRowsInColumn_IMetInst != null)
	? (browser_numberOfRowsInColumn_IMetInst)
	: (browser_numberOfRowsInColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:numberOfRowsInColumn:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long browser_numberOfRowsInColumn(final com.apple.jobjc.appkit.NSBrowser sender, final long column){
			final com.apple.jobjc.Invoke.MsgSend browser_numberOfRowsInColumn_IMetInst = get_browser_numberOfRowsInColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_numberOfRowsInColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		browser_numberOfRowsInColumn_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_objectValueForItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_objectValueForItem_IMetInst(){
		return ((browser_objectValueForItem_IMetInst != null)
	? (browser_objectValueForItem_IMetInst)
	: (browser_objectValueForItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:objectValueForItem:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T browser_objectValueForItem(final com.apple.jobjc.appkit.NSBrowser browser, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend browser_objectValueForItem_IMetInst = get_browser_objectValueForItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_objectValueForItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		browser_objectValueForItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_previewViewControllerForLeafItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_previewViewControllerForLeafItem_IMetInst(){
		return ((browser_previewViewControllerForLeafItem_IMetInst != null)
	? (browser_previewViewControllerForLeafItem_IMetInst)
	: (browser_previewViewControllerForLeafItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:previewViewControllerForLeafItem:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSViewController browser_previewViewControllerForLeafItem(final com.apple.jobjc.appkit.NSBrowser browser, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend browser_previewViewControllerForLeafItem_IMetInst = get_browser_previewViewControllerForLeafItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_previewViewControllerForLeafItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		browser_previewViewControllerForLeafItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSViewController returnValue = (com.apple.jobjc.appkit.NSViewController) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_selectCellWithString_inColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_selectCellWithString_inColumn_IMetInst(){
		return ((browser_selectCellWithString_inColumn_IMetInst != null)
	? (browser_selectCellWithString_inColumn_IMetInst)
	: (browser_selectCellWithString_inColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:selectCellWithString:inColumn:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean browser_selectCellWithString_inColumn(final com.apple.jobjc.appkit.NSBrowser sender, final com.apple.jobjc.foundation.NSString title, final long column){
			final com.apple.jobjc.Invoke.MsgSend browser_selectCellWithString_inColumn_IMetInst = get_browser_selectCellWithString_inColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_selectCellWithString_inColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		browser_selectCellWithString_inColumn_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_selectRow_inColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_selectRow_inColumn_IMetInst(){
		return ((browser_selectRow_inColumn_IMetInst != null)
	? (browser_selectRow_inColumn_IMetInst)
	: (browser_selectRow_inColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:selectRow:inColumn:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean browser_selectRow_inColumn(final com.apple.jobjc.appkit.NSBrowser sender, final long row, final long column){
			final com.apple.jobjc.Invoke.MsgSend browser_selectRow_inColumn_IMetInst = get_browser_selectRow_inColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_selectRow_inColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		browser_selectRow_inColumn_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_selectionIndexesForProposedSelection_inColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_selectionIndexesForProposedSelection_inColumn_IMetInst(){
		return ((browser_selectionIndexesForProposedSelection_inColumn_IMetInst != null)
	? (browser_selectionIndexesForProposedSelection_inColumn_IMetInst)
	: (browser_selectionIndexesForProposedSelection_inColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:selectionIndexesForProposedSelection:inColumn:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSIndexSet browser_selectionIndexesForProposedSelection_inColumn(final com.apple.jobjc.appkit.NSBrowser browser, final com.apple.jobjc.foundation.NSIndexSet proposedSelectionIndexes, final long column){
			final com.apple.jobjc.Invoke.MsgSend browser_selectionIndexesForProposedSelection_inColumn_IMetInst = get_browser_selectionIndexesForProposedSelection_inColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_selectionIndexesForProposedSelection_inColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, proposedSelectionIndexes);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		browser_selectionIndexesForProposedSelection_inColumn_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexSet returnValue = (com.apple.jobjc.foundation.NSIndexSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_setObjectValue_forItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_setObjectValue_forItem_IMetInst(){
		return ((browser_setObjectValue_forItem_IMetInst != null)
	? (browser_setObjectValue_forItem_IMetInst)
	: (browser_setObjectValue_forItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:setObjectValue:forItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void browser_setObjectValue_forItem(final com.apple.jobjc.appkit.NSBrowser browser, final com.apple.jobjc.ID object, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend browser_setObjectValue_forItem_IMetInst = get_browser_setObjectValue_forItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_setObjectValue_forItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		browser_setObjectValue_forItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_shouldEditItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_shouldEditItem_IMetInst(){
		return ((browser_shouldEditItem_IMetInst != null)
	? (browser_shouldEditItem_IMetInst)
	: (browser_shouldEditItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:shouldEditItem:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean browser_shouldEditItem(final com.apple.jobjc.appkit.NSBrowser browser, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend browser_shouldEditItem_IMetInst = get_browser_shouldEditItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_shouldEditItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		browser_shouldEditItem_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_shouldShowCellExpansionForRow_column_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_shouldShowCellExpansionForRow_column_IMetInst(){
		return ((browser_shouldShowCellExpansionForRow_column_IMetInst != null)
	? (browser_shouldShowCellExpansionForRow_column_IMetInst)
	: (browser_shouldShowCellExpansionForRow_column_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:shouldShowCellExpansionForRow:column:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean browser_shouldShowCellExpansionForRow_column(final com.apple.jobjc.appkit.NSBrowser browser, final long row, final long column){
			final com.apple.jobjc.Invoke.MsgSend browser_shouldShowCellExpansionForRow_column_IMetInst = get_browser_shouldShowCellExpansionForRow_column_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_shouldShowCellExpansionForRow_column_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		browser_shouldShowCellExpansionForRow_column_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_shouldSizeColumn_forUserResize_toWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_shouldSizeColumn_forUserResize_toWidth_IMetInst(){
		return ((browser_shouldSizeColumn_forUserResize_toWidth_IMetInst != null)
	? (browser_shouldSizeColumn_forUserResize_toWidth_IMetInst)
	: (browser_shouldSizeColumn_forUserResize_toWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:shouldSizeColumn:forUserResize:toWidth:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double browser_shouldSizeColumn_forUserResize_toWidth(final com.apple.jobjc.appkit.NSBrowser browser, final long columnIndex, final boolean forUserResize, final double suggestedWidth){
			final com.apple.jobjc.Invoke.MsgSend browser_shouldSizeColumn_forUserResize_toWidth_IMetInst = get_browser_shouldSizeColumn_forUserResize_toWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_shouldSizeColumn_forUserResize_toWidth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, columnIndex);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, forUserResize);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, suggestedWidth);
		browser_shouldSizeColumn_forUserResize_toWidth_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst(){
		return ((browser_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst != null)
	? (browser_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst)
	: (browser_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:shouldTypeSelectForEvent:withCurrentSearchString:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean browser_shouldTypeSelectForEvent_withCurrentSearchString(final com.apple.jobjc.appkit.NSBrowser browser, final com.apple.jobjc.appkit.NSEvent event, final com.apple.jobjc.foundation.NSString searchString){
			final com.apple.jobjc.Invoke.MsgSend browser_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst = get_browser_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, searchString);
		browser_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_sizeToFitWidthOfColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_sizeToFitWidthOfColumn_IMetInst(){
		return ((browser_sizeToFitWidthOfColumn_IMetInst != null)
	? (browser_sizeToFitWidthOfColumn_IMetInst)
	: (browser_sizeToFitWidthOfColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:sizeToFitWidthOfColumn:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public double browser_sizeToFitWidthOfColumn(final com.apple.jobjc.appkit.NSBrowser browser, final long columnIndex){
			final com.apple.jobjc.Invoke.MsgSend browser_sizeToFitWidthOfColumn_IMetInst = get_browser_sizeToFitWidthOfColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_sizeToFitWidthOfColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, columnIndex);
		browser_sizeToFitWidthOfColumn_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_titleOfColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_titleOfColumn_IMetInst(){
		return ((browser_titleOfColumn_IMetInst != null)
	? (browser_titleOfColumn_IMetInst)
	: (browser_titleOfColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:titleOfColumn:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString browser_titleOfColumn(final com.apple.jobjc.appkit.NSBrowser sender, final long column){
			final com.apple.jobjc.Invoke.MsgSend browser_titleOfColumn_IMetInst = get_browser_titleOfColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_titleOfColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		browser_titleOfColumn_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_typeSelectStringForRow_inColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_typeSelectStringForRow_inColumn_IMetInst(){
		return ((browser_typeSelectStringForRow_inColumn_IMetInst != null)
	? (browser_typeSelectStringForRow_inColumn_IMetInst)
	: (browser_typeSelectStringForRow_inColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:typeSelectStringForRow:inColumn:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString browser_typeSelectStringForRow_inColumn(final com.apple.jobjc.appkit.NSBrowser browser, final long row, final long column){
			final com.apple.jobjc.Invoke.MsgSend browser_typeSelectStringForRow_inColumn_IMetInst = get_browser_typeSelectStringForRow_inColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_typeSelectStringForRow_inColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		browser_typeSelectStringForRow_inColumn_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_validateDrop_proposedRow_column_dropOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_validateDrop_proposedRow_column_dropOperation_IMetInst(){
		return ((browser_validateDrop_proposedRow_column_dropOperation_IMetInst != null)
	? (browser_validateDrop_proposedRow_column_dropOperation_IMetInst)
	: (browser_validateDrop_proposedRow_column_dropOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:validateDrop:proposedRow:column:dropOperation:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public long browser_validateDrop_proposedRow_column_dropOperation(final com.apple.jobjc.appkit.NSBrowser browser, final com.apple.jobjc.ID info, final com.apple.jobjc.Pointer<java.lang.Long> row, final com.apple.jobjc.Pointer<java.lang.Long> column, final com.apple.jobjc.Pointer<java.lang.Long> dropOperation){
			final com.apple.jobjc.Invoke.MsgSend browser_validateDrop_proposedRow_column_dropOperation_IMetInst = get_browser_validateDrop_proposedRow_column_dropOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_validateDrop_proposedRow_column_dropOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, info);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, row);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, column);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dropOperation);
		browser_validateDrop_proposedRow_column_dropOperation_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_willDisplayCell_atRow_column_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_willDisplayCell_atRow_column_IMetInst(){
		return ((browser_willDisplayCell_atRow_column_IMetInst != null)
	? (browser_willDisplayCell_atRow_column_IMetInst)
	: (browser_willDisplayCell_atRow_column_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:willDisplayCell:atRow:column:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void browser_willDisplayCell_atRow_column(final com.apple.jobjc.appkit.NSBrowser sender, final com.apple.jobjc.ID cell, final long row, final long column){
			final com.apple.jobjc.Invoke.MsgSend browser_willDisplayCell_atRow_column_IMetInst = get_browser_willDisplayCell_atRow_column_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_willDisplayCell_atRow_column_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		browser_willDisplayCell_atRow_column_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend browser_writeRowsWithIndexes_inColumn_toPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browser_writeRowsWithIndexes_inColumn_toPasteboard_IMetInst(){
		return ((browser_writeRowsWithIndexes_inColumn_toPasteboard_IMetInst != null)
	? (browser_writeRowsWithIndexes_inColumn_toPasteboard_IMetInst)
	: (browser_writeRowsWithIndexes_inColumn_toPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browser:writeRowsWithIndexes:inColumn:toPasteboard:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean browser_writeRowsWithIndexes_inColumn_toPasteboard(final com.apple.jobjc.appkit.NSBrowser browser, final com.apple.jobjc.foundation.NSIndexSet rowIndexes, final long column, final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend browser_writeRowsWithIndexes_inColumn_toPasteboard_IMetInst = get_browser_writeRowsWithIndexes_inColumn_toPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browser_writeRowsWithIndexes_inColumn_toPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rowIndexes);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		browser_writeRowsWithIndexes_inColumn_toPasteboard_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browserColumnConfigurationDidChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browserColumnConfigurationDidChange_IMetInst(){
		return ((browserColumnConfigurationDidChange_IMetInst != null)
	? (browserColumnConfigurationDidChange_IMetInst)
	: (browserColumnConfigurationDidChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browserColumnConfigurationDidChange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void browserColumnConfigurationDidChange(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend browserColumnConfigurationDidChange_IMetInst = get_browserColumnConfigurationDidChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browserColumnConfigurationDidChange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		browserColumnConfigurationDidChange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend browserDidScroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browserDidScroll_IMetInst(){
		return ((browserDidScroll_IMetInst != null)
	? (browserDidScroll_IMetInst)
	: (browserDidScroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browserDidScroll:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void browserDidScroll(final com.apple.jobjc.appkit.NSBrowser sender){
			final com.apple.jobjc.Invoke.MsgSend browserDidScroll_IMetInst = get_browserDidScroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browserDidScroll_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		browserDidScroll_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend browserWillScroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browserWillScroll_IMetInst(){
		return ((browserWillScroll_IMetInst != null)
	? (browserWillScroll_IMetInst)
	: (browserWillScroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browserWillScroll:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void browserWillScroll(final com.apple.jobjc.appkit.NSBrowser sender){
			final com.apple.jobjc.Invoke.MsgSend browserWillScroll_IMetInst = get_browserWillScroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browserWillScroll_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		browserWillScroll_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend buttonToolTip_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_buttonToolTip_IMetInst(){
		return ((buttonToolTip_IMetInst != null)
	? (buttonToolTip_IMetInst)
	: (buttonToolTip_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "buttonToolTip", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString buttonToolTip(){
			final com.apple.jobjc.Invoke.MsgSend buttonToolTip_IMetInst = get_buttonToolTip_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		buttonToolTip_IMetInst.init(nativeBuffer, this);
		buttonToolTip_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canBeDisabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canBeDisabled_IMetInst(){
		return ((canBeDisabled_IMetInst != null)
	? (canBeDisabled_IMetInst)
	: (canBeDisabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canBeDisabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canBeDisabled(){
			final com.apple.jobjc.Invoke.MsgSend canBeDisabled_IMetInst = get_canBeDisabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canBeDisabled_IMetInst.init(nativeBuffer, this);
		canBeDisabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cellBaselineOffset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cellBaselineOffset_IMetInst(){
		return ((cellBaselineOffset_IMetInst != null)
	? (cellBaselineOffset_IMetInst)
	: (cellBaselineOffset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cellBaselineOffset", com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint cellBaselineOffset(){
			final com.apple.jobjc.Invoke.MsgSend cellBaselineOffset_IMetInst = get_cellBaselineOffset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cellBaselineOffset_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		cellBaselineOffset_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cellFrameForTextContainer_proposedLineFragment_glyphPosition_characterIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cellFrameForTextContainer_proposedLineFragment_glyphPosition_characterIndex_IMetInst(){
		return ((cellFrameForTextContainer_proposedLineFragment_glyphPosition_characterIndex_IMetInst != null)
	? (cellFrameForTextContainer_proposedLineFragment_glyphPosition_characterIndex_IMetInst)
	: (cellFrameForTextContainer_proposedLineFragment_glyphPosition_characterIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cellFrameForTextContainer:proposedLineFragment:glyphPosition:characterIndex:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect cellFrameForTextContainer_proposedLineFragment_glyphPosition_characterIndex(final com.apple.jobjc.appkit.NSTextContainer textContainer, final com.apple.jobjc.foundation.NSRect lineFrag, final com.apple.jobjc.foundation.NSPoint position, final long charIndex){
			final com.apple.jobjc.Invoke.MsgSend cellFrameForTextContainer_proposedLineFragment_glyphPosition_characterIndex_IMetInst = get_cellFrameForTextContainer_proposedLineFragment_glyphPosition_characterIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cellFrameForTextContainer_proposedLineFragment_glyphPosition_characterIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textContainer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, lineFrag);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, position);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		cellFrameForTextContainer_proposedLineFragment_glyphPosition_characterIndex_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cellSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cellSize_IMetInst(){
		return ((cellSize_IMetInst != null)
	? (cellSize_IMetInst)
	: (cellSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cellSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize cellSize(){
			final com.apple.jobjc.Invoke.MsgSend cellSize_IMetInst = get_cellSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cellSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		cellSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend changeColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_changeColor_IMetInst(){
		return ((changeColor_IMetInst != null)
	? (changeColor_IMetInst)
	: (changeColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "changeColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void changeColor(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend changeColor_IMetInst = get_changeColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		changeColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		changeColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend changeFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_changeFont_IMetInst(){
		return ((changeFont_IMetInst != null)
	? (changeFont_IMetInst)
	: (changeFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "changeFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void changeFont(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend changeFont_IMetInst = get_changeFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		changeFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		changeFont_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend changeSpelling_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_changeSpelling_IMetInst(){
		return ((changeSpelling_IMetInst != null)
	? (changeSpelling_IMetInst)
	: (changeSpelling_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "changeSpelling:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void changeSpelling(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend changeSpelling_IMetInst = get_changeSpelling_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		changeSpelling_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		changeSpelling_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend characterIndexForPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_characterIndexForPoint_IMetInst(){
		return ((characterIndexForPoint_IMetInst != null)
	? (characterIndexForPoint_IMetInst)
	: (characterIndexForPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "characterIndexForPoint:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public long characterIndexForPoint(final com.apple.jobjc.foundation.NSPoint thePoint){
			final com.apple.jobjc.Invoke.MsgSend characterIndexForPoint_IMetInst = get_characterIndexForPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		characterIndexForPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, thePoint);
		characterIndexForPoint_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend collectionView_acceptDrop_index_dropOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_collectionView_acceptDrop_index_dropOperation_IMetInst(){
		return ((collectionView_acceptDrop_index_dropOperation_IMetInst != null)
	? (collectionView_acceptDrop_index_dropOperation_IMetInst)
	: (collectionView_acceptDrop_index_dropOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "collectionView:acceptDrop:index:dropOperation:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean collectionView_acceptDrop_index_dropOperation(final com.apple.jobjc.appkit.NSCollectionView collectionView, final com.apple.jobjc.ID draggingInfo, final long index, final long dropOperation){
			final com.apple.jobjc.Invoke.MsgSend collectionView_acceptDrop_index_dropOperation_IMetInst = get_collectionView_acceptDrop_index_dropOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		collectionView_acceptDrop_index_dropOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, collectionView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, draggingInfo);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, dropOperation);
		collectionView_acceptDrop_index_dropOperation_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend collectionView_canDragItemsAtIndexes_withEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_collectionView_canDragItemsAtIndexes_withEvent_IMetInst(){
		return ((collectionView_canDragItemsAtIndexes_withEvent_IMetInst != null)
	? (collectionView_canDragItemsAtIndexes_withEvent_IMetInst)
	: (collectionView_canDragItemsAtIndexes_withEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "collectionView:canDragItemsAtIndexes:withEvent:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean collectionView_canDragItemsAtIndexes_withEvent(final com.apple.jobjc.appkit.NSCollectionView collectionView, final com.apple.jobjc.foundation.NSIndexSet indexes, final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend collectionView_canDragItemsAtIndexes_withEvent_IMetInst = get_collectionView_canDragItemsAtIndexes_withEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		collectionView_canDragItemsAtIndexes_withEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, collectionView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		collectionView_canDragItemsAtIndexes_withEvent_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend collectionView_draggingImageForItemsAtIndexes_withEvent_offset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_collectionView_draggingImageForItemsAtIndexes_withEvent_offset_IMetInst(){
		return ((collectionView_draggingImageForItemsAtIndexes_withEvent_offset_IMetInst != null)
	? (collectionView_draggingImageForItemsAtIndexes_withEvent_offset_IMetInst)
	: (collectionView_draggingImageForItemsAtIndexes_withEvent_offset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "collectionView:draggingImageForItemsAtIndexes:withEvent:offset:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage collectionView_draggingImageForItemsAtIndexes_withEvent_offset(final com.apple.jobjc.appkit.NSCollectionView collectionView, final com.apple.jobjc.foundation.NSIndexSet indexes, final com.apple.jobjc.appkit.NSEvent event, final Object /* NSPointPointer (^{_NSPoint=ff}, ^{CGPoint=dd}) */ dragImageOffset){
			final com.apple.jobjc.Invoke.MsgSend collectionView_draggingImageForItemsAtIndexes_withEvent_offset_IMetInst = get_collectionView_draggingImageForItemsAtIndexes_withEvent_offset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		collectionView_draggingImageForItemsAtIndexes_withEvent_offset_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, collectionView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, dragImageOffset);
		collectionView_draggingImageForItemsAtIndexes_withEvent_offset_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend collectionView_draggingSession_endedAtPoint_dragOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_collectionView_draggingSession_endedAtPoint_dragOperation_IMetInst(){
		return ((collectionView_draggingSession_endedAtPoint_dragOperation_IMetInst != null)
	? (collectionView_draggingSession_endedAtPoint_dragOperation_IMetInst)
	: (collectionView_draggingSession_endedAtPoint_dragOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "collectionView:draggingSession:endedAtPoint:dragOperation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void collectionView_draggingSession_endedAtPoint_dragOperation(final com.apple.jobjc.appkit.NSCollectionView collectionView, final com.apple.jobjc.appkit.NSDraggingSession session, final com.apple.jobjc.foundation.NSPoint screenPoint, final long operation){
			final com.apple.jobjc.Invoke.MsgSend collectionView_draggingSession_endedAtPoint_dragOperation_IMetInst = get_collectionView_draggingSession_endedAtPoint_dragOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		collectionView_draggingSession_endedAtPoint_dragOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, collectionView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, session);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, screenPoint);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, operation);
		collectionView_draggingSession_endedAtPoint_dragOperation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend collectionView_draggingSession_willBeginAtPoint_forItemsAtIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_collectionView_draggingSession_willBeginAtPoint_forItemsAtIndexes_IMetInst(){
		return ((collectionView_draggingSession_willBeginAtPoint_forItemsAtIndexes_IMetInst != null)
	? (collectionView_draggingSession_willBeginAtPoint_forItemsAtIndexes_IMetInst)
	: (collectionView_draggingSession_willBeginAtPoint_forItemsAtIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "collectionView:draggingSession:willBeginAtPoint:forItemsAtIndexes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void collectionView_draggingSession_willBeginAtPoint_forItemsAtIndexes(final com.apple.jobjc.appkit.NSCollectionView collectionView, final com.apple.jobjc.appkit.NSDraggingSession session, final com.apple.jobjc.foundation.NSPoint screenPoint, final com.apple.jobjc.foundation.NSIndexSet indexes){
			final com.apple.jobjc.Invoke.MsgSend collectionView_draggingSession_willBeginAtPoint_forItemsAtIndexes_IMetInst = get_collectionView_draggingSession_willBeginAtPoint_forItemsAtIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		collectionView_draggingSession_willBeginAtPoint_forItemsAtIndexes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, collectionView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, session);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, screenPoint);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		collectionView_draggingSession_willBeginAtPoint_forItemsAtIndexes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend collectionView_namesOfPromisedFilesDroppedAtDestination_forDraggedItemsAtIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_collectionView_namesOfPromisedFilesDroppedAtDestination_forDraggedItemsAtIndexes_IMetInst(){
		return ((collectionView_namesOfPromisedFilesDroppedAtDestination_forDraggedItemsAtIndexes_IMetInst != null)
	? (collectionView_namesOfPromisedFilesDroppedAtDestination_forDraggedItemsAtIndexes_IMetInst)
	: (collectionView_namesOfPromisedFilesDroppedAtDestination_forDraggedItemsAtIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "collectionView:namesOfPromisedFilesDroppedAtDestination:forDraggedItemsAtIndexes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray collectionView_namesOfPromisedFilesDroppedAtDestination_forDraggedItemsAtIndexes(final com.apple.jobjc.appkit.NSCollectionView collectionView, final com.apple.jobjc.foundation.NSURL dropURL, final com.apple.jobjc.foundation.NSIndexSet indexes){
			final com.apple.jobjc.Invoke.MsgSend collectionView_namesOfPromisedFilesDroppedAtDestination_forDraggedItemsAtIndexes_IMetInst = get_collectionView_namesOfPromisedFilesDroppedAtDestination_forDraggedItemsAtIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		collectionView_namesOfPromisedFilesDroppedAtDestination_forDraggedItemsAtIndexes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, collectionView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dropURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		collectionView_namesOfPromisedFilesDroppedAtDestination_forDraggedItemsAtIndexes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend collectionView_pasteboardWriterForItemAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_collectionView_pasteboardWriterForItemAtIndex_IMetInst(){
		return ((collectionView_pasteboardWriterForItemAtIndex_IMetInst != null)
	? (collectionView_pasteboardWriterForItemAtIndex_IMetInst)
	: (collectionView_pasteboardWriterForItemAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "collectionView:pasteboardWriterForItemAtIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T collectionView_pasteboardWriterForItemAtIndex(final com.apple.jobjc.appkit.NSCollectionView collectionView, final long index){
			final com.apple.jobjc.Invoke.MsgSend collectionView_pasteboardWriterForItemAtIndex_IMetInst = get_collectionView_pasteboardWriterForItemAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		collectionView_pasteboardWriterForItemAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, collectionView);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		collectionView_pasteboardWriterForItemAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend collectionView_updateDraggingItemsForDrag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_collectionView_updateDraggingItemsForDrag_IMetInst(){
		return ((collectionView_updateDraggingItemsForDrag_IMetInst != null)
	? (collectionView_updateDraggingItemsForDrag_IMetInst)
	: (collectionView_updateDraggingItemsForDrag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "collectionView:updateDraggingItemsForDrag:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void collectionView_updateDraggingItemsForDrag(final com.apple.jobjc.appkit.NSCollectionView collectionView, final com.apple.jobjc.ID draggingInfo){
			final com.apple.jobjc.Invoke.MsgSend collectionView_updateDraggingItemsForDrag_IMetInst = get_collectionView_updateDraggingItemsForDrag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		collectionView_updateDraggingItemsForDrag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, collectionView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, draggingInfo);
		collectionView_updateDraggingItemsForDrag_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend collectionView_validateDrop_proposedIndex_dropOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_collectionView_validateDrop_proposedIndex_dropOperation_IMetInst(){
		return ((collectionView_validateDrop_proposedIndex_dropOperation_IMetInst != null)
	? (collectionView_validateDrop_proposedIndex_dropOperation_IMetInst)
	: (collectionView_validateDrop_proposedIndex_dropOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "collectionView:validateDrop:proposedIndex:dropOperation:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public long collectionView_validateDrop_proposedIndex_dropOperation(final com.apple.jobjc.appkit.NSCollectionView collectionView, final com.apple.jobjc.ID draggingInfo, final com.apple.jobjc.Pointer<java.lang.Long> proposedDropIndex, final com.apple.jobjc.Pointer<java.lang.Long> proposedDropOperation){
			final com.apple.jobjc.Invoke.MsgSend collectionView_validateDrop_proposedIndex_dropOperation_IMetInst = get_collectionView_validateDrop_proposedIndex_dropOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		collectionView_validateDrop_proposedIndex_dropOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, collectionView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, draggingInfo);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, proposedDropIndex);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, proposedDropOperation);
		collectionView_validateDrop_proposedIndex_dropOperation_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend collectionView_writeItemsAtIndexes_toPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_collectionView_writeItemsAtIndexes_toPasteboard_IMetInst(){
		return ((collectionView_writeItemsAtIndexes_toPasteboard_IMetInst != null)
	? (collectionView_writeItemsAtIndexes_toPasteboard_IMetInst)
	: (collectionView_writeItemsAtIndexes_toPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "collectionView:writeItemsAtIndexes:toPasteboard:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean collectionView_writeItemsAtIndexes_toPasteboard(final com.apple.jobjc.appkit.NSCollectionView collectionView, final com.apple.jobjc.foundation.NSIndexSet indexes, final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend collectionView_writeItemsAtIndexes_toPasteboard_IMetInst = get_collectionView_writeItemsAtIndexes_toPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		collectionView_writeItemsAtIndexes_toPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, collectionView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		collectionView_writeItemsAtIndexes_toPasteboard_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend comboBox_completedString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_comboBox_completedString_IMetInst(){
		return ((comboBox_completedString_IMetInst != null)
	? (comboBox_completedString_IMetInst)
	: (comboBox_completedString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "comboBox:completedString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString comboBox_completedString(final com.apple.jobjc.appkit.NSComboBox aComboBox, final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend comboBox_completedString_IMetInst = get_comboBox_completedString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		comboBox_completedString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aComboBox);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		comboBox_completedString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend comboBox_indexOfItemWithStringValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_comboBox_indexOfItemWithStringValue_IMetInst(){
		return ((comboBox_indexOfItemWithStringValue_IMetInst != null)
	? (comboBox_indexOfItemWithStringValue_IMetInst)
	: (comboBox_indexOfItemWithStringValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "comboBox:indexOfItemWithStringValue:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long comboBox_indexOfItemWithStringValue(final com.apple.jobjc.appkit.NSComboBox aComboBox, final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend comboBox_indexOfItemWithStringValue_IMetInst = get_comboBox_indexOfItemWithStringValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		comboBox_indexOfItemWithStringValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aComboBox);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		comboBox_indexOfItemWithStringValue_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend comboBox_objectValueForItemAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_comboBox_objectValueForItemAtIndex_IMetInst(){
		return ((comboBox_objectValueForItemAtIndex_IMetInst != null)
	? (comboBox_objectValueForItemAtIndex_IMetInst)
	: (comboBox_objectValueForItemAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "comboBox:objectValueForItemAtIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T comboBox_objectValueForItemAtIndex(final com.apple.jobjc.appkit.NSComboBox aComboBox, final long index){
			final com.apple.jobjc.Invoke.MsgSend comboBox_objectValueForItemAtIndex_IMetInst = get_comboBox_objectValueForItemAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		comboBox_objectValueForItemAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aComboBox);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		comboBox_objectValueForItemAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend comboBoxCell_completedString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_comboBoxCell_completedString_IMetInst(){
		return ((comboBoxCell_completedString_IMetInst != null)
	? (comboBoxCell_completedString_IMetInst)
	: (comboBoxCell_completedString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "comboBoxCell:completedString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString comboBoxCell_completedString(final com.apple.jobjc.appkit.NSComboBoxCell aComboBoxCell, final com.apple.jobjc.foundation.NSString uncompletedString){
			final com.apple.jobjc.Invoke.MsgSend comboBoxCell_completedString_IMetInst = get_comboBoxCell_completedString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		comboBoxCell_completedString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aComboBoxCell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, uncompletedString);
		comboBoxCell_completedString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend comboBoxCell_indexOfItemWithStringValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_comboBoxCell_indexOfItemWithStringValue_IMetInst(){
		return ((comboBoxCell_indexOfItemWithStringValue_IMetInst != null)
	? (comboBoxCell_indexOfItemWithStringValue_IMetInst)
	: (comboBoxCell_indexOfItemWithStringValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "comboBoxCell:indexOfItemWithStringValue:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long comboBoxCell_indexOfItemWithStringValue(final com.apple.jobjc.appkit.NSComboBoxCell aComboBoxCell, final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend comboBoxCell_indexOfItemWithStringValue_IMetInst = get_comboBoxCell_indexOfItemWithStringValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		comboBoxCell_indexOfItemWithStringValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aComboBoxCell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		comboBoxCell_indexOfItemWithStringValue_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend comboBoxCell_objectValueForItemAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_comboBoxCell_objectValueForItemAtIndex_IMetInst(){
		return ((comboBoxCell_objectValueForItemAtIndex_IMetInst != null)
	? (comboBoxCell_objectValueForItemAtIndex_IMetInst)
	: (comboBoxCell_objectValueForItemAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "comboBoxCell:objectValueForItemAtIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T comboBoxCell_objectValueForItemAtIndex(final com.apple.jobjc.appkit.NSComboBoxCell aComboBoxCell, final long index){
			final com.apple.jobjc.Invoke.MsgSend comboBoxCell_objectValueForItemAtIndex_IMetInst = get_comboBoxCell_objectValueForItemAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		comboBoxCell_objectValueForItemAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aComboBoxCell);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		comboBoxCell_objectValueForItemAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend comboBoxSelectionDidChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_comboBoxSelectionDidChange_IMetInst(){
		return ((comboBoxSelectionDidChange_IMetInst != null)
	? (comboBoxSelectionDidChange_IMetInst)
	: (comboBoxSelectionDidChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "comboBoxSelectionDidChange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void comboBoxSelectionDidChange(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend comboBoxSelectionDidChange_IMetInst = get_comboBoxSelectionDidChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		comboBoxSelectionDidChange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		comboBoxSelectionDidChange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend comboBoxSelectionIsChanging_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_comboBoxSelectionIsChanging_IMetInst(){
		return ((comboBoxSelectionIsChanging_IMetInst != null)
	? (comboBoxSelectionIsChanging_IMetInst)
	: (comboBoxSelectionIsChanging_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "comboBoxSelectionIsChanging:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void comboBoxSelectionIsChanging(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend comboBoxSelectionIsChanging_IMetInst = get_comboBoxSelectionIsChanging_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		comboBoxSelectionIsChanging_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		comboBoxSelectionIsChanging_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend comboBoxWillDismiss_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_comboBoxWillDismiss_IMetInst(){
		return ((comboBoxWillDismiss_IMetInst != null)
	? (comboBoxWillDismiss_IMetInst)
	: (comboBoxWillDismiss_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "comboBoxWillDismiss:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void comboBoxWillDismiss(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend comboBoxWillDismiss_IMetInst = get_comboBoxWillDismiss_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		comboBoxWillDismiss_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		comboBoxWillDismiss_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend comboBoxWillPopUp_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_comboBoxWillPopUp_IMetInst(){
		return ((comboBoxWillPopUp_IMetInst != null)
	? (comboBoxWillPopUp_IMetInst)
	: (comboBoxWillPopUp_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "comboBoxWillPopUp:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void comboBoxWillPopUp(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend comboBoxWillPopUp_IMetInst = get_comboBoxWillPopUp_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		comboBoxWillPopUp_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		comboBoxWillPopUp_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend commitEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_commitEditing_IMetInst(){
		return ((commitEditing_IMetInst != null)
	? (commitEditing_IMetInst)
	: (commitEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "commitEditing", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean commitEditing(){
			final com.apple.jobjc.Invoke.MsgSend commitEditing_IMetInst = get_commitEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		commitEditing_IMetInst.init(nativeBuffer, this);
		commitEditing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend commitEditingAndReturnError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_commitEditingAndReturnError_IMetInst(){
		return ((commitEditingAndReturnError_IMetInst != null)
	? (commitEditingAndReturnError_IMetInst)
	: (commitEditingAndReturnError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "commitEditingAndReturnError:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean commitEditingAndReturnError(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend commitEditingAndReturnError_IMetInst = get_commitEditingAndReturnError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		commitEditingAndReturnError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		commitEditingAndReturnError_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst(){
		return ((commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst != null)
	? (commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst)
	: (commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "commitEditingWithDelegate:didCommitSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void commitEditingWithDelegate_didCommitSelector_contextInfo(final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didCommitSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst = get_commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didCommitSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend concludeDragOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_concludeDragOperation_IMetInst(){
		return ((concludeDragOperation_IMetInst != null)
	? (concludeDragOperation_IMetInst)
	: (concludeDragOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "concludeDragOperation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void concludeDragOperation(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend concludeDragOperation_IMetInst = get_concludeDragOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		concludeDragOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		concludeDragOperation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend confinementRectForMenu_onScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_confinementRectForMenu_onScreen_IMetInst(){
		return ((confinementRectForMenu_onScreen_IMetInst != null)
	? (confinementRectForMenu_onScreen_IMetInst)
	: (confinementRectForMenu_onScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "confinementRectForMenu:onScreen:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect confinementRectForMenu_onScreen(final com.apple.jobjc.appkit.NSMenu menu, final com.apple.jobjc.appkit.NSScreen screen){
			final com.apple.jobjc.Invoke.MsgSend confinementRectForMenu_onScreen_IMetInst = get_confinementRectForMenu_onScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		confinementRectForMenu_onScreen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, screen);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		confinementRectForMenu_onScreen_IMetInst.invoke(nativeBuffer, returnValue);
		
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

	private static com.apple.jobjc.Invoke.MsgSend contentViewAtIndex_effectiveCharacterRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentViewAtIndex_effectiveCharacterRange_IMetInst(){
		return ((contentViewAtIndex_effectiveCharacterRange_IMetInst != null)
	? (contentViewAtIndex_effectiveCharacterRange_IMetInst)
	: (contentViewAtIndex_effectiveCharacterRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentViewAtIndex:effectiveCharacterRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView contentViewAtIndex_effectiveCharacterRange(final long index, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ outRange){
			final com.apple.jobjc.Invoke.MsgSend contentViewAtIndex_effectiveCharacterRange_IMetInst = get_contentViewAtIndex_effectiveCharacterRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentViewAtIndex_effectiveCharacterRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, outRange);
		contentViewAtIndex_effectiveCharacterRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend control_didFailToFormatString_errorDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_control_didFailToFormatString_errorDescription_IMetInst(){
		return ((control_didFailToFormatString_errorDescription_IMetInst != null)
	? (control_didFailToFormatString_errorDescription_IMetInst)
	: (control_didFailToFormatString_errorDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "control:didFailToFormatString:errorDescription:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean control_didFailToFormatString_errorDescription(final com.apple.jobjc.appkit.NSControl control, final com.apple.jobjc.foundation.NSString string, final com.apple.jobjc.foundation.NSString error){
			final com.apple.jobjc.Invoke.MsgSend control_didFailToFormatString_errorDescription_IMetInst = get_control_didFailToFormatString_errorDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		control_didFailToFormatString_errorDescription_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, control);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		control_didFailToFormatString_errorDescription_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend control_didFailToValidatePartialString_errorDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_control_didFailToValidatePartialString_errorDescription_IMetInst(){
		return ((control_didFailToValidatePartialString_errorDescription_IMetInst != null)
	? (control_didFailToValidatePartialString_errorDescription_IMetInst)
	: (control_didFailToValidatePartialString_errorDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "control:didFailToValidatePartialString:errorDescription:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void control_didFailToValidatePartialString_errorDescription(final com.apple.jobjc.appkit.NSControl control, final com.apple.jobjc.foundation.NSString string, final com.apple.jobjc.foundation.NSString error){
			final com.apple.jobjc.Invoke.MsgSend control_didFailToValidatePartialString_errorDescription_IMetInst = get_control_didFailToValidatePartialString_errorDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		control_didFailToValidatePartialString_errorDescription_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, control);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		control_didFailToValidatePartialString_errorDescription_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend control_isValidObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_control_isValidObject_IMetInst(){
		return ((control_isValidObject_IMetInst != null)
	? (control_isValidObject_IMetInst)
	: (control_isValidObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "control:isValidObject:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean control_isValidObject(final com.apple.jobjc.appkit.NSControl control, final com.apple.jobjc.ID obj){
			final com.apple.jobjc.Invoke.MsgSend control_isValidObject_IMetInst = get_control_isValidObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		control_isValidObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, control);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		control_isValidObject_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend control_textShouldBeginEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_control_textShouldBeginEditing_IMetInst(){
		return ((control_textShouldBeginEditing_IMetInst != null)
	? (control_textShouldBeginEditing_IMetInst)
	: (control_textShouldBeginEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "control:textShouldBeginEditing:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean control_textShouldBeginEditing(final com.apple.jobjc.appkit.NSControl control, final com.apple.jobjc.appkit.NSText fieldEditor){
			final com.apple.jobjc.Invoke.MsgSend control_textShouldBeginEditing_IMetInst = get_control_textShouldBeginEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		control_textShouldBeginEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, control);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fieldEditor);
		control_textShouldBeginEditing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend control_textShouldEndEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_control_textShouldEndEditing_IMetInst(){
		return ((control_textShouldEndEditing_IMetInst != null)
	? (control_textShouldEndEditing_IMetInst)
	: (control_textShouldEndEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "control:textShouldEndEditing:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean control_textShouldEndEditing(final com.apple.jobjc.appkit.NSControl control, final com.apple.jobjc.appkit.NSText fieldEditor){
			final com.apple.jobjc.Invoke.MsgSend control_textShouldEndEditing_IMetInst = get_control_textShouldEndEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		control_textShouldEndEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, control);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fieldEditor);
		control_textShouldEndEditing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend control_textView_completions_forPartialWordRange_indexOfSelectedItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_control_textView_completions_forPartialWordRange_indexOfSelectedItem_IMetInst(){
		return ((control_textView_completions_forPartialWordRange_indexOfSelectedItem_IMetInst != null)
	? (control_textView_completions_forPartialWordRange_indexOfSelectedItem_IMetInst)
	: (control_textView_completions_forPartialWordRange_indexOfSelectedItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "control:textView:completions:forPartialWordRange:indexOfSelectedItem:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray control_textView_completions_forPartialWordRange_indexOfSelectedItem(final com.apple.jobjc.appkit.NSControl control, final com.apple.jobjc.appkit.NSTextView textView, final com.apple.jobjc.foundation.NSArray words, final com.apple.jobjc.foundation.NSRange charRange, final com.apple.jobjc.Pointer<java.lang.Long> index){
			final com.apple.jobjc.Invoke.MsgSend control_textView_completions_forPartialWordRange_indexOfSelectedItem_IMetInst = get_control_textView_completions_forPartialWordRange_indexOfSelectedItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		control_textView_completions_forPartialWordRange_indexOfSelectedItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, control);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, words);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, index);
		control_textView_completions_forPartialWordRange_indexOfSelectedItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend control_textView_doCommandBySelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_control_textView_doCommandBySelector_IMetInst(){
		return ((control_textView_doCommandBySelector_IMetInst != null)
	? (control_textView_doCommandBySelector_IMetInst)
	: (control_textView_doCommandBySelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "control:textView:doCommandBySelector:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public boolean control_textView_doCommandBySelector(final com.apple.jobjc.appkit.NSControl control, final com.apple.jobjc.appkit.NSTextView textView, final com.apple.jobjc.SEL commandSelector){
			final com.apple.jobjc.Invoke.MsgSend control_textView_doCommandBySelector_IMetInst = get_control_textView_doCommandBySelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		control_textView_doCommandBySelector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, control);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, commandSelector);
		control_textView_doCommandBySelector_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend controlTextDidBeginEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_controlTextDidBeginEditing_IMetInst(){
		return ((controlTextDidBeginEditing_IMetInst != null)
	? (controlTextDidBeginEditing_IMetInst)
	: (controlTextDidBeginEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "controlTextDidBeginEditing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void controlTextDidBeginEditing(final com.apple.jobjc.foundation.NSNotification obj){
			final com.apple.jobjc.Invoke.MsgSend controlTextDidBeginEditing_IMetInst = get_controlTextDidBeginEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		controlTextDidBeginEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		controlTextDidBeginEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend controlTextDidChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_controlTextDidChange_IMetInst(){
		return ((controlTextDidChange_IMetInst != null)
	? (controlTextDidChange_IMetInst)
	: (controlTextDidChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "controlTextDidChange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void controlTextDidChange(final com.apple.jobjc.foundation.NSNotification obj){
			final com.apple.jobjc.Invoke.MsgSend controlTextDidChange_IMetInst = get_controlTextDidChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		controlTextDidChange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		controlTextDidChange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend controlTextDidEndEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_controlTextDidEndEditing_IMetInst(){
		return ((controlTextDidEndEditing_IMetInst != null)
	? (controlTextDidEndEditing_IMetInst)
	: (controlTextDidEndEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "controlTextDidEndEditing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void controlTextDidEndEditing(final com.apple.jobjc.foundation.NSNotification obj){
			final com.apple.jobjc.Invoke.MsgSend controlTextDidEndEditing_IMetInst = get_controlTextDidEndEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		controlTextDidEndEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		controlTextDidEndEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend conversationIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_conversationIdentifier_IMetInst(){
		return ((conversationIdentifier_IMetInst != null)
	? (conversationIdentifier_IMetInst)
	: (conversationIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "conversationIdentifier", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long conversationIdentifier(){
			final com.apple.jobjc.Invoke.MsgSend conversationIdentifier_IMetInst = get_conversationIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		conversationIdentifier_IMetInst.init(nativeBuffer, this);
		conversationIdentifier_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentMode_IMetInst(){
		return ((currentMode_IMetInst != null)
	? (currentMode_IMetInst)
	: (currentMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentMode", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long currentMode(){
			final com.apple.jobjc.Invoke.MsgSend currentMode_IMetInst = get_currentMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentMode_IMetInst.init(nativeBuffer, this);
		currentMode_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend customWindowsToEnterFullScreenForWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_customWindowsToEnterFullScreenForWindow_IMetInst(){
		return ((customWindowsToEnterFullScreenForWindow_IMetInst != null)
	? (customWindowsToEnterFullScreenForWindow_IMetInst)
	: (customWindowsToEnterFullScreenForWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "customWindowsToEnterFullScreenForWindow:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray customWindowsToEnterFullScreenForWindow(final com.apple.jobjc.appkit.NSWindow window){
			final com.apple.jobjc.Invoke.MsgSend customWindowsToEnterFullScreenForWindow_IMetInst = get_customWindowsToEnterFullScreenForWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		customWindowsToEnterFullScreenForWindow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		customWindowsToEnterFullScreenForWindow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend customWindowsToExitFullScreenForWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_customWindowsToExitFullScreenForWindow_IMetInst(){
		return ((customWindowsToExitFullScreenForWindow_IMetInst != null)
	? (customWindowsToExitFullScreenForWindow_IMetInst)
	: (customWindowsToExitFullScreenForWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "customWindowsToExitFullScreenForWindow:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray customWindowsToExitFullScreenForWindow(final com.apple.jobjc.appkit.NSWindow window){
			final com.apple.jobjc.Invoke.MsgSend customWindowsToExitFullScreenForWindow_IMetInst = get_customWindowsToExitFullScreenForWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		customWindowsToExitFullScreenForWindow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		customWindowsToExitFullScreenForWindow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend datePickerCell_validateProposedDateValue_timeInterval_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_datePickerCell_validateProposedDateValue_timeInterval_IMetInst(){
		return ((datePickerCell_validateProposedDateValue_timeInterval_IMetInst != null)
	? (datePickerCell_validateProposedDateValue_timeInterval_IMetInst)
	: (datePickerCell_validateProposedDateValue_timeInterval_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "datePickerCell:validateProposedDateValue:timeInterval:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void datePickerCell_validateProposedDateValue_timeInterval(final com.apple.jobjc.appkit.NSDatePickerCell aDatePickerCell, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDate> proposedDateValue, final com.apple.jobjc.Pointer<java.lang.Double> proposedTimeInterval){
			final com.apple.jobjc.Invoke.MsgSend datePickerCell_validateProposedDateValue_timeInterval_IMetInst = get_datePickerCell_validateProposedDateValue_timeInterval_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		datePickerCell_validateProposedDateValue_timeInterval_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aDatePickerCell);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, proposedDateValue);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, proposedTimeInterval);
		datePickerCell_validateProposedDateValue_timeInterval_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend detachColorList_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_detachColorList_IMetInst(){
		return ((detachColorList_IMetInst != null)
	? (detachColorList_IMetInst)
	: (detachColorList_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "detachColorList:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void detachColorList(final com.apple.jobjc.appkit.NSColorList colorList){
			final com.apple.jobjc.Invoke.MsgSend detachColorList_IMetInst = get_detachColorList_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		detachColorList_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, colorList);
		detachColorList_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend detachableWindowForPopover_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_detachableWindowForPopover_IMetInst(){
		return ((detachableWindowForPopover_IMetInst != null)
	? (detachableWindowForPopover_IMetInst)
	: (detachableWindowForPopover_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "detachableWindowForPopover:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSWindow detachableWindowForPopover(final com.apple.jobjc.appkit.NSPopover popover){
			final com.apple.jobjc.Invoke.MsgSend detachableWindowForPopover_IMetInst = get_detachableWindowForPopover_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		detachableWindowForPopover_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, popover);
		detachableWindowForPopover_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSWindow returnValue = (com.apple.jobjc.appkit.NSWindow) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend didReplaceCharacters_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_didReplaceCharacters_IMetInst(){
		return ((didReplaceCharacters_IMetInst != null)
	? (didReplaceCharacters_IMetInst)
	: (didReplaceCharacters_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "didReplaceCharacters", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void didReplaceCharacters(){
			final com.apple.jobjc.Invoke.MsgSend didReplaceCharacters_IMetInst = get_didReplaceCharacters_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		didReplaceCharacters_IMetInst.init(nativeBuffer, this);
		didReplaceCharacters_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend discardEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_discardEditing_IMetInst(){
		return ((discardEditing_IMetInst != null)
	? (discardEditing_IMetInst)
	: (discardEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "discardEditing", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void discardEditing(){
			final com.apple.jobjc.Invoke.MsgSend discardEditing_IMetInst = get_discardEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		discardEditing_IMetInst.init(nativeBuffer, this);
		discardEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend doCommandBySelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_doCommandBySelector_IMetInst(){
		return ((doCommandBySelector_IMetInst != null)
	? (doCommandBySelector_IMetInst)
	: (doCommandBySelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "doCommandBySelector:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public void doCommandBySelector(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.MsgSend doCommandBySelector_IMetInst = get_doCommandBySelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		doCommandBySelector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		doCommandBySelector_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend doCommandBySelector_client_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_doCommandBySelector_client_IMetInst(){
		return ((doCommandBySelector_client_IMetInst != null)
	? (doCommandBySelector_client_IMetInst)
	: (doCommandBySelector_client_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "doCommandBySelector:client:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void doCommandBySelector_client(final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend doCommandBySelector_client_IMetInst = get_doCommandBySelector_client_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		doCommandBySelector_client_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		doCommandBySelector_client_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend dockMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dockMenu_IMetInst(){
		return ((dockMenu_IMetInst != null)
	? (dockMenu_IMetInst)
	: (dockMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dockMenu", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu dockMenu(){
			final com.apple.jobjc.Invoke.MsgSend dockMenu_IMetInst = get_dockMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dockMenu_IMetInst.init(nativeBuffer, this);
		dockMenu_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggedImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggedImage_IMetInst(){
		return ((draggedImage_IMetInst != null)
	? (draggedImage_IMetInst)
	: (draggedImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggedImage", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage draggedImage(){
			final com.apple.jobjc.Invoke.MsgSend draggedImage_IMetInst = get_draggedImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggedImage_IMetInst.init(nativeBuffer, this);
		draggedImage_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggedImage_beganAt_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggedImage_beganAt_IMetInst(){
		return ((draggedImage_beganAt_IMetInst != null)
	? (draggedImage_beganAt_IMetInst)
	: (draggedImage_beganAt_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggedImage:beganAt:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void draggedImage_beganAt(final com.apple.jobjc.appkit.NSImage image, final com.apple.jobjc.foundation.NSPoint screenPoint){
			final com.apple.jobjc.Invoke.MsgSend draggedImage_beganAt_IMetInst = get_draggedImage_beganAt_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggedImage_beganAt_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, screenPoint);
		draggedImage_beganAt_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend draggedImage_endedAt_deposited_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggedImage_endedAt_deposited_IMetInst(){
		return ((draggedImage_endedAt_deposited_IMetInst != null)
	? (draggedImage_endedAt_deposited_IMetInst)
	: (draggedImage_endedAt_deposited_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggedImage:endedAt:deposited:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void draggedImage_endedAt_deposited(final com.apple.jobjc.appkit.NSImage image, final com.apple.jobjc.foundation.NSPoint screenPoint, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend draggedImage_endedAt_deposited_IMetInst = get_draggedImage_endedAt_deposited_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggedImage_endedAt_deposited_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, screenPoint);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		draggedImage_endedAt_deposited_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend draggedImage_endedAt_operation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggedImage_endedAt_operation_IMetInst(){
		return ((draggedImage_endedAt_operation_IMetInst != null)
	? (draggedImage_endedAt_operation_IMetInst)
	: (draggedImage_endedAt_operation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggedImage:endedAt:operation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void draggedImage_endedAt_operation(final com.apple.jobjc.appkit.NSImage image, final com.apple.jobjc.foundation.NSPoint screenPoint, final long operation){
			final com.apple.jobjc.Invoke.MsgSend draggedImage_endedAt_operation_IMetInst = get_draggedImage_endedAt_operation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggedImage_endedAt_operation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, screenPoint);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, operation);
		draggedImage_endedAt_operation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend draggedImage_movedTo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggedImage_movedTo_IMetInst(){
		return ((draggedImage_movedTo_IMetInst != null)
	? (draggedImage_movedTo_IMetInst)
	: (draggedImage_movedTo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggedImage:movedTo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void draggedImage_movedTo(final com.apple.jobjc.appkit.NSImage image, final com.apple.jobjc.foundation.NSPoint screenPoint){
			final com.apple.jobjc.Invoke.MsgSend draggedImage_movedTo_IMetInst = get_draggedImage_movedTo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggedImage_movedTo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, screenPoint);
		draggedImage_movedTo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend draggedImageLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggedImageLocation_IMetInst(){
		return ((draggedImageLocation_IMetInst != null)
	? (draggedImageLocation_IMetInst)
	: (draggedImageLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggedImageLocation", com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint draggedImageLocation(){
			final com.apple.jobjc.Invoke.MsgSend draggedImageLocation_IMetInst = get_draggedImageLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggedImageLocation_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		draggedImageLocation_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingDestinationWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingDestinationWindow_IMetInst(){
		return ((draggingDestinationWindow_IMetInst != null)
	? (draggingDestinationWindow_IMetInst)
	: (draggingDestinationWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingDestinationWindow", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSWindow draggingDestinationWindow(){
			final com.apple.jobjc.Invoke.MsgSend draggingDestinationWindow_IMetInst = get_draggingDestinationWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingDestinationWindow_IMetInst.init(nativeBuffer, this);
		draggingDestinationWindow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSWindow returnValue = (com.apple.jobjc.appkit.NSWindow) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingEnded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingEnded_IMetInst(){
		return ((draggingEnded_IMetInst != null)
	? (draggingEnded_IMetInst)
	: (draggingEnded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingEnded:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void draggingEnded(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend draggingEnded_IMetInst = get_draggingEnded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingEnded_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		draggingEnded_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingEntered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingEntered_IMetInst(){
		return ((draggingEntered_IMetInst != null)
	? (draggingEntered_IMetInst)
	: (draggingEntered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingEntered:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long draggingEntered(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend draggingEntered_IMetInst = get_draggingEntered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingEntered_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		draggingEntered_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingExited_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingExited_IMetInst(){
		return ((draggingExited_IMetInst != null)
	? (draggingExited_IMetInst)
	: (draggingExited_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingExited:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void draggingExited(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend draggingExited_IMetInst = get_draggingExited_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingExited_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		draggingExited_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingFormation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingFormation_IMetInst(){
		return ((draggingFormation_IMetInst != null)
	? (draggingFormation_IMetInst)
	: (draggingFormation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingFormation", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long draggingFormation(){
			final com.apple.jobjc.Invoke.MsgSend draggingFormation_IMetInst = get_draggingFormation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingFormation_IMetInst.init(nativeBuffer, this);
		draggingFormation_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingLocation_IMetInst(){
		return ((draggingLocation_IMetInst != null)
	? (draggingLocation_IMetInst)
	: (draggingLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingLocation", com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint draggingLocation(){
			final com.apple.jobjc.Invoke.MsgSend draggingLocation_IMetInst = get_draggingLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingLocation_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		draggingLocation_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingPasteboard_IMetInst(){
		return ((draggingPasteboard_IMetInst != null)
	? (draggingPasteboard_IMetInst)
	: (draggingPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingPasteboard", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPasteboard draggingPasteboard(){
			final com.apple.jobjc.Invoke.MsgSend draggingPasteboard_IMetInst = get_draggingPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingPasteboard_IMetInst.init(nativeBuffer, this);
		draggingPasteboard_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPasteboard returnValue = (com.apple.jobjc.appkit.NSPasteboard) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingSequenceNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingSequenceNumber_IMetInst(){
		return ((draggingSequenceNumber_IMetInst != null)
	? (draggingSequenceNumber_IMetInst)
	: (draggingSequenceNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingSequenceNumber", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long draggingSequenceNumber(){
			final com.apple.jobjc.Invoke.MsgSend draggingSequenceNumber_IMetInst = get_draggingSequenceNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingSequenceNumber_IMetInst.init(nativeBuffer, this);
		draggingSequenceNumber_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingSession_endedAtPoint_operation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingSession_endedAtPoint_operation_IMetInst(){
		return ((draggingSession_endedAtPoint_operation_IMetInst != null)
	? (draggingSession_endedAtPoint_operation_IMetInst)
	: (draggingSession_endedAtPoint_operation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingSession:endedAtPoint:operation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void draggingSession_endedAtPoint_operation(final com.apple.jobjc.appkit.NSDraggingSession session, final com.apple.jobjc.foundation.NSPoint screenPoint, final long operation){
			final com.apple.jobjc.Invoke.MsgSend draggingSession_endedAtPoint_operation_IMetInst = get_draggingSession_endedAtPoint_operation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingSession_endedAtPoint_operation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, session);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, screenPoint);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, operation);
		draggingSession_endedAtPoint_operation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingSession_movedToPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingSession_movedToPoint_IMetInst(){
		return ((draggingSession_movedToPoint_IMetInst != null)
	? (draggingSession_movedToPoint_IMetInst)
	: (draggingSession_movedToPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingSession:movedToPoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void draggingSession_movedToPoint(final com.apple.jobjc.appkit.NSDraggingSession session, final com.apple.jobjc.foundation.NSPoint screenPoint){
			final com.apple.jobjc.Invoke.MsgSend draggingSession_movedToPoint_IMetInst = get_draggingSession_movedToPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingSession_movedToPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, session);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, screenPoint);
		draggingSession_movedToPoint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingSession_sourceOperationMaskForDraggingContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingSession_sourceOperationMaskForDraggingContext_IMetInst(){
		return ((draggingSession_sourceOperationMaskForDraggingContext_IMetInst != null)
	? (draggingSession_sourceOperationMaskForDraggingContext_IMetInst)
	: (draggingSession_sourceOperationMaskForDraggingContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingSession:sourceOperationMaskForDraggingContext:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long draggingSession_sourceOperationMaskForDraggingContext(final com.apple.jobjc.appkit.NSDraggingSession session, final long context){
			final com.apple.jobjc.Invoke.MsgSend draggingSession_sourceOperationMaskForDraggingContext_IMetInst = get_draggingSession_sourceOperationMaskForDraggingContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingSession_sourceOperationMaskForDraggingContext_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, session);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, context);
		draggingSession_sourceOperationMaskForDraggingContext_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingSession_willBeginAtPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingSession_willBeginAtPoint_IMetInst(){
		return ((draggingSession_willBeginAtPoint_IMetInst != null)
	? (draggingSession_willBeginAtPoint_IMetInst)
	: (draggingSession_willBeginAtPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingSession:willBeginAtPoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void draggingSession_willBeginAtPoint(final com.apple.jobjc.appkit.NSDraggingSession session, final com.apple.jobjc.foundation.NSPoint screenPoint){
			final com.apple.jobjc.Invoke.MsgSend draggingSession_willBeginAtPoint_IMetInst = get_draggingSession_willBeginAtPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingSession_willBeginAtPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, session);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, screenPoint);
		draggingSession_willBeginAtPoint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingSource_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingSource_IMetInst(){
		return ((draggingSource_IMetInst != null)
	? (draggingSource_IMetInst)
	: (draggingSource_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingSource", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T draggingSource(){
			final com.apple.jobjc.Invoke.MsgSend draggingSource_IMetInst = get_draggingSource_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingSource_IMetInst.init(nativeBuffer, this);
		draggingSource_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingSourceOperationMask_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingSourceOperationMask_IMetInst(){
		return ((draggingSourceOperationMask_IMetInst != null)
	? (draggingSourceOperationMask_IMetInst)
	: (draggingSourceOperationMask_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingSourceOperationMask", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long draggingSourceOperationMask(){
			final com.apple.jobjc.Invoke.MsgSend draggingSourceOperationMask_IMetInst = get_draggingSourceOperationMask_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingSourceOperationMask_IMetInst.init(nativeBuffer, this);
		draggingSourceOperationMask_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingSourceOperationMaskForLocal_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingSourceOperationMaskForLocal_IMetInst(){
		return ((draggingSourceOperationMaskForLocal_IMetInst != null)
	? (draggingSourceOperationMaskForLocal_IMetInst)
	: (draggingSourceOperationMaskForLocal_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingSourceOperationMaskForLocal:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public long draggingSourceOperationMaskForLocal(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend draggingSourceOperationMaskForLocal_IMetInst = get_draggingSourceOperationMaskForLocal_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingSourceOperationMaskForLocal_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		draggingSourceOperationMaskForLocal_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingUpdated_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingUpdated_IMetInst(){
		return ((draggingUpdated_IMetInst != null)
	? (draggingUpdated_IMetInst)
	: (draggingUpdated_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingUpdated:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long draggingUpdated(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend draggingUpdated_IMetInst = get_draggingUpdated_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingUpdated_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		draggingUpdated_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawCharactersInRange_forContentView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawCharactersInRange_forContentView_IMetInst(){
		return ((drawCharactersInRange_forContentView_IMetInst != null)
	? (drawCharactersInRange_forContentView_IMetInst)
	: (drawCharactersInRange_forContentView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawCharactersInRange:forContentView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawCharactersInRange_forContentView(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend drawCharactersInRange_forContentView_IMetInst = get_drawCharactersInRange_forContentView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawCharactersInRange_forContentView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		drawCharactersInRange_forContentView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawWithFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawWithFrame_inView_IMetInst(){
		return ((drawWithFrame_inView_IMetInst != null)
	? (drawWithFrame_inView_IMetInst)
	: (drawWithFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawWithFrame:inView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawWithFrame_inView(final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend drawWithFrame_inView_IMetInst = get_drawWithFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawWithFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		drawWithFrame_inView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawWithFrame_inView_characterIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawWithFrame_inView_characterIndex_IMetInst(){
		return ((drawWithFrame_inView_characterIndex_IMetInst != null)
	? (drawWithFrame_inView_characterIndex_IMetInst)
	: (drawWithFrame_inView_characterIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawWithFrame:inView:characterIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void drawWithFrame_inView_characterIndex(final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView, final long charIndex){
			final com.apple.jobjc.Invoke.MsgSend drawWithFrame_inView_characterIndex_IMetInst = get_drawWithFrame_inView_characterIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawWithFrame_inView_characterIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		drawWithFrame_inView_characterIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawWithFrame_inView_characterIndex_layoutManager_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawWithFrame_inView_characterIndex_layoutManager_IMetInst(){
		return ((drawWithFrame_inView_characterIndex_layoutManager_IMetInst != null)
	? (drawWithFrame_inView_characterIndex_layoutManager_IMetInst)
	: (drawWithFrame_inView_characterIndex_layoutManager_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawWithFrame:inView:characterIndex:layoutManager:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawWithFrame_inView_characterIndex_layoutManager(final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView, final long charIndex, final com.apple.jobjc.appkit.NSLayoutManager layoutManager){
			final com.apple.jobjc.Invoke.MsgSend drawWithFrame_inView_characterIndex_layoutManager_IMetInst = get_drawWithFrame_inView_characterIndex_layoutManager_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawWithFrame_inView_characterIndex_layoutManager_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, layoutManager);
		drawWithFrame_inView_characterIndex_layoutManager_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawerDidClose_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawerDidClose_IMetInst(){
		return ((drawerDidClose_IMetInst != null)
	? (drawerDidClose_IMetInst)
	: (drawerDidClose_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawerDidClose:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawerDidClose(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend drawerDidClose_IMetInst = get_drawerDidClose_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawerDidClose_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		drawerDidClose_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawerDidOpen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawerDidOpen_IMetInst(){
		return ((drawerDidOpen_IMetInst != null)
	? (drawerDidOpen_IMetInst)
	: (drawerDidOpen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawerDidOpen:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawerDidOpen(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend drawerDidOpen_IMetInst = get_drawerDidOpen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawerDidOpen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		drawerDidOpen_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawerShouldClose_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawerShouldClose_IMetInst(){
		return ((drawerShouldClose_IMetInst != null)
	? (drawerShouldClose_IMetInst)
	: (drawerShouldClose_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawerShouldClose:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean drawerShouldClose(final com.apple.jobjc.appkit.NSDrawer sender){
			final com.apple.jobjc.Invoke.MsgSend drawerShouldClose_IMetInst = get_drawerShouldClose_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawerShouldClose_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		drawerShouldClose_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawerShouldOpen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawerShouldOpen_IMetInst(){
		return ((drawerShouldOpen_IMetInst != null)
	? (drawerShouldOpen_IMetInst)
	: (drawerShouldOpen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawerShouldOpen:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean drawerShouldOpen(final com.apple.jobjc.appkit.NSDrawer sender){
			final com.apple.jobjc.Invoke.MsgSend drawerShouldOpen_IMetInst = get_drawerShouldOpen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawerShouldOpen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		drawerShouldOpen_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawerWillClose_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawerWillClose_IMetInst(){
		return ((drawerWillClose_IMetInst != null)
	? (drawerWillClose_IMetInst)
	: (drawerWillClose_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawerWillClose:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawerWillClose(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend drawerWillClose_IMetInst = get_drawerWillClose_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawerWillClose_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		drawerWillClose_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawerWillOpen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawerWillOpen_IMetInst(){
		return ((drawerWillOpen_IMetInst != null)
	? (drawerWillOpen_IMetInst)
	: (drawerWillOpen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawerWillOpen:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawerWillOpen(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend drawerWillOpen_IMetInst = get_drawerWillOpen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawerWillOpen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		drawerWillOpen_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawerWillResizeContents_toSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawerWillResizeContents_toSize_IMetInst(){
		return ((drawerWillResizeContents_toSize_IMetInst != null)
	? (drawerWillResizeContents_toSize_IMetInst)
	: (drawerWillResizeContents_toSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawerWillResizeContents:toSize:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize drawerWillResizeContents_toSize(final com.apple.jobjc.appkit.NSDrawer sender, final com.apple.jobjc.foundation.NSSize contentSize){
			final com.apple.jobjc.Invoke.MsgSend drawerWillResizeContents_toSize_IMetInst = get_drawerWillResizeContents_toSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawerWillResizeContents_toSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, contentSize);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		drawerWillResizeContents_toSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawsVerticallyForCharacterAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawsVerticallyForCharacterAtIndex_IMetInst(){
		return ((drawsVerticallyForCharacterAtIndex_IMetInst != null)
	? (drawsVerticallyForCharacterAtIndex_IMetInst)
	: (drawsVerticallyForCharacterAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawsVerticallyForCharacterAtIndex:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean drawsVerticallyForCharacterAtIndex(final long charIndex){
			final com.apple.jobjc.Invoke.MsgSend drawsVerticallyForCharacterAtIndex_IMetInst = get_drawsVerticallyForCharacterAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawsVerticallyForCharacterAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		drawsVerticallyForCharacterAtIndex_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock_IMetInst(){
		return ((enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock_IMetInst != null)
	? (enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock_IMetInst)
	: (enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateDraggingItemsWithOptions:forView:classes:searchOptions:usingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock(final long enumOpts, final com.apple.jobjc.appkit.NSView view, final com.apple.jobjc.foundation.NSArray classArray, final com.apple.jobjc.foundation.NSDictionary searchOptions, final Object /* void(^)(NSDraggingItem*,NSInteger,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock_IMetInst = get_enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, enumOpts);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, classArray);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, searchOptions);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend exposedBindings_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_exposedBindings_IMetInst(){
		return ((exposedBindings_IMetInst != null)
	? (exposedBindings_IMetInst)
	: (exposedBindings_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "exposedBindings", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray exposedBindings(){
			final com.apple.jobjc.Invoke.MsgSend exposedBindings_IMetInst = get_exposedBindings_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		exposedBindings_IMetInst.init(nativeBuffer, this);
		exposedBindings_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend findBarView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_findBarView_IMetInst(){
		return ((findBarView_IMetInst != null)
	? (findBarView_IMetInst)
	: (findBarView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "findBarView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView findBarView(){
			final com.apple.jobjc.Invoke.MsgSend findBarView_IMetInst = get_findBarView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		findBarView_IMetInst.init(nativeBuffer, this);
		findBarView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend findBarViewDidChangeHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_findBarViewDidChangeHeight_IMetInst(){
		return ((findBarViewDidChangeHeight_IMetInst != null)
	? (findBarViewDidChangeHeight_IMetInst)
	: (findBarViewDidChangeHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "findBarViewDidChangeHeight", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void findBarViewDidChangeHeight(){
			final com.apple.jobjc.Invoke.MsgSend findBarViewDidChangeHeight_IMetInst = get_findBarViewDidChangeHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		findBarViewDidChangeHeight_IMetInst.init(nativeBuffer, this);
		findBarViewDidChangeHeight_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend firstRectForCharacterRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_firstRectForCharacterRange_IMetInst(){
		return ((firstRectForCharacterRange_IMetInst != null)
	? (firstRectForCharacterRange_IMetInst)
	: (firstRectForCharacterRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "firstRectForCharacterRange:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect firstRectForCharacterRange(final com.apple.jobjc.foundation.NSRange theRange){
			final com.apple.jobjc.Invoke.MsgSend firstRectForCharacterRange_IMetInst = get_firstRectForCharacterRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		firstRectForCharacterRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, theRange);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		firstRectForCharacterRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend firstRectForCharacterRange_actualRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_firstRectForCharacterRange_actualRange_IMetInst(){
		return ((firstRectForCharacterRange_actualRange_IMetInst != null)
	? (firstRectForCharacterRange_actualRange_IMetInst)
	: (firstRectForCharacterRange_actualRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "firstRectForCharacterRange:actualRange:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect firstRectForCharacterRange_actualRange(final com.apple.jobjc.foundation.NSRange aRange, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ actualRange){
			final com.apple.jobjc.Invoke.MsgSend firstRectForCharacterRange_actualRange_IMetInst = get_firstRectForCharacterRange_actualRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		firstRectForCharacterRange_actualRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, aRange);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, actualRange);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		firstRectForCharacterRange_actualRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend firstSelectedRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_firstSelectedRange_IMetInst(){
		return ((firstSelectedRange_IMetInst != null)
	? (firstSelectedRange_IMetInst)
	: (firstSelectedRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "firstSelectedRange", com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange firstSelectedRange(){
			final com.apple.jobjc.Invoke.MsgSend firstSelectedRange_IMetInst = get_firstSelectedRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		firstSelectedRange_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		firstSelectedRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontManager_willIncludeFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontManager_willIncludeFont_IMetInst(){
		return ((fontManager_willIncludeFont_IMetInst != null)
	? (fontManager_willIncludeFont_IMetInst)
	: (fontManager_willIncludeFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontManager:willIncludeFont:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean fontManager_willIncludeFont(final com.apple.jobjc.ID sender, final com.apple.jobjc.foundation.NSString fontName){
			final com.apple.jobjc.Invoke.MsgSend fontManager_willIncludeFont_IMetInst = get_fontManager_willIncludeFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontManager_willIncludeFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontName);
		fontManager_willIncludeFont_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fractionOfDistanceThroughGlyphForPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fractionOfDistanceThroughGlyphForPoint_IMetInst(){
		return ((fractionOfDistanceThroughGlyphForPoint_IMetInst != null)
	? (fractionOfDistanceThroughGlyphForPoint_IMetInst)
	: (fractionOfDistanceThroughGlyphForPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fractionOfDistanceThroughGlyphForPoint:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public double fractionOfDistanceThroughGlyphForPoint(final com.apple.jobjc.foundation.NSPoint aPoint){
			final com.apple.jobjc.Invoke.MsgSend fractionOfDistanceThroughGlyphForPoint_IMetInst = get_fractionOfDistanceThroughGlyphForPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fractionOfDistanceThroughGlyphForPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
		fractionOfDistanceThroughGlyphForPoint_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasMarkedText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasMarkedText_IMetInst(){
		return ((hasMarkedText_IMetInst != null)
	? (hasMarkedText_IMetInst)
	: (hasMarkedText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasMarkedText", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasMarkedText(){
			final com.apple.jobjc.Invoke.MsgSend hasMarkedText_IMetInst = get_hasMarkedText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasMarkedText_IMetInst.init(nativeBuffer, this);
		hasMarkedText_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend highlight_withFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_highlight_withFrame_inView_IMetInst(){
		return ((highlight_withFrame_inView_IMetInst != null)
	? (highlight_withFrame_inView_IMetInst)
	: (highlight_withFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "highlight:withFrame:inView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void highlight_withFrame_inView(final boolean flag, final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend highlight_withFrame_inView_IMetInst = get_highlight_withFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		highlight_withFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		highlight_withFrame_inView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend identifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_identifier_IMetInst(){
		return ((identifier_IMetInst != null)
	? (identifier_IMetInst)
	: (identifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "identifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString identifier(){
			final com.apple.jobjc.Invoke.MsgSend identifier_IMetInst = get_identifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		identifier_IMetInst.init(nativeBuffer, this);
		identifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ignoreModifierKeysForDraggingSession_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ignoreModifierKeysForDraggingSession_IMetInst(){
		return ((ignoreModifierKeysForDraggingSession_IMetInst != null)
	? (ignoreModifierKeysForDraggingSession_IMetInst)
	: (ignoreModifierKeysForDraggingSession_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ignoreModifierKeysForDraggingSession:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean ignoreModifierKeysForDraggingSession(final com.apple.jobjc.appkit.NSDraggingSession session){
			final com.apple.jobjc.Invoke.MsgSend ignoreModifierKeysForDraggingSession_IMetInst = get_ignoreModifierKeysForDraggingSession_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ignoreModifierKeysForDraggingSession_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, session);
		ignoreModifierKeysForDraggingSession_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ignoreModifierKeysWhileDragging_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ignoreModifierKeysWhileDragging_IMetInst(){
		return ((ignoreModifierKeysWhileDragging_IMetInst != null)
	? (ignoreModifierKeysWhileDragging_IMetInst)
	: (ignoreModifierKeysWhileDragging_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ignoreModifierKeysWhileDragging", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean ignoreModifierKeysWhileDragging(){
			final com.apple.jobjc.Invoke.MsgSend ignoreModifierKeysWhileDragging_IMetInst = get_ignoreModifierKeysWhileDragging_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ignoreModifierKeysWhileDragging_IMetInst.init(nativeBuffer, this);
		ignoreModifierKeysWhileDragging_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ignoreSpelling_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ignoreSpelling_IMetInst(){
		return ((ignoreSpelling_IMetInst != null)
	? (ignoreSpelling_IMetInst)
	: (ignoreSpelling_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ignoreSpelling:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void ignoreSpelling(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend ignoreSpelling_IMetInst = get_ignoreSpelling_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ignoreSpelling_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		ignoreSpelling_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend image_didLoadPartOfRepresentation_withValidRows_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_image_didLoadPartOfRepresentation_withValidRows_IMetInst(){
		return ((image_didLoadPartOfRepresentation_withValidRows_IMetInst != null)
	? (image_didLoadPartOfRepresentation_withValidRows_IMetInst)
	: (image_didLoadPartOfRepresentation_withValidRows_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "image:didLoadPartOfRepresentation:withValidRows:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void image_didLoadPartOfRepresentation_withValidRows(final com.apple.jobjc.appkit.NSImage image, final com.apple.jobjc.appkit.NSImageRep rep, final long rows){
			final com.apple.jobjc.Invoke.MsgSend image_didLoadPartOfRepresentation_withValidRows_IMetInst = get_image_didLoadPartOfRepresentation_withValidRows_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		image_didLoadPartOfRepresentation_withValidRows_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rep);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, rows);
		image_didLoadPartOfRepresentation_withValidRows_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend image_didLoadRepresentation_withStatus_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_image_didLoadRepresentation_withStatus_IMetInst(){
		return ((image_didLoadRepresentation_withStatus_IMetInst != null)
	? (image_didLoadRepresentation_withStatus_IMetInst)
	: (image_didLoadRepresentation_withStatus_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "image:didLoadRepresentation:withStatus:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void image_didLoadRepresentation_withStatus(final com.apple.jobjc.appkit.NSImage image, final com.apple.jobjc.appkit.NSImageRep rep, final long status){
			final com.apple.jobjc.Invoke.MsgSend image_didLoadRepresentation_withStatus_IMetInst = get_image_didLoadRepresentation_withStatus_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		image_didLoadRepresentation_withStatus_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rep);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, status);
		image_didLoadRepresentation_withStatus_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend image_didLoadRepresentationHeader_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_image_didLoadRepresentationHeader_IMetInst(){
		return ((image_didLoadRepresentationHeader_IMetInst != null)
	? (image_didLoadRepresentationHeader_IMetInst)
	: (image_didLoadRepresentationHeader_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "image:didLoadRepresentationHeader:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void image_didLoadRepresentationHeader(final com.apple.jobjc.appkit.NSImage image, final com.apple.jobjc.appkit.NSImageRep rep){
			final com.apple.jobjc.Invoke.MsgSend image_didLoadRepresentationHeader_IMetInst = get_image_didLoadRepresentationHeader_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		image_didLoadRepresentationHeader_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rep);
		image_didLoadRepresentationHeader_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend image_willLoadRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_image_willLoadRepresentation_IMetInst(){
		return ((image_willLoadRepresentation_IMetInst != null)
	? (image_willLoadRepresentation_IMetInst)
	: (image_willLoadRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "image:willLoadRepresentation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void image_willLoadRepresentation(final com.apple.jobjc.appkit.NSImage image, final com.apple.jobjc.appkit.NSImageRep rep){
			final com.apple.jobjc.Invoke.MsgSend image_willLoadRepresentation_IMetInst = get_image_willLoadRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		image_willLoadRepresentation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rep);
		image_willLoadRepresentation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend imageDidNotDraw_inRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageDidNotDraw_inRect_IMetInst(){
		return ((imageDidNotDraw_inRect_IMetInst != null)
	? (imageDidNotDraw_inRect_IMetInst)
	: (imageDidNotDraw_inRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageDidNotDraw:inRect:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.appkit.NSImage imageDidNotDraw_inRect(final com.apple.jobjc.ID sender, final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend imageDidNotDraw_inRect_IMetInst = get_imageDidNotDraw_inRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageDidNotDraw_inRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		imageDidNotDraw_inRect_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend infoForBinding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_infoForBinding_IMetInst(){
		return ((infoForBinding_IMetInst != null)
	? (infoForBinding_IMetInst)
	: (infoForBinding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "infoForBinding:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary infoForBinding(final com.apple.jobjc.foundation.NSString binding){
			final com.apple.jobjc.Invoke.MsgSend infoForBinding_IMetInst = get_infoForBinding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		infoForBinding_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, binding);
		infoForBinding_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithPasteboardPropertyList_ofType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithPasteboardPropertyList_ofType_IMetInst(){
		return ((initWithPasteboardPropertyList_ofType_IMetInst != null)
	? (initWithPasteboardPropertyList_ofType_IMetInst)
	: (initWithPasteboardPropertyList_ofType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithPasteboardPropertyList:ofType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithPasteboardPropertyList_ofType(final com.apple.jobjc.ID propertyList, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend initWithPasteboardPropertyList_ofType_IMetInst = get_initWithPasteboardPropertyList_ofType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithPasteboardPropertyList_ofType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, propertyList);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		initWithPasteboardPropertyList_ofType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithPickerMask_colorPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithPickerMask_colorPanel_IMetInst(){
		return ((initWithPickerMask_colorPanel_IMetInst != null)
	? (initWithPickerMask_colorPanel_IMetInst)
	: (initWithPickerMask_colorPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithPickerMask:colorPanel:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithPickerMask_colorPanel(final long mask, final com.apple.jobjc.appkit.NSColorPanel owningColorPanel){
			final com.apple.jobjc.Invoke.MsgSend initWithPickerMask_colorPanel_IMetInst = get_initWithPickerMask_colorPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithPickerMask_colorPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, owningColorPanel);
		initWithPickerMask_colorPanel_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend inputClientBecomeActive_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_inputClientBecomeActive_IMetInst(){
		return ((inputClientBecomeActive_IMetInst != null)
	? (inputClientBecomeActive_IMetInst)
	: (inputClientBecomeActive_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "inputClientBecomeActive:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void inputClientBecomeActive(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend inputClientBecomeActive_IMetInst = get_inputClientBecomeActive_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		inputClientBecomeActive_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		inputClientBecomeActive_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend inputClientDisabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_inputClientDisabled_IMetInst(){
		return ((inputClientDisabled_IMetInst != null)
	? (inputClientDisabled_IMetInst)
	: (inputClientDisabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "inputClientDisabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void inputClientDisabled(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend inputClientDisabled_IMetInst = get_inputClientDisabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		inputClientDisabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		inputClientDisabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend inputClientEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_inputClientEnabled_IMetInst(){
		return ((inputClientEnabled_IMetInst != null)
	? (inputClientEnabled_IMetInst)
	: (inputClientEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "inputClientEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void inputClientEnabled(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend inputClientEnabled_IMetInst = get_inputClientEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		inputClientEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		inputClientEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend inputClientResignActive_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_inputClientResignActive_IMetInst(){
		return ((inputClientResignActive_IMetInst != null)
	? (inputClientResignActive_IMetInst)
	: (inputClientResignActive_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "inputClientResignActive:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void inputClientResignActive(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend inputClientResignActive_IMetInst = get_inputClientResignActive_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		inputClientResignActive_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		inputClientResignActive_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertGlyphs_length_forStartingGlyphAtIndex_characterIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertGlyphs_length_forStartingGlyphAtIndex_characterIndex_IMetInst(){
		return ((insertGlyphs_length_forStartingGlyphAtIndex_characterIndex_IMetInst != null)
	? (insertGlyphs_length_forStartingGlyphAtIndex_characterIndex_IMetInst)
	: (insertGlyphs_length_forStartingGlyphAtIndex_characterIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertGlyphs:length:forStartingGlyphAtIndex:characterIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void insertGlyphs_length_forStartingGlyphAtIndex_characterIndex(final com.apple.jobjc.Pointer<java.lang.Integer> glyphs, final long length, final long glyphIndex, final long charIndex){
			final com.apple.jobjc.Invoke.MsgSend insertGlyphs_length_forStartingGlyphAtIndex_characterIndex_IMetInst = get_insertGlyphs_length_forStartingGlyphAtIndex_characterIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertGlyphs_length_forStartingGlyphAtIndex_characterIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, glyphs);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		insertGlyphs_length_forStartingGlyphAtIndex_characterIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertNewButtonImage_in_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertNewButtonImage_in_IMetInst(){
		return ((insertNewButtonImage_in_IMetInst != null)
	? (insertNewButtonImage_in_IMetInst)
	: (insertNewButtonImage_in_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertNewButtonImage:in:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertNewButtonImage_in(final com.apple.jobjc.appkit.NSImage newButtonImage, final com.apple.jobjc.appkit.NSButtonCell buttonCell){
			final com.apple.jobjc.Invoke.MsgSend insertNewButtonImage_in_IMetInst = get_insertNewButtonImage_in_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertNewButtonImage_in_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newButtonImage);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, buttonCell);
		insertNewButtonImage_in_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertText_IMetInst(){
		return ((insertText_IMetInst != null)
	? (insertText_IMetInst)
	: (insertText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertText:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertText(final com.apple.jobjc.ID aString){
			final com.apple.jobjc.Invoke.MsgSend insertText_IMetInst = get_insertText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertText_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		insertText_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertText_client_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertText_client_IMetInst(){
		return ((insertText_client_IMetInst != null)
	? (insertText_client_IMetInst)
	: (insertText_client_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertText:client:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertText_client(final com.apple.jobjc.ID aString, final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend insertText_client_IMetInst = get_insertText_client_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertText_client_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		insertText_client_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertText_replacementRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertText_replacementRange_IMetInst(){
		return ((insertText_replacementRange_IMetInst != null)
	? (insertText_replacementRange_IMetInst)
	: (insertText_replacementRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertText:replacementRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void insertText_replacementRange(final com.apple.jobjc.ID aString, final com.apple.jobjc.foundation.NSRange replacementRange){
			final com.apple.jobjc.Invoke.MsgSend insertText_replacementRange_IMetInst = get_insertText_replacementRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertText_replacementRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, replacementRange);
		insertText_replacementRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isEditable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEditable_IMetInst(){
		return ((isEditable_IMetInst != null)
	? (isEditable_IMetInst)
	: (isEditable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEditable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isEditable(){
			final com.apple.jobjc.Invoke.MsgSend isEditable_IMetInst = get_isEditable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEditable_IMetInst.init(nativeBuffer, this);
		isEditable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isExplicitlyIncluded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isExplicitlyIncluded_IMetInst(){
		return ((isExplicitlyIncluded_IMetInst != null)
	? (isExplicitlyIncluded_IMetInst)
	: (isExplicitlyIncluded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isExplicitlyIncluded", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isExplicitlyIncluded(){
			final com.apple.jobjc.Invoke.MsgSend isExplicitlyIncluded_IMetInst = get_isExplicitlyIncluded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isExplicitlyIncluded_IMetInst.init(nativeBuffer, this);
		isExplicitlyIncluded_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isFindBarVisible_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isFindBarVisible_IMetInst(){
		return ((isFindBarVisible_IMetInst != null)
	? (isFindBarVisible_IMetInst)
	: (isFindBarVisible_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isFindBarVisible", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isFindBarVisible(){
			final com.apple.jobjc.Invoke.MsgSend isFindBarVisible_IMetInst = get_isFindBarVisible_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isFindBarVisible_IMetInst.init(nativeBuffer, this);
		isFindBarVisible_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSelectable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSelectable_IMetInst(){
		return ((isSelectable_IMetInst != null)
	? (isSelectable_IMetInst)
	: (isSelectable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSelectable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isSelectable(){
			final com.apple.jobjc.Invoke.MsgSend isSelectable_IMetInst = get_isSelectable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSelectable_IMetInst.init(nativeBuffer, this);
		isSelectable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend key_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_key_IMetInst(){
		return ((key_IMetInst != null)
	? (key_IMetInst)
	: (key_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "key", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString key(){
			final com.apple.jobjc.Invoke.MsgSend key_IMetInst = get_key_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		key_IMetInst.init(nativeBuffer, this);
		key_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyPathsForValuesAffectingPreview_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyPathsForValuesAffectingPreview_IMetInst(){
		return ((keyPathsForValuesAffectingPreview_IMetInst != null)
	? (keyPathsForValuesAffectingPreview_IMetInst)
	: (keyPathsForValuesAffectingPreview_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyPathsForValuesAffectingPreview", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSet keyPathsForValuesAffectingPreview(){
			final com.apple.jobjc.Invoke.MsgSend keyPathsForValuesAffectingPreview_IMetInst = get_keyPathsForValuesAffectingPreview_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyPathsForValuesAffectingPreview_IMetInst.init(nativeBuffer, this);
		keyPathsForValuesAffectingPreview_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSSet returnValue = (com.apple.jobjc.foundation.NSSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend layer_shouldInheritContentsScale_fromWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layer_shouldInheritContentsScale_fromWindow_IMetInst(){
		return ((layer_shouldInheritContentsScale_fromWindow_IMetInst != null)
	? (layer_shouldInheritContentsScale_fromWindow_IMetInst)
	: (layer_shouldInheritContentsScale_fromWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layer:shouldInheritContentsScale:fromWindow:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean layer_shouldInheritContentsScale_fromWindow(final Object /* CALayer* (@, @) */ layer, final double newScale, final com.apple.jobjc.appkit.NSWindow window){
			final com.apple.jobjc.Invoke.MsgSend layer_shouldInheritContentsScale_fromWindow_IMetInst = get_layer_shouldInheritContentsScale_fromWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layer_shouldInheritContentsScale_fromWindow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, layer);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, newScale);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		layer_shouldInheritContentsScale_fromWindow_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend layoutManager_didCompleteLayoutForTextContainer_atEnd_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layoutManager_didCompleteLayoutForTextContainer_atEnd_IMetInst(){
		return ((layoutManager_didCompleteLayoutForTextContainer_atEnd_IMetInst != null)
	? (layoutManager_didCompleteLayoutForTextContainer_atEnd_IMetInst)
	: (layoutManager_didCompleteLayoutForTextContainer_atEnd_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layoutManager:didCompleteLayoutForTextContainer:atEnd:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void layoutManager_didCompleteLayoutForTextContainer_atEnd(final com.apple.jobjc.appkit.NSLayoutManager layoutManager, final com.apple.jobjc.appkit.NSTextContainer textContainer, final boolean layoutFinishedFlag){
			final com.apple.jobjc.Invoke.MsgSend layoutManager_didCompleteLayoutForTextContainer_atEnd_IMetInst = get_layoutManager_didCompleteLayoutForTextContainer_atEnd_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layoutManager_didCompleteLayoutForTextContainer_atEnd_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, layoutManager);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textContainer);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, layoutFinishedFlag);
		layoutManager_didCompleteLayoutForTextContainer_atEnd_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend layoutManager_shouldUseTemporaryAttributes_forDrawingToScreen_atCharacterIndex_effectiveRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layoutManager_shouldUseTemporaryAttributes_forDrawingToScreen_atCharacterIndex_effectiveRange_IMetInst(){
		return ((layoutManager_shouldUseTemporaryAttributes_forDrawingToScreen_atCharacterIndex_effectiveRange_IMetInst != null)
	? (layoutManager_shouldUseTemporaryAttributes_forDrawingToScreen_atCharacterIndex_effectiveRange_IMetInst)
	: (layoutManager_shouldUseTemporaryAttributes_forDrawingToScreen_atCharacterIndex_effectiveRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layoutManager:shouldUseTemporaryAttributes:forDrawingToScreen:atCharacterIndex:effectiveRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary layoutManager_shouldUseTemporaryAttributes_forDrawingToScreen_atCharacterIndex_effectiveRange(final com.apple.jobjc.appkit.NSLayoutManager layoutManager, final com.apple.jobjc.foundation.NSDictionary attrs, final boolean toScreen, final long charIndex, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ effectiveCharRange){
			final com.apple.jobjc.Invoke.MsgSend layoutManager_shouldUseTemporaryAttributes_forDrawingToScreen_atCharacterIndex_effectiveRange_IMetInst = get_layoutManager_shouldUseTemporaryAttributes_forDrawingToScreen_atCharacterIndex_effectiveRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layoutManager_shouldUseTemporaryAttributes_forDrawingToScreen_atCharacterIndex_effectiveRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, layoutManager);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrs);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, toScreen);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, effectiveCharRange);
		layoutManager_shouldUseTemporaryAttributes_forDrawingToScreen_atCharacterIndex_effectiveRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend layoutManagerDidInvalidateLayout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layoutManagerDidInvalidateLayout_IMetInst(){
		return ((layoutManagerDidInvalidateLayout_IMetInst != null)
	? (layoutManagerDidInvalidateLayout_IMetInst)
	: (layoutManagerDidInvalidateLayout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layoutManagerDidInvalidateLayout:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void layoutManagerDidInvalidateLayout(final com.apple.jobjc.appkit.NSLayoutManager sender){
			final com.apple.jobjc.Invoke.MsgSend layoutManagerDidInvalidateLayout_IMetInst = get_layoutManagerDidInvalidateLayout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layoutManagerDidInvalidateLayout_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		layoutManagerDidInvalidateLayout_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend layoutOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layoutOptions_IMetInst(){
		return ((layoutOptions_IMetInst != null)
	? (layoutOptions_IMetInst)
	: (layoutOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layoutOptions", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long layoutOptions(){
			final com.apple.jobjc.Invoke.MsgSend layoutOptions_IMetInst = get_layoutOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layoutOptions_IMetInst.init(nativeBuffer, this);
		layoutOptions_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend layoutOrientation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layoutOrientation_IMetInst(){
		return ((layoutOrientation_IMetInst != null)
	? (layoutOrientation_IMetInst)
	: (layoutOrientation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layoutOrientation", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long layoutOrientation(){
			final com.apple.jobjc.Invoke.MsgSend layoutOrientation_IMetInst = get_layoutOrientation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layoutOrientation_IMetInst.init(nativeBuffer, this);
		layoutOrientation_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedKey_IMetInst(){
		return ((localizedKey_IMetInst != null)
	? (localizedKey_IMetInst)
	: (localizedKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedKey", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localizedKey(){
			final com.apple.jobjc.Invoke.MsgSend localizedKey_IMetInst = get_localizedKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedKey_IMetInst.init(nativeBuffer, this);
		localizedKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedSummaryItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedSummaryItems_IMetInst(){
		return ((localizedSummaryItems_IMetInst != null)
	? (localizedSummaryItems_IMetInst)
	: (localizedSummaryItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedSummaryItems", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray localizedSummaryItems(){
			final com.apple.jobjc.Invoke.MsgSend localizedSummaryItems_IMetInst = get_localizedSummaryItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedSummaryItems_IMetInst.init(nativeBuffer, this);
		localizedSummaryItems_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedTitlesForItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedTitlesForItem_IMetInst(){
		return ((localizedTitlesForItem_IMetInst != null)
	? (localizedTitlesForItem_IMetInst)
	: (localizedTitlesForItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedTitlesForItem:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray localizedTitlesForItem(final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend localizedTitlesForItem_IMetInst = get_localizedTitlesForItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedTitlesForItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		localizedTitlesForItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend markedRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_markedRange_IMetInst(){
		return ((markedRange_IMetInst != null)
	? (markedRange_IMetInst)
	: (markedRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "markedRange", com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange markedRange(){
			final com.apple.jobjc.Invoke.MsgSend markedRange_IMetInst = get_markedRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		markedRange_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		markedRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend markedTextAbandoned_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_markedTextAbandoned_IMetInst(){
		return ((markedTextAbandoned_IMetInst != null)
	? (markedTextAbandoned_IMetInst)
	: (markedTextAbandoned_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "markedTextAbandoned:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void markedTextAbandoned(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend markedTextAbandoned_IMetInst = get_markedTextAbandoned_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		markedTextAbandoned_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		markedTextAbandoned_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend markedTextSelectionChanged_client_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_markedTextSelectionChanged_client_IMetInst(){
		return ((markedTextSelectionChanged_client_IMetInst != null)
	? (markedTextSelectionChanged_client_IMetInst)
	: (markedTextSelectionChanged_client_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "markedTextSelectionChanged:client:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void markedTextSelectionChanged_client(final com.apple.jobjc.foundation.NSRange newSel, final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend markedTextSelectionChanged_client_IMetInst = get_markedTextSelectionChanged_client_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		markedTextSelectionChanged_client_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, newSel);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		markedTextSelectionChanged_client_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend menu_updateItem_atIndex_shouldCancel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menu_updateItem_atIndex_shouldCancel_IMetInst(){
		return ((menu_updateItem_atIndex_shouldCancel_IMetInst != null)
	? (menu_updateItem_atIndex_shouldCancel_IMetInst)
	: (menu_updateItem_atIndex_shouldCancel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menu:updateItem:atIndex:shouldCancel:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean menu_updateItem_atIndex_shouldCancel(final com.apple.jobjc.appkit.NSMenu menu, final com.apple.jobjc.appkit.NSMenuItem item, final long index, final boolean shouldCancel){
			final com.apple.jobjc.Invoke.MsgSend menu_updateItem_atIndex_shouldCancel_IMetInst = get_menu_updateItem_atIndex_shouldCancel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menu_updateItem_atIndex_shouldCancel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, shouldCancel);
		menu_updateItem_atIndex_shouldCancel_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend menu_willHighlightItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menu_willHighlightItem_IMetInst(){
		return ((menu_willHighlightItem_IMetInst != null)
	? (menu_willHighlightItem_IMetInst)
	: (menu_willHighlightItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menu:willHighlightItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void menu_willHighlightItem(final com.apple.jobjc.appkit.NSMenu menu, final com.apple.jobjc.appkit.NSMenuItem item){
			final com.apple.jobjc.Invoke.MsgSend menu_willHighlightItem_IMetInst = get_menu_willHighlightItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menu_willHighlightItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		menu_willHighlightItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend menuDidClose_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuDidClose_IMetInst(){
		return ((menuDidClose_IMetInst != null)
	? (menuDidClose_IMetInst)
	: (menuDidClose_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuDidClose:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void menuDidClose(final com.apple.jobjc.appkit.NSMenu menu){
			final com.apple.jobjc.Invoke.MsgSend menuDidClose_IMetInst = get_menuDidClose_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuDidClose_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		menuDidClose_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend menuHasKeyEquivalent_forEvent_target_action_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuHasKeyEquivalent_forEvent_target_action_IMetInst(){
		return ((menuHasKeyEquivalent_forEvent_target_action_IMetInst != null)
	? (menuHasKeyEquivalent_forEvent_target_action_IMetInst)
	: (menuHasKeyEquivalent_forEvent_target_action_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuHasKeyEquivalent:forEvent:target:action:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean menuHasKeyEquivalent_forEvent_target_action(final com.apple.jobjc.appkit.NSMenu menu, final com.apple.jobjc.appkit.NSEvent event, final com.apple.jobjc.Pointer<com.apple.jobjc.ID> target, final com.apple.jobjc.Pointer<com.apple.jobjc.SEL> action){
			final com.apple.jobjc.Invoke.MsgSend menuHasKeyEquivalent_forEvent_target_action_IMetInst = get_menuHasKeyEquivalent_forEvent_target_action_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuHasKeyEquivalent_forEvent_target_action_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, action);
		menuHasKeyEquivalent_forEvent_target_action_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend menuNeedsUpdate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuNeedsUpdate_IMetInst(){
		return ((menuNeedsUpdate_IMetInst != null)
	? (menuNeedsUpdate_IMetInst)
	: (menuNeedsUpdate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuNeedsUpdate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void menuNeedsUpdate(final com.apple.jobjc.appkit.NSMenu menu){
			final com.apple.jobjc.Invoke.MsgSend menuNeedsUpdate_IMetInst = get_menuNeedsUpdate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuNeedsUpdate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		menuNeedsUpdate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend menuWillOpen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuWillOpen_IMetInst(){
		return ((menuWillOpen_IMetInst != null)
	? (menuWillOpen_IMetInst)
	: (menuWillOpen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuWillOpen:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void menuWillOpen(final com.apple.jobjc.appkit.NSMenu menu){
			final com.apple.jobjc.Invoke.MsgSend menuWillOpen_IMetInst = get_menuWillOpen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuWillOpen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		menuWillOpen_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend minContentSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minContentSize_IMetInst(){
		return ((minContentSize_IMetInst != null)
	? (minContentSize_IMetInst)
	: (minContentSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minContentSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize minContentSize(){
			final com.apple.jobjc.Invoke.MsgSend minContentSize_IMetInst = get_minContentSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minContentSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		minContentSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseDownOnCharacterIndex_atCoordinate_withModifier_client_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseDownOnCharacterIndex_atCoordinate_withModifier_client_IMetInst(){
		return ((mouseDownOnCharacterIndex_atCoordinate_withModifier_client_IMetInst != null)
	? (mouseDownOnCharacterIndex_atCoordinate_withModifier_client_IMetInst)
	: (mouseDownOnCharacterIndex_atCoordinate_withModifier_client_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseDownOnCharacterIndex:atCoordinate:withModifier:client:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean mouseDownOnCharacterIndex_atCoordinate_withModifier_client(final long theIndex, final com.apple.jobjc.foundation.NSPoint thePoint, final long theFlags, final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend mouseDownOnCharacterIndex_atCoordinate_withModifier_client_IMetInst = get_mouseDownOnCharacterIndex_atCoordinate_withModifier_client_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseDownOnCharacterIndex_atCoordinate_withModifier_client_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, theIndex);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, thePoint);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, theFlags);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		mouseDownOnCharacterIndex_atCoordinate_withModifier_client_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseDraggedOnCharacterIndex_atCoordinate_withModifier_client_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseDraggedOnCharacterIndex_atCoordinate_withModifier_client_IMetInst(){
		return ((mouseDraggedOnCharacterIndex_atCoordinate_withModifier_client_IMetInst != null)
	? (mouseDraggedOnCharacterIndex_atCoordinate_withModifier_client_IMetInst)
	: (mouseDraggedOnCharacterIndex_atCoordinate_withModifier_client_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseDraggedOnCharacterIndex:atCoordinate:withModifier:client:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean mouseDraggedOnCharacterIndex_atCoordinate_withModifier_client(final long theIndex, final com.apple.jobjc.foundation.NSPoint thePoint, final long theFlags, final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend mouseDraggedOnCharacterIndex_atCoordinate_withModifier_client_IMetInst = get_mouseDraggedOnCharacterIndex_atCoordinate_withModifier_client_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseDraggedOnCharacterIndex_atCoordinate_withModifier_client_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, theIndex);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, thePoint);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, theFlags);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		mouseDraggedOnCharacterIndex_atCoordinate_withModifier_client_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseUpOnCharacterIndex_atCoordinate_withModifier_client_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseUpOnCharacterIndex_atCoordinate_withModifier_client_IMetInst(){
		return ((mouseUpOnCharacterIndex_atCoordinate_withModifier_client_IMetInst != null)
	? (mouseUpOnCharacterIndex_atCoordinate_withModifier_client_IMetInst)
	: (mouseUpOnCharacterIndex_atCoordinate_withModifier_client_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseUpOnCharacterIndex:atCoordinate:withModifier:client:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void mouseUpOnCharacterIndex_atCoordinate_withModifier_client(final long theIndex, final com.apple.jobjc.foundation.NSPoint thePoint, final long theFlags, final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend mouseUpOnCharacterIndex_atCoordinate_withModifier_client_IMetInst = get_mouseUpOnCharacterIndex_atCoordinate_withModifier_client_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseUpOnCharacterIndex_atCoordinate_withModifier_client_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, theIndex);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, thePoint);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, theFlags);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		mouseUpOnCharacterIndex_atCoordinate_withModifier_client_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend namesOfPromisedFilesDroppedAtDestination_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_namesOfPromisedFilesDroppedAtDestination_IMetInst(){
		return ((namesOfPromisedFilesDroppedAtDestination_IMetInst != null)
	? (namesOfPromisedFilesDroppedAtDestination_IMetInst)
	: (namesOfPromisedFilesDroppedAtDestination_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "namesOfPromisedFilesDroppedAtDestination:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray namesOfPromisedFilesDroppedAtDestination(final com.apple.jobjc.foundation.NSURL dropDestination){
			final com.apple.jobjc.Invoke.MsgSend namesOfPromisedFilesDroppedAtDestination_IMetInst = get_namesOfPromisedFilesDroppedAtDestination_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		namesOfPromisedFilesDroppedAtDestination_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dropDestination);
		namesOfPromisedFilesDroppedAtDestination_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfItemsInComboBox_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfItemsInComboBox_IMetInst(){
		return ((numberOfItemsInComboBox_IMetInst != null)
	? (numberOfItemsInComboBox_IMetInst)
	: (numberOfItemsInComboBox_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfItemsInComboBox:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long numberOfItemsInComboBox(final com.apple.jobjc.appkit.NSComboBox aComboBox){
			final com.apple.jobjc.Invoke.MsgSend numberOfItemsInComboBox_IMetInst = get_numberOfItemsInComboBox_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfItemsInComboBox_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aComboBox);
		numberOfItemsInComboBox_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfItemsInComboBoxCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfItemsInComboBoxCell_IMetInst(){
		return ((numberOfItemsInComboBoxCell_IMetInst != null)
	? (numberOfItemsInComboBoxCell_IMetInst)
	: (numberOfItemsInComboBoxCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfItemsInComboBoxCell:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long numberOfItemsInComboBoxCell(final com.apple.jobjc.appkit.NSComboBoxCell comboBoxCell){
			final com.apple.jobjc.Invoke.MsgSend numberOfItemsInComboBoxCell_IMetInst = get_numberOfItemsInComboBoxCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfItemsInComboBoxCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, comboBoxCell);
		numberOfItemsInComboBoxCell_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfItemsInMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfItemsInMenu_IMetInst(){
		return ((numberOfItemsInMenu_IMetInst != null)
	? (numberOfItemsInMenu_IMetInst)
	: (numberOfItemsInMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfItemsInMenu:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long numberOfItemsInMenu(final com.apple.jobjc.appkit.NSMenu menu){
			final com.apple.jobjc.Invoke.MsgSend numberOfItemsInMenu_IMetInst = get_numberOfItemsInMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfItemsInMenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		numberOfItemsInMenu_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfRowsInTableView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfRowsInTableView_IMetInst(){
		return ((numberOfRowsInTableView_IMetInst != null)
	? (numberOfRowsInTableView_IMetInst)
	: (numberOfRowsInTableView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfRowsInTableView:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long numberOfRowsInTableView(final com.apple.jobjc.appkit.NSTableView tableView){
			final com.apple.jobjc.Invoke.MsgSend numberOfRowsInTableView_IMetInst = get_numberOfRowsInTableView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfRowsInTableView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		numberOfRowsInTableView_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfValidItemsForDrop_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfValidItemsForDrop_IMetInst(){
		return ((numberOfValidItemsForDrop_IMetInst != null)
	? (numberOfValidItemsForDrop_IMetInst)
	: (numberOfValidItemsForDrop_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfValidItemsForDrop", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long numberOfValidItemsForDrop(){
			final com.apple.jobjc.Invoke.MsgSend numberOfValidItemsForDrop_IMetInst = get_numberOfValidItemsForDrop_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfValidItemsForDrop_IMetInst.init(nativeBuffer, this);
		numberOfValidItemsForDrop_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectDidBeginEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectDidBeginEditing_IMetInst(){
		return ((objectDidBeginEditing_IMetInst != null)
	? (objectDidBeginEditing_IMetInst)
	: (objectDidBeginEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectDidBeginEditing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void objectDidBeginEditing(final com.apple.jobjc.ID editor){
			final com.apple.jobjc.Invoke.MsgSend objectDidBeginEditing_IMetInst = get_objectDidBeginEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectDidBeginEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, editor);
		objectDidBeginEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend objectDidEndEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectDidEndEditing_IMetInst(){
		return ((objectDidEndEditing_IMetInst != null)
	? (objectDidEndEditing_IMetInst)
	: (objectDidEndEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectDidEndEditing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void objectDidEndEditing(final com.apple.jobjc.ID editor){
			final com.apple.jobjc.Invoke.MsgSend objectDidEndEditing_IMetInst = get_objectDidEndEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectDidEndEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, editor);
		objectDidEndEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend optionDescriptionsForBinding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_optionDescriptionsForBinding_IMetInst(){
		return ((optionDescriptionsForBinding_IMetInst != null)
	? (optionDescriptionsForBinding_IMetInst)
	: (optionDescriptionsForBinding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "optionDescriptionsForBinding:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray optionDescriptionsForBinding(final com.apple.jobjc.foundation.NSString aBinding){
			final com.apple.jobjc.Invoke.MsgSend optionDescriptionsForBinding_IMetInst = get_optionDescriptionsForBinding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		optionDescriptionsForBinding_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aBinding);
		optionDescriptionsForBinding_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_acceptDrop_item_childIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_acceptDrop_item_childIndex_IMetInst(){
		return ((outlineView_acceptDrop_item_childIndex_IMetInst != null)
	? (outlineView_acceptDrop_item_childIndex_IMetInst)
	: (outlineView_acceptDrop_item_childIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:acceptDrop:item:childIndex:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean outlineView_acceptDrop_item_childIndex(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.ID info, final com.apple.jobjc.ID item, final long index){
			final com.apple.jobjc.Invoke.MsgSend outlineView_acceptDrop_item_childIndex_IMetInst = get_outlineView_acceptDrop_item_childIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_acceptDrop_item_childIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, info);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		outlineView_acceptDrop_item_childIndex_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_child_ofItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_child_ofItem_IMetInst(){
		return ((outlineView_child_ofItem_IMetInst != null)
	? (outlineView_child_ofItem_IMetInst)
	: (outlineView_child_ofItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:child:ofItem:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T outlineView_child_ofItem(final com.apple.jobjc.appkit.NSOutlineView outlineView, final long index, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_child_ofItem_IMetInst = get_outlineView_child_ofItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_child_ofItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_child_ofItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_dataCellForTableColumn_item_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_dataCellForTableColumn_item_IMetInst(){
		return ((outlineView_dataCellForTableColumn_item_IMetInst != null)
	? (outlineView_dataCellForTableColumn_item_IMetInst)
	: (outlineView_dataCellForTableColumn_item_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:dataCellForTableColumn:item:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCell outlineView_dataCellForTableColumn_item(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_dataCellForTableColumn_item_IMetInst = get_outlineView_dataCellForTableColumn_item_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_dataCellForTableColumn_item_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_dataCellForTableColumn_item_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCell returnValue = (com.apple.jobjc.appkit.NSCell) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_didAddRowView_forRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_didAddRowView_forRow_IMetInst(){
		return ((outlineView_didAddRowView_forRow_IMetInst != null)
	? (outlineView_didAddRowView_forRow_IMetInst)
	: (outlineView_didAddRowView_forRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:didAddRowView:forRow:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void outlineView_didAddRowView_forRow(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.appkit.NSTableRowView rowView, final long row){
			final com.apple.jobjc.Invoke.MsgSend outlineView_didAddRowView_forRow_IMetInst = get_outlineView_didAddRowView_forRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_didAddRowView_forRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rowView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		outlineView_didAddRowView_forRow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_didClickTableColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_didClickTableColumn_IMetInst(){
		return ((outlineView_didClickTableColumn_IMetInst != null)
	? (outlineView_didClickTableColumn_IMetInst)
	: (outlineView_didClickTableColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:didClickTableColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void outlineView_didClickTableColumn(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.appkit.NSTableColumn tableColumn){
			final com.apple.jobjc.Invoke.MsgSend outlineView_didClickTableColumn_IMetInst = get_outlineView_didClickTableColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_didClickTableColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		outlineView_didClickTableColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_didDragTableColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_didDragTableColumn_IMetInst(){
		return ((outlineView_didDragTableColumn_IMetInst != null)
	? (outlineView_didDragTableColumn_IMetInst)
	: (outlineView_didDragTableColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:didDragTableColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void outlineView_didDragTableColumn(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.appkit.NSTableColumn tableColumn){
			final com.apple.jobjc.Invoke.MsgSend outlineView_didDragTableColumn_IMetInst = get_outlineView_didDragTableColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_didDragTableColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		outlineView_didDragTableColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_didRemoveRowView_forRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_didRemoveRowView_forRow_IMetInst(){
		return ((outlineView_didRemoveRowView_forRow_IMetInst != null)
	? (outlineView_didRemoveRowView_forRow_IMetInst)
	: (outlineView_didRemoveRowView_forRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:didRemoveRowView:forRow:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void outlineView_didRemoveRowView_forRow(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.appkit.NSTableRowView rowView, final long row){
			final com.apple.jobjc.Invoke.MsgSend outlineView_didRemoveRowView_forRow_IMetInst = get_outlineView_didRemoveRowView_forRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_didRemoveRowView_forRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rowView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		outlineView_didRemoveRowView_forRow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_draggingSession_endedAtPoint_operation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_draggingSession_endedAtPoint_operation_IMetInst(){
		return ((outlineView_draggingSession_endedAtPoint_operation_IMetInst != null)
	? (outlineView_draggingSession_endedAtPoint_operation_IMetInst)
	: (outlineView_draggingSession_endedAtPoint_operation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:draggingSession:endedAtPoint:operation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void outlineView_draggingSession_endedAtPoint_operation(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.appkit.NSDraggingSession session, final com.apple.jobjc.foundation.NSPoint screenPoint, final long operation){
			final com.apple.jobjc.Invoke.MsgSend outlineView_draggingSession_endedAtPoint_operation_IMetInst = get_outlineView_draggingSession_endedAtPoint_operation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_draggingSession_endedAtPoint_operation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, session);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, screenPoint);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, operation);
		outlineView_draggingSession_endedAtPoint_operation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_draggingSession_willBeginAtPoint_forItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_draggingSession_willBeginAtPoint_forItems_IMetInst(){
		return ((outlineView_draggingSession_willBeginAtPoint_forItems_IMetInst != null)
	? (outlineView_draggingSession_willBeginAtPoint_forItems_IMetInst)
	: (outlineView_draggingSession_willBeginAtPoint_forItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:draggingSession:willBeginAtPoint:forItems:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void outlineView_draggingSession_willBeginAtPoint_forItems(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.appkit.NSDraggingSession session, final com.apple.jobjc.foundation.NSPoint screenPoint, final com.apple.jobjc.foundation.NSArray draggedItems){
			final com.apple.jobjc.Invoke.MsgSend outlineView_draggingSession_willBeginAtPoint_forItems_IMetInst = get_outlineView_draggingSession_willBeginAtPoint_forItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_draggingSession_willBeginAtPoint_forItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, session);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, screenPoint);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, draggedItems);
		outlineView_draggingSession_willBeginAtPoint_forItems_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_heightOfRowByItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_heightOfRowByItem_IMetInst(){
		return ((outlineView_heightOfRowByItem_IMetInst != null)
	? (outlineView_heightOfRowByItem_IMetInst)
	: (outlineView_heightOfRowByItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:heightOfRowByItem:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public double outlineView_heightOfRowByItem(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_heightOfRowByItem_IMetInst = get_outlineView_heightOfRowByItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_heightOfRowByItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_heightOfRowByItem_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_isGroupItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_isGroupItem_IMetInst(){
		return ((outlineView_isGroupItem_IMetInst != null)
	? (outlineView_isGroupItem_IMetInst)
	: (outlineView_isGroupItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:isGroupItem:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean outlineView_isGroupItem(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_isGroupItem_IMetInst = get_outlineView_isGroupItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_isGroupItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_isGroupItem_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_isItemExpandable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_isItemExpandable_IMetInst(){
		return ((outlineView_isItemExpandable_IMetInst != null)
	? (outlineView_isItemExpandable_IMetInst)
	: (outlineView_isItemExpandable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:isItemExpandable:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean outlineView_isItemExpandable(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_isItemExpandable_IMetInst = get_outlineView_isItemExpandable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_isItemExpandable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_isItemExpandable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_itemForPersistentObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_itemForPersistentObject_IMetInst(){
		return ((outlineView_itemForPersistentObject_IMetInst != null)
	? (outlineView_itemForPersistentObject_IMetInst)
	: (outlineView_itemForPersistentObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:itemForPersistentObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T outlineView_itemForPersistentObject(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend outlineView_itemForPersistentObject_IMetInst = get_outlineView_itemForPersistentObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_itemForPersistentObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		outlineView_itemForPersistentObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_mouseDownInHeaderOfTableColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_mouseDownInHeaderOfTableColumn_IMetInst(){
		return ((outlineView_mouseDownInHeaderOfTableColumn_IMetInst != null)
	? (outlineView_mouseDownInHeaderOfTableColumn_IMetInst)
	: (outlineView_mouseDownInHeaderOfTableColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:mouseDownInHeaderOfTableColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void outlineView_mouseDownInHeaderOfTableColumn(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.appkit.NSTableColumn tableColumn){
			final com.apple.jobjc.Invoke.MsgSend outlineView_mouseDownInHeaderOfTableColumn_IMetInst = get_outlineView_mouseDownInHeaderOfTableColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_mouseDownInHeaderOfTableColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		outlineView_mouseDownInHeaderOfTableColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_namesOfPromisedFilesDroppedAtDestination_forDraggedItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_namesOfPromisedFilesDroppedAtDestination_forDraggedItems_IMetInst(){
		return ((outlineView_namesOfPromisedFilesDroppedAtDestination_forDraggedItems_IMetInst != null)
	? (outlineView_namesOfPromisedFilesDroppedAtDestination_forDraggedItems_IMetInst)
	: (outlineView_namesOfPromisedFilesDroppedAtDestination_forDraggedItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:namesOfPromisedFilesDroppedAtDestination:forDraggedItems:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray outlineView_namesOfPromisedFilesDroppedAtDestination_forDraggedItems(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.foundation.NSURL dropDestination, final com.apple.jobjc.foundation.NSArray items){
			final com.apple.jobjc.Invoke.MsgSend outlineView_namesOfPromisedFilesDroppedAtDestination_forDraggedItems_IMetInst = get_outlineView_namesOfPromisedFilesDroppedAtDestination_forDraggedItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_namesOfPromisedFilesDroppedAtDestination_forDraggedItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dropDestination);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, items);
		outlineView_namesOfPromisedFilesDroppedAtDestination_forDraggedItems_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_nextTypeSelectMatchFromItem_toItem_forString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_nextTypeSelectMatchFromItem_toItem_forString_IMetInst(){
		return ((outlineView_nextTypeSelectMatchFromItem_toItem_forString_IMetInst != null)
	? (outlineView_nextTypeSelectMatchFromItem_toItem_forString_IMetInst)
	: (outlineView_nextTypeSelectMatchFromItem_toItem_forString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:nextTypeSelectMatchFromItem:toItem:forString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T outlineView_nextTypeSelectMatchFromItem_toItem_forString(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.ID startItem, final com.apple.jobjc.ID endItem, final com.apple.jobjc.foundation.NSString searchString){
			final com.apple.jobjc.Invoke.MsgSend outlineView_nextTypeSelectMatchFromItem_toItem_forString_IMetInst = get_outlineView_nextTypeSelectMatchFromItem_toItem_forString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_nextTypeSelectMatchFromItem_toItem_forString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, startItem);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, endItem);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, searchString);
		outlineView_nextTypeSelectMatchFromItem_toItem_forString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_numberOfChildrenOfItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_numberOfChildrenOfItem_IMetInst(){
		return ((outlineView_numberOfChildrenOfItem_IMetInst != null)
	? (outlineView_numberOfChildrenOfItem_IMetInst)
	: (outlineView_numberOfChildrenOfItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:numberOfChildrenOfItem:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long outlineView_numberOfChildrenOfItem(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_numberOfChildrenOfItem_IMetInst = get_outlineView_numberOfChildrenOfItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_numberOfChildrenOfItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_numberOfChildrenOfItem_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_objectValueForTableColumn_byItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_objectValueForTableColumn_byItem_IMetInst(){
		return ((outlineView_objectValueForTableColumn_byItem_IMetInst != null)
	? (outlineView_objectValueForTableColumn_byItem_IMetInst)
	: (outlineView_objectValueForTableColumn_byItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:objectValueForTableColumn:byItem:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T outlineView_objectValueForTableColumn_byItem(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_objectValueForTableColumn_byItem_IMetInst = get_outlineView_objectValueForTableColumn_byItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_objectValueForTableColumn_byItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_objectValueForTableColumn_byItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_pasteboardWriterForItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_pasteboardWriterForItem_IMetInst(){
		return ((outlineView_pasteboardWriterForItem_IMetInst != null)
	? (outlineView_pasteboardWriterForItem_IMetInst)
	: (outlineView_pasteboardWriterForItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:pasteboardWriterForItem:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T outlineView_pasteboardWriterForItem(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_pasteboardWriterForItem_IMetInst = get_outlineView_pasteboardWriterForItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_pasteboardWriterForItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_pasteboardWriterForItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_persistentObjectForItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_persistentObjectForItem_IMetInst(){
		return ((outlineView_persistentObjectForItem_IMetInst != null)
	? (outlineView_persistentObjectForItem_IMetInst)
	: (outlineView_persistentObjectForItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:persistentObjectForItem:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T outlineView_persistentObjectForItem(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_persistentObjectForItem_IMetInst = get_outlineView_persistentObjectForItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_persistentObjectForItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_persistentObjectForItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_rowViewForItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_rowViewForItem_IMetInst(){
		return ((outlineView_rowViewForItem_IMetInst != null)
	? (outlineView_rowViewForItem_IMetInst)
	: (outlineView_rowViewForItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:rowViewForItem:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTableRowView outlineView_rowViewForItem(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_rowViewForItem_IMetInst = get_outlineView_rowViewForItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_rowViewForItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_rowViewForItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTableRowView returnValue = (com.apple.jobjc.appkit.NSTableRowView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_selectionIndexesForProposedSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_selectionIndexesForProposedSelection_IMetInst(){
		return ((outlineView_selectionIndexesForProposedSelection_IMetInst != null)
	? (outlineView_selectionIndexesForProposedSelection_IMetInst)
	: (outlineView_selectionIndexesForProposedSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:selectionIndexesForProposedSelection:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSIndexSet outlineView_selectionIndexesForProposedSelection(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.foundation.NSIndexSet proposedSelectionIndexes){
			final com.apple.jobjc.Invoke.MsgSend outlineView_selectionIndexesForProposedSelection_IMetInst = get_outlineView_selectionIndexesForProposedSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_selectionIndexesForProposedSelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, proposedSelectionIndexes);
		outlineView_selectionIndexesForProposedSelection_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexSet returnValue = (com.apple.jobjc.foundation.NSIndexSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_setObjectValue_forTableColumn_byItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_setObjectValue_forTableColumn_byItem_IMetInst(){
		return ((outlineView_setObjectValue_forTableColumn_byItem_IMetInst != null)
	? (outlineView_setObjectValue_forTableColumn_byItem_IMetInst)
	: (outlineView_setObjectValue_forTableColumn_byItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:setObjectValue:forTableColumn:byItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void outlineView_setObjectValue_forTableColumn_byItem(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.ID object, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_setObjectValue_forTableColumn_byItem_IMetInst = get_outlineView_setObjectValue_forTableColumn_byItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_setObjectValue_forTableColumn_byItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_setObjectValue_forTableColumn_byItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_shouldCollapseItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_shouldCollapseItem_IMetInst(){
		return ((outlineView_shouldCollapseItem_IMetInst != null)
	? (outlineView_shouldCollapseItem_IMetInst)
	: (outlineView_shouldCollapseItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:shouldCollapseItem:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean outlineView_shouldCollapseItem(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_shouldCollapseItem_IMetInst = get_outlineView_shouldCollapseItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_shouldCollapseItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_shouldCollapseItem_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_shouldEditTableColumn_item_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_shouldEditTableColumn_item_IMetInst(){
		return ((outlineView_shouldEditTableColumn_item_IMetInst != null)
	? (outlineView_shouldEditTableColumn_item_IMetInst)
	: (outlineView_shouldEditTableColumn_item_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:shouldEditTableColumn:item:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean outlineView_shouldEditTableColumn_item(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_shouldEditTableColumn_item_IMetInst = get_outlineView_shouldEditTableColumn_item_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_shouldEditTableColumn_item_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_shouldEditTableColumn_item_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_shouldExpandItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_shouldExpandItem_IMetInst(){
		return ((outlineView_shouldExpandItem_IMetInst != null)
	? (outlineView_shouldExpandItem_IMetInst)
	: (outlineView_shouldExpandItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:shouldExpandItem:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean outlineView_shouldExpandItem(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_shouldExpandItem_IMetInst = get_outlineView_shouldExpandItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_shouldExpandItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_shouldExpandItem_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_shouldReorderColumn_toColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_shouldReorderColumn_toColumn_IMetInst(){
		return ((outlineView_shouldReorderColumn_toColumn_IMetInst != null)
	? (outlineView_shouldReorderColumn_toColumn_IMetInst)
	: (outlineView_shouldReorderColumn_toColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:shouldReorderColumn:toColumn:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean outlineView_shouldReorderColumn_toColumn(final com.apple.jobjc.appkit.NSOutlineView outlineView, final long columnIndex, final long newColumnIndex){
			final com.apple.jobjc.Invoke.MsgSend outlineView_shouldReorderColumn_toColumn_IMetInst = get_outlineView_shouldReorderColumn_toColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_shouldReorderColumn_toColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, columnIndex);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, newColumnIndex);
		outlineView_shouldReorderColumn_toColumn_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_shouldSelectItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_shouldSelectItem_IMetInst(){
		return ((outlineView_shouldSelectItem_IMetInst != null)
	? (outlineView_shouldSelectItem_IMetInst)
	: (outlineView_shouldSelectItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:shouldSelectItem:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean outlineView_shouldSelectItem(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_shouldSelectItem_IMetInst = get_outlineView_shouldSelectItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_shouldSelectItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_shouldSelectItem_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_shouldSelectTableColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_shouldSelectTableColumn_IMetInst(){
		return ((outlineView_shouldSelectTableColumn_IMetInst != null)
	? (outlineView_shouldSelectTableColumn_IMetInst)
	: (outlineView_shouldSelectTableColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:shouldSelectTableColumn:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean outlineView_shouldSelectTableColumn(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.appkit.NSTableColumn tableColumn){
			final com.apple.jobjc.Invoke.MsgSend outlineView_shouldSelectTableColumn_IMetInst = get_outlineView_shouldSelectTableColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_shouldSelectTableColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		outlineView_shouldSelectTableColumn_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_shouldShowCellExpansionForTableColumn_item_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_shouldShowCellExpansionForTableColumn_item_IMetInst(){
		return ((outlineView_shouldShowCellExpansionForTableColumn_item_IMetInst != null)
	? (outlineView_shouldShowCellExpansionForTableColumn_item_IMetInst)
	: (outlineView_shouldShowCellExpansionForTableColumn_item_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:shouldShowCellExpansionForTableColumn:item:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean outlineView_shouldShowCellExpansionForTableColumn_item(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_shouldShowCellExpansionForTableColumn_item_IMetInst = get_outlineView_shouldShowCellExpansionForTableColumn_item_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_shouldShowCellExpansionForTableColumn_item_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_shouldShowCellExpansionForTableColumn_item_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_shouldShowOutlineCellForItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_shouldShowOutlineCellForItem_IMetInst(){
		return ((outlineView_shouldShowOutlineCellForItem_IMetInst != null)
	? (outlineView_shouldShowOutlineCellForItem_IMetInst)
	: (outlineView_shouldShowOutlineCellForItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:shouldShowOutlineCellForItem:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean outlineView_shouldShowOutlineCellForItem(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_shouldShowOutlineCellForItem_IMetInst = get_outlineView_shouldShowOutlineCellForItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_shouldShowOutlineCellForItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_shouldShowOutlineCellForItem_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_shouldTrackCell_forTableColumn_item_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_shouldTrackCell_forTableColumn_item_IMetInst(){
		return ((outlineView_shouldTrackCell_forTableColumn_item_IMetInst != null)
	? (outlineView_shouldTrackCell_forTableColumn_item_IMetInst)
	: (outlineView_shouldTrackCell_forTableColumn_item_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:shouldTrackCell:forTableColumn:item:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean outlineView_shouldTrackCell_forTableColumn_item(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.appkit.NSCell cell, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_shouldTrackCell_forTableColumn_item_IMetInst = get_outlineView_shouldTrackCell_forTableColumn_item_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_shouldTrackCell_forTableColumn_item_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_shouldTrackCell_forTableColumn_item_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst(){
		return ((outlineView_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst != null)
	? (outlineView_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst)
	: (outlineView_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:shouldTypeSelectForEvent:withCurrentSearchString:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean outlineView_shouldTypeSelectForEvent_withCurrentSearchString(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.appkit.NSEvent event, final com.apple.jobjc.foundation.NSString searchString){
			final com.apple.jobjc.Invoke.MsgSend outlineView_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst = get_outlineView_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, searchString);
		outlineView_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_sizeToFitWidthOfColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_sizeToFitWidthOfColumn_IMetInst(){
		return ((outlineView_sizeToFitWidthOfColumn_IMetInst != null)
	? (outlineView_sizeToFitWidthOfColumn_IMetInst)
	: (outlineView_sizeToFitWidthOfColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:sizeToFitWidthOfColumn:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public double outlineView_sizeToFitWidthOfColumn(final com.apple.jobjc.appkit.NSOutlineView outlineView, final long column){
			final com.apple.jobjc.Invoke.MsgSend outlineView_sizeToFitWidthOfColumn_IMetInst = get_outlineView_sizeToFitWidthOfColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_sizeToFitWidthOfColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		outlineView_sizeToFitWidthOfColumn_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_sortDescriptorsDidChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_sortDescriptorsDidChange_IMetInst(){
		return ((outlineView_sortDescriptorsDidChange_IMetInst != null)
	? (outlineView_sortDescriptorsDidChange_IMetInst)
	: (outlineView_sortDescriptorsDidChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:sortDescriptorsDidChange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void outlineView_sortDescriptorsDidChange(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.foundation.NSArray oldDescriptors){
			final com.apple.jobjc.Invoke.MsgSend outlineView_sortDescriptorsDidChange_IMetInst = get_outlineView_sortDescriptorsDidChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_sortDescriptorsDidChange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, oldDescriptors);
		outlineView_sortDescriptorsDidChange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_toolTipForCell_rect_tableColumn_item_mouseLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_toolTipForCell_rect_tableColumn_item_mouseLocation_IMetInst(){
		return ((outlineView_toolTipForCell_rect_tableColumn_item_mouseLocation_IMetInst != null)
	? (outlineView_toolTipForCell_rect_tableColumn_item_mouseLocation_IMetInst)
	: (outlineView_toolTipForCell_rect_tableColumn_item_mouseLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:toolTipForCell:rect:tableColumn:item:mouseLocation:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSString outlineView_toolTipForCell_rect_tableColumn_item_mouseLocation(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.appkit.NSCell cell, final Object /* NSRectPointer (^{_NSRect={_NSPoint=ff}{_NSSize=ff}}, ^{CGRect={CGPoint=dd}{CGSize=dd}}) */ rect, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final com.apple.jobjc.ID item, final com.apple.jobjc.foundation.NSPoint mouseLocation){
			final com.apple.jobjc.Invoke.MsgSend outlineView_toolTipForCell_rect_tableColumn_item_mouseLocation_IMetInst = get_outlineView_toolTipForCell_rect_tableColumn_item_mouseLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_toolTipForCell_rect_tableColumn_item_mouseLocation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, mouseLocation);
		outlineView_toolTipForCell_rect_tableColumn_item_mouseLocation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_typeSelectStringForTableColumn_item_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_typeSelectStringForTableColumn_item_IMetInst(){
		return ((outlineView_typeSelectStringForTableColumn_item_IMetInst != null)
	? (outlineView_typeSelectStringForTableColumn_item_IMetInst)
	: (outlineView_typeSelectStringForTableColumn_item_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:typeSelectStringForTableColumn:item:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString outlineView_typeSelectStringForTableColumn_item(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_typeSelectStringForTableColumn_item_IMetInst = get_outlineView_typeSelectStringForTableColumn_item_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_typeSelectStringForTableColumn_item_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_typeSelectStringForTableColumn_item_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_updateDraggingItemsForDrag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_updateDraggingItemsForDrag_IMetInst(){
		return ((outlineView_updateDraggingItemsForDrag_IMetInst != null)
	? (outlineView_updateDraggingItemsForDrag_IMetInst)
	: (outlineView_updateDraggingItemsForDrag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:updateDraggingItemsForDrag:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void outlineView_updateDraggingItemsForDrag(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.ID draggingInfo){
			final com.apple.jobjc.Invoke.MsgSend outlineView_updateDraggingItemsForDrag_IMetInst = get_outlineView_updateDraggingItemsForDrag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_updateDraggingItemsForDrag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, draggingInfo);
		outlineView_updateDraggingItemsForDrag_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_validateDrop_proposedItem_proposedChildIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_validateDrop_proposedItem_proposedChildIndex_IMetInst(){
		return ((outlineView_validateDrop_proposedItem_proposedChildIndex_IMetInst != null)
	? (outlineView_validateDrop_proposedItem_proposedChildIndex_IMetInst)
	: (outlineView_validateDrop_proposedItem_proposedChildIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:validateDrop:proposedItem:proposedChildIndex:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long outlineView_validateDrop_proposedItem_proposedChildIndex(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.ID info, final com.apple.jobjc.ID item, final long index){
			final com.apple.jobjc.Invoke.MsgSend outlineView_validateDrop_proposedItem_proposedChildIndex_IMetInst = get_outlineView_validateDrop_proposedItem_proposedChildIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_validateDrop_proposedItem_proposedChildIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, info);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		outlineView_validateDrop_proposedItem_proposedChildIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_viewForTableColumn_item_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_viewForTableColumn_item_IMetInst(){
		return ((outlineView_viewForTableColumn_item_IMetInst != null)
	? (outlineView_viewForTableColumn_item_IMetInst)
	: (outlineView_viewForTableColumn_item_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:viewForTableColumn:item:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView outlineView_viewForTableColumn_item(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_viewForTableColumn_item_IMetInst = get_outlineView_viewForTableColumn_item_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_viewForTableColumn_item_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_viewForTableColumn_item_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_willDisplayCell_forTableColumn_item_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_willDisplayCell_forTableColumn_item_IMetInst(){
		return ((outlineView_willDisplayCell_forTableColumn_item_IMetInst != null)
	? (outlineView_willDisplayCell_forTableColumn_item_IMetInst)
	: (outlineView_willDisplayCell_forTableColumn_item_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:willDisplayCell:forTableColumn:item:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void outlineView_willDisplayCell_forTableColumn_item(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.ID cell, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_willDisplayCell_forTableColumn_item_IMetInst = get_outlineView_willDisplayCell_forTableColumn_item_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_willDisplayCell_forTableColumn_item_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_willDisplayCell_forTableColumn_item_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_willDisplayOutlineCell_forTableColumn_item_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_willDisplayOutlineCell_forTableColumn_item_IMetInst(){
		return ((outlineView_willDisplayOutlineCell_forTableColumn_item_IMetInst != null)
	? (outlineView_willDisplayOutlineCell_forTableColumn_item_IMetInst)
	: (outlineView_willDisplayOutlineCell_forTableColumn_item_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:willDisplayOutlineCell:forTableColumn:item:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void outlineView_willDisplayOutlineCell_forTableColumn_item(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.ID cell, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend outlineView_willDisplayOutlineCell_forTableColumn_item_IMetInst = get_outlineView_willDisplayOutlineCell_forTableColumn_item_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_willDisplayOutlineCell_forTableColumn_item_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		outlineView_willDisplayOutlineCell_forTableColumn_item_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineView_writeItems_toPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineView_writeItems_toPasteboard_IMetInst(){
		return ((outlineView_writeItems_toPasteboard_IMetInst != null)
	? (outlineView_writeItems_toPasteboard_IMetInst)
	: (outlineView_writeItems_toPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineView:writeItems:toPasteboard:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean outlineView_writeItems_toPasteboard(final com.apple.jobjc.appkit.NSOutlineView outlineView, final com.apple.jobjc.foundation.NSArray items, final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend outlineView_writeItems_toPasteboard_IMetInst = get_outlineView_writeItems_toPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineView_writeItems_toPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, items);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		outlineView_writeItems_toPasteboard_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineViewColumnDidMove_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineViewColumnDidMove_IMetInst(){
		return ((outlineViewColumnDidMove_IMetInst != null)
	? (outlineViewColumnDidMove_IMetInst)
	: (outlineViewColumnDidMove_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineViewColumnDidMove:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void outlineViewColumnDidMove(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend outlineViewColumnDidMove_IMetInst = get_outlineViewColumnDidMove_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineViewColumnDidMove_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		outlineViewColumnDidMove_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineViewColumnDidResize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineViewColumnDidResize_IMetInst(){
		return ((outlineViewColumnDidResize_IMetInst != null)
	? (outlineViewColumnDidResize_IMetInst)
	: (outlineViewColumnDidResize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineViewColumnDidResize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void outlineViewColumnDidResize(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend outlineViewColumnDidResize_IMetInst = get_outlineViewColumnDidResize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineViewColumnDidResize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		outlineViewColumnDidResize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineViewItemDidCollapse_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineViewItemDidCollapse_IMetInst(){
		return ((outlineViewItemDidCollapse_IMetInst != null)
	? (outlineViewItemDidCollapse_IMetInst)
	: (outlineViewItemDidCollapse_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineViewItemDidCollapse:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void outlineViewItemDidCollapse(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend outlineViewItemDidCollapse_IMetInst = get_outlineViewItemDidCollapse_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineViewItemDidCollapse_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		outlineViewItemDidCollapse_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineViewItemDidExpand_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineViewItemDidExpand_IMetInst(){
		return ((outlineViewItemDidExpand_IMetInst != null)
	? (outlineViewItemDidExpand_IMetInst)
	: (outlineViewItemDidExpand_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineViewItemDidExpand:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void outlineViewItemDidExpand(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend outlineViewItemDidExpand_IMetInst = get_outlineViewItemDidExpand_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineViewItemDidExpand_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		outlineViewItemDidExpand_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineViewItemWillCollapse_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineViewItemWillCollapse_IMetInst(){
		return ((outlineViewItemWillCollapse_IMetInst != null)
	? (outlineViewItemWillCollapse_IMetInst)
	: (outlineViewItemWillCollapse_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineViewItemWillCollapse:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void outlineViewItemWillCollapse(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend outlineViewItemWillCollapse_IMetInst = get_outlineViewItemWillCollapse_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineViewItemWillCollapse_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		outlineViewItemWillCollapse_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineViewItemWillExpand_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineViewItemWillExpand_IMetInst(){
		return ((outlineViewItemWillExpand_IMetInst != null)
	? (outlineViewItemWillExpand_IMetInst)
	: (outlineViewItemWillExpand_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineViewItemWillExpand:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void outlineViewItemWillExpand(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend outlineViewItemWillExpand_IMetInst = get_outlineViewItemWillExpand_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineViewItemWillExpand_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		outlineViewItemWillExpand_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineViewSelectionDidChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineViewSelectionDidChange_IMetInst(){
		return ((outlineViewSelectionDidChange_IMetInst != null)
	? (outlineViewSelectionDidChange_IMetInst)
	: (outlineViewSelectionDidChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineViewSelectionDidChange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void outlineViewSelectionDidChange(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend outlineViewSelectionDidChange_IMetInst = get_outlineViewSelectionDidChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineViewSelectionDidChange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		outlineViewSelectionDidChange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineViewSelectionIsChanging_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineViewSelectionIsChanging_IMetInst(){
		return ((outlineViewSelectionIsChanging_IMetInst != null)
	? (outlineViewSelectionIsChanging_IMetInst)
	: (outlineViewSelectionIsChanging_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineViewSelectionIsChanging:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void outlineViewSelectionIsChanging(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend outlineViewSelectionIsChanging_IMetInst = get_outlineViewSelectionIsChanging_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineViewSelectionIsChanging_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		outlineViewSelectionIsChanging_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pageController_didTransitionToObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pageController_didTransitionToObject_IMetInst(){
		return ((pageController_didTransitionToObject_IMetInst != null)
	? (pageController_didTransitionToObject_IMetInst)
	: (pageController_didTransitionToObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pageController:didTransitionToObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pageController_didTransitionToObject(final com.apple.jobjc.appkit.NSPageController pageController, final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend pageController_didTransitionToObject_IMetInst = get_pageController_didTransitionToObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pageController_didTransitionToObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pageController);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		pageController_didTransitionToObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pageController_frameForObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pageController_frameForObject_IMetInst(){
		return ((pageController_frameForObject_IMetInst != null)
	? (pageController_frameForObject_IMetInst)
	: (pageController_frameForObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pageController:frameForObject:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect pageController_frameForObject(final com.apple.jobjc.appkit.NSPageController pageController, final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend pageController_frameForObject_IMetInst = get_pageController_frameForObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pageController_frameForObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pageController);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		pageController_frameForObject_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pageController_identifierForObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pageController_identifierForObject_IMetInst(){
		return ((pageController_identifierForObject_IMetInst != null)
	? (pageController_identifierForObject_IMetInst)
	: (pageController_identifierForObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pageController:identifierForObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString pageController_identifierForObject(final com.apple.jobjc.appkit.NSPageController pageController, final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend pageController_identifierForObject_IMetInst = get_pageController_identifierForObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pageController_identifierForObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pageController);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		pageController_identifierForObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pageController_prepareViewController_withObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pageController_prepareViewController_withObject_IMetInst(){
		return ((pageController_prepareViewController_withObject_IMetInst != null)
	? (pageController_prepareViewController_withObject_IMetInst)
	: (pageController_prepareViewController_withObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pageController:prepareViewController:withObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pageController_prepareViewController_withObject(final com.apple.jobjc.appkit.NSPageController pageController, final com.apple.jobjc.appkit.NSViewController viewController, final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend pageController_prepareViewController_withObject_IMetInst = get_pageController_prepareViewController_withObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pageController_prepareViewController_withObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pageController);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, viewController);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		pageController_prepareViewController_withObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pageController_viewControllerForIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pageController_viewControllerForIdentifier_IMetInst(){
		return ((pageController_viewControllerForIdentifier_IMetInst != null)
	? (pageController_viewControllerForIdentifier_IMetInst)
	: (pageController_viewControllerForIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pageController:viewControllerForIdentifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSViewController pageController_viewControllerForIdentifier(final com.apple.jobjc.appkit.NSPageController pageController, final com.apple.jobjc.foundation.NSString identifier){
			final com.apple.jobjc.Invoke.MsgSend pageController_viewControllerForIdentifier_IMetInst = get_pageController_viewControllerForIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pageController_viewControllerForIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pageController);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, identifier);
		pageController_viewControllerForIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSViewController returnValue = (com.apple.jobjc.appkit.NSViewController) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pageControllerDidEndLiveTransition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pageControllerDidEndLiveTransition_IMetInst(){
		return ((pageControllerDidEndLiveTransition_IMetInst != null)
	? (pageControllerDidEndLiveTransition_IMetInst)
	: (pageControllerDidEndLiveTransition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pageControllerDidEndLiveTransition:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pageControllerDidEndLiveTransition(final com.apple.jobjc.appkit.NSPageController pageController){
			final com.apple.jobjc.Invoke.MsgSend pageControllerDidEndLiveTransition_IMetInst = get_pageControllerDidEndLiveTransition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pageControllerDidEndLiveTransition_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pageController);
		pageControllerDidEndLiveTransition_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pageControllerWillStartLiveTransition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pageControllerWillStartLiveTransition_IMetInst(){
		return ((pageControllerWillStartLiveTransition_IMetInst != null)
	? (pageControllerWillStartLiveTransition_IMetInst)
	: (pageControllerWillStartLiveTransition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pageControllerWillStartLiveTransition:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pageControllerWillStartLiveTransition(final com.apple.jobjc.appkit.NSPageController pageController){
			final com.apple.jobjc.Invoke.MsgSend pageControllerWillStartLiveTransition_IMetInst = get_pageControllerWillStartLiveTransition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pageControllerWillStartLiveTransition_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pageController);
		pageControllerWillStartLiveTransition_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend panel_compareFilename_with_caseSensitive_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_panel_compareFilename_with_caseSensitive_IMetInst(){
		return ((panel_compareFilename_with_caseSensitive_IMetInst != null)
	? (panel_compareFilename_with_caseSensitive_IMetInst)
	: (panel_compareFilename_with_caseSensitive_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "panel:compareFilename:with:caseSensitive:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public long panel_compareFilename_with_caseSensitive(final com.apple.jobjc.ID sender, final com.apple.jobjc.foundation.NSString name1, final com.apple.jobjc.foundation.NSString name2, final boolean caseSensitive){
			final com.apple.jobjc.Invoke.MsgSend panel_compareFilename_with_caseSensitive_IMetInst = get_panel_compareFilename_with_caseSensitive_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		panel_compareFilename_with_caseSensitive_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name1);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name2);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, caseSensitive);
		panel_compareFilename_with_caseSensitive_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend panel_didChangeToDirectoryURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_panel_didChangeToDirectoryURL_IMetInst(){
		return ((panel_didChangeToDirectoryURL_IMetInst != null)
	? (panel_didChangeToDirectoryURL_IMetInst)
	: (panel_didChangeToDirectoryURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "panel:didChangeToDirectoryURL:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void panel_didChangeToDirectoryURL(final com.apple.jobjc.ID sender, final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend panel_didChangeToDirectoryURL_IMetInst = get_panel_didChangeToDirectoryURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		panel_didChangeToDirectoryURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		panel_didChangeToDirectoryURL_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend panel_directoryDidChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_panel_directoryDidChange_IMetInst(){
		return ((panel_directoryDidChange_IMetInst != null)
	? (panel_directoryDidChange_IMetInst)
	: (panel_directoryDidChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "panel:directoryDidChange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void panel_directoryDidChange(final com.apple.jobjc.ID sender, final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend panel_directoryDidChange_IMetInst = get_panel_directoryDidChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		panel_directoryDidChange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		panel_directoryDidChange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend panel_isValidFilename_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_panel_isValidFilename_IMetInst(){
		return ((panel_isValidFilename_IMetInst != null)
	? (panel_isValidFilename_IMetInst)
	: (panel_isValidFilename_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "panel:isValidFilename:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean panel_isValidFilename(final com.apple.jobjc.ID sender, final com.apple.jobjc.foundation.NSString filename){
			final com.apple.jobjc.Invoke.MsgSend panel_isValidFilename_IMetInst = get_panel_isValidFilename_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		panel_isValidFilename_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filename);
		panel_isValidFilename_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend panel_shouldEnableURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_panel_shouldEnableURL_IMetInst(){
		return ((panel_shouldEnableURL_IMetInst != null)
	? (panel_shouldEnableURL_IMetInst)
	: (panel_shouldEnableURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "panel:shouldEnableURL:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean panel_shouldEnableURL(final com.apple.jobjc.ID sender, final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend panel_shouldEnableURL_IMetInst = get_panel_shouldEnableURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		panel_shouldEnableURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		panel_shouldEnableURL_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend panel_shouldShowFilename_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_panel_shouldShowFilename_IMetInst(){
		return ((panel_shouldShowFilename_IMetInst != null)
	? (panel_shouldShowFilename_IMetInst)
	: (panel_shouldShowFilename_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "panel:shouldShowFilename:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean panel_shouldShowFilename(final com.apple.jobjc.ID sender, final com.apple.jobjc.foundation.NSString filename){
			final com.apple.jobjc.Invoke.MsgSend panel_shouldShowFilename_IMetInst = get_panel_shouldShowFilename_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		panel_shouldShowFilename_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filename);
		panel_shouldShowFilename_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend panel_userEnteredFilename_confirmed_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_panel_userEnteredFilename_confirmed_IMetInst(){
		return ((panel_userEnteredFilename_confirmed_IMetInst != null)
	? (panel_userEnteredFilename_confirmed_IMetInst)
	: (panel_userEnteredFilename_confirmed_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "panel:userEnteredFilename:confirmed:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString panel_userEnteredFilename_confirmed(final com.apple.jobjc.ID sender, final com.apple.jobjc.foundation.NSString filename, final boolean okFlag){
			final com.apple.jobjc.Invoke.MsgSend panel_userEnteredFilename_confirmed_IMetInst = get_panel_userEnteredFilename_confirmed_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		panel_userEnteredFilename_confirmed_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filename);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, okFlag);
		panel_userEnteredFilename_confirmed_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend panel_validateURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_panel_validateURL_error_IMetInst(){
		return ((panel_validateURL_error_IMetInst != null)
	? (panel_validateURL_error_IMetInst)
	: (panel_validateURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "panel:validateURL:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean panel_validateURL_error(final com.apple.jobjc.ID sender, final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend panel_validateURL_error_IMetInst = get_panel_validateURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		panel_validateURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		panel_validateURL_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend panel_willExpand_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_panel_willExpand_IMetInst(){
		return ((panel_willExpand_IMetInst != null)
	? (panel_willExpand_IMetInst)
	: (panel_willExpand_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "panel:willExpand:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void panel_willExpand(final com.apple.jobjc.ID sender, final boolean expanding){
			final com.apple.jobjc.Invoke.MsgSend panel_willExpand_IMetInst = get_panel_willExpand_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		panel_willExpand_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, expanding);
		panel_willExpand_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend panelSelectionDidChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_panelSelectionDidChange_IMetInst(){
		return ((panelSelectionDidChange_IMetInst != null)
	? (panelSelectionDidChange_IMetInst)
	: (panelSelectionDidChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "panelSelectionDidChange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void panelSelectionDidChange(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend panelSelectionDidChange_IMetInst = get_panelSelectionDidChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		panelSelectionDidChange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		panelSelectionDidChange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pasteboard_item_provideDataForType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pasteboard_item_provideDataForType_IMetInst(){
		return ((pasteboard_item_provideDataForType_IMetInst != null)
	? (pasteboard_item_provideDataForType_IMetInst)
	: (pasteboard_item_provideDataForType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pasteboard:item:provideDataForType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pasteboard_item_provideDataForType(final com.apple.jobjc.appkit.NSPasteboard pasteboard, final com.apple.jobjc.appkit.NSPasteboardItem item, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend pasteboard_item_provideDataForType_IMetInst = get_pasteboard_item_provideDataForType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pasteboard_item_provideDataForType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		pasteboard_item_provideDataForType_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pasteboard_provideDataForType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pasteboard_provideDataForType_IMetInst(){
		return ((pasteboard_provideDataForType_IMetInst != null)
	? (pasteboard_provideDataForType_IMetInst)
	: (pasteboard_provideDataForType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pasteboard:provideDataForType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pasteboard_provideDataForType(final com.apple.jobjc.appkit.NSPasteboard sender, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend pasteboard_provideDataForType_IMetInst = get_pasteboard_provideDataForType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pasteboard_provideDataForType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		pasteboard_provideDataForType_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pasteboardChangedOwner_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pasteboardChangedOwner_IMetInst(){
		return ((pasteboardChangedOwner_IMetInst != null)
	? (pasteboardChangedOwner_IMetInst)
	: (pasteboardChangedOwner_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pasteboardChangedOwner:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pasteboardChangedOwner(final com.apple.jobjc.appkit.NSPasteboard sender){
			final com.apple.jobjc.Invoke.MsgSend pasteboardChangedOwner_IMetInst = get_pasteboardChangedOwner_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pasteboardChangedOwner_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		pasteboardChangedOwner_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pasteboardFinishedWithDataProvider_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pasteboardFinishedWithDataProvider_IMetInst(){
		return ((pasteboardFinishedWithDataProvider_IMetInst != null)
	? (pasteboardFinishedWithDataProvider_IMetInst)
	: (pasteboardFinishedWithDataProvider_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pasteboardFinishedWithDataProvider:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pasteboardFinishedWithDataProvider(final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend pasteboardFinishedWithDataProvider_IMetInst = get_pasteboardFinishedWithDataProvider_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pasteboardFinishedWithDataProvider_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		pasteboardFinishedWithDataProvider_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pasteboardPropertyListForType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pasteboardPropertyListForType_IMetInst(){
		return ((pasteboardPropertyListForType_IMetInst != null)
	? (pasteboardPropertyListForType_IMetInst)
	: (pasteboardPropertyListForType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pasteboardPropertyListForType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T pasteboardPropertyListForType(final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend pasteboardPropertyListForType_IMetInst = get_pasteboardPropertyListForType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pasteboardPropertyListForType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		pasteboardPropertyListForType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathCell_willDisplayOpenPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathCell_willDisplayOpenPanel_IMetInst(){
		return ((pathCell_willDisplayOpenPanel_IMetInst != null)
	? (pathCell_willDisplayOpenPanel_IMetInst)
	: (pathCell_willDisplayOpenPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathCell:willDisplayOpenPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pathCell_willDisplayOpenPanel(final com.apple.jobjc.appkit.NSPathCell pathCell, final com.apple.jobjc.appkit.NSOpenPanel openPanel){
			final com.apple.jobjc.Invoke.MsgSend pathCell_willDisplayOpenPanel_IMetInst = get_pathCell_willDisplayOpenPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathCell_willDisplayOpenPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pathCell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, openPanel);
		pathCell_willDisplayOpenPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pathCell_willPopUpMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathCell_willPopUpMenu_IMetInst(){
		return ((pathCell_willPopUpMenu_IMetInst != null)
	? (pathCell_willPopUpMenu_IMetInst)
	: (pathCell_willPopUpMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathCell:willPopUpMenu:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pathCell_willPopUpMenu(final com.apple.jobjc.appkit.NSPathCell pathCell, final com.apple.jobjc.appkit.NSMenu menu){
			final com.apple.jobjc.Invoke.MsgSend pathCell_willPopUpMenu_IMetInst = get_pathCell_willPopUpMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathCell_willPopUpMenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pathCell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		pathCell_willPopUpMenu_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pathControl_acceptDrop_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathControl_acceptDrop_IMetInst(){
		return ((pathControl_acceptDrop_IMetInst != null)
	? (pathControl_acceptDrop_IMetInst)
	: (pathControl_acceptDrop_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathControl:acceptDrop:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean pathControl_acceptDrop(final com.apple.jobjc.appkit.NSPathControl pathControl, final com.apple.jobjc.ID info){
			final com.apple.jobjc.Invoke.MsgSend pathControl_acceptDrop_IMetInst = get_pathControl_acceptDrop_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathControl_acceptDrop_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pathControl);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, info);
		pathControl_acceptDrop_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathControl_shouldDragPathComponentCell_withPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathControl_shouldDragPathComponentCell_withPasteboard_IMetInst(){
		return ((pathControl_shouldDragPathComponentCell_withPasteboard_IMetInst != null)
	? (pathControl_shouldDragPathComponentCell_withPasteboard_IMetInst)
	: (pathControl_shouldDragPathComponentCell_withPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathControl:shouldDragPathComponentCell:withPasteboard:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean pathControl_shouldDragPathComponentCell_withPasteboard(final com.apple.jobjc.appkit.NSPathControl pathControl, final com.apple.jobjc.appkit.NSPathComponentCell pathComponentCell, final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend pathControl_shouldDragPathComponentCell_withPasteboard_IMetInst = get_pathControl_shouldDragPathComponentCell_withPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathControl_shouldDragPathComponentCell_withPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pathControl);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pathComponentCell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		pathControl_shouldDragPathComponentCell_withPasteboard_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathControl_validateDrop_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathControl_validateDrop_IMetInst(){
		return ((pathControl_validateDrop_IMetInst != null)
	? (pathControl_validateDrop_IMetInst)
	: (pathControl_validateDrop_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathControl:validateDrop:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long pathControl_validateDrop(final com.apple.jobjc.appkit.NSPathControl pathControl, final com.apple.jobjc.ID info){
			final com.apple.jobjc.Invoke.MsgSend pathControl_validateDrop_IMetInst = get_pathControl_validateDrop_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathControl_validateDrop_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pathControl);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, info);
		pathControl_validateDrop_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathControl_willDisplayOpenPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathControl_willDisplayOpenPanel_IMetInst(){
		return ((pathControl_willDisplayOpenPanel_IMetInst != null)
	? (pathControl_willDisplayOpenPanel_IMetInst)
	: (pathControl_willDisplayOpenPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathControl:willDisplayOpenPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pathControl_willDisplayOpenPanel(final com.apple.jobjc.appkit.NSPathControl pathControl, final com.apple.jobjc.appkit.NSOpenPanel openPanel){
			final com.apple.jobjc.Invoke.MsgSend pathControl_willDisplayOpenPanel_IMetInst = get_pathControl_willDisplayOpenPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathControl_willDisplayOpenPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pathControl);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, openPanel);
		pathControl_willDisplayOpenPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pathControl_willPopUpMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathControl_willPopUpMenu_IMetInst(){
		return ((pathControl_willPopUpMenu_IMetInst != null)
	? (pathControl_willPopUpMenu_IMetInst)
	: (pathControl_willPopUpMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathControl:willPopUpMenu:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pathControl_willPopUpMenu(final com.apple.jobjc.appkit.NSPathControl pathControl, final com.apple.jobjc.appkit.NSMenu menu){
			final com.apple.jobjc.Invoke.MsgSend pathControl_willPopUpMenu_IMetInst = get_pathControl_willPopUpMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathControl_willPopUpMenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pathControl);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		pathControl_willPopUpMenu_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend performActionForItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performActionForItem_IMetInst(){
		return ((performActionForItem_IMetInst != null)
	? (performActionForItem_IMetInst)
	: (performActionForItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performActionForItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void performActionForItem(final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend performActionForItem_IMetInst = get_performActionForItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performActionForItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		performActionForItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend performDragOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performDragOperation_IMetInst(){
		return ((performDragOperation_IMetInst != null)
	? (performDragOperation_IMetInst)
	: (performDragOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performDragOperation:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean performDragOperation(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend performDragOperation_IMetInst = get_performDragOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performDragOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		performDragOperation_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend popoverDidClose_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_popoverDidClose_IMetInst(){
		return ((popoverDidClose_IMetInst != null)
	? (popoverDidClose_IMetInst)
	: (popoverDidClose_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "popoverDidClose:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void popoverDidClose(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend popoverDidClose_IMetInst = get_popoverDidClose_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		popoverDidClose_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		popoverDidClose_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend popoverDidShow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_popoverDidShow_IMetInst(){
		return ((popoverDidShow_IMetInst != null)
	? (popoverDidShow_IMetInst)
	: (popoverDidShow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "popoverDidShow:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void popoverDidShow(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend popoverDidShow_IMetInst = get_popoverDidShow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		popoverDidShow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		popoverDidShow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend popoverShouldClose_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_popoverShouldClose_IMetInst(){
		return ((popoverShouldClose_IMetInst != null)
	? (popoverShouldClose_IMetInst)
	: (popoverShouldClose_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "popoverShouldClose:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean popoverShouldClose(final com.apple.jobjc.appkit.NSPopover popover){
			final com.apple.jobjc.Invoke.MsgSend popoverShouldClose_IMetInst = get_popoverShouldClose_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		popoverShouldClose_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, popover);
		popoverShouldClose_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend popoverWillClose_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_popoverWillClose_IMetInst(){
		return ((popoverWillClose_IMetInst != null)
	? (popoverWillClose_IMetInst)
	: (popoverWillClose_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "popoverWillClose:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void popoverWillClose(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend popoverWillClose_IMetInst = get_popoverWillClose_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		popoverWillClose_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		popoverWillClose_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend popoverWillShow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_popoverWillShow_IMetInst(){
		return ((popoverWillShow_IMetInst != null)
	? (popoverWillShow_IMetInst)
	: (popoverWillShow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "popoverWillShow:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void popoverWillShow(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend popoverWillShow_IMetInst = get_popoverWillShow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		popoverWillShow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		popoverWillShow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend prepareForDragOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_prepareForDragOperation_IMetInst(){
		return ((prepareForDragOperation_IMetInst != null)
	? (prepareForDragOperation_IMetInst)
	: (prepareForDragOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "prepareForDragOperation:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean prepareForDragOperation(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend prepareForDragOperation_IMetInst = get_prepareForDragOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		prepareForDragOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		prepareForDragOperation_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend provideNewButtonImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_provideNewButtonImage_IMetInst(){
		return ((provideNewButtonImage_IMetInst != null)
	? (provideNewButtonImage_IMetInst)
	: (provideNewButtonImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "provideNewButtonImage", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage provideNewButtonImage(){
			final com.apple.jobjc.Invoke.MsgSend provideNewButtonImage_IMetInst = get_provideNewButtonImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		provideNewButtonImage_IMetInst.init(nativeBuffer, this);
		provideNewButtonImage_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend provideNewView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_provideNewView_IMetInst(){
		return ((provideNewView_IMetInst != null)
	? (provideNewView_IMetInst)
	: (provideNewView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "provideNewView:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView provideNewView(final boolean initialRequest){
			final com.apple.jobjc.Invoke.MsgSend provideNewView_IMetInst = get_provideNewView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		provideNewView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, initialRequest);
		provideNewView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readSelectionFromPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readSelectionFromPasteboard_IMetInst(){
		return ((readSelectionFromPasteboard_IMetInst != null)
	? (readSelectionFromPasteboard_IMetInst)
	: (readSelectionFromPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readSelectionFromPasteboard:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean readSelectionFromPasteboard(final com.apple.jobjc.appkit.NSPasteboard pboard){
			final com.apple.jobjc.Invoke.MsgSend readSelectionFromPasteboard_IMetInst = get_readSelectionFromPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readSelectionFromPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pboard);
		readSelectionFromPasteboard_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rectsForCharacterRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rectsForCharacterRange_IMetInst(){
		return ((rectsForCharacterRange_IMetInst != null)
	? (rectsForCharacterRange_IMetInst)
	: (rectsForCharacterRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rectsForCharacterRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSArray rectsForCharacterRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend rectsForCharacterRange_IMetInst = get_rectsForCharacterRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rectsForCharacterRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		rectsForCharacterRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceCharactersInRange_withString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceCharactersInRange_withString_IMetInst(){
		return ((replaceCharactersInRange_withString_IMetInst != null)
	? (replaceCharactersInRange_withString_IMetInst)
	: (replaceCharactersInRange_withString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceCharactersInRange:withString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void replaceCharactersInRange_withString(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend replaceCharactersInRange_withString_IMetInst = get_replaceCharactersInRange_withString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceCharactersInRange_withString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		replaceCharactersInRange_withString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rootItemForBrowser_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rootItemForBrowser_IMetInst(){
		return ((rootItemForBrowser_IMetInst != null)
	? (rootItemForBrowser_IMetInst)
	: (rootItemForBrowser_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rootItemForBrowser:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T rootItemForBrowser(final com.apple.jobjc.appkit.NSBrowser browser){
			final com.apple.jobjc.Invoke.MsgSend rootItemForBrowser_IMetInst = get_rootItemForBrowser_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rootItemForBrowser_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, browser);
		rootItemForBrowser_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ruleEditor_child_forCriterion_withRowType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ruleEditor_child_forCriterion_withRowType_IMetInst(){
		return ((ruleEditor_child_forCriterion_withRowType_IMetInst != null)
	? (ruleEditor_child_forCriterion_withRowType_IMetInst)
	: (ruleEditor_child_forCriterion_withRowType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ruleEditor:child:forCriterion:withRowType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T ruleEditor_child_forCriterion_withRowType(final com.apple.jobjc.appkit.NSRuleEditor editor, final long index, final com.apple.jobjc.ID criterion, final long rowType){
			final com.apple.jobjc.Invoke.MsgSend ruleEditor_child_forCriterion_withRowType_IMetInst = get_ruleEditor_child_forCriterion_withRowType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ruleEditor_child_forCriterion_withRowType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, editor);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, criterion);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, rowType);
		ruleEditor_child_forCriterion_withRowType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ruleEditor_displayValueForCriterion_inRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ruleEditor_displayValueForCriterion_inRow_IMetInst(){
		return ((ruleEditor_displayValueForCriterion_inRow_IMetInst != null)
	? (ruleEditor_displayValueForCriterion_inRow_IMetInst)
	: (ruleEditor_displayValueForCriterion_inRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ruleEditor:displayValueForCriterion:inRow:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T ruleEditor_displayValueForCriterion_inRow(final com.apple.jobjc.appkit.NSRuleEditor editor, final com.apple.jobjc.ID criterion, final long row){
			final com.apple.jobjc.Invoke.MsgSend ruleEditor_displayValueForCriterion_inRow_IMetInst = get_ruleEditor_displayValueForCriterion_inRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ruleEditor_displayValueForCriterion_inRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, editor);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, criterion);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		ruleEditor_displayValueForCriterion_inRow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ruleEditor_numberOfChildrenForCriterion_withRowType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ruleEditor_numberOfChildrenForCriterion_withRowType_IMetInst(){
		return ((ruleEditor_numberOfChildrenForCriterion_withRowType_IMetInst != null)
	? (ruleEditor_numberOfChildrenForCriterion_withRowType_IMetInst)
	: (ruleEditor_numberOfChildrenForCriterion_withRowType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ruleEditor:numberOfChildrenForCriterion:withRowType:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long ruleEditor_numberOfChildrenForCriterion_withRowType(final com.apple.jobjc.appkit.NSRuleEditor editor, final com.apple.jobjc.ID criterion, final long rowType){
			final com.apple.jobjc.Invoke.MsgSend ruleEditor_numberOfChildrenForCriterion_withRowType_IMetInst = get_ruleEditor_numberOfChildrenForCriterion_withRowType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ruleEditor_numberOfChildrenForCriterion_withRowType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, editor);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, criterion);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, rowType);
		ruleEditor_numberOfChildrenForCriterion_withRowType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ruleEditor_predicatePartsForCriterion_withDisplayValue_inRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ruleEditor_predicatePartsForCriterion_withDisplayValue_inRow_IMetInst(){
		return ((ruleEditor_predicatePartsForCriterion_withDisplayValue_inRow_IMetInst != null)
	? (ruleEditor_predicatePartsForCriterion_withDisplayValue_inRow_IMetInst)
	: (ruleEditor_predicatePartsForCriterion_withDisplayValue_inRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ruleEditor:predicatePartsForCriterion:withDisplayValue:inRow:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSDictionary ruleEditor_predicatePartsForCriterion_withDisplayValue_inRow(final com.apple.jobjc.appkit.NSRuleEditor editor, final com.apple.jobjc.ID criterion, final com.apple.jobjc.ID value, final long row){
			final com.apple.jobjc.Invoke.MsgSend ruleEditor_predicatePartsForCriterion_withDisplayValue_inRow_IMetInst = get_ruleEditor_predicatePartsForCriterion_withDisplayValue_inRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ruleEditor_predicatePartsForCriterion_withDisplayValue_inRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, editor);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, criterion);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		ruleEditor_predicatePartsForCriterion_withDisplayValue_inRow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ruleEditorRowsDidChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ruleEditorRowsDidChange_IMetInst(){
		return ((ruleEditorRowsDidChange_IMetInst != null)
	? (ruleEditorRowsDidChange_IMetInst)
	: (ruleEditorRowsDidChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ruleEditorRowsDidChange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void ruleEditorRowsDidChange(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend ruleEditorRowsDidChange_IMetInst = get_ruleEditorRowsDidChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ruleEditorRowsDidChange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		ruleEditorRowsDidChange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollRangeToVisible_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollRangeToVisible_IMetInst(){
		return ((scrollRangeToVisible_IMetInst != null)
	? (scrollRangeToVisible_IMetInst)
	: (scrollRangeToVisible_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollRangeToVisible:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void scrollRangeToVisible(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend scrollRangeToVisible_IMetInst = get_scrollRangeToVisible_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollRangeToVisible_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		scrollRangeToVisible_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend searchForItemsWithSearchString_resultLimit_matchedItemHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_searchForItemsWithSearchString_resultLimit_matchedItemHandler_IMetInst(){
		return ((searchForItemsWithSearchString_resultLimit_matchedItemHandler_IMetInst != null)
	? (searchForItemsWithSearchString_resultLimit_matchedItemHandler_IMetInst)
	: (searchForItemsWithSearchString_resultLimit_matchedItemHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "searchForItemsWithSearchString:resultLimit:matchedItemHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void searchForItemsWithSearchString_resultLimit_matchedItemHandler(final com.apple.jobjc.foundation.NSString searchString, final long resultLimit, final Object /* void(^)(NSArray*) (@, @) */ handleMatchedItems){
			final com.apple.jobjc.Invoke.MsgSend searchForItemsWithSearchString_resultLimit_matchedItemHandler_IMetInst = get_searchForItemsWithSearchString_resultLimit_matchedItemHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		searchForItemsWithSearchString_resultLimit_matchedItemHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, searchString);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, resultLimit);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, handleMatchedItems);
		searchForItemsWithSearchString_resultLimit_matchedItemHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedRange_IMetInst(){
		return ((selectedRange_IMetInst != null)
	? (selectedRange_IMetInst)
	: (selectedRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedRange", com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange selectedRange(){
			final com.apple.jobjc.Invoke.MsgSend selectedRange_IMetInst = get_selectedRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedRange_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		selectedRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedRanges_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedRanges_IMetInst(){
		return ((selectedRanges_IMetInst != null)
	? (selectedRanges_IMetInst)
	: (selectedRanges_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedRanges", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray selectedRanges(){
			final com.apple.jobjc.Invoke.MsgSend selectedRanges_IMetInst = get_selectedRanges_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedRanges_IMetInst.init(nativeBuffer, this);
		selectedRanges_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectionShouldChangeInOutlineView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectionShouldChangeInOutlineView_IMetInst(){
		return ((selectionShouldChangeInOutlineView_IMetInst != null)
	? (selectionShouldChangeInOutlineView_IMetInst)
	: (selectionShouldChangeInOutlineView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectionShouldChangeInOutlineView:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean selectionShouldChangeInOutlineView(final com.apple.jobjc.appkit.NSOutlineView outlineView){
			final com.apple.jobjc.Invoke.MsgSend selectionShouldChangeInOutlineView_IMetInst = get_selectionShouldChangeInOutlineView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectionShouldChangeInOutlineView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineView);
		selectionShouldChangeInOutlineView_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectionShouldChangeInTableView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectionShouldChangeInTableView_IMetInst(){
		return ((selectionShouldChangeInTableView_IMetInst != null)
	? (selectionShouldChangeInTableView_IMetInst)
	: (selectionShouldChangeInTableView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectionShouldChangeInTableView:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean selectionShouldChangeInTableView(final com.apple.jobjc.appkit.NSTableView tableView){
			final com.apple.jobjc.Invoke.MsgSend selectionShouldChangeInTableView_IMetInst = get_selectionShouldChangeInTableView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectionShouldChangeInTableView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		selectionShouldChangeInTableView_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAnimatesToDestination_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAnimatesToDestination_IMetInst(){
		return ((setAnimatesToDestination_IMetInst != null)
	? (setAnimatesToDestination_IMetInst)
	: (setAnimatesToDestination_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAnimatesToDestination:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAnimatesToDestination(final boolean animatesToDestination){
			final com.apple.jobjc.Invoke.MsgSend setAnimatesToDestination_IMetInst = get_setAnimatesToDestination_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAnimatesToDestination_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, animatesToDestination);
		setAnimatesToDestination_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAnimations_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAnimations_IMetInst(){
		return ((setAnimations_IMetInst != null)
	? (setAnimations_IMetInst)
	: (setAnimations_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAnimations:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAnimations(final com.apple.jobjc.foundation.NSDictionary animations){
			final com.apple.jobjc.Invoke.MsgSend setAnimations_IMetInst = get_setAnimations_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAnimations_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, animations);
		setAnimations_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttachment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttachment_IMetInst(){
		return ((setAttachment_IMetInst != null)
	? (setAttachment_IMetInst)
	: (setAttachment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttachment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAttachment(final com.apple.jobjc.appkit.NSTextAttachment anObject){
			final com.apple.jobjc.Invoke.MsgSend setAttachment_IMetInst = get_setAttachment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttachment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setAttachment_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setColor_IMetInst(){
		return ((setColor_IMetInst != null)
	? (setColor_IMetInst)
	: (setColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setColor(final com.apple.jobjc.appkit.NSColor newColor){
			final com.apple.jobjc.Invoke.MsgSend setColor_IMetInst = get_setColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newColor);
		setColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDockTile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDockTile_IMetInst(){
		return ((setDockTile_IMetInst != null)
	? (setDockTile_IMetInst)
	: (setDockTile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDockTile:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDockTile(final com.apple.jobjc.appkit.NSDockTile dockTile){
			final com.apple.jobjc.Invoke.MsgSend setDockTile_IMetInst = get_setDockTile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDockTile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dockTile);
		setDockTile_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDraggingFormation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDraggingFormation_IMetInst(){
		return ((setDraggingFormation_IMetInst != null)
	? (setDraggingFormation_IMetInst)
	: (setDraggingFormation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDraggingFormation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setDraggingFormation(final long draggingFormation){
			final com.apple.jobjc.Invoke.MsgSend setDraggingFormation_IMetInst = get_setDraggingFormation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDraggingFormation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, draggingFormation);
		setDraggingFormation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFindBarView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFindBarView_IMetInst(){
		return ((setFindBarView_IMetInst != null)
	? (setFindBarView_IMetInst)
	: (setFindBarView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFindBarView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFindBarView(final com.apple.jobjc.appkit.NSView findBarView){
			final com.apple.jobjc.Invoke.MsgSend setFindBarView_IMetInst = get_setFindBarView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFindBarView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, findBarView);
		setFindBarView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFindBarVisible_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFindBarVisible_IMetInst(){
		return ((setFindBarVisible_IMetInst != null)
	? (setFindBarVisible_IMetInst)
	: (setFindBarVisible_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFindBarVisible:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setFindBarVisible(final boolean findBarVisible){
			final com.apple.jobjc.Invoke.MsgSend setFindBarVisible_IMetInst = get_setFindBarVisible_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFindBarVisible_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, findBarVisible);
		setFindBarVisible_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIdentifier_IMetInst(){
		return ((setIdentifier_IMetInst != null)
	? (setIdentifier_IMetInst)
	: (setIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIdentifier:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setIdentifier(final com.apple.jobjc.foundation.NSString identifier){
			final com.apple.jobjc.Invoke.MsgSend setIdentifier_IMetInst = get_setIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, identifier);
		setIdentifier_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIntAttribute_value_forGlyphAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIntAttribute_value_forGlyphAtIndex_IMetInst(){
		return ((setIntAttribute_value_forGlyphAtIndex_IMetInst != null)
	? (setIntAttribute_value_forGlyphAtIndex_IMetInst)
	: (setIntAttribute_value_forGlyphAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIntAttribute:value:forGlyphAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setIntAttribute_value_forGlyphAtIndex(final long attributeTag, final long val, final long glyphIndex){
			final com.apple.jobjc.Invoke.MsgSend setIntAttribute_value_forGlyphAtIndex_IMetInst = get_setIntAttribute_value_forGlyphAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIntAttribute_value_forGlyphAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, attributeTag);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, val);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		setIntAttribute_value_forGlyphAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setKey_IMetInst(){
		return ((setKey_IMetInst != null)
	? (setKey_IMetInst)
	: (setKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend setKey_IMetInst = get_setKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		setKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLocalizedKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLocalizedKey_IMetInst(){
		return ((setLocalizedKey_IMetInst != null)
	? (setLocalizedKey_IMetInst)
	: (setLocalizedKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLocalizedKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setLocalizedKey(final com.apple.jobjc.foundation.NSString localizedKey){
			final com.apple.jobjc.Invoke.MsgSend setLocalizedKey_IMetInst = get_setLocalizedKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLocalizedKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, localizedKey);
		setLocalizedKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMarkedText_selectedRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMarkedText_selectedRange_IMetInst(){
		return ((setMarkedText_selectedRange_IMetInst != null)
	? (setMarkedText_selectedRange_IMetInst)
	: (setMarkedText_selectedRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMarkedText:selectedRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setMarkedText_selectedRange(final com.apple.jobjc.ID aString, final com.apple.jobjc.foundation.NSRange selRange){
			final com.apple.jobjc.Invoke.MsgSend setMarkedText_selectedRange_IMetInst = get_setMarkedText_selectedRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMarkedText_selectedRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, selRange);
		setMarkedText_selectedRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMarkedText_selectedRange_replacementRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMarkedText_selectedRange_replacementRange_IMetInst(){
		return ((setMarkedText_selectedRange_replacementRange_IMetInst != null)
	? (setMarkedText_selectedRange_replacementRange_IMetInst)
	: (setMarkedText_selectedRange_replacementRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMarkedText:selectedRange:replacementRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setMarkedText_selectedRange_replacementRange(final com.apple.jobjc.ID aString, final com.apple.jobjc.foundation.NSRange selectedRange, final com.apple.jobjc.foundation.NSRange replacementRange){
			final com.apple.jobjc.Invoke.MsgSend setMarkedText_selectedRange_replacementRange_IMetInst = get_setMarkedText_selectedRange_replacementRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMarkedText_selectedRange_replacementRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, selectedRange);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, replacementRange);
		setMarkedText_selectedRange_replacementRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMode_IMetInst(){
		return ((setMode_IMetInst != null)
	? (setMode_IMetInst)
	: (setMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setMode(final long mode){
			final com.apple.jobjc.Invoke.MsgSend setMode_IMetInst = get_setMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, mode);
		setMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNumberOfValidItemsForDrop_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNumberOfValidItemsForDrop_IMetInst(){
		return ((setNumberOfValidItemsForDrop_IMetInst != null)
	? (setNumberOfValidItemsForDrop_IMetInst)
	: (setNumberOfValidItemsForDrop_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNumberOfValidItemsForDrop:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setNumberOfValidItemsForDrop(final long numberOfValidItemsForDrop){
			final com.apple.jobjc.Invoke.MsgSend setNumberOfValidItemsForDrop_IMetInst = get_setNumberOfValidItemsForDrop_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNumberOfValidItemsForDrop_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, numberOfValidItemsForDrop);
		setNumberOfValidItemsForDrop_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectedRanges_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectedRanges_IMetInst(){
		return ((setSelectedRanges_IMetInst != null)
	? (setSelectedRanges_IMetInst)
	: (setSelectedRanges_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectedRanges:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSelectedRanges(final com.apple.jobjc.foundation.NSArray selectedRanges){
			final com.apple.jobjc.Invoke.MsgSend setSelectedRanges_IMetInst = get_setSelectedRanges_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectedRanges_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, selectedRanges);
		setSelectedRanges_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setValue_IMetInst(){
		return ((setValue_IMetInst != null)
	? (setValue_IMetInst)
	: (setValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setValue(final com.apple.jobjc.ID value){
			final com.apple.jobjc.Invoke.MsgSend setValue_IMetInst = get_setValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		setValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sharingService_didFailToShareItems_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharingService_didFailToShareItems_error_IMetInst(){
		return ((sharingService_didFailToShareItems_error_IMetInst != null)
	? (sharingService_didFailToShareItems_error_IMetInst)
	: (sharingService_didFailToShareItems_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharingService:didFailToShareItems:error:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void sharingService_didFailToShareItems_error(final com.apple.jobjc.appkit.NSSharingService sharingService, final com.apple.jobjc.foundation.NSArray items, final com.apple.jobjc.foundation.NSError error){
			final com.apple.jobjc.Invoke.MsgSend sharingService_didFailToShareItems_error_IMetInst = get_sharingService_didFailToShareItems_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharingService_didFailToShareItems_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sharingService);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, items);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		sharingService_didFailToShareItems_error_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sharingService_didShareItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharingService_didShareItems_IMetInst(){
		return ((sharingService_didShareItems_IMetInst != null)
	? (sharingService_didShareItems_IMetInst)
	: (sharingService_didShareItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharingService:didShareItems:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void sharingService_didShareItems(final com.apple.jobjc.appkit.NSSharingService sharingService, final com.apple.jobjc.foundation.NSArray items){
			final com.apple.jobjc.Invoke.MsgSend sharingService_didShareItems_IMetInst = get_sharingService_didShareItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharingService_didShareItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sharingService);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, items);
		sharingService_didShareItems_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sharingService_sourceFrameOnScreenForShareItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharingService_sourceFrameOnScreenForShareItem_IMetInst(){
		return ((sharingService_sourceFrameOnScreenForShareItem_IMetInst != null)
	? (sharingService_sourceFrameOnScreenForShareItem_IMetInst)
	: (sharingService_sourceFrameOnScreenForShareItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharingService:sourceFrameOnScreenForShareItem:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect sharingService_sourceFrameOnScreenForShareItem(final com.apple.jobjc.appkit.NSSharingService sharingService, final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend sharingService_sourceFrameOnScreenForShareItem_IMetInst = get_sharingService_sourceFrameOnScreenForShareItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharingService_sourceFrameOnScreenForShareItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sharingService);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		sharingService_sourceFrameOnScreenForShareItem_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sharingService_sourceWindowForShareItems_sharingContentScope_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharingService_sourceWindowForShareItems_sharingContentScope_IMetInst(){
		return ((sharingService_sourceWindowForShareItems_sharingContentScope_IMetInst != null)
	? (sharingService_sourceWindowForShareItems_sharingContentScope_IMetInst)
	: (sharingService_sourceWindowForShareItems_sharingContentScope_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharingService:sourceWindowForShareItems:sharingContentScope:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSWindow sharingService_sourceWindowForShareItems_sharingContentScope(final com.apple.jobjc.appkit.NSSharingService sharingService, final com.apple.jobjc.foundation.NSArray items, final Object /* NSSharingContentScope* (^i, ^q) */ sharingContentScope){
			final com.apple.jobjc.Invoke.MsgSend sharingService_sourceWindowForShareItems_sharingContentScope_IMetInst = get_sharingService_sourceWindowForShareItems_sharingContentScope_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharingService_sourceWindowForShareItems_sharingContentScope_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sharingService);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, items);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, sharingContentScope);
		sharingService_sourceWindowForShareItems_sharingContentScope_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSWindow returnValue = (com.apple.jobjc.appkit.NSWindow) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sharingService_transitionImageForShareItem_contentRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharingService_transitionImageForShareItem_contentRect_IMetInst(){
		return ((sharingService_transitionImageForShareItem_contentRect_IMetInst != null)
	? (sharingService_transitionImageForShareItem_contentRect_IMetInst)
	: (sharingService_transitionImageForShareItem_contentRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharingService:transitionImageForShareItem:contentRect:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage sharingService_transitionImageForShareItem_contentRect(final com.apple.jobjc.appkit.NSSharingService sharingService, final com.apple.jobjc.ID item, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRect> contentRect){
			final com.apple.jobjc.Invoke.MsgSend sharingService_transitionImageForShareItem_contentRect_IMetInst = get_sharingService_transitionImageForShareItem_contentRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharingService_transitionImageForShareItem_contentRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sharingService);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contentRect);
		sharingService_transitionImageForShareItem_contentRect_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sharingService_willShareItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharingService_willShareItems_IMetInst(){
		return ((sharingService_willShareItems_IMetInst != null)
	? (sharingService_willShareItems_IMetInst)
	: (sharingService_willShareItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharingService:willShareItems:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void sharingService_willShareItems(final com.apple.jobjc.appkit.NSSharingService sharingService, final com.apple.jobjc.foundation.NSArray items){
			final com.apple.jobjc.Invoke.MsgSend sharingService_willShareItems_IMetInst = get_sharingService_willShareItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharingService_willShareItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sharingService);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, items);
		sharingService_willShareItems_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sharingServicePicker_delegateForSharingService_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharingServicePicker_delegateForSharingService_IMetInst(){
		return ((sharingServicePicker_delegateForSharingService_IMetInst != null)
	? (sharingServicePicker_delegateForSharingService_IMetInst)
	: (sharingServicePicker_delegateForSharingService_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharingServicePicker:delegateForSharingService:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T sharingServicePicker_delegateForSharingService(final com.apple.jobjc.appkit.NSSharingServicePicker sharingServicePicker, final com.apple.jobjc.appkit.NSSharingService sharingService){
			final com.apple.jobjc.Invoke.MsgSend sharingServicePicker_delegateForSharingService_IMetInst = get_sharingServicePicker_delegateForSharingService_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharingServicePicker_delegateForSharingService_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sharingServicePicker);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sharingService);
		sharingServicePicker_delegateForSharingService_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sharingServicePicker_didChooseSharingService_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharingServicePicker_didChooseSharingService_IMetInst(){
		return ((sharingServicePicker_didChooseSharingService_IMetInst != null)
	? (sharingServicePicker_didChooseSharingService_IMetInst)
	: (sharingServicePicker_didChooseSharingService_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharingServicePicker:didChooseSharingService:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void sharingServicePicker_didChooseSharingService(final com.apple.jobjc.appkit.NSSharingServicePicker sharingServicePicker, final com.apple.jobjc.appkit.NSSharingService service){
			final com.apple.jobjc.Invoke.MsgSend sharingServicePicker_didChooseSharingService_IMetInst = get_sharingServicePicker_didChooseSharingService_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharingServicePicker_didChooseSharingService_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sharingServicePicker);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, service);
		sharingServicePicker_didChooseSharingService_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sharingServicePicker_sharingServicesForItems_proposedSharingServices_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharingServicePicker_sharingServicesForItems_proposedSharingServices_IMetInst(){
		return ((sharingServicePicker_sharingServicesForItems_proposedSharingServices_IMetInst != null)
	? (sharingServicePicker_sharingServicesForItems_proposedSharingServices_IMetInst)
	: (sharingServicePicker_sharingServicesForItems_proposedSharingServices_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharingServicePicker:sharingServicesForItems:proposedSharingServices:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray sharingServicePicker_sharingServicesForItems_proposedSharingServices(final com.apple.jobjc.appkit.NSSharingServicePicker sharingServicePicker, final com.apple.jobjc.foundation.NSArray items, final com.apple.jobjc.foundation.NSArray proposedServices){
			final com.apple.jobjc.Invoke.MsgSend sharingServicePicker_sharingServicesForItems_proposedSharingServices_IMetInst = get_sharingServicePicker_sharingServicesForItems_proposedSharingServices_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharingServicePicker_sharingServicesForItems_proposedSharingServices_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sharingServicePicker);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, items);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, proposedServices);
		sharingServicePicker_sharingServicesForItems_proposedSharingServices_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldReplaceCharactersInRanges_withStrings_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldReplaceCharactersInRanges_withStrings_IMetInst(){
		return ((shouldReplaceCharactersInRanges_withStrings_IMetInst != null)
	? (shouldReplaceCharactersInRanges_withStrings_IMetInst)
	: (shouldReplaceCharactersInRanges_withStrings_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldReplaceCharactersInRanges:withStrings:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean shouldReplaceCharactersInRanges_withStrings(final com.apple.jobjc.foundation.NSArray ranges, final com.apple.jobjc.foundation.NSArray strings){
			final com.apple.jobjc.Invoke.MsgSend shouldReplaceCharactersInRanges_withStrings_IMetInst = get_shouldReplaceCharactersInRanges_withStrings_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldReplaceCharactersInRanges_withStrings_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ranges);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, strings);
		shouldReplaceCharactersInRanges_withStrings_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend showAllHelpTopicsForSearchString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showAllHelpTopicsForSearchString_IMetInst(){
		return ((showAllHelpTopicsForSearchString_IMetInst != null)
	? (showAllHelpTopicsForSearchString_IMetInst)
	: (showAllHelpTopicsForSearchString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showAllHelpTopicsForSearchString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void showAllHelpTopicsForSearchString(final com.apple.jobjc.foundation.NSString searchString){
			final com.apple.jobjc.Invoke.MsgSend showAllHelpTopicsForSearchString_IMetInst = get_showAllHelpTopicsForSearchString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showAllHelpTopicsForSearchString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, searchString);
		showAllHelpTopicsForSearchString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend slideDraggedImageTo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_slideDraggedImageTo_IMetInst(){
		return ((slideDraggedImageTo_IMetInst != null)
	? (slideDraggedImageTo_IMetInst)
	: (slideDraggedImageTo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "slideDraggedImageTo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void slideDraggedImageTo(final com.apple.jobjc.foundation.NSPoint screenPoint){
			final com.apple.jobjc.Invoke.MsgSend slideDraggedImageTo_IMetInst = get_slideDraggedImageTo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		slideDraggedImageTo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, screenPoint);
		slideDraggedImageTo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sound_didFinishPlaying_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sound_didFinishPlaying_IMetInst(){
		return ((sound_didFinishPlaying_IMetInst != null)
	? (sound_didFinishPlaying_IMetInst)
	: (sound_didFinishPlaying_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sound:didFinishPlaying:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void sound_didFinishPlaying(final com.apple.jobjc.appkit.NSSound sound, final boolean aBool){
			final com.apple.jobjc.Invoke.MsgSend sound_didFinishPlaying_IMetInst = get_sound_didFinishPlaying_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sound_didFinishPlaying_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sound);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, aBool);
		sound_didFinishPlaying_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend speechRecognizer_didRecognizeCommand_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_speechRecognizer_didRecognizeCommand_IMetInst(){
		return ((speechRecognizer_didRecognizeCommand_IMetInst != null)
	? (speechRecognizer_didRecognizeCommand_IMetInst)
	: (speechRecognizer_didRecognizeCommand_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "speechRecognizer:didRecognizeCommand:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void speechRecognizer_didRecognizeCommand(final com.apple.jobjc.appkit.NSSpeechRecognizer sender, final com.apple.jobjc.ID command){
			final com.apple.jobjc.Invoke.MsgSend speechRecognizer_didRecognizeCommand_IMetInst = get_speechRecognizer_didRecognizeCommand_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		speechRecognizer_didRecognizeCommand_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, command);
		speechRecognizer_didRecognizeCommand_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend speechSynthesizer_didEncounterErrorAtIndex_ofString_message_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_speechSynthesizer_didEncounterErrorAtIndex_ofString_message_IMetInst(){
		return ((speechSynthesizer_didEncounterErrorAtIndex_ofString_message_IMetInst != null)
	? (speechSynthesizer_didEncounterErrorAtIndex_ofString_message_IMetInst)
	: (speechSynthesizer_didEncounterErrorAtIndex_ofString_message_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "speechSynthesizer:didEncounterErrorAtIndex:ofString:message:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void speechSynthesizer_didEncounterErrorAtIndex_ofString_message(final com.apple.jobjc.appkit.NSSpeechSynthesizer sender, final long characterIndex, final com.apple.jobjc.foundation.NSString string, final com.apple.jobjc.foundation.NSString message){
			final com.apple.jobjc.Invoke.MsgSend speechSynthesizer_didEncounterErrorAtIndex_ofString_message_IMetInst = get_speechSynthesizer_didEncounterErrorAtIndex_ofString_message_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		speechSynthesizer_didEncounterErrorAtIndex_ofString_message_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, characterIndex);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, message);
		speechSynthesizer_didEncounterErrorAtIndex_ofString_message_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend speechSynthesizer_didEncounterSyncMessage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_speechSynthesizer_didEncounterSyncMessage_IMetInst(){
		return ((speechSynthesizer_didEncounterSyncMessage_IMetInst != null)
	? (speechSynthesizer_didEncounterSyncMessage_IMetInst)
	: (speechSynthesizer_didEncounterSyncMessage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "speechSynthesizer:didEncounterSyncMessage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void speechSynthesizer_didEncounterSyncMessage(final com.apple.jobjc.appkit.NSSpeechSynthesizer sender, final com.apple.jobjc.foundation.NSString message){
			final com.apple.jobjc.Invoke.MsgSend speechSynthesizer_didEncounterSyncMessage_IMetInst = get_speechSynthesizer_didEncounterSyncMessage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		speechSynthesizer_didEncounterSyncMessage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, message);
		speechSynthesizer_didEncounterSyncMessage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend speechSynthesizer_didFinishSpeaking_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_speechSynthesizer_didFinishSpeaking_IMetInst(){
		return ((speechSynthesizer_didFinishSpeaking_IMetInst != null)
	? (speechSynthesizer_didFinishSpeaking_IMetInst)
	: (speechSynthesizer_didFinishSpeaking_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "speechSynthesizer:didFinishSpeaking:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void speechSynthesizer_didFinishSpeaking(final com.apple.jobjc.appkit.NSSpeechSynthesizer sender, final boolean finishedSpeaking){
			final com.apple.jobjc.Invoke.MsgSend speechSynthesizer_didFinishSpeaking_IMetInst = get_speechSynthesizer_didFinishSpeaking_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		speechSynthesizer_didFinishSpeaking_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, finishedSpeaking);
		speechSynthesizer_didFinishSpeaking_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend speechSynthesizer_willSpeakPhoneme_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_speechSynthesizer_willSpeakPhoneme_IMetInst(){
		return ((speechSynthesizer_willSpeakPhoneme_IMetInst != null)
	? (speechSynthesizer_willSpeakPhoneme_IMetInst)
	: (speechSynthesizer_willSpeakPhoneme_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "speechSynthesizer:willSpeakPhoneme:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SShortCoder.INST)));
	}

	 public void speechSynthesizer_willSpeakPhoneme(final com.apple.jobjc.appkit.NSSpeechSynthesizer sender, final short phonemeOpcode){
			final com.apple.jobjc.Invoke.MsgSend speechSynthesizer_willSpeakPhoneme_IMetInst = get_speechSynthesizer_willSpeakPhoneme_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		speechSynthesizer_willSpeakPhoneme_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.PrimitiveCoder.SShortCoder.INST.push(nativeBuffer, phonemeOpcode);
		speechSynthesizer_willSpeakPhoneme_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend speechSynthesizer_willSpeakWord_ofString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_speechSynthesizer_willSpeakWord_ofString_IMetInst(){
		return ((speechSynthesizer_willSpeakWord_ofString_IMetInst != null)
	? (speechSynthesizer_willSpeakWord_ofString_IMetInst)
	: (speechSynthesizer_willSpeakWord_ofString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "speechSynthesizer:willSpeakWord:ofString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void speechSynthesizer_willSpeakWord_ofString(final com.apple.jobjc.appkit.NSSpeechSynthesizer sender, final com.apple.jobjc.foundation.NSRange characterRange, final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend speechSynthesizer_willSpeakWord_ofString_IMetInst = get_speechSynthesizer_willSpeakWord_ofString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		speechSynthesizer_willSpeakWord_ofString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, characterRange);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		speechSynthesizer_willSpeakWord_ofString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend splitView_additionalEffectiveRectOfDividerAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_splitView_additionalEffectiveRectOfDividerAtIndex_IMetInst(){
		return ((splitView_additionalEffectiveRectOfDividerAtIndex_IMetInst != null)
	? (splitView_additionalEffectiveRectOfDividerAtIndex_IMetInst)
	: (splitView_additionalEffectiveRectOfDividerAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "splitView:additionalEffectiveRectOfDividerAtIndex:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect splitView_additionalEffectiveRectOfDividerAtIndex(final com.apple.jobjc.appkit.NSSplitView splitView, final long dividerIndex){
			final com.apple.jobjc.Invoke.MsgSend splitView_additionalEffectiveRectOfDividerAtIndex_IMetInst = get_splitView_additionalEffectiveRectOfDividerAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		splitView_additionalEffectiveRectOfDividerAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, splitView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, dividerIndex);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		splitView_additionalEffectiveRectOfDividerAtIndex_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend splitView_canCollapseSubview_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_splitView_canCollapseSubview_IMetInst(){
		return ((splitView_canCollapseSubview_IMetInst != null)
	? (splitView_canCollapseSubview_IMetInst)
	: (splitView_canCollapseSubview_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "splitView:canCollapseSubview:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean splitView_canCollapseSubview(final com.apple.jobjc.appkit.NSSplitView splitView, final com.apple.jobjc.appkit.NSView subview){
			final com.apple.jobjc.Invoke.MsgSend splitView_canCollapseSubview_IMetInst = get_splitView_canCollapseSubview_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		splitView_canCollapseSubview_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, splitView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subview);
		splitView_canCollapseSubview_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend splitView_constrainMaxCoordinate_ofSubviewAt_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_splitView_constrainMaxCoordinate_ofSubviewAt_IMetInst(){
		return ((splitView_constrainMaxCoordinate_ofSubviewAt_IMetInst != null)
	? (splitView_constrainMaxCoordinate_ofSubviewAt_IMetInst)
	: (splitView_constrainMaxCoordinate_ofSubviewAt_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "splitView:constrainMaxCoordinate:ofSubviewAt:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public double splitView_constrainMaxCoordinate_ofSubviewAt(final com.apple.jobjc.appkit.NSSplitView splitView, final double proposedMaximumPosition, final long dividerIndex){
			final com.apple.jobjc.Invoke.MsgSend splitView_constrainMaxCoordinate_ofSubviewAt_IMetInst = get_splitView_constrainMaxCoordinate_ofSubviewAt_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		splitView_constrainMaxCoordinate_ofSubviewAt_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, splitView);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, proposedMaximumPosition);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, dividerIndex);
		splitView_constrainMaxCoordinate_ofSubviewAt_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend splitView_constrainMinCoordinate_ofSubviewAt_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_splitView_constrainMinCoordinate_ofSubviewAt_IMetInst(){
		return ((splitView_constrainMinCoordinate_ofSubviewAt_IMetInst != null)
	? (splitView_constrainMinCoordinate_ofSubviewAt_IMetInst)
	: (splitView_constrainMinCoordinate_ofSubviewAt_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "splitView:constrainMinCoordinate:ofSubviewAt:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public double splitView_constrainMinCoordinate_ofSubviewAt(final com.apple.jobjc.appkit.NSSplitView splitView, final double proposedMinimumPosition, final long dividerIndex){
			final com.apple.jobjc.Invoke.MsgSend splitView_constrainMinCoordinate_ofSubviewAt_IMetInst = get_splitView_constrainMinCoordinate_ofSubviewAt_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		splitView_constrainMinCoordinate_ofSubviewAt_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, splitView);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, proposedMinimumPosition);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, dividerIndex);
		splitView_constrainMinCoordinate_ofSubviewAt_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend splitView_constrainSplitPosition_ofSubviewAt_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_splitView_constrainSplitPosition_ofSubviewAt_IMetInst(){
		return ((splitView_constrainSplitPosition_ofSubviewAt_IMetInst != null)
	? (splitView_constrainSplitPosition_ofSubviewAt_IMetInst)
	: (splitView_constrainSplitPosition_ofSubviewAt_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "splitView:constrainSplitPosition:ofSubviewAt:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public double splitView_constrainSplitPosition_ofSubviewAt(final com.apple.jobjc.appkit.NSSplitView splitView, final double proposedPosition, final long dividerIndex){
			final com.apple.jobjc.Invoke.MsgSend splitView_constrainSplitPosition_ofSubviewAt_IMetInst = get_splitView_constrainSplitPosition_ofSubviewAt_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		splitView_constrainSplitPosition_ofSubviewAt_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, splitView);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, proposedPosition);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, dividerIndex);
		splitView_constrainSplitPosition_ofSubviewAt_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend splitView_effectiveRect_forDrawnRect_ofDividerAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_splitView_effectiveRect_forDrawnRect_ofDividerAtIndex_IMetInst(){
		return ((splitView_effectiveRect_forDrawnRect_ofDividerAtIndex_IMetInst != null)
	? (splitView_effectiveRect_forDrawnRect_ofDividerAtIndex_IMetInst)
	: (splitView_effectiveRect_forDrawnRect_ofDividerAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "splitView:effectiveRect:forDrawnRect:ofDividerAtIndex:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect splitView_effectiveRect_forDrawnRect_ofDividerAtIndex(final com.apple.jobjc.appkit.NSSplitView splitView, final com.apple.jobjc.foundation.NSRect proposedEffectiveRect, final com.apple.jobjc.foundation.NSRect drawnRect, final long dividerIndex){
			final com.apple.jobjc.Invoke.MsgSend splitView_effectiveRect_forDrawnRect_ofDividerAtIndex_IMetInst = get_splitView_effectiveRect_forDrawnRect_ofDividerAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		splitView_effectiveRect_forDrawnRect_ofDividerAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, splitView);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, proposedEffectiveRect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, drawnRect);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, dividerIndex);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		splitView_effectiveRect_forDrawnRect_ofDividerAtIndex_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend splitView_resizeSubviewsWithOldSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_splitView_resizeSubviewsWithOldSize_IMetInst(){
		return ((splitView_resizeSubviewsWithOldSize_IMetInst != null)
	? (splitView_resizeSubviewsWithOldSize_IMetInst)
	: (splitView_resizeSubviewsWithOldSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "splitView:resizeSubviewsWithOldSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void splitView_resizeSubviewsWithOldSize(final com.apple.jobjc.appkit.NSSplitView splitView, final com.apple.jobjc.foundation.NSSize oldSize){
			final com.apple.jobjc.Invoke.MsgSend splitView_resizeSubviewsWithOldSize_IMetInst = get_splitView_resizeSubviewsWithOldSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		splitView_resizeSubviewsWithOldSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, splitView);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, oldSize);
		splitView_resizeSubviewsWithOldSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend splitView_shouldAdjustSizeOfSubview_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_splitView_shouldAdjustSizeOfSubview_IMetInst(){
		return ((splitView_shouldAdjustSizeOfSubview_IMetInst != null)
	? (splitView_shouldAdjustSizeOfSubview_IMetInst)
	: (splitView_shouldAdjustSizeOfSubview_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "splitView:shouldAdjustSizeOfSubview:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean splitView_shouldAdjustSizeOfSubview(final com.apple.jobjc.appkit.NSSplitView splitView, final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend splitView_shouldAdjustSizeOfSubview_IMetInst = get_splitView_shouldAdjustSizeOfSubview_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		splitView_shouldAdjustSizeOfSubview_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, splitView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		splitView_shouldAdjustSizeOfSubview_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend splitView_shouldCollapseSubview_forDoubleClickOnDividerAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_splitView_shouldCollapseSubview_forDoubleClickOnDividerAtIndex_IMetInst(){
		return ((splitView_shouldCollapseSubview_forDoubleClickOnDividerAtIndex_IMetInst != null)
	? (splitView_shouldCollapseSubview_forDoubleClickOnDividerAtIndex_IMetInst)
	: (splitView_shouldCollapseSubview_forDoubleClickOnDividerAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "splitView:shouldCollapseSubview:forDoubleClickOnDividerAtIndex:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean splitView_shouldCollapseSubview_forDoubleClickOnDividerAtIndex(final com.apple.jobjc.appkit.NSSplitView splitView, final com.apple.jobjc.appkit.NSView subview, final long dividerIndex){
			final com.apple.jobjc.Invoke.MsgSend splitView_shouldCollapseSubview_forDoubleClickOnDividerAtIndex_IMetInst = get_splitView_shouldCollapseSubview_forDoubleClickOnDividerAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		splitView_shouldCollapseSubview_forDoubleClickOnDividerAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, splitView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subview);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, dividerIndex);
		splitView_shouldCollapseSubview_forDoubleClickOnDividerAtIndex_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend splitView_shouldHideDividerAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_splitView_shouldHideDividerAtIndex_IMetInst(){
		return ((splitView_shouldHideDividerAtIndex_IMetInst != null)
	? (splitView_shouldHideDividerAtIndex_IMetInst)
	: (splitView_shouldHideDividerAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "splitView:shouldHideDividerAtIndex:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean splitView_shouldHideDividerAtIndex(final com.apple.jobjc.appkit.NSSplitView splitView, final long dividerIndex){
			final com.apple.jobjc.Invoke.MsgSend splitView_shouldHideDividerAtIndex_IMetInst = get_splitView_shouldHideDividerAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		splitView_shouldHideDividerAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, splitView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, dividerIndex);
		splitView_shouldHideDividerAtIndex_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend splitViewDidResizeSubviews_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_splitViewDidResizeSubviews_IMetInst(){
		return ((splitViewDidResizeSubviews_IMetInst != null)
	? (splitViewDidResizeSubviews_IMetInst)
	: (splitViewDidResizeSubviews_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "splitViewDidResizeSubviews:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void splitViewDidResizeSubviews(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend splitViewDidResizeSubviews_IMetInst = get_splitViewDidResizeSubviews_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		splitViewDidResizeSubviews_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		splitViewDidResizeSubviews_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend splitViewWillResizeSubviews_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_splitViewWillResizeSubviews_IMetInst(){
		return ((splitViewWillResizeSubviews_IMetInst != null)
	? (splitViewWillResizeSubviews_IMetInst)
	: (splitViewWillResizeSubviews_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "splitViewWillResizeSubviews:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void splitViewWillResizeSubviews(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend splitViewWillResizeSubviews_IMetInst = get_splitViewWillResizeSubviews_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		splitViewWillResizeSubviews_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		splitViewWillResizeSubviews_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend string_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_string_IMetInst(){
		return ((string_IMetInst != null)
	? (string_IMetInst)
	: (string_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "string", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString string(){
			final com.apple.jobjc.Invoke.MsgSend string_IMetInst = get_string_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		string_IMetInst.init(nativeBuffer, this);
		string_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringAtIndex_effectiveRange_endsWithSearchBoundary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringAtIndex_effectiveRange_endsWithSearchBoundary_IMetInst(){
		return ((stringAtIndex_effectiveRange_endsWithSearchBoundary_IMetInst != null)
	? (stringAtIndex_effectiveRange_endsWithSearchBoundary_IMetInst)
	: (stringAtIndex_effectiveRange_endsWithSearchBoundary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringAtIndex:effectiveRange:endsWithSearchBoundary:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringAtIndex_effectiveRange_endsWithSearchBoundary(final long characterIndex, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ outRange, final com.apple.jobjc.Pointer<java.lang.Boolean> outFlag){
			final com.apple.jobjc.Invoke.MsgSend stringAtIndex_effectiveRange_endsWithSearchBoundary_IMetInst = get_stringAtIndex_effectiveRange_endsWithSearchBoundary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringAtIndex_effectiveRange_endsWithSearchBoundary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, characterIndex);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, outRange);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outFlag);
		stringAtIndex_effectiveRange_endsWithSearchBoundary_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringLength_IMetInst(){
		return ((stringLength_IMetInst != null)
	? (stringLength_IMetInst)
	: (stringLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringLength", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long stringLength(){
			final com.apple.jobjc.Invoke.MsgSend stringLength_IMetInst = get_stringLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringLength_IMetInst.init(nativeBuffer, this);
		stringLength_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend supportsMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_supportsMode_IMetInst(){
		return ((supportsMode_IMetInst != null)
	? (supportsMode_IMetInst)
	: (supportsMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "supportsMode:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean supportsMode(final long mode){
			final com.apple.jobjc.Invoke.MsgSend supportsMode_IMetInst = get_supportsMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		supportsMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, mode);
		supportsMode_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tabView_didSelectTabViewItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tabView_didSelectTabViewItem_IMetInst(){
		return ((tabView_didSelectTabViewItem_IMetInst != null)
	? (tabView_didSelectTabViewItem_IMetInst)
	: (tabView_didSelectTabViewItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tabView:didSelectTabViewItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void tabView_didSelectTabViewItem(final com.apple.jobjc.appkit.NSTabView tabView, final com.apple.jobjc.appkit.NSTabViewItem tabViewItem){
			final com.apple.jobjc.Invoke.MsgSend tabView_didSelectTabViewItem_IMetInst = get_tabView_didSelectTabViewItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tabView_didSelectTabViewItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tabView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tabViewItem);
		tabView_didSelectTabViewItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tabView_shouldSelectTabViewItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tabView_shouldSelectTabViewItem_IMetInst(){
		return ((tabView_shouldSelectTabViewItem_IMetInst != null)
	? (tabView_shouldSelectTabViewItem_IMetInst)
	: (tabView_shouldSelectTabViewItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tabView:shouldSelectTabViewItem:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean tabView_shouldSelectTabViewItem(final com.apple.jobjc.appkit.NSTabView tabView, final com.apple.jobjc.appkit.NSTabViewItem tabViewItem){
			final com.apple.jobjc.Invoke.MsgSend tabView_shouldSelectTabViewItem_IMetInst = get_tabView_shouldSelectTabViewItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tabView_shouldSelectTabViewItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tabView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tabViewItem);
		tabView_shouldSelectTabViewItem_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tabView_willSelectTabViewItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tabView_willSelectTabViewItem_IMetInst(){
		return ((tabView_willSelectTabViewItem_IMetInst != null)
	? (tabView_willSelectTabViewItem_IMetInst)
	: (tabView_willSelectTabViewItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tabView:willSelectTabViewItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void tabView_willSelectTabViewItem(final com.apple.jobjc.appkit.NSTabView tabView, final com.apple.jobjc.appkit.NSTabViewItem tabViewItem){
			final com.apple.jobjc.Invoke.MsgSend tabView_willSelectTabViewItem_IMetInst = get_tabView_willSelectTabViewItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tabView_willSelectTabViewItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tabView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tabViewItem);
		tabView_willSelectTabViewItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tabViewDidChangeNumberOfTabViewItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tabViewDidChangeNumberOfTabViewItems_IMetInst(){
		return ((tabViewDidChangeNumberOfTabViewItems_IMetInst != null)
	? (tabViewDidChangeNumberOfTabViewItems_IMetInst)
	: (tabViewDidChangeNumberOfTabViewItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tabViewDidChangeNumberOfTabViewItems:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void tabViewDidChangeNumberOfTabViewItems(final com.apple.jobjc.appkit.NSTabView tabView){
			final com.apple.jobjc.Invoke.MsgSend tabViewDidChangeNumberOfTabViewItems_IMetInst = get_tabViewDidChangeNumberOfTabViewItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tabViewDidChangeNumberOfTabViewItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tabView);
		tabViewDidChangeNumberOfTabViewItems_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_acceptDrop_row_dropOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_acceptDrop_row_dropOperation_IMetInst(){
		return ((tableView_acceptDrop_row_dropOperation_IMetInst != null)
	? (tableView_acceptDrop_row_dropOperation_IMetInst)
	: (tableView_acceptDrop_row_dropOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:acceptDrop:row:dropOperation:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean tableView_acceptDrop_row_dropOperation(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.ID info, final long row, final long dropOperation){
			final com.apple.jobjc.Invoke.MsgSend tableView_acceptDrop_row_dropOperation_IMetInst = get_tableView_acceptDrop_row_dropOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_acceptDrop_row_dropOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, info);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, dropOperation);
		tableView_acceptDrop_row_dropOperation_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_dataCellForTableColumn_row_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_dataCellForTableColumn_row_IMetInst(){
		return ((tableView_dataCellForTableColumn_row_IMetInst != null)
	? (tableView_dataCellForTableColumn_row_IMetInst)
	: (tableView_dataCellForTableColumn_row_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:dataCellForTableColumn:row:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSCell tableView_dataCellForTableColumn_row(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final long row){
			final com.apple.jobjc.Invoke.MsgSend tableView_dataCellForTableColumn_row_IMetInst = get_tableView_dataCellForTableColumn_row_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_dataCellForTableColumn_row_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		tableView_dataCellForTableColumn_row_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCell returnValue = (com.apple.jobjc.appkit.NSCell) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_didAddRowView_forRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_didAddRowView_forRow_IMetInst(){
		return ((tableView_didAddRowView_forRow_IMetInst != null)
	? (tableView_didAddRowView_forRow_IMetInst)
	: (tableView_didAddRowView_forRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:didAddRowView:forRow:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void tableView_didAddRowView_forRow(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.appkit.NSTableRowView rowView, final long row){
			final com.apple.jobjc.Invoke.MsgSend tableView_didAddRowView_forRow_IMetInst = get_tableView_didAddRowView_forRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_didAddRowView_forRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rowView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		tableView_didAddRowView_forRow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_didClickTableColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_didClickTableColumn_IMetInst(){
		return ((tableView_didClickTableColumn_IMetInst != null)
	? (tableView_didClickTableColumn_IMetInst)
	: (tableView_didClickTableColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:didClickTableColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void tableView_didClickTableColumn(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.appkit.NSTableColumn tableColumn){
			final com.apple.jobjc.Invoke.MsgSend tableView_didClickTableColumn_IMetInst = get_tableView_didClickTableColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_didClickTableColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		tableView_didClickTableColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_didDragTableColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_didDragTableColumn_IMetInst(){
		return ((tableView_didDragTableColumn_IMetInst != null)
	? (tableView_didDragTableColumn_IMetInst)
	: (tableView_didDragTableColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:didDragTableColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void tableView_didDragTableColumn(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.appkit.NSTableColumn tableColumn){
			final com.apple.jobjc.Invoke.MsgSend tableView_didDragTableColumn_IMetInst = get_tableView_didDragTableColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_didDragTableColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		tableView_didDragTableColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_didRemoveRowView_forRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_didRemoveRowView_forRow_IMetInst(){
		return ((tableView_didRemoveRowView_forRow_IMetInst != null)
	? (tableView_didRemoveRowView_forRow_IMetInst)
	: (tableView_didRemoveRowView_forRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:didRemoveRowView:forRow:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void tableView_didRemoveRowView_forRow(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.appkit.NSTableRowView rowView, final long row){
			final com.apple.jobjc.Invoke.MsgSend tableView_didRemoveRowView_forRow_IMetInst = get_tableView_didRemoveRowView_forRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_didRemoveRowView_forRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rowView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		tableView_didRemoveRowView_forRow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_draggingSession_endedAtPoint_operation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_draggingSession_endedAtPoint_operation_IMetInst(){
		return ((tableView_draggingSession_endedAtPoint_operation_IMetInst != null)
	? (tableView_draggingSession_endedAtPoint_operation_IMetInst)
	: (tableView_draggingSession_endedAtPoint_operation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:draggingSession:endedAtPoint:operation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void tableView_draggingSession_endedAtPoint_operation(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.appkit.NSDraggingSession session, final com.apple.jobjc.foundation.NSPoint screenPoint, final long operation){
			final com.apple.jobjc.Invoke.MsgSend tableView_draggingSession_endedAtPoint_operation_IMetInst = get_tableView_draggingSession_endedAtPoint_operation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_draggingSession_endedAtPoint_operation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, session);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, screenPoint);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, operation);
		tableView_draggingSession_endedAtPoint_operation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_draggingSession_willBeginAtPoint_forRowIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_draggingSession_willBeginAtPoint_forRowIndexes_IMetInst(){
		return ((tableView_draggingSession_willBeginAtPoint_forRowIndexes_IMetInst != null)
	? (tableView_draggingSession_willBeginAtPoint_forRowIndexes_IMetInst)
	: (tableView_draggingSession_willBeginAtPoint_forRowIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:draggingSession:willBeginAtPoint:forRowIndexes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void tableView_draggingSession_willBeginAtPoint_forRowIndexes(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.appkit.NSDraggingSession session, final com.apple.jobjc.foundation.NSPoint screenPoint, final com.apple.jobjc.foundation.NSIndexSet rowIndexes){
			final com.apple.jobjc.Invoke.MsgSend tableView_draggingSession_willBeginAtPoint_forRowIndexes_IMetInst = get_tableView_draggingSession_willBeginAtPoint_forRowIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_draggingSession_willBeginAtPoint_forRowIndexes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, session);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, screenPoint);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rowIndexes);
		tableView_draggingSession_willBeginAtPoint_forRowIndexes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_heightOfRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_heightOfRow_IMetInst(){
		return ((tableView_heightOfRow_IMetInst != null)
	? (tableView_heightOfRow_IMetInst)
	: (tableView_heightOfRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:heightOfRow:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public double tableView_heightOfRow(final com.apple.jobjc.appkit.NSTableView tableView, final long row){
			final com.apple.jobjc.Invoke.MsgSend tableView_heightOfRow_IMetInst = get_tableView_heightOfRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_heightOfRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		tableView_heightOfRow_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_isGroupRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_isGroupRow_IMetInst(){
		return ((tableView_isGroupRow_IMetInst != null)
	? (tableView_isGroupRow_IMetInst)
	: (tableView_isGroupRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:isGroupRow:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean tableView_isGroupRow(final com.apple.jobjc.appkit.NSTableView tableView, final long row){
			final com.apple.jobjc.Invoke.MsgSend tableView_isGroupRow_IMetInst = get_tableView_isGroupRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_isGroupRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		tableView_isGroupRow_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_mouseDownInHeaderOfTableColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_mouseDownInHeaderOfTableColumn_IMetInst(){
		return ((tableView_mouseDownInHeaderOfTableColumn_IMetInst != null)
	? (tableView_mouseDownInHeaderOfTableColumn_IMetInst)
	: (tableView_mouseDownInHeaderOfTableColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:mouseDownInHeaderOfTableColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void tableView_mouseDownInHeaderOfTableColumn(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.appkit.NSTableColumn tableColumn){
			final com.apple.jobjc.Invoke.MsgSend tableView_mouseDownInHeaderOfTableColumn_IMetInst = get_tableView_mouseDownInHeaderOfTableColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_mouseDownInHeaderOfTableColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		tableView_mouseDownInHeaderOfTableColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_IMetInst(){
		return ((tableView_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_IMetInst != null)
	? (tableView_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_IMetInst)
	: (tableView_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:namesOfPromisedFilesDroppedAtDestination:forDraggedRowsWithIndexes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray tableView_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.foundation.NSURL dropDestination, final com.apple.jobjc.foundation.NSIndexSet indexSet){
			final com.apple.jobjc.Invoke.MsgSend tableView_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_IMetInst = get_tableView_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dropDestination);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexSet);
		tableView_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_nextTypeSelectMatchFromRow_toRow_forString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_nextTypeSelectMatchFromRow_toRow_forString_IMetInst(){
		return ((tableView_nextTypeSelectMatchFromRow_toRow_forString_IMetInst != null)
	? (tableView_nextTypeSelectMatchFromRow_toRow_forString_IMetInst)
	: (tableView_nextTypeSelectMatchFromRow_toRow_forString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:nextTypeSelectMatchFromRow:toRow:forString:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long tableView_nextTypeSelectMatchFromRow_toRow_forString(final com.apple.jobjc.appkit.NSTableView tableView, final long startRow, final long endRow, final com.apple.jobjc.foundation.NSString searchString){
			final com.apple.jobjc.Invoke.MsgSend tableView_nextTypeSelectMatchFromRow_toRow_forString_IMetInst = get_tableView_nextTypeSelectMatchFromRow_toRow_forString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_nextTypeSelectMatchFromRow_toRow_forString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, startRow);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, endRow);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, searchString);
		tableView_nextTypeSelectMatchFromRow_toRow_forString_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_objectValueForTableColumn_row_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_objectValueForTableColumn_row_IMetInst(){
		return ((tableView_objectValueForTableColumn_row_IMetInst != null)
	? (tableView_objectValueForTableColumn_row_IMetInst)
	: (tableView_objectValueForTableColumn_row_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:objectValueForTableColumn:row:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T tableView_objectValueForTableColumn_row(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final long row){
			final com.apple.jobjc.Invoke.MsgSend tableView_objectValueForTableColumn_row_IMetInst = get_tableView_objectValueForTableColumn_row_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_objectValueForTableColumn_row_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		tableView_objectValueForTableColumn_row_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_pasteboardWriterForRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_pasteboardWriterForRow_IMetInst(){
		return ((tableView_pasteboardWriterForRow_IMetInst != null)
	? (tableView_pasteboardWriterForRow_IMetInst)
	: (tableView_pasteboardWriterForRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:pasteboardWriterForRow:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T tableView_pasteboardWriterForRow(final com.apple.jobjc.appkit.NSTableView tableView, final long row){
			final com.apple.jobjc.Invoke.MsgSend tableView_pasteboardWriterForRow_IMetInst = get_tableView_pasteboardWriterForRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_pasteboardWriterForRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		tableView_pasteboardWriterForRow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_rowViewForRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_rowViewForRow_IMetInst(){
		return ((tableView_rowViewForRow_IMetInst != null)
	? (tableView_rowViewForRow_IMetInst)
	: (tableView_rowViewForRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:rowViewForRow:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSTableRowView tableView_rowViewForRow(final com.apple.jobjc.appkit.NSTableView tableView, final long row){
			final com.apple.jobjc.Invoke.MsgSend tableView_rowViewForRow_IMetInst = get_tableView_rowViewForRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_rowViewForRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		tableView_rowViewForRow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTableRowView returnValue = (com.apple.jobjc.appkit.NSTableRowView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_selectionIndexesForProposedSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_selectionIndexesForProposedSelection_IMetInst(){
		return ((tableView_selectionIndexesForProposedSelection_IMetInst != null)
	? (tableView_selectionIndexesForProposedSelection_IMetInst)
	: (tableView_selectionIndexesForProposedSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:selectionIndexesForProposedSelection:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSIndexSet tableView_selectionIndexesForProposedSelection(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.foundation.NSIndexSet proposedSelectionIndexes){
			final com.apple.jobjc.Invoke.MsgSend tableView_selectionIndexesForProposedSelection_IMetInst = get_tableView_selectionIndexesForProposedSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_selectionIndexesForProposedSelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, proposedSelectionIndexes);
		tableView_selectionIndexesForProposedSelection_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexSet returnValue = (com.apple.jobjc.foundation.NSIndexSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_setObjectValue_forTableColumn_row_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_setObjectValue_forTableColumn_row_IMetInst(){
		return ((tableView_setObjectValue_forTableColumn_row_IMetInst != null)
	? (tableView_setObjectValue_forTableColumn_row_IMetInst)
	: (tableView_setObjectValue_forTableColumn_row_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:setObjectValue:forTableColumn:row:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void tableView_setObjectValue_forTableColumn_row(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.ID object, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final long row){
			final com.apple.jobjc.Invoke.MsgSend tableView_setObjectValue_forTableColumn_row_IMetInst = get_tableView_setObjectValue_forTableColumn_row_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_setObjectValue_forTableColumn_row_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		tableView_setObjectValue_forTableColumn_row_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_shouldEditTableColumn_row_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_shouldEditTableColumn_row_IMetInst(){
		return ((tableView_shouldEditTableColumn_row_IMetInst != null)
	? (tableView_shouldEditTableColumn_row_IMetInst)
	: (tableView_shouldEditTableColumn_row_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:shouldEditTableColumn:row:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean tableView_shouldEditTableColumn_row(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final long row){
			final com.apple.jobjc.Invoke.MsgSend tableView_shouldEditTableColumn_row_IMetInst = get_tableView_shouldEditTableColumn_row_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_shouldEditTableColumn_row_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		tableView_shouldEditTableColumn_row_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_shouldReorderColumn_toColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_shouldReorderColumn_toColumn_IMetInst(){
		return ((tableView_shouldReorderColumn_toColumn_IMetInst != null)
	? (tableView_shouldReorderColumn_toColumn_IMetInst)
	: (tableView_shouldReorderColumn_toColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:shouldReorderColumn:toColumn:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean tableView_shouldReorderColumn_toColumn(final com.apple.jobjc.appkit.NSTableView tableView, final long columnIndex, final long newColumnIndex){
			final com.apple.jobjc.Invoke.MsgSend tableView_shouldReorderColumn_toColumn_IMetInst = get_tableView_shouldReorderColumn_toColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_shouldReorderColumn_toColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, columnIndex);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, newColumnIndex);
		tableView_shouldReorderColumn_toColumn_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_shouldSelectRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_shouldSelectRow_IMetInst(){
		return ((tableView_shouldSelectRow_IMetInst != null)
	? (tableView_shouldSelectRow_IMetInst)
	: (tableView_shouldSelectRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:shouldSelectRow:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean tableView_shouldSelectRow(final com.apple.jobjc.appkit.NSTableView tableView, final long row){
			final com.apple.jobjc.Invoke.MsgSend tableView_shouldSelectRow_IMetInst = get_tableView_shouldSelectRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_shouldSelectRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		tableView_shouldSelectRow_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_shouldSelectTableColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_shouldSelectTableColumn_IMetInst(){
		return ((tableView_shouldSelectTableColumn_IMetInst != null)
	? (tableView_shouldSelectTableColumn_IMetInst)
	: (tableView_shouldSelectTableColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:shouldSelectTableColumn:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean tableView_shouldSelectTableColumn(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.appkit.NSTableColumn tableColumn){
			final com.apple.jobjc.Invoke.MsgSend tableView_shouldSelectTableColumn_IMetInst = get_tableView_shouldSelectTableColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_shouldSelectTableColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		tableView_shouldSelectTableColumn_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_shouldShowCellExpansionForTableColumn_row_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_shouldShowCellExpansionForTableColumn_row_IMetInst(){
		return ((tableView_shouldShowCellExpansionForTableColumn_row_IMetInst != null)
	? (tableView_shouldShowCellExpansionForTableColumn_row_IMetInst)
	: (tableView_shouldShowCellExpansionForTableColumn_row_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:shouldShowCellExpansionForTableColumn:row:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean tableView_shouldShowCellExpansionForTableColumn_row(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final long row){
			final com.apple.jobjc.Invoke.MsgSend tableView_shouldShowCellExpansionForTableColumn_row_IMetInst = get_tableView_shouldShowCellExpansionForTableColumn_row_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_shouldShowCellExpansionForTableColumn_row_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		tableView_shouldShowCellExpansionForTableColumn_row_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_shouldTrackCell_forTableColumn_row_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_shouldTrackCell_forTableColumn_row_IMetInst(){
		return ((tableView_shouldTrackCell_forTableColumn_row_IMetInst != null)
	? (tableView_shouldTrackCell_forTableColumn_row_IMetInst)
	: (tableView_shouldTrackCell_forTableColumn_row_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:shouldTrackCell:forTableColumn:row:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean tableView_shouldTrackCell_forTableColumn_row(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.appkit.NSCell cell, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final long row){
			final com.apple.jobjc.Invoke.MsgSend tableView_shouldTrackCell_forTableColumn_row_IMetInst = get_tableView_shouldTrackCell_forTableColumn_row_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_shouldTrackCell_forTableColumn_row_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		tableView_shouldTrackCell_forTableColumn_row_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst(){
		return ((tableView_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst != null)
	? (tableView_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst)
	: (tableView_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:shouldTypeSelectForEvent:withCurrentSearchString:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean tableView_shouldTypeSelectForEvent_withCurrentSearchString(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.appkit.NSEvent event, final com.apple.jobjc.foundation.NSString searchString){
			final com.apple.jobjc.Invoke.MsgSend tableView_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst = get_tableView_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, searchString);
		tableView_shouldTypeSelectForEvent_withCurrentSearchString_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_sizeToFitWidthOfColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_sizeToFitWidthOfColumn_IMetInst(){
		return ((tableView_sizeToFitWidthOfColumn_IMetInst != null)
	? (tableView_sizeToFitWidthOfColumn_IMetInst)
	: (tableView_sizeToFitWidthOfColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:sizeToFitWidthOfColumn:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public double tableView_sizeToFitWidthOfColumn(final com.apple.jobjc.appkit.NSTableView tableView, final long column){
			final com.apple.jobjc.Invoke.MsgSend tableView_sizeToFitWidthOfColumn_IMetInst = get_tableView_sizeToFitWidthOfColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_sizeToFitWidthOfColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		tableView_sizeToFitWidthOfColumn_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_sortDescriptorsDidChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_sortDescriptorsDidChange_IMetInst(){
		return ((tableView_sortDescriptorsDidChange_IMetInst != null)
	? (tableView_sortDescriptorsDidChange_IMetInst)
	: (tableView_sortDescriptorsDidChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:sortDescriptorsDidChange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void tableView_sortDescriptorsDidChange(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.foundation.NSArray oldDescriptors){
			final com.apple.jobjc.Invoke.MsgSend tableView_sortDescriptorsDidChange_IMetInst = get_tableView_sortDescriptorsDidChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_sortDescriptorsDidChange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, oldDescriptors);
		tableView_sortDescriptorsDidChange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_toolTipForCell_rect_tableColumn_row_mouseLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_toolTipForCell_rect_tableColumn_row_mouseLocation_IMetInst(){
		return ((tableView_toolTipForCell_rect_tableColumn_row_mouseLocation_IMetInst != null)
	? (tableView_toolTipForCell_rect_tableColumn_row_mouseLocation_IMetInst)
	: (tableView_toolTipForCell_rect_tableColumn_row_mouseLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:toolTipForCell:rect:tableColumn:row:mouseLocation:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSString tableView_toolTipForCell_rect_tableColumn_row_mouseLocation(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.appkit.NSCell cell, final Object /* NSRectPointer (^{_NSRect={_NSPoint=ff}{_NSSize=ff}}, ^{CGRect={CGPoint=dd}{CGSize=dd}}) */ rect, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final long row, final com.apple.jobjc.foundation.NSPoint mouseLocation){
			final com.apple.jobjc.Invoke.MsgSend tableView_toolTipForCell_rect_tableColumn_row_mouseLocation_IMetInst = get_tableView_toolTipForCell_rect_tableColumn_row_mouseLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_toolTipForCell_rect_tableColumn_row_mouseLocation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, mouseLocation);
		tableView_toolTipForCell_rect_tableColumn_row_mouseLocation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_typeSelectStringForTableColumn_row_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_typeSelectStringForTableColumn_row_IMetInst(){
		return ((tableView_typeSelectStringForTableColumn_row_IMetInst != null)
	? (tableView_typeSelectStringForTableColumn_row_IMetInst)
	: (tableView_typeSelectStringForTableColumn_row_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:typeSelectStringForTableColumn:row:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString tableView_typeSelectStringForTableColumn_row(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final long row){
			final com.apple.jobjc.Invoke.MsgSend tableView_typeSelectStringForTableColumn_row_IMetInst = get_tableView_typeSelectStringForTableColumn_row_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_typeSelectStringForTableColumn_row_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		tableView_typeSelectStringForTableColumn_row_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_updateDraggingItemsForDrag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_updateDraggingItemsForDrag_IMetInst(){
		return ((tableView_updateDraggingItemsForDrag_IMetInst != null)
	? (tableView_updateDraggingItemsForDrag_IMetInst)
	: (tableView_updateDraggingItemsForDrag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:updateDraggingItemsForDrag:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void tableView_updateDraggingItemsForDrag(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.ID draggingInfo){
			final com.apple.jobjc.Invoke.MsgSend tableView_updateDraggingItemsForDrag_IMetInst = get_tableView_updateDraggingItemsForDrag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_updateDraggingItemsForDrag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, draggingInfo);
		tableView_updateDraggingItemsForDrag_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_validateDrop_proposedRow_proposedDropOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_validateDrop_proposedRow_proposedDropOperation_IMetInst(){
		return ((tableView_validateDrop_proposedRow_proposedDropOperation_IMetInst != null)
	? (tableView_validateDrop_proposedRow_proposedDropOperation_IMetInst)
	: (tableView_validateDrop_proposedRow_proposedDropOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:validateDrop:proposedRow:proposedDropOperation:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long tableView_validateDrop_proposedRow_proposedDropOperation(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.ID info, final long row, final long dropOperation){
			final com.apple.jobjc.Invoke.MsgSend tableView_validateDrop_proposedRow_proposedDropOperation_IMetInst = get_tableView_validateDrop_proposedRow_proposedDropOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_validateDrop_proposedRow_proposedDropOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, info);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, dropOperation);
		tableView_validateDrop_proposedRow_proposedDropOperation_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_viewForTableColumn_row_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_viewForTableColumn_row_IMetInst(){
		return ((tableView_viewForTableColumn_row_IMetInst != null)
	? (tableView_viewForTableColumn_row_IMetInst)
	: (tableView_viewForTableColumn_row_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:viewForTableColumn:row:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSView tableView_viewForTableColumn_row(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final long row){
			final com.apple.jobjc.Invoke.MsgSend tableView_viewForTableColumn_row_IMetInst = get_tableView_viewForTableColumn_row_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_viewForTableColumn_row_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		tableView_viewForTableColumn_row_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_willDisplayCell_forTableColumn_row_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_willDisplayCell_forTableColumn_row_IMetInst(){
		return ((tableView_willDisplayCell_forTableColumn_row_IMetInst != null)
	? (tableView_willDisplayCell_forTableColumn_row_IMetInst)
	: (tableView_willDisplayCell_forTableColumn_row_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:willDisplayCell:forTableColumn:row:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void tableView_willDisplayCell_forTableColumn_row(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.ID cell, final com.apple.jobjc.appkit.NSTableColumn tableColumn, final long row){
			final com.apple.jobjc.Invoke.MsgSend tableView_willDisplayCell_forTableColumn_row_IMetInst = get_tableView_willDisplayCell_forTableColumn_row_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_willDisplayCell_forTableColumn_row_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		tableView_willDisplayCell_forTableColumn_row_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_writeRows_toPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_writeRows_toPasteboard_IMetInst(){
		return ((tableView_writeRows_toPasteboard_IMetInst != null)
	? (tableView_writeRows_toPasteboard_IMetInst)
	: (tableView_writeRows_toPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:writeRows:toPasteboard:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean tableView_writeRows_toPasteboard(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.foundation.NSArray rows, final com.apple.jobjc.appkit.NSPasteboard pboard){
			final com.apple.jobjc.Invoke.MsgSend tableView_writeRows_toPasteboard_IMetInst = get_tableView_writeRows_toPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_writeRows_toPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rows);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pboard);
		tableView_writeRows_toPasteboard_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_writeRowsWithIndexes_toPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_writeRowsWithIndexes_toPasteboard_IMetInst(){
		return ((tableView_writeRowsWithIndexes_toPasteboard_IMetInst != null)
	? (tableView_writeRowsWithIndexes_toPasteboard_IMetInst)
	: (tableView_writeRowsWithIndexes_toPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView:writeRowsWithIndexes:toPasteboard:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean tableView_writeRowsWithIndexes_toPasteboard(final com.apple.jobjc.appkit.NSTableView tableView, final com.apple.jobjc.foundation.NSIndexSet rowIndexes, final com.apple.jobjc.appkit.NSPasteboard pboard){
			final com.apple.jobjc.Invoke.MsgSend tableView_writeRowsWithIndexes_toPasteboard_IMetInst = get_tableView_writeRowsWithIndexes_toPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_writeRowsWithIndexes_toPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rowIndexes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pboard);
		tableView_writeRowsWithIndexes_toPasteboard_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableViewColumnDidMove_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableViewColumnDidMove_IMetInst(){
		return ((tableViewColumnDidMove_IMetInst != null)
	? (tableViewColumnDidMove_IMetInst)
	: (tableViewColumnDidMove_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableViewColumnDidMove:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void tableViewColumnDidMove(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend tableViewColumnDidMove_IMetInst = get_tableViewColumnDidMove_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableViewColumnDidMove_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		tableViewColumnDidMove_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tableViewColumnDidResize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableViewColumnDidResize_IMetInst(){
		return ((tableViewColumnDidResize_IMetInst != null)
	? (tableViewColumnDidResize_IMetInst)
	: (tableViewColumnDidResize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableViewColumnDidResize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void tableViewColumnDidResize(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend tableViewColumnDidResize_IMetInst = get_tableViewColumnDidResize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableViewColumnDidResize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		tableViewColumnDidResize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tableViewSelectionDidChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableViewSelectionDidChange_IMetInst(){
		return ((tableViewSelectionDidChange_IMetInst != null)
	? (tableViewSelectionDidChange_IMetInst)
	: (tableViewSelectionDidChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableViewSelectionDidChange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void tableViewSelectionDidChange(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend tableViewSelectionDidChange_IMetInst = get_tableViewSelectionDidChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableViewSelectionDidChange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		tableViewSelectionDidChange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tableViewSelectionIsChanging_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableViewSelectionIsChanging_IMetInst(){
		return ((tableViewSelectionIsChanging_IMetInst != null)
	? (tableViewSelectionIsChanging_IMetInst)
	: (tableViewSelectionIsChanging_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableViewSelectionIsChanging:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void tableViewSelectionIsChanging(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend tableViewSelectionIsChanging_IMetInst = get_tableViewSelectionIsChanging_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableViewSelectionIsChanging_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		tableViewSelectionIsChanging_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tag_IMetInst(){
		return ((tag_IMetInst != null)
	? (tag_IMetInst)
	: (tag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tag", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long tag(){
			final com.apple.jobjc.Invoke.MsgSend tag_IMetInst = get_tag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tag_IMetInst.init(nativeBuffer, this);
		tag_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend terminate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_terminate_IMetInst(){
		return ((terminate_IMetInst != null)
	? (terminate_IMetInst)
	: (terminate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "terminate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void terminate(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend terminate_IMetInst = get_terminate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		terminate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		terminate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textDidBeginEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textDidBeginEditing_IMetInst(){
		return ((textDidBeginEditing_IMetInst != null)
	? (textDidBeginEditing_IMetInst)
	: (textDidBeginEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textDidBeginEditing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void textDidBeginEditing(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend textDidBeginEditing_IMetInst = get_textDidBeginEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textDidBeginEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		textDidBeginEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textDidChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textDidChange_IMetInst(){
		return ((textDidChange_IMetInst != null)
	? (textDidChange_IMetInst)
	: (textDidChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textDidChange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void textDidChange(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend textDidChange_IMetInst = get_textDidChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textDidChange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		textDidChange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textDidEndEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textDidEndEditing_IMetInst(){
		return ((textDidEndEditing_IMetInst != null)
	? (textDidEndEditing_IMetInst)
	: (textDidEndEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textDidEndEditing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void textDidEndEditing(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend textDidEndEditing_IMetInst = get_textDidEndEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textDidEndEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		textDidEndEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textShouldBeginEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textShouldBeginEditing_IMetInst(){
		return ((textShouldBeginEditing_IMetInst != null)
	? (textShouldBeginEditing_IMetInst)
	: (textShouldBeginEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textShouldBeginEditing:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean textShouldBeginEditing(final com.apple.jobjc.appkit.NSText textObject){
			final com.apple.jobjc.Invoke.MsgSend textShouldBeginEditing_IMetInst = get_textShouldBeginEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textShouldBeginEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textObject);
		textShouldBeginEditing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textShouldEndEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textShouldEndEditing_IMetInst(){
		return ((textShouldEndEditing_IMetInst != null)
	? (textShouldEndEditing_IMetInst)
	: (textShouldEndEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textShouldEndEditing:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean textShouldEndEditing(final com.apple.jobjc.appkit.NSText textObject){
			final com.apple.jobjc.Invoke.MsgSend textShouldEndEditing_IMetInst = get_textShouldEndEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textShouldEndEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textObject);
		textShouldEndEditing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textStorageDidProcessEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textStorageDidProcessEditing_IMetInst(){
		return ((textStorageDidProcessEditing_IMetInst != null)
	? (textStorageDidProcessEditing_IMetInst)
	: (textStorageDidProcessEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textStorageDidProcessEditing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void textStorageDidProcessEditing(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend textStorageDidProcessEditing_IMetInst = get_textStorageDidProcessEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textStorageDidProcessEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		textStorageDidProcessEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textStorageWillProcessEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textStorageWillProcessEditing_IMetInst(){
		return ((textStorageWillProcessEditing_IMetInst != null)
	? (textStorageWillProcessEditing_IMetInst)
	: (textStorageWillProcessEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textStorageWillProcessEditing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void textStorageWillProcessEditing(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend textStorageWillProcessEditing_IMetInst = get_textStorageWillProcessEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textStorageWillProcessEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		textStorageWillProcessEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_URLForContentsOfTextAttachment_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_URLForContentsOfTextAttachment_atIndex_IMetInst(){
		return ((textView_URLForContentsOfTextAttachment_atIndex_IMetInst != null)
	? (textView_URLForContentsOfTextAttachment_atIndex_IMetInst)
	: (textView_URLForContentsOfTextAttachment_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:URLForContentsOfTextAttachment:atIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSURL textView_URLForContentsOfTextAttachment_atIndex(final com.apple.jobjc.appkit.NSTextView textView, final com.apple.jobjc.appkit.NSTextAttachment textAttachment, final long charIndex){
			final com.apple.jobjc.Invoke.MsgSend textView_URLForContentsOfTextAttachment_atIndex_IMetInst = get_textView_URLForContentsOfTextAttachment_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_URLForContentsOfTextAttachment_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textAttachment);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		textView_URLForContentsOfTextAttachment_atIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_clickedOnCell_inRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_clickedOnCell_inRect_IMetInst(){
		return ((textView_clickedOnCell_inRect_IMetInst != null)
	? (textView_clickedOnCell_inRect_IMetInst)
	: (textView_clickedOnCell_inRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:clickedOnCell:inRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void textView_clickedOnCell_inRect(final com.apple.jobjc.appkit.NSTextView textView, final com.apple.jobjc.ID cell, final com.apple.jobjc.foundation.NSRect cellFrame){
			final com.apple.jobjc.Invoke.MsgSend textView_clickedOnCell_inRect_IMetInst = get_textView_clickedOnCell_inRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_clickedOnCell_inRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		textView_clickedOnCell_inRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_clickedOnCell_inRect_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_clickedOnCell_inRect_atIndex_IMetInst(){
		return ((textView_clickedOnCell_inRect_atIndex_IMetInst != null)
	? (textView_clickedOnCell_inRect_atIndex_IMetInst)
	: (textView_clickedOnCell_inRect_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:clickedOnCell:inRect:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void textView_clickedOnCell_inRect_atIndex(final com.apple.jobjc.appkit.NSTextView textView, final com.apple.jobjc.ID cell, final com.apple.jobjc.foundation.NSRect cellFrame, final long charIndex){
			final com.apple.jobjc.Invoke.MsgSend textView_clickedOnCell_inRect_atIndex_IMetInst = get_textView_clickedOnCell_inRect_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_clickedOnCell_inRect_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		textView_clickedOnCell_inRect_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_clickedOnLink_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_clickedOnLink_IMetInst(){
		return ((textView_clickedOnLink_IMetInst != null)
	? (textView_clickedOnLink_IMetInst)
	: (textView_clickedOnLink_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:clickedOnLink:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean textView_clickedOnLink(final com.apple.jobjc.appkit.NSTextView textView, final com.apple.jobjc.ID link){
			final com.apple.jobjc.Invoke.MsgSend textView_clickedOnLink_IMetInst = get_textView_clickedOnLink_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_clickedOnLink_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, link);
		textView_clickedOnLink_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_clickedOnLink_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_clickedOnLink_atIndex_IMetInst(){
		return ((textView_clickedOnLink_atIndex_IMetInst != null)
	? (textView_clickedOnLink_atIndex_IMetInst)
	: (textView_clickedOnLink_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:clickedOnLink:atIndex:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean textView_clickedOnLink_atIndex(final com.apple.jobjc.appkit.NSTextView textView, final com.apple.jobjc.ID link, final long charIndex){
			final com.apple.jobjc.Invoke.MsgSend textView_clickedOnLink_atIndex_IMetInst = get_textView_clickedOnLink_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_clickedOnLink_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, link);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		textView_clickedOnLink_atIndex_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_completions_forPartialWordRange_indexOfSelectedItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_completions_forPartialWordRange_indexOfSelectedItem_IMetInst(){
		return ((textView_completions_forPartialWordRange_indexOfSelectedItem_IMetInst != null)
	? (textView_completions_forPartialWordRange_indexOfSelectedItem_IMetInst)
	: (textView_completions_forPartialWordRange_indexOfSelectedItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:completions:forPartialWordRange:indexOfSelectedItem:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray textView_completions_forPartialWordRange_indexOfSelectedItem(final com.apple.jobjc.appkit.NSTextView textView, final com.apple.jobjc.foundation.NSArray words, final com.apple.jobjc.foundation.NSRange charRange, final com.apple.jobjc.Pointer<java.lang.Long> index){
			final com.apple.jobjc.Invoke.MsgSend textView_completions_forPartialWordRange_indexOfSelectedItem_IMetInst = get_textView_completions_forPartialWordRange_indexOfSelectedItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_completions_forPartialWordRange_indexOfSelectedItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, words);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, index);
		textView_completions_forPartialWordRange_indexOfSelectedItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_didCheckTextInRange_types_options_results_orthography_wordCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_didCheckTextInRange_types_options_results_orthography_wordCount_IMetInst(){
		return ((textView_didCheckTextInRange_types_options_results_orthography_wordCount_IMetInst != null)
	? (textView_didCheckTextInRange_types_options_results_orthography_wordCount_IMetInst)
	: (textView_didCheckTextInRange_types_options_results_orthography_wordCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:didCheckTextInRange:types:options:results:orthography:wordCount:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSArray textView_didCheckTextInRange_types_options_results_orthography_wordCount(final com.apple.jobjc.appkit.NSTextView view, final com.apple.jobjc.foundation.NSRange range, final long checkingTypes, final com.apple.jobjc.foundation.NSDictionary options, final com.apple.jobjc.foundation.NSArray results, final com.apple.jobjc.foundation.NSOrthography orthography, final long wordCount){
			final com.apple.jobjc.Invoke.MsgSend textView_didCheckTextInRange_types_options_results_orthography_wordCount_IMetInst = get_textView_didCheckTextInRange_types_options_results_orthography_wordCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_didCheckTextInRange_types_options_results_orthography_wordCount_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, checkingTypes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, results);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, orthography);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, wordCount);
		textView_didCheckTextInRange_types_options_results_orthography_wordCount_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_doCommandBySelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_doCommandBySelector_IMetInst(){
		return ((textView_doCommandBySelector_IMetInst != null)
	? (textView_doCommandBySelector_IMetInst)
	: (textView_doCommandBySelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:doCommandBySelector:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public boolean textView_doCommandBySelector(final com.apple.jobjc.appkit.NSTextView textView, final com.apple.jobjc.SEL commandSelector){
			final com.apple.jobjc.Invoke.MsgSend textView_doCommandBySelector_IMetInst = get_textView_doCommandBySelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_doCommandBySelector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, commandSelector);
		textView_doCommandBySelector_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_doubleClickedOnCell_inRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_doubleClickedOnCell_inRect_IMetInst(){
		return ((textView_doubleClickedOnCell_inRect_IMetInst != null)
	? (textView_doubleClickedOnCell_inRect_IMetInst)
	: (textView_doubleClickedOnCell_inRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:doubleClickedOnCell:inRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void textView_doubleClickedOnCell_inRect(final com.apple.jobjc.appkit.NSTextView textView, final com.apple.jobjc.ID cell, final com.apple.jobjc.foundation.NSRect cellFrame){
			final com.apple.jobjc.Invoke.MsgSend textView_doubleClickedOnCell_inRect_IMetInst = get_textView_doubleClickedOnCell_inRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_doubleClickedOnCell_inRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		textView_doubleClickedOnCell_inRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_doubleClickedOnCell_inRect_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_doubleClickedOnCell_inRect_atIndex_IMetInst(){
		return ((textView_doubleClickedOnCell_inRect_atIndex_IMetInst != null)
	? (textView_doubleClickedOnCell_inRect_atIndex_IMetInst)
	: (textView_doubleClickedOnCell_inRect_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:doubleClickedOnCell:inRect:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void textView_doubleClickedOnCell_inRect_atIndex(final com.apple.jobjc.appkit.NSTextView textView, final com.apple.jobjc.ID cell, final com.apple.jobjc.foundation.NSRect cellFrame, final long charIndex){
			final com.apple.jobjc.Invoke.MsgSend textView_doubleClickedOnCell_inRect_atIndex_IMetInst = get_textView_doubleClickedOnCell_inRect_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_doubleClickedOnCell_inRect_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		textView_doubleClickedOnCell_inRect_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_draggedCell_inRect_event_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_draggedCell_inRect_event_IMetInst(){
		return ((textView_draggedCell_inRect_event_IMetInst != null)
	? (textView_draggedCell_inRect_event_IMetInst)
	: (textView_draggedCell_inRect_event_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:draggedCell:inRect:event:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void textView_draggedCell_inRect_event(final com.apple.jobjc.appkit.NSTextView view, final com.apple.jobjc.ID cell, final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend textView_draggedCell_inRect_event_IMetInst = get_textView_draggedCell_inRect_event_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_draggedCell_inRect_event_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		textView_draggedCell_inRect_event_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_draggedCell_inRect_event_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_draggedCell_inRect_event_atIndex_IMetInst(){
		return ((textView_draggedCell_inRect_event_atIndex_IMetInst != null)
	? (textView_draggedCell_inRect_event_atIndex_IMetInst)
	: (textView_draggedCell_inRect_event_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:draggedCell:inRect:event:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void textView_draggedCell_inRect_event_atIndex(final com.apple.jobjc.appkit.NSTextView view, final com.apple.jobjc.ID cell, final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.appkit.NSEvent event, final long charIndex){
			final com.apple.jobjc.Invoke.MsgSend textView_draggedCell_inRect_event_atIndex_IMetInst = get_textView_draggedCell_inRect_event_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_draggedCell_inRect_event_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		textView_draggedCell_inRect_event_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_menu_forEvent_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_menu_forEvent_atIndex_IMetInst(){
		return ((textView_menu_forEvent_atIndex_IMetInst != null)
	? (textView_menu_forEvent_atIndex_IMetInst)
	: (textView_menu_forEvent_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:menu:forEvent:atIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSMenu textView_menu_forEvent_atIndex(final com.apple.jobjc.appkit.NSTextView view, final com.apple.jobjc.appkit.NSMenu menu, final com.apple.jobjc.appkit.NSEvent event, final long charIndex){
			final com.apple.jobjc.Invoke.MsgSend textView_menu_forEvent_atIndex_IMetInst = get_textView_menu_forEvent_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_menu_forEvent_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		textView_menu_forEvent_atIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_shouldChangeTextInRange_replacementString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_shouldChangeTextInRange_replacementString_IMetInst(){
		return ((textView_shouldChangeTextInRange_replacementString_IMetInst != null)
	? (textView_shouldChangeTextInRange_replacementString_IMetInst)
	: (textView_shouldChangeTextInRange_replacementString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:shouldChangeTextInRange:replacementString:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean textView_shouldChangeTextInRange_replacementString(final com.apple.jobjc.appkit.NSTextView textView, final com.apple.jobjc.foundation.NSRange affectedCharRange, final com.apple.jobjc.foundation.NSString replacementString){
			final com.apple.jobjc.Invoke.MsgSend textView_shouldChangeTextInRange_replacementString_IMetInst = get_textView_shouldChangeTextInRange_replacementString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_shouldChangeTextInRange_replacementString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, affectedCharRange);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, replacementString);
		textView_shouldChangeTextInRange_replacementString_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_shouldChangeTextInRanges_replacementStrings_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_shouldChangeTextInRanges_replacementStrings_IMetInst(){
		return ((textView_shouldChangeTextInRanges_replacementStrings_IMetInst != null)
	? (textView_shouldChangeTextInRanges_replacementStrings_IMetInst)
	: (textView_shouldChangeTextInRanges_replacementStrings_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:shouldChangeTextInRanges:replacementStrings:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean textView_shouldChangeTextInRanges_replacementStrings(final com.apple.jobjc.appkit.NSTextView textView, final com.apple.jobjc.foundation.NSArray affectedRanges, final com.apple.jobjc.foundation.NSArray replacementStrings){
			final com.apple.jobjc.Invoke.MsgSend textView_shouldChangeTextInRanges_replacementStrings_IMetInst = get_textView_shouldChangeTextInRanges_replacementStrings_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_shouldChangeTextInRanges_replacementStrings_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, affectedRanges);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, replacementStrings);
		textView_shouldChangeTextInRanges_replacementStrings_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_shouldChangeTypingAttributes_toAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_shouldChangeTypingAttributes_toAttributes_IMetInst(){
		return ((textView_shouldChangeTypingAttributes_toAttributes_IMetInst != null)
	? (textView_shouldChangeTypingAttributes_toAttributes_IMetInst)
	: (textView_shouldChangeTypingAttributes_toAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:shouldChangeTypingAttributes:toAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary textView_shouldChangeTypingAttributes_toAttributes(final com.apple.jobjc.appkit.NSTextView textView, final com.apple.jobjc.foundation.NSDictionary oldTypingAttributes, final com.apple.jobjc.foundation.NSDictionary newTypingAttributes){
			final com.apple.jobjc.Invoke.MsgSend textView_shouldChangeTypingAttributes_toAttributes_IMetInst = get_textView_shouldChangeTypingAttributes_toAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_shouldChangeTypingAttributes_toAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, oldTypingAttributes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newTypingAttributes);
		textView_shouldChangeTypingAttributes_toAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_shouldSetSpellingState_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_shouldSetSpellingState_range_IMetInst(){
		return ((textView_shouldSetSpellingState_range_IMetInst != null)
	? (textView_shouldSetSpellingState_range_IMetInst)
	: (textView_shouldSetSpellingState_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:shouldSetSpellingState:range:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public long textView_shouldSetSpellingState_range(final com.apple.jobjc.appkit.NSTextView textView, final long value, final com.apple.jobjc.foundation.NSRange affectedCharRange){
			final com.apple.jobjc.Invoke.MsgSend textView_shouldSetSpellingState_range_IMetInst = get_textView_shouldSetSpellingState_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_shouldSetSpellingState_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, value);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, affectedCharRange);
		textView_shouldSetSpellingState_range_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_willChangeSelectionFromCharacterRange_toCharacterRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_willChangeSelectionFromCharacterRange_toCharacterRange_IMetInst(){
		return ((textView_willChangeSelectionFromCharacterRange_toCharacterRange_IMetInst != null)
	? (textView_willChangeSelectionFromCharacterRange_toCharacterRange_IMetInst)
	: (textView_willChangeSelectionFromCharacterRange_toCharacterRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:willChangeSelectionFromCharacterRange:toCharacterRange:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange textView_willChangeSelectionFromCharacterRange_toCharacterRange(final com.apple.jobjc.appkit.NSTextView textView, final com.apple.jobjc.foundation.NSRange oldSelectedCharRange, final com.apple.jobjc.foundation.NSRange newSelectedCharRange){
			final com.apple.jobjc.Invoke.MsgSend textView_willChangeSelectionFromCharacterRange_toCharacterRange_IMetInst = get_textView_willChangeSelectionFromCharacterRange_toCharacterRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_willChangeSelectionFromCharacterRange_toCharacterRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, oldSelectedCharRange);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, newSelectedCharRange);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		textView_willChangeSelectionFromCharacterRange_toCharacterRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_willChangeSelectionFromCharacterRanges_toCharacterRanges_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_willChangeSelectionFromCharacterRanges_toCharacterRanges_IMetInst(){
		return ((textView_willChangeSelectionFromCharacterRanges_toCharacterRanges_IMetInst != null)
	? (textView_willChangeSelectionFromCharacterRanges_toCharacterRanges_IMetInst)
	: (textView_willChangeSelectionFromCharacterRanges_toCharacterRanges_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:willChangeSelectionFromCharacterRanges:toCharacterRanges:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray textView_willChangeSelectionFromCharacterRanges_toCharacterRanges(final com.apple.jobjc.appkit.NSTextView textView, final com.apple.jobjc.foundation.NSArray oldSelectedCharRanges, final com.apple.jobjc.foundation.NSArray newSelectedCharRanges){
			final com.apple.jobjc.Invoke.MsgSend textView_willChangeSelectionFromCharacterRanges_toCharacterRanges_IMetInst = get_textView_willChangeSelectionFromCharacterRanges_toCharacterRanges_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_willChangeSelectionFromCharacterRanges_toCharacterRanges_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, oldSelectedCharRanges);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newSelectedCharRanges);
		textView_willChangeSelectionFromCharacterRanges_toCharacterRanges_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_willCheckTextInRange_options_types_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_willCheckTextInRange_options_types_IMetInst(){
		return ((textView_willCheckTextInRange_options_types_IMetInst != null)
	? (textView_willCheckTextInRange_options_types_IMetInst)
	: (textView_willCheckTextInRange_options_types_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:willCheckTextInRange:options:types:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary textView_willCheckTextInRange_options_types(final com.apple.jobjc.appkit.NSTextView view, final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSDictionary options, final com.apple.jobjc.Pointer<java.lang.Long> checkingTypes){
			final com.apple.jobjc.Invoke.MsgSend textView_willCheckTextInRange_options_types_IMetInst = get_textView_willCheckTextInRange_options_types_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_willCheckTextInRange_options_types_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, checkingTypes);
		textView_willCheckTextInRange_options_types_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_willDisplayToolTip_forCharacterAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_willDisplayToolTip_forCharacterAtIndex_IMetInst(){
		return ((textView_willDisplayToolTip_forCharacterAtIndex_IMetInst != null)
	? (textView_willDisplayToolTip_forCharacterAtIndex_IMetInst)
	: (textView_willDisplayToolTip_forCharacterAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:willDisplayToolTip:forCharacterAtIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString textView_willDisplayToolTip_forCharacterAtIndex(final com.apple.jobjc.appkit.NSTextView textView, final com.apple.jobjc.foundation.NSString tooltip, final long characterIndex){
			final com.apple.jobjc.Invoke.MsgSend textView_willDisplayToolTip_forCharacterAtIndex_IMetInst = get_textView_willDisplayToolTip_forCharacterAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_willDisplayToolTip_forCharacterAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tooltip);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, characterIndex);
		textView_willDisplayToolTip_forCharacterAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_willShowSharingServicePicker_forItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_willShowSharingServicePicker_forItems_IMetInst(){
		return ((textView_willShowSharingServicePicker_forItems_IMetInst != null)
	? (textView_willShowSharingServicePicker_forItems_IMetInst)
	: (textView_willShowSharingServicePicker_forItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:willShowSharingServicePicker:forItems:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSSharingServicePicker textView_willShowSharingServicePicker_forItems(final com.apple.jobjc.appkit.NSTextView textView, final com.apple.jobjc.appkit.NSSharingServicePicker servicePicker, final com.apple.jobjc.foundation.NSArray items){
			final com.apple.jobjc.Invoke.MsgSend textView_willShowSharingServicePicker_forItems_IMetInst = get_textView_willShowSharingServicePicker_forItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_willShowSharingServicePicker_forItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, servicePicker);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, items);
		textView_willShowSharingServicePicker_forItems_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSSharingServicePicker returnValue = (com.apple.jobjc.appkit.NSSharingServicePicker) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_writablePasteboardTypesForCell_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_writablePasteboardTypesForCell_atIndex_IMetInst(){
		return ((textView_writablePasteboardTypesForCell_atIndex_IMetInst != null)
	? (textView_writablePasteboardTypesForCell_atIndex_IMetInst)
	: (textView_writablePasteboardTypesForCell_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:writablePasteboardTypesForCell:atIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSArray textView_writablePasteboardTypesForCell_atIndex(final com.apple.jobjc.appkit.NSTextView view, final com.apple.jobjc.ID cell, final long charIndex){
			final com.apple.jobjc.Invoke.MsgSend textView_writablePasteboardTypesForCell_atIndex_IMetInst = get_textView_writablePasteboardTypesForCell_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_writablePasteboardTypesForCell_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		textView_writablePasteboardTypesForCell_atIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_writeCell_atIndex_toPasteboard_type_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_writeCell_atIndex_toPasteboard_type_IMetInst(){
		return ((textView_writeCell_atIndex_toPasteboard_type_IMetInst != null)
	? (textView_writeCell_atIndex_toPasteboard_type_IMetInst)
	: (textView_writeCell_atIndex_toPasteboard_type_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView:writeCell:atIndex:toPasteboard:type:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean textView_writeCell_atIndex_toPasteboard_type(final com.apple.jobjc.appkit.NSTextView view, final com.apple.jobjc.ID cell, final long charIndex, final com.apple.jobjc.appkit.NSPasteboard pboard, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend textView_writeCell_atIndex_toPasteboard_type_IMetInst = get_textView_writeCell_atIndex_toPasteboard_type_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_writeCell_atIndex_toPasteboard_type_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pboard);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		textView_writeCell_atIndex_toPasteboard_type_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textViewDidChangeSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textViewDidChangeSelection_IMetInst(){
		return ((textViewDidChangeSelection_IMetInst != null)
	? (textViewDidChangeSelection_IMetInst)
	: (textViewDidChangeSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textViewDidChangeSelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void textViewDidChangeSelection(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend textViewDidChangeSelection_IMetInst = get_textViewDidChangeSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textViewDidChangeSelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		textViewDidChangeSelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textViewDidChangeTypingAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textViewDidChangeTypingAttributes_IMetInst(){
		return ((textViewDidChangeTypingAttributes_IMetInst != null)
	? (textViewDidChangeTypingAttributes_IMetInst)
	: (textViewDidChangeTypingAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textViewDidChangeTypingAttributes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void textViewDidChangeTypingAttributes(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend textViewDidChangeTypingAttributes_IMetInst = get_textViewDidChangeTypingAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textViewDidChangeTypingAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		textViewDidChangeTypingAttributes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenField_completionsForSubstring_indexOfToken_indexOfSelectedItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenField_completionsForSubstring_indexOfToken_indexOfSelectedItem_IMetInst(){
		return ((tokenField_completionsForSubstring_indexOfToken_indexOfSelectedItem_IMetInst != null)
	? (tokenField_completionsForSubstring_indexOfToken_indexOfSelectedItem_IMetInst)
	: (tokenField_completionsForSubstring_indexOfToken_indexOfSelectedItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenField:completionsForSubstring:indexOfToken:indexOfSelectedItem:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray tokenField_completionsForSubstring_indexOfToken_indexOfSelectedItem(final com.apple.jobjc.appkit.NSTokenField tokenField, final com.apple.jobjc.foundation.NSString substring, final long tokenIndex, final com.apple.jobjc.Pointer<java.lang.Long> selectedIndex){
			final com.apple.jobjc.Invoke.MsgSend tokenField_completionsForSubstring_indexOfToken_indexOfSelectedItem_IMetInst = get_tokenField_completionsForSubstring_indexOfToken_indexOfSelectedItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenField_completionsForSubstring_indexOfToken_indexOfSelectedItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenField);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, substring);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tokenIndex);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, selectedIndex);
		tokenField_completionsForSubstring_indexOfToken_indexOfSelectedItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenField_displayStringForRepresentedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenField_displayStringForRepresentedObject_IMetInst(){
		return ((tokenField_displayStringForRepresentedObject_IMetInst != null)
	? (tokenField_displayStringForRepresentedObject_IMetInst)
	: (tokenField_displayStringForRepresentedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenField:displayStringForRepresentedObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString tokenField_displayStringForRepresentedObject(final com.apple.jobjc.appkit.NSTokenField tokenField, final com.apple.jobjc.ID representedObject){
			final com.apple.jobjc.Invoke.MsgSend tokenField_displayStringForRepresentedObject_IMetInst = get_tokenField_displayStringForRepresentedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenField_displayStringForRepresentedObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenField);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, representedObject);
		tokenField_displayStringForRepresentedObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenField_editingStringForRepresentedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenField_editingStringForRepresentedObject_IMetInst(){
		return ((tokenField_editingStringForRepresentedObject_IMetInst != null)
	? (tokenField_editingStringForRepresentedObject_IMetInst)
	: (tokenField_editingStringForRepresentedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenField:editingStringForRepresentedObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString tokenField_editingStringForRepresentedObject(final com.apple.jobjc.appkit.NSTokenField tokenField, final com.apple.jobjc.ID representedObject){
			final com.apple.jobjc.Invoke.MsgSend tokenField_editingStringForRepresentedObject_IMetInst = get_tokenField_editingStringForRepresentedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenField_editingStringForRepresentedObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenField);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, representedObject);
		tokenField_editingStringForRepresentedObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenField_hasMenuForRepresentedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenField_hasMenuForRepresentedObject_IMetInst(){
		return ((tokenField_hasMenuForRepresentedObject_IMetInst != null)
	? (tokenField_hasMenuForRepresentedObject_IMetInst)
	: (tokenField_hasMenuForRepresentedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenField:hasMenuForRepresentedObject:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean tokenField_hasMenuForRepresentedObject(final com.apple.jobjc.appkit.NSTokenField tokenField, final com.apple.jobjc.ID representedObject){
			final com.apple.jobjc.Invoke.MsgSend tokenField_hasMenuForRepresentedObject_IMetInst = get_tokenField_hasMenuForRepresentedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenField_hasMenuForRepresentedObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenField);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, representedObject);
		tokenField_hasMenuForRepresentedObject_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenField_menuForRepresentedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenField_menuForRepresentedObject_IMetInst(){
		return ((tokenField_menuForRepresentedObject_IMetInst != null)
	? (tokenField_menuForRepresentedObject_IMetInst)
	: (tokenField_menuForRepresentedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenField:menuForRepresentedObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu tokenField_menuForRepresentedObject(final com.apple.jobjc.appkit.NSTokenField tokenField, final com.apple.jobjc.ID representedObject){
			final com.apple.jobjc.Invoke.MsgSend tokenField_menuForRepresentedObject_IMetInst = get_tokenField_menuForRepresentedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenField_menuForRepresentedObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenField);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, representedObject);
		tokenField_menuForRepresentedObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenField_readFromPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenField_readFromPasteboard_IMetInst(){
		return ((tokenField_readFromPasteboard_IMetInst != null)
	? (tokenField_readFromPasteboard_IMetInst)
	: (tokenField_readFromPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenField:readFromPasteboard:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray tokenField_readFromPasteboard(final com.apple.jobjc.appkit.NSTokenField tokenField, final com.apple.jobjc.appkit.NSPasteboard pboard){
			final com.apple.jobjc.Invoke.MsgSend tokenField_readFromPasteboard_IMetInst = get_tokenField_readFromPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenField_readFromPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenField);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pboard);
		tokenField_readFromPasteboard_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenField_representedObjectForEditingString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenField_representedObjectForEditingString_IMetInst(){
		return ((tokenField_representedObjectForEditingString_IMetInst != null)
	? (tokenField_representedObjectForEditingString_IMetInst)
	: (tokenField_representedObjectForEditingString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenField:representedObjectForEditingString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T tokenField_representedObjectForEditingString(final com.apple.jobjc.appkit.NSTokenField tokenField, final com.apple.jobjc.foundation.NSString editingString){
			final com.apple.jobjc.Invoke.MsgSend tokenField_representedObjectForEditingString_IMetInst = get_tokenField_representedObjectForEditingString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenField_representedObjectForEditingString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenField);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, editingString);
		tokenField_representedObjectForEditingString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenField_shouldAddObjects_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenField_shouldAddObjects_atIndex_IMetInst(){
		return ((tokenField_shouldAddObjects_atIndex_IMetInst != null)
	? (tokenField_shouldAddObjects_atIndex_IMetInst)
	: (tokenField_shouldAddObjects_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenField:shouldAddObjects:atIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSArray tokenField_shouldAddObjects_atIndex(final com.apple.jobjc.appkit.NSTokenField tokenField, final com.apple.jobjc.foundation.NSArray tokens, final long index){
			final com.apple.jobjc.Invoke.MsgSend tokenField_shouldAddObjects_atIndex_IMetInst = get_tokenField_shouldAddObjects_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenField_shouldAddObjects_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenField);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokens);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		tokenField_shouldAddObjects_atIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenField_styleForRepresentedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenField_styleForRepresentedObject_IMetInst(){
		return ((tokenField_styleForRepresentedObject_IMetInst != null)
	? (tokenField_styleForRepresentedObject_IMetInst)
	: (tokenField_styleForRepresentedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenField:styleForRepresentedObject:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long tokenField_styleForRepresentedObject(final com.apple.jobjc.appkit.NSTokenField tokenField, final com.apple.jobjc.ID representedObject){
			final com.apple.jobjc.Invoke.MsgSend tokenField_styleForRepresentedObject_IMetInst = get_tokenField_styleForRepresentedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenField_styleForRepresentedObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenField);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, representedObject);
		tokenField_styleForRepresentedObject_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenField_writeRepresentedObjects_toPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenField_writeRepresentedObjects_toPasteboard_IMetInst(){
		return ((tokenField_writeRepresentedObjects_toPasteboard_IMetInst != null)
	? (tokenField_writeRepresentedObjects_toPasteboard_IMetInst)
	: (tokenField_writeRepresentedObjects_toPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenField:writeRepresentedObjects:toPasteboard:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean tokenField_writeRepresentedObjects_toPasteboard(final com.apple.jobjc.appkit.NSTokenField tokenField, final com.apple.jobjc.foundation.NSArray objects, final com.apple.jobjc.appkit.NSPasteboard pboard){
			final com.apple.jobjc.Invoke.MsgSend tokenField_writeRepresentedObjects_toPasteboard_IMetInst = get_tokenField_writeRepresentedObjects_toPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenField_writeRepresentedObjects_toPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenField);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objects);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pboard);
		tokenField_writeRepresentedObjects_toPasteboard_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenFieldCell_completionsForSubstring_indexOfToken_indexOfSelectedItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenFieldCell_completionsForSubstring_indexOfToken_indexOfSelectedItem_IMetInst(){
		return ((tokenFieldCell_completionsForSubstring_indexOfToken_indexOfSelectedItem_IMetInst != null)
	? (tokenFieldCell_completionsForSubstring_indexOfToken_indexOfSelectedItem_IMetInst)
	: (tokenFieldCell_completionsForSubstring_indexOfToken_indexOfSelectedItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenFieldCell:completionsForSubstring:indexOfToken:indexOfSelectedItem:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray tokenFieldCell_completionsForSubstring_indexOfToken_indexOfSelectedItem(final com.apple.jobjc.appkit.NSTokenFieldCell tokenFieldCell, final com.apple.jobjc.foundation.NSString substring, final long tokenIndex, final com.apple.jobjc.Pointer<java.lang.Long> selectedIndex){
			final com.apple.jobjc.Invoke.MsgSend tokenFieldCell_completionsForSubstring_indexOfToken_indexOfSelectedItem_IMetInst = get_tokenFieldCell_completionsForSubstring_indexOfToken_indexOfSelectedItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenFieldCell_completionsForSubstring_indexOfToken_indexOfSelectedItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenFieldCell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, substring);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tokenIndex);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, selectedIndex);
		tokenFieldCell_completionsForSubstring_indexOfToken_indexOfSelectedItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenFieldCell_displayStringForRepresentedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenFieldCell_displayStringForRepresentedObject_IMetInst(){
		return ((tokenFieldCell_displayStringForRepresentedObject_IMetInst != null)
	? (tokenFieldCell_displayStringForRepresentedObject_IMetInst)
	: (tokenFieldCell_displayStringForRepresentedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenFieldCell:displayStringForRepresentedObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString tokenFieldCell_displayStringForRepresentedObject(final com.apple.jobjc.appkit.NSTokenFieldCell tokenFieldCell, final com.apple.jobjc.ID representedObject){
			final com.apple.jobjc.Invoke.MsgSend tokenFieldCell_displayStringForRepresentedObject_IMetInst = get_tokenFieldCell_displayStringForRepresentedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenFieldCell_displayStringForRepresentedObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenFieldCell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, representedObject);
		tokenFieldCell_displayStringForRepresentedObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenFieldCell_editingStringForRepresentedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenFieldCell_editingStringForRepresentedObject_IMetInst(){
		return ((tokenFieldCell_editingStringForRepresentedObject_IMetInst != null)
	? (tokenFieldCell_editingStringForRepresentedObject_IMetInst)
	: (tokenFieldCell_editingStringForRepresentedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenFieldCell:editingStringForRepresentedObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString tokenFieldCell_editingStringForRepresentedObject(final com.apple.jobjc.appkit.NSTokenFieldCell tokenFieldCell, final com.apple.jobjc.ID representedObject){
			final com.apple.jobjc.Invoke.MsgSend tokenFieldCell_editingStringForRepresentedObject_IMetInst = get_tokenFieldCell_editingStringForRepresentedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenFieldCell_editingStringForRepresentedObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenFieldCell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, representedObject);
		tokenFieldCell_editingStringForRepresentedObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenFieldCell_hasMenuForRepresentedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenFieldCell_hasMenuForRepresentedObject_IMetInst(){
		return ((tokenFieldCell_hasMenuForRepresentedObject_IMetInst != null)
	? (tokenFieldCell_hasMenuForRepresentedObject_IMetInst)
	: (tokenFieldCell_hasMenuForRepresentedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenFieldCell:hasMenuForRepresentedObject:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean tokenFieldCell_hasMenuForRepresentedObject(final com.apple.jobjc.appkit.NSTokenFieldCell tokenFieldCell, final com.apple.jobjc.ID representedObject){
			final com.apple.jobjc.Invoke.MsgSend tokenFieldCell_hasMenuForRepresentedObject_IMetInst = get_tokenFieldCell_hasMenuForRepresentedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenFieldCell_hasMenuForRepresentedObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenFieldCell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, representedObject);
		tokenFieldCell_hasMenuForRepresentedObject_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenFieldCell_menuForRepresentedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenFieldCell_menuForRepresentedObject_IMetInst(){
		return ((tokenFieldCell_menuForRepresentedObject_IMetInst != null)
	? (tokenFieldCell_menuForRepresentedObject_IMetInst)
	: (tokenFieldCell_menuForRepresentedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenFieldCell:menuForRepresentedObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu tokenFieldCell_menuForRepresentedObject(final com.apple.jobjc.appkit.NSTokenFieldCell tokenFieldCell, final com.apple.jobjc.ID representedObject){
			final com.apple.jobjc.Invoke.MsgSend tokenFieldCell_menuForRepresentedObject_IMetInst = get_tokenFieldCell_menuForRepresentedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenFieldCell_menuForRepresentedObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenFieldCell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, representedObject);
		tokenFieldCell_menuForRepresentedObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenFieldCell_readFromPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenFieldCell_readFromPasteboard_IMetInst(){
		return ((tokenFieldCell_readFromPasteboard_IMetInst != null)
	? (tokenFieldCell_readFromPasteboard_IMetInst)
	: (tokenFieldCell_readFromPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenFieldCell:readFromPasteboard:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray tokenFieldCell_readFromPasteboard(final com.apple.jobjc.appkit.NSTokenFieldCell tokenFieldCell, final com.apple.jobjc.appkit.NSPasteboard pboard){
			final com.apple.jobjc.Invoke.MsgSend tokenFieldCell_readFromPasteboard_IMetInst = get_tokenFieldCell_readFromPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenFieldCell_readFromPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenFieldCell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pboard);
		tokenFieldCell_readFromPasteboard_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenFieldCell_representedObjectForEditingString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenFieldCell_representedObjectForEditingString_IMetInst(){
		return ((tokenFieldCell_representedObjectForEditingString_IMetInst != null)
	? (tokenFieldCell_representedObjectForEditingString_IMetInst)
	: (tokenFieldCell_representedObjectForEditingString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenFieldCell:representedObjectForEditingString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T tokenFieldCell_representedObjectForEditingString(final com.apple.jobjc.appkit.NSTokenFieldCell tokenFieldCell, final com.apple.jobjc.foundation.NSString editingString){
			final com.apple.jobjc.Invoke.MsgSend tokenFieldCell_representedObjectForEditingString_IMetInst = get_tokenFieldCell_representedObjectForEditingString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenFieldCell_representedObjectForEditingString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenFieldCell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, editingString);
		tokenFieldCell_representedObjectForEditingString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenFieldCell_shouldAddObjects_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenFieldCell_shouldAddObjects_atIndex_IMetInst(){
		return ((tokenFieldCell_shouldAddObjects_atIndex_IMetInst != null)
	? (tokenFieldCell_shouldAddObjects_atIndex_IMetInst)
	: (tokenFieldCell_shouldAddObjects_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenFieldCell:shouldAddObjects:atIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSArray tokenFieldCell_shouldAddObjects_atIndex(final com.apple.jobjc.appkit.NSTokenFieldCell tokenFieldCell, final com.apple.jobjc.foundation.NSArray tokens, final long index){
			final com.apple.jobjc.Invoke.MsgSend tokenFieldCell_shouldAddObjects_atIndex_IMetInst = get_tokenFieldCell_shouldAddObjects_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenFieldCell_shouldAddObjects_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenFieldCell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokens);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		tokenFieldCell_shouldAddObjects_atIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenFieldCell_styleForRepresentedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenFieldCell_styleForRepresentedObject_IMetInst(){
		return ((tokenFieldCell_styleForRepresentedObject_IMetInst != null)
	? (tokenFieldCell_styleForRepresentedObject_IMetInst)
	: (tokenFieldCell_styleForRepresentedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenFieldCell:styleForRepresentedObject:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long tokenFieldCell_styleForRepresentedObject(final com.apple.jobjc.appkit.NSTokenFieldCell tokenFieldCell, final com.apple.jobjc.ID representedObject){
			final com.apple.jobjc.Invoke.MsgSend tokenFieldCell_styleForRepresentedObject_IMetInst = get_tokenFieldCell_styleForRepresentedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenFieldCell_styleForRepresentedObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenFieldCell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, representedObject);
		tokenFieldCell_styleForRepresentedObject_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenFieldCell_writeRepresentedObjects_toPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenFieldCell_writeRepresentedObjects_toPasteboard_IMetInst(){
		return ((tokenFieldCell_writeRepresentedObjects_toPasteboard_IMetInst != null)
	? (tokenFieldCell_writeRepresentedObjects_toPasteboard_IMetInst)
	: (tokenFieldCell_writeRepresentedObjects_toPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenFieldCell:writeRepresentedObjects:toPasteboard:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean tokenFieldCell_writeRepresentedObjects_toPasteboard(final com.apple.jobjc.appkit.NSTokenFieldCell tokenFieldCell, final com.apple.jobjc.foundation.NSArray objects, final com.apple.jobjc.appkit.NSPasteboard pboard){
			final com.apple.jobjc.Invoke.MsgSend tokenFieldCell_writeRepresentedObjects_toPasteboard_IMetInst = get_tokenFieldCell_writeRepresentedObjects_toPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenFieldCell_writeRepresentedObjects_toPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tokenFieldCell);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objects);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pboard);
		tokenFieldCell_writeRepresentedObjects_toPasteboard_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend toolbar_itemForItemIdentifier_willBeInsertedIntoToolbar_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toolbar_itemForItemIdentifier_willBeInsertedIntoToolbar_IMetInst(){
		return ((toolbar_itemForItemIdentifier_willBeInsertedIntoToolbar_IMetInst != null)
	? (toolbar_itemForItemIdentifier_willBeInsertedIntoToolbar_IMetInst)
	: (toolbar_itemForItemIdentifier_willBeInsertedIntoToolbar_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toolbar:itemForItemIdentifier:willBeInsertedIntoToolbar:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSToolbarItem toolbar_itemForItemIdentifier_willBeInsertedIntoToolbar(final com.apple.jobjc.appkit.NSToolbar toolbar, final com.apple.jobjc.foundation.NSString itemIdentifier, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend toolbar_itemForItemIdentifier_willBeInsertedIntoToolbar_IMetInst = get_toolbar_itemForItemIdentifier_willBeInsertedIntoToolbar_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toolbar_itemForItemIdentifier_willBeInsertedIntoToolbar_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, toolbar);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, itemIdentifier);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		toolbar_itemForItemIdentifier_willBeInsertedIntoToolbar_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSToolbarItem returnValue = (com.apple.jobjc.appkit.NSToolbarItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend toolbarAllowedItemIdentifiers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toolbarAllowedItemIdentifiers_IMetInst(){
		return ((toolbarAllowedItemIdentifiers_IMetInst != null)
	? (toolbarAllowedItemIdentifiers_IMetInst)
	: (toolbarAllowedItemIdentifiers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toolbarAllowedItemIdentifiers:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray toolbarAllowedItemIdentifiers(final com.apple.jobjc.appkit.NSToolbar toolbar){
			final com.apple.jobjc.Invoke.MsgSend toolbarAllowedItemIdentifiers_IMetInst = get_toolbarAllowedItemIdentifiers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toolbarAllowedItemIdentifiers_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, toolbar);
		toolbarAllowedItemIdentifiers_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend toolbarDefaultItemIdentifiers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toolbarDefaultItemIdentifiers_IMetInst(){
		return ((toolbarDefaultItemIdentifiers_IMetInst != null)
	? (toolbarDefaultItemIdentifiers_IMetInst)
	: (toolbarDefaultItemIdentifiers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toolbarDefaultItemIdentifiers:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray toolbarDefaultItemIdentifiers(final com.apple.jobjc.appkit.NSToolbar toolbar){
			final com.apple.jobjc.Invoke.MsgSend toolbarDefaultItemIdentifiers_IMetInst = get_toolbarDefaultItemIdentifiers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toolbarDefaultItemIdentifiers_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, toolbar);
		toolbarDefaultItemIdentifiers_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend toolbarDidRemoveItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toolbarDidRemoveItem_IMetInst(){
		return ((toolbarDidRemoveItem_IMetInst != null)
	? (toolbarDidRemoveItem_IMetInst)
	: (toolbarDidRemoveItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toolbarDidRemoveItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void toolbarDidRemoveItem(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend toolbarDidRemoveItem_IMetInst = get_toolbarDidRemoveItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toolbarDidRemoveItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		toolbarDidRemoveItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend toolbarSelectableItemIdentifiers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toolbarSelectableItemIdentifiers_IMetInst(){
		return ((toolbarSelectableItemIdentifiers_IMetInst != null)
	? (toolbarSelectableItemIdentifiers_IMetInst)
	: (toolbarSelectableItemIdentifiers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toolbarSelectableItemIdentifiers:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray toolbarSelectableItemIdentifiers(final com.apple.jobjc.appkit.NSToolbar toolbar){
			final com.apple.jobjc.Invoke.MsgSend toolbarSelectableItemIdentifiers_IMetInst = get_toolbarSelectableItemIdentifiers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toolbarSelectableItemIdentifiers_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, toolbar);
		toolbarSelectableItemIdentifiers_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend toolbarWillAddItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toolbarWillAddItem_IMetInst(){
		return ((toolbarWillAddItem_IMetInst != null)
	? (toolbarWillAddItem_IMetInst)
	: (toolbarWillAddItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toolbarWillAddItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void toolbarWillAddItem(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend toolbarWillAddItem_IMetInst = get_toolbarWillAddItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toolbarWillAddItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		toolbarWillAddItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend trackMouse_inRect_ofView_atCharacterIndex_untilMouseUp_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_trackMouse_inRect_ofView_atCharacterIndex_untilMouseUp_IMetInst(){
		return ((trackMouse_inRect_ofView_atCharacterIndex_untilMouseUp_IMetInst != null)
	? (trackMouse_inRect_ofView_atCharacterIndex_untilMouseUp_IMetInst)
	: (trackMouse_inRect_ofView_atCharacterIndex_untilMouseUp_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "trackMouse:inRect:ofView:atCharacterIndex:untilMouseUp:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean trackMouse_inRect_ofView_atCharacterIndex_untilMouseUp(final com.apple.jobjc.appkit.NSEvent theEvent, final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView, final long charIndex, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend trackMouse_inRect_ofView_atCharacterIndex_untilMouseUp_IMetInst = get_trackMouse_inRect_ofView_atCharacterIndex_untilMouseUp_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		trackMouse_inRect_ofView_atCharacterIndex_untilMouseUp_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		trackMouse_inRect_ofView_atCharacterIndex_untilMouseUp_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend trackMouse_inRect_ofView_untilMouseUp_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_trackMouse_inRect_ofView_untilMouseUp_IMetInst(){
		return ((trackMouse_inRect_ofView_untilMouseUp_IMetInst != null)
	? (trackMouse_inRect_ofView_untilMouseUp_IMetInst)
	: (trackMouse_inRect_ofView_untilMouseUp_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "trackMouse:inRect:ofView:untilMouseUp:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean trackMouse_inRect_ofView_untilMouseUp(final com.apple.jobjc.appkit.NSEvent theEvent, final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend trackMouse_inRect_ofView_untilMouseUp_IMetInst = get_trackMouse_inRect_ofView_untilMouseUp_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		trackMouse_inRect_ofView_untilMouseUp_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		trackMouse_inRect_ofView_untilMouseUp_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unbind_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unbind_IMetInst(){
		return ((unbind_IMetInst != null)
	? (unbind_IMetInst)
	: (unbind_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unbind:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void unbind(final com.apple.jobjc.foundation.NSString binding){
			final com.apple.jobjc.Invoke.MsgSend unbind_IMetInst = get_unbind_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unbind_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, binding);
		unbind_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend undoManagerForTextView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_undoManagerForTextView_IMetInst(){
		return ((undoManagerForTextView_IMetInst != null)
	? (undoManagerForTextView_IMetInst)
	: (undoManagerForTextView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "undoManagerForTextView:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSUndoManager undoManagerForTextView(final com.apple.jobjc.appkit.NSTextView view){
			final com.apple.jobjc.Invoke.MsgSend undoManagerForTextView_IMetInst = get_undoManagerForTextView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		undoManagerForTextView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		undoManagerForTextView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSUndoManager returnValue = (com.apple.jobjc.foundation.NSUndoManager) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unmarkText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unmarkText_IMetInst(){
		return ((unmarkText_IMetInst != null)
	? (unmarkText_IMetInst)
	: (unmarkText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unmarkText", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void unmarkText(){
			final com.apple.jobjc.Invoke.MsgSend unmarkText_IMetInst = get_unmarkText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unmarkText_IMetInst.init(nativeBuffer, this);
		unmarkText_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updateDraggingItemsForDrag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateDraggingItemsForDrag_IMetInst(){
		return ((updateDraggingItemsForDrag_IMetInst != null)
	? (updateDraggingItemsForDrag_IMetInst)
	: (updateDraggingItemsForDrag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateDraggingItemsForDrag:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void updateDraggingItemsForDrag(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend updateDraggingItemsForDrag_IMetInst = get_updateDraggingItemsForDrag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateDraggingItemsForDrag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		updateDraggingItemsForDrag_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend validAttributesForMarkedText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validAttributesForMarkedText_IMetInst(){
		return ((validAttributesForMarkedText_IMetInst != null)
	? (validAttributesForMarkedText_IMetInst)
	: (validAttributesForMarkedText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validAttributesForMarkedText", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray validAttributesForMarkedText(){
			final com.apple.jobjc.Invoke.MsgSend validAttributesForMarkedText_IMetInst = get_validAttributesForMarkedText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validAttributesForMarkedText_IMetInst.init(nativeBuffer, this);
		validAttributesForMarkedText_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend validModesForFontPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validModesForFontPanel_IMetInst(){
		return ((validModesForFontPanel_IMetInst != null)
	? (validModesForFontPanel_IMetInst)
	: (validModesForFontPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validModesForFontPanel:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long validModesForFontPanel(final com.apple.jobjc.appkit.NSFontPanel fontPanel){
			final com.apple.jobjc.Invoke.MsgSend validModesForFontPanel_IMetInst = get_validModesForFontPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validModesForFontPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontPanel);
		validModesForFontPanel_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend validateMenuItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validateMenuItem_IMetInst(){
		return ((validateMenuItem_IMetInst != null)
	? (validateMenuItem_IMetInst)
	: (validateMenuItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validateMenuItem:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean validateMenuItem(final com.apple.jobjc.appkit.NSMenuItem menuItem){
			final com.apple.jobjc.Invoke.MsgSend validateMenuItem_IMetInst = get_validateMenuItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validateMenuItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menuItem);
		validateMenuItem_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend validateToolbarItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validateToolbarItem_IMetInst(){
		return ((validateToolbarItem_IMetInst != null)
	? (validateToolbarItem_IMetInst)
	: (validateToolbarItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validateToolbarItem:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean validateToolbarItem(final com.apple.jobjc.appkit.NSToolbarItem theItem){
			final com.apple.jobjc.Invoke.MsgSend validateToolbarItem_IMetInst = get_validateToolbarItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validateToolbarItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theItem);
		validateToolbarItem_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend validateUserInterfaceItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validateUserInterfaceItem_IMetInst(){
		return ((validateUserInterfaceItem_IMetInst != null)
	? (validateUserInterfaceItem_IMetInst)
	: (validateUserInterfaceItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validateUserInterfaceItem:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean validateUserInterfaceItem(final com.apple.jobjc.ID anItem){
			final com.apple.jobjc.Invoke.MsgSend validateUserInterfaceItem_IMetInst = get_validateUserInterfaceItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validateUserInterfaceItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anItem);
		validateUserInterfaceItem_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend value_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_value_IMetInst(){
		return ((value_IMetInst != null)
	? (value_IMetInst)
	: (value_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "value", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T value(){
			final com.apple.jobjc.Invoke.MsgSend value_IMetInst = get_value_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		value_IMetInst.init(nativeBuffer, this);
		value_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueClassForBinding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueClassForBinding_IMetInst(){
		return ((valueClassForBinding_IMetInst != null)
	? (valueClassForBinding_IMetInst)
	: (valueClassForBinding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueClassForBinding:", com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T valueClassForBinding(final com.apple.jobjc.foundation.NSString binding){
			final com.apple.jobjc.Invoke.MsgSend valueClassForBinding_IMetInst = get_valueClassForBinding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueClassForBinding_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, binding);
		valueClassForBinding_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend view_stringForToolTip_point_userData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_view_stringForToolTip_point_userData_IMetInst(){
		return ((view_stringForToolTip_point_userData_IMetInst != null)
	? (view_stringForToolTip_point_userData_IMetInst)
	: (view_stringForToolTip_point_userData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "view:stringForToolTip:point:userData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString view_stringForToolTip_point_userData(final com.apple.jobjc.appkit.NSView view, final long tag, final com.apple.jobjc.foundation.NSPoint point, final com.apple.jobjc.Pointer<Void> data){
			final com.apple.jobjc.Invoke.MsgSend view_stringForToolTip_point_userData_IMetInst = get_view_stringForToolTip_point_userData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		view_stringForToolTip_point_userData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, data);
		view_stringForToolTip_point_userData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend viewSizeChanged_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_viewSizeChanged_IMetInst(){
		return ((viewSizeChanged_IMetInst != null)
	? (viewSizeChanged_IMetInst)
	: (viewSizeChanged_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "viewSizeChanged:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void viewSizeChanged(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend viewSizeChanged_IMetInst = get_viewSizeChanged_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		viewSizeChanged_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		viewSizeChanged_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend visibleCharacterRanges_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_visibleCharacterRanges_IMetInst(){
		return ((visibleCharacterRanges_IMetInst != null)
	? (visibleCharacterRanges_IMetInst)
	: (visibleCharacterRanges_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "visibleCharacterRanges", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray visibleCharacterRanges(){
			final com.apple.jobjc.Invoke.MsgSend visibleCharacterRanges_IMetInst = get_visibleCharacterRanges_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		visibleCharacterRanges_IMetInst.init(nativeBuffer, this);
		visibleCharacterRanges_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend wantsPeriodicDraggingUpdates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_wantsPeriodicDraggingUpdates_IMetInst(){
		return ((wantsPeriodicDraggingUpdates_IMetInst != null)
	? (wantsPeriodicDraggingUpdates_IMetInst)
	: (wantsPeriodicDraggingUpdates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "wantsPeriodicDraggingUpdates", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean wantsPeriodicDraggingUpdates(){
			final com.apple.jobjc.Invoke.MsgSend wantsPeriodicDraggingUpdates_IMetInst = get_wantsPeriodicDraggingUpdates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		wantsPeriodicDraggingUpdates_IMetInst.init(nativeBuffer, this);
		wantsPeriodicDraggingUpdates_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend wantsToDelayTextChangeNotifications_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_wantsToDelayTextChangeNotifications_IMetInst(){
		return ((wantsToDelayTextChangeNotifications_IMetInst != null)
	? (wantsToDelayTextChangeNotifications_IMetInst)
	: (wantsToDelayTextChangeNotifications_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "wantsToDelayTextChangeNotifications", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean wantsToDelayTextChangeNotifications(){
			final com.apple.jobjc.Invoke.MsgSend wantsToDelayTextChangeNotifications_IMetInst = get_wantsToDelayTextChangeNotifications_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		wantsToDelayTextChangeNotifications_IMetInst.init(nativeBuffer, this);
		wantsToDelayTextChangeNotifications_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend wantsToHandleMouseEvents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_wantsToHandleMouseEvents_IMetInst(){
		return ((wantsToHandleMouseEvents_IMetInst != null)
	? (wantsToHandleMouseEvents_IMetInst)
	: (wantsToHandleMouseEvents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "wantsToHandleMouseEvents", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean wantsToHandleMouseEvents(){
			final com.apple.jobjc.Invoke.MsgSend wantsToHandleMouseEvents_IMetInst = get_wantsToHandleMouseEvents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		wantsToHandleMouseEvents_IMetInst.init(nativeBuffer, this);
		wantsToHandleMouseEvents_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend wantsToInterpretAllKeystrokes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_wantsToInterpretAllKeystrokes_IMetInst(){
		return ((wantsToInterpretAllKeystrokes_IMetInst != null)
	? (wantsToInterpretAllKeystrokes_IMetInst)
	: (wantsToInterpretAllKeystrokes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "wantsToInterpretAllKeystrokes", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean wantsToInterpretAllKeystrokes(){
			final com.apple.jobjc.Invoke.MsgSend wantsToInterpretAllKeystrokes_IMetInst = get_wantsToInterpretAllKeystrokes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		wantsToInterpretAllKeystrokes_IMetInst.init(nativeBuffer, this);
		wantsToInterpretAllKeystrokes_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend wantsToTrackMouse_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_wantsToTrackMouse_IMetInst(){
		return ((wantsToTrackMouse_IMetInst != null)
	? (wantsToTrackMouse_IMetInst)
	: (wantsToTrackMouse_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "wantsToTrackMouse", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean wantsToTrackMouse(){
			final com.apple.jobjc.Invoke.MsgSend wantsToTrackMouse_IMetInst = get_wantsToTrackMouse_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		wantsToTrackMouse_IMetInst.init(nativeBuffer, this);
		wantsToTrackMouse_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend wantsToTrackMouseForEvent_inRect_ofView_atCharacterIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_wantsToTrackMouseForEvent_inRect_ofView_atCharacterIndex_IMetInst(){
		return ((wantsToTrackMouseForEvent_inRect_ofView_atCharacterIndex_IMetInst != null)
	? (wantsToTrackMouseForEvent_inRect_ofView_atCharacterIndex_IMetInst)
	: (wantsToTrackMouseForEvent_inRect_ofView_atCharacterIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "wantsToTrackMouseForEvent:inRect:ofView:atCharacterIndex:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean wantsToTrackMouseForEvent_inRect_ofView_atCharacterIndex(final com.apple.jobjc.appkit.NSEvent theEvent, final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView, final long charIndex){
			final com.apple.jobjc.Invoke.MsgSend wantsToTrackMouseForEvent_inRect_ofView_atCharacterIndex_IMetInst = get_wantsToTrackMouseForEvent_inRect_ofView_atCharacterIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		wantsToTrackMouseForEvent_inRect_ofView_atCharacterIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		wantsToTrackMouseForEvent_inRect_ofView_atCharacterIndex_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend window_didDecodeRestorableState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_window_didDecodeRestorableState_IMetInst(){
		return ((window_didDecodeRestorableState_IMetInst != null)
	? (window_didDecodeRestorableState_IMetInst)
	: (window_didDecodeRestorableState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "window:didDecodeRestorableState:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void window_didDecodeRestorableState(final com.apple.jobjc.appkit.NSWindow window, final com.apple.jobjc.foundation.NSCoder state){
			final com.apple.jobjc.Invoke.MsgSend window_didDecodeRestorableState_IMetInst = get_window_didDecodeRestorableState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		window_didDecodeRestorableState_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, state);
		window_didDecodeRestorableState_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend window_shouldDragDocumentWithEvent_from_withPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_window_shouldDragDocumentWithEvent_from_withPasteboard_IMetInst(){
		return ((window_shouldDragDocumentWithEvent_from_withPasteboard_IMetInst != null)
	? (window_shouldDragDocumentWithEvent_from_withPasteboard_IMetInst)
	: (window_shouldDragDocumentWithEvent_from_withPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "window:shouldDragDocumentWithEvent:from:withPasteboard:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean window_shouldDragDocumentWithEvent_from_withPasteboard(final com.apple.jobjc.appkit.NSWindow window, final com.apple.jobjc.appkit.NSEvent event, final com.apple.jobjc.foundation.NSPoint dragImageLocation, final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend window_shouldDragDocumentWithEvent_from_withPasteboard_IMetInst = get_window_shouldDragDocumentWithEvent_from_withPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		window_shouldDragDocumentWithEvent_from_withPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, dragImageLocation);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		window_shouldDragDocumentWithEvent_from_withPasteboard_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend window_shouldPopUpDocumentPathMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_window_shouldPopUpDocumentPathMenu_IMetInst(){
		return ((window_shouldPopUpDocumentPathMenu_IMetInst != null)
	? (window_shouldPopUpDocumentPathMenu_IMetInst)
	: (window_shouldPopUpDocumentPathMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "window:shouldPopUpDocumentPathMenu:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean window_shouldPopUpDocumentPathMenu(final com.apple.jobjc.appkit.NSWindow window, final com.apple.jobjc.appkit.NSMenu menu){
			final com.apple.jobjc.Invoke.MsgSend window_shouldPopUpDocumentPathMenu_IMetInst = get_window_shouldPopUpDocumentPathMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		window_shouldPopUpDocumentPathMenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		window_shouldPopUpDocumentPathMenu_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend window_startCustomAnimationToEnterFullScreenWithDuration_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_window_startCustomAnimationToEnterFullScreenWithDuration_IMetInst(){
		return ((window_startCustomAnimationToEnterFullScreenWithDuration_IMetInst != null)
	? (window_startCustomAnimationToEnterFullScreenWithDuration_IMetInst)
	: (window_startCustomAnimationToEnterFullScreenWithDuration_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "window:startCustomAnimationToEnterFullScreenWithDuration:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void window_startCustomAnimationToEnterFullScreenWithDuration(final com.apple.jobjc.appkit.NSWindow window, final double duration){
			final com.apple.jobjc.Invoke.MsgSend window_startCustomAnimationToEnterFullScreenWithDuration_IMetInst = get_window_startCustomAnimationToEnterFullScreenWithDuration_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		window_startCustomAnimationToEnterFullScreenWithDuration_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, duration);
		window_startCustomAnimationToEnterFullScreenWithDuration_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend window_startCustomAnimationToExitFullScreenWithDuration_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_window_startCustomAnimationToExitFullScreenWithDuration_IMetInst(){
		return ((window_startCustomAnimationToExitFullScreenWithDuration_IMetInst != null)
	? (window_startCustomAnimationToExitFullScreenWithDuration_IMetInst)
	: (window_startCustomAnimationToExitFullScreenWithDuration_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "window:startCustomAnimationToExitFullScreenWithDuration:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void window_startCustomAnimationToExitFullScreenWithDuration(final com.apple.jobjc.appkit.NSWindow window, final double duration){
			final com.apple.jobjc.Invoke.MsgSend window_startCustomAnimationToExitFullScreenWithDuration_IMetInst = get_window_startCustomAnimationToExitFullScreenWithDuration_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		window_startCustomAnimationToExitFullScreenWithDuration_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, duration);
		window_startCustomAnimationToExitFullScreenWithDuration_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend window_willEncodeRestorableState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_window_willEncodeRestorableState_IMetInst(){
		return ((window_willEncodeRestorableState_IMetInst != null)
	? (window_willEncodeRestorableState_IMetInst)
	: (window_willEncodeRestorableState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "window:willEncodeRestorableState:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void window_willEncodeRestorableState(final com.apple.jobjc.appkit.NSWindow window, final com.apple.jobjc.foundation.NSCoder state){
			final com.apple.jobjc.Invoke.MsgSend window_willEncodeRestorableState_IMetInst = get_window_willEncodeRestorableState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		window_willEncodeRestorableState_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, state);
		window_willEncodeRestorableState_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend window_willPositionSheet_usingRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_window_willPositionSheet_usingRect_IMetInst(){
		return ((window_willPositionSheet_usingRect_IMetInst != null)
	? (window_willPositionSheet_usingRect_IMetInst)
	: (window_willPositionSheet_usingRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "window:willPositionSheet:usingRect:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect window_willPositionSheet_usingRect(final com.apple.jobjc.appkit.NSWindow window, final com.apple.jobjc.appkit.NSWindow sheet, final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend window_willPositionSheet_usingRect_IMetInst = get_window_willPositionSheet_usingRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		window_willPositionSheet_usingRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sheet);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		window_willPositionSheet_usingRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend window_willResizeForVersionBrowserWithMaxPreferredSize_maxAllowedSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_window_willResizeForVersionBrowserWithMaxPreferredSize_maxAllowedSize_IMetInst(){
		return ((window_willResizeForVersionBrowserWithMaxPreferredSize_maxAllowedSize_IMetInst != null)
	? (window_willResizeForVersionBrowserWithMaxPreferredSize_maxAllowedSize_IMetInst)
	: (window_willResizeForVersionBrowserWithMaxPreferredSize_maxAllowedSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "window:willResizeForVersionBrowserWithMaxPreferredSize:maxAllowedSize:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize window_willResizeForVersionBrowserWithMaxPreferredSize_maxAllowedSize(final com.apple.jobjc.appkit.NSWindow window, final com.apple.jobjc.foundation.NSSize maxPreferredFrameSize, final com.apple.jobjc.foundation.NSSize maxAllowedFrameSize){
			final com.apple.jobjc.Invoke.MsgSend window_willResizeForVersionBrowserWithMaxPreferredSize_maxAllowedSize_IMetInst = get_window_willResizeForVersionBrowserWithMaxPreferredSize_maxAllowedSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		window_willResizeForVersionBrowserWithMaxPreferredSize_maxAllowedSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, maxPreferredFrameSize);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, maxAllowedFrameSize);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		window_willResizeForVersionBrowserWithMaxPreferredSize_maxAllowedSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend window_willUseFullScreenContentSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_window_willUseFullScreenContentSize_IMetInst(){
		return ((window_willUseFullScreenContentSize_IMetInst != null)
	? (window_willUseFullScreenContentSize_IMetInst)
	: (window_willUseFullScreenContentSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "window:willUseFullScreenContentSize:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize window_willUseFullScreenContentSize(final com.apple.jobjc.appkit.NSWindow window, final com.apple.jobjc.foundation.NSSize proposedSize){
			final com.apple.jobjc.Invoke.MsgSend window_willUseFullScreenContentSize_IMetInst = get_window_willUseFullScreenContentSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		window_willUseFullScreenContentSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, proposedSize);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		window_willUseFullScreenContentSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend window_willUseFullScreenPresentationOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_window_willUseFullScreenPresentationOptions_IMetInst(){
		return ((window_willUseFullScreenPresentationOptions_IMetInst != null)
	? (window_willUseFullScreenPresentationOptions_IMetInst)
	: (window_willUseFullScreenPresentationOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "window:willUseFullScreenPresentationOptions:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long window_willUseFullScreenPresentationOptions(final com.apple.jobjc.appkit.NSWindow window, final long proposedOptions){
			final com.apple.jobjc.Invoke.MsgSend window_willUseFullScreenPresentationOptions_IMetInst = get_window_willUseFullScreenPresentationOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		window_willUseFullScreenPresentationOptions_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, proposedOptions);
		window_willUseFullScreenPresentationOptions_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidBecomeKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidBecomeKey_IMetInst(){
		return ((windowDidBecomeKey_IMetInst != null)
	? (windowDidBecomeKey_IMetInst)
	: (windowDidBecomeKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidBecomeKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidBecomeKey(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowDidBecomeKey_IMetInst = get_windowDidBecomeKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidBecomeKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowDidBecomeKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidBecomeMain_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidBecomeMain_IMetInst(){
		return ((windowDidBecomeMain_IMetInst != null)
	? (windowDidBecomeMain_IMetInst)
	: (windowDidBecomeMain_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidBecomeMain:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidBecomeMain(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowDidBecomeMain_IMetInst = get_windowDidBecomeMain_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidBecomeMain_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowDidBecomeMain_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidChangeBackingProperties_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidChangeBackingProperties_IMetInst(){
		return ((windowDidChangeBackingProperties_IMetInst != null)
	? (windowDidChangeBackingProperties_IMetInst)
	: (windowDidChangeBackingProperties_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidChangeBackingProperties:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidChangeBackingProperties(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowDidChangeBackingProperties_IMetInst = get_windowDidChangeBackingProperties_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidChangeBackingProperties_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowDidChangeBackingProperties_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidChangeScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidChangeScreen_IMetInst(){
		return ((windowDidChangeScreen_IMetInst != null)
	? (windowDidChangeScreen_IMetInst)
	: (windowDidChangeScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidChangeScreen:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidChangeScreen(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowDidChangeScreen_IMetInst = get_windowDidChangeScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidChangeScreen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowDidChangeScreen_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidChangeScreenProfile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidChangeScreenProfile_IMetInst(){
		return ((windowDidChangeScreenProfile_IMetInst != null)
	? (windowDidChangeScreenProfile_IMetInst)
	: (windowDidChangeScreenProfile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidChangeScreenProfile:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidChangeScreenProfile(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowDidChangeScreenProfile_IMetInst = get_windowDidChangeScreenProfile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidChangeScreenProfile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowDidChangeScreenProfile_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidDeminiaturize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidDeminiaturize_IMetInst(){
		return ((windowDidDeminiaturize_IMetInst != null)
	? (windowDidDeminiaturize_IMetInst)
	: (windowDidDeminiaturize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidDeminiaturize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidDeminiaturize(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowDidDeminiaturize_IMetInst = get_windowDidDeminiaturize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidDeminiaturize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowDidDeminiaturize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidEndLiveResize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidEndLiveResize_IMetInst(){
		return ((windowDidEndLiveResize_IMetInst != null)
	? (windowDidEndLiveResize_IMetInst)
	: (windowDidEndLiveResize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidEndLiveResize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidEndLiveResize(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowDidEndLiveResize_IMetInst = get_windowDidEndLiveResize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidEndLiveResize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowDidEndLiveResize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidEndSheet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidEndSheet_IMetInst(){
		return ((windowDidEndSheet_IMetInst != null)
	? (windowDidEndSheet_IMetInst)
	: (windowDidEndSheet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidEndSheet:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidEndSheet(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowDidEndSheet_IMetInst = get_windowDidEndSheet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidEndSheet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowDidEndSheet_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidEnterFullScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidEnterFullScreen_IMetInst(){
		return ((windowDidEnterFullScreen_IMetInst != null)
	? (windowDidEnterFullScreen_IMetInst)
	: (windowDidEnterFullScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidEnterFullScreen:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidEnterFullScreen(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowDidEnterFullScreen_IMetInst = get_windowDidEnterFullScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidEnterFullScreen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowDidEnterFullScreen_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidEnterVersionBrowser_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidEnterVersionBrowser_IMetInst(){
		return ((windowDidEnterVersionBrowser_IMetInst != null)
	? (windowDidEnterVersionBrowser_IMetInst)
	: (windowDidEnterVersionBrowser_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidEnterVersionBrowser:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidEnterVersionBrowser(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowDidEnterVersionBrowser_IMetInst = get_windowDidEnterVersionBrowser_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidEnterVersionBrowser_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowDidEnterVersionBrowser_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidExitFullScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidExitFullScreen_IMetInst(){
		return ((windowDidExitFullScreen_IMetInst != null)
	? (windowDidExitFullScreen_IMetInst)
	: (windowDidExitFullScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidExitFullScreen:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidExitFullScreen(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowDidExitFullScreen_IMetInst = get_windowDidExitFullScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidExitFullScreen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowDidExitFullScreen_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidExitVersionBrowser_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidExitVersionBrowser_IMetInst(){
		return ((windowDidExitVersionBrowser_IMetInst != null)
	? (windowDidExitVersionBrowser_IMetInst)
	: (windowDidExitVersionBrowser_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidExitVersionBrowser:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidExitVersionBrowser(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowDidExitVersionBrowser_IMetInst = get_windowDidExitVersionBrowser_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidExitVersionBrowser_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowDidExitVersionBrowser_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidExpose_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidExpose_IMetInst(){
		return ((windowDidExpose_IMetInst != null)
	? (windowDidExpose_IMetInst)
	: (windowDidExpose_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidExpose:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidExpose(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowDidExpose_IMetInst = get_windowDidExpose_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidExpose_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowDidExpose_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidFailToEnterFullScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidFailToEnterFullScreen_IMetInst(){
		return ((windowDidFailToEnterFullScreen_IMetInst != null)
	? (windowDidFailToEnterFullScreen_IMetInst)
	: (windowDidFailToEnterFullScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidFailToEnterFullScreen:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidFailToEnterFullScreen(final com.apple.jobjc.appkit.NSWindow window){
			final com.apple.jobjc.Invoke.MsgSend windowDidFailToEnterFullScreen_IMetInst = get_windowDidFailToEnterFullScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidFailToEnterFullScreen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		windowDidFailToEnterFullScreen_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidFailToExitFullScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidFailToExitFullScreen_IMetInst(){
		return ((windowDidFailToExitFullScreen_IMetInst != null)
	? (windowDidFailToExitFullScreen_IMetInst)
	: (windowDidFailToExitFullScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidFailToExitFullScreen:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidFailToExitFullScreen(final com.apple.jobjc.appkit.NSWindow window){
			final com.apple.jobjc.Invoke.MsgSend windowDidFailToExitFullScreen_IMetInst = get_windowDidFailToExitFullScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidFailToExitFullScreen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		windowDidFailToExitFullScreen_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidMiniaturize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidMiniaturize_IMetInst(){
		return ((windowDidMiniaturize_IMetInst != null)
	? (windowDidMiniaturize_IMetInst)
	: (windowDidMiniaturize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidMiniaturize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidMiniaturize(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowDidMiniaturize_IMetInst = get_windowDidMiniaturize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidMiniaturize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowDidMiniaturize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidMove_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidMove_IMetInst(){
		return ((windowDidMove_IMetInst != null)
	? (windowDidMove_IMetInst)
	: (windowDidMove_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidMove:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidMove(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowDidMove_IMetInst = get_windowDidMove_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidMove_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowDidMove_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidResignKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidResignKey_IMetInst(){
		return ((windowDidResignKey_IMetInst != null)
	? (windowDidResignKey_IMetInst)
	: (windowDidResignKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidResignKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidResignKey(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowDidResignKey_IMetInst = get_windowDidResignKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidResignKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowDidResignKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidResignMain_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidResignMain_IMetInst(){
		return ((windowDidResignMain_IMetInst != null)
	? (windowDidResignMain_IMetInst)
	: (windowDidResignMain_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidResignMain:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidResignMain(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowDidResignMain_IMetInst = get_windowDidResignMain_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidResignMain_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowDidResignMain_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidResize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidResize_IMetInst(){
		return ((windowDidResize_IMetInst != null)
	? (windowDidResize_IMetInst)
	: (windowDidResize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidResize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidResize(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowDidResize_IMetInst = get_windowDidResize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidResize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowDidResize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidUpdate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidUpdate_IMetInst(){
		return ((windowDidUpdate_IMetInst != null)
	? (windowDidUpdate_IMetInst)
	: (windowDidUpdate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidUpdate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowDidUpdate(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowDidUpdate_IMetInst = get_windowDidUpdate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidUpdate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowDidUpdate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowLevel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowLevel_IMetInst(){
		return ((windowLevel_IMetInst != null)
	? (windowLevel_IMetInst)
	: (windowLevel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowLevel", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long windowLevel(){
			final com.apple.jobjc.Invoke.MsgSend windowLevel_IMetInst = get_windowLevel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowLevel_IMetInst.init(nativeBuffer, this);
		windowLevel_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowShouldClose_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowShouldClose_IMetInst(){
		return ((windowShouldClose_IMetInst != null)
	? (windowShouldClose_IMetInst)
	: (windowShouldClose_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowShouldClose:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean windowShouldClose(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend windowShouldClose_IMetInst = get_windowShouldClose_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowShouldClose_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		windowShouldClose_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowShouldZoom_toFrame_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowShouldZoom_toFrame_IMetInst(){
		return ((windowShouldZoom_toFrame_IMetInst != null)
	? (windowShouldZoom_toFrame_IMetInst)
	: (windowShouldZoom_toFrame_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowShouldZoom:toFrame:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public boolean windowShouldZoom_toFrame(final com.apple.jobjc.appkit.NSWindow window, final com.apple.jobjc.foundation.NSRect newFrame){
			final com.apple.jobjc.Invoke.MsgSend windowShouldZoom_toFrame_IMetInst = get_windowShouldZoom_toFrame_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowShouldZoom_toFrame_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, newFrame);
		windowShouldZoom_toFrame_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowWillBeginSheet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowWillBeginSheet_IMetInst(){
		return ((windowWillBeginSheet_IMetInst != null)
	? (windowWillBeginSheet_IMetInst)
	: (windowWillBeginSheet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowWillBeginSheet:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowWillBeginSheet(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowWillBeginSheet_IMetInst = get_windowWillBeginSheet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowWillBeginSheet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowWillBeginSheet_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowWillClose_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowWillClose_IMetInst(){
		return ((windowWillClose_IMetInst != null)
	? (windowWillClose_IMetInst)
	: (windowWillClose_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowWillClose:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowWillClose(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowWillClose_IMetInst = get_windowWillClose_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowWillClose_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowWillClose_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowWillEnterFullScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowWillEnterFullScreen_IMetInst(){
		return ((windowWillEnterFullScreen_IMetInst != null)
	? (windowWillEnterFullScreen_IMetInst)
	: (windowWillEnterFullScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowWillEnterFullScreen:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowWillEnterFullScreen(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowWillEnterFullScreen_IMetInst = get_windowWillEnterFullScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowWillEnterFullScreen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowWillEnterFullScreen_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowWillEnterVersionBrowser_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowWillEnterVersionBrowser_IMetInst(){
		return ((windowWillEnterVersionBrowser_IMetInst != null)
	? (windowWillEnterVersionBrowser_IMetInst)
	: (windowWillEnterVersionBrowser_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowWillEnterVersionBrowser:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowWillEnterVersionBrowser(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowWillEnterVersionBrowser_IMetInst = get_windowWillEnterVersionBrowser_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowWillEnterVersionBrowser_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowWillEnterVersionBrowser_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowWillExitFullScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowWillExitFullScreen_IMetInst(){
		return ((windowWillExitFullScreen_IMetInst != null)
	? (windowWillExitFullScreen_IMetInst)
	: (windowWillExitFullScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowWillExitFullScreen:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowWillExitFullScreen(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowWillExitFullScreen_IMetInst = get_windowWillExitFullScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowWillExitFullScreen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowWillExitFullScreen_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowWillExitVersionBrowser_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowWillExitVersionBrowser_IMetInst(){
		return ((windowWillExitVersionBrowser_IMetInst != null)
	? (windowWillExitVersionBrowser_IMetInst)
	: (windowWillExitVersionBrowser_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowWillExitVersionBrowser:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowWillExitVersionBrowser(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowWillExitVersionBrowser_IMetInst = get_windowWillExitVersionBrowser_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowWillExitVersionBrowser_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowWillExitVersionBrowser_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowWillMiniaturize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowWillMiniaturize_IMetInst(){
		return ((windowWillMiniaturize_IMetInst != null)
	? (windowWillMiniaturize_IMetInst)
	: (windowWillMiniaturize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowWillMiniaturize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowWillMiniaturize(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowWillMiniaturize_IMetInst = get_windowWillMiniaturize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowWillMiniaturize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowWillMiniaturize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowWillMove_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowWillMove_IMetInst(){
		return ((windowWillMove_IMetInst != null)
	? (windowWillMove_IMetInst)
	: (windowWillMove_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowWillMove:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowWillMove(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowWillMove_IMetInst = get_windowWillMove_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowWillMove_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowWillMove_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowWillResize_toSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowWillResize_toSize_IMetInst(){
		return ((windowWillResize_toSize_IMetInst != null)
	? (windowWillResize_toSize_IMetInst)
	: (windowWillResize_toSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowWillResize:toSize:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize windowWillResize_toSize(final com.apple.jobjc.appkit.NSWindow sender, final com.apple.jobjc.foundation.NSSize frameSize){
			final com.apple.jobjc.Invoke.MsgSend windowWillResize_toSize_IMetInst = get_windowWillResize_toSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowWillResize_toSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, frameSize);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		windowWillResize_toSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowWillReturnFieldEditor_toObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowWillReturnFieldEditor_toObject_IMetInst(){
		return ((windowWillReturnFieldEditor_toObject_IMetInst != null)
	? (windowWillReturnFieldEditor_toObject_IMetInst)
	: (windowWillReturnFieldEditor_toObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowWillReturnFieldEditor:toObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T windowWillReturnFieldEditor_toObject(final com.apple.jobjc.appkit.NSWindow sender, final com.apple.jobjc.ID client){
			final com.apple.jobjc.Invoke.MsgSend windowWillReturnFieldEditor_toObject_IMetInst = get_windowWillReturnFieldEditor_toObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowWillReturnFieldEditor_toObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, client);
		windowWillReturnFieldEditor_toObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowWillReturnUndoManager_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowWillReturnUndoManager_IMetInst(){
		return ((windowWillReturnUndoManager_IMetInst != null)
	? (windowWillReturnUndoManager_IMetInst)
	: (windowWillReturnUndoManager_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowWillReturnUndoManager:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSUndoManager windowWillReturnUndoManager(final com.apple.jobjc.appkit.NSWindow window){
			final com.apple.jobjc.Invoke.MsgSend windowWillReturnUndoManager_IMetInst = get_windowWillReturnUndoManager_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowWillReturnUndoManager_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		windowWillReturnUndoManager_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSUndoManager returnValue = (com.apple.jobjc.foundation.NSUndoManager) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowWillStartLiveResize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowWillStartLiveResize_IMetInst(){
		return ((windowWillStartLiveResize_IMetInst != null)
	? (windowWillStartLiveResize_IMetInst)
	: (windowWillStartLiveResize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowWillStartLiveResize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowWillStartLiveResize(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend windowWillStartLiveResize_IMetInst = get_windowWillStartLiveResize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowWillStartLiveResize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		windowWillStartLiveResize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowWillUseStandardFrame_defaultFrame_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowWillUseStandardFrame_defaultFrame_IMetInst(){
		return ((windowWillUseStandardFrame_defaultFrame_IMetInst != null)
	? (windowWillUseStandardFrame_defaultFrame_IMetInst)
	: (windowWillUseStandardFrame_defaultFrame_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowWillUseStandardFrame:defaultFrame:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect windowWillUseStandardFrame_defaultFrame(final com.apple.jobjc.appkit.NSWindow window, final com.apple.jobjc.foundation.NSRect newFrame){
			final com.apple.jobjc.Invoke.MsgSend windowWillUseStandardFrame_defaultFrame_IMetInst = get_windowWillUseStandardFrame_defaultFrame_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowWillUseStandardFrame_defaultFrame_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, newFrame);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		windowWillUseStandardFrame_defaultFrame_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writableTypesForPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writableTypesForPasteboard_IMetInst(){
		return ((writableTypesForPasteboard_IMetInst != null)
	? (writableTypesForPasteboard_IMetInst)
	: (writableTypesForPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writableTypesForPasteboard:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray writableTypesForPasteboard(final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend writableTypesForPasteboard_IMetInst = get_writableTypesForPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writableTypesForPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		writableTypesForPasteboard_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeSelectionToPasteboard_types_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeSelectionToPasteboard_types_IMetInst(){
		return ((writeSelectionToPasteboard_types_IMetInst != null)
	? (writeSelectionToPasteboard_types_IMetInst)
	: (writeSelectionToPasteboard_types_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeSelectionToPasteboard:types:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean writeSelectionToPasteboard_types(final com.apple.jobjc.appkit.NSPasteboard pboard, final com.apple.jobjc.foundation.NSArray types){
			final com.apple.jobjc.Invoke.MsgSend writeSelectionToPasteboard_types_IMetInst = get_writeSelectionToPasteboard_types_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeSelectionToPasteboard_types_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pboard);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, types);
		writeSelectionToPasteboard_types_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writingOptionsForType_pasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writingOptionsForType_pasteboard_IMetInst(){
		return ((writingOptionsForType_pasteboard_IMetInst != null)
	? (writingOptionsForType_pasteboard_IMetInst)
	: (writingOptionsForType_pasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writingOptionsForType:pasteboard:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long writingOptionsForType_pasteboard(final com.apple.jobjc.foundation.NSString type, final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend writingOptionsForType_pasteboard_IMetInst = get_writingOptionsForType_pasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writingOptionsForType_pasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		writingOptionsForType_pasteboard_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
