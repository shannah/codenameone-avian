package com.apple.jobjc.foundation;

public  class NSAffineTransform extends com.apple.jobjc.foundation.NSObject {
	public NSAffineTransform(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSAffineTransform(final NSAffineTransform obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend appendTransform_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appendTransform_IMetInst(){
		return ((appendTransform_IMetInst != null)
	? (appendTransform_IMetInst)
	: (appendTransform_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appendTransform:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void appendTransform(final com.apple.jobjc.foundation.NSAffineTransform transform){
			final com.apple.jobjc.Invoke.MsgSend appendTransform_IMetInst = get_appendTransform_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appendTransform_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, transform);
		appendTransform_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithTransform_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithTransform_IMetInst(){
		return ((initWithTransform_IMetInst != null)
	? (initWithTransform_IMetInst)
	: (initWithTransform_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithTransform:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithTransform(final com.apple.jobjc.foundation.NSAffineTransform transform){
			final com.apple.jobjc.Invoke.MsgSend initWithTransform_IMetInst = get_initWithTransform_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithTransform_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, transform);
		initWithTransform_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend invert_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invert_IMetInst(){
		return ((invert_IMetInst != null)
	? (invert_IMetInst)
	: (invert_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invert", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void invert(){
			final com.apple.jobjc.Invoke.MsgSend invert_IMetInst = get_invert_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invert_IMetInst.init(nativeBuffer, this);
		invert_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend prependTransform_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_prependTransform_IMetInst(){
		return ((prependTransform_IMetInst != null)
	? (prependTransform_IMetInst)
	: (prependTransform_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "prependTransform:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void prependTransform(final com.apple.jobjc.foundation.NSAffineTransform transform){
			final com.apple.jobjc.Invoke.MsgSend prependTransform_IMetInst = get_prependTransform_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		prependTransform_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, transform);
		prependTransform_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rotateByDegrees_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rotateByDegrees_IMetInst(){
		return ((rotateByDegrees_IMetInst != null)
	? (rotateByDegrees_IMetInst)
	: (rotateByDegrees_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rotateByDegrees:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void rotateByDegrees(final double angle){
			final com.apple.jobjc.Invoke.MsgSend rotateByDegrees_IMetInst = get_rotateByDegrees_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rotateByDegrees_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, angle);
		rotateByDegrees_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rotateByRadians_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rotateByRadians_IMetInst(){
		return ((rotateByRadians_IMetInst != null)
	? (rotateByRadians_IMetInst)
	: (rotateByRadians_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rotateByRadians:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void rotateByRadians(final double angle){
			final com.apple.jobjc.Invoke.MsgSend rotateByRadians_IMetInst = get_rotateByRadians_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rotateByRadians_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, angle);
		rotateByRadians_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scaleBy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scaleBy_IMetInst(){
		return ((scaleBy_IMetInst != null)
	? (scaleBy_IMetInst)
	: (scaleBy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scaleBy:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void scaleBy(final double scale){
			final com.apple.jobjc.Invoke.MsgSend scaleBy_IMetInst = get_scaleBy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scaleBy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, scale);
		scaleBy_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scaleXBy_yBy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scaleXBy_yBy_IMetInst(){
		return ((scaleXBy_yBy_IMetInst != null)
	? (scaleXBy_yBy_IMetInst)
	: (scaleXBy_yBy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scaleXBy:yBy:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void scaleXBy_yBy(final double scaleX, final double scaleY){
			final com.apple.jobjc.Invoke.MsgSend scaleXBy_yBy_IMetInst = get_scaleXBy_yBy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scaleXBy_yBy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, scaleX);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, scaleY);
		scaleXBy_yBy_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTransformStruct_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTransformStruct_IMetInst(){
		return ((setTransformStruct_IMetInst != null)
	? (setTransformStruct_IMetInst)
	: (setTransformStruct_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTransformStruct:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSAffineTransformStruct.getStructCoder())));
	}

	 public void setTransformStruct(final com.apple.jobjc.foundation.NSAffineTransformStruct transformStruct){
			final com.apple.jobjc.Invoke.MsgSend setTransformStruct_IMetInst = get_setTransformStruct_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTransformStruct_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSAffineTransformStruct.getStructCoder().push(nativeBuffer, transformStruct);
		setTransformStruct_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend transformPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_transformPoint_IMetInst(){
		return ((transformPoint_IMetInst != null)
	? (transformPoint_IMetInst)
	: (transformPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "transformPoint:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint transformPoint(final com.apple.jobjc.foundation.NSPoint aPoint){
			final com.apple.jobjc.Invoke.MsgSend transformPoint_IMetInst = get_transformPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		transformPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		transformPoint_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend transformSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_transformSize_IMetInst(){
		return ((transformSize_IMetInst != null)
	? (transformSize_IMetInst)
	: (transformSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "transformSize:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize transformSize(final com.apple.jobjc.foundation.NSSize aSize){
			final com.apple.jobjc.Invoke.MsgSend transformSize_IMetInst = get_transformSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		transformSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, aSize);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		transformSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend transformStruct_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_transformStruct_IMetInst(){
		return ((transformStruct_IMetInst != null)
	? (transformStruct_IMetInst)
	: (transformStruct_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "transformStruct", com.apple.jobjc.foundation.NSAffineTransformStruct.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSAffineTransformStruct transformStruct(){
			final com.apple.jobjc.Invoke.MsgSend transformStruct_IMetInst = get_transformStruct_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		transformStruct_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSAffineTransformStruct returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSAffineTransformStruct();
		transformStruct_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend translateXBy_yBy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_translateXBy_yBy_IMetInst(){
		return ((translateXBy_yBy_IMetInst != null)
	? (translateXBy_yBy_IMetInst)
	: (translateXBy_yBy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "translateXBy:yBy:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void translateXBy_yBy(final double deltaX, final double deltaY){
			final com.apple.jobjc.Invoke.MsgSend translateXBy_yBy_IMetInst = get_translateXBy_yBy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		translateXBy_yBy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, deltaX);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, deltaY);
		translateXBy_yBy_IMetInst.invoke(nativeBuffer);
		
		
	}

}
