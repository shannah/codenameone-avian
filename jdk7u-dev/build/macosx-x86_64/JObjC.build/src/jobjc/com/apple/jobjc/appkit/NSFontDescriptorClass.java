package com.apple.jobjc.appkit;

public  class NSFontDescriptorClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSFontDescriptorClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSFontDescriptorClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSFontDescriptorClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend fontDescriptorWithFontAttributes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontDescriptorWithFontAttributes_CMetInst(){
		return ((fontDescriptorWithFontAttributes_CMetInst != null)
	? (fontDescriptorWithFontAttributes_CMetInst)
	: (fontDescriptorWithFontAttributes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontDescriptorWithFontAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFontDescriptor fontDescriptorWithFontAttributes(final com.apple.jobjc.foundation.NSDictionary attributes){
			final com.apple.jobjc.Invoke.MsgSend fontDescriptorWithFontAttributes_CMetInst = get_fontDescriptorWithFontAttributes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontDescriptorWithFontAttributes_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributes);
		fontDescriptorWithFontAttributes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFontDescriptor returnValue = (com.apple.jobjc.appkit.NSFontDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontDescriptorWithName_matrix_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontDescriptorWithName_matrix_CMetInst(){
		return ((fontDescriptorWithName_matrix_CMetInst != null)
	? (fontDescriptorWithName_matrix_CMetInst)
	: (fontDescriptorWithName_matrix_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontDescriptorWithName:matrix:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFontDescriptor fontDescriptorWithName_matrix(final com.apple.jobjc.foundation.NSString fontName, final com.apple.jobjc.foundation.NSAffineTransform matrix){
			final com.apple.jobjc.Invoke.MsgSend fontDescriptorWithName_matrix_CMetInst = get_fontDescriptorWithName_matrix_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontDescriptorWithName_matrix_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, matrix);
		fontDescriptorWithName_matrix_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFontDescriptor returnValue = (com.apple.jobjc.appkit.NSFontDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontDescriptorWithName_size_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontDescriptorWithName_size_CMetInst(){
		return ((fontDescriptorWithName_size_CMetInst != null)
	? (fontDescriptorWithName_size_CMetInst)
	: (fontDescriptorWithName_size_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontDescriptorWithName:size:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSFontDescriptor fontDescriptorWithName_size(final com.apple.jobjc.foundation.NSString fontName, final double size){
			final com.apple.jobjc.Invoke.MsgSend fontDescriptorWithName_size_CMetInst = get_fontDescriptorWithName_size_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontDescriptorWithName_size_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontName);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, size);
		fontDescriptorWithName_size_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFontDescriptor returnValue = (com.apple.jobjc.appkit.NSFontDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
