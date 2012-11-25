package com.apple.jobjc.foundation;

public  class NSKeyedUnarchiver extends com.apple.jobjc.foundation.NSCoder {
	public NSKeyedUnarchiver(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSKeyedUnarchiver(final NSKeyedUnarchiver obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend classForClassName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classForClassName_IMetInst(){
		return ((classForClassName_IMetInst != null)
	? (classForClassName_IMetInst)
	: (classForClassName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classForClassName:", com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T classForClassName(final com.apple.jobjc.foundation.NSString codedName){
			final com.apple.jobjc.Invoke.MsgSend classForClassName_IMetInst = get_classForClassName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classForClassName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, codedName);
		classForClassName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend containsValueForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_containsValueForKey_IMetInst(){
		return ((containsValueForKey_IMetInst != null)
	? (containsValueForKey_IMetInst)
	: (containsValueForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "containsValueForKey:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean containsValueForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend containsValueForKey_IMetInst = get_containsValueForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		containsValueForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		containsValueForKey_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodeBoolForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeBoolForKey_IMetInst(){
		return ((decodeBoolForKey_IMetInst != null)
	? (decodeBoolForKey_IMetInst)
	: (decodeBoolForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeBoolForKey:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean decodeBoolForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend decodeBoolForKey_IMetInst = get_decodeBoolForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeBoolForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		decodeBoolForKey_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodeBytesForKey_returnedLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeBytesForKey_returnedLength_IMetInst(){
		return ((decodeBytesForKey_returnedLength_IMetInst != null)
	? (decodeBytesForKey_returnedLength_IMetInst)
	: (decodeBytesForKey_returnedLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeBytesForKey:returnedLength:", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<java.lang.Byte> decodeBytesForKey_returnedLength(final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.Pointer<java.lang.Long> lengthp){
			final com.apple.jobjc.Invoke.MsgSend decodeBytesForKey_returnedLength_IMetInst = get_decodeBytesForKey_returnedLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeBytesForKey_returnedLength_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, lengthp);
		decodeBytesForKey_returnedLength_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<java.lang.Byte> returnValue = (com.apple.jobjc.Pointer<java.lang.Byte>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodeDoubleForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeDoubleForKey_IMetInst(){
		return ((decodeDoubleForKey_IMetInst != null)
	? (decodeDoubleForKey_IMetInst)
	: (decodeDoubleForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeDoubleForKey:", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public double decodeDoubleForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend decodeDoubleForKey_IMetInst = get_decodeDoubleForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeDoubleForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		decodeDoubleForKey_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodeFloatForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeFloatForKey_IMetInst(){
		return ((decodeFloatForKey_IMetInst != null)
	? (decodeFloatForKey_IMetInst)
	: (decodeFloatForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeFloatForKey:", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public float decodeFloatForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend decodeFloatForKey_IMetInst = get_decodeFloatForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeFloatForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		decodeFloatForKey_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodeInt32ForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeInt32ForKey_IMetInst(){
		return ((decodeInt32ForKey_IMetInst != null)
	? (decodeInt32ForKey_IMetInst)
	: (decodeInt32ForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeInt32ForKey:", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public int decodeInt32ForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend decodeInt32ForKey_IMetInst = get_decodeInt32ForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeInt32ForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		decodeInt32ForKey_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodeInt64ForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeInt64ForKey_IMetInst(){
		return ((decodeInt64ForKey_IMetInst != null)
	? (decodeInt64ForKey_IMetInst)
	: (decodeInt64ForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeInt64ForKey:", com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long decodeInt64ForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend decodeInt64ForKey_IMetInst = get_decodeInt64ForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeInt64ForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		decodeInt64ForKey_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodeIntForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeIntForKey_IMetInst(){
		return ((decodeIntForKey_IMetInst != null)
	? (decodeIntForKey_IMetInst)
	: (decodeIntForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeIntForKey:", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public int decodeIntForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend decodeIntForKey_IMetInst = get_decodeIntForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeIntForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		decodeIntForKey_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodeObjectForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeObjectForKey_IMetInst(){
		return ((decodeObjectForKey_IMetInst != null)
	? (decodeObjectForKey_IMetInst)
	: (decodeObjectForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeObjectForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T decodeObjectForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend decodeObjectForKey_IMetInst = get_decodeObjectForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeObjectForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		decodeObjectForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend finishDecoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_finishDecoding_IMetInst(){
		return ((finishDecoding_IMetInst != null)
	? (finishDecoding_IMetInst)
	: (finishDecoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "finishDecoding", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void finishDecoding(){
			final com.apple.jobjc.Invoke.MsgSend finishDecoding_IMetInst = get_finishDecoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		finishDecoding_IMetInst.init(nativeBuffer, this);
		finishDecoding_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initForReadingWithData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initForReadingWithData_IMetInst(){
		return ((initForReadingWithData_IMetInst != null)
	? (initForReadingWithData_IMetInst)
	: (initForReadingWithData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initForReadingWithData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initForReadingWithData(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend initForReadingWithData_IMetInst = get_initForReadingWithData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initForReadingWithData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		initForReadingWithData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setClass_forClassName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setClass_forClassName_IMetInst(){
		return ((setClass_forClassName_IMetInst != null)
	? (setClass_forClassName_IMetInst)
	: (setClass_forClassName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setClass:forClassName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setClass_forClassName(final com.apple.jobjc.NSClass cls, final com.apple.jobjc.foundation.NSString codedName){
			final com.apple.jobjc.Invoke.MsgSend setClass_forClassName_IMetInst = get_setClass_forClassName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setClass_forClassName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, cls);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, codedName);
		setClass_forClassName_IMetInst.invoke(nativeBuffer);
		
		
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

}
