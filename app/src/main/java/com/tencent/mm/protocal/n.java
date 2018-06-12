package com.tencent.mm.protocal;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class n
{
  public String host = "";
  public String kCs = "";
  private int port = 80;
  private int type = 0;
  
  public n() {}
  
  public n(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    this.type = paramInt1;
    this.kCs = paramString1;
    this.port = paramInt2;
    this.host = paramString2;
  }
  
  private static n Uy(String paramString)
  {
    paramString = paramString.split(",");
    if (paramString.length < 4) {
      return null;
    }
    n localn = new n();
    try
    {
      localn.type = bi.getInt(paramString[0], 0);
      localn.kCs = bi.oV(paramString[1]);
      localn.port = bi.getInt(paramString[2], 0);
      localn.host = bi.oV(paramString[3]);
      return localn;
    }
    catch (NumberFormatException paramString)
    {
      x.e("MicroMsg.MMBuiltInIP", "exception:%s", new Object[] { bi.i(paramString) });
    }
    return null;
  }
  
  public static List<n> Uz(String paramString)
  {
    localLinkedList = new LinkedList();
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return localLinkedList;
      try
      {
        String[] arrayOfString = paramString.split("\\|");
        int j = arrayOfString.length;
        int i = 0;
        while (i < j)
        {
          n localn = Uy(arrayOfString[i]);
          if (localn != null) {
            localLinkedList.add(localn);
          }
          i += 1;
        }
        return localLinkedList;
      }
      catch (Exception localException)
      {
        x.d("MicroMsg.MMBuiltInIP", "unserialize split failed str[%s]", new Object[] { paramString });
        x.e("MicroMsg.MMBuiltInIP", "exception:%s", new Object[] { bi.i(localException) });
      }
    }
  }
  
  public static String cV(List<n> paramList)
  {
    Iterator localIterator = paramList.iterator();
    n localn;
    for (paramList = ""; localIterator.hasNext(); paramList = paramList + localn.toString() + "|") {
      localn = (n)localIterator.next();
    }
    return paramList;
  }
  
  public static a fJ(String paramString1, String paramString2)
  {
    x.d("MicroMsg.MMBuiltInIP", "parsing network control params:");
    x.d("MicroMsg.MMBuiltInIP", "ports = " + paramString1);
    x.d("MicroMsg.MMBuiltInIP", "timeouts = " + paramString2);
    int[] arrayOfInt = bi.WQ(paramString1);
    paramString2 = bi.WQ(paramString2);
    if (paramString2 != null)
    {
      paramString1 = paramString2;
      if (paramString2.length >= 2) {}
    }
    else
    {
      paramString1 = new int[2];
      paramString1[0] = 0;
      paramString1[1] = 0;
      paramString1;
      x.e("MicroMsg.MMBuiltInIP", "invalid timeouts");
    }
    return new a(arrayOfInt, (int)(paramString1[0] * 1000L), (int)(paramString1[1] * 1000L));
  }
  
  public final String toString()
  {
    return this.type + "," + this.kCs + "," + this.port + "," + this.host;
  }
  
  public static final class a
  {
    public final int[] qWI = null;
    public final int[] qWJ;
    public final int qWK;
    public final int qWL;
    
    public a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
    {
      this.qWJ = paramArrayOfInt;
      this.qWK = paramInt1;
      this.qWL = paramInt2;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */