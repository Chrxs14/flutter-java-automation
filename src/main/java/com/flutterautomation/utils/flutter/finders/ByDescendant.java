package com.flutterautomation.utils.flutter.finders;
import com.flutterautomation.utils.flutter.FlutterElement;

/**
 * To identify the element using Descendant
 *
 * @author ashwith
 * @version 1.0.0
 */
public interface ByDescendant {

    FlutterElement byDescendant(FlutterElement of, FlutterElement matching, boolean matchRoot, boolean firstMatchOnly);

}