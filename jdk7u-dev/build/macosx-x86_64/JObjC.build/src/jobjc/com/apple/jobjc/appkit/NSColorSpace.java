package com.apple.jobjc.appkit;

public  class NSColorSpace extends com.apple.jobjc.foundation.NSObject {
	public NSColorSpace(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSColorSpace(final NSColorSpace obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend CGColorSpace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_CGColorSpace_IMetInst(){
		return ((CGColorSpace_IMetInst != null)
	? (CGColorSpace_IMetInst)
	: (CGColorSpace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "CGColorSpace", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* CGColorSpaceRef (^{CGColorSpace}, ^{CGColorSpace}) */ CGColorSpace(){
			final com.apple.jobjc.Invoke.MsgSend CGColorSpace_IMetInst = get_CGColorSpace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		CGColorSpace_IMetInst.init(nativeBuffer, this);
		CGColorSpace_IMetInst.invoke(nativeBuffer);
		final Object /* CGColorSpaceRef (^{CGColorSpace}, ^{CGColorSpace}) */ returnValue = (Object /* CGColorSpaceRef (^{CGColorSpace}, ^{CGColorSpace}) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ICCProfileData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ICCProfileData_IMetInst(){
		return ((ICCProfileData_IMetInst != null)
	? (ICCProfileData_IMetInst)
	: (ICCProfileData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ICCProfileData", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData ICCProfileData(){
			final com.apple.jobjc.Invoke.MsgSend ICCProfileData_IMetInst = get_ICCProfileData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ICCProfileData_IMetInst.init(nativeBuffer, this);
		ICCProfileData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorSpaceModel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorSpaceModel_IMetInst(){
		return ((colorSpaceModel_IMetInst != null)
	? (colorSpaceModel_IMetInst)
	: (colorSpaceModel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorSpaceModel", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long colorSpaceModel(){
			final com.apple.jobjc.Invoke.MsgSend colorSpaceModel_IMetInst = get_colorSpaceModel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorSpaceModel_IMetInst.init(nativeBuffer, this);
		colorSpaceModel_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorSyncProfile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorSyncProfile_IMetInst(){
		return ((colorSyncProfile_IMetInst != null)
	? (colorSyncProfile_IMetInst)
	: (colorSyncProfile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorSyncProfile", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> colorSyncProfile(){
			final com.apple.jobjc.Invoke.MsgSend colorSyncProfile_IMetInst = get_colorSyncProfile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorSyncProfile_IMetInst.init(nativeBuffer, this);
		colorSyncProfile_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCGColorSpace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCGColorSpace_IMetInst(){
		return ((initWithCGColorSpace_IMetInst != null)
	? (initWithCGColorSpace_IMetInst)
	: (initWithCGColorSpace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCGColorSpace:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCGColorSpace(final Object /* CGColorSpaceRef (^{CGColorSpace}, ^{CGColorSpace}) */ cgColorSpace){
			final com.apple.jobjc.Invoke.MsgSend initWithCGColorSpace_IMetInst = get_initWithCGColorSpace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCGColorSpace_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, cgColorSpace);
		initWithCGColorSpace_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithColorSyncProfile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithColorSyncProfile_IMetInst(){
		return ((initWithColorSyncProfile_IMetInst != null)
	? (initWithColorSyncProfile_IMetInst)
	: (initWithColorSyncProfile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithColorSyncProfile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithColorSyncProfile(final com.apple.jobjc.Pointer<Void> prof){
			final com.apple.jobjc.Invoke.MsgSend initWithColorSyncProfile_IMetInst = get_initWithColorSyncProfile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithColorSyncProfile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, prof);
		initWithColorSyncProfile_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithICCProfileData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithICCProfileData_IMetInst(){
		return ((initWithICCProfileData_IMetInst != null)
	? (initWithICCProfileData_IMetInst)
	: (initWithICCProfileData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithICCProfileData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithICCProfileData(final com.apple.jobjc.foundation.NSData iccData){
			final com.apple.jobjc.Invoke.MsgSend initWithICCProfileData_IMetInst = get_initWithICCProfileData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithICCProfileData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, iccData);
		initWithICCProfileData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedName_IMetInst(){
		return ((localizedName_IMetInst != null)
	? (localizedName_IMetInst)
	: (localizedName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localizedName(){
			final com.apple.jobjc.Invoke.MsgSend localizedName_IMetInst = get_localizedName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedName_IMetInst.init(nativeBuffer, this);
		localizedName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfColorComponents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfColorComponents_IMetInst(){
		return ((numberOfColorComponents_IMetInst != null)
	? (numberOfColorComponents_IMetInst)
	: (numberOfColorComponents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfColorComponents", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long numberOfColorComponents(){
			final com.apple.jobjc.Invoke.MsgSend numberOfColorComponents_IMetInst = get_numberOfColorComponents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfColorComponents_IMetInst.init(nativeBuffer, this);
		numberOfColorComponents_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
