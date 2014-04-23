package com.oculusvr.api;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : OVR_CAPI.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ovrSensorState_ extends Structure {
  /**
   * readings by comparing ovrPoseState.TimeInSeconds.<br>
   * C type : ovrPoseStatef
   */
  public ovrPoseStatef_ Predicted;
  /**
   * moment closest to the requested time.<br>
   * C type : ovrPoseStatef
   */
  public ovrPoseStatef_ Recorded;
  /** Sensor temperature reading, in degrees Celsius, as sample time. */
  public float Temperature;
  /** Sensor status described by ovrStatusBits. */
  public int StatusFlags;
  public ovrSensorState_() {
    super();
  }
  protected List<? > getFieldOrder() {
    return Arrays.asList("Predicted", "Recorded", "Temperature", "StatusFlags");
  }
  /**
   * @param Predicted readings by comparing ovrPoseState.TimeInSeconds.<br>
   * C type : ovrPoseStatef<br>
   * @param Recorded moment closest to the requested time.<br>
   * C type : ovrPoseStatef<br>
   * @param Temperature Sensor temperature reading, in degrees Celsius, as sample time.<br>
   * @param StatusFlags Sensor status described by ovrStatusBits.
   */
  public ovrSensorState_(ovrPoseStatef_ Predicted, ovrPoseStatef_ Recorded, float Temperature, int StatusFlags) {
    super();
    this.Predicted = Predicted;
    this.Recorded = Recorded;
    this.Temperature = Temperature;
    this.StatusFlags = StatusFlags;
  }
  public static class ByReference extends ovrSensorState_ implements Structure.ByReference {
    
  };
  public static class ByValue extends ovrSensorState_ implements Structure.ByValue {
    
  };
}