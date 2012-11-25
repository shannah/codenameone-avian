package com.apple.jobjc.foundation;

public  class NSAppleEventDescriptorClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSAppleEventDescriptorClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSAppleEventDescriptorClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSAppleEventDescriptorClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend appleEventWithEventClass_eventID_targetDescriptor_returnID_transactionID_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appleEventWithEventClass_eventID_targetDescriptor_returnID_transactionID_CMetInst(){
		return ((appleEventWithEventClass_eventID_targetDescriptor_returnID_transactionID_CMetInst != null)
	? (appleEventWithEventClass_eventID_targetDescriptor_returnID_transactionID_CMetInst)
	: (appleEventWithEventClass_eventID_targetDescriptor_returnID_transactionID_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appleEventWithEventClass:eventID:targetDescriptor:returnID:transactionID:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SShortCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SLongSIntCoder)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor appleEventWithEventClass_eventID_targetDescriptor_returnID_transactionID(final int eventClass, final int eventID, final com.apple.jobjc.foundation.NSAppleEventDescriptor targetDescriptor, final short returnID, final int transactionID){
			final com.apple.jobjc.Invoke.MsgSend appleEventWithEventClass_eventID_targetDescriptor_returnID_transactionID_CMetInst = get_appleEventWithEventClass_eventID_targetDescriptor_returnID_transactionID_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appleEventWithEventClass_eventID_targetDescriptor_returnID_transactionID_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, eventClass);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, eventID);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, targetDescriptor);
		com.apple.jobjc.PrimitiveCoder.SShortCoder.INST.push(nativeBuffer, returnID);
		com.apple.jobjc.MixedPrimitiveCoder.SLongSIntCoder.push(nativeBuffer, transactionID);
		appleEventWithEventClass_eventID_targetDescriptor_returnID_transactionID_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptorWithBoolean_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptorWithBoolean_CMetInst(){
		return ((descriptorWithBoolean_CMetInst != null)
	? (descriptorWithBoolean_CMetInst)
	: (descriptorWithBoolean_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptorWithBoolean:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor descriptorWithBoolean(final boolean boolean0){
			final com.apple.jobjc.Invoke.MsgSend descriptorWithBoolean_CMetInst = get_descriptorWithBoolean_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptorWithBoolean_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, boolean0);
		descriptorWithBoolean_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptorWithDescriptorType_bytes_length_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptorWithDescriptorType_bytes_length_CMetInst(){
		return ((descriptorWithDescriptorType_bytes_length_CMetInst != null)
	? (descriptorWithDescriptorType_bytes_length_CMetInst)
	: (descriptorWithDescriptorType_bytes_length_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptorWithDescriptorType:bytes:length:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor descriptorWithDescriptorType_bytes_length(final int descriptorType, final com.apple.jobjc.Pointer<Void> bytes, final long byteCount){
			final com.apple.jobjc.Invoke.MsgSend descriptorWithDescriptorType_bytes_length_CMetInst = get_descriptorWithDescriptorType_bytes_length_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptorWithDescriptorType_bytes_length_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, descriptorType);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, byteCount);
		descriptorWithDescriptorType_bytes_length_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptorWithDescriptorType_data_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptorWithDescriptorType_data_CMetInst(){
		return ((descriptorWithDescriptorType_data_CMetInst != null)
	? (descriptorWithDescriptorType_data_CMetInst)
	: (descriptorWithDescriptorType_data_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptorWithDescriptorType:data:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor descriptorWithDescriptorType_data(final int descriptorType, final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend descriptorWithDescriptorType_data_CMetInst = get_descriptorWithDescriptorType_data_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptorWithDescriptorType_data_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, descriptorType);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		descriptorWithDescriptorType_data_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptorWithEnumCode_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptorWithEnumCode_CMetInst(){
		return ((descriptorWithEnumCode_CMetInst != null)
	? (descriptorWithEnumCode_CMetInst)
	: (descriptorWithEnumCode_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptorWithEnumCode:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor descriptorWithEnumCode(final int enumerator){
			final com.apple.jobjc.Invoke.MsgSend descriptorWithEnumCode_CMetInst = get_descriptorWithEnumCode_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptorWithEnumCode_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, enumerator);
		descriptorWithEnumCode_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptorWithInt32_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptorWithInt32_CMetInst(){
		return ((descriptorWithInt32_CMetInst != null)
	? (descriptorWithInt32_CMetInst)
	: (descriptorWithInt32_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptorWithInt32:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SLongSIntCoder)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor descriptorWithInt32(final int signedInt){
			final com.apple.jobjc.Invoke.MsgSend descriptorWithInt32_CMetInst = get_descriptorWithInt32_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptorWithInt32_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SLongSIntCoder.push(nativeBuffer, signedInt);
		descriptorWithInt32_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptorWithString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptorWithString_CMetInst(){
		return ((descriptorWithString_CMetInst != null)
	? (descriptorWithString_CMetInst)
	: (descriptorWithString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptorWithString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor descriptorWithString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend descriptorWithString_CMetInst = get_descriptorWithString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptorWithString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		descriptorWithString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptorWithTypeCode_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptorWithTypeCode_CMetInst(){
		return ((descriptorWithTypeCode_CMetInst != null)
	? (descriptorWithTypeCode_CMetInst)
	: (descriptorWithTypeCode_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptorWithTypeCode:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor descriptorWithTypeCode(final int typeCode){
			final com.apple.jobjc.Invoke.MsgSend descriptorWithTypeCode_CMetInst = get_descriptorWithTypeCode_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptorWithTypeCode_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, typeCode);
		descriptorWithTypeCode_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend listDescriptor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_listDescriptor_CMetInst(){
		return ((listDescriptor_CMetInst != null)
	? (listDescriptor_CMetInst)
	: (listDescriptor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "listDescriptor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor listDescriptor(){
			final com.apple.jobjc.Invoke.MsgSend listDescriptor_CMetInst = get_listDescriptor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		listDescriptor_CMetInst.init(nativeBuffer, this);
		listDescriptor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nullDescriptor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nullDescriptor_CMetInst(){
		return ((nullDescriptor_CMetInst != null)
	? (nullDescriptor_CMetInst)
	: (nullDescriptor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nullDescriptor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor nullDescriptor(){
			final com.apple.jobjc.Invoke.MsgSend nullDescriptor_CMetInst = get_nullDescriptor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nullDescriptor_CMetInst.init(nativeBuffer, this);
		nullDescriptor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend recordDescriptor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_recordDescriptor_CMetInst(){
		return ((recordDescriptor_CMetInst != null)
	? (recordDescriptor_CMetInst)
	: (recordDescriptor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "recordDescriptor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor recordDescriptor(){
			final com.apple.jobjc.Invoke.MsgSend recordDescriptor_CMetInst = get_recordDescriptor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		recordDescriptor_CMetInst.init(nativeBuffer, this);
		recordDescriptor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
