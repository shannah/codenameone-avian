package com.apple.jobjc.appkit;

public  class AppKitFramework extends com.apple.jobjc.MacOSXFramework {
	public AppKitFramework(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime, new String[]{});
	}

	public NSEdgeInsets makeNSEdgeInsets(){
		return new NSEdgeInsets(getRuntime());
	}
	public NSEdgeInsets makeNSEdgeInsets(com.apple.jobjc.NativeBuffer base){
		return new NSEdgeInsets(getRuntime(), base);
	}
	public final int NSAWTEventType(){ return 16 ; }
	public final int NSAboveBottom(){ return 4 ; }
	public final int NSAboveTop(){ return 1 ; }
	public final int NSAddTraitFontAction(){ return 2 ; }
	public final int NSAdobeCNS1CharacterCollection(){ return 1 ; }
	public final int NSAdobeGB1CharacterCollection(){ return 2 ; }
	public final int NSAdobeJapan1CharacterCollection(){ return 3 ; }
	public final int NSAdobeJapan2CharacterCollection(){ return 4 ; }
	public final int NSAdobeKorea1CharacterCollection(){ return 5 ; }
	public final int NSAlertAlternateReturn(){ return 0 ; }
	public final int NSAlertDefaultReturn(){ return 1 ; }
	public final int NSAlertErrorReturn(){ return -2 ; }
	public final int NSAlertFirstButtonReturn(){ return 1000 ; }
	public final int NSAlertOtherReturn(){ return -1 ; }
	public final int NSAlertSecondButtonReturn(){ return 1001 ; }
	public final int NSAlertThirdButtonReturn(){ return 1002 ; }
	public final int NSAllScrollerParts(){ return 2 ; }
	public final int NSAlphaFirstBitmapFormat(){ return 1 ; }
	public final int NSAlphaNonpremultipliedBitmapFormat(){ return 2 ; }
	public final int NSAlphaShiftKeyMask(){ return 65536 ; }
	public final int NSAlternateKeyMask(){ return 524288 ; }
	public final int NSAnimationBlocking(){ return 0 ; }
	public final int NSAnimationEaseIn(){ return 1 ; }
	public final int NSAnimationEaseInOut(){ return 0 ; }
	public final int NSAnimationEaseOut(){ return 2 ; }
	public final int NSAnimationEffectDisappearingItemDefault(){ return 0 ; }
	public final int NSAnimationEffectPoof(){ return 10 ; }
	public final int NSAnimationLinear(){ return 3 ; }
	public final int NSAnimationNonblocking(){ return 1 ; }
	public final int NSAnimationNonblockingThreaded(){ return 2 ; }
	public final double NSAnyEventMask(){ return (com.apple.jobjc.JObjCRuntime.IS64 ? 18446744073709551615d : 4294967295d); }
	public final int NSAnyType(){ return 0 ; }
	public final int NSAppKitDefined(){ return 13 ; }
	public final int NSAppKitDefinedMask(){ return 8192 ; }
	public final int NSAppKitVersionNumber10_0(){ return 577 ; }
	public final int NSAppKitVersionNumber10_1(){ return 620 ; }
	public final int NSAppKitVersionNumber10_2(){ return 663 ; }
	public final double NSAppKitVersionNumber10_2_3(){ return 663.6d; }
	public final int NSAppKitVersionNumber10_3(){ return 743 ; }
	public final double NSAppKitVersionNumber10_3_2(){ return 743.14d; }
	public final double NSAppKitVersionNumber10_3_3(){ return 743.2d; }
	public final double NSAppKitVersionNumber10_3_5(){ return 743.24d; }
	public final double NSAppKitVersionNumber10_3_7(){ return 743.33d; }
	public final double NSAppKitVersionNumber10_3_9(){ return 743.36d; }
	public final int NSAppKitVersionNumber10_4(){ return 824 ; }
	public final double NSAppKitVersionNumber10_4_1(){ return 824.1d; }
	public final double NSAppKitVersionNumber10_4_3(){ return 824.23d; }
	public final double NSAppKitVersionNumber10_4_4(){ return 824.33d; }
	public final double NSAppKitVersionNumber10_4_7(){ return 824.41d; }
	public final int NSAppKitVersionNumber10_5(){ return 949 ; }
	public final double NSAppKitVersionNumber10_5_2(){ return 949.27d; }
	public final double NSAppKitVersionNumber10_5_3(){ return 949.33d; }
	public final int NSAppKitVersionNumber10_6(){ return 1038 ; }
	public final int NSAppKitVersionNumber10_7(){ return 1138 ; }
	public final double NSAppKitVersionNumber10_7_2(){ return 1138.23d; }
	public final float NSAppKitVersionNumberWithColumnResizingBrowser(){ return 685.0f; }
	public final float NSAppKitVersionNumberWithContinuousScrollingBrowser(){ return 680.0f; }
	public final float NSAppKitVersionNumberWithCursorSizeSupport(){ return 682.0f; }
	public final float NSAppKitVersionNumberWithCustomSheetPosition(){ return 686.0f; }
	public final float NSAppKitVersionNumberWithDeferredWindowDisplaySupport(){ return 1019.0f; }
	public final float NSAppKitVersionNumberWithDirectionalTabs(){ return 631.0f; }
	public final float NSAppKitVersionNumberWithDockTilePlugInSupport(){ return 1001.0f; }
	public final float NSAppKitVersionNumberWithPatternColorLeakFix(){ return 641.0f; }
	public final int NSApplicationActivateAllWindows(){ return 1 ; }
	public final int NSApplicationActivateIgnoringOtherApps(){ return 2 ; }
	public final int NSApplicationActivatedEventType(){ return 1 ; }
	public final int NSApplicationActivationPolicyAccessory(){ return 1 ; }
	public final int NSApplicationActivationPolicyProhibited(){ return 2 ; }
	public final int NSApplicationActivationPolicyRegular(){ return 0 ; }
	public final int NSApplicationDeactivatedEventType(){ return 2 ; }
	public final int NSApplicationDefined(){ return 15 ; }
	public final int NSApplicationDefinedMask(){ return 32768 ; }
	public final int NSApplicationDelegateReplyCancel(){ return 1 ; }
	public final int NSApplicationDelegateReplyFailure(){ return 2 ; }
	public final int NSApplicationDelegateReplySuccess(){ return 0 ; }
	public final int NSApplicationPresentationAutoHideDock(){ return 1 ; }
	public final int NSApplicationPresentationAutoHideMenuBar(){ return 4 ; }
	public final int NSApplicationPresentationAutoHideToolbar(){ return 2048 ; }
	public final int NSApplicationPresentationDefault(){ return 0 ; }
	public final int NSApplicationPresentationDisableAppleMenu(){ return 16 ; }
	public final int NSApplicationPresentationDisableForceQuit(){ return 64 ; }
	public final int NSApplicationPresentationDisableHideApplication(){ return 256 ; }
	public final int NSApplicationPresentationDisableMenuBarTransparency(){ return 512 ; }
	public final int NSApplicationPresentationDisableProcessSwitching(){ return 32 ; }
	public final int NSApplicationPresentationDisableSessionTermination(){ return 128 ; }
	public final int NSApplicationPresentationFullScreen(){ return 1024 ; }
	public final int NSApplicationPresentationHideDock(){ return 2 ; }
	public final int NSApplicationPresentationHideMenuBar(){ return 8 ; }
	public final int NSAscendingPageOrder(){ return 1 ; }
	public final int NSAtBottom(){ return 5 ; }
	public final int NSAtTop(){ return 2 ; }
	public final int NSAttachmentCharacter(){ return 65532 ; }
	public final int NSAutoPagination(){ return 0 ; }
	public final int NSAutosaveAsOperation(){ return 5 ; }
	public final int NSAutosaveElsewhereOperation(){ return 3 ; }
	public final int NSAutosaveInPlaceOperation(){ return 4 ; }
	public final int NSAutosaveOperation(){ return 3 ; }
	public final int NSBMPFileType(){ return 1 ; }
	public final int NSBackTabCharacter(){ return 25 ; }
	public final int NSBackgroundStyleDark(){ return 1 ; }
	public final int NSBackgroundStyleLight(){ return 0 ; }
	public final int NSBackgroundStyleLowered(){ return 3 ; }
	public final int NSBackgroundStyleRaised(){ return 2 ; }
	public final int NSBackgroundTab(){ return 1 ; }
	public final int NSBackingStoreBuffered(){ return 2 ; }
	public final int NSBackingStoreNonretained(){ return 1 ; }
	public final int NSBackingStoreRetained(){ return 0 ; }
	public final int NSBackspaceCharacter(){ return 8 ; }
	public final int NSBacktabTextMovement(){ return 18 ; }
	public final int NSBeginFunctionKey(){ return 63274 ; }
	public final int NSBelowBottom(){ return 6 ; }
	public final int NSBelowTop(){ return 3 ; }
	public final int NSBevelLineJoinStyle(){ return 2 ; }
	public final int NSBezelBorder(){ return 2 ; }
	public final int NSBlueControlTint(){ return 1 ; }
	public final int NSBoldFontMask(){ return 2 ; }
	public final int NSBorderlessWindowMask(){ return 0 ; }
	public final int NSBottomTabsBezelBorder(){ return 2 ; }
	public final int NSBoxCustom(){ return 4 ; }
	public final int NSBoxOldStyle(){ return 3 ; }
	public final int NSBoxPrimary(){ return 0 ; }
	public final int NSBoxSecondary(){ return 1 ; }
	public final int NSBoxSeparator(){ return 2 ; }
	public final int NSBreakFunctionKey(){ return 63282 ; }
	public final int NSBrowserAutoColumnResizing(){ return 1 ; }
	public final int NSBrowserDropAbove(){ return 1 ; }
	public final int NSBrowserDropOn(){ return 0 ; }
	public final int NSBrowserNoColumnResizing(){ return 0 ; }
	public final int NSBrowserUserColumnResizing(){ return 2 ; }
	public final int NSButtLineCapStyle(){ return 0 ; }
	public final int NSCMYKColorSpaceModel(){ return 2 ; }
	public final int NSCMYKModeColorPanel(){ return 2 ; }
	public final int NSCancelButton(){ return 0 ; }
	public final int NSCancelTextMovement(){ return 23 ; }
	public final int NSCarriageReturnCharacter(){ return 13 ; }
	public final int NSCellAllowsMixedState(){ return 16 ; }
	public final int NSCellChangesContents(){ return 14 ; }
	public final int NSCellDisabled(){ return 0 ; }
	public final int NSCellEditable(){ return 3 ; }
	public final int NSCellHasImageHorizontal(){ return 12 ; }
	public final int NSCellHasImageOnLeftOrBottom(){ return 13 ; }
	public final int NSCellHasOverlappingImage(){ return 11 ; }
	public final int NSCellHighlighted(){ return 5 ; }
	public final int NSCellHitContentArea(){ return 1 ; }
	public final int NSCellHitEditableTextArea(){ return 2 ; }
	public final int NSCellHitNone(){ return 0 ; }
	public final int NSCellHitTrackableArea(){ return 4 ; }
	public final int NSCellIsBordered(){ return 10 ; }
	public final int NSCellIsInsetButton(){ return 15 ; }
	public final int NSCellLightsByBackground(){ return 9 ; }
	public final int NSCellLightsByContents(){ return 6 ; }
	public final int NSCellLightsByGray(){ return 7 ; }
	public final int NSCellState(){ return 1 ; }
	public final int NSCenterTabStopType(){ return 2 ; }
	public final int NSCenterTextAlignment(){ return 2 ; }
	public final int NSChangeAutosaved(){ return 4 ; }
	public final int NSChangeBackgroundCell(){ return 8 ; }
	public final int NSChangeBackgroundCellMask(){ return 8 ; }
	public final int NSChangeCleared(){ return 2 ; }
	public final int NSChangeDiscardable(){ return 256 ; }
	public final int NSChangeDone(){ return 0 ; }
	public final int NSChangeGrayCell(){ return 4 ; }
	public final int NSChangeGrayCellMask(){ return 4 ; }
	public final int NSChangeReadOtherContents(){ return 3 ; }
	public final int NSChangeRedone(){ return 5 ; }
	public final int NSChangeUndone(){ return 1 ; }
	public final int NSCircularBezelStyle(){ return 7 ; }
	public final int NSCircularSlider(){ return 1 ; }
	public final int NSClearControlTint(){ return 7 ; }
	public final int NSClearDisplayFunctionKey(){ return 63290 ; }
	public final int NSClearLineFunctionKey(){ return 63289 ; }
	public final int NSClipPagination(){ return 2 ; }
	public final int NSClockAndCalendarDatePickerStyle(){ return 1 ; }
	public final int NSClosableWindowMask(){ return 2 ; }
	public final int NSClosePathBezierPathElement(){ return 3 ; }
	public final int NSCollectionViewDropBefore(){ return 1 ; }
	public final int NSCollectionViewDropOn(){ return 0 ; }
	public final int NSColorListModeColorPanel(){ return 5 ; }
	public final int NSColorPanelAllModesMask(){ return 65535 ; }
	public final int NSColorPanelCMYKModeMask(){ return 4 ; }
	public final int NSColorPanelColorListModeMask(){ return 32 ; }
	public final int NSColorPanelCrayonModeMask(){ return 128 ; }
	public final int NSColorPanelCustomPaletteModeMask(){ return 16 ; }
	public final int NSColorPanelGrayModeMask(){ return 1 ; }
	public final int NSColorPanelHSBModeMask(){ return 8 ; }
	public final int NSColorPanelRGBModeMask(){ return 2 ; }
	public final int NSColorPanelWheelModeMask(){ return 64 ; }
	public final int NSColorRenderingIntentAbsoluteColorimetric(){ return 1 ; }
	public final int NSColorRenderingIntentDefault(){ return 0 ; }
	public final int NSColorRenderingIntentPerceptual(){ return 3 ; }
	public final int NSColorRenderingIntentRelativeColorimetric(){ return 2 ; }
	public final int NSColorRenderingIntentSaturation(){ return 4 ; }
	public final int NSCommandKeyMask(){ return 1048576 ; }
	public final int NSCompositeClear(){ return 0 ; }
	public final int NSCompositeCopy(){ return 1 ; }
	public final int NSCompositeDestinationAtop(){ return 9 ; }
	public final int NSCompositeDestinationIn(){ return 7 ; }
	public final int NSCompositeDestinationOut(){ return 8 ; }
	public final int NSCompositeDestinationOver(){ return 6 ; }
	public final int NSCompositeHighlight(){ return 12 ; }
	public final int NSCompositePlusDarker(){ return 11 ; }
	public final int NSCompositePlusLighter(){ return 13 ; }
	public final int NSCompositeSourceAtop(){ return 5 ; }
	public final int NSCompositeSourceIn(){ return 3 ; }
	public final int NSCompositeSourceOut(){ return 4 ; }
	public final int NSCompositeSourceOver(){ return 2 ; }
	public final int NSCompositeXOR(){ return 10 ; }
	public final int NSCompressedFontMask(){ return 512 ; }
	public final int NSCondensedFontMask(){ return 64 ; }
	public final int NSContentsCellMask(){ return 1 ; }
	public final int NSContinuousCapacityLevelIndicatorStyle(){ return 1 ; }
	public final int NSControlGlyph(){ return 16777215 ; }
	public final int NSControlKeyMask(){ return 262144 ; }
	public final int NSCorrectionIndicatorTypeDefault(){ return 0 ; }
	public final int NSCorrectionIndicatorTypeGuesses(){ return 2 ; }
	public final int NSCorrectionIndicatorTypeReversion(){ return 1 ; }
	public final int NSCorrectionResponseAccepted(){ return 1 ; }
	public final int NSCorrectionResponseEdited(){ return 4 ; }
	public final int NSCorrectionResponseIgnored(){ return 3 ; }
	public final int NSCorrectionResponseNone(){ return 0 ; }
	public final int NSCorrectionResponseRejected(){ return 2 ; }
	public final int NSCorrectionResponseReverted(){ return 5 ; }
	public final int NSCrayonModeColorPanel(){ return 7 ; }
	public final int NSCriticalAlertStyle(){ return 2 ; }
	public final int NSCriticalRequest(){ return 0 ; }
	public final int NSCursorPointingDevice(){ return 2 ; }
	public final int NSCursorUpdate(){ return 17 ; }
	public final int NSCursorUpdateMask(){ return 131072 ; }
	public final int NSCurveToBezierPathElement(){ return 2 ; }
	public final int NSCustomPaletteModeColorPanel(){ return 4 ; }
	public final int NSDecimalTabStopType(){ return 3 ; }
	public final int NSDefaultControlTint(){ return 0 ; }
	public final int NSDefaultTokenStyle(){ return 0 ; }
	public final int NSDeleteCharFunctionKey(){ return 63294 ; }
	public final int NSDeleteCharacter(){ return 127 ; }
	public final int NSDeleteFunctionKey(){ return 63272 ; }
	public final int NSDeleteLineFunctionKey(){ return 63292 ; }
	public final int NSDescendingPageOrder(){ return -1 ; }
	public final long NSDeviceIndependentModifierFlagsMask(){ return 4294901760l; }
	public final int NSDeviceNColorSpaceModel(){ return 4 ; }
	public final int NSDirectSelection(){ return 0 ; }
	public final int NSDisclosureBezelStyle(){ return 5 ; }
	public final int NSDiscreteCapacityLevelIndicatorStyle(){ return 2 ; }
	public final int NSDisplayWindowRunLoopOrdering(){ return 600000 ; }
	public final int NSDocModalWindowMask(){ return 64 ; }
	public final int NSDockWindowLevel(){ return 20 ; }
	public final int NSDoubleType(){ return 6 ; }
	public final int NSDownArrowFunctionKey(){ return 63233 ; }
	public final int NSDownTextMovement(){ return 22 ; }
	public final int NSDragOperationAll(){ return 15 ; }
	public final int NSDragOperationAll_Obsolete(){ return 15 ; }
	public final int NSDragOperationCopy(){ return 1 ; }
	public final int NSDragOperationDelete(){ return 32 ; }
	public final double NSDragOperationEvery(){ return (com.apple.jobjc.JObjCRuntime.IS64 ? 18446744073709551615d : 4294967295d); }
	public final int NSDragOperationGeneric(){ return 4 ; }
	public final int NSDragOperationLink(){ return 2 ; }
	public final int NSDragOperationMove(){ return 16 ; }
	public final int NSDragOperationNone(){ return 0 ; }
	public final int NSDragOperationPrivate(){ return 8 ; }
	public final int NSDraggingContextOutsideApplication(){ return 0 ; }
	public final int NSDraggingContextWithinApplication(){ return 1 ; }
	public final int NSDraggingFormationDefault(){ return 0 ; }
	public final int NSDraggingFormationList(){ return 3 ; }
	public final int NSDraggingFormationNone(){ return 1 ; }
	public final int NSDraggingFormationPile(){ return 2 ; }
	public final int NSDraggingFormationStack(){ return 4 ; }
	public final int NSDraggingItemEnumerationClearNonenumeratedImages(){ return 65536 ; }
	public final int NSDraggingItemEnumerationConcurrent(){ return 1 ; }
	public final int NSDrawerClosedState(){ return 0 ; }
	public final int NSDrawerClosingState(){ return 3 ; }
	public final int NSDrawerOpenState(){ return 2 ; }
	public final int NSDrawerOpeningState(){ return 1 ; }
	public final int NSEndFunctionKey(){ return 63275 ; }
	public final int NSEnterCharacter(){ return 3 ; }
	public final int NSEraDatePickerElementFlag(){ return 256 ; }
	public final int NSEraserPointingDevice(){ return 3 ; }
	public final int NSEvenOddWindingRule(){ return 1 ; }
	public final int NSEventGestureAxisHorizontal(){ return 1 ; }
	public final int NSEventGestureAxisNone(){ return 0 ; }
	public final int NSEventGestureAxisVertical(){ return 2 ; }
	public final int NSEventMaskBeginGesture(){ return 524288 ; }
	public final int NSEventMaskEndGesture(){ return 1048576 ; }
	public final int NSEventMaskGesture(){ return 536870912 ; }
	public final int NSEventMaskMagnify(){ return 1073741824 ; }
	public final int NSEventMaskRotate(){ return 262144 ; }
	public final long NSEventMaskSmartMagnify(){ return 4294967296l; }
	public final long NSEventMaskSwipe(){ return 2147483648l; }
	public final int NSEventPhaseBegan(){ return 1 ; }
	public final int NSEventPhaseCancelled(){ return 16 ; }
	public final int NSEventPhaseChanged(){ return 4 ; }
	public final int NSEventPhaseEnded(){ return 8 ; }
	public final int NSEventPhaseMayBegin(){ return 32 ; }
	public final int NSEventPhaseNone(){ return 0 ; }
	public final int NSEventPhaseStationary(){ return 2 ; }
	public final int NSEventSwipeTrackingClampGestureAmount(){ return 2 ; }
	public final int NSEventSwipeTrackingLockDirection(){ return 1 ; }
	public final int NSEventTypeBeginGesture(){ return 19 ; }
	public final int NSEventTypeEndGesture(){ return 20 ; }
	public final int NSEventTypeGesture(){ return 29 ; }
	public final int NSEventTypeMagnify(){ return 30 ; }
	public final int NSEventTypeQuickLook(){ return 33 ; }
	public final int NSEventTypeRotate(){ return 18 ; }
	public final int NSEventTypeSmartMagnify(){ return 32 ; }
	public final int NSEventTypeSwipe(){ return 31 ; }
	public final int NSExclude10_4ElementsIconCreationOption(){ return 4 ; }
	public final int NSExcludeQuickDrawElementsIconCreationOption(){ return 2 ; }
	public final int NSExecuteFunctionKey(){ return 63298 ; }
	public final int NSExpandedFontMask(){ return 32 ; }
	public final int NSF10FunctionKey(){ return 63245 ; }
	public final int NSF11FunctionKey(){ return 63246 ; }
	public final int NSF12FunctionKey(){ return 63247 ; }
	public final int NSF13FunctionKey(){ return 63248 ; }
	public final int NSF14FunctionKey(){ return 63249 ; }
	public final int NSF15FunctionKey(){ return 63250 ; }
	public final int NSF16FunctionKey(){ return 63251 ; }
	public final int NSF17FunctionKey(){ return 63252 ; }
	public final int NSF18FunctionKey(){ return 63253 ; }
	public final int NSF19FunctionKey(){ return 63254 ; }
	public final int NSF1FunctionKey(){ return 63236 ; }
	public final int NSF20FunctionKey(){ return 63255 ; }
	public final int NSF21FunctionKey(){ return 63256 ; }
	public final int NSF22FunctionKey(){ return 63257 ; }
	public final int NSF23FunctionKey(){ return 63258 ; }
	public final int NSF24FunctionKey(){ return 63259 ; }
	public final int NSF25FunctionKey(){ return 63260 ; }
	public final int NSF26FunctionKey(){ return 63261 ; }
	public final int NSF27FunctionKey(){ return 63262 ; }
	public final int NSF28FunctionKey(){ return 63263 ; }
	public final int NSF29FunctionKey(){ return 63264 ; }
	public final int NSF2FunctionKey(){ return 63237 ; }
	public final int NSF30FunctionKey(){ return 63265 ; }
	public final int NSF31FunctionKey(){ return 63266 ; }
	public final int NSF32FunctionKey(){ return 63267 ; }
	public final int NSF33FunctionKey(){ return 63268 ; }
	public final int NSF34FunctionKey(){ return 63269 ; }
	public final int NSF35FunctionKey(){ return 63270 ; }
	public final int NSF3FunctionKey(){ return 63238 ; }
	public final int NSF4FunctionKey(){ return 63239 ; }
	public final int NSF5FunctionKey(){ return 63240 ; }
	public final int NSF6FunctionKey(){ return 63241 ; }
	public final int NSF7FunctionKey(){ return 63242 ; }
	public final int NSF8FunctionKey(){ return 63243 ; }
	public final int NSF9FunctionKey(){ return 63244 ; }
	public final int NSFPCurrentField(){ return 134 ; }
	public final int NSFPPreviewButton(){ return 131 ; }
	public final int NSFPPreviewField(){ return 128 ; }
	public final int NSFPRevertButton(){ return 130 ; }
	public final int NSFPSetButton(){ return 132 ; }
	public final int NSFPSizeField(){ return 129 ; }
	public final int NSFPSizeTitle(){ return 133 ; }
	public final int NSFileHandlingPanelCancelButton(){ return 0 ; }
	public final int NSFileHandlingPanelOKButton(){ return 1 ; }
	public final int NSFindFunctionKey(){ return 63301 ; }
	public final int NSFindPanelActionNext(){ return 2 ; }
	public final int NSFindPanelActionPrevious(){ return 3 ; }
	public final int NSFindPanelActionReplace(){ return 5 ; }
	public final int NSFindPanelActionReplaceAll(){ return 4 ; }
	public final int NSFindPanelActionReplaceAllInSelection(){ return 8 ; }
	public final int NSFindPanelActionReplaceAndFind(){ return 6 ; }
	public final int NSFindPanelActionSelectAll(){ return 9 ; }
	public final int NSFindPanelActionSelectAllInSelection(){ return 10 ; }
	public final int NSFindPanelActionSetFindString(){ return 7 ; }
	public final int NSFindPanelActionShowFindPanel(){ return 1 ; }
	public final int NSFindPanelSubstringMatchTypeContains(){ return 0 ; }
	public final int NSFindPanelSubstringMatchTypeEndsWith(){ return 3 ; }
	public final int NSFindPanelSubstringMatchTypeFullWord(){ return 2 ; }
	public final int NSFindPanelSubstringMatchTypeStartsWith(){ return 1 ; }
	public final int NSFitPagination(){ return 1 ; }
	public final int NSFixedPitchFontMask(){ return 1024 ; }
	public final int NSFlagsChanged(){ return 12 ; }
	public final int NSFlagsChangedMask(){ return 4096 ; }
	public final int NSFloatType(){ return 3 ; }
	public final int NSFloatingPointSamplesBitmapFormat(){ return 4 ; }
	public final int NSFloatingWindowLevel(){ return 3 ; }
	public final int NSFocusRingAbove(){ return 2 ; }
	public final int NSFocusRingBelow(){ return 1 ; }
	public final int NSFocusRingOnly(){ return 0 ; }
	public final int NSFocusRingTypeDefault(){ return 0 ; }
	public final int NSFocusRingTypeExterior(){ return 2 ; }
	public final int NSFocusRingTypeNone(){ return 1 ; }
	public final int NSFontAntialiasedIntegerAdvancementsRenderingMode(){ return 3 ; }
	public final int NSFontAntialiasedRenderingMode(){ return 1 ; }
	public final int NSFontBoldTrait(){ return 2 ; }
	public final int NSFontClarendonSerifsClass(){ return 1073741824 ; }
	public final int NSFontCollectionApplicationOnlyMask(){ return 1 ; }
	public final int NSFontCollectionVisibilityComputer(){ return 4 ; }
	public final int NSFontCollectionVisibilityProcess(){ return 1 ; }
	public final int NSFontCollectionVisibilityUser(){ return 2 ; }
	public final int NSFontCondensedTrait(){ return 64 ; }
	public final int NSFontDefaultRenderingMode(){ return 0 ; }
	public final int NSFontExpandedTrait(){ return 32 ; }
	public final long NSFontFamilyClassMask(){ return 4026531840l; }
	public final int NSFontFreeformSerifsClass(){ return 1879048192 ; }
	public final int NSFontIntegerAdvancementsRenderingMode(){ return 2 ; }
	public final int NSFontItalicTrait(){ return 1 ; }
	public final int NSFontModernSerifsClass(){ return 805306368 ; }
	public final int NSFontMonoSpaceTrait(){ return 1024 ; }
	public final int NSFontOldStyleSerifsClass(){ return 268435456 ; }
	public final int NSFontOrnamentalsClass(){ return -1879048192 ; }
	public final int NSFontPanelAllEffectsModeMask(){ return 1048320 ; }
	public final long NSFontPanelAllModesMask(){ return 4294967295l; }
	public final int NSFontPanelCollectionModeMask(){ return 4 ; }
	public final int NSFontPanelDocumentColorEffectModeMask(){ return 2048 ; }
	public final int NSFontPanelFaceModeMask(){ return 1 ; }
	public final int NSFontPanelShadowEffectModeMask(){ return 4096 ; }
	public final int NSFontPanelSizeModeMask(){ return 2 ; }
	public final int NSFontPanelStandardModesMask(){ return 65535 ; }
	public final int NSFontPanelStrikethroughEffectModeMask(){ return 512 ; }
	public final int NSFontPanelTextColorEffectModeMask(){ return 1024 ; }
	public final int NSFontPanelUnderlineEffectModeMask(){ return 256 ; }
	public final int NSFontSansSerifClass(){ return -2147483648 ; }
	public final int NSFontScriptsClass(){ return -1610612736 ; }
	public final int NSFontSlabSerifsClass(){ return 1342177280 ; }
	public final int NSFontSymbolicClass(){ return -1073741824 ; }
	public final int NSFontTransitionalSerifsClass(){ return 536870912 ; }
	public final int NSFontUIOptimizedTrait(){ return 4096 ; }
	public final int NSFontUnknownClass(){ return 0 ; }
	public final int NSFontVerticalTrait(){ return 2048 ; }
	public final int NSFormFeedCharacter(){ return 12 ; }
	public final int NSFullScreenWindowMask(){ return 16384 ; }
	public final int NSFunctionKeyMask(){ return 8388608 ; }
	public final int NSGIFFileType(){ return 2 ; }
	public final int NSGlyphAttributeBidiLevel(){ return 2 ; }
	public final int NSGlyphAttributeElastic(){ return 1 ; }
	public final int NSGlyphAttributeInscribe(){ return 5 ; }
	public final int NSGlyphAttributeSoft(){ return 0 ; }
	public final int NSGlyphInscribeAbove(){ return 2 ; }
	public final int NSGlyphInscribeBase(){ return 0 ; }
	public final int NSGlyphInscribeBelow(){ return 1 ; }
	public final int NSGlyphInscribeOverBelow(){ return 4 ; }
	public final int NSGlyphInscribeOverstrike(){ return 3 ; }
	public final int NSGradientConcaveStrong(){ return 2 ; }
	public final int NSGradientConcaveWeak(){ return 1 ; }
	public final int NSGradientConvexStrong(){ return 4 ; }
	public final int NSGradientConvexWeak(){ return 3 ; }
	public final int NSGradientDrawsAfterEndingLocation(){ return 2 ; }
	public final int NSGradientDrawsBeforeStartingLocation(){ return 1 ; }
	public final int NSGradientNone(){ return 0 ; }
	public final int NSGraphiteControlTint(){ return 6 ; }
	public final int NSGrayColorSpaceModel(){ return 0 ; }
	public final int NSGrayModeColorPanel(){ return 0 ; }
	public final int NSGrooveBorder(){ return 3 ; }
	public final int NSHSBModeColorPanel(){ return 3 ; }
	public final int NSHUDWindowMask(){ return 8192 ; }
	public final int NSHeavierFontAction(){ return 5 ; }
	public final int NSHelpButtonBezelStyle(){ return 9 ; }
	public final int NSHelpFunctionKey(){ return 63302 ; }
	public final int NSHelpKeyMask(){ return 4194304 ; }
	public final int NSHighlightModeMatrix(){ return 1 ; }
	public final int NSHomeFunctionKey(){ return 63273 ; }
	public final int NSHorizontalRuler(){ return 0 ; }
	public final int NSHourMinuteDatePickerElementFlag(){ return 12 ; }
	public final int NSHourMinuteSecondDatePickerElementFlag(){ return 14 ; }
	public final int NSIdentityMappingCharacterCollection(){ return 0 ; }
	public final int NSIllegalTextMovement(){ return 0 ; }
	public final int NSImageAbove(){ return 5 ; }
	public final int NSImageAlignBottom(){ return 5 ; }
	public final int NSImageAlignBottomLeft(){ return 6 ; }
	public final int NSImageAlignBottomRight(){ return 7 ; }
	public final int NSImageAlignCenter(){ return 0 ; }
	public final int NSImageAlignLeft(){ return 4 ; }
	public final int NSImageAlignRight(){ return 8 ; }
	public final int NSImageAlignTop(){ return 1 ; }
	public final int NSImageAlignTopLeft(){ return 2 ; }
	public final int NSImageAlignTopRight(){ return 3 ; }
	public final int NSImageBelow(){ return 4 ; }
	public final int NSImageCacheAlways(){ return 1 ; }
	public final int NSImageCacheBySize(){ return 2 ; }
	public final int NSImageCacheDefault(){ return 0 ; }
	public final int NSImageCacheNever(){ return 3 ; }
	public final int NSImageCellType(){ return 2 ; }
	public final int NSImageFrameButton(){ return 4 ; }
	public final int NSImageFrameGrayBezel(){ return 2 ; }
	public final int NSImageFrameGroove(){ return 3 ; }
	public final int NSImageFrameNone(){ return 0 ; }
	public final int NSImageFramePhoto(){ return 1 ; }
	public final int NSImageInterpolationDefault(){ return 0 ; }
	public final int NSImageInterpolationHigh(){ return 3 ; }
	public final int NSImageInterpolationLow(){ return 2 ; }
	public final int NSImageInterpolationMedium(){ return 4 ; }
	public final int NSImageInterpolationNone(){ return 1 ; }
	public final int NSImageLeft(){ return 2 ; }
	public final int NSImageLoadStatusCancelled(){ return 1 ; }
	public final int NSImageLoadStatusCompleted(){ return 0 ; }
	public final int NSImageLoadStatusInvalidData(){ return 2 ; }
	public final int NSImageLoadStatusReadError(){ return 4 ; }
	public final int NSImageLoadStatusUnexpectedEOF(){ return 3 ; }
	public final int NSImageOnly(){ return 1 ; }
	public final int NSImageOverlaps(){ return 6 ; }
	public final int NSImageRepLoadStatusCompleted(){ return -6 ; }
	public final int NSImageRepLoadStatusInvalidData(){ return -4 ; }
	public final int NSImageRepLoadStatusReadingHeader(){ return -2 ; }
	public final int NSImageRepLoadStatusUnexpectedEOF(){ return -5 ; }
	public final int NSImageRepLoadStatusUnknownType(){ return -1 ; }
	public final int NSImageRepLoadStatusWillNeedAllData(){ return -3 ; }
	public final int NSImageRepMatchesDevice(){ return 0 ; }
	public final int NSImageRight(){ return 3 ; }
	public final int NSImageScaleAxesIndependently(){ return 1 ; }
	public final int NSImageScaleNone(){ return 2 ; }
	public final int NSImageScaleProportionallyDown(){ return 0 ; }
	public final int NSImageScaleProportionallyUpOrDown(){ return 3 ; }
	public final int NSIndexedColorSpaceModel(){ return 5 ; }
	public final int NSInformationalAlertStyle(){ return 1 ; }
	public final int NSInformationalRequest(){ return 10 ; }
	public final int NSInlineBezelStyle(){ return 15 ; }
	public final int NSInsertCharFunctionKey(){ return 63293 ; }
	public final int NSInsertFunctionKey(){ return 63271 ; }
	public final int NSInsertLineFunctionKey(){ return 63291 ; }
	public final int NSIntType(){ return 1 ; }
	public final int NSItalicFontMask(){ return 1 ; }
	public final int NSJPEG2000FileType(){ return 5 ; }
	public final int NSJPEGFileType(){ return 3 ; }
	public final int NSJustifiedTextAlignment(){ return 3 ; }
	public final int NSKeyDown(){ return 10 ; }
	public final int NSKeyDownMask(){ return 1024 ; }
	public final int NSKeyUp(){ return 11 ; }
	public final int NSKeyUpMask(){ return 2048 ; }
	public final int NSLABColorSpaceModel(){ return 3 ; }
	public final int NSLandscapeOrientation(){ return 1 ; }
	public final int NSLayoutAttributeBaseline(){ return 11 ; }
	public final int NSLayoutAttributeBottom(){ return 4 ; }
	public final int NSLayoutAttributeCenterX(){ return 9 ; }
	public final int NSLayoutAttributeCenterY(){ return 10 ; }
	public final int NSLayoutAttributeHeight(){ return 8 ; }
	public final int NSLayoutAttributeLeading(){ return 5 ; }
	public final int NSLayoutAttributeLeft(){ return 1 ; }
	public final int NSLayoutAttributeNotAnAttribute(){ return 0 ; }
	public final int NSLayoutAttributeRight(){ return 2 ; }
	public final int NSLayoutAttributeTop(){ return 3 ; }
	public final int NSLayoutAttributeTrailing(){ return 6 ; }
	public final int NSLayoutAttributeWidth(){ return 7 ; }
	public final int NSLayoutConstraintOrientationHorizontal(){ return 0 ; }
	public final int NSLayoutConstraintOrientationVertical(){ return 1 ; }
	public final int NSLayoutFormatAlignAllBaseline(){ return 2048 ; }
	public final int NSLayoutFormatAlignAllBottom(){ return 16 ; }
	public final int NSLayoutFormatAlignAllCenterX(){ return 512 ; }
	public final int NSLayoutFormatAlignAllCenterY(){ return 1024 ; }
	public final int NSLayoutFormatAlignAllLeading(){ return 32 ; }
	public final int NSLayoutFormatAlignAllLeft(){ return 2 ; }
	public final int NSLayoutFormatAlignAllRight(){ return 4 ; }
	public final int NSLayoutFormatAlignAllTop(){ return 8 ; }
	public final int NSLayoutFormatAlignAllTrailing(){ return 64 ; }
	public final int NSLayoutFormatAlignmentMask(){ return 65535 ; }
	public final int NSLayoutFormatDirectionLeadingToTrailing(){ return 0 ; }
	public final int NSLayoutFormatDirectionLeftToRight(){ return 65536 ; }
	public final int NSLayoutFormatDirectionMask(){ return 196608 ; }
	public final int NSLayoutFormatDirectionRightToLeft(){ return 131072 ; }
	public final int NSLayoutPriorityDefaultHigh(){ return 750 ; }
	public final int NSLayoutPriorityDefaultLow(){ return 250 ; }
	public final int NSLayoutPriorityDragThatCanResizeWindow(){ return 510 ; }
	public final int NSLayoutPriorityDragThatCannotResizeWindow(){ return 490 ; }
	public final int NSLayoutPriorityFittingSizeCompression(){ return 50 ; }
	public final int NSLayoutPriorityRequired(){ return 1000 ; }
	public final int NSLayoutPriorityWindowSizeStayPut(){ return 500 ; }
	public final int NSLayoutRelationEqual(){ return 0 ; }
	public final int NSLayoutRelationGreaterThanOrEqual(){ return 1 ; }
	public final int NSLayoutRelationLessThanOrEqual(){ return -1 ; }
	public final int NSLeftArrowFunctionKey(){ return 63234 ; }
	public final int NSLeftMouseDown(){ return 1 ; }
	public final int NSLeftMouseDownMask(){ return 2 ; }
	public final int NSLeftMouseDragged(){ return 6 ; }
	public final int NSLeftMouseDraggedMask(){ return 64 ; }
	public final int NSLeftMouseUp(){ return 2 ; }
	public final int NSLeftMouseUpMask(){ return 4 ; }
	public final int NSLeftTabStopType(){ return 0 ; }
	public final int NSLeftTabsBezelBorder(){ return 1 ; }
	public final int NSLeftTextAlignment(){ return 0 ; }
	public final int NSLeftTextMovement(){ return 19 ; }
	public final int NSLighterFontAction(){ return 6 ; }
	public final int NSLineBorder(){ return 1 ; }
	public final int NSLineBreakByCharWrapping(){ return 1 ; }
	public final int NSLineBreakByClipping(){ return 2 ; }
	public final int NSLineBreakByTruncatingHead(){ return 3 ; }
	public final int NSLineBreakByTruncatingMiddle(){ return 5 ; }
	public final int NSLineBreakByTruncatingTail(){ return 4 ; }
	public final int NSLineBreakByWordWrapping(){ return 0 ; }
	public final int NSLineDoesntMove(){ return 0 ; }
	public final int NSLineMovesDown(){ return 3 ; }
	public final int NSLineMovesLeft(){ return 1 ; }
	public final int NSLineMovesRight(){ return 2 ; }
	public final int NSLineMovesUp(){ return 4 ; }
	public final int NSLineSeparatorCharacter(){ return 8232 ; }
	public final int NSLineSweepDown(){ return 2 ; }
	public final int NSLineSweepLeft(){ return 0 ; }
	public final int NSLineSweepRight(){ return 1 ; }
	public final int NSLineSweepUp(){ return 3 ; }
	public final int NSLineToBezierPathElement(){ return 1 ; }
	public final int NSLinearSlider(){ return 0 ; }
	public final int NSListModeMatrix(){ return 2 ; }
	public final int NSMacintoshInterfaceStyle(){ return 3 ; }
	public final int NSMainMenuWindowLevel(){ return 24 ; }
	public final int NSMenuFunctionKey(){ return 63285 ; }
	public final int NSMenuPropertyItemAccessibilityDescription(){ return 32 ; }
	public final int NSMenuPropertyItemAttributedTitle(){ return 2 ; }
	public final int NSMenuPropertyItemEnabled(){ return 16 ; }
	public final int NSMenuPropertyItemImage(){ return 8 ; }
	public final int NSMenuPropertyItemKeyEquivalent(){ return 4 ; }
	public final int NSMenuPropertyItemTitle(){ return 1 ; }
	public final int NSMiniControlSize(){ return 2 ; }
	public final int NSMiniaturizableWindowMask(){ return 4 ; }
	public final int NSMiterLineJoinStyle(){ return 0 ; }
	public final int NSMixedState(){ return -1 ; }
	public final int NSModalPanelWindowLevel(){ return 8 ; }
	public final int NSModeSwitchFunctionKey(){ return 63303 ; }
	public final int NSMomentaryChangeButton(){ return 5 ; }
	public final int NSMomentaryLight(){ return 7 ; }
	public final int NSMomentaryLightButton(){ return 0 ; }
	public final int NSMomentaryPushButton(){ return 0 ; }
	public final int NSMomentaryPushInButton(){ return 7 ; }
	public final int NSMouseEntered(){ return 8 ; }
	public final int NSMouseEnteredMask(){ return 256 ; }
	public final int NSMouseEventSubtype(){ return 0 ; }
	public final int NSMouseExited(){ return 9 ; }
	public final int NSMouseExitedMask(){ return 512 ; }
	public final int NSMouseMoved(){ return 5 ; }
	public final int NSMouseMovedMask(){ return 32 ; }
	public final int NSMoveToBezierPathElement(){ return 0 ; }
	public final int NSNarrowFontMask(){ return 16 ; }
	public final int NSNativeShortGlyphPacking(){ return 5 ; }
	public final int NSNaturalTextAlignment(){ return 4 ; }
	public final int NSNewlineCharacter(){ return 10 ; }
	public final int NSNextFunctionKey(){ return 63296 ; }
	public final int NSNextStepInterfaceStyle(){ return 1 ; }
	public final int NSNoBorder(){ return 0 ; }
	public final int NSNoCellMask(){ return 0 ; }
	public final int NSNoFontChangeAction(){ return 0 ; }
	public final int NSNoImage(){ return 0 ; }
	public final int NSNoInterfaceStyle(){ return 0 ; }
	public final int NSNoModeColorPanel(){ return -1 ; }
	public final int NSNoScrollerParts(){ return 0 ; }
	public final int NSNoTabsBezelBorder(){ return 4 ; }
	public final int NSNoTabsLineBorder(){ return 5 ; }
	public final int NSNoTabsNoBorder(){ return 6 ; }
	public final int NSNoTitle(){ return 0 ; }
	public final int NSNoUnderlineStyle(){ return 0 ; }
	public final int NSNonStandardCharacterSetFontMask(){ return 8 ; }
	public final int NSNonZeroWindingRule(){ return 0 ; }
	public final int NSNonactivatingPanelMask(){ return 128 ; }
	public final int NSNormalWindowLevel(){ return 0 ; }
	public final int NSNullCellType(){ return 0 ; }
	public final int NSNullGlyph(){ return 0 ; }
	public final int NSNumericPadKeyMask(){ return 2097152 ; }
	public final int NSOKButton(){ return 1 ; }
	public final int NSOPENGL_CURRENT_VERSION(){ return 1 ; }
	public final int NSOffState(){ return 0 ; }
	public final int NSOnOffButton(){ return 6 ; }
	public final int NSOnState(){ return 1 ; }
	public final int NSOnlyScrollerArrows(){ return 1 ; }
	public final int NSOpenGLCPCurrentRendererID(){ return 309 ; }
	public final int NSOpenGLCPGPUFragmentProcessing(){ return 311 ; }
	public final int NSOpenGLCPGPUVertexProcessing(){ return 310 ; }
	public final int NSOpenGLCPHasDrawable(){ return 314 ; }
	public final int NSOpenGLCPMPSwapsInFlight(){ return 315 ; }
	public final int NSOpenGLCPRasterizationEnable(){ return 221 ; }
	public final int NSOpenGLCPReclaimResources(){ return 308 ; }
	public final int NSOpenGLCPStateValidation(){ return 301 ; }
	public final int NSOpenGLCPSurfaceBackingSize(){ return 304 ; }
	public final int NSOpenGLCPSurfaceOpacity(){ return 236 ; }
	public final int NSOpenGLCPSurfaceOrder(){ return 235 ; }
	public final int NSOpenGLCPSurfaceSurfaceVolatile(){ return 306 ; }
	public final int NSOpenGLCPSwapInterval(){ return 222 ; }
	public final int NSOpenGLCPSwapRectangle(){ return 200 ; }
	public final int NSOpenGLCPSwapRectangleEnable(){ return 201 ; }
	public final int NSOpenGLGOClearFormatCache(){ return 502 ; }
	public final int NSOpenGLGOFormatCacheSize(){ return 501 ; }
	public final int NSOpenGLGOResetLibrary(){ return 504 ; }
	public final int NSOpenGLGORetainRenderers(){ return 503 ; }
	public final int NSOpenGLGOUseBuildCache(){ return 506 ; }
	public final int NSOpenGLPFAAccelerated(){ return 73 ; }
	public final int NSOpenGLPFAAcceleratedCompute(){ return 97 ; }
	public final int NSOpenGLPFAAccumSize(){ return 14 ; }
	public final int NSOpenGLPFAAllRenderers(){ return 1 ; }
	public final int NSOpenGLPFAAllowOfflineRenderers(){ return 96 ; }
	public final int NSOpenGLPFAAlphaSize(){ return 11 ; }
	public final int NSOpenGLPFAAuxBuffers(){ return 7 ; }
	public final int NSOpenGLPFAAuxDepthStencil(){ return 57 ; }
	public final int NSOpenGLPFABackingStore(){ return 76 ; }
	public final int NSOpenGLPFAClosestPolicy(){ return 74 ; }
	public final int NSOpenGLPFAColorFloat(){ return 58 ; }
	public final int NSOpenGLPFAColorSize(){ return 8 ; }
	public final int NSOpenGLPFACompliant(){ return 83 ; }
	public final int NSOpenGLPFADepthSize(){ return 12 ; }
	public final int NSOpenGLPFADoubleBuffer(){ return 5 ; }
	public final int NSOpenGLPFAFullScreen(){ return 54 ; }
	public final int NSOpenGLPFAMPSafe(){ return 78 ; }
	public final int NSOpenGLPFAMaximumPolicy(){ return 52 ; }
	public final int NSOpenGLPFAMinimumPolicy(){ return 51 ; }
	public final int NSOpenGLPFAMultiScreen(){ return 81 ; }
	public final int NSOpenGLPFAMultisample(){ return 59 ; }
	public final int NSOpenGLPFANoRecovery(){ return 72 ; }
	public final int NSOpenGLPFAOffScreen(){ return 53 ; }
	public final int NSOpenGLPFAOpenGLProfile(){ return 99 ; }
	public final int NSOpenGLPFAPixelBuffer(){ return 90 ; }
	public final int NSOpenGLPFARemotePixelBuffer(){ return 91 ; }
	public final int NSOpenGLPFARendererID(){ return 70 ; }
	public final int NSOpenGLPFARobust(){ return 75 ; }
	public final int NSOpenGLPFASampleAlpha(){ return 61 ; }
	public final int NSOpenGLPFASampleBuffers(){ return 55 ; }
	public final int NSOpenGLPFASamples(){ return 56 ; }
	public final int NSOpenGLPFAScreenMask(){ return 84 ; }
	public final int NSOpenGLPFASingleRenderer(){ return 71 ; }
	public final int NSOpenGLPFAStencilSize(){ return 13 ; }
	public final int NSOpenGLPFAStereo(){ return 6 ; }
	public final int NSOpenGLPFASupersample(){ return 60 ; }
	public final int NSOpenGLPFATripleBuffer(){ return 3 ; }
	public final int NSOpenGLPFAVirtualScreenCount(){ return 128 ; }
	public final int NSOpenGLPFAWindow(){ return 80 ; }
	public final int NSOpenGLProfileVersion3_2Core(){ return 12800 ; }
	public final int NSOpenGLProfileVersionLegacy(){ return 4096 ; }
	public final int NSOtherMouseDown(){ return 25 ; }
	public final int NSOtherMouseDownMask(){ return 33554432 ; }
	public final int NSOtherMouseDragged(){ return 27 ; }
	public final int NSOtherMouseDraggedMask(){ return 134217728 ; }
	public final int NSOtherMouseUp(){ return 26 ; }
	public final int NSOtherMouseUpMask(){ return 67108864 ; }
	public final int NSOtherTextMovement(){ return 0 ; }
	public final int NSOutlineViewDropOnItemIndex(){ return -1 ; }
	public final int NSPNGFileType(){ return 4 ; }
	public final int NSPageControllerTransitionStyleHorizontalStrip(){ return 2 ; }
	public final int NSPageControllerTransitionStyleStackBook(){ return 1 ; }
	public final int NSPageControllerTransitionStyleStackHistory(){ return 0 ; }
	public final int NSPageDownFunctionKey(){ return 63277 ; }
	public final int NSPageUpFunctionKey(){ return 63276 ; }
	public final int NSParagraphSeparatorCharacter(){ return 8233 ; }
	public final int NSPasteboardReadingAsData(){ return 0 ; }
	public final int NSPasteboardReadingAsKeyedArchive(){ return 4 ; }
	public final int NSPasteboardReadingAsPropertyList(){ return 2 ; }
	public final int NSPasteboardReadingAsString(){ return 1 ; }
	public final int NSPasteboardWritingPromised(){ return 512 ; }
	public final int NSPathStyleNavigationBar(){ return 1 ; }
	public final int NSPathStylePopUp(){ return 2 ; }
	public final int NSPathStyleStandard(){ return 0 ; }
	public final int NSPatternColorSpaceModel(){ return 6 ; }
	public final int NSPauseFunctionKey(){ return 63280 ; }
	public final int NSPenLowerSideMask(){ return 2 ; }
	public final int NSPenPointingDevice(){ return 1 ; }
	public final int NSPenTipMask(){ return 1 ; }
	public final int NSPenUpperSideMask(){ return 4 ; }
	public final int NSPeriodic(){ return 16 ; }
	public final int NSPeriodicMask(){ return 65536 ; }
	public final int NSPlainTextTokenStyle(){ return 1 ; }
	public final int NSPopUpArrowAtBottom(){ return 2 ; }
	public final int NSPopUpArrowAtCenter(){ return 1 ; }
	public final int NSPopUpMenuWindowLevel(){ return 101 ; }
	public final int NSPopUpNoArrow(){ return 0 ; }
	public final int NSPopoverAppearanceHUD(){ return 1 ; }
	public final int NSPopoverAppearanceMinimal(){ return 0 ; }
	public final int NSPopoverBehaviorApplicationDefined(){ return 0 ; }
	public final int NSPopoverBehaviorSemitransient(){ return 2 ; }
	public final int NSPopoverBehaviorTransient(){ return 1 ; }
	public final int NSPortraitOrientation(){ return 0 ; }
	public final int NSPositiveDoubleType(){ return 7 ; }
	public final int NSPositiveFloatType(){ return 4 ; }
	public final int NSPositiveIntType(){ return 2 ; }
	public final int NSPosterFontMask(){ return 256 ; }
	public final int NSPowerOffEventType(){ return 1 ; }
	public final int NSPressedTab(){ return 2 ; }
	public final int NSPrevFunctionKey(){ return 63295 ; }
	public final int NSPrintFunctionKey(){ return 63288 ; }
	public final int NSPrintPanelShowsCopies(){ return 1 ; }
	public final int NSPrintPanelShowsOrientation(){ return 8 ; }
	public final int NSPrintPanelShowsPageRange(){ return 2 ; }
	public final int NSPrintPanelShowsPageSetupAccessory(){ return 256 ; }
	public final int NSPrintPanelShowsPaperSize(){ return 4 ; }
	public final int NSPrintPanelShowsPreview(){ return 131072 ; }
	public final int NSPrintPanelShowsPrintSelection(){ return 32 ; }
	public final int NSPrintPanelShowsScaling(){ return 16 ; }
	public final int NSPrintRenderingQualityBest(){ return 0 ; }
	public final int NSPrintRenderingQualityResponsive(){ return 1 ; }
	public final int NSPrintScreenFunctionKey(){ return 63278 ; }
	public final int NSPrinterTableError(){ return 2 ; }
	public final int NSPrinterTableNotFound(){ return 1 ; }
	public final int NSPrinterTableOK(){ return 0 ; }
	public final int NSPrintingCancelled(){ return 0 ; }
	public final int NSPrintingFailure(){ return 3 ; }
	public final int NSPrintingReplyLater(){ return 2 ; }
	public final int NSPrintingSuccess(){ return 1 ; }
	public final int NSProgressIndicatorBarStyle(){ return 0 ; }
	public final int NSProgressIndicatorPreferredAquaThickness(){ return 12 ; }
	public final int NSProgressIndicatorPreferredLargeThickness(){ return 18 ; }
	public final int NSProgressIndicatorPreferredSmallThickness(){ return 10 ; }
	public final int NSProgressIndicatorPreferredThickness(){ return 14 ; }
	public final int NSProgressIndicatorSpinningStyle(){ return 1 ; }
	public final int NSPushInCell(){ return 2 ; }
	public final int NSPushInCellMask(){ return 2 ; }
	public final int NSPushOnPushOffButton(){ return 1 ; }
	public final int NSRGBColorSpaceModel(){ return 1 ; }
	public final int NSRGBModeColorPanel(){ return 1 ; }
	public final int NSRadioButton(){ return 4 ; }
	public final int NSRadioModeMatrix(){ return 0 ; }
	public final int NSRangeDateMode(){ return 1 ; }
	public final int NSRatingLevelIndicatorStyle(){ return 3 ; }
	public final int NSRecessedBezelStyle(){ return 13 ; }
	public final int NSRedoFunctionKey(){ return 63300 ; }
	public final int NSRegularControlSize(){ return 0 ; }
	public final int NSRegularSquareBezelStyle(){ return 2 ; }
	public final int NSRelevancyLevelIndicatorStyle(){ return 0 ; }
	public final int NSRemoteNotificationTypeAlert(){ return 4 ; }
	public final int NSRemoteNotificationTypeBadge(){ return 1 ; }
	public final int NSRemoteNotificationTypeNone(){ return 0 ; }
	public final int NSRemoteNotificationTypeSound(){ return 2 ; }
	public final int NSRemoveTraitFontAction(){ return 7 ; }
	public final int NSResetCursorRectsRunLoopOrdering(){ return 700000 ; }
	public final int NSResetFunctionKey(){ return 63283 ; }
	public final int NSResizableWindowMask(){ return 8 ; }
	public final int NSReturnTextMovement(){ return 16 ; }
	public final int NSRightArrowFunctionKey(){ return 63235 ; }
	public final int NSRightMouseDown(){ return 3 ; }
	public final int NSRightMouseDownMask(){ return 8 ; }
	public final int NSRightMouseDragged(){ return 7 ; }
	public final int NSRightMouseDraggedMask(){ return 128 ; }
	public final int NSRightMouseUp(){ return 4 ; }
	public final int NSRightMouseUpMask(){ return 16 ; }
	public final int NSRightTabStopType(){ return 1 ; }
	public final int NSRightTabsBezelBorder(){ return 3 ; }
	public final int NSRightTextAlignment(){ return 1 ; }
	public final int NSRightTextMovement(){ return 20 ; }
	public final int NSRoundLineCapStyle(){ return 1 ; }
	public final int NSRoundLineJoinStyle(){ return 1 ; }
	public final int NSRoundRectBezelStyle(){ return 12 ; }
	public final int NSRoundedBezelStyle(){ return 1 ; }
	public final int NSRoundedDisclosureBezelStyle(){ return 14 ; }
	public final int NSRoundedTokenStyle(){ return 2 ; }
	public final int NSRuleEditorNestingModeCompound(){ return 2 ; }
	public final int NSRuleEditorNestingModeList(){ return 1 ; }
	public final int NSRuleEditorNestingModeSimple(){ return 3 ; }
	public final int NSRuleEditorNestingModeSingle(){ return 0 ; }
	public final int NSRuleEditorRowTypeCompound(){ return 1 ; }
	public final int NSRuleEditorRowTypeSimple(){ return 0 ; }
	public final int NSRunAbortedResponse(){ return -1001 ; }
	public final int NSRunContinuesResponse(){ return -1002 ; }
	public final int NSRunStoppedResponse(){ return -1000 ; }
	public final int NSSaveAsOperation(){ return 1 ; }
	public final int NSSaveOperation(){ return 0 ; }
	public final int NSSaveToOperation(){ return 2 ; }
	public final int NSScaleNone(){ return 2 ; }
	public final int NSScaleProportionally(){ return 0 ; }
	public final int NSScaleToFit(){ return 1 ; }
	public final int NSScreenChangedEventType(){ return 8 ; }
	public final int NSScreenSaverWindowLevel(){ return 1000 ; }
	public final int NSScrollElasticityAllowed(){ return 2 ; }
	public final int NSScrollElasticityAutomatic(){ return 0 ; }
	public final int NSScrollElasticityNone(){ return 1 ; }
	public final int NSScrollLockFunctionKey(){ return 63279 ; }
	public final int NSScrollViewFindBarPositionAboveContent(){ return 1 ; }
	public final int NSScrollViewFindBarPositionAboveHorizontalRuler(){ return 0 ; }
	public final int NSScrollViewFindBarPositionBelowContent(){ return 2 ; }
	public final int NSScrollWheel(){ return 22 ; }
	public final int NSScrollWheelMask(){ return 4194304 ; }
	public final int NSScrollerArrowsDefaultSetting(){ return 0 ; }
	public final int NSScrollerArrowsMaxEnd(){ return 0 ; }
	public final int NSScrollerArrowsMinEnd(){ return 1 ; }
	public final int NSScrollerArrowsNone(){ return 2 ; }
	public final int NSScrollerDecrementArrow(){ return 1 ; }
	public final int NSScrollerDecrementLine(){ return 4 ; }
	public final int NSScrollerDecrementPage(){ return 1 ; }
	public final int NSScrollerIncrementArrow(){ return 0 ; }
	public final int NSScrollerIncrementLine(){ return 5 ; }
	public final int NSScrollerIncrementPage(){ return 3 ; }
	public final int NSScrollerKnob(){ return 2 ; }
	public final int NSScrollerKnobSlot(){ return 6 ; }
	public final int NSScrollerKnobStyleDark(){ return 1 ; }
	public final int NSScrollerKnobStyleDefault(){ return 0 ; }
	public final int NSScrollerKnobStyleLight(){ return 2 ; }
	public final int NSScrollerNoPart(){ return 0 ; }
	public final int NSScrollerStyleLegacy(){ return 0 ; }
	public final int NSScrollerStyleOverlay(){ return 1 ; }
	public final int NSSearchFieldClearRecentsMenuItemTag(){ return 1002 ; }
	public final int NSSearchFieldNoRecentsMenuItemTag(){ return 1003 ; }
	public final int NSSearchFieldRecentsMenuItemTag(){ return 1001 ; }
	public final int NSSearchFieldRecentsTitleMenuItemTag(){ return 1000 ; }
	public final int NSSegmentStyleAutomatic(){ return 0 ; }
	public final int NSSegmentStyleCapsule(){ return 5 ; }
	public final int NSSegmentStyleRoundRect(){ return 3 ; }
	public final int NSSegmentStyleRounded(){ return 1 ; }
	public final int NSSegmentStyleSmallSquare(){ return 6 ; }
	public final int NSSegmentStyleTexturedRounded(){ return 2 ; }
	public final int NSSegmentStyleTexturedSquare(){ return 4 ; }
	public final int NSSegmentSwitchTrackingMomentary(){ return 2 ; }
	public final int NSSegmentSwitchTrackingSelectAny(){ return 1 ; }
	public final int NSSegmentSwitchTrackingSelectOne(){ return 0 ; }
	public final int NSSelectByCharacter(){ return 0 ; }
	public final int NSSelectByParagraph(){ return 2 ; }
	public final int NSSelectByWord(){ return 1 ; }
	public final int NSSelectFunctionKey(){ return 63297 ; }
	public final int NSSelectedTab(){ return 0 ; }
	public final int NSSelectingNext(){ return 1 ; }
	public final int NSSelectingPrevious(){ return 2 ; }
	public final int NSSelectionAffinityDownstream(){ return 1 ; }
	public final int NSSelectionAffinityUpstream(){ return 0 ; }
	public final int NSServiceApplicationLaunchFailedError(){ return 66561 ; }
	public final int NSServiceApplicationNotFoundError(){ return 66560 ; }
	public final int NSServiceErrorMaximum(){ return 66817 ; }
	public final int NSServiceErrorMinimum(){ return 66560 ; }
	public final int NSServiceInvalidPasteboardDataError(){ return 66563 ; }
	public final int NSServiceMalformedServiceDictionaryError(){ return 66564 ; }
	public final int NSServiceMiscellaneousError(){ return 66800 ; }
	public final int NSServiceRequestTimedOutError(){ return 66562 ; }
	public final int NSShadowlessSquareBezelStyle(){ return 6 ; }
	public final int NSSharingContentScopeFull(){ return 2 ; }
	public final int NSSharingContentScopeItem(){ return 0 ; }
	public final int NSSharingContentScopePartial(){ return 1 ; }
	public final int NSShiftKeyMask(){ return 131072 ; }
	public final int NSShowControlGlyphs(){ return 1 ; }
	public final int NSShowInvisibleGlyphs(){ return 2 ; }
	public final int NSSingleDateMode(){ return 0 ; }
	public final int NSSingleUnderlineStyle(){ return 1 ; }
	public final int NSSizeDownFontAction(){ return 4 ; }
	public final int NSSizeUpFontAction(){ return 3 ; }
	public final int NSSmallCapsFontMask(){ return 128 ; }
	public final int NSSmallControlSize(){ return 1 ; }
	public final int NSSmallIconButtonBezelStyle(){ return 2 ; }
	public final int NSSmallSquareBezelStyle(){ return 10 ; }
	public final int NSSpecialPageOrder(){ return 0 ; }
	public final int NSSpeechImmediateBoundary(){ return 0 ; }
	public final int NSSpeechSentenceBoundary(){ return 2 ; }
	public final int NSSpeechWordBoundary(){ return 1 ; }
	public final int NSSpellingStateGrammarFlag(){ return 2 ; }
	public final int NSSpellingStateSpellingFlag(){ return 1 ; }
	public final int NSSplitViewDividerStylePaneSplitter(){ return 3 ; }
	public final int NSSplitViewDividerStyleThick(){ return 1 ; }
	public final int NSSplitViewDividerStyleThin(){ return 2 ; }
	public final int NSSquareLineCapStyle(){ return 2 ; }
	public final int NSSquareStatusItemLength(){ return -2 ; }
	public final int NSStatusWindowLevel(){ return 25 ; }
	public final int NSStopFunctionKey(){ return 63284 ; }
	public final int NSStringDrawingDisableScreenFontSubstitution(){ return 4 ; }
	public final int NSStringDrawingOneShot(){ return 16 ; }
	public final int NSStringDrawingTruncatesLastVisibleLine(){ return 32 ; }
	public final int NSStringDrawingUsesDeviceMetrics(){ return 8 ; }
	public final int NSStringDrawingUsesFontLeading(){ return 2 ; }
	public final int NSStringDrawingUsesLineFragmentOrigin(){ return 1 ; }
	public final int NSSubmenuWindowLevel(){ return 3 ; }
	public final int NSSwitchButton(){ return 3 ; }
	public final int NSSysReqFunctionKey(){ return 63281 ; }
	public final int NSSystemDefined(){ return 14 ; }
	public final int NSSystemDefinedMask(){ return 16384 ; }
	public final int NSSystemFunctionKey(){ return 63287 ; }
	public final int NSTIFFCompressionCCITTFAX3(){ return 3 ; }
	public final int NSTIFFCompressionCCITTFAX4(){ return 4 ; }
	public final int NSTIFFCompressionJPEG(){ return 6 ; }
	public final int NSTIFFCompressionLZW(){ return 5 ; }
	public final int NSTIFFCompressionNEXT(){ return 32766 ; }
	public final int NSTIFFCompressionNone(){ return 1 ; }
	public final int NSTIFFCompressionOldJPEG(){ return 32865 ; }
	public final int NSTIFFCompressionPackBits(){ return 32773 ; }
	public final int NSTIFFFileType(){ return 0 ; }
	public final int NSTabCharacter(){ return 9 ; }
	public final int NSTabTextMovement(){ return 17 ; }
	public final int NSTableColumnAutoresizingMask(){ return 1 ; }
	public final int NSTableColumnNoResizing(){ return 0 ; }
	public final int NSTableColumnUserResizingMask(){ return 2 ; }
	public final int NSTableViewAnimationEffectFade(){ return 1 ; }
	public final int NSTableViewAnimationEffectGap(){ return 2 ; }
	public final int NSTableViewAnimationEffectNone(){ return 0 ; }
	public final int NSTableViewAnimationSlideDown(){ return 32 ; }
	public final int NSTableViewAnimationSlideLeft(){ return 48 ; }
	public final int NSTableViewAnimationSlideRight(){ return 64 ; }
	public final int NSTableViewAnimationSlideUp(){ return 16 ; }
	public final int NSTableViewDashedHorizontalGridLineMask(){ return 8 ; }
	public final int NSTableViewDraggingDestinationFeedbackStyleNone(){ return -1 ; }
	public final int NSTableViewDraggingDestinationFeedbackStyleRegular(){ return 0 ; }
	public final int NSTableViewDraggingDestinationFeedbackStyleSourceList(){ return 1 ; }
	public final int NSTableViewDropAbove(){ return 1 ; }
	public final int NSTableViewDropOn(){ return 0 ; }
	public final int NSTableViewFirstColumnOnlyAutoresizingStyle(){ return 5 ; }
	public final int NSTableViewGridNone(){ return 0 ; }
	public final int NSTableViewLastColumnOnlyAutoresizingStyle(){ return 4 ; }
	public final int NSTableViewNoColumnAutoresizing(){ return 0 ; }
	public final int NSTableViewReverseSequentialColumnAutoresizingStyle(){ return 3 ; }
	public final int NSTableViewRowSizeStyleCustom(){ return 0 ; }
	public final int NSTableViewRowSizeStyleDefault(){ return -1 ; }
	public final int NSTableViewRowSizeStyleLarge(){ return 3 ; }
	public final int NSTableViewRowSizeStyleMedium(){ return 2 ; }
	public final int NSTableViewRowSizeStyleSmall(){ return 1 ; }
	public final int NSTableViewSelectionHighlightStyleNone(){ return -1 ; }
	public final int NSTableViewSelectionHighlightStyleRegular(){ return 0 ; }
	public final int NSTableViewSelectionHighlightStyleSourceList(){ return 1 ; }
	public final int NSTableViewSequentialColumnAutoresizingStyle(){ return 2 ; }
	public final int NSTableViewSolidHorizontalGridLineMask(){ return 2 ; }
	public final int NSTableViewSolidVerticalGridLineMask(){ return 1 ; }
	public final int NSTableViewUniformColumnAutoresizingStyle(){ return 1 ; }
	public final int NSTabletPoint(){ return 23 ; }
	public final int NSTabletPointEventSubtype(){ return 1 ; }
	public final int NSTabletPointMask(){ return 8388608 ; }
	public final int NSTabletProximity(){ return 24 ; }
	public final int NSTabletProximityEventSubtype(){ return 2 ; }
	public final int NSTabletProximityMask(){ return 16777216 ; }
	public final int NSTerminateCancel(){ return 0 ; }
	public final int NSTerminateLater(){ return 2 ; }
	public final int NSTerminateNow(){ return 1 ; }
	public final int NSTextBlockAbsoluteValueType(){ return 0 ; }
	public final int NSTextBlockBaselineAlignment(){ return 3 ; }
	public final int NSTextBlockBorder(){ return 0 ; }
	public final int NSTextBlockBottomAlignment(){ return 2 ; }
	public final int NSTextBlockHeight(){ return 4 ; }
	public final int NSTextBlockMargin(){ return 1 ; }
	public final int NSTextBlockMaximumHeight(){ return 6 ; }
	public final int NSTextBlockMaximumWidth(){ return 2 ; }
	public final int NSTextBlockMiddleAlignment(){ return 1 ; }
	public final int NSTextBlockMinimumHeight(){ return 5 ; }
	public final int NSTextBlockMinimumWidth(){ return 1 ; }
	public final int NSTextBlockPadding(){ return -1 ; }
	public final int NSTextBlockPercentageValueType(){ return 1 ; }
	public final int NSTextBlockTopAlignment(){ return 0 ; }
	public final int NSTextBlockWidth(){ return 0 ; }
	public final int NSTextCellType(){ return 1 ; }
	public final int NSTextFieldAndStepperDatePickerStyle(){ return 0 ; }
	public final int NSTextFieldDatePickerStyle(){ return 2 ; }
	public final int NSTextFieldRoundedBezel(){ return 1 ; }
	public final int NSTextFieldSquareBezel(){ return 0 ; }
	public final int NSTextFinderActionHideFindInterface(){ return 11 ; }
	public final int NSTextFinderActionHideReplaceInterface(){ return 13 ; }
	public final int NSTextFinderActionNextMatch(){ return 2 ; }
	public final int NSTextFinderActionPreviousMatch(){ return 3 ; }
	public final int NSTextFinderActionReplace(){ return 5 ; }
	public final int NSTextFinderActionReplaceAll(){ return 4 ; }
	public final int NSTextFinderActionReplaceAllInSelection(){ return 8 ; }
	public final int NSTextFinderActionReplaceAndFind(){ return 6 ; }
	public final int NSTextFinderActionSelectAll(){ return 9 ; }
	public final int NSTextFinderActionSelectAllInSelection(){ return 10 ; }
	public final int NSTextFinderActionSetSearchString(){ return 7 ; }
	public final int NSTextFinderActionShowFindInterface(){ return 1 ; }
	public final int NSTextFinderActionShowReplaceInterface(){ return 12 ; }
	public final int NSTextFinderMatchingTypeContains(){ return 0 ; }
	public final int NSTextFinderMatchingTypeEndsWith(){ return 3 ; }
	public final int NSTextFinderMatchingTypeFullWord(){ return 2 ; }
	public final int NSTextFinderMatchingTypeStartsWith(){ return 1 ; }
	public final int NSTextLayoutOrientationHorizontal(){ return 0 ; }
	public final int NSTextLayoutOrientationVertical(){ return 1 ; }
	public final int NSTextListPrependEnclosingMarker(){ return 1 ; }
	public final int NSTextReadInapplicableDocumentTypeError(){ return 65806 ; }
	public final int NSTextReadWriteErrorMaximum(){ return 66303 ; }
	public final int NSTextReadWriteErrorMinimum(){ return 65792 ; }
	public final int NSTextStorageEditedAttributes(){ return 1 ; }
	public final int NSTextStorageEditedCharacters(){ return 2 ; }
	public final int NSTextTableAutomaticLayoutAlgorithm(){ return 0 ; }
	public final int NSTextTableFixedLayoutAlgorithm(){ return 1 ; }
	public final int NSTextWriteInapplicableDocumentTypeError(){ return 66062 ; }
	public final int NSTextWritingDirectionEmbedding(){ return 0 ; }
	public final int NSTextWritingDirectionOverride(){ return 2 ; }
	public final int NSTexturedBackgroundWindowMask(){ return 256 ; }
	public final int NSTexturedRoundedBezelStyle(){ return 11 ; }
	public final int NSTexturedSquareBezelStyle(){ return 8 ; }
	public final int NSThickSquareBezelStyle(){ return 3 ; }
	public final int NSThickerSquareBezelStyle(){ return 4 ; }
	public final int NSTickMarkAbove(){ return 1 ; }
	public final int NSTickMarkBelow(){ return 0 ; }
	public final int NSTickMarkLeft(){ return 1 ; }
	public final int NSTickMarkRight(){ return 0 ; }
	public final int NSTimeZoneDatePickerElementFlag(){ return 16 ; }
	public final int NSTitledWindowMask(){ return 1 ; }
	public final int NSToggleButton(){ return 2 ; }
	public final int NSToolbarDisplayModeDefault(){ return 0 ; }
	public final int NSToolbarDisplayModeIconAndLabel(){ return 1 ; }
	public final int NSToolbarDisplayModeIconOnly(){ return 2 ; }
	public final int NSToolbarDisplayModeLabelOnly(){ return 3 ; }
	public final int NSToolbarItemVisibilityPriorityHigh(){ return 1000 ; }
	public final int NSToolbarItemVisibilityPriorityLow(){ return -1000 ; }
	public final int NSToolbarItemVisibilityPriorityStandard(){ return 0 ; }
	public final int NSToolbarItemVisibilityPriorityUser(){ return 2000 ; }
	public final int NSToolbarSizeModeDefault(){ return 0 ; }
	public final int NSToolbarSizeModeRegular(){ return 1 ; }
	public final int NSToolbarSizeModeSmall(){ return 2 ; }
	public final int NSTopTabsBezelBorder(){ return 0 ; }
	public final int NSTornOffMenuWindowLevel(){ return 3 ; }
	public final int NSTouchEventSubtype(){ return 3 ; }
	public final double NSTouchPhaseAny(){ return (com.apple.jobjc.JObjCRuntime.IS64 ? 18446744073709551615d : 4294967295d); }
	public final int NSTouchPhaseBegan(){ return 1 ; }
	public final int NSTouchPhaseCancelled(){ return 16 ; }
	public final int NSTouchPhaseEnded(){ return 8 ; }
	public final int NSTouchPhaseMoved(){ return 2 ; }
	public final int NSTouchPhaseStationary(){ return 4 ; }
	public final int NSTouchPhaseTouching(){ return 7 ; }
	public final int NSTrackModeMatrix(){ return 3 ; }
	public final int NSTrackingActiveAlways(){ return 128 ; }
	public final int NSTrackingActiveInActiveApp(){ return 64 ; }
	public final int NSTrackingActiveInKeyWindow(){ return 32 ; }
	public final int NSTrackingActiveWhenFirstResponder(){ return 16 ; }
	public final int NSTrackingAssumeInside(){ return 256 ; }
	public final int NSTrackingCursorUpdate(){ return 4 ; }
	public final int NSTrackingEnabledDuringMouseDrag(){ return 1024 ; }
	public final int NSTrackingInVisibleRect(){ return 512 ; }
	public final int NSTrackingMouseEnteredAndExited(){ return 1 ; }
	public final int NSTrackingMouseMoved(){ return 2 ; }
	public final int NSTypesetterBehavior_10_2(){ return 2 ; }
	public final int NSTypesetterBehavior_10_2_WithCompatibility(){ return 1 ; }
	public final int NSTypesetterBehavior_10_3(){ return 3 ; }
	public final int NSTypesetterBehavior_10_4(){ return 4 ; }
	public final int NSTypesetterContainerBreakAction(){ return 32 ; }
	public final int NSTypesetterHorizontalTabAction(){ return 4 ; }
	public final int NSTypesetterLatestBehavior(){ return -1 ; }
	public final int NSTypesetterLineBreakAction(){ return 8 ; }
	public final int NSTypesetterOriginalBehavior(){ return 0 ; }
	public final int NSTypesetterParagraphBreakAction(){ return 16 ; }
	public final int NSTypesetterWhitespaceAction(){ return 2 ; }
	public final int NSTypesetterZeroAdvancementAction(){ return 1 ; }
	public final int NSUnboldFontMask(){ return 4 ; }
	public final int NSUnderlinePatternDash(){ return 512 ; }
	public final int NSUnderlinePatternDashDot(){ return 768 ; }
	public final int NSUnderlinePatternDashDotDot(){ return 1024 ; }
	public final int NSUnderlinePatternDot(){ return 256 ; }
	public final int NSUnderlinePatternSolid(){ return 0 ; }
	public final int NSUnderlineStyleDouble(){ return 9 ; }
	public final int NSUnderlineStyleNone(){ return 0 ; }
	public final int NSUnderlineStyleSingle(){ return 1 ; }
	public final int NSUnderlineStyleThick(){ return 2 ; }
	public final int NSUndoFunctionKey(){ return 63299 ; }
	public final int NSUnifiedTitleAndToolbarWindowMask(){ return 4096 ; }
	public final int NSUnitalicFontMask(){ return 16777216 ; }
	public final int NSUnknownColorSpaceModel(){ return -1 ; }
	public final int NSUnknownPageOrder(){ return 2 ; }
	public final int NSUnknownPointingDevice(){ return 0 ; }
	public final int NSUnscaledWindowMask(){ return 2048 ; }
	public final int NSUpArrowFunctionKey(){ return 63232 ; }
	public final int NSUpTextMovement(){ return 21 ; }
	public final int NSUpdateWindowsRunLoopOrdering(){ return 500000 ; }
	public final int NSUserFunctionKey(){ return 63286 ; }
	public final int NSUserInterfaceLayoutDirectionLeftToRight(){ return 0 ; }
	public final int NSUserInterfaceLayoutDirectionRightToLeft(){ return 1 ; }
	public final int NSUtilityWindowMask(){ return 16 ; }
	public final int NSVariableStatusItemLength(){ return -1 ; }
	public final int NSVerticalRuler(){ return 1 ; }
	public final int NSViaPanelFontAction(){ return 1 ; }
	public final int NSViewHeightSizable(){ return 16 ; }
	public final int NSViewLayerContentsPlacementBottom(){ return 8 ; }
	public final int NSViewLayerContentsPlacementBottomLeft(){ return 9 ; }
	public final int NSViewLayerContentsPlacementBottomRight(){ return 7 ; }
	public final int NSViewLayerContentsPlacementCenter(){ return 3 ; }
	public final int NSViewLayerContentsPlacementLeft(){ return 10 ; }
	public final int NSViewLayerContentsPlacementRight(){ return 6 ; }
	public final int NSViewLayerContentsPlacementScaleAxesIndependently(){ return 0 ; }
	public final int NSViewLayerContentsPlacementScaleProportionallyToFill(){ return 2 ; }
	public final int NSViewLayerContentsPlacementScaleProportionallyToFit(){ return 1 ; }
	public final int NSViewLayerContentsPlacementTop(){ return 4 ; }
	public final int NSViewLayerContentsPlacementTopLeft(){ return 11 ; }
	public final int NSViewLayerContentsPlacementTopRight(){ return 5 ; }
	public final int NSViewLayerContentsRedrawBeforeViewResize(){ return 3 ; }
	public final int NSViewLayerContentsRedrawDuringViewResize(){ return 2 ; }
	public final int NSViewLayerContentsRedrawNever(){ return 0 ; }
	public final int NSViewLayerContentsRedrawOnSetNeedsDisplay(){ return 1 ; }
	public final int NSViewMaxXMargin(){ return 4 ; }
	public final int NSViewMaxYMargin(){ return 32 ; }
	public final int NSViewMinXMargin(){ return 1 ; }
	public final int NSViewMinYMargin(){ return 8 ; }
	public final int NSViewNotSizable(){ return 0 ; }
	public final int NSViewWidthSizable(){ return 2 ; }
	public final int NSWantsBidiLevels(){ return 4 ; }
	public final int NSWarningAlertStyle(){ return 0 ; }
	public final int NSWheelModeColorPanel(){ return 6 ; }
	public final int NSWindowAbove(){ return 1 ; }
	public final int NSWindowAnimationBehaviorAlertPanel(){ return 5 ; }
	public final int NSWindowAnimationBehaviorDefault(){ return 0 ; }
	public final int NSWindowAnimationBehaviorDocumentWindow(){ return 3 ; }
	public final int NSWindowAnimationBehaviorNone(){ return 2 ; }
	public final int NSWindowAnimationBehaviorUtilityWindow(){ return 4 ; }
	public final int NSWindowBackingLocationDefault(){ return 0 ; }
	public final int NSWindowBackingLocationMainMemory(){ return 2 ; }
	public final int NSWindowBackingLocationVideoMemory(){ return 1 ; }
	public final int NSWindowBelow(){ return -1 ; }
	public final int NSWindowCloseButton(){ return 0 ; }
	public final int NSWindowCollectionBehaviorCanJoinAllSpaces(){ return 1 ; }
	public final int NSWindowCollectionBehaviorDefault(){ return 0 ; }
	public final int NSWindowCollectionBehaviorFullScreenAuxiliary(){ return 256 ; }
	public final int NSWindowCollectionBehaviorFullScreenPrimary(){ return 128 ; }
	public final int NSWindowCollectionBehaviorIgnoresCycle(){ return 64 ; }
	public final int NSWindowCollectionBehaviorManaged(){ return 4 ; }
	public final int NSWindowCollectionBehaviorMoveToActiveSpace(){ return 2 ; }
	public final int NSWindowCollectionBehaviorParticipatesInCycle(){ return 32 ; }
	public final int NSWindowCollectionBehaviorStationary(){ return 16 ; }
	public final int NSWindowCollectionBehaviorTransient(){ return 8 ; }
	public final int NSWindowDepthOnehundredtwentyeightBitRGB(){ return 544 ; }
	public final int NSWindowDepthSixtyfourBitRGB(){ return 528 ; }
	public final int NSWindowDepthTwentyfourBitRGB(){ return 520 ; }
	public final int NSWindowDocumentIconButton(){ return 4 ; }
	public final int NSWindowDocumentVersionsButton(){ return 6 ; }
	public final int NSWindowExposedEventType(){ return 0 ; }
	public final int NSWindowFullScreenButton(){ return 7 ; }
	public final int NSWindowMiniaturizeButton(){ return 1 ; }
	public final int NSWindowMovedEventType(){ return 4 ; }
	public final int NSWindowNumberListAllApplications(){ return 1 ; }
	public final int NSWindowNumberListAllSpaces(){ return 16 ; }
	public final int NSWindowOut(){ return 0 ; }
	public final int NSWindowSharingNone(){ return 0 ; }
	public final int NSWindowSharingReadOnly(){ return 1 ; }
	public final int NSWindowSharingReadWrite(){ return 2 ; }
	public final int NSWindowToolbarButton(){ return 3 ; }
	public final int NSWindowZoomButton(){ return 2 ; }
	public final int NSWindows95InterfaceStyle(){ return 2 ; }
	public final int NSWorkspaceLaunchAllowingClassicStartup(){ return 131072 ; }
	public final int NSWorkspaceLaunchAndHide(){ return 1048576 ; }
	public final int NSWorkspaceLaunchAndHideOthers(){ return 2097152 ; }
	public final int NSWorkspaceLaunchAndPrint(){ return 2 ; }
	public final int NSWorkspaceLaunchAsync(){ return 65536 ; }
	public final int NSWorkspaceLaunchDefault(){ return 196608 ; }
	public final int NSWorkspaceLaunchInhibitingBackgroundOnly(){ return 128 ; }
	public final int NSWorkspaceLaunchNewInstance(){ return 524288 ; }
	public final int NSWorkspaceLaunchPreferringClassic(){ return 262144 ; }
	public final int NSWorkspaceLaunchWithoutActivation(){ return 512 ; }
	public final int NSWorkspaceLaunchWithoutAddingToRecents(){ return 256 ; }
	public final int NSWritingDirectionLeftToRight(){ return 0 ; }
	public final int NSWritingDirectionNatural(){ return -1 ; }
	public final int NSWritingDirectionRightToLeft(){ return 1 ; }
	public final int NSYearMonthDatePickerElementFlag(){ return 192 ; }
	public final int NSYearMonthDayDatePickerElementFlag(){ return 224 ; }

	private com.apple.jobjc.foundation.NSString _NSAbortModalException = null;
	 final public com.apple.jobjc.foundation.NSString NSAbortModalException(){
		if(_NSAbortModalException != null) return _NSAbortModalException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAbortModalException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAbortModalException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAbortPrintingException = null;
	 final public com.apple.jobjc.foundation.NSString NSAbortPrintingException(){
		if(_NSAbortPrintingException != null) return _NSAbortPrintingException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAbortPrintingException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAbortPrintingException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityAllowedValuesAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityAllowedValuesAttribute(){
		if(_NSAccessibilityAllowedValuesAttribute != null) return _NSAccessibilityAllowedValuesAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityAllowedValuesAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityAllowedValuesAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityApplicationActivatedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityApplicationActivatedNotification(){
		if(_NSAccessibilityApplicationActivatedNotification != null) return _NSAccessibilityApplicationActivatedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityApplicationActivatedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityApplicationActivatedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityApplicationDeactivatedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityApplicationDeactivatedNotification(){
		if(_NSAccessibilityApplicationDeactivatedNotification != null) return _NSAccessibilityApplicationDeactivatedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityApplicationDeactivatedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityApplicationDeactivatedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityApplicationHiddenNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityApplicationHiddenNotification(){
		if(_NSAccessibilityApplicationHiddenNotification != null) return _NSAccessibilityApplicationHiddenNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityApplicationHiddenNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityApplicationHiddenNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityApplicationRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityApplicationRole(){
		if(_NSAccessibilityApplicationRole != null) return _NSAccessibilityApplicationRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityApplicationRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityApplicationRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityApplicationShownNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityApplicationShownNotification(){
		if(_NSAccessibilityApplicationShownNotification != null) return _NSAccessibilityApplicationShownNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityApplicationShownNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityApplicationShownNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityAscendingSortDirectionValue = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityAscendingSortDirectionValue(){
		if(_NSAccessibilityAscendingSortDirectionValue != null) return _NSAccessibilityAscendingSortDirectionValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityAscendingSortDirectionValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityAscendingSortDirectionValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityAttachmentTextAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityAttachmentTextAttribute(){
		if(_NSAccessibilityAttachmentTextAttribute != null) return _NSAccessibilityAttachmentTextAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityAttachmentTextAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityAttachmentTextAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityAttributedStringForRangeParameterizedAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityAttributedStringForRangeParameterizedAttribute(){
		if(_NSAccessibilityAttributedStringForRangeParameterizedAttribute != null) return _NSAccessibilityAttributedStringForRangeParameterizedAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityAttributedStringForRangeParameterizedAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityAttributedStringForRangeParameterizedAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityAutocorrectedTextAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityAutocorrectedTextAttribute(){
		if(_NSAccessibilityAutocorrectedTextAttribute != null) return _NSAccessibilityAutocorrectedTextAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityAutocorrectedTextAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityAutocorrectedTextAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityBackgroundColorTextAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityBackgroundColorTextAttribute(){
		if(_NSAccessibilityBackgroundColorTextAttribute != null) return _NSAccessibilityBackgroundColorTextAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityBackgroundColorTextAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityBackgroundColorTextAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityBoundsForRangeParameterizedAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityBoundsForRangeParameterizedAttribute(){
		if(_NSAccessibilityBoundsForRangeParameterizedAttribute != null) return _NSAccessibilityBoundsForRangeParameterizedAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityBoundsForRangeParameterizedAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityBoundsForRangeParameterizedAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityBrowserRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityBrowserRole(){
		if(_NSAccessibilityBrowserRole != null) return _NSAccessibilityBrowserRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityBrowserRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityBrowserRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityBusyIndicatorRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityBusyIndicatorRole(){
		if(_NSAccessibilityBusyIndicatorRole != null) return _NSAccessibilityBusyIndicatorRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityBusyIndicatorRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityBusyIndicatorRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityButtonRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityButtonRole(){
		if(_NSAccessibilityButtonRole != null) return _NSAccessibilityButtonRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityButtonRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityButtonRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityCancelAction = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityCancelAction(){
		if(_NSAccessibilityCancelAction != null) return _NSAccessibilityCancelAction;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityCancelAction", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityCancelAction = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityCancelButtonAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityCancelButtonAttribute(){
		if(_NSAccessibilityCancelButtonAttribute != null) return _NSAccessibilityCancelButtonAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityCancelButtonAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityCancelButtonAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityCellForColumnAndRowParameterizedAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityCellForColumnAndRowParameterizedAttribute(){
		if(_NSAccessibilityCellForColumnAndRowParameterizedAttribute != null) return _NSAccessibilityCellForColumnAndRowParameterizedAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityCellForColumnAndRowParameterizedAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityCellForColumnAndRowParameterizedAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityCellRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityCellRole(){
		if(_NSAccessibilityCellRole != null) return _NSAccessibilityCellRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityCellRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityCellRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityCenterTabStopMarkerTypeValue = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityCenterTabStopMarkerTypeValue(){
		if(_NSAccessibilityCenterTabStopMarkerTypeValue != null) return _NSAccessibilityCenterTabStopMarkerTypeValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityCenterTabStopMarkerTypeValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityCenterTabStopMarkerTypeValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityCentimetersUnitValue = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityCentimetersUnitValue(){
		if(_NSAccessibilityCentimetersUnitValue != null) return _NSAccessibilityCentimetersUnitValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityCentimetersUnitValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityCentimetersUnitValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityCheckBoxRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityCheckBoxRole(){
		if(_NSAccessibilityCheckBoxRole != null) return _NSAccessibilityCheckBoxRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityCheckBoxRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityCheckBoxRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityChildrenAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityChildrenAttribute(){
		if(_NSAccessibilityChildrenAttribute != null) return _NSAccessibilityChildrenAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityChildrenAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityChildrenAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityClearButtonAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityClearButtonAttribute(){
		if(_NSAccessibilityClearButtonAttribute != null) return _NSAccessibilityClearButtonAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityClearButtonAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityClearButtonAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityCloseButtonAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityCloseButtonAttribute(){
		if(_NSAccessibilityCloseButtonAttribute != null) return _NSAccessibilityCloseButtonAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityCloseButtonAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityCloseButtonAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityCloseButtonSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityCloseButtonSubrole(){
		if(_NSAccessibilityCloseButtonSubrole != null) return _NSAccessibilityCloseButtonSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityCloseButtonSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityCloseButtonSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityColorWellRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityColorWellRole(){
		if(_NSAccessibilityColorWellRole != null) return _NSAccessibilityColorWellRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityColorWellRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityColorWellRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityColumnCountAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityColumnCountAttribute(){
		if(_NSAccessibilityColumnCountAttribute != null) return _NSAccessibilityColumnCountAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityColumnCountAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityColumnCountAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityColumnHeaderUIElementsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityColumnHeaderUIElementsAttribute(){
		if(_NSAccessibilityColumnHeaderUIElementsAttribute != null) return _NSAccessibilityColumnHeaderUIElementsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityColumnHeaderUIElementsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityColumnHeaderUIElementsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityColumnIndexRangeAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityColumnIndexRangeAttribute(){
		if(_NSAccessibilityColumnIndexRangeAttribute != null) return _NSAccessibilityColumnIndexRangeAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityColumnIndexRangeAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityColumnIndexRangeAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityColumnRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityColumnRole(){
		if(_NSAccessibilityColumnRole != null) return _NSAccessibilityColumnRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityColumnRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityColumnRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityColumnTitlesAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityColumnTitlesAttribute(){
		if(_NSAccessibilityColumnTitlesAttribute != null) return _NSAccessibilityColumnTitlesAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityColumnTitlesAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityColumnTitlesAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityColumnsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityColumnsAttribute(){
		if(_NSAccessibilityColumnsAttribute != null) return _NSAccessibilityColumnsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityColumnsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityColumnsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityComboBoxRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityComboBoxRole(){
		if(_NSAccessibilityComboBoxRole != null) return _NSAccessibilityComboBoxRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityComboBoxRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityComboBoxRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityConfirmAction = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityConfirmAction(){
		if(_NSAccessibilityConfirmAction != null) return _NSAccessibilityConfirmAction;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityConfirmAction", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityConfirmAction = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityContentListSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityContentListSubrole(){
		if(_NSAccessibilityContentListSubrole != null) return _NSAccessibilityContentListSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityContentListSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityContentListSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityContentsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityContentsAttribute(){
		if(_NSAccessibilityContentsAttribute != null) return _NSAccessibilityContentsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityContentsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityContentsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityCreatedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityCreatedNotification(){
		if(_NSAccessibilityCreatedNotification != null) return _NSAccessibilityCreatedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityCreatedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityCreatedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityCriticalValueAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityCriticalValueAttribute(){
		if(_NSAccessibilityCriticalValueAttribute != null) return _NSAccessibilityCriticalValueAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityCriticalValueAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityCriticalValueAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityDecimalTabStopMarkerTypeValue = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityDecimalTabStopMarkerTypeValue(){
		if(_NSAccessibilityDecimalTabStopMarkerTypeValue != null) return _NSAccessibilityDecimalTabStopMarkerTypeValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityDecimalTabStopMarkerTypeValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityDecimalTabStopMarkerTypeValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityDecrementAction = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityDecrementAction(){
		if(_NSAccessibilityDecrementAction != null) return _NSAccessibilityDecrementAction;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityDecrementAction", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityDecrementAction = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityDecrementArrowSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityDecrementArrowSubrole(){
		if(_NSAccessibilityDecrementArrowSubrole != null) return _NSAccessibilityDecrementArrowSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityDecrementArrowSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityDecrementArrowSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityDecrementButtonAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityDecrementButtonAttribute(){
		if(_NSAccessibilityDecrementButtonAttribute != null) return _NSAccessibilityDecrementButtonAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityDecrementButtonAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityDecrementButtonAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityDecrementPageSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityDecrementPageSubrole(){
		if(_NSAccessibilityDecrementPageSubrole != null) return _NSAccessibilityDecrementPageSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityDecrementPageSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityDecrementPageSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityDefaultButtonAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityDefaultButtonAttribute(){
		if(_NSAccessibilityDefaultButtonAttribute != null) return _NSAccessibilityDefaultButtonAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityDefaultButtonAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityDefaultButtonAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityDefinitionListSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityDefinitionListSubrole(){
		if(_NSAccessibilityDefinitionListSubrole != null) return _NSAccessibilityDefinitionListSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityDefinitionListSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityDefinitionListSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityDeleteAction = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityDeleteAction(){
		if(_NSAccessibilityDeleteAction != null) return _NSAccessibilityDeleteAction;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityDeleteAction", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityDeleteAction = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityDescendingSortDirectionValue = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityDescendingSortDirectionValue(){
		if(_NSAccessibilityDescendingSortDirectionValue != null) return _NSAccessibilityDescendingSortDirectionValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityDescendingSortDirectionValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityDescendingSortDirectionValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityDescriptionAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityDescriptionAttribute(){
		if(_NSAccessibilityDescriptionAttribute != null) return _NSAccessibilityDescriptionAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityDescriptionAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityDescriptionAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityDialogSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityDialogSubrole(){
		if(_NSAccessibilityDialogSubrole != null) return _NSAccessibilityDialogSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityDialogSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityDialogSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityDisclosedByRowAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityDisclosedByRowAttribute(){
		if(_NSAccessibilityDisclosedByRowAttribute != null) return _NSAccessibilityDisclosedByRowAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityDisclosedByRowAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityDisclosedByRowAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityDisclosedRowsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityDisclosedRowsAttribute(){
		if(_NSAccessibilityDisclosedRowsAttribute != null) return _NSAccessibilityDisclosedRowsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityDisclosedRowsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityDisclosedRowsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityDisclosingAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityDisclosingAttribute(){
		if(_NSAccessibilityDisclosingAttribute != null) return _NSAccessibilityDisclosingAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityDisclosingAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityDisclosingAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityDisclosureLevelAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityDisclosureLevelAttribute(){
		if(_NSAccessibilityDisclosureLevelAttribute != null) return _NSAccessibilityDisclosureLevelAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityDisclosureLevelAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityDisclosureLevelAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityDisclosureTriangleRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityDisclosureTriangleRole(){
		if(_NSAccessibilityDisclosureTriangleRole != null) return _NSAccessibilityDisclosureTriangleRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityDisclosureTriangleRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityDisclosureTriangleRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityDocumentAttribute(){
		if(_NSAccessibilityDocumentAttribute != null) return _NSAccessibilityDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityDrawerCreatedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityDrawerCreatedNotification(){
		if(_NSAccessibilityDrawerCreatedNotification != null) return _NSAccessibilityDrawerCreatedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityDrawerCreatedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityDrawerCreatedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityDrawerRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityDrawerRole(){
		if(_NSAccessibilityDrawerRole != null) return _NSAccessibilityDrawerRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityDrawerRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityDrawerRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityEditedAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityEditedAttribute(){
		if(_NSAccessibilityEditedAttribute != null) return _NSAccessibilityEditedAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityEditedAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityEditedAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityEnabledAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityEnabledAttribute(){
		if(_NSAccessibilityEnabledAttribute != null) return _NSAccessibilityEnabledAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityEnabledAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityEnabledAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityErrorCodeExceptionInfo = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityErrorCodeExceptionInfo(){
		if(_NSAccessibilityErrorCodeExceptionInfo != null) return _NSAccessibilityErrorCodeExceptionInfo;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityErrorCodeExceptionInfo", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityErrorCodeExceptionInfo = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityException = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityException(){
		if(_NSAccessibilityException != null) return _NSAccessibilityException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityExpandedAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityExpandedAttribute(){
		if(_NSAccessibilityExpandedAttribute != null) return _NSAccessibilityExpandedAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityExpandedAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityExpandedAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityExtrasMenuBarAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityExtrasMenuBarAttribute(){
		if(_NSAccessibilityExtrasMenuBarAttribute != null) return _NSAccessibilityExtrasMenuBarAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityExtrasMenuBarAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityExtrasMenuBarAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityFilenameAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityFilenameAttribute(){
		if(_NSAccessibilityFilenameAttribute != null) return _NSAccessibilityFilenameAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityFilenameAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityFilenameAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityFirstLineIndentMarkerTypeValue = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityFirstLineIndentMarkerTypeValue(){
		if(_NSAccessibilityFirstLineIndentMarkerTypeValue != null) return _NSAccessibilityFirstLineIndentMarkerTypeValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityFirstLineIndentMarkerTypeValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityFirstLineIndentMarkerTypeValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityFloatingWindowSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityFloatingWindowSubrole(){
		if(_NSAccessibilityFloatingWindowSubrole != null) return _NSAccessibilityFloatingWindowSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityFloatingWindowSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityFloatingWindowSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityFocusedAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityFocusedAttribute(){
		if(_NSAccessibilityFocusedAttribute != null) return _NSAccessibilityFocusedAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityFocusedAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityFocusedAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityFocusedUIElementAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityFocusedUIElementAttribute(){
		if(_NSAccessibilityFocusedUIElementAttribute != null) return _NSAccessibilityFocusedUIElementAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityFocusedUIElementAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityFocusedUIElementAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityFocusedUIElementChangedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityFocusedUIElementChangedNotification(){
		if(_NSAccessibilityFocusedUIElementChangedNotification != null) return _NSAccessibilityFocusedUIElementChangedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityFocusedUIElementChangedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityFocusedUIElementChangedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityFocusedWindowAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityFocusedWindowAttribute(){
		if(_NSAccessibilityFocusedWindowAttribute != null) return _NSAccessibilityFocusedWindowAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityFocusedWindowAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityFocusedWindowAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityFocusedWindowChangedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityFocusedWindowChangedNotification(){
		if(_NSAccessibilityFocusedWindowChangedNotification != null) return _NSAccessibilityFocusedWindowChangedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityFocusedWindowChangedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityFocusedWindowChangedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityFontFamilyKey = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityFontFamilyKey(){
		if(_NSAccessibilityFontFamilyKey != null) return _NSAccessibilityFontFamilyKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityFontFamilyKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityFontFamilyKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityFontNameKey = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityFontNameKey(){
		if(_NSAccessibilityFontNameKey != null) return _NSAccessibilityFontNameKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityFontNameKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityFontNameKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityFontSizeKey = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityFontSizeKey(){
		if(_NSAccessibilityFontSizeKey != null) return _NSAccessibilityFontSizeKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityFontSizeKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityFontSizeKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityFontTextAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityFontTextAttribute(){
		if(_NSAccessibilityFontTextAttribute != null) return _NSAccessibilityFontTextAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityFontTextAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityFontTextAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityForegroundColorTextAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityForegroundColorTextAttribute(){
		if(_NSAccessibilityForegroundColorTextAttribute != null) return _NSAccessibilityForegroundColorTextAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityForegroundColorTextAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityForegroundColorTextAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityFrontmostAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityFrontmostAttribute(){
		if(_NSAccessibilityFrontmostAttribute != null) return _NSAccessibilityFrontmostAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityFrontmostAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityFrontmostAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityFullScreenButtonAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityFullScreenButtonAttribute(){
		if(_NSAccessibilityFullScreenButtonAttribute != null) return _NSAccessibilityFullScreenButtonAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityFullScreenButtonAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityFullScreenButtonAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityFullScreenButtonSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityFullScreenButtonSubrole(){
		if(_NSAccessibilityFullScreenButtonSubrole != null) return _NSAccessibilityFullScreenButtonSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityFullScreenButtonSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityFullScreenButtonSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityGridRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityGridRole(){
		if(_NSAccessibilityGridRole != null) return _NSAccessibilityGridRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityGridRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityGridRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityGroupRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityGroupRole(){
		if(_NSAccessibilityGroupRole != null) return _NSAccessibilityGroupRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityGroupRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityGroupRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityGrowAreaAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityGrowAreaAttribute(){
		if(_NSAccessibilityGrowAreaAttribute != null) return _NSAccessibilityGrowAreaAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityGrowAreaAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityGrowAreaAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityGrowAreaRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityGrowAreaRole(){
		if(_NSAccessibilityGrowAreaRole != null) return _NSAccessibilityGrowAreaRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityGrowAreaRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityGrowAreaRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityHandleRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityHandleRole(){
		if(_NSAccessibilityHandleRole != null) return _NSAccessibilityHandleRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityHandleRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityHandleRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityHandlesAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityHandlesAttribute(){
		if(_NSAccessibilityHandlesAttribute != null) return _NSAccessibilityHandlesAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityHandlesAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityHandlesAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityHeadIndentMarkerTypeValue = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityHeadIndentMarkerTypeValue(){
		if(_NSAccessibilityHeadIndentMarkerTypeValue != null) return _NSAccessibilityHeadIndentMarkerTypeValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityHeadIndentMarkerTypeValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityHeadIndentMarkerTypeValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityHeaderAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityHeaderAttribute(){
		if(_NSAccessibilityHeaderAttribute != null) return _NSAccessibilityHeaderAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityHeaderAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityHeaderAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityHelpAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityHelpAttribute(){
		if(_NSAccessibilityHelpAttribute != null) return _NSAccessibilityHelpAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityHelpAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityHelpAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityHelpTagCreatedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityHelpTagCreatedNotification(){
		if(_NSAccessibilityHelpTagCreatedNotification != null) return _NSAccessibilityHelpTagCreatedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityHelpTagCreatedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityHelpTagCreatedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityHelpTagRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityHelpTagRole(){
		if(_NSAccessibilityHelpTagRole != null) return _NSAccessibilityHelpTagRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityHelpTagRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityHelpTagRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityHiddenAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityHiddenAttribute(){
		if(_NSAccessibilityHiddenAttribute != null) return _NSAccessibilityHiddenAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityHiddenAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityHiddenAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityHorizontalOrientationValue = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityHorizontalOrientationValue(){
		if(_NSAccessibilityHorizontalOrientationValue != null) return _NSAccessibilityHorizontalOrientationValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityHorizontalOrientationValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityHorizontalOrientationValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityHorizontalScrollBarAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityHorizontalScrollBarAttribute(){
		if(_NSAccessibilityHorizontalScrollBarAttribute != null) return _NSAccessibilityHorizontalScrollBarAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityHorizontalScrollBarAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityHorizontalScrollBarAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityHorizontalUnitDescriptionAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityHorizontalUnitDescriptionAttribute(){
		if(_NSAccessibilityHorizontalUnitDescriptionAttribute != null) return _NSAccessibilityHorizontalUnitDescriptionAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityHorizontalUnitDescriptionAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityHorizontalUnitDescriptionAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityHorizontalUnitsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityHorizontalUnitsAttribute(){
		if(_NSAccessibilityHorizontalUnitsAttribute != null) return _NSAccessibilityHorizontalUnitsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityHorizontalUnitsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityHorizontalUnitsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityIdentifierAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityIdentifierAttribute(){
		if(_NSAccessibilityIdentifierAttribute != null) return _NSAccessibilityIdentifierAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityIdentifierAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityIdentifierAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityImageRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityImageRole(){
		if(_NSAccessibilityImageRole != null) return _NSAccessibilityImageRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityImageRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityImageRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityInchesUnitValue = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityInchesUnitValue(){
		if(_NSAccessibilityInchesUnitValue != null) return _NSAccessibilityInchesUnitValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityInchesUnitValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityInchesUnitValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityIncrementAction = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityIncrementAction(){
		if(_NSAccessibilityIncrementAction != null) return _NSAccessibilityIncrementAction;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityIncrementAction", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityIncrementAction = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityIncrementArrowSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityIncrementArrowSubrole(){
		if(_NSAccessibilityIncrementArrowSubrole != null) return _NSAccessibilityIncrementArrowSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityIncrementArrowSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityIncrementArrowSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityIncrementButtonAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityIncrementButtonAttribute(){
		if(_NSAccessibilityIncrementButtonAttribute != null) return _NSAccessibilityIncrementButtonAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityIncrementButtonAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityIncrementButtonAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityIncrementPageSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityIncrementPageSubrole(){
		if(_NSAccessibilityIncrementPageSubrole != null) return _NSAccessibilityIncrementPageSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityIncrementPageSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityIncrementPageSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityIncrementorRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityIncrementorRole(){
		if(_NSAccessibilityIncrementorRole != null) return _NSAccessibilityIncrementorRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityIncrementorRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityIncrementorRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityIndexAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityIndexAttribute(){
		if(_NSAccessibilityIndexAttribute != null) return _NSAccessibilityIndexAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityIndexAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityIndexAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityInsertionPointLineNumberAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityInsertionPointLineNumberAttribute(){
		if(_NSAccessibilityInsertionPointLineNumberAttribute != null) return _NSAccessibilityInsertionPointLineNumberAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityInsertionPointLineNumberAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityInsertionPointLineNumberAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityLabelUIElementsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityLabelUIElementsAttribute(){
		if(_NSAccessibilityLabelUIElementsAttribute != null) return _NSAccessibilityLabelUIElementsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityLabelUIElementsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityLabelUIElementsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityLabelValueAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityLabelValueAttribute(){
		if(_NSAccessibilityLabelValueAttribute != null) return _NSAccessibilityLabelValueAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityLabelValueAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityLabelValueAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityLayoutAreaRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityLayoutAreaRole(){
		if(_NSAccessibilityLayoutAreaRole != null) return _NSAccessibilityLayoutAreaRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityLayoutAreaRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityLayoutAreaRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityLayoutItemRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityLayoutItemRole(){
		if(_NSAccessibilityLayoutItemRole != null) return _NSAccessibilityLayoutItemRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityLayoutItemRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityLayoutItemRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityLayoutPointForScreenPointParameterizedAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityLayoutPointForScreenPointParameterizedAttribute(){
		if(_NSAccessibilityLayoutPointForScreenPointParameterizedAttribute != null) return _NSAccessibilityLayoutPointForScreenPointParameterizedAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityLayoutPointForScreenPointParameterizedAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityLayoutPointForScreenPointParameterizedAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityLayoutSizeForScreenSizeParameterizedAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityLayoutSizeForScreenSizeParameterizedAttribute(){
		if(_NSAccessibilityLayoutSizeForScreenSizeParameterizedAttribute != null) return _NSAccessibilityLayoutSizeForScreenSizeParameterizedAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityLayoutSizeForScreenSizeParameterizedAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityLayoutSizeForScreenSizeParameterizedAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityLeftTabStopMarkerTypeValue = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityLeftTabStopMarkerTypeValue(){
		if(_NSAccessibilityLeftTabStopMarkerTypeValue != null) return _NSAccessibilityLeftTabStopMarkerTypeValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityLeftTabStopMarkerTypeValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityLeftTabStopMarkerTypeValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityLevelIndicatorRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityLevelIndicatorRole(){
		if(_NSAccessibilityLevelIndicatorRole != null) return _NSAccessibilityLevelIndicatorRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityLevelIndicatorRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityLevelIndicatorRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityLineForIndexParameterizedAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityLineForIndexParameterizedAttribute(){
		if(_NSAccessibilityLineForIndexParameterizedAttribute != null) return _NSAccessibilityLineForIndexParameterizedAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityLineForIndexParameterizedAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityLineForIndexParameterizedAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityLinkRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityLinkRole(){
		if(_NSAccessibilityLinkRole != null) return _NSAccessibilityLinkRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityLinkRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityLinkRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityLinkTextAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityLinkTextAttribute(){
		if(_NSAccessibilityLinkTextAttribute != null) return _NSAccessibilityLinkTextAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityLinkTextAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityLinkTextAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityLinkedUIElementsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityLinkedUIElementsAttribute(){
		if(_NSAccessibilityLinkedUIElementsAttribute != null) return _NSAccessibilityLinkedUIElementsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityLinkedUIElementsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityLinkedUIElementsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityListRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityListRole(){
		if(_NSAccessibilityListRole != null) return _NSAccessibilityListRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityListRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityListRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMainAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMainAttribute(){
		if(_NSAccessibilityMainAttribute != null) return _NSAccessibilityMainAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMainAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMainAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMainWindowAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMainWindowAttribute(){
		if(_NSAccessibilityMainWindowAttribute != null) return _NSAccessibilityMainWindowAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMainWindowAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMainWindowAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMainWindowChangedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMainWindowChangedNotification(){
		if(_NSAccessibilityMainWindowChangedNotification != null) return _NSAccessibilityMainWindowChangedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMainWindowChangedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMainWindowChangedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMarkerGroupUIElementAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMarkerGroupUIElementAttribute(){
		if(_NSAccessibilityMarkerGroupUIElementAttribute != null) return _NSAccessibilityMarkerGroupUIElementAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMarkerGroupUIElementAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMarkerGroupUIElementAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMarkerTypeAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMarkerTypeAttribute(){
		if(_NSAccessibilityMarkerTypeAttribute != null) return _NSAccessibilityMarkerTypeAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMarkerTypeAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMarkerTypeAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMarkerTypeDescriptionAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMarkerTypeDescriptionAttribute(){
		if(_NSAccessibilityMarkerTypeDescriptionAttribute != null) return _NSAccessibilityMarkerTypeDescriptionAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMarkerTypeDescriptionAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMarkerTypeDescriptionAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMarkerUIElementsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMarkerUIElementsAttribute(){
		if(_NSAccessibilityMarkerUIElementsAttribute != null) return _NSAccessibilityMarkerUIElementsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMarkerUIElementsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMarkerUIElementsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMarkerValuesAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMarkerValuesAttribute(){
		if(_NSAccessibilityMarkerValuesAttribute != null) return _NSAccessibilityMarkerValuesAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMarkerValuesAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMarkerValuesAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMatteContentUIElementAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMatteContentUIElementAttribute(){
		if(_NSAccessibilityMatteContentUIElementAttribute != null) return _NSAccessibilityMatteContentUIElementAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMatteContentUIElementAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMatteContentUIElementAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMatteHoleAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMatteHoleAttribute(){
		if(_NSAccessibilityMatteHoleAttribute != null) return _NSAccessibilityMatteHoleAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMatteHoleAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMatteHoleAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMatteRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMatteRole(){
		if(_NSAccessibilityMatteRole != null) return _NSAccessibilityMatteRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMatteRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMatteRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMaxValueAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMaxValueAttribute(){
		if(_NSAccessibilityMaxValueAttribute != null) return _NSAccessibilityMaxValueAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMaxValueAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMaxValueAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMenuBarAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMenuBarAttribute(){
		if(_NSAccessibilityMenuBarAttribute != null) return _NSAccessibilityMenuBarAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMenuBarAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMenuBarAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMenuBarRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMenuBarRole(){
		if(_NSAccessibilityMenuBarRole != null) return _NSAccessibilityMenuBarRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMenuBarRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMenuBarRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMenuButtonRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMenuButtonRole(){
		if(_NSAccessibilityMenuButtonRole != null) return _NSAccessibilityMenuButtonRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMenuButtonRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMenuButtonRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMenuItemRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMenuItemRole(){
		if(_NSAccessibilityMenuItemRole != null) return _NSAccessibilityMenuItemRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMenuItemRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMenuItemRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMenuRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMenuRole(){
		if(_NSAccessibilityMenuRole != null) return _NSAccessibilityMenuRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMenuRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMenuRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMinValueAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMinValueAttribute(){
		if(_NSAccessibilityMinValueAttribute != null) return _NSAccessibilityMinValueAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMinValueAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMinValueAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMinimizeButtonAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMinimizeButtonAttribute(){
		if(_NSAccessibilityMinimizeButtonAttribute != null) return _NSAccessibilityMinimizeButtonAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMinimizeButtonAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMinimizeButtonAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMinimizeButtonSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMinimizeButtonSubrole(){
		if(_NSAccessibilityMinimizeButtonSubrole != null) return _NSAccessibilityMinimizeButtonSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMinimizeButtonSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMinimizeButtonSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMinimizedAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMinimizedAttribute(){
		if(_NSAccessibilityMinimizedAttribute != null) return _NSAccessibilityMinimizedAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMinimizedAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMinimizedAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMisspelledTextAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMisspelledTextAttribute(){
		if(_NSAccessibilityMisspelledTextAttribute != null) return _NSAccessibilityMisspelledTextAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMisspelledTextAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMisspelledTextAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityModalAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityModalAttribute(){
		if(_NSAccessibilityModalAttribute != null) return _NSAccessibilityModalAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityModalAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityModalAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityMovedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityMovedNotification(){
		if(_NSAccessibilityMovedNotification != null) return _NSAccessibilityMovedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityMovedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityMovedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityNextContentsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityNextContentsAttribute(){
		if(_NSAccessibilityNextContentsAttribute != null) return _NSAccessibilityNextContentsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityNextContentsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityNextContentsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityNumberOfCharactersAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityNumberOfCharactersAttribute(){
		if(_NSAccessibilityNumberOfCharactersAttribute != null) return _NSAccessibilityNumberOfCharactersAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityNumberOfCharactersAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityNumberOfCharactersAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityOrderedByRowAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityOrderedByRowAttribute(){
		if(_NSAccessibilityOrderedByRowAttribute != null) return _NSAccessibilityOrderedByRowAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityOrderedByRowAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityOrderedByRowAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityOrientationAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityOrientationAttribute(){
		if(_NSAccessibilityOrientationAttribute != null) return _NSAccessibilityOrientationAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityOrientationAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityOrientationAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityOutlineRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityOutlineRole(){
		if(_NSAccessibilityOutlineRole != null) return _NSAccessibilityOutlineRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityOutlineRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityOutlineRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityOutlineRowSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityOutlineRowSubrole(){
		if(_NSAccessibilityOutlineRowSubrole != null) return _NSAccessibilityOutlineRowSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityOutlineRowSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityOutlineRowSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityOverflowButtonAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityOverflowButtonAttribute(){
		if(_NSAccessibilityOverflowButtonAttribute != null) return _NSAccessibilityOverflowButtonAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityOverflowButtonAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityOverflowButtonAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityParentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityParentAttribute(){
		if(_NSAccessibilityParentAttribute != null) return _NSAccessibilityParentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityParentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityParentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityPicasUnitValue = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityPicasUnitValue(){
		if(_NSAccessibilityPicasUnitValue != null) return _NSAccessibilityPicasUnitValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityPicasUnitValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityPicasUnitValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityPickAction = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityPickAction(){
		if(_NSAccessibilityPickAction != null) return _NSAccessibilityPickAction;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityPickAction", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityPickAction = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityPlaceholderValueAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityPlaceholderValueAttribute(){
		if(_NSAccessibilityPlaceholderValueAttribute != null) return _NSAccessibilityPlaceholderValueAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityPlaceholderValueAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityPlaceholderValueAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityPointsUnitValue = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityPointsUnitValue(){
		if(_NSAccessibilityPointsUnitValue != null) return _NSAccessibilityPointsUnitValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityPointsUnitValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityPointsUnitValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityPopUpButtonRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityPopUpButtonRole(){
		if(_NSAccessibilityPopUpButtonRole != null) return _NSAccessibilityPopUpButtonRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityPopUpButtonRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityPopUpButtonRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityPopoverRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityPopoverRole(){
		if(_NSAccessibilityPopoverRole != null) return _NSAccessibilityPopoverRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityPopoverRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityPopoverRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityPositionAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityPositionAttribute(){
		if(_NSAccessibilityPositionAttribute != null) return _NSAccessibilityPositionAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityPositionAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityPositionAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityPressAction = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityPressAction(){
		if(_NSAccessibilityPressAction != null) return _NSAccessibilityPressAction;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityPressAction", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityPressAction = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityPreviousContentsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityPreviousContentsAttribute(){
		if(_NSAccessibilityPreviousContentsAttribute != null) return _NSAccessibilityPreviousContentsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityPreviousContentsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityPreviousContentsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityProgressIndicatorRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityProgressIndicatorRole(){
		if(_NSAccessibilityProgressIndicatorRole != null) return _NSAccessibilityProgressIndicatorRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityProgressIndicatorRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityProgressIndicatorRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityProxyAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityProxyAttribute(){
		if(_NSAccessibilityProxyAttribute != null) return _NSAccessibilityProxyAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityProxyAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityProxyAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRTFForRangeParameterizedAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRTFForRangeParameterizedAttribute(){
		if(_NSAccessibilityRTFForRangeParameterizedAttribute != null) return _NSAccessibilityRTFForRangeParameterizedAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRTFForRangeParameterizedAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRTFForRangeParameterizedAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRadioButtonRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRadioButtonRole(){
		if(_NSAccessibilityRadioButtonRole != null) return _NSAccessibilityRadioButtonRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRadioButtonRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRadioButtonRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRadioGroupRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRadioGroupRole(){
		if(_NSAccessibilityRadioGroupRole != null) return _NSAccessibilityRadioGroupRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRadioGroupRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRadioGroupRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRaiseAction = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRaiseAction(){
		if(_NSAccessibilityRaiseAction != null) return _NSAccessibilityRaiseAction;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRaiseAction", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRaiseAction = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRangeForIndexParameterizedAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRangeForIndexParameterizedAttribute(){
		if(_NSAccessibilityRangeForIndexParameterizedAttribute != null) return _NSAccessibilityRangeForIndexParameterizedAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRangeForIndexParameterizedAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRangeForIndexParameterizedAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRangeForLineParameterizedAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRangeForLineParameterizedAttribute(){
		if(_NSAccessibilityRangeForLineParameterizedAttribute != null) return _NSAccessibilityRangeForLineParameterizedAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRangeForLineParameterizedAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRangeForLineParameterizedAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRangeForPositionParameterizedAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRangeForPositionParameterizedAttribute(){
		if(_NSAccessibilityRangeForPositionParameterizedAttribute != null) return _NSAccessibilityRangeForPositionParameterizedAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRangeForPositionParameterizedAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRangeForPositionParameterizedAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRatingIndicatorSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRatingIndicatorSubrole(){
		if(_NSAccessibilityRatingIndicatorSubrole != null) return _NSAccessibilityRatingIndicatorSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRatingIndicatorSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRatingIndicatorSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRelevanceIndicatorRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRelevanceIndicatorRole(){
		if(_NSAccessibilityRelevanceIndicatorRole != null) return _NSAccessibilityRelevanceIndicatorRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRelevanceIndicatorRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRelevanceIndicatorRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityResizedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityResizedNotification(){
		if(_NSAccessibilityResizedNotification != null) return _NSAccessibilityResizedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityResizedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityResizedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRightTabStopMarkerTypeValue = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRightTabStopMarkerTypeValue(){
		if(_NSAccessibilityRightTabStopMarkerTypeValue != null) return _NSAccessibilityRightTabStopMarkerTypeValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRightTabStopMarkerTypeValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRightTabStopMarkerTypeValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRoleAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRoleAttribute(){
		if(_NSAccessibilityRoleAttribute != null) return _NSAccessibilityRoleAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRoleAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRoleAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRoleDescriptionAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRoleDescriptionAttribute(){
		if(_NSAccessibilityRoleDescriptionAttribute != null) return _NSAccessibilityRoleDescriptionAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRoleDescriptionAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRoleDescriptionAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRowCollapsedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRowCollapsedNotification(){
		if(_NSAccessibilityRowCollapsedNotification != null) return _NSAccessibilityRowCollapsedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRowCollapsedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRowCollapsedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRowCountAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRowCountAttribute(){
		if(_NSAccessibilityRowCountAttribute != null) return _NSAccessibilityRowCountAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRowCountAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRowCountAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRowCountChangedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRowCountChangedNotification(){
		if(_NSAccessibilityRowCountChangedNotification != null) return _NSAccessibilityRowCountChangedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRowCountChangedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRowCountChangedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRowExpandedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRowExpandedNotification(){
		if(_NSAccessibilityRowExpandedNotification != null) return _NSAccessibilityRowExpandedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRowExpandedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRowExpandedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRowHeaderUIElementsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRowHeaderUIElementsAttribute(){
		if(_NSAccessibilityRowHeaderUIElementsAttribute != null) return _NSAccessibilityRowHeaderUIElementsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRowHeaderUIElementsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRowHeaderUIElementsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRowIndexRangeAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRowIndexRangeAttribute(){
		if(_NSAccessibilityRowIndexRangeAttribute != null) return _NSAccessibilityRowIndexRangeAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRowIndexRangeAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRowIndexRangeAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRowRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRowRole(){
		if(_NSAccessibilityRowRole != null) return _NSAccessibilityRowRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRowRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRowRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRowsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRowsAttribute(){
		if(_NSAccessibilityRowsAttribute != null) return _NSAccessibilityRowsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRowsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRowsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRulerMarkerRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRulerMarkerRole(){
		if(_NSAccessibilityRulerMarkerRole != null) return _NSAccessibilityRulerMarkerRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRulerMarkerRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRulerMarkerRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityRulerRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityRulerRole(){
		if(_NSAccessibilityRulerRole != null) return _NSAccessibilityRulerRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityRulerRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityRulerRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityScreenPointForLayoutPointParameterizedAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityScreenPointForLayoutPointParameterizedAttribute(){
		if(_NSAccessibilityScreenPointForLayoutPointParameterizedAttribute != null) return _NSAccessibilityScreenPointForLayoutPointParameterizedAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityScreenPointForLayoutPointParameterizedAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityScreenPointForLayoutPointParameterizedAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityScreenSizeForLayoutSizeParameterizedAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityScreenSizeForLayoutSizeParameterizedAttribute(){
		if(_NSAccessibilityScreenSizeForLayoutSizeParameterizedAttribute != null) return _NSAccessibilityScreenSizeForLayoutSizeParameterizedAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityScreenSizeForLayoutSizeParameterizedAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityScreenSizeForLayoutSizeParameterizedAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityScrollAreaRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityScrollAreaRole(){
		if(_NSAccessibilityScrollAreaRole != null) return _NSAccessibilityScrollAreaRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityScrollAreaRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityScrollAreaRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityScrollBarRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityScrollBarRole(){
		if(_NSAccessibilityScrollBarRole != null) return _NSAccessibilityScrollBarRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityScrollBarRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityScrollBarRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySearchButtonAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySearchButtonAttribute(){
		if(_NSAccessibilitySearchButtonAttribute != null) return _NSAccessibilitySearchButtonAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySearchButtonAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySearchButtonAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySearchFieldSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySearchFieldSubrole(){
		if(_NSAccessibilitySearchFieldSubrole != null) return _NSAccessibilitySearchFieldSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySearchFieldSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySearchFieldSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySearchMenuAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySearchMenuAttribute(){
		if(_NSAccessibilitySearchMenuAttribute != null) return _NSAccessibilitySearchMenuAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySearchMenuAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySearchMenuAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySecureTextFieldSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySecureTextFieldSubrole(){
		if(_NSAccessibilitySecureTextFieldSubrole != null) return _NSAccessibilitySecureTextFieldSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySecureTextFieldSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySecureTextFieldSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySelectedAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySelectedAttribute(){
		if(_NSAccessibilitySelectedAttribute != null) return _NSAccessibilitySelectedAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySelectedAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySelectedAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySelectedCellsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySelectedCellsAttribute(){
		if(_NSAccessibilitySelectedCellsAttribute != null) return _NSAccessibilitySelectedCellsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySelectedCellsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySelectedCellsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySelectedCellsChangedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySelectedCellsChangedNotification(){
		if(_NSAccessibilitySelectedCellsChangedNotification != null) return _NSAccessibilitySelectedCellsChangedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySelectedCellsChangedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySelectedCellsChangedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySelectedChildrenAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySelectedChildrenAttribute(){
		if(_NSAccessibilitySelectedChildrenAttribute != null) return _NSAccessibilitySelectedChildrenAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySelectedChildrenAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySelectedChildrenAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySelectedChildrenChangedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySelectedChildrenChangedNotification(){
		if(_NSAccessibilitySelectedChildrenChangedNotification != null) return _NSAccessibilitySelectedChildrenChangedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySelectedChildrenChangedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySelectedChildrenChangedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySelectedChildrenMovedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySelectedChildrenMovedNotification(){
		if(_NSAccessibilitySelectedChildrenMovedNotification != null) return _NSAccessibilitySelectedChildrenMovedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySelectedChildrenMovedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySelectedChildrenMovedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySelectedColumnsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySelectedColumnsAttribute(){
		if(_NSAccessibilitySelectedColumnsAttribute != null) return _NSAccessibilitySelectedColumnsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySelectedColumnsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySelectedColumnsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySelectedColumnsChangedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySelectedColumnsChangedNotification(){
		if(_NSAccessibilitySelectedColumnsChangedNotification != null) return _NSAccessibilitySelectedColumnsChangedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySelectedColumnsChangedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySelectedColumnsChangedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySelectedRowsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySelectedRowsAttribute(){
		if(_NSAccessibilitySelectedRowsAttribute != null) return _NSAccessibilitySelectedRowsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySelectedRowsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySelectedRowsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySelectedRowsChangedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySelectedRowsChangedNotification(){
		if(_NSAccessibilitySelectedRowsChangedNotification != null) return _NSAccessibilitySelectedRowsChangedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySelectedRowsChangedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySelectedRowsChangedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySelectedTextAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySelectedTextAttribute(){
		if(_NSAccessibilitySelectedTextAttribute != null) return _NSAccessibilitySelectedTextAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySelectedTextAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySelectedTextAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySelectedTextChangedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySelectedTextChangedNotification(){
		if(_NSAccessibilitySelectedTextChangedNotification != null) return _NSAccessibilitySelectedTextChangedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySelectedTextChangedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySelectedTextChangedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySelectedTextRangeAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySelectedTextRangeAttribute(){
		if(_NSAccessibilitySelectedTextRangeAttribute != null) return _NSAccessibilitySelectedTextRangeAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySelectedTextRangeAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySelectedTextRangeAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySelectedTextRangesAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySelectedTextRangesAttribute(){
		if(_NSAccessibilitySelectedTextRangesAttribute != null) return _NSAccessibilitySelectedTextRangesAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySelectedTextRangesAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySelectedTextRangesAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityServesAsTitleForUIElementsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityServesAsTitleForUIElementsAttribute(){
		if(_NSAccessibilityServesAsTitleForUIElementsAttribute != null) return _NSAccessibilityServesAsTitleForUIElementsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityServesAsTitleForUIElementsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityServesAsTitleForUIElementsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityShadowTextAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityShadowTextAttribute(){
		if(_NSAccessibilityShadowTextAttribute != null) return _NSAccessibilityShadowTextAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityShadowTextAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityShadowTextAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySharedCharacterRangeAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySharedCharacterRangeAttribute(){
		if(_NSAccessibilitySharedCharacterRangeAttribute != null) return _NSAccessibilitySharedCharacterRangeAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySharedCharacterRangeAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySharedCharacterRangeAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySharedTextUIElementsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySharedTextUIElementsAttribute(){
		if(_NSAccessibilitySharedTextUIElementsAttribute != null) return _NSAccessibilitySharedTextUIElementsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySharedTextUIElementsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySharedTextUIElementsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySheetCreatedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySheetCreatedNotification(){
		if(_NSAccessibilitySheetCreatedNotification != null) return _NSAccessibilitySheetCreatedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySheetCreatedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySheetCreatedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySheetRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySheetRole(){
		if(_NSAccessibilitySheetRole != null) return _NSAccessibilitySheetRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySheetRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySheetRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityShowMenuAction = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityShowMenuAction(){
		if(_NSAccessibilityShowMenuAction != null) return _NSAccessibilityShowMenuAction;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityShowMenuAction", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityShowMenuAction = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityShownMenuAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityShownMenuAttribute(){
		if(_NSAccessibilityShownMenuAttribute != null) return _NSAccessibilityShownMenuAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityShownMenuAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityShownMenuAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySizeAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySizeAttribute(){
		if(_NSAccessibilitySizeAttribute != null) return _NSAccessibilitySizeAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySizeAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySizeAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySliderRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySliderRole(){
		if(_NSAccessibilitySliderRole != null) return _NSAccessibilitySliderRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySliderRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySliderRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySortButtonRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySortButtonRole(){
		if(_NSAccessibilitySortButtonRole != null) return _NSAccessibilitySortButtonRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySortButtonRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySortButtonRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySortButtonSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySortButtonSubrole(){
		if(_NSAccessibilitySortButtonSubrole != null) return _NSAccessibilitySortButtonSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySortButtonSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySortButtonSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySortDirectionAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySortDirectionAttribute(){
		if(_NSAccessibilitySortDirectionAttribute != null) return _NSAccessibilitySortDirectionAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySortDirectionAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySortDirectionAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySplitGroupRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySplitGroupRole(){
		if(_NSAccessibilitySplitGroupRole != null) return _NSAccessibilitySplitGroupRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySplitGroupRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySplitGroupRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySplitterRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySplitterRole(){
		if(_NSAccessibilitySplitterRole != null) return _NSAccessibilitySplitterRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySplitterRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySplitterRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySplittersAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySplittersAttribute(){
		if(_NSAccessibilitySplittersAttribute != null) return _NSAccessibilitySplittersAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySplittersAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySplittersAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityStandardWindowSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityStandardWindowSubrole(){
		if(_NSAccessibilityStandardWindowSubrole != null) return _NSAccessibilityStandardWindowSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityStandardWindowSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityStandardWindowSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityStaticTextRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityStaticTextRole(){
		if(_NSAccessibilityStaticTextRole != null) return _NSAccessibilityStaticTextRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityStaticTextRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityStaticTextRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityStrikethroughColorTextAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityStrikethroughColorTextAttribute(){
		if(_NSAccessibilityStrikethroughColorTextAttribute != null) return _NSAccessibilityStrikethroughColorTextAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityStrikethroughColorTextAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityStrikethroughColorTextAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityStrikethroughTextAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityStrikethroughTextAttribute(){
		if(_NSAccessibilityStrikethroughTextAttribute != null) return _NSAccessibilityStrikethroughTextAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityStrikethroughTextAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityStrikethroughTextAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityStringForRangeParameterizedAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityStringForRangeParameterizedAttribute(){
		if(_NSAccessibilityStringForRangeParameterizedAttribute != null) return _NSAccessibilityStringForRangeParameterizedAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityStringForRangeParameterizedAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityStringForRangeParameterizedAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityStyleRangeForIndexParameterizedAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityStyleRangeForIndexParameterizedAttribute(){
		if(_NSAccessibilityStyleRangeForIndexParameterizedAttribute != null) return _NSAccessibilityStyleRangeForIndexParameterizedAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityStyleRangeForIndexParameterizedAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityStyleRangeForIndexParameterizedAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySubroleAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySubroleAttribute(){
		if(_NSAccessibilitySubroleAttribute != null) return _NSAccessibilitySubroleAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySubroleAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySubroleAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySuperscriptTextAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySuperscriptTextAttribute(){
		if(_NSAccessibilitySuperscriptTextAttribute != null) return _NSAccessibilitySuperscriptTextAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySuperscriptTextAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySuperscriptTextAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySystemDialogSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySystemDialogSubrole(){
		if(_NSAccessibilitySystemDialogSubrole != null) return _NSAccessibilitySystemDialogSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySystemDialogSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySystemDialogSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySystemFloatingWindowSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySystemFloatingWindowSubrole(){
		if(_NSAccessibilitySystemFloatingWindowSubrole != null) return _NSAccessibilitySystemFloatingWindowSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySystemFloatingWindowSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySystemFloatingWindowSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilitySystemWideRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilitySystemWideRole(){
		if(_NSAccessibilitySystemWideRole != null) return _NSAccessibilitySystemWideRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilitySystemWideRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilitySystemWideRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityTabGroupRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityTabGroupRole(){
		if(_NSAccessibilityTabGroupRole != null) return _NSAccessibilityTabGroupRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityTabGroupRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityTabGroupRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityTableRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityTableRole(){
		if(_NSAccessibilityTableRole != null) return _NSAccessibilityTableRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityTableRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityTableRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityTableRowSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityTableRowSubrole(){
		if(_NSAccessibilityTableRowSubrole != null) return _NSAccessibilityTableRowSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityTableRowSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityTableRowSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityTabsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityTabsAttribute(){
		if(_NSAccessibilityTabsAttribute != null) return _NSAccessibilityTabsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityTabsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityTabsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityTailIndentMarkerTypeValue = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityTailIndentMarkerTypeValue(){
		if(_NSAccessibilityTailIndentMarkerTypeValue != null) return _NSAccessibilityTailIndentMarkerTypeValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityTailIndentMarkerTypeValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityTailIndentMarkerTypeValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityTextAreaRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityTextAreaRole(){
		if(_NSAccessibilityTextAreaRole != null) return _NSAccessibilityTextAreaRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityTextAreaRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityTextAreaRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityTextAttachmentSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityTextAttachmentSubrole(){
		if(_NSAccessibilityTextAttachmentSubrole != null) return _NSAccessibilityTextAttachmentSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityTextAttachmentSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityTextAttachmentSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityTextFieldRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityTextFieldRole(){
		if(_NSAccessibilityTextFieldRole != null) return _NSAccessibilityTextFieldRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityTextFieldRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityTextFieldRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityTextLinkSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityTextLinkSubrole(){
		if(_NSAccessibilityTextLinkSubrole != null) return _NSAccessibilityTextLinkSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityTextLinkSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityTextLinkSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityTimelineSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityTimelineSubrole(){
		if(_NSAccessibilityTimelineSubrole != null) return _NSAccessibilityTimelineSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityTimelineSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityTimelineSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityTitleAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityTitleAttribute(){
		if(_NSAccessibilityTitleAttribute != null) return _NSAccessibilityTitleAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityTitleAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityTitleAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityTitleChangedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityTitleChangedNotification(){
		if(_NSAccessibilityTitleChangedNotification != null) return _NSAccessibilityTitleChangedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityTitleChangedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityTitleChangedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityTitleUIElementAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityTitleUIElementAttribute(){
		if(_NSAccessibilityTitleUIElementAttribute != null) return _NSAccessibilityTitleUIElementAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityTitleUIElementAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityTitleUIElementAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityToolbarButtonAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityToolbarButtonAttribute(){
		if(_NSAccessibilityToolbarButtonAttribute != null) return _NSAccessibilityToolbarButtonAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityToolbarButtonAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityToolbarButtonAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityToolbarButtonSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityToolbarButtonSubrole(){
		if(_NSAccessibilityToolbarButtonSubrole != null) return _NSAccessibilityToolbarButtonSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityToolbarButtonSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityToolbarButtonSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityToolbarRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityToolbarRole(){
		if(_NSAccessibilityToolbarRole != null) return _NSAccessibilityToolbarRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityToolbarRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityToolbarRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityTopLevelUIElementAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityTopLevelUIElementAttribute(){
		if(_NSAccessibilityTopLevelUIElementAttribute != null) return _NSAccessibilityTopLevelUIElementAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityTopLevelUIElementAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityTopLevelUIElementAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityUIElementDestroyedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityUIElementDestroyedNotification(){
		if(_NSAccessibilityUIElementDestroyedNotification != null) return _NSAccessibilityUIElementDestroyedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityUIElementDestroyedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityUIElementDestroyedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityURLAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityURLAttribute(){
		if(_NSAccessibilityURLAttribute != null) return _NSAccessibilityURLAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityURLAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityURLAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityUnderlineColorTextAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityUnderlineColorTextAttribute(){
		if(_NSAccessibilityUnderlineColorTextAttribute != null) return _NSAccessibilityUnderlineColorTextAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityUnderlineColorTextAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityUnderlineColorTextAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityUnderlineTextAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityUnderlineTextAttribute(){
		if(_NSAccessibilityUnderlineTextAttribute != null) return _NSAccessibilityUnderlineTextAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityUnderlineTextAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityUnderlineTextAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityUnitDescriptionAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityUnitDescriptionAttribute(){
		if(_NSAccessibilityUnitDescriptionAttribute != null) return _NSAccessibilityUnitDescriptionAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityUnitDescriptionAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityUnitDescriptionAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityUnitsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityUnitsAttribute(){
		if(_NSAccessibilityUnitsAttribute != null) return _NSAccessibilityUnitsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityUnitsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityUnitsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityUnitsChangedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityUnitsChangedNotification(){
		if(_NSAccessibilityUnitsChangedNotification != null) return _NSAccessibilityUnitsChangedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityUnitsChangedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityUnitsChangedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityUnknownMarkerTypeValue = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityUnknownMarkerTypeValue(){
		if(_NSAccessibilityUnknownMarkerTypeValue != null) return _NSAccessibilityUnknownMarkerTypeValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityUnknownMarkerTypeValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityUnknownMarkerTypeValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityUnknownOrientationValue = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityUnknownOrientationValue(){
		if(_NSAccessibilityUnknownOrientationValue != null) return _NSAccessibilityUnknownOrientationValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityUnknownOrientationValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityUnknownOrientationValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityUnknownRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityUnknownRole(){
		if(_NSAccessibilityUnknownRole != null) return _NSAccessibilityUnknownRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityUnknownRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityUnknownRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityUnknownSortDirectionValue = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityUnknownSortDirectionValue(){
		if(_NSAccessibilityUnknownSortDirectionValue != null) return _NSAccessibilityUnknownSortDirectionValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityUnknownSortDirectionValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityUnknownSortDirectionValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityUnknownSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityUnknownSubrole(){
		if(_NSAccessibilityUnknownSubrole != null) return _NSAccessibilityUnknownSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityUnknownSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityUnknownSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityUnknownUnitValue = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityUnknownUnitValue(){
		if(_NSAccessibilityUnknownUnitValue != null) return _NSAccessibilityUnknownUnitValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityUnknownUnitValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityUnknownUnitValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityValueAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityValueAttribute(){
		if(_NSAccessibilityValueAttribute != null) return _NSAccessibilityValueAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityValueAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityValueAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityValueChangedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityValueChangedNotification(){
		if(_NSAccessibilityValueChangedNotification != null) return _NSAccessibilityValueChangedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityValueChangedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityValueChangedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityValueDescriptionAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityValueDescriptionAttribute(){
		if(_NSAccessibilityValueDescriptionAttribute != null) return _NSAccessibilityValueDescriptionAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityValueDescriptionAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityValueDescriptionAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityValueIndicatorRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityValueIndicatorRole(){
		if(_NSAccessibilityValueIndicatorRole != null) return _NSAccessibilityValueIndicatorRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityValueIndicatorRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityValueIndicatorRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityVerticalOrientationValue = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityVerticalOrientationValue(){
		if(_NSAccessibilityVerticalOrientationValue != null) return _NSAccessibilityVerticalOrientationValue;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityVerticalOrientationValue", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityVerticalOrientationValue = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityVerticalScrollBarAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityVerticalScrollBarAttribute(){
		if(_NSAccessibilityVerticalScrollBarAttribute != null) return _NSAccessibilityVerticalScrollBarAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityVerticalScrollBarAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityVerticalScrollBarAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityVerticalUnitDescriptionAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityVerticalUnitDescriptionAttribute(){
		if(_NSAccessibilityVerticalUnitDescriptionAttribute != null) return _NSAccessibilityVerticalUnitDescriptionAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityVerticalUnitDescriptionAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityVerticalUnitDescriptionAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityVerticalUnitsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityVerticalUnitsAttribute(){
		if(_NSAccessibilityVerticalUnitsAttribute != null) return _NSAccessibilityVerticalUnitsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityVerticalUnitsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityVerticalUnitsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityVisibleCellsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityVisibleCellsAttribute(){
		if(_NSAccessibilityVisibleCellsAttribute != null) return _NSAccessibilityVisibleCellsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityVisibleCellsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityVisibleCellsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityVisibleCharacterRangeAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityVisibleCharacterRangeAttribute(){
		if(_NSAccessibilityVisibleCharacterRangeAttribute != null) return _NSAccessibilityVisibleCharacterRangeAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityVisibleCharacterRangeAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityVisibleCharacterRangeAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityVisibleChildrenAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityVisibleChildrenAttribute(){
		if(_NSAccessibilityVisibleChildrenAttribute != null) return _NSAccessibilityVisibleChildrenAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityVisibleChildrenAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityVisibleChildrenAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityVisibleColumnsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityVisibleColumnsAttribute(){
		if(_NSAccessibilityVisibleColumnsAttribute != null) return _NSAccessibilityVisibleColumnsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityVisibleColumnsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityVisibleColumnsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityVisibleNameKey = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityVisibleNameKey(){
		if(_NSAccessibilityVisibleNameKey != null) return _NSAccessibilityVisibleNameKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityVisibleNameKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityVisibleNameKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityVisibleRowsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityVisibleRowsAttribute(){
		if(_NSAccessibilityVisibleRowsAttribute != null) return _NSAccessibilityVisibleRowsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityVisibleRowsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityVisibleRowsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityWarningValueAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityWarningValueAttribute(){
		if(_NSAccessibilityWarningValueAttribute != null) return _NSAccessibilityWarningValueAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityWarningValueAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityWarningValueAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityWindowAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityWindowAttribute(){
		if(_NSAccessibilityWindowAttribute != null) return _NSAccessibilityWindowAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityWindowAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityWindowAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityWindowCreatedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityWindowCreatedNotification(){
		if(_NSAccessibilityWindowCreatedNotification != null) return _NSAccessibilityWindowCreatedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityWindowCreatedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityWindowCreatedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityWindowDeminiaturizedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityWindowDeminiaturizedNotification(){
		if(_NSAccessibilityWindowDeminiaturizedNotification != null) return _NSAccessibilityWindowDeminiaturizedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityWindowDeminiaturizedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityWindowDeminiaturizedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityWindowMiniaturizedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityWindowMiniaturizedNotification(){
		if(_NSAccessibilityWindowMiniaturizedNotification != null) return _NSAccessibilityWindowMiniaturizedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityWindowMiniaturizedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityWindowMiniaturizedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityWindowMovedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityWindowMovedNotification(){
		if(_NSAccessibilityWindowMovedNotification != null) return _NSAccessibilityWindowMovedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityWindowMovedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityWindowMovedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityWindowResizedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityWindowResizedNotification(){
		if(_NSAccessibilityWindowResizedNotification != null) return _NSAccessibilityWindowResizedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityWindowResizedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityWindowResizedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityWindowRole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityWindowRole(){
		if(_NSAccessibilityWindowRole != null) return _NSAccessibilityWindowRole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityWindowRole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityWindowRole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityWindowsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityWindowsAttribute(){
		if(_NSAccessibilityWindowsAttribute != null) return _NSAccessibilityWindowsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityWindowsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityWindowsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityZoomButtonAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityZoomButtonAttribute(){
		if(_NSAccessibilityZoomButtonAttribute != null) return _NSAccessibilityZoomButtonAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityZoomButtonAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityZoomButtonAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAccessibilityZoomButtonSubrole = null;
	 final public com.apple.jobjc.foundation.NSString NSAccessibilityZoomButtonSubrole(){
		if(_NSAccessibilityZoomButtonSubrole != null) return _NSAccessibilityZoomButtonSubrole;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAccessibilityZoomButtonSubrole", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAccessibilityZoomButtonSubrole = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAlignmentBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSAlignmentBinding(){
		if(_NSAlignmentBinding != null) return _NSAlignmentBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAlignmentBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAlignmentBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAllRomanInputSourcesLocaleIdentifier = null;
	 final public com.apple.jobjc.foundation.NSString NSAllRomanInputSourcesLocaleIdentifier(){
		if(_NSAllRomanInputSourcesLocaleIdentifier != null) return _NSAllRomanInputSourcesLocaleIdentifier;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAllRomanInputSourcesLocaleIdentifier", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAllRomanInputSourcesLocaleIdentifier = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAllowsEditingMultipleValuesSelectionBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSAllowsEditingMultipleValuesSelectionBindingOption(){
		if(_NSAllowsEditingMultipleValuesSelectionBindingOption != null) return _NSAllowsEditingMultipleValuesSelectionBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAllowsEditingMultipleValuesSelectionBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAllowsEditingMultipleValuesSelectionBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAllowsNullArgumentBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSAllowsNullArgumentBindingOption(){
		if(_NSAllowsNullArgumentBindingOption != null) return _NSAllowsNullArgumentBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAllowsNullArgumentBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAllowsNullArgumentBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAlternateImageBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSAlternateImageBinding(){
		if(_NSAlternateImageBinding != null) return _NSAlternateImageBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAlternateImageBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAlternateImageBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAlternateTitleBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSAlternateTitleBinding(){
		if(_NSAlternateTitleBinding != null) return _NSAlternateTitleBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAlternateTitleBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAlternateTitleBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAlwaysPresentsApplicationModalAlertsBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSAlwaysPresentsApplicationModalAlertsBindingOption(){
		if(_NSAlwaysPresentsApplicationModalAlertsBindingOption != null) return _NSAlwaysPresentsApplicationModalAlertsBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAlwaysPresentsApplicationModalAlertsBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAlwaysPresentsApplicationModalAlertsBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAnimateBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSAnimateBinding(){
		if(_NSAnimateBinding != null) return _NSAnimateBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAnimateBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAnimateBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAnimationDelayBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSAnimationDelayBinding(){
		if(_NSAnimationDelayBinding != null) return _NSAnimationDelayBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAnimationDelayBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAnimationDelayBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAnimationProgressMark = null;
	 final public com.apple.jobjc.foundation.NSString NSAnimationProgressMark(){
		if(_NSAnimationProgressMark != null) return _NSAnimationProgressMark;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAnimationProgressMark", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAnimationProgressMark = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAnimationProgressMarkNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAnimationProgressMarkNotification(){
		if(_NSAnimationProgressMarkNotification != null) return _NSAnimationProgressMarkNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAnimationProgressMarkNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAnimationProgressMarkNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAnimationTriggerOrderIn = null;
	 final public com.apple.jobjc.foundation.NSString NSAnimationTriggerOrderIn(){
		if(_NSAnimationTriggerOrderIn != null) return _NSAnimationTriggerOrderIn;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAnimationTriggerOrderIn", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAnimationTriggerOrderIn = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAnimationTriggerOrderOut = null;
	 final public com.apple.jobjc.foundation.NSString NSAnimationTriggerOrderOut(){
		if(_NSAnimationTriggerOrderOut != null) return _NSAnimationTriggerOrderOut;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAnimationTriggerOrderOut", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAnimationTriggerOrderOut = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAntialiasThresholdChangedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSAntialiasThresholdChangedNotification(){
		if(_NSAntialiasThresholdChangedNotification != null) return _NSAntialiasThresholdChangedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAntialiasThresholdChangedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAntialiasThresholdChangedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.ID _NSApp = null;
	 final public <T extends com.apple.jobjc.ID> T NSApp(){
		if(_NSApp != null) return (T)_NSApp;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApp", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApp = returnValue;
		return (T)returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAppKitIgnoredException = null;
	 final public com.apple.jobjc.foundation.NSString NSAppKitIgnoredException(){
		if(_NSAppKitIgnoredException != null) return _NSAppKitIgnoredException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAppKitIgnoredException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAppKitIgnoredException = returnValue;
		return returnValue;
	}

	private double _NSAppKitVersionNumber = 0;
	 final public double NSAppKitVersionNumber(){
		if(_NSAppKitVersionNumber != 0) return _NSAppKitVersionNumber;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAppKitVersionNumber", nativeBuffer, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.sizeof());
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		_NSAppKitVersionNumber = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAppKitVirtualMemoryException = null;
	 final public com.apple.jobjc.foundation.NSString NSAppKitVirtualMemoryException(){
		if(_NSAppKitVirtualMemoryException != null) return _NSAppKitVirtualMemoryException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAppKitVirtualMemoryException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAppKitVirtualMemoryException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSApplicationDidBecomeActiveNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSApplicationDidBecomeActiveNotification(){
		if(_NSApplicationDidBecomeActiveNotification != null) return _NSApplicationDidBecomeActiveNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApplicationDidBecomeActiveNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApplicationDidBecomeActiveNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSApplicationDidChangeScreenParametersNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSApplicationDidChangeScreenParametersNotification(){
		if(_NSApplicationDidChangeScreenParametersNotification != null) return _NSApplicationDidChangeScreenParametersNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApplicationDidChangeScreenParametersNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApplicationDidChangeScreenParametersNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSApplicationDidFinishLaunchingNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSApplicationDidFinishLaunchingNotification(){
		if(_NSApplicationDidFinishLaunchingNotification != null) return _NSApplicationDidFinishLaunchingNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApplicationDidFinishLaunchingNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApplicationDidFinishLaunchingNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSApplicationDidFinishRestoringWindowsNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSApplicationDidFinishRestoringWindowsNotification(){
		if(_NSApplicationDidFinishRestoringWindowsNotification != null) return _NSApplicationDidFinishRestoringWindowsNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApplicationDidFinishRestoringWindowsNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApplicationDidFinishRestoringWindowsNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSApplicationDidHideNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSApplicationDidHideNotification(){
		if(_NSApplicationDidHideNotification != null) return _NSApplicationDidHideNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApplicationDidHideNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApplicationDidHideNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSApplicationDidResignActiveNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSApplicationDidResignActiveNotification(){
		if(_NSApplicationDidResignActiveNotification != null) return _NSApplicationDidResignActiveNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApplicationDidResignActiveNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApplicationDidResignActiveNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSApplicationDidUnhideNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSApplicationDidUnhideNotification(){
		if(_NSApplicationDidUnhideNotification != null) return _NSApplicationDidUnhideNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApplicationDidUnhideNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApplicationDidUnhideNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSApplicationDidUpdateNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSApplicationDidUpdateNotification(){
		if(_NSApplicationDidUpdateNotification != null) return _NSApplicationDidUpdateNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApplicationDidUpdateNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApplicationDidUpdateNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSApplicationFileType = null;
	 final public com.apple.jobjc.foundation.NSString NSApplicationFileType(){
		if(_NSApplicationFileType != null) return _NSApplicationFileType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApplicationFileType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApplicationFileType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSApplicationLaunchIsDefaultLaunchKey = null;
	 final public com.apple.jobjc.foundation.NSString NSApplicationLaunchIsDefaultLaunchKey(){
		if(_NSApplicationLaunchIsDefaultLaunchKey != null) return _NSApplicationLaunchIsDefaultLaunchKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApplicationLaunchIsDefaultLaunchKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApplicationLaunchIsDefaultLaunchKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSApplicationLaunchRemoteNotificationKey = null;
	 final public com.apple.jobjc.foundation.NSString NSApplicationLaunchRemoteNotificationKey(){
		if(_NSApplicationLaunchRemoteNotificationKey != null) return _NSApplicationLaunchRemoteNotificationKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApplicationLaunchRemoteNotificationKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApplicationLaunchRemoteNotificationKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSApplicationLaunchUserNotificationKey = null;
	 final public com.apple.jobjc.foundation.NSString NSApplicationLaunchUserNotificationKey(){
		if(_NSApplicationLaunchUserNotificationKey != null) return _NSApplicationLaunchUserNotificationKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApplicationLaunchUserNotificationKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApplicationLaunchUserNotificationKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSApplicationWillBecomeActiveNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSApplicationWillBecomeActiveNotification(){
		if(_NSApplicationWillBecomeActiveNotification != null) return _NSApplicationWillBecomeActiveNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApplicationWillBecomeActiveNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApplicationWillBecomeActiveNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSApplicationWillFinishLaunchingNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSApplicationWillFinishLaunchingNotification(){
		if(_NSApplicationWillFinishLaunchingNotification != null) return _NSApplicationWillFinishLaunchingNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApplicationWillFinishLaunchingNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApplicationWillFinishLaunchingNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSApplicationWillHideNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSApplicationWillHideNotification(){
		if(_NSApplicationWillHideNotification != null) return _NSApplicationWillHideNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApplicationWillHideNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApplicationWillHideNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSApplicationWillResignActiveNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSApplicationWillResignActiveNotification(){
		if(_NSApplicationWillResignActiveNotification != null) return _NSApplicationWillResignActiveNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApplicationWillResignActiveNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApplicationWillResignActiveNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSApplicationWillTerminateNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSApplicationWillTerminateNotification(){
		if(_NSApplicationWillTerminateNotification != null) return _NSApplicationWillTerminateNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApplicationWillTerminateNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApplicationWillTerminateNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSApplicationWillUnhideNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSApplicationWillUnhideNotification(){
		if(_NSApplicationWillUnhideNotification != null) return _NSApplicationWillUnhideNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApplicationWillUnhideNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApplicationWillUnhideNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSApplicationWillUpdateNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSApplicationWillUpdateNotification(){
		if(_NSApplicationWillUpdateNotification != null) return _NSApplicationWillUpdateNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSApplicationWillUpdateNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSApplicationWillUpdateNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSArgumentBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSArgumentBinding(){
		if(_NSArgumentBinding != null) return _NSArgumentBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSArgumentBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSArgumentBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAttachmentAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSAttachmentAttributeName(){
		if(_NSAttachmentAttributeName != null) return _NSAttachmentAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAttachmentAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAttachmentAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAttributedStringBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSAttributedStringBinding(){
		if(_NSAttributedStringBinding != null) return _NSAttributedStringBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAttributedStringBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAttributedStringBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSAuthorDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSAuthorDocumentAttribute(){
		if(_NSAuthorDocumentAttribute != null) return _NSAuthorDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSAuthorDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSAuthorDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSBackgroundColorAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSBackgroundColorAttributeName(){
		if(_NSBackgroundColorAttributeName != null) return _NSBackgroundColorAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSBackgroundColorAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSBackgroundColorAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSBackgroundColorDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSBackgroundColorDocumentAttribute(){
		if(_NSBackgroundColorDocumentAttribute != null) return _NSBackgroundColorDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSBackgroundColorDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSBackgroundColorDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSBackingPropertyOldColorSpaceKey = null;
	 final public com.apple.jobjc.foundation.NSString NSBackingPropertyOldColorSpaceKey(){
		if(_NSBackingPropertyOldColorSpaceKey != null) return _NSBackingPropertyOldColorSpaceKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSBackingPropertyOldColorSpaceKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSBackingPropertyOldColorSpaceKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSBackingPropertyOldScaleFactorKey = null;
	 final public com.apple.jobjc.foundation.NSString NSBackingPropertyOldScaleFactorKey(){
		if(_NSBackingPropertyOldScaleFactorKey != null) return _NSBackingPropertyOldScaleFactorKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSBackingPropertyOldScaleFactorKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSBackingPropertyOldScaleFactorKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSBadBitmapParametersException = null;
	 final public com.apple.jobjc.foundation.NSString NSBadBitmapParametersException(){
		if(_NSBadBitmapParametersException != null) return _NSBadBitmapParametersException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSBadBitmapParametersException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSBadBitmapParametersException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSBadComparisonException = null;
	 final public com.apple.jobjc.foundation.NSString NSBadComparisonException(){
		if(_NSBadComparisonException != null) return _NSBadComparisonException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSBadComparisonException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSBadComparisonException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSBadRTFColorTableException = null;
	 final public com.apple.jobjc.foundation.NSString NSBadRTFColorTableException(){
		if(_NSBadRTFColorTableException != null) return _NSBadRTFColorTableException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSBadRTFColorTableException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSBadRTFColorTableException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSBadRTFDirectiveException = null;
	 final public com.apple.jobjc.foundation.NSString NSBadRTFDirectiveException(){
		if(_NSBadRTFDirectiveException != null) return _NSBadRTFDirectiveException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSBadRTFDirectiveException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSBadRTFDirectiveException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSBadRTFFontTableException = null;
	 final public com.apple.jobjc.foundation.NSString NSBadRTFFontTableException(){
		if(_NSBadRTFFontTableException != null) return _NSBadRTFFontTableException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSBadRTFFontTableException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSBadRTFFontTableException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSBadRTFStyleSheetException = null;
	 final public com.apple.jobjc.foundation.NSString NSBadRTFStyleSheetException(){
		if(_NSBadRTFStyleSheetException != null) return _NSBadRTFStyleSheetException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSBadRTFStyleSheetException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSBadRTFStyleSheetException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSBaseURLDocumentOption = null;
	 final public com.apple.jobjc.foundation.NSString NSBaseURLDocumentOption(){
		if(_NSBaseURLDocumentOption != null) return _NSBaseURLDocumentOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSBaseURLDocumentOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSBaseURLDocumentOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSBaselineOffsetAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSBaselineOffsetAttributeName(){
		if(_NSBaselineOffsetAttributeName != null) return _NSBaselineOffsetAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSBaselineOffsetAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSBaselineOffsetAttributeName = returnValue;
		return returnValue;
	}

	private double _NSBlack = 0;
	 final public double NSBlack(){
		if(_NSBlack != 0) return _NSBlack;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSBlack", nativeBuffer, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.sizeof());
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		_NSBlack = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSBottomMarginDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSBottomMarginDocumentAttribute(){
		if(_NSBottomMarginDocumentAttribute != null) return _NSBottomMarginDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSBottomMarginDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSBottomMarginDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSBrowserColumnConfigurationDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSBrowserColumnConfigurationDidChangeNotification(){
		if(_NSBrowserColumnConfigurationDidChangeNotification != null) return _NSBrowserColumnConfigurationDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSBrowserColumnConfigurationDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSBrowserColumnConfigurationDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSBrowserIllegalDelegateException = null;
	 final public com.apple.jobjc.foundation.NSString NSBrowserIllegalDelegateException(){
		if(_NSBrowserIllegalDelegateException != null) return _NSBrowserIllegalDelegateException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSBrowserIllegalDelegateException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSBrowserIllegalDelegateException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCalibratedBlackColorSpace = null;
	 final public com.apple.jobjc.foundation.NSString NSCalibratedBlackColorSpace(){
		if(_NSCalibratedBlackColorSpace != null) return _NSCalibratedBlackColorSpace;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCalibratedBlackColorSpace", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCalibratedBlackColorSpace = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCalibratedRGBColorSpace = null;
	 final public com.apple.jobjc.foundation.NSString NSCalibratedRGBColorSpace(){
		if(_NSCalibratedRGBColorSpace != null) return _NSCalibratedRGBColorSpace;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCalibratedRGBColorSpace", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCalibratedRGBColorSpace = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCalibratedWhiteColorSpace = null;
	 final public com.apple.jobjc.foundation.NSString NSCalibratedWhiteColorSpace(){
		if(_NSCalibratedWhiteColorSpace != null) return _NSCalibratedWhiteColorSpace;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCalibratedWhiteColorSpace", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCalibratedWhiteColorSpace = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCategoryDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSCategoryDocumentAttribute(){
		if(_NSCategoryDocumentAttribute != null) return _NSCategoryDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCategoryDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCategoryDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCharacterEncodingDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSCharacterEncodingDocumentAttribute(){
		if(_NSCharacterEncodingDocumentAttribute != null) return _NSCharacterEncodingDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCharacterEncodingDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCharacterEncodingDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCharacterEncodingDocumentOption = null;
	 final public com.apple.jobjc.foundation.NSString NSCharacterEncodingDocumentOption(){
		if(_NSCharacterEncodingDocumentOption != null) return _NSCharacterEncodingDocumentOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCharacterEncodingDocumentOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCharacterEncodingDocumentOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCharacterShapeAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSCharacterShapeAttributeName(){
		if(_NSCharacterShapeAttributeName != null) return _NSCharacterShapeAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCharacterShapeAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCharacterShapeAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCocoaVersionDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSCocoaVersionDocumentAttribute(){
		if(_NSCocoaVersionDocumentAttribute != null) return _NSCocoaVersionDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCocoaVersionDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCocoaVersionDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSColorListDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSColorListDidChangeNotification(){
		if(_NSColorListDidChangeNotification != null) return _NSColorListDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSColorListDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSColorListDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSColorListIOException = null;
	 final public com.apple.jobjc.foundation.NSString NSColorListIOException(){
		if(_NSColorListIOException != null) return _NSColorListIOException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSColorListIOException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSColorListIOException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSColorListNotEditableException = null;
	 final public com.apple.jobjc.foundation.NSString NSColorListNotEditableException(){
		if(_NSColorListNotEditableException != null) return _NSColorListNotEditableException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSColorListNotEditableException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSColorListNotEditableException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSColorPanelColorDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSColorPanelColorDidChangeNotification(){
		if(_NSColorPanelColorDidChangeNotification != null) return _NSColorPanelColorDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSColorPanelColorDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSColorPanelColorDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSColorPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSColorPboardType(){
		if(_NSColorPboardType != null) return _NSColorPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSColorPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSColorPboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSComboBoxSelectionDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSComboBoxSelectionDidChangeNotification(){
		if(_NSComboBoxSelectionDidChangeNotification != null) return _NSComboBoxSelectionDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSComboBoxSelectionDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSComboBoxSelectionDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSComboBoxSelectionIsChangingNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSComboBoxSelectionIsChangingNotification(){
		if(_NSComboBoxSelectionIsChangingNotification != null) return _NSComboBoxSelectionIsChangingNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSComboBoxSelectionIsChangingNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSComboBoxSelectionIsChangingNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSComboBoxWillDismissNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSComboBoxWillDismissNotification(){
		if(_NSComboBoxWillDismissNotification != null) return _NSComboBoxWillDismissNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSComboBoxWillDismissNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSComboBoxWillDismissNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSComboBoxWillPopUpNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSComboBoxWillPopUpNotification(){
		if(_NSComboBoxWillPopUpNotification != null) return _NSComboBoxWillPopUpNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSComboBoxWillPopUpNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSComboBoxWillPopUpNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCommentDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSCommentDocumentAttribute(){
		if(_NSCommentDocumentAttribute != null) return _NSCommentDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCommentDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCommentDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCompanyDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSCompanyDocumentAttribute(){
		if(_NSCompanyDocumentAttribute != null) return _NSCompanyDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCompanyDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCompanyDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSConditionallySetsEditableBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSConditionallySetsEditableBindingOption(){
		if(_NSConditionallySetsEditableBindingOption != null) return _NSConditionallySetsEditableBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSConditionallySetsEditableBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSConditionallySetsEditableBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSConditionallySetsEnabledBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSConditionallySetsEnabledBindingOption(){
		if(_NSConditionallySetsEnabledBindingOption != null) return _NSConditionallySetsEnabledBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSConditionallySetsEnabledBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSConditionallySetsEnabledBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSConditionallySetsHiddenBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSConditionallySetsHiddenBindingOption(){
		if(_NSConditionallySetsHiddenBindingOption != null) return _NSConditionallySetsHiddenBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSConditionallySetsHiddenBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSConditionallySetsHiddenBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSContentArrayBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSContentArrayBinding(){
		if(_NSContentArrayBinding != null) return _NSContentArrayBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSContentArrayBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSContentArrayBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSContentArrayForMultipleSelectionBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSContentArrayForMultipleSelectionBinding(){
		if(_NSContentArrayForMultipleSelectionBinding != null) return _NSContentArrayForMultipleSelectionBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSContentArrayForMultipleSelectionBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSContentArrayForMultipleSelectionBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSContentBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSContentBinding(){
		if(_NSContentBinding != null) return _NSContentBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSContentBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSContentBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSContentDictionaryBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSContentDictionaryBinding(){
		if(_NSContentDictionaryBinding != null) return _NSContentDictionaryBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSContentDictionaryBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSContentDictionaryBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSContentHeightBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSContentHeightBinding(){
		if(_NSContentHeightBinding != null) return _NSContentHeightBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSContentHeightBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSContentHeightBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSContentObjectBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSContentObjectBinding(){
		if(_NSContentObjectBinding != null) return _NSContentObjectBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSContentObjectBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSContentObjectBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSContentObjectsBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSContentObjectsBinding(){
		if(_NSContentObjectsBinding != null) return _NSContentObjectsBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSContentObjectsBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSContentObjectsBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSContentPlacementTagBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSContentPlacementTagBindingOption(){
		if(_NSContentPlacementTagBindingOption != null) return _NSContentPlacementTagBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSContentPlacementTagBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSContentPlacementTagBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSContentSetBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSContentSetBinding(){
		if(_NSContentSetBinding != null) return _NSContentSetBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSContentSetBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSContentSetBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSContentValuesBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSContentValuesBinding(){
		if(_NSContentValuesBinding != null) return _NSContentValuesBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSContentValuesBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSContentValuesBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSContentWidthBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSContentWidthBinding(){
		if(_NSContentWidthBinding != null) return _NSContentWidthBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSContentWidthBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSContentWidthBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSContextHelpModeDidActivateNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSContextHelpModeDidActivateNotification(){
		if(_NSContextHelpModeDidActivateNotification != null) return _NSContextHelpModeDidActivateNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSContextHelpModeDidActivateNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSContextHelpModeDidActivateNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSContextHelpModeDidDeactivateNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSContextHelpModeDidDeactivateNotification(){
		if(_NSContextHelpModeDidDeactivateNotification != null) return _NSContextHelpModeDidDeactivateNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSContextHelpModeDidDeactivateNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSContextHelpModeDidDeactivateNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSContinuouslyUpdatesValueBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSContinuouslyUpdatesValueBindingOption(){
		if(_NSContinuouslyUpdatesValueBindingOption != null) return _NSContinuouslyUpdatesValueBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSContinuouslyUpdatesValueBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSContinuouslyUpdatesValueBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSControlTextDidBeginEditingNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSControlTextDidBeginEditingNotification(){
		if(_NSControlTextDidBeginEditingNotification != null) return _NSControlTextDidBeginEditingNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSControlTextDidBeginEditingNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSControlTextDidBeginEditingNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSControlTextDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSControlTextDidChangeNotification(){
		if(_NSControlTextDidChangeNotification != null) return _NSControlTextDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSControlTextDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSControlTextDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSControlTextDidEndEditingNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSControlTextDidEndEditingNotification(){
		if(_NSControlTextDidEndEditingNotification != null) return _NSControlTextDidEndEditingNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSControlTextDidEndEditingNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSControlTextDidEndEditingNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSControlTintDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSControlTintDidChangeNotification(){
		if(_NSControlTintDidChangeNotification != null) return _NSControlTintDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSControlTintDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSControlTintDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSConvertedDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSConvertedDocumentAttribute(){
		if(_NSConvertedDocumentAttribute != null) return _NSConvertedDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSConvertedDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSConvertedDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCopyrightDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSCopyrightDocumentAttribute(){
		if(_NSCopyrightDocumentAttribute != null) return _NSCopyrightDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCopyrightDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCopyrightDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCreatesSortDescriptorBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSCreatesSortDescriptorBindingOption(){
		if(_NSCreatesSortDescriptorBindingOption != null) return _NSCreatesSortDescriptorBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCreatesSortDescriptorBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCreatesSortDescriptorBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCreationTimeDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSCreationTimeDocumentAttribute(){
		if(_NSCreationTimeDocumentAttribute != null) return _NSCreationTimeDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCreationTimeDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCreationTimeDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCriticalValueBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSCriticalValueBinding(){
		if(_NSCriticalValueBinding != null) return _NSCriticalValueBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCriticalValueBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCriticalValueBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCursorAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSCursorAttributeName(){
		if(_NSCursorAttributeName != null) return _NSCursorAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCursorAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCursorAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSCustomColorSpace = null;
	 final public com.apple.jobjc.foundation.NSString NSCustomColorSpace(){
		if(_NSCustomColorSpace != null) return _NSCustomColorSpace;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSCustomColorSpace", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSCustomColorSpace = returnValue;
		return returnValue;
	}

	private double _NSDarkGray = 0;
	 final public double NSDarkGray(){
		if(_NSDarkGray != 0) return _NSDarkGray;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDarkGray", nativeBuffer, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.sizeof());
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		_NSDarkGray = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDataBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSDataBinding(){
		if(_NSDataBinding != null) return _NSDataBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDataBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDataBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDefaultAttributesDocumentOption = null;
	 final public com.apple.jobjc.foundation.NSString NSDefaultAttributesDocumentOption(){
		if(_NSDefaultAttributesDocumentOption != null) return _NSDefaultAttributesDocumentOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDefaultAttributesDocumentOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDefaultAttributesDocumentOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDefaultTabIntervalDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSDefaultTabIntervalDocumentAttribute(){
		if(_NSDefaultTabIntervalDocumentAttribute != null) return _NSDefaultTabIntervalDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDefaultTabIntervalDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDefaultTabIntervalDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDefinitionPresentationTypeDictionaryApplication = null;
	 final public com.apple.jobjc.foundation.NSString NSDefinitionPresentationTypeDictionaryApplication(){
		if(_NSDefinitionPresentationTypeDictionaryApplication != null) return _NSDefinitionPresentationTypeDictionaryApplication;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDefinitionPresentationTypeDictionaryApplication", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDefinitionPresentationTypeDictionaryApplication = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDefinitionPresentationTypeKey = null;
	 final public com.apple.jobjc.foundation.NSString NSDefinitionPresentationTypeKey(){
		if(_NSDefinitionPresentationTypeKey != null) return _NSDefinitionPresentationTypeKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDefinitionPresentationTypeKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDefinitionPresentationTypeKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDefinitionPresentationTypeOverlay = null;
	 final public com.apple.jobjc.foundation.NSString NSDefinitionPresentationTypeOverlay(){
		if(_NSDefinitionPresentationTypeOverlay != null) return _NSDefinitionPresentationTypeOverlay;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDefinitionPresentationTypeOverlay", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDefinitionPresentationTypeOverlay = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDeletesObjectsOnRemoveBindingsOption = null;
	 final public com.apple.jobjc.foundation.NSString NSDeletesObjectsOnRemoveBindingsOption(){
		if(_NSDeletesObjectsOnRemoveBindingsOption != null) return _NSDeletesObjectsOnRemoveBindingsOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDeletesObjectsOnRemoveBindingsOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDeletesObjectsOnRemoveBindingsOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDeviceBitsPerSample = null;
	 final public com.apple.jobjc.foundation.NSString NSDeviceBitsPerSample(){
		if(_NSDeviceBitsPerSample != null) return _NSDeviceBitsPerSample;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDeviceBitsPerSample", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDeviceBitsPerSample = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDeviceBlackColorSpace = null;
	 final public com.apple.jobjc.foundation.NSString NSDeviceBlackColorSpace(){
		if(_NSDeviceBlackColorSpace != null) return _NSDeviceBlackColorSpace;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDeviceBlackColorSpace", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDeviceBlackColorSpace = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDeviceCMYKColorSpace = null;
	 final public com.apple.jobjc.foundation.NSString NSDeviceCMYKColorSpace(){
		if(_NSDeviceCMYKColorSpace != null) return _NSDeviceCMYKColorSpace;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDeviceCMYKColorSpace", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDeviceCMYKColorSpace = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDeviceColorSpaceName = null;
	 final public com.apple.jobjc.foundation.NSString NSDeviceColorSpaceName(){
		if(_NSDeviceColorSpaceName != null) return _NSDeviceColorSpaceName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDeviceColorSpaceName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDeviceColorSpaceName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDeviceIsPrinter = null;
	 final public com.apple.jobjc.foundation.NSString NSDeviceIsPrinter(){
		if(_NSDeviceIsPrinter != null) return _NSDeviceIsPrinter;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDeviceIsPrinter", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDeviceIsPrinter = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDeviceIsScreen = null;
	 final public com.apple.jobjc.foundation.NSString NSDeviceIsScreen(){
		if(_NSDeviceIsScreen != null) return _NSDeviceIsScreen;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDeviceIsScreen", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDeviceIsScreen = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDeviceRGBColorSpace = null;
	 final public com.apple.jobjc.foundation.NSString NSDeviceRGBColorSpace(){
		if(_NSDeviceRGBColorSpace != null) return _NSDeviceRGBColorSpace;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDeviceRGBColorSpace", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDeviceRGBColorSpace = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDeviceResolution = null;
	 final public com.apple.jobjc.foundation.NSString NSDeviceResolution(){
		if(_NSDeviceResolution != null) return _NSDeviceResolution;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDeviceResolution", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDeviceResolution = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDeviceSize = null;
	 final public com.apple.jobjc.foundation.NSString NSDeviceSize(){
		if(_NSDeviceSize != null) return _NSDeviceSize;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDeviceSize", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDeviceSize = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDeviceWhiteColorSpace = null;
	 final public com.apple.jobjc.foundation.NSString NSDeviceWhiteColorSpace(){
		if(_NSDeviceWhiteColorSpace != null) return _NSDeviceWhiteColorSpace;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDeviceWhiteColorSpace", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDeviceWhiteColorSpace = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDirectoryFileType = null;
	 final public com.apple.jobjc.foundation.NSString NSDirectoryFileType(){
		if(_NSDirectoryFileType != null) return _NSDirectoryFileType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDirectoryFileType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDirectoryFileType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDisplayNameBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSDisplayNameBindingOption(){
		if(_NSDisplayNameBindingOption != null) return _NSDisplayNameBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDisplayNameBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDisplayNameBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDisplayPatternBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSDisplayPatternBindingOption(){
		if(_NSDisplayPatternBindingOption != null) return _NSDisplayPatternBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDisplayPatternBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDisplayPatternBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDisplayPatternTitleBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSDisplayPatternTitleBinding(){
		if(_NSDisplayPatternTitleBinding != null) return _NSDisplayPatternTitleBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDisplayPatternTitleBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDisplayPatternTitleBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDisplayPatternValueBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSDisplayPatternValueBinding(){
		if(_NSDisplayPatternValueBinding != null) return _NSDisplayPatternValueBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDisplayPatternValueBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDisplayPatternValueBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDocFormatTextDocumentType = null;
	 final public com.apple.jobjc.foundation.NSString NSDocFormatTextDocumentType(){
		if(_NSDocFormatTextDocumentType != null) return _NSDocFormatTextDocumentType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDocFormatTextDocumentType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDocFormatTextDocumentType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDocumentEditedBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSDocumentEditedBinding(){
		if(_NSDocumentEditedBinding != null) return _NSDocumentEditedBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDocumentEditedBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDocumentEditedBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDocumentTypeDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSDocumentTypeDocumentAttribute(){
		if(_NSDocumentTypeDocumentAttribute != null) return _NSDocumentTypeDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDocumentTypeDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDocumentTypeDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDocumentTypeDocumentOption = null;
	 final public com.apple.jobjc.foundation.NSString NSDocumentTypeDocumentOption(){
		if(_NSDocumentTypeDocumentOption != null) return _NSDocumentTypeDocumentOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDocumentTypeDocumentOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDocumentTypeDocumentOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDoubleClickArgumentBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSDoubleClickArgumentBinding(){
		if(_NSDoubleClickArgumentBinding != null) return _NSDoubleClickArgumentBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDoubleClickArgumentBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDoubleClickArgumentBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDoubleClickTargetBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSDoubleClickTargetBinding(){
		if(_NSDoubleClickTargetBinding != null) return _NSDoubleClickTargetBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDoubleClickTargetBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDoubleClickTargetBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDragPboard = null;
	 final public com.apple.jobjc.foundation.NSString NSDragPboard(){
		if(_NSDragPboard != null) return _NSDragPboard;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDragPboard", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDragPboard = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDraggingException = null;
	 final public com.apple.jobjc.foundation.NSString NSDraggingException(){
		if(_NSDraggingException != null) return _NSDraggingException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDraggingException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDraggingException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDraggingImageComponentIconKey = null;
	 final public com.apple.jobjc.foundation.NSString NSDraggingImageComponentIconKey(){
		if(_NSDraggingImageComponentIconKey != null) return _NSDraggingImageComponentIconKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDraggingImageComponentIconKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDraggingImageComponentIconKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDraggingImageComponentLabelKey = null;
	 final public com.apple.jobjc.foundation.NSString NSDraggingImageComponentLabelKey(){
		if(_NSDraggingImageComponentLabelKey != null) return _NSDraggingImageComponentLabelKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDraggingImageComponentLabelKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDraggingImageComponentLabelKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDrawerDidCloseNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSDrawerDidCloseNotification(){
		if(_NSDrawerDidCloseNotification != null) return _NSDrawerDidCloseNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDrawerDidCloseNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDrawerDidCloseNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDrawerDidOpenNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSDrawerDidOpenNotification(){
		if(_NSDrawerDidOpenNotification != null) return _NSDrawerDidOpenNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDrawerDidOpenNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDrawerDidOpenNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDrawerWillCloseNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSDrawerWillCloseNotification(){
		if(_NSDrawerWillCloseNotification != null) return _NSDrawerWillCloseNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDrawerWillCloseNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDrawerWillCloseNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSDrawerWillOpenNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSDrawerWillOpenNotification(){
		if(_NSDrawerWillOpenNotification != null) return _NSDrawerWillOpenNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSDrawerWillOpenNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSDrawerWillOpenNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSEditableBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSEditableBinding(){
		if(_NSEditableBinding != null) return _NSEditableBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSEditableBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSEditableBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSEditorDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSEditorDocumentAttribute(){
		if(_NSEditorDocumentAttribute != null) return _NSEditorDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSEditorDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSEditorDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSEnabledBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSEnabledBinding(){
		if(_NSEnabledBinding != null) return _NSEnabledBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSEnabledBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSEnabledBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSEventTrackingRunLoopMode = null;
	 final public com.apple.jobjc.foundation.NSString NSEventTrackingRunLoopMode(){
		if(_NSEventTrackingRunLoopMode != null) return _NSEventTrackingRunLoopMode;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSEventTrackingRunLoopMode", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSEventTrackingRunLoopMode = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSExcludedElementsDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSExcludedElementsDocumentAttribute(){
		if(_NSExcludedElementsDocumentAttribute != null) return _NSExcludedElementsDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSExcludedElementsDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSExcludedElementsDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSExcludedKeysBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSExcludedKeysBinding(){
		if(_NSExcludedKeysBinding != null) return _NSExcludedKeysBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSExcludedKeysBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSExcludedKeysBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSExpansionAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSExpansionAttributeName(){
		if(_NSExpansionAttributeName != null) return _NSExpansionAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSExpansionAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSExpansionAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileContentsPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSFileContentsPboardType(){
		if(_NSFileContentsPboardType != null) return _NSFileContentsPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileContentsPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileContentsPboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileTypeDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSFileTypeDocumentAttribute(){
		if(_NSFileTypeDocumentAttribute != null) return _NSFileTypeDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileTypeDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileTypeDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFileTypeDocumentOption = null;
	 final public com.apple.jobjc.foundation.NSString NSFileTypeDocumentOption(){
		if(_NSFileTypeDocumentOption != null) return _NSFileTypeDocumentOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFileTypeDocumentOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFileTypeDocumentOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFilenamesPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSFilenamesPboardType(){
		if(_NSFilenamesPboardType != null) return _NSFilenamesPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFilenamesPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFilenamesPboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFilesPromisePboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSFilesPromisePboardType(){
		if(_NSFilesPromisePboardType != null) return _NSFilesPromisePboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFilesPromisePboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFilesPromisePboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFilesystemFileType = null;
	 final public com.apple.jobjc.foundation.NSString NSFilesystemFileType(){
		if(_NSFilesystemFileType != null) return _NSFilesystemFileType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFilesystemFileType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFilesystemFileType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFilterPredicateBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSFilterPredicateBinding(){
		if(_NSFilterPredicateBinding != null) return _NSFilterPredicateBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFilterPredicateBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFilterPredicateBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFindPanelCaseInsensitiveSearch = null;
	 final public com.apple.jobjc.foundation.NSString NSFindPanelCaseInsensitiveSearch(){
		if(_NSFindPanelCaseInsensitiveSearch != null) return _NSFindPanelCaseInsensitiveSearch;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFindPanelCaseInsensitiveSearch", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFindPanelCaseInsensitiveSearch = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFindPanelSearchOptionsPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSFindPanelSearchOptionsPboardType(){
		if(_NSFindPanelSearchOptionsPboardType != null) return _NSFindPanelSearchOptionsPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFindPanelSearchOptionsPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFindPanelSearchOptionsPboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFindPanelSubstringMatch = null;
	 final public com.apple.jobjc.foundation.NSString NSFindPanelSubstringMatch(){
		if(_NSFindPanelSubstringMatch != null) return _NSFindPanelSubstringMatch;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFindPanelSubstringMatch", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFindPanelSubstringMatch = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFindPboard = null;
	 final public com.apple.jobjc.foundation.NSString NSFindPboard(){
		if(_NSFindPboard != null) return _NSFindPboard;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFindPboard", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFindPboard = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSFontAttributeName(){
		if(_NSFontAttributeName != null) return _NSFontAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSFontBinding(){
		if(_NSFontBinding != null) return _NSFontBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontBoldBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSFontBoldBinding(){
		if(_NSFontBoldBinding != null) return _NSFontBoldBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontBoldBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontBoldBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontCascadeListAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSFontCascadeListAttribute(){
		if(_NSFontCascadeListAttribute != null) return _NSFontCascadeListAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontCascadeListAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontCascadeListAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontCharacterSetAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSFontCharacterSetAttribute(){
		if(_NSFontCharacterSetAttribute != null) return _NSFontCharacterSetAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontCharacterSetAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontCharacterSetAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontCollectionActionKey = null;
	 final public com.apple.jobjc.foundation.NSString NSFontCollectionActionKey(){
		if(_NSFontCollectionActionKey != null) return _NSFontCollectionActionKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontCollectionActionKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontCollectionActionKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontCollectionAllFonts = null;
	 final public com.apple.jobjc.foundation.NSString NSFontCollectionAllFonts(){
		if(_NSFontCollectionAllFonts != null) return _NSFontCollectionAllFonts;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontCollectionAllFonts", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontCollectionAllFonts = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontCollectionDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSFontCollectionDidChangeNotification(){
		if(_NSFontCollectionDidChangeNotification != null) return _NSFontCollectionDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontCollectionDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontCollectionDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontCollectionDisallowAutoActivationOption = null;
	 final public com.apple.jobjc.foundation.NSString NSFontCollectionDisallowAutoActivationOption(){
		if(_NSFontCollectionDisallowAutoActivationOption != null) return _NSFontCollectionDisallowAutoActivationOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontCollectionDisallowAutoActivationOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontCollectionDisallowAutoActivationOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontCollectionFavorites = null;
	 final public com.apple.jobjc.foundation.NSString NSFontCollectionFavorites(){
		if(_NSFontCollectionFavorites != null) return _NSFontCollectionFavorites;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontCollectionFavorites", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontCollectionFavorites = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontCollectionIncludeDisabledFontsOption = null;
	 final public com.apple.jobjc.foundation.NSString NSFontCollectionIncludeDisabledFontsOption(){
		if(_NSFontCollectionIncludeDisabledFontsOption != null) return _NSFontCollectionIncludeDisabledFontsOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontCollectionIncludeDisabledFontsOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontCollectionIncludeDisabledFontsOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontCollectionNameKey = null;
	 final public com.apple.jobjc.foundation.NSString NSFontCollectionNameKey(){
		if(_NSFontCollectionNameKey != null) return _NSFontCollectionNameKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontCollectionNameKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontCollectionNameKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontCollectionOldNameKey = null;
	 final public com.apple.jobjc.foundation.NSString NSFontCollectionOldNameKey(){
		if(_NSFontCollectionOldNameKey != null) return _NSFontCollectionOldNameKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontCollectionOldNameKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontCollectionOldNameKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontCollectionRecentlyUsed = null;
	 final public com.apple.jobjc.foundation.NSString NSFontCollectionRecentlyUsed(){
		if(_NSFontCollectionRecentlyUsed != null) return _NSFontCollectionRecentlyUsed;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontCollectionRecentlyUsed", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontCollectionRecentlyUsed = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontCollectionRemoveDuplicatesOption = null;
	 final public com.apple.jobjc.foundation.NSString NSFontCollectionRemoveDuplicatesOption(){
		if(_NSFontCollectionRemoveDuplicatesOption != null) return _NSFontCollectionRemoveDuplicatesOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontCollectionRemoveDuplicatesOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontCollectionRemoveDuplicatesOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontCollectionUser = null;
	 final public com.apple.jobjc.foundation.NSString NSFontCollectionUser(){
		if(_NSFontCollectionUser != null) return _NSFontCollectionUser;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontCollectionUser", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontCollectionUser = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontCollectionVisibilityKey = null;
	 final public com.apple.jobjc.foundation.NSString NSFontCollectionVisibilityKey(){
		if(_NSFontCollectionVisibilityKey != null) return _NSFontCollectionVisibilityKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontCollectionVisibilityKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontCollectionVisibilityKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontCollectionWasHidden = null;
	 final public com.apple.jobjc.foundation.NSString NSFontCollectionWasHidden(){
		if(_NSFontCollectionWasHidden != null) return _NSFontCollectionWasHidden;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontCollectionWasHidden", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontCollectionWasHidden = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontCollectionWasRenamed = null;
	 final public com.apple.jobjc.foundation.NSString NSFontCollectionWasRenamed(){
		if(_NSFontCollectionWasRenamed != null) return _NSFontCollectionWasRenamed;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontCollectionWasRenamed", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontCollectionWasRenamed = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontCollectionWasShown = null;
	 final public com.apple.jobjc.foundation.NSString NSFontCollectionWasShown(){
		if(_NSFontCollectionWasShown != null) return _NSFontCollectionWasShown;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontCollectionWasShown", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontCollectionWasShown = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontColorAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSFontColorAttribute(){
		if(_NSFontColorAttribute != null) return _NSFontColorAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontColorAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontColorAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontFaceAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSFontFaceAttribute(){
		if(_NSFontFaceAttribute != null) return _NSFontFaceAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontFaceAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontFaceAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontFamilyAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSFontFamilyAttribute(){
		if(_NSFontFamilyAttribute != null) return _NSFontFamilyAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontFamilyAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontFamilyAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontFamilyNameBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSFontFamilyNameBinding(){
		if(_NSFontFamilyNameBinding != null) return _NSFontFamilyNameBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontFamilyNameBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontFamilyNameBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontFeatureSelectorIdentifierKey = null;
	 final public com.apple.jobjc.foundation.NSString NSFontFeatureSelectorIdentifierKey(){
		if(_NSFontFeatureSelectorIdentifierKey != null) return _NSFontFeatureSelectorIdentifierKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontFeatureSelectorIdentifierKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontFeatureSelectorIdentifierKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontFeatureSettingsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSFontFeatureSettingsAttribute(){
		if(_NSFontFeatureSettingsAttribute != null) return _NSFontFeatureSettingsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontFeatureSettingsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontFeatureSettingsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontFeatureTypeIdentifierKey = null;
	 final public com.apple.jobjc.foundation.NSString NSFontFeatureTypeIdentifierKey(){
		if(_NSFontFeatureTypeIdentifierKey != null) return _NSFontFeatureTypeIdentifierKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontFeatureTypeIdentifierKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontFeatureTypeIdentifierKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontFixedAdvanceAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSFontFixedAdvanceAttribute(){
		if(_NSFontFixedAdvanceAttribute != null) return _NSFontFixedAdvanceAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontFixedAdvanceAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontFixedAdvanceAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.Pointer<java.lang.Double> _NSFontIdentityMatrix = null;
	 final public com.apple.jobjc.Pointer<java.lang.Double> NSFontIdentityMatrix(){
		if(_NSFontIdentityMatrix != null) return _NSFontIdentityMatrix;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontIdentityMatrix", nativeBuffer, com.apple.jobjc.Coder.PointerCoder.INST.sizeof());
		final com.apple.jobjc.Pointer<java.lang.Double> returnValue = (com.apple.jobjc.Pointer<java.lang.Double>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		_NSFontIdentityMatrix = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontItalicBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSFontItalicBinding(){
		if(_NSFontItalicBinding != null) return _NSFontItalicBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontItalicBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontItalicBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontMatrixAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSFontMatrixAttribute(){
		if(_NSFontMatrixAttribute != null) return _NSFontMatrixAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontMatrixAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontMatrixAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontNameAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSFontNameAttribute(){
		if(_NSFontNameAttribute != null) return _NSFontNameAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontNameAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontNameAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontNameBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSFontNameBinding(){
		if(_NSFontNameBinding != null) return _NSFontNameBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontNameBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontNameBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontPboard = null;
	 final public com.apple.jobjc.foundation.NSString NSFontPboard(){
		if(_NSFontPboard != null) return _NSFontPboard;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontPboard", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontPboard = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSFontPboardType(){
		if(_NSFontPboardType != null) return _NSFontPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontPboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontSetChangedNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSFontSetChangedNotification(){
		if(_NSFontSetChangedNotification != null) return _NSFontSetChangedNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontSetChangedNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontSetChangedNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontSizeAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSFontSizeAttribute(){
		if(_NSFontSizeAttribute != null) return _NSFontSizeAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontSizeAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontSizeAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontSizeBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSFontSizeBinding(){
		if(_NSFontSizeBinding != null) return _NSFontSizeBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontSizeBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontSizeBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontSlantTrait = null;
	 final public com.apple.jobjc.foundation.NSString NSFontSlantTrait(){
		if(_NSFontSlantTrait != null) return _NSFontSlantTrait;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontSlantTrait", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontSlantTrait = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontSymbolicTrait = null;
	 final public com.apple.jobjc.foundation.NSString NSFontSymbolicTrait(){
		if(_NSFontSymbolicTrait != null) return _NSFontSymbolicTrait;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontSymbolicTrait", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontSymbolicTrait = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontTraitsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSFontTraitsAttribute(){
		if(_NSFontTraitsAttribute != null) return _NSFontTraitsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontTraitsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontTraitsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontUnavailableException = null;
	 final public com.apple.jobjc.foundation.NSString NSFontUnavailableException(){
		if(_NSFontUnavailableException != null) return _NSFontUnavailableException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontUnavailableException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontUnavailableException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontVariationAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSFontVariationAttribute(){
		if(_NSFontVariationAttribute != null) return _NSFontVariationAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontVariationAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontVariationAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontVariationAxisDefaultValueKey = null;
	 final public com.apple.jobjc.foundation.NSString NSFontVariationAxisDefaultValueKey(){
		if(_NSFontVariationAxisDefaultValueKey != null) return _NSFontVariationAxisDefaultValueKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontVariationAxisDefaultValueKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontVariationAxisDefaultValueKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontVariationAxisIdentifierKey = null;
	 final public com.apple.jobjc.foundation.NSString NSFontVariationAxisIdentifierKey(){
		if(_NSFontVariationAxisIdentifierKey != null) return _NSFontVariationAxisIdentifierKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontVariationAxisIdentifierKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontVariationAxisIdentifierKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontVariationAxisMaximumValueKey = null;
	 final public com.apple.jobjc.foundation.NSString NSFontVariationAxisMaximumValueKey(){
		if(_NSFontVariationAxisMaximumValueKey != null) return _NSFontVariationAxisMaximumValueKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontVariationAxisMaximumValueKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontVariationAxisMaximumValueKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontVariationAxisMinimumValueKey = null;
	 final public com.apple.jobjc.foundation.NSString NSFontVariationAxisMinimumValueKey(){
		if(_NSFontVariationAxisMinimumValueKey != null) return _NSFontVariationAxisMinimumValueKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontVariationAxisMinimumValueKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontVariationAxisMinimumValueKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontVariationAxisNameKey = null;
	 final public com.apple.jobjc.foundation.NSString NSFontVariationAxisNameKey(){
		if(_NSFontVariationAxisNameKey != null) return _NSFontVariationAxisNameKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontVariationAxisNameKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontVariationAxisNameKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontVisibleNameAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSFontVisibleNameAttribute(){
		if(_NSFontVisibleNameAttribute != null) return _NSFontVisibleNameAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontVisibleNameAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontVisibleNameAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontWeightTrait = null;
	 final public com.apple.jobjc.foundation.NSString NSFontWeightTrait(){
		if(_NSFontWeightTrait != null) return _NSFontWeightTrait;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontWeightTrait", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontWeightTrait = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFontWidthTrait = null;
	 final public com.apple.jobjc.foundation.NSString NSFontWidthTrait(){
		if(_NSFontWidthTrait != null) return _NSFontWidthTrait;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFontWidthTrait", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFontWidthTrait = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSForegroundColorAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSForegroundColorAttributeName(){
		if(_NSForegroundColorAttributeName != null) return _NSForegroundColorAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSForegroundColorAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSForegroundColorAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFullScreenModeAllScreens = null;
	 final public com.apple.jobjc.foundation.NSString NSFullScreenModeAllScreens(){
		if(_NSFullScreenModeAllScreens != null) return _NSFullScreenModeAllScreens;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFullScreenModeAllScreens", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFullScreenModeAllScreens = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFullScreenModeApplicationPresentationOptions = null;
	 final public com.apple.jobjc.foundation.NSString NSFullScreenModeApplicationPresentationOptions(){
		if(_NSFullScreenModeApplicationPresentationOptions != null) return _NSFullScreenModeApplicationPresentationOptions;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFullScreenModeApplicationPresentationOptions", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFullScreenModeApplicationPresentationOptions = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFullScreenModeSetting = null;
	 final public com.apple.jobjc.foundation.NSString NSFullScreenModeSetting(){
		if(_NSFullScreenModeSetting != null) return _NSFullScreenModeSetting;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFullScreenModeSetting", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFullScreenModeSetting = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSFullScreenModeWindowLevel = null;
	 final public com.apple.jobjc.foundation.NSString NSFullScreenModeWindowLevel(){
		if(_NSFullScreenModeWindowLevel != null) return _NSFullScreenModeWindowLevel;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSFullScreenModeWindowLevel", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSFullScreenModeWindowLevel = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSGeneralPboard = null;
	 final public com.apple.jobjc.foundation.NSString NSGeneralPboard(){
		if(_NSGeneralPboard != null) return _NSGeneralPboard;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSGeneralPboard", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSGeneralPboard = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSGlyphInfoAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSGlyphInfoAttributeName(){
		if(_NSGlyphInfoAttributeName != null) return _NSGlyphInfoAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSGlyphInfoAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSGlyphInfoAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSGraphicsContextDestinationAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSGraphicsContextDestinationAttributeName(){
		if(_NSGraphicsContextDestinationAttributeName != null) return _NSGraphicsContextDestinationAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSGraphicsContextDestinationAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSGraphicsContextDestinationAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSGraphicsContextPDFFormat = null;
	 final public com.apple.jobjc.foundation.NSString NSGraphicsContextPDFFormat(){
		if(_NSGraphicsContextPDFFormat != null) return _NSGraphicsContextPDFFormat;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSGraphicsContextPDFFormat", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSGraphicsContextPDFFormat = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSGraphicsContextPSFormat = null;
	 final public com.apple.jobjc.foundation.NSString NSGraphicsContextPSFormat(){
		if(_NSGraphicsContextPSFormat != null) return _NSGraphicsContextPSFormat;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSGraphicsContextPSFormat", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSGraphicsContextPSFormat = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSGraphicsContextRepresentationFormatAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSGraphicsContextRepresentationFormatAttributeName(){
		if(_NSGraphicsContextRepresentationFormatAttributeName != null) return _NSGraphicsContextRepresentationFormatAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSGraphicsContextRepresentationFormatAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSGraphicsContextRepresentationFormatAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTMLPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSHTMLPboardType(){
		if(_NSHTMLPboardType != null) return _NSHTMLPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTMLPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTMLPboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHTMLTextDocumentType = null;
	 final public com.apple.jobjc.foundation.NSString NSHTMLTextDocumentType(){
		if(_NSHTMLTextDocumentType != null) return _NSHTMLTextDocumentType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHTMLTextDocumentType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHTMLTextDocumentType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHandlesContentAsCompoundValueBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSHandlesContentAsCompoundValueBindingOption(){
		if(_NSHandlesContentAsCompoundValueBindingOption != null) return _NSHandlesContentAsCompoundValueBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHandlesContentAsCompoundValueBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHandlesContentAsCompoundValueBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHeaderTitleBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSHeaderTitleBinding(){
		if(_NSHeaderTitleBinding != null) return _NSHeaderTitleBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHeaderTitleBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHeaderTitleBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHiddenBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSHiddenBinding(){
		if(_NSHiddenBinding != null) return _NSHiddenBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHiddenBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHiddenBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSHyphenationFactorDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSHyphenationFactorDocumentAttribute(){
		if(_NSHyphenationFactorDocumentAttribute != null) return _NSHyphenationFactorDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSHyphenationFactorDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSHyphenationFactorDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSIllegalSelectorException = null;
	 final public com.apple.jobjc.foundation.NSString NSIllegalSelectorException(){
		if(_NSIllegalSelectorException != null) return _NSIllegalSelectorException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSIllegalSelectorException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSIllegalSelectorException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSImageBinding(){
		if(_NSImageBinding != null) return _NSImageBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageCacheException = null;
	 final public com.apple.jobjc.foundation.NSString NSImageCacheException(){
		if(_NSImageCacheException != null) return _NSImageCacheException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageCacheException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageCacheException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageColorSyncProfileData = null;
	 final public com.apple.jobjc.foundation.NSString NSImageColorSyncProfileData(){
		if(_NSImageColorSyncProfileData != null) return _NSImageColorSyncProfileData;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageColorSyncProfileData", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageColorSyncProfileData = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageCompressionFactor = null;
	 final public com.apple.jobjc.foundation.NSString NSImageCompressionFactor(){
		if(_NSImageCompressionFactor != null) return _NSImageCompressionFactor;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageCompressionFactor", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageCompressionFactor = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageCompressionMethod = null;
	 final public com.apple.jobjc.foundation.NSString NSImageCompressionMethod(){
		if(_NSImageCompressionMethod != null) return _NSImageCompressionMethod;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageCompressionMethod", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageCompressionMethod = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageCurrentFrame = null;
	 final public com.apple.jobjc.foundation.NSString NSImageCurrentFrame(){
		if(_NSImageCurrentFrame != null) return _NSImageCurrentFrame;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageCurrentFrame", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageCurrentFrame = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageCurrentFrameDuration = null;
	 final public com.apple.jobjc.foundation.NSString NSImageCurrentFrameDuration(){
		if(_NSImageCurrentFrameDuration != null) return _NSImageCurrentFrameDuration;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageCurrentFrameDuration", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageCurrentFrameDuration = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageDitherTransparency = null;
	 final public com.apple.jobjc.foundation.NSString NSImageDitherTransparency(){
		if(_NSImageDitherTransparency != null) return _NSImageDitherTransparency;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageDitherTransparency", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageDitherTransparency = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageEXIFData = null;
	 final public com.apple.jobjc.foundation.NSString NSImageEXIFData(){
		if(_NSImageEXIFData != null) return _NSImageEXIFData;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageEXIFData", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageEXIFData = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageFallbackBackgroundColor = null;
	 final public com.apple.jobjc.foundation.NSString NSImageFallbackBackgroundColor(){
		if(_NSImageFallbackBackgroundColor != null) return _NSImageFallbackBackgroundColor;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageFallbackBackgroundColor", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageFallbackBackgroundColor = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageFrameCount = null;
	 final public com.apple.jobjc.foundation.NSString NSImageFrameCount(){
		if(_NSImageFrameCount != null) return _NSImageFrameCount;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageFrameCount", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageFrameCount = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageGamma = null;
	 final public com.apple.jobjc.foundation.NSString NSImageGamma(){
		if(_NSImageGamma != null) return _NSImageGamma;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageGamma", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageGamma = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageHintCTM = null;
	 final public com.apple.jobjc.foundation.NSString NSImageHintCTM(){
		if(_NSImageHintCTM != null) return _NSImageHintCTM;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageHintCTM", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageHintCTM = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageHintInterpolation = null;
	 final public com.apple.jobjc.foundation.NSString NSImageHintInterpolation(){
		if(_NSImageHintInterpolation != null) return _NSImageHintInterpolation;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageHintInterpolation", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageHintInterpolation = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageInterlaced = null;
	 final public com.apple.jobjc.foundation.NSString NSImageInterlaced(){
		if(_NSImageInterlaced != null) return _NSImageInterlaced;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageInterlaced", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageInterlaced = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageLoopCount = null;
	 final public com.apple.jobjc.foundation.NSString NSImageLoopCount(){
		if(_NSImageLoopCount != null) return _NSImageLoopCount;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageLoopCount", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageLoopCount = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameActionTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameActionTemplate(){
		if(_NSImageNameActionTemplate != null) return _NSImageNameActionTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameActionTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameActionTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameAddTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameAddTemplate(){
		if(_NSImageNameAddTemplate != null) return _NSImageNameAddTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameAddTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameAddTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameAdvanced = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameAdvanced(){
		if(_NSImageNameAdvanced != null) return _NSImageNameAdvanced;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameAdvanced", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameAdvanced = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameApplicationIcon = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameApplicationIcon(){
		if(_NSImageNameApplicationIcon != null) return _NSImageNameApplicationIcon;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameApplicationIcon", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameApplicationIcon = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameBluetoothTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameBluetoothTemplate(){
		if(_NSImageNameBluetoothTemplate != null) return _NSImageNameBluetoothTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameBluetoothTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameBluetoothTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameBonjour = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameBonjour(){
		if(_NSImageNameBonjour != null) return _NSImageNameBonjour;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameBonjour", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameBonjour = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameBookmarksTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameBookmarksTemplate(){
		if(_NSImageNameBookmarksTemplate != null) return _NSImageNameBookmarksTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameBookmarksTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameBookmarksTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameCaution = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameCaution(){
		if(_NSImageNameCaution != null) return _NSImageNameCaution;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameCaution", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameCaution = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameColorPanel = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameColorPanel(){
		if(_NSImageNameColorPanel != null) return _NSImageNameColorPanel;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameColorPanel", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameColorPanel = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameColumnViewTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameColumnViewTemplate(){
		if(_NSImageNameColumnViewTemplate != null) return _NSImageNameColumnViewTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameColumnViewTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameColumnViewTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameComputer = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameComputer(){
		if(_NSImageNameComputer != null) return _NSImageNameComputer;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameComputer", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameComputer = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameDotMac = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameDotMac(){
		if(_NSImageNameDotMac != null) return _NSImageNameDotMac;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameDotMac", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameDotMac = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameEnterFullScreenTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameEnterFullScreenTemplate(){
		if(_NSImageNameEnterFullScreenTemplate != null) return _NSImageNameEnterFullScreenTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameEnterFullScreenTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameEnterFullScreenTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameEveryone = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameEveryone(){
		if(_NSImageNameEveryone != null) return _NSImageNameEveryone;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameEveryone", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameEveryone = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameExitFullScreenTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameExitFullScreenTemplate(){
		if(_NSImageNameExitFullScreenTemplate != null) return _NSImageNameExitFullScreenTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameExitFullScreenTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameExitFullScreenTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameFlowViewTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameFlowViewTemplate(){
		if(_NSImageNameFlowViewTemplate != null) return _NSImageNameFlowViewTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameFlowViewTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameFlowViewTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameFolder = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameFolder(){
		if(_NSImageNameFolder != null) return _NSImageNameFolder;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameFolder", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameFolder = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameFolderBurnable = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameFolderBurnable(){
		if(_NSImageNameFolderBurnable != null) return _NSImageNameFolderBurnable;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameFolderBurnable", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameFolderBurnable = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameFolderSmart = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameFolderSmart(){
		if(_NSImageNameFolderSmart != null) return _NSImageNameFolderSmart;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameFolderSmart", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameFolderSmart = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameFollowLinkFreestandingTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameFollowLinkFreestandingTemplate(){
		if(_NSImageNameFollowLinkFreestandingTemplate != null) return _NSImageNameFollowLinkFreestandingTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameFollowLinkFreestandingTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameFollowLinkFreestandingTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameFontPanel = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameFontPanel(){
		if(_NSImageNameFontPanel != null) return _NSImageNameFontPanel;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameFontPanel", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameFontPanel = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameGoLeftTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameGoLeftTemplate(){
		if(_NSImageNameGoLeftTemplate != null) return _NSImageNameGoLeftTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameGoLeftTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameGoLeftTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameGoRightTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameGoRightTemplate(){
		if(_NSImageNameGoRightTemplate != null) return _NSImageNameGoRightTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameGoRightTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameGoRightTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameHomeTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameHomeTemplate(){
		if(_NSImageNameHomeTemplate != null) return _NSImageNameHomeTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameHomeTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameHomeTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameIChatTheaterTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameIChatTheaterTemplate(){
		if(_NSImageNameIChatTheaterTemplate != null) return _NSImageNameIChatTheaterTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameIChatTheaterTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameIChatTheaterTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameIconViewTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameIconViewTemplate(){
		if(_NSImageNameIconViewTemplate != null) return _NSImageNameIconViewTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameIconViewTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameIconViewTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameInfo = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameInfo(){
		if(_NSImageNameInfo != null) return _NSImageNameInfo;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameInfo", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameInfo = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameInvalidDataFreestandingTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameInvalidDataFreestandingTemplate(){
		if(_NSImageNameInvalidDataFreestandingTemplate != null) return _NSImageNameInvalidDataFreestandingTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameInvalidDataFreestandingTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameInvalidDataFreestandingTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameLeftFacingTriangleTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameLeftFacingTriangleTemplate(){
		if(_NSImageNameLeftFacingTriangleTemplate != null) return _NSImageNameLeftFacingTriangleTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameLeftFacingTriangleTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameLeftFacingTriangleTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameListViewTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameListViewTemplate(){
		if(_NSImageNameListViewTemplate != null) return _NSImageNameListViewTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameListViewTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameListViewTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameLockLockedTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameLockLockedTemplate(){
		if(_NSImageNameLockLockedTemplate != null) return _NSImageNameLockLockedTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameLockLockedTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameLockLockedTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameLockUnlockedTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameLockUnlockedTemplate(){
		if(_NSImageNameLockUnlockedTemplate != null) return _NSImageNameLockUnlockedTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameLockUnlockedTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameLockUnlockedTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameMenuMixedStateTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameMenuMixedStateTemplate(){
		if(_NSImageNameMenuMixedStateTemplate != null) return _NSImageNameMenuMixedStateTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameMenuMixedStateTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameMenuMixedStateTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameMenuOnStateTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameMenuOnStateTemplate(){
		if(_NSImageNameMenuOnStateTemplate != null) return _NSImageNameMenuOnStateTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameMenuOnStateTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameMenuOnStateTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameMobileMe = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameMobileMe(){
		if(_NSImageNameMobileMe != null) return _NSImageNameMobileMe;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameMobileMe", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameMobileMe = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameMultipleDocuments = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameMultipleDocuments(){
		if(_NSImageNameMultipleDocuments != null) return _NSImageNameMultipleDocuments;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameMultipleDocuments", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameMultipleDocuments = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameNetwork = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameNetwork(){
		if(_NSImageNameNetwork != null) return _NSImageNameNetwork;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameNetwork", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameNetwork = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNamePathTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNamePathTemplate(){
		if(_NSImageNamePathTemplate != null) return _NSImageNamePathTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNamePathTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNamePathTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNamePreferencesGeneral = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNamePreferencesGeneral(){
		if(_NSImageNamePreferencesGeneral != null) return _NSImageNamePreferencesGeneral;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNamePreferencesGeneral", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNamePreferencesGeneral = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameQuickLookTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameQuickLookTemplate(){
		if(_NSImageNameQuickLookTemplate != null) return _NSImageNameQuickLookTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameQuickLookTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameQuickLookTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameRefreshFreestandingTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameRefreshFreestandingTemplate(){
		if(_NSImageNameRefreshFreestandingTemplate != null) return _NSImageNameRefreshFreestandingTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameRefreshFreestandingTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameRefreshFreestandingTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameRefreshTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameRefreshTemplate(){
		if(_NSImageNameRefreshTemplate != null) return _NSImageNameRefreshTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameRefreshTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameRefreshTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameRemoveTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameRemoveTemplate(){
		if(_NSImageNameRemoveTemplate != null) return _NSImageNameRemoveTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameRemoveTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameRemoveTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameRevealFreestandingTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameRevealFreestandingTemplate(){
		if(_NSImageNameRevealFreestandingTemplate != null) return _NSImageNameRevealFreestandingTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameRevealFreestandingTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameRevealFreestandingTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameRightFacingTriangleTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameRightFacingTriangleTemplate(){
		if(_NSImageNameRightFacingTriangleTemplate != null) return _NSImageNameRightFacingTriangleTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameRightFacingTriangleTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameRightFacingTriangleTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameShareTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameShareTemplate(){
		if(_NSImageNameShareTemplate != null) return _NSImageNameShareTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameShareTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameShareTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameSlideshowTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameSlideshowTemplate(){
		if(_NSImageNameSlideshowTemplate != null) return _NSImageNameSlideshowTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameSlideshowTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameSlideshowTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameSmartBadgeTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameSmartBadgeTemplate(){
		if(_NSImageNameSmartBadgeTemplate != null) return _NSImageNameSmartBadgeTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameSmartBadgeTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameSmartBadgeTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameStatusAvailable = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameStatusAvailable(){
		if(_NSImageNameStatusAvailable != null) return _NSImageNameStatusAvailable;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameStatusAvailable", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameStatusAvailable = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameStatusNone = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameStatusNone(){
		if(_NSImageNameStatusNone != null) return _NSImageNameStatusNone;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameStatusNone", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameStatusNone = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameStatusPartiallyAvailable = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameStatusPartiallyAvailable(){
		if(_NSImageNameStatusPartiallyAvailable != null) return _NSImageNameStatusPartiallyAvailable;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameStatusPartiallyAvailable", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameStatusPartiallyAvailable = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameStatusUnavailable = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameStatusUnavailable(){
		if(_NSImageNameStatusUnavailable != null) return _NSImageNameStatusUnavailable;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameStatusUnavailable", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameStatusUnavailable = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameStopProgressFreestandingTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameStopProgressFreestandingTemplate(){
		if(_NSImageNameStopProgressFreestandingTemplate != null) return _NSImageNameStopProgressFreestandingTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameStopProgressFreestandingTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameStopProgressFreestandingTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameStopProgressTemplate = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameStopProgressTemplate(){
		if(_NSImageNameStopProgressTemplate != null) return _NSImageNameStopProgressTemplate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameStopProgressTemplate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameStopProgressTemplate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameTrashEmpty = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameTrashEmpty(){
		if(_NSImageNameTrashEmpty != null) return _NSImageNameTrashEmpty;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameTrashEmpty", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameTrashEmpty = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameTrashFull = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameTrashFull(){
		if(_NSImageNameTrashFull != null) return _NSImageNameTrashFull;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameTrashFull", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameTrashFull = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameUser = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameUser(){
		if(_NSImageNameUser != null) return _NSImageNameUser;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameUser", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameUser = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameUserAccounts = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameUserAccounts(){
		if(_NSImageNameUserAccounts != null) return _NSImageNameUserAccounts;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameUserAccounts", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameUserAccounts = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameUserGroup = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameUserGroup(){
		if(_NSImageNameUserGroup != null) return _NSImageNameUserGroup;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameUserGroup", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameUserGroup = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageNameUserGuest = null;
	 final public com.apple.jobjc.foundation.NSString NSImageNameUserGuest(){
		if(_NSImageNameUserGuest != null) return _NSImageNameUserGuest;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageNameUserGuest", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageNameUserGuest = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageProgressive = null;
	 final public com.apple.jobjc.foundation.NSString NSImageProgressive(){
		if(_NSImageProgressive != null) return _NSImageProgressive;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageProgressive", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageProgressive = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageRGBColorTable = null;
	 final public com.apple.jobjc.foundation.NSString NSImageRGBColorTable(){
		if(_NSImageRGBColorTable != null) return _NSImageRGBColorTable;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageRGBColorTable", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageRGBColorTable = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSImageRepRegistryDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSImageRepRegistryDidChangeNotification(){
		if(_NSImageRepRegistryDidChangeNotification != null) return _NSImageRepRegistryDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSImageRepRegistryDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSImageRepRegistryDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSIncludedKeysBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSIncludedKeysBinding(){
		if(_NSIncludedKeysBinding != null) return _NSIncludedKeysBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSIncludedKeysBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSIncludedKeysBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSInitialKeyBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSInitialKeyBinding(){
		if(_NSInitialKeyBinding != null) return _NSInitialKeyBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSInitialKeyBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSInitialKeyBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSInitialValueBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSInitialValueBinding(){
		if(_NSInitialValueBinding != null) return _NSInitialValueBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSInitialValueBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSInitialValueBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSInkTextPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSInkTextPboardType(){
		if(_NSInkTextPboardType != null) return _NSInkTextPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSInkTextPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSInkTextPboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSInsertsNullPlaceholderBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSInsertsNullPlaceholderBindingOption(){
		if(_NSInsertsNullPlaceholderBindingOption != null) return _NSInsertsNullPlaceholderBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSInsertsNullPlaceholderBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSInsertsNullPlaceholderBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSInterfaceStyleDefault = null;
	 final public com.apple.jobjc.foundation.NSString NSInterfaceStyleDefault(){
		if(_NSInterfaceStyleDefault != null) return _NSInterfaceStyleDefault;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSInterfaceStyleDefault", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSInterfaceStyleDefault = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSInvokesSeparatelyWithArrayObjectsBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSInvokesSeparatelyWithArrayObjectsBindingOption(){
		if(_NSInvokesSeparatelyWithArrayObjectsBindingOption != null) return _NSInvokesSeparatelyWithArrayObjectsBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSInvokesSeparatelyWithArrayObjectsBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSInvokesSeparatelyWithArrayObjectsBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSIsIndeterminateBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSIsIndeterminateBinding(){
		if(_NSIsIndeterminateBinding != null) return _NSIsIndeterminateBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSIsIndeterminateBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSIsIndeterminateBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSKernAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSKernAttributeName(){
		if(_NSKernAttributeName != null) return _NSKernAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSKernAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSKernAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSKeywordsDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSKeywordsDocumentAttribute(){
		if(_NSKeywordsDocumentAttribute != null) return _NSKeywordsDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSKeywordsDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSKeywordsDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLabelBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSLabelBinding(){
		if(_NSLabelBinding != null) return _NSLabelBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLabelBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLabelBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLeftMarginDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSLeftMarginDocumentAttribute(){
		if(_NSLeftMarginDocumentAttribute != null) return _NSLeftMarginDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLeftMarginDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLeftMarginDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLigatureAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSLigatureAttributeName(){
		if(_NSLigatureAttributeName != null) return _NSLigatureAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLigatureAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLigatureAttributeName = returnValue;
		return returnValue;
	}

	private double _NSLightGray = 0;
	 final public double NSLightGray(){
		if(_NSLightGray != 0) return _NSLightGray;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLightGray", nativeBuffer, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.sizeof());
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		_NSLightGray = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLinkAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSLinkAttributeName(){
		if(_NSLinkAttributeName != null) return _NSLinkAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLinkAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLinkAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSLocalizedKeyDictionaryBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSLocalizedKeyDictionaryBinding(){
		if(_NSLocalizedKeyDictionaryBinding != null) return _NSLocalizedKeyDictionaryBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSLocalizedKeyDictionaryBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSLocalizedKeyDictionaryBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMacSimpleTextDocumentType = null;
	 final public com.apple.jobjc.foundation.NSString NSMacSimpleTextDocumentType(){
		if(_NSMacSimpleTextDocumentType != null) return _NSMacSimpleTextDocumentType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMacSimpleTextDocumentType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMacSimpleTextDocumentType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSManagedObjectContextBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSManagedObjectContextBinding(){
		if(_NSManagedObjectContextBinding != null) return _NSManagedObjectContextBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSManagedObjectContextBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSManagedObjectContextBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSManagerDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSManagerDocumentAttribute(){
		if(_NSManagerDocumentAttribute != null) return _NSManagerDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSManagerDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSManagerDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMarkedClauseSegmentAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSMarkedClauseSegmentAttributeName(){
		if(_NSMarkedClauseSegmentAttributeName != null) return _NSMarkedClauseSegmentAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMarkedClauseSegmentAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMarkedClauseSegmentAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMaxValueBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSMaxValueBinding(){
		if(_NSMaxValueBinding != null) return _NSMaxValueBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMaxValueBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMaxValueBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMaxWidthBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSMaxWidthBinding(){
		if(_NSMaxWidthBinding != null) return _NSMaxWidthBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMaxWidthBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMaxWidthBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMaximumRecentsBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSMaximumRecentsBinding(){
		if(_NSMaximumRecentsBinding != null) return _NSMaximumRecentsBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMaximumRecentsBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMaximumRecentsBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMenuDidAddItemNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSMenuDidAddItemNotification(){
		if(_NSMenuDidAddItemNotification != null) return _NSMenuDidAddItemNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMenuDidAddItemNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMenuDidAddItemNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMenuDidBeginTrackingNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSMenuDidBeginTrackingNotification(){
		if(_NSMenuDidBeginTrackingNotification != null) return _NSMenuDidBeginTrackingNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMenuDidBeginTrackingNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMenuDidBeginTrackingNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMenuDidChangeItemNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSMenuDidChangeItemNotification(){
		if(_NSMenuDidChangeItemNotification != null) return _NSMenuDidChangeItemNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMenuDidChangeItemNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMenuDidChangeItemNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMenuDidEndTrackingNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSMenuDidEndTrackingNotification(){
		if(_NSMenuDidEndTrackingNotification != null) return _NSMenuDidEndTrackingNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMenuDidEndTrackingNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMenuDidEndTrackingNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMenuDidRemoveItemNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSMenuDidRemoveItemNotification(){
		if(_NSMenuDidRemoveItemNotification != null) return _NSMenuDidRemoveItemNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMenuDidRemoveItemNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMenuDidRemoveItemNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMenuDidSendActionNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSMenuDidSendActionNotification(){
		if(_NSMenuDidSendActionNotification != null) return _NSMenuDidSendActionNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMenuDidSendActionNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMenuDidSendActionNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMenuWillSendActionNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSMenuWillSendActionNotification(){
		if(_NSMenuWillSendActionNotification != null) return _NSMenuWillSendActionNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMenuWillSendActionNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMenuWillSendActionNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMinValueBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSMinValueBinding(){
		if(_NSMinValueBinding != null) return _NSMinValueBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMinValueBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMinValueBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMinWidthBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSMinWidthBinding(){
		if(_NSMinWidthBinding != null) return _NSMinWidthBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMinWidthBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMinWidthBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMixedStateImageBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSMixedStateImageBinding(){
		if(_NSMixedStateImageBinding != null) return _NSMixedStateImageBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMixedStateImageBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMixedStateImageBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSModalPanelRunLoopMode = null;
	 final public com.apple.jobjc.foundation.NSString NSModalPanelRunLoopMode(){
		if(_NSModalPanelRunLoopMode != null) return _NSModalPanelRunLoopMode;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSModalPanelRunLoopMode", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSModalPanelRunLoopMode = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSModificationTimeDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSModificationTimeDocumentAttribute(){
		if(_NSModificationTimeDocumentAttribute != null) return _NSModificationTimeDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSModificationTimeDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSModificationTimeDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMultipleTextSelectionPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSMultipleTextSelectionPboardType(){
		if(_NSMultipleTextSelectionPboardType != null) return _NSMultipleTextSelectionPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMultipleTextSelectionPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMultipleTextSelectionPboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.ID _NSMultipleValuesMarker = null;
	 final public <T extends com.apple.jobjc.ID> T NSMultipleValuesMarker(){
		if(_NSMultipleValuesMarker != null) return (T)_NSMultipleValuesMarker;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMultipleValuesMarker", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMultipleValuesMarker = returnValue;
		return (T)returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSMultipleValuesPlaceholderBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSMultipleValuesPlaceholderBindingOption(){
		if(_NSMultipleValuesPlaceholderBindingOption != null) return _NSMultipleValuesPlaceholderBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSMultipleValuesPlaceholderBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSMultipleValuesPlaceholderBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSNamedColorSpace = null;
	 final public com.apple.jobjc.foundation.NSString NSNamedColorSpace(){
		if(_NSNamedColorSpace != null) return _NSNamedColorSpace;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSNamedColorSpace", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSNamedColorSpace = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSNibLoadingException = null;
	 final public com.apple.jobjc.foundation.NSString NSNibLoadingException(){
		if(_NSNibLoadingException != null) return _NSNibLoadingException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSNibLoadingException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSNibLoadingException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSNibOwner = null;
	 final public com.apple.jobjc.foundation.NSString NSNibOwner(){
		if(_NSNibOwner != null) return _NSNibOwner;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSNibOwner", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSNibOwner = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSNibTopLevelObjects = null;
	 final public com.apple.jobjc.foundation.NSString NSNibTopLevelObjects(){
		if(_NSNibTopLevelObjects != null) return _NSNibTopLevelObjects;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSNibTopLevelObjects", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSNibTopLevelObjects = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.ID _NSNoSelectionMarker = null;
	 final public <T extends com.apple.jobjc.ID> T NSNoSelectionMarker(){
		if(_NSNoSelectionMarker != null) return (T)_NSNoSelectionMarker;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSNoSelectionMarker", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSNoSelectionMarker = returnValue;
		return (T)returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSNoSelectionPlaceholderBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSNoSelectionPlaceholderBindingOption(){
		if(_NSNoSelectionPlaceholderBindingOption != null) return _NSNoSelectionPlaceholderBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSNoSelectionPlaceholderBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSNoSelectionPlaceholderBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.ID _NSNotApplicableMarker = null;
	 final public <T extends com.apple.jobjc.ID> T NSNotApplicableMarker(){
		if(_NSNotApplicableMarker != null) return (T)_NSNotApplicableMarker;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSNotApplicableMarker", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSNotApplicableMarker = returnValue;
		return (T)returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSNotApplicablePlaceholderBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSNotApplicablePlaceholderBindingOption(){
		if(_NSNotApplicablePlaceholderBindingOption != null) return _NSNotApplicablePlaceholderBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSNotApplicablePlaceholderBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSNotApplicablePlaceholderBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSNullPlaceholderBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSNullPlaceholderBindingOption(){
		if(_NSNullPlaceholderBindingOption != null) return _NSNullPlaceholderBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSNullPlaceholderBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSNullPlaceholderBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSObliquenessAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSObliquenessAttributeName(){
		if(_NSObliquenessAttributeName != null) return _NSObliquenessAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSObliquenessAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSObliquenessAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSObservedKeyPathKey = null;
	 final public com.apple.jobjc.foundation.NSString NSObservedKeyPathKey(){
		if(_NSObservedKeyPathKey != null) return _NSObservedKeyPathKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSObservedKeyPathKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSObservedKeyPathKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSObservedObjectKey = null;
	 final public com.apple.jobjc.foundation.NSString NSObservedObjectKey(){
		if(_NSObservedObjectKey != null) return _NSObservedObjectKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSObservedObjectKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSObservedObjectKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSOffStateImageBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSOffStateImageBinding(){
		if(_NSOffStateImageBinding != null) return _NSOffStateImageBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSOffStateImageBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSOffStateImageBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSOfficeOpenXMLTextDocumentType = null;
	 final public com.apple.jobjc.foundation.NSString NSOfficeOpenXMLTextDocumentType(){
		if(_NSOfficeOpenXMLTextDocumentType != null) return _NSOfficeOpenXMLTextDocumentType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSOfficeOpenXMLTextDocumentType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSOfficeOpenXMLTextDocumentType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSOnStateImageBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSOnStateImageBinding(){
		if(_NSOnStateImageBinding != null) return _NSOnStateImageBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSOnStateImageBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSOnStateImageBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSOpenDocumentTextDocumentType = null;
	 final public com.apple.jobjc.foundation.NSString NSOpenDocumentTextDocumentType(){
		if(_NSOpenDocumentTextDocumentType != null) return _NSOpenDocumentTextDocumentType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSOpenDocumentTextDocumentType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSOpenDocumentTextDocumentType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSOptionsKey = null;
	 final public com.apple.jobjc.foundation.NSString NSOptionsKey(){
		if(_NSOptionsKey != null) return _NSOptionsKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSOptionsKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSOptionsKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSOutlineViewColumnDidMoveNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSOutlineViewColumnDidMoveNotification(){
		if(_NSOutlineViewColumnDidMoveNotification != null) return _NSOutlineViewColumnDidMoveNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSOutlineViewColumnDidMoveNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSOutlineViewColumnDidMoveNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSOutlineViewColumnDidResizeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSOutlineViewColumnDidResizeNotification(){
		if(_NSOutlineViewColumnDidResizeNotification != null) return _NSOutlineViewColumnDidResizeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSOutlineViewColumnDidResizeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSOutlineViewColumnDidResizeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSOutlineViewItemDidCollapseNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSOutlineViewItemDidCollapseNotification(){
		if(_NSOutlineViewItemDidCollapseNotification != null) return _NSOutlineViewItemDidCollapseNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSOutlineViewItemDidCollapseNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSOutlineViewItemDidCollapseNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSOutlineViewItemDidExpandNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSOutlineViewItemDidExpandNotification(){
		if(_NSOutlineViewItemDidExpandNotification != null) return _NSOutlineViewItemDidExpandNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSOutlineViewItemDidExpandNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSOutlineViewItemDidExpandNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSOutlineViewItemWillCollapseNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSOutlineViewItemWillCollapseNotification(){
		if(_NSOutlineViewItemWillCollapseNotification != null) return _NSOutlineViewItemWillCollapseNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSOutlineViewItemWillCollapseNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSOutlineViewItemWillCollapseNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSOutlineViewItemWillExpandNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSOutlineViewItemWillExpandNotification(){
		if(_NSOutlineViewItemWillExpandNotification != null) return _NSOutlineViewItemWillExpandNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSOutlineViewItemWillExpandNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSOutlineViewItemWillExpandNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSOutlineViewSelectionDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSOutlineViewSelectionDidChangeNotification(){
		if(_NSOutlineViewSelectionDidChangeNotification != null) return _NSOutlineViewSelectionDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSOutlineViewSelectionDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSOutlineViewSelectionDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSOutlineViewSelectionIsChangingNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSOutlineViewSelectionIsChangingNotification(){
		if(_NSOutlineViewSelectionIsChangingNotification != null) return _NSOutlineViewSelectionIsChangingNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSOutlineViewSelectionIsChangingNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSOutlineViewSelectionIsChangingNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPDFPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSPDFPboardType(){
		if(_NSPDFPboardType != null) return _NSPDFPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPDFPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPDFPboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPICTPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSPICTPboardType(){
		if(_NSPICTPboardType != null) return _NSPICTPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPICTPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPICTPboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPPDIncludeNotFoundException = null;
	 final public com.apple.jobjc.foundation.NSString NSPPDIncludeNotFoundException(){
		if(_NSPPDIncludeNotFoundException != null) return _NSPPDIncludeNotFoundException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPPDIncludeNotFoundException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPPDIncludeNotFoundException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPPDIncludeStackOverflowException = null;
	 final public com.apple.jobjc.foundation.NSString NSPPDIncludeStackOverflowException(){
		if(_NSPPDIncludeStackOverflowException != null) return _NSPPDIncludeStackOverflowException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPPDIncludeStackOverflowException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPPDIncludeStackOverflowException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPPDIncludeStackUnderflowException = null;
	 final public com.apple.jobjc.foundation.NSString NSPPDIncludeStackUnderflowException(){
		if(_NSPPDIncludeStackUnderflowException != null) return _NSPPDIncludeStackUnderflowException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPPDIncludeStackUnderflowException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPPDIncludeStackUnderflowException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPPDParseException = null;
	 final public com.apple.jobjc.foundation.NSString NSPPDParseException(){
		if(_NSPPDParseException != null) return _NSPPDParseException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPPDParseException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPPDParseException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPaperSizeDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSPaperSizeDocumentAttribute(){
		if(_NSPaperSizeDocumentAttribute != null) return _NSPaperSizeDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPaperSizeDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPaperSizeDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSParagraphStyleAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSParagraphStyleAttributeName(){
		if(_NSParagraphStyleAttributeName != null) return _NSParagraphStyleAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSParagraphStyleAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSParagraphStyleAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPasteboardCommunicationException = null;
	 final public com.apple.jobjc.foundation.NSString NSPasteboardCommunicationException(){
		if(_NSPasteboardCommunicationException != null) return _NSPasteboardCommunicationException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPasteboardCommunicationException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPasteboardCommunicationException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPasteboardTypeColor = null;
	 final public com.apple.jobjc.foundation.NSString NSPasteboardTypeColor(){
		if(_NSPasteboardTypeColor != null) return _NSPasteboardTypeColor;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPasteboardTypeColor", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPasteboardTypeColor = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPasteboardTypeFindPanelSearchOptions = null;
	 final public com.apple.jobjc.foundation.NSString NSPasteboardTypeFindPanelSearchOptions(){
		if(_NSPasteboardTypeFindPanelSearchOptions != null) return _NSPasteboardTypeFindPanelSearchOptions;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPasteboardTypeFindPanelSearchOptions", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPasteboardTypeFindPanelSearchOptions = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPasteboardTypeFont = null;
	 final public com.apple.jobjc.foundation.NSString NSPasteboardTypeFont(){
		if(_NSPasteboardTypeFont != null) return _NSPasteboardTypeFont;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPasteboardTypeFont", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPasteboardTypeFont = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPasteboardTypeHTML = null;
	 final public com.apple.jobjc.foundation.NSString NSPasteboardTypeHTML(){
		if(_NSPasteboardTypeHTML != null) return _NSPasteboardTypeHTML;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPasteboardTypeHTML", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPasteboardTypeHTML = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPasteboardTypeMultipleTextSelection = null;
	 final public com.apple.jobjc.foundation.NSString NSPasteboardTypeMultipleTextSelection(){
		if(_NSPasteboardTypeMultipleTextSelection != null) return _NSPasteboardTypeMultipleTextSelection;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPasteboardTypeMultipleTextSelection", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPasteboardTypeMultipleTextSelection = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPasteboardTypePDF = null;
	 final public com.apple.jobjc.foundation.NSString NSPasteboardTypePDF(){
		if(_NSPasteboardTypePDF != null) return _NSPasteboardTypePDF;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPasteboardTypePDF", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPasteboardTypePDF = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPasteboardTypePNG = null;
	 final public com.apple.jobjc.foundation.NSString NSPasteboardTypePNG(){
		if(_NSPasteboardTypePNG != null) return _NSPasteboardTypePNG;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPasteboardTypePNG", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPasteboardTypePNG = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPasteboardTypeRTF = null;
	 final public com.apple.jobjc.foundation.NSString NSPasteboardTypeRTF(){
		if(_NSPasteboardTypeRTF != null) return _NSPasteboardTypeRTF;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPasteboardTypeRTF", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPasteboardTypeRTF = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPasteboardTypeRTFD = null;
	 final public com.apple.jobjc.foundation.NSString NSPasteboardTypeRTFD(){
		if(_NSPasteboardTypeRTFD != null) return _NSPasteboardTypeRTFD;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPasteboardTypeRTFD", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPasteboardTypeRTFD = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPasteboardTypeRuler = null;
	 final public com.apple.jobjc.foundation.NSString NSPasteboardTypeRuler(){
		if(_NSPasteboardTypeRuler != null) return _NSPasteboardTypeRuler;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPasteboardTypeRuler", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPasteboardTypeRuler = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPasteboardTypeSound = null;
	 final public com.apple.jobjc.foundation.NSString NSPasteboardTypeSound(){
		if(_NSPasteboardTypeSound != null) return _NSPasteboardTypeSound;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPasteboardTypeSound", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPasteboardTypeSound = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPasteboardTypeString = null;
	 final public com.apple.jobjc.foundation.NSString NSPasteboardTypeString(){
		if(_NSPasteboardTypeString != null) return _NSPasteboardTypeString;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPasteboardTypeString", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPasteboardTypeString = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPasteboardTypeTIFF = null;
	 final public com.apple.jobjc.foundation.NSString NSPasteboardTypeTIFF(){
		if(_NSPasteboardTypeTIFF != null) return _NSPasteboardTypeTIFF;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPasteboardTypeTIFF", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPasteboardTypeTIFF = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPasteboardTypeTabularText = null;
	 final public com.apple.jobjc.foundation.NSString NSPasteboardTypeTabularText(){
		if(_NSPasteboardTypeTabularText != null) return _NSPasteboardTypeTabularText;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPasteboardTypeTabularText", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPasteboardTypeTabularText = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPasteboardTypeTextFinderOptions = null;
	 final public com.apple.jobjc.foundation.NSString NSPasteboardTypeTextFinderOptions(){
		if(_NSPasteboardTypeTextFinderOptions != null) return _NSPasteboardTypeTextFinderOptions;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPasteboardTypeTextFinderOptions", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPasteboardTypeTextFinderOptions = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPasteboardURLReadingContentsConformToTypesKey = null;
	 final public com.apple.jobjc.foundation.NSString NSPasteboardURLReadingContentsConformToTypesKey(){
		if(_NSPasteboardURLReadingContentsConformToTypesKey != null) return _NSPasteboardURLReadingContentsConformToTypesKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPasteboardURLReadingContentsConformToTypesKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPasteboardURLReadingContentsConformToTypesKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPasteboardURLReadingFileURLsOnlyKey = null;
	 final public com.apple.jobjc.foundation.NSString NSPasteboardURLReadingFileURLsOnlyKey(){
		if(_NSPasteboardURLReadingFileURLsOnlyKey != null) return _NSPasteboardURLReadingFileURLsOnlyKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPasteboardURLReadingFileURLsOnlyKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPasteboardURLReadingFileURLsOnlyKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPatternColorSpace = null;
	 final public com.apple.jobjc.foundation.NSString NSPatternColorSpace(){
		if(_NSPatternColorSpace != null) return _NSPatternColorSpace;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPatternColorSpace", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPatternColorSpace = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPlainFileType = null;
	 final public com.apple.jobjc.foundation.NSString NSPlainFileType(){
		if(_NSPlainFileType != null) return _NSPlainFileType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPlainFileType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPlainFileType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPlainTextDocumentType = null;
	 final public com.apple.jobjc.foundation.NSString NSPlainTextDocumentType(){
		if(_NSPlainTextDocumentType != null) return _NSPlainTextDocumentType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPlainTextDocumentType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPlainTextDocumentType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPopUpButtonCellWillPopUpNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSPopUpButtonCellWillPopUpNotification(){
		if(_NSPopUpButtonCellWillPopUpNotification != null) return _NSPopUpButtonCellWillPopUpNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPopUpButtonCellWillPopUpNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPopUpButtonCellWillPopUpNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPopUpButtonWillPopUpNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSPopUpButtonWillPopUpNotification(){
		if(_NSPopUpButtonWillPopUpNotification != null) return _NSPopUpButtonWillPopUpNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPopUpButtonWillPopUpNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPopUpButtonWillPopUpNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPopoverCloseReasonDetachToWindow = null;
	 final public com.apple.jobjc.foundation.NSString NSPopoverCloseReasonDetachToWindow(){
		if(_NSPopoverCloseReasonDetachToWindow != null) return _NSPopoverCloseReasonDetachToWindow;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPopoverCloseReasonDetachToWindow", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPopoverCloseReasonDetachToWindow = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPopoverCloseReasonKey = null;
	 final public com.apple.jobjc.foundation.NSString NSPopoverCloseReasonKey(){
		if(_NSPopoverCloseReasonKey != null) return _NSPopoverCloseReasonKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPopoverCloseReasonKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPopoverCloseReasonKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPopoverCloseReasonStandard = null;
	 final public com.apple.jobjc.foundation.NSString NSPopoverCloseReasonStandard(){
		if(_NSPopoverCloseReasonStandard != null) return _NSPopoverCloseReasonStandard;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPopoverCloseReasonStandard", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPopoverCloseReasonStandard = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPopoverDidCloseNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSPopoverDidCloseNotification(){
		if(_NSPopoverDidCloseNotification != null) return _NSPopoverDidCloseNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPopoverDidCloseNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPopoverDidCloseNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPopoverDidShowNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSPopoverDidShowNotification(){
		if(_NSPopoverDidShowNotification != null) return _NSPopoverDidShowNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPopoverDidShowNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPopoverDidShowNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPopoverWillCloseNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSPopoverWillCloseNotification(){
		if(_NSPopoverWillCloseNotification != null) return _NSPopoverWillCloseNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPopoverWillCloseNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPopoverWillCloseNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPopoverWillShowNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSPopoverWillShowNotification(){
		if(_NSPopoverWillShowNotification != null) return _NSPopoverWillShowNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPopoverWillShowNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPopoverWillShowNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPositioningRectBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSPositioningRectBinding(){
		if(_NSPositioningRectBinding != null) return _NSPositioningRectBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPositioningRectBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPositioningRectBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPostScriptPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSPostScriptPboardType(){
		if(_NSPostScriptPboardType != null) return _NSPostScriptPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPostScriptPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPostScriptPboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPredicateBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSPredicateBinding(){
		if(_NSPredicateBinding != null) return _NSPredicateBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPredicateBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPredicateBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPredicateFormatBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSPredicateFormatBindingOption(){
		if(_NSPredicateFormatBindingOption != null) return _NSPredicateFormatBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPredicateFormatBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPredicateFormatBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPreferredScrollerStyleDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSPreferredScrollerStyleDidChangeNotification(){
		if(_NSPreferredScrollerStyleDidChangeNotification != null) return _NSPreferredScrollerStyleDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPreferredScrollerStyleDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPreferredScrollerStyleDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrefixSpacesDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSPrefixSpacesDocumentAttribute(){
		if(_NSPrefixSpacesDocumentAttribute != null) return _NSPrefixSpacesDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrefixSpacesDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrefixSpacesDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintAllPages = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintAllPages(){
		if(_NSPrintAllPages != null) return _NSPrintAllPages;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintAllPages", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintAllPages = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintAllPresetsJobStyleHint = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintAllPresetsJobStyleHint(){
		if(_NSPrintAllPresetsJobStyleHint != null) return _NSPrintAllPresetsJobStyleHint;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintAllPresetsJobStyleHint", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintAllPresetsJobStyleHint = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintBottomMargin = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintBottomMargin(){
		if(_NSPrintBottomMargin != null) return _NSPrintBottomMargin;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintBottomMargin", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintBottomMargin = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintCancelJob = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintCancelJob(){
		if(_NSPrintCancelJob != null) return _NSPrintCancelJob;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintCancelJob", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintCancelJob = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintCopies = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintCopies(){
		if(_NSPrintCopies != null) return _NSPrintCopies;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintCopies", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintCopies = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintDetailedErrorReporting = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintDetailedErrorReporting(){
		if(_NSPrintDetailedErrorReporting != null) return _NSPrintDetailedErrorReporting;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintDetailedErrorReporting", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintDetailedErrorReporting = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintFaxNumber = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintFaxNumber(){
		if(_NSPrintFaxNumber != null) return _NSPrintFaxNumber;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintFaxNumber", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintFaxNumber = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintFirstPage = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintFirstPage(){
		if(_NSPrintFirstPage != null) return _NSPrintFirstPage;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintFirstPage", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintFirstPage = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintFormName = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintFormName(){
		if(_NSPrintFormName != null) return _NSPrintFormName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintFormName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintFormName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintHeaderAndFooter = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintHeaderAndFooter(){
		if(_NSPrintHeaderAndFooter != null) return _NSPrintHeaderAndFooter;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintHeaderAndFooter", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintHeaderAndFooter = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintHorizontalPagination = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintHorizontalPagination(){
		if(_NSPrintHorizontalPagination != null) return _NSPrintHorizontalPagination;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintHorizontalPagination", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintHorizontalPagination = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintHorizontallyCentered = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintHorizontallyCentered(){
		if(_NSPrintHorizontallyCentered != null) return _NSPrintHorizontallyCentered;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintHorizontallyCentered", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintHorizontallyCentered = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintJobDisposition = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintJobDisposition(){
		if(_NSPrintJobDisposition != null) return _NSPrintJobDisposition;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintJobDisposition", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintJobDisposition = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintJobFeatures = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintJobFeatures(){
		if(_NSPrintJobFeatures != null) return _NSPrintJobFeatures;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintJobFeatures", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintJobFeatures = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintJobSavingFileNameExtensionHidden = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintJobSavingFileNameExtensionHidden(){
		if(_NSPrintJobSavingFileNameExtensionHidden != null) return _NSPrintJobSavingFileNameExtensionHidden;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintJobSavingFileNameExtensionHidden", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintJobSavingFileNameExtensionHidden = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintJobSavingURL = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintJobSavingURL(){
		if(_NSPrintJobSavingURL != null) return _NSPrintJobSavingURL;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintJobSavingURL", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintJobSavingURL = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintLastPage = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintLastPage(){
		if(_NSPrintLastPage != null) return _NSPrintLastPage;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintLastPage", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintLastPage = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintLeftMargin = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintLeftMargin(){
		if(_NSPrintLeftMargin != null) return _NSPrintLeftMargin;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintLeftMargin", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintLeftMargin = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintManualFeed = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintManualFeed(){
		if(_NSPrintManualFeed != null) return _NSPrintManualFeed;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintManualFeed", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintManualFeed = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintMustCollate = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintMustCollate(){
		if(_NSPrintMustCollate != null) return _NSPrintMustCollate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintMustCollate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintMustCollate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintNoPresetsJobStyleHint = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintNoPresetsJobStyleHint(){
		if(_NSPrintNoPresetsJobStyleHint != null) return _NSPrintNoPresetsJobStyleHint;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintNoPresetsJobStyleHint", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintNoPresetsJobStyleHint = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintOperationExistsException = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintOperationExistsException(){
		if(_NSPrintOperationExistsException != null) return _NSPrintOperationExistsException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintOperationExistsException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintOperationExistsException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintOrientation = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintOrientation(){
		if(_NSPrintOrientation != null) return _NSPrintOrientation;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintOrientation", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintOrientation = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintPackageException = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintPackageException(){
		if(_NSPrintPackageException != null) return _NSPrintPackageException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintPackageException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintPackageException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintPagesAcross = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintPagesAcross(){
		if(_NSPrintPagesAcross != null) return _NSPrintPagesAcross;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintPagesAcross", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintPagesAcross = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintPagesDown = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintPagesDown(){
		if(_NSPrintPagesDown != null) return _NSPrintPagesDown;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintPagesDown", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintPagesDown = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintPagesPerSheet = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintPagesPerSheet(){
		if(_NSPrintPagesPerSheet != null) return _NSPrintPagesPerSheet;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintPagesPerSheet", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintPagesPerSheet = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintPanelAccessorySummaryItemDescriptionKey = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintPanelAccessorySummaryItemDescriptionKey(){
		if(_NSPrintPanelAccessorySummaryItemDescriptionKey != null) return _NSPrintPanelAccessorySummaryItemDescriptionKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintPanelAccessorySummaryItemDescriptionKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintPanelAccessorySummaryItemDescriptionKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintPanelAccessorySummaryItemNameKey = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintPanelAccessorySummaryItemNameKey(){
		if(_NSPrintPanelAccessorySummaryItemNameKey != null) return _NSPrintPanelAccessorySummaryItemNameKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintPanelAccessorySummaryItemNameKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintPanelAccessorySummaryItemNameKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintPaperFeed = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintPaperFeed(){
		if(_NSPrintPaperFeed != null) return _NSPrintPaperFeed;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintPaperFeed", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintPaperFeed = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintPaperName = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintPaperName(){
		if(_NSPrintPaperName != null) return _NSPrintPaperName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintPaperName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintPaperName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintPaperSize = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintPaperSize(){
		if(_NSPrintPaperSize != null) return _NSPrintPaperSize;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintPaperSize", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintPaperSize = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintPhotoJobStyleHint = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintPhotoJobStyleHint(){
		if(_NSPrintPhotoJobStyleHint != null) return _NSPrintPhotoJobStyleHint;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintPhotoJobStyleHint", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintPhotoJobStyleHint = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintPreviewJob = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintPreviewJob(){
		if(_NSPrintPreviewJob != null) return _NSPrintPreviewJob;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintPreviewJob", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintPreviewJob = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintPrinter = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintPrinter(){
		if(_NSPrintPrinter != null) return _NSPrintPrinter;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintPrinter", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintPrinter = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintPrinterName = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintPrinterName(){
		if(_NSPrintPrinterName != null) return _NSPrintPrinterName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintPrinterName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintPrinterName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintReversePageOrder = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintReversePageOrder(){
		if(_NSPrintReversePageOrder != null) return _NSPrintReversePageOrder;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintReversePageOrder", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintReversePageOrder = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintRightMargin = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintRightMargin(){
		if(_NSPrintRightMargin != null) return _NSPrintRightMargin;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintRightMargin", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintRightMargin = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintSaveJob = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintSaveJob(){
		if(_NSPrintSaveJob != null) return _NSPrintSaveJob;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintSaveJob", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintSaveJob = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintSavePath = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintSavePath(){
		if(_NSPrintSavePath != null) return _NSPrintSavePath;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintSavePath", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintSavePath = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintScalingFactor = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintScalingFactor(){
		if(_NSPrintScalingFactor != null) return _NSPrintScalingFactor;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintScalingFactor", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintScalingFactor = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintSelectionOnly = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintSelectionOnly(){
		if(_NSPrintSelectionOnly != null) return _NSPrintSelectionOnly;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintSelectionOnly", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintSelectionOnly = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintSpoolJob = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintSpoolJob(){
		if(_NSPrintSpoolJob != null) return _NSPrintSpoolJob;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintSpoolJob", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintSpoolJob = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintTime = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintTime(){
		if(_NSPrintTime != null) return _NSPrintTime;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintTime", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintTime = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintTopMargin = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintTopMargin(){
		if(_NSPrintTopMargin != null) return _NSPrintTopMargin;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintTopMargin", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintTopMargin = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintVerticalPagination = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintVerticalPagination(){
		if(_NSPrintVerticalPagination != null) return _NSPrintVerticalPagination;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintVerticalPagination", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintVerticalPagination = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintVerticallyCentered = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintVerticallyCentered(){
		if(_NSPrintVerticallyCentered != null) return _NSPrintVerticallyCentered;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintVerticallyCentered", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintVerticallyCentered = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSPrintingCommunicationException = null;
	 final public com.apple.jobjc.foundation.NSString NSPrintingCommunicationException(){
		if(_NSPrintingCommunicationException != null) return _NSPrintingCommunicationException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSPrintingCommunicationException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSPrintingCommunicationException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRTFDPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSRTFDPboardType(){
		if(_NSRTFDPboardType != null) return _NSRTFDPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRTFDPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRTFDPboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRTFDTextDocumentType = null;
	 final public com.apple.jobjc.foundation.NSString NSRTFDTextDocumentType(){
		if(_NSRTFDTextDocumentType != null) return _NSRTFDTextDocumentType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRTFDTextDocumentType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRTFDTextDocumentType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRTFPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSRTFPboardType(){
		if(_NSRTFPboardType != null) return _NSRTFPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRTFPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRTFPboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRTFPropertyStackOverflowException = null;
	 final public com.apple.jobjc.foundation.NSString NSRTFPropertyStackOverflowException(){
		if(_NSRTFPropertyStackOverflowException != null) return _NSRTFPropertyStackOverflowException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRTFPropertyStackOverflowException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRTFPropertyStackOverflowException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRTFTextDocumentType = null;
	 final public com.apple.jobjc.foundation.NSString NSRTFTextDocumentType(){
		if(_NSRTFTextDocumentType != null) return _NSRTFTextDocumentType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRTFTextDocumentType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRTFTextDocumentType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRaisesForNotApplicableKeysBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSRaisesForNotApplicableKeysBindingOption(){
		if(_NSRaisesForNotApplicableKeysBindingOption != null) return _NSRaisesForNotApplicableKeysBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRaisesForNotApplicableKeysBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRaisesForNotApplicableKeysBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSReadOnlyDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSReadOnlyDocumentAttribute(){
		if(_NSReadOnlyDocumentAttribute != null) return _NSReadOnlyDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSReadOnlyDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSReadOnlyDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRecentSearchesBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSRecentSearchesBinding(){
		if(_NSRecentSearchesBinding != null) return _NSRecentSearchesBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRecentSearchesBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRecentSearchesBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRepresentedFilenameBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSRepresentedFilenameBinding(){
		if(_NSRepresentedFilenameBinding != null) return _NSRepresentedFilenameBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRepresentedFilenameBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRepresentedFilenameBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRightMarginDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSRightMarginDocumentAttribute(){
		if(_NSRightMarginDocumentAttribute != null) return _NSRightMarginDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRightMarginDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRightMarginDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRowHeightBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSRowHeightBinding(){
		if(_NSRowHeightBinding != null) return _NSRowHeightBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRowHeightBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRowHeightBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRuleEditorPredicateComparisonModifier = null;
	 final public com.apple.jobjc.foundation.NSString NSRuleEditorPredicateComparisonModifier(){
		if(_NSRuleEditorPredicateComparisonModifier != null) return _NSRuleEditorPredicateComparisonModifier;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRuleEditorPredicateComparisonModifier", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRuleEditorPredicateComparisonModifier = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRuleEditorPredicateCompoundType = null;
	 final public com.apple.jobjc.foundation.NSString NSRuleEditorPredicateCompoundType(){
		if(_NSRuleEditorPredicateCompoundType != null) return _NSRuleEditorPredicateCompoundType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRuleEditorPredicateCompoundType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRuleEditorPredicateCompoundType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRuleEditorPredicateCustomSelector = null;
	 final public com.apple.jobjc.foundation.NSString NSRuleEditorPredicateCustomSelector(){
		if(_NSRuleEditorPredicateCustomSelector != null) return _NSRuleEditorPredicateCustomSelector;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRuleEditorPredicateCustomSelector", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRuleEditorPredicateCustomSelector = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRuleEditorPredicateLeftExpression = null;
	 final public com.apple.jobjc.foundation.NSString NSRuleEditorPredicateLeftExpression(){
		if(_NSRuleEditorPredicateLeftExpression != null) return _NSRuleEditorPredicateLeftExpression;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRuleEditorPredicateLeftExpression", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRuleEditorPredicateLeftExpression = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRuleEditorPredicateOperatorType = null;
	 final public com.apple.jobjc.foundation.NSString NSRuleEditorPredicateOperatorType(){
		if(_NSRuleEditorPredicateOperatorType != null) return _NSRuleEditorPredicateOperatorType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRuleEditorPredicateOperatorType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRuleEditorPredicateOperatorType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRuleEditorPredicateOptions = null;
	 final public com.apple.jobjc.foundation.NSString NSRuleEditorPredicateOptions(){
		if(_NSRuleEditorPredicateOptions != null) return _NSRuleEditorPredicateOptions;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRuleEditorPredicateOptions", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRuleEditorPredicateOptions = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRuleEditorPredicateRightExpression = null;
	 final public com.apple.jobjc.foundation.NSString NSRuleEditorPredicateRightExpression(){
		if(_NSRuleEditorPredicateRightExpression != null) return _NSRuleEditorPredicateRightExpression;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRuleEditorPredicateRightExpression", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRuleEditorPredicateRightExpression = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRuleEditorRowsDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSRuleEditorRowsDidChangeNotification(){
		if(_NSRuleEditorRowsDidChangeNotification != null) return _NSRuleEditorRowsDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRuleEditorRowsDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRuleEditorRowsDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRulerPboard = null;
	 final public com.apple.jobjc.foundation.NSString NSRulerPboard(){
		if(_NSRulerPboard != null) return _NSRulerPboard;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRulerPboard", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRulerPboard = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSRulerPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSRulerPboardType(){
		if(_NSRulerPboardType != null) return _NSRulerPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSRulerPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSRulerPboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSScreenColorSpaceDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSScreenColorSpaceDidChangeNotification(){
		if(_NSScreenColorSpaceDidChangeNotification != null) return _NSScreenColorSpaceDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSScreenColorSpaceDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSScreenColorSpaceDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSScrollViewDidEndLiveMagnifyNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSScrollViewDidEndLiveMagnifyNotification(){
		if(_NSScrollViewDidEndLiveMagnifyNotification != null) return _NSScrollViewDidEndLiveMagnifyNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSScrollViewDidEndLiveMagnifyNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSScrollViewDidEndLiveMagnifyNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSScrollViewWillStartLiveMagnifyNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSScrollViewWillStartLiveMagnifyNotification(){
		if(_NSScrollViewWillStartLiveMagnifyNotification != null) return _NSScrollViewWillStartLiveMagnifyNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSScrollViewWillStartLiveMagnifyNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSScrollViewWillStartLiveMagnifyNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSelectedIdentifierBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSSelectedIdentifierBinding(){
		if(_NSSelectedIdentifierBinding != null) return _NSSelectedIdentifierBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSelectedIdentifierBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSelectedIdentifierBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSelectedIndexBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSSelectedIndexBinding(){
		if(_NSSelectedIndexBinding != null) return _NSSelectedIndexBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSelectedIndexBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSelectedIndexBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSelectedLabelBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSSelectedLabelBinding(){
		if(_NSSelectedLabelBinding != null) return _NSSelectedLabelBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSelectedLabelBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSelectedLabelBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSelectedObjectBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSSelectedObjectBinding(){
		if(_NSSelectedObjectBinding != null) return _NSSelectedObjectBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSelectedObjectBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSelectedObjectBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSelectedObjectsBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSSelectedObjectsBinding(){
		if(_NSSelectedObjectsBinding != null) return _NSSelectedObjectsBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSelectedObjectsBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSelectedObjectsBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSelectedTagBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSSelectedTagBinding(){
		if(_NSSelectedTagBinding != null) return _NSSelectedTagBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSelectedTagBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSelectedTagBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSelectedValueBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSSelectedValueBinding(){
		if(_NSSelectedValueBinding != null) return _NSSelectedValueBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSelectedValueBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSelectedValueBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSelectedValuesBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSSelectedValuesBinding(){
		if(_NSSelectedValuesBinding != null) return _NSSelectedValuesBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSelectedValuesBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSelectedValuesBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSelectionIndexPathsBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSSelectionIndexPathsBinding(){
		if(_NSSelectionIndexPathsBinding != null) return _NSSelectionIndexPathsBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSelectionIndexPathsBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSelectionIndexPathsBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSelectionIndexesBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSSelectionIndexesBinding(){
		if(_NSSelectionIndexesBinding != null) return _NSSelectionIndexesBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSelectionIndexesBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSelectionIndexesBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSelectorNameBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSSelectorNameBindingOption(){
		if(_NSSelectorNameBindingOption != null) return _NSSelectorNameBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSelectorNameBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSelectorNameBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSelectsAllWhenSettingContentBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSSelectsAllWhenSettingContentBindingOption(){
		if(_NSSelectsAllWhenSettingContentBindingOption != null) return _NSSelectsAllWhenSettingContentBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSelectsAllWhenSettingContentBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSelectsAllWhenSettingContentBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSShadowAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSShadowAttributeName(){
		if(_NSShadowAttributeName != null) return _NSShadowAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSShadowAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSShadowAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSharingServiceNameAddToAperture = null;
	 final public com.apple.jobjc.foundation.NSString NSSharingServiceNameAddToAperture(){
		if(_NSSharingServiceNameAddToAperture != null) return _NSSharingServiceNameAddToAperture;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSharingServiceNameAddToAperture", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSharingServiceNameAddToAperture = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSharingServiceNameAddToIPhoto = null;
	 final public com.apple.jobjc.foundation.NSString NSSharingServiceNameAddToIPhoto(){
		if(_NSSharingServiceNameAddToIPhoto != null) return _NSSharingServiceNameAddToIPhoto;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSharingServiceNameAddToIPhoto", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSharingServiceNameAddToIPhoto = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSharingServiceNameAddToSafariReadingList = null;
	 final public com.apple.jobjc.foundation.NSString NSSharingServiceNameAddToSafariReadingList(){
		if(_NSSharingServiceNameAddToSafariReadingList != null) return _NSSharingServiceNameAddToSafariReadingList;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSharingServiceNameAddToSafariReadingList", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSharingServiceNameAddToSafariReadingList = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSharingServiceNameComposeEmail = null;
	 final public com.apple.jobjc.foundation.NSString NSSharingServiceNameComposeEmail(){
		if(_NSSharingServiceNameComposeEmail != null) return _NSSharingServiceNameComposeEmail;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSharingServiceNameComposeEmail", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSharingServiceNameComposeEmail = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSharingServiceNameComposeMessage = null;
	 final public com.apple.jobjc.foundation.NSString NSSharingServiceNameComposeMessage(){
		if(_NSSharingServiceNameComposeMessage != null) return _NSSharingServiceNameComposeMessage;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSharingServiceNameComposeMessage", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSharingServiceNameComposeMessage = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSharingServiceNamePostImageOnFlickr = null;
	 final public com.apple.jobjc.foundation.NSString NSSharingServiceNamePostImageOnFlickr(){
		if(_NSSharingServiceNamePostImageOnFlickr != null) return _NSSharingServiceNamePostImageOnFlickr;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSharingServiceNamePostImageOnFlickr", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSharingServiceNamePostImageOnFlickr = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSharingServiceNamePostOnFacebook = null;
	 final public com.apple.jobjc.foundation.NSString NSSharingServiceNamePostOnFacebook(){
		if(_NSSharingServiceNamePostOnFacebook != null) return _NSSharingServiceNamePostOnFacebook;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSharingServiceNamePostOnFacebook", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSharingServiceNamePostOnFacebook = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSharingServiceNamePostOnSinaWeibo = null;
	 final public com.apple.jobjc.foundation.NSString NSSharingServiceNamePostOnSinaWeibo(){
		if(_NSSharingServiceNamePostOnSinaWeibo != null) return _NSSharingServiceNamePostOnSinaWeibo;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSharingServiceNamePostOnSinaWeibo", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSharingServiceNamePostOnSinaWeibo = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSharingServiceNamePostOnTwitter = null;
	 final public com.apple.jobjc.foundation.NSString NSSharingServiceNamePostOnTwitter(){
		if(_NSSharingServiceNamePostOnTwitter != null) return _NSSharingServiceNamePostOnTwitter;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSharingServiceNamePostOnTwitter", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSharingServiceNamePostOnTwitter = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSharingServiceNamePostVideoOnTudou = null;
	 final public com.apple.jobjc.foundation.NSString NSSharingServiceNamePostVideoOnTudou(){
		if(_NSSharingServiceNamePostVideoOnTudou != null) return _NSSharingServiceNamePostVideoOnTudou;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSharingServiceNamePostVideoOnTudou", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSharingServiceNamePostVideoOnTudou = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSharingServiceNamePostVideoOnVimeo = null;
	 final public com.apple.jobjc.foundation.NSString NSSharingServiceNamePostVideoOnVimeo(){
		if(_NSSharingServiceNamePostVideoOnVimeo != null) return _NSSharingServiceNamePostVideoOnVimeo;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSharingServiceNamePostVideoOnVimeo", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSharingServiceNamePostVideoOnVimeo = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSharingServiceNamePostVideoOnYouku = null;
	 final public com.apple.jobjc.foundation.NSString NSSharingServiceNamePostVideoOnYouku(){
		if(_NSSharingServiceNamePostVideoOnYouku != null) return _NSSharingServiceNamePostVideoOnYouku;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSharingServiceNamePostVideoOnYouku", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSharingServiceNamePostVideoOnYouku = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSharingServiceNameSendViaAirDrop = null;
	 final public com.apple.jobjc.foundation.NSString NSSharingServiceNameSendViaAirDrop(){
		if(_NSSharingServiceNameSendViaAirDrop != null) return _NSSharingServiceNameSendViaAirDrop;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSharingServiceNameSendViaAirDrop", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSharingServiceNameSendViaAirDrop = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSharingServiceNameUseAsDesktopPicture = null;
	 final public com.apple.jobjc.foundation.NSString NSSharingServiceNameUseAsDesktopPicture(){
		if(_NSSharingServiceNameUseAsDesktopPicture != null) return _NSSharingServiceNameUseAsDesktopPicture;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSharingServiceNameUseAsDesktopPicture", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSharingServiceNameUseAsDesktopPicture = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSharingServiceNameUseAsTwitterProfileImage = null;
	 final public com.apple.jobjc.foundation.NSString NSSharingServiceNameUseAsTwitterProfileImage(){
		if(_NSSharingServiceNameUseAsTwitterProfileImage != null) return _NSSharingServiceNameUseAsTwitterProfileImage;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSharingServiceNameUseAsTwitterProfileImage", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSharingServiceNameUseAsTwitterProfileImage = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSShellCommandFileType = null;
	 final public com.apple.jobjc.foundation.NSString NSShellCommandFileType(){
		if(_NSShellCommandFileType != null) return _NSShellCommandFileType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSShellCommandFileType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSShellCommandFileType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSortDescriptorsBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSSortDescriptorsBinding(){
		if(_NSSortDescriptorsBinding != null) return _NSSortDescriptorsBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSortDescriptorsBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSortDescriptorsBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSoundPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSSoundPboardType(){
		if(_NSSoundPboardType != null) return _NSSoundPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSoundPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSoundPboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechCharacterModeProperty = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechCharacterModeProperty(){
		if(_NSSpeechCharacterModeProperty != null) return _NSSpeechCharacterModeProperty;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechCharacterModeProperty", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechCharacterModeProperty = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechCommandDelimiterProperty = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechCommandDelimiterProperty(){
		if(_NSSpeechCommandDelimiterProperty != null) return _NSSpeechCommandDelimiterProperty;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechCommandDelimiterProperty", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechCommandDelimiterProperty = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechCommandPrefix = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechCommandPrefix(){
		if(_NSSpeechCommandPrefix != null) return _NSSpeechCommandPrefix;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechCommandPrefix", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechCommandPrefix = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechCommandSuffix = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechCommandSuffix(){
		if(_NSSpeechCommandSuffix != null) return _NSSpeechCommandSuffix;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechCommandSuffix", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechCommandSuffix = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechCurrentVoiceProperty = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechCurrentVoiceProperty(){
		if(_NSSpeechCurrentVoiceProperty != null) return _NSSpeechCurrentVoiceProperty;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechCurrentVoiceProperty", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechCurrentVoiceProperty = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechDictionaryAbbreviations = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechDictionaryAbbreviations(){
		if(_NSSpeechDictionaryAbbreviations != null) return _NSSpeechDictionaryAbbreviations;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechDictionaryAbbreviations", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechDictionaryAbbreviations = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechDictionaryEntryPhonemes = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechDictionaryEntryPhonemes(){
		if(_NSSpeechDictionaryEntryPhonemes != null) return _NSSpeechDictionaryEntryPhonemes;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechDictionaryEntryPhonemes", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechDictionaryEntryPhonemes = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechDictionaryEntrySpelling = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechDictionaryEntrySpelling(){
		if(_NSSpeechDictionaryEntrySpelling != null) return _NSSpeechDictionaryEntrySpelling;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechDictionaryEntrySpelling", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechDictionaryEntrySpelling = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechDictionaryLocaleIdentifier = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechDictionaryLocaleIdentifier(){
		if(_NSSpeechDictionaryLocaleIdentifier != null) return _NSSpeechDictionaryLocaleIdentifier;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechDictionaryLocaleIdentifier", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechDictionaryLocaleIdentifier = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechDictionaryModificationDate = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechDictionaryModificationDate(){
		if(_NSSpeechDictionaryModificationDate != null) return _NSSpeechDictionaryModificationDate;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechDictionaryModificationDate", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechDictionaryModificationDate = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechDictionaryPronunciations = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechDictionaryPronunciations(){
		if(_NSSpeechDictionaryPronunciations != null) return _NSSpeechDictionaryPronunciations;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechDictionaryPronunciations", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechDictionaryPronunciations = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechErrorCount = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechErrorCount(){
		if(_NSSpeechErrorCount != null) return _NSSpeechErrorCount;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechErrorCount", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechErrorCount = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechErrorNewestCharacterOffset = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechErrorNewestCharacterOffset(){
		if(_NSSpeechErrorNewestCharacterOffset != null) return _NSSpeechErrorNewestCharacterOffset;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechErrorNewestCharacterOffset", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechErrorNewestCharacterOffset = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechErrorNewestCode = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechErrorNewestCode(){
		if(_NSSpeechErrorNewestCode != null) return _NSSpeechErrorNewestCode;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechErrorNewestCode", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechErrorNewestCode = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechErrorOldestCharacterOffset = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechErrorOldestCharacterOffset(){
		if(_NSSpeechErrorOldestCharacterOffset != null) return _NSSpeechErrorOldestCharacterOffset;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechErrorOldestCharacterOffset", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechErrorOldestCharacterOffset = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechErrorOldestCode = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechErrorOldestCode(){
		if(_NSSpeechErrorOldestCode != null) return _NSSpeechErrorOldestCode;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechErrorOldestCode", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechErrorOldestCode = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechErrorsProperty = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechErrorsProperty(){
		if(_NSSpeechErrorsProperty != null) return _NSSpeechErrorsProperty;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechErrorsProperty", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechErrorsProperty = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechInputModeProperty = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechInputModeProperty(){
		if(_NSSpeechInputModeProperty != null) return _NSSpeechInputModeProperty;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechInputModeProperty", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechInputModeProperty = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechModeLiteral = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechModeLiteral(){
		if(_NSSpeechModeLiteral != null) return _NSSpeechModeLiteral;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechModeLiteral", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechModeLiteral = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechModeNormal = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechModeNormal(){
		if(_NSSpeechModeNormal != null) return _NSSpeechModeNormal;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechModeNormal", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechModeNormal = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechModePhoneme = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechModePhoneme(){
		if(_NSSpeechModePhoneme != null) return _NSSpeechModePhoneme;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechModePhoneme", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechModePhoneme = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechModeText = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechModeText(){
		if(_NSSpeechModeText != null) return _NSSpeechModeText;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechModeText", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechModeText = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechNumberModeProperty = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechNumberModeProperty(){
		if(_NSSpeechNumberModeProperty != null) return _NSSpeechNumberModeProperty;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechNumberModeProperty", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechNumberModeProperty = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechOutputToFileURLProperty = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechOutputToFileURLProperty(){
		if(_NSSpeechOutputToFileURLProperty != null) return _NSSpeechOutputToFileURLProperty;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechOutputToFileURLProperty", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechOutputToFileURLProperty = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechPhonemeInfoExample = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechPhonemeInfoExample(){
		if(_NSSpeechPhonemeInfoExample != null) return _NSSpeechPhonemeInfoExample;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechPhonemeInfoExample", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechPhonemeInfoExample = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechPhonemeInfoHiliteEnd = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechPhonemeInfoHiliteEnd(){
		if(_NSSpeechPhonemeInfoHiliteEnd != null) return _NSSpeechPhonemeInfoHiliteEnd;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechPhonemeInfoHiliteEnd", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechPhonemeInfoHiliteEnd = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechPhonemeInfoHiliteStart = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechPhonemeInfoHiliteStart(){
		if(_NSSpeechPhonemeInfoHiliteStart != null) return _NSSpeechPhonemeInfoHiliteStart;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechPhonemeInfoHiliteStart", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechPhonemeInfoHiliteStart = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechPhonemeInfoOpcode = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechPhonemeInfoOpcode(){
		if(_NSSpeechPhonemeInfoOpcode != null) return _NSSpeechPhonemeInfoOpcode;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechPhonemeInfoOpcode", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechPhonemeInfoOpcode = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechPhonemeInfoSymbol = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechPhonemeInfoSymbol(){
		if(_NSSpeechPhonemeInfoSymbol != null) return _NSSpeechPhonemeInfoSymbol;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechPhonemeInfoSymbol", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechPhonemeInfoSymbol = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechPhonemeSymbolsProperty = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechPhonemeSymbolsProperty(){
		if(_NSSpeechPhonemeSymbolsProperty != null) return _NSSpeechPhonemeSymbolsProperty;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechPhonemeSymbolsProperty", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechPhonemeSymbolsProperty = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechPitchBaseProperty = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechPitchBaseProperty(){
		if(_NSSpeechPitchBaseProperty != null) return _NSSpeechPitchBaseProperty;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechPitchBaseProperty", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechPitchBaseProperty = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechPitchModProperty = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechPitchModProperty(){
		if(_NSSpeechPitchModProperty != null) return _NSSpeechPitchModProperty;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechPitchModProperty", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechPitchModProperty = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechRateProperty = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechRateProperty(){
		if(_NSSpeechRateProperty != null) return _NSSpeechRateProperty;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechRateProperty", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechRateProperty = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechRecentSyncProperty = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechRecentSyncProperty(){
		if(_NSSpeechRecentSyncProperty != null) return _NSSpeechRecentSyncProperty;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechRecentSyncProperty", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechRecentSyncProperty = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechResetProperty = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechResetProperty(){
		if(_NSSpeechResetProperty != null) return _NSSpeechResetProperty;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechResetProperty", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechResetProperty = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechStatusNumberOfCharactersLeft = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechStatusNumberOfCharactersLeft(){
		if(_NSSpeechStatusNumberOfCharactersLeft != null) return _NSSpeechStatusNumberOfCharactersLeft;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechStatusNumberOfCharactersLeft", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechStatusNumberOfCharactersLeft = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechStatusOutputBusy = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechStatusOutputBusy(){
		if(_NSSpeechStatusOutputBusy != null) return _NSSpeechStatusOutputBusy;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechStatusOutputBusy", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechStatusOutputBusy = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechStatusOutputPaused = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechStatusOutputPaused(){
		if(_NSSpeechStatusOutputPaused != null) return _NSSpeechStatusOutputPaused;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechStatusOutputPaused", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechStatusOutputPaused = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechStatusPhonemeCode = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechStatusPhonemeCode(){
		if(_NSSpeechStatusPhonemeCode != null) return _NSSpeechStatusPhonemeCode;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechStatusPhonemeCode", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechStatusPhonemeCode = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechStatusProperty = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechStatusProperty(){
		if(_NSSpeechStatusProperty != null) return _NSSpeechStatusProperty;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechStatusProperty", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechStatusProperty = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechSynthesizerInfoIdentifier = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechSynthesizerInfoIdentifier(){
		if(_NSSpeechSynthesizerInfoIdentifier != null) return _NSSpeechSynthesizerInfoIdentifier;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechSynthesizerInfoIdentifier", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechSynthesizerInfoIdentifier = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechSynthesizerInfoProperty = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechSynthesizerInfoProperty(){
		if(_NSSpeechSynthesizerInfoProperty != null) return _NSSpeechSynthesizerInfoProperty;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechSynthesizerInfoProperty", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechSynthesizerInfoProperty = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechSynthesizerInfoVersion = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechSynthesizerInfoVersion(){
		if(_NSSpeechSynthesizerInfoVersion != null) return _NSSpeechSynthesizerInfoVersion;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechSynthesizerInfoVersion", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechSynthesizerInfoVersion = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpeechVolumeProperty = null;
	 final public com.apple.jobjc.foundation.NSString NSSpeechVolumeProperty(){
		if(_NSSpeechVolumeProperty != null) return _NSSpeechVolumeProperty;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpeechVolumeProperty", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpeechVolumeProperty = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpellCheckerDidChangeAutomaticSpellingCorrectionNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSSpellCheckerDidChangeAutomaticSpellingCorrectionNotification(){
		if(_NSSpellCheckerDidChangeAutomaticSpellingCorrectionNotification != null) return _NSSpellCheckerDidChangeAutomaticSpellingCorrectionNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpellCheckerDidChangeAutomaticSpellingCorrectionNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpellCheckerDidChangeAutomaticSpellingCorrectionNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpellCheckerDidChangeAutomaticTextReplacementNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSSpellCheckerDidChangeAutomaticTextReplacementNotification(){
		if(_NSSpellCheckerDidChangeAutomaticTextReplacementNotification != null) return _NSSpellCheckerDidChangeAutomaticTextReplacementNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpellCheckerDidChangeAutomaticTextReplacementNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpellCheckerDidChangeAutomaticTextReplacementNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSpellingStateAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSSpellingStateAttributeName(){
		if(_NSSpellingStateAttributeName != null) return _NSSpellingStateAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSpellingStateAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSpellingStateAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSplitViewDidResizeSubviewsNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSSplitViewDidResizeSubviewsNotification(){
		if(_NSSplitViewDidResizeSubviewsNotification != null) return _NSSplitViewDidResizeSubviewsNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSplitViewDidResizeSubviewsNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSplitViewDidResizeSubviewsNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSplitViewWillResizeSubviewsNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSSplitViewWillResizeSubviewsNotification(){
		if(_NSSplitViewWillResizeSubviewsNotification != null) return _NSSplitViewWillResizeSubviewsNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSplitViewWillResizeSubviewsNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSplitViewWillResizeSubviewsNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStrikethroughColorAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSStrikethroughColorAttributeName(){
		if(_NSStrikethroughColorAttributeName != null) return _NSStrikethroughColorAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStrikethroughColorAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStrikethroughColorAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStrikethroughStyleAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSStrikethroughStyleAttributeName(){
		if(_NSStrikethroughStyleAttributeName != null) return _NSStrikethroughStyleAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStrikethroughStyleAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStrikethroughStyleAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStringPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSStringPboardType(){
		if(_NSStringPboardType != null) return _NSStringPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStringPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStringPboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStrokeColorAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSStrokeColorAttributeName(){
		if(_NSStrokeColorAttributeName != null) return _NSStrokeColorAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStrokeColorAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStrokeColorAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSStrokeWidthAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSStrokeWidthAttributeName(){
		if(_NSStrokeWidthAttributeName != null) return _NSStrokeWidthAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSStrokeWidthAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSStrokeWidthAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSubjectDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSSubjectDocumentAttribute(){
		if(_NSSubjectDocumentAttribute != null) return _NSSubjectDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSubjectDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSubjectDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSuperscriptAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSSuperscriptAttributeName(){
		if(_NSSuperscriptAttributeName != null) return _NSSuperscriptAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSuperscriptAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSuperscriptAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSSystemColorsDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSSystemColorsDidChangeNotification(){
		if(_NSSystemColorsDidChangeNotification != null) return _NSSystemColorsDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSSystemColorsDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSSystemColorsDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTIFFException = null;
	 final public com.apple.jobjc.foundation.NSString NSTIFFException(){
		if(_NSTIFFException != null) return _NSTIFFException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTIFFException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTIFFException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTIFFPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSTIFFPboardType(){
		if(_NSTIFFPboardType != null) return _NSTIFFPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTIFFPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTIFFPboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTabColumnTerminatorsAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSTabColumnTerminatorsAttributeName(){
		if(_NSTabColumnTerminatorsAttributeName != null) return _NSTabColumnTerminatorsAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTabColumnTerminatorsAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTabColumnTerminatorsAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTableViewColumnDidMoveNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSTableViewColumnDidMoveNotification(){
		if(_NSTableViewColumnDidMoveNotification != null) return _NSTableViewColumnDidMoveNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTableViewColumnDidMoveNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTableViewColumnDidMoveNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTableViewColumnDidResizeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSTableViewColumnDidResizeNotification(){
		if(_NSTableViewColumnDidResizeNotification != null) return _NSTableViewColumnDidResizeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTableViewColumnDidResizeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTableViewColumnDidResizeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTableViewRowViewKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTableViewRowViewKey(){
		if(_NSTableViewRowViewKey != null) return _NSTableViewRowViewKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTableViewRowViewKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTableViewRowViewKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTableViewSelectionDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSTableViewSelectionDidChangeNotification(){
		if(_NSTableViewSelectionDidChangeNotification != null) return _NSTableViewSelectionDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTableViewSelectionDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTableViewSelectionDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTableViewSelectionIsChangingNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSTableViewSelectionIsChangingNotification(){
		if(_NSTableViewSelectionIsChangingNotification != null) return _NSTableViewSelectionIsChangingNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTableViewSelectionIsChangingNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTableViewSelectionIsChangingNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTabularTextPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSTabularTextPboardType(){
		if(_NSTabularTextPboardType != null) return _NSTabularTextPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTabularTextPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTabularTextPboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTargetBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSTargetBinding(){
		if(_NSTargetBinding != null) return _NSTargetBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTargetBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTargetBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextAlternativesAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSTextAlternativesAttributeName(){
		if(_NSTextAlternativesAttributeName != null) return _NSTextAlternativesAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextAlternativesAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextAlternativesAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextAlternativesSelectedAlternativeStringNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSTextAlternativesSelectedAlternativeStringNotification(){
		if(_NSTextAlternativesSelectedAlternativeStringNotification != null) return _NSTextAlternativesSelectedAlternativeStringNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextAlternativesSelectedAlternativeStringNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextAlternativesSelectedAlternativeStringNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingDocumentAuthorKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingDocumentAuthorKey(){
		if(_NSTextCheckingDocumentAuthorKey != null) return _NSTextCheckingDocumentAuthorKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingDocumentAuthorKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingDocumentAuthorKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingDocumentTitleKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingDocumentTitleKey(){
		if(_NSTextCheckingDocumentTitleKey != null) return _NSTextCheckingDocumentTitleKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingDocumentTitleKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingDocumentTitleKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingDocumentURLKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingDocumentURLKey(){
		if(_NSTextCheckingDocumentURLKey != null) return _NSTextCheckingDocumentURLKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingDocumentURLKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingDocumentURLKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingOrthographyKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingOrthographyKey(){
		if(_NSTextCheckingOrthographyKey != null) return _NSTextCheckingOrthographyKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingOrthographyKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingOrthographyKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingQuotesKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingQuotesKey(){
		if(_NSTextCheckingQuotesKey != null) return _NSTextCheckingQuotesKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingQuotesKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingQuotesKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingReferenceDateKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingReferenceDateKey(){
		if(_NSTextCheckingReferenceDateKey != null) return _NSTextCheckingReferenceDateKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingReferenceDateKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingReferenceDateKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingReferenceTimeZoneKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingReferenceTimeZoneKey(){
		if(_NSTextCheckingReferenceTimeZoneKey != null) return _NSTextCheckingReferenceTimeZoneKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingReferenceTimeZoneKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingReferenceTimeZoneKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingRegularExpressionsKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingRegularExpressionsKey(){
		if(_NSTextCheckingRegularExpressionsKey != null) return _NSTextCheckingRegularExpressionsKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingRegularExpressionsKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingRegularExpressionsKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextCheckingReplacementsKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextCheckingReplacementsKey(){
		if(_NSTextCheckingReplacementsKey != null) return _NSTextCheckingReplacementsKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextCheckingReplacementsKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextCheckingReplacementsKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextColorBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSTextColorBinding(){
		if(_NSTextColorBinding != null) return _NSTextColorBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextColorBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextColorBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextDidBeginEditingNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSTextDidBeginEditingNotification(){
		if(_NSTextDidBeginEditingNotification != null) return _NSTextDidBeginEditingNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextDidBeginEditingNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextDidBeginEditingNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSTextDidChangeNotification(){
		if(_NSTextDidChangeNotification != null) return _NSTextDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextDidEndEditingNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSTextDidEndEditingNotification(){
		if(_NSTextDidEndEditingNotification != null) return _NSTextDidEndEditingNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextDidEndEditingNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextDidEndEditingNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextEncodingNameDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSTextEncodingNameDocumentAttribute(){
		if(_NSTextEncodingNameDocumentAttribute != null) return _NSTextEncodingNameDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextEncodingNameDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextEncodingNameDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextEncodingNameDocumentOption = null;
	 final public com.apple.jobjc.foundation.NSString NSTextEncodingNameDocumentOption(){
		if(_NSTextEncodingNameDocumentOption != null) return _NSTextEncodingNameDocumentOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextEncodingNameDocumentOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextEncodingNameDocumentOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextFinderCaseInsensitiveKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextFinderCaseInsensitiveKey(){
		if(_NSTextFinderCaseInsensitiveKey != null) return _NSTextFinderCaseInsensitiveKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextFinderCaseInsensitiveKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextFinderCaseInsensitiveKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextFinderMatchingTypeKey = null;
	 final public com.apple.jobjc.foundation.NSString NSTextFinderMatchingTypeKey(){
		if(_NSTextFinderMatchingTypeKey != null) return _NSTextFinderMatchingTypeKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextFinderMatchingTypeKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextFinderMatchingTypeKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextInputContextKeyboardSelectionDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSTextInputContextKeyboardSelectionDidChangeNotification(){
		if(_NSTextInputContextKeyboardSelectionDidChangeNotification != null) return _NSTextInputContextKeyboardSelectionDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextInputContextKeyboardSelectionDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextInputContextKeyboardSelectionDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextLayoutSectionOrientation = null;
	 final public com.apple.jobjc.foundation.NSString NSTextLayoutSectionOrientation(){
		if(_NSTextLayoutSectionOrientation != null) return _NSTextLayoutSectionOrientation;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextLayoutSectionOrientation", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextLayoutSectionOrientation = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextLayoutSectionRange = null;
	 final public com.apple.jobjc.foundation.NSString NSTextLayoutSectionRange(){
		if(_NSTextLayoutSectionRange != null) return _NSTextLayoutSectionRange;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextLayoutSectionRange", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextLayoutSectionRange = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextLayoutSectionsAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSTextLayoutSectionsAttribute(){
		if(_NSTextLayoutSectionsAttribute != null) return _NSTextLayoutSectionsAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextLayoutSectionsAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextLayoutSectionsAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextLineTooLongException = null;
	 final public com.apple.jobjc.foundation.NSString NSTextLineTooLongException(){
		if(_NSTextLineTooLongException != null) return _NSTextLineTooLongException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextLineTooLongException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextLineTooLongException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextNoSelectionException = null;
	 final public com.apple.jobjc.foundation.NSString NSTextNoSelectionException(){
		if(_NSTextNoSelectionException != null) return _NSTextNoSelectionException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextNoSelectionException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextNoSelectionException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextReadException = null;
	 final public com.apple.jobjc.foundation.NSString NSTextReadException(){
		if(_NSTextReadException != null) return _NSTextReadException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextReadException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextReadException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextSizeMultiplierDocumentOption = null;
	 final public com.apple.jobjc.foundation.NSString NSTextSizeMultiplierDocumentOption(){
		if(_NSTextSizeMultiplierDocumentOption != null) return _NSTextSizeMultiplierDocumentOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextSizeMultiplierDocumentOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextSizeMultiplierDocumentOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextStorageDidProcessEditingNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSTextStorageDidProcessEditingNotification(){
		if(_NSTextStorageDidProcessEditingNotification != null) return _NSTextStorageDidProcessEditingNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextStorageDidProcessEditingNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextStorageDidProcessEditingNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextStorageWillProcessEditingNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSTextStorageWillProcessEditingNotification(){
		if(_NSTextStorageWillProcessEditingNotification != null) return _NSTextStorageWillProcessEditingNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextStorageWillProcessEditingNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextStorageWillProcessEditingNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextViewDidChangeSelectionNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSTextViewDidChangeSelectionNotification(){
		if(_NSTextViewDidChangeSelectionNotification != null) return _NSTextViewDidChangeSelectionNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextViewDidChangeSelectionNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextViewDidChangeSelectionNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextViewDidChangeTypingAttributesNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSTextViewDidChangeTypingAttributesNotification(){
		if(_NSTextViewDidChangeTypingAttributesNotification != null) return _NSTextViewDidChangeTypingAttributesNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextViewDidChangeTypingAttributesNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextViewDidChangeTypingAttributesNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextViewWillChangeNotifyingTextViewNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSTextViewWillChangeNotifyingTextViewNotification(){
		if(_NSTextViewWillChangeNotifyingTextViewNotification != null) return _NSTextViewWillChangeNotifyingTextViewNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextViewWillChangeNotifyingTextViewNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextViewWillChangeNotifyingTextViewNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTextWriteException = null;
	 final public com.apple.jobjc.foundation.NSString NSTextWriteException(){
		if(_NSTextWriteException != null) return _NSTextWriteException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTextWriteException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTextWriteException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTimeoutDocumentOption = null;
	 final public com.apple.jobjc.foundation.NSString NSTimeoutDocumentOption(){
		if(_NSTimeoutDocumentOption != null) return _NSTimeoutDocumentOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTimeoutDocumentOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTimeoutDocumentOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTitleBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSTitleBinding(){
		if(_NSTitleBinding != null) return _NSTitleBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTitleBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTitleBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTitleDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSTitleDocumentAttribute(){
		if(_NSTitleDocumentAttribute != null) return _NSTitleDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTitleDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTitleDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSToolTipAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSToolTipAttributeName(){
		if(_NSToolTipAttributeName != null) return _NSToolTipAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSToolTipAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSToolTipAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSToolTipBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSToolTipBinding(){
		if(_NSToolTipBinding != null) return _NSToolTipBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSToolTipBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSToolTipBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSToolbarCustomizeToolbarItemIdentifier = null;
	 final public com.apple.jobjc.foundation.NSString NSToolbarCustomizeToolbarItemIdentifier(){
		if(_NSToolbarCustomizeToolbarItemIdentifier != null) return _NSToolbarCustomizeToolbarItemIdentifier;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSToolbarCustomizeToolbarItemIdentifier", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSToolbarCustomizeToolbarItemIdentifier = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSToolbarDidRemoveItemNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSToolbarDidRemoveItemNotification(){
		if(_NSToolbarDidRemoveItemNotification != null) return _NSToolbarDidRemoveItemNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSToolbarDidRemoveItemNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSToolbarDidRemoveItemNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSToolbarFlexibleSpaceItemIdentifier = null;
	 final public com.apple.jobjc.foundation.NSString NSToolbarFlexibleSpaceItemIdentifier(){
		if(_NSToolbarFlexibleSpaceItemIdentifier != null) return _NSToolbarFlexibleSpaceItemIdentifier;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSToolbarFlexibleSpaceItemIdentifier", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSToolbarFlexibleSpaceItemIdentifier = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSToolbarPrintItemIdentifier = null;
	 final public com.apple.jobjc.foundation.NSString NSToolbarPrintItemIdentifier(){
		if(_NSToolbarPrintItemIdentifier != null) return _NSToolbarPrintItemIdentifier;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSToolbarPrintItemIdentifier", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSToolbarPrintItemIdentifier = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSToolbarSeparatorItemIdentifier = null;
	 final public com.apple.jobjc.foundation.NSString NSToolbarSeparatorItemIdentifier(){
		if(_NSToolbarSeparatorItemIdentifier != null) return _NSToolbarSeparatorItemIdentifier;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSToolbarSeparatorItemIdentifier", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSToolbarSeparatorItemIdentifier = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSToolbarShowColorsItemIdentifier = null;
	 final public com.apple.jobjc.foundation.NSString NSToolbarShowColorsItemIdentifier(){
		if(_NSToolbarShowColorsItemIdentifier != null) return _NSToolbarShowColorsItemIdentifier;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSToolbarShowColorsItemIdentifier", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSToolbarShowColorsItemIdentifier = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSToolbarShowFontsItemIdentifier = null;
	 final public com.apple.jobjc.foundation.NSString NSToolbarShowFontsItemIdentifier(){
		if(_NSToolbarShowFontsItemIdentifier != null) return _NSToolbarShowFontsItemIdentifier;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSToolbarShowFontsItemIdentifier", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSToolbarShowFontsItemIdentifier = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSToolbarSpaceItemIdentifier = null;
	 final public com.apple.jobjc.foundation.NSString NSToolbarSpaceItemIdentifier(){
		if(_NSToolbarSpaceItemIdentifier != null) return _NSToolbarSpaceItemIdentifier;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSToolbarSpaceItemIdentifier", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSToolbarSpaceItemIdentifier = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSToolbarWillAddItemNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSToolbarWillAddItemNotification(){
		if(_NSToolbarWillAddItemNotification != null) return _NSToolbarWillAddItemNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSToolbarWillAddItemNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSToolbarWillAddItemNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTopMarginDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSTopMarginDocumentAttribute(){
		if(_NSTopMarginDocumentAttribute != null) return _NSTopMarginDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTopMarginDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTopMarginDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTransparentBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSTransparentBinding(){
		if(_NSTransparentBinding != null) return _NSTransparentBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTransparentBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTransparentBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSTypedStreamVersionException = null;
	 final public com.apple.jobjc.foundation.NSString NSTypedStreamVersionException(){
		if(_NSTypedStreamVersionException != null) return _NSTypedStreamVersionException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSTypedStreamVersionException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSTypedStreamVersionException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSURLPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSURLPboardType(){
		if(_NSURLPboardType != null) return _NSURLPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSURLPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSURLPboardType = returnValue;
		return returnValue;
	}

	private long _NSUnderlineByWordMask = 0;
	 final public long NSUnderlineByWordMask(){
		if(_NSUnderlineByWordMask != 0) return _NSUnderlineByWordMask;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUnderlineByWordMask", nativeBuffer, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.sizeof());
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		_NSUnderlineByWordMask = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUnderlineColorAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSUnderlineColorAttributeName(){
		if(_NSUnderlineColorAttributeName != null) return _NSUnderlineColorAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUnderlineColorAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUnderlineColorAttributeName = returnValue;
		return returnValue;
	}

	private long _NSUnderlineStrikethroughMask = 0;
	 final public long NSUnderlineStrikethroughMask(){
		if(_NSUnderlineStrikethroughMask != 0) return _NSUnderlineStrikethroughMask;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUnderlineStrikethroughMask", nativeBuffer, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.sizeof());
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		_NSUnderlineStrikethroughMask = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUnderlineStyleAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSUnderlineStyleAttributeName(){
		if(_NSUnderlineStyleAttributeName != null) return _NSUnderlineStyleAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUnderlineStyleAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUnderlineStyleAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSUsesScreenFontsDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSUsesScreenFontsDocumentAttribute(){
		if(_NSUsesScreenFontsDocumentAttribute != null) return _NSUsesScreenFontsDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSUsesScreenFontsDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSUsesScreenFontsDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSVCardPboardType = null;
	 final public com.apple.jobjc.foundation.NSString NSVCardPboardType(){
		if(_NSVCardPboardType != null) return _NSVCardPboardType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSVCardPboardType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSVCardPboardType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSValidatesImmediatelyBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSValidatesImmediatelyBindingOption(){
		if(_NSValidatesImmediatelyBindingOption != null) return _NSValidatesImmediatelyBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSValidatesImmediatelyBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSValidatesImmediatelyBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSValueBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSValueBinding(){
		if(_NSValueBinding != null) return _NSValueBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSValueBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSValueBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSValuePathBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSValuePathBinding(){
		if(_NSValuePathBinding != null) return _NSValuePathBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSValuePathBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSValuePathBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSValueTransformerBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSValueTransformerBindingOption(){
		if(_NSValueTransformerBindingOption != null) return _NSValueTransformerBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSValueTransformerBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSValueTransformerBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSValueTransformerNameBindingOption = null;
	 final public com.apple.jobjc.foundation.NSString NSValueTransformerNameBindingOption(){
		if(_NSValueTransformerNameBindingOption != null) return _NSValueTransformerNameBindingOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSValueTransformerNameBindingOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSValueTransformerNameBindingOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSValueURLBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSValueURLBinding(){
		if(_NSValueURLBinding != null) return _NSValueURLBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSValueURLBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSValueURLBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSVerticalGlyphFormAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSVerticalGlyphFormAttributeName(){
		if(_NSVerticalGlyphFormAttributeName != null) return _NSVerticalGlyphFormAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSVerticalGlyphFormAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSVerticalGlyphFormAttributeName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSViewAnimationEffectKey = null;
	 final public com.apple.jobjc.foundation.NSString NSViewAnimationEffectKey(){
		if(_NSViewAnimationEffectKey != null) return _NSViewAnimationEffectKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSViewAnimationEffectKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSViewAnimationEffectKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSViewAnimationEndFrameKey = null;
	 final public com.apple.jobjc.foundation.NSString NSViewAnimationEndFrameKey(){
		if(_NSViewAnimationEndFrameKey != null) return _NSViewAnimationEndFrameKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSViewAnimationEndFrameKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSViewAnimationEndFrameKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSViewAnimationFadeInEffect = null;
	 final public com.apple.jobjc.foundation.NSString NSViewAnimationFadeInEffect(){
		if(_NSViewAnimationFadeInEffect != null) return _NSViewAnimationFadeInEffect;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSViewAnimationFadeInEffect", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSViewAnimationFadeInEffect = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSViewAnimationFadeOutEffect = null;
	 final public com.apple.jobjc.foundation.NSString NSViewAnimationFadeOutEffect(){
		if(_NSViewAnimationFadeOutEffect != null) return _NSViewAnimationFadeOutEffect;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSViewAnimationFadeOutEffect", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSViewAnimationFadeOutEffect = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSViewAnimationStartFrameKey = null;
	 final public com.apple.jobjc.foundation.NSString NSViewAnimationStartFrameKey(){
		if(_NSViewAnimationStartFrameKey != null) return _NSViewAnimationStartFrameKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSViewAnimationStartFrameKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSViewAnimationStartFrameKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSViewAnimationTargetKey = null;
	 final public com.apple.jobjc.foundation.NSString NSViewAnimationTargetKey(){
		if(_NSViewAnimationTargetKey != null) return _NSViewAnimationTargetKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSViewAnimationTargetKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSViewAnimationTargetKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSViewBoundsDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSViewBoundsDidChangeNotification(){
		if(_NSViewBoundsDidChangeNotification != null) return _NSViewBoundsDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSViewBoundsDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSViewBoundsDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSViewDidUpdateTrackingAreasNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSViewDidUpdateTrackingAreasNotification(){
		if(_NSViewDidUpdateTrackingAreasNotification != null) return _NSViewDidUpdateTrackingAreasNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSViewDidUpdateTrackingAreasNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSViewDidUpdateTrackingAreasNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSViewFocusDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSViewFocusDidChangeNotification(){
		if(_NSViewFocusDidChangeNotification != null) return _NSViewFocusDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSViewFocusDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSViewFocusDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSViewFrameDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSViewFrameDidChangeNotification(){
		if(_NSViewFrameDidChangeNotification != null) return _NSViewFrameDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSViewFrameDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSViewFrameDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSViewGlobalFrameDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSViewGlobalFrameDidChangeNotification(){
		if(_NSViewGlobalFrameDidChangeNotification != null) return _NSViewGlobalFrameDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSViewGlobalFrameDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSViewGlobalFrameDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSViewModeDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSViewModeDocumentAttribute(){
		if(_NSViewModeDocumentAttribute != null) return _NSViewModeDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSViewModeDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSViewModeDocumentAttribute = returnValue;
		return returnValue;
	}

	private double _NSViewNoInstrinsicMetric = 0;
	 final public double NSViewNoInstrinsicMetric(){
		if(_NSViewNoInstrinsicMetric != 0) return _NSViewNoInstrinsicMetric;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSViewNoInstrinsicMetric", nativeBuffer, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.sizeof());
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		_NSViewNoInstrinsicMetric = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSViewSizeDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSViewSizeDocumentAttribute(){
		if(_NSViewSizeDocumentAttribute != null) return _NSViewSizeDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSViewSizeDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSViewSizeDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSViewZoomDocumentAttribute = null;
	 final public com.apple.jobjc.foundation.NSString NSViewZoomDocumentAttribute(){
		if(_NSViewZoomDocumentAttribute != null) return _NSViewZoomDocumentAttribute;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSViewZoomDocumentAttribute", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSViewZoomDocumentAttribute = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSVisibleBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSVisibleBinding(){
		if(_NSVisibleBinding != null) return _NSVisibleBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSVisibleBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSVisibleBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSVoiceAge = null;
	 final public com.apple.jobjc.foundation.NSString NSVoiceAge(){
		if(_NSVoiceAge != null) return _NSVoiceAge;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSVoiceAge", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSVoiceAge = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSVoiceDemoText = null;
	 final public com.apple.jobjc.foundation.NSString NSVoiceDemoText(){
		if(_NSVoiceDemoText != null) return _NSVoiceDemoText;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSVoiceDemoText", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSVoiceDemoText = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSVoiceGender = null;
	 final public com.apple.jobjc.foundation.NSString NSVoiceGender(){
		if(_NSVoiceGender != null) return _NSVoiceGender;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSVoiceGender", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSVoiceGender = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSVoiceGenderFemale = null;
	 final public com.apple.jobjc.foundation.NSString NSVoiceGenderFemale(){
		if(_NSVoiceGenderFemale != null) return _NSVoiceGenderFemale;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSVoiceGenderFemale", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSVoiceGenderFemale = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSVoiceGenderMale = null;
	 final public com.apple.jobjc.foundation.NSString NSVoiceGenderMale(){
		if(_NSVoiceGenderMale != null) return _NSVoiceGenderMale;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSVoiceGenderMale", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSVoiceGenderMale = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSVoiceGenderNeuter = null;
	 final public com.apple.jobjc.foundation.NSString NSVoiceGenderNeuter(){
		if(_NSVoiceGenderNeuter != null) return _NSVoiceGenderNeuter;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSVoiceGenderNeuter", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSVoiceGenderNeuter = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSVoiceIdentifier = null;
	 final public com.apple.jobjc.foundation.NSString NSVoiceIdentifier(){
		if(_NSVoiceIdentifier != null) return _NSVoiceIdentifier;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSVoiceIdentifier", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSVoiceIdentifier = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSVoiceIndividuallySpokenCharacters = null;
	 final public com.apple.jobjc.foundation.NSString NSVoiceIndividuallySpokenCharacters(){
		if(_NSVoiceIndividuallySpokenCharacters != null) return _NSVoiceIndividuallySpokenCharacters;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSVoiceIndividuallySpokenCharacters", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSVoiceIndividuallySpokenCharacters = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSVoiceLanguage = null;
	 final public com.apple.jobjc.foundation.NSString NSVoiceLanguage(){
		if(_NSVoiceLanguage != null) return _NSVoiceLanguage;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSVoiceLanguage", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSVoiceLanguage = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSVoiceLocaleIdentifier = null;
	 final public com.apple.jobjc.foundation.NSString NSVoiceLocaleIdentifier(){
		if(_NSVoiceLocaleIdentifier != null) return _NSVoiceLocaleIdentifier;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSVoiceLocaleIdentifier", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSVoiceLocaleIdentifier = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSVoiceName = null;
	 final public com.apple.jobjc.foundation.NSString NSVoiceName(){
		if(_NSVoiceName != null) return _NSVoiceName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSVoiceName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSVoiceName = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSVoiceSupportedCharacters = null;
	 final public com.apple.jobjc.foundation.NSString NSVoiceSupportedCharacters(){
		if(_NSVoiceSupportedCharacters != null) return _NSVoiceSupportedCharacters;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSVoiceSupportedCharacters", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSVoiceSupportedCharacters = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWarningValueBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSWarningValueBinding(){
		if(_NSWarningValueBinding != null) return _NSWarningValueBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWarningValueBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWarningValueBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWebArchiveTextDocumentType = null;
	 final public com.apple.jobjc.foundation.NSString NSWebArchiveTextDocumentType(){
		if(_NSWebArchiveTextDocumentType != null) return _NSWebArchiveTextDocumentType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWebArchiveTextDocumentType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWebArchiveTextDocumentType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWebPreferencesDocumentOption = null;
	 final public com.apple.jobjc.foundation.NSString NSWebPreferencesDocumentOption(){
		if(_NSWebPreferencesDocumentOption != null) return _NSWebPreferencesDocumentOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWebPreferencesDocumentOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWebPreferencesDocumentOption = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWebResourceLoadDelegateDocumentOption = null;
	 final public com.apple.jobjc.foundation.NSString NSWebResourceLoadDelegateDocumentOption(){
		if(_NSWebResourceLoadDelegateDocumentOption != null) return _NSWebResourceLoadDelegateDocumentOption;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWebResourceLoadDelegateDocumentOption", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWebResourceLoadDelegateDocumentOption = returnValue;
		return returnValue;
	}

	private double _NSWhite = 0;
	 final public double NSWhite(){
		if(_NSWhite != 0) return _NSWhite;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWhite", nativeBuffer, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.sizeof());
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		_NSWhite = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWidthBinding = null;
	 final public com.apple.jobjc.foundation.NSString NSWidthBinding(){
		if(_NSWidthBinding != null) return _NSWidthBinding;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWidthBinding", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWidthBinding = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowDidBecomeKeyNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowDidBecomeKeyNotification(){
		if(_NSWindowDidBecomeKeyNotification != null) return _NSWindowDidBecomeKeyNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowDidBecomeKeyNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowDidBecomeKeyNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowDidBecomeMainNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowDidBecomeMainNotification(){
		if(_NSWindowDidBecomeMainNotification != null) return _NSWindowDidBecomeMainNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowDidBecomeMainNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowDidBecomeMainNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowDidChangeBackingPropertiesNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowDidChangeBackingPropertiesNotification(){
		if(_NSWindowDidChangeBackingPropertiesNotification != null) return _NSWindowDidChangeBackingPropertiesNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowDidChangeBackingPropertiesNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowDidChangeBackingPropertiesNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowDidChangeScreenNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowDidChangeScreenNotification(){
		if(_NSWindowDidChangeScreenNotification != null) return _NSWindowDidChangeScreenNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowDidChangeScreenNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowDidChangeScreenNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowDidChangeScreenProfileNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowDidChangeScreenProfileNotification(){
		if(_NSWindowDidChangeScreenProfileNotification != null) return _NSWindowDidChangeScreenProfileNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowDidChangeScreenProfileNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowDidChangeScreenProfileNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowDidDeminiaturizeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowDidDeminiaturizeNotification(){
		if(_NSWindowDidDeminiaturizeNotification != null) return _NSWindowDidDeminiaturizeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowDidDeminiaturizeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowDidDeminiaturizeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowDidEndLiveResizeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowDidEndLiveResizeNotification(){
		if(_NSWindowDidEndLiveResizeNotification != null) return _NSWindowDidEndLiveResizeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowDidEndLiveResizeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowDidEndLiveResizeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowDidEndSheetNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowDidEndSheetNotification(){
		if(_NSWindowDidEndSheetNotification != null) return _NSWindowDidEndSheetNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowDidEndSheetNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowDidEndSheetNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowDidEnterFullScreenNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowDidEnterFullScreenNotification(){
		if(_NSWindowDidEnterFullScreenNotification != null) return _NSWindowDidEnterFullScreenNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowDidEnterFullScreenNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowDidEnterFullScreenNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowDidEnterVersionBrowserNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowDidEnterVersionBrowserNotification(){
		if(_NSWindowDidEnterVersionBrowserNotification != null) return _NSWindowDidEnterVersionBrowserNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowDidEnterVersionBrowserNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowDidEnterVersionBrowserNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowDidExitFullScreenNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowDidExitFullScreenNotification(){
		if(_NSWindowDidExitFullScreenNotification != null) return _NSWindowDidExitFullScreenNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowDidExitFullScreenNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowDidExitFullScreenNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowDidExitVersionBrowserNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowDidExitVersionBrowserNotification(){
		if(_NSWindowDidExitVersionBrowserNotification != null) return _NSWindowDidExitVersionBrowserNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowDidExitVersionBrowserNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowDidExitVersionBrowserNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowDidExposeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowDidExposeNotification(){
		if(_NSWindowDidExposeNotification != null) return _NSWindowDidExposeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowDidExposeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowDidExposeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowDidMiniaturizeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowDidMiniaturizeNotification(){
		if(_NSWindowDidMiniaturizeNotification != null) return _NSWindowDidMiniaturizeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowDidMiniaturizeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowDidMiniaturizeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowDidMoveNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowDidMoveNotification(){
		if(_NSWindowDidMoveNotification != null) return _NSWindowDidMoveNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowDidMoveNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowDidMoveNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowDidResignKeyNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowDidResignKeyNotification(){
		if(_NSWindowDidResignKeyNotification != null) return _NSWindowDidResignKeyNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowDidResignKeyNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowDidResignKeyNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowDidResignMainNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowDidResignMainNotification(){
		if(_NSWindowDidResignMainNotification != null) return _NSWindowDidResignMainNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowDidResignMainNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowDidResignMainNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowDidResizeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowDidResizeNotification(){
		if(_NSWindowDidResizeNotification != null) return _NSWindowDidResizeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowDidResizeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowDidResizeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowDidUpdateNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowDidUpdateNotification(){
		if(_NSWindowDidUpdateNotification != null) return _NSWindowDidUpdateNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowDidUpdateNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowDidUpdateNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowServerCommunicationException = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowServerCommunicationException(){
		if(_NSWindowServerCommunicationException != null) return _NSWindowServerCommunicationException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowServerCommunicationException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowServerCommunicationException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowWillBeginSheetNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowWillBeginSheetNotification(){
		if(_NSWindowWillBeginSheetNotification != null) return _NSWindowWillBeginSheetNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowWillBeginSheetNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowWillBeginSheetNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowWillCloseNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowWillCloseNotification(){
		if(_NSWindowWillCloseNotification != null) return _NSWindowWillCloseNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowWillCloseNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowWillCloseNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowWillEnterFullScreenNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowWillEnterFullScreenNotification(){
		if(_NSWindowWillEnterFullScreenNotification != null) return _NSWindowWillEnterFullScreenNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowWillEnterFullScreenNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowWillEnterFullScreenNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowWillEnterVersionBrowserNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowWillEnterVersionBrowserNotification(){
		if(_NSWindowWillEnterVersionBrowserNotification != null) return _NSWindowWillEnterVersionBrowserNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowWillEnterVersionBrowserNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowWillEnterVersionBrowserNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowWillExitFullScreenNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowWillExitFullScreenNotification(){
		if(_NSWindowWillExitFullScreenNotification != null) return _NSWindowWillExitFullScreenNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowWillExitFullScreenNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowWillExitFullScreenNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowWillExitVersionBrowserNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowWillExitVersionBrowserNotification(){
		if(_NSWindowWillExitVersionBrowserNotification != null) return _NSWindowWillExitVersionBrowserNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowWillExitVersionBrowserNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowWillExitVersionBrowserNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowWillMiniaturizeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowWillMiniaturizeNotification(){
		if(_NSWindowWillMiniaturizeNotification != null) return _NSWindowWillMiniaturizeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowWillMiniaturizeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowWillMiniaturizeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowWillMoveNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowWillMoveNotification(){
		if(_NSWindowWillMoveNotification != null) return _NSWindowWillMoveNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowWillMoveNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowWillMoveNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWindowWillStartLiveResizeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWindowWillStartLiveResizeNotification(){
		if(_NSWindowWillStartLiveResizeNotification != null) return _NSWindowWillStartLiveResizeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWindowWillStartLiveResizeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWindowWillStartLiveResizeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWordMLTextDocumentType = null;
	 final public com.apple.jobjc.foundation.NSString NSWordMLTextDocumentType(){
		if(_NSWordMLTextDocumentType != null) return _NSWordMLTextDocumentType;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWordMLTextDocumentType", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWordMLTextDocumentType = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWordTablesReadException = null;
	 final public com.apple.jobjc.foundation.NSString NSWordTablesReadException(){
		if(_NSWordTablesReadException != null) return _NSWordTablesReadException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWordTablesReadException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWordTablesReadException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWordTablesWriteException = null;
	 final public com.apple.jobjc.foundation.NSString NSWordTablesWriteException(){
		if(_NSWordTablesWriteException != null) return _NSWordTablesWriteException;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWordTablesWriteException", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWordTablesWriteException = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceActiveSpaceDidChangeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceActiveSpaceDidChangeNotification(){
		if(_NSWorkspaceActiveSpaceDidChangeNotification != null) return _NSWorkspaceActiveSpaceDidChangeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceActiveSpaceDidChangeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceActiveSpaceDidChangeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceApplicationKey = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceApplicationKey(){
		if(_NSWorkspaceApplicationKey != null) return _NSWorkspaceApplicationKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceApplicationKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceApplicationKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceCompressOperation = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceCompressOperation(){
		if(_NSWorkspaceCompressOperation != null) return _NSWorkspaceCompressOperation;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceCompressOperation", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceCompressOperation = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceCopyOperation = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceCopyOperation(){
		if(_NSWorkspaceCopyOperation != null) return _NSWorkspaceCopyOperation;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceCopyOperation", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceCopyOperation = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceDecompressOperation = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceDecompressOperation(){
		if(_NSWorkspaceDecompressOperation != null) return _NSWorkspaceDecompressOperation;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceDecompressOperation", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceDecompressOperation = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceDecryptOperation = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceDecryptOperation(){
		if(_NSWorkspaceDecryptOperation != null) return _NSWorkspaceDecryptOperation;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceDecryptOperation", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceDecryptOperation = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceDesktopImageAllowClippingKey = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceDesktopImageAllowClippingKey(){
		if(_NSWorkspaceDesktopImageAllowClippingKey != null) return _NSWorkspaceDesktopImageAllowClippingKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceDesktopImageAllowClippingKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceDesktopImageAllowClippingKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceDesktopImageFillColorKey = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceDesktopImageFillColorKey(){
		if(_NSWorkspaceDesktopImageFillColorKey != null) return _NSWorkspaceDesktopImageFillColorKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceDesktopImageFillColorKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceDesktopImageFillColorKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceDesktopImageScalingKey = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceDesktopImageScalingKey(){
		if(_NSWorkspaceDesktopImageScalingKey != null) return _NSWorkspaceDesktopImageScalingKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceDesktopImageScalingKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceDesktopImageScalingKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceDestroyOperation = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceDestroyOperation(){
		if(_NSWorkspaceDestroyOperation != null) return _NSWorkspaceDestroyOperation;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceDestroyOperation", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceDestroyOperation = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceDidActivateApplicationNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceDidActivateApplicationNotification(){
		if(_NSWorkspaceDidActivateApplicationNotification != null) return _NSWorkspaceDidActivateApplicationNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceDidActivateApplicationNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceDidActivateApplicationNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceDidChangeFileLabelsNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceDidChangeFileLabelsNotification(){
		if(_NSWorkspaceDidChangeFileLabelsNotification != null) return _NSWorkspaceDidChangeFileLabelsNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceDidChangeFileLabelsNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceDidChangeFileLabelsNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceDidDeactivateApplicationNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceDidDeactivateApplicationNotification(){
		if(_NSWorkspaceDidDeactivateApplicationNotification != null) return _NSWorkspaceDidDeactivateApplicationNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceDidDeactivateApplicationNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceDidDeactivateApplicationNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceDidHideApplicationNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceDidHideApplicationNotification(){
		if(_NSWorkspaceDidHideApplicationNotification != null) return _NSWorkspaceDidHideApplicationNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceDidHideApplicationNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceDidHideApplicationNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceDidLaunchApplicationNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceDidLaunchApplicationNotification(){
		if(_NSWorkspaceDidLaunchApplicationNotification != null) return _NSWorkspaceDidLaunchApplicationNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceDidLaunchApplicationNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceDidLaunchApplicationNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceDidMountNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceDidMountNotification(){
		if(_NSWorkspaceDidMountNotification != null) return _NSWorkspaceDidMountNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceDidMountNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceDidMountNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceDidPerformFileOperationNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceDidPerformFileOperationNotification(){
		if(_NSWorkspaceDidPerformFileOperationNotification != null) return _NSWorkspaceDidPerformFileOperationNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceDidPerformFileOperationNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceDidPerformFileOperationNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceDidRenameVolumeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceDidRenameVolumeNotification(){
		if(_NSWorkspaceDidRenameVolumeNotification != null) return _NSWorkspaceDidRenameVolumeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceDidRenameVolumeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceDidRenameVolumeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceDidTerminateApplicationNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceDidTerminateApplicationNotification(){
		if(_NSWorkspaceDidTerminateApplicationNotification != null) return _NSWorkspaceDidTerminateApplicationNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceDidTerminateApplicationNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceDidTerminateApplicationNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceDidUnhideApplicationNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceDidUnhideApplicationNotification(){
		if(_NSWorkspaceDidUnhideApplicationNotification != null) return _NSWorkspaceDidUnhideApplicationNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceDidUnhideApplicationNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceDidUnhideApplicationNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceDidUnmountNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceDidUnmountNotification(){
		if(_NSWorkspaceDidUnmountNotification != null) return _NSWorkspaceDidUnmountNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceDidUnmountNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceDidUnmountNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceDidWakeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceDidWakeNotification(){
		if(_NSWorkspaceDidWakeNotification != null) return _NSWorkspaceDidWakeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceDidWakeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceDidWakeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceDuplicateOperation = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceDuplicateOperation(){
		if(_NSWorkspaceDuplicateOperation != null) return _NSWorkspaceDuplicateOperation;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceDuplicateOperation", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceDuplicateOperation = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceEncryptOperation = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceEncryptOperation(){
		if(_NSWorkspaceEncryptOperation != null) return _NSWorkspaceEncryptOperation;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceEncryptOperation", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceEncryptOperation = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceLaunchConfigurationAppleEvent = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceLaunchConfigurationAppleEvent(){
		if(_NSWorkspaceLaunchConfigurationAppleEvent != null) return _NSWorkspaceLaunchConfigurationAppleEvent;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceLaunchConfigurationAppleEvent", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceLaunchConfigurationAppleEvent = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceLaunchConfigurationArchitecture = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceLaunchConfigurationArchitecture(){
		if(_NSWorkspaceLaunchConfigurationArchitecture != null) return _NSWorkspaceLaunchConfigurationArchitecture;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceLaunchConfigurationArchitecture", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceLaunchConfigurationArchitecture = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceLaunchConfigurationArguments = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceLaunchConfigurationArguments(){
		if(_NSWorkspaceLaunchConfigurationArguments != null) return _NSWorkspaceLaunchConfigurationArguments;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceLaunchConfigurationArguments", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceLaunchConfigurationArguments = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceLaunchConfigurationEnvironment = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceLaunchConfigurationEnvironment(){
		if(_NSWorkspaceLaunchConfigurationEnvironment != null) return _NSWorkspaceLaunchConfigurationEnvironment;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceLaunchConfigurationEnvironment", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceLaunchConfigurationEnvironment = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceLinkOperation = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceLinkOperation(){
		if(_NSWorkspaceLinkOperation != null) return _NSWorkspaceLinkOperation;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceLinkOperation", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceLinkOperation = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceMoveOperation = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceMoveOperation(){
		if(_NSWorkspaceMoveOperation != null) return _NSWorkspaceMoveOperation;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceMoveOperation", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceMoveOperation = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceRecycleOperation = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceRecycleOperation(){
		if(_NSWorkspaceRecycleOperation != null) return _NSWorkspaceRecycleOperation;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceRecycleOperation", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceRecycleOperation = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceScreensDidSleepNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceScreensDidSleepNotification(){
		if(_NSWorkspaceScreensDidSleepNotification != null) return _NSWorkspaceScreensDidSleepNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceScreensDidSleepNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceScreensDidSleepNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceScreensDidWakeNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceScreensDidWakeNotification(){
		if(_NSWorkspaceScreensDidWakeNotification != null) return _NSWorkspaceScreensDidWakeNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceScreensDidWakeNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceScreensDidWakeNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceSessionDidBecomeActiveNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceSessionDidBecomeActiveNotification(){
		if(_NSWorkspaceSessionDidBecomeActiveNotification != null) return _NSWorkspaceSessionDidBecomeActiveNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceSessionDidBecomeActiveNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceSessionDidBecomeActiveNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceSessionDidResignActiveNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceSessionDidResignActiveNotification(){
		if(_NSWorkspaceSessionDidResignActiveNotification != null) return _NSWorkspaceSessionDidResignActiveNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceSessionDidResignActiveNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceSessionDidResignActiveNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceVolumeLocalizedNameKey = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceVolumeLocalizedNameKey(){
		if(_NSWorkspaceVolumeLocalizedNameKey != null) return _NSWorkspaceVolumeLocalizedNameKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceVolumeLocalizedNameKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceVolumeLocalizedNameKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceVolumeOldLocalizedNameKey = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceVolumeOldLocalizedNameKey(){
		if(_NSWorkspaceVolumeOldLocalizedNameKey != null) return _NSWorkspaceVolumeOldLocalizedNameKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceVolumeOldLocalizedNameKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceVolumeOldLocalizedNameKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceVolumeOldURLKey = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceVolumeOldURLKey(){
		if(_NSWorkspaceVolumeOldURLKey != null) return _NSWorkspaceVolumeOldURLKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceVolumeOldURLKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceVolumeOldURLKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceVolumeURLKey = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceVolumeURLKey(){
		if(_NSWorkspaceVolumeURLKey != null) return _NSWorkspaceVolumeURLKey;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceVolumeURLKey", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceVolumeURLKey = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceWillLaunchApplicationNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceWillLaunchApplicationNotification(){
		if(_NSWorkspaceWillLaunchApplicationNotification != null) return _NSWorkspaceWillLaunchApplicationNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceWillLaunchApplicationNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceWillLaunchApplicationNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceWillPowerOffNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceWillPowerOffNotification(){
		if(_NSWorkspaceWillPowerOffNotification != null) return _NSWorkspaceWillPowerOffNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceWillPowerOffNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceWillPowerOffNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceWillSleepNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceWillSleepNotification(){
		if(_NSWorkspaceWillSleepNotification != null) return _NSWorkspaceWillSleepNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceWillSleepNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceWillSleepNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWorkspaceWillUnmountNotification = null;
	 final public com.apple.jobjc.foundation.NSString NSWorkspaceWillUnmountNotification(){
		if(_NSWorkspaceWillUnmountNotification != null) return _NSWorkspaceWillUnmountNotification;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWorkspaceWillUnmountNotification", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWorkspaceWillUnmountNotification = returnValue;
		return returnValue;
	}

	private com.apple.jobjc.foundation.NSString _NSWritingDirectionAttributeName = null;
	 final public com.apple.jobjc.foundation.NSString NSWritingDirectionAttributeName(){
		if(_NSWritingDirectionAttributeName != null) return _NSWritingDirectionAttributeName;
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getConstant("NSWritingDirectionAttributeName", nativeBuffer, com.apple.jobjc.Coder.IDCoder.INST.sizeof());
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		_NSWritingDirectionAttributeName = returnValue;
		return returnValue;
	}
	private NSSegmentedControlClass _NSSegmentedControlClass = null;
	public NSSegmentedControlClass NSSegmentedControl() {
		return _NSSegmentedControlClass != null ? _NSSegmentedControlClass : (_NSSegmentedControlClass = new NSSegmentedControlClass(getRuntime()));
	}

	private NSHelpManagerClass _NSHelpManagerClass = null;
	public NSHelpManagerClass NSHelpManager() {
		return _NSHelpManagerClass != null ? _NSHelpManagerClass : (_NSHelpManagerClass = new NSHelpManagerClass(getRuntime()));
	}

	private NSSpeechSynthesizerClass _NSSpeechSynthesizerClass = null;
	public NSSpeechSynthesizerClass NSSpeechSynthesizer() {
		return _NSSpeechSynthesizerClass != null ? _NSSpeechSynthesizerClass : (_NSSpeechSynthesizerClass = new NSSpeechSynthesizerClass(getRuntime()));
	}

	private NSStepperClass _NSStepperClass = null;
	public NSStepperClass NSStepper() {
		return _NSStepperClass != null ? _NSStepperClass : (_NSStepperClass = new NSStepperClass(getRuntime()));
	}

	private NSTrackingAreaClass _NSTrackingAreaClass = null;
	public NSTrackingAreaClass NSTrackingArea() {
		return _NSTrackingAreaClass != null ? _NSTrackingAreaClass : (_NSTrackingAreaClass = new NSTrackingAreaClass(getRuntime()));
	}

	private NSPathControlClass _NSPathControlClass = null;
	public NSPathControlClass NSPathControl() {
		return _NSPathControlClass != null ? _NSPathControlClass : (_NSPathControlClass = new NSPathControlClass(getRuntime()));
	}

	private NSStatusBarClass _NSStatusBarClass = null;
	public NSStatusBarClass NSStatusBar() {
		return _NSStatusBarClass != null ? _NSStatusBarClass : (_NSStatusBarClass = new NSStatusBarClass(getRuntime()));
	}

	private NSNibClass _NSNibClass = null;
	public NSNibClass NSNib() {
		return _NSNibClass != null ? _NSNibClass : (_NSNibClass = new NSNibClass(getRuntime()));
	}

	private NSUserDefaultsControllerClass _NSUserDefaultsControllerClass = null;
	public NSUserDefaultsControllerClass NSUserDefaultsController() {
		return _NSUserDefaultsControllerClass != null ? _NSUserDefaultsControllerClass : (_NSUserDefaultsControllerClass = new NSUserDefaultsControllerClass(getRuntime()));
	}

	private NSNibOutletConnectorClass _NSNibOutletConnectorClass = null;
	public NSNibOutletConnectorClass NSNibOutletConnector() {
		return _NSNibOutletConnectorClass != null ? _NSNibOutletConnectorClass : (_NSNibOutletConnectorClass = new NSNibOutletConnectorClass(getRuntime()));
	}

	private NSImageViewClass _NSImageViewClass = null;
	public NSImageViewClass NSImageView() {
		return _NSImageViewClass != null ? _NSImageViewClass : (_NSImageViewClass = new NSImageViewClass(getRuntime()));
	}

	private NSSearchFieldClass _NSSearchFieldClass = null;
	public NSSearchFieldClass NSSearchField() {
		return _NSSearchFieldClass != null ? _NSSearchFieldClass : (_NSSearchFieldClass = new NSSearchFieldClass(getRuntime()));
	}

	private NSBrowserCellClass _NSBrowserCellClass = null;
	public NSBrowserCellClass NSBrowserCell() {
		return _NSBrowserCellClass != null ? _NSBrowserCellClass : (_NSBrowserCellClass = new NSBrowserCellClass(getRuntime()));
	}

	private NSArrayControllerClass _NSArrayControllerClass = null;
	public NSArrayControllerClass NSArrayController() {
		return _NSArrayControllerClass != null ? _NSArrayControllerClass : (_NSArrayControllerClass = new NSArrayControllerClass(getRuntime()));
	}

	private NSPasteboardClass _NSPasteboardClass = null;
	public NSPasteboardClass NSPasteboard() {
		return _NSPasteboardClass != null ? _NSPasteboardClass : (_NSPasteboardClass = new NSPasteboardClass(getRuntime()));
	}

	private NSTextViewClass _NSTextViewClass = null;
	public NSTextViewClass NSTextView() {
		return _NSTextViewClass != null ? _NSTextViewClass : (_NSTextViewClass = new NSTextViewClass(getRuntime()));
	}

	private CIColorClass _CIColorClass = null;
	public CIColorClass CIColor() {
		return _CIColorClass != null ? _CIColorClass : (_CIColorClass = new CIColorClass(getRuntime()));
	}

	private NSTreeControllerClass _NSTreeControllerClass = null;
	public NSTreeControllerClass NSTreeController() {
		return _NSTreeControllerClass != null ? _NSTreeControllerClass : (_NSTreeControllerClass = new NSTreeControllerClass(getRuntime()));
	}

	private NSTreeNodeClass _NSTreeNodeClass = null;
	public NSTreeNodeClass NSTreeNode() {
		return _NSTreeNodeClass != null ? _NSTreeNodeClass : (_NSTreeNodeClass = new NSTreeNodeClass(getRuntime()));
	}

	private NSSavePanelClass _NSSavePanelClass = null;
	public NSSavePanelClass NSSavePanel() {
		return _NSSavePanelClass != null ? _NSSavePanelClass : (_NSSavePanelClass = new NSSavePanelClass(getRuntime()));
	}

	private NSDraggingImageComponentClass _NSDraggingImageComponentClass = null;
	public NSDraggingImageComponentClass NSDraggingImageComponent() {
		return _NSDraggingImageComponentClass != null ? _NSDraggingImageComponentClass : (_NSDraggingImageComponentClass = new NSDraggingImageComponentClass(getRuntime()));
	}

	private NSMenuItemClass _NSMenuItemClass = null;
	public NSMenuItemClass NSMenuItem() {
		return _NSMenuItemClass != null ? _NSMenuItemClass : (_NSMenuItemClass = new NSMenuItemClass(getRuntime()));
	}

	private NSComboBoxCellClass _NSComboBoxCellClass = null;
	public NSComboBoxCellClass NSComboBoxCell() {
		return _NSComboBoxCellClass != null ? _NSComboBoxCellClass : (_NSComboBoxCellClass = new NSComboBoxCellClass(getRuntime()));
	}

	private NSAnimationClass _NSAnimationClass = null;
	public NSAnimationClass NSAnimation() {
		return _NSAnimationClass != null ? _NSAnimationClass : (_NSAnimationClass = new NSAnimationClass(getRuntime()));
	}

	private NSDocumentControllerClass _NSDocumentControllerClass = null;
	public NSDocumentControllerClass NSDocumentController() {
		return _NSDocumentControllerClass != null ? _NSDocumentControllerClass : (_NSDocumentControllerClass = new NSDocumentControllerClass(getRuntime()));
	}

	private NSWindowClass _NSWindowClass = null;
	public NSWindowClass NSWindow() {
		return _NSWindowClass != null ? _NSWindowClass : (_NSWindowClass = new NSWindowClass(getRuntime()));
	}

	private NSDraggingSessionClass _NSDraggingSessionClass = null;
	public NSDraggingSessionClass NSDraggingSession() {
		return _NSDraggingSessionClass != null ? _NSDraggingSessionClass : (_NSDraggingSessionClass = new NSDraggingSessionClass(getRuntime()));
	}

	private NSTextClass _NSTextClass = null;
	public NSTextClass NSText() {
		return _NSTextClass != null ? _NSTextClass : (_NSTextClass = new NSTextClass(getRuntime()));
	}

	private NSScreenClass _NSScreenClass = null;
	public NSScreenClass NSScreen() {
		return _NSScreenClass != null ? _NSScreenClass : (_NSScreenClass = new NSScreenClass(getRuntime()));
	}

	private NSMatrixClass _NSMatrixClass = null;
	public NSMatrixClass NSMatrix() {
		return _NSMatrixClass != null ? _NSMatrixClass : (_NSMatrixClass = new NSMatrixClass(getRuntime()));
	}

	private NSViewControllerClass _NSViewControllerClass = null;
	public NSViewControllerClass NSViewController() {
		return _NSViewControllerClass != null ? _NSViewControllerClass : (_NSViewControllerClass = new NSViewControllerClass(getRuntime()));
	}

	private NSColorPanelClass _NSColorPanelClass = null;
	public NSColorPanelClass NSColorPanel() {
		return _NSColorPanelClass != null ? _NSColorPanelClass : (_NSColorPanelClass = new NSColorPanelClass(getRuntime()));
	}

	private NSResponderClass _NSResponderClass = null;
	public NSResponderClass NSResponder() {
		return _NSResponderClass != null ? _NSResponderClass : (_NSResponderClass = new NSResponderClass(getRuntime()));
	}

	private NSCIImageRepClass _NSCIImageRepClass = null;
	public NSCIImageRepClass NSCIImageRep() {
		return _NSCIImageRepClass != null ? _NSCIImageRepClass : (_NSCIImageRepClass = new NSCIImageRepClass(getRuntime()));
	}

	private NSTextFieldClass _NSTextFieldClass = null;
	public NSTextFieldClass NSTextField() {
		return _NSTextFieldClass != null ? _NSTextFieldClass : (_NSTextFieldClass = new NSTextFieldClass(getRuntime()));
	}

	private NSTextInputContextClass _NSTextInputContextClass = null;
	public NSTextInputContextClass NSTextInputContext() {
		return _NSTextInputContextClass != null ? _NSTextInputContextClass : (_NSTextInputContextClass = new NSTextInputContextClass(getRuntime()));
	}

	private NSViewClass _NSViewClass = null;
	public NSViewClass NSView() {
		return _NSViewClass != null ? _NSViewClass : (_NSViewClass = new NSViewClass(getRuntime()));
	}

	private NSTokenFieldCellClass _NSTokenFieldCellClass = null;
	public NSTokenFieldCellClass NSTokenFieldCell() {
		return _NSTokenFieldCellClass != null ? _NSTokenFieldCellClass : (_NSTokenFieldCellClass = new NSTokenFieldCellClass(getRuntime()));
	}

	private NSTokenFieldClass _NSTokenFieldClass = null;
	public NSTokenFieldClass NSTokenField() {
		return _NSTokenFieldClass != null ? _NSTokenFieldClass : (_NSTokenFieldClass = new NSTokenFieldClass(getRuntime()));
	}

	private NSRulerMarkerClass _NSRulerMarkerClass = null;
	public NSRulerMarkerClass NSRulerMarker() {
		return _NSRulerMarkerClass != null ? _NSRulerMarkerClass : (_NSRulerMarkerClass = new NSRulerMarkerClass(getRuntime()));
	}

	private NSNibControlConnectorClass _NSNibControlConnectorClass = null;
	public NSNibControlConnectorClass NSNibControlConnector() {
		return _NSNibControlConnectorClass != null ? _NSNibControlConnectorClass : (_NSNibControlConnectorClass = new NSNibControlConnectorClass(getRuntime()));
	}

	private NSPDFImageRepClass _NSPDFImageRepClass = null;
	public NSPDFImageRepClass NSPDFImageRep() {
		return _NSPDFImageRepClass != null ? _NSPDFImageRepClass : (_NSPDFImageRepClass = new NSPDFImageRepClass(getRuntime()));
	}

	private NSInputServerClass _NSInputServerClass = null;
	public NSInputServerClass NSInputServer() {
		return _NSInputServerClass != null ? _NSInputServerClass : (_NSInputServerClass = new NSInputServerClass(getRuntime()));
	}

	private NSMenuClass _NSMenuClass = null;
	public NSMenuClass NSMenu() {
		return _NSMenuClass != null ? _NSMenuClass : (_NSMenuClass = new NSMenuClass(getRuntime()));
	}

	private NSTextTableBlockClass _NSTextTableBlockClass = null;
	public NSTextTableBlockClass NSTextTableBlock() {
		return _NSTextTableBlockClass != null ? _NSTextTableBlockClass : (_NSTextTableBlockClass = new NSTextTableBlockClass(getRuntime()));
	}

	private NSTableHeaderViewClass _NSTableHeaderViewClass = null;
	public NSTableHeaderViewClass NSTableHeaderView() {
		return _NSTableHeaderViewClass != null ? _NSTableHeaderViewClass : (_NSTableHeaderViewClass = new NSTableHeaderViewClass(getRuntime()));
	}

	private NSScrollViewClass _NSScrollViewClass = null;
	public NSScrollViewClass NSScrollView() {
		return _NSScrollViewClass != null ? _NSScrollViewClass : (_NSScrollViewClass = new NSScrollViewClass(getRuntime()));
	}

	private NSOutlineViewClass _NSOutlineViewClass = null;
	public NSOutlineViewClass NSOutlineView() {
		return _NSOutlineViewClass != null ? _NSOutlineViewClass : (_NSOutlineViewClass = new NSOutlineViewClass(getRuntime()));
	}

	private NSPrintInfoClass _NSPrintInfoClass = null;
	public NSPrintInfoClass NSPrintInfo() {
		return _NSPrintInfoClass != null ? _NSPrintInfoClass : (_NSPrintInfoClass = new NSPrintInfoClass(getRuntime()));
	}

	private NSSecureTextFieldCellClass _NSSecureTextFieldCellClass = null;
	public NSSecureTextFieldCellClass NSSecureTextFieldCell() {
		return _NSSecureTextFieldCellClass != null ? _NSSecureTextFieldCellClass : (_NSSecureTextFieldCellClass = new NSSecureTextFieldCellClass(getRuntime()));
	}

	private NSTextContainerClass _NSTextContainerClass = null;
	public NSTextContainerClass NSTextContainer() {
		return _NSTextContainerClass != null ? _NSTextContainerClass : (_NSTextContainerClass = new NSTextContainerClass(getRuntime()));
	}

	private NSSpeechRecognizerClass _NSSpeechRecognizerClass = null;
	public NSSpeechRecognizerClass NSSpeechRecognizer() {
		return _NSSpeechRecognizerClass != null ? _NSSpeechRecognizerClass : (_NSSpeechRecognizerClass = new NSSpeechRecognizerClass(getRuntime()));
	}

	private NSFontCollectionClass _NSFontCollectionClass = null;
	public NSFontCollectionClass NSFontCollection() {
		return _NSFontCollectionClass != null ? _NSFontCollectionClass : (_NSFontCollectionClass = new NSFontCollectionClass(getRuntime()));
	}

	private NSPathCellClass _NSPathCellClass = null;
	public NSPathCellClass NSPathCell() {
		return _NSPathCellClass != null ? _NSPathCellClass : (_NSPathCellClass = new NSPathCellClass(getRuntime()));
	}

	private NSProgressIndicatorClass _NSProgressIndicatorClass = null;
	public NSProgressIndicatorClass NSProgressIndicator() {
		return _NSProgressIndicatorClass != null ? _NSProgressIndicatorClass : (_NSProgressIndicatorClass = new NSProgressIndicatorClass(getRuntime()));
	}

	private NSBezierPathClass _NSBezierPathClass = null;
	public NSBezierPathClass NSBezierPath() {
		return _NSBezierPathClass != null ? _NSBezierPathClass : (_NSBezierPathClass = new NSBezierPathClass(getRuntime()));
	}

	private NSComboBoxClass _NSComboBoxClass = null;
	public NSComboBoxClass NSComboBox() {
		return _NSComboBoxClass != null ? _NSComboBoxClass : (_NSComboBoxClass = new NSComboBoxClass(getRuntime()));
	}

	private NSOpenGLContextClass _NSOpenGLContextClass = null;
	public NSOpenGLContextClass NSOpenGLContext() {
		return _NSOpenGLContextClass != null ? _NSOpenGLContextClass : (_NSOpenGLContextClass = new NSOpenGLContextClass(getRuntime()));
	}

	private NSSoundClass _NSSoundClass = null;
	public NSSoundClass NSSound() {
		return _NSSoundClass != null ? _NSSoundClass : (_NSSoundClass = new NSSoundClass(getRuntime()));
	}

	private NSFontDescriptorClass _NSFontDescriptorClass = null;
	public NSFontDescriptorClass NSFontDescriptor() {
		return _NSFontDescriptorClass != null ? _NSFontDescriptorClass : (_NSFontDescriptorClass = new NSFontDescriptorClass(getRuntime()));
	}

	private NSDockTileClass _NSDockTileClass = null;
	public NSDockTileClass NSDockTile() {
		return _NSDockTileClass != null ? _NSDockTileClass : (_NSDockTileClass = new NSDockTileClass(getRuntime()));
	}

	private NSButtonCellClass _NSButtonCellClass = null;
	public NSButtonCellClass NSButtonCell() {
		return _NSButtonCellClass != null ? _NSButtonCellClass : (_NSButtonCellClass = new NSButtonCellClass(getRuntime()));
	}

	private NSEPSImageRepClass _NSEPSImageRepClass = null;
	public NSEPSImageRepClass NSEPSImageRep() {
		return _NSEPSImageRepClass != null ? _NSEPSImageRepClass : (_NSEPSImageRepClass = new NSEPSImageRepClass(getRuntime()));
	}

	private NSCollectionViewClass _NSCollectionViewClass = null;
	public NSCollectionViewClass NSCollectionView() {
		return _NSCollectionViewClass != null ? _NSCollectionViewClass : (_NSCollectionViewClass = new NSCollectionViewClass(getRuntime()));
	}

	private NSTextStorageClass _NSTextStorageClass = null;
	public NSTextStorageClass NSTextStorage() {
		return _NSTextStorageClass != null ? _NSTextStorageClass : (_NSTextStorageClass = new NSTextStorageClass(getRuntime()));
	}

	private NSSearchFieldCellClass _NSSearchFieldCellClass = null;
	public NSSearchFieldCellClass NSSearchFieldCell() {
		return _NSSearchFieldCellClass != null ? _NSSearchFieldCellClass : (_NSSearchFieldCellClass = new NSSearchFieldCellClass(getRuntime()));
	}

	private NSPICTImageRepClass _NSPICTImageRepClass = null;
	public NSPICTImageRepClass NSPICTImageRep() {
		return _NSPICTImageRepClass != null ? _NSPICTImageRepClass : (_NSPICTImageRepClass = new NSPICTImageRepClass(getRuntime()));
	}

	private NSActionCellClass _NSActionCellClass = null;
	public NSActionCellClass NSActionCell() {
		return _NSActionCellClass != null ? _NSActionCellClass : (_NSActionCellClass = new NSActionCellClass(getRuntime()));
	}

	private NSPrinterClass _NSPrinterClass = null;
	public NSPrinterClass NSPrinter() {
		return _NSPrinterClass != null ? _NSPrinterClass : (_NSPrinterClass = new NSPrinterClass(getRuntime()));
	}

	private NSControllerClass _NSControllerClass = null;
	public NSControllerClass NSController() {
		return _NSControllerClass != null ? _NSControllerClass : (_NSControllerClass = new NSControllerClass(getRuntime()));
	}

	private NSCursorClass _NSCursorClass = null;
	public NSCursorClass NSCursor() {
		return _NSCursorClass != null ? _NSCursorClass : (_NSCursorClass = new NSCursorClass(getRuntime()));
	}

	private NSImageClass _NSImageClass = null;
	public NSImageClass NSImage() {
		return _NSImageClass != null ? _NSImageClass : (_NSImageClass = new NSImageClass(getRuntime()));
	}

	private NSButtonClass _NSButtonClass = null;
	public NSButtonClass NSButton() {
		return _NSButtonClass != null ? _NSButtonClass : (_NSButtonClass = new NSButtonClass(getRuntime()));
	}

	private NSColorPickerClass _NSColorPickerClass = null;
	public NSColorPickerClass NSColorPicker() {
		return _NSColorPickerClass != null ? _NSColorPickerClass : (_NSColorPickerClass = new NSColorPickerClass(getRuntime()));
	}

	private NSSplitViewClass _NSSplitViewClass = null;
	public NSSplitViewClass NSSplitView() {
		return _NSSplitViewClass != null ? _NSSplitViewClass : (_NSSplitViewClass = new NSSplitViewClass(getRuntime()));
	}

	private NSParagraphStyleClass _NSParagraphStyleClass = null;
	public NSParagraphStyleClass NSParagraphStyle() {
		return _NSParagraphStyleClass != null ? _NSParagraphStyleClass : (_NSParagraphStyleClass = new NSParagraphStyleClass(getRuntime()));
	}

	private NSDrawerClass _NSDrawerClass = null;
	public NSDrawerClass NSDrawer() {
		return _NSDrawerClass != null ? _NSDrawerClass : (_NSDrawerClass = new NSDrawerClass(getRuntime()));
	}

	private NSBoxClass _NSBoxClass = null;
	public NSBoxClass NSBox() {
		return _NSBoxClass != null ? _NSBoxClass : (_NSBoxClass = new NSBoxClass(getRuntime()));
	}

	private NSGlyphGeneratorClass _NSGlyphGeneratorClass = null;
	public NSGlyphGeneratorClass NSGlyphGenerator() {
		return _NSGlyphGeneratorClass != null ? _NSGlyphGeneratorClass : (_NSGlyphGeneratorClass = new NSGlyphGeneratorClass(getRuntime()));
	}

	private NSToolbarClass _NSToolbarClass = null;
	public NSToolbarClass NSToolbar() {
		return _NSToolbarClass != null ? _NSToolbarClass : (_NSToolbarClass = new NSToolbarClass(getRuntime()));
	}

	private NSPasteboardItemClass _NSPasteboardItemClass = null;
	public NSPasteboardItemClass NSPasteboardItem() {
		return _NSPasteboardItemClass != null ? _NSPasteboardItemClass : (_NSPasteboardItemClass = new NSPasteboardItemClass(getRuntime()));
	}

	private NSTextTabClass _NSTextTabClass = null;
	public NSTextTabClass NSTextTab() {
		return _NSTextTabClass != null ? _NSTextTabClass : (_NSTextTabClass = new NSTextTabClass(getRuntime()));
	}

	private NSLevelIndicatorClass _NSLevelIndicatorClass = null;
	public NSLevelIndicatorClass NSLevelIndicator() {
		return _NSLevelIndicatorClass != null ? _NSLevelIndicatorClass : (_NSLevelIndicatorClass = new NSLevelIndicatorClass(getRuntime()));
	}

	private NSFontPanelClass _NSFontPanelClass = null;
	public NSFontPanelClass NSFontPanel() {
		return _NSFontPanelClass != null ? _NSFontPanelClass : (_NSFontPanelClass = new NSFontPanelClass(getRuntime()));
	}

	private NSPrintOperationClass _NSPrintOperationClass = null;
	public NSPrintOperationClass NSPrintOperation() {
		return _NSPrintOperationClass != null ? _NSPrintOperationClass : (_NSPrintOperationClass = new NSPrintOperationClass(getRuntime()));
	}

	private NSMutableParagraphStyleClass _NSMutableParagraphStyleClass = null;
	public NSMutableParagraphStyleClass NSMutableParagraphStyle() {
		return _NSMutableParagraphStyleClass != null ? _NSMutableParagraphStyleClass : (_NSMutableParagraphStyleClass = new NSMutableParagraphStyleClass(getRuntime()));
	}

	private NSPageControllerClass _NSPageControllerClass = null;
	public NSPageControllerClass NSPageController() {
		return _NSPageControllerClass != null ? _NSPageControllerClass : (_NSPageControllerClass = new NSPageControllerClass(getRuntime()));
	}

	private NSAlertClass _NSAlertClass = null;
	public NSAlertClass NSAlert() {
		return _NSAlertClass != null ? _NSAlertClass : (_NSAlertClass = new NSAlertClass(getRuntime()));
	}

	private NSImageCellClass _NSImageCellClass = null;
	public NSImageCellClass NSImageCell() {
		return _NSImageCellClass != null ? _NSImageCellClass : (_NSImageCellClass = new NSImageCellClass(getRuntime()));
	}

	private NSFontClass _NSFontClass = null;
	public NSFontClass NSFont() {
		return _NSFontClass != null ? _NSFontClass : (_NSFontClass = new NSFontClass(getRuntime()));
	}

	private NSPredicateEditorClass _NSPredicateEditorClass = null;
	public NSPredicateEditorClass NSPredicateEditor() {
		return _NSPredicateEditorClass != null ? _NSPredicateEditorClass : (_NSPredicateEditorClass = new NSPredicateEditorClass(getRuntime()));
	}

	private NSDraggingItemClass _NSDraggingItemClass = null;
	public NSDraggingItemClass NSDraggingItem() {
		return _NSDraggingItemClass != null ? _NSDraggingItemClass : (_NSDraggingItemClass = new NSDraggingItemClass(getRuntime()));
	}

	private NSCustomImageRepClass _NSCustomImageRepClass = null;
	public NSCustomImageRepClass NSCustomImageRep() {
		return _NSCustomImageRepClass != null ? _NSCustomImageRepClass : (_NSCustomImageRepClass = new NSCustomImageRepClass(getRuntime()));
	}

	private NSToolbarItemClass _NSToolbarItemClass = null;
	public NSToolbarItemClass NSToolbarItem() {
		return _NSToolbarItemClass != null ? _NSToolbarItemClass : (_NSToolbarItemClass = new NSToolbarItemClass(getRuntime()));
	}

	private NSTextTableClass _NSTextTableClass = null;
	public NSTextTableClass NSTextTable() {
		return _NSTextTableClass != null ? _NSTextTableClass : (_NSTextTableClass = new NSTextTableClass(getRuntime()));
	}

	private NSATSTypesetterClass _NSATSTypesetterClass = null;
	public NSATSTypesetterClass NSATSTypesetter() {
		return _NSATSTypesetterClass != null ? _NSATSTypesetterClass : (_NSATSTypesetterClass = new NSATSTypesetterClass(getRuntime()));
	}

	private NSTabViewItemClass _NSTabViewItemClass = null;
	public NSTabViewItemClass NSTabViewItem() {
		return _NSTabViewItemClass != null ? _NSTabViewItemClass : (_NSTabViewItemClass = new NSTabViewItemClass(getRuntime()));
	}

	private NSSpellCheckerClass _NSSpellCheckerClass = null;
	public NSSpellCheckerClass NSSpellChecker() {
		return _NSSpellCheckerClass != null ? _NSSpellCheckerClass : (_NSSpellCheckerClass = new NSSpellCheckerClass(getRuntime()));
	}

	private NSFontManagerClass _NSFontManagerClass = null;
	public NSFontManagerClass NSFontManager() {
		return _NSFontManagerClass != null ? _NSFontManagerClass : (_NSFontManagerClass = new NSFontManagerClass(getRuntime()));
	}

	private NSStatusItemClass _NSStatusItemClass = null;
	public NSStatusItemClass NSStatusItem() {
		return _NSStatusItemClass != null ? _NSStatusItemClass : (_NSStatusItemClass = new NSStatusItemClass(getRuntime()));
	}

	private NSTableViewClass _NSTableViewClass = null;
	public NSTableViewClass NSTableView() {
		return _NSTableViewClass != null ? _NSTableViewClass : (_NSTableViewClass = new NSTableViewClass(getRuntime()));
	}

	private NSOpenGLLayerClass _NSOpenGLLayerClass = null;
	public NSOpenGLLayerClass NSOpenGLLayer() {
		return _NSOpenGLLayerClass != null ? _NSOpenGLLayerClass : (_NSOpenGLLayerClass = new NSOpenGLLayerClass(getRuntime()));
	}

	private NSTextFinderClass _NSTextFinderClass = null;
	public NSTextFinderClass NSTextFinder() {
		return _NSTextFinderClass != null ? _NSTextFinderClass : (_NSTextFinderClass = new NSTextFinderClass(getRuntime()));
	}

	private NSBrowserClass _NSBrowserClass = null;
	public NSBrowserClass NSBrowser() {
		return _NSBrowserClass != null ? _NSBrowserClass : (_NSBrowserClass = new NSBrowserClass(getRuntime()));
	}

	private NSPredicateEditorRowTemplateClass _NSPredicateEditorRowTemplateClass = null;
	public NSPredicateEditorRowTemplateClass NSPredicateEditorRowTemplate() {
		return _NSPredicateEditorRowTemplateClass != null ? _NSPredicateEditorRowTemplateClass : (_NSPredicateEditorRowTemplateClass = new NSPredicateEditorRowTemplateClass(getRuntime()));
	}

	private NSScrollerClass _NSScrollerClass = null;
	public NSScrollerClass NSScroller() {
		return _NSScrollerClass != null ? _NSScrollerClass : (_NSScrollerClass = new NSScrollerClass(getRuntime()));
	}

	private NSSharingServicePickerClass _NSSharingServicePickerClass = null;
	public NSSharingServicePickerClass NSSharingServicePicker() {
		return _NSSharingServicePickerClass != null ? _NSSharingServicePickerClass : (_NSSharingServicePickerClass = new NSSharingServicePickerClass(getRuntime()));
	}

	private NSTouchClass _NSTouchClass = null;
	public NSTouchClass NSTouch() {
		return _NSTouchClass != null ? _NSTouchClass : (_NSTouchClass = new NSTouchClass(getRuntime()));
	}

	private NSRuleEditorClass _NSRuleEditorClass = null;
	public NSRuleEditorClass NSRuleEditor() {
		return _NSRuleEditorClass != null ? _NSRuleEditorClass : (_NSRuleEditorClass = new NSRuleEditorClass(getRuntime()));
	}

	private NSShadowClass _NSShadowClass = null;
	public NSShadowClass NSShadow() {
		return _NSShadowClass != null ? _NSShadowClass : (_NSShadowClass = new NSShadowClass(getRuntime()));
	}

	private NSMovieClass _NSMovieClass = null;
	public NSMovieClass NSMovie() {
		return _NSMovieClass != null ? _NSMovieClass : (_NSMovieClass = new NSMovieClass(getRuntime()));
	}

	private NSLayoutConstraintClass _NSLayoutConstraintClass = null;
	public NSLayoutConstraintClass NSLayoutConstraint() {
		return _NSLayoutConstraintClass != null ? _NSLayoutConstraintClass : (_NSLayoutConstraintClass = new NSLayoutConstraintClass(getRuntime()));
	}

	private NSSharingServiceClass _NSSharingServiceClass = null;
	public NSSharingServiceClass NSSharingService() {
		return _NSSharingServiceClass != null ? _NSSharingServiceClass : (_NSSharingServiceClass = new NSSharingServiceClass(getRuntime()));
	}

	private NSOpenGLPixelBufferClass _NSOpenGLPixelBufferClass = null;
	public NSOpenGLPixelBufferClass NSOpenGLPixelBuffer() {
		return _NSOpenGLPixelBufferClass != null ? _NSOpenGLPixelBufferClass : (_NSOpenGLPixelBufferClass = new NSOpenGLPixelBufferClass(getRuntime()));
	}

	private NSBitmapImageRepClass _NSBitmapImageRepClass = null;
	public NSBitmapImageRepClass NSBitmapImageRep() {
		return _NSBitmapImageRepClass != null ? _NSBitmapImageRepClass : (_NSBitmapImageRepClass = new NSBitmapImageRepClass(getRuntime()));
	}

	private NSLayoutManagerClass _NSLayoutManagerClass = null;
	public NSLayoutManagerClass NSLayoutManager() {
		return _NSLayoutManagerClass != null ? _NSLayoutManagerClass : (_NSLayoutManagerClass = new NSLayoutManagerClass(getRuntime()));
	}

	private NSPanelClass _NSPanelClass = null;
	public NSPanelClass NSPanel() {
		return _NSPanelClass != null ? _NSPanelClass : (_NSPanelClass = new NSPanelClass(getRuntime()));
	}

	private NSGlyphInfoClass _NSGlyphInfoClass = null;
	public NSGlyphInfoClass NSGlyphInfo() {
		return _NSGlyphInfoClass != null ? _NSGlyphInfoClass : (_NSGlyphInfoClass = new NSGlyphInfoClass(getRuntime()));
	}

	private CIImageClass _CIImageClass = null;
	public CIImageClass CIImage() {
		return _CIImageClass != null ? _CIImageClass : (_CIImageClass = new CIImageClass(getRuntime()));
	}

	private NSCellClass _NSCellClass = null;
	public NSCellClass NSCell() {
		return _NSCellClass != null ? _NSCellClass : (_NSCellClass = new NSCellClass(getRuntime()));
	}

	private NSTextAttachmentClass _NSTextAttachmentClass = null;
	public NSTextAttachmentClass NSTextAttachment() {
		return _NSTextAttachmentClass != null ? _NSTextAttachmentClass : (_NSTextAttachmentClass = new NSTextAttachmentClass(getRuntime()));
	}

	private NSViewAnimationClass _NSViewAnimationClass = null;
	public NSViewAnimationClass NSViewAnimation() {
		return _NSViewAnimationClass != null ? _NSViewAnimationClass : (_NSViewAnimationClass = new NSViewAnimationClass(getRuntime()));
	}

	private NSWindowControllerClass _NSWindowControllerClass = null;
	public NSWindowControllerClass NSWindowController() {
		return _NSWindowControllerClass != null ? _NSWindowControllerClass : (_NSWindowControllerClass = new NSWindowControllerClass(getRuntime()));
	}

	private NSColorWellClass _NSColorWellClass = null;
	public NSColorWellClass NSColorWell() {
		return _NSColorWellClass != null ? _NSColorWellClass : (_NSColorWellClass = new NSColorWellClass(getRuntime()));
	}

	private NSPopUpButtonClass _NSPopUpButtonClass = null;
	public NSPopUpButtonClass NSPopUpButton() {
		return _NSPopUpButtonClass != null ? _NSPopUpButtonClass : (_NSPopUpButtonClass = new NSPopUpButtonClass(getRuntime()));
	}

	private NSStepperCellClass _NSStepperCellClass = null;
	public NSStepperCellClass NSStepperCell() {
		return _NSStepperCellClass != null ? _NSStepperCellClass : (_NSStepperCellClass = new NSStepperCellClass(getRuntime()));
	}

	private NSDatePickerCellClass _NSDatePickerCellClass = null;
	public NSDatePickerCellClass NSDatePickerCell() {
		return _NSDatePickerCellClass != null ? _NSDatePickerCellClass : (_NSDatePickerCellClass = new NSDatePickerCellClass(getRuntime()));
	}

	private NSFormCellClass _NSFormCellClass = null;
	public NSFormCellClass NSFormCell() {
		return _NSFormCellClass != null ? _NSFormCellClass : (_NSFormCellClass = new NSFormCellClass(getRuntime()));
	}

	private NSControlClass _NSControlClass = null;
	public NSControlClass NSControl() {
		return _NSControlClass != null ? _NSControlClass : (_NSControlClass = new NSControlClass(getRuntime()));
	}

	private NSCachedImageRepClass _NSCachedImageRepClass = null;
	public NSCachedImageRepClass NSCachedImageRep() {
		return _NSCachedImageRepClass != null ? _NSCachedImageRepClass : (_NSCachedImageRepClass = new NSCachedImageRepClass(getRuntime()));
	}

	private NSFormClass _NSFormClass = null;
	public NSFormClass NSForm() {
		return _NSFormClass != null ? _NSFormClass : (_NSFormClass = new NSFormClass(getRuntime()));
	}

	private NSAnimationContextClass _NSAnimationContextClass = null;
	public NSAnimationContextClass NSAnimationContext() {
		return _NSAnimationContextClass != null ? _NSAnimationContextClass : (_NSAnimationContextClass = new NSAnimationContextClass(getRuntime()));
	}

	private NSTextFieldCellClass _NSTextFieldCellClass = null;
	public NSTextFieldCellClass NSTextFieldCell() {
		return _NSTextFieldCellClass != null ? _NSTextFieldCellClass : (_NSTextFieldCellClass = new NSTextFieldCellClass(getRuntime()));
	}

	private NSClipViewClass _NSClipViewClass = null;
	public NSClipViewClass NSClipView() {
		return _NSClipViewClass != null ? _NSClipViewClass : (_NSClipViewClass = new NSClipViewClass(getRuntime()));
	}

	private NSMutableFontCollectionClass _NSMutableFontCollectionClass = null;
	public NSMutableFontCollectionClass NSMutableFontCollection() {
		return _NSMutableFontCollectionClass != null ? _NSMutableFontCollectionClass : (_NSMutableFontCollectionClass = new NSMutableFontCollectionClass(getRuntime()));
	}

	private NSSliderCellClass _NSSliderCellClass = null;
	public NSSliderCellClass NSSliderCell() {
		return _NSSliderCellClass != null ? _NSSliderCellClass : (_NSSliderCellClass = new NSSliderCellClass(getRuntime()));
	}

	private NSInputManagerClass _NSInputManagerClass = null;
	public NSInputManagerClass NSInputManager() {
		return _NSInputManagerClass != null ? _NSInputManagerClass : (_NSInputManagerClass = new NSInputManagerClass(getRuntime()));
	}

	private NSPageLayoutClass _NSPageLayoutClass = null;
	public NSPageLayoutClass NSPageLayout() {
		return _NSPageLayoutClass != null ? _NSPageLayoutClass : (_NSPageLayoutClass = new NSPageLayoutClass(getRuntime()));
	}

	private NSColorClass _NSColorClass = null;
	public NSColorClass NSColor() {
		return _NSColorClass != null ? _NSColorClass : (_NSColorClass = new NSColorClass(getRuntime()));
	}

	private NSGraphicsContextClass _NSGraphicsContextClass = null;
	public NSGraphicsContextClass NSGraphicsContext() {
		return _NSGraphicsContextClass != null ? _NSGraphicsContextClass : (_NSGraphicsContextClass = new NSGraphicsContextClass(getRuntime()));
	}

	private NSEventClass _NSEventClass = null;
	public NSEventClass NSEvent() {
		return _NSEventClass != null ? _NSEventClass : (_NSEventClass = new NSEventClass(getRuntime()));
	}

	private NSTableColumnClass _NSTableColumnClass = null;
	public NSTableColumnClass NSTableColumn() {
		return _NSTableColumnClass != null ? _NSTableColumnClass : (_NSTableColumnClass = new NSTableColumnClass(getRuntime()));
	}

	private NSNibConnectorClass _NSNibConnectorClass = null;
	public NSNibConnectorClass NSNibConnector() {
		return _NSNibConnectorClass != null ? _NSNibConnectorClass : (_NSNibConnectorClass = new NSNibConnectorClass(getRuntime()));
	}

	private NSOpenGLViewClass _NSOpenGLViewClass = null;
	public NSOpenGLViewClass NSOpenGLView() {
		return _NSOpenGLViewClass != null ? _NSOpenGLViewClass : (_NSOpenGLViewClass = new NSOpenGLViewClass(getRuntime()));
	}

	private NSMenuItemCellClass _NSMenuItemCellClass = null;
	public NSMenuItemCellClass NSMenuItemCell() {
		return _NSMenuItemCellClass != null ? _NSMenuItemCellClass : (_NSMenuItemCellClass = new NSMenuItemCellClass(getRuntime()));
	}

	private NSToolbarItemGroupClass _NSToolbarItemGroupClass = null;
	public NSToolbarItemGroupClass NSToolbarItemGroup() {
		return _NSToolbarItemGroupClass != null ? _NSToolbarItemGroupClass : (_NSToolbarItemGroupClass = new NSToolbarItemGroupClass(getRuntime()));
	}

	private NSRulerViewClass _NSRulerViewClass = null;
	public NSRulerViewClass NSRulerView() {
		return _NSRulerViewClass != null ? _NSRulerViewClass : (_NSRulerViewClass = new NSRulerViewClass(getRuntime()));
	}

	private NSTableRowViewClass _NSTableRowViewClass = null;
	public NSTableRowViewClass NSTableRowView() {
		return _NSTableRowViewClass != null ? _NSTableRowViewClass : (_NSTableRowViewClass = new NSTableRowViewClass(getRuntime()));
	}

	private NSTypesetterClass _NSTypesetterClass = null;
	public NSTypesetterClass NSTypesetter() {
		return _NSTypesetterClass != null ? _NSTypesetterClass : (_NSTypesetterClass = new NSTypesetterClass(getRuntime()));
	}

	private NSPopUpButtonCellClass _NSPopUpButtonCellClass = null;
	public NSPopUpButtonCellClass NSPopUpButtonCell() {
		return _NSPopUpButtonCellClass != null ? _NSPopUpButtonCellClass : (_NSPopUpButtonCellClass = new NSPopUpButtonCellClass(getRuntime()));
	}

	private NSSegmentedCellClass _NSSegmentedCellClass = null;
	public NSSegmentedCellClass NSSegmentedCell() {
		return _NSSegmentedCellClass != null ? _NSSegmentedCellClass : (_NSSegmentedCellClass = new NSSegmentedCellClass(getRuntime()));
	}

	private NSDictionaryControllerClass _NSDictionaryControllerClass = null;
	public NSDictionaryControllerClass NSDictionaryController() {
		return _NSDictionaryControllerClass != null ? _NSDictionaryControllerClass : (_NSDictionaryControllerClass = new NSDictionaryControllerClass(getRuntime()));
	}

	private NSTextListClass _NSTextListClass = null;
	public NSTextListClass NSTextList() {
		return _NSTextListClass != null ? _NSTextListClass : (_NSTextListClass = new NSTextListClass(getRuntime()));
	}

	private NSGradientClass _NSGradientClass = null;
	public NSGradientClass NSGradient() {
		return _NSGradientClass != null ? _NSGradientClass : (_NSGradientClass = new NSGradientClass(getRuntime()));
	}

	private NSPersistentDocumentClass _NSPersistentDocumentClass = null;
	public NSPersistentDocumentClass NSPersistentDocument() {
		return _NSPersistentDocumentClass != null ? _NSPersistentDocumentClass : (_NSPersistentDocumentClass = new NSPersistentDocumentClass(getRuntime()));
	}

	private NSCollectionViewItemClass _NSCollectionViewItemClass = null;
	public NSCollectionViewItemClass NSCollectionViewItem() {
		return _NSCollectionViewItemClass != null ? _NSCollectionViewItemClass : (_NSCollectionViewItemClass = new NSCollectionViewItemClass(getRuntime()));
	}

	private NSColorListClass _NSColorListClass = null;
	public NSColorListClass NSColorList() {
		return _NSColorListClass != null ? _NSColorListClass : (_NSColorListClass = new NSColorListClass(getRuntime()));
	}

	private NSTableHeaderCellClass _NSTableHeaderCellClass = null;
	public NSTableHeaderCellClass NSTableHeaderCell() {
		return _NSTableHeaderCellClass != null ? _NSTableHeaderCellClass : (_NSTableHeaderCellClass = new NSTableHeaderCellClass(getRuntime()));
	}

	private NSOpenGLPixelFormatClass _NSOpenGLPixelFormatClass = null;
	public NSOpenGLPixelFormatClass NSOpenGLPixelFormat() {
		return _NSOpenGLPixelFormatClass != null ? _NSOpenGLPixelFormatClass : (_NSOpenGLPixelFormatClass = new NSOpenGLPixelFormatClass(getRuntime()));
	}

	private NSObjectControllerClass _NSObjectControllerClass = null;
	public NSObjectControllerClass NSObjectController() {
		return _NSObjectControllerClass != null ? _NSObjectControllerClass : (_NSObjectControllerClass = new NSObjectControllerClass(getRuntime()));
	}

	private NSLevelIndicatorCellClass _NSLevelIndicatorCellClass = null;
	public NSLevelIndicatorCellClass NSLevelIndicatorCell() {
		return _NSLevelIndicatorCellClass != null ? _NSLevelIndicatorCellClass : (_NSLevelIndicatorCellClass = new NSLevelIndicatorCellClass(getRuntime()));
	}

	private NSApplicationClass _NSApplicationClass = null;
	public NSApplicationClass NSApplication() {
		return _NSApplicationClass != null ? _NSApplicationClass : (_NSApplicationClass = new NSApplicationClass(getRuntime()));
	}

	private NSTableCellViewClass _NSTableCellViewClass = null;
	public NSTableCellViewClass NSTableCellView() {
		return _NSTableCellViewClass != null ? _NSTableCellViewClass : (_NSTableCellViewClass = new NSTableCellViewClass(getRuntime()));
	}

	private NSTabViewClass _NSTabViewClass = null;
	public NSTabViewClass NSTabView() {
		return _NSTabViewClass != null ? _NSTabViewClass : (_NSTabViewClass = new NSTabViewClass(getRuntime()));
	}

	private NSTextAlternativesClass _NSTextAlternativesClass = null;
	public NSTextAlternativesClass NSTextAlternatives() {
		return _NSTextAlternativesClass != null ? _NSTextAlternativesClass : (_NSTextAlternativesClass = new NSTextAlternativesClass(getRuntime()));
	}

	private NSDatePickerClass _NSDatePickerClass = null;
	public NSDatePickerClass NSDatePicker() {
		return _NSDatePickerClass != null ? _NSDatePickerClass : (_NSDatePickerClass = new NSDatePickerClass(getRuntime()));
	}

	private NSPopoverClass _NSPopoverClass = null;
	public NSPopoverClass NSPopover() {
		return _NSPopoverClass != null ? _NSPopoverClass : (_NSPopoverClass = new NSPopoverClass(getRuntime()));
	}

	private NSSliderClass _NSSliderClass = null;
	public NSSliderClass NSSlider() {
		return _NSSliderClass != null ? _NSSliderClass : (_NSSliderClass = new NSSliderClass(getRuntime()));
	}

	private NSImageRepClass _NSImageRepClass = null;
	public NSImageRepClass NSImageRep() {
		return _NSImageRepClass != null ? _NSImageRepClass : (_NSImageRepClass = new NSImageRepClass(getRuntime()));
	}

	private NSOpenPanelClass _NSOpenPanelClass = null;
	public NSOpenPanelClass NSOpenPanel() {
		return _NSOpenPanelClass != null ? _NSOpenPanelClass : (_NSOpenPanelClass = new NSOpenPanelClass(getRuntime()));
	}

	private NSWorkspaceClass _NSWorkspaceClass = null;
	public NSWorkspaceClass NSWorkspace() {
		return _NSWorkspaceClass != null ? _NSWorkspaceClass : (_NSWorkspaceClass = new NSWorkspaceClass(getRuntime()));
	}

	private NSPrintPanelClass _NSPrintPanelClass = null;
	public NSPrintPanelClass NSPrintPanel() {
		return _NSPrintPanelClass != null ? _NSPrintPanelClass : (_NSPrintPanelClass = new NSPrintPanelClass(getRuntime()));
	}

	private NSPathComponentCellClass _NSPathComponentCellClass = null;
	public NSPathComponentCellClass NSPathComponentCell() {
		return _NSPathComponentCellClass != null ? _NSPathComponentCellClass : (_NSPathComponentCellClass = new NSPathComponentCellClass(getRuntime()));
	}

	private NSColorSpaceClass _NSColorSpaceClass = null;
	public NSColorSpaceClass NSColorSpace() {
		return _NSColorSpaceClass != null ? _NSColorSpaceClass : (_NSColorSpaceClass = new NSColorSpaceClass(getRuntime()));
	}

	private NSTextBlockClass _NSTextBlockClass = null;
	public NSTextBlockClass NSTextBlock() {
		return _NSTextBlockClass != null ? _NSTextBlockClass : (_NSTextBlockClass = new NSTextBlockClass(getRuntime()));
	}

	private NSRunningApplicationClass _NSRunningApplicationClass = null;
	public NSRunningApplicationClass NSRunningApplication() {
		return _NSRunningApplicationClass != null ? _NSRunningApplicationClass : (_NSRunningApplicationClass = new NSRunningApplicationClass(getRuntime()));
	}

	private NSDocumentClass _NSDocumentClass = null;
	public NSDocumentClass NSDocument() {
		return _NSDocumentClass != null ? _NSDocumentClass : (_NSDocumentClass = new NSDocumentClass(getRuntime()));
	}

	private NSAttributedStringCategoryClass _NSAttributedStringCategoryClass = null;
	public NSAttributedStringCategoryClass NSAttributedStringCategory() {
		return _NSAttributedStringCategoryClass != null ? _NSAttributedStringCategoryClass : (_NSAttributedStringCategoryClass = new NSAttributedStringCategoryClass(getRuntime()));
	}

	 public NSAttributedStringCategory NSAttributedStringCategory(final com.apple.jobjc.foundation.NSAttributedString obj){
		return new NSAttributedStringCategory(obj, getRuntime());
	}

	private NSStringCategoryClass _NSStringCategoryClass = null;
	public NSStringCategoryClass NSStringCategory() {
		return _NSStringCategoryClass != null ? _NSStringCategoryClass : (_NSStringCategoryClass = new NSStringCategoryClass(getRuntime()));
	}

	 public NSStringCategory NSStringCategory(final com.apple.jobjc.foundation.NSString obj){
		return new NSStringCategory(obj, getRuntime());
	}

	private NSFileWrapperCategoryClass _NSFileWrapperCategoryClass = null;
	public NSFileWrapperCategoryClass NSFileWrapperCategory() {
		return _NSFileWrapperCategoryClass != null ? _NSFileWrapperCategoryClass : (_NSFileWrapperCategoryClass = new NSFileWrapperCategoryClass(getRuntime()));
	}

	 public NSFileWrapperCategory NSFileWrapperCategory(final com.apple.jobjc.foundation.NSFileWrapper obj){
		return new NSFileWrapperCategory(obj, getRuntime());
	}

	private NSMutableAttributedStringCategoryClass _NSMutableAttributedStringCategoryClass = null;
	public NSMutableAttributedStringCategoryClass NSMutableAttributedStringCategory() {
		return _NSMutableAttributedStringCategoryClass != null ? _NSMutableAttributedStringCategoryClass : (_NSMutableAttributedStringCategoryClass = new NSMutableAttributedStringCategoryClass(getRuntime()));
	}

	 public NSMutableAttributedStringCategory NSMutableAttributedStringCategory(final com.apple.jobjc.foundation.NSMutableAttributedString obj){
		return new NSMutableAttributedStringCategory(obj, getRuntime());
	}

	private NSURLCategoryClass _NSURLCategoryClass = null;
	public NSURLCategoryClass NSURLCategory() {
		return _NSURLCategoryClass != null ? _NSURLCategoryClass : (_NSURLCategoryClass = new NSURLCategoryClass(getRuntime()));
	}

	 public NSURLCategory NSURLCategory(final com.apple.jobjc.foundation.NSURL obj){
		return new NSURLCategory(obj, getRuntime());
	}

	private NSAffineTransformCategoryClass _NSAffineTransformCategoryClass = null;
	public NSAffineTransformCategoryClass NSAffineTransformCategory() {
		return _NSAffineTransformCategoryClass != null ? _NSAffineTransformCategoryClass : (_NSAffineTransformCategoryClass = new NSAffineTransformCategoryClass(getRuntime()));
	}

	 public NSAffineTransformCategory NSAffineTransformCategory(final com.apple.jobjc.foundation.NSAffineTransform obj){
		return new NSAffineTransformCategory(obj, getRuntime());
	}

	private NSBundleCategoryClass _NSBundleCategoryClass = null;
	public NSBundleCategoryClass NSBundleCategory() {
		return _NSBundleCategoryClass != null ? _NSBundleCategoryClass : (_NSBundleCategoryClass = new NSBundleCategoryClass(getRuntime()));
	}

	 public NSBundleCategory NSBundleCategory(final com.apple.jobjc.foundation.NSBundle obj){
		return new NSBundleCategory(obj, getRuntime());
	}

	private NSAppleScriptCategoryClass _NSAppleScriptCategoryClass = null;
	public NSAppleScriptCategoryClass NSAppleScriptCategory() {
		return _NSAppleScriptCategoryClass != null ? _NSAppleScriptCategoryClass : (_NSAppleScriptCategoryClass = new NSAppleScriptCategoryClass(getRuntime()));
	}

	 public NSAppleScriptCategory NSAppleScriptCategory(final com.apple.jobjc.foundation.NSAppleScript obj){
		return new NSAppleScriptCategory(obj, getRuntime());
	}

	private NSObjectCategoryClass _NSObjectCategoryClass = null;
	public NSObjectCategoryClass NSObjectCategory() {
		return _NSObjectCategoryClass != null ? _NSObjectCategoryClass : (_NSObjectCategoryClass = new NSObjectCategoryClass(getRuntime()));
	}

	 public NSObjectCategory NSObjectCategory(final com.apple.jobjc.foundation.NSObject obj){
		return new NSObjectCategory(obj, getRuntime());
	}

	private NSCoderCategoryClass _NSCoderCategoryClass = null;
	public NSCoderCategoryClass NSCoderCategory() {
		return _NSCoderCategoryClass != null ? _NSCoderCategoryClass : (_NSCoderCategoryClass = new NSCoderCategoryClass(getRuntime()));
	}

	 public NSCoderCategory NSCoderCategory(final com.apple.jobjc.foundation.NSCoder obj){
		return new NSCoderCategory(obj, getRuntime());
	}

	private static com.apple.jobjc.Invoke.FunCall NSAccessibilityActionDescription_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSAccessibilityActionDescription_FxnInst(){
		return ((NSAccessibilityActionDescription_FxnInst != null)
	? (NSAccessibilityActionDescription_FxnInst)
	: (NSAccessibilityActionDescription_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSAccessibilityActionDescription", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSAccessibilityActionDescription(final com.apple.jobjc.foundation.NSString action){
			final com.apple.jobjc.Invoke.FunCall NSAccessibilityActionDescription_FxnInst = get_NSAccessibilityActionDescription_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSAccessibilityActionDescription_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, action);
		NSAccessibilityActionDescription_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSAccessibilityPostNotification_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSAccessibilityPostNotification_FxnInst(){
		return ((NSAccessibilityPostNotification_FxnInst != null)
	? (NSAccessibilityPostNotification_FxnInst)
	: (NSAccessibilityPostNotification_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSAccessibilityPostNotification", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void NSAccessibilityPostNotification(final com.apple.jobjc.ID element, final com.apple.jobjc.foundation.NSString notification){
			final com.apple.jobjc.Invoke.FunCall NSAccessibilityPostNotification_FxnInst = get_NSAccessibilityPostNotification_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSAccessibilityPostNotification_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, element);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		NSAccessibilityPostNotification_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSAccessibilityRaiseBadArgumentException_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSAccessibilityRaiseBadArgumentException_FxnInst(){
		return ((NSAccessibilityRaiseBadArgumentException_FxnInst != null)
	? (NSAccessibilityRaiseBadArgumentException_FxnInst)
	: (NSAccessibilityRaiseBadArgumentException_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSAccessibilityRaiseBadArgumentException", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void NSAccessibilityRaiseBadArgumentException(final com.apple.jobjc.ID element, final com.apple.jobjc.foundation.NSString attribute, final com.apple.jobjc.ID value){
			final com.apple.jobjc.Invoke.FunCall NSAccessibilityRaiseBadArgumentException_FxnInst = get_NSAccessibilityRaiseBadArgumentException_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSAccessibilityRaiseBadArgumentException_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, element);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attribute);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		NSAccessibilityRaiseBadArgumentException_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSAccessibilityRoleDescription_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSAccessibilityRoleDescription_FxnInst(){
		return ((NSAccessibilityRoleDescription_FxnInst != null)
	? (NSAccessibilityRoleDescription_FxnInst)
	: (NSAccessibilityRoleDescription_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSAccessibilityRoleDescription", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSAccessibilityRoleDescription(final com.apple.jobjc.foundation.NSString role, final com.apple.jobjc.foundation.NSString subrole){
			final com.apple.jobjc.Invoke.FunCall NSAccessibilityRoleDescription_FxnInst = get_NSAccessibilityRoleDescription_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSAccessibilityRoleDescription_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, role);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subrole);
		NSAccessibilityRoleDescription_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSAccessibilityRoleDescriptionForUIElement_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSAccessibilityRoleDescriptionForUIElement_FxnInst(){
		return ((NSAccessibilityRoleDescriptionForUIElement_FxnInst != null)
	? (NSAccessibilityRoleDescriptionForUIElement_FxnInst)
	: (NSAccessibilityRoleDescriptionForUIElement_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSAccessibilityRoleDescriptionForUIElement", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSAccessibilityRoleDescriptionForUIElement(final com.apple.jobjc.ID element){
			final com.apple.jobjc.Invoke.FunCall NSAccessibilityRoleDescriptionForUIElement_FxnInst = get_NSAccessibilityRoleDescriptionForUIElement_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSAccessibilityRoleDescriptionForUIElement_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, element);
		NSAccessibilityRoleDescriptionForUIElement_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSAccessibilityUnignoredAncestor_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSAccessibilityUnignoredAncestor_FxnInst(){
		return ((NSAccessibilityUnignoredAncestor_FxnInst != null)
	? (NSAccessibilityUnignoredAncestor_FxnInst)
	: (NSAccessibilityUnignoredAncestor_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSAccessibilityUnignoredAncestor", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T NSAccessibilityUnignoredAncestor(final com.apple.jobjc.ID element){
			final com.apple.jobjc.Invoke.FunCall NSAccessibilityUnignoredAncestor_FxnInst = get_NSAccessibilityUnignoredAncestor_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSAccessibilityUnignoredAncestor_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, element);
		NSAccessibilityUnignoredAncestor_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSAccessibilityUnignoredChildren_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSAccessibilityUnignoredChildren_FxnInst(){
		return ((NSAccessibilityUnignoredChildren_FxnInst != null)
	? (NSAccessibilityUnignoredChildren_FxnInst)
	: (NSAccessibilityUnignoredChildren_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSAccessibilityUnignoredChildren", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray NSAccessibilityUnignoredChildren(final com.apple.jobjc.foundation.NSArray originalChildren){
			final com.apple.jobjc.Invoke.FunCall NSAccessibilityUnignoredChildren_FxnInst = get_NSAccessibilityUnignoredChildren_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSAccessibilityUnignoredChildren_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, originalChildren);
		NSAccessibilityUnignoredChildren_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSAccessibilityUnignoredChildrenForOnlyChild_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSAccessibilityUnignoredChildrenForOnlyChild_FxnInst(){
		return ((NSAccessibilityUnignoredChildrenForOnlyChild_FxnInst != null)
	? (NSAccessibilityUnignoredChildrenForOnlyChild_FxnInst)
	: (NSAccessibilityUnignoredChildrenForOnlyChild_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSAccessibilityUnignoredChildrenForOnlyChild", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray NSAccessibilityUnignoredChildrenForOnlyChild(final com.apple.jobjc.ID originalChild){
			final com.apple.jobjc.Invoke.FunCall NSAccessibilityUnignoredChildrenForOnlyChild_FxnInst = get_NSAccessibilityUnignoredChildrenForOnlyChild_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSAccessibilityUnignoredChildrenForOnlyChild_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, originalChild);
		NSAccessibilityUnignoredChildrenForOnlyChild_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSAccessibilityUnignoredDescendant_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSAccessibilityUnignoredDescendant_FxnInst(){
		return ((NSAccessibilityUnignoredDescendant_FxnInst != null)
	? (NSAccessibilityUnignoredDescendant_FxnInst)
	: (NSAccessibilityUnignoredDescendant_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSAccessibilityUnignoredDescendant", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T NSAccessibilityUnignoredDescendant(final com.apple.jobjc.ID element){
			final com.apple.jobjc.Invoke.FunCall NSAccessibilityUnignoredDescendant_FxnInst = get_NSAccessibilityUnignoredDescendant_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSAccessibilityUnignoredDescendant_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, element);
		NSAccessibilityUnignoredDescendant_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSApplicationLoad_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSApplicationLoad_FxnInst(){
		return ((NSApplicationLoad_FxnInst != null)
	? (NSApplicationLoad_FxnInst)
	: (NSApplicationLoad_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSApplicationLoad", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean NSApplicationLoad(){
			final com.apple.jobjc.Invoke.FunCall NSApplicationLoad_FxnInst = get_NSApplicationLoad_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSApplicationLoad_FxnInst.init(nativeBuffer);
		NSApplicationLoad_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSApplicationMain_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSApplicationMain_FxnInst(){
		return ((NSApplicationMain_FxnInst != null)
	? (NSApplicationMain_FxnInst)
	: (NSApplicationMain_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSApplicationMain", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public int NSApplicationMain(final int argc, final com.apple.jobjc.Pointer<com.apple.jobjc.Pointer<java.lang.Byte>> argv){
			final com.apple.jobjc.Invoke.FunCall NSApplicationMain_FxnInst = get_NSApplicationMain_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSApplicationMain_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, argc);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, argv);
		NSApplicationMain_FxnInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSAvailableWindowDepths_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSAvailableWindowDepths_FxnInst(){
		return ((NSAvailableWindowDepths_FxnInst != null)
	? (NSAvailableWindowDepths_FxnInst)
	: (NSAvailableWindowDepths_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSAvailableWindowDepths", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<java.lang.Integer> NSAvailableWindowDepths(){
			final com.apple.jobjc.Invoke.FunCall NSAvailableWindowDepths_FxnInst = get_NSAvailableWindowDepths_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSAvailableWindowDepths_FxnInst.init(nativeBuffer);
		NSAvailableWindowDepths_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<java.lang.Integer> returnValue = (com.apple.jobjc.Pointer<java.lang.Integer>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSBeep_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSBeep_FxnInst(){
		return ((NSBeep_FxnInst != null)
	? (NSBeep_FxnInst)
	: (NSBeep_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSBeep", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void NSBeep(){
			final com.apple.jobjc.Invoke.FunCall NSBeep_FxnInst = get_NSBeep_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSBeep_FxnInst.init(nativeBuffer);
		NSBeep_FxnInst.invoke(nativeBuffer);
		
		
	}

	 public void NSBeginAlertSheet(final com.apple.jobjc.foundation.NSString title, final com.apple.jobjc.foundation.NSString defaultButton, final com.apple.jobjc.foundation.NSString alternateButton, final com.apple.jobjc.foundation.NSString otherButton, final com.apple.jobjc.appkit.NSWindow docWindow, final com.apple.jobjc.ID modalDelegate, final com.apple.jobjc.SEL didEndSelector, final com.apple.jobjc.SEL didDismissSelector, final com.apple.jobjc.Pointer<Void> contextInfo, final com.apple.jobjc.foundation.NSString msgFormat, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[10 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[1] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[2] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[3] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[4] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[5] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[6] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[7] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[8] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[9] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 10; i < (10 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 10]);
final com.apple.jobjc.Invoke.FunCall NSBeginAlertSheet_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSBeginAlertSheet", com.apple.jobjc.Coder.VoidCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSBeginAlertSheet_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, alternateButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, docWindow);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, modalDelegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didEndSelector);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didDismissSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, msgFormat);
		for(int i = 10; i < (10 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 10]);
		NSBeginAlertSheet_FxnInst.invoke(nativeBuffer);
		
		
	}

	 public void NSBeginCriticalAlertSheet(final com.apple.jobjc.foundation.NSString title, final com.apple.jobjc.foundation.NSString defaultButton, final com.apple.jobjc.foundation.NSString alternateButton, final com.apple.jobjc.foundation.NSString otherButton, final com.apple.jobjc.appkit.NSWindow docWindow, final com.apple.jobjc.ID modalDelegate, final com.apple.jobjc.SEL didEndSelector, final com.apple.jobjc.SEL didDismissSelector, final com.apple.jobjc.Pointer<Void> contextInfo, final com.apple.jobjc.foundation.NSString msgFormat, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[10 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[1] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[2] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[3] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[4] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[5] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[6] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[7] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[8] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[9] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 10; i < (10 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 10]);
final com.apple.jobjc.Invoke.FunCall NSBeginCriticalAlertSheet_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSBeginCriticalAlertSheet", com.apple.jobjc.Coder.VoidCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSBeginCriticalAlertSheet_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, alternateButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, docWindow);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, modalDelegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didEndSelector);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didDismissSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, msgFormat);
		for(int i = 10; i < (10 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 10]);
		NSBeginCriticalAlertSheet_FxnInst.invoke(nativeBuffer);
		
		
	}

	 public void NSBeginInformationalAlertSheet(final com.apple.jobjc.foundation.NSString title, final com.apple.jobjc.foundation.NSString defaultButton, final com.apple.jobjc.foundation.NSString alternateButton, final com.apple.jobjc.foundation.NSString otherButton, final com.apple.jobjc.appkit.NSWindow docWindow, final com.apple.jobjc.ID modalDelegate, final com.apple.jobjc.SEL didEndSelector, final com.apple.jobjc.SEL didDismissSelector, final com.apple.jobjc.Pointer<Void> contextInfo, final com.apple.jobjc.foundation.NSString msgFormat, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[10 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[1] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[2] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[3] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[4] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[5] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[6] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[7] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[8] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[9] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 10; i < (10 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 10]);
final com.apple.jobjc.Invoke.FunCall NSBeginInformationalAlertSheet_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSBeginInformationalAlertSheet", com.apple.jobjc.Coder.VoidCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSBeginInformationalAlertSheet_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, alternateButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, docWindow);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, modalDelegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didEndSelector);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didDismissSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, msgFormat);
		for(int i = 10; i < (10 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 10]);
		NSBeginInformationalAlertSheet_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSBestDepth_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSBestDepth_FxnInst(){
		return ((NSBestDepth_FxnInst != null)
	? (NSBestDepth_FxnInst)
	: (NSBestDepth_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSBestDepth", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public int NSBestDepth(final com.apple.jobjc.foundation.NSString colorSpace, final long bps, final long bpp, final boolean planar, final com.apple.jobjc.Pointer<java.lang.Boolean> exactMatch){
			final com.apple.jobjc.Invoke.FunCall NSBestDepth_FxnInst = get_NSBestDepth_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSBestDepth_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, colorSpace);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, bps);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, bpp);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, planar);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, exactMatch);
		NSBestDepth_FxnInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSBitsPerPixelFromDepth_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSBitsPerPixelFromDepth_FxnInst(){
		return ((NSBitsPerPixelFromDepth_FxnInst != null)
	? (NSBitsPerPixelFromDepth_FxnInst)
	: (NSBitsPerPixelFromDepth_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSBitsPerPixelFromDepth", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public long NSBitsPerPixelFromDepth(final int depth){
			final com.apple.jobjc.Invoke.FunCall NSBitsPerPixelFromDepth_FxnInst = get_NSBitsPerPixelFromDepth_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSBitsPerPixelFromDepth_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, depth);
		NSBitsPerPixelFromDepth_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSBitsPerSampleFromDepth_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSBitsPerSampleFromDepth_FxnInst(){
		return ((NSBitsPerSampleFromDepth_FxnInst != null)
	? (NSBitsPerSampleFromDepth_FxnInst)
	: (NSBitsPerSampleFromDepth_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSBitsPerSampleFromDepth", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public long NSBitsPerSampleFromDepth(final int depth){
			final com.apple.jobjc.Invoke.FunCall NSBitsPerSampleFromDepth_FxnInst = get_NSBitsPerSampleFromDepth_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSBitsPerSampleFromDepth_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, depth);
		NSBitsPerSampleFromDepth_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSColorSpaceFromDepth_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSColorSpaceFromDepth_FxnInst(){
		return ((NSColorSpaceFromDepth_FxnInst != null)
	? (NSColorSpaceFromDepth_FxnInst)
	: (NSColorSpaceFromDepth_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSColorSpaceFromDepth", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSColorSpaceFromDepth(final int depth){
			final com.apple.jobjc.Invoke.FunCall NSColorSpaceFromDepth_FxnInst = get_NSColorSpaceFromDepth_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSColorSpaceFromDepth_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, depth);
		NSColorSpaceFromDepth_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSConvertGlyphsToPackedGlyphs_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSConvertGlyphsToPackedGlyphs_FxnInst(){
		return ((NSConvertGlyphsToPackedGlyphs_FxnInst != null)
	? (NSConvertGlyphsToPackedGlyphs_FxnInst)
	: (NSConvertGlyphsToPackedGlyphs_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSConvertGlyphsToPackedGlyphs", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public long NSConvertGlyphsToPackedGlyphs(final com.apple.jobjc.Pointer<java.lang.Integer> glBuf, final long count, final long packing, final com.apple.jobjc.Pointer<java.lang.Byte> packedGlyphs){
			final com.apple.jobjc.Invoke.FunCall NSConvertGlyphsToPackedGlyphs_FxnInst = get_NSConvertGlyphsToPackedGlyphs_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSConvertGlyphsToPackedGlyphs_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, glBuf);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, count);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, packing);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, packedGlyphs);
		NSConvertGlyphsToPackedGlyphs_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSCopyBits_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSCopyBits_FxnInst(){
		return ((NSCopyBits_FxnInst != null)
	? (NSCopyBits_FxnInst)
	: (NSCopyBits_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSCopyBits", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void NSCopyBits(final long srcGState, final com.apple.jobjc.foundation.NSRect srcRect, final com.apple.jobjc.foundation.NSPoint destPoint){
			final com.apple.jobjc.Invoke.FunCall NSCopyBits_FxnInst = get_NSCopyBits_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSCopyBits_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, srcGState);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, srcRect);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, destPoint);
		NSCopyBits_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSCountWindows_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSCountWindows_FxnInst(){
		return ((NSCountWindows_FxnInst != null)
	? (NSCountWindows_FxnInst)
	: (NSCountWindows_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSCountWindows", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSCountWindows(final com.apple.jobjc.Pointer<java.lang.Long> count){
			final com.apple.jobjc.Invoke.FunCall NSCountWindows_FxnInst = get_NSCountWindows_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSCountWindows_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, count);
		NSCountWindows_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSCountWindowsForContext_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSCountWindowsForContext_FxnInst(){
		return ((NSCountWindowsForContext_FxnInst != null)
	? (NSCountWindowsForContext_FxnInst)
	: (NSCountWindowsForContext_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSCountWindowsForContext", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSCountWindowsForContext(final long context, final com.apple.jobjc.Pointer<java.lang.Long> count){
			final com.apple.jobjc.Invoke.FunCall NSCountWindowsForContext_FxnInst = get_NSCountWindowsForContext_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSCountWindowsForContext_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, context);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, count);
		NSCountWindowsForContext_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSCreateFileContentsPboardType_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSCreateFileContentsPboardType_FxnInst(){
		return ((NSCreateFileContentsPboardType_FxnInst != null)
	? (NSCreateFileContentsPboardType_FxnInst)
	: (NSCreateFileContentsPboardType_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSCreateFileContentsPboardType", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSCreateFileContentsPboardType(final com.apple.jobjc.foundation.NSString fileType){
			final com.apple.jobjc.Invoke.FunCall NSCreateFileContentsPboardType_FxnInst = get_NSCreateFileContentsPboardType_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSCreateFileContentsPboardType_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileType);
		NSCreateFileContentsPboardType_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSCreateFilenamePboardType_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSCreateFilenamePboardType_FxnInst(){
		return ((NSCreateFilenamePboardType_FxnInst != null)
	? (NSCreateFilenamePboardType_FxnInst)
	: (NSCreateFilenamePboardType_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSCreateFilenamePboardType", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSCreateFilenamePboardType(final com.apple.jobjc.foundation.NSString fileType){
			final com.apple.jobjc.Invoke.FunCall NSCreateFilenamePboardType_FxnInst = get_NSCreateFilenamePboardType_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSCreateFilenamePboardType_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileType);
		NSCreateFilenamePboardType_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSDisableScreenUpdates_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDisableScreenUpdates_FxnInst(){
		return ((NSDisableScreenUpdates_FxnInst != null)
	? (NSDisableScreenUpdates_FxnInst)
	: (NSDisableScreenUpdates_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDisableScreenUpdates", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void NSDisableScreenUpdates(){
			final com.apple.jobjc.Invoke.FunCall NSDisableScreenUpdates_FxnInst = get_NSDisableScreenUpdates_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDisableScreenUpdates_FxnInst.init(nativeBuffer);
		NSDisableScreenUpdates_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSDottedFrameRect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDottedFrameRect_FxnInst(){
		return ((NSDottedFrameRect_FxnInst != null)
	? (NSDottedFrameRect_FxnInst)
	: (NSDottedFrameRect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDottedFrameRect", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void NSDottedFrameRect(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.FunCall NSDottedFrameRect_FxnInst = get_NSDottedFrameRect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDottedFrameRect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		NSDottedFrameRect_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSDrawBitmap_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDrawBitmap_FxnInst(){
		return ((NSDrawBitmap_FxnInst != null)
	? (NSDrawBitmap_FxnInst)
	: (NSDrawBitmap_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDrawBitmap", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSDrawBitmap(final com.apple.jobjc.foundation.NSRect rect, final long width, final long height, final long bps, final long spp, final long bpp, final long bpr, final boolean isPlanar, final boolean hasAlpha, final com.apple.jobjc.foundation.NSString colorSpaceName, final com.apple.jobjc.Pointer<com.apple.jobjc.Pointer<java.lang.Byte>> data){
			final com.apple.jobjc.Invoke.FunCall NSDrawBitmap_FxnInst = get_NSDrawBitmap_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDrawBitmap_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, width);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, height);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, bps);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, spp);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, bpp);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, bpr);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, isPlanar);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, hasAlpha);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, colorSpaceName);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, data);
		NSDrawBitmap_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSDrawButton_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDrawButton_FxnInst(){
		return ((NSDrawButton_FxnInst != null)
	? (NSDrawButton_FxnInst)
	: (NSDrawButton_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDrawButton", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void NSDrawButton(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.foundation.NSRect clipRect){
			final com.apple.jobjc.Invoke.FunCall NSDrawButton_FxnInst = get_NSDrawButton_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDrawButton_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, clipRect);
		NSDrawButton_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSDrawColorTiledRects_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDrawColorTiledRects_FxnInst(){
		return ((NSDrawColorTiledRects_FxnInst != null)
	? (NSDrawColorTiledRects_FxnInst)
	: (NSDrawColorTiledRects_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDrawColorTiledRects", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect NSDrawColorTiledRects(final com.apple.jobjc.foundation.NSRect boundsRect, final com.apple.jobjc.foundation.NSRect clipRect, final com.apple.jobjc.Pointer<java.lang.Long> sides, final com.apple.jobjc.Pointer<com.apple.jobjc.appkit.NSColor> colors, final long count){
			final com.apple.jobjc.Invoke.FunCall NSDrawColorTiledRects_FxnInst = get_NSDrawColorTiledRects_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDrawColorTiledRects_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, boundsRect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, clipRect);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, sides);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, colors);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, count);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		NSDrawColorTiledRects_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSDrawDarkBezel_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDrawDarkBezel_FxnInst(){
		return ((NSDrawDarkBezel_FxnInst != null)
	? (NSDrawDarkBezel_FxnInst)
	: (NSDrawDarkBezel_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDrawDarkBezel", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void NSDrawDarkBezel(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.foundation.NSRect clipRect){
			final com.apple.jobjc.Invoke.FunCall NSDrawDarkBezel_FxnInst = get_NSDrawDarkBezel_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDrawDarkBezel_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, clipRect);
		NSDrawDarkBezel_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSDrawGrayBezel_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDrawGrayBezel_FxnInst(){
		return ((NSDrawGrayBezel_FxnInst != null)
	? (NSDrawGrayBezel_FxnInst)
	: (NSDrawGrayBezel_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDrawGrayBezel", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void NSDrawGrayBezel(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.foundation.NSRect clipRect){
			final com.apple.jobjc.Invoke.FunCall NSDrawGrayBezel_FxnInst = get_NSDrawGrayBezel_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDrawGrayBezel_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, clipRect);
		NSDrawGrayBezel_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSDrawGroove_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDrawGroove_FxnInst(){
		return ((NSDrawGroove_FxnInst != null)
	? (NSDrawGroove_FxnInst)
	: (NSDrawGroove_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDrawGroove", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void NSDrawGroove(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.foundation.NSRect clipRect){
			final com.apple.jobjc.Invoke.FunCall NSDrawGroove_FxnInst = get_NSDrawGroove_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDrawGroove_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, clipRect);
		NSDrawGroove_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSDrawLightBezel_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDrawLightBezel_FxnInst(){
		return ((NSDrawLightBezel_FxnInst != null)
	? (NSDrawLightBezel_FxnInst)
	: (NSDrawLightBezel_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDrawLightBezel", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void NSDrawLightBezel(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.foundation.NSRect clipRect){
			final com.apple.jobjc.Invoke.FunCall NSDrawLightBezel_FxnInst = get_NSDrawLightBezel_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDrawLightBezel_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, clipRect);
		NSDrawLightBezel_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSDrawNinePartImage_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDrawNinePartImage_FxnInst(){
		return ((NSDrawNinePartImage_FxnInst != null)
	? (NSDrawNinePartImage_FxnInst)
	: (NSDrawNinePartImage_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDrawNinePartImage", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void NSDrawNinePartImage(final com.apple.jobjc.foundation.NSRect frame, final com.apple.jobjc.appkit.NSImage topLeftCorner, final com.apple.jobjc.appkit.NSImage topEdgeFill, final com.apple.jobjc.appkit.NSImage topRightCorner, final com.apple.jobjc.appkit.NSImage leftEdgeFill, final com.apple.jobjc.appkit.NSImage centerFill, final com.apple.jobjc.appkit.NSImage rightEdgeFill, final com.apple.jobjc.appkit.NSImage bottomLeftCorner, final com.apple.jobjc.appkit.NSImage bottomEdgeFill, final com.apple.jobjc.appkit.NSImage bottomRightCorner, final long op, final double alphaFraction, final boolean flipped){
			final com.apple.jobjc.Invoke.FunCall NSDrawNinePartImage_FxnInst = get_NSDrawNinePartImage_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDrawNinePartImage_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, topLeftCorner);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, topEdgeFill);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, topRightCorner);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, leftEdgeFill);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, centerFill);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rightEdgeFill);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bottomLeftCorner);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bottomEdgeFill);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bottomRightCorner);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, op);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, alphaFraction);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flipped);
		NSDrawNinePartImage_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSDrawThreePartImage_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDrawThreePartImage_FxnInst(){
		return ((NSDrawThreePartImage_FxnInst != null)
	? (NSDrawThreePartImage_FxnInst)
	: (NSDrawThreePartImage_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDrawThreePartImage", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void NSDrawThreePartImage(final com.apple.jobjc.foundation.NSRect frame, final com.apple.jobjc.appkit.NSImage startCap, final com.apple.jobjc.appkit.NSImage centerFill, final com.apple.jobjc.appkit.NSImage endCap, final boolean vertical, final long op, final double alphaFraction, final boolean flipped){
			final com.apple.jobjc.Invoke.FunCall NSDrawThreePartImage_FxnInst = get_NSDrawThreePartImage_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDrawThreePartImage_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, startCap);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, centerFill);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, endCap);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, vertical);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, op);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, alphaFraction);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flipped);
		NSDrawThreePartImage_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSDrawTiledRects_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDrawTiledRects_FxnInst(){
		return ((NSDrawTiledRects_FxnInst != null)
	? (NSDrawTiledRects_FxnInst)
	: (NSDrawTiledRects_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDrawTiledRects", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect NSDrawTiledRects(final com.apple.jobjc.foundation.NSRect boundsRect, final com.apple.jobjc.foundation.NSRect clipRect, final com.apple.jobjc.Pointer<java.lang.Long> sides, final com.apple.jobjc.Pointer<java.lang.Double> grays, final long count){
			final com.apple.jobjc.Invoke.FunCall NSDrawTiledRects_FxnInst = get_NSDrawTiledRects_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDrawTiledRects_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, boundsRect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, clipRect);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, sides);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, grays);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, count);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		NSDrawTiledRects_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSDrawWhiteBezel_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDrawWhiteBezel_FxnInst(){
		return ((NSDrawWhiteBezel_FxnInst != null)
	? (NSDrawWhiteBezel_FxnInst)
	: (NSDrawWhiteBezel_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDrawWhiteBezel", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void NSDrawWhiteBezel(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.foundation.NSRect clipRect){
			final com.apple.jobjc.Invoke.FunCall NSDrawWhiteBezel_FxnInst = get_NSDrawWhiteBezel_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDrawWhiteBezel_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, clipRect);
		NSDrawWhiteBezel_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSDrawWindowBackground_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSDrawWindowBackground_FxnInst(){
		return ((NSDrawWindowBackground_FxnInst != null)
	? (NSDrawWindowBackground_FxnInst)
	: (NSDrawWindowBackground_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSDrawWindowBackground", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void NSDrawWindowBackground(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.FunCall NSDrawWindowBackground_FxnInst = get_NSDrawWindowBackground_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSDrawWindowBackground_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		NSDrawWindowBackground_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSEdgeInsetsMake_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSEdgeInsetsMake_FxnInst(){
		return ((NSEdgeInsetsMake_FxnInst != null)
	? (NSEdgeInsetsMake_FxnInst)
	: (NSEdgeInsetsMake_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSEdgeInsetsMake", com.apple.jobjc.appkit.NSEdgeInsets.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSEdgeInsets NSEdgeInsetsMake(final double top, final double left, final double bottom, final double right){
			final com.apple.jobjc.Invoke.FunCall NSEdgeInsetsMake_FxnInst = get_NSEdgeInsetsMake_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSEdgeInsetsMake_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, top);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, left);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, bottom);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, right);
				com.apple.jobjc.appkit.NSEdgeInsets returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).AppKit().makeNSEdgeInsets();
		NSEdgeInsetsMake_FxnInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSEnableScreenUpdates_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSEnableScreenUpdates_FxnInst(){
		return ((NSEnableScreenUpdates_FxnInst != null)
	? (NSEnableScreenUpdates_FxnInst)
	: (NSEnableScreenUpdates_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSEnableScreenUpdates", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void NSEnableScreenUpdates(){
			final com.apple.jobjc.Invoke.FunCall NSEnableScreenUpdates_FxnInst = get_NSEnableScreenUpdates_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSEnableScreenUpdates_FxnInst.init(nativeBuffer);
		NSEnableScreenUpdates_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSEraseRect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSEraseRect_FxnInst(){
		return ((NSEraseRect_FxnInst != null)
	? (NSEraseRect_FxnInst)
	: (NSEraseRect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSEraseRect", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void NSEraseRect(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.FunCall NSEraseRect_FxnInst = get_NSEraseRect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSEraseRect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		NSEraseRect_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSEventMaskFromType_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSEventMaskFromType_FxnInst(){
		return ((NSEventMaskFromType_FxnInst != null)
	? (NSEventMaskFromType_FxnInst)
	: (NSEventMaskFromType_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSEventMaskFromType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long NSEventMaskFromType(final long type){
			final com.apple.jobjc.Invoke.FunCall NSEventMaskFromType_FxnInst = get_NSEventMaskFromType_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSEventMaskFromType_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, type);
		NSEventMaskFromType_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSFrameRect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSFrameRect_FxnInst(){
		return ((NSFrameRect_FxnInst != null)
	? (NSFrameRect_FxnInst)
	: (NSFrameRect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSFrameRect", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void NSFrameRect(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.FunCall NSFrameRect_FxnInst = get_NSFrameRect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSFrameRect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		NSFrameRect_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSFrameRectWithWidth_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSFrameRectWithWidth_FxnInst(){
		return ((NSFrameRectWithWidth_FxnInst != null)
	? (NSFrameRectWithWidth_FxnInst)
	: (NSFrameRectWithWidth_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSFrameRectWithWidth", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void NSFrameRectWithWidth(final com.apple.jobjc.foundation.NSRect aRect, final double frameWidth){
			final com.apple.jobjc.Invoke.FunCall NSFrameRectWithWidth_FxnInst = get_NSFrameRectWithWidth_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSFrameRectWithWidth_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, frameWidth);
		NSFrameRectWithWidth_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSFrameRectWithWidthUsingOperation_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSFrameRectWithWidthUsingOperation_FxnInst(){
		return ((NSFrameRectWithWidthUsingOperation_FxnInst != null)
	? (NSFrameRectWithWidthUsingOperation_FxnInst)
	: (NSFrameRectWithWidthUsingOperation_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSFrameRectWithWidthUsingOperation", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void NSFrameRectWithWidthUsingOperation(final com.apple.jobjc.foundation.NSRect aRect, final double frameWidth, final long op){
			final com.apple.jobjc.Invoke.FunCall NSFrameRectWithWidthUsingOperation_FxnInst = get_NSFrameRectWithWidthUsingOperation_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSFrameRectWithWidthUsingOperation_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, frameWidth);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, op);
		NSFrameRectWithWidthUsingOperation_FxnInst.invoke(nativeBuffer);
		
		
	}

	 public <T extends com.apple.jobjc.ID> T NSGetAlertPanel(final com.apple.jobjc.foundation.NSString title, final com.apple.jobjc.foundation.NSString msgFormat, final com.apple.jobjc.foundation.NSString defaultButton, final com.apple.jobjc.foundation.NSString alternateButton, final com.apple.jobjc.foundation.NSString otherButton, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[5 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[1] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[2] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[3] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[4] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 5; i < (5 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 5]);
final com.apple.jobjc.Invoke.FunCall NSGetAlertPanel_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSGetAlertPanel", com.apple.jobjc.Coder.IDCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSGetAlertPanel_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, msgFormat);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, alternateButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherButton);
		for(int i = 5; i < (5 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 5]);
		NSGetAlertPanel_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	 public <T extends com.apple.jobjc.ID> T NSGetCriticalAlertPanel(final com.apple.jobjc.foundation.NSString title, final com.apple.jobjc.foundation.NSString msgFormat, final com.apple.jobjc.foundation.NSString defaultButton, final com.apple.jobjc.foundation.NSString alternateButton, final com.apple.jobjc.foundation.NSString otherButton, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[5 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[1] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[2] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[3] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[4] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 5; i < (5 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 5]);
final com.apple.jobjc.Invoke.FunCall NSGetCriticalAlertPanel_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSGetCriticalAlertPanel", com.apple.jobjc.Coder.IDCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSGetCriticalAlertPanel_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, msgFormat);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, alternateButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherButton);
		for(int i = 5; i < (5 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 5]);
		NSGetCriticalAlertPanel_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSGetFileType_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSGetFileType_FxnInst(){
		return ((NSGetFileType_FxnInst != null)
	? (NSGetFileType_FxnInst)
	: (NSGetFileType_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSGetFileType", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString NSGetFileType(final com.apple.jobjc.foundation.NSString pboardType){
			final com.apple.jobjc.Invoke.FunCall NSGetFileType_FxnInst = get_NSGetFileType_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSGetFileType_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pboardType);
		NSGetFileType_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSGetFileTypes_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSGetFileTypes_FxnInst(){
		return ((NSGetFileTypes_FxnInst != null)
	? (NSGetFileTypes_FxnInst)
	: (NSGetFileTypes_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSGetFileTypes", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray NSGetFileTypes(final com.apple.jobjc.foundation.NSArray pboardTypes){
			final com.apple.jobjc.Invoke.FunCall NSGetFileTypes_FxnInst = get_NSGetFileTypes_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSGetFileTypes_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pboardTypes);
		NSGetFileTypes_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	 public <T extends com.apple.jobjc.ID> T NSGetInformationalAlertPanel(final com.apple.jobjc.foundation.NSString title, final com.apple.jobjc.foundation.NSString msgFormat, final com.apple.jobjc.foundation.NSString defaultButton, final com.apple.jobjc.foundation.NSString alternateButton, final com.apple.jobjc.foundation.NSString otherButton, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[5 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[1] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[2] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[3] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[4] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 5; i < (5 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 5]);
final com.apple.jobjc.Invoke.FunCall NSGetInformationalAlertPanel_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSGetInformationalAlertPanel", com.apple.jobjc.Coder.IDCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSGetInformationalAlertPanel_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, msgFormat);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, alternateButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherButton);
		for(int i = 5; i < (5 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 5]);
		NSGetInformationalAlertPanel_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSGetWindowServerMemory_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSGetWindowServerMemory_FxnInst(){
		return ((NSGetWindowServerMemory_FxnInst != null)
	? (NSGetWindowServerMemory_FxnInst)
	: (NSGetWindowServerMemory_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSGetWindowServerMemory", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public long NSGetWindowServerMemory(final long context, final com.apple.jobjc.Pointer<java.lang.Long> virtualMemory, final com.apple.jobjc.Pointer<java.lang.Long> windowBackingMemory, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSString> windowDumpString){
			final com.apple.jobjc.Invoke.FunCall NSGetWindowServerMemory_FxnInst = get_NSGetWindowServerMemory_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSGetWindowServerMemory_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, context);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, virtualMemory);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, windowBackingMemory);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, windowDumpString);
		NSGetWindowServerMemory_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSHighlightRect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSHighlightRect_FxnInst(){
		return ((NSHighlightRect_FxnInst != null)
	? (NSHighlightRect_FxnInst)
	: (NSHighlightRect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSHighlightRect", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void NSHighlightRect(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.FunCall NSHighlightRect_FxnInst = get_NSHighlightRect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSHighlightRect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		NSHighlightRect_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSInterfaceStyleForKey_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSInterfaceStyleForKey_FxnInst(){
		return ((NSInterfaceStyleForKey_FxnInst != null)
	? (NSInterfaceStyleForKey_FxnInst)
	: (NSInterfaceStyleForKey_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSInterfaceStyleForKey", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long NSInterfaceStyleForKey(final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.appkit.NSResponder responder){
			final com.apple.jobjc.Invoke.FunCall NSInterfaceStyleForKey_FxnInst = get_NSInterfaceStyleForKey_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSInterfaceStyleForKey_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, responder);
		NSInterfaceStyleForKey_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSIsControllerMarker_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSIsControllerMarker_FxnInst(){
		return ((NSIsControllerMarker_FxnInst != null)
	? (NSIsControllerMarker_FxnInst)
	: (NSIsControllerMarker_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSIsControllerMarker", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean NSIsControllerMarker(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.FunCall NSIsControllerMarker_FxnInst = get_NSIsControllerMarker_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSIsControllerMarker_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		NSIsControllerMarker_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSNumberOfColorComponents_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSNumberOfColorComponents_FxnInst(){
		return ((NSNumberOfColorComponents_FxnInst != null)
	? (NSNumberOfColorComponents_FxnInst)
	: (NSNumberOfColorComponents_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSNumberOfColorComponents", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long NSNumberOfColorComponents(final com.apple.jobjc.foundation.NSString colorSpaceName){
			final com.apple.jobjc.Invoke.FunCall NSNumberOfColorComponents_FxnInst = get_NSNumberOfColorComponents_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSNumberOfColorComponents_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, colorSpaceName);
		NSNumberOfColorComponents_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSOpenGLGetOption_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSOpenGLGetOption_FxnInst(){
		return ((NSOpenGLGetOption_FxnInst != null)
	? (NSOpenGLGetOption_FxnInst)
	: (NSOpenGLGetOption_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSOpenGLGetOption", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSOpenGLGetOption(final int pname, final com.apple.jobjc.Pointer<java.lang.Integer> param){
			final com.apple.jobjc.Invoke.FunCall NSOpenGLGetOption_FxnInst = get_NSOpenGLGetOption_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSOpenGLGetOption_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, pname);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, param);
		NSOpenGLGetOption_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSOpenGLGetVersion_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSOpenGLGetVersion_FxnInst(){
		return ((NSOpenGLGetVersion_FxnInst != null)
	? (NSOpenGLGetVersion_FxnInst)
	: (NSOpenGLGetVersion_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSOpenGLGetVersion", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSOpenGLGetVersion(final com.apple.jobjc.Pointer<java.lang.Integer> major, final com.apple.jobjc.Pointer<java.lang.Integer> minor){
			final com.apple.jobjc.Invoke.FunCall NSOpenGLGetVersion_FxnInst = get_NSOpenGLGetVersion_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSOpenGLGetVersion_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, major);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, minor);
		NSOpenGLGetVersion_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSOpenGLSetOption_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSOpenGLSetOption_FxnInst(){
		return ((NSOpenGLSetOption_FxnInst != null)
	? (NSOpenGLSetOption_FxnInst)
	: (NSOpenGLSetOption_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSOpenGLSetOption", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public void NSOpenGLSetOption(final int pname, final int param){
			final com.apple.jobjc.Invoke.FunCall NSOpenGLSetOption_FxnInst = get_NSOpenGLSetOption_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSOpenGLSetOption_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, pname);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, param);
		NSOpenGLSetOption_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSPerformService_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSPerformService_FxnInst(){
		return ((NSPerformService_FxnInst != null)
	? (NSPerformService_FxnInst)
	: (NSPerformService_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSPerformService", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean NSPerformService(final com.apple.jobjc.foundation.NSString itemName, final com.apple.jobjc.appkit.NSPasteboard pboard){
			final com.apple.jobjc.Invoke.FunCall NSPerformService_FxnInst = get_NSPerformService_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSPerformService_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, itemName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pboard);
		NSPerformService_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSPlanarFromDepth_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSPlanarFromDepth_FxnInst(){
		return ((NSPlanarFromDepth_FxnInst != null)
	? (NSPlanarFromDepth_FxnInst)
	: (NSPlanarFromDepth_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSPlanarFromDepth", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public boolean NSPlanarFromDepth(final int depth){
			final com.apple.jobjc.Invoke.FunCall NSPlanarFromDepth_FxnInst = get_NSPlanarFromDepth_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSPlanarFromDepth_FxnInst.init(nativeBuffer);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, depth);
		NSPlanarFromDepth_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSReadPixel_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSReadPixel_FxnInst(){
		return ((NSReadPixel_FxnInst != null)
	? (NSReadPixel_FxnInst)
	: (NSReadPixel_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSReadPixel", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.appkit.NSColor NSReadPixel(final com.apple.jobjc.foundation.NSPoint passedPoint){
			final com.apple.jobjc.Invoke.FunCall NSReadPixel_FxnInst = get_NSReadPixel_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSReadPixel_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, passedPoint);
		NSReadPixel_FxnInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSRectClip_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSRectClip_FxnInst(){
		return ((NSRectClip_FxnInst != null)
	? (NSRectClip_FxnInst)
	: (NSRectClip_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRectClip", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void NSRectClip(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.FunCall NSRectClip_FxnInst = get_NSRectClip_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRectClip_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		NSRectClip_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSRectClipList_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSRectClipList_FxnInst(){
		return ((NSRectClipList_FxnInst != null)
	? (NSRectClipList_FxnInst)
	: (NSRectClipList_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRectClipList", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void NSRectClipList(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRect> rects, final long count){
			final com.apple.jobjc.Invoke.FunCall NSRectClipList_FxnInst = get_NSRectClipList_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRectClipList_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, rects);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, count);
		NSRectClipList_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSRectFill_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSRectFill_FxnInst(){
		return ((NSRectFill_FxnInst != null)
	? (NSRectFill_FxnInst)
	: (NSRectFill_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRectFill", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void NSRectFill(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.FunCall NSRectFill_FxnInst = get_NSRectFill_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRectFill_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		NSRectFill_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSRectFillList_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSRectFillList_FxnInst(){
		return ((NSRectFillList_FxnInst != null)
	? (NSRectFillList_FxnInst)
	: (NSRectFillList_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRectFillList", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void NSRectFillList(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRect> rects, final long count){
			final com.apple.jobjc.Invoke.FunCall NSRectFillList_FxnInst = get_NSRectFillList_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRectFillList_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, rects);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, count);
		NSRectFillList_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSRectFillListUsingOperation_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSRectFillListUsingOperation_FxnInst(){
		return ((NSRectFillListUsingOperation_FxnInst != null)
	? (NSRectFillListUsingOperation_FxnInst)
	: (NSRectFillListUsingOperation_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRectFillListUsingOperation", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void NSRectFillListUsingOperation(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRect> rects, final long count, final long op){
			final com.apple.jobjc.Invoke.FunCall NSRectFillListUsingOperation_FxnInst = get_NSRectFillListUsingOperation_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRectFillListUsingOperation_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, rects);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, count);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, op);
		NSRectFillListUsingOperation_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSRectFillListWithColors_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSRectFillListWithColors_FxnInst(){
		return ((NSRectFillListWithColors_FxnInst != null)
	? (NSRectFillListWithColors_FxnInst)
	: (NSRectFillListWithColors_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRectFillListWithColors", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void NSRectFillListWithColors(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRect> rects, final com.apple.jobjc.Pointer<com.apple.jobjc.appkit.NSColor> colors, final long num){
			final com.apple.jobjc.Invoke.FunCall NSRectFillListWithColors_FxnInst = get_NSRectFillListWithColors_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRectFillListWithColors_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, rects);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, colors);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, num);
		NSRectFillListWithColors_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSRectFillListWithColorsUsingOperation_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSRectFillListWithColorsUsingOperation_FxnInst(){
		return ((NSRectFillListWithColorsUsingOperation_FxnInst != null)
	? (NSRectFillListWithColorsUsingOperation_FxnInst)
	: (NSRectFillListWithColorsUsingOperation_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRectFillListWithColorsUsingOperation", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void NSRectFillListWithColorsUsingOperation(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRect> rects, final com.apple.jobjc.Pointer<com.apple.jobjc.appkit.NSColor> colors, final long num, final long op){
			final com.apple.jobjc.Invoke.FunCall NSRectFillListWithColorsUsingOperation_FxnInst = get_NSRectFillListWithColorsUsingOperation_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRectFillListWithColorsUsingOperation_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, rects);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, colors);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, num);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, op);
		NSRectFillListWithColorsUsingOperation_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSRectFillListWithGrays_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSRectFillListWithGrays_FxnInst(){
		return ((NSRectFillListWithGrays_FxnInst != null)
	? (NSRectFillListWithGrays_FxnInst)
	: (NSRectFillListWithGrays_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRectFillListWithGrays", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void NSRectFillListWithGrays(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRect> rects, final com.apple.jobjc.Pointer<java.lang.Double> grays, final long num){
			final com.apple.jobjc.Invoke.FunCall NSRectFillListWithGrays_FxnInst = get_NSRectFillListWithGrays_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRectFillListWithGrays_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, rects);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, grays);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, num);
		NSRectFillListWithGrays_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSRectFillUsingOperation_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSRectFillUsingOperation_FxnInst(){
		return ((NSRectFillUsingOperation_FxnInst != null)
	? (NSRectFillUsingOperation_FxnInst)
	: (NSRectFillUsingOperation_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRectFillUsingOperation", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void NSRectFillUsingOperation(final com.apple.jobjc.foundation.NSRect aRect, final long op){
			final com.apple.jobjc.Invoke.FunCall NSRectFillUsingOperation_FxnInst = get_NSRectFillUsingOperation_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRectFillUsingOperation_FxnInst.init(nativeBuffer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, op);
		NSRectFillUsingOperation_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSRegisterServicesProvider_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSRegisterServicesProvider_FxnInst(){
		return ((NSRegisterServicesProvider_FxnInst != null)
	? (NSRegisterServicesProvider_FxnInst)
	: (NSRegisterServicesProvider_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRegisterServicesProvider", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void NSRegisterServicesProvider(final com.apple.jobjc.ID provider, final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.FunCall NSRegisterServicesProvider_FxnInst = get_NSRegisterServicesProvider_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRegisterServicesProvider_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, provider);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		NSRegisterServicesProvider_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSReleaseAlertPanel_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSReleaseAlertPanel_FxnInst(){
		return ((NSReleaseAlertPanel_FxnInst != null)
	? (NSReleaseAlertPanel_FxnInst)
	: (NSReleaseAlertPanel_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSReleaseAlertPanel", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void NSReleaseAlertPanel(final com.apple.jobjc.ID panel){
			final com.apple.jobjc.Invoke.FunCall NSReleaseAlertPanel_FxnInst = get_NSReleaseAlertPanel_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSReleaseAlertPanel_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, panel);
		NSReleaseAlertPanel_FxnInst.invoke(nativeBuffer);
		
		
	}

	 public long NSRunAlertPanel(final com.apple.jobjc.foundation.NSString title, final com.apple.jobjc.foundation.NSString msgFormat, final com.apple.jobjc.foundation.NSString defaultButton, final com.apple.jobjc.foundation.NSString alternateButton, final com.apple.jobjc.foundation.NSString otherButton, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[5 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[1] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[2] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[3] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[4] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 5; i < (5 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 5]);
final com.apple.jobjc.Invoke.FunCall NSRunAlertPanel_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRunAlertPanel", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRunAlertPanel_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, msgFormat);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, alternateButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherButton);
		for(int i = 5; i < (5 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 5]);
		NSRunAlertPanel_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	 public long NSRunAlertPanelRelativeToWindow(final com.apple.jobjc.foundation.NSString title, final com.apple.jobjc.foundation.NSString msgFormat, final com.apple.jobjc.foundation.NSString defaultButton, final com.apple.jobjc.foundation.NSString alternateButton, final com.apple.jobjc.foundation.NSString otherButton, final com.apple.jobjc.appkit.NSWindow docWindow, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[6 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[1] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[2] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[3] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[4] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[5] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 6; i < (6 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 6]);
final com.apple.jobjc.Invoke.FunCall NSRunAlertPanelRelativeToWindow_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRunAlertPanelRelativeToWindow", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRunAlertPanelRelativeToWindow_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, msgFormat);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, alternateButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, docWindow);
		for(int i = 6; i < (6 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 6]);
		NSRunAlertPanelRelativeToWindow_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	 public long NSRunCriticalAlertPanel(final com.apple.jobjc.foundation.NSString title, final com.apple.jobjc.foundation.NSString msgFormat, final com.apple.jobjc.foundation.NSString defaultButton, final com.apple.jobjc.foundation.NSString alternateButton, final com.apple.jobjc.foundation.NSString otherButton, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[5 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[1] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[2] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[3] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[4] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 5; i < (5 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 5]);
final com.apple.jobjc.Invoke.FunCall NSRunCriticalAlertPanel_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRunCriticalAlertPanel", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRunCriticalAlertPanel_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, msgFormat);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, alternateButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherButton);
		for(int i = 5; i < (5 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 5]);
		NSRunCriticalAlertPanel_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	 public long NSRunCriticalAlertPanelRelativeToWindow(final com.apple.jobjc.foundation.NSString title, final com.apple.jobjc.foundation.NSString msgFormat, final com.apple.jobjc.foundation.NSString defaultButton, final com.apple.jobjc.foundation.NSString alternateButton, final com.apple.jobjc.foundation.NSString otherButton, final com.apple.jobjc.appkit.NSWindow docWindow, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[6 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[1] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[2] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[3] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[4] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[5] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 6; i < (6 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 6]);
final com.apple.jobjc.Invoke.FunCall NSRunCriticalAlertPanelRelativeToWindow_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRunCriticalAlertPanelRelativeToWindow", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRunCriticalAlertPanelRelativeToWindow_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, msgFormat);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, alternateButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, docWindow);
		for(int i = 6; i < (6 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 6]);
		NSRunCriticalAlertPanelRelativeToWindow_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	 public long NSRunInformationalAlertPanel(final com.apple.jobjc.foundation.NSString title, final com.apple.jobjc.foundation.NSString msgFormat, final com.apple.jobjc.foundation.NSString defaultButton, final com.apple.jobjc.foundation.NSString alternateButton, final com.apple.jobjc.foundation.NSString otherButton, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[5 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[1] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[2] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[3] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[4] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 5; i < (5 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 5]);
final com.apple.jobjc.Invoke.FunCall NSRunInformationalAlertPanel_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRunInformationalAlertPanel", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRunInformationalAlertPanel_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, msgFormat);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, alternateButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherButton);
		for(int i = 5; i < (5 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 5]);
		NSRunInformationalAlertPanel_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	 public long NSRunInformationalAlertPanelRelativeToWindow(final com.apple.jobjc.foundation.NSString title, final com.apple.jobjc.foundation.NSString msgFormat, final com.apple.jobjc.foundation.NSString defaultButton, final com.apple.jobjc.foundation.NSString alternateButton, final com.apple.jobjc.foundation.NSString otherButton, final com.apple.jobjc.appkit.NSWindow docWindow, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[6 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[1] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[2] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[3] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[4] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[5] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 6; i < (6 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 6]);
final com.apple.jobjc.Invoke.FunCall NSRunInformationalAlertPanelRelativeToWindow_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSRunInformationalAlertPanelRelativeToWindow", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSRunInformationalAlertPanelRelativeToWindow_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, msgFormat);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, alternateButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, docWindow);
		for(int i = 6; i < (6 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 6]);
		NSRunInformationalAlertPanelRelativeToWindow_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSSetFocusRingStyle_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSetFocusRingStyle_FxnInst(){
		return ((NSSetFocusRingStyle_FxnInst != null)
	? (NSSetFocusRingStyle_FxnInst)
	: (NSSetFocusRingStyle_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSetFocusRingStyle", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void NSSetFocusRingStyle(final long placement){
			final com.apple.jobjc.Invoke.FunCall NSSetFocusRingStyle_FxnInst = get_NSSetFocusRingStyle_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSetFocusRingStyle_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, placement);
		NSSetFocusRingStyle_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSSetShowsServicesMenuItem_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSSetShowsServicesMenuItem_FxnInst(){
		return ((NSSetShowsServicesMenuItem_FxnInst != null)
	? (NSSetShowsServicesMenuItem_FxnInst)
	: (NSSetShowsServicesMenuItem_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSSetShowsServicesMenuItem", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public long NSSetShowsServicesMenuItem(final com.apple.jobjc.foundation.NSString itemName, final boolean enabled){
			final com.apple.jobjc.Invoke.FunCall NSSetShowsServicesMenuItem_FxnInst = get_NSSetShowsServicesMenuItem_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSSetShowsServicesMenuItem_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, itemName);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, enabled);
		NSSetShowsServicesMenuItem_FxnInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSShowAnimationEffect_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSShowAnimationEffect_FxnInst(){
		return ((NSShowAnimationEffect_FxnInst != null)
	? (NSShowAnimationEffect_FxnInst)
	: (NSShowAnimationEffect_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSShowAnimationEffect", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSShowAnimationEffect(final long animationEffect, final com.apple.jobjc.foundation.NSPoint centerLocation, final com.apple.jobjc.foundation.NSSize size, final com.apple.jobjc.ID animationDelegate, final com.apple.jobjc.SEL didEndSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.FunCall NSShowAnimationEffect_FxnInst = get_NSShowAnimationEffect_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSShowAnimationEffect_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, animationEffect);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, centerLocation);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, animationDelegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didEndSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		NSShowAnimationEffect_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSShowsServicesMenuItem_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSShowsServicesMenuItem_FxnInst(){
		return ((NSShowsServicesMenuItem_FxnInst != null)
	? (NSShowsServicesMenuItem_FxnInst)
	: (NSShowsServicesMenuItem_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSShowsServicesMenuItem", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean NSShowsServicesMenuItem(final com.apple.jobjc.foundation.NSString itemName){
			final com.apple.jobjc.Invoke.FunCall NSShowsServicesMenuItem_FxnInst = get_NSShowsServicesMenuItem_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSShowsServicesMenuItem_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, itemName);
		NSShowsServicesMenuItem_FxnInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.FunCall NSUnregisterServicesProvider_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSUnregisterServicesProvider_FxnInst(){
		return ((NSUnregisterServicesProvider_FxnInst != null)
	? (NSUnregisterServicesProvider_FxnInst)
	: (NSUnregisterServicesProvider_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSUnregisterServicesProvider", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void NSUnregisterServicesProvider(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.FunCall NSUnregisterServicesProvider_FxnInst = get_NSUnregisterServicesProvider_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSUnregisterServicesProvider_FxnInst.init(nativeBuffer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		NSUnregisterServicesProvider_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSUpdateDynamicServices_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSUpdateDynamicServices_FxnInst(){
		return ((NSUpdateDynamicServices_FxnInst != null)
	? (NSUpdateDynamicServices_FxnInst)
	: (NSUpdateDynamicServices_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSUpdateDynamicServices", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void NSUpdateDynamicServices(){
			final com.apple.jobjc.Invoke.FunCall NSUpdateDynamicServices_FxnInst = get_NSUpdateDynamicServices_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSUpdateDynamicServices_FxnInst.init(nativeBuffer);
		NSUpdateDynamicServices_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSWindowList_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSWindowList_FxnInst(){
		return ((NSWindowList_FxnInst != null)
	? (NSWindowList_FxnInst)
	: (NSWindowList_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSWindowList", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSWindowList(final long size, final com.apple.jobjc.Pointer<java.lang.Long> list){
			final com.apple.jobjc.Invoke.FunCall NSWindowList_FxnInst = get_NSWindowList_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSWindowList_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, size);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, list);
		NSWindowList_FxnInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.FunCall NSWindowListForContext_FxnInst;
	 final private com.apple.jobjc.Invoke.FunCall get_NSWindowListForContext_FxnInst(){
		return ((NSWindowListForContext_FxnInst != null)
	? (NSWindowListForContext_FxnInst)
	: (NSWindowListForContext_FxnInst = new com.apple.jobjc.Invoke.FunCall(this, "NSWindowListForContext", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void NSWindowListForContext(final long context, final long size, final com.apple.jobjc.Pointer<java.lang.Long> list){
			final com.apple.jobjc.Invoke.FunCall NSWindowListForContext_FxnInst = get_NSWindowListForContext_FxnInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		NSWindowListForContext_FxnInst.init(nativeBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, context);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, size);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, list);
		NSWindowListForContext_FxnInst.invoke(nativeBuffer);
		
		
	}

}
