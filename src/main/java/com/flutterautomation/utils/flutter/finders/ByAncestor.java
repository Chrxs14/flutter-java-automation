package com.flutterautomation.utils.flutter.finders;

import com.flutterautomation.utils.flutter.FlutterElement;

/**
 * To identify the element using Ancestor
 *
 * @author ashwith
 * @version 1.0.0
 */
public interface ByAncestor {

    FlutterElement byAncestor(FlutterElement of, FlutterElement matching, boolean matchRoot, boolean firstMatchOnly);
}
