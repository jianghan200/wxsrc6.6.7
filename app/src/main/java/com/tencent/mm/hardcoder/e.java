package com.tencent.mm.hardcoder;

import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;

public final class e
  implements d.a
{
  private static String dkY = null;
  private static Long dkZ = null;
  public static boolean dla = false;
  
  /* Error */
  private static void fy(String paramString)
  {
    // Byte code:
    //   0: getstatic 20	com/tencent/mm/hardcoder/e:dla	Z
    //   3: ifne +4 -> 7
    //   6: return
    //   7: new 30	java/lang/StringBuilder
    //   10: dup
    //   11: invokespecial 31	java/lang/StringBuilder:<init>	()V
    //   14: astore_1
    //   15: invokestatic 37	com/tencent/mm/kernel/g:Ek	()Lcom/tencent/mm/kernel/g;
    //   18: pop
    //   19: aload_1
    //   20: invokestatic 41	com/tencent/mm/kernel/g:Ei	()Lcom/tencent/mm/kernel/e;
    //   23: getfield 46	com/tencent/mm/kernel/e:dqo	Ljava/lang/String;
    //   26: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: ldc 52
    //   31: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: invokevirtual 56	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   37: astore_1
    //   38: iconst_1
    //   39: anewarray 58	java/lang/String
    //   42: dup
    //   43: iconst_0
    //   44: aload_1
    //   45: aastore
    //   46: invokestatic 64	com/tencent/mm/a/e:d	([Ljava/lang/String;)V
    //   49: new 66	java/io/File
    //   52: dup
    //   53: aload_1
    //   54: ldc 68
    //   56: invokespecial 71	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   59: astore_1
    //   60: aload_1
    //   61: invokevirtual 75	java/io/File:exists	()Z
    //   64: ifne +8 -> 72
    //   67: aload_1
    //   68: invokevirtual 78	java/io/File:createNewFile	()Z
    //   71: pop
    //   72: new 80	java/io/FileOutputStream
    //   75: dup
    //   76: aload_1
    //   77: iconst_1
    //   78: invokespecial 83	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   81: astore_2
    //   82: aload_2
    //   83: astore_1
    //   84: aload_2
    //   85: new 30	java/lang/StringBuilder
    //   88: dup
    //   89: invokespecial 31	java/lang/StringBuilder:<init>	()V
    //   92: aload_0
    //   93: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: ldc 85
    //   98: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: invokevirtual 56	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: ldc 87
    //   106: invokevirtual 91	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   109: invokevirtual 97	java/io/OutputStream:write	([B)V
    //   112: aload_2
    //   113: astore_1
    //   114: aload_2
    //   115: invokevirtual 100	java/io/OutputStream:flush	()V
    //   118: aload_2
    //   119: invokevirtual 103	java/io/OutputStream:close	()V
    //   122: return
    //   123: astore_0
    //   124: ldc 105
    //   126: new 30	java/lang/StringBuilder
    //   129: dup
    //   130: ldc 107
    //   132: invokespecial 109	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   135: aload_0
    //   136: invokevirtual 112	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   139: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: invokevirtual 56	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   145: invokestatic 117	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   148: return
    //   149: astore_2
    //   150: ldc 105
    //   152: new 30	java/lang/StringBuilder
    //   155: dup
    //   156: ldc 119
    //   158: invokespecial 109	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   161: aload_2
    //   162: invokevirtual 112	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   165: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: invokevirtual 56	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: invokestatic 117	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   174: goto -102 -> 72
    //   177: astore_3
    //   178: aconst_null
    //   179: astore_0
    //   180: aload_0
    //   181: astore_1
    //   182: ldc 105
    //   184: new 30	java/lang/StringBuilder
    //   187: dup
    //   188: ldc 121
    //   190: invokespecial 109	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   193: aload_3
    //   194: invokevirtual 112	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   197: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: invokevirtual 56	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   203: invokestatic 117	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   206: aload_0
    //   207: ifnull -201 -> 6
    //   210: aload_0
    //   211: invokevirtual 103	java/io/OutputStream:close	()V
    //   214: return
    //   215: astore_0
    //   216: ldc 105
    //   218: new 30	java/lang/StringBuilder
    //   221: dup
    //   222: ldc 107
    //   224: invokespecial 109	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   227: aload_0
    //   228: invokevirtual 112	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   231: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: invokevirtual 56	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   237: invokestatic 117	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   240: return
    //   241: astore_0
    //   242: aconst_null
    //   243: astore_1
    //   244: aload_1
    //   245: ifnull +7 -> 252
    //   248: aload_1
    //   249: invokevirtual 103	java/io/OutputStream:close	()V
    //   252: aload_0
    //   253: athrow
    //   254: astore_1
    //   255: ldc 105
    //   257: new 30	java/lang/StringBuilder
    //   260: dup
    //   261: ldc 107
    //   263: invokespecial 109	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   266: aload_1
    //   267: invokevirtual 112	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   270: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   273: invokevirtual 56	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   276: invokestatic 117	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   279: goto -27 -> 252
    //   282: astore_0
    //   283: goto -39 -> 244
    //   286: astore_3
    //   287: aload_2
    //   288: astore_0
    //   289: goto -109 -> 180
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	292	0	paramString	String
    //   14	235	1	localObject	Object
    //   254	13	1	localException1	Exception
    //   81	38	2	localFileOutputStream	java.io.FileOutputStream
    //   149	139	2	localException2	Exception
    //   177	17	3	localException3	Exception
    //   286	1	3	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   118	122	123	java/lang/Exception
    //   67	72	149	java/lang/Exception
    //   72	82	177	java/lang/Exception
    //   210	214	215	java/lang/Exception
    //   72	82	241	finally
    //   248	252	254	java/lang/Exception
    //   84	112	282	finally
    //   114	118	282	finally
    //   182	206	282	finally
    //   84	112	286	java/lang/Exception
    //   114	118	286	java/lang/Exception
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, int paramInt7, int paramInt8, int[] paramArrayOfInt1, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, long paramLong2, int[] paramArrayOfInt2, int[] paramArrayOfInt3)
  {
    if ((com.tencent.mm.sdk.platformtools.x.getLogLevel() > 1) && (!HardCoderJNI.hcKVPerReport)) {
      return;
    }
    if (dkZ == null)
    {
      g.Ek();
      dkZ = (Long)g.Ei().DT().get(aa.a.sVO, Long.valueOf(0L));
    }
    if (dkY == null) {
      dkY = bi.fP(ad.getContext());
    }
    String str = dkY;
    int m = (int)dkZ.longValue();
    Object localObject1 = new StringBuilder();
    int j;
    int i;
    int k;
    if (paramArrayOfInt1 != null)
    {
      j = paramArrayOfInt1.length;
      i = 0;
      while (i < j)
      {
        k = paramArrayOfInt1[i];
        ((StringBuilder)localObject1).append(k + "#");
        i += 1;
      }
    }
    paramArrayOfInt1 = new StringBuilder();
    int n;
    if (paramArrayOfInt2 != null)
    {
      n = paramArrayOfInt2.length;
      i = 0;
      while (i < n)
      {
        k = paramArrayOfInt2[i];
        localObject2 = new StringBuilder();
        j = k;
        if (k < 0) {
          j = 0;
        }
        paramArrayOfInt1.append(j + "#");
        i += 1;
      }
    }
    paramArrayOfInt2 = new StringBuilder();
    if (paramArrayOfInt3 != null)
    {
      n = paramArrayOfInt3.length;
      i = 0;
      while (i < n)
      {
        k = paramArrayOfInt3[i];
        localObject2 = new StringBuilder();
        j = k;
        if (k < 0) {
          j = 0;
        }
        paramArrayOfInt2.append(j + "#");
        i += 1;
      }
    }
    Object localObject2 = String.format("[oneliang]performance report,imei:%s,threadId:%s,enable:%s, heavy:%s,speedUp:%s,engineStatus:%s,cancelInDelay:%s,scene:%s,action:%s,cpuLevel:%s,ioLevel:%s,bindCoreIds:%s,executeTime:%s,runtime:%s,threadJiffies:%s, phonePower:%s, phoneHZ:%s, processJiffies:%s,cpuLevelTimeArray:%s, ioLevelTimeArray:%s", new Object[] { str, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(m), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5), Integer.valueOf(paramInt6), Long.valueOf(paramLong1), Integer.valueOf(paramInt7), Integer.valueOf(paramInt8), ((StringBuilder)localObject1).toString(), Integer.valueOf(paramInt9), Integer.valueOf(paramInt10), Integer.valueOf(paramInt11), Integer.valueOf(paramInt12), Integer.valueOf(paramInt13), Long.valueOf(paramLong2), paramArrayOfInt1.toString(), paramArrayOfInt2.toString() });
    paramArrayOfInt3 = String.format("time:%s,imei:%s,threadId:%s,enable:%s,heavy:%s,speedUp:%s,cancelInDelay:%s,scene:%s,action:%s,cpuLevel:%s,ioLevel:%s,bindCoreIds:%s,executeTime:%s,runtime:%s,threadJiffies:%s, phonePower:%s, phoneHZ:%s, processJiffies:%s,cpuLevelTimeArray:%s, ioLevelTimeArray:%s", new Object[] { Long.valueOf(System.currentTimeMillis()), str, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(m), Integer.valueOf(paramInt3), Integer.valueOf(paramInt5), Integer.valueOf(paramInt6), Long.valueOf(paramLong1), Integer.valueOf(paramInt7), Integer.valueOf(paramInt8), ((StringBuilder)localObject1).toString(), Integer.valueOf(paramInt9), Integer.valueOf(paramInt10), Integer.valueOf(paramInt11), Integer.valueOf(paramInt12), Integer.valueOf(paramInt13), Long.valueOf(paramLong2), paramArrayOfInt1.toString(), paramArrayOfInt2.toString() });
    if (HardCoderJNI.hcDebug) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.HardCoderReporterImpl", (String)localObject2);
    }
    localObject2 = h.mEJ;
    localObject1 = ((StringBuilder)localObject1).toString();
    paramInt1 = paramInt9;
    if (paramInt9 < 0) {
      paramInt1 = 0;
    }
    ((h)localObject2).h(14607, new Object[] { str, Integer.valueOf(m), Integer.valueOf(paramInt3), Integer.valueOf(paramInt5), Integer.valueOf(paramInt6), Long.valueOf(paramLong1), Integer.valueOf(paramInt7), Integer.valueOf(paramInt8), localObject1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt10), Integer.valueOf(paramInt11), Integer.valueOf(paramInt12), Integer.valueOf(paramInt13), Long.valueOf(paramLong2), paramArrayOfInt1.toString(), paramArrayOfInt2.toString(), "", Integer.valueOf(0), Integer.valueOf(paramInt4), Integer.valueOf(paramInt2) });
    fy(paramArrayOfInt3);
  }
  
  public final void a(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4)
  {
    if (dkY == null) {
      dkY = bi.fP(ad.getContext());
    }
    String str1 = dkY;
    long l = paramLong;
    if (paramLong <= 0L) {
      l = System.currentTimeMillis();
    }
    String str2 = String.format("errorReport imei:%s,callbackType:%s,errorTimestamp:%s,errCode:%s,funcId:%s,dataType:%s", new Object[] { str1, Integer.valueOf(paramInt1), Long.valueOf(l), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    String str3 = String.format("time:%s,imei:%s,callbackType:%s,errorTimestamp:%s,errCode:%s,funcId:%s,dataType:%s", new Object[] { Long.valueOf(System.currentTimeMillis()), str1, Integer.valueOf(paramInt1), Long.valueOf(l), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.HardCoderReporterImpl", str2);
    h.mEJ.h(14610, new Object[] { str1, Integer.valueOf(paramInt1), Long.valueOf(l), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    fy(str3);
  }
  
  public final void a(int paramInt1, long paramLong1, int paramInt2, long paramLong2, long paramLong3)
  {
    if (dkZ == null)
    {
      g.Ek();
      dkZ = (Long)g.Ei().DT().get(aa.a.sVO, Long.valueOf(0L));
    }
    if (dkY == null) {
      dkY = bi.fP(ad.getContext());
    }
    String str = dkY;
    int k = (int)dkZ.longValue();
    int i;
    int m;
    if (HardCoderJNI.isHCEnable())
    {
      i = 1;
      m = HardCoderJNI.isRunning();
      if (!HardCoderJNI.hcEnable) {
        break label313;
      }
    }
    label313:
    for (int j = 1;; j = 0)
    {
      if (paramInt2 == 1)
      {
        long l = 100L * paramLong2 / paramLong3;
        h.mEJ.h(15187, new Object[] { str, Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(m), Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Integer.valueOf(paramInt2), Long.valueOf(paramLong2), Long.valueOf(paramLong3), Long.valueOf(l), Integer.valueOf(j) });
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.HardCoderReporterImpl", String.format("fpsReport imei:%s enable:%s, heavy:%s speedUp:%s, engineStatus:%s, scene:%s, action:%s, type:%s, totalDroppedFrames:%s, interval:%s, average:%s", new Object[] { str, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(m), Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Integer.valueOf(paramInt2), Long.valueOf(paramLong2), Long.valueOf(paramLong3), Long.valueOf(l) }));
      }
      return;
      i = 0;
      break;
    }
  }
  
  public final void reportIDKey(boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.HardCoderReporterImpl", "reportIDKey feature[%b] key[%d], value[%d]", new Object[] { Boolean.valueOf(paramBoolean1), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean2) });
    h localh = h.mEJ;
    if (paramBoolean1) {}
    for (long l = 678L;; l = 679L)
    {
      localh.a(l, paramInt1, paramInt2, paramBoolean2);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/hardcoder/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */