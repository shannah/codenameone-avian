package com.apple.jobjc.appkit;

public  class NSAttributedStringCategory extends com.apple.jobjc.foundation.NSAttributedString {
	public NSAttributedStringCategory(final com.apple.jobjc.foundation.NSAttributedString obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	public NSAttributedStringCategory(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSAttributedStringCategory(final NSAttributedStringCategory obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend RTFDFileWrapperFromRange_documentAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_RTFDFileWrapperFromRange_documentAttributes_IMetInst(){
		return ((RTFDFileWrapperFromRange_documentAttributes_IMetInst != null)
	? (RTFDFileWrapperFromRange_documentAttributes_IMetInst)
	: (RTFDFileWrapperFromRange_documentAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "RTFDFileWrapperFromRange:documentAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSFileWrapper RTFDFileWrapperFromRange_documentAttributes(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSDictionary dict){
			final com.apple.jobjc.Invoke.MsgSend RTFDFileWrapperFromRange_documentAttributes_IMetInst = get_RTFDFileWrapperFromRange_documentAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		RTFDFileWrapperFromRange_documentAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dict);
		RTFDFileWrapperFromRange_documentAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSFileWrapper returnValue = (com.apple.jobjc.foundation.NSFileWrapper) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend RTFDFromRange_documentAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_RTFDFromRange_documentAttributes_IMetInst(){
		return ((RTFDFromRange_documentAttributes_IMetInst != null)
	? (RTFDFromRange_documentAttributes_IMetInst)
	: (RTFDFromRange_documentAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "RTFDFromRange:documentAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData RTFDFromRange_documentAttributes(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSDictionary dict){
			final com.apple.jobjc.Invoke.MsgSend RTFDFromRange_documentAttributes_IMetInst = get_RTFDFromRange_documentAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		RTFDFromRange_documentAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dict);
		RTFDFromRange_documentAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend RTFFromRange_documentAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_RTFFromRange_documentAttributes_IMetInst(){
		return ((RTFFromRange_documentAttributes_IMetInst != null)
	? (RTFFromRange_documentAttributes_IMetInst)
	: (RTFFromRange_documentAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "RTFFromRange:documentAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData RTFFromRange_documentAttributes(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSDictionary dict){
			final com.apple.jobjc.Invoke.MsgSend RTFFromRange_documentAttributes_IMetInst = get_RTFFromRange_documentAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		RTFFromRange_documentAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dict);
		RTFFromRange_documentAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLAtIndex_effectiveRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLAtIndex_effectiveRange_IMetInst(){
		return ((URLAtIndex_effectiveRange_IMetInst != null)
	? (URLAtIndex_effectiveRange_IMetInst)
	: (URLAtIndex_effectiveRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLAtIndex:effectiveRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLAtIndex_effectiveRange(final long location, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ effectiveRange){
			final com.apple.jobjc.Invoke.MsgSend URLAtIndex_effectiveRange_IMetInst = get_URLAtIndex_effectiveRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLAtIndex_effectiveRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, location);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, effectiveRange);
		URLAtIndex_effectiveRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend boundingRectWithSize_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_boundingRectWithSize_options_IMetInst(){
		return ((boundingRectWithSize_options_IMetInst != null)
	? (boundingRectWithSize_options_IMetInst)
	: (boundingRectWithSize_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "boundingRectWithSize:options:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect boundingRectWithSize_options(final com.apple.jobjc.foundation.NSSize size, final long options){
			final com.apple.jobjc.Invoke.MsgSend boundingRectWithSize_options_IMetInst = get_boundingRectWithSize_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		boundingRectWithSize_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, options);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		boundingRectWithSize_options_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend containsAttachments_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_containsAttachments_IMetInst(){
		return ((containsAttachments_IMetInst != null)
	? (containsAttachments_IMetInst)
	: (containsAttachments_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "containsAttachments", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean containsAttachments(){
			final com.apple.jobjc.Invoke.MsgSend containsAttachments_IMetInst = get_containsAttachments_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		containsAttachments_IMetInst.init(nativeBuffer, this);
		containsAttachments_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataFromRange_documentAttributes_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataFromRange_documentAttributes_error_IMetInst(){
		return ((dataFromRange_documentAttributes_error_IMetInst != null)
	? (dataFromRange_documentAttributes_error_IMetInst)
	: (dataFromRange_documentAttributes_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataFromRange:documentAttributes:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData dataFromRange_documentAttributes_error(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSDictionary dict, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend dataFromRange_documentAttributes_error_IMetInst = get_dataFromRange_documentAttributes_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataFromRange_documentAttributes_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dict);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		dataFromRange_documentAttributes_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend docFormatFromRange_documentAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_docFormatFromRange_documentAttributes_IMetInst(){
		return ((docFormatFromRange_documentAttributes_IMetInst != null)
	? (docFormatFromRange_documentAttributes_IMetInst)
	: (docFormatFromRange_documentAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "docFormatFromRange:documentAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData docFormatFromRange_documentAttributes(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSDictionary dict){
			final com.apple.jobjc.Invoke.MsgSend docFormatFromRange_documentAttributes_IMetInst = get_docFormatFromRange_documentAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		docFormatFromRange_documentAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dict);
		docFormatFromRange_documentAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend doubleClickAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_doubleClickAtIndex_IMetInst(){
		return ((doubleClickAtIndex_IMetInst != null)
	? (doubleClickAtIndex_IMetInst)
	: (doubleClickAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "doubleClickAtIndex:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRange doubleClickAtIndex(final long location){
			final com.apple.jobjc.Invoke.MsgSend doubleClickAtIndex_IMetInst = get_doubleClickAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		doubleClickAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, location);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		doubleClickAtIndex_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawAtPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawAtPoint_IMetInst(){
		return ((drawAtPoint_IMetInst != null)
	? (drawAtPoint_IMetInst)
	: (drawAtPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawAtPoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void drawAtPoint(final com.apple.jobjc.foundation.NSPoint point){
			final com.apple.jobjc.Invoke.MsgSend drawAtPoint_IMetInst = get_drawAtPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawAtPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		drawAtPoint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawInRect_IMetInst(){
		return ((drawInRect_IMetInst != null)
	? (drawInRect_IMetInst)
	: (drawInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawInRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawInRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend drawInRect_IMetInst = get_drawInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		drawInRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawWithRect_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawWithRect_options_IMetInst(){
		return ((drawWithRect_options_IMetInst != null)
	? (drawWithRect_options_IMetInst)
	: (drawWithRect_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawWithRect:options:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void drawWithRect_options(final com.apple.jobjc.foundation.NSRect rect, final long options){
			final com.apple.jobjc.Invoke.MsgSend drawWithRect_options_IMetInst = get_drawWithRect_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawWithRect_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, options);
		drawWithRect_options_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend fileWrapperFromRange_documentAttributes_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileWrapperFromRange_documentAttributes_error_IMetInst(){
		return ((fileWrapperFromRange_documentAttributes_error_IMetInst != null)
	? (fileWrapperFromRange_documentAttributes_error_IMetInst)
	: (fileWrapperFromRange_documentAttributes_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileWrapperFromRange:documentAttributes:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSFileWrapper fileWrapperFromRange_documentAttributes_error(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSDictionary dict, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend fileWrapperFromRange_documentAttributes_error_IMetInst = get_fileWrapperFromRange_documentAttributes_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileWrapperFromRange_documentAttributes_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dict);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		fileWrapperFromRange_documentAttributes_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSFileWrapper returnValue = (com.apple.jobjc.foundation.NSFileWrapper) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontAttributesInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontAttributesInRange_IMetInst(){
		return ((fontAttributesInRange_IMetInst != null)
	? (fontAttributesInRange_IMetInst)
	: (fontAttributesInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontAttributesInRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSDictionary fontAttributesInRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend fontAttributesInRange_IMetInst = get_fontAttributesInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontAttributesInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		fontAttributesInRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithData_options_documentAttributes_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithData_options_documentAttributes_error_IMetInst(){
		return ((initWithData_options_documentAttributes_error_IMetInst != null)
	? (initWithData_options_documentAttributes_error_IMetInst)
	: (initWithData_options_documentAttributes_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithData:options:documentAttributes:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithData_options_documentAttributes_error(final com.apple.jobjc.foundation.NSData data, final com.apple.jobjc.foundation.NSDictionary options, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDictionary> dict, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend initWithData_options_documentAttributes_error_IMetInst = get_initWithData_options_documentAttributes_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithData_options_documentAttributes_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dict);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		initWithData_options_documentAttributes_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithDocFormat_documentAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithDocFormat_documentAttributes_IMetInst(){
		return ((initWithDocFormat_documentAttributes_IMetInst != null)
	? (initWithDocFormat_documentAttributes_IMetInst)
	: (initWithDocFormat_documentAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithDocFormat:documentAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithDocFormat_documentAttributes(final com.apple.jobjc.foundation.NSData data, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDictionary> dict){
			final com.apple.jobjc.Invoke.MsgSend initWithDocFormat_documentAttributes_IMetInst = get_initWithDocFormat_documentAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithDocFormat_documentAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dict);
		initWithDocFormat_documentAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithHTML_baseURL_documentAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithHTML_baseURL_documentAttributes_IMetInst(){
		return ((initWithHTML_baseURL_documentAttributes_IMetInst != null)
	? (initWithHTML_baseURL_documentAttributes_IMetInst)
	: (initWithHTML_baseURL_documentAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithHTML:baseURL:documentAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithHTML_baseURL_documentAttributes(final com.apple.jobjc.foundation.NSData data, final com.apple.jobjc.foundation.NSURL base, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDictionary> dict){
			final com.apple.jobjc.Invoke.MsgSend initWithHTML_baseURL_documentAttributes_IMetInst = get_initWithHTML_baseURL_documentAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithHTML_baseURL_documentAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, base);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dict);
		initWithHTML_baseURL_documentAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithHTML_documentAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithHTML_documentAttributes_IMetInst(){
		return ((initWithHTML_documentAttributes_IMetInst != null)
	? (initWithHTML_documentAttributes_IMetInst)
	: (initWithHTML_documentAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithHTML:documentAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithHTML_documentAttributes(final com.apple.jobjc.foundation.NSData data, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDictionary> dict){
			final com.apple.jobjc.Invoke.MsgSend initWithHTML_documentAttributes_IMetInst = get_initWithHTML_documentAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithHTML_documentAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dict);
		initWithHTML_documentAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithHTML_options_documentAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithHTML_options_documentAttributes_IMetInst(){
		return ((initWithHTML_options_documentAttributes_IMetInst != null)
	? (initWithHTML_options_documentAttributes_IMetInst)
	: (initWithHTML_options_documentAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithHTML:options:documentAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithHTML_options_documentAttributes(final com.apple.jobjc.foundation.NSData data, final com.apple.jobjc.foundation.NSDictionary options, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDictionary> dict){
			final com.apple.jobjc.Invoke.MsgSend initWithHTML_options_documentAttributes_IMetInst = get_initWithHTML_options_documentAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithHTML_options_documentAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dict);
		initWithHTML_options_documentAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithPath_documentAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithPath_documentAttributes_IMetInst(){
		return ((initWithPath_documentAttributes_IMetInst != null)
	? (initWithPath_documentAttributes_IMetInst)
	: (initWithPath_documentAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithPath:documentAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithPath_documentAttributes(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDictionary> dict){
			final com.apple.jobjc.Invoke.MsgSend initWithPath_documentAttributes_IMetInst = get_initWithPath_documentAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithPath_documentAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dict);
		initWithPath_documentAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithRTF_documentAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithRTF_documentAttributes_IMetInst(){
		return ((initWithRTF_documentAttributes_IMetInst != null)
	? (initWithRTF_documentAttributes_IMetInst)
	: (initWithRTF_documentAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithRTF:documentAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithRTF_documentAttributes(final com.apple.jobjc.foundation.NSData data, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDictionary> dict){
			final com.apple.jobjc.Invoke.MsgSend initWithRTF_documentAttributes_IMetInst = get_initWithRTF_documentAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithRTF_documentAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dict);
		initWithRTF_documentAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithRTFD_documentAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithRTFD_documentAttributes_IMetInst(){
		return ((initWithRTFD_documentAttributes_IMetInst != null)
	? (initWithRTFD_documentAttributes_IMetInst)
	: (initWithRTFD_documentAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithRTFD:documentAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithRTFD_documentAttributes(final com.apple.jobjc.foundation.NSData data, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDictionary> dict){
			final com.apple.jobjc.Invoke.MsgSend initWithRTFD_documentAttributes_IMetInst = get_initWithRTFD_documentAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithRTFD_documentAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dict);
		initWithRTFD_documentAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithRTFDFileWrapper_documentAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithRTFDFileWrapper_documentAttributes_IMetInst(){
		return ((initWithRTFDFileWrapper_documentAttributes_IMetInst != null)
	? (initWithRTFDFileWrapper_documentAttributes_IMetInst)
	: (initWithRTFDFileWrapper_documentAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithRTFDFileWrapper:documentAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithRTFDFileWrapper_documentAttributes(final com.apple.jobjc.foundation.NSFileWrapper wrapper, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDictionary> dict){
			final com.apple.jobjc.Invoke.MsgSend initWithRTFDFileWrapper_documentAttributes_IMetInst = get_initWithRTFDFileWrapper_documentAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithRTFDFileWrapper_documentAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, wrapper);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dict);
		initWithRTFDFileWrapper_documentAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithURL_documentAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithURL_documentAttributes_IMetInst(){
		return ((initWithURL_documentAttributes_IMetInst != null)
	? (initWithURL_documentAttributes_IMetInst)
	: (initWithURL_documentAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithURL:documentAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithURL_documentAttributes(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDictionary> dict){
			final com.apple.jobjc.Invoke.MsgSend initWithURL_documentAttributes_IMetInst = get_initWithURL_documentAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithURL_documentAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dict);
		initWithURL_documentAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithURL_options_documentAttributes_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithURL_options_documentAttributes_error_IMetInst(){
		return ((initWithURL_options_documentAttributes_error_IMetInst != null)
	? (initWithURL_options_documentAttributes_error_IMetInst)
	: (initWithURL_options_documentAttributes_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithURL:options:documentAttributes:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithURL_options_documentAttributes_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSDictionary options, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDictionary> dict, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend initWithURL_options_documentAttributes_error_IMetInst = get_initWithURL_options_documentAttributes_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithURL_options_documentAttributes_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dict);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		initWithURL_options_documentAttributes_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend itemNumberInTextList_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemNumberInTextList_atIndex_IMetInst(){
		return ((itemNumberInTextList_atIndex_IMetInst != null)
	? (itemNumberInTextList_atIndex_IMetInst)
	: (itemNumberInTextList_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemNumberInTextList:atIndex:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long itemNumberInTextList_atIndex(final com.apple.jobjc.appkit.NSTextList list, final long location){
			final com.apple.jobjc.Invoke.MsgSend itemNumberInTextList_atIndex_IMetInst = get_itemNumberInTextList_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemNumberInTextList_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, list);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, location);
		itemNumberInTextList_atIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineBreakBeforeIndex_withinRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineBreakBeforeIndex_withinRange_IMetInst(){
		return ((lineBreakBeforeIndex_withinRange_IMetInst != null)
	? (lineBreakBeforeIndex_withinRange_IMetInst)
	: (lineBreakBeforeIndex_withinRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineBreakBeforeIndex:withinRange:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public long lineBreakBeforeIndex_withinRange(final long location, final com.apple.jobjc.foundation.NSRange aRange){
			final com.apple.jobjc.Invoke.MsgSend lineBreakBeforeIndex_withinRange_IMetInst = get_lineBreakBeforeIndex_withinRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineBreakBeforeIndex_withinRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, location);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, aRange);
		lineBreakBeforeIndex_withinRange_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineBreakByHyphenatingBeforeIndex_withinRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineBreakByHyphenatingBeforeIndex_withinRange_IMetInst(){
		return ((lineBreakByHyphenatingBeforeIndex_withinRange_IMetInst != null)
	? (lineBreakByHyphenatingBeforeIndex_withinRange_IMetInst)
	: (lineBreakByHyphenatingBeforeIndex_withinRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineBreakByHyphenatingBeforeIndex:withinRange:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public long lineBreakByHyphenatingBeforeIndex_withinRange(final long location, final com.apple.jobjc.foundation.NSRange aRange){
			final com.apple.jobjc.Invoke.MsgSend lineBreakByHyphenatingBeforeIndex_withinRange_IMetInst = get_lineBreakByHyphenatingBeforeIndex_withinRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineBreakByHyphenatingBeforeIndex_withinRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, location);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, aRange);
		lineBreakByHyphenatingBeforeIndex_withinRange_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nextWordFromIndex_forward_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nextWordFromIndex_forward_IMetInst(){
		return ((nextWordFromIndex_forward_IMetInst != null)
	? (nextWordFromIndex_forward_IMetInst)
	: (nextWordFromIndex_forward_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nextWordFromIndex:forward:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public long nextWordFromIndex_forward(final long location, final boolean isForward){
			final com.apple.jobjc.Invoke.MsgSend nextWordFromIndex_forward_IMetInst = get_nextWordFromIndex_forward_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nextWordFromIndex_forward_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, location);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, isForward);
		nextWordFromIndex_forward_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeOfTextBlock_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeOfTextBlock_atIndex_IMetInst(){
		return ((rangeOfTextBlock_atIndex_IMetInst != null)
	? (rangeOfTextBlock_atIndex_IMetInst)
	: (rangeOfTextBlock_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeOfTextBlock:atIndex:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRange rangeOfTextBlock_atIndex(final com.apple.jobjc.appkit.NSTextBlock block, final long location){
			final com.apple.jobjc.Invoke.MsgSend rangeOfTextBlock_atIndex_IMetInst = get_rangeOfTextBlock_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeOfTextBlock_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, block);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, location);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeOfTextBlock_atIndex_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeOfTextList_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeOfTextList_atIndex_IMetInst(){
		return ((rangeOfTextList_atIndex_IMetInst != null)
	? (rangeOfTextList_atIndex_IMetInst)
	: (rangeOfTextList_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeOfTextList:atIndex:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRange rangeOfTextList_atIndex(final com.apple.jobjc.appkit.NSTextList list, final long location){
			final com.apple.jobjc.Invoke.MsgSend rangeOfTextList_atIndex_IMetInst = get_rangeOfTextList_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeOfTextList_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, list);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, location);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeOfTextList_atIndex_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeOfTextTable_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeOfTextTable_atIndex_IMetInst(){
		return ((rangeOfTextTable_atIndex_IMetInst != null)
	? (rangeOfTextTable_atIndex_IMetInst)
	: (rangeOfTextTable_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeOfTextTable:atIndex:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRange rangeOfTextTable_atIndex(final com.apple.jobjc.appkit.NSTextTable table, final long location){
			final com.apple.jobjc.Invoke.MsgSend rangeOfTextTable_atIndex_IMetInst = get_rangeOfTextTable_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeOfTextTable_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, location);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeOfTextTable_atIndex_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerAttributesInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerAttributesInRange_IMetInst(){
		return ((rulerAttributesInRange_IMetInst != null)
	? (rulerAttributesInRange_IMetInst)
	: (rulerAttributesInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerAttributesInRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSDictionary rulerAttributesInRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend rulerAttributesInRange_IMetInst = get_rulerAttributesInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerAttributesInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		rulerAttributesInRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend size_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_size_IMetInst(){
		return ((size_IMetInst != null)
	? (size_IMetInst)
	: (size_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "size", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize size(){
			final com.apple.jobjc.Invoke.MsgSend size_IMetInst = get_size_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		size_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		size_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

}
