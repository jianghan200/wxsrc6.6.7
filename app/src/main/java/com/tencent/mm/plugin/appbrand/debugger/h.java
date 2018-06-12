package com.tencent.mm.plugin.appbrand.debugger;

import android.util.Pair;
import android.webkit.ValueCallback;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.protocal.c.cay;
import com.tencent.mm.protocal.c.cbe;
import com.tencent.mm.protocal.c.cbl;
import com.tencent.mm.protocal.c.cbq;
import com.tencent.mm.protocal.d;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class h
{
  private int fsA = 0;
  cbq fsB;
  i fsC;
  AtomicInteger fsD = new AtomicInteger(0);
  long fsE = 0L;
  long fsF = 0L;
  long fsG;
  long fsH = System.currentTimeMillis();
  AtomicInteger fsI = new AtomicInteger(0);
  private boolean fsJ;
  private boolean fsK;
  final HashMap<String, Method> fsL = new HashMap();
  final HashMap<String, cbl> fsM = new HashMap();
  LinkedList<Pair<String, ValueCallback<String>>> fsN = new LinkedList();
  final LinkedList<k> fsO = new LinkedList();
  final Map<String, g> fsP = new HashMap();
  final LinkedList<cbe> fsQ = new LinkedList();
  final HashMap<Integer, a> fsR = new HashMap();
  int fsS = 0;
  long fsT = 0L;
  l fsw;
  final cay fsx = new cay();
  private String fsy;
  private int fsz = 0;
  final Object mLock = new Object();
  private int mStatus = 0;
  
  public h()
  {
    this.fsx.rlO = d.qVN;
  }
  
  public final String aeu()
  {
    try
    {
      String str = this.fsy;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int aev()
  {
    try
    {
      int i = this.fsz;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int aew()
  {
    try
    {
      int i = this.fsA;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean aex()
  {
    try
    {
      boolean bool = this.fsK;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean aey()
  {
    return getStatus() == 4;
  }
  
  public final boolean aez()
  {
    return this.fsC.fsY == 3;
  }
  
  public final void bE(int paramInt1, int paramInt2)
  {
    try
    {
      if ((this.fsA >= paramInt1) && (this.fsA <= paramInt2)) {
        this.fsA = paramInt2;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void cA(boolean paramBoolean)
  {
    try
    {
      this.fsK = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void cz(boolean paramBoolean)
  {
    try
    {
      this.fsJ = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int getStatus()
  {
    try
    {
      int i = this.mStatus;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final boolean hv()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 136	com/tencent/mm/plugin/appbrand/debugger/h:getStatus	()I
    //   6: istore_1
    //   7: iload_1
    //   8: iconst_3
    //   9: if_icmpne +9 -> 18
    //   12: iconst_1
    //   13: istore_2
    //   14: aload_0
    //   15: monitorexit
    //   16: iload_2
    //   17: ireturn
    //   18: iconst_0
    //   19: istore_2
    //   20: goto -6 -> 14
    //   23: astore_3
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_3
    //   27: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	28	0	this	h
    //   6	4	1	i	int
    //   13	7	2	bool	boolean
    //   23	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	23	finally
  }
  
  public final boolean isBusy()
  {
    try
    {
      boolean bool = this.fsJ;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void jX(int paramInt)
  {
    try
    {
      this.fsz = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void jY(int paramInt)
  {
    try
    {
      if (this.fsA < paramInt) {
        this.fsA = paramInt;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void setStatus(int paramInt)
  {
    try
    {
      this.mStatus = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void sk(String paramString)
  {
    try
    {
      this.fsy = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/debugger/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */