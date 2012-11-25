package com.apple.jobjc.appkit;

public  class CIImage extends com.apple.jobjc.foundation.NSObject {
	public CIImage(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public CIImage(final CIImage obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend drawAtPoint_fromRect_operation_fraction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawAtPoint_fromRect_operation_fraction_IMetInst(){
		return ((drawAtPoint_fromRect_operation_fraction_IMetInst != null)
	? (drawAtPoint_fromRect_operation_fraction_IMetInst)
	: (drawAtPoint_fromRect_operation_fraction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawAtPoint:fromRect:operation:fraction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void drawAtPoint_fromRect_operation_fraction(final com.apple.jobjc.foundation.NSPoint point, final com.apple.jobjc.foundation.NSRect fromRect, final long op, final double delta){
			final com.apple.jobjc.Invoke.MsgSend drawAtPoint_fromRect_operation_fraction_IMetInst = get_drawAtPoint_fromRect_operation_fraction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawAtPoint_fromRect_operation_fraction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, fromRect);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, op);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, delta);
		drawAtPoint_fromRect_operation_fraction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawInRect_fromRect_operation_fraction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawInRect_fromRect_operation_fraction_IMetInst(){
		return ((drawInRect_fromRect_operation_fraction_IMetInst != null)
	? (drawInRect_fromRect_operation_fraction_IMetInst)
	: (drawInRect_fromRect_operation_fraction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawInRect:fromRect:operation:fraction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void drawInRect_fromRect_operation_fraction(final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.foundation.NSRect fromRect, final long op, final double delta){
			final com.apple.jobjc.Invoke.MsgSend drawInRect_fromRect_operation_fraction_IMetInst = get_drawInRect_fromRect_operation_fraction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawInRect_fromRect_operation_fraction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, fromRect);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, op);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, delta);
		drawInRect_fromRect_operation_fraction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithBitmapImageRep_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithBitmapImageRep_IMetInst(){
		return ((initWithBitmapImageRep_IMetInst != null)
	? (initWithBitmapImageRep_IMetInst)
	: (initWithBitmapImageRep_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithBitmapImageRep:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithBitmapImageRep(final com.apple.jobjc.appkit.NSBitmapImageRep bitmapImageRep){
			final com.apple.jobjc.Invoke.MsgSend initWithBitmapImageRep_IMetInst = get_initWithBitmapImageRep_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithBitmapImageRep_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bitmapImageRep);
		initWithBitmapImageRep_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
