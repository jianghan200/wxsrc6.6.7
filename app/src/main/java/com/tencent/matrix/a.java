package com.tencent.matrix;

import android.app.Application;
import com.tencent.matrix.b.c;
import com.tencent.matrix.d.b.a;
import java.util.HashSet;
import java.util.Iterator;

public class a
{
  private static volatile a boS;
  private final Application application;
  public final HashSet<com.tencent.matrix.b.b> boT;
  private final c boU;
  
  private a(Application paramApplication, c paramc, HashSet<com.tencent.matrix.b.b> paramHashSet)
  {
    this.application = paramApplication;
    this.boU = paramc;
    this.boT = paramHashSet;
    paramApplication = paramHashSet.iterator();
    while (paramApplication.hasNext())
    {
      paramc = (com.tencent.matrix.b.b)paramApplication.next();
      paramc.a(this.application, this.boU);
      this.boU.b(paramc);
    }
  }
  
  /* Error */
  public static a a(a parama)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 63	com/tencent/matrix/a:boS	Lcom/tencent/matrix/a;
    //   6: ifnonnull +14 -> 20
    //   9: aload_0
    //   10: putstatic 63	com/tencent/matrix/a:boS	Lcom/tencent/matrix/a;
    //   13: ldc 2
    //   15: monitorexit
    //   16: getstatic 63	com/tencent/matrix/a:boS	Lcom/tencent/matrix/a;
    //   19: areturn
    //   20: ldc 65
    //   22: ldc 67
    //   24: iconst_0
    //   25: anewarray 4	java/lang/Object
    //   28: invokestatic 73	com/tencent/matrix/d/b:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   31: goto -18 -> 13
    //   34: astore_0
    //   35: ldc 2
    //   37: monitorexit
    //   38: aload_0
    //   39: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	parama	a
    // Exception table:
    //   from	to	target	type
    //   3	13	34	finally
    //   13	16	34	finally
    //   20	31	34	finally
    //   35	38	34	finally
  }
  
  public static void a(b.a parama)
  {
    com.tencent.matrix.d.b.b(parama);
  }
  
  public static boolean isInstalled()
  {
    return boS != null;
  }
  
  public static a tg()
  {
    if (boS == null) {
      throw new RuntimeException("you must init Matrix sdk first");
    }
    return boS;
  }
  
  public final <T extends com.tencent.matrix.b.b> T g(Class<T> paramClass)
  {
    paramClass = paramClass.getName();
    Iterator localIterator = this.boT.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.matrix.b.b localb = (com.tencent.matrix.b.b)localIterator.next();
      if (localb.getClass().getName().equals(paramClass)) {
        return localb;
      }
    }
    return null;
  }
  
  public static final class a
  {
    public final Application application;
    public HashSet<com.tencent.matrix.b.b> boT;
    public c boU;
    
    public a(Application paramApplication)
    {
      if (paramApplication == null) {
        throw new RuntimeException("matrix init, application is null");
      }
      this.application = paramApplication;
    }
    
    public final a a(com.tencent.matrix.b.b paramb)
    {
      if (this.boT == null) {
        this.boT = new HashSet();
      }
      String str = paramb.getTag();
      Iterator localIterator = this.boT.iterator();
      while (localIterator.hasNext()) {
        if (str.equals(((com.tencent.matrix.b.b)localIterator.next()).getTag())) {
          throw new RuntimeException(String.format("plugin with tag %s is already exist", new Object[] { str }));
        }
      }
      this.boT.add(paramb);
      return this;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */