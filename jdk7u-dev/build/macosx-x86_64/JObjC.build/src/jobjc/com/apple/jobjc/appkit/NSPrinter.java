package com.apple.jobjc.appkit;

public  class NSPrinter extends com.apple.jobjc.foundation.NSObject {
	public NSPrinter(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPrinter(final NSPrinter obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend acceptsBinary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_acceptsBinary_IMetInst(){
		return ((acceptsBinary_IMetInst != null)
	? (acceptsBinary_IMetInst)
	: (acceptsBinary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "acceptsBinary", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean acceptsBinary(){
			final com.apple.jobjc.Invoke.MsgSend acceptsBinary_IMetInst = get_acceptsBinary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		acceptsBinary_IMetInst.init(nativeBuffer, this);
		acceptsBinary_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend booleanForKey_inTable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_booleanForKey_inTable_IMetInst(){
		return ((booleanForKey_inTable_IMetInst != null)
	? (booleanForKey_inTable_IMetInst)
	: (booleanForKey_inTable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "booleanForKey:inTable:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean booleanForKey_inTable(final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.foundation.NSString table){
			final com.apple.jobjc.Invoke.MsgSend booleanForKey_inTable_IMetInst = get_booleanForKey_inTable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		booleanForKey_inTable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		booleanForKey_inTable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deviceDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deviceDescription_IMetInst(){
		return ((deviceDescription_IMetInst != null)
	? (deviceDescription_IMetInst)
	: (deviceDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deviceDescription", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary deviceDescription(){
			final com.apple.jobjc.Invoke.MsgSend deviceDescription_IMetInst = get_deviceDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deviceDescription_IMetInst.init(nativeBuffer, this);
		deviceDescription_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend domain_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_domain_IMetInst(){
		return ((domain_IMetInst != null)
	? (domain_IMetInst)
	: (domain_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "domain", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString domain(){
			final com.apple.jobjc.Invoke.MsgSend domain_IMetInst = get_domain_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		domain_IMetInst.init(nativeBuffer, this);
		domain_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend floatForKey_inTable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_floatForKey_inTable_IMetInst(){
		return ((floatForKey_inTable_IMetInst != null)
	? (floatForKey_inTable_IMetInst)
	: (floatForKey_inTable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "floatForKey:inTable:", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public float floatForKey_inTable(final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.foundation.NSString table){
			final com.apple.jobjc.Invoke.MsgSend floatForKey_inTable_IMetInst = get_floatForKey_inTable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		floatForKey_inTable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		floatForKey_inTable_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend host_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_host_IMetInst(){
		return ((host_IMetInst != null)
	? (host_IMetInst)
	: (host_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "host", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString host(){
			final com.apple.jobjc.Invoke.MsgSend host_IMetInst = get_host_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		host_IMetInst.init(nativeBuffer, this);
		host_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageRectForPaper_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageRectForPaper_IMetInst(){
		return ((imageRectForPaper_IMetInst != null)
	? (imageRectForPaper_IMetInst)
	: (imageRectForPaper_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageRectForPaper:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect imageRectForPaper(final com.apple.jobjc.foundation.NSString paperName){
			final com.apple.jobjc.Invoke.MsgSend imageRectForPaper_IMetInst = get_imageRectForPaper_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageRectForPaper_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, paperName);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		imageRectForPaper_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend intForKey_inTable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_intForKey_inTable_IMetInst(){
		return ((intForKey_inTable_IMetInst != null)
	? (intForKey_inTable_IMetInst)
	: (intForKey_inTable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "intForKey:inTable:", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public int intForKey_inTable(final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.foundation.NSString table){
			final com.apple.jobjc.Invoke.MsgSend intForKey_inTable_IMetInst = get_intForKey_inTable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		intForKey_inTable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		intForKey_inTable_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isColor_IMetInst(){
		return ((isColor_IMetInst != null)
	? (isColor_IMetInst)
	: (isColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isColor", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isColor(){
			final com.apple.jobjc.Invoke.MsgSend isColor_IMetInst = get_isColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isColor_IMetInst.init(nativeBuffer, this);
		isColor_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isFontAvailable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isFontAvailable_IMetInst(){
		return ((isFontAvailable_IMetInst != null)
	? (isFontAvailable_IMetInst)
	: (isFontAvailable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isFontAvailable:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isFontAvailable(final com.apple.jobjc.foundation.NSString faceName){
			final com.apple.jobjc.Invoke.MsgSend isFontAvailable_IMetInst = get_isFontAvailable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isFontAvailable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, faceName);
		isFontAvailable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isKey_inTable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isKey_inTable_IMetInst(){
		return ((isKey_inTable_IMetInst != null)
	? (isKey_inTable_IMetInst)
	: (isKey_inTable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isKey:inTable:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isKey_inTable(final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.foundation.NSString table){
			final com.apple.jobjc.Invoke.MsgSend isKey_inTable_IMetInst = get_isKey_inTable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isKey_inTable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		isKey_inTable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isOutputStackInReverseOrder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isOutputStackInReverseOrder_IMetInst(){
		return ((isOutputStackInReverseOrder_IMetInst != null)
	? (isOutputStackInReverseOrder_IMetInst)
	: (isOutputStackInReverseOrder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isOutputStackInReverseOrder", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isOutputStackInReverseOrder(){
			final com.apple.jobjc.Invoke.MsgSend isOutputStackInReverseOrder_IMetInst = get_isOutputStackInReverseOrder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isOutputStackInReverseOrder_IMetInst.init(nativeBuffer, this);
		isOutputStackInReverseOrder_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend languageLevel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_languageLevel_IMetInst(){
		return ((languageLevel_IMetInst != null)
	? (languageLevel_IMetInst)
	: (languageLevel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "languageLevel", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long languageLevel(){
			final com.apple.jobjc.Invoke.MsgSend languageLevel_IMetInst = get_languageLevel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		languageLevel_IMetInst.init(nativeBuffer, this);
		languageLevel_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend name_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_name_IMetInst(){
		return ((name_IMetInst != null)
	? (name_IMetInst)
	: (name_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "name", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString name(){
			final com.apple.jobjc.Invoke.MsgSend name_IMetInst = get_name_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		name_IMetInst.init(nativeBuffer, this);
		name_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend note_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_note_IMetInst(){
		return ((note_IMetInst != null)
	? (note_IMetInst)
	: (note_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "note", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString note(){
			final com.apple.jobjc.Invoke.MsgSend note_IMetInst = get_note_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		note_IMetInst.init(nativeBuffer, this);
		note_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pageSizeForPaper_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pageSizeForPaper_IMetInst(){
		return ((pageSizeForPaper_IMetInst != null)
	? (pageSizeForPaper_IMetInst)
	: (pageSizeForPaper_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pageSizeForPaper:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSize pageSizeForPaper(final com.apple.jobjc.foundation.NSString paperName){
			final com.apple.jobjc.Invoke.MsgSend pageSizeForPaper_IMetInst = get_pageSizeForPaper_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pageSizeForPaper_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, paperName);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		pageSizeForPaper_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rectForKey_inTable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rectForKey_inTable_IMetInst(){
		return ((rectForKey_inTable_IMetInst != null)
	? (rectForKey_inTable_IMetInst)
	: (rectForKey_inTable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rectForKey:inTable:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect rectForKey_inTable(final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.foundation.NSString table){
			final com.apple.jobjc.Invoke.MsgSend rectForKey_inTable_IMetInst = get_rectForKey_inTable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rectForKey_inTable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		rectForKey_inTable_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sizeForKey_inTable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sizeForKey_inTable_IMetInst(){
		return ((sizeForKey_inTable_IMetInst != null)
	? (sizeForKey_inTable_IMetInst)
	: (sizeForKey_inTable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sizeForKey:inTable:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSize sizeForKey_inTable(final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.foundation.NSString table){
			final com.apple.jobjc.Invoke.MsgSend sizeForKey_inTable_IMetInst = get_sizeForKey_inTable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sizeForKey_inTable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		sizeForKey_inTable_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend statusForTable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_statusForTable_IMetInst(){
		return ((statusForTable_IMetInst != null)
	? (statusForTable_IMetInst)
	: (statusForTable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "statusForTable:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long statusForTable(final com.apple.jobjc.foundation.NSString tableName){
			final com.apple.jobjc.Invoke.MsgSend statusForTable_IMetInst = get_statusForTable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		statusForTable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableName);
		statusForTable_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringForKey_inTable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringForKey_inTable_IMetInst(){
		return ((stringForKey_inTable_IMetInst != null)
	? (stringForKey_inTable_IMetInst)
	: (stringForKey_inTable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringForKey:inTable:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringForKey_inTable(final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.foundation.NSString table){
			final com.apple.jobjc.Invoke.MsgSend stringForKey_inTable_IMetInst = get_stringForKey_inTable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringForKey_inTable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		stringForKey_inTable_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringListForKey_inTable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringListForKey_inTable_IMetInst(){
		return ((stringListForKey_inTable_IMetInst != null)
	? (stringListForKey_inTable_IMetInst)
	: (stringListForKey_inTable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringListForKey:inTable:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray stringListForKey_inTable(final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.foundation.NSString table){
			final com.apple.jobjc.Invoke.MsgSend stringListForKey_inTable_IMetInst = get_stringListForKey_inTable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringListForKey_inTable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		stringListForKey_inTable_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend type_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_type_IMetInst(){
		return ((type_IMetInst != null)
	? (type_IMetInst)
	: (type_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "type", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString type(){
			final com.apple.jobjc.Invoke.MsgSend type_IMetInst = get_type_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		type_IMetInst.init(nativeBuffer, this);
		type_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
