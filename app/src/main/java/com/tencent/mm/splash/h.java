package com.tencent.mm.splash;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class h
{
  static b sMA;
  static e sMB;
  static Set<SplashActivity> sMC = new HashSet();
  private static boolean sMD = false;
  private static volatile boolean sME = false;
  private static boolean sMF = false;
  private static o sMG;
  private static boolean sMH = false;
  static c sMI;
  private static Class<? extends SplashActivity> sMJ;
  private static Class<? extends Activity> sMK;
  private static n sML = new n();
  private static boolean sMM = false;
  @SuppressLint({"HandlerLeak"})
  private static Handler sMN = new Handler(Looper.getMainLooper())
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      if (paramAnonymousMessage.what == 0)
      {
        h.bwD();
        return;
      }
      a.gb(h.sMx);
      a.a(new a.a()
      {
        public final void bxm()
        {
          h.b("WxSplash.Splash", "dexopt service return failed. kill self.", new Object[0]);
          h.cjX();
        }
        
        public final void cjQ() {}
        
        public final void cjR()
        {
          h.b("WxSplash.Splash", "dexopt service return timeout. kill self.", new Object[0]);
          h.cjX();
        }
      });
    }
  };
  public static final ArrayList<i> sMv = new ArrayList();
  public static final ArrayList<Message> sMw = new ArrayList();
  static Application sMx;
  static String sMy;
  static d sMz;
  
  public static void J(Class<? extends SplashActivity> paramClass)
  {
    sMJ = paramClass;
  }
  
  public static void K(Class<? extends Activity> paramClass)
  {
    sMK = paramClass;
  }
  
  public static String T(Activity paramActivity)
  {
    if ((paramActivity instanceof i)) {
      return ((i)paramActivity).sMW;
    }
    return "";
  }
  
  public static void XB(String paramString)
  {
    sMy = paramString;
  }
  
  static void a(SplashActivity paramSplashActivity)
  {
    sMC.add(paramSplashActivity);
  }
  
  public static void a(b paramb)
  {
    sMA = paramb;
  }
  
  public static void a(c paramc)
  {
    sMI = paramc;
  }
  
  public static void a(d paramd)
  {
    sMz = paramd;
  }
  
  public static void a(e parame)
  {
    sMB = parame;
  }
  
  public static void a(o paramo)
  {
    sMG = paramo;
  }
  
  public static void a(Throwable paramThrowable, String paramString)
  {
    if (sMI != null) {
      sMI.a(paramThrowable, paramString);
    }
  }
  
  static void b(SplashActivity paramSplashActivity)
  {
    sMC.remove(paramSplashActivity);
  }
  
  public static void b(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (sMI != null) {
      sMI.b(paramString1, paramString2, paramVarArgs);
    }
  }
  
  private static Object cG(Context paramContext)
  {
    Object localObject = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
    ((Method)localObject).setAccessible(true);
    localObject = ((Method)localObject).invoke(null, new Object[0]);
    if (localObject != null) {
      return localObject;
    }
    localObject = paramContext.getClass().getField("mLoadedApk");
    ((Field)localObject).setAccessible(true);
    paramContext = ((Field)localObject).get(paramContext);
    localObject = paramContext.getClass().getDeclaredField("mActivityThread");
    ((Field)localObject).setAccessible(true);
    return ((Field)localObject).get(paramContext);
  }
  
  public static void cjT()
  {
    boolean bool = true;
    if (sMF) {}
    for (;;)
    {
      try
      {
        Handler.Callback localCallback = (Handler.Callback)l.sNs.get(l.sNm);
        if (localCallback != l.sNr) {
          break label130;
        }
        b("WxSplash.Splash", "double check, callback %s %s", new Object[] { Boolean.valueOf(bool), localCallback });
        if (localCallback == l.sNr) {
          return;
        }
        b("WxSplash.Splash", "double check found problem!", new Object[0]);
        Field localField = l.sNs;
        l.sNr.lGF = localCallback;
        localField.setAccessible(true);
        localField.set(l.sNm, l.sNr);
        sML.f(675L, 31L, 1L);
        l.sNm.sendEmptyMessage(987654321);
        return;
      }
      catch (Exception localException)
      {
        a(localException, "double check exception.");
      }
      return;
      label130:
      bool = false;
    }
  }
  
  public static boolean cjU()
  {
    return true;
  }
  
  public static boolean cjV()
  {
    return sMD;
  }
  
  public static boolean cjW()
  {
    return sME;
  }
  
  public static void cjX()
  {
    Process.killProcess(Process.myPid());
  }
  
  public static void cjY()
  {
    if (!f.lY)
    {
      sMN.postDelayed(new Runnable()
      {
        public final void run()
        {
          com.tencent.mm.sdk.f.e.post(new Runnable()
          {
            public final void run()
            {
              boolean bool = a.fZ(h.sMx);
              Handler localHandler = h.cke();
              if (bool) {}
              for (int i = 1;; i = 0)
              {
                localHandler.sendEmptyMessage(i);
                return;
              }
            }
          }, "checking-need-dexopt");
        }
      }, 150L);
      return;
    }
    sMN.sendEmptyMessage(0);
  }
  
  private static void cjZ()
  {
    b("WxSplash.Splash", "Gonna replay %s pending message(s).", new Object[] { Integer.valueOf(sMw.size()) });
    Iterator localIterator = sMw.iterator();
    while (localIterator.hasNext())
    {
      Message localMessage = (Message)localIterator.next();
      l.sNm.sendMessage(localMessage);
    }
    sMw.clear();
  }
  
  private static void cka()
  {
    b("WxSplash.Splash", "splash done, do finally things. ", new Object[0]);
    sMD = false;
    Object localObject1 = sMC.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      SplashActivity localSplashActivity = (SplashActivity)((Iterator)localObject1).next();
      b("WxSplash.Splash", "iterate splash activity %s.", new Object[] { localSplashActivity });
      localSplashActivity.ckh();
    }
    b("WxSplash.Splash", "resend all %s pending message. ", new Object[] { Integer.valueOf(sMw.size()) });
    if (!sME) {
      cjZ();
    }
    sMG = null;
    b("WxSplash.Splash", "we need splash no more.", new Object[0]);
    long l;
    try
    {
      sMH = false;
      localObject1 = sML;
      if (((n)localObject1).mStartTimestamp > 0L)
      {
        l = System.currentTimeMillis() - ((n)localObject1).mStartTimestamp;
        if (f.lY)
        {
          ((n)localObject1).f(676L, 1L, 1L);
          ((n)localObject1).f(676L, 3L, l);
        }
      }
      else
      {
        return;
      }
    }
    finally {}
    ((n)localObject2).f(676L, 0L, 1L);
    ((n)localObject2).f(676L, 2L, l);
  }
  
  /* Error */
  private static void ckb()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 164	com/tencent/mm/splash/h:sMx	Landroid/app/Application;
    //   6: invokestatic 400	com/tencent/mm/splash/a:ga	(Landroid/content/Context;)V
    //   9: ldc 2
    //   11: monitorenter
    //   12: getstatic 82	com/tencent/mm/splash/h:sMH	Z
    //   15: ifeq +10 -> 25
    //   18: ldc 2
    //   20: monitorexit
    //   21: ldc 2
    //   23: monitorexit
    //   24: return
    //   25: iconst_1
    //   26: putstatic 82	com/tencent/mm/splash/h:sMH	Z
    //   29: ldc 2
    //   31: monitorexit
    //   32: getstatic 80	com/tencent/mm/splash/h:sMF	Z
    //   35: ifne +39 -> 74
    //   38: ldc -80
    //   40: ldc_w 402
    //   43: iconst_0
    //   44: anewarray 4	java/lang/Object
    //   47: invokestatic 188	com/tencent/mm/splash/h:b	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   50: getstatic 150	com/tencent/mm/splash/h:sMG	Lcom/tencent/mm/splash/o;
    //   53: ifnonnull +245 -> 298
    //   56: invokestatic 159	com/tencent/mm/splash/h:cka	()V
    //   59: goto -38 -> 21
    //   62: astore_0
    //   63: ldc 2
    //   65: monitorexit
    //   66: aload_0
    //   67: athrow
    //   68: astore_0
    //   69: ldc 2
    //   71: monitorexit
    //   72: aload_0
    //   73: athrow
    //   74: getstatic 324	com/tencent/mm/splash/f:lY	Z
    //   77: ifeq +42 -> 119
    //   80: ldc -80
    //   82: ldc_w 404
    //   85: iconst_0
    //   86: anewarray 4	java/lang/Object
    //   89: invokestatic 188	com/tencent/mm/splash/h:b	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   92: goto -42 -> 50
    //   95: astore_0
    //   96: getstatic 87	com/tencent/mm/splash/h:sML	Lcom/tencent/mm/splash/n;
    //   99: ldc2_w 290
    //   102: ldc2_w 405
    //   105: lconst_1
    //   106: invokevirtual 297	com/tencent/mm/splash/n:f	(JJJ)V
    //   109: aload_0
    //   110: ldc_w 408
    //   113: invokestatic 230	com/tencent/mm/splash/h:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   116: goto -66 -> 50
    //   119: getstatic 412	com/tencent/mm/splash/l:sNp	Ljava/util/List;
    //   122: ifnull -72 -> 50
    //   125: getstatic 412	com/tencent/mm/splash/l:sNp	Ljava/util/List;
    //   128: invokeinterface 415 1 0
    //   133: ifeq -83 -> 50
    //   136: getstatic 87	com/tencent/mm/splash/h:sML	Lcom/tencent/mm/splash/n;
    //   139: ldc2_w 290
    //   142: ldc2_w 416
    //   145: lconst_1
    //   146: invokevirtual 297	com/tencent/mm/splash/n:f	(JJJ)V
    //   149: getstatic 174	com/tencent/mm/splash/l:sNl	Ljava/lang/Object;
    //   152: astore_2
    //   153: aload_2
    //   154: invokevirtual 192	java/lang/Object:getClass	()Ljava/lang/Class;
    //   157: ldc_w 419
    //   160: invokevirtual 200	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   163: astore_0
    //   164: aload_0
    //   165: iconst_1
    //   166: invokevirtual 206	java/lang/reflect/Field:setAccessible	(Z)V
    //   169: aload_0
    //   170: aload_2
    //   171: invokevirtual 210	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   174: astore_1
    //   175: aload_1
    //   176: checkcast 421	android/app/Application
    //   179: putstatic 424	com/tencent/mm/splash/l:sNo	Landroid/app/Application;
    //   182: aload_1
    //   183: astore_0
    //   184: aload_1
    //   185: ifnonnull +19 -> 204
    //   188: ldc -80
    //   190: ldc_w 426
    //   193: iconst_0
    //   194: anewarray 4	java/lang/Object
    //   197: invokestatic 188	com/tencent/mm/splash/h:b	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   200: getstatic 164	com/tencent/mm/splash/h:sMx	Landroid/app/Application;
    //   203: astore_0
    //   204: ldc_w 428
    //   207: invokestatic 250	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   210: pop
    //   211: ldc_w 430
    //   214: invokestatic 250	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   217: pop
    //   218: ldc -80
    //   220: ldc_w 432
    //   223: iconst_0
    //   224: anewarray 4	java/lang/Object
    //   227: invokestatic 188	com/tencent/mm/splash/h:b	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   230: ldc -80
    //   232: ldc_w 434
    //   235: iconst_0
    //   236: anewarray 4	java/lang/Object
    //   239: invokestatic 188	com/tencent/mm/splash/h:b	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   242: getstatic 438	com/tencent/mm/splash/l:sNq	Ljava/lang/reflect/Method;
    //   245: aload_2
    //   246: iconst_2
    //   247: anewarray 4	java/lang/Object
    //   250: dup
    //   251: iconst_0
    //   252: aload_0
    //   253: aastore
    //   254: dup
    //   255: iconst_1
    //   256: getstatic 412	com/tencent/mm/splash/l:sNp	Ljava/util/List;
    //   259: aastore
    //   260: invokevirtual 263	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   263: pop
    //   264: ldc -80
    //   266: ldc_w 440
    //   269: iconst_0
    //   270: anewarray 4	java/lang/Object
    //   273: invokestatic 188	com/tencent/mm/splash/h:b	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   276: getstatic 412	com/tencent/mm/splash/l:sNp	Ljava/util/List;
    //   279: invokeinterface 441 1 0
    //   284: goto -234 -> 50
    //   287: astore_1
    //   288: aload_1
    //   289: ldc_w 443
    //   292: invokestatic 230	com/tencent/mm/splash/h:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   295: goto -65 -> 230
    //   298: getstatic 150	com/tencent/mm/splash/h:sMG	Lcom/tencent/mm/splash/o;
    //   301: new 18	com/tencent/mm/splash/h$5
    //   304: dup
    //   305: invokespecial 444	com/tencent/mm/splash/h$5:<init>	()V
    //   308: invokeinterface 450 2 0
    //   313: goto -292 -> 21
    // Local variable table:
    //   start	length	slot	name	signature
    //   62	5	0	localObject1	Object
    //   68	5	0	localObject2	Object
    //   95	15	0	localException	Exception
    //   163	90	0	localObject3	Object
    //   174	11	1	localObject4	Object
    //   287	2	1	localThrowable	Throwable
    //   152	94	2	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   3	12	62	finally
    //   32	50	62	finally
    //   50	59	62	finally
    //   72	74	62	finally
    //   74	92	62	finally
    //   96	116	62	finally
    //   119	182	62	finally
    //   188	204	62	finally
    //   204	230	62	finally
    //   230	284	62	finally
    //   288	295	62	finally
    //   298	313	62	finally
    //   12	21	68	finally
    //   25	32	68	finally
    //   69	72	68	finally
    //   32	50	95	java/lang/Exception
    //   74	92	95	java/lang/Exception
    //   119	182	95	java/lang/Exception
    //   188	204	95	java/lang/Exception
    //   204	230	95	java/lang/Exception
    //   230	284	95	java/lang/Exception
    //   288	295	95	java/lang/Exception
    //   204	230	287	java/lang/Throwable
  }
  
  public static Class<? extends Activity> ckc()
  {
    return sMJ;
  }
  
  public static n ckd()
  {
    return sML;
  }
  
  public static boolean f(Application paramApplication)
  {
    for (;;)
    {
      boolean bool;
      long l;
      Object localObject3;
      int i;
      try
      {
        if (sMF)
        {
          b("WxSplash.Splash", "Splash has hacked before.", new Object[0]);
          bool = true;
          return bool;
        }
        l = System.currentTimeMillis();
        sMx = paramApplication;
        sML.f(675L, 4L, 1L);
        try
        {
          localObject1 = Class.forName("android.app.ActivityManagerNative");
          localObject3 = ((Class)localObject1).getDeclaredMethod("getDefault", new Class[0]);
          ((Method)localObject3).setAccessible(true);
          localObject1 = ((Method)localObject3).invoke(localObject1, new Object[0]);
          if (localObject1 != null)
          {
            b("WxSplash.Splash", "getDefault %s", new Object[] { localObject1 });
            if (localObject1.getClass().getCanonicalName().startsWith("com.morgoo.droidplugin"))
            {
              sML.f(675L, 33L, 1L);
              b("WxSplash.Splash", "found using droidplugin", new Object[0]);
            }
            if (Proxy.isProxyClass(localObject1.getClass())) {
              b("WxSplash.Splash", "found ActivityManager is a Proxy class, " + localObject1.getClass(), new Object[0]);
            }
          }
        }
        catch (Exception localException)
        {
          try
          {
            Object localObject1 = cG(paramApplication);
            localField = localObject1.getClass().getDeclaredField("mInstrumentation");
            localField.setAccessible(true);
            localObject3 = (Instrumentation)localField.get(localObject1);
            if (Object.class == localObject3.getClass().getSuperclass()) {
              continue;
            }
            localObject4 = localObject3.getClass().getCanonicalName();
            if ((!((String)localObject4).startsWith("android.support.test")) && (!((String)localObject4).startsWith("android.test"))) {
              continue;
            }
            b("WxSplash.Splash", "android instrument test is running, do not need splash.", new Object[0]);
            i = 1;
          }
          catch (Exception paramApplication)
          {
            a(paramApplication, "splash hack error!");
            bool = false;
          }
          localException = localException;
          a(localException, "validateEnvironment found some thing.");
          continue;
        }
        i = 0;
      }
      finally {}
      if (localObject3 == null) {
        throw new NullPointerException("Instrumentation original should not be null.");
      }
      Object localObject2;
      if (Object.class != localObject3.getClass().getSuperclass())
      {
        sML.f(675L, 7L, 1L);
        b("WxSplash.Splash", "Instrumentation original's super class is not Object, maybe hacked by others. orig: %s, super: %s.", new Object[] { localObject3.getClass(), localObject3.getClass().getSuperclass() });
        paramApplication = localObject3.getClass().getCanonicalName();
        localObject2 = new RuntimeException("invalid environment for hack, " + localObject3.getClass());
        if (paramApplication.startsWith(new String[] { "com.excelliance", "com.lbe", "com.beike", "com.lody", "com.doubleagent", "com.svm", "com.morgoo" }[0]))
        {
          sML.f(675L, 30L, 1L);
          b("WxSplash.Splash", "invalid environment for hack, dual open.", new Object[0]);
        }
        sML.f(675L, 0L, 1L);
        throw ((Throwable)localObject2);
      }
      if (!(localObject3 instanceof k)) {
        localField.set(localObject2, new k((Instrumentation)localObject3));
      }
      for (;;)
      {
        l.sNl = localObject2;
        localObject3 = localObject2.getClass().getDeclaredField("mH");
        ((Field)localObject3).setAccessible(true);
        localObject3 = (Handler)((Field)localObject3).get(localObject2);
        if (localObject3 != null) {
          break;
        }
        throw new RuntimeException("mH is null!");
        b("WxSplash.Splash", "instrumentation is splash hacked, why? failed before?", new Object[0]);
      }
      l.sNm = (Handler)localObject3;
      Field localField = Handler.class.getDeclaredField("mCallback");
      localField.setAccessible(true);
      Object localObject4 = (Handler.Callback)localField.get(localObject3);
      l.sNs = localField;
      if (localObject4 != null)
      {
        b("WxSplash.Splash", "Handler.Callback original is not null, maybe hacked by others. orig: %s", new Object[] { localObject4 });
        sML.f(675L, 8L, 1L);
      }
      if ((localObject4 == null) || (!(localObject4 instanceof j)))
      {
        paramApplication = new j(paramApplication, (Handler.Callback)localObject4);
        localField.setAccessible(true);
        localField.set(localObject3, paramApplication);
        l.sNr = paramApplication;
      }
      for (;;)
      {
        paramApplication = new Handler();
        j.aa(new Runnable()
        {
          public final void run()
          {
            h.Ju();
            this.sMO.removeCallbacksAndMessages(null);
            h.b("WxSplash.Splash", "verify mH callback hack, result ok.", new Object[0]);
          }
        });
        l.sNm.sendEmptyMessage(987654321);
        paramApplication.postDelayed(new Runnable()
        {
          public final void run()
          {
            if (!h.yT())
            {
              h.b("WxSplash.Splash", "verify mH callback hack, result failed!.", new Object[0]);
              h.ckd().f(675L, 32L, 1L);
              h.access$100();
            }
          }
        }, 2000L);
        if (!f.lY)
        {
          paramApplication = localObject2.getClass().getDeclaredMethod("installContentProviders", new Class[] { Context.class, List.class });
          paramApplication.setAccessible(true);
          l.sNq = paramApplication;
          paramApplication = localObject2.getClass().getDeclaredField("mBoundApplication");
          paramApplication.setAccessible(true);
          paramApplication = paramApplication.get(localObject2);
          l.sNn = paramApplication;
          localObject2 = paramApplication.getClass().getDeclaredField("restrictedBackupMode");
          ((Field)localObject2).setAccessible(true);
          ((Field)localObject2).set(paramApplication, Boolean.valueOf(true));
          localObject2 = paramApplication.getClass().getDeclaredField("providers");
          ((Field)localObject2).setAccessible(true);
          l.sNp = (List)((Field)localObject2).get(paramApplication);
        }
        sMF = true;
        sMD = true;
        b("WxSplash.Splash", "splash hack success.", new Object[0]);
        b("WxSplash.Splash", "we need splash. time spent %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        bool = true;
        break;
        b("WxSplash.Splash", "callback is splash hacked, why? failed before?", new Object[0]);
      }
      if (i != 0) {
        bool = false;
      }
    }
  }
  
  public static void gf(Context paramContext)
  {
    label225:
    for (int i = 1;; i = 0)
    {
      try
      {
        localObject = bi.fW(paramContext);
        if ((localObject != null) && (((ComponentName)localObject).getPackageName().equals(paramContext.getPackageName())) && (sMy != null) && (((ComponentName)localObject).getClassName().equals(sMy))) {
          b("WxSplash.Splash", "it is LauncherUI", new Object[0]);
        }
        while (i == 0)
        {
          b("WxSplash.Splash", "do nothing and return.", new Object[0]);
          return;
          if ((localObject == null) || (!((ComponentName)localObject).getPackageName().startsWith("com.excelliance"))) {
            break label225;
          }
          b("WxSplash.Splash", "it is dual open", new Object[0]);
        }
        sML.f(675L, 36L, 1L);
      }
      catch (IOException paramContext)
      {
        a(paramContext, "request fig leaf failed.");
        return;
      }
      Object localObject = a.cjM();
      File localFile = new File((String)localObject);
      if (!localFile.exists()) {
        localFile.mkdirs();
      }
      localObject = new File((String)localObject + "/main-process-blocking");
      if (((File)localObject).exists()) {
        ((File)localObject).delete();
      }
      if (!((File)localObject).createNewFile()) {
        break;
      }
      localObject = new Intent(paramContext, sMK);
      ((Intent)localObject).addFlags(268435456);
      paramContext.startActivity((Intent)localObject);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/splash/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */