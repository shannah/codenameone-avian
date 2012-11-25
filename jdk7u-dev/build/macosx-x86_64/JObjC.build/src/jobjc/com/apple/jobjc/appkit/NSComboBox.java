package com.apple.jobjc.appkit;

public  class NSComboBox extends com.apple.jobjc.appkit.NSTextField {
	public NSComboBox(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSComboBox(final NSComboBox obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addItemWithObjectValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addItemWithObjectValue_IMetInst(){
		return ((addItemWithObjectValue_IMetInst != null)
	? (addItemWithObjectValue_IMetInst)
	: (addItemWithObjectValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addItemWithObjectValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addItemWithObjectValue(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend addItemWithObjectValue_IMetInst = get_addItemWithObjectValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addItemWithObjectValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		addItemWithObjectValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addItemsWithObjectValues_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addItemsWithObjectValues_IMetInst(){
		return ((addItemsWithObjectValues_IMetInst != null)
	? (addItemsWithObjectValues_IMetInst)
	: (addItemsWithObjectValues_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addItemsWithObjectValues:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addItemsWithObjectValues(final com.apple.jobjc.foundation.NSArray objects){
			final com.apple.jobjc.Invoke.MsgSend addItemsWithObjectValues_IMetInst = get_addItemsWithObjectValues_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addItemsWithObjectValues_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objects);
		addItemsWithObjectValues_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend completes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_completes_IMetInst(){
		return ((completes_IMetInst != null)
	? (completes_IMetInst)
	: (completes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "completes", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean completes(){
			final com.apple.jobjc.Invoke.MsgSend completes_IMetInst = get_completes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		completes_IMetInst.init(nativeBuffer, this);
		completes_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataSource_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataSource_IMetInst(){
		return ((dataSource_IMetInst != null)
	? (dataSource_IMetInst)
	: (dataSource_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataSource", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dataSource(){
			final com.apple.jobjc.Invoke.MsgSend dataSource_IMetInst = get_dataSource_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataSource_IMetInst.init(nativeBuffer, this);
		dataSource_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend deselectItemAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deselectItemAtIndex_IMetInst(){
		return ((deselectItemAtIndex_IMetInst != null)
	? (deselectItemAtIndex_IMetInst)
	: (deselectItemAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deselectItemAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void deselectItemAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend deselectItemAtIndex_IMetInst = get_deselectItemAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deselectItemAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		deselectItemAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend hasVerticalScroller_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasVerticalScroller_IMetInst(){
		return ((hasVerticalScroller_IMetInst != null)
	? (hasVerticalScroller_IMetInst)
	: (hasVerticalScroller_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasVerticalScroller", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasVerticalScroller(){
			final com.apple.jobjc.Invoke.MsgSend hasVerticalScroller_IMetInst = get_hasVerticalScroller_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasVerticalScroller_IMetInst.init(nativeBuffer, this);
		hasVerticalScroller_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfItemWithObjectValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfItemWithObjectValue_IMetInst(){
		return ((indexOfItemWithObjectValue_IMetInst != null)
	? (indexOfItemWithObjectValue_IMetInst)
	: (indexOfItemWithObjectValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfItemWithObjectValue:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long indexOfItemWithObjectValue(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend indexOfItemWithObjectValue_IMetInst = get_indexOfItemWithObjectValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfItemWithObjectValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		indexOfItemWithObjectValue_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend insertItemWithObjectValue_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertItemWithObjectValue_atIndex_IMetInst(){
		return ((insertItemWithObjectValue_atIndex_IMetInst != null)
	? (insertItemWithObjectValue_atIndex_IMetInst)
	: (insertItemWithObjectValue_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertItemWithObjectValue:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void insertItemWithObjectValue_atIndex(final com.apple.jobjc.ID object, final long index){
			final com.apple.jobjc.Invoke.MsgSend insertItemWithObjectValue_atIndex_IMetInst = get_insertItemWithObjectValue_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertItemWithObjectValue_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		insertItemWithObjectValue_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend intercellSpacing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_intercellSpacing_IMetInst(){
		return ((intercellSpacing_IMetInst != null)
	? (intercellSpacing_IMetInst)
	: (intercellSpacing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "intercellSpacing", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize intercellSpacing(){
			final com.apple.jobjc.Invoke.MsgSend intercellSpacing_IMetInst = get_intercellSpacing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		intercellSpacing_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		intercellSpacing_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isButtonBordered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isButtonBordered_IMetInst(){
		return ((isButtonBordered_IMetInst != null)
	? (isButtonBordered_IMetInst)
	: (isButtonBordered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isButtonBordered", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isButtonBordered(){
			final com.apple.jobjc.Invoke.MsgSend isButtonBordered_IMetInst = get_isButtonBordered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isButtonBordered_IMetInst.init(nativeBuffer, this);
		isButtonBordered_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend itemHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemHeight_IMetInst(){
		return ((itemHeight_IMetInst != null)
	? (itemHeight_IMetInst)
	: (itemHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemHeight", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double itemHeight(){
			final com.apple.jobjc.Invoke.MsgSend itemHeight_IMetInst = get_itemHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemHeight_IMetInst.init(nativeBuffer, this);
		itemHeight_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend itemObjectValueAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemObjectValueAtIndex_IMetInst(){
		return ((itemObjectValueAtIndex_IMetInst != null)
	? (itemObjectValueAtIndex_IMetInst)
	: (itemObjectValueAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemObjectValueAtIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T itemObjectValueAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend itemObjectValueAtIndex_IMetInst = get_itemObjectValueAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemObjectValueAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		itemObjectValueAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend noteNumberOfItemsChanged_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_noteNumberOfItemsChanged_IMetInst(){
		return ((noteNumberOfItemsChanged_IMetInst != null)
	? (noteNumberOfItemsChanged_IMetInst)
	: (noteNumberOfItemsChanged_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "noteNumberOfItemsChanged", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void noteNumberOfItemsChanged(){
			final com.apple.jobjc.Invoke.MsgSend noteNumberOfItemsChanged_IMetInst = get_noteNumberOfItemsChanged_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		noteNumberOfItemsChanged_IMetInst.init(nativeBuffer, this);
		noteNumberOfItemsChanged_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfItems_IMetInst(){
		return ((numberOfItems_IMetInst != null)
	? (numberOfItems_IMetInst)
	: (numberOfItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfItems", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long numberOfItems(){
			final com.apple.jobjc.Invoke.MsgSend numberOfItems_IMetInst = get_numberOfItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfItems_IMetInst.init(nativeBuffer, this);
		numberOfItems_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfVisibleItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfVisibleItems_IMetInst(){
		return ((numberOfVisibleItems_IMetInst != null)
	? (numberOfVisibleItems_IMetInst)
	: (numberOfVisibleItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfVisibleItems", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long numberOfVisibleItems(){
			final com.apple.jobjc.Invoke.MsgSend numberOfVisibleItems_IMetInst = get_numberOfVisibleItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfVisibleItems_IMetInst.init(nativeBuffer, this);
		numberOfVisibleItems_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectValueOfSelectedItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectValueOfSelectedItem_IMetInst(){
		return ((objectValueOfSelectedItem_IMetInst != null)
	? (objectValueOfSelectedItem_IMetInst)
	: (objectValueOfSelectedItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectValueOfSelectedItem", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectValueOfSelectedItem(){
			final com.apple.jobjc.Invoke.MsgSend objectValueOfSelectedItem_IMetInst = get_objectValueOfSelectedItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectValueOfSelectedItem_IMetInst.init(nativeBuffer, this);
		objectValueOfSelectedItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectValues_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectValues_IMetInst(){
		return ((objectValues_IMetInst != null)
	? (objectValues_IMetInst)
	: (objectValues_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectValues", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray objectValues(){
			final com.apple.jobjc.Invoke.MsgSend objectValues_IMetInst = get_objectValues_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectValues_IMetInst.init(nativeBuffer, this);
		objectValues_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend reloadData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reloadData_IMetInst(){
		return ((reloadData_IMetInst != null)
	? (reloadData_IMetInst)
	: (reloadData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reloadData", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void reloadData(){
			final com.apple.jobjc.Invoke.MsgSend reloadData_IMetInst = get_reloadData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reloadData_IMetInst.init(nativeBuffer, this);
		reloadData_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeAllItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeAllItems_IMetInst(){
		return ((removeAllItems_IMetInst != null)
	? (removeAllItems_IMetInst)
	: (removeAllItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeAllItems", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void removeAllItems(){
			final com.apple.jobjc.Invoke.MsgSend removeAllItems_IMetInst = get_removeAllItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeAllItems_IMetInst.init(nativeBuffer, this);
		removeAllItems_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeItemAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeItemAtIndex_IMetInst(){
		return ((removeItemAtIndex_IMetInst != null)
	? (removeItemAtIndex_IMetInst)
	: (removeItemAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeItemAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void removeItemAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend removeItemAtIndex_IMetInst = get_removeItemAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeItemAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		removeItemAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeItemWithObjectValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeItemWithObjectValue_IMetInst(){
		return ((removeItemWithObjectValue_IMetInst != null)
	? (removeItemWithObjectValue_IMetInst)
	: (removeItemWithObjectValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeItemWithObjectValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeItemWithObjectValue(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend removeItemWithObjectValue_IMetInst = get_removeItemWithObjectValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeItemWithObjectValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		removeItemWithObjectValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollItemAtIndexToTop_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollItemAtIndexToTop_IMetInst(){
		return ((scrollItemAtIndexToTop_IMetInst != null)
	? (scrollItemAtIndexToTop_IMetInst)
	: (scrollItemAtIndexToTop_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollItemAtIndexToTop:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void scrollItemAtIndexToTop(final long index){
			final com.apple.jobjc.Invoke.MsgSend scrollItemAtIndexToTop_IMetInst = get_scrollItemAtIndexToTop_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollItemAtIndexToTop_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		scrollItemAtIndexToTop_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollItemAtIndexToVisible_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollItemAtIndexToVisible_IMetInst(){
		return ((scrollItemAtIndexToVisible_IMetInst != null)
	? (scrollItemAtIndexToVisible_IMetInst)
	: (scrollItemAtIndexToVisible_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollItemAtIndexToVisible:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void scrollItemAtIndexToVisible(final long index){
			final com.apple.jobjc.Invoke.MsgSend scrollItemAtIndexToVisible_IMetInst = get_scrollItemAtIndexToVisible_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollItemAtIndexToVisible_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		scrollItemAtIndexToVisible_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectItemAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectItemAtIndex_IMetInst(){
		return ((selectItemAtIndex_IMetInst != null)
	? (selectItemAtIndex_IMetInst)
	: (selectItemAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectItemAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void selectItemAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend selectItemAtIndex_IMetInst = get_selectItemAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectItemAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		selectItemAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectItemWithObjectValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectItemWithObjectValue_IMetInst(){
		return ((selectItemWithObjectValue_IMetInst != null)
	? (selectItemWithObjectValue_IMetInst)
	: (selectItemWithObjectValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectItemWithObjectValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectItemWithObjectValue(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend selectItemWithObjectValue_IMetInst = get_selectItemWithObjectValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectItemWithObjectValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		selectItemWithObjectValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setButtonBordered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setButtonBordered_IMetInst(){
		return ((setButtonBordered_IMetInst != null)
	? (setButtonBordered_IMetInst)
	: (setButtonBordered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setButtonBordered:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setButtonBordered(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setButtonBordered_IMetInst = get_setButtonBordered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setButtonBordered_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setButtonBordered_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCompletes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCompletes_IMetInst(){
		return ((setCompletes_IMetInst != null)
	? (setCompletes_IMetInst)
	: (setCompletes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCompletes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setCompletes(final boolean completes){
			final com.apple.jobjc.Invoke.MsgSend setCompletes_IMetInst = get_setCompletes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCompletes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, completes);
		setCompletes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDataSource_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDataSource_IMetInst(){
		return ((setDataSource_IMetInst != null)
	? (setDataSource_IMetInst)
	: (setDataSource_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDataSource:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDataSource(final com.apple.jobjc.ID aSource){
			final com.apple.jobjc.Invoke.MsgSend setDataSource_IMetInst = get_setDataSource_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDataSource_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aSource);
		setDataSource_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setHasVerticalScroller_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHasVerticalScroller_IMetInst(){
		return ((setHasVerticalScroller_IMetInst != null)
	? (setHasVerticalScroller_IMetInst)
	: (setHasVerticalScroller_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHasVerticalScroller:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHasVerticalScroller(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setHasVerticalScroller_IMetInst = get_setHasVerticalScroller_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHasVerticalScroller_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setHasVerticalScroller_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIntercellSpacing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIntercellSpacing_IMetInst(){
		return ((setIntercellSpacing_IMetInst != null)
	? (setIntercellSpacing_IMetInst)
	: (setIntercellSpacing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIntercellSpacing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setIntercellSpacing(final com.apple.jobjc.foundation.NSSize aSize){
			final com.apple.jobjc.Invoke.MsgSend setIntercellSpacing_IMetInst = get_setIntercellSpacing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIntercellSpacing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, aSize);
		setIntercellSpacing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setItemHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setItemHeight_IMetInst(){
		return ((setItemHeight_IMetInst != null)
	? (setItemHeight_IMetInst)
	: (setItemHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setItemHeight:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setItemHeight(final double itemHeight){
			final com.apple.jobjc.Invoke.MsgSend setItemHeight_IMetInst = get_setItemHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setItemHeight_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, itemHeight);
		setItemHeight_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNumberOfVisibleItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNumberOfVisibleItems_IMetInst(){
		return ((setNumberOfVisibleItems_IMetInst != null)
	? (setNumberOfVisibleItems_IMetInst)
	: (setNumberOfVisibleItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNumberOfVisibleItems:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setNumberOfVisibleItems(final long visibleItems){
			final com.apple.jobjc.Invoke.MsgSend setNumberOfVisibleItems_IMetInst = get_setNumberOfVisibleItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNumberOfVisibleItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, visibleItems);
		setNumberOfVisibleItems_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesDataSource_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesDataSource_IMetInst(){
		return ((setUsesDataSource_IMetInst != null)
	? (setUsesDataSource_IMetInst)
	: (setUsesDataSource_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesDataSource:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesDataSource(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setUsesDataSource_IMetInst = get_setUsesDataSource_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesDataSource_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setUsesDataSource_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend usesDataSource_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesDataSource_IMetInst(){
		return ((usesDataSource_IMetInst != null)
	? (usesDataSource_IMetInst)
	: (usesDataSource_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesDataSource", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesDataSource(){
			final com.apple.jobjc.Invoke.MsgSend usesDataSource_IMetInst = get_usesDataSource_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesDataSource_IMetInst.init(nativeBuffer, this);
		usesDataSource_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
