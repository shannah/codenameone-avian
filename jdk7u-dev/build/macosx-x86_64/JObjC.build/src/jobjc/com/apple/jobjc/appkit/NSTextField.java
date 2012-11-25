package com.apple.jobjc.appkit;

public  class NSTextField extends com.apple.jobjc.appkit.NSControl {
	public NSTextField(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTextField(final NSTextField obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend acceptsFirstResponder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_acceptsFirstResponder_IMetInst(){
		return ((acceptsFirstResponder_IMetInst != null)
	? (acceptsFirstResponder_IMetInst)
	: (acceptsFirstResponder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "acceptsFirstResponder", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean acceptsFirstResponder(){
			final com.apple.jobjc.Invoke.MsgSend acceptsFirstResponder_IMetInst = get_acceptsFirstResponder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		acceptsFirstResponder_IMetInst.init(nativeBuffer, this);
		acceptsFirstResponder_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsEditingTextAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsEditingTextAttributes_IMetInst(){
		return ((allowsEditingTextAttributes_IMetInst != null)
	? (allowsEditingTextAttributes_IMetInst)
	: (allowsEditingTextAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsEditingTextAttributes", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsEditingTextAttributes(){
			final com.apple.jobjc.Invoke.MsgSend allowsEditingTextAttributes_IMetInst = get_allowsEditingTextAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsEditingTextAttributes_IMetInst.init(nativeBuffer, this);
		allowsEditingTextAttributes_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend backgroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backgroundColor_IMetInst(){
		return ((backgroundColor_IMetInst != null)
	? (backgroundColor_IMetInst)
	: (backgroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backgroundColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor backgroundColor(){
			final com.apple.jobjc.Invoke.MsgSend backgroundColor_IMetInst = get_backgroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backgroundColor_IMetInst.init(nativeBuffer, this);
		backgroundColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bezelStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bezelStyle_IMetInst(){
		return ((bezelStyle_IMetInst != null)
	? (bezelStyle_IMetInst)
	: (bezelStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bezelStyle", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long bezelStyle(){
			final com.apple.jobjc.Invoke.MsgSend bezelStyle_IMetInst = get_bezelStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bezelStyle_IMetInst.init(nativeBuffer, this);
		bezelStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_delegate_IMetInst(){
		return ((delegate_IMetInst != null)
	? (delegate_IMetInst)
	: (delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "delegate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T delegate(){
			final com.apple.jobjc.Invoke.MsgSend delegate_IMetInst = get_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		delegate_IMetInst.init(nativeBuffer, this);
		delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawsBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawsBackground_IMetInst(){
		return ((drawsBackground_IMetInst != null)
	? (drawsBackground_IMetInst)
	: (drawsBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawsBackground", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean drawsBackground(){
			final com.apple.jobjc.Invoke.MsgSend drawsBackground_IMetInst = get_drawsBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawsBackground_IMetInst.init(nativeBuffer, this);
		drawsBackground_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend importsGraphics_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_importsGraphics_IMetInst(){
		return ((importsGraphics_IMetInst != null)
	? (importsGraphics_IMetInst)
	: (importsGraphics_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "importsGraphics", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean importsGraphics(){
			final com.apple.jobjc.Invoke.MsgSend importsGraphics_IMetInst = get_importsGraphics_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		importsGraphics_IMetInst.init(nativeBuffer, this);
		importsGraphics_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isBezeled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isBezeled_IMetInst(){
		return ((isBezeled_IMetInst != null)
	? (isBezeled_IMetInst)
	: (isBezeled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isBezeled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isBezeled(){
			final com.apple.jobjc.Invoke.MsgSend isBezeled_IMetInst = get_isBezeled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isBezeled_IMetInst.init(nativeBuffer, this);
		isBezeled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isBordered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isBordered_IMetInst(){
		return ((isBordered_IMetInst != null)
	? (isBordered_IMetInst)
	: (isBordered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isBordered", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isBordered(){
			final com.apple.jobjc.Invoke.MsgSend isBordered_IMetInst = get_isBordered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isBordered_IMetInst.init(nativeBuffer, this);
		isBordered_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEditable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEditable_IMetInst(){
		return ((isEditable_IMetInst != null)
	? (isEditable_IMetInst)
	: (isEditable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEditable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isEditable(){
			final com.apple.jobjc.Invoke.MsgSend isEditable_IMetInst = get_isEditable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEditable_IMetInst.init(nativeBuffer, this);
		isEditable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSelectable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSelectable_IMetInst(){
		return ((isSelectable_IMetInst != null)
	? (isSelectable_IMetInst)
	: (isSelectable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSelectable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isSelectable(){
			final com.apple.jobjc.Invoke.MsgSend isSelectable_IMetInst = get_isSelectable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSelectable_IMetInst.init(nativeBuffer, this);
		isSelectable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend preferredMaxLayoutWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preferredMaxLayoutWidth_IMetInst(){
		return ((preferredMaxLayoutWidth_IMetInst != null)
	? (preferredMaxLayoutWidth_IMetInst)
	: (preferredMaxLayoutWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preferredMaxLayoutWidth", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double preferredMaxLayoutWidth(){
			final com.apple.jobjc.Invoke.MsgSend preferredMaxLayoutWidth_IMetInst = get_preferredMaxLayoutWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preferredMaxLayoutWidth_IMetInst.init(nativeBuffer, this);
		preferredMaxLayoutWidth_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectText_IMetInst(){
		return ((selectText_IMetInst != null)
	? (selectText_IMetInst)
	: (selectText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectText:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectText(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend selectText_IMetInst = get_selectText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectText_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		selectText_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsEditingTextAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsEditingTextAttributes_IMetInst(){
		return ((setAllowsEditingTextAttributes_IMetInst != null)
	? (setAllowsEditingTextAttributes_IMetInst)
	: (setAllowsEditingTextAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsEditingTextAttributes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsEditingTextAttributes(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAllowsEditingTextAttributes_IMetInst = get_setAllowsEditingTextAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsEditingTextAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAllowsEditingTextAttributes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBackgroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBackgroundColor_IMetInst(){
		return ((setBackgroundColor_IMetInst != null)
	? (setBackgroundColor_IMetInst)
	: (setBackgroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBackgroundColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setBackgroundColor(final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend setBackgroundColor_IMetInst = get_setBackgroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBackgroundColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		setBackgroundColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBezelStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBezelStyle_IMetInst(){
		return ((setBezelStyle_IMetInst != null)
	? (setBezelStyle_IMetInst)
	: (setBezelStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBezelStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setBezelStyle(final long style){
			final com.apple.jobjc.Invoke.MsgSend setBezelStyle_IMetInst = get_setBezelStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBezelStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, style);
		setBezelStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBezeled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBezeled_IMetInst(){
		return ((setBezeled_IMetInst != null)
	? (setBezeled_IMetInst)
	: (setBezeled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBezeled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setBezeled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setBezeled_IMetInst = get_setBezeled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBezeled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setBezeled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBordered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBordered_IMetInst(){
		return ((setBordered_IMetInst != null)
	? (setBordered_IMetInst)
	: (setBordered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBordered:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setBordered(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setBordered_IMetInst = get_setBordered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBordered_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setBordered_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDrawsBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDrawsBackground_IMetInst(){
		return ((setDrawsBackground_IMetInst != null)
	? (setDrawsBackground_IMetInst)
	: (setDrawsBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDrawsBackground:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDrawsBackground(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setDrawsBackground_IMetInst = get_setDrawsBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDrawsBackground_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setDrawsBackground_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setEditable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEditable_IMetInst(){
		return ((setEditable_IMetInst != null)
	? (setEditable_IMetInst)
	: (setEditable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEditable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setEditable(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setEditable_IMetInst = get_setEditable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEditable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setEditable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setImportsGraphics_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImportsGraphics_IMetInst(){
		return ((setImportsGraphics_IMetInst != null)
	? (setImportsGraphics_IMetInst)
	: (setImportsGraphics_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImportsGraphics:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setImportsGraphics(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setImportsGraphics_IMetInst = get_setImportsGraphics_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImportsGraphics_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setImportsGraphics_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPreferredMaxLayoutWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPreferredMaxLayoutWidth_IMetInst(){
		return ((setPreferredMaxLayoutWidth_IMetInst != null)
	? (setPreferredMaxLayoutWidth_IMetInst)
	: (setPreferredMaxLayoutWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPreferredMaxLayoutWidth:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setPreferredMaxLayoutWidth(final double width){
			final com.apple.jobjc.Invoke.MsgSend setPreferredMaxLayoutWidth_IMetInst = get_setPreferredMaxLayoutWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPreferredMaxLayoutWidth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, width);
		setPreferredMaxLayoutWidth_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectable_IMetInst(){
		return ((setSelectable_IMetInst != null)
	? (setSelectable_IMetInst)
	: (setSelectable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSelectable(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setSelectable_IMetInst = get_setSelectable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setSelectable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextColor_IMetInst(){
		return ((setTextColor_IMetInst != null)
	? (setTextColor_IMetInst)
	: (setTextColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTextColor(final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend setTextColor_IMetInst = get_setTextColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		setTextColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitleWithMnemonic_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitleWithMnemonic_IMetInst(){
		return ((setTitleWithMnemonic_IMetInst != null)
	? (setTitleWithMnemonic_IMetInst)
	: (setTitleWithMnemonic_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitleWithMnemonic:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTitleWithMnemonic(final com.apple.jobjc.foundation.NSString stringWithAmpersand){
			final com.apple.jobjc.Invoke.MsgSend setTitleWithMnemonic_IMetInst = get_setTitleWithMnemonic_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitleWithMnemonic_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringWithAmpersand);
		setTitleWithMnemonic_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textColor_IMetInst(){
		return ((textColor_IMetInst != null)
	? (textColor_IMetInst)
	: (textColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor textColor(){
			final com.apple.jobjc.Invoke.MsgSend textColor_IMetInst = get_textColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textColor_IMetInst.init(nativeBuffer, this);
		textColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textDidBeginEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textDidBeginEditing_IMetInst(){
		return ((textDidBeginEditing_IMetInst != null)
	? (textDidBeginEditing_IMetInst)
	: (textDidBeginEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textDidBeginEditing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void textDidBeginEditing(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend textDidBeginEditing_IMetInst = get_textDidBeginEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textDidBeginEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		textDidBeginEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textDidChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textDidChange_IMetInst(){
		return ((textDidChange_IMetInst != null)
	? (textDidChange_IMetInst)
	: (textDidChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textDidChange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void textDidChange(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend textDidChange_IMetInst = get_textDidChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textDidChange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		textDidChange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textDidEndEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textDidEndEditing_IMetInst(){
		return ((textDidEndEditing_IMetInst != null)
	? (textDidEndEditing_IMetInst)
	: (textDidEndEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textDidEndEditing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void textDidEndEditing(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend textDidEndEditing_IMetInst = get_textDidEndEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textDidEndEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		textDidEndEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textShouldBeginEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textShouldBeginEditing_IMetInst(){
		return ((textShouldBeginEditing_IMetInst != null)
	? (textShouldBeginEditing_IMetInst)
	: (textShouldBeginEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textShouldBeginEditing:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean textShouldBeginEditing(final com.apple.jobjc.appkit.NSText textObject){
			final com.apple.jobjc.Invoke.MsgSend textShouldBeginEditing_IMetInst = get_textShouldBeginEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textShouldBeginEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textObject);
		textShouldBeginEditing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textShouldEndEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textShouldEndEditing_IMetInst(){
		return ((textShouldEndEditing_IMetInst != null)
	? (textShouldEndEditing_IMetInst)
	: (textShouldEndEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textShouldEndEditing:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean textShouldEndEditing(final com.apple.jobjc.appkit.NSText textObject){
			final com.apple.jobjc.Invoke.MsgSend textShouldEndEditing_IMetInst = get_textShouldEndEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textShouldEndEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textObject);
		textShouldEndEditing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
