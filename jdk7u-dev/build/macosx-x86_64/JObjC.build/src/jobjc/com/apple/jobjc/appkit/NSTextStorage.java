package com.apple.jobjc.appkit;

public  class NSTextStorage extends com.apple.jobjc.foundation.NSMutableAttributedString {
	public NSTextStorage(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTextStorage(final NSTextStorage obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addLayoutManager_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addLayoutManager_IMetInst(){
		return ((addLayoutManager_IMetInst != null)
	? (addLayoutManager_IMetInst)
	: (addLayoutManager_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addLayoutManager:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addLayoutManager(final com.apple.jobjc.appkit.NSLayoutManager obj){
			final com.apple.jobjc.Invoke.MsgSend addLayoutManager_IMetInst = get_addLayoutManager_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addLayoutManager_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		addLayoutManager_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend attributeRuns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributeRuns_IMetInst(){
		return ((attributeRuns_IMetInst != null)
	? (attributeRuns_IMetInst)
	: (attributeRuns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributeRuns", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray attributeRuns(){
			final com.apple.jobjc.Invoke.MsgSend attributeRuns_IMetInst = get_attributeRuns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributeRuns_IMetInst.init(nativeBuffer, this);
		attributeRuns_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend changeInLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_changeInLength_IMetInst(){
		return ((changeInLength_IMetInst != null)
	? (changeInLength_IMetInst)
	: (changeInLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "changeInLength", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long changeInLength(){
			final com.apple.jobjc.Invoke.MsgSend changeInLength_IMetInst = get_changeInLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		changeInLength_IMetInst.init(nativeBuffer, this);
		changeInLength_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend characters_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_characters_IMetInst(){
		return ((characters_IMetInst != null)
	? (characters_IMetInst)
	: (characters_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "characters", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray characters(){
			final com.apple.jobjc.Invoke.MsgSend characters_IMetInst = get_characters_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		characters_IMetInst.init(nativeBuffer, this);
		characters_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend edited_range_changeInLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_edited_range_changeInLength_IMetInst(){
		return ((edited_range_changeInLength_IMetInst != null)
	? (edited_range_changeInLength_IMetInst)
	: (edited_range_changeInLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "edited:range:changeInLength:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void edited_range_changeInLength(final long editedMask, final com.apple.jobjc.foundation.NSRange range, final long delta){
			final com.apple.jobjc.Invoke.MsgSend edited_range_changeInLength_IMetInst = get_edited_range_changeInLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		edited_range_changeInLength_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, editedMask);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, delta);
		edited_range_changeInLength_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend editedMask_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_editedMask_IMetInst(){
		return ((editedMask_IMetInst != null)
	? (editedMask_IMetInst)
	: (editedMask_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "editedMask", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long editedMask(){
			final com.apple.jobjc.Invoke.MsgSend editedMask_IMetInst = get_editedMask_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		editedMask_IMetInst.init(nativeBuffer, this);
		editedMask_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend editedRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_editedRange_IMetInst(){
		return ((editedRange_IMetInst != null)
	? (editedRange_IMetInst)
	: (editedRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "editedRange", com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange editedRange(){
			final com.apple.jobjc.Invoke.MsgSend editedRange_IMetInst = get_editedRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		editedRange_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		editedRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ensureAttributesAreFixedInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ensureAttributesAreFixedInRange_IMetInst(){
		return ((ensureAttributesAreFixedInRange_IMetInst != null)
	? (ensureAttributesAreFixedInRange_IMetInst)
	: (ensureAttributesAreFixedInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ensureAttributesAreFixedInRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void ensureAttributesAreFixedInRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend ensureAttributesAreFixedInRange_IMetInst = get_ensureAttributesAreFixedInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ensureAttributesAreFixedInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		ensureAttributesAreFixedInRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend fixesAttributesLazily_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fixesAttributesLazily_IMetInst(){
		return ((fixesAttributesLazily_IMetInst != null)
	? (fixesAttributesLazily_IMetInst)
	: (fixesAttributesLazily_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fixesAttributesLazily", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean fixesAttributesLazily(){
			final com.apple.jobjc.Invoke.MsgSend fixesAttributesLazily_IMetInst = get_fixesAttributesLazily_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fixesAttributesLazily_IMetInst.init(nativeBuffer, this);
		fixesAttributesLazily_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend font_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_font_IMetInst(){
		return ((font_IMetInst != null)
	? (font_IMetInst)
	: (font_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "font", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont font(){
			final com.apple.jobjc.Invoke.MsgSend font_IMetInst = get_font_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		font_IMetInst.init(nativeBuffer, this);
		font_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend foregroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_foregroundColor_IMetInst(){
		return ((foregroundColor_IMetInst != null)
	? (foregroundColor_IMetInst)
	: (foregroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "foregroundColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor foregroundColor(){
			final com.apple.jobjc.Invoke.MsgSend foregroundColor_IMetInst = get_foregroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		foregroundColor_IMetInst.init(nativeBuffer, this);
		foregroundColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidateAttributesInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidateAttributesInRange_IMetInst(){
		return ((invalidateAttributesInRange_IMetInst != null)
	? (invalidateAttributesInRange_IMetInst)
	: (invalidateAttributesInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidateAttributesInRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void invalidateAttributesInRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend invalidateAttributesInRange_IMetInst = get_invalidateAttributesInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidateAttributesInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		invalidateAttributesInRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend layoutManagers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layoutManagers_IMetInst(){
		return ((layoutManagers_IMetInst != null)
	? (layoutManagers_IMetInst)
	: (layoutManagers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layoutManagers", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray layoutManagers(){
			final com.apple.jobjc.Invoke.MsgSend layoutManagers_IMetInst = get_layoutManagers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layoutManagers_IMetInst.init(nativeBuffer, this);
		layoutManagers_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend paragraphs_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_paragraphs_IMetInst(){
		return ((paragraphs_IMetInst != null)
	? (paragraphs_IMetInst)
	: (paragraphs_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "paragraphs", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray paragraphs(){
			final com.apple.jobjc.Invoke.MsgSend paragraphs_IMetInst = get_paragraphs_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		paragraphs_IMetInst.init(nativeBuffer, this);
		paragraphs_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend processEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_processEditing_IMetInst(){
		return ((processEditing_IMetInst != null)
	? (processEditing_IMetInst)
	: (processEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "processEditing", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void processEditing(){
			final com.apple.jobjc.Invoke.MsgSend processEditing_IMetInst = get_processEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		processEditing_IMetInst.init(nativeBuffer, this);
		processEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeLayoutManager_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeLayoutManager_IMetInst(){
		return ((removeLayoutManager_IMetInst != null)
	? (removeLayoutManager_IMetInst)
	: (removeLayoutManager_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeLayoutManager:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeLayoutManager(final com.apple.jobjc.appkit.NSLayoutManager obj){
			final com.apple.jobjc.Invoke.MsgSend removeLayoutManager_IMetInst = get_removeLayoutManager_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeLayoutManager_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		removeLayoutManager_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttributeRuns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttributeRuns_IMetInst(){
		return ((setAttributeRuns_IMetInst != null)
	? (setAttributeRuns_IMetInst)
	: (setAttributeRuns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttributeRuns:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAttributeRuns(final com.apple.jobjc.foundation.NSArray attributeRuns){
			final com.apple.jobjc.Invoke.MsgSend setAttributeRuns_IMetInst = get_setAttributeRuns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributeRuns_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributeRuns);
		setAttributeRuns_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCharacters_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCharacters_IMetInst(){
		return ((setCharacters_IMetInst != null)
	? (setCharacters_IMetInst)
	: (setCharacters_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCharacters:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCharacters(final com.apple.jobjc.foundation.NSArray characters){
			final com.apple.jobjc.Invoke.MsgSend setCharacters_IMetInst = get_setCharacters_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCharacters_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, characters);
		setCharacters_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFont_IMetInst(){
		return ((setFont_IMetInst != null)
	? (setFont_IMetInst)
	: (setFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFont(final com.apple.jobjc.appkit.NSFont font){
			final com.apple.jobjc.Invoke.MsgSend setFont_IMetInst = get_setFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, font);
		setFont_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setForegroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setForegroundColor_IMetInst(){
		return ((setForegroundColor_IMetInst != null)
	? (setForegroundColor_IMetInst)
	: (setForegroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setForegroundColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setForegroundColor(final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend setForegroundColor_IMetInst = get_setForegroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setForegroundColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		setForegroundColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setParagraphs_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setParagraphs_IMetInst(){
		return ((setParagraphs_IMetInst != null)
	? (setParagraphs_IMetInst)
	: (setParagraphs_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setParagraphs:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setParagraphs(final com.apple.jobjc.foundation.NSArray paragraphs){
			final com.apple.jobjc.Invoke.MsgSend setParagraphs_IMetInst = get_setParagraphs_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setParagraphs_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, paragraphs);
		setParagraphs_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWords_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWords_IMetInst(){
		return ((setWords_IMetInst != null)
	? (setWords_IMetInst)
	: (setWords_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWords:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setWords(final com.apple.jobjc.foundation.NSArray words){
			final com.apple.jobjc.Invoke.MsgSend setWords_IMetInst = get_setWords_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWords_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, words);
		setWords_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend words_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_words_IMetInst(){
		return ((words_IMetInst != null)
	? (words_IMetInst)
	: (words_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "words", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray words(){
			final com.apple.jobjc.Invoke.MsgSend words_IMetInst = get_words_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		words_IMetInst.init(nativeBuffer, this);
		words_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
