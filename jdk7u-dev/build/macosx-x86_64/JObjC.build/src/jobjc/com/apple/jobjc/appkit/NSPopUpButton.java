package com.apple.jobjc.appkit;

public  class NSPopUpButton extends com.apple.jobjc.appkit.NSButton {
	public NSPopUpButton(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPopUpButton(final NSPopUpButton obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addItemWithTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addItemWithTitle_IMetInst(){
		return ((addItemWithTitle_IMetInst != null)
	? (addItemWithTitle_IMetInst)
	: (addItemWithTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addItemWithTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addItemWithTitle(final com.apple.jobjc.foundation.NSString title){
			final com.apple.jobjc.Invoke.MsgSend addItemWithTitle_IMetInst = get_addItemWithTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addItemWithTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		addItemWithTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addItemsWithTitles_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addItemsWithTitles_IMetInst(){
		return ((addItemsWithTitles_IMetInst != null)
	? (addItemsWithTitles_IMetInst)
	: (addItemsWithTitles_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addItemsWithTitles:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addItemsWithTitles(final com.apple.jobjc.foundation.NSArray itemTitles){
			final com.apple.jobjc.Invoke.MsgSend addItemsWithTitles_IMetInst = get_addItemsWithTitles_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addItemsWithTitles_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, itemTitles);
		addItemsWithTitles_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend autoenablesItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autoenablesItems_IMetInst(){
		return ((autoenablesItems_IMetInst != null)
	? (autoenablesItems_IMetInst)
	: (autoenablesItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autoenablesItems", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean autoenablesItems(){
			final com.apple.jobjc.Invoke.MsgSend autoenablesItems_IMetInst = get_autoenablesItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autoenablesItems_IMetInst.init(nativeBuffer, this);
		autoenablesItems_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfItem_IMetInst(){
		return ((indexOfItem_IMetInst != null)
	? (indexOfItem_IMetInst)
	: (indexOfItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfItem:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long indexOfItem(final com.apple.jobjc.appkit.NSMenuItem item){
			final com.apple.jobjc.Invoke.MsgSend indexOfItem_IMetInst = get_indexOfItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		indexOfItem_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfItemWithRepresentedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfItemWithRepresentedObject_IMetInst(){
		return ((indexOfItemWithRepresentedObject_IMetInst != null)
	? (indexOfItemWithRepresentedObject_IMetInst)
	: (indexOfItemWithRepresentedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfItemWithRepresentedObject:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long indexOfItemWithRepresentedObject(final com.apple.jobjc.ID obj){
			final com.apple.jobjc.Invoke.MsgSend indexOfItemWithRepresentedObject_IMetInst = get_indexOfItemWithRepresentedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfItemWithRepresentedObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		indexOfItemWithRepresentedObject_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfItemWithTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfItemWithTag_IMetInst(){
		return ((indexOfItemWithTag_IMetInst != null)
	? (indexOfItemWithTag_IMetInst)
	: (indexOfItemWithTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfItemWithTag:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long indexOfItemWithTag(final long tag){
			final com.apple.jobjc.Invoke.MsgSend indexOfItemWithTag_IMetInst = get_indexOfItemWithTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfItemWithTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		indexOfItemWithTag_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfItemWithTarget_andAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfItemWithTarget_andAction_IMetInst(){
		return ((indexOfItemWithTarget_andAction_IMetInst != null)
	? (indexOfItemWithTarget_andAction_IMetInst)
	: (indexOfItemWithTarget_andAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfItemWithTarget:andAction:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public long indexOfItemWithTarget_andAction(final com.apple.jobjc.ID target, final com.apple.jobjc.SEL actionSelector){
			final com.apple.jobjc.Invoke.MsgSend indexOfItemWithTarget_andAction_IMetInst = get_indexOfItemWithTarget_andAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfItemWithTarget_andAction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, actionSelector);
		indexOfItemWithTarget_andAction_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfItemWithTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfItemWithTitle_IMetInst(){
		return ((indexOfItemWithTitle_IMetInst != null)
	? (indexOfItemWithTitle_IMetInst)
	: (indexOfItemWithTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfItemWithTitle:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long indexOfItemWithTitle(final com.apple.jobjc.foundation.NSString title){
			final com.apple.jobjc.Invoke.MsgSend indexOfItemWithTitle_IMetInst = get_indexOfItemWithTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfItemWithTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		indexOfItemWithTitle_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend initWithFrame_pullsDown_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFrame_pullsDown_IMetInst(){
		return ((initWithFrame_pullsDown_IMetInst != null)
	? (initWithFrame_pullsDown_IMetInst)
	: (initWithFrame_pullsDown_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFrame:pullsDown:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFrame_pullsDown(final com.apple.jobjc.foundation.NSRect buttonFrame, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend initWithFrame_pullsDown_IMetInst = get_initWithFrame_pullsDown_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFrame_pullsDown_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, buttonFrame);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		initWithFrame_pullsDown_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertItemWithTitle_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertItemWithTitle_atIndex_IMetInst(){
		return ((insertItemWithTitle_atIndex_IMetInst != null)
	? (insertItemWithTitle_atIndex_IMetInst)
	: (insertItemWithTitle_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertItemWithTitle:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void insertItemWithTitle_atIndex(final com.apple.jobjc.foundation.NSString title, final long index){
			final com.apple.jobjc.Invoke.MsgSend insertItemWithTitle_atIndex_IMetInst = get_insertItemWithTitle_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertItemWithTitle_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		insertItemWithTitle_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend itemArray_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemArray_IMetInst(){
		return ((itemArray_IMetInst != null)
	? (itemArray_IMetInst)
	: (itemArray_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemArray", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray itemArray(){
			final com.apple.jobjc.Invoke.MsgSend itemArray_IMetInst = get_itemArray_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemArray_IMetInst.init(nativeBuffer, this);
		itemArray_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend itemAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemAtIndex_IMetInst(){
		return ((itemAtIndex_IMetInst != null)
	? (itemAtIndex_IMetInst)
	: (itemAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemAtIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSMenuItem itemAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend itemAtIndex_IMetInst = get_itemAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		itemAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenuItem returnValue = (com.apple.jobjc.appkit.NSMenuItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend itemTitleAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemTitleAtIndex_IMetInst(){
		return ((itemTitleAtIndex_IMetInst != null)
	? (itemTitleAtIndex_IMetInst)
	: (itemTitleAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemTitleAtIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString itemTitleAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend itemTitleAtIndex_IMetInst = get_itemTitleAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemTitleAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		itemTitleAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend itemTitles_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemTitles_IMetInst(){
		return ((itemTitles_IMetInst != null)
	? (itemTitles_IMetInst)
	: (itemTitles_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemTitles", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray itemTitles(){
			final com.apple.jobjc.Invoke.MsgSend itemTitles_IMetInst = get_itemTitles_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemTitles_IMetInst.init(nativeBuffer, this);
		itemTitles_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend itemWithTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemWithTitle_IMetInst(){
		return ((itemWithTitle_IMetInst != null)
	? (itemWithTitle_IMetInst)
	: (itemWithTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemWithTitle:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenuItem itemWithTitle(final com.apple.jobjc.foundation.NSString title){
			final com.apple.jobjc.Invoke.MsgSend itemWithTitle_IMetInst = get_itemWithTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemWithTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		itemWithTitle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenuItem returnValue = (com.apple.jobjc.appkit.NSMenuItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lastItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lastItem_IMetInst(){
		return ((lastItem_IMetInst != null)
	? (lastItem_IMetInst)
	: (lastItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lastItem", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenuItem lastItem(){
			final com.apple.jobjc.Invoke.MsgSend lastItem_IMetInst = get_lastItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lastItem_IMetInst.init(nativeBuffer, this);
		lastItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenuItem returnValue = (com.apple.jobjc.appkit.NSMenuItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend menu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menu_IMetInst(){
		return ((menu_IMetInst != null)
	? (menu_IMetInst)
	: (menu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menu", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu menu(){
			final com.apple.jobjc.Invoke.MsgSend menu_IMetInst = get_menu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menu_IMetInst.init(nativeBuffer, this);
		menu_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend preferredEdge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preferredEdge_IMetInst(){
		return ((preferredEdge_IMetInst != null)
	? (preferredEdge_IMetInst)
	: (preferredEdge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preferredEdge", com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder)));
	}

	 public long preferredEdge(){
			final com.apple.jobjc.Invoke.MsgSend preferredEdge_IMetInst = get_preferredEdge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preferredEdge_IMetInst.init(nativeBuffer, this);
		preferredEdge_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pullsDown_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pullsDown_IMetInst(){
		return ((pullsDown_IMetInst != null)
	? (pullsDown_IMetInst)
	: (pullsDown_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pullsDown", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean pullsDown(){
			final com.apple.jobjc.Invoke.MsgSend pullsDown_IMetInst = get_pullsDown_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pullsDown_IMetInst.init(nativeBuffer, this);
		pullsDown_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend removeItemWithTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeItemWithTitle_IMetInst(){
		return ((removeItemWithTitle_IMetInst != null)
	? (removeItemWithTitle_IMetInst)
	: (removeItemWithTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeItemWithTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeItemWithTitle(final com.apple.jobjc.foundation.NSString title){
			final com.apple.jobjc.Invoke.MsgSend removeItemWithTitle_IMetInst = get_removeItemWithTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeItemWithTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		removeItemWithTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectItem_IMetInst(){
		return ((selectItem_IMetInst != null)
	? (selectItem_IMetInst)
	: (selectItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectItem(final com.apple.jobjc.appkit.NSMenuItem item){
			final com.apple.jobjc.Invoke.MsgSend selectItem_IMetInst = get_selectItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		selectItem_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend selectItemWithTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectItemWithTag_IMetInst(){
		return ((selectItemWithTag_IMetInst != null)
	? (selectItemWithTag_IMetInst)
	: (selectItemWithTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectItemWithTag:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean selectItemWithTag(final long tag){
			final com.apple.jobjc.Invoke.MsgSend selectItemWithTag_IMetInst = get_selectItemWithTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectItemWithTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		selectItemWithTag_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectItemWithTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectItemWithTitle_IMetInst(){
		return ((selectItemWithTitle_IMetInst != null)
	? (selectItemWithTitle_IMetInst)
	: (selectItemWithTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectItemWithTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectItemWithTitle(final com.apple.jobjc.foundation.NSString title){
			final com.apple.jobjc.Invoke.MsgSend selectItemWithTitle_IMetInst = get_selectItemWithTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectItemWithTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		selectItemWithTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedItem_IMetInst(){
		return ((selectedItem_IMetInst != null)
	? (selectedItem_IMetInst)
	: (selectedItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedItem", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenuItem selectedItem(){
			final com.apple.jobjc.Invoke.MsgSend selectedItem_IMetInst = get_selectedItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedItem_IMetInst.init(nativeBuffer, this);
		selectedItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenuItem returnValue = (com.apple.jobjc.appkit.NSMenuItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutoenablesItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutoenablesItems_IMetInst(){
		return ((setAutoenablesItems_IMetInst != null)
	? (setAutoenablesItems_IMetInst)
	: (setAutoenablesItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutoenablesItems:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutoenablesItems(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutoenablesItems_IMetInst = get_setAutoenablesItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutoenablesItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutoenablesItems_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMenu_IMetInst(){
		return ((setMenu_IMetInst != null)
	? (setMenu_IMetInst)
	: (setMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMenu:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMenu(final com.apple.jobjc.appkit.NSMenu menu){
			final com.apple.jobjc.Invoke.MsgSend setMenu_IMetInst = get_setMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		setMenu_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPreferredEdge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPreferredEdge_IMetInst(){
		return ((setPreferredEdge_IMetInst != null)
	? (setPreferredEdge_IMetInst)
	: (setPreferredEdge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPreferredEdge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder)));
	}

	 public void setPreferredEdge(final long edge){
			final com.apple.jobjc.Invoke.MsgSend setPreferredEdge_IMetInst = get_setPreferredEdge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPreferredEdge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder.push(nativeBuffer, edge);
		setPreferredEdge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPullsDown_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPullsDown_IMetInst(){
		return ((setPullsDown_IMetInst != null)
	? (setPullsDown_IMetInst)
	: (setPullsDown_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPullsDown:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setPullsDown(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setPullsDown_IMetInst = get_setPullsDown_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPullsDown_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setPullsDown_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitle_IMetInst(){
		return ((setTitle_IMetInst != null)
	? (setTitle_IMetInst)
	: (setTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTitle(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend setTitle_IMetInst = get_setTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		setTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend synchronizeTitleAndSelectedItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_synchronizeTitleAndSelectedItem_IMetInst(){
		return ((synchronizeTitleAndSelectedItem_IMetInst != null)
	? (synchronizeTitleAndSelectedItem_IMetInst)
	: (synchronizeTitleAndSelectedItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "synchronizeTitleAndSelectedItem", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void synchronizeTitleAndSelectedItem(){
			final com.apple.jobjc.Invoke.MsgSend synchronizeTitleAndSelectedItem_IMetInst = get_synchronizeTitleAndSelectedItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		synchronizeTitleAndSelectedItem_IMetInst.init(nativeBuffer, this);
		synchronizeTitleAndSelectedItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend titleOfSelectedItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_titleOfSelectedItem_IMetInst(){
		return ((titleOfSelectedItem_IMetInst != null)
	? (titleOfSelectedItem_IMetInst)
	: (titleOfSelectedItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "titleOfSelectedItem", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString titleOfSelectedItem(){
			final com.apple.jobjc.Invoke.MsgSend titleOfSelectedItem_IMetInst = get_titleOfSelectedItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		titleOfSelectedItem_IMetInst.init(nativeBuffer, this);
		titleOfSelectedItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
