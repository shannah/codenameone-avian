package com.apple.jobjc.appkit;

public  class NSTextFinderClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSTextFinderClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSTextFinderClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSTextFinderClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend drawIncrementalMatchHighlightInRect_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawIncrementalMatchHighlightInRect_CMetInst(){
		return ((drawIncrementalMatchHighlightInRect_CMetInst != null)
	? (drawIncrementalMatchHighlightInRect_CMetInst)
	: (drawIncrementalMatchHighlightInRect_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawIncrementalMatchHighlightInRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawIncrementalMatchHighlightInRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend drawIncrementalMatchHighlightInRect_CMetInst = get_drawIncrementalMatchHighlightInRect_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawIncrementalMatchHighlightInRect_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		drawIncrementalMatchHighlightInRect_CMetInst.invoke(nativeBuffer);
		
		
	}

}
