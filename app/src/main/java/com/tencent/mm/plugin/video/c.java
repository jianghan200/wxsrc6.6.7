package com.tencent.mm.plugin.video;

import com.tencent.mm.sdk.platformtools.bi;
import java.math.BigInteger;

public final class c
{
  public static String OC(String paramString)
  {
    if (bi.oW(paramString)) {
      return "";
    }
    return new BigInteger(Long.toBinaryString(bi.getLong(paramString, 0L)), 2).toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/video/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */