package com.tencent.mm.plugin.appbrand.task;

import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
{
  private static boolean gte = false;
  private static boolean gtf = false;
  private static HashSet<a> gtg = new HashSet();
  private static List<p> gth = new LinkedList();
  private static List<com.tencent.mm.plugin.appbrand.l> gti = new LinkedList();
  private static com.tencent.mm.plugin.appbrand.l gtj;
  private static String gtk = null;
  private static String gtl = null;
  private static com.tencent.mm.sdk.b.c gtm = new d.2();
  private static boolean gtn = false;
  private static boolean gto = false;
  
  public static void a(a parama, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (;;)
    {
      try
      {
        reset();
        if (gte)
        {
          if (parama != null) {
            gtg.add(parama);
          }
          return;
        }
        if (gtf)
        {
          if (parama == null) {
            continue;
          }
          parama.onReady();
          continue;
        }
        gte = true;
      }
      finally {}
      if (parama != null) {
        gtg.add(parama);
      }
      x.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "TRACE_ORDER:AppBrandProcessPreloader.java");
      com.tencent.mm.plugin.appbrand.r.c.Em().H(new Runnable()
      {
        public final void run()
        {
          x.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "preInit start");
          new com.tencent.mm.plugin.appbrand.k.l().init();
          d.vg();
          try
          {
            WxaCommLibRuntimeReader.kS();
            if (WebView.hasInited())
            {
              d.amZ();
              x.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "webview already init done");
              return;
            }
          }
          catch (Throwable localThrowable)
          {
            x.e("MicroMsg.AppBrandProcessPreloader[applaunch]", "skip preload runtime, load CommLib get exception %s", new Object[] { localThrowable });
            d.access$100();
            return;
          }
          WebView.initWebviewCore(ad.getContext(), MMWebView.uHn, "appbrand", new d.1.1(this));
          x.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "misc preload done");
        }
      });
    }
  }
  
  /* Error */
  private static void amV()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 49	com/tencent/mm/plugin/appbrand/task/d:gti	Ljava/util/List;
    //   6: invokeinterface 109 1 0
    //   11: istore_0
    //   12: iload_0
    //   13: ifle +7 -> 20
    //   16: ldc 2
    //   18: monitorexit
    //   19: return
    //   20: new 111	com/tencent/mm/plugin/appbrand/l
    //   23: dup
    //   24: invokespecial 112	com/tencent/mm/plugin/appbrand/l:<init>	()V
    //   27: astore_1
    //   28: aload_1
    //   29: iconst_1
    //   30: putfield 115	com/tencent/mm/plugin/appbrand/l:fdT	Z
    //   33: ldc 117
    //   35: ldc 119
    //   37: invokestatic 122	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   40: new 124	org/json/JSONObject
    //   43: dup
    //   44: invokespecial 125	org/json/JSONObject:<init>	()V
    //   47: astore_2
    //   48: aload_2
    //   49: ldc 127
    //   51: iconst_1
    //   52: invokestatic 133	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   55: invokestatic 136	com/tencent/mm/plugin/appbrand/l:a	(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V
    //   58: aload_1
    //   59: aload_2
    //   60: invokevirtual 140	com/tencent/mm/plugin/appbrand/l:g	(Lorg/json/JSONObject;)V
    //   63: aload_1
    //   64: getfield 144	com/tencent/mm/plugin/appbrand/l:fdQ	Lcom/tencent/mm/plugin/appbrand/g/b;
    //   67: ldc -110
    //   69: iconst_1
    //   70: anewarray 4	java/lang/Object
    //   73: dup
    //   74: iconst_0
    //   75: aload_2
    //   76: invokevirtual 150	org/json/JSONObject:toString	()Ljava/lang/String;
    //   79: aastore
    //   80: invokestatic 156	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   83: aconst_null
    //   84: invokeinterface 162 3 0
    //   89: aload_1
    //   90: invokevirtual 165	com/tencent/mm/plugin/appbrand/l:aaH	()V
    //   93: aload_1
    //   94: getfield 144	com/tencent/mm/plugin/appbrand/l:fdQ	Lcom/tencent/mm/plugin/appbrand/g/b;
    //   97: ldc -89
    //   99: invokeinterface 171 2 0
    //   104: ifnull +24 -> 128
    //   107: aload_1
    //   108: getfield 144	com/tencent/mm/plugin/appbrand/l:fdQ	Lcom/tencent/mm/plugin/appbrand/g/b;
    //   111: ldc -89
    //   113: invokeinterface 171 2 0
    //   118: checkcast 167	com/tencent/mm/plugin/appbrand/g/e
    //   121: ldc -83
    //   123: invokeinterface 177 2 0
    //   128: getstatic 49	com/tencent/mm/plugin/appbrand/task/d:gti	Ljava/util/List;
    //   131: aload_1
    //   132: invokeinterface 178 2 0
    //   137: pop
    //   138: aload_1
    //   139: putstatic 180	com/tencent/mm/plugin/appbrand/task/d:gtj	Lcom/tencent/mm/plugin/appbrand/l;
    //   142: goto -126 -> 16
    //   145: astore_1
    //   146: ldc 2
    //   148: monitorexit
    //   149: aload_1
    //   150: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   11	2	0	i	int
    //   27	112	1	locall	com.tencent.mm.plugin.appbrand.l
    //   145	5	1	localObject	Object
    //   47	29	2	localJSONObject	org.json.JSONObject
    // Exception table:
    //   from	to	target	type
    //   3	12	145	finally
    //   20	128	145	finally
    //   128	142	145	finally
  }
  
  /* Error */
  private static void amW()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 47	com/tencent/mm/plugin/appbrand/task/d:gth	Ljava/util/List;
    //   6: invokeinterface 109 1 0
    //   11: istore_0
    //   12: iload_0
    //   13: ifle +7 -> 20
    //   16: ldc 2
    //   18: monitorexit
    //   19: return
    //   20: new 183	com/tencent/mm/plugin/appbrand/page/p
    //   23: dup
    //   24: invokespecial 184	com/tencent/mm/plugin/appbrand/page/p:<init>	()V
    //   27: astore_1
    //   28: aload_1
    //   29: iconst_1
    //   30: putfield 185	com/tencent/mm/plugin/appbrand/page/p:fdT	Z
    //   33: aload_1
    //   34: new 187	com/tencent/mm/plugin/appbrand/page/t
    //   37: dup
    //   38: new 189	android/content/MutableContextWrapper
    //   41: dup
    //   42: invokestatic 195	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   45: invokespecial 198	android/content/MutableContextWrapper:<init>	(Landroid/content/Context;)V
    //   48: invokespecial 199	com/tencent/mm/plugin/appbrand/page/t:<init>	(Landroid/content/Context;)V
    //   51: putfield 203	com/tencent/mm/plugin/appbrand/page/p:gns	Lcom/tencent/mm/plugin/appbrand/page/t;
    //   54: aload_1
    //   55: getfield 203	com/tencent/mm/plugin/appbrand/page/p:gns	Lcom/tencent/mm/plugin/appbrand/page/t;
    //   58: iconst_1
    //   59: invokevirtual 207	com/tencent/mm/plugin/appbrand/page/t:setIsPreload	(Z)V
    //   62: aload_1
    //   63: invokevirtual 210	com/tencent/mm/plugin/appbrand/page/p:alN	()V
    //   66: aload_1
    //   67: getfield 203	com/tencent/mm/plugin/appbrand/page/p:gns	Lcom/tencent/mm/plugin/appbrand/page/t;
    //   70: invokevirtual 213	com/tencent/mm/plugin/appbrand/page/t:init	()V
    //   73: getstatic 47	com/tencent/mm/plugin/appbrand/task/d:gth	Ljava/util/List;
    //   76: aload_1
    //   77: invokeinterface 178 2 0
    //   82: pop
    //   83: goto -67 -> 16
    //   86: astore_1
    //   87: ldc 2
    //   89: monitorexit
    //   90: aload_1
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   11	2	0	i	int
    //   27	50	1	localp	p
    //   86	5	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   3	12	86	finally
    //   20	83	86	finally
  }
  
  public static com.tencent.mm.plugin.appbrand.l amX()
  {
    try
    {
      com.tencent.mm.plugin.appbrand.l locall = gtj;
      return locall;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void amY()
  {
    boolean bool = true;
    for (;;)
    {
      try
      {
        if (WebView.isSys())
        {
          if (!bool) {
            break label83;
          }
          x.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "preLoadNextRuntime disable preload");
          return;
        }
        if (!WebView.isX5()) {
          break label76;
        }
        if (WebView.getUsingTbsCoreVersion(ad.getContext()) == 0)
        {
          x.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "closeClientPreload without x5");
          continue;
        }
        if (com.tencent.xweb.x5.sdk.d.canOpenWebPlus(ad.getContext())) {
          break label76;
        }
      }
      finally {}
      x.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "closeClientPreload can not OpenWebPlus");
      continue;
      label76:
      bool = gtn;
      continue;
      label83:
      x.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "preLoadNextRuntime");
      try
      {
        amV();
        amW();
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.AppBrandProcessPreloader[applaunch]", localException, "preLoadNextRuntime exception.", new Object[0]);
      }
      catch (Error localError)
      {
        x.printErrStackTrace("MicroMsg.AppBrandProcessPreloader[applaunch]", localError, "preLoadNextRuntime Error.", new Object[0]);
      }
    }
  }
  
  /* Error */
  public static void amZ()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: new 262	com/tencent/mm/plugin/appbrand/task/d$3
    //   6: dup
    //   7: invokespecial 263	com/tencent/mm/plugin/appbrand/task/d$3:<init>	()V
    //   10: astore_0
    //   11: invokestatic 269	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   14: invokevirtual 273	android/os/Looper:getThread	()Ljava/lang/Thread;
    //   17: invokestatic 278	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   20: if_acmpne +13 -> 33
    //   23: aload_0
    //   24: invokeinterface 283 1 0
    //   29: ldc 2
    //   31: monitorexit
    //   32: return
    //   33: aload_0
    //   34: invokestatic 287	com/tencent/mm/sdk/platformtools/ah:A	(Ljava/lang/Runnable;)V
    //   37: goto -8 -> 29
    //   40: astore_0
    //   41: ldc 2
    //   43: monitorexit
    //   44: aload_0
    //   45: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   10	24	0	local3	d.3
    //   40	5	0	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   3	29	40	finally
    //   33	37	40	finally
  }
  
  public static boolean ana()
  {
    return gtf;
  }
  
  public static boolean anb()
  {
    return gto;
  }
  
  private static void done()
  {
    try
    {
      x.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "preInit finished");
      gtf = true;
      gte = false;
      Iterator localIterator = gtg.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (locala != null) {
          locala.onReady();
        }
      }
      gtg.clear();
    }
    finally {}
  }
  
  private static void reset()
  {
    try
    {
      gte = false;
      gtf = false;
      gtg.clear();
      gth.clear();
      gti.clear();
      gtj = null;
      gtk = null;
      gtl = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void vv(String paramString)
  {
    try
    {
      gtk = paramString;
      gtl = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  /* Error */
  public static com.tencent.mm.plugin.appbrand.l vw(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: invokestatic 365	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   7: ifne +22 -> 29
    //   10: aload_0
    //   11: getstatic 53	com/tencent/mm/plugin/appbrand/task/d:gtl	Ljava/lang/String;
    //   14: invokevirtual 349	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   17: istore_1
    //   18: iload_1
    //   19: ifeq +10 -> 29
    //   22: aconst_null
    //   23: astore_0
    //   24: ldc 2
    //   26: monitorexit
    //   27: aload_0
    //   28: areturn
    //   29: aload_0
    //   30: putstatic 53	com/tencent/mm/plugin/appbrand/task/d:gtl	Ljava/lang/String;
    //   33: getstatic 49	com/tencent/mm/plugin/appbrand/task/d:gti	Ljava/util/List;
    //   36: invokeinterface 109 1 0
    //   41: ifgt +8 -> 49
    //   44: aconst_null
    //   45: astore_0
    //   46: goto -22 -> 24
    //   49: getstatic 49	com/tencent/mm/plugin/appbrand/task/d:gti	Ljava/util/List;
    //   52: iconst_0
    //   53: invokeinterface 368 2 0
    //   58: checkcast 111	com/tencent/mm/plugin/appbrand/l
    //   61: astore_0
    //   62: aload_0
    //   63: ifnonnull +8 -> 71
    //   66: aconst_null
    //   67: astore_0
    //   68: goto -44 -> 24
    //   71: getstatic 49	com/tencent/mm/plugin/appbrand/task/d:gti	Ljava/util/List;
    //   74: aload_0
    //   75: invokeinterface 371 2 0
    //   80: pop
    //   81: goto -57 -> 24
    //   84: astore_0
    //   85: ldc 2
    //   87: monitorexit
    //   88: aload_0
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	paramString	String
    //   17	2	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	18	84	finally
    //   29	44	84	finally
    //   49	62	84	finally
    //   71	81	84	finally
  }
  
  /* Error */
  public static p vx(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: invokestatic 365	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   7: ifne +22 -> 29
    //   10: aload_0
    //   11: getstatic 51	com/tencent/mm/plugin/appbrand/task/d:gtk	Ljava/lang/String;
    //   14: invokevirtual 349	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   17: istore_1
    //   18: iload_1
    //   19: ifeq +10 -> 29
    //   22: aconst_null
    //   23: astore_0
    //   24: ldc 2
    //   26: monitorexit
    //   27: aload_0
    //   28: areturn
    //   29: aload_0
    //   30: putstatic 51	com/tencent/mm/plugin/appbrand/task/d:gtk	Ljava/lang/String;
    //   33: getstatic 47	com/tencent/mm/plugin/appbrand/task/d:gth	Ljava/util/List;
    //   36: invokeinterface 109 1 0
    //   41: ifgt +8 -> 49
    //   44: aconst_null
    //   45: astore_0
    //   46: goto -22 -> 24
    //   49: getstatic 47	com/tencent/mm/plugin/appbrand/task/d:gth	Ljava/util/List;
    //   52: iconst_0
    //   53: invokeinterface 368 2 0
    //   58: checkcast 183	com/tencent/mm/plugin/appbrand/page/p
    //   61: astore_0
    //   62: aload_0
    //   63: ifnonnull +8 -> 71
    //   66: aconst_null
    //   67: astore_0
    //   68: goto -44 -> 24
    //   71: getstatic 47	com/tencent/mm/plugin/appbrand/task/d:gth	Ljava/util/List;
    //   74: aload_0
    //   75: invokeinterface 371 2 0
    //   80: pop
    //   81: goto -57 -> 24
    //   84: astore_0
    //   85: ldc 2
    //   87: monitorexit
    //   88: aload_0
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	paramString	String
    //   17	2	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	18	84	finally
    //   29	44	84	finally
    //   49	62	84	finally
    //   71	81	84	finally
  }
  
  public static abstract interface a
  {
    public abstract void onReady();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/task/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */