package com.apple.jobjc.appkit;

public  class NSEventClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSEventClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSEventClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSEventClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addGlobalMonitorForEventsMatchingMask_handler_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addGlobalMonitorForEventsMatchingMask_handler_CMetInst(){
		return ((addGlobalMonitorForEventsMatchingMask_handler_CMetInst != null)
	? (addGlobalMonitorForEventsMatchingMask_handler_CMetInst)
	: (addGlobalMonitorForEventsMatchingMask_handler_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addGlobalMonitorForEventsMatchingMask:handler:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T addGlobalMonitorForEventsMatchingMask_handler(final long mask, final Object /* void(^)(NSEvent*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend addGlobalMonitorForEventsMatchingMask_handler_CMetInst = get_addGlobalMonitorForEventsMatchingMask_handler_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addGlobalMonitorForEventsMatchingMask_handler_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, mask);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		addGlobalMonitorForEventsMatchingMask_handler_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addLocalMonitorForEventsMatchingMask_handler_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addLocalMonitorForEventsMatchingMask_handler_CMetInst(){
		return ((addLocalMonitorForEventsMatchingMask_handler_CMetInst != null)
	? (addLocalMonitorForEventsMatchingMask_handler_CMetInst)
	: (addLocalMonitorForEventsMatchingMask_handler_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addLocalMonitorForEventsMatchingMask:handler:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T addLocalMonitorForEventsMatchingMask_handler(final long mask, final Object /* NSEvent*(^)(NSEvent*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend addLocalMonitorForEventsMatchingMask_handler_CMetInst = get_addLocalMonitorForEventsMatchingMask_handler_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addLocalMonitorForEventsMatchingMask_handler_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, mask);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		addLocalMonitorForEventsMatchingMask_handler_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend doubleClickInterval_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_doubleClickInterval_CMetInst(){
		return ((doubleClickInterval_CMetInst != null)
	? (doubleClickInterval_CMetInst)
	: (doubleClickInterval_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "doubleClickInterval", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double doubleClickInterval(){
			final com.apple.jobjc.Invoke.MsgSend doubleClickInterval_CMetInst = get_doubleClickInterval_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		doubleClickInterval_CMetInst.init(nativeBuffer, this);
		doubleClickInterval_CMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend enterExitEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_trackingNumber_userData_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enterExitEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_trackingNumber_userData_CMetInst(){
		return ((enterExitEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_trackingNumber_userData_CMetInst != null)
	? (enterExitEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_trackingNumber_userData_CMetInst)
	: (enterExitEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_trackingNumber_userData_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enterExitEventWithType:location:modifierFlags:timestamp:windowNumber:context:eventNumber:trackingNumber:userData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSEvent enterExitEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_trackingNumber_userData(final long type, final com.apple.jobjc.foundation.NSPoint location, final long flags, final double time, final long wNum, final com.apple.jobjc.appkit.NSGraphicsContext context, final long eNum, final long tNum, final com.apple.jobjc.Pointer<Void> data){
			final com.apple.jobjc.Invoke.MsgSend enterExitEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_trackingNumber_userData_CMetInst = get_enterExitEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_trackingNumber_userData_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enterExitEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_trackingNumber_userData_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, type);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, location);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, flags);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, time);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, wNum);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, context);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, eNum);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tNum);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, data);
		enterExitEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_trackingNumber_userData_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSEvent returnValue = (com.apple.jobjc.appkit.NSEvent) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend eventWithCGEvent_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_eventWithCGEvent_CMetInst(){
		return ((eventWithCGEvent_CMetInst != null)
	? (eventWithCGEvent_CMetInst)
	: (eventWithCGEvent_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "eventWithCGEvent:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSEvent eventWithCGEvent(final Object /* CGEventRef (^{__CGEvent}, ^{__CGEvent}) */ cgEvent){
			final com.apple.jobjc.Invoke.MsgSend eventWithCGEvent_CMetInst = get_eventWithCGEvent_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		eventWithCGEvent_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, cgEvent);
		eventWithCGEvent_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSEvent returnValue = (com.apple.jobjc.appkit.NSEvent) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend eventWithEventRef_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_eventWithEventRef_CMetInst(){
		return ((eventWithEventRef_CMetInst != null)
	? (eventWithEventRef_CMetInst)
	: (eventWithEventRef_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "eventWithEventRef:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSEvent eventWithEventRef(final com.apple.jobjc.Pointer<Void> eventRef){
			final com.apple.jobjc.Invoke.MsgSend eventWithEventRef_CMetInst = get_eventWithEventRef_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		eventWithEventRef_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, eventRef);
		eventWithEventRef_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSEvent returnValue = (com.apple.jobjc.appkit.NSEvent) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isMouseCoalescingEnabled_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isMouseCoalescingEnabled_CMetInst(){
		return ((isMouseCoalescingEnabled_CMetInst != null)
	? (isMouseCoalescingEnabled_CMetInst)
	: (isMouseCoalescingEnabled_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isMouseCoalescingEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isMouseCoalescingEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isMouseCoalescingEnabled_CMetInst = get_isMouseCoalescingEnabled_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isMouseCoalescingEnabled_CMetInst.init(nativeBuffer, this);
		isMouseCoalescingEnabled_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSwipeTrackingFromScrollEventsEnabled_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSwipeTrackingFromScrollEventsEnabled_CMetInst(){
		return ((isSwipeTrackingFromScrollEventsEnabled_CMetInst != null)
	? (isSwipeTrackingFromScrollEventsEnabled_CMetInst)
	: (isSwipeTrackingFromScrollEventsEnabled_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSwipeTrackingFromScrollEventsEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isSwipeTrackingFromScrollEventsEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isSwipeTrackingFromScrollEventsEnabled_CMetInst = get_isSwipeTrackingFromScrollEventsEnabled_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSwipeTrackingFromScrollEventsEnabled_CMetInst.init(nativeBuffer, this);
		isSwipeTrackingFromScrollEventsEnabled_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyEventWithType_location_modifierFlags_timestamp_windowNumber_context_characters_charactersIgnoringModifiers_isARepeat_keyCode_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyEventWithType_location_modifierFlags_timestamp_windowNumber_context_characters_charactersIgnoringModifiers_isARepeat_keyCode_CMetInst(){
		return ((keyEventWithType_location_modifierFlags_timestamp_windowNumber_context_characters_charactersIgnoringModifiers_isARepeat_keyCode_CMetInst != null)
	? (keyEventWithType_location_modifierFlags_timestamp_windowNumber_context_characters_charactersIgnoringModifiers_isARepeat_keyCode_CMetInst)
	: (keyEventWithType_location_modifierFlags_timestamp_windowNumber_context_characters_charactersIgnoringModifiers_isARepeat_keyCode_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyEventWithType:location:modifierFlags:timestamp:windowNumber:context:characters:charactersIgnoringModifiers:isARepeat:keyCode:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.UShortCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSEvent keyEventWithType_location_modifierFlags_timestamp_windowNumber_context_characters_charactersIgnoringModifiers_isARepeat_keyCode(final long type, final com.apple.jobjc.foundation.NSPoint location, final long flags, final double time, final long wNum, final com.apple.jobjc.appkit.NSGraphicsContext context, final com.apple.jobjc.foundation.NSString keys, final com.apple.jobjc.foundation.NSString ukeys, final boolean flag, final short code){
			final com.apple.jobjc.Invoke.MsgSend keyEventWithType_location_modifierFlags_timestamp_windowNumber_context_characters_charactersIgnoringModifiers_isARepeat_keyCode_CMetInst = get_keyEventWithType_location_modifierFlags_timestamp_windowNumber_context_characters_charactersIgnoringModifiers_isARepeat_keyCode_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyEventWithType_location_modifierFlags_timestamp_windowNumber_context_characters_charactersIgnoringModifiers_isARepeat_keyCode_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, type);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, location);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, flags);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, time);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, wNum);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, context);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keys);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ukeys);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.push(nativeBuffer, code);
		keyEventWithType_location_modifierFlags_timestamp_windowNumber_context_characters_charactersIgnoringModifiers_isARepeat_keyCode_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSEvent returnValue = (com.apple.jobjc.appkit.NSEvent) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyRepeatDelay_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyRepeatDelay_CMetInst(){
		return ((keyRepeatDelay_CMetInst != null)
	? (keyRepeatDelay_CMetInst)
	: (keyRepeatDelay_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyRepeatDelay", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double keyRepeatDelay(){
			final com.apple.jobjc.Invoke.MsgSend keyRepeatDelay_CMetInst = get_keyRepeatDelay_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyRepeatDelay_CMetInst.init(nativeBuffer, this);
		keyRepeatDelay_CMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyRepeatInterval_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyRepeatInterval_CMetInst(){
		return ((keyRepeatInterval_CMetInst != null)
	? (keyRepeatInterval_CMetInst)
	: (keyRepeatInterval_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyRepeatInterval", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double keyRepeatInterval(){
			final com.apple.jobjc.Invoke.MsgSend keyRepeatInterval_CMetInst = get_keyRepeatInterval_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyRepeatInterval_CMetInst.init(nativeBuffer, this);
		keyRepeatInterval_CMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend modifierFlags_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_modifierFlags_CMetInst(){
		return ((modifierFlags_CMetInst != null)
	? (modifierFlags_CMetInst)
	: (modifierFlags_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "modifierFlags", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long modifierFlags(){
			final com.apple.jobjc.Invoke.MsgSend modifierFlags_CMetInst = get_modifierFlags_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		modifierFlags_CMetInst.init(nativeBuffer, this);
		modifierFlags_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_clickCount_pressure_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_clickCount_pressure_CMetInst(){
		return ((mouseEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_clickCount_pressure_CMetInst != null)
	? (mouseEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_clickCount_pressure_CMetInst)
	: (mouseEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_clickCount_pressure_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseEventWithType:location:modifierFlags:timestamp:windowNumber:context:eventNumber:clickCount:pressure:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSEvent mouseEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_clickCount_pressure(final long type, final com.apple.jobjc.foundation.NSPoint location, final long flags, final double time, final long wNum, final com.apple.jobjc.appkit.NSGraphicsContext context, final long eNum, final long cNum, final float pressure){
			final com.apple.jobjc.Invoke.MsgSend mouseEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_clickCount_pressure_CMetInst = get_mouseEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_clickCount_pressure_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_clickCount_pressure_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, type);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, location);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, flags);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, time);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, wNum);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, context);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, eNum);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, cNum);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, pressure);
		mouseEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_clickCount_pressure_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSEvent returnValue = (com.apple.jobjc.appkit.NSEvent) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseLocation_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseLocation_CMetInst(){
		return ((mouseLocation_CMetInst != null)
	? (mouseLocation_CMetInst)
	: (mouseLocation_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseLocation", com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint mouseLocation(){
			final com.apple.jobjc.Invoke.MsgSend mouseLocation_CMetInst = get_mouseLocation_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseLocation_CMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		mouseLocation_CMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend otherEventWithType_location_modifierFlags_timestamp_windowNumber_context_subtype_data1_data2_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_otherEventWithType_location_modifierFlags_timestamp_windowNumber_context_subtype_data1_data2_CMetInst(){
		return ((otherEventWithType_location_modifierFlags_timestamp_windowNumber_context_subtype_data1_data2_CMetInst != null)
	? (otherEventWithType_location_modifierFlags_timestamp_windowNumber_context_subtype_data1_data2_CMetInst)
	: (otherEventWithType_location_modifierFlags_timestamp_windowNumber_context_subtype_data1_data2_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "otherEventWithType:location:modifierFlags:timestamp:windowNumber:context:subtype:data1:data2:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SShortCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSEvent otherEventWithType_location_modifierFlags_timestamp_windowNumber_context_subtype_data1_data2(final long type, final com.apple.jobjc.foundation.NSPoint location, final long flags, final double time, final long wNum, final com.apple.jobjc.appkit.NSGraphicsContext context, final short subtype, final long d1, final long d2){
			final com.apple.jobjc.Invoke.MsgSend otherEventWithType_location_modifierFlags_timestamp_windowNumber_context_subtype_data1_data2_CMetInst = get_otherEventWithType_location_modifierFlags_timestamp_windowNumber_context_subtype_data1_data2_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		otherEventWithType_location_modifierFlags_timestamp_windowNumber_context_subtype_data1_data2_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, type);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, location);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, flags);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, time);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, wNum);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, context);
		com.apple.jobjc.PrimitiveCoder.SShortCoder.INST.push(nativeBuffer, subtype);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, d1);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, d2);
		otherEventWithType_location_modifierFlags_timestamp_windowNumber_context_subtype_data1_data2_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSEvent returnValue = (com.apple.jobjc.appkit.NSEvent) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pressedMouseButtons_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pressedMouseButtons_CMetInst(){
		return ((pressedMouseButtons_CMetInst != null)
	? (pressedMouseButtons_CMetInst)
	: (pressedMouseButtons_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pressedMouseButtons", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long pressedMouseButtons(){
			final com.apple.jobjc.Invoke.MsgSend pressedMouseButtons_CMetInst = get_pressedMouseButtons_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pressedMouseButtons_CMetInst.init(nativeBuffer, this);
		pressedMouseButtons_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeMonitor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeMonitor_CMetInst(){
		return ((removeMonitor_CMetInst != null)
	? (removeMonitor_CMetInst)
	: (removeMonitor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeMonitor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeMonitor(final com.apple.jobjc.ID eventMonitor){
			final com.apple.jobjc.Invoke.MsgSend removeMonitor_CMetInst = get_removeMonitor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeMonitor_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, eventMonitor);
		removeMonitor_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMouseCoalescingEnabled_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMouseCoalescingEnabled_CMetInst(){
		return ((setMouseCoalescingEnabled_CMetInst != null)
	? (setMouseCoalescingEnabled_CMetInst)
	: (setMouseCoalescingEnabled_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMouseCoalescingEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setMouseCoalescingEnabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setMouseCoalescingEnabled_CMetInst = get_setMouseCoalescingEnabled_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMouseCoalescingEnabled_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setMouseCoalescingEnabled_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend startPeriodicEventsAfterDelay_withPeriod_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startPeriodicEventsAfterDelay_withPeriod_CMetInst(){
		return ((startPeriodicEventsAfterDelay_withPeriod_CMetInst != null)
	? (startPeriodicEventsAfterDelay_withPeriod_CMetInst)
	: (startPeriodicEventsAfterDelay_withPeriod_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startPeriodicEventsAfterDelay:withPeriod:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void startPeriodicEventsAfterDelay_withPeriod(final double delay, final double period){
			final com.apple.jobjc.Invoke.MsgSend startPeriodicEventsAfterDelay_withPeriod_CMetInst = get_startPeriodicEventsAfterDelay_withPeriod_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startPeriodicEventsAfterDelay_withPeriod_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, delay);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, period);
		startPeriodicEventsAfterDelay_withPeriod_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stopPeriodicEvents_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stopPeriodicEvents_CMetInst(){
		return ((stopPeriodicEvents_CMetInst != null)
	? (stopPeriodicEvents_CMetInst)
	: (stopPeriodicEvents_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stopPeriodicEvents", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void stopPeriodicEvents(){
			final com.apple.jobjc.Invoke.MsgSend stopPeriodicEvents_CMetInst = get_stopPeriodicEvents_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stopPeriodicEvents_CMetInst.init(nativeBuffer, this);
		stopPeriodicEvents_CMetInst.invoke(nativeBuffer);
		
		
	}

}
