package com.apple.jobjc.appkit;

public  class NSTabView extends com.apple.jobjc.appkit.NSView {
	public NSTabView(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTabView(final NSTabView obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addTabViewItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addTabViewItem_IMetInst(){
		return ((addTabViewItem_IMetInst != null)
	? (addTabViewItem_IMetInst)
	: (addTabViewItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addTabViewItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addTabViewItem(final com.apple.jobjc.appkit.NSTabViewItem tabViewItem){
			final com.apple.jobjc.Invoke.MsgSend addTabViewItem_IMetInst = get_addTabViewItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addTabViewItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tabViewItem);
		addTabViewItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsTruncatedLabels_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsTruncatedLabels_IMetInst(){
		return ((allowsTruncatedLabels_IMetInst != null)
	? (allowsTruncatedLabels_IMetInst)
	: (allowsTruncatedLabels_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsTruncatedLabels", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsTruncatedLabels(){
			final com.apple.jobjc.Invoke.MsgSend allowsTruncatedLabels_IMetInst = get_allowsTruncatedLabels_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsTruncatedLabels_IMetInst.init(nativeBuffer, this);
		allowsTruncatedLabels_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentRect_IMetInst(){
		return ((contentRect_IMetInst != null)
	? (contentRect_IMetInst)
	: (contentRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentRect", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect contentRect(){
			final com.apple.jobjc.Invoke.MsgSend contentRect_IMetInst = get_contentRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentRect_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		contentRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend controlSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_controlSize_IMetInst(){
		return ((controlSize_IMetInst != null)
	? (controlSize_IMetInst)
	: (controlSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "controlSize", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long controlSize(){
			final com.apple.jobjc.Invoke.MsgSend controlSize_IMetInst = get_controlSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		controlSize_IMetInst.init(nativeBuffer, this);
		controlSize_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend controlTint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_controlTint_IMetInst(){
		return ((controlTint_IMetInst != null)
	? (controlTint_IMetInst)
	: (controlTint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "controlTint", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long controlTint(){
			final com.apple.jobjc.Invoke.MsgSend controlTint_IMetInst = get_controlTint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		controlTint_IMetInst.init(nativeBuffer, this);
		controlTint_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend font_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_font_IMetInst(){
		return ((font_IMetInst != null)
	? (font_IMetInst)
	: (font_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "font", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont font(){
			final com.apple.jobjc.Invoke.MsgSend font_IMetInst = get_font_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		font_IMetInst.init(nativeBuffer, this);
		font_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfTabViewItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfTabViewItem_IMetInst(){
		return ((indexOfTabViewItem_IMetInst != null)
	? (indexOfTabViewItem_IMetInst)
	: (indexOfTabViewItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfTabViewItem:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long indexOfTabViewItem(final com.apple.jobjc.appkit.NSTabViewItem tabViewItem){
			final com.apple.jobjc.Invoke.MsgSend indexOfTabViewItem_IMetInst = get_indexOfTabViewItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfTabViewItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tabViewItem);
		indexOfTabViewItem_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfTabViewItemWithIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfTabViewItemWithIdentifier_IMetInst(){
		return ((indexOfTabViewItemWithIdentifier_IMetInst != null)
	? (indexOfTabViewItemWithIdentifier_IMetInst)
	: (indexOfTabViewItemWithIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfTabViewItemWithIdentifier:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long indexOfTabViewItemWithIdentifier(final com.apple.jobjc.ID identifier){
			final com.apple.jobjc.Invoke.MsgSend indexOfTabViewItemWithIdentifier_IMetInst = get_indexOfTabViewItemWithIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfTabViewItemWithIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, identifier);
		indexOfTabViewItemWithIdentifier_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertTabViewItem_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertTabViewItem_atIndex_IMetInst(){
		return ((insertTabViewItem_atIndex_IMetInst != null)
	? (insertTabViewItem_atIndex_IMetInst)
	: (insertTabViewItem_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertTabViewItem:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void insertTabViewItem_atIndex(final com.apple.jobjc.appkit.NSTabViewItem tabViewItem, final long index){
			final com.apple.jobjc.Invoke.MsgSend insertTabViewItem_atIndex_IMetInst = get_insertTabViewItem_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertTabViewItem_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tabViewItem);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		insertTabViewItem_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend minimumSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minimumSize_IMetInst(){
		return ((minimumSize_IMetInst != null)
	? (minimumSize_IMetInst)
	: (minimumSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minimumSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize minimumSize(){
			final com.apple.jobjc.Invoke.MsgSend minimumSize_IMetInst = get_minimumSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minimumSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		minimumSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfTabViewItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfTabViewItems_IMetInst(){
		return ((numberOfTabViewItems_IMetInst != null)
	? (numberOfTabViewItems_IMetInst)
	: (numberOfTabViewItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfTabViewItems", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long numberOfTabViewItems(){
			final com.apple.jobjc.Invoke.MsgSend numberOfTabViewItems_IMetInst = get_numberOfTabViewItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfTabViewItems_IMetInst.init(nativeBuffer, this);
		numberOfTabViewItems_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeTabViewItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeTabViewItem_IMetInst(){
		return ((removeTabViewItem_IMetInst != null)
	? (removeTabViewItem_IMetInst)
	: (removeTabViewItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeTabViewItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeTabViewItem(final com.apple.jobjc.appkit.NSTabViewItem tabViewItem){
			final com.apple.jobjc.Invoke.MsgSend removeTabViewItem_IMetInst = get_removeTabViewItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeTabViewItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tabViewItem);
		removeTabViewItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectFirstTabViewItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectFirstTabViewItem_IMetInst(){
		return ((selectFirstTabViewItem_IMetInst != null)
	? (selectFirstTabViewItem_IMetInst)
	: (selectFirstTabViewItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectFirstTabViewItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectFirstTabViewItem(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend selectFirstTabViewItem_IMetInst = get_selectFirstTabViewItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectFirstTabViewItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		selectFirstTabViewItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectLastTabViewItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectLastTabViewItem_IMetInst(){
		return ((selectLastTabViewItem_IMetInst != null)
	? (selectLastTabViewItem_IMetInst)
	: (selectLastTabViewItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectLastTabViewItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectLastTabViewItem(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend selectLastTabViewItem_IMetInst = get_selectLastTabViewItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectLastTabViewItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		selectLastTabViewItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectNextTabViewItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectNextTabViewItem_IMetInst(){
		return ((selectNextTabViewItem_IMetInst != null)
	? (selectNextTabViewItem_IMetInst)
	: (selectNextTabViewItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectNextTabViewItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectNextTabViewItem(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend selectNextTabViewItem_IMetInst = get_selectNextTabViewItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectNextTabViewItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		selectNextTabViewItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectPreviousTabViewItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectPreviousTabViewItem_IMetInst(){
		return ((selectPreviousTabViewItem_IMetInst != null)
	? (selectPreviousTabViewItem_IMetInst)
	: (selectPreviousTabViewItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectPreviousTabViewItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectPreviousTabViewItem(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend selectPreviousTabViewItem_IMetInst = get_selectPreviousTabViewItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectPreviousTabViewItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		selectPreviousTabViewItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectTabViewItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectTabViewItem_IMetInst(){
		return ((selectTabViewItem_IMetInst != null)
	? (selectTabViewItem_IMetInst)
	: (selectTabViewItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectTabViewItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectTabViewItem(final com.apple.jobjc.appkit.NSTabViewItem tabViewItem){
			final com.apple.jobjc.Invoke.MsgSend selectTabViewItem_IMetInst = get_selectTabViewItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectTabViewItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tabViewItem);
		selectTabViewItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectTabViewItemAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectTabViewItemAtIndex_IMetInst(){
		return ((selectTabViewItemAtIndex_IMetInst != null)
	? (selectTabViewItemAtIndex_IMetInst)
	: (selectTabViewItemAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectTabViewItemAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void selectTabViewItemAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend selectTabViewItemAtIndex_IMetInst = get_selectTabViewItemAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectTabViewItemAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		selectTabViewItemAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectTabViewItemWithIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectTabViewItemWithIdentifier_IMetInst(){
		return ((selectTabViewItemWithIdentifier_IMetInst != null)
	? (selectTabViewItemWithIdentifier_IMetInst)
	: (selectTabViewItemWithIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectTabViewItemWithIdentifier:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectTabViewItemWithIdentifier(final com.apple.jobjc.ID identifier){
			final com.apple.jobjc.Invoke.MsgSend selectTabViewItemWithIdentifier_IMetInst = get_selectTabViewItemWithIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectTabViewItemWithIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, identifier);
		selectTabViewItemWithIdentifier_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedTabViewItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedTabViewItem_IMetInst(){
		return ((selectedTabViewItem_IMetInst != null)
	? (selectedTabViewItem_IMetInst)
	: (selectedTabViewItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedTabViewItem", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTabViewItem selectedTabViewItem(){
			final com.apple.jobjc.Invoke.MsgSend selectedTabViewItem_IMetInst = get_selectedTabViewItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedTabViewItem_IMetInst.init(nativeBuffer, this);
		selectedTabViewItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTabViewItem returnValue = (com.apple.jobjc.appkit.NSTabViewItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsTruncatedLabels_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsTruncatedLabels_IMetInst(){
		return ((setAllowsTruncatedLabels_IMetInst != null)
	? (setAllowsTruncatedLabels_IMetInst)
	: (setAllowsTruncatedLabels_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsTruncatedLabels:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsTruncatedLabels(final boolean allowTruncatedLabels){
			final com.apple.jobjc.Invoke.MsgSend setAllowsTruncatedLabels_IMetInst = get_setAllowsTruncatedLabels_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsTruncatedLabels_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, allowTruncatedLabels);
		setAllowsTruncatedLabels_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setControlSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setControlSize_IMetInst(){
		return ((setControlSize_IMetInst != null)
	? (setControlSize_IMetInst)
	: (setControlSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setControlSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setControlSize(final long controlSize){
			final com.apple.jobjc.Invoke.MsgSend setControlSize_IMetInst = get_setControlSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setControlSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, controlSize);
		setControlSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setControlTint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setControlTint_IMetInst(){
		return ((setControlTint_IMetInst != null)
	? (setControlTint_IMetInst)
	: (setControlTint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setControlTint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setControlTint(final long controlTint){
			final com.apple.jobjc.Invoke.MsgSend setControlTint_IMetInst = get_setControlTint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setControlTint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, controlTint);
		setControlTint_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFont_IMetInst(){
		return ((setFont_IMetInst != null)
	? (setFont_IMetInst)
	: (setFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFont(final com.apple.jobjc.appkit.NSFont font){
			final com.apple.jobjc.Invoke.MsgSend setFont_IMetInst = get_setFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, font);
		setFont_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTabViewType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTabViewType_IMetInst(){
		return ((setTabViewType_IMetInst != null)
	? (setTabViewType_IMetInst)
	: (setTabViewType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTabViewType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setTabViewType(final long tabViewType){
			final com.apple.jobjc.Invoke.MsgSend setTabViewType_IMetInst = get_setTabViewType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTabViewType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, tabViewType);
		setTabViewType_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tabViewItemAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tabViewItemAtIndex_IMetInst(){
		return ((tabViewItemAtIndex_IMetInst != null)
	? (tabViewItemAtIndex_IMetInst)
	: (tabViewItemAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tabViewItemAtIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSTabViewItem tabViewItemAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend tabViewItemAtIndex_IMetInst = get_tabViewItemAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tabViewItemAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		tabViewItemAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTabViewItem returnValue = (com.apple.jobjc.appkit.NSTabViewItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tabViewItemAtPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tabViewItemAtPoint_IMetInst(){
		return ((tabViewItemAtPoint_IMetInst != null)
	? (tabViewItemAtPoint_IMetInst)
	: (tabViewItemAtPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tabViewItemAtPoint:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.appkit.NSTabViewItem tabViewItemAtPoint(final com.apple.jobjc.foundation.NSPoint point){
			final com.apple.jobjc.Invoke.MsgSend tabViewItemAtPoint_IMetInst = get_tabViewItemAtPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tabViewItemAtPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		tabViewItemAtPoint_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTabViewItem returnValue = (com.apple.jobjc.appkit.NSTabViewItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tabViewItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tabViewItems_IMetInst(){
		return ((tabViewItems_IMetInst != null)
	? (tabViewItems_IMetInst)
	: (tabViewItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tabViewItems", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray tabViewItems(){
			final com.apple.jobjc.Invoke.MsgSend tabViewItems_IMetInst = get_tabViewItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tabViewItems_IMetInst.init(nativeBuffer, this);
		tabViewItems_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tabViewType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tabViewType_IMetInst(){
		return ((tabViewType_IMetInst != null)
	? (tabViewType_IMetInst)
	: (tabViewType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tabViewType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long tabViewType(){
			final com.apple.jobjc.Invoke.MsgSend tabViewType_IMetInst = get_tabViewType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tabViewType_IMetInst.init(nativeBuffer, this);
		tabViewType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend takeSelectedTabViewItemFromSender_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_takeSelectedTabViewItemFromSender_IMetInst(){
		return ((takeSelectedTabViewItemFromSender_IMetInst != null)
	? (takeSelectedTabViewItemFromSender_IMetInst)
	: (takeSelectedTabViewItemFromSender_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "takeSelectedTabViewItemFromSender:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void takeSelectedTabViewItemFromSender(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend takeSelectedTabViewItemFromSender_IMetInst = get_takeSelectedTabViewItemFromSender_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		takeSelectedTabViewItemFromSender_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		takeSelectedTabViewItemFromSender_IMetInst.invoke(nativeBuffer);
		
		
	}

}
