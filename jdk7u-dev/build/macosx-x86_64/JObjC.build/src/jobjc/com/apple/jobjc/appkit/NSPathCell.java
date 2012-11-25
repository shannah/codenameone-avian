package com.apple.jobjc.appkit;

public  class NSPathCell extends com.apple.jobjc.appkit.NSActionCell {
	public NSPathCell(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPathCell(final NSPathCell obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend URL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URL_IMetInst(){
		return ((URL_IMetInst != null)
	? (URL_IMetInst)
	: (URL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URL(){
			final com.apple.jobjc.Invoke.MsgSend URL_IMetInst = get_URL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URL_IMetInst.init(nativeBuffer, this);
		URL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowedTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowedTypes_IMetInst(){
		return ((allowedTypes_IMetInst != null)
	? (allowedTypes_IMetInst)
	: (allowedTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowedTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray allowedTypes(){
			final com.apple.jobjc.Invoke.MsgSend allowedTypes_IMetInst = get_allowedTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowedTypes_IMetInst.init(nativeBuffer, this);
		allowedTypes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend clickedPathComponentCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_clickedPathComponentCell_IMetInst(){
		return ((clickedPathComponentCell_IMetInst != null)
	? (clickedPathComponentCell_IMetInst)
	: (clickedPathComponentCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "clickedPathComponentCell", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPathComponentCell clickedPathComponentCell(){
			final com.apple.jobjc.Invoke.MsgSend clickedPathComponentCell_IMetInst = get_clickedPathComponentCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		clickedPathComponentCell_IMetInst.init(nativeBuffer, this);
		clickedPathComponentCell_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPathComponentCell returnValue = (com.apple.jobjc.appkit.NSPathComponentCell) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend doubleAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_doubleAction_IMetInst(){
		return ((doubleAction_IMetInst != null)
	? (doubleAction_IMetInst)
	: (doubleAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "doubleAction", com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public com.apple.jobjc.SEL doubleAction(){
			final com.apple.jobjc.Invoke.MsgSend doubleAction_IMetInst = get_doubleAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		doubleAction_IMetInst.init(nativeBuffer, this);
		doubleAction_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.SEL returnValue = (com.apple.jobjc.SEL) (com.apple.jobjc.Coder.SELCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseEntered_withFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseEntered_withFrame_inView_IMetInst(){
		return ((mouseEntered_withFrame_inView_IMetInst != null)
	? (mouseEntered_withFrame_inView_IMetInst)
	: (mouseEntered_withFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseEntered:withFrame:inView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void mouseEntered_withFrame_inView(final com.apple.jobjc.appkit.NSEvent event, final com.apple.jobjc.foundation.NSRect frame, final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend mouseEntered_withFrame_inView_IMetInst = get_mouseEntered_withFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseEntered_withFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		mouseEntered_withFrame_inView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseExited_withFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseExited_withFrame_inView_IMetInst(){
		return ((mouseExited_withFrame_inView_IMetInst != null)
	? (mouseExited_withFrame_inView_IMetInst)
	: (mouseExited_withFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseExited:withFrame:inView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void mouseExited_withFrame_inView(final com.apple.jobjc.appkit.NSEvent event, final com.apple.jobjc.foundation.NSRect frame, final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend mouseExited_withFrame_inView_IMetInst = get_mouseExited_withFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseExited_withFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		mouseExited_withFrame_inView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pathComponentCellAtPoint_withFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathComponentCellAtPoint_withFrame_inView_IMetInst(){
		return ((pathComponentCellAtPoint_withFrame_inView_IMetInst != null)
	? (pathComponentCellAtPoint_withFrame_inView_IMetInst)
	: (pathComponentCellAtPoint_withFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathComponentCellAtPoint:withFrame:inView:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPathComponentCell pathComponentCellAtPoint_withFrame_inView(final com.apple.jobjc.foundation.NSPoint point, final com.apple.jobjc.foundation.NSRect frame, final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend pathComponentCellAtPoint_withFrame_inView_IMetInst = get_pathComponentCellAtPoint_withFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathComponentCellAtPoint_withFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		pathComponentCellAtPoint_withFrame_inView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPathComponentCell returnValue = (com.apple.jobjc.appkit.NSPathComponentCell) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathComponentCells_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathComponentCells_IMetInst(){
		return ((pathComponentCells_IMetInst != null)
	? (pathComponentCells_IMetInst)
	: (pathComponentCells_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathComponentCells", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray pathComponentCells(){
			final com.apple.jobjc.Invoke.MsgSend pathComponentCells_IMetInst = get_pathComponentCells_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathComponentCells_IMetInst.init(nativeBuffer, this);
		pathComponentCells_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathStyle_IMetInst(){
		return ((pathStyle_IMetInst != null)
	? (pathStyle_IMetInst)
	: (pathStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long pathStyle(){
			final com.apple.jobjc.Invoke.MsgSend pathStyle_IMetInst = get_pathStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathStyle_IMetInst.init(nativeBuffer, this);
		pathStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend placeholderAttributedString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_placeholderAttributedString_IMetInst(){
		return ((placeholderAttributedString_IMetInst != null)
	? (placeholderAttributedString_IMetInst)
	: (placeholderAttributedString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "placeholderAttributedString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAttributedString placeholderAttributedString(){
			final com.apple.jobjc.Invoke.MsgSend placeholderAttributedString_IMetInst = get_placeholderAttributedString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		placeholderAttributedString_IMetInst.init(nativeBuffer, this);
		placeholderAttributedString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend placeholderString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_placeholderString_IMetInst(){
		return ((placeholderString_IMetInst != null)
	? (placeholderString_IMetInst)
	: (placeholderString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "placeholderString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString placeholderString(){
			final com.apple.jobjc.Invoke.MsgSend placeholderString_IMetInst = get_placeholderString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		placeholderString_IMetInst.init(nativeBuffer, this);
		placeholderString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rectOfPathComponentCell_withFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rectOfPathComponentCell_withFrame_inView_IMetInst(){
		return ((rectOfPathComponentCell_withFrame_inView_IMetInst != null)
	? (rectOfPathComponentCell_withFrame_inView_IMetInst)
	: (rectOfPathComponentCell_withFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rectOfPathComponentCell:withFrame:inView:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect rectOfPathComponentCell_withFrame_inView(final com.apple.jobjc.appkit.NSPathComponentCell cell, final com.apple.jobjc.foundation.NSRect frame, final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend rectOfPathComponentCell_withFrame_inView_IMetInst = get_rectOfPathComponentCell_withFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rectOfPathComponentCell_withFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		rectOfPathComponentCell_withFrame_inView_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowedTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowedTypes_IMetInst(){
		return ((setAllowedTypes_IMetInst != null)
	? (setAllowedTypes_IMetInst)
	: (setAllowedTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowedTypes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAllowedTypes(final com.apple.jobjc.foundation.NSArray allowedTypes){
			final com.apple.jobjc.Invoke.MsgSend setAllowedTypes_IMetInst = get_setAllowedTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowedTypes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, allowedTypes);
		setAllowedTypes_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setControlSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setControlSize_IMetInst(){
		return ((setControlSize_IMetInst != null)
	? (setControlSize_IMetInst)
	: (setControlSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setControlSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setControlSize(final long size){
			final com.apple.jobjc.Invoke.MsgSend setControlSize_IMetInst = get_setControlSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setControlSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, size);
		setControlSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID value){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDoubleAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDoubleAction_IMetInst(){
		return ((setDoubleAction_IMetInst != null)
	? (setDoubleAction_IMetInst)
	: (setDoubleAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDoubleAction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public void setDoubleAction(final com.apple.jobjc.SEL action){
			final com.apple.jobjc.Invoke.MsgSend setDoubleAction_IMetInst = get_setDoubleAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDoubleAction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, action);
		setDoubleAction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setObjectValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setObjectValue_IMetInst(){
		return ((setObjectValue_IMetInst != null)
	? (setObjectValue_IMetInst)
	: (setObjectValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setObjectValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setObjectValue(final com.apple.jobjc.ID obj){
			final com.apple.jobjc.Invoke.MsgSend setObjectValue_IMetInst = get_setObjectValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setObjectValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		setObjectValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPathComponentCells_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPathComponentCells_IMetInst(){
		return ((setPathComponentCells_IMetInst != null)
	? (setPathComponentCells_IMetInst)
	: (setPathComponentCells_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPathComponentCells:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPathComponentCells(final com.apple.jobjc.foundation.NSArray cells){
			final com.apple.jobjc.Invoke.MsgSend setPathComponentCells_IMetInst = get_setPathComponentCells_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPathComponentCells_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cells);
		setPathComponentCells_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPathStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPathStyle_IMetInst(){
		return ((setPathStyle_IMetInst != null)
	? (setPathStyle_IMetInst)
	: (setPathStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPathStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setPathStyle(final long style){
			final com.apple.jobjc.Invoke.MsgSend setPathStyle_IMetInst = get_setPathStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPathStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, style);
		setPathStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPlaceholderAttributedString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPlaceholderAttributedString_IMetInst(){
		return ((setPlaceholderAttributedString_IMetInst != null)
	? (setPlaceholderAttributedString_IMetInst)
	: (setPlaceholderAttributedString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPlaceholderAttributedString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPlaceholderAttributedString(final com.apple.jobjc.foundation.NSAttributedString string){
			final com.apple.jobjc.Invoke.MsgSend setPlaceholderAttributedString_IMetInst = get_setPlaceholderAttributedString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPlaceholderAttributedString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setPlaceholderAttributedString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPlaceholderString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPlaceholderString_IMetInst(){
		return ((setPlaceholderString_IMetInst != null)
	? (setPlaceholderString_IMetInst)
	: (setPlaceholderString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPlaceholderString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPlaceholderString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setPlaceholderString_IMetInst = get_setPlaceholderString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPlaceholderString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setPlaceholderString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setURL_IMetInst(){
		return ((setURL_IMetInst != null)
	? (setURL_IMetInst)
	: (setURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setURL:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend setURL_IMetInst = get_setURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		setURL_IMetInst.invoke(nativeBuffer);
		
		
	}

}
