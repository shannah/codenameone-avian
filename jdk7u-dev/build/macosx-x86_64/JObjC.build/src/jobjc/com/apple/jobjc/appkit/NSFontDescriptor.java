package com.apple.jobjc.appkit;

public  class NSFontDescriptor extends com.apple.jobjc.foundation.NSObject {
	public NSFontDescriptor(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSFontDescriptor(final NSFontDescriptor obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend fontAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontAttributes_IMetInst(){
		return ((fontAttributes_IMetInst != null)
	? (fontAttributes_IMetInst)
	: (fontAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontAttributes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary fontAttributes(){
			final com.apple.jobjc.Invoke.MsgSend fontAttributes_IMetInst = get_fontAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontAttributes_IMetInst.init(nativeBuffer, this);
		fontAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontDescriptorByAddingAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontDescriptorByAddingAttributes_IMetInst(){
		return ((fontDescriptorByAddingAttributes_IMetInst != null)
	? (fontDescriptorByAddingAttributes_IMetInst)
	: (fontDescriptorByAddingAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontDescriptorByAddingAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFontDescriptor fontDescriptorByAddingAttributes(final com.apple.jobjc.foundation.NSDictionary attributes){
			final com.apple.jobjc.Invoke.MsgSend fontDescriptorByAddingAttributes_IMetInst = get_fontDescriptorByAddingAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontDescriptorByAddingAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributes);
		fontDescriptorByAddingAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFontDescriptor returnValue = (com.apple.jobjc.appkit.NSFontDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontDescriptorWithFace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontDescriptorWithFace_IMetInst(){
		return ((fontDescriptorWithFace_IMetInst != null)
	? (fontDescriptorWithFace_IMetInst)
	: (fontDescriptorWithFace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontDescriptorWithFace:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFontDescriptor fontDescriptorWithFace(final com.apple.jobjc.foundation.NSString newFace){
			final com.apple.jobjc.Invoke.MsgSend fontDescriptorWithFace_IMetInst = get_fontDescriptorWithFace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontDescriptorWithFace_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newFace);
		fontDescriptorWithFace_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFontDescriptor returnValue = (com.apple.jobjc.appkit.NSFontDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontDescriptorWithFamily_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontDescriptorWithFamily_IMetInst(){
		return ((fontDescriptorWithFamily_IMetInst != null)
	? (fontDescriptorWithFamily_IMetInst)
	: (fontDescriptorWithFamily_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontDescriptorWithFamily:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFontDescriptor fontDescriptorWithFamily(final com.apple.jobjc.foundation.NSString newFamily){
			final com.apple.jobjc.Invoke.MsgSend fontDescriptorWithFamily_IMetInst = get_fontDescriptorWithFamily_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontDescriptorWithFamily_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newFamily);
		fontDescriptorWithFamily_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFontDescriptor returnValue = (com.apple.jobjc.appkit.NSFontDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontDescriptorWithMatrix_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontDescriptorWithMatrix_IMetInst(){
		return ((fontDescriptorWithMatrix_IMetInst != null)
	? (fontDescriptorWithMatrix_IMetInst)
	: (fontDescriptorWithMatrix_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontDescriptorWithMatrix:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFontDescriptor fontDescriptorWithMatrix(final com.apple.jobjc.foundation.NSAffineTransform matrix){
			final com.apple.jobjc.Invoke.MsgSend fontDescriptorWithMatrix_IMetInst = get_fontDescriptorWithMatrix_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontDescriptorWithMatrix_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, matrix);
		fontDescriptorWithMatrix_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFontDescriptor returnValue = (com.apple.jobjc.appkit.NSFontDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontDescriptorWithSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontDescriptorWithSize_IMetInst(){
		return ((fontDescriptorWithSize_IMetInst != null)
	? (fontDescriptorWithSize_IMetInst)
	: (fontDescriptorWithSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontDescriptorWithSize:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSFontDescriptor fontDescriptorWithSize(final double newPointSize){
			final com.apple.jobjc.Invoke.MsgSend fontDescriptorWithSize_IMetInst = get_fontDescriptorWithSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontDescriptorWithSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, newPointSize);
		fontDescriptorWithSize_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFontDescriptor returnValue = (com.apple.jobjc.appkit.NSFontDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontDescriptorWithSymbolicTraits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontDescriptorWithSymbolicTraits_IMetInst(){
		return ((fontDescriptorWithSymbolicTraits_IMetInst != null)
	? (fontDescriptorWithSymbolicTraits_IMetInst)
	: (fontDescriptorWithSymbolicTraits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontDescriptorWithSymbolicTraits:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFontDescriptor fontDescriptorWithSymbolicTraits(final int symbolicTraits){
			final com.apple.jobjc.Invoke.MsgSend fontDescriptorWithSymbolicTraits_IMetInst = get_fontDescriptorWithSymbolicTraits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontDescriptorWithSymbolicTraits_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, symbolicTraits);
		fontDescriptorWithSymbolicTraits_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFontDescriptor returnValue = (com.apple.jobjc.appkit.NSFontDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithFontAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFontAttributes_IMetInst(){
		return ((initWithFontAttributes_IMetInst != null)
	? (initWithFontAttributes_IMetInst)
	: (initWithFontAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFontAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFontAttributes(final com.apple.jobjc.foundation.NSDictionary attributes){
			final com.apple.jobjc.Invoke.MsgSend initWithFontAttributes_IMetInst = get_initWithFontAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFontAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributes);
		initWithFontAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend matchingFontDescriptorWithMandatoryKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_matchingFontDescriptorWithMandatoryKeys_IMetInst(){
		return ((matchingFontDescriptorWithMandatoryKeys_IMetInst != null)
	? (matchingFontDescriptorWithMandatoryKeys_IMetInst)
	: (matchingFontDescriptorWithMandatoryKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "matchingFontDescriptorWithMandatoryKeys:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFontDescriptor matchingFontDescriptorWithMandatoryKeys(final com.apple.jobjc.foundation.NSSet mandatoryKeys){
			final com.apple.jobjc.Invoke.MsgSend matchingFontDescriptorWithMandatoryKeys_IMetInst = get_matchingFontDescriptorWithMandatoryKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		matchingFontDescriptorWithMandatoryKeys_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mandatoryKeys);
		matchingFontDescriptorWithMandatoryKeys_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFontDescriptor returnValue = (com.apple.jobjc.appkit.NSFontDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend matchingFontDescriptorsWithMandatoryKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_matchingFontDescriptorsWithMandatoryKeys_IMetInst(){
		return ((matchingFontDescriptorsWithMandatoryKeys_IMetInst != null)
	? (matchingFontDescriptorsWithMandatoryKeys_IMetInst)
	: (matchingFontDescriptorsWithMandatoryKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "matchingFontDescriptorsWithMandatoryKeys:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray matchingFontDescriptorsWithMandatoryKeys(final com.apple.jobjc.foundation.NSSet mandatoryKeys){
			final com.apple.jobjc.Invoke.MsgSend matchingFontDescriptorsWithMandatoryKeys_IMetInst = get_matchingFontDescriptorsWithMandatoryKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		matchingFontDescriptorsWithMandatoryKeys_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mandatoryKeys);
		matchingFontDescriptorsWithMandatoryKeys_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend matrix_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_matrix_IMetInst(){
		return ((matrix_IMetInst != null)
	? (matrix_IMetInst)
	: (matrix_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "matrix", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAffineTransform matrix(){
			final com.apple.jobjc.Invoke.MsgSend matrix_IMetInst = get_matrix_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		matrix_IMetInst.init(nativeBuffer, this);
		matrix_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAffineTransform returnValue = (com.apple.jobjc.foundation.NSAffineTransform) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectForKey_IMetInst(){
		return ((objectForKey_IMetInst != null)
	? (objectForKey_IMetInst)
	: (objectForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectForKey(final com.apple.jobjc.foundation.NSString anAttribute){
			final com.apple.jobjc.Invoke.MsgSend objectForKey_IMetInst = get_objectForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anAttribute);
		objectForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pointSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pointSize_IMetInst(){
		return ((pointSize_IMetInst != null)
	? (pointSize_IMetInst)
	: (pointSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pointSize", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double pointSize(){
			final com.apple.jobjc.Invoke.MsgSend pointSize_IMetInst = get_pointSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pointSize_IMetInst.init(nativeBuffer, this);
		pointSize_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend postscriptName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_postscriptName_IMetInst(){
		return ((postscriptName_IMetInst != null)
	? (postscriptName_IMetInst)
	: (postscriptName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "postscriptName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString postscriptName(){
			final com.apple.jobjc.Invoke.MsgSend postscriptName_IMetInst = get_postscriptName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		postscriptName_IMetInst.init(nativeBuffer, this);
		postscriptName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend symbolicTraits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_symbolicTraits_IMetInst(){
		return ((symbolicTraits_IMetInst != null)
	? (symbolicTraits_IMetInst)
	: (symbolicTraits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "symbolicTraits", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public int symbolicTraits(){
			final com.apple.jobjc.Invoke.MsgSend symbolicTraits_IMetInst = get_symbolicTraits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		symbolicTraits_IMetInst.init(nativeBuffer, this);
		symbolicTraits_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

}
