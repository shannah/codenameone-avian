package com.apple.jobjc.foundation;

public  class NSScanner extends com.apple.jobjc.foundation.NSObject {
	public NSScanner(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSScanner(final NSScanner obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend caseSensitive_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_caseSensitive_IMetInst(){
		return ((caseSensitive_IMetInst != null)
	? (caseSensitive_IMetInst)
	: (caseSensitive_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "caseSensitive", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean caseSensitive(){
			final com.apple.jobjc.Invoke.MsgSend caseSensitive_IMetInst = get_caseSensitive_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		caseSensitive_IMetInst.init(nativeBuffer, this);
		caseSensitive_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend charactersToBeSkipped_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_charactersToBeSkipped_IMetInst(){
		return ((charactersToBeSkipped_IMetInst != null)
	? (charactersToBeSkipped_IMetInst)
	: (charactersToBeSkipped_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "charactersToBeSkipped", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSCharacterSet charactersToBeSkipped(){
			final com.apple.jobjc.Invoke.MsgSend charactersToBeSkipped_IMetInst = get_charactersToBeSkipped_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		charactersToBeSkipped_IMetInst.init(nativeBuffer, this);
		charactersToBeSkipped_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSCharacterSet returnValue = (com.apple.jobjc.foundation.NSCharacterSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithString_IMetInst(){
		return ((initWithString_IMetInst != null)
	? (initWithString_IMetInst)
	: (initWithString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend initWithString_IMetInst = get_initWithString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		initWithString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isAtEnd_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isAtEnd_IMetInst(){
		return ((isAtEnd_IMetInst != null)
	? (isAtEnd_IMetInst)
	: (isAtEnd_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isAtEnd", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isAtEnd(){
			final com.apple.jobjc.Invoke.MsgSend isAtEnd_IMetInst = get_isAtEnd_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isAtEnd_IMetInst.init(nativeBuffer, this);
		isAtEnd_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend locale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_locale_IMetInst(){
		return ((locale_IMetInst != null)
	? (locale_IMetInst)
	: (locale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "locale", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T locale(){
			final com.apple.jobjc.Invoke.MsgSend locale_IMetInst = get_locale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		locale_IMetInst.init(nativeBuffer, this);
		locale_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scanCharactersFromSet_intoString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scanCharactersFromSet_intoString_IMetInst(){
		return ((scanCharactersFromSet_intoString_IMetInst != null)
	? (scanCharactersFromSet_intoString_IMetInst)
	: (scanCharactersFromSet_intoString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scanCharactersFromSet:intoString:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean scanCharactersFromSet_intoString(final com.apple.jobjc.foundation.NSCharacterSet set, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSString> value){
			final com.apple.jobjc.Invoke.MsgSend scanCharactersFromSet_intoString_IMetInst = get_scanCharactersFromSet_intoString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scanCharactersFromSet_intoString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		scanCharactersFromSet_intoString_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scanDecimal_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scanDecimal_IMetInst(){
		return ((scanDecimal_IMetInst != null)
	? (scanDecimal_IMetInst)
	: (scanDecimal_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scanDecimal:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean scanDecimal(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDecimal> dcm){
			final com.apple.jobjc.Invoke.MsgSend scanDecimal_IMetInst = get_scanDecimal_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scanDecimal_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dcm);
		scanDecimal_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scanDouble_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scanDouble_IMetInst(){
		return ((scanDouble_IMetInst != null)
	? (scanDouble_IMetInst)
	: (scanDouble_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scanDouble:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean scanDouble(final com.apple.jobjc.Pointer<java.lang.Double> value){
			final com.apple.jobjc.Invoke.MsgSend scanDouble_IMetInst = get_scanDouble_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scanDouble_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		scanDouble_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scanFloat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scanFloat_IMetInst(){
		return ((scanFloat_IMetInst != null)
	? (scanFloat_IMetInst)
	: (scanFloat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scanFloat:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean scanFloat(final com.apple.jobjc.Pointer<java.lang.Float> value){
			final com.apple.jobjc.Invoke.MsgSend scanFloat_IMetInst = get_scanFloat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scanFloat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		scanFloat_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scanHexDouble_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scanHexDouble_IMetInst(){
		return ((scanHexDouble_IMetInst != null)
	? (scanHexDouble_IMetInst)
	: (scanHexDouble_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scanHexDouble:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean scanHexDouble(final com.apple.jobjc.Pointer<java.lang.Double> result){
			final com.apple.jobjc.Invoke.MsgSend scanHexDouble_IMetInst = get_scanHexDouble_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scanHexDouble_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, result);
		scanHexDouble_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scanHexFloat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scanHexFloat_IMetInst(){
		return ((scanHexFloat_IMetInst != null)
	? (scanHexFloat_IMetInst)
	: (scanHexFloat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scanHexFloat:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean scanHexFloat(final com.apple.jobjc.Pointer<java.lang.Float> result){
			final com.apple.jobjc.Invoke.MsgSend scanHexFloat_IMetInst = get_scanHexFloat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scanHexFloat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, result);
		scanHexFloat_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scanHexInt_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scanHexInt_IMetInst(){
		return ((scanHexInt_IMetInst != null)
	? (scanHexInt_IMetInst)
	: (scanHexInt_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scanHexInt:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean scanHexInt(final com.apple.jobjc.Pointer<java.lang.Integer> value){
			final com.apple.jobjc.Invoke.MsgSend scanHexInt_IMetInst = get_scanHexInt_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scanHexInt_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		scanHexInt_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scanHexLongLong_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scanHexLongLong_IMetInst(){
		return ((scanHexLongLong_IMetInst != null)
	? (scanHexLongLong_IMetInst)
	: (scanHexLongLong_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scanHexLongLong:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean scanHexLongLong(final com.apple.jobjc.Pointer<java.lang.Long> result){
			final com.apple.jobjc.Invoke.MsgSend scanHexLongLong_IMetInst = get_scanHexLongLong_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scanHexLongLong_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, result);
		scanHexLongLong_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scanInt_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scanInt_IMetInst(){
		return ((scanInt_IMetInst != null)
	? (scanInt_IMetInst)
	: (scanInt_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scanInt:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean scanInt(final com.apple.jobjc.Pointer<java.lang.Integer> value){
			final com.apple.jobjc.Invoke.MsgSend scanInt_IMetInst = get_scanInt_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scanInt_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		scanInt_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scanInteger_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scanInteger_IMetInst(){
		return ((scanInteger_IMetInst != null)
	? (scanInteger_IMetInst)
	: (scanInteger_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scanInteger:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean scanInteger(final com.apple.jobjc.Pointer<java.lang.Long> value){
			final com.apple.jobjc.Invoke.MsgSend scanInteger_IMetInst = get_scanInteger_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scanInteger_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		scanInteger_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scanLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scanLocation_IMetInst(){
		return ((scanLocation_IMetInst != null)
	? (scanLocation_IMetInst)
	: (scanLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scanLocation", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long scanLocation(){
			final com.apple.jobjc.Invoke.MsgSend scanLocation_IMetInst = get_scanLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scanLocation_IMetInst.init(nativeBuffer, this);
		scanLocation_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scanLongLong_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scanLongLong_IMetInst(){
		return ((scanLongLong_IMetInst != null)
	? (scanLongLong_IMetInst)
	: (scanLongLong_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scanLongLong:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean scanLongLong(final com.apple.jobjc.Pointer<java.lang.Long> value){
			final com.apple.jobjc.Invoke.MsgSend scanLongLong_IMetInst = get_scanLongLong_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scanLongLong_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		scanLongLong_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scanString_intoString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scanString_intoString_IMetInst(){
		return ((scanString_intoString_IMetInst != null)
	? (scanString_intoString_IMetInst)
	: (scanString_intoString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scanString:intoString:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean scanString_intoString(final com.apple.jobjc.foundation.NSString string, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSString> value){
			final com.apple.jobjc.Invoke.MsgSend scanString_intoString_IMetInst = get_scanString_intoString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scanString_intoString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		scanString_intoString_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scanUpToCharactersFromSet_intoString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scanUpToCharactersFromSet_intoString_IMetInst(){
		return ((scanUpToCharactersFromSet_intoString_IMetInst != null)
	? (scanUpToCharactersFromSet_intoString_IMetInst)
	: (scanUpToCharactersFromSet_intoString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scanUpToCharactersFromSet:intoString:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean scanUpToCharactersFromSet_intoString(final com.apple.jobjc.foundation.NSCharacterSet set, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSString> value){
			final com.apple.jobjc.Invoke.MsgSend scanUpToCharactersFromSet_intoString_IMetInst = get_scanUpToCharactersFromSet_intoString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scanUpToCharactersFromSet_intoString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		scanUpToCharactersFromSet_intoString_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scanUpToString_intoString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scanUpToString_intoString_IMetInst(){
		return ((scanUpToString_intoString_IMetInst != null)
	? (scanUpToString_intoString_IMetInst)
	: (scanUpToString_intoString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scanUpToString:intoString:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean scanUpToString_intoString(final com.apple.jobjc.foundation.NSString string, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSString> value){
			final com.apple.jobjc.Invoke.MsgSend scanUpToString_intoString_IMetInst = get_scanUpToString_intoString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scanUpToString_intoString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		scanUpToString_intoString_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setCaseSensitive_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCaseSensitive_IMetInst(){
		return ((setCaseSensitive_IMetInst != null)
	? (setCaseSensitive_IMetInst)
	: (setCaseSensitive_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCaseSensitive:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setCaseSensitive(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setCaseSensitive_IMetInst = get_setCaseSensitive_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCaseSensitive_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setCaseSensitive_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCharactersToBeSkipped_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCharactersToBeSkipped_IMetInst(){
		return ((setCharactersToBeSkipped_IMetInst != null)
	? (setCharactersToBeSkipped_IMetInst)
	: (setCharactersToBeSkipped_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCharactersToBeSkipped:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCharactersToBeSkipped(final com.apple.jobjc.foundation.NSCharacterSet set){
			final com.apple.jobjc.Invoke.MsgSend setCharactersToBeSkipped_IMetInst = get_setCharactersToBeSkipped_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCharactersToBeSkipped_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		setCharactersToBeSkipped_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLocale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLocale_IMetInst(){
		return ((setLocale_IMetInst != null)
	? (setLocale_IMetInst)
	: (setLocale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLocale:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setLocale(final com.apple.jobjc.ID locale){
			final com.apple.jobjc.Invoke.MsgSend setLocale_IMetInst = get_setLocale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLocale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		setLocale_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setScanLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setScanLocation_IMetInst(){
		return ((setScanLocation_IMetInst != null)
	? (setScanLocation_IMetInst)
	: (setScanLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setScanLocation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setScanLocation(final long pos){
			final com.apple.jobjc.Invoke.MsgSend setScanLocation_IMetInst = get_setScanLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setScanLocation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, pos);
		setScanLocation_IMetInst.invoke(nativeBuffer);
		
		
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
