package com.tencent.tinker.loader.hotplug;

import java.util.HashMap;
import java.util.Map;

public class ActivityStubManager
{
  private static Map<String, String> vtJ = new HashMap();
  private static final int[] vtK = { 10, 3 };
  private static final int[] vtL = { 10, 3 };
  private static final int[] vtM = { 10, 3 };
  private static final int[] vtN = { 10, 3 };
  private static final int[] vtO = { 0, 0 };
  private static final int[] vtP = { 0, 0 };
  private static final int[] vtQ = { 0, 0 };
  private static final int[] vtR = { 0, 0 };
  
  private ActivityStubManager()
  {
    throw new UnsupportedOperationException();
  }
  
  public static String r(String paramString, int paramInt, boolean paramBoolean)
  {
    String str = (String)vtJ.get(paramString);
    if (str != null) {
      return str;
    }
    int[] arrayOfInt2;
    int[] arrayOfInt1;
    label91:
    int i;
    switch (paramInt)
    {
    default: 
      str = ActivityStubs.vtT;
      arrayOfInt2 = vtO;
      arrayOfInt1 = vtK;
      if (paramBoolean)
      {
        str = str + "_T";
        paramInt = 1;
        i = arrayOfInt2[paramInt];
        arrayOfInt2[paramInt] = (i + 1);
        if (i < arrayOfInt1[paramInt]) {
          break label210;
        }
        arrayOfInt2[paramInt] = 0;
      }
      break;
    }
    label210:
    for (paramInt = 0;; paramInt = i)
    {
      str = String.format(str, new Object[] { Integer.valueOf(paramInt) });
      vtJ.put(paramString, str);
      return str;
      str = ActivityStubs.vtU;
      arrayOfInt2 = vtP;
      arrayOfInt1 = vtL;
      break;
      str = ActivityStubs.vtV;
      arrayOfInt2 = vtQ;
      arrayOfInt1 = vtM;
      break;
      str = ActivityStubs.vtW;
      arrayOfInt2 = vtR;
      arrayOfInt1 = vtN;
      break;
      paramInt = 0;
      break label91;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tinker/loader/hotplug/ActivityStubManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */