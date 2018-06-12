package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;
import java.util.List;

public class nd
{
  private List<String> a = new ArrayList();
  private List<String> b = new ArrayList();
  private final int c = 300;
  
  private void a(List<String> paramList)
  {
    if (paramList == null) {}
    while (paramList.size() <= 300) {
      return;
    }
    paramList.remove(0);
  }
  
  /* Error */
  public boolean a(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aload_0
    //   4: monitorenter
    //   5: iload 4
    //   7: istore_3
    //   8: aload_1
    //   9: ifnull +18 -> 27
    //   12: aload_1
    //   13: invokevirtual 44	java/lang/String:trim	()Ljava/lang/String;
    //   16: invokevirtual 47	java/lang/String:length	()I
    //   19: istore_2
    //   20: iload_2
    //   21: ifne +10 -> 31
    //   24: iload 4
    //   26: istore_3
    //   27: aload_0
    //   28: monitorexit
    //   29: iload_3
    //   30: ireturn
    //   31: aload_0
    //   32: getfield 21	com/tencent/tencentmap/mapsdk/a/nd:b	Ljava/util/List;
    //   35: aload_1
    //   36: invokeinterface 51 2 0
    //   41: istore 5
    //   43: iload 4
    //   45: istore_3
    //   46: iload 5
    //   48: ifne -21 -> 27
    //   51: iconst_1
    //   52: istore_3
    //   53: goto -26 -> 27
    //   56: astore_1
    //   57: aload_0
    //   58: monitorexit
    //   59: aload_1
    //   60: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	this	nd
    //   0	61	1	paramString	String
    //   19	2	2	i	int
    //   7	46	3	bool1	boolean
    //   1	43	4	bool2	boolean
    //   41	6	5	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   12	20	56	finally
    //   31	43	56	finally
  }
  
  public void b(String paramString)
  {
    if (paramString != null) {}
    for (;;)
    {
      try
      {
        int i = paramString.trim().length();
        if (i == 0) {
          return;
        }
        if (this.b.contains(paramString))
        {
          this.b.remove(paramString);
          this.b.add(paramString);
          continue;
        }
        if (!this.a.contains(paramString)) {
          break label110;
        }
      }
      finally {}
      a(this.b);
      this.b.add(paramString);
      this.a.remove(paramString);
      continue;
      label110:
      a(this.a);
      this.a.add(paramString);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/nd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */