package com.flutterautomation.utils.flutter.finders;

import com.flutterautomation.utils.flutter.FlutterElement;

import java.util.regex.Pattern;

/**
 * To identify the element using SemanticsLabel
 * @author ashwith
 * @version 1.0.0
 */
public interface BySemanticsLabel {

    FlutterElement bySemanticsLabel(String label);

    FlutterElement bySemanticsLabel(Pattern label);
}
