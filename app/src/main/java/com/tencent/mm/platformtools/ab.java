package com.tencent.mm.platformtools;

import com.tencent.mm.bk.b;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;

public final class ab
{
  public static bhy O(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    bhy localbhy = new bhy();
    localbhy.bq(paramArrayOfByte);
    return localbhy;
  }
  
  public static String a(b paramb)
  {
    if (paramb == null) {
      return null;
    }
    return paramb.cfV();
  }
  
  public static String a(bhz parambhz)
  {
    if (parambhz == null) {
      return null;
    }
    return parambhz.siM;
  }
  
  public static byte[] a(bhy parambhy)
  {
    if ((parambhy == null) || (parambhy.siK == null)) {
      return null;
    }
    return parambhy.siK.toByteArray();
  }
  
  public static byte[] a(bhy parambhy, byte[] paramArrayOfByte)
  {
    if ((parambhy == null) || (parambhy.siK == null)) {
      return paramArrayOfByte;
    }
    return parambhy.siK.toByteArray();
  }
  
  public static String b(bhy parambhy)
  {
    if ((parambhy == null) || (parambhy.siK == null)) {
      return null;
    }
    return parambhy.siK.cfV();
  }
  
  public static bhz oT(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    bhz localbhz = new bhz();
    localbhz.VO(paramString);
    return localbhz;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/platformtools/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */