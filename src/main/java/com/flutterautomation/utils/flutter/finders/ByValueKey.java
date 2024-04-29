package com.flutterautomation.utils.flutter.finders;

import com.flutterautomation.utils.flutter.FlutterElement;

/**
 * To identify the element using Value key
 *
 * @author ashwith
 * @version 1.0.0
 */
public interface ByValueKey {


    FlutterElement byValueKey(String key);

    FlutterElement byValueKey(int key);
}