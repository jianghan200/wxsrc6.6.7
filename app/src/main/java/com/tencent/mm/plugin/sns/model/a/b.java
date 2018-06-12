package com.tencent.mm.plugin.sns.model.a;

import com.tencent.mm.a.o;
import com.tencent.mm.memory.n;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.b.b;
import com.tencent.mm.network.u;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class b
  extends c
{
  private static HashSet<String> ntf = new HashSet();
  protected ate caK = null;
  private long dnsCostTime = -1L;
  private int erZ = -1;
  private String host = "";
  protected c.a nsL;
  protected n nsM = null;
  protected a nsN = null;
  private String nsO = "";
  private String nsP = "";
  private String nsQ = "";
  private int nsR = 0;
  protected int nsS = 0;
  private long nsT = -1L;
  protected long nsU = -1L;
  protected long nsV = -1L;
  protected long nsW = -1L;
  protected String nsX = "";
  protected PString nsY = new PString();
  protected int nsZ;
  protected long nta;
  protected long ntb;
  protected long ntc;
  private int ntd = 0;
  protected int nte = 0;
  private Map<String, List<String>> ntg;
  int nth = 0;
  private int retCode = -1;
  
  public b(c.a parama, a parama1)
  {
    super(parama, parama1);
    this.nsL = parama;
    this.nsN = parama1;
    if (parama1 == null) {
      return;
    }
    this.caK = parama1.noc;
    ntf.add(parama1.nob);
    parama1.init();
  }
  
  private static void M(Map<String, List<String>> paramMap)
  {
    if (paramMap == null) {
      return;
    }
    try
    {
      StringBuffer localStringBuffer = new StringBuffer();
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject1 = (String)localIterator.next();
        Object localObject2 = (List)paramMap.get(localObject1);
        if (localObject2 != null)
        {
          localStringBuffer.append((String)localObject1 + ":");
          localObject1 = ((List)localObject2).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (String)((Iterator)localObject1).next();
            localStringBuffer.append((String)localObject2 + "|");
          }
          localStringBuffer.append(";");
        }
      }
      x.i("MicroMsg.SnsCdnDownloadBase", "header respone %s", new Object[] { localStringBuffer.toString() });
      return;
    }
    catch (Exception paramMap) {}
  }
  
  private static long MK(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return 0L;
    }
    try
    {
      paramString = paramString.split("\\.");
      long l1 = bi.getLong(paramString[0], 0L);
      long l2 = bi.getLong(paramString[1], 0L);
      long l3 = bi.getLong(paramString[2], 0L);
      long l4 = bi.getLong(paramString[3], 0L);
      return l4 + (16777216L * l1 + 65536L * l2 + 256L * l3);
    }
    catch (Exception paramString) {}
    return 0L;
  }
  
  private u a(b.b paramb, String paramString)
  {
    try
    {
      this.nsQ = paramb.ip;
      this.erZ = paramb.erZ;
      this.nsU = bi.VF();
      paramb = com.tencent.mm.network.b.a(this.nsN.url, paramb);
      paramb.setRequestMethod("GET");
      paramb.setRequestProperty("referer", paramString);
      if (bi.getInt(com.tencent.mm.k.g.AT().getValue("SnsDownloadHttpKeep"), 0) > 0)
      {
        x.i("MicroMsg.SnsCdnDownloadBase", "header Connection close ");
        paramb.setRequestProperty("Connection", "close");
      }
      paramb.setConnectTimeout(25000);
      paramb.setReadTimeout(25000);
      paramb = b(paramb);
      this.ntg = paramb.getHeaderFields();
      paramString = (List)this.ntg.get("X-ClientIp");
      if ((paramString != null) && (paramString.size() > 0)) {
        this.nsP = ((String)paramString.get(0));
      }
      paramString = (List)this.ntg.get("X-ServerIp");
      if ((paramString != null) && (paramString.size() > 0)) {
        this.nsO = ((String)paramString.get(0));
      }
      paramString = (List)this.ntg.get("X-ErrNo");
      if ((paramString != null) && (paramString.size() > 0)) {
        this.nsR = bi.WU((String)paramString.get(0));
      }
      paramString = (List)this.ntg.get("X-RtFlag");
      if ((paramString != null) && (paramString.size() > 0)) {
        this.nsS = bi.WU((String)paramString.get(0));
      }
      for (;;)
      {
        try
        {
          this.retCode = paramb.getResponseCode();
          this.host = paramb.url.getHost();
          if ((this.retCode == 200) || (this.retCode == 206)) {
            break;
          }
          M(paramb.getHeaderFields());
          if (this.nsN.nsH)
          {
            if ((this.retCode >= 400) && (this.retCode < 500))
            {
              h.mEJ.a(22L, 78L, 1L, true);
              if (this.nsN.nsG) {
                h.mEJ.a(150L, 14L, 1L, true);
              }
              x.e("MicroMsg.SnsCdnDownloadBase", "GprsSetting.checkHttpConnection failed! mediaId : " + this.nsN.mediaId + " " + this.nsN.url + " " + this.retCode);
              hR(false);
              return null;
            }
            if ((this.retCode < 500) || (this.retCode >= 600)) {
              continue;
            }
            h.mEJ.a(22L, 79L, 1L, true);
            continue;
          }
        }
        catch (SocketTimeoutException paramb)
        {
          this.retCode = 1;
          hR(false);
          paramb = paramb.getMessage();
          if (!this.nsN.nsH) {
            break label788;
          }
          h.mEJ.a(22L, 77L, 1L, true);
          if (this.nsN.nsG) {
            h.mEJ.a(150L, 14L, 1L, true);
          }
          x.e("MicroMsg.SnsCdnDownloadBase", "GprsSetting.checkHttpConnection failed! socket timeout mediaId : " + this.nsN.mediaId + " " + this.nsN.url + " msg:" + paramb);
          return null;
          if ((this.retCode >= 400) && (this.retCode < 500))
          {
            h.mEJ.a(22L, 56L, 1L, true);
            continue;
          }
        }
        catch (Exception paramb)
        {
          hR(false);
          paramb = paramb.getMessage();
          if (this.nsN.nsG) {
            h.mEJ.a(150L, 14L, 1L, true);
          }
          x.e("MicroMsg.SnsCdnDownloadBase", "GprsSetting.checkHttpConnection failed! mediaId : " + this.nsN.mediaId + " " + this.nsN.url + " msg:" + paramb);
          return null;
        }
        if ((this.retCode >= 500) && (this.retCode < 600))
        {
          h.mEJ.a(22L, 57L, 1L, true);
          continue;
          label788:
          h.mEJ.a(22L, 55L, 1L, true);
        }
      }
      M(paramb.getHeaderFields());
    }
    catch (Exception paramb)
    {
      x.printErrStackTrace("MicroMsg.SnsCdnDownloadBase", paramb, "connect fail : " + paramb.getMessage(), new Object[0]);
      this.retCode = 2;
      hR(false);
      return null;
    }
    if (!d(paramb))
    {
      h.mEJ.a(22L, 62L, 1L, true);
      x.e("MicroMsg.SnsCdnDownloadBase", "checkHttpConnection failed! nocache mediaId : " + this.nsN.mediaId);
      hR(false);
      return null;
    }
    this.nsU = bi.bH(this.nsU);
    paramString = (List)this.ntg.get("Content-Length");
    if ((paramString != null) && (paramString.size() > 0)) {
      this.nte = bi.WU((String)paramString.get(0));
    }
    x.i("MicroMsg.SnsCdnDownloadBase", "ip: url %s client ip %s server ip %s svrlen %d %d", new Object[] { this.nsN.url, this.nsP, this.nsO, Integer.valueOf(this.nte), Integer.valueOf(this.nsR) });
    return paramb;
  }
  
  protected static boolean a(int paramInt, long paramLong, PString paramPString)
  {
    long l = System.currentTimeMillis();
    if (l - paramLong < 1000L) {
      return false;
    }
    paramPString.value += String.format("ts=%d&size=%d|", new Object[] { Long.valueOf(l / 1000L), Integer.valueOf(paramInt) });
    return true;
  }
  
  /* Error */
  private int c(u paramu)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_0
    //   4: invokestatic 234	com/tencent/mm/sdk/platformtools/bi:VF	()J
    //   7: putfield 447	com/tencent/mm/plugin/sns/model/a/b:ntc	J
    //   10: aload_1
    //   11: invokevirtual 451	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
    //   14: astore_3
    //   15: aload_0
    //   16: invokestatic 234	com/tencent/mm/sdk/platformtools/bi:VF	()J
    //   19: putfield 87	com/tencent/mm/plugin/sns/model/a/b:nsV	J
    //   22: aload_0
    //   23: aload_3
    //   24: invokevirtual 455	com/tencent/mm/plugin/sns/model/a/b:u	(Ljava/io/InputStream;)Z
    //   27: istore_2
    //   28: aload_3
    //   29: invokevirtual 459	java/io/InputStream:close	()V
    //   32: ldc -73
    //   34: new 162	java/lang/StringBuilder
    //   37: dup
    //   38: ldc_w 461
    //   41: invokespecial 358	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   44: iload_2
    //   45: invokevirtual 464	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   48: invokevirtual 173	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: invokestatic 278	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   54: iload_2
    //   55: ifne +21 -> 76
    //   58: aload_0
    //   59: iconst_0
    //   60: invokespecial 373	com/tencent/mm/plugin/sns/model/a/b:hR	(Z)V
    //   63: aload_1
    //   64: ifnull +10 -> 74
    //   67: aload_1
    //   68: getfield 468	com/tencent/mm/network/u:aBv	Ljava/net/HttpURLConnection;
    //   71: invokevirtual 473	java/net/HttpURLConnection:disconnect	()V
    //   74: iconst_2
    //   75: ireturn
    //   76: aload_0
    //   77: aload_0
    //   78: getfield 87	com/tencent/mm/plugin/sns/model/a/b:nsV	J
    //   81: invokestatic 409	com/tencent/mm/sdk/platformtools/bi:bH	(J)J
    //   84: putfield 87	com/tencent/mm/plugin/sns/model/a/b:nsV	J
    //   87: aload_0
    //   88: aload_0
    //   89: getfield 89	com/tencent/mm/plugin/sns/model/a/b:nsW	J
    //   92: invokestatic 409	com/tencent/mm/sdk/platformtools/bi:bH	(J)J
    //   95: putfield 79	com/tencent/mm/plugin/sns/model/a/b:nsT	J
    //   98: aload_0
    //   99: invokevirtual 476	com/tencent/mm/plugin/sns/model/a/b:bza	()Z
    //   102: istore_2
    //   103: ldc -73
    //   105: new 162	java/lang/StringBuilder
    //   108: dup
    //   109: ldc_w 478
    //   112: invokespecial 358	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   115: iload_2
    //   116: invokevirtual 464	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   119: invokevirtual 173	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   122: invokestatic 278	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   125: iload_2
    //   126: ifne +26 -> 152
    //   129: aload_0
    //   130: iconst_3
    //   131: putfield 98	com/tencent/mm/plugin/sns/model/a/b:retCode	I
    //   134: aload_0
    //   135: iconst_0
    //   136: invokespecial 373	com/tencent/mm/plugin/sns/model/a/b:hR	(Z)V
    //   139: aload_1
    //   140: ifnull -66 -> 74
    //   143: aload_1
    //   144: getfield 468	com/tencent/mm/network/u:aBv	Ljava/net/HttpURLConnection;
    //   147: invokevirtual 473	java/net/HttpURLConnection:disconnect	()V
    //   150: iconst_2
    //   151: ireturn
    //   152: aload_1
    //   153: ifnull +10 -> 163
    //   156: aload_1
    //   157: getfield 468	com/tencent/mm/network/u:aBv	Ljava/net/HttpURLConnection;
    //   160: invokevirtual 473	java/net/HttpURLConnection:disconnect	()V
    //   163: aload_0
    //   164: iconst_1
    //   165: invokespecial 373	com/tencent/mm/plugin/sns/model/a/b:hR	(Z)V
    //   168: aload_0
    //   169: getfield 61	com/tencent/mm/plugin/sns/model/a/b:nsN	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   172: getfield 350	com/tencent/mm/plugin/sns/model/a/a:nsG	Z
    //   175: ifeq +130 -> 305
    //   178: iconst_3
    //   179: ireturn
    //   180: astore 4
    //   182: aconst_null
    //   183: astore_3
    //   184: ldc -73
    //   186: aload 4
    //   188: new 162	java/lang/StringBuilder
    //   191: dup
    //   192: ldc_w 480
    //   195: invokespecial 358	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   198: aload 4
    //   200: invokevirtual 387	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   203: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: invokevirtual 173	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   209: iconst_0
    //   210: anewarray 187	java/lang/Object
    //   213: invokestatic 397	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   216: aload_0
    //   217: iconst_4
    //   218: putfield 98	com/tencent/mm/plugin/sns/model/a/b:retCode	I
    //   221: aload_0
    //   222: iconst_0
    //   223: invokespecial 373	com/tencent/mm/plugin/sns/model/a/b:hR	(Z)V
    //   226: aload_3
    //   227: ifnull +7 -> 234
    //   230: aload_3
    //   231: invokevirtual 459	java/io/InputStream:close	()V
    //   234: aload_1
    //   235: ifnull -161 -> 74
    //   238: aload_1
    //   239: getfield 468	com/tencent/mm/network/u:aBv	Ljava/net/HttpURLConnection;
    //   242: invokevirtual 473	java/net/HttpURLConnection:disconnect	()V
    //   245: iconst_2
    //   246: ireturn
    //   247: astore_3
    //   248: ldc -73
    //   250: aload_3
    //   251: ldc 65
    //   253: iconst_0
    //   254: anewarray 187	java/lang/Object
    //   257: invokestatic 397	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   260: goto -26 -> 234
    //   263: astore_3
    //   264: aload 4
    //   266: ifnull +8 -> 274
    //   269: aload 4
    //   271: invokevirtual 459	java/io/InputStream:close	()V
    //   274: aload_1
    //   275: ifnull +10 -> 285
    //   278: aload_1
    //   279: getfield 468	com/tencent/mm/network/u:aBv	Ljava/net/HttpURLConnection;
    //   282: invokevirtual 473	java/net/HttpURLConnection:disconnect	()V
    //   285: aload_3
    //   286: athrow
    //   287: astore 4
    //   289: ldc -73
    //   291: aload 4
    //   293: ldc 65
    //   295: iconst_0
    //   296: anewarray 187	java/lang/Object
    //   299: invokestatic 397	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   302: goto -28 -> 274
    //   305: iconst_1
    //   306: ireturn
    //   307: astore 5
    //   309: aload_3
    //   310: astore 4
    //   312: aload 5
    //   314: astore_3
    //   315: goto -51 -> 264
    //   318: astore 5
    //   320: aload_3
    //   321: astore 4
    //   323: aload 5
    //   325: astore_3
    //   326: goto -62 -> 264
    //   329: astore 4
    //   331: goto -147 -> 184
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	334	0	this	b
    //   0	334	1	paramu	u
    //   27	99	2	bool	boolean
    //   14	217	3	localInputStream	InputStream
    //   247	4	3	localIOException1	java.io.IOException
    //   263	47	3	localObject1	Object
    //   314	12	3	localObject2	Object
    //   1	1	4	localObject3	Object
    //   180	90	4	localException1	Exception
    //   287	5	4	localIOException2	java.io.IOException
    //   310	12	4	localObject4	Object
    //   329	1	4	localException2	Exception
    //   307	6	5	localObject5	Object
    //   318	6	5	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   3	15	180	java/lang/Exception
    //   32	54	180	java/lang/Exception
    //   58	63	180	java/lang/Exception
    //   76	125	180	java/lang/Exception
    //   129	139	180	java/lang/Exception
    //   230	234	247	java/io/IOException
    //   3	15	263	finally
    //   32	54	263	finally
    //   58	63	263	finally
    //   76	125	263	finally
    //   129	139	263	finally
    //   269	274	287	java/io/IOException
    //   15	32	307	finally
    //   184	226	318	finally
    //   15	32	329	java/lang/Exception
  }
  
  private static boolean d(u paramu)
  {
    try
    {
      paramu = (List)paramu.getHeaderFields().get("cache-control");
      if ((paramu != null) && (paramu.size() != 0))
      {
        if ((bi.oW(paramu.toString())) || (!paramu.toString().contains("no-cache"))) {
          break label94;
        }
        boolean bool = paramu.toString().contains("no-cache");
        return !bool;
      }
    }
    catch (Exception paramu)
    {
      x.printErrStackTrace("MicroMsg.SnsCdnDownloadBase", paramu, "", new Object[0]);
      return false;
    }
    return true;
    label94:
    return true;
  }
  
  private void hR(boolean paramBoolean)
  {
    int j;
    label113:
    long l1;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    String str;
    if ((this.nsN != null) && (this.nsN.nsH)) {
      if (!paramBoolean)
      {
        h.mEJ.a(22L, 74L, 1L, true);
        h.mEJ.a(22L, 73L, 1L, true);
        if ((this.nsN != null) && (this.nsN.nsG) && (!paramBoolean) && (!i.b(this.nsM))) {
          h.mEJ.a(150L, 66L, 1L, true);
        }
        this.ntd = this.nth;
        if (!ao.isWifi(ad.getContext())) {
          break label788;
        }
        j = 1;
        int k = ao.getStrength(ad.getContext());
        i = this.erZ;
        l1 = this.dnsCostTime;
        long l2 = this.nsU;
        long l3 = this.nsV;
        long l4 = this.nsT;
        localObject1 = this.nsO;
        localObject2 = this.nsQ;
        localObject3 = this.nsP;
        if (this.nsN != null) {
          break label793;
        }
        str = "";
        label179:
        x.v("MicroMsg.SnsCdnDownloadBase", "report dns:%d wifi:%d signal:%d [%d,%d,%d]%d serverIp:[%s,%s] xclientip:%s url[%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), localObject1, localObject2, localObject3, str });
        int m = ao.getNetType(ad.getContext());
        i = 0;
        if (this.nsN != null)
        {
          if (this.nsN.nsI != 4) {
            break label805;
          }
          i = 1;
        }
        label301:
        x.i("MicroMsg.SnsCdnDownloadBase", "retCode :%d totalSize: %d net: %d downloadType %d xErrorNo %d", new Object[] { Integer.valueOf(this.retCode), Integer.valueOf(this.ntd), Integer.valueOf(m), Integer.valueOf(i), Integer.valueOf(this.nsR) });
        localObject1 = h.mEJ;
        if (this.nsN != null) {
          break label810;
        }
        str = "";
        label374:
        l2 = MK(this.nsQ);
        if (!paramBoolean) {
          break label822;
        }
        l1 = this.nsT;
        label393:
        ((h)localObject1).h(10736, new Object[] { str, Long.valueOf(l2), Long.valueOf(l1), "", Integer.valueOf(j), Long.valueOf(this.dnsCostTime), Long.valueOf(this.nsU), Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(this.nsV), Long.valueOf(MK(this.nsP)), Long.valueOf(MK(this.nsO)), Integer.valueOf(this.erZ), Integer.valueOf(k), Integer.valueOf(this.retCode), Integer.valueOf(this.ntd), Integer.valueOf(m), Integer.valueOf(i), Integer.valueOf(this.nsR) });
        boolean bool = ao.isConnected(ad.getContext());
        x.d("MicroMsg.SnsCdnDownloadBase", "isConntected  " + bool + " urlIp: " + this.nsX);
        if ((!paramBoolean) && (!bi.oW(this.nsX)) && (bool)) {
          com.tencent.mm.network.b.reportFailIp(this.nsX);
        }
        x.i("MicroMsg.SnsCdnDownloadBase", "ready to report logbuffer(13346) packageRecordList:%s", new Object[] { this.nsY.value });
        j = bzb();
        localObject1 = "";
      }
    }
    switch (j)
    {
    default: 
    case 1: 
      label788:
      label793:
      label805:
      label810:
      label822:
      label833:
      do
      {
        return;
        h.mEJ.a(22L, 75L, this.nsT, true);
        break;
        if (!paramBoolean) {
          h.mEJ.a(22L, 52L, 1L, true);
        }
        for (;;)
        {
          h.mEJ.a(22L, 51L, 1L, true);
          break;
          h.mEJ.a(22L, 53L, this.nsT, true);
        }
        j = 0;
        break label113;
        str = this.nsN.url;
        break label179;
        i = 0;
        break label301;
        str = this.nsN.url;
        break label374;
        l1 = 0L;
        break label393;
        str = "100105";
        localObject2 = com.tencent.mm.model.c.c.Jx().fJ(str);
        i = 0;
        if (((com.tencent.mm.storage.c)localObject2).isValid())
        {
          i = bi.getInt((String)((com.tencent.mm.storage.c)localObject2).ckq().get("needUploadData"), 1);
          localObject1 = ((com.tencent.mm.storage.c)localObject2).field_expId;
        }
      } while (i == 0);
      localObject2 = new com.tencent.mm.modelsns.d();
      ((com.tencent.mm.modelsns.d)localObject2).r("20ImgSize", this.nth + ",");
      localObject3 = new StringBuilder();
      if (!ao.isWifi(ad.getContext())) {
        break;
      }
    }
    for (int i = 1;; i = 0)
    {
      ((com.tencent.mm.modelsns.d)localObject2).r("21NetType", i + ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("22DelayTime", this.nsT - this.nsU + ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("23RetCode", this.retCode + ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("24DnsCostTime", this.dnsCostTime + ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("25ConnectCostTime", this.nsU + ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("26SendCostTime", ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("27WaitResponseCostTime", this.ntb + ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("28ReceiveCostTime", this.nsV + ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("29ClientAddrIP", this.nsP + ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("30ServerAddrIP", this.nsQ + ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("31dnstype", this.erZ + ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("32signal", ao.getStrength(ad.getContext()) + ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("33host", this.host + ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("34MediaType", j + ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("35X_Errno", this.nsR + ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("36MaxPackageSize", this.nsZ + ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("37MaxPackageTimeStamp", this.nta + ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("38PackageRecordList", this.nsY.value + ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("39ExpLayerId", str + ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("40ExpId", (String)localObject1 + ",");
      ((com.tencent.mm.modelsns.d)localObject2).r("41FeedId", ",");
      x.i("MicroMsg.SnsCdnDownloadBase", "report logbuffer(13480 TLMediaFielDownloadRecord): " + ((com.tencent.mm.modelsns.d)localObject2).wF());
      h.mEJ.h(13480, new Object[] { localObject2 });
      if (this.retCode == 200) {
        break;
      }
      h.mEJ.h(14071, new Object[] { localObject2 });
      return;
      str = "100106";
      break label833;
      str = "100100";
      break label833;
    }
  }
  
  public String MJ(String paramString)
  {
    return paramString;
  }
  
  public final boolean a(com.tencent.mm.storage.av paramav, String paramString1, long paramLong, String paramString2)
  {
    if (paramString1 == null) {}
    for (;;)
    {
      return false;
      try
      {
        paramString1 = new URL(paramString1);
        if ((paramav != null) && (paramString2 != null) && (paramString2.indexOf(paramString1.getHost()) != -1) && (paramav.time != 0))
        {
          long l = bi.bG(paramav.time);
          if (l > paramLong) {
            return true;
          }
        }
      }
      catch (Exception paramav)
      {
        x.e("MicroMsg.SnsCdnDownloadBase", "error for check dcip %s", new Object[] { paramav.getMessage() });
      }
    }
    return false;
  }
  
  public u b(u paramu)
  {
    return paramu;
  }
  
  public final ag bxH()
  {
    return af.bxZ();
  }
  
  public boolean byZ()
  {
    return true;
  }
  
  public abstract boolean bza();
  
  protected abstract int bzb();
  
  public final Integer bzc()
  {
    com.tencent.mm.kernel.g.Ek();
    if ((!com.tencent.mm.kernel.g.Ei().isSDCardAvailable()) || (this.nsN == null))
    {
      hR(false);
      return Integer.valueOf(2);
    }
    if (byZ())
    {
      localObject1 = this.nsN.nnX + this.nsN.byY();
      x.i("MicroMsg.SnsCdnDownloadBase", "[tomys] delete img: %s", new Object[] { localObject1 });
      FileOp.deleteFile((String)localObject1);
    }
    long l3 = System.currentTimeMillis();
    this.nsW = System.currentTimeMillis();
    x.d("MicroMsg.SnsCdnDownloadBase", "to downloadBitmap " + this.nsN.mediaId + " " + this.nsN.nsG + " type " + this.nsN.nsI);
    FileOp.mL(this.nsN.getPath());
    Object localObject3 = this.nsN.nsJ;
    Object localObject1 = "";
    Object localObject2;
    if (localObject3 == null)
    {
      localObject1 = "";
      localObject2 = com.tencent.mm.storage.av.tbu;
    }
    for (;;)
    {
      localObject3 = localObject1;
      if (!bi.oW((String)localObject1)) {
        localObject3 = "&scene=" + (String)localObject1;
      }
      String str2 = String.format("http://weixin.qq.com/?version=%d&uin=%s&nettype=%d&signal=%d%s", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.qVN), o.getString(af.bxV()), Integer.valueOf(ao.getNetTypeForStat(ad.getContext())), Integer.valueOf(ao.getStrength(ad.getContext())), localObject3 });
      this.nsN.url = MJ(this.nsN.url);
      this.dnsCostTime = bi.VF();
      label333:
      label348:
      boolean bool;
      if (this.nsN.nsH)
      {
        localObject1 = "SnsSightDomainList";
        if (!this.nsN.nsH) {
          break label941;
        }
        localObject3 = "SnsSightMainStandbyIpSwitchTime";
        localObject1 = com.tencent.mm.k.g.AT().getValue((String)localObject1);
        long l2 = com.tencent.mm.k.g.AT().getInt((String)localObject3, 0);
        x.i("MicroMsg.SnsCdnDownloadBase", "pack.isAlbum %s pack.isthumb %s hostvalue %s dcipTime %s", new Object[] { Boolean.valueOf(this.nsN.nsH), Boolean.valueOf(this.nsN.nsG), localObject1, Long.valueOf(l2) });
        long l1 = l2;
        if (l2 <= 0L) {
          l1 = 259200L;
        }
        bool = a((com.tencent.mm.storage.av)localObject2, this.nsN.url, l1, (String)localObject1);
        localObject3 = new b.b(this.nsN.url, bool);
        this.dnsCostTime = bi.bH(this.dnsCostTime);
      }
      try
      {
        if (bi.oW(((b.b)localObject3).ip)) {}
        for (localObject1 = InetAddress.getByName(((b.b)localObject3).host).getHostAddress();; localObject1 = ((b.b)localObject3).ip)
        {
          x.i("MicroMsg.SnsCdnDownloadBase", "checkAndGetHttpConn[%s] [%s] [id:%s] host ip:%d[%s] [%s] download type[%d] isDcIp[%s] fromScene[%s]", new Object[] { str2, this.nsN.url, this.nsN.mediaId, Integer.valueOf(((b.b)localObject3).erZ), localObject1, this.nsN.url, Integer.valueOf(this.nsN.nsI), Boolean.valueOf(bool), ((com.tencent.mm.storage.av)localObject2).toString() });
          this.nsS = 1;
          localObject1 = a((b.b)localObject3, str2);
          localObject2 = ((b.b)localObject3).ip;
          if (localObject1 == null) {
            break label969;
          }
          bool = true;
          x.i("MicroMsg.SnsCdnDownloadBase", "[sns ip strategy]connect ip:%s, result:%b, canRetry(X-RtFlag):%d, isDC(cold ip):%b, url:%s", new Object[] { localObject2, Boolean.valueOf(bool), Integer.valueOf(this.nsS), Boolean.valueOf(((b.b)localObject3).esc), ((b.b)localObject3).esb });
          int i = 2;
          if (localObject1 != null) {
            i = c((u)localObject1);
          }
          x.i("MicroMsg.SnsCdnDownloadBase", "DOWN FIN time:%d down:%d mediaId:%s url[%s], size %d", new Object[] { Long.valueOf(bi.bH(l3)), Long.valueOf(this.nsT), this.nsN.mediaId, this.nsN.url, Integer.valueOf(this.nth) });
          return Integer.valueOf(i);
          if (((com.tencent.mm.storage.av)localObject3).equals(com.tencent.mm.storage.av.tbn))
          {
            localObject1 = "album_friend";
            localObject2 = localObject3;
            break;
          }
          if (((com.tencent.mm.storage.av)localObject3).equals(com.tencent.mm.storage.av.tbo))
          {
            localObject1 = "album_self";
            localObject2 = localObject3;
            break;
          }
          if (((com.tencent.mm.storage.av)localObject3).equals(com.tencent.mm.storage.av.tbp))
          {
            localObject1 = "album_stranger";
            localObject2 = localObject3;
            break;
          }
          if (((com.tencent.mm.storage.av)localObject3).equals(com.tencent.mm.storage.av.tbq))
          {
            localObject1 = "profile_friend";
            localObject2 = localObject3;
            break;
          }
          if (((com.tencent.mm.storage.av)localObject3).equals(com.tencent.mm.storage.av.tbr))
          {
            localObject1 = "profile_stranger";
            localObject2 = localObject3;
            break;
          }
          if (((com.tencent.mm.storage.av)localObject3).equals(com.tencent.mm.storage.av.tbs))
          {
            localObject1 = "comment";
            localObject2 = localObject3;
            break;
          }
          localObject2 = localObject3;
          if (!((com.tencent.mm.storage.av)localObject3).equals(com.tencent.mm.storage.av.tbm)) {
            break;
          }
          localObject1 = "timeline";
          localObject2 = localObject3;
          break;
          localObject1 = "SnsAlbumDomainList";
          break label333;
          label941:
          localObject3 = "SnsAlbumMainStandbyIpSwitchTime";
          break label348;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          String str1 = "-";
          continue;
          label969:
          bool = false;
        }
      }
    }
  }
  
  public final void bzd()
  {
    if (af.bxX()) {
      return;
    }
    System.currentTimeMillis();
    Object localObject1;
    Object localObject2;
    if (this.nsN.nkK.nkQ == 4)
    {
      x.i("MicroMsg.SnsCdnDownloadBase", "decodeType blur thumb");
      localObject1 = i.e(this.caK);
      localObject2 = i.g(this.caK);
      this.nsM = com.tencent.mm.plugin.sns.lucky.a.a.ev(this.nsN.getPath() + (String)localObject1, this.nsN.getPath() + (String)localObject2);
      af.byl().a(this.nsN.mediaId, this.nsM, this.nsN.nkK.nkQ);
      label132:
      localObject1 = null;
      if (this.nsN.nkK.nkQ != 0) {
        break label593;
      }
      localObject1 = "0-" + this.nsN.nkK.kJG;
    }
    for (;;)
    {
      af.byl().LZ((String)localObject1);
      return;
      if (this.nsN.nkK.nkQ == 5)
      {
        x.i("MicroMsg.SnsCdnDownloadBase", "decodeType blur grid");
        localObject1 = i.e(this.caK);
        localObject2 = i.h(this.caK);
        this.nsM = com.tencent.mm.plugin.sns.lucky.a.a.ev(this.nsN.getPath() + (String)localObject1, this.nsN.getPath() + (String)localObject2);
        af.byl().a(this.nsN.mediaId, this.nsM, this.nsN.nkK.nkQ);
        break label132;
      }
      if (this.nsN.nkK.list.size() <= 1)
      {
        af.byl().a(this.nsN.mediaId, this.nsM, this.nsN.nkK.nkQ);
        break label132;
      }
      af.byl().a(this.nsN.mediaId, this.nsM, 0);
      localObject1 = new LinkedList();
      int i = 0;
      for (;;)
      {
        if ((i >= this.nsN.nkK.list.size()) || (i >= 4)) {
          break label501;
        }
        localObject2 = (ate)this.nsN.nkK.list.get(i);
        n localn = af.byl().Ma(((ate)localObject2).ksA);
        if (!i.b(localn)) {
          break;
        }
        ((List)localObject1).add(localn);
        x.i("MicroMsg.SnsCdnDownloadBase", "merge bitmap from " + localn + " " + ((ate)localObject2).ksA);
        i += 1;
      }
      label501:
      this.nsM = n.m(i.i((List)localObject1, af.byw()));
      x.i("MicroMsg.SnsCdnDownloadBase", "merge bitmap " + this.nsN.nkK.kJG + " " + this.nsM);
      af.byl().a(this.nsN.nkK.kJG, this.nsM, this.nsN.nkK.nkQ);
      break label132;
      label593:
      if (this.nsN.nkK.nkQ == 1) {
        localObject1 = "1-" + this.nsN.nkK.kJG;
      } else if (this.nsN.nkK.nkQ == 4) {
        localObject1 = "4-" + this.nsN.nkK.kJG;
      } else if (this.nsN.nkK.nkQ == 5) {
        localObject1 = "5-" + this.nsN.nkK.kJG;
      }
    }
  }
  
  public final void onPostExecute(Integer paramInteger)
  {
    super.onPostExecute(paramInteger);
    if (this.nsN == null) {
      return;
    }
    x.i("MicroMsg.SnsCdnDownloadBase", "download done result: %d, url:%s, mediaID:%s, totalSize: %d, runningTasksSize: %d", new Object[] { paramInteger, this.nsN.url, this.nsN.mediaId, Integer.valueOf(this.ntd), Integer.valueOf(ntf.size()) });
    ntf.remove(this.nsN.nob);
    if ((this.nsN.nsG) && (paramInteger.intValue() != 2))
    {
      com.tencent.mm.plugin.sns.model.av.Mv(this.nsN.mediaId);
      bzd();
    }
    for (;;)
    {
      this.nsL.a(paramInteger.intValue(), this.caK, this.nsN.nsI, this.nsN.nsG, this.nsN.nob, this.ntd);
      return;
      if ((!this.nsN.nsG) && (this.nsN.nsI == 4))
      {
        String str = this.nsN.getPath() + i.j(this.caK);
        af.byl().ex(this.nsN.mediaId, str);
      }
    }
  }
  
  public abstract boolean u(InputStream paramInputStream);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/sns/model/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */