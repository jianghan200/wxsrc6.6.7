package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan;

import java.util.Arrays;

final class d
{
  static boolean deepEquals(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == null) || (paramObject2 == null)) {
      return paramObject1 == paramObject2;
    }
    if (((paramObject1 instanceof Object[])) && ((paramObject2 instanceof Object[]))) {
      return Arrays.deepEquals((Object[])paramObject1, (Object[])paramObject2);
    }
    if (((paramObject1 instanceof boolean[])) && ((paramObject2 instanceof boolean[]))) {
      return Arrays.equals((boolean[])paramObject1, (boolean[])paramObject2);
    }
    if (((paramObject1 instanceof byte[])) && ((paramObject2 instanceof byte[]))) {
      return Arrays.equals((byte[])paramObject1, (byte[])paramObject2);
    }
    if (((paramObject1 instanceof char[])) && ((paramObject2 instanceof char[]))) {
      return Arrays.equals((char[])paramObject1, (char[])paramObject2);
    }
    if (((paramObject1 instanceof double[])) && ((paramObject2 instanceof double[]))) {
      return Arrays.equals((double[])paramObject1, (double[])paramObject2);
    }
    if (((paramObject1 instanceof float[])) && ((paramObject2 instanceof float[]))) {
      return Arrays.equals((float[])paramObject1, (float[])paramObject2);
    }
    if (((paramObject1 instanceof int[])) && ((paramObject2 instanceof int[]))) {
      return Arrays.equals((int[])paramObject1, (int[])paramObject2);
    }
    if (((paramObject1 instanceof long[])) && ((paramObject2 instanceof long[]))) {
      return Arrays.equals((long[])paramObject1, (long[])paramObject2);
    }
    if (((paramObject1 instanceof short[])) && ((paramObject2 instanceof short[]))) {
      return Arrays.equals((short[])paramObject1, (short[])paramObject2);
    }
    return paramObject1.equals(paramObject2);
  }
  
  static boolean equals(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      return paramObject2 == null;
    }
    return paramObject1.equals(paramObject2);
  }
  
  static String toString(Object paramObject)
  {
    if (paramObject == null) {
      return "null";
    }
    return paramObject.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/scan/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */