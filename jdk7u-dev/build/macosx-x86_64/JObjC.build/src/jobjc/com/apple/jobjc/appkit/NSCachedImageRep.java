package com.apple.jobjc.appkit;

public  class NSCachedImageRep extends com.apple.jobjc.appkit.NSImageRep {
	public NSCachedImageRep(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSCachedImageRep(final NSCachedImageRep obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend initWithSize_depth_separate_alpha_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithSize_depth_separate_alpha_IMetInst(){
		return ((initWithSize_depth_separate_alpha_IMetInst != null)
	? (initWithSize_depth_separate_alpha_IMetInst)
	: (initWithSize_depth_separate_alpha_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithSize:depth:separate:alpha:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithSize_depth_separate_alpha(final com.apple.jobjc.foundation.NSSize size, final int depth, final boolean flag, final boolean alpha){
			final com.apple.jobjc.Invoke.MsgSend initWithSize_depth_separate_alpha_IMetInst = get_initWithSize_depth_separate_alpha_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithSize_depth_separate_alpha_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, depth);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, alpha);
		initWithSize_depth_separate_alpha_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithWindow_rect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithWindow_rect_IMetInst(){
		return ((initWithWindow_rect_IMetInst != null)
	? (initWithWindow_rect_IMetInst)
	: (initWithWindow_rect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithWindow:rect:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public <T extends com.apple.jobjc.ID> T initWithWindow_rect(final com.apple.jobjc.appkit.NSWindow win, final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend initWithWindow_rect_IMetInst = get_initWithWindow_rect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithWindow_rect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, win);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		initWithWindow_rect_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rect_IMetInst(){
		return ((rect_IMetInst != null)
	? (rect_IMetInst)
	: (rect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rect", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect rect(){
			final com.apple.jobjc.Invoke.MsgSend rect_IMetInst = get_rect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rect_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		rect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend window_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_window_IMetInst(){
		return ((window_IMetInst != null)
	? (window_IMetInst)
	: (window_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "window", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSWindow window(){
			final com.apple.jobjc.Invoke.MsgSend window_IMetInst = get_window_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		window_IMetInst.init(nativeBuffer, this);
		window_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSWindow returnValue = (com.apple.jobjc.appkit.NSWindow) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
