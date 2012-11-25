package com.apple.jobjc.appkit;

public  class NSShadow extends com.apple.jobjc.foundation.NSObject {
	public NSShadow(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSShadow(final NSShadow obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend init_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_init_IMetInst(){
		return ((init_IMetInst != null)
	? (init_IMetInst)
	: (init_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "init", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T init(){
			final com.apple.jobjc.Invoke.MsgSend init_IMetInst = get_init_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		init_IMetInst.init(nativeBuffer, this);
		init_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend setShadowBlurRadius_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShadowBlurRadius_IMetInst(){
		return ((setShadowBlurRadius_IMetInst != null)
	? (setShadowBlurRadius_IMetInst)
	: (setShadowBlurRadius_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShadowBlurRadius:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setShadowBlurRadius(final double val){
			final com.apple.jobjc.Invoke.MsgSend setShadowBlurRadius_IMetInst = get_setShadowBlurRadius_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShadowBlurRadius_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, val);
		setShadowBlurRadius_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShadowColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShadowColor_IMetInst(){
		return ((setShadowColor_IMetInst != null)
	? (setShadowColor_IMetInst)
	: (setShadowColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShadowColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setShadowColor(final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend setShadowColor_IMetInst = get_setShadowColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShadowColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		setShadowColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShadowOffset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShadowOffset_IMetInst(){
		return ((setShadowOffset_IMetInst != null)
	? (setShadowOffset_IMetInst)
	: (setShadowOffset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShadowOffset:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setShadowOffset(final com.apple.jobjc.foundation.NSSize offset){
			final com.apple.jobjc.Invoke.MsgSend setShadowOffset_IMetInst = get_setShadowOffset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShadowOffset_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, offset);
		setShadowOffset_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend shadowBlurRadius_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shadowBlurRadius_IMetInst(){
		return ((shadowBlurRadius_IMetInst != null)
	? (shadowBlurRadius_IMetInst)
	: (shadowBlurRadius_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shadowBlurRadius", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double shadowBlurRadius(){
			final com.apple.jobjc.Invoke.MsgSend shadowBlurRadius_IMetInst = get_shadowBlurRadius_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shadowBlurRadius_IMetInst.init(nativeBuffer, this);
		shadowBlurRadius_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend shadowColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shadowColor_IMetInst(){
		return ((shadowColor_IMetInst != null)
	? (shadowColor_IMetInst)
	: (shadowColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shadowColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor shadowColor(){
			final com.apple.jobjc.Invoke.MsgSend shadowColor_IMetInst = get_shadowColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shadowColor_IMetInst.init(nativeBuffer, this);
		shadowColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend shadowOffset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shadowOffset_IMetInst(){
		return ((shadowOffset_IMetInst != null)
	? (shadowOffset_IMetInst)
	: (shadowOffset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shadowOffset", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize shadowOffset(){
			final com.apple.jobjc.Invoke.MsgSend shadowOffset_IMetInst = get_shadowOffset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shadowOffset_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		shadowOffset_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

}
