package com.tencent.matrix.resource.c.a;

import java.util.HashMap;
import java.util.Map;

public enum c
{
  private static Map<Integer, c> bsn;
  private int fi;
  private int mId;
  
  static
  {
    int i = 0;
    bse = new c("OBJECT", 0, 2, 0);
    bsf = new c("BOOLEAN", 1, 4, 1);
    bsg = new c("CHAR", 2, 5, 2);
    bsh = new c("FLOAT", 3, 6, 4);
    bsi = new c("DOUBLE", 4, 7, 8);
    bsj = new c("BYTE", 5, 8, 1);
    bsk = new c("SHORT", 6, 9, 2);
    bsl = new c("INT", 7, 10, 4);
    bsm = new c("LONG", 8, 11, 8);
    bso = new c[] { bse, bsf, bsg, bsh, bsi, bsj, bsk, bsl, bsm };
    bsn = new HashMap();
    c[] arrayOfc = values();
    int j = arrayOfc.length;
    while (i < j)
    {
      c localc = arrayOfc[i];
      bsn.put(Integer.valueOf(localc.mId), localc);
      i += 1;
    }
  }
  
  private c(int paramInt1, int paramInt2)
  {
    this.mId = paramInt1;
    this.fi = paramInt2;
  }
  
  public static c en(int paramInt)
  {
    return (c)bsn.get(Integer.valueOf(paramInt));
  }
  
  public final int getSize(int paramInt)
  {
    if (this.fi != 0) {
      paramInt = this.fi;
    }
    return paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/resource/c/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */