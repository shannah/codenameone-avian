package com.apple.jobjc.appkit;

public  class NSPrintInfo extends com.apple.jobjc.foundation.NSObject {
	public NSPrintInfo(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPrintInfo(final NSPrintInfo obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend PMPageFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_PMPageFormat_IMetInst(){
		return ((PMPageFormat_IMetInst != null)
	? (PMPageFormat_IMetInst)
	: (PMPageFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "PMPageFormat", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> PMPageFormat(){
			final com.apple.jobjc.Invoke.MsgSend PMPageFormat_IMetInst = get_PMPageFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		PMPageFormat_IMetInst.init(nativeBuffer, this);
		PMPageFormat_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend PMPrintSession_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_PMPrintSession_IMetInst(){
		return ((PMPrintSession_IMetInst != null)
	? (PMPrintSession_IMetInst)
	: (PMPrintSession_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "PMPrintSession", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> PMPrintSession(){
			final com.apple.jobjc.Invoke.MsgSend PMPrintSession_IMetInst = get_PMPrintSession_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		PMPrintSession_IMetInst.init(nativeBuffer, this);
		PMPrintSession_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend PMPrintSettings_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_PMPrintSettings_IMetInst(){
		return ((PMPrintSettings_IMetInst != null)
	? (PMPrintSettings_IMetInst)
	: (PMPrintSettings_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "PMPrintSettings", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> PMPrintSettings(){
			final com.apple.jobjc.Invoke.MsgSend PMPrintSettings_IMetInst = get_PMPrintSettings_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		PMPrintSettings_IMetInst.init(nativeBuffer, this);
		PMPrintSettings_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bottomMargin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bottomMargin_IMetInst(){
		return ((bottomMargin_IMetInst != null)
	? (bottomMargin_IMetInst)
	: (bottomMargin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bottomMargin", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double bottomMargin(){
			final com.apple.jobjc.Invoke.MsgSend bottomMargin_IMetInst = get_bottomMargin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bottomMargin_IMetInst.init(nativeBuffer, this);
		bottomMargin_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dictionary_IMetInst(){
		return ((dictionary_IMetInst != null)
	? (dictionary_IMetInst)
	: (dictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dictionary", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMutableDictionary dictionary(){
			final com.apple.jobjc.Invoke.MsgSend dictionary_IMetInst = get_dictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dictionary_IMetInst.init(nativeBuffer, this);
		dictionary_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMutableDictionary returnValue = (com.apple.jobjc.foundation.NSMutableDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend horizontalPagination_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_horizontalPagination_IMetInst(){
		return ((horizontalPagination_IMetInst != null)
	? (horizontalPagination_IMetInst)
	: (horizontalPagination_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "horizontalPagination", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long horizontalPagination(){
			final com.apple.jobjc.Invoke.MsgSend horizontalPagination_IMetInst = get_horizontalPagination_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		horizontalPagination_IMetInst.init(nativeBuffer, this);
		horizontalPagination_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageablePageBounds_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageablePageBounds_IMetInst(){
		return ((imageablePageBounds_IMetInst != null)
	? (imageablePageBounds_IMetInst)
	: (imageablePageBounds_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageablePageBounds", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect imageablePageBounds(){
			final com.apple.jobjc.Invoke.MsgSend imageablePageBounds_IMetInst = get_imageablePageBounds_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageablePageBounds_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		imageablePageBounds_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithDictionary_IMetInst(){
		return ((initWithDictionary_IMetInst != null)
	? (initWithDictionary_IMetInst)
	: (initWithDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithDictionary:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithDictionary(final com.apple.jobjc.foundation.NSDictionary attributes){
			final com.apple.jobjc.Invoke.MsgSend initWithDictionary_IMetInst = get_initWithDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithDictionary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributes);
		initWithDictionary_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isHorizontallyCentered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isHorizontallyCentered_IMetInst(){
		return ((isHorizontallyCentered_IMetInst != null)
	? (isHorizontallyCentered_IMetInst)
	: (isHorizontallyCentered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isHorizontallyCentered", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isHorizontallyCentered(){
			final com.apple.jobjc.Invoke.MsgSend isHorizontallyCentered_IMetInst = get_isHorizontallyCentered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isHorizontallyCentered_IMetInst.init(nativeBuffer, this);
		isHorizontallyCentered_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSelectionOnly_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSelectionOnly_IMetInst(){
		return ((isSelectionOnly_IMetInst != null)
	? (isSelectionOnly_IMetInst)
	: (isSelectionOnly_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSelectionOnly", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isSelectionOnly(){
			final com.apple.jobjc.Invoke.MsgSend isSelectionOnly_IMetInst = get_isSelectionOnly_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSelectionOnly_IMetInst.init(nativeBuffer, this);
		isSelectionOnly_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isVerticallyCentered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isVerticallyCentered_IMetInst(){
		return ((isVerticallyCentered_IMetInst != null)
	? (isVerticallyCentered_IMetInst)
	: (isVerticallyCentered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isVerticallyCentered", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isVerticallyCentered(){
			final com.apple.jobjc.Invoke.MsgSend isVerticallyCentered_IMetInst = get_isVerticallyCentered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isVerticallyCentered_IMetInst.init(nativeBuffer, this);
		isVerticallyCentered_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend jobDisposition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_jobDisposition_IMetInst(){
		return ((jobDisposition_IMetInst != null)
	? (jobDisposition_IMetInst)
	: (jobDisposition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "jobDisposition", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString jobDisposition(){
			final com.apple.jobjc.Invoke.MsgSend jobDisposition_IMetInst = get_jobDisposition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		jobDisposition_IMetInst.init(nativeBuffer, this);
		jobDisposition_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend leftMargin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_leftMargin_IMetInst(){
		return ((leftMargin_IMetInst != null)
	? (leftMargin_IMetInst)
	: (leftMargin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "leftMargin", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double leftMargin(){
			final com.apple.jobjc.Invoke.MsgSend leftMargin_IMetInst = get_leftMargin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		leftMargin_IMetInst.init(nativeBuffer, this);
		leftMargin_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedPaperName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedPaperName_IMetInst(){
		return ((localizedPaperName_IMetInst != null)
	? (localizedPaperName_IMetInst)
	: (localizedPaperName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedPaperName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localizedPaperName(){
			final com.apple.jobjc.Invoke.MsgSend localizedPaperName_IMetInst = get_localizedPaperName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedPaperName_IMetInst.init(nativeBuffer, this);
		localizedPaperName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend orientation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orientation_IMetInst(){
		return ((orientation_IMetInst != null)
	? (orientation_IMetInst)
	: (orientation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orientation", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long orientation(){
			final com.apple.jobjc.Invoke.MsgSend orientation_IMetInst = get_orientation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orientation_IMetInst.init(nativeBuffer, this);
		orientation_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend paperName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_paperName_IMetInst(){
		return ((paperName_IMetInst != null)
	? (paperName_IMetInst)
	: (paperName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "paperName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString paperName(){
			final com.apple.jobjc.Invoke.MsgSend paperName_IMetInst = get_paperName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		paperName_IMetInst.init(nativeBuffer, this);
		paperName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend paperSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_paperSize_IMetInst(){
		return ((paperSize_IMetInst != null)
	? (paperSize_IMetInst)
	: (paperSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "paperSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize paperSize(){
			final com.apple.jobjc.Invoke.MsgSend paperSize_IMetInst = get_paperSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		paperSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		paperSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend printSettings_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_printSettings_IMetInst(){
		return ((printSettings_IMetInst != null)
	? (printSettings_IMetInst)
	: (printSettings_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "printSettings", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMutableDictionary printSettings(){
			final com.apple.jobjc.Invoke.MsgSend printSettings_IMetInst = get_printSettings_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		printSettings_IMetInst.init(nativeBuffer, this);
		printSettings_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMutableDictionary returnValue = (com.apple.jobjc.foundation.NSMutableDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend printer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_printer_IMetInst(){
		return ((printer_IMetInst != null)
	? (printer_IMetInst)
	: (printer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "printer", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPrinter printer(){
			final com.apple.jobjc.Invoke.MsgSend printer_IMetInst = get_printer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		printer_IMetInst.init(nativeBuffer, this);
		printer_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPrinter returnValue = (com.apple.jobjc.appkit.NSPrinter) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rightMargin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rightMargin_IMetInst(){
		return ((rightMargin_IMetInst != null)
	? (rightMargin_IMetInst)
	: (rightMargin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rightMargin", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double rightMargin(){
			final com.apple.jobjc.Invoke.MsgSend rightMargin_IMetInst = get_rightMargin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rightMargin_IMetInst.init(nativeBuffer, this);
		rightMargin_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scalingFactor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scalingFactor_IMetInst(){
		return ((scalingFactor_IMetInst != null)
	? (scalingFactor_IMetInst)
	: (scalingFactor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scalingFactor", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double scalingFactor(){
			final com.apple.jobjc.Invoke.MsgSend scalingFactor_IMetInst = get_scalingFactor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scalingFactor_IMetInst.init(nativeBuffer, this);
		scalingFactor_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setBottomMargin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBottomMargin_IMetInst(){
		return ((setBottomMargin_IMetInst != null)
	? (setBottomMargin_IMetInst)
	: (setBottomMargin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBottomMargin:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setBottomMargin(final double margin){
			final com.apple.jobjc.Invoke.MsgSend setBottomMargin_IMetInst = get_setBottomMargin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBottomMargin_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, margin);
		setBottomMargin_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHorizontalPagination_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHorizontalPagination_IMetInst(){
		return ((setHorizontalPagination_IMetInst != null)
	? (setHorizontalPagination_IMetInst)
	: (setHorizontalPagination_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHorizontalPagination:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setHorizontalPagination(final long mode){
			final com.apple.jobjc.Invoke.MsgSend setHorizontalPagination_IMetInst = get_setHorizontalPagination_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHorizontalPagination_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mode);
		setHorizontalPagination_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHorizontallyCentered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHorizontallyCentered_IMetInst(){
		return ((setHorizontallyCentered_IMetInst != null)
	? (setHorizontallyCentered_IMetInst)
	: (setHorizontallyCentered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHorizontallyCentered:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHorizontallyCentered(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setHorizontallyCentered_IMetInst = get_setHorizontallyCentered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHorizontallyCentered_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setHorizontallyCentered_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setJobDisposition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setJobDisposition_IMetInst(){
		return ((setJobDisposition_IMetInst != null)
	? (setJobDisposition_IMetInst)
	: (setJobDisposition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setJobDisposition:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setJobDisposition(final com.apple.jobjc.foundation.NSString disposition){
			final com.apple.jobjc.Invoke.MsgSend setJobDisposition_IMetInst = get_setJobDisposition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setJobDisposition_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, disposition);
		setJobDisposition_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLeftMargin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLeftMargin_IMetInst(){
		return ((setLeftMargin_IMetInst != null)
	? (setLeftMargin_IMetInst)
	: (setLeftMargin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLeftMargin:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setLeftMargin(final double margin){
			final com.apple.jobjc.Invoke.MsgSend setLeftMargin_IMetInst = get_setLeftMargin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLeftMargin_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, margin);
		setLeftMargin_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setOrientation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOrientation_IMetInst(){
		return ((setOrientation_IMetInst != null)
	? (setOrientation_IMetInst)
	: (setOrientation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOrientation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setOrientation(final long orientation){
			final com.apple.jobjc.Invoke.MsgSend setOrientation_IMetInst = get_setOrientation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOrientation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, orientation);
		setOrientation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPaperName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPaperName_IMetInst(){
		return ((setPaperName_IMetInst != null)
	? (setPaperName_IMetInst)
	: (setPaperName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPaperName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPaperName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend setPaperName_IMetInst = get_setPaperName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPaperName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		setPaperName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPaperSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPaperSize_IMetInst(){
		return ((setPaperSize_IMetInst != null)
	? (setPaperSize_IMetInst)
	: (setPaperSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPaperSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setPaperSize(final com.apple.jobjc.foundation.NSSize size){
			final com.apple.jobjc.Invoke.MsgSend setPaperSize_IMetInst = get_setPaperSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPaperSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		setPaperSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPrinter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPrinter_IMetInst(){
		return ((setPrinter_IMetInst != null)
	? (setPrinter_IMetInst)
	: (setPrinter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPrinter:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPrinter(final com.apple.jobjc.appkit.NSPrinter printer){
			final com.apple.jobjc.Invoke.MsgSend setPrinter_IMetInst = get_setPrinter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPrinter_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, printer);
		setPrinter_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRightMargin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRightMargin_IMetInst(){
		return ((setRightMargin_IMetInst != null)
	? (setRightMargin_IMetInst)
	: (setRightMargin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRightMargin:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setRightMargin(final double margin){
			final com.apple.jobjc.Invoke.MsgSend setRightMargin_IMetInst = get_setRightMargin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRightMargin_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, margin);
		setRightMargin_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setScalingFactor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setScalingFactor_IMetInst(){
		return ((setScalingFactor_IMetInst != null)
	? (setScalingFactor_IMetInst)
	: (setScalingFactor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setScalingFactor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setScalingFactor(final double scalingFactor){
			final com.apple.jobjc.Invoke.MsgSend setScalingFactor_IMetInst = get_setScalingFactor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setScalingFactor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, scalingFactor);
		setScalingFactor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectionOnly_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectionOnly_IMetInst(){
		return ((setSelectionOnly_IMetInst != null)
	? (setSelectionOnly_IMetInst)
	: (setSelectionOnly_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectionOnly:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSelectionOnly(final boolean selectionOnly){
			final com.apple.jobjc.Invoke.MsgSend setSelectionOnly_IMetInst = get_setSelectionOnly_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectionOnly_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, selectionOnly);
		setSelectionOnly_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTopMargin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTopMargin_IMetInst(){
		return ((setTopMargin_IMetInst != null)
	? (setTopMargin_IMetInst)
	: (setTopMargin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTopMargin:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setTopMargin(final double margin){
			final com.apple.jobjc.Invoke.MsgSend setTopMargin_IMetInst = get_setTopMargin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTopMargin_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, margin);
		setTopMargin_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUpPrintOperationDefaultValues_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUpPrintOperationDefaultValues_IMetInst(){
		return ((setUpPrintOperationDefaultValues_IMetInst != null)
	? (setUpPrintOperationDefaultValues_IMetInst)
	: (setUpPrintOperationDefaultValues_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUpPrintOperationDefaultValues", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void setUpPrintOperationDefaultValues(){
			final com.apple.jobjc.Invoke.MsgSend setUpPrintOperationDefaultValues_IMetInst = get_setUpPrintOperationDefaultValues_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUpPrintOperationDefaultValues_IMetInst.init(nativeBuffer, this);
		setUpPrintOperationDefaultValues_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVerticalPagination_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVerticalPagination_IMetInst(){
		return ((setVerticalPagination_IMetInst != null)
	? (setVerticalPagination_IMetInst)
	: (setVerticalPagination_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVerticalPagination:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setVerticalPagination(final long mode){
			final com.apple.jobjc.Invoke.MsgSend setVerticalPagination_IMetInst = get_setVerticalPagination_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVerticalPagination_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mode);
		setVerticalPagination_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVerticallyCentered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVerticallyCentered_IMetInst(){
		return ((setVerticallyCentered_IMetInst != null)
	? (setVerticallyCentered_IMetInst)
	: (setVerticallyCentered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVerticallyCentered:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setVerticallyCentered(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setVerticallyCentered_IMetInst = get_setVerticallyCentered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVerticallyCentered_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setVerticallyCentered_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend topMargin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_topMargin_IMetInst(){
		return ((topMargin_IMetInst != null)
	? (topMargin_IMetInst)
	: (topMargin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "topMargin", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double topMargin(){
			final com.apple.jobjc.Invoke.MsgSend topMargin_IMetInst = get_topMargin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		topMargin_IMetInst.init(nativeBuffer, this);
		topMargin_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend updateFromPMPageFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateFromPMPageFormat_IMetInst(){
		return ((updateFromPMPageFormat_IMetInst != null)
	? (updateFromPMPageFormat_IMetInst)
	: (updateFromPMPageFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateFromPMPageFormat", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void updateFromPMPageFormat(){
			final com.apple.jobjc.Invoke.MsgSend updateFromPMPageFormat_IMetInst = get_updateFromPMPageFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateFromPMPageFormat_IMetInst.init(nativeBuffer, this);
		updateFromPMPageFormat_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updateFromPMPrintSettings_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateFromPMPrintSettings_IMetInst(){
		return ((updateFromPMPrintSettings_IMetInst != null)
	? (updateFromPMPrintSettings_IMetInst)
	: (updateFromPMPrintSettings_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateFromPMPrintSettings", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void updateFromPMPrintSettings(){
			final com.apple.jobjc.Invoke.MsgSend updateFromPMPrintSettings_IMetInst = get_updateFromPMPrintSettings_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateFromPMPrintSettings_IMetInst.init(nativeBuffer, this);
		updateFromPMPrintSettings_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend verticalPagination_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_verticalPagination_IMetInst(){
		return ((verticalPagination_IMetInst != null)
	? (verticalPagination_IMetInst)
	: (verticalPagination_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "verticalPagination", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long verticalPagination(){
			final com.apple.jobjc.Invoke.MsgSend verticalPagination_IMetInst = get_verticalPagination_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		verticalPagination_IMetInst.init(nativeBuffer, this);
		verticalPagination_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
