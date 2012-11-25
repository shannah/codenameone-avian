package com.apple.jobjc.foundation;

public  class NSMutableAttributedString extends com.apple.jobjc.foundation.NSAttributedString {
	public NSMutableAttributedString(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMutableAttributedString(final NSMutableAttributedString obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addAttribute_value_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addAttribute_value_range_IMetInst(){
		return ((addAttribute_value_range_IMetInst != null)
	? (addAttribute_value_range_IMetInst)
	: (addAttribute_value_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addAttribute:value:range:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void addAttribute_value_range(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.ID value, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend addAttribute_value_range_IMetInst = get_addAttribute_value_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addAttribute_value_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		addAttribute_value_range_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addAttributes_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addAttributes_range_IMetInst(){
		return ((addAttributes_range_IMetInst != null)
	? (addAttributes_range_IMetInst)
	: (addAttributes_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addAttributes:range:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void addAttributes_range(final com.apple.jobjc.foundation.NSDictionary attrs, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend addAttributes_range_IMetInst = get_addAttributes_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addAttributes_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrs);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		addAttributes_range_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend appendAttributedString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appendAttributedString_IMetInst(){
		return ((appendAttributedString_IMetInst != null)
	? (appendAttributedString_IMetInst)
	: (appendAttributedString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appendAttributedString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void appendAttributedString(final com.apple.jobjc.foundation.NSAttributedString attrString){
			final com.apple.jobjc.Invoke.MsgSend appendAttributedString_IMetInst = get_appendAttributedString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appendAttributedString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrString);
		appendAttributedString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend beginEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginEditing_IMetInst(){
		return ((beginEditing_IMetInst != null)
	? (beginEditing_IMetInst)
	: (beginEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginEditing", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void beginEditing(){
			final com.apple.jobjc.Invoke.MsgSend beginEditing_IMetInst = get_beginEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginEditing_IMetInst.init(nativeBuffer, this);
		beginEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend deleteCharactersInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deleteCharactersInRange_IMetInst(){
		return ((deleteCharactersInRange_IMetInst != null)
	? (deleteCharactersInRange_IMetInst)
	: (deleteCharactersInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deleteCharactersInRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void deleteCharactersInRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend deleteCharactersInRange_IMetInst = get_deleteCharactersInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deleteCharactersInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		deleteCharactersInRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend endEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_endEditing_IMetInst(){
		return ((endEditing_IMetInst != null)
	? (endEditing_IMetInst)
	: (endEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "endEditing", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void endEditing(){
			final com.apple.jobjc.Invoke.MsgSend endEditing_IMetInst = get_endEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		endEditing_IMetInst.init(nativeBuffer, this);
		endEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertAttributedString_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertAttributedString_atIndex_IMetInst(){
		return ((insertAttributedString_atIndex_IMetInst != null)
	? (insertAttributedString_atIndex_IMetInst)
	: (insertAttributedString_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertAttributedString:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void insertAttributedString_atIndex(final com.apple.jobjc.foundation.NSAttributedString attrString, final long loc){
			final com.apple.jobjc.Invoke.MsgSend insertAttributedString_atIndex_IMetInst = get_insertAttributedString_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertAttributedString_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrString);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, loc);
		insertAttributedString_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend mutableString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mutableString_IMetInst(){
		return ((mutableString_IMetInst != null)
	? (mutableString_IMetInst)
	: (mutableString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mutableString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMutableString mutableString(){
			final com.apple.jobjc.Invoke.MsgSend mutableString_IMetInst = get_mutableString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mutableString_IMetInst.init(nativeBuffer, this);
		mutableString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMutableString returnValue = (com.apple.jobjc.foundation.NSMutableString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeAttribute_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeAttribute_range_IMetInst(){
		return ((removeAttribute_range_IMetInst != null)
	? (removeAttribute_range_IMetInst)
	: (removeAttribute_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeAttribute:range:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void removeAttribute_range(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend removeAttribute_range_IMetInst = get_removeAttribute_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeAttribute_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		removeAttribute_range_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceCharactersInRange_withAttributedString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceCharactersInRange_withAttributedString_IMetInst(){
		return ((replaceCharactersInRange_withAttributedString_IMetInst != null)
	? (replaceCharactersInRange_withAttributedString_IMetInst)
	: (replaceCharactersInRange_withAttributedString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceCharactersInRange:withAttributedString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void replaceCharactersInRange_withAttributedString(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSAttributedString attrString){
			final com.apple.jobjc.Invoke.MsgSend replaceCharactersInRange_withAttributedString_IMetInst = get_replaceCharactersInRange_withAttributedString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceCharactersInRange_withAttributedString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrString);
		replaceCharactersInRange_withAttributedString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceCharactersInRange_withString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceCharactersInRange_withString_IMetInst(){
		return ((replaceCharactersInRange_withString_IMetInst != null)
	? (replaceCharactersInRange_withString_IMetInst)
	: (replaceCharactersInRange_withString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceCharactersInRange:withString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void replaceCharactersInRange_withString(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString str){
			final com.apple.jobjc.Invoke.MsgSend replaceCharactersInRange_withString_IMetInst = get_replaceCharactersInRange_withString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceCharactersInRange_withString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, str);
		replaceCharactersInRange_withString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttributedString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttributedString_IMetInst(){
		return ((setAttributedString_IMetInst != null)
	? (setAttributedString_IMetInst)
	: (setAttributedString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttributedString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAttributedString(final com.apple.jobjc.foundation.NSAttributedString attrString){
			final com.apple.jobjc.Invoke.MsgSend setAttributedString_IMetInst = get_setAttributedString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributedString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrString);
		setAttributedString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttributes_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttributes_range_IMetInst(){
		return ((setAttributes_range_IMetInst != null)
	? (setAttributes_range_IMetInst)
	: (setAttributes_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttributes:range:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setAttributes_range(final com.apple.jobjc.foundation.NSDictionary attrs, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend setAttributes_range_IMetInst = get_setAttributes_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributes_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrs);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		setAttributes_range_IMetInst.invoke(nativeBuffer);
		
		
	}

}
