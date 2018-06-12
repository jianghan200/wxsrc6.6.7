package com.tencent.mm.plugin.report.service;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mars.BaseEvent;
import com.tencent.mars.smc.IDKey;
import com.tencent.mars.smc.SmcLogic;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.lw;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

public enum h
  implements com.tencent.mm.plugin.report.d
{
  private long mEK = 0L;
  private int mEL;
  private HashMap<String, Long> mEM;
  private int mEN;
  private int mEO;
  private long mEP;
  private volatile boolean mEQ;
  private int uin;
  
  private h()
  {
    if (ad.cic())
    {
      com.tencent.mm.kernel.g.Em().H(new Runnable()
      {
        public final void run()
        {
          h.a(h.this);
        }
      });
      localObject = new Runnable()
      {
        public final void run()
        {
          h.b(h.this);
        }
      };
      com.tencent.mm.sdk.b.a.sFg.a(new com.tencent.mm.sdk.b.c() {});
      com.tencent.mm.kernel.g.DF().a(701, new com.tencent.mm.ab.e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          if (paramAnonymousInt1 != 0) {
            return;
          }
          com.tencent.mm.kernel.g.Em().h(localObject, 5000L);
        }
      });
    }
  }
  
  public static Object a(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3)
  {
    return f.a(paramInt1, paramArrayOfInt, paramInt2, paramInt3);
  }
  
  private void a(final String paramString, final Callable<JSONArray> paramCallable)
  {
    final long l1 = System.currentTimeMillis();
    Long localLong;
    Object localObject;
    int i;
    if (this.mEM != null)
    {
      localLong = (Long)this.mEM.get(paramString);
      if (localLong == null) {
        break label299;
      }
      localObject = com.tencent.mm.a.g.v((paramString + this.uin + l1).getBytes());
      if ((localObject == null) || (localObject.length != 16)) {
        break label299;
      }
      long l2 = localObject[0] + localObject[4] + localObject[8] + localObject[12];
      long l3 = localObject[1] + localObject[5] + localObject[9] + localObject[13];
      long l4 = localObject[2] + localObject[6] + localObject[10] + localObject[14];
      i = localObject[3];
      int j = localObject[7];
      int k = localObject[11];
      l2 = l2 & 0xFF | (l3 & 0xFF) << 8 | (l4 & 0xFF) << 16 | (localObject[15] + (i + j + k) & 0xFF) << 24;
      if (l2 >= localLong.longValue()) {
        break label286;
      }
      i = 1;
      label232:
      if (i == 0) {
        break label291;
      }
      localObject = "hit";
      label241:
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.cLog", "[%s] Sampling %s: 0x%08x / 0x%08x", new Object[] { paramString, localObject, Long.valueOf(l2), localLong });
    }
    for (;;)
    {
      if (i != 0) {
        break label320;
      }
      return;
      localLong = null;
      break;
      label286:
      i = 0;
      break label232;
      label291:
      localObject = "miss";
      break label241;
      label299:
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.cLog", "[%s] Sampling hit: (default)", new Object[] { paramString });
      i = 1;
    }
    label320:
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        Object localObject1 = null;
        int i;
        if ((ad.cic()) && (com.tencent.mm.kernel.g.Eg().Dx()))
        {
          com.tencent.mm.kernel.g.Eg();
          i = com.tencent.mm.kernel.a.Df();
          if (com.tencent.mm.kernel.g.Ei().DT() != null) {}
        }
        try
        {
          for (;;)
          {
            localObject3 = ad.getContext().getSharedPreferences("system_config_prefs", 0).getString("support.weixin.qq.com", "support.weixin.qq.com");
            localObject2 = (JSONArray)paramCallable.call();
            int k = ((JSONArray)localObject2).length();
            j = 0;
            while (j < k)
            {
              localObject4 = ((JSONArray)localObject2).getJSONObject(j);
              ((JSONObject)localObject4).put("tag", paramString);
              ((JSONObject)localObject4).put("uin", i);
              j += 1;
            }
            localObject1 = com.tencent.mm.model.q.GF();
            continue;
            localObject1 = null;
            i = 0;
          }
          Object localObject2 = new JSONObject().put("head", new JSONObject().put("protocol_ver", 1).put("phone", com.tencent.mm.protocal.d.DEVICE_NAME).put("os_ver", com.tencent.mm.protocal.d.DEVICE_TYPE).put("report_time", l1).put("revision", bi.oV(com.tencent.mm.sdk.platformtools.d.REV))).put("items", localObject2).toString().getBytes();
          int j = localObject2.length;
          Object localObject4 = com.tencent.mm.a.g.u(String.format("weixin#$()%d%d", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.qVN), Integer.valueOf(j) }).getBytes()).toLowerCase();
          byte[] arrayOfByte = com.tencent.mm.a.q.r((byte[])localObject2);
          localObject2 = new PByteArray();
          com.tencent.mm.a.c.a((PByteArray)localObject2, arrayOfByte, ((String)localObject4).getBytes());
          Object localObject3 = new StringBuilder(256).append("http://").append((String)localObject3).append("/cgi-bin/mmsupport-bin/stackreport?version=").append(Integer.toHexString(com.tencent.mm.protocal.d.qVN)).append("&devicetype=").append(com.tencent.mm.protocal.d.DEVICE_TYPE).append("&filelength=").append(j).append("&sum=").append((String)localObject4).append("&reporttype=1&NewReportType=110");
          if ((localObject1 != null) && (((String)localObject1).length() != 0)) {
            ((StringBuilder)localObject3).append("&username=").append((String)localObject1);
          }
          if (i != 0) {
            ((StringBuilder)localObject3).append("&uin=").append(i);
          }
          localObject3 = ((StringBuilder)localObject3).toString();
          localObject1 = new DefaultHttpClient();
          localObject3 = new HttpPost((String)localObject3);
          localObject2 = new ByteArrayEntity(((PByteArray)localObject2).value);
          ((ByteArrayEntity)localObject2).setContentType("binary/octet-stream");
          ((HttpPost)localObject3).setEntity((HttpEntity)localObject2);
          localObject1 = bi.convertStreamToString(((HttpClient)localObject1).execute((HttpUriRequest)localObject3).getEntity().getContent());
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.cLog", "POST returned: " + (String)localObject1);
          return;
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.ReportManagerKvCheck", localException, "Failed to upload cLog.", new Object[0]);
        }
      }
    }, "ReportManager_cLog");
  }
  
  private static void b(int paramInt, List<String> paramList, boolean paramBoolean)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ReportManagerKvCheck", "vals is null, use '' as value");
    }
    StringBuilder localStringBuilder;
    for (paramList = ""; ad.cic(); paramList = localStringBuilder.toString())
    {
      e.a(paramInt, paramList, paramBoolean, false);
      return;
      localStringBuilder = new StringBuilder();
      int j = paramList.size() - 1;
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append((String)paramList.get(i)).append(',');
        i += 1;
      }
      localStringBuilder.append((String)paramList.get(j));
    }
    g(paramInt, paramList, paramBoolean);
  }
  
  public static void brU()
  {
    if (ad.cic())
    {
      BaseEvent.onSingalCrash(0);
      return;
    }
    KVCommCrossProcessReceiver.brO();
  }
  
  public static void e(int paramInt, List<String> paramList)
  {
    if (com.tencent.mm.plugin.report.a.c.mDC)
    {
      b(paramInt, paramList, com.tencent.mm.plugin.report.a.c.mDD);
      return;
    }
    b(paramInt, paramList, false);
  }
  
  private static void g(int paramInt, String paramString, boolean paramBoolean)
  {
    KVReportDataInfo localKVReportDataInfo = new KVReportDataInfo();
    localKVReportDataInfo.mEv = paramInt;
    localKVReportDataInfo.value = paramString;
    localKVReportDataInfo.mDZ = false;
    localKVReportDataInfo.mEw = paramBoolean;
    KVCommCrossProcessReceiver.a(localKVReportDataInfo);
  }
  
  public final void U(int paramInt1, int paramInt2, int paramInt3)
  {
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(paramInt1);
    localIDKey1.SetKey(paramInt2);
    localIDKey1.SetValue(1L);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(paramInt1);
    localIDKey2.SetKey(paramInt3);
    localIDKey2.SetValue(1L);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localIDKey1);
    localArrayList.add(localIDKey2);
    b(localArrayList, false);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
  {
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(paramInt1);
    localIDKey1.SetKey(paramInt3);
    localIDKey1.SetValue(paramInt5);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(paramInt2);
    localIDKey2.SetKey(paramInt4);
    localIDKey2.SetValue(paramInt6);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localIDKey1);
    localArrayList.add(localIDKey2);
    b(localArrayList, paramBoolean);
  }
  
  public final void a(int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (ad.cic())
    {
      if (com.tencent.mm.plugin.report.a.c.mDC)
      {
        e.a(paramInt, paramString, com.tencent.mm.plugin.report.a.c.mDD, com.tencent.mm.plugin.report.a.c.mDD);
        return;
      }
      e.a(paramInt, paramString, paramBoolean1, false);
      return;
    }
    g(paramInt, paramString, paramBoolean1);
  }
  
  public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, Object... paramVarArgs)
  {
    if ((paramVarArgs == null) || (paramVarArgs.length <= 0)) {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ReportManagerKvCheck", "vals is null, use '' as value");
    }
    StringBuilder localStringBuilder;
    for (paramVarArgs = "";; paramVarArgs = localStringBuilder.toString())
    {
      if (b.chp()) {
        com.tencent.mm.sdk.platformtools.x.v("MicroMsg.ReportManagerKvCheck", "kvTypedStat id:%d [%b,%b] val:%s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean1), Boolean.valueOf(false), paramVarArgs });
      }
      if (!ad.cic()) {
        break;
      }
      e.a(paramInt, paramVarArgs, paramBoolean1, false);
      return;
      localStringBuilder = new StringBuilder();
      int j = paramVarArgs.length - 1;
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append(String.valueOf(paramVarArgs[i]).replace(',', ' ')).append(',');
        i += 1;
      }
      localStringBuilder.append(String.valueOf(paramVarArgs[j]));
    }
    g(paramInt, paramVarArgs, paramBoolean1);
  }
  
  public final void a(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
  {
    if ((paramLong1 < 0L) || (paramLong2 < 0L) || (paramLong3 <= 0L))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ReportManagerKvCheck", "ID %d, key %d, value %d <0", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong3) });
      return;
    }
    if (ad.cic())
    {
      e.b(paramLong1, paramLong2, paramLong3, false);
      return;
    }
    StIDKeyDataInfo localStIDKeyDataInfo = new StIDKeyDataInfo();
    localStIDKeyDataInfo.mFa = paramLong1;
    localStIDKeyDataInfo.key = paramLong2;
    localStIDKeyDataInfo.value = paramLong3;
    localStIDKeyDataInfo.mDZ = false;
    KVCommCrossProcessReceiver.a(localStIDKeyDataInfo);
  }
  
  public final void b(ArrayList<IDKey> paramArrayList, boolean paramBoolean)
  {
    if (paramArrayList == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ReportManagerKvCheck", "report idkeyGroupStat lstIdKeyDataInfos == null return");
      return;
    }
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      IDKey localIDKey = (IDKey)localIterator.next();
      if (localIDKey == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ReportManagerKvCheck", "report idkeyGroupStat info == null return");
        return;
      }
      if ((localIDKey.GetID() < 0L) || (localIDKey.GetKey() < 0L) || (localIDKey.GetValue() <= 0L))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ReportManagerKvCheck", "report idkeyGroupStat ID %d, key %d, value %d <0", new Object[] { Long.valueOf(localIDKey.GetID()), Long.valueOf(localIDKey.GetKey()), Long.valueOf(localIDKey.GetValue()) });
        return;
      }
    }
    if (ad.cic())
    {
      e.c(paramArrayList, false);
      return;
    }
    KVCommCrossProcessReceiver.K(paramArrayList);
  }
  
  public final void c(String paramString1, final String paramString2, final Map<String, Object> paramMap)
  {
    a(paramString1, new Callable() {});
  }
  
  /* Error */
  public final boolean c(int paramInt, com.tencent.mm.bk.a parama)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual 531	java/lang/Object:getClass	()Ljava/lang/Class;
    //   4: ldc_w 533
    //   7: invokevirtual 539	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   10: aload_2
    //   11: ldc_w 540
    //   14: invokevirtual 546	java/lang/reflect/Field:setInt	(Ljava/lang/Object;I)V
    //   17: invokestatic 551	com/tencent/mm/sdk/platformtools/bi:VF	()J
    //   20: lstore_3
    //   21: lload_3
    //   22: ldc2_w 552
    //   25: ldiv
    //   26: aload_0
    //   27: getfield 60	com/tencent/mm/plugin/report/service/h:mEK	J
    //   30: lcmp
    //   31: ifeq +35 -> 66
    //   34: new 555	java/text/SimpleDateFormat
    //   37: dup
    //   38: ldc_w 557
    //   41: invokespecial 558	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   44: astore 7
    //   46: aload_0
    //   47: aload 7
    //   49: new 560	java/util/Date
    //   52: dup
    //   53: invokespecial 561	java/util/Date:<init>	()V
    //   56: invokevirtual 565	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   59: iconst_0
    //   60: invokestatic 569	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   63: putfield 571	com/tencent/mm/plugin/report/service/h:mEL	I
    //   66: aload_2
    //   67: invokevirtual 531	java/lang/Object:getClass	()Ljava/lang/Class;
    //   70: ldc_w 573
    //   73: invokevirtual 539	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   76: aload_2
    //   77: aload_0
    //   78: getfield 571	com/tencent/mm/plugin/report/service/h:mEL	I
    //   81: invokevirtual 546	java/lang/reflect/Field:setInt	(Ljava/lang/Object;I)V
    //   84: aload_0
    //   85: getfield 262	com/tencent/mm/plugin/report/service/h:uin	I
    //   88: i2l
    //   89: lstore 5
    //   91: aload_2
    //   92: invokevirtual 531	java/lang/Object:getClass	()Ljava/lang/Class;
    //   95: ldc_w 575
    //   98: invokevirtual 539	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   101: aload_2
    //   102: lload 5
    //   104: ldc2_w 191
    //   107: land
    //   108: invokevirtual 579	java/lang/reflect/Field:setLong	(Ljava/lang/Object;J)V
    //   111: aload_2
    //   112: invokevirtual 531	java/lang/Object:getClass	()Ljava/lang/Class;
    //   115: ldc_w 581
    //   118: invokevirtual 539	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   121: aload_2
    //   122: iconst_2
    //   123: invokevirtual 546	java/lang/reflect/Field:setInt	(Ljava/lang/Object;I)V
    //   126: aload_2
    //   127: invokevirtual 531	java/lang/Object:getClass	()Ljava/lang/Class;
    //   130: ldc_w 583
    //   133: invokevirtual 539	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   136: aload_2
    //   137: getstatic 588	com/tencent/mm/protocal/d:qVN	I
    //   140: invokevirtual 546	java/lang/reflect/Field:setInt	(Ljava/lang/Object;I)V
    //   143: aload_2
    //   144: invokevirtual 531	java/lang/Object:getClass	()Ljava/lang/Class;
    //   147: ldc_w 590
    //   150: invokevirtual 539	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   153: aload_2
    //   154: lload_3
    //   155: invokevirtual 579	java/lang/reflect/Field:setLong	(Ljava/lang/Object;J)V
    //   158: aload_2
    //   159: invokevirtual 595	com/tencent/mm/bk/a:toByteArray	()[B
    //   162: astore_2
    //   163: invokestatic 66	com/tencent/mm/sdk/platformtools/ad:cic	()Z
    //   166: ifeq +95 -> 261
    //   169: getstatic 386	com/tencent/mm/plugin/report/a/c:mDC	Z
    //   172: ifeq +47 -> 219
    //   175: iload_1
    //   176: i2l
    //   177: aload_2
    //   178: getstatic 389	com/tencent/mm/plugin/report/a/c:mDD	Z
    //   181: getstatic 389	com/tencent/mm/plugin/report/a/c:mDD	Z
    //   184: invokestatic 598	com/tencent/mm/plugin/report/service/e:a	(J[BZZ)V
    //   187: iconst_1
    //   188: ireturn
    //   189: astore_2
    //   190: ldc_w 320
    //   193: ldc_w 600
    //   196: iconst_2
    //   197: anewarray 212	java/lang/Object
    //   200: dup
    //   201: iconst_0
    //   202: iload_1
    //   203: invokestatic 217	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   206: aastore
    //   207: dup
    //   208: iconst_1
    //   209: aload_2
    //   210: invokevirtual 601	java/lang/Exception:toString	()Ljava/lang/String;
    //   213: aastore
    //   214: invokestatic 475	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   217: iconst_0
    //   218: ireturn
    //   219: iload_1
    //   220: i2l
    //   221: lstore_3
    //   222: lload_3
    //   223: aload_2
    //   224: iconst_0
    //   225: iconst_0
    //   226: invokestatic 598	com/tencent/mm/plugin/report/service/e:a	(J[BZZ)V
    //   229: iconst_1
    //   230: ireturn
    //   231: astore_2
    //   232: ldc_w 320
    //   235: ldc_w 603
    //   238: iconst_2
    //   239: anewarray 212	java/lang/Object
    //   242: dup
    //   243: iconst_0
    //   244: iload_1
    //   245: invokestatic 217	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   248: aastore
    //   249: dup
    //   250: iconst_1
    //   251: aload_2
    //   252: invokevirtual 604	java/io/IOException:toString	()Ljava/lang/String;
    //   255: aastore
    //   256: invokestatic 475	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   259: iconst_0
    //   260: ireturn
    //   261: ldc_w 320
    //   264: ldc_w 606
    //   267: invokestatic 608	com/tencent/mm/sdk/platformtools/x:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   270: iconst_1
    //   271: ireturn
    //   272: astore 7
    //   274: goto -208 -> 66
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	277	0	this	h
    //   0	277	1	paramInt	int
    //   0	277	2	parama	com.tencent.mm.bk.a
    //   20	203	3	l1	long
    //   89	14	5	l2	long
    //   44	4	7	localSimpleDateFormat	java.text.SimpleDateFormat
    //   272	1	7	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	46	189	java/lang/Exception
    //   66	158	189	java/lang/Exception
    //   158	187	231	java/io/IOException
    //   222	229	231	java/io/IOException
    //   261	270	231	java/io/IOException
    //   46	66	272	java/lang/Exception
  }
  
  public final void e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(paramInt1);
    localIDKey1.SetKey(paramInt2);
    localIDKey1.SetValue(paramInt4);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(paramInt1);
    localIDKey2.SetKey(paramInt3);
    localIDKey2.SetValue(1L);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localIDKey1);
    localArrayList.add(localIDKey2);
    b(localArrayList, false);
  }
  
  public final void e(long paramLong1, long paramLong2, long paramLong3)
  {
    a(paramLong1, paramLong2, paramLong3, false);
  }
  
  public final void eK(int paramInt)
  {
    this.uin = paramInt;
    SmcLogic.setUin(paramInt);
  }
  
  public final void ep(String paramString1, String paramString2)
  {
    c(paramString1, paramString2, null);
  }
  
  public final void h(int paramInt, Object... paramVarArgs)
  {
    if (com.tencent.mm.plugin.report.a.c.mDC)
    {
      a(paramInt, com.tencent.mm.plugin.report.a.c.mDD, com.tencent.mm.plugin.report.a.c.mDD, paramVarArgs);
      return;
    }
    a(paramInt, false, false, paramVarArgs);
  }
  
  public final void k(int paramInt, String paramString)
  {
    if (com.tencent.mm.plugin.report.a.c.mDC)
    {
      a(paramInt, paramString, com.tencent.mm.plugin.report.a.c.mDD, com.tencent.mm.plugin.report.a.c.mDD);
      return;
    }
    a(paramInt, paramString, false, false);
  }
  
  public final void n(String paramString, final List<String> paramList)
  {
    a(paramString, new Callable() {});
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/report/service/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */