package com.apple.jobjc.foundation;

public  class NSTaskClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSTaskClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSTaskClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSTaskClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend launchedTaskWithLaunchPath_arguments_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_launchedTaskWithLaunchPath_arguments_CMetInst(){
		return ((launchedTaskWithLaunchPath_arguments_CMetInst != null)
	? (launchedTaskWithLaunchPath_arguments_CMetInst)
	: (launchedTaskWithLaunchPath_arguments_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "launchedTaskWithLaunchPath:arguments:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTask launchedTaskWithLaunchPath_arguments(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.foundation.NSArray arguments){
			final com.apple.jobjc.Invoke.MsgSend launchedTaskWithLaunchPath_arguments_CMetInst = get_launchedTaskWithLaunchPath_arguments_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		launchedTaskWithLaunchPath_arguments_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, arguments);
		launchedTaskWithLaunchPath_arguments_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTask returnValue = (com.apple.jobjc.foundation.NSTask) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
