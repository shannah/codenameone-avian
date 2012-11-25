package com.apple.jobjc.appkit;

public  class NSStringCategory extends com.apple.jobjc.foundation.NSString {
	public NSStringCategory(final com.apple.jobjc.foundation.NSString obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	public NSStringCategory(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSStringCategory(final NSStringCategory obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend boundingRectWithSize_options_attributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_boundingRectWithSize_options_attributes_IMetInst(){
		return ((boundingRectWithSize_options_attributes_IMetInst != null)
	? (boundingRectWithSize_options_attributes_IMetInst)
	: (boundingRectWithSize_options_attributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "boundingRectWithSize:options:attributes:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect boundingRectWithSize_options_attributes(final com.apple.jobjc.foundation.NSSize size, final long options, final com.apple.jobjc.foundation.NSDictionary attributes){
			final com.apple.jobjc.Invoke.MsgSend boundingRectWithSize_options_attributes_IMetInst = get_boundingRectWithSize_options_attributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		boundingRectWithSize_options_attributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributes);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		boundingRectWithSize_options_attributes_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawAtPoint_withAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawAtPoint_withAttributes_IMetInst(){
		return ((drawAtPoint_withAttributes_IMetInst != null)
	? (drawAtPoint_withAttributes_IMetInst)
	: (drawAtPoint_withAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawAtPoint:withAttributes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawAtPoint_withAttributes(final com.apple.jobjc.foundation.NSPoint point, final com.apple.jobjc.foundation.NSDictionary attrs){
			final com.apple.jobjc.Invoke.MsgSend drawAtPoint_withAttributes_IMetInst = get_drawAtPoint_withAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawAtPoint_withAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrs);
		drawAtPoint_withAttributes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawInRect_withAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawInRect_withAttributes_IMetInst(){
		return ((drawInRect_withAttributes_IMetInst != null)
	? (drawInRect_withAttributes_IMetInst)
	: (drawInRect_withAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawInRect:withAttributes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawInRect_withAttributes(final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.foundation.NSDictionary attrs){
			final com.apple.jobjc.Invoke.MsgSend drawInRect_withAttributes_IMetInst = get_drawInRect_withAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawInRect_withAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrs);
		drawInRect_withAttributes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawWithRect_options_attributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawWithRect_options_attributes_IMetInst(){
		return ((drawWithRect_options_attributes_IMetInst != null)
	? (drawWithRect_options_attributes_IMetInst)
	: (drawWithRect_options_attributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawWithRect:options:attributes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawWithRect_options_attributes(final com.apple.jobjc.foundation.NSRect rect, final long options, final com.apple.jobjc.foundation.NSDictionary attributes){
			final com.apple.jobjc.Invoke.MsgSend drawWithRect_options_attributes_IMetInst = get_drawWithRect_options_attributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawWithRect_options_attributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributes);
		drawWithRect_options_attributes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sizeWithAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sizeWithAttributes_IMetInst(){
		return ((sizeWithAttributes_IMetInst != null)
	? (sizeWithAttributes_IMetInst)
	: (sizeWithAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sizeWithAttributes:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSize sizeWithAttributes(final com.apple.jobjc.foundation.NSDictionary attrs){
			final com.apple.jobjc.Invoke.MsgSend sizeWithAttributes_IMetInst = get_sizeWithAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sizeWithAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrs);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		sizeWithAttributes_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

}
