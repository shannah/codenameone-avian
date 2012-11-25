package com.apple.jobjc.foundation;

public  class NSCharacterSetClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSCharacterSetClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSCharacterSetClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSCharacterSetClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend alphanumericCharacterSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alphanumericCharacterSet_CMetInst(){
		return ((alphanumericCharacterSet_CMetInst != null)
	? (alphanumericCharacterSet_CMetInst)
	: (alphanumericCharacterSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alphanumericCharacterSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T alphanumericCharacterSet(){
			final com.apple.jobjc.Invoke.MsgSend alphanumericCharacterSet_CMetInst = get_alphanumericCharacterSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alphanumericCharacterSet_CMetInst.init(nativeBuffer, this);
		alphanumericCharacterSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend capitalizedLetterCharacterSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_capitalizedLetterCharacterSet_CMetInst(){
		return ((capitalizedLetterCharacterSet_CMetInst != null)
	? (capitalizedLetterCharacterSet_CMetInst)
	: (capitalizedLetterCharacterSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "capitalizedLetterCharacterSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T capitalizedLetterCharacterSet(){
			final com.apple.jobjc.Invoke.MsgSend capitalizedLetterCharacterSet_CMetInst = get_capitalizedLetterCharacterSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		capitalizedLetterCharacterSet_CMetInst.init(nativeBuffer, this);
		capitalizedLetterCharacterSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend characterSetWithBitmapRepresentation_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_characterSetWithBitmapRepresentation_CMetInst(){
		return ((characterSetWithBitmapRepresentation_CMetInst != null)
	? (characterSetWithBitmapRepresentation_CMetInst)
	: (characterSetWithBitmapRepresentation_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "characterSetWithBitmapRepresentation:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T characterSetWithBitmapRepresentation(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend characterSetWithBitmapRepresentation_CMetInst = get_characterSetWithBitmapRepresentation_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		characterSetWithBitmapRepresentation_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		characterSetWithBitmapRepresentation_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend characterSetWithCharactersInString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_characterSetWithCharactersInString_CMetInst(){
		return ((characterSetWithCharactersInString_CMetInst != null)
	? (characterSetWithCharactersInString_CMetInst)
	: (characterSetWithCharactersInString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "characterSetWithCharactersInString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T characterSetWithCharactersInString(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend characterSetWithCharactersInString_CMetInst = get_characterSetWithCharactersInString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		characterSetWithCharactersInString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		characterSetWithCharactersInString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend characterSetWithContentsOfFile_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_characterSetWithContentsOfFile_CMetInst(){
		return ((characterSetWithContentsOfFile_CMetInst != null)
	? (characterSetWithContentsOfFile_CMetInst)
	: (characterSetWithContentsOfFile_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "characterSetWithContentsOfFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T characterSetWithContentsOfFile(final com.apple.jobjc.foundation.NSString fName){
			final com.apple.jobjc.Invoke.MsgSend characterSetWithContentsOfFile_CMetInst = get_characterSetWithContentsOfFile_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		characterSetWithContentsOfFile_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fName);
		characterSetWithContentsOfFile_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend characterSetWithRange_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_characterSetWithRange_CMetInst(){
		return ((characterSetWithRange_CMetInst != null)
	? (characterSetWithRange_CMetInst)
	: (characterSetWithRange_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "characterSetWithRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public <T extends com.apple.jobjc.ID> T characterSetWithRange(final com.apple.jobjc.foundation.NSRange aRange){
			final com.apple.jobjc.Invoke.MsgSend characterSetWithRange_CMetInst = get_characterSetWithRange_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		characterSetWithRange_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, aRange);
		characterSetWithRange_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend controlCharacterSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_controlCharacterSet_CMetInst(){
		return ((controlCharacterSet_CMetInst != null)
	? (controlCharacterSet_CMetInst)
	: (controlCharacterSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "controlCharacterSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T controlCharacterSet(){
			final com.apple.jobjc.Invoke.MsgSend controlCharacterSet_CMetInst = get_controlCharacterSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		controlCharacterSet_CMetInst.init(nativeBuffer, this);
		controlCharacterSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalDigitCharacterSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalDigitCharacterSet_CMetInst(){
		return ((decimalDigitCharacterSet_CMetInst != null)
	? (decimalDigitCharacterSet_CMetInst)
	: (decimalDigitCharacterSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalDigitCharacterSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T decimalDigitCharacterSet(){
			final com.apple.jobjc.Invoke.MsgSend decimalDigitCharacterSet_CMetInst = get_decimalDigitCharacterSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalDigitCharacterSet_CMetInst.init(nativeBuffer, this);
		decimalDigitCharacterSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decomposableCharacterSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decomposableCharacterSet_CMetInst(){
		return ((decomposableCharacterSet_CMetInst != null)
	? (decomposableCharacterSet_CMetInst)
	: (decomposableCharacterSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decomposableCharacterSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T decomposableCharacterSet(){
			final com.apple.jobjc.Invoke.MsgSend decomposableCharacterSet_CMetInst = get_decomposableCharacterSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decomposableCharacterSet_CMetInst.init(nativeBuffer, this);
		decomposableCharacterSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend illegalCharacterSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_illegalCharacterSet_CMetInst(){
		return ((illegalCharacterSet_CMetInst != null)
	? (illegalCharacterSet_CMetInst)
	: (illegalCharacterSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "illegalCharacterSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T illegalCharacterSet(){
			final com.apple.jobjc.Invoke.MsgSend illegalCharacterSet_CMetInst = get_illegalCharacterSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		illegalCharacterSet_CMetInst.init(nativeBuffer, this);
		illegalCharacterSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend letterCharacterSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_letterCharacterSet_CMetInst(){
		return ((letterCharacterSet_CMetInst != null)
	? (letterCharacterSet_CMetInst)
	: (letterCharacterSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "letterCharacterSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T letterCharacterSet(){
			final com.apple.jobjc.Invoke.MsgSend letterCharacterSet_CMetInst = get_letterCharacterSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		letterCharacterSet_CMetInst.init(nativeBuffer, this);
		letterCharacterSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lowercaseLetterCharacterSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lowercaseLetterCharacterSet_CMetInst(){
		return ((lowercaseLetterCharacterSet_CMetInst != null)
	? (lowercaseLetterCharacterSet_CMetInst)
	: (lowercaseLetterCharacterSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lowercaseLetterCharacterSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T lowercaseLetterCharacterSet(){
			final com.apple.jobjc.Invoke.MsgSend lowercaseLetterCharacterSet_CMetInst = get_lowercaseLetterCharacterSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lowercaseLetterCharacterSet_CMetInst.init(nativeBuffer, this);
		lowercaseLetterCharacterSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend newlineCharacterSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_newlineCharacterSet_CMetInst(){
		return ((newlineCharacterSet_CMetInst != null)
	? (newlineCharacterSet_CMetInst)
	: (newlineCharacterSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "newlineCharacterSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T newlineCharacterSet(){
			final com.apple.jobjc.Invoke.MsgSend newlineCharacterSet_CMetInst = get_newlineCharacterSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		newlineCharacterSet_CMetInst.init(nativeBuffer, this);
		newlineCharacterSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nonBaseCharacterSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nonBaseCharacterSet_CMetInst(){
		return ((nonBaseCharacterSet_CMetInst != null)
	? (nonBaseCharacterSet_CMetInst)
	: (nonBaseCharacterSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nonBaseCharacterSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T nonBaseCharacterSet(){
			final com.apple.jobjc.Invoke.MsgSend nonBaseCharacterSet_CMetInst = get_nonBaseCharacterSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nonBaseCharacterSet_CMetInst.init(nativeBuffer, this);
		nonBaseCharacterSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend punctuationCharacterSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_punctuationCharacterSet_CMetInst(){
		return ((punctuationCharacterSet_CMetInst != null)
	? (punctuationCharacterSet_CMetInst)
	: (punctuationCharacterSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "punctuationCharacterSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T punctuationCharacterSet(){
			final com.apple.jobjc.Invoke.MsgSend punctuationCharacterSet_CMetInst = get_punctuationCharacterSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		punctuationCharacterSet_CMetInst.init(nativeBuffer, this);
		punctuationCharacterSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend symbolCharacterSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_symbolCharacterSet_CMetInst(){
		return ((symbolCharacterSet_CMetInst != null)
	? (symbolCharacterSet_CMetInst)
	: (symbolCharacterSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "symbolCharacterSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T symbolCharacterSet(){
			final com.apple.jobjc.Invoke.MsgSend symbolCharacterSet_CMetInst = get_symbolCharacterSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		symbolCharacterSet_CMetInst.init(nativeBuffer, this);
		symbolCharacterSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend uppercaseLetterCharacterSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_uppercaseLetterCharacterSet_CMetInst(){
		return ((uppercaseLetterCharacterSet_CMetInst != null)
	? (uppercaseLetterCharacterSet_CMetInst)
	: (uppercaseLetterCharacterSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "uppercaseLetterCharacterSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T uppercaseLetterCharacterSet(){
			final com.apple.jobjc.Invoke.MsgSend uppercaseLetterCharacterSet_CMetInst = get_uppercaseLetterCharacterSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		uppercaseLetterCharacterSet_CMetInst.init(nativeBuffer, this);
		uppercaseLetterCharacterSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend whitespaceAndNewlineCharacterSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_whitespaceAndNewlineCharacterSet_CMetInst(){
		return ((whitespaceAndNewlineCharacterSet_CMetInst != null)
	? (whitespaceAndNewlineCharacterSet_CMetInst)
	: (whitespaceAndNewlineCharacterSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "whitespaceAndNewlineCharacterSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T whitespaceAndNewlineCharacterSet(){
			final com.apple.jobjc.Invoke.MsgSend whitespaceAndNewlineCharacterSet_CMetInst = get_whitespaceAndNewlineCharacterSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		whitespaceAndNewlineCharacterSet_CMetInst.init(nativeBuffer, this);
		whitespaceAndNewlineCharacterSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend whitespaceCharacterSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_whitespaceCharacterSet_CMetInst(){
		return ((whitespaceCharacterSet_CMetInst != null)
	? (whitespaceCharacterSet_CMetInst)
	: (whitespaceCharacterSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "whitespaceCharacterSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T whitespaceCharacterSet(){
			final com.apple.jobjc.Invoke.MsgSend whitespaceCharacterSet_CMetInst = get_whitespaceCharacterSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		whitespaceCharacterSet_CMetInst.init(nativeBuffer, this);
		whitespaceCharacterSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
