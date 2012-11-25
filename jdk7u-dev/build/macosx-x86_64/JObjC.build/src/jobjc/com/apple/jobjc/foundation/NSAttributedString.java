package com.apple.jobjc.foundation;

public  class NSAttributedString extends com.apple.jobjc.foundation.NSObject {
	public NSAttributedString(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSAttributedString(final NSAttributedString obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend attribute_atIndex_effectiveRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attribute_atIndex_effectiveRange_IMetInst(){
		return ((attribute_atIndex_effectiveRange_IMetInst != null)
	? (attribute_atIndex_effectiveRange_IMetInst)
	: (attribute_atIndex_effectiveRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attribute:atIndex:effectiveRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T attribute_atIndex_effectiveRange(final com.apple.jobjc.foundation.NSString attrName, final long location, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ range){
			final com.apple.jobjc.Invoke.MsgSend attribute_atIndex_effectiveRange_IMetInst = get_attribute_atIndex_effectiveRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attribute_atIndex_effectiveRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, location);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, range);
		attribute_atIndex_effectiveRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attribute_atIndex_longestEffectiveRange_inRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attribute_atIndex_longestEffectiveRange_inRange_IMetInst(){
		return ((attribute_atIndex_longestEffectiveRange_inRange_IMetInst != null)
	? (attribute_atIndex_longestEffectiveRange_inRange_IMetInst)
	: (attribute_atIndex_longestEffectiveRange_inRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attribute:atIndex:longestEffectiveRange:inRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public <T extends com.apple.jobjc.ID> T attribute_atIndex_longestEffectiveRange_inRange(final com.apple.jobjc.foundation.NSString attrName, final long location, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ range, final com.apple.jobjc.foundation.NSRange rangeLimit){
			final com.apple.jobjc.Invoke.MsgSend attribute_atIndex_longestEffectiveRange_inRange_IMetInst = get_attribute_atIndex_longestEffectiveRange_inRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attribute_atIndex_longestEffectiveRange_inRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, location);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, range);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, rangeLimit);
		attribute_atIndex_longestEffectiveRange_inRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributedSubstringFromRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributedSubstringFromRange_IMetInst(){
		return ((attributedSubstringFromRange_IMetInst != null)
	? (attributedSubstringFromRange_IMetInst)
	: (attributedSubstringFromRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributedSubstringFromRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSAttributedString attributedSubstringFromRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend attributedSubstringFromRange_IMetInst = get_attributedSubstringFromRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributedSubstringFromRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		attributedSubstringFromRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributesAtIndex_effectiveRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributesAtIndex_effectiveRange_IMetInst(){
		return ((attributesAtIndex_effectiveRange_IMetInst != null)
	? (attributesAtIndex_effectiveRange_IMetInst)
	: (attributesAtIndex_effectiveRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributesAtIndex:effectiveRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary attributesAtIndex_effectiveRange(final long location, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ range){
			final com.apple.jobjc.Invoke.MsgSend attributesAtIndex_effectiveRange_IMetInst = get_attributesAtIndex_effectiveRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributesAtIndex_effectiveRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, location);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, range);
		attributesAtIndex_effectiveRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributesAtIndex_longestEffectiveRange_inRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributesAtIndex_longestEffectiveRange_inRange_IMetInst(){
		return ((attributesAtIndex_longestEffectiveRange_inRange_IMetInst != null)
	? (attributesAtIndex_longestEffectiveRange_inRange_IMetInst)
	: (attributesAtIndex_longestEffectiveRange_inRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributesAtIndex:longestEffectiveRange:inRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSDictionary attributesAtIndex_longestEffectiveRange_inRange(final long location, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ range, final com.apple.jobjc.foundation.NSRange rangeLimit){
			final com.apple.jobjc.Invoke.MsgSend attributesAtIndex_longestEffectiveRange_inRange_IMetInst = get_attributesAtIndex_longestEffectiveRange_inRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributesAtIndex_longestEffectiveRange_inRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, location);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, range);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, rangeLimit);
		attributesAtIndex_longestEffectiveRange_inRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateAttribute_inRange_options_usingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateAttribute_inRange_options_usingBlock_IMetInst(){
		return ((enumerateAttribute_inRange_options_usingBlock_IMetInst != null)
	? (enumerateAttribute_inRange_options_usingBlock_IMetInst)
	: (enumerateAttribute_inRange_options_usingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateAttribute:inRange:options:usingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateAttribute_inRange_options_usingBlock(final com.apple.jobjc.foundation.NSString attrName, final com.apple.jobjc.foundation.NSRange enumerationRange, final long opts, final Object /* void(^)(id,NSRange,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateAttribute_inRange_options_usingBlock_IMetInst = get_enumerateAttribute_inRange_options_usingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateAttribute_inRange_options_usingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrName);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, enumerationRange);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateAttribute_inRange_options_usingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateAttributesInRange_options_usingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateAttributesInRange_options_usingBlock_IMetInst(){
		return ((enumerateAttributesInRange_options_usingBlock_IMetInst != null)
	? (enumerateAttributesInRange_options_usingBlock_IMetInst)
	: (enumerateAttributesInRange_options_usingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateAttributesInRange:options:usingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateAttributesInRange_options_usingBlock(final com.apple.jobjc.foundation.NSRange enumerationRange, final long opts, final Object /* void(^)(NSDictionary*,NSRange,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateAttributesInRange_options_usingBlock_IMetInst = get_enumerateAttributesInRange_options_usingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateAttributesInRange_options_usingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, enumerationRange);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateAttributesInRange_options_usingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithAttributedString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithAttributedString_IMetInst(){
		return ((initWithAttributedString_IMetInst != null)
	? (initWithAttributedString_IMetInst)
	: (initWithAttributedString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithAttributedString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithAttributedString(final com.apple.jobjc.foundation.NSAttributedString attrStr){
			final com.apple.jobjc.Invoke.MsgSend initWithAttributedString_IMetInst = get_initWithAttributedString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithAttributedString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrStr);
		initWithAttributedString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithString_IMetInst(){
		return ((initWithString_IMetInst != null)
	? (initWithString_IMetInst)
	: (initWithString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithString(final com.apple.jobjc.foundation.NSString str){
			final com.apple.jobjc.Invoke.MsgSend initWithString_IMetInst = get_initWithString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, str);
		initWithString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithString_attributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithString_attributes_IMetInst(){
		return ((initWithString_attributes_IMetInst != null)
	? (initWithString_attributes_IMetInst)
	: (initWithString_attributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithString:attributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithString_attributes(final com.apple.jobjc.foundation.NSString str, final com.apple.jobjc.foundation.NSDictionary attrs){
			final com.apple.jobjc.Invoke.MsgSend initWithString_attributes_IMetInst = get_initWithString_attributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithString_attributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, str);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrs);
		initWithString_attributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEqualToAttributedString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEqualToAttributedString_IMetInst(){
		return ((isEqualToAttributedString_IMetInst != null)
	? (isEqualToAttributedString_IMetInst)
	: (isEqualToAttributedString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEqualToAttributedString:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isEqualToAttributedString(final com.apple.jobjc.foundation.NSAttributedString other){
			final com.apple.jobjc.Invoke.MsgSend isEqualToAttributedString_IMetInst = get_isEqualToAttributedString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEqualToAttributedString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		isEqualToAttributedString_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend length_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_length_IMetInst(){
		return ((length_IMetInst != null)
	? (length_IMetInst)
	: (length_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "length", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long length(){
			final com.apple.jobjc.Invoke.MsgSend length_IMetInst = get_length_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		length_IMetInst.init(nativeBuffer, this);
		length_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
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

}
