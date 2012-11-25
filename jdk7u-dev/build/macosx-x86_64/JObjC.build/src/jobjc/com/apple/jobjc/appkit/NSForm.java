package com.apple.jobjc.appkit;

public  class NSForm extends com.apple.jobjc.appkit.NSMatrix {
	public NSForm(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSForm(final NSForm obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addEntry_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addEntry_IMetInst(){
		return ((addEntry_IMetInst != null)
	? (addEntry_IMetInst)
	: (addEntry_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addEntry:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFormCell addEntry(final com.apple.jobjc.foundation.NSString title){
			final com.apple.jobjc.Invoke.MsgSend addEntry_IMetInst = get_addEntry_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addEntry_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		addEntry_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFormCell returnValue = (com.apple.jobjc.appkit.NSFormCell) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cellAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cellAtIndex_IMetInst(){
		return ((cellAtIndex_IMetInst != null)
	? (cellAtIndex_IMetInst)
	: (cellAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cellAtIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T cellAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend cellAtIndex_IMetInst = get_cellAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cellAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		cellAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawCellAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawCellAtIndex_IMetInst(){
		return ((drawCellAtIndex_IMetInst != null)
	? (drawCellAtIndex_IMetInst)
	: (drawCellAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawCellAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void drawCellAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend drawCellAtIndex_IMetInst = get_drawCellAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawCellAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		drawCellAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfCellWithTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfCellWithTag_IMetInst(){
		return ((indexOfCellWithTag_IMetInst != null)
	? (indexOfCellWithTag_IMetInst)
	: (indexOfCellWithTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfCellWithTag:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long indexOfCellWithTag(final long aTag){
			final com.apple.jobjc.Invoke.MsgSend indexOfCellWithTag_IMetInst = get_indexOfCellWithTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfCellWithTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, aTag);
		indexOfCellWithTag_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfSelectedItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfSelectedItem_IMetInst(){
		return ((indexOfSelectedItem_IMetInst != null)
	? (indexOfSelectedItem_IMetInst)
	: (indexOfSelectedItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfSelectedItem", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long indexOfSelectedItem(){
			final com.apple.jobjc.Invoke.MsgSend indexOfSelectedItem_IMetInst = get_indexOfSelectedItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfSelectedItem_IMetInst.init(nativeBuffer, this);
		indexOfSelectedItem_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertEntry_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertEntry_atIndex_IMetInst(){
		return ((insertEntry_atIndex_IMetInst != null)
	? (insertEntry_atIndex_IMetInst)
	: (insertEntry_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertEntry:atIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSFormCell insertEntry_atIndex(final com.apple.jobjc.foundation.NSString title, final long index){
			final com.apple.jobjc.Invoke.MsgSend insertEntry_atIndex_IMetInst = get_insertEntry_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertEntry_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		insertEntry_atIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFormCell returnValue = (com.apple.jobjc.appkit.NSFormCell) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend preferredTextFieldWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preferredTextFieldWidth_IMetInst(){
		return ((preferredTextFieldWidth_IMetInst != null)
	? (preferredTextFieldWidth_IMetInst)
	: (preferredTextFieldWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preferredTextFieldWidth", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double preferredTextFieldWidth(){
			final com.apple.jobjc.Invoke.MsgSend preferredTextFieldWidth_IMetInst = get_preferredTextFieldWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preferredTextFieldWidth_IMetInst.init(nativeBuffer, this);
		preferredTextFieldWidth_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeEntryAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeEntryAtIndex_IMetInst(){
		return ((removeEntryAtIndex_IMetInst != null)
	? (removeEntryAtIndex_IMetInst)
	: (removeEntryAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeEntryAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void removeEntryAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend removeEntryAtIndex_IMetInst = get_removeEntryAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeEntryAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		removeEntryAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectTextAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectTextAtIndex_IMetInst(){
		return ((selectTextAtIndex_IMetInst != null)
	? (selectTextAtIndex_IMetInst)
	: (selectTextAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectTextAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void selectTextAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend selectTextAtIndex_IMetInst = get_selectTextAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectTextAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		selectTextAtIndex_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setEntryWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEntryWidth_IMetInst(){
		return ((setEntryWidth_IMetInst != null)
	? (setEntryWidth_IMetInst)
	: (setEntryWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEntryWidth:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setEntryWidth(final double width){
			final com.apple.jobjc.Invoke.MsgSend setEntryWidth_IMetInst = get_setEntryWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEntryWidth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, width);
		setEntryWidth_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFrameSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFrameSize_IMetInst(){
		return ((setFrameSize_IMetInst != null)
	? (setFrameSize_IMetInst)
	: (setFrameSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFrameSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setFrameSize(final com.apple.jobjc.foundation.NSSize newSize){
			final com.apple.jobjc.Invoke.MsgSend setFrameSize_IMetInst = get_setFrameSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFrameSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, newSize);
		setFrameSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setInterlineSpacing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setInterlineSpacing_IMetInst(){
		return ((setInterlineSpacing_IMetInst != null)
	? (setInterlineSpacing_IMetInst)
	: (setInterlineSpacing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setInterlineSpacing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setInterlineSpacing(final double spacing){
			final com.apple.jobjc.Invoke.MsgSend setInterlineSpacing_IMetInst = get_setInterlineSpacing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setInterlineSpacing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, spacing);
		setInterlineSpacing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPreferredTextFieldWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPreferredTextFieldWidth_IMetInst(){
		return ((setPreferredTextFieldWidth_IMetInst != null)
	? (setPreferredTextFieldWidth_IMetInst)
	: (setPreferredTextFieldWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPreferredTextFieldWidth:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setPreferredTextFieldWidth(final double preferredWidth){
			final com.apple.jobjc.Invoke.MsgSend setPreferredTextFieldWidth_IMetInst = get_setPreferredTextFieldWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPreferredTextFieldWidth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, preferredWidth);
		setPreferredTextFieldWidth_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextAlignment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextAlignment_IMetInst(){
		return ((setTextAlignment_IMetInst != null)
	? (setTextAlignment_IMetInst)
	: (setTextAlignment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextAlignment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setTextAlignment(final long mode){
			final com.apple.jobjc.Invoke.MsgSend setTextAlignment_IMetInst = get_setTextAlignment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextAlignment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mode);
		setTextAlignment_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextBaseWritingDirection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextBaseWritingDirection_IMetInst(){
		return ((setTextBaseWritingDirection_IMetInst != null)
	? (setTextBaseWritingDirection_IMetInst)
	: (setTextBaseWritingDirection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextBaseWritingDirection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setTextBaseWritingDirection(final long writingDirection){
			final com.apple.jobjc.Invoke.MsgSend setTextBaseWritingDirection_IMetInst = get_setTextBaseWritingDirection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextBaseWritingDirection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, writingDirection);
		setTextBaseWritingDirection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextFont_IMetInst(){
		return ((setTextFont_IMetInst != null)
	? (setTextFont_IMetInst)
	: (setTextFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTextFont(final com.apple.jobjc.appkit.NSFont fontObj){
			final com.apple.jobjc.Invoke.MsgSend setTextFont_IMetInst = get_setTextFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontObj);
		setTextFont_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitleAlignment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitleAlignment_IMetInst(){
		return ((setTitleAlignment_IMetInst != null)
	? (setTitleAlignment_IMetInst)
	: (setTitleAlignment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitleAlignment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setTitleAlignment(final long mode){
			final com.apple.jobjc.Invoke.MsgSend setTitleAlignment_IMetInst = get_setTitleAlignment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitleAlignment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mode);
		setTitleAlignment_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitleBaseWritingDirection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitleBaseWritingDirection_IMetInst(){
		return ((setTitleBaseWritingDirection_IMetInst != null)
	? (setTitleBaseWritingDirection_IMetInst)
	: (setTitleBaseWritingDirection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitleBaseWritingDirection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setTitleBaseWritingDirection(final long writingDirection){
			final com.apple.jobjc.Invoke.MsgSend setTitleBaseWritingDirection_IMetInst = get_setTitleBaseWritingDirection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitleBaseWritingDirection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, writingDirection);
		setTitleBaseWritingDirection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitleFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitleFont_IMetInst(){
		return ((setTitleFont_IMetInst != null)
	? (setTitleFont_IMetInst)
	: (setTitleFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitleFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTitleFont(final com.apple.jobjc.appkit.NSFont fontObj){
			final com.apple.jobjc.Invoke.MsgSend setTitleFont_IMetInst = get_setTitleFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitleFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontObj);
		setTitleFont_IMetInst.invoke(nativeBuffer);
		
		
	}

}
