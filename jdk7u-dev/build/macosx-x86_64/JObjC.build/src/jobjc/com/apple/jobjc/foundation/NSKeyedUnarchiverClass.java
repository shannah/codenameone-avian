package com.apple.jobjc.foundation;

public  class NSKeyedUnarchiverClass extends com.apple.jobjc.foundation.NSCoderClass {
	public NSKeyedUnarchiverClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSKeyedUnarchiverClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSKeyedUnarchiverClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend classForClassName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classForClassName_CMetInst(){
		return ((classForClassName_CMetInst != null)
	? (classForClassName_CMetInst)
	: (classForClassName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classForClassName:", com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T classForClassName(final com.apple.jobjc.foundation.NSString codedName){
			final com.apple.jobjc.Invoke.MsgSend classForClassName_CMetInst = get_classForClassName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classForClassName_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, codedName);
		classForClassName_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setClass_forClassName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setClass_forClassName_CMetInst(){
		return ((setClass_forClassName_CMetInst != null)
	? (setClass_forClassName_CMetInst)
	: (setClass_forClassName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setClass:forClassName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setClass_forClassName(final com.apple.jobjc.NSClass cls, final com.apple.jobjc.foundation.NSString codedName){
			final com.apple.jobjc.Invoke.MsgSend setClass_forClassName_CMetInst = get_setClass_forClassName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setClass_forClassName_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, cls);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, codedName);
		setClass_forClassName_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unarchiveObjectWithData_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unarchiveObjectWithData_CMetInst(){
		return ((unarchiveObjectWithData_CMetInst != null)
	? (unarchiveObjectWithData_CMetInst)
	: (unarchiveObjectWithData_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unarchiveObjectWithData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T unarchiveObjectWithData(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend unarchiveObjectWithData_CMetInst = get_unarchiveObjectWithData_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unarchiveObjectWithData_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		unarchiveObjectWithData_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unarchiveObjectWithFile_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unarchiveObjectWithFile_CMetInst(){
		return ((unarchiveObjectWithFile_CMetInst != null)
	? (unarchiveObjectWithFile_CMetInst)
	: (unarchiveObjectWithFile_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unarchiveObjectWithFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T unarchiveObjectWithFile(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend unarchiveObjectWithFile_CMetInst = get_unarchiveObjectWithFile_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unarchiveObjectWithFile_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		unarchiveObjectWithFile_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
