package com.apple.jobjc.appkit;

public  class NSAffineTransformCategory extends com.apple.jobjc.foundation.NSAffineTransform {
	public NSAffineTransformCategory(final com.apple.jobjc.foundation.NSAffineTransform obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	public NSAffineTransformCategory(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSAffineTransformCategory(final NSAffineTransformCategory obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend concat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_concat_IMetInst(){
		return ((concat_IMetInst != null)
	? (concat_IMetInst)
	: (concat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "concat", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void concat(){
			final com.apple.jobjc.Invoke.MsgSend concat_IMetInst = get_concat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		concat_IMetInst.init(nativeBuffer, this);
		concat_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend set_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_set_IMetInst(){
		return ((set_IMetInst != null)
	? (set_IMetInst)
	: (set_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "set", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void set(){
			final com.apple.jobjc.Invoke.MsgSend set_IMetInst = get_set_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		set_IMetInst.init(nativeBuffer, this);
		set_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend transformBezierPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_transformBezierPath_IMetInst(){
		return ((transformBezierPath_IMetInst != null)
	? (transformBezierPath_IMetInst)
	: (transformBezierPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "transformBezierPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSBezierPath transformBezierPath(final com.apple.jobjc.appkit.NSBezierPath aPath){
			final com.apple.jobjc.Invoke.MsgSend transformBezierPath_IMetInst = get_transformBezierPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		transformBezierPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aPath);
		transformBezierPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSBezierPath returnValue = (com.apple.jobjc.appkit.NSBezierPath) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
