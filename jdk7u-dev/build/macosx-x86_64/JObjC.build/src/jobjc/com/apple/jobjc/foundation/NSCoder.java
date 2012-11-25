package com.apple.jobjc.foundation;

public  class NSCoder extends com.apple.jobjc.foundation.NSObject {
	public NSCoder(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSCoder(final NSCoder obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend allowedClasses_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowedClasses_IMetInst(){
		return ((allowedClasses_IMetInst != null)
	? (allowedClasses_IMetInst)
	: (allowedClasses_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowedClasses", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSet allowedClasses(){
			final com.apple.jobjc.Invoke.MsgSend allowedClasses_IMetInst = get_allowedClasses_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowedClasses_IMetInst.init(nativeBuffer, this);
		allowedClasses_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSSet returnValue = (com.apple.jobjc.foundation.NSSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsKeyedCoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsKeyedCoding_IMetInst(){
		return ((allowsKeyedCoding_IMetInst != null)
	? (allowsKeyedCoding_IMetInst)
	: (allowsKeyedCoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsKeyedCoding", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsKeyedCoding(){
			final com.apple.jobjc.Invoke.MsgSend allowsKeyedCoding_IMetInst = get_allowsKeyedCoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsKeyedCoding_IMetInst.init(nativeBuffer, this);
		allowsKeyedCoding_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend decodeArrayOfObjCType_count_at_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeArrayOfObjCType_count_at_IMetInst(){
		return ((decodeArrayOfObjCType_count_at_IMetInst != null)
	? (decodeArrayOfObjCType_count_at_IMetInst)
	: (decodeArrayOfObjCType_count_at_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeArrayOfObjCType:count:at:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void decodeArrayOfObjCType_count_at(final com.apple.jobjc.Pointer<java.lang.Byte> itemType, final long count, final com.apple.jobjc.Pointer<Void> array){
			final com.apple.jobjc.Invoke.MsgSend decodeArrayOfObjCType_count_at_IMetInst = get_decodeArrayOfObjCType_count_at_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeArrayOfObjCType_count_at_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, itemType);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, count);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, array);
		decodeArrayOfObjCType_count_at_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend decodeBytesWithReturnedLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeBytesWithReturnedLength_IMetInst(){
		return ((decodeBytesWithReturnedLength_IMetInst != null)
	? (decodeBytesWithReturnedLength_IMetInst)
	: (decodeBytesWithReturnedLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeBytesWithReturnedLength:", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> decodeBytesWithReturnedLength(final com.apple.jobjc.Pointer<java.lang.Long> lengthp){
			final com.apple.jobjc.Invoke.MsgSend decodeBytesWithReturnedLength_IMetInst = get_decodeBytesWithReturnedLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeBytesWithReturnedLength_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, lengthp);
		decodeBytesWithReturnedLength_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodeDataObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeDataObject_IMetInst(){
		return ((decodeDataObject_IMetInst != null)
	? (decodeDataObject_IMetInst)
	: (decodeDataObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeDataObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData decodeDataObject(){
			final com.apple.jobjc.Invoke.MsgSend decodeDataObject_IMetInst = get_decodeDataObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeDataObject_IMetInst.init(nativeBuffer, this);
		decodeDataObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend decodeIntegerForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeIntegerForKey_IMetInst(){
		return ((decodeIntegerForKey_IMetInst != null)
	? (decodeIntegerForKey_IMetInst)
	: (decodeIntegerForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeIntegerForKey:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long decodeIntegerForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend decodeIntegerForKey_IMetInst = get_decodeIntegerForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeIntegerForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		decodeIntegerForKey_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodeNXObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeNXObject_IMetInst(){
		return ((decodeNXObject_IMetInst != null)
	? (decodeNXObject_IMetInst)
	: (decodeNXObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeNXObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T decodeNXObject(){
			final com.apple.jobjc.Invoke.MsgSend decodeNXObject_IMetInst = get_decodeNXObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeNXObject_IMetInst.init(nativeBuffer, this);
		decodeNXObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodeObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeObject_IMetInst(){
		return ((decodeObject_IMetInst != null)
	? (decodeObject_IMetInst)
	: (decodeObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T decodeObject(){
			final com.apple.jobjc.Invoke.MsgSend decodeObject_IMetInst = get_decodeObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeObject_IMetInst.init(nativeBuffer, this);
		decodeObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend decodeObjectOfClass_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeObjectOfClass_forKey_IMetInst(){
		return ((decodeObjectOfClass_forKey_IMetInst != null)
	? (decodeObjectOfClass_forKey_IMetInst)
	: (decodeObjectOfClass_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeObjectOfClass:forKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T decodeObjectOfClass_forKey(final com.apple.jobjc.NSClass aClass, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend decodeObjectOfClass_forKey_IMetInst = get_decodeObjectOfClass_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeObjectOfClass_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, aClass);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		decodeObjectOfClass_forKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodeObjectOfClasses_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeObjectOfClasses_forKey_IMetInst(){
		return ((decodeObjectOfClasses_forKey_IMetInst != null)
	? (decodeObjectOfClasses_forKey_IMetInst)
	: (decodeObjectOfClasses_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeObjectOfClasses:forKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T decodeObjectOfClasses_forKey(final com.apple.jobjc.foundation.NSSet classes, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend decodeObjectOfClasses_forKey_IMetInst = get_decodeObjectOfClasses_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeObjectOfClasses_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, classes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		decodeObjectOfClasses_forKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodePoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodePoint_IMetInst(){
		return ((decodePoint_IMetInst != null)
	? (decodePoint_IMetInst)
	: (decodePoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodePoint", com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint decodePoint(){
			final com.apple.jobjc.Invoke.MsgSend decodePoint_IMetInst = get_decodePoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodePoint_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		decodePoint_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodePointForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodePointForKey_IMetInst(){
		return ((decodePointForKey_IMetInst != null)
	? (decodePointForKey_IMetInst)
	: (decodePointForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodePointForKey:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPoint decodePointForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend decodePointForKey_IMetInst = get_decodePointForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodePointForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		decodePointForKey_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodePropertyList_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodePropertyList_IMetInst(){
		return ((decodePropertyList_IMetInst != null)
	? (decodePropertyList_IMetInst)
	: (decodePropertyList_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodePropertyList", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T decodePropertyList(){
			final com.apple.jobjc.Invoke.MsgSend decodePropertyList_IMetInst = get_decodePropertyList_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodePropertyList_IMetInst.init(nativeBuffer, this);
		decodePropertyList_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodePropertyListForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodePropertyListForKey_IMetInst(){
		return ((decodePropertyListForKey_IMetInst != null)
	? (decodePropertyListForKey_IMetInst)
	: (decodePropertyListForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodePropertyListForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T decodePropertyListForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend decodePropertyListForKey_IMetInst = get_decodePropertyListForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodePropertyListForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		decodePropertyListForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodeRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeRect_IMetInst(){
		return ((decodeRect_IMetInst != null)
	? (decodeRect_IMetInst)
	: (decodeRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeRect", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect decodeRect(){
			final com.apple.jobjc.Invoke.MsgSend decodeRect_IMetInst = get_decodeRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeRect_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		decodeRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodeRectForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeRectForKey_IMetInst(){
		return ((decodeRectForKey_IMetInst != null)
	? (decodeRectForKey_IMetInst)
	: (decodeRectForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeRectForKey:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect decodeRectForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend decodeRectForKey_IMetInst = get_decodeRectForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeRectForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		decodeRectForKey_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodeSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeSize_IMetInst(){
		return ((decodeSize_IMetInst != null)
	? (decodeSize_IMetInst)
	: (decodeSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize decodeSize(){
			final com.apple.jobjc.Invoke.MsgSend decodeSize_IMetInst = get_decodeSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		decodeSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodeSizeForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeSizeForKey_IMetInst(){
		return ((decodeSizeForKey_IMetInst != null)
	? (decodeSizeForKey_IMetInst)
	: (decodeSizeForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeSizeForKey:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSize decodeSizeForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend decodeSizeForKey_IMetInst = get_decodeSizeForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeSizeForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		decodeSizeForKey_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodeValueOfObjCType_at_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeValueOfObjCType_at_IMetInst(){
		return ((decodeValueOfObjCType_at_IMetInst != null)
	? (decodeValueOfObjCType_at_IMetInst)
	: (decodeValueOfObjCType_at_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeValueOfObjCType:at:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void decodeValueOfObjCType_at(final com.apple.jobjc.Pointer<java.lang.Byte> type, final com.apple.jobjc.Pointer<Void> data){
			final com.apple.jobjc.Invoke.MsgSend decodeValueOfObjCType_at_IMetInst = get_decodeValueOfObjCType_at_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeValueOfObjCType_at_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, type);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, data);
		decodeValueOfObjCType_at_IMetInst.invoke(nativeBuffer);
		
		
	}

	 public void decodeValuesOfObjCTypes(final com.apple.jobjc.Pointer<java.lang.Byte> types, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[1 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.PointerCoder.INST;
for(int i = 1; i < (1 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 1]);
final com.apple.jobjc.Invoke.MsgSend decodeValuesOfObjCTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeValuesOfObjCTypes:", com.apple.jobjc.Coder.VoidCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeValuesOfObjCTypes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, types);
		for(int i = 1; i < (1 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 1]);
		decodeValuesOfObjCTypes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeArrayOfObjCType_count_at_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeArrayOfObjCType_count_at_IMetInst(){
		return ((encodeArrayOfObjCType_count_at_IMetInst != null)
	? (encodeArrayOfObjCType_count_at_IMetInst)
	: (encodeArrayOfObjCType_count_at_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeArrayOfObjCType:count:at:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void encodeArrayOfObjCType_count_at(final com.apple.jobjc.Pointer<java.lang.Byte> type, final long count, final com.apple.jobjc.Pointer<Void> array){
			final com.apple.jobjc.Invoke.MsgSend encodeArrayOfObjCType_count_at_IMetInst = get_encodeArrayOfObjCType_count_at_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeArrayOfObjCType_count_at_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, type);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, count);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, array);
		encodeArrayOfObjCType_count_at_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeBool_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeBool_forKey_IMetInst(){
		return ((encodeBool_forKey_IMetInst != null)
	? (encodeBool_forKey_IMetInst)
	: (encodeBool_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeBool:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeBool_forKey(final boolean boolv, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeBool_forKey_IMetInst = get_encodeBool_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeBool_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, boolv);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeBool_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeBycopyObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeBycopyObject_IMetInst(){
		return ((encodeBycopyObject_IMetInst != null)
	? (encodeBycopyObject_IMetInst)
	: (encodeBycopyObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeBycopyObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeBycopyObject(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend encodeBycopyObject_IMetInst = get_encodeBycopyObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeBycopyObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		encodeBycopyObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeByrefObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeByrefObject_IMetInst(){
		return ((encodeByrefObject_IMetInst != null)
	? (encodeByrefObject_IMetInst)
	: (encodeByrefObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeByrefObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeByrefObject(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend encodeByrefObject_IMetInst = get_encodeByrefObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeByrefObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		encodeByrefObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeBytes_length_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeBytes_length_IMetInst(){
		return ((encodeBytes_length_IMetInst != null)
	? (encodeBytes_length_IMetInst)
	: (encodeBytes_length_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeBytes:length:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void encodeBytes_length(final com.apple.jobjc.Pointer<Void> byteaddr, final long length){
			final com.apple.jobjc.Invoke.MsgSend encodeBytes_length_IMetInst = get_encodeBytes_length_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeBytes_length_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, byteaddr);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		encodeBytes_length_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeBytes_length_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeBytes_length_forKey_IMetInst(){
		return ((encodeBytes_length_forKey_IMetInst != null)
	? (encodeBytes_length_forKey_IMetInst)
	: (encodeBytes_length_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeBytes:length:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeBytes_length_forKey(final com.apple.jobjc.Pointer<java.lang.Byte> bytesp, final long lenv, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeBytes_length_forKey_IMetInst = get_encodeBytes_length_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeBytes_length_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytesp);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, lenv);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeBytes_length_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeConditionalObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeConditionalObject_IMetInst(){
		return ((encodeConditionalObject_IMetInst != null)
	? (encodeConditionalObject_IMetInst)
	: (encodeConditionalObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeConditionalObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeConditionalObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend encodeConditionalObject_IMetInst = get_encodeConditionalObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeConditionalObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		encodeConditionalObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeConditionalObject_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeConditionalObject_forKey_IMetInst(){
		return ((encodeConditionalObject_forKey_IMetInst != null)
	? (encodeConditionalObject_forKey_IMetInst)
	: (encodeConditionalObject_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeConditionalObject:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeConditionalObject_forKey(final com.apple.jobjc.ID objv, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeConditionalObject_forKey_IMetInst = get_encodeConditionalObject_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeConditionalObject_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objv);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeConditionalObject_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeDataObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeDataObject_IMetInst(){
		return ((encodeDataObject_IMetInst != null)
	? (encodeDataObject_IMetInst)
	: (encodeDataObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeDataObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeDataObject(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend encodeDataObject_IMetInst = get_encodeDataObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeDataObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		encodeDataObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeDouble_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeDouble_forKey_IMetInst(){
		return ((encodeDouble_forKey_IMetInst != null)
	? (encodeDouble_forKey_IMetInst)
	: (encodeDouble_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeDouble:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeDouble_forKey(final double realv, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeDouble_forKey_IMetInst = get_encodeDouble_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeDouble_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, realv);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeDouble_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeFloat_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeFloat_forKey_IMetInst(){
		return ((encodeFloat_forKey_IMetInst != null)
	? (encodeFloat_forKey_IMetInst)
	: (encodeFloat_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeFloat:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeFloat_forKey(final float realv, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeFloat_forKey_IMetInst = get_encodeFloat_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeFloat_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, realv);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeFloat_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeInt32_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeInt32_forKey_IMetInst(){
		return ((encodeInt32_forKey_IMetInst != null)
	? (encodeInt32_forKey_IMetInst)
	: (encodeInt32_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeInt32:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeInt32_forKey(final int intv, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeInt32_forKey_IMetInst = get_encodeInt32_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeInt32_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, intv);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeInt32_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeInt64_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeInt64_forKey_IMetInst(){
		return ((encodeInt64_forKey_IMetInst != null)
	? (encodeInt64_forKey_IMetInst)
	: (encodeInt64_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeInt64:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeInt64_forKey(final long intv, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeInt64_forKey_IMetInst = get_encodeInt64_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeInt64_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST.push(nativeBuffer, intv);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeInt64_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeInt_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeInt_forKey_IMetInst(){
		return ((encodeInt_forKey_IMetInst != null)
	? (encodeInt_forKey_IMetInst)
	: (encodeInt_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeInt:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeInt_forKey(final int intv, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeInt_forKey_IMetInst = get_encodeInt_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeInt_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, intv);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeInt_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeInteger_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeInteger_forKey_IMetInst(){
		return ((encodeInteger_forKey_IMetInst != null)
	? (encodeInteger_forKey_IMetInst)
	: (encodeInteger_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeInteger:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeInteger_forKey(final long intv, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeInteger_forKey_IMetInst = get_encodeInteger_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeInteger_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, intv);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeInteger_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeNXObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeNXObject_IMetInst(){
		return ((encodeNXObject_IMetInst != null)
	? (encodeNXObject_IMetInst)
	: (encodeNXObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeNXObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeNXObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend encodeNXObject_IMetInst = get_encodeNXObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeNXObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		encodeNXObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeObject_IMetInst(){
		return ((encodeObject_IMetInst != null)
	? (encodeObject_IMetInst)
	: (encodeObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend encodeObject_IMetInst = get_encodeObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		encodeObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeObject_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeObject_forKey_IMetInst(){
		return ((encodeObject_forKey_IMetInst != null)
	? (encodeObject_forKey_IMetInst)
	: (encodeObject_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeObject:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeObject_forKey(final com.apple.jobjc.ID objv, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeObject_forKey_IMetInst = get_encodeObject_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeObject_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objv);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeObject_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodePoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodePoint_IMetInst(){
		return ((encodePoint_IMetInst != null)
	? (encodePoint_IMetInst)
	: (encodePoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodePoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void encodePoint(final com.apple.jobjc.foundation.NSPoint point){
			final com.apple.jobjc.Invoke.MsgSend encodePoint_IMetInst = get_encodePoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodePoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		encodePoint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodePoint_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodePoint_forKey_IMetInst(){
		return ((encodePoint_forKey_IMetInst != null)
	? (encodePoint_forKey_IMetInst)
	: (encodePoint_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodePoint:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodePoint_forKey(final com.apple.jobjc.foundation.NSPoint point, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodePoint_forKey_IMetInst = get_encodePoint_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodePoint_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodePoint_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodePropertyList_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodePropertyList_IMetInst(){
		return ((encodePropertyList_IMetInst != null)
	? (encodePropertyList_IMetInst)
	: (encodePropertyList_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodePropertyList:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodePropertyList(final com.apple.jobjc.ID aPropertyList){
			final com.apple.jobjc.Invoke.MsgSend encodePropertyList_IMetInst = get_encodePropertyList_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodePropertyList_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aPropertyList);
		encodePropertyList_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeRect_IMetInst(){
		return ((encodeRect_IMetInst != null)
	? (encodeRect_IMetInst)
	: (encodeRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void encodeRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend encodeRect_IMetInst = get_encodeRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		encodeRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeRect_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeRect_forKey_IMetInst(){
		return ((encodeRect_forKey_IMetInst != null)
	? (encodeRect_forKey_IMetInst)
	: (encodeRect_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeRect:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeRect_forKey(final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeRect_forKey_IMetInst = get_encodeRect_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeRect_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeRect_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeRootObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeRootObject_IMetInst(){
		return ((encodeRootObject_IMetInst != null)
	? (encodeRootObject_IMetInst)
	: (encodeRootObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeRootObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeRootObject(final com.apple.jobjc.ID rootObject){
			final com.apple.jobjc.Invoke.MsgSend encodeRootObject_IMetInst = get_encodeRootObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeRootObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rootObject);
		encodeRootObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeSize_IMetInst(){
		return ((encodeSize_IMetInst != null)
	? (encodeSize_IMetInst)
	: (encodeSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void encodeSize(final com.apple.jobjc.foundation.NSSize size){
			final com.apple.jobjc.Invoke.MsgSend encodeSize_IMetInst = get_encodeSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		encodeSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeSize_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeSize_forKey_IMetInst(){
		return ((encodeSize_forKey_IMetInst != null)
	? (encodeSize_forKey_IMetInst)
	: (encodeSize_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeSize:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeSize_forKey(final com.apple.jobjc.foundation.NSSize size, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeSize_forKey_IMetInst = get_encodeSize_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeSize_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeSize_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeValueOfObjCType_at_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeValueOfObjCType_at_IMetInst(){
		return ((encodeValueOfObjCType_at_IMetInst != null)
	? (encodeValueOfObjCType_at_IMetInst)
	: (encodeValueOfObjCType_at_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeValueOfObjCType:at:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void encodeValueOfObjCType_at(final com.apple.jobjc.Pointer<java.lang.Byte> type, final com.apple.jobjc.Pointer<Void> addr){
			final com.apple.jobjc.Invoke.MsgSend encodeValueOfObjCType_at_IMetInst = get_encodeValueOfObjCType_at_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeValueOfObjCType_at_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, type);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, addr);
		encodeValueOfObjCType_at_IMetInst.invoke(nativeBuffer);
		
		
	}

	 public void encodeValuesOfObjCTypes(final com.apple.jobjc.Pointer<java.lang.Byte> types, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[1 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.PointerCoder.INST;
for(int i = 1; i < (1 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 1]);
final com.apple.jobjc.Invoke.MsgSend encodeValuesOfObjCTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeValuesOfObjCTypes:", com.apple.jobjc.Coder.VoidCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeValuesOfObjCTypes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, types);
		for(int i = 1; i < (1 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 1]);
		encodeValuesOfObjCTypes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend objectZone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectZone_IMetInst(){
		return ((objectZone_IMetInst != null)
	? (objectZone_IMetInst)
	: (objectZone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectZone", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> objectZone(){
			final com.apple.jobjc.Invoke.MsgSend objectZone_IMetInst = get_objectZone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectZone_IMetInst.init(nativeBuffer, this);
		objectZone_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> returnValue = (com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend requiresSecureCoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_requiresSecureCoding_IMetInst(){
		return ((requiresSecureCoding_IMetInst != null)
	? (requiresSecureCoding_IMetInst)
	: (requiresSecureCoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "requiresSecureCoding", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean requiresSecureCoding(){
			final com.apple.jobjc.Invoke.MsgSend requiresSecureCoding_IMetInst = get_requiresSecureCoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		requiresSecureCoding_IMetInst.init(nativeBuffer, this);
		requiresSecureCoding_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setObjectZone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setObjectZone_IMetInst(){
		return ((setObjectZone_IMetInst != null)
	? (setObjectZone_IMetInst)
	: (setObjectZone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setObjectZone:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void setObjectZone(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone){
			final com.apple.jobjc.Invoke.MsgSend setObjectZone_IMetInst = get_setObjectZone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setObjectZone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		setObjectZone_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend systemVersion_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_systemVersion_IMetInst(){
		return ((systemVersion_IMetInst != null)
	? (systemVersion_IMetInst)
	: (systemVersion_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "systemVersion", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public int systemVersion(){
			final com.apple.jobjc.Invoke.MsgSend systemVersion_IMetInst = get_systemVersion_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		systemVersion_IMetInst.init(nativeBuffer, this);
		systemVersion_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend versionForClassName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_versionForClassName_IMetInst(){
		return ((versionForClassName_IMetInst != null)
	? (versionForClassName_IMetInst)
	: (versionForClassName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "versionForClassName:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long versionForClassName(final com.apple.jobjc.foundation.NSString className){
			final com.apple.jobjc.Invoke.MsgSend versionForClassName_IMetInst = get_versionForClassName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		versionForClassName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, className);
		versionForClassName_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
