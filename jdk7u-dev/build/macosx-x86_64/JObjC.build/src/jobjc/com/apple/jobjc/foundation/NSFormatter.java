package com.apple.jobjc.foundation;

public  class NSFormatter extends com.apple.jobjc.foundation.NSObject {
	public NSFormatter(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSFormatter(final NSFormatter obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend attributedStringForObjectValue_withDefaultAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributedStringForObjectValue_withDefaultAttributes_IMetInst(){
		return ((attributedStringForObjectValue_withDefaultAttributes_IMetInst != null)
	? (attributedStringForObjectValue_withDefaultAttributes_IMetInst)
	: (attributedStringForObjectValue_withDefaultAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributedStringForObjectValue:withDefaultAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAttributedString attributedStringForObjectValue_withDefaultAttributes(final com.apple.jobjc.ID obj, final com.apple.jobjc.foundation.NSDictionary attrs){
			final com.apple.jobjc.Invoke.MsgSend attributedStringForObjectValue_withDefaultAttributes_IMetInst = get_attributedStringForObjectValue_withDefaultAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributedStringForObjectValue_withDefaultAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrs);
		attributedStringForObjectValue_withDefaultAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend editingStringForObjectValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_editingStringForObjectValue_IMetInst(){
		return ((editingStringForObjectValue_IMetInst != null)
	? (editingStringForObjectValue_IMetInst)
	: (editingStringForObjectValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "editingStringForObjectValue:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString editingStringForObjectValue(final com.apple.jobjc.ID obj){
			final com.apple.jobjc.Invoke.MsgSend editingStringForObjectValue_IMetInst = get_editingStringForObjectValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		editingStringForObjectValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		editingStringForObjectValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getObjectValue_forString_errorDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getObjectValue_forString_errorDescription_IMetInst(){
		return ((getObjectValue_forString_errorDescription_IMetInst != null)
	? (getObjectValue_forString_errorDescription_IMetInst)
	: (getObjectValue_forString_errorDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getObjectValue:forString:errorDescription:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean getObjectValue_forString_errorDescription(final com.apple.jobjc.Pointer<com.apple.jobjc.ID> obj, final com.apple.jobjc.foundation.NSString string, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSString> error){
			final com.apple.jobjc.Invoke.MsgSend getObjectValue_forString_errorDescription_IMetInst = get_getObjectValue_forString_errorDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getObjectValue_forString_errorDescription_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, obj);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		getObjectValue_forString_errorDescription_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isPartialStringValid_newEditingString_errorDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isPartialStringValid_newEditingString_errorDescription_IMetInst(){
		return ((isPartialStringValid_newEditingString_errorDescription_IMetInst != null)
	? (isPartialStringValid_newEditingString_errorDescription_IMetInst)
	: (isPartialStringValid_newEditingString_errorDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isPartialStringValid:newEditingString:errorDescription:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean isPartialStringValid_newEditingString_errorDescription(final com.apple.jobjc.foundation.NSString partialString, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSString> newString, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSString> error){
			final com.apple.jobjc.Invoke.MsgSend isPartialStringValid_newEditingString_errorDescription_IMetInst = get_isPartialStringValid_newEditingString_errorDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isPartialStringValid_newEditingString_errorDescription_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, partialString);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, newString);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		isPartialStringValid_newEditingString_errorDescription_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isPartialStringValid_proposedSelectedRange_originalString_originalSelectedRange_errorDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isPartialStringValid_proposedSelectedRange_originalString_originalSelectedRange_errorDescription_IMetInst(){
		return ((isPartialStringValid_proposedSelectedRange_originalString_originalSelectedRange_errorDescription_IMetInst != null)
	? (isPartialStringValid_proposedSelectedRange_originalString_originalSelectedRange_errorDescription_IMetInst)
	: (isPartialStringValid_proposedSelectedRange_originalString_originalSelectedRange_errorDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isPartialStringValid:proposedSelectedRange:originalString:originalSelectedRange:errorDescription:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean isPartialStringValid_proposedSelectedRange_originalString_originalSelectedRange_errorDescription(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSString> partialStringPtr, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ proposedSelRangePtr, final com.apple.jobjc.foundation.NSString origString, final com.apple.jobjc.foundation.NSRange origSelRange, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSString> error){
			final com.apple.jobjc.Invoke.MsgSend isPartialStringValid_proposedSelectedRange_originalString_originalSelectedRange_errorDescription_IMetInst = get_isPartialStringValid_proposedSelectedRange_originalString_originalSelectedRange_errorDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isPartialStringValid_proposedSelectedRange_originalString_originalSelectedRange_errorDescription_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, partialStringPtr);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, proposedSelRangePtr);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, origString);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, origSelRange);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		isPartialStringValid_proposedSelectedRange_originalString_originalSelectedRange_errorDescription_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringForObjectValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringForObjectValue_IMetInst(){
		return ((stringForObjectValue_IMetInst != null)
	? (stringForObjectValue_IMetInst)
	: (stringForObjectValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringForObjectValue:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringForObjectValue(final com.apple.jobjc.ID obj){
			final com.apple.jobjc.Invoke.MsgSend stringForObjectValue_IMetInst = get_stringForObjectValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringForObjectValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		stringForObjectValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
