package com.tencent.mm.aa;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.mm.bs.b;
import com.tencent.mm.bs.b.a;
import com.tencent.mm.bs.b.b;
import com.tencent.mm.bs.c.a;
import com.tencent.mm.bs.c.c;
import com.tencent.mm.cache.e.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.comm.a.g;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.h;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.wcdb.support.CancellationSignal;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.locks.LockSupport;

public final class f
{
  private static int dHi = 150;
  private static int dHj = 150;
  static final Map<String, Integer> dHm;
  private static a dHq = new a(dHj);
  private d dHk;
  b.b<Boolean> dHl;
  private k<c, String> dHn = new k() {};
  private Vector<WeakReference<c>> dHo = new Vector();
  private final c dHp = new c()
  {
    public final void jX(String paramAnonymousString)
    {
      Vector localVector2 = new Vector();
      x.d("MicroMsg.AvatarStorage", "notifyChanged user:%s clonesize:%d watchers:%d", new Object[] { paramAnonymousString, Integer.valueOf(f.a(f.this).size()), Integer.valueOf(f.a(f.this).size()) });
      Vector localVector3 = new Vector();
      Vector localVector1 = f.a(f.this);
      int i = 0;
      for (;;)
      {
        try
        {
          if (i < f.a(f.this).size())
          {
            WeakReference localWeakReference = (WeakReference)f.a(f.this).get(i);
            if (localWeakReference == null) {
              break label203;
            }
            f.c localc = (f.c)localWeakReference.get();
            if (localc != null) {
              localVector3.add(localc);
            } else {
              localVector2.add(localWeakReference);
            }
          }
        }
        finally {}
        f.a(f.this).removeAll(localVector2);
        i = 0;
        while (i < localVector3.size())
        {
          ((f.c)localVector3.get(i)).jX(paramAnonymousString);
          i += 1;
        }
        return;
        label203:
        i += 1;
      }
    }
  };
  
  static
  {
    HashMap localHashMap = new HashMap();
    dHm = localHashMap;
    localHashMap.put("voipapp", Integer.valueOf(a.g.default_voip));
    dHm.put("qqmail", Integer.valueOf(a.g.default_qqmail));
    dHm.put("fmessage", Integer.valueOf(a.g.default_fmessage));
    dHm.put("floatbottle", Integer.valueOf(a.g.default_bottle));
    dHm.put("lbsapp", Integer.valueOf(a.g.default_nearby));
    dHm.put("shakeapp", Integer.valueOf(a.g.default_shake));
    dHm.put("medianote", Integer.valueOf(a.g.default_medianote));
    dHm.put("qqfriend", Integer.valueOf(a.g.default_qqfriend));
    dHm.put("masssendapp", Integer.valueOf(a.g.default_masssend));
    dHm.put("feedsapp", Integer.valueOf(a.g.default_feedsapp));
    dHm.put("facebookapp", Integer.valueOf(a.g.default_facebookapp));
    dHm.put("newsapp", Integer.valueOf(a.g.default_readerapp));
    dHm.put("helper_entry", Integer.valueOf(a.g.default_plugin_icon_contract));
    dHm.put("voicevoipapp", Integer.valueOf(a.g.default_voicevoip));
    dHm.put("voiceinputapp", Integer.valueOf(a.g.default_voiceinput));
    dHm.put("officialaccounts", Integer.valueOf(a.g.default_brand_contact));
    dHm.put("service_officialaccounts", Integer.valueOf(a.g.default_servicebrand_contact));
    dHm.put("linkedinplugin", Integer.valueOf(a.g.default_linkedin));
    dHm.put("notifymessage", Integer.valueOf(a.g.default_notify_message_contact));
    dHm.put("appbrandcustomerservicemsg", Integer.valueOf(a.g.default_app_brand_service_msg));
  }
  
  public f()
  {
    reset();
    this.dHn.a(this.dHp, null);
    this.dHk = new d();
    this.dHl = new c.a(new c.c(com.tencent.mm.kernel.g.Ej().Dh(1)), com.tencent.mm.kernel.g.Ej().Dh(0));
  }
  
  public static boolean B(String paramString, boolean paramBoolean)
  {
    String str2 = com.tencent.mm.plugin.g.a.aqI();
    StringBuilder localStringBuilder = new StringBuilder("user_");
    if (paramBoolean) {}
    for (String str1 = "hd_";; str1 = "")
    {
      str1 = h.a(str2, str1, com.tencent.mm.a.g.u(paramString.getBytes()), ".png", 1, false);
      int i = str2.length();
      str2 = com.tencent.mm.kernel.g.Ei().dqp + "avatar/" + str1.substring(i);
      x.i("MicroMsg.AvatarStorage", "Removed avatar: %s, hd: %b, path: %s", new Object[] { paramString, Boolean.valueOf(paramBoolean), str1 });
      boolean bool1 = FileOp.deleteFile(str1);
      boolean bool2 = FileOp.deleteFile(str2) | bool1;
      bool1 = bool2;
      if (!paramBoolean) {
        bool1 = bool2 | d.eL(str1);
      }
      return bool1;
    }
  }
  
  public static void a(Context paramContext, ImageView paramImageView, int paramInt)
  {
    try
    {
      paramImageView.setImageBitmap(c.a(com.tencent.mm.compatible.g.a.decodeResource(paramContext.getResources(), paramInt), true, 1.0F));
      return;
    }
    catch (Exception paramContext)
    {
      x.e("MicroMsg.AvatarStorage", "exception:%s", new Object[] { bi.i(paramContext) });
    }
  }
  
  private WeakReference<c> c(c paramc)
  {
    Vector localVector = this.dHo;
    int i = 0;
    for (;;)
    {
      try
      {
        if (i < this.dHo.size())
        {
          WeakReference localWeakReference = (WeakReference)this.dHo.get(i);
          if (localWeakReference != null)
          {
            c localc = (c)localWeakReference.get();
            if ((localc != null) && (localc.equals(paramc))) {
              return localWeakReference;
            }
          }
        }
        else
        {
          return null;
        }
      }
      finally {}
      i += 1;
    }
  }
  
  public static Bitmap jS(String paramString)
  {
    Object localObject2;
    if (bi.oW(paramString)) {
      localObject2 = null;
    }
    do
    {
      return (Bitmap)localObject2;
      localObject1 = dHq;
      if (((a)localObject1).dGD != null) {}
      for (localObject1 = (Bitmap)((a)localObject1).dGD.get(paramString); localObject1 == null; localObject1 = (Bitmap)e.a.E("avatar_cache", paramString)) {
        return null;
      }
      localObject2 = localObject1;
    } while (!((Bitmap)localObject1).isRecycled());
    Object localObject1 = dHq;
    if (((a)localObject1).dGD != null) {
      ((a)localObject1).dGD.remove(paramString);
    }
    for (;;)
    {
      return null;
      e.a.F("avatar_cache", paramString);
    }
  }
  
  public static Bitmap jV(String paramString)
  {
    int i = 0;
    if (dHm.containsKey(paramString)) {
      i = ((Integer)dHm.get(paramString)).intValue();
    }
    if (i != 0) {
      q.KG();
    }
    for (paramString = com.tencent.mm.compatible.g.a.decodeResource(q.getContext().getResources(), i);; paramString = null) {
      return c.a(paramString, true, 1.0F, true);
    }
  }
  
  public static Bitmap jW(String paramString)
  {
    if (FileOp.cn(paramString)) {}
    for (Object localObject2 = c.a(paramString, null, 0, new int[] { 0, 1 });; localObject2 = null)
    {
      Object localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = d.jZ(paramString);
      }
      localObject2 = localObject1;
      int i;
      int j;
      if (q((Bitmap)localObject1))
      {
        i = ((Bitmap)localObject1).getWidth();
        j = ((Bitmap)localObject1).getHeight();
        localObject2 = localObject1;
        if (i != j) {
          if (i <= j) {
            break label184;
          }
        }
      }
      label184:
      for (localObject2 = Bitmap.createBitmap((Bitmap)localObject1, (i - j) / 2, 0, j, j); q((Bitmap)localObject2); localObject2 = Bitmap.createBitmap((Bitmap)localObject1, 0, (j - i) / 2, i, i))
      {
        localObject1 = com.tencent.mm.kernel.g.Ei().dqp + "avatar/";
        if (paramString.startsWith((String)localObject1))
        {
          i = ((String)localObject1).length();
          com.tencent.mm.sdk.f.e.b(new a(paramString, com.tencent.mm.kernel.g.Ei().cachePath + "avatar/" + paramString.substring(i)), "AvatarMigrate", 4);
        }
        return (Bitmap)localObject2;
      }
      return null;
    }
  }
  
  private static boolean q(Bitmap paramBitmap)
  {
    return (paramBitmap != null) && (!paramBitmap.isRecycled());
  }
  
  public static void reset()
  {
    if (dHq == null) {
      dHq = new a(dHj);
    }
  }
  
  final void Kt()
  {
    this.dHl.a(new b((byte)0));
  }
  
  public final void a(c paramc)
  {
    synchronized (this.dHo)
    {
      this.dHo.add(new WeakReference(paramc));
      return;
    }
  }
  
  public final boolean ad(String paramString1, String paramString2)
  {
    try
    {
      BitmapFactory.Options localOptions = c.VZ(paramString1);
      int k = localOptions.outWidth;
      int m = localOptions.outHeight;
      int j;
      int i;
      if (m < k)
      {
        j = k * 96 / m;
        i = 96;
      }
      for (;;)
      {
        x.d("MicroMsg.AvatarStorage", "inJustDecodeBounds old [w:%d h:%d]  new [w:%d h:%d] corner:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(1) });
        localOptions = new BitmapFactory.Options();
        localOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;
        localOptions.inSampleSize = Math.min(k / j, m / i);
        return f(paramString2, c.a(paramString1, localOptions, 0, new int[] { 0, 1 }));
        i = m * 96 / k;
        j = 96;
      }
      return false;
    }
    catch (Exception paramString1)
    {
      x.e("MicroMsg.AvatarStorage", "exception:%s", new Object[] { bi.i(paramString1) });
    }
  }
  
  public final void b(c paramc)
  {
    synchronized (this.dHo)
    {
      this.dHo.remove(c(paramc));
      return;
    }
  }
  
  public final Bitmap bJ(Context paramContext)
  {
    paramContext.getResources();
    Bitmap localBitmap = jS("I_AM_NO_SDCARD_USER_NAME");
    paramContext = localBitmap;
    if (!q(localBitmap))
    {
      paramContext = localBitmap;
      if (localBitmap != null)
      {
        x.i("MicroMsg.AvatarStorage", "not cached, recycled=%b, reload=%s", new Object[] { Boolean.valueOf(localBitmap.isRecycled()), "I_AM_NO_SDCARD_USER_NAME" });
        paramContext = c.a(localBitmap, true, 1.0F);
        e("I_AM_NO_SDCARD_USER_NAME", paramContext);
      }
    }
    return paramContext;
  }
  
  public final String c(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (bi.oW(paramString))
    {
      ??? = null;
      return (String)???;
    }
    ??? = com.tencent.mm.a.g.u(paramString.getBytes());
    Object localObject2 = new StringBuilder("user_");
    if (paramBoolean1)
    {
      paramString = "hd_";
      localObject2 = paramString + (String)??? + ".png";
      ??? = ((String)???).substring(0, 2) + '/' + ((String)???).substring(2, 4) + '/';
      paramString = com.tencent.mm.kernel.g.Ei().cachePath + "avatar/" + (String)??? + (String)localObject2;
      if ((paramBoolean2) || (FileOp.cn(paramString))) {
        break label336;
      }
      ??? = com.tencent.mm.kernel.g.Ei().dqp + "avatar/" + (String)??? + (String)localObject2;
      if (!FileOp.cn((String)???)) {
        break label336;
      }
      paramString = (String)???;
    }
    label336:
    for (;;)
    {
      if (FileOp.mL(new File(paramString).getParent()))
      {
        d locald = this.dHk;
        Long localLong = Long.valueOf(System.currentTimeMillis());
        x.d("MicroMsg.AvatarMigration", "Touch file: %s => %d", new Object[] { localObject2, localLong });
        synchronized (locald.dGH)
        {
          paramBoolean1 = locald.dGI.isEmpty();
          locald.dGI.put(localObject2, localLong);
          ??? = paramString;
          if (!paramBoolean1) {
            break;
          }
          x.d("MicroMsg.AvatarMigration", "Enqueue cache flusher task.");
          com.tencent.mm.kernel.g.Em().h(locald.dGK, 300000L);
          return paramString;
          paramString = "";
        }
      }
      return null;
    }
  }
  
  @Deprecated
  public final void d(c paramc)
  {
    this.dHn.a(paramc, Looper.getMainLooper());
  }
  
  @Deprecated
  public final void e(c paramc)
  {
    this.dHn.remove(paramc);
  }
  
  public final void e(String paramString, Bitmap paramBitmap)
  {
    a locala = dHq;
    if (locala.dGD != null) {
      locala.dGD.m(paramString, paramBitmap);
    }
    for (;;)
    {
      this.dHn.ci(paramString);
      this.dHn.doNotify();
      x.d("MicroMsg.AvatarStorage", "setToCache %s", new Object[] { paramString });
      return;
      e.a.a("avatar_cache", paramString, paramBitmap);
    }
  }
  
  /* Error */
  public final Bitmap f(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_2
    //   1: bipush 96
    //   3: bipush 96
    //   5: iconst_2
    //   6: newarray <illegal type>
    //   8: dup
    //   9: iconst_0
    //   10: iconst_0
    //   11: iastore
    //   12: dup
    //   13: iconst_1
    //   14: iconst_1
    //   15: iastore
    //   16: invokestatic 637	com/tencent/mm/sdk/platformtools/c:a	([BII[I)Landroid/graphics/Bitmap;
    //   19: astore 6
    //   21: aload 6
    //   23: invokestatic 446	com/tencent/mm/aa/f:q	(Landroid/graphics/Bitmap;)Z
    //   26: ifne +22 -> 48
    //   29: ldc_w 295
    //   32: ldc_w 639
    //   35: iconst_1
    //   36: anewarray 4	java/lang/Object
    //   39: dup
    //   40: iconst_0
    //   41: aload_1
    //   42: aastore
    //   43: invokestatic 356	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   46: aconst_null
    //   47: areturn
    //   48: aload 6
    //   50: invokevirtual 449	android/graphics/Bitmap:getWidth	()I
    //   53: istore_3
    //   54: aload 6
    //   56: invokevirtual 452	android/graphics/Bitmap:getHeight	()I
    //   59: istore 4
    //   61: aload 6
    //   63: astore 5
    //   65: iload_3
    //   66: iload 4
    //   68: if_icmpeq +27 -> 95
    //   71: iload_3
    //   72: iload 4
    //   74: if_icmple +80 -> 154
    //   77: aload 6
    //   79: iload_3
    //   80: iload 4
    //   82: isub
    //   83: iconst_2
    //   84: idiv
    //   85: iconst_0
    //   86: iload 4
    //   88: iload 4
    //   90: invokestatic 456	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   93: astore 5
    //   95: aload_0
    //   96: aload_1
    //   97: iconst_0
    //   98: iconst_1
    //   99: invokevirtual 641	com/tencent/mm/aa/f:c	(Ljava/lang/String;ZZ)Ljava/lang/String;
    //   102: astore 6
    //   104: aload 6
    //   106: invokestatic 645	com/tencent/mm/modelsfs/FileOp:jx	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   109: astore 7
    //   111: aload 7
    //   113: astore 6
    //   115: aload 7
    //   117: aload_2
    //   118: iconst_0
    //   119: aload_2
    //   120: arraylength
    //   121: invokevirtual 651	java/io/OutputStream:write	([BII)V
    //   124: aload 7
    //   126: ifnull +8 -> 134
    //   129: aload 7
    //   131: invokevirtual 654	java/io/OutputStream:close	()V
    //   134: ldc_w 295
    //   137: ldc_w 656
    //   140: iconst_1
    //   141: anewarray 4	java/lang/Object
    //   144: dup
    //   145: iconst_0
    //   146: aload_1
    //   147: aastore
    //   148: invokestatic 308	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   151: aload 5
    //   153: areturn
    //   154: aload 6
    //   156: iconst_0
    //   157: iload 4
    //   159: iload_3
    //   160: isub
    //   161: iconst_2
    //   162: idiv
    //   163: iload_3
    //   164: iload_3
    //   165: invokestatic 456	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   168: astore 5
    //   170: goto -75 -> 95
    //   173: astore_2
    //   174: aconst_null
    //   175: astore 7
    //   177: aload 7
    //   179: astore 6
    //   181: ldc_w 295
    //   184: aload_2
    //   185: ldc_w 658
    //   188: iconst_1
    //   189: anewarray 4	java/lang/Object
    //   192: dup
    //   193: iconst_0
    //   194: aload_1
    //   195: aastore
    //   196: invokestatic 662	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   199: aload 7
    //   201: ifnull +8 -> 209
    //   204: aload 7
    //   206: invokevirtual 654	java/io/OutputStream:close	()V
    //   209: aconst_null
    //   210: areturn
    //   211: astore_1
    //   212: aconst_null
    //   213: astore 6
    //   215: aload 6
    //   217: ifnull +8 -> 225
    //   220: aload 6
    //   222: invokevirtual 654	java/io/OutputStream:close	()V
    //   225: aload_1
    //   226: athrow
    //   227: astore_2
    //   228: goto -94 -> 134
    //   231: astore_1
    //   232: goto -23 -> 209
    //   235: astore_2
    //   236: goto -11 -> 225
    //   239: astore_1
    //   240: goto -25 -> 215
    //   243: astore_2
    //   244: goto -67 -> 177
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	247	0	this	f
    //   0	247	1	paramString	String
    //   0	247	2	paramArrayOfByte	byte[]
    //   53	112	3	i	int
    //   59	102	4	j	int
    //   63	106	5	localObject1	Object
    //   19	202	6	localObject2	Object
    //   109	96	7	localOutputStream	java.io.OutputStream
    // Exception table:
    //   from	to	target	type
    //   104	111	173	java/io/IOException
    //   104	111	211	finally
    //   129	134	227	java/io/IOException
    //   204	209	231	java/io/IOException
    //   220	225	235	java/io/IOException
    //   115	124	239	finally
    //   181	199	239	finally
    //   115	124	243	java/io/IOException
  }
  
  /* Error */
  final boolean f(String paramString, Bitmap paramBitmap)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokestatic 446	com/tencent/mm/aa/f:q	(Landroid/graphics/Bitmap;)Z
    //   4: ifne +5 -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_2
    //   10: invokevirtual 449	android/graphics/Bitmap:getWidth	()I
    //   13: bipush 96
    //   15: if_icmpne +102 -> 117
    //   18: aload_2
    //   19: invokevirtual 452	android/graphics/Bitmap:getHeight	()I
    //   22: bipush 96
    //   24: if_icmpne +93 -> 117
    //   27: aload_2
    //   28: astore 5
    //   30: aload_2
    //   31: astore 6
    //   33: aload 5
    //   35: ifnull +40 -> 75
    //   38: aload_2
    //   39: astore 6
    //   41: aload 5
    //   43: aload_2
    //   44: if_acmpeq +31 -> 75
    //   47: ldc_w 295
    //   50: ldc_w 666
    //   53: iconst_1
    //   54: anewarray 4	java/lang/Object
    //   57: dup
    //   58: iconst_0
    //   59: aload_2
    //   60: invokevirtual 667	java/lang/Object:toString	()Ljava/lang/String;
    //   63: aastore
    //   64: invokestatic 308	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   67: aload_2
    //   68: invokevirtual 670	android/graphics/Bitmap:recycle	()V
    //   71: aload 5
    //   73: astore 6
    //   75: aload_0
    //   76: aload_1
    //   77: iconst_0
    //   78: iconst_1
    //   79: invokevirtual 641	com/tencent/mm/aa/f:c	(Ljava/lang/String;ZZ)Ljava/lang/String;
    //   82: astore_2
    //   83: aload_2
    //   84: invokestatic 645	com/tencent/mm/modelsfs/FileOp:jx	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   87: astore_2
    //   88: aload 6
    //   90: getstatic 676	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   93: bipush 100
    //   95: aload_2
    //   96: invokevirtual 680	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   99: pop
    //   100: aload_2
    //   101: ifnull +7 -> 108
    //   104: aload_2
    //   105: invokevirtual 654	java/io/OutputStream:close	()V
    //   108: aload_0
    //   109: aload_1
    //   110: aload 6
    //   112: invokevirtual 543	com/tencent/mm/aa/f:e	(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    //   115: iconst_1
    //   116: ireturn
    //   117: aload_2
    //   118: invokevirtual 449	android/graphics/Bitmap:getWidth	()I
    //   121: istore_3
    //   122: aload_2
    //   123: invokevirtual 452	android/graphics/Bitmap:getHeight	()I
    //   126: istore 4
    //   128: iload_3
    //   129: iload 4
    //   131: if_icmpeq +59 -> 190
    //   134: iload_3
    //   135: iload 4
    //   137: if_icmple +35 -> 172
    //   140: aload_2
    //   141: iload_3
    //   142: iload 4
    //   144: isub
    //   145: iconst_2
    //   146: idiv
    //   147: iconst_0
    //   148: iload 4
    //   150: iload 4
    //   152: invokestatic 456	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   155: astore 5
    //   157: aload 5
    //   159: bipush 96
    //   161: bipush 96
    //   163: iconst_1
    //   164: invokestatic 684	android/graphics/Bitmap:createScaledBitmap	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   167: astore 5
    //   169: goto -139 -> 30
    //   172: aload_2
    //   173: iconst_0
    //   174: iload 4
    //   176: iload_3
    //   177: isub
    //   178: iconst_2
    //   179: idiv
    //   180: iload_3
    //   181: iload_3
    //   182: invokestatic 456	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   185: astore 5
    //   187: goto -30 -> 157
    //   190: aload_2
    //   191: bipush 96
    //   193: bipush 96
    //   195: iconst_1
    //   196: invokestatic 684	android/graphics/Bitmap:createScaledBitmap	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   199: astore 5
    //   201: goto -171 -> 30
    //   204: astore 5
    //   206: ldc_w 295
    //   209: ldc_w 686
    //   212: iconst_1
    //   213: anewarray 4	java/lang/Object
    //   216: dup
    //   217: iconst_0
    //   218: aload_1
    //   219: aastore
    //   220: invokestatic 356	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   223: aload_2
    //   224: invokestatic 446	com/tencent/mm/aa/f:q	(Landroid/graphics/Bitmap;)Z
    //   227: ifeq +27 -> 254
    //   230: ldc_w 295
    //   233: ldc_w 666
    //   236: iconst_1
    //   237: anewarray 4	java/lang/Object
    //   240: dup
    //   241: iconst_0
    //   242: aload_2
    //   243: invokevirtual 667	java/lang/Object:toString	()Ljava/lang/String;
    //   246: aastore
    //   247: invokestatic 308	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   250: aload_2
    //   251: invokevirtual 670	android/graphics/Bitmap:recycle	()V
    //   254: iconst_0
    //   255: ireturn
    //   256: astore 5
    //   258: aconst_null
    //   259: astore_2
    //   260: ldc_w 295
    //   263: aload 5
    //   265: ldc_w 658
    //   268: iconst_1
    //   269: anewarray 4	java/lang/Object
    //   272: dup
    //   273: iconst_0
    //   274: aload_1
    //   275: aastore
    //   276: invokestatic 662	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   279: aload_2
    //   280: ifnull +7 -> 287
    //   283: aload_2
    //   284: invokevirtual 654	java/io/OutputStream:close	()V
    //   287: iconst_0
    //   288: ireturn
    //   289: astore_1
    //   290: aconst_null
    //   291: astore_2
    //   292: aload_2
    //   293: ifnull +7 -> 300
    //   296: aload_2
    //   297: invokevirtual 654	java/io/OutputStream:close	()V
    //   300: aload_1
    //   301: athrow
    //   302: astore_2
    //   303: goto -195 -> 108
    //   306: astore_1
    //   307: goto -20 -> 287
    //   310: astore_2
    //   311: goto -11 -> 300
    //   314: astore_1
    //   315: goto -23 -> 292
    //   318: astore_1
    //   319: goto -27 -> 292
    //   322: astore 5
    //   324: goto -64 -> 260
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	327	0	this	f
    //   0	327	1	paramString	String
    //   0	327	2	paramBitmap	Bitmap
    //   121	61	3	i	int
    //   126	52	4	j	int
    //   28	172	5	localBitmap1	Bitmap
    //   204	1	5	localOutOfMemoryError	OutOfMemoryError
    //   256	8	5	localIOException1	java.io.IOException
    //   322	1	5	localIOException2	java.io.IOException
    //   31	80	6	localBitmap2	Bitmap
    // Exception table:
    //   from	to	target	type
    //   117	128	204	java/lang/OutOfMemoryError
    //   140	157	204	java/lang/OutOfMemoryError
    //   157	169	204	java/lang/OutOfMemoryError
    //   172	187	204	java/lang/OutOfMemoryError
    //   190	201	204	java/lang/OutOfMemoryError
    //   83	88	256	java/io/IOException
    //   83	88	289	finally
    //   104	108	302	java/io/IOException
    //   283	287	306	java/io/IOException
    //   296	300	310	java/io/IOException
    //   88	100	314	finally
    //   260	279	318	finally
    //   88	100	322	java/io/IOException
  }
  
  public final boolean g(String paramString, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = f(paramString, paramArrayOfByte);
    if (!q(paramArrayOfByte)) {
      return false;
    }
    e(paramString, paramArrayOfByte);
    return true;
  }
  
  public final Bitmap jT(String paramString)
  {
    return jW(c(paramString, false, false));
  }
  
  public final Bitmap jU(String paramString)
  {
    x.d("MicroMsg.AvatarStorage", "getHDBitmap user:%s", new Object[] { paramString });
    if (bi.oW(paramString)) {
      return null;
    }
    return c.a(c(paramString, true, false), 480, 480, null, 0, new int[] { 0, 1 });
  }
  
  private static final class a
    implements Runnable
  {
    private long bwo;
    private boolean dHs = false;
    private String dHt;
    private String dHu;
    
    a(String paramString1, String paramString2)
    {
      this.dHt = paramString1;
      this.dHu = paramString2;
      this.bwo = 100L;
    }
    
    public final void run()
    {
      if (this.bwo > 0L)
      {
        LockSupport.parkNanos(this.bwo * 1000000L);
        Thread.interrupted();
      }
      String str;
      if (this.dHs)
      {
        str = "DIR";
        x.i("MicroMsg.AvatarStorage", "Migrate avatar, [%s] %s => %s", new Object[] { str, this.dHt, this.dHu });
        if (!this.dHs) {
          break label90;
        }
        j.q(this.dHt, this.dHu, true);
      }
      label90:
      do
      {
        return;
        str = "FILE";
        break;
        FileOp.mL(new File(this.dHu).getParent());
      } while (FileOp.y(this.dHt, this.dHu) < 0L);
      FileOp.deleteFile(this.dHt);
    }
  }
  
  private final class b
    implements b.a<Boolean>
  {
    private Runnable dHv = new Runnable()
    {
      public final void run()
      {
        com.tencent.mm.sdk.f.e.b(f.b(f.this), "AvatarMigrate", 4);
      }
    };
    private CancellationSignal mCancellationSignal;
    
    private b() {}
  }
  
  public static abstract interface c
  {
    public abstract void jX(String paramString);
  }
  
  public static final class d
  {
    static boolean eL(String paramString)
    {
      FileOp.deleteFile(paramString + ".bm");
      FileOp.deleteFile(paramString);
      return true;
    }
    
    /* Error */
    public static boolean jY(String paramString)
    {
      // Byte code:
      //   0: iconst_1
      //   1: istore_1
      //   2: aload_0
      //   3: invokestatic 38	com/tencent/mm/aa/f$d:jZ	(Ljava/lang/String;)Landroid/graphics/Bitmap;
      //   6: astore 5
      //   8: aload 5
      //   10: ifnull +11 -> 21
      //   13: aload 5
      //   15: invokevirtual 44	android/graphics/Bitmap:isRecycled	()Z
      //   18: ifeq +7 -> 25
      //   21: iconst_0
      //   22: istore_1
      //   23: iload_1
      //   24: ireturn
      //   25: aconst_null
      //   26: astore_3
      //   27: aconst_null
      //   28: astore_2
      //   29: aload_0
      //   30: invokestatic 48	com/tencent/mm/modelsfs/FileOp:jx	(Ljava/lang/String;)Ljava/io/OutputStream;
      //   33: astore 4
      //   35: aload 4
      //   37: astore_2
      //   38: aload 4
      //   40: astore_3
      //   41: aload 5
      //   43: getstatic 54	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
      //   46: bipush 100
      //   48: aload 4
      //   50: invokevirtual 58	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
      //   53: pop
      //   54: aload 4
      //   56: astore_2
      //   57: aload 4
      //   59: astore_3
      //   60: new 11	java/lang/StringBuilder
      //   63: dup
      //   64: invokespecial 15	java/lang/StringBuilder:<init>	()V
      //   67: aload_0
      //   68: invokevirtual 19	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   71: ldc 21
      //   73: invokevirtual 19	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   76: invokevirtual 25	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   79: invokestatic 30	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
      //   82: pop
      //   83: aload 4
      //   85: ifnull -62 -> 23
      //   88: aload 4
      //   90: invokevirtual 63	java/io/OutputStream:close	()V
      //   93: iconst_1
      //   94: ireturn
      //   95: astore_0
      //   96: iconst_1
      //   97: ireturn
      //   98: astore 4
      //   100: aload_2
      //   101: astore_3
      //   102: ldc 65
      //   104: aload 4
      //   106: ldc 67
      //   108: iconst_1
      //   109: anewarray 4	java/lang/Object
      //   112: dup
      //   113: iconst_0
      //   114: aload_0
      //   115: aastore
      //   116: invokestatic 73	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   119: aload_2
      //   120: ifnull +7 -> 127
      //   123: aload_2
      //   124: invokevirtual 63	java/io/OutputStream:close	()V
      //   127: iconst_0
      //   128: ireturn
      //   129: astore_0
      //   130: aload_3
      //   131: ifnull +7 -> 138
      //   134: aload_3
      //   135: invokevirtual 63	java/io/OutputStream:close	()V
      //   138: aload_0
      //   139: athrow
      //   140: astore_0
      //   141: goto -14 -> 127
      //   144: astore_2
      //   145: goto -7 -> 138
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	148	0	paramString	String
      //   1	23	1	bool	boolean
      //   28	96	2	localObject1	Object
      //   144	1	2	localIOException1	java.io.IOException
      //   26	109	3	localObject2	Object
      //   33	56	4	localOutputStream	java.io.OutputStream
      //   98	7	4	localIOException2	java.io.IOException
      //   6	36	5	localBitmap	Bitmap
      // Exception table:
      //   from	to	target	type
      //   88	93	95	java/io/IOException
      //   29	35	98	java/io/IOException
      //   41	54	98	java/io/IOException
      //   60	83	98	java/io/IOException
      //   29	35	129	finally
      //   41	54	129	finally
      //   60	83	129	finally
      //   102	119	129	finally
      //   123	127	140	java/io/IOException
      //   134	138	144	java/io/IOException
    }
    
    /* Error */
    public static Bitmap jZ(String paramString)
    {
      // Byte code:
      //   0: new 11	java/lang/StringBuilder
      //   3: dup
      //   4: invokespecial 15	java/lang/StringBuilder:<init>	()V
      //   7: aload_0
      //   8: invokevirtual 19	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   11: ldc 21
      //   13: invokevirtual 19	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   16: invokevirtual 25	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   19: astore 8
      //   21: aload 8
      //   23: invokestatic 80	com/tencent/mm/modelsfs/FileOp:cn	(Ljava/lang/String;)Z
      //   26: ifne +21 -> 47
      //   29: ldc 65
      //   31: ldc 82
      //   33: iconst_1
      //   34: anewarray 4	java/lang/Object
      //   37: dup
      //   38: iconst_0
      //   39: aload 8
      //   41: aastore
      //   42: invokestatic 85	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   45: aconst_null
      //   46: areturn
      //   47: aload 8
      //   49: invokestatic 89	com/tencent/mm/modelsfs/FileOp:mI	(Ljava/lang/String;)J
      //   52: l2i
      //   53: istore_1
      //   54: iload_1
      //   55: ifle +15 -> 70
      //   58: iload_1
      //   59: ldc 90
      //   61: if_icmpeq +95 -> 156
      //   64: iload_1
      //   65: ldc 91
      //   67: if_icmpeq +89 -> 156
      //   70: aload_0
      //   71: invokestatic 93	com/tencent/mm/aa/f$d:eL	(Ljava/lang/String;)Z
      //   74: pop
      //   75: ldc 65
      //   77: ldc 95
      //   79: iconst_2
      //   80: anewarray 4	java/lang/Object
      //   83: dup
      //   84: iconst_0
      //   85: iload_1
      //   86: invokestatic 101	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   89: aastore
      //   90: dup
      //   91: iconst_1
      //   92: aload 8
      //   94: aastore
      //   95: invokestatic 104	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   98: aconst_null
      //   99: areturn
      //   100: astore 7
      //   102: aconst_null
      //   103: astore_0
      //   104: aconst_null
      //   105: astore 5
      //   107: ldc 65
      //   109: ldc 106
      //   111: iconst_2
      //   112: anewarray 4	java/lang/Object
      //   115: dup
      //   116: iconst_0
      //   117: aload 7
      //   119: invokevirtual 109	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   122: aastore
      //   123: dup
      //   124: iconst_1
      //   125: aload 8
      //   127: aastore
      //   128: invokestatic 104	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   131: aload_0
      //   132: ifnull +9 -> 141
      //   135: aload_0
      //   136: invokeinterface 112 1 0
      //   141: aload 5
      //   143: ifnull +304 -> 447
      //   146: aload 5
      //   148: invokevirtual 115	java/io/InputStream:close	()V
      //   151: aconst_null
      //   152: areturn
      //   153: astore_0
      //   154: aconst_null
      //   155: areturn
      //   156: aload 8
      //   158: invokestatic 119	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
      //   161: astore 5
      //   163: aload 5
      //   165: invokestatic 125	java/nio/channels/Channels:newChannel	(Ljava/io/InputStream;)Ljava/nio/channels/ReadableByteChannel;
      //   168: astore 6
      //   170: ldc 90
      //   172: invokestatic 131	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
      //   175: astore 7
      //   177: aload 6
      //   179: aload 7
      //   181: invokeinterface 135 2 0
      //   186: pop
      //   187: aload 7
      //   189: iconst_0
      //   190: invokevirtual 139	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
      //   193: pop
      //   194: iload_1
      //   195: ldc 91
      //   197: if_icmpne +244 -> 441
      //   200: bipush 16
      //   202: invokestatic 131	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
      //   205: astore 9
      //   207: aload 6
      //   209: aload 9
      //   211: invokeinterface 135 2 0
      //   216: pop
      //   217: aload 9
      //   219: iconst_0
      //   220: invokevirtual 143	java/nio/ByteBuffer:getLong	(I)J
      //   223: lstore_2
      //   224: lload_2
      //   225: lconst_1
      //   226: lcmp
      //   227: ifeq +230 -> 457
      //   230: ldc 65
      //   232: ldc -111
      //   234: iconst_3
      //   235: anewarray 4	java/lang/Object
      //   238: dup
      //   239: iconst_0
      //   240: lload_2
      //   241: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   244: aastore
      //   245: dup
      //   246: iconst_1
      //   247: iload_1
      //   248: invokestatic 101	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   251: aastore
      //   252: dup
      //   253: iconst_2
      //   254: aload 8
      //   256: aastore
      //   257: invokestatic 104	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   260: aload 6
      //   262: invokeinterface 112 1 0
      //   267: aload 5
      //   269: invokevirtual 115	java/io/InputStream:close	()V
      //   272: aload_0
      //   273: invokestatic 93	com/tencent/mm/aa/f$d:eL	(Ljava/lang/String;)Z
      //   276: pop
      //   277: aconst_null
      //   278: areturn
      //   279: ldc 65
      //   281: ldc -104
      //   283: iconst_3
      //   284: anewarray 4	java/lang/Object
      //   287: dup
      //   288: iconst_0
      //   289: iload_1
      //   290: invokestatic 101	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   293: aastore
      //   294: dup
      //   295: iconst_1
      //   296: iload 4
      //   298: invokestatic 157	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   301: aastore
      //   302: dup
      //   303: iconst_2
      //   304: aload 8
      //   306: aastore
      //   307: invokestatic 85	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   310: aload 6
      //   312: invokeinterface 112 1 0
      //   317: aload 5
      //   319: invokevirtual 115	java/io/InputStream:close	()V
      //   322: bipush 96
      //   324: bipush 96
      //   326: getstatic 163	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
      //   329: invokestatic 167	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
      //   332: astore_0
      //   333: aload_0
      //   334: aload 7
      //   336: invokevirtual 171	android/graphics/Bitmap:copyPixelsFromBuffer	(Ljava/nio/Buffer;)V
      //   339: iload 4
      //   341: ifeq +42 -> 383
      //   344: aload_0
      //   345: bipush 9
      //   347: bipush 9
      //   349: bipush 78
      //   351: bipush 78
      //   353: invokestatic 174	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
      //   356: astore 5
      //   358: ldc 65
      //   360: ldc -80
      //   362: iconst_1
      //   363: anewarray 4	java/lang/Object
      //   366: dup
      //   367: iconst_0
      //   368: aload_0
      //   369: invokevirtual 177	java/lang/Object:toString	()Ljava/lang/String;
      //   372: aastore
      //   373: invokestatic 180	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   376: aload_0
      //   377: invokevirtual 183	android/graphics/Bitmap:recycle	()V
      //   380: aload 5
      //   382: areturn
      //   383: aload_0
      //   384: areturn
      //   385: astore 7
      //   387: aconst_null
      //   388: astore_0
      //   389: aconst_null
      //   390: astore 5
      //   392: ldc 65
      //   394: ldc -71
      //   396: iconst_2
      //   397: anewarray 4	java/lang/Object
      //   400: dup
      //   401: iconst_0
      //   402: aload 7
      //   404: invokevirtual 186	java/lang/OutOfMemoryError:getMessage	()Ljava/lang/String;
      //   407: aastore
      //   408: dup
      //   409: iconst_1
      //   410: aload 8
      //   412: aastore
      //   413: invokestatic 104	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   416: goto -285 -> 131
      //   419: astore 7
      //   421: aconst_null
      //   422: astore_0
      //   423: goto -31 -> 392
      //   426: astore 7
      //   428: aload 6
      //   430: astore_0
      //   431: goto -39 -> 392
      //   434: astore 7
      //   436: aconst_null
      //   437: astore_0
      //   438: goto -331 -> 107
      //   441: iconst_1
      //   442: istore 4
      //   444: goto -165 -> 279
      //   447: aconst_null
      //   448: areturn
      //   449: astore 7
      //   451: aload 6
      //   453: astore_0
      //   454: goto -347 -> 107
      //   457: iconst_0
      //   458: istore 4
      //   460: goto -181 -> 279
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	463	0	paramString	String
      //   53	237	1	i	int
      //   223	18	2	l	long
      //   296	163	4	bool	boolean
      //   105	286	5	localObject	Object
      //   168	284	6	localReadableByteChannel	java.nio.channels.ReadableByteChannel
      //   100	18	7	localException1	Exception
      //   175	160	7	localByteBuffer1	java.nio.ByteBuffer
      //   385	18	7	localOutOfMemoryError1	OutOfMemoryError
      //   419	1	7	localOutOfMemoryError2	OutOfMemoryError
      //   426	1	7	localOutOfMemoryError3	OutOfMemoryError
      //   434	1	7	localException2	Exception
      //   449	1	7	localException3	Exception
      //   19	392	8	str	String
      //   205	13	9	localByteBuffer2	java.nio.ByteBuffer
      // Exception table:
      //   from	to	target	type
      //   21	45	100	java/lang/Exception
      //   47	54	100	java/lang/Exception
      //   70	98	100	java/lang/Exception
      //   156	163	100	java/lang/Exception
      //   322	339	100	java/lang/Exception
      //   344	380	100	java/lang/Exception
      //   135	141	153	java/lang/Exception
      //   146	151	153	java/lang/Exception
      //   21	45	385	java/lang/OutOfMemoryError
      //   47	54	385	java/lang/OutOfMemoryError
      //   70	98	385	java/lang/OutOfMemoryError
      //   156	163	385	java/lang/OutOfMemoryError
      //   322	339	385	java/lang/OutOfMemoryError
      //   344	380	385	java/lang/OutOfMemoryError
      //   163	170	419	java/lang/OutOfMemoryError
      //   317	322	419	java/lang/OutOfMemoryError
      //   170	194	426	java/lang/OutOfMemoryError
      //   200	224	426	java/lang/OutOfMemoryError
      //   230	277	426	java/lang/OutOfMemoryError
      //   279	317	426	java/lang/OutOfMemoryError
      //   163	170	434	java/lang/Exception
      //   317	322	434	java/lang/Exception
      //   170	194	449	java/lang/Exception
      //   200	224	449	java/lang/Exception
      //   230	277	449	java/lang/Exception
      //   279	317	449	java/lang/Exception
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/aa/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */