package com.apple.jobjc.foundation;

public  class NSAppleEventDescriptor extends com.apple.jobjc.foundation.NSObject {
	public NSAppleEventDescriptor(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSAppleEventDescriptor(final NSAppleEventDescriptor obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend aeDesc_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_aeDesc_IMetInst(){
		return ((aeDesc_IMetInst != null)
	? (aeDesc_IMetInst)
	: (aeDesc_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "aeDesc", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* AEDesc* (^{AEDesc=I^^{OpaqueAEDataStorageType}}, ^{AEDesc=I^^{OpaqueAEDataStorageType}}) */ aeDesc(){
			final com.apple.jobjc.Invoke.MsgSend aeDesc_IMetInst = get_aeDesc_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		aeDesc_IMetInst.init(nativeBuffer, this);
		aeDesc_IMetInst.invoke(nativeBuffer);
		final Object /* AEDesc* (^{AEDesc=I^^{OpaqueAEDataStorageType}}, ^{AEDesc=I^^{OpaqueAEDataStorageType}}) */ returnValue = (Object /* AEDesc* (^{AEDesc=I^^{OpaqueAEDataStorageType}}, ^{AEDesc=I^^{OpaqueAEDataStorageType}}) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributeDescriptorForKeyword_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributeDescriptorForKeyword_IMetInst(){
		return ((attributeDescriptorForKeyword_IMetInst != null)
	? (attributeDescriptorForKeyword_IMetInst)
	: (attributeDescriptorForKeyword_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributeDescriptorForKeyword:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor attributeDescriptorForKeyword(final int keyword){
			final com.apple.jobjc.Invoke.MsgSend attributeDescriptorForKeyword_IMetInst = get_attributeDescriptorForKeyword_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributeDescriptorForKeyword_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, keyword);
		attributeDescriptorForKeyword_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend booleanValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_booleanValue_IMetInst(){
		return ((booleanValue_IMetInst != null)
	? (booleanValue_IMetInst)
	: (booleanValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "booleanValue", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean booleanValue(){
			final com.apple.jobjc.Invoke.MsgSend booleanValue_IMetInst = get_booleanValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		booleanValue_IMetInst.init(nativeBuffer, this);
		booleanValue_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend coerceToDescriptorType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_coerceToDescriptorType_IMetInst(){
		return ((coerceToDescriptorType_IMetInst != null)
	? (coerceToDescriptorType_IMetInst)
	: (coerceToDescriptorType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "coerceToDescriptorType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor coerceToDescriptorType(final int descriptorType){
			final com.apple.jobjc.Invoke.MsgSend coerceToDescriptorType_IMetInst = get_coerceToDescriptorType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		coerceToDescriptorType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, descriptorType);
		coerceToDescriptorType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend data_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_data_IMetInst(){
		return ((data_IMetInst != null)
	? (data_IMetInst)
	: (data_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "data", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData data(){
			final com.apple.jobjc.Invoke.MsgSend data_IMetInst = get_data_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		data_IMetInst.init(nativeBuffer, this);
		data_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptorAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptorAtIndex_IMetInst(){
		return ((descriptorAtIndex_IMetInst != null)
	? (descriptorAtIndex_IMetInst)
	: (descriptorAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptorAtIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor descriptorAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend descriptorAtIndex_IMetInst = get_descriptorAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptorAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		descriptorAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptorForKeyword_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptorForKeyword_IMetInst(){
		return ((descriptorForKeyword_IMetInst != null)
	? (descriptorForKeyword_IMetInst)
	: (descriptorForKeyword_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptorForKeyword:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor descriptorForKeyword(final int keyword){
			final com.apple.jobjc.Invoke.MsgSend descriptorForKeyword_IMetInst = get_descriptorForKeyword_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptorForKeyword_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, keyword);
		descriptorForKeyword_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptorType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptorType_IMetInst(){
		return ((descriptorType_IMetInst != null)
	? (descriptorType_IMetInst)
	: (descriptorType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptorType", com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public int descriptorType(){
			final com.apple.jobjc.Invoke.MsgSend descriptorType_IMetInst = get_descriptorType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptorType_IMetInst.init(nativeBuffer, this);
		descriptorType_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend enumCodeValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumCodeValue_IMetInst(){
		return ((enumCodeValue_IMetInst != null)
	? (enumCodeValue_IMetInst)
	: (enumCodeValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumCodeValue", com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public int enumCodeValue(){
			final com.apple.jobjc.Invoke.MsgSend enumCodeValue_IMetInst = get_enumCodeValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumCodeValue_IMetInst.init(nativeBuffer, this);
		enumCodeValue_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend eventClass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_eventClass_IMetInst(){
		return ((eventClass_IMetInst != null)
	? (eventClass_IMetInst)
	: (eventClass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "eventClass", com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public int eventClass(){
			final com.apple.jobjc.Invoke.MsgSend eventClass_IMetInst = get_eventClass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		eventClass_IMetInst.init(nativeBuffer, this);
		eventClass_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend eventID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_eventID_IMetInst(){
		return ((eventID_IMetInst != null)
	? (eventID_IMetInst)
	: (eventID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "eventID", com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public int eventID(){
			final com.apple.jobjc.Invoke.MsgSend eventID_IMetInst = get_eventID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		eventID_IMetInst.init(nativeBuffer, this);
		eventID_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initListDescriptor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initListDescriptor_IMetInst(){
		return ((initListDescriptor_IMetInst != null)
	? (initListDescriptor_IMetInst)
	: (initListDescriptor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initListDescriptor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initListDescriptor(){
			final com.apple.jobjc.Invoke.MsgSend initListDescriptor_IMetInst = get_initListDescriptor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initListDescriptor_IMetInst.init(nativeBuffer, this);
		initListDescriptor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initRecordDescriptor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initRecordDescriptor_IMetInst(){
		return ((initRecordDescriptor_IMetInst != null)
	? (initRecordDescriptor_IMetInst)
	: (initRecordDescriptor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initRecordDescriptor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initRecordDescriptor(){
			final com.apple.jobjc.Invoke.MsgSend initRecordDescriptor_IMetInst = get_initRecordDescriptor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initRecordDescriptor_IMetInst.init(nativeBuffer, this);
		initRecordDescriptor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithAEDescNoCopy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithAEDescNoCopy_IMetInst(){
		return ((initWithAEDescNoCopy_IMetInst != null)
	? (initWithAEDescNoCopy_IMetInst)
	: (initWithAEDescNoCopy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithAEDescNoCopy:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithAEDescNoCopy(final Object /* AEDesc* (^{AEDesc=I^^{OpaqueAEDataStorageType}}, ^{AEDesc=I^^{OpaqueAEDataStorageType}}) */ aeDesc){
			final com.apple.jobjc.Invoke.MsgSend initWithAEDescNoCopy_IMetInst = get_initWithAEDescNoCopy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithAEDescNoCopy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, aeDesc);
		initWithAEDescNoCopy_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithDescriptorType_bytes_length_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithDescriptorType_bytes_length_IMetInst(){
		return ((initWithDescriptorType_bytes_length_IMetInst != null)
	? (initWithDescriptorType_bytes_length_IMetInst)
	: (initWithDescriptorType_bytes_length_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithDescriptorType:bytes:length:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithDescriptorType_bytes_length(final int descriptorType, final com.apple.jobjc.Pointer<Void> bytes, final long byteCount){
			final com.apple.jobjc.Invoke.MsgSend initWithDescriptorType_bytes_length_IMetInst = get_initWithDescriptorType_bytes_length_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithDescriptorType_bytes_length_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, descriptorType);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, byteCount);
		initWithDescriptorType_bytes_length_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithDescriptorType_data_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithDescriptorType_data_IMetInst(){
		return ((initWithDescriptorType_data_IMetInst != null)
	? (initWithDescriptorType_data_IMetInst)
	: (initWithDescriptorType_data_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithDescriptorType:data:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithDescriptorType_data(final int descriptorType, final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend initWithDescriptorType_data_IMetInst = get_initWithDescriptorType_data_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithDescriptorType_data_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, descriptorType);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		initWithDescriptorType_data_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithEventClass_eventID_targetDescriptor_returnID_transactionID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithEventClass_eventID_targetDescriptor_returnID_transactionID_IMetInst(){
		return ((initWithEventClass_eventID_targetDescriptor_returnID_transactionID_IMetInst != null)
	? (initWithEventClass_eventID_targetDescriptor_returnID_transactionID_IMetInst)
	: (initWithEventClass_eventID_targetDescriptor_returnID_transactionID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithEventClass:eventID:targetDescriptor:returnID:transactionID:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SShortCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SLongSIntCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithEventClass_eventID_targetDescriptor_returnID_transactionID(final int eventClass, final int eventID, final com.apple.jobjc.foundation.NSAppleEventDescriptor targetDescriptor, final short returnID, final int transactionID){
			final com.apple.jobjc.Invoke.MsgSend initWithEventClass_eventID_targetDescriptor_returnID_transactionID_IMetInst = get_initWithEventClass_eventID_targetDescriptor_returnID_transactionID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithEventClass_eventID_targetDescriptor_returnID_transactionID_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, eventClass);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, eventID);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, targetDescriptor);
		com.apple.jobjc.PrimitiveCoder.SShortCoder.INST.push(nativeBuffer, returnID);
		com.apple.jobjc.MixedPrimitiveCoder.SLongSIntCoder.push(nativeBuffer, transactionID);
		initWithEventClass_eventID_targetDescriptor_returnID_transactionID_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertDescriptor_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertDescriptor_atIndex_IMetInst(){
		return ((insertDescriptor_atIndex_IMetInst != null)
	? (insertDescriptor_atIndex_IMetInst)
	: (insertDescriptor_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertDescriptor:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void insertDescriptor_atIndex(final com.apple.jobjc.foundation.NSAppleEventDescriptor descriptor, final long index){
			final com.apple.jobjc.Invoke.MsgSend insertDescriptor_atIndex_IMetInst = get_insertDescriptor_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertDescriptor_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, descriptor);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		insertDescriptor_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend int32Value_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_int32Value_IMetInst(){
		return ((int32Value_IMetInst != null)
	? (int32Value_IMetInst)
	: (int32Value_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "int32Value", com.apple.jobjc.MixedPrimitiveCoder.SLongSIntCoder)));
	}

	 public int int32Value(){
			final com.apple.jobjc.Invoke.MsgSend int32Value_IMetInst = get_int32Value_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		int32Value_IMetInst.init(nativeBuffer, this);
		int32Value_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.MixedPrimitiveCoder.SLongSIntCoder.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keywordForDescriptorAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keywordForDescriptorAtIndex_IMetInst(){
		return ((keywordForDescriptorAtIndex_IMetInst != null)
	? (keywordForDescriptorAtIndex_IMetInst)
	: (keywordForDescriptorAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keywordForDescriptorAtIndex:", com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public int keywordForDescriptorAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend keywordForDescriptorAtIndex_IMetInst = get_keywordForDescriptorAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keywordForDescriptorAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		keywordForDescriptorAtIndex_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfItems_IMetInst(){
		return ((numberOfItems_IMetInst != null)
	? (numberOfItems_IMetInst)
	: (numberOfItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfItems", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long numberOfItems(){
			final com.apple.jobjc.Invoke.MsgSend numberOfItems_IMetInst = get_numberOfItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfItems_IMetInst.init(nativeBuffer, this);
		numberOfItems_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend paramDescriptorForKeyword_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_paramDescriptorForKeyword_IMetInst(){
		return ((paramDescriptorForKeyword_IMetInst != null)
	? (paramDescriptorForKeyword_IMetInst)
	: (paramDescriptorForKeyword_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "paramDescriptorForKeyword:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor paramDescriptorForKeyword(final int keyword){
			final com.apple.jobjc.Invoke.MsgSend paramDescriptorForKeyword_IMetInst = get_paramDescriptorForKeyword_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		paramDescriptorForKeyword_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, keyword);
		paramDescriptorForKeyword_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeDescriptorAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeDescriptorAtIndex_IMetInst(){
		return ((removeDescriptorAtIndex_IMetInst != null)
	? (removeDescriptorAtIndex_IMetInst)
	: (removeDescriptorAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeDescriptorAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void removeDescriptorAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend removeDescriptorAtIndex_IMetInst = get_removeDescriptorAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeDescriptorAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		removeDescriptorAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeDescriptorWithKeyword_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeDescriptorWithKeyword_IMetInst(){
		return ((removeDescriptorWithKeyword_IMetInst != null)
	? (removeDescriptorWithKeyword_IMetInst)
	: (removeDescriptorWithKeyword_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeDescriptorWithKeyword:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public void removeDescriptorWithKeyword(final int keyword){
			final com.apple.jobjc.Invoke.MsgSend removeDescriptorWithKeyword_IMetInst = get_removeDescriptorWithKeyword_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeDescriptorWithKeyword_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, keyword);
		removeDescriptorWithKeyword_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeParamDescriptorWithKeyword_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeParamDescriptorWithKeyword_IMetInst(){
		return ((removeParamDescriptorWithKeyword_IMetInst != null)
	? (removeParamDescriptorWithKeyword_IMetInst)
	: (removeParamDescriptorWithKeyword_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeParamDescriptorWithKeyword:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public void removeParamDescriptorWithKeyword(final int keyword){
			final com.apple.jobjc.Invoke.MsgSend removeParamDescriptorWithKeyword_IMetInst = get_removeParamDescriptorWithKeyword_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeParamDescriptorWithKeyword_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, keyword);
		removeParamDescriptorWithKeyword_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend returnID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_returnID_IMetInst(){
		return ((returnID_IMetInst != null)
	? (returnID_IMetInst)
	: (returnID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "returnID", com.apple.jobjc.PrimitiveCoder.SShortCoder.INST)));
	}

	 public short returnID(){
			final com.apple.jobjc.Invoke.MsgSend returnID_IMetInst = get_returnID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		returnID_IMetInst.init(nativeBuffer, this);
		returnID_IMetInst.invoke(nativeBuffer);
		final short returnValue = (short) (com.apple.jobjc.PrimitiveCoder.SShortCoder.INST.popShort(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttributeDescriptor_forKeyword_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttributeDescriptor_forKeyword_IMetInst(){
		return ((setAttributeDescriptor_forKeyword_IMetInst != null)
	? (setAttributeDescriptor_forKeyword_IMetInst)
	: (setAttributeDescriptor_forKeyword_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttributeDescriptor:forKeyword:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public void setAttributeDescriptor_forKeyword(final com.apple.jobjc.foundation.NSAppleEventDescriptor descriptor, final int keyword){
			final com.apple.jobjc.Invoke.MsgSend setAttributeDescriptor_forKeyword_IMetInst = get_setAttributeDescriptor_forKeyword_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributeDescriptor_forKeyword_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, descriptor);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, keyword);
		setAttributeDescriptor_forKeyword_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDescriptor_forKeyword_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDescriptor_forKeyword_IMetInst(){
		return ((setDescriptor_forKeyword_IMetInst != null)
	? (setDescriptor_forKeyword_IMetInst)
	: (setDescriptor_forKeyword_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDescriptor:forKeyword:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public void setDescriptor_forKeyword(final com.apple.jobjc.foundation.NSAppleEventDescriptor descriptor, final int keyword){
			final com.apple.jobjc.Invoke.MsgSend setDescriptor_forKeyword_IMetInst = get_setDescriptor_forKeyword_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDescriptor_forKeyword_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, descriptor);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, keyword);
		setDescriptor_forKeyword_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setParamDescriptor_forKeyword_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setParamDescriptor_forKeyword_IMetInst(){
		return ((setParamDescriptor_forKeyword_IMetInst != null)
	? (setParamDescriptor_forKeyword_IMetInst)
	: (setParamDescriptor_forKeyword_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setParamDescriptor:forKeyword:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public void setParamDescriptor_forKeyword(final com.apple.jobjc.foundation.NSAppleEventDescriptor descriptor, final int keyword){
			final com.apple.jobjc.Invoke.MsgSend setParamDescriptor_forKeyword_IMetInst = get_setParamDescriptor_forKeyword_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setParamDescriptor_forKeyword_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, descriptor);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, keyword);
		setParamDescriptor_forKeyword_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stringValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringValue_IMetInst(){
		return ((stringValue_IMetInst != null)
	? (stringValue_IMetInst)
	: (stringValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringValue", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringValue(){
			final com.apple.jobjc.Invoke.MsgSend stringValue_IMetInst = get_stringValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringValue_IMetInst.init(nativeBuffer, this);
		stringValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend transactionID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_transactionID_IMetInst(){
		return ((transactionID_IMetInst != null)
	? (transactionID_IMetInst)
	: (transactionID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "transactionID", com.apple.jobjc.MixedPrimitiveCoder.SLongSIntCoder)));
	}

	 public int transactionID(){
			final com.apple.jobjc.Invoke.MsgSend transactionID_IMetInst = get_transactionID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		transactionID_IMetInst.init(nativeBuffer, this);
		transactionID_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.MixedPrimitiveCoder.SLongSIntCoder.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend typeCodeValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_typeCodeValue_IMetInst(){
		return ((typeCodeValue_IMetInst != null)
	? (typeCodeValue_IMetInst)
	: (typeCodeValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "typeCodeValue", com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public int typeCodeValue(){
			final com.apple.jobjc.Invoke.MsgSend typeCodeValue_IMetInst = get_typeCodeValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		typeCodeValue_IMetInst.init(nativeBuffer, this);
		typeCodeValue_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.popInt(nativeBuffer));
		return returnValue;
	}

}
