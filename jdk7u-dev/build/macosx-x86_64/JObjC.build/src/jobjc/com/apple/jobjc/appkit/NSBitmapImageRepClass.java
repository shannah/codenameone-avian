package com.apple.jobjc.appkit;

public  class NSBitmapImageRepClass extends com.apple.jobjc.appkit.NSImageRepClass {
	public NSBitmapImageRepClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSBitmapImageRepClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSBitmapImageRepClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend TIFFRepresentationOfImageRepsInArray_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_TIFFRepresentationOfImageRepsInArray_CMetInst(){
		return ((TIFFRepresentationOfImageRepsInArray_CMetInst != null)
	? (TIFFRepresentationOfImageRepsInArray_CMetInst)
	: (TIFFRepresentationOfImageRepsInArray_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "TIFFRepresentationOfImageRepsInArray:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData TIFFRepresentationOfImageRepsInArray(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend TIFFRepresentationOfImageRepsInArray_CMetInst = get_TIFFRepresentationOfImageRepsInArray_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		TIFFRepresentationOfImageRepsInArray_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		TIFFRepresentationOfImageRepsInArray_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend TIFFRepresentationOfImageRepsInArray_usingCompression_factor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_TIFFRepresentationOfImageRepsInArray_usingCompression_factor_CMetInst(){
		return ((TIFFRepresentationOfImageRepsInArray_usingCompression_factor_CMetInst != null)
	? (TIFFRepresentationOfImageRepsInArray_usingCompression_factor_CMetInst)
	: (TIFFRepresentationOfImageRepsInArray_usingCompression_factor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "TIFFRepresentationOfImageRepsInArray:usingCompression:factor:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData TIFFRepresentationOfImageRepsInArray_usingCompression_factor(final com.apple.jobjc.foundation.NSArray array, final long comp, final float factor){
			final com.apple.jobjc.Invoke.MsgSend TIFFRepresentationOfImageRepsInArray_usingCompression_factor_CMetInst = get_TIFFRepresentationOfImageRepsInArray_usingCompression_factor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		TIFFRepresentationOfImageRepsInArray_usingCompression_factor_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, comp);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, factor);
		TIFFRepresentationOfImageRepsInArray_usingCompression_factor_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getTIFFCompressionTypes_count_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getTIFFCompressionTypes_count_CMetInst(){
		return ((getTIFFCompressionTypes_count_CMetInst != null)
	? (getTIFFCompressionTypes_count_CMetInst)
	: (getTIFFCompressionTypes_count_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getTIFFCompressionTypes:count:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getTIFFCompressionTypes_count(final com.apple.jobjc.Pointer<com.apple.jobjc.Pointer<java.lang.Long>> list, final com.apple.jobjc.Pointer<java.lang.Long> numTypes){
			final com.apple.jobjc.Invoke.MsgSend getTIFFCompressionTypes_count_CMetInst = get_getTIFFCompressionTypes_count_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getTIFFCompressionTypes_count_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, list);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, numTypes);
		getTIFFCompressionTypes_count_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend imageRepWithData_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageRepWithData_CMetInst(){
		return ((imageRepWithData_CMetInst != null)
	? (imageRepWithData_CMetInst)
	: (imageRepWithData_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageRepWithData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T imageRepWithData(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend imageRepWithData_CMetInst = get_imageRepWithData_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageRepWithData_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		imageRepWithData_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageRepsWithData_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageRepsWithData_CMetInst(){
		return ((imageRepsWithData_CMetInst != null)
	? (imageRepsWithData_CMetInst)
	: (imageRepsWithData_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageRepsWithData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray imageRepsWithData(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend imageRepsWithData_CMetInst = get_imageRepsWithData_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageRepsWithData_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		imageRepsWithData_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedNameForTIFFCompressionType_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedNameForTIFFCompressionType_CMetInst(){
		return ((localizedNameForTIFFCompressionType_CMetInst != null)
	? (localizedNameForTIFFCompressionType_CMetInst)
	: (localizedNameForTIFFCompressionType_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedNameForTIFFCompressionType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString localizedNameForTIFFCompressionType(final long compression){
			final com.apple.jobjc.Invoke.MsgSend localizedNameForTIFFCompressionType_CMetInst = get_localizedNameForTIFFCompressionType_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedNameForTIFFCompressionType_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, compression);
		localizedNameForTIFFCompressionType_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend representationOfImageRepsInArray_usingType_properties_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_representationOfImageRepsInArray_usingType_properties_CMetInst(){
		return ((representationOfImageRepsInArray_usingType_properties_CMetInst != null)
	? (representationOfImageRepsInArray_usingType_properties_CMetInst)
	: (representationOfImageRepsInArray_usingType_properties_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "representationOfImageRepsInArray:usingType:properties:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData representationOfImageRepsInArray_usingType_properties(final com.apple.jobjc.foundation.NSArray imageReps, final long storageType, final com.apple.jobjc.foundation.NSDictionary properties){
			final com.apple.jobjc.Invoke.MsgSend representationOfImageRepsInArray_usingType_properties_CMetInst = get_representationOfImageRepsInArray_usingType_properties_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		representationOfImageRepsInArray_usingType_properties_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, imageReps);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, storageType);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, properties);
		representationOfImageRepsInArray_usingType_properties_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
