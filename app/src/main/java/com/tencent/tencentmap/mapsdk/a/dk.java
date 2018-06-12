package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class dk
  implements dh
{
  private boolean a = false;
  private List<di> b;
  private Context c;
  private Runnable d = new Runnable()
  {
    public final void run()
    {
      try
      {
        dk.this.a();
        return;
      }
      catch (Throwable localThrowable)
      {
        ct.a(localThrowable);
      }
    }
  };
  private Runnable e = new dk.2(this);
  
  public dk(Context paramContext)
  {
    this.c = paramContext;
    this.b = Collections.synchronizedList(new ArrayList(25));
  }
  
  /* Error */
  private List<di> b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 52	com/tencent/tencentmap/mapsdk/a/dk:b	Ljava/util/List;
    //   6: ifnull +24 -> 30
    //   9: aload_0
    //   10: getfield 52	com/tencent/tencentmap/mapsdk/a/dk:b	Ljava/util/List;
    //   13: invokeinterface 62 1 0
    //   18: ifle +12 -> 30
    //   21: aload_0
    //   22: invokespecial 65	com/tencent/tencentmap/mapsdk/a/dk:c	()Z
    //   25: istore_1
    //   26: iload_1
    //   27: ifne +9 -> 36
    //   30: aconst_null
    //   31: astore_2
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_2
    //   35: areturn
    //   36: new 41	java/util/ArrayList
    //   39: dup
    //   40: invokespecial 66	java/util/ArrayList:<init>	()V
    //   43: astore_2
    //   44: aload_2
    //   45: aload_0
    //   46: getfield 52	com/tencent/tencentmap/mapsdk/a/dk:b	Ljava/util/List;
    //   49: invokeinterface 70 2 0
    //   54: pop
    //   55: aload_0
    //   56: getfield 52	com/tencent/tencentmap/mapsdk/a/dk:b	Ljava/util/List;
    //   59: invokeinterface 73 1 0
    //   64: new 75	java/lang/StringBuilder
    //   67: dup
    //   68: ldc 77
    //   70: invokespecial 80	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   73: aload_2
    //   74: invokeinterface 62 1 0
    //   79: invokevirtual 84	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   82: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   85: iconst_0
    //   86: anewarray 4	java/lang/Object
    //   89: invokestatic 93	com/tencent/tencentmap/mapsdk/a/ct:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   92: goto -60 -> 32
    //   95: astore_2
    //   96: aload_0
    //   97: monitorexit
    //   98: aload_2
    //   99: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	this	dk
    //   25	2	1	bool	boolean
    //   31	43	2	localObject1	Object
    //   95	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	26	95	finally
    //   36	92	95	finally
  }
  
  private boolean c()
  {
    try
    {
      boolean bool = this.a;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void d()
  {
    List localList = b();
    if ((localList != null) && (localList.size() > 0))
    {
      ct.f(" dsb real events 2 db" + localList.size(), new Object[0]);
      e.a(this.c, localList);
    }
  }
  
  protected final void a()
  {
    if (!c()) {
      ct.c(" err su 1R", new Object[0]);
    }
    List localList;
    do
    {
      return;
      localList = b();
    } while ((localList == null) || (localList.size() <= 0));
    ds localds = dl.d().f();
    if ((!e.m(this.c)) || (localds == null))
    {
      ct.f(" dsu real events 2 db" + localList.size(), new Object[0]);
      e.a(this.c, localList);
      return;
    }
    ct.f(" dsu real events 2 up " + localList.size(), new Object[0]);
    localds.a(new a(this.c, localList));
  }
  
  /* Error */
  public final void a(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 27	com/tencent/tencentmap/mapsdk/a/dk:a	Z
    //   6: iload_1
    //   7: if_icmpeq +43 -> 50
    //   10: iload_1
    //   11: ifeq +42 -> 53
    //   14: aload_0
    //   15: iload_1
    //   16: putfield 27	com/tencent/tencentmap/mapsdk/a/dk:a	Z
    //   19: invokestatic 116	com/tencent/tencentmap/mapsdk/a/dl:d	()Lcom/tencent/tencentmap/mapsdk/a/dl;
    //   22: invokevirtual 140	com/tencent/tencentmap/mapsdk/a/dl:g	()Lcom/tencent/tencentmap/mapsdk/a/df;
    //   25: invokevirtual 144	com/tencent/tencentmap/mapsdk/a/df:b	()I
    //   28: sipush 1000
    //   31: imul
    //   32: i2l
    //   33: lstore_2
    //   34: invokestatic 149	com/tencent/tencentmap/mapsdk/a/b:a	()Lcom/tencent/tencentmap/mapsdk/a/b;
    //   37: bipush 103
    //   39: aload_0
    //   40: getfield 32	com/tencent/tencentmap/mapsdk/a/dk:d	Ljava/lang/Runnable;
    //   43: ldc2_w 150
    //   46: lload_2
    //   47: invokevirtual 154	com/tencent/tencentmap/mapsdk/a/b:a	(ILjava/lang/Runnable;JJ)V
    //   50: aload_0
    //   51: monitorexit
    //   52: return
    //   53: invokestatic 149	com/tencent/tencentmap/mapsdk/a/b:a	()Lcom/tencent/tencentmap/mapsdk/a/b;
    //   56: bipush 103
    //   58: invokevirtual 156	com/tencent/tencentmap/mapsdk/a/b:a	(I)V
    //   61: aload_0
    //   62: iconst_1
    //   63: invokevirtual 158	com/tencent/tencentmap/mapsdk/a/dk:b	(Z)V
    //   66: aload_0
    //   67: iload_1
    //   68: putfield 27	com/tencent/tencentmap/mapsdk/a/dk:a	Z
    //   71: goto -21 -> 50
    //   74: astore 4
    //   76: aload_0
    //   77: monitorexit
    //   78: aload 4
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	dk
    //   0	81	1	paramBoolean	boolean
    //   33	14	2	l	long
    //   74	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	10	74	finally
    //   14	50	74	finally
    //   53	71	74	finally
  }
  
  public final boolean a(di paramdi)
  {
    boolean bool = false;
    Object localObject;
    if (paramdi == null) {
      localObject = "null";
    }
    for (;;)
    {
      try
      {
        ct.f(" BF eN:%s   isRT:%b", new Object[] { localObject, Boolean.valueOf(true) });
        if ((this.c == null) || (paramdi == null))
        {
          ct.c("processUA return false, context is null or bean is null !", new Object[0]);
          return bool;
          localObject = paramdi.d();
          continue;
        }
        if (!c())
        {
          ct.c("processUA return false, isEnable is false !", new Object[0]);
          continue;
        }
        localObject = dl.d().g();
      }
      finally {}
      int i = ((df)localObject).a();
      long l = ((df)localObject).b() * 1000;
      if ((this.b.size() >= i) || (paramdi.f()))
      {
        ct.f(" BF mN!", new Object[0]);
        b.a().a(this.d);
        b.a().a(103, this.d, l, l);
      }
      this.b.add(paramdi);
      if (this.b.size() >= i) {
        ct.c(" err BF 3R! num:" + this.b.size(), new Object[0]);
      }
      if ("rqd_applaunched".equals(paramdi.d())) {
        b.a().a(this.d);
      }
      ct.a("processUA:true!", new Object[0]);
      bool = true;
    }
  }
  
  /* Error */
  public final void b(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc -51
    //   4: iconst_0
    //   5: anewarray 4	java/lang/Object
    //   8: invokestatic 207	com/tencent/tencentmap/mapsdk/a/ct:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   11: iload_1
    //   12: ifeq +10 -> 22
    //   15: aload_0
    //   16: invokespecial 55	com/tencent/tencentmap/mapsdk/a/dk:d	()V
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: invokestatic 149	com/tencent/tencentmap/mapsdk/a/b:a	()Lcom/tencent/tencentmap/mapsdk/a/b;
    //   25: aload_0
    //   26: getfield 37	com/tencent/tencentmap/mapsdk/a/dk:e	Ljava/lang/Runnable;
    //   29: invokevirtual 186	com/tencent/tencentmap/mapsdk/a/b:a	(Ljava/lang/Runnable;)V
    //   32: goto -13 -> 19
    //   35: astore_2
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_2
    //   39: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	this	dk
    //   0	40	1	paramBoolean	boolean
    //   35	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	11	35	finally
    //   15	19	35	finally
    //   22	32	35	finally
  }
  
  static final class a
    extends dn
  {
    private List<di> e = null;
    private Context f;
    private Long[] g = null;
    private boolean h = false;
    
    public a(Context paramContext, List<di> paramList)
    {
      super(1, 2);
      this.e = paramList;
      this.f = paramContext;
      this.e.size();
      if ((this.e.size() == 1) && ("rqd_heartbeat".equals(((di)this.e.get(0)).d()))) {
        this.h = true;
      }
      this.d = e.b(paramContext, 2);
      ct.a("real rid:%s", new Object[] { this.d });
    }
    
    private static cn a(int paramInt, List<di> paramList)
    {
      if ((paramList == null) || (paramList.size() <= 0)) {}
      for (;;)
      {
        return null;
        try
        {
          ct.b(" current size:" + paramList.size(), new Object[0]);
          paramList = a(paramList);
          if (paramList != null)
          {
            paramList = paramList.a();
            if (paramList != null)
            {
              paramList = a(paramInt, paramList);
              return paramList;
            }
          }
        }
        catch (Throwable paramList)
        {
          ct.a(paramList);
          ct.d(" RealTimeRecordUploadDatas.encode2EventRecordPackage error}", new Object[0]);
        }
      }
      return null;
    }
    
    private static cq a(List<di> paramList)
    {
      if ((paramList == null) || (paramList.size() <= 0)) {
        return null;
      }
      cq localcq;
      try
      {
        localcq = new cq();
        ArrayList localArrayList = new ArrayList();
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          cp localcp = e.a((di)paramList.next());
          if (localcp != null) {
            localArrayList.add(localcp);
          }
        }
        localcq.a = localArrayList;
      }
      catch (Throwable paramList)
      {
        ct.a(paramList);
        return null;
      }
      ct.b(" RealTimeRecordUploadDatas.encode2EventRecordPackage() end}", new Object[0]);
      return localcq;
    }
    
    /* Error */
    public final cn a()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: ldc -109
      //   4: iconst_0
      //   5: anewarray 66	java/lang/Object
      //   8: invokestatic 93	com/tencent/tencentmap/mapsdk/a/ct:b	(Ljava/lang/String;[Ljava/lang/Object;)V
      //   11: aload_0
      //   12: getfield 23	com/tencent/tencentmap/mapsdk/a/dk$a:e	Ljava/util/List;
      //   15: ifnull +17 -> 32
      //   18: aload_0
      //   19: getfield 23	com/tencent/tencentmap/mapsdk/a/dk$a:e	Ljava/util/List;
      //   22: invokeinterface 35 1 0
      //   27: istore_1
      //   28: iload_1
      //   29: ifgt +9 -> 38
      //   32: aconst_null
      //   33: astore_2
      //   34: aload_0
      //   35: monitorexit
      //   36: aload_2
      //   37: areturn
      //   38: aload_0
      //   39: getfield 150	com/tencent/tencentmap/mapsdk/a/dk$a:a	I
      //   42: aload_0
      //   43: getfield 23	com/tencent/tencentmap/mapsdk/a/dk$a:e	Ljava/util/List;
      //   46: invokestatic 152	com/tencent/tencentmap/mapsdk/a/dk$a:a	(ILjava/util/List;)Lcom/tencent/tencentmap/mapsdk/a/cn;
      //   49: astore_3
      //   50: aload_3
      //   51: astore_2
      //   52: aload_3
      //   53: ifnonnull -19 -> 34
      //   56: aconst_null
      //   57: astore_2
      //   58: goto -24 -> 34
      //   61: astore_2
      //   62: aload_2
      //   63: invokestatic 107	com/tencent/tencentmap/mapsdk/a/ct:a	(Ljava/lang/Throwable;)V
      //   66: ldc -102
      //   68: iconst_0
      //   69: anewarray 66	java/lang/Object
      //   72: invokestatic 111	com/tencent/tencentmap/mapsdk/a/ct:d	(Ljava/lang/String;[Ljava/lang/Object;)V
      //   75: goto -19 -> 56
      //   78: astore_2
      //   79: aload_0
      //   80: monitorexit
      //   81: aload_2
      //   82: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	83	0	this	a
      //   27	2	1	i	int
      //   33	25	2	localObject1	Object
      //   61	2	2	localThrowable	Throwable
      //   78	4	2	localObject2	Object
      //   49	4	3	localcn	cn
      // Exception table:
      //   from	to	target	type
      //   38	50	61	java/lang/Throwable
      //   2	28	78	finally
      //   38	50	78	finally
      //   62	75	78	finally
    }
    
    public final void b(boolean paramBoolean)
    {
      try
      {
        ct.b(" TimeUpUploadDatas.done(), result:%b", new Object[] { Boolean.valueOf(paramBoolean) });
        if ((this.e != null) && (!paramBoolean))
        {
          ct.f(" upload failed, save to db", new Object[0]);
          if (!this.h)
          {
            this.g = e.a(this.f, this.e);
            this.e = null;
          }
        }
        if ((paramBoolean) && (this.h))
        {
          Context localContext = this.f;
          b.a().a(108);
          a.a(localContext, "HEART_DENGTA", e.g());
          ct.a("heartbeat uploaded sucess!", new Object[0]);
        }
        if ((paramBoolean) && (this.g != null)) {
          e.a(this.f, this.g);
        }
        if ((paramBoolean) && (this.g == null) && (this.e != null)) {
          this.e = null;
        }
        return;
      }
      finally {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/dk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */