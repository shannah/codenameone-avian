package com.apple.jobjc.appkit;

public  class NSUserDefaultsController extends com.apple.jobjc.appkit.NSController {
	public NSUserDefaultsController(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSUserDefaultsController(final NSUserDefaultsController obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend appliesImmediately_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appliesImmediately_IMetInst(){
		return ((appliesImmediately_IMetInst != null)
	? (appliesImmediately_IMetInst)
	: (appliesImmediately_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appliesImmediately", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean appliesImmediately(){
			final com.apple.jobjc.Invoke.MsgSend appliesImmediately_IMetInst = get_appliesImmediately_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appliesImmediately_IMetInst.init(nativeBuffer, this);
		appliesImmediately_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaults_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaults_IMetInst(){
		return ((defaults_IMetInst != null)
	? (defaults_IMetInst)
	: (defaults_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaults", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSUserDefaults defaults(){
			final com.apple.jobjc.Invoke.MsgSend defaults_IMetInst = get_defaults_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaults_IMetInst.init(nativeBuffer, this);
		defaults_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSUserDefaults returnValue = (com.apple.jobjc.foundation.NSUserDefaults) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasUnappliedChanges_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasUnappliedChanges_IMetInst(){
		return ((hasUnappliedChanges_IMetInst != null)
	? (hasUnappliedChanges_IMetInst)
	: (hasUnappliedChanges_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasUnappliedChanges", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasUnappliedChanges(){
			final com.apple.jobjc.Invoke.MsgSend hasUnappliedChanges_IMetInst = get_hasUnappliedChanges_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasUnappliedChanges_IMetInst.init(nativeBuffer, this);
		hasUnappliedChanges_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithDefaults_initialValues_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithDefaults_initialValues_IMetInst(){
		return ((initWithDefaults_initialValues_IMetInst != null)
	? (initWithDefaults_initialValues_IMetInst)
	: (initWithDefaults_initialValues_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithDefaults:initialValues:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithDefaults_initialValues(final com.apple.jobjc.foundation.NSUserDefaults defaults, final com.apple.jobjc.foundation.NSDictionary initialValues){
			final com.apple.jobjc.Invoke.MsgSend initWithDefaults_initialValues_IMetInst = get_initWithDefaults_initialValues_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithDefaults_initialValues_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaults);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, initialValues);
		initWithDefaults_initialValues_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initialValues_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initialValues_IMetInst(){
		return ((initialValues_IMetInst != null)
	? (initialValues_IMetInst)
	: (initialValues_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initialValues", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary initialValues(){
			final com.apple.jobjc.Invoke.MsgSend initialValues_IMetInst = get_initialValues_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initialValues_IMetInst.init(nativeBuffer, this);
		initialValues_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend revert_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_revert_IMetInst(){
		return ((revert_IMetInst != null)
	? (revert_IMetInst)
	: (revert_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "revert:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void revert(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend revert_IMetInst = get_revert_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		revert_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		revert_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend revertToInitialValues_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_revertToInitialValues_IMetInst(){
		return ((revertToInitialValues_IMetInst != null)
	? (revertToInitialValues_IMetInst)
	: (revertToInitialValues_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "revertToInitialValues:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void revertToInitialValues(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend revertToInitialValues_IMetInst = get_revertToInitialValues_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		revertToInitialValues_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		revertToInitialValues_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend save_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_save_IMetInst(){
		return ((save_IMetInst != null)
	? (save_IMetInst)
	: (save_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "save:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void save(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend save_IMetInst = get_save_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		save_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		save_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAppliesImmediately_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAppliesImmediately_IMetInst(){
		return ((setAppliesImmediately_IMetInst != null)
	? (setAppliesImmediately_IMetInst)
	: (setAppliesImmediately_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAppliesImmediately:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAppliesImmediately(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAppliesImmediately_IMetInst = get_setAppliesImmediately_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAppliesImmediately_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAppliesImmediately_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setInitialValues_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setInitialValues_IMetInst(){
		return ((setInitialValues_IMetInst != null)
	? (setInitialValues_IMetInst)
	: (setInitialValues_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setInitialValues:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setInitialValues(final com.apple.jobjc.foundation.NSDictionary initialValues){
			final com.apple.jobjc.Invoke.MsgSend setInitialValues_IMetInst = get_setInitialValues_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setInitialValues_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, initialValues);
		setInitialValues_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend values_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_values_IMetInst(){
		return ((values_IMetInst != null)
	? (values_IMetInst)
	: (values_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "values", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T values(){
			final com.apple.jobjc.Invoke.MsgSend values_IMetInst = get_values_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		values_IMetInst.init(nativeBuffer, this);
		values_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
