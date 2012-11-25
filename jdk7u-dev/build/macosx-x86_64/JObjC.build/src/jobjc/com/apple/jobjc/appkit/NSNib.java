package com.apple.jobjc.appkit;

public  class NSNib extends com.apple.jobjc.foundation.NSObject {
	public NSNib(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSNib(final NSNib obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfURL_IMetInst(){
		return ((initWithContentsOfURL_IMetInst != null)
	? (initWithContentsOfURL_IMetInst)
	: (initWithContentsOfURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfURL(final com.apple.jobjc.foundation.NSURL nibFileURL){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_IMetInst = get_initWithContentsOfURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, nibFileURL);
		initWithContentsOfURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithNibData_bundle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithNibData_bundle_IMetInst(){
		return ((initWithNibData_bundle_IMetInst != null)
	? (initWithNibData_bundle_IMetInst)
	: (initWithNibData_bundle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithNibData:bundle:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithNibData_bundle(final com.apple.jobjc.foundation.NSData nibData, final com.apple.jobjc.foundation.NSBundle bundle){
			final com.apple.jobjc.Invoke.MsgSend initWithNibData_bundle_IMetInst = get_initWithNibData_bundle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithNibData_bundle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, nibData);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bundle);
		initWithNibData_bundle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithNibNamed_bundle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithNibNamed_bundle_IMetInst(){
		return ((initWithNibNamed_bundle_IMetInst != null)
	? (initWithNibNamed_bundle_IMetInst)
	: (initWithNibNamed_bundle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithNibNamed:bundle:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithNibNamed_bundle(final com.apple.jobjc.foundation.NSString nibName, final com.apple.jobjc.foundation.NSBundle bundle){
			final com.apple.jobjc.Invoke.MsgSend initWithNibNamed_bundle_IMetInst = get_initWithNibNamed_bundle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithNibNamed_bundle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, nibName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bundle);
		initWithNibNamed_bundle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend instantiateNibWithExternalNameTable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_instantiateNibWithExternalNameTable_IMetInst(){
		return ((instantiateNibWithExternalNameTable_IMetInst != null)
	? (instantiateNibWithExternalNameTable_IMetInst)
	: (instantiateNibWithExternalNameTable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "instantiateNibWithExternalNameTable:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean instantiateNibWithExternalNameTable(final com.apple.jobjc.foundation.NSDictionary externalNameTable){
			final com.apple.jobjc.Invoke.MsgSend instantiateNibWithExternalNameTable_IMetInst = get_instantiateNibWithExternalNameTable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		instantiateNibWithExternalNameTable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, externalNameTable);
		instantiateNibWithExternalNameTable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend instantiateNibWithOwner_topLevelObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_instantiateNibWithOwner_topLevelObjects_IMetInst(){
		return ((instantiateNibWithOwner_topLevelObjects_IMetInst != null)
	? (instantiateNibWithOwner_topLevelObjects_IMetInst)
	: (instantiateNibWithOwner_topLevelObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "instantiateNibWithOwner:topLevelObjects:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean instantiateNibWithOwner_topLevelObjects(final com.apple.jobjc.ID owner, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSArray> topLevelObjects){
			final com.apple.jobjc.Invoke.MsgSend instantiateNibWithOwner_topLevelObjects_IMetInst = get_instantiateNibWithOwner_topLevelObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		instantiateNibWithOwner_topLevelObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, owner);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, topLevelObjects);
		instantiateNibWithOwner_topLevelObjects_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend instantiateWithOwner_topLevelObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_instantiateWithOwner_topLevelObjects_IMetInst(){
		return ((instantiateWithOwner_topLevelObjects_IMetInst != null)
	? (instantiateWithOwner_topLevelObjects_IMetInst)
	: (instantiateWithOwner_topLevelObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "instantiateWithOwner:topLevelObjects:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean instantiateWithOwner_topLevelObjects(final com.apple.jobjc.ID owner, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSArray> topLevelObjects){
			final com.apple.jobjc.Invoke.MsgSend instantiateWithOwner_topLevelObjects_IMetInst = get_instantiateWithOwner_topLevelObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		instantiateWithOwner_topLevelObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, owner);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, topLevelObjects);
		instantiateWithOwner_topLevelObjects_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
