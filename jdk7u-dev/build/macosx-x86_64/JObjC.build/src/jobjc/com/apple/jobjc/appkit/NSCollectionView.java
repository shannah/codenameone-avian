package com.apple.jobjc.appkit;

public  class NSCollectionView extends com.apple.jobjc.appkit.NSView {
	public NSCollectionView(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSCollectionView(final NSCollectionView obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend allowsMultipleSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsMultipleSelection_IMetInst(){
		return ((allowsMultipleSelection_IMetInst != null)
	? (allowsMultipleSelection_IMetInst)
	: (allowsMultipleSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsMultipleSelection", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsMultipleSelection(){
			final com.apple.jobjc.Invoke.MsgSend allowsMultipleSelection_IMetInst = get_allowsMultipleSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsMultipleSelection_IMetInst.init(nativeBuffer, this);
		allowsMultipleSelection_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend backgroundColors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backgroundColors_IMetInst(){
		return ((backgroundColors_IMetInst != null)
	? (backgroundColors_IMetInst)
	: (backgroundColors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backgroundColors", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray backgroundColors(){
			final com.apple.jobjc.Invoke.MsgSend backgroundColors_IMetInst = get_backgroundColors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backgroundColors_IMetInst.init(nativeBuffer, this);
		backgroundColors_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend content_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_content_IMetInst(){
		return ((content_IMetInst != null)
	? (content_IMetInst)
	: (content_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "content", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray content(){
			final com.apple.jobjc.Invoke.MsgSend content_IMetInst = get_content_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		content_IMetInst.init(nativeBuffer, this);
		content_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend draggingImageForItemsAtIndexes_withEvent_offset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingImageForItemsAtIndexes_withEvent_offset_IMetInst(){
		return ((draggingImageForItemsAtIndexes_withEvent_offset_IMetInst != null)
	? (draggingImageForItemsAtIndexes_withEvent_offset_IMetInst)
	: (draggingImageForItemsAtIndexes_withEvent_offset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingImageForItemsAtIndexes:withEvent:offset:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage draggingImageForItemsAtIndexes_withEvent_offset(final com.apple.jobjc.foundation.NSIndexSet indexes, final com.apple.jobjc.appkit.NSEvent event, final Object /* NSPointPointer (^{_NSPoint=ff}, ^{CGPoint=dd}) */ dragImageOffset){
			final com.apple.jobjc.Invoke.MsgSend draggingImageForItemsAtIndexes_withEvent_offset_IMetInst = get_draggingImageForItemsAtIndexes_withEvent_offset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingImageForItemsAtIndexes_withEvent_offset_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, dragImageOffset);
		draggingImageForItemsAtIndexes_withEvent_offset_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend frameForItemAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frameForItemAtIndex_IMetInst(){
		return ((frameForItemAtIndex_IMetInst != null)
	? (frameForItemAtIndex_IMetInst)
	: (frameForItemAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frameForItemAtIndex:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect frameForItemAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend frameForItemAtIndex_IMetInst = get_frameForItemAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frameForItemAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		frameForItemAtIndex_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend frameForItemAtIndex_withNumberOfItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frameForItemAtIndex_withNumberOfItems_IMetInst(){
		return ((frameForItemAtIndex_withNumberOfItems_IMetInst != null)
	? (frameForItemAtIndex_withNumberOfItems_IMetInst)
	: (frameForItemAtIndex_withNumberOfItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frameForItemAtIndex:withNumberOfItems:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect frameForItemAtIndex_withNumberOfItems(final long index, final long numberOfItems){
			final com.apple.jobjc.Invoke.MsgSend frameForItemAtIndex_withNumberOfItems_IMetInst = get_frameForItemAtIndex_withNumberOfItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frameForItemAtIndex_withNumberOfItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, numberOfItems);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		frameForItemAtIndex_withNumberOfItems_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isFirstResponder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isFirstResponder_IMetInst(){
		return ((isFirstResponder_IMetInst != null)
	? (isFirstResponder_IMetInst)
	: (isFirstResponder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isFirstResponder", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isFirstResponder(){
			final com.apple.jobjc.Invoke.MsgSend isFirstResponder_IMetInst = get_isFirstResponder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isFirstResponder_IMetInst.init(nativeBuffer, this);
		isFirstResponder_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend itemAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemAtIndex_IMetInst(){
		return ((itemAtIndex_IMetInst != null)
	? (itemAtIndex_IMetInst)
	: (itemAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemAtIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSCollectionViewItem itemAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend itemAtIndex_IMetInst = get_itemAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		itemAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCollectionViewItem returnValue = (com.apple.jobjc.appkit.NSCollectionViewItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend itemPrototype_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemPrototype_IMetInst(){
		return ((itemPrototype_IMetInst != null)
	? (itemPrototype_IMetInst)
	: (itemPrototype_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemPrototype", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCollectionViewItem itemPrototype(){
			final com.apple.jobjc.Invoke.MsgSend itemPrototype_IMetInst = get_itemPrototype_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemPrototype_IMetInst.init(nativeBuffer, this);
		itemPrototype_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCollectionViewItem returnValue = (com.apple.jobjc.appkit.NSCollectionViewItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maxItemSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maxItemSize_IMetInst(){
		return ((maxItemSize_IMetInst != null)
	? (maxItemSize_IMetInst)
	: (maxItemSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maxItemSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize maxItemSize(){
			final com.apple.jobjc.Invoke.MsgSend maxItemSize_IMetInst = get_maxItemSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maxItemSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		maxItemSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maxNumberOfColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maxNumberOfColumns_IMetInst(){
		return ((maxNumberOfColumns_IMetInst != null)
	? (maxNumberOfColumns_IMetInst)
	: (maxNumberOfColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maxNumberOfColumns", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long maxNumberOfColumns(){
			final com.apple.jobjc.Invoke.MsgSend maxNumberOfColumns_IMetInst = get_maxNumberOfColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maxNumberOfColumns_IMetInst.init(nativeBuffer, this);
		maxNumberOfColumns_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maxNumberOfRows_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maxNumberOfRows_IMetInst(){
		return ((maxNumberOfRows_IMetInst != null)
	? (maxNumberOfRows_IMetInst)
	: (maxNumberOfRows_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maxNumberOfRows", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long maxNumberOfRows(){
			final com.apple.jobjc.Invoke.MsgSend maxNumberOfRows_IMetInst = get_maxNumberOfRows_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maxNumberOfRows_IMetInst.init(nativeBuffer, this);
		maxNumberOfRows_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minItemSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minItemSize_IMetInst(){
		return ((minItemSize_IMetInst != null)
	? (minItemSize_IMetInst)
	: (minItemSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minItemSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize minItemSize(){
			final com.apple.jobjc.Invoke.MsgSend minItemSize_IMetInst = get_minItemSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minItemSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		minItemSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend newItemForRepresentedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_newItemForRepresentedObject_IMetInst(){
		return ((newItemForRepresentedObject_IMetInst != null)
	? (newItemForRepresentedObject_IMetInst)
	: (newItemForRepresentedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "newItemForRepresentedObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCollectionViewItem newItemForRepresentedObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend newItemForRepresentedObject_IMetInst = get_newItemForRepresentedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		newItemForRepresentedObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		newItemForRepresentedObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCollectionViewItem returnValue = (com.apple.jobjc.appkit.NSCollectionViewItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectionIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectionIndexes_IMetInst(){
		return ((selectionIndexes_IMetInst != null)
	? (selectionIndexes_IMetInst)
	: (selectionIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectionIndexes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSIndexSet selectionIndexes(){
			final com.apple.jobjc.Invoke.MsgSend selectionIndexes_IMetInst = get_selectionIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectionIndexes_IMetInst.init(nativeBuffer, this);
		selectionIndexes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexSet returnValue = (com.apple.jobjc.foundation.NSIndexSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsMultipleSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsMultipleSelection_IMetInst(){
		return ((setAllowsMultipleSelection_IMetInst != null)
	? (setAllowsMultipleSelection_IMetInst)
	: (setAllowsMultipleSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsMultipleSelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsMultipleSelection(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAllowsMultipleSelection_IMetInst = get_setAllowsMultipleSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsMultipleSelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAllowsMultipleSelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBackgroundColors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBackgroundColors_IMetInst(){
		return ((setBackgroundColors_IMetInst != null)
	? (setBackgroundColors_IMetInst)
	: (setBackgroundColors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBackgroundColors:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setBackgroundColors(final com.apple.jobjc.foundation.NSArray colors){
			final com.apple.jobjc.Invoke.MsgSend setBackgroundColors_IMetInst = get_setBackgroundColors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBackgroundColors_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, colors);
		setBackgroundColors_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContent_IMetInst(){
		return ((setContent_IMetInst != null)
	? (setContent_IMetInst)
	: (setContent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setContent(final com.apple.jobjc.foundation.NSArray content){
			final com.apple.jobjc.Invoke.MsgSend setContent_IMetInst = get_setContent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, content);
		setContent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID aDelegate){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aDelegate);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDraggingSourceOperationMask_forLocal_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDraggingSourceOperationMask_forLocal_IMetInst(){
		return ((setDraggingSourceOperationMask_forLocal_IMetInst != null)
	? (setDraggingSourceOperationMask_forLocal_IMetInst)
	: (setDraggingSourceOperationMask_forLocal_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDraggingSourceOperationMask:forLocal:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDraggingSourceOperationMask_forLocal(final long dragOperationMask, final boolean localDestination){
			final com.apple.jobjc.Invoke.MsgSend setDraggingSourceOperationMask_forLocal_IMetInst = get_setDraggingSourceOperationMask_forLocal_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDraggingSourceOperationMask_forLocal_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, dragOperationMask);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, localDestination);
		setDraggingSourceOperationMask_forLocal_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setItemPrototype_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setItemPrototype_IMetInst(){
		return ((setItemPrototype_IMetInst != null)
	? (setItemPrototype_IMetInst)
	: (setItemPrototype_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setItemPrototype:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setItemPrototype(final com.apple.jobjc.appkit.NSCollectionViewItem prototype){
			final com.apple.jobjc.Invoke.MsgSend setItemPrototype_IMetInst = get_setItemPrototype_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setItemPrototype_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, prototype);
		setItemPrototype_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaxItemSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaxItemSize_IMetInst(){
		return ((setMaxItemSize_IMetInst != null)
	? (setMaxItemSize_IMetInst)
	: (setMaxItemSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaxItemSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setMaxItemSize(final com.apple.jobjc.foundation.NSSize size){
			final com.apple.jobjc.Invoke.MsgSend setMaxItemSize_IMetInst = get_setMaxItemSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaxItemSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		setMaxItemSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaxNumberOfColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaxNumberOfColumns_IMetInst(){
		return ((setMaxNumberOfColumns_IMetInst != null)
	? (setMaxNumberOfColumns_IMetInst)
	: (setMaxNumberOfColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaxNumberOfColumns:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setMaxNumberOfColumns(final long number){
			final com.apple.jobjc.Invoke.MsgSend setMaxNumberOfColumns_IMetInst = get_setMaxNumberOfColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaxNumberOfColumns_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, number);
		setMaxNumberOfColumns_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaxNumberOfRows_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaxNumberOfRows_IMetInst(){
		return ((setMaxNumberOfRows_IMetInst != null)
	? (setMaxNumberOfRows_IMetInst)
	: (setMaxNumberOfRows_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaxNumberOfRows:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setMaxNumberOfRows(final long number){
			final com.apple.jobjc.Invoke.MsgSend setMaxNumberOfRows_IMetInst = get_setMaxNumberOfRows_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaxNumberOfRows_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, number);
		setMaxNumberOfRows_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinItemSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinItemSize_IMetInst(){
		return ((setMinItemSize_IMetInst != null)
	? (setMinItemSize_IMetInst)
	: (setMinItemSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinItemSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setMinItemSize(final com.apple.jobjc.foundation.NSSize size){
			final com.apple.jobjc.Invoke.MsgSend setMinItemSize_IMetInst = get_setMinItemSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinItemSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		setMinItemSize_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setSelectionIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectionIndexes_IMetInst(){
		return ((setSelectionIndexes_IMetInst != null)
	? (setSelectionIndexes_IMetInst)
	: (setSelectionIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectionIndexes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSelectionIndexes(final com.apple.jobjc.foundation.NSIndexSet indexes){
			final com.apple.jobjc.Invoke.MsgSend setSelectionIndexes_IMetInst = get_setSelectionIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectionIndexes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		setSelectionIndexes_IMetInst.invoke(nativeBuffer);
		
		
	}

}
