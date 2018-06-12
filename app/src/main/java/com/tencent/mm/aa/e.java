package com.tencent.mm.aa;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.u;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.protocal.c.ano;
import com.tencent.mm.protocal.c.aue;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.at.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ay;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public final class e
  implements com.tencent.mm.ab.e
{
  boolean dGS = false;
  Set<String> dGT = new HashSet();
  com.tencent.mm.a.f<String, c> dGU = new com.tencent.mm.a.f(400);
  Stack<j> dGV = new Stack();
  private at dGW = null;
  private at dGX = null;
  String dGY = null;
  com.tencent.mm.a.f<String, String> dGZ = new com.tencent.mm.a.f(200);
  al dHa = new al(Looper.getMainLooper(), new al.a()
  {
    private long dHc = 0L;
    
    public final boolean vD()
    {
      long l = System.currentTimeMillis();
      if ((e.this.dGS) && (l - this.dHc > 60000L))
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.AvatarService", "do scene TIMEOUT: %d", new Object[] { Long.valueOf(l - this.dHc) });
        e.this.dGS = false;
      }
      if (e.this.dGS)
      {
        e.this.dHa.J(1000L, 1000L);
        return false;
      }
      this.dHc = l;
      e.this.dGS = true;
      LinkedList localLinkedList = new LinkedList();
      int i = 0;
      while ((i < 5) && (e.this.dGV.size() > 0))
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 42L, 1L, true);
        localLinkedList.add(new bhz().VO(((j)e.this.dGV.pop()).getUsername()));
        i += 1;
      }
      g.DF().a(new l(localLinkedList), 0);
      com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 44L, 1L, true);
      return false;
    }
  }, false);
  
  public e()
  {
    g.DF().a(123, this);
    this.dGS = false;
    this.dGY = com.tencent.mm.model.q.GF();
  }
  
  static f Kp()
  {
    if (g.Eg().Dx()) {
      return q.Kp();
    }
    return null;
  }
  
  static j jQ(String paramString)
  {
    Object localObject2 = q.KH().kc(paramString);
    if ((localObject2 != null) && (((j)localObject2).getUsername().equals(paramString))) {}
    Object localObject1;
    byte[] arrayOfByte;
    do
    {
      return (j)localObject2;
      localObject1 = ((i)g.l(i.class)).FR().Yg(paramString);
      if ((localObject1 == null) || (!((ai)localObject1).field_username.equals(paramString)))
      {
        if (localObject1 == null) {}
        for (boolean bool = true;; bool = false)
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AvatarService", "ct == null? :%s", new Object[] { Boolean.valueOf(bool), paramString });
          return null;
        }
      }
      if (((ai)localObject1).csA == 4)
      {
        c.J(paramString, ((ai)localObject1).csA);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AvatarService", "ct imgFlag :%s", new Object[] { Integer.valueOf(((ai)localObject1).csA) });
        return null;
      }
      localObject1 = new j();
      ((j)localObject1).username = paramString;
      ((j)localObject1).csA = 3;
      arrayOfByte = ((i)g.l(i.class)).FR().Yk(paramString);
      localObject2 = localObject1;
    } while (bi.bC(arrayOfByte));
    try
    {
      paramString = c.a(paramString, (aue)new aue().aG(arrayOfByte));
      return paramString;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AvatarService", "exception:%s", new Object[] { bi.i(paramString) });
        paramString = (String)localObject1;
      }
    }
  }
  
  final int a(at.a parama)
  {
    if ((parama instanceof a))
    {
      if (this.dGW == null) {
        this.dGW = new at(1, "getavatar", 2, g.Em().lnJ.getLooper());
      }
      return this.dGW.c(parama);
    }
    if (this.dGX == null) {
      this.dGX = new at(1, "readsave", 1, g.Em().lnJ.getLooper());
    }
    return this.dGX.c(parama);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if (paraml.getType() != 123) {}
    do
    {
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 12L, 1L, true);
      }
      com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 45L, 1L, true);
      paraml = (l)paraml;
      paramString = new HashSet();
      Object localObject;
      if (paraml.dHW != null)
      {
        localObject = paraml.dHW.iterator();
        while (((Iterator)localObject).hasNext())
        {
          ano localano = (ano)((Iterator)localObject).next();
          String str = localano.rQp.siM;
          if ((localano.rcn == null) || (localano.rcn.siK == null) || (localano.rcn.siK.lR == null))
          {
            com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 11L, 1L, true);
          }
          else
          {
            paramString.add(str);
            j localj = new j();
            localj.username = str;
            localj.csA = 3;
            com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 43L, 1L, true);
            a(new d(localj, localano.rcn.siK.lR));
          }
        }
      }
      if (paraml.dHV != null)
      {
        paraml = paraml.dHV.iterator();
        while (paraml.hasNext())
        {
          localObject = ((bhz)paraml.next()).siM;
          if (!paramString.contains(localObject)) {
            this.dGT.remove(localObject);
          }
        }
      }
      this.dGS = false;
    } while (this.dGV.size() <= 0);
    this.dHa.J(0L, 0L);
  }
  
  public final Bitmap b(String paramString, boolean paramBoolean, int paramInt)
  {
    f localf = Kp();
    Object localObject2;
    if (localf != null) {
      if ((paramInt >= 0) && (paramInt > 5))
      {
        localObject2 = f.jS(String.format("%s$$%d", new Object[] { paramString, Integer.valueOf(paramInt) }));
        if (localObject2 != null)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AvatarService", "find custom corner avatar, custom corner %d", new Object[] { Integer.valueOf(paramInt) });
          return (Bitmap)localObject2;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AvatarService", "can not find custom corner avatar, custom corner %d", new Object[] { Integer.valueOf(paramInt) });
        label91:
        localObject1 = localObject2;
        if (localObject2 != null) {}
      }
    }
    for (Object localObject1 = f.jS(paramString);; localObject1 = null)
    {
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (paramInt < 0) {
          break;
        }
        localObject2 = localObject1;
        if (paramInt <= 5) {
          break;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AvatarService", "create custom corner avatar, custom corner %d", new Object[] { Integer.valueOf(paramInt) });
        localObject1 = com.tencent.mm.sdk.platformtools.c.a((Bitmap)localObject1, false, paramInt);
        localf.e(String.format("%s$$%d", new Object[] { paramString, Integer.valueOf(paramInt) }), (Bitmap)localObject1);
        return (Bitmap)localObject1;
      }
      if (paramBoolean) {
        return null;
      }
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.AvatarService", "get bitmap from cache failed, try to load :%s", new Object[] { paramString });
      if (this.dGT.contains(paramString)) {
        return null;
      }
      this.dGT.add(paramString);
      a(new b(paramString));
      return null;
      localObject2 = null;
      break label91;
    }
  }
  
  public final void cancel()
  {
    while (this.dGV.size() > 0) {
      this.dGT.remove(this.dGV.pop());
    }
  }
  
  public final void jO(String paramString)
  {
    a(new b(paramString));
  }
  
  public final void jP(final String paramString)
  {
    g.Em().H(new Runnable()
    {
      public final void run()
      {
        if (bi.oW(paramString)) {}
        label10:
        label123:
        do
        {
          break label10;
          for (;;)
          {
            return;
            if (!paramString.equals(e.this.dGY))
            {
              Object localObject = e.Kq();
              if (localObject == null) {
                break;
              }
              localObject = ((k)localObject).kc(paramString);
              if ((localObject == null) || (!((j)localObject).getUsername().equals(paramString))) {
                break;
              }
              if (bi.VE() - ((j)localObject).dHT * 60L > 86400L) {}
              for (int i = 1; i != 0; i = 0)
              {
                if (!bi.oW(((j)localObject).Ky())) {
                  break label123;
                }
                com.tencent.mm.sdk.platformtools.x.w("MicroMsg.AvatarService", "dkhurl user has no url [%s]", new Object[] { paramString });
                return;
              }
            }
          }
        } while (e.Kp() == null);
        f.B(paramString, false);
        f.B(paramString, true);
        e.this.jO(paramString);
      }
      
      public final String toString()
      {
        return super.toString() + "|checkAvatarExpire";
      }
    });
  }
  
  public final String jR(String paramString)
  {
    if (bi.oW(paramString)) {
      return "";
    }
    try
    {
      String str1 = String.format("%s%x_%s", new Object[] { "ammURL_", Integer.valueOf(paramString.hashCode()), paramString.substring(paramString.length() - 24, paramString.length() - 4) });
      this.dGZ.put(str1, paramString);
      return str1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str2 = String.format("%s%x_", new Object[] { "ammURL_", Integer.valueOf(paramString.hashCode()) });
      }
    }
  }
  
  private final class a
    implements at.a
  {
    public j dHd = null;
    public byte[] dHe = null;
    
    public a(j paramj)
    {
      this.dHd = paramj;
    }
    
    public final boolean Kr()
    {
      if (this.dHd == null) {
        return false;
      }
      if (!ao.isNetworkConnected(ad.getContext()))
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.HttpGetAvatar", "[tomys] network is unavailable, skip rest loading logic.");
        com.tencent.mm.sdk.platformtools.x.chR();
      }
      String str = this.dHd.Ky();
      Object localObject3 = "";
      int i;
      if (g.Eg().Dx())
      {
        i = d.qVN;
        g.Eg();
        localObject3 = String.format("http://weixin.qq.com/?version=%d&uin=%s&nettype=%d&signal=%d", new Object[] { Integer.valueOf(i), com.tencent.mm.a.o.getString(com.tencent.mm.kernel.a.Df()), Integer.valueOf(ao.getNetTypeForStat(ad.getContext())), Integer.valueOf(ao.getStrength(ad.getContext())) });
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.HttpGetAvatar", "dkreferer dkavatar user: %s referer: %s", new Object[] { this.dHd.getUsername(), localObject3 });
      this.dHe = null;
      Object localObject8 = null;
      Object localObject10 = null;
      Object localObject12 = null;
      Object localObject5 = null;
      Object localObject2 = new ByteArrayOutputStream();
      Object localObject17 = null;
      Object localObject18 = null;
      Object localObject19 = null;
      byte[] arrayOfByte4 = null;
      com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 40L, 1L, true);
      byte[] arrayOfByte1 = arrayOfByte4;
      Object localObject13 = localObject2;
      Object localObject6 = localObject17;
      Object localObject14 = localObject2;
      Object localObject9 = localObject18;
      Object localObject15 = localObject2;
      Object localObject11 = localObject19;
      Object localObject16 = localObject2;
      for (;;)
      {
        try
        {
          localObject1 = com.tencent.mm.network.b.a(str, null);
          arrayOfByte1 = arrayOfByte4;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject6 = localObject17;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject18;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject19;
          localObject16 = localObject2;
          localObject12 = localObject1;
          ((u)localObject1).setRequestMethod("GET");
          arrayOfByte1 = arrayOfByte4;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject6 = localObject17;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject18;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject19;
          localObject16 = localObject2;
          localObject12 = localObject1;
          ((u)localObject1).setRequestProperty("referer", (String)localObject3);
          arrayOfByte1 = arrayOfByte4;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject6 = localObject17;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject18;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject19;
          localObject16 = localObject2;
          localObject12 = localObject1;
          ((u)localObject1).setConnectTimeout(5000);
          arrayOfByte1 = arrayOfByte4;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject6 = localObject17;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject18;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject19;
          localObject16 = localObject2;
          localObject12 = localObject1;
          ((u)localObject1).setReadTimeout(5000);
          arrayOfByte1 = arrayOfByte4;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject6 = localObject17;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject18;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject19;
          localObject16 = localObject2;
          localObject12 = localObject1;
          if (com.tencent.mm.network.b.a((u)localObject1) == 0) {
            continue;
          }
          arrayOfByte1 = arrayOfByte4;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject6 = localObject17;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject18;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject19;
          localObject16 = localObject2;
          localObject12 = localObject1;
          i = ((u)localObject1).getResponseCode();
          arrayOfByte1 = arrayOfByte4;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject6 = localObject17;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject18;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject19;
          localObject16 = localObject2;
          localObject12 = localObject1;
          localObject3 = ((u)localObject1).getHeaderFields();
          if (localObject3 == null) {
            break label3882;
          }
          arrayOfByte1 = arrayOfByte4;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject6 = localObject17;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject18;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject19;
          localObject16 = localObject2;
          localObject12 = localObject1;
          localObject3 = (List)((Map)localObject3).get("X-ErrNo");
          if (localObject3 == null) {
            break label3888;
          }
          arrayOfByte1 = arrayOfByte4;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject6 = localObject17;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject18;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject19;
          localObject16 = localObject2;
          localObject12 = localObject1;
          if (((List)localObject3).size() <= 0) {
            break label3888;
          }
          arrayOfByte1 = arrayOfByte4;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject6 = localObject17;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject18;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject19;
          localObject16 = localObject2;
          localObject12 = localObject1;
          localObject3 = (String)((List)localObject3).get(0);
          arrayOfByte1 = arrayOfByte4;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject6 = localObject17;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject18;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject19;
          localObject16 = localObject2;
          localObject12 = localObject1;
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.HttpGetAvatar", "checkHttpConnection failed! url:%s code:%d xErr:%s", new Object[] { str, Integer.valueOf(i), localObject3 });
          switch (i)
          {
          }
        }
        catch (ProtocolException localProtocolException)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 1L, 1L, true);
          localObject8 = com.tencent.mm.plugin.report.service.h.mEJ;
          localObject9 = localProtocolException.getMessage();
          localObject10 = this.dHd.getUsername();
          if (localObject5 != null) {
            continue;
          }
          localObject1 = "null";
          if (localObject5 != null) {
            continue;
          }
          localObject2 = "null";
          if (localObject5 != null) {
            continue;
          }
          localObject3 = "null";
          ((com.tencent.mm.plugin.report.service.h)localObject8).h(14058, new Object[] { Integer.valueOf(100001), Integer.valueOf(10001), localObject9, Integer.valueOf(0), localObject10, localObject1, localObject2, localObject3, str, "" });
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.HttpGetAvatar", "HTTP download exception: url:%s exception:%s %s", new Object[] { str, localProtocolException.getClass().getSimpleName(), localProtocolException.getMessage() });
          localObject3 = localObject5;
          localObject2 = localObject13;
          localObject1 = arrayOfByte1;
          if (localObject3 == null) {
            continue;
          }
          try
          {
            ((u)localObject3).aBv.disconnect();
            if (localObject1 != null) {
              ((InputStream)localObject1).close();
            }
            if (localObject2 != null) {
              ((ByteArrayOutputStream)localObject2).close();
            }
          }
          catch (Exception localException1)
          {
            Object localObject7;
            byte[] arrayOfByte2;
            byte[] arrayOfByte3;
            Object localObject4;
            int j;
            Object localObject20;
            Object localObject22;
            Object localObject23;
            Object localObject24;
            Object localObject25;
            Object localObject21;
            Object localObject27;
            Object localObject28;
            Object localObject29;
            Object localObject30;
            Object localObject26;
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.HttpGetAvatar", "exception:%s", new Object[] { bi.i(localException1) });
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.HttpGetAvatar", "close conn failed : %s", new Object[] { localException1.getMessage() });
            com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 9L, 1L, true);
            continue;
          }
          return true;
          arrayOfByte1 = arrayOfByte4;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject7 = localObject17;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject18;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject19;
          localObject16 = localObject2;
          localObject12 = localObject1;
          com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 3L, 1L, true);
          arrayOfByte1 = arrayOfByte4;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject7 = localObject17;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject18;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject19;
          localObject16 = localObject2;
          localObject12 = localObject1;
          com.tencent.mm.plugin.report.service.h.mEJ.h(14058, new Object[] { Integer.valueOf(100001), Integer.valueOf(i), "", Integer.valueOf(0), this.dHd.getUsername(), ((u)localObject1).esW, Integer.valueOf(((u)localObject1).erZ), ((u)localObject1).url.getHost(), str, localObject3 });
        }
        catch (SocketTimeoutException localSocketTimeoutException)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 8L, 1L, true);
          localObject5 = com.tencent.mm.plugin.report.service.h.mEJ;
          localObject9 = localSocketTimeoutException.getMessage();
          localObject10 = this.dHd.getUsername();
          if (localObject8 != null) {
            continue;
          }
          localObject1 = "null";
          if (localObject8 != null) {
            continue;
          }
          localObject2 = "null";
          if (localObject8 != null) {
            continue;
          }
          localObject3 = "null";
          ((com.tencent.mm.plugin.report.service.h)localObject5).h(14058, new Object[] { Integer.valueOf(100001), Integer.valueOf(10002), localObject9, Integer.valueOf(0), localObject10, localObject1, localObject2, localObject3, str, "" });
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.HttpGetAvatar", "HTTP download exception: url:%s exception:%s %s", new Object[] { str, localSocketTimeoutException.getClass().getSimpleName(), localSocketTimeoutException.getMessage() });
          localObject1 = localObject7;
          localObject2 = localObject14;
          localObject3 = localObject8;
          continue;
          arrayOfByte2 = arrayOfByte4;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject7 = localObject17;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject18;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject19;
          localObject16 = localObject2;
          localObject12 = localObject1;
          com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 4L, 1L, true);
          arrayOfByte2 = arrayOfByte4;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject7 = localObject17;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject18;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject19;
          localObject16 = localObject2;
          localObject12 = localObject1;
          com.tencent.mm.plugin.report.service.h.mEJ.h(14058, new Object[] { Integer.valueOf(100001), Integer.valueOf(i), "", Integer.valueOf(0), this.dHd.getUsername(), ((u)localObject1).esW, Integer.valueOf(((u)localObject1).erZ), ((u)localObject1).url.getHost(), str, localObject3 });
        }
        catch (IOException localIOException)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 7L, 1L, true);
          localObject5 = com.tencent.mm.plugin.report.service.h.mEJ;
          localObject7 = localIOException.getMessage();
          localObject8 = this.dHd.getUsername();
          if (localObject10 != null) {
            continue;
          }
          localObject1 = "null";
          if (localObject10 != null) {
            continue;
          }
          localObject2 = "null";
          if (localObject10 != null) {
            continue;
          }
          localObject3 = "null";
          ((com.tencent.mm.plugin.report.service.h)localObject5).h(14058, new Object[] { Integer.valueOf(100001), Integer.valueOf(10003), localObject7, Integer.valueOf(0), localObject8, localObject1, localObject2, localObject3, str, "" });
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.HttpGetAvatar", "HTTP download exception: url:%s exception:%s %s", new Object[] { str, localIOException.getClass().getSimpleName(), localIOException.getMessage() });
          localObject1 = localObject9;
          localObject2 = localObject15;
          localObject3 = localObject10;
          continue;
          arrayOfByte3 = arrayOfByte4;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject7 = localObject17;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject18;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject19;
          localObject16 = localObject2;
          localObject12 = localObject1;
          com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 5L, 1L, true);
          arrayOfByte3 = arrayOfByte4;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject7 = localObject17;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject18;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject19;
          localObject16 = localObject2;
          localObject12 = localObject1;
          com.tencent.mm.plugin.report.service.h.mEJ.h(14058, new Object[] { Integer.valueOf(100001), Integer.valueOf(i), "", Integer.valueOf(0), this.dHd.getUsername(), ((u)localObject1).esW, Integer.valueOf(((u)localObject1).erZ), ((u)localObject1).url.getHost(), str, localObject3 });
        }
        catch (Exception localException2)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 0L, 1L, true);
          localObject5 = com.tencent.mm.plugin.report.service.h.mEJ;
          localObject7 = localException2.getMessage();
          localObject8 = this.dHd.getUsername();
          if (localObject12 != null) {
            continue;
          }
          Object localObject1 = "null";
          if (localObject12 != null) {
            continue;
          }
          localObject2 = "null";
          if (localObject12 != null) {
            continue;
          }
          localObject3 = "null";
          ((com.tencent.mm.plugin.report.service.h)localObject5).h(14058, new Object[] { Integer.valueOf(100001), Integer.valueOf(10003), localObject7, Integer.valueOf(0), localObject8, localObject1, localObject2, localObject3, str, "" });
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.HttpGetAvatar", "HTTP download exception: url:%s exception:%s %s", new Object[] { str, localException2.getClass().getSimpleName(), localException2.getMessage() });
          localObject1 = localObject11;
          localObject2 = localObject16;
          localObject3 = localObject12;
          continue;
          localObject4 = arrayOfByte4;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject7 = localObject17;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject18;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject19;
          localObject16 = localObject2;
          localObject12 = localObject1;
          i = ((u)localObject1).aBv.getContentLength();
          localObject4 = arrayOfByte4;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject7 = localObject17;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject18;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject19;
          localObject16 = localObject2;
          localObject12 = localObject1;
          localObject3 = ((u)localObject1).getInputStream();
          if (localObject3 != null) {
            continue;
          }
          localObject4 = localObject3;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject7 = localObject3;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject3;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject3;
          localObject16 = localObject2;
          localObject12 = localObject1;
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.HttpGetAvatar", "getInputStream failed. url:%s", new Object[] { str });
          return true;
          localObject4 = localObject3;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject7 = localObject3;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject3;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject3;
          localObject16 = localObject2;
          localObject12 = localObject1;
          arrayOfByte4 = new byte['Ѐ'];
          localObject4 = localObject3;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject7 = localObject3;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject3;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject3;
          localObject16 = localObject2;
          localObject12 = localObject1;
          j = ((InputStream)localObject3).read(arrayOfByte4);
          if (j == -1) {
            continue;
          }
          localObject4 = localObject3;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject7 = localObject3;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject3;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject3;
          localObject16 = localObject2;
          localObject12 = localObject1;
          ((ByteArrayOutputStream)localObject2).write(arrayOfByte4, 0, j);
          continue;
          localObject4 = localObject3;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject7 = localObject3;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject3;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject3;
          localObject16 = localObject2;
          localObject12 = localObject1;
          com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 41L, 1L, true);
          localObject4 = localObject3;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject7 = localObject3;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject3;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject3;
          localObject16 = localObject2;
          localObject12 = localObject1;
          if (!com.tencent.mm.sdk.a.b.chp()) {
            continue;
          }
          localObject4 = localObject3;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject7 = localObject3;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject3;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject3;
          localObject16 = localObject2;
          localObject12 = localObject1;
          com.tencent.mm.plugin.report.service.h.mEJ.h(14058, new Object[] { Integer.valueOf(100001), Integer.valueOf(20000), "", Integer.valueOf(i), this.dHd.getUsername(), ((u)localObject1).esW, Integer.valueOf(((u)localObject1).erZ), ((u)localObject1).url.getHost(), str, "" });
          localObject4 = localObject3;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject7 = localObject3;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject3;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject3;
          localObject16 = localObject2;
          localObject12 = localObject1;
          this.dHe = ((ByteArrayOutputStream)localObject2).toByteArray();
          localObject4 = localObject3;
          localObject13 = localObject2;
          localObject5 = localObject1;
          localObject7 = localObject3;
          localObject14 = localObject2;
          localObject8 = localObject1;
          localObject9 = localObject3;
          localObject15 = localObject2;
          localObject10 = localObject1;
          localObject11 = localObject3;
          localObject16 = localObject2;
          localObject12 = localObject1;
          ((ByteArrayOutputStream)localObject2).close();
          localObject17 = null;
          localObject18 = null;
          localObject19 = null;
          localObject20 = null;
          arrayOfByte4 = null;
          localObject4 = localObject3;
          localObject13 = arrayOfByte4;
          localObject5 = localObject1;
          localObject7 = localObject3;
          localObject14 = localObject18;
          localObject8 = localObject1;
          localObject9 = localObject3;
          localObject15 = localObject19;
          localObject10 = localObject1;
          localObject11 = localObject3;
          localObject16 = localObject20;
          localObject12 = localObject1;
          ((u)localObject1).aBv.disconnect();
          localObject22 = null;
          localObject23 = null;
          localObject24 = null;
          localObject25 = null;
          localObject21 = null;
          localObject4 = localObject3;
          localObject13 = arrayOfByte4;
          localObject5 = localObject21;
          localObject7 = localObject3;
          localObject14 = localObject18;
          localObject8 = localObject23;
          localObject9 = localObject3;
          localObject15 = localObject19;
          localObject10 = localObject24;
          localObject11 = localObject3;
          localObject16 = localObject20;
          localObject12 = localObject25;
          ((InputStream)localObject3).close();
          localObject27 = null;
          localObject28 = null;
          localObject29 = null;
          localObject30 = null;
          localObject26 = null;
          localObject1 = localObject27;
          localObject2 = localObject17;
          localObject3 = localObject22;
          if (i <= 0) {
            continue;
          }
          localObject4 = localObject26;
          localObject13 = arrayOfByte4;
          localObject5 = localObject21;
          localObject1 = localObject27;
          localObject2 = localObject17;
          localObject3 = localObject22;
          localObject7 = localObject28;
          localObject14 = localObject18;
          localObject8 = localObject23;
          localObject9 = localObject29;
          localObject15 = localObject19;
          localObject10 = localObject24;
          localObject11 = localObject30;
          localObject16 = localObject20;
          localObject12 = localObject25;
          if (this.dHe.length >= i) {
            continue;
          }
          localObject4 = localObject26;
          localObject13 = arrayOfByte4;
          localObject5 = localObject21;
          localObject7 = localObject28;
          localObject14 = localObject18;
          localObject8 = localObject23;
          localObject9 = localObject29;
          localObject15 = localObject19;
          localObject10 = localObject24;
          localObject11 = localObject30;
          localObject16 = localObject20;
          localObject12 = localObject25;
          com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 15L, 1L, true);
          localObject4 = localObject26;
          localObject13 = arrayOfByte4;
          localObject5 = localObject21;
          localObject7 = localObject28;
          localObject14 = localObject18;
          localObject8 = localObject23;
          localObject9 = localObject29;
          localObject15 = localObject19;
          localObject10 = localObject24;
          localObject11 = localObject30;
          localObject16 = localObject20;
          localObject12 = localObject25;
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.HttpGetAvatar", "HTTP downloaded length is smaller than Content-Length field. Drop.");
          localObject1 = localObject27;
          localObject2 = localObject17;
          localObject3 = localObject22;
          continue;
          localObject1 = ((u)localObject5).esW;
          continue;
          localObject2 = Integer.valueOf(((u)localObject5).erZ);
          continue;
          localObject3 = ((u)localObject5).url.getHost();
          continue;
          localObject1 = ((u)localObject8).esW;
          continue;
          localObject2 = Integer.valueOf(((u)localObject8).erZ);
          continue;
          localObject3 = ((u)localObject8).url.getHost();
          continue;
          localObject1 = ((u)localObject10).esW;
          continue;
          localObject2 = Integer.valueOf(((u)localObject10).erZ);
          continue;
          localObject3 = ((u)localObject10).url.getHost();
          continue;
          localObject1 = ((u)localObject12).esW;
          continue;
          localObject2 = Integer.valueOf(((u)localObject12).erZ);
          continue;
          localObject3 = ((u)localObject12).url.getHost();
          continue;
          continue;
        }
        arrayOfByte1 = arrayOfByte4;
        localObject13 = localObject2;
        localObject5 = localObject1;
        localObject6 = localObject17;
        localObject14 = localObject2;
        localObject8 = localObject1;
        localObject9 = localObject18;
        localObject15 = localObject2;
        localObject10 = localObject1;
        localObject11 = localObject19;
        localObject16 = localObject2;
        localObject12 = localObject1;
        com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 6L, 1L, true);
        arrayOfByte1 = arrayOfByte4;
        localObject13 = localObject2;
        localObject5 = localObject1;
        localObject6 = localObject17;
        localObject14 = localObject2;
        localObject8 = localObject1;
        localObject9 = localObject18;
        localObject15 = localObject2;
        localObject10 = localObject1;
        localObject11 = localObject19;
        localObject16 = localObject2;
        localObject12 = localObject1;
        com.tencent.mm.plugin.report.service.h.mEJ.h(14058, new Object[] { Integer.valueOf(100001), Integer.valueOf(i), "", Integer.valueOf(0), this.dHd.getUsername(), ((u)localObject1).esW, Integer.valueOf(((u)localObject1).erZ), ((u)localObject1).url.getHost(), str, localObject3 });
        break label3880;
        arrayOfByte1 = arrayOfByte4;
        localObject13 = localObject2;
        localObject5 = localObject1;
        localObject6 = localObject17;
        localObject14 = localObject2;
        localObject8 = localObject1;
        localObject9 = localObject18;
        localObject15 = localObject2;
        localObject10 = localObject1;
        localObject11 = localObject19;
        localObject16 = localObject2;
        localObject12 = localObject1;
        com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 2L, 1L, true);
        arrayOfByte1 = arrayOfByte4;
        localObject13 = localObject2;
        localObject5 = localObject1;
        localObject6 = localObject17;
        localObject14 = localObject2;
        localObject8 = localObject1;
        localObject9 = localObject18;
        localObject15 = localObject2;
        localObject10 = localObject1;
        localObject11 = localObject19;
        localObject16 = localObject2;
        localObject12 = localObject1;
        com.tencent.mm.plugin.report.service.h.mEJ.h(14058, new Object[] { Integer.valueOf(100001), Integer.valueOf(i), "", Integer.valueOf(0), this.dHd.getUsername(), ((u)localObject1).esW, Integer.valueOf(((u)localObject1).erZ), ((u)localObject1).url.getHost(), str, localObject3 });
        label3880:
        return true;
        label3882:
        localObject3 = null;
        continue;
        label3888:
        localObject3 = "";
      }
    }
    
    public final boolean Ks()
    {
      if ((this.dHd == null) || (bi.oW(this.dHd.getUsername()))) {
        return false;
      }
      if (bi.bC(this.dHe))
      {
        e.this.dGT.remove(this.dHd.getUsername());
        com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 10L, 1L, true);
        return false;
      }
      if (am.a.dBs != null) {
        am.a.dBs.aY(this.dHe.length, 0);
      }
      e.this.a(new e.d(e.this, this.dHd, this.dHe));
      return false;
    }
  }
  
  private final class b
    implements at.a
  {
    Bitmap dHf = null;
    String username = null;
    
    public b(String paramString)
    {
      this.username = paramString;
    }
    
    public final boolean Kr()
    {
      Context localContext = null;
      Object localObject1 = null;
      int i = 0;
      if (bi.oW(this.username)) {
        return false;
      }
      String str1 = this.username;
      boolean bool;
      String str2;
      Object localObject2;
      if (str1 == null)
      {
        bool = false;
        if (bool)
        {
          str2 = (String)e.this.dGZ.get(str1);
          if (!bi.oW(str2))
          {
            localObject2 = q.KH().kc(str1);
            if ((localObject2 == null) || (!str1.equals(((j)localObject2).getUsername())))
            {
              localObject2 = q.KH();
              String str3 = "select img_flag.username,img_flag.imgflag,img_flag.lastupdatetime,img_flag.reserved1,img_flag.reserved2,img_flag.reserved3,img_flag.reserved4 from img_flag where img_flag.reserved2=\"" + bi.oU(str2) + "\"";
              localObject2 = ((k)localObject2).dCZ.b(str3, null, 2);
              if (localObject2 != null) {
                break label248;
              }
            }
          }
        }
      }
      for (;;)
      {
        if ((localObject1 != null) && (!bi.oW(((j)localObject1).getUsername()))) {
          FileOp.y(c.A(((j)localObject1).getUsername(), false), c.A(str1, true));
        }
        localObject1 = new j();
        ((j)localObject1).username = str1;
        ((j)localObject1).csA = 3;
        ((j)localObject1).dHQ = str2;
        ((j)localObject1).dHR = str2;
        ((j)localObject1).bWA = 3;
        ((j)localObject1).by(true);
        ((j)localObject1).bWA = 31;
        q.KH().a((j)localObject1);
        localObject1 = e.Kp();
        if (localObject1 != null) {
          break label293;
        }
        return false;
        bool = str1.startsWith("ammURL_");
        break;
        label248:
        localObject1 = localContext;
        if (((Cursor)localObject2).moveToFirst())
        {
          ((Cursor)localObject2).moveToFirst();
          localObject1 = new j();
          ((j)localObject1).d((Cursor)localObject2);
        }
        ((Cursor)localObject2).close();
      }
      label293:
      if (f.dHm.containsKey(this.username)) {
        i = ((Integer)f.dHm.get(this.username)).intValue();
      }
      if (i != 0)
      {
        q.KG();
        localContext = q.getContext();
        if (localContext != null) {
          ((f)localObject1).f(this.username, com.tencent.mm.compatible.g.a.decodeResource(localContext.getResources(), i));
        }
      }
      this.dHf = ((f)localObject1).jT(this.username);
      return true;
    }
    
    public final boolean Ks()
    {
      if (this.dHf == null)
      {
        e locale = e.this;
        String str = this.username;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AvatarService", "avatar service push: %s", new Object[] { str });
        if (bi.oW(str))
        {
          localObject = null;
          if (localObject != null) {
            break label449;
          }
          locale.dGT.remove(str);
        }
        for (;;)
        {
          return false;
          if ((str.equals(locale.dGY + "@bottle")) && (!bi.a((Boolean)g.Ei().DT().get(60, null), false)))
          {
            localObject = null;
            break;
          }
          if ((str.equals(locale.dGY)) && (!bi.a((Boolean)g.Ei().DT().get(59, null), false)))
          {
            localObject = null;
            break;
          }
          long l = bi.VE();
          e.c localc = (e.c)locale.dGU.get(str);
          if ((localc != null) && (localc.dHg >= 5) && (l - localc.dDj < 600L))
          {
            com.tencent.mm.sdk.platformtools.x.w("MicroMsg.AvatarService", "checkUser block by recentdown: %s", new Object[] { str });
            localObject = null;
            break;
          }
          localObject = e.jQ(str);
          if (localObject == null)
          {
            com.tencent.mm.sdk.platformtools.x.w("MicroMsg.AvatarService", "checkUser block local no need: %s", new Object[] { str });
            localObject = new e.c((byte)0);
            ((e.c)localObject).dHg = 5;
            ((e.c)localObject).dDj = l;
            locale.dGU.m(str, localObject);
            localObject = null;
            break;
          }
          if ((localc == null) || (l - localc.dDj > 600L))
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AvatarService", "new user: %s", new Object[] { str });
            localc = new e.c((byte)0);
            localc.dHg = 1;
            localc.dDj = l;
            locale.dGU.m(str, localc);
          }
          for (;;)
          {
            break;
            if (localc.dHg < 5)
            {
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AvatarService", "checkUser: %s tryCount: %d time: %d", new Object[] { str, Integer.valueOf(localc.dHg), Long.valueOf(l - localc.dDj) });
              localc.dHg += 1;
              localc.dDj = l;
              locale.dGU.m(str, localc);
            }
          }
          label449:
          if (!bi.oW(((j)localObject).Ky()))
          {
            locale.a(new e.a(locale, (j)localObject));
          }
          else
          {
            com.tencent.mm.sdk.platformtools.x.w("MicroMsg.AvatarService", "dkhurl [%s] has NO URL flag:%d !", new Object[] { str, Integer.valueOf(((j)localObject).csA) });
            if (4 == ((j)localObject).csA)
            {
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.AvatarService", "no avatar, do not batch get head image");
            }
            else
            {
              locale.dGV.push(localObject);
              if (locale.dGV.size() > 5) {
                locale.dHa.J(0L, 0L);
              } else {
                locale.dHa.J(1000L, 1000L);
              }
            }
          }
        }
      }
      Object localObject = e.Kp();
      if (localObject != null) {
        ((f)localObject).e(this.username, this.dHf);
      }
      e.this.dGT.remove(this.username);
      return false;
    }
  }
  
  private static final class c
  {
    public long dDj = 0L;
    public int dHg = 0;
  }
  
  private final class d
    implements at.a
  {
    Bitmap bitmap = null;
    byte[] buf;
    j dHh = null;
    
    public d(j paramj, byte[] paramArrayOfByte)
    {
      this.dHh = paramj;
      this.buf = paramArrayOfByte;
    }
    
    public final boolean Kr()
    {
      boolean bool = true;
      if ((this.dHh == null) || (bi.oW(this.dHh.getUsername())))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AvatarService", "SaveAvatar imgFlag info is null");
        com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 13L, 1L, true);
        bool = false;
      }
      Object localObject;
      do
      {
        return bool;
        localObject = e.Kp();
        if (localObject != null)
        {
          this.bitmap = ((f)localObject).f(this.dHh.getUsername(), this.buf);
          if (this.bitmap == null) {
            com.tencent.mm.plugin.report.service.h.mEJ.a(138L, 14L, 1L, true);
          }
        }
        localObject = e.Kq();
      } while (localObject == null);
      this.dHh.bWA = -1;
      this.dHh.Kz();
      ((k)localObject).a(this.dHh);
      return true;
    }
    
    public final boolean Ks()
    {
      if (bi.oW(this.dHh.getUsername())) {
        return false;
      }
      f localf = e.Kp();
      if ((localf != null) && (this.bitmap != null)) {
        localf.e(this.dHh.getUsername(), this.bitmap);
      }
      e.this.dGT.remove(this.dHh.getUsername());
      return false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/aa/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */