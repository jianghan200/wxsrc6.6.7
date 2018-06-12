package com.tencent.mm.modelstat;

import android.content.Intent;
import android.os.Looper;
import com.tencent.mars.xlog.LogLogic;
import com.tencent.mars.xlog.Xlog;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.ab.o;
import com.tencent.mm.bv.c;
import com.tencent.mm.g.a.ig;
import com.tencent.mm.g.a.sn;
import com.tencent.mm.kernel.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.model.q;
import com.tencent.mm.network.a.b.a;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.io.File;
import java.util.Map;

public final class l
  extends b.a
  implements com.tencent.mm.ab.d
{
  public static long a(File paramFile, long paramLong)
  {
    long l1 = 0L;
    long l2 = l1;
    for (;;)
    {
      int i;
      long l3;
      try
      {
        paramFile = paramFile.listFiles();
        i = 0;
        l2 = l1;
        l3 = l1;
        if (i < paramFile.length)
        {
          l2 = l1;
          if (paramFile[i].isDirectory())
          {
            l2 = l1;
            l1 += a(paramFile[i], paramLong);
          }
          else
          {
            l2 = l1;
            if (paramFile[i].length() > paramLong)
            {
              l2 = l1;
              x.i("MicroMsg.NetStatMsgExtension", "getFolderSize filesize:%s [%s]", new Object[] { Long.valueOf(paramFile[i].length()), paramFile[i].getPath() });
            }
            l2 = l1;
            l3 = paramFile[i].length();
            l1 += l3;
          }
        }
      }
      catch (Exception paramFile)
      {
        x.e("MicroMsg.NetStatMsgExtension", "getFolderSize :%s", new Object[] { bi.i(paramFile) });
        l3 = l2;
      }
      return l3;
      i += 1;
    }
  }
  
  public static void b(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (!g.Eg().Dx()) {
      return;
    }
    switch (paramInt1)
    {
    case 6: 
    case 7: 
    default: 
      return;
    case 4: 
      x.d("MicroMsg.NetStatMsgExtension", "recv bytes flow:" + paramInt3);
      if (paramBoolean)
      {
        n.z(paramInt3, 0, paramInt2);
        return;
      }
    case 5: 
      x.d("MicroMsg.NetStatMsgExtension", "send bytes flow:" + paramInt3);
      if (paramBoolean)
      {
        n.z(0, paramInt3, paramInt2);
        return;
      }
      n.A(0, paramInt3, paramInt2);
      return;
      n.A(paramInt3, 0, paramInt2);
      return;
    }
    af.Wp("dns_failed_report");
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString1, int paramInt3, String paramString2, boolean paramBoolean)
  {
    g.Em().h(new l.3(this, paramInt1, paramInt2, paramString1, paramInt3, paramString2, paramBoolean), 3000L);
  }
  
  public final d.b b(com.tencent.mm.ab.d.a parama)
  {
    if (!g.Eg().Dx()) {
      x.e("MicroMsg.NetStatMsgExtension", "skip ipxx stat while account not set");
    }
    do
    {
      return null;
      parama = parama.dIN.rcl.siM;
      x.d("MicroMsg.NetStatMsgExtension", "onPreAddMessage %s", new Object[] { parama });
    } while (bi.oW(parama));
    x.i("MicroMsg.NetStatMsgExtension", "get ipxx cmd=%s", new Object[] { parama });
    final Object localObject1 = bl.z(parama, "cmd");
    long l;
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = bl.z(parama, "ClearCache");
      if (localObject1 != null)
      {
        l = bi.getLong((String)((Map)localObject1).get(".ClearCache.androidCacheMask"), 0L);
        localObject1 = (String)((Map)localObject1).get(".ClearCache.message");
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("key_mask", l);
        ((Intent)localObject2).putExtra("key_message", (String)localObject1);
        com.tencent.mm.bg.d.e(ad.getContext(), ".ui.ClearCacheUI", (Intent)localObject2);
      }
    }
    for (;;)
    {
      x.chR();
      g.DF().dJs.kg(parama);
      try
      {
        Thread.sleep(50L, 0);
        LogLogic.initIPxxLogInfo();
        MMProtocalJni.setProtocalJniLogLevel(new Xlog().getLogLevel());
        return null;
        final int i = bi.getInt((String)((Map)localObject1).get(".cmd.trace.$code"), -1);
        if (i > 0)
        {
          if (i == 6)
          {
            parama = new sn();
            com.tencent.mm.sdk.b.a.sFg.m(parama);
            return null;
          }
          parama = (String)((Map)localObject1).get(".cmd.trace.$class");
          int j = bi.getInt((String)((Map)localObject1).get(".cmd.trace.$size"), 0);
          int k = bi.getInt((String)((Map)localObject1).get(".cmd.trace.$type"), 0);
          com.tencent.mm.bv.d.cov().c(new com.tencent.mm.bv.d.a(parama, i, j, k));
          return null;
        }
        i = bi.getInt((String)((Map)localObject1).get(".cmd.hprof.$type"), -1);
        if (i > 0)
        {
          x.d("MicroMsg.NetStatMsgExtension", "hprof type: %d", new Object[] { Integer.valueOf(i) });
          c.DC(i);
          return null;
        }
        if ("android".equalsIgnoreCase((String)((Map)localObject1).get(".cmd.hotpatch.$os")))
        {
          parama = new ig();
          parama.bRH.bRI = ((String)((Map)localObject1).get(".cmd.hotpatch.xml.$url"));
          parama.bRH.bRJ = ((String)((Map)localObject1).get(".cmd.hotpatch.xml.$signature"));
          parama.bRH.bRK = ((String)((Map)localObject1).get(".cmd.hotpatch.$url"));
          parama.bRH.bRL = ((String)((Map)localObject1).get(".cmd.hotpatch.$signature"));
          com.tencent.mm.sdk.b.a.sFg.a(parama, Looper.myLooper());
          return null;
        }
        i = bi.getInt((String)((Map)localObject1).get(".cmd.clearfile.$fb"), -1);
        if (i == 1)
        {
          l = bi.getInt((String)((Map)localObject1).get(".cmd.clearfile.$ps"), 1048576);
          g.Em().H(new l.1(this, l));
        }
        for (;;)
        {
          i = bi.getInt((String)((Map)localObject1).get(".cmd.updzh.$pt"), -1);
          localObject1 = (String)((Map)localObject1).get(".cmd.updzh.$pd");
          x.d("MicroMsg.NetStatMsgExtension", "StackReportUploader pt:%d pd:%s", new Object[] { Integer.valueOf(i), localObject1 });
          if ((i <= 0) || (bi.oW((String)localObject1))) {
            break;
          }
          g.Em().H(new Runnable()
          {
            public final void run()
            {
              switch (i)
              {
              default: 
                return;
              case 1: 
                ae.a(g.Ei().dqp + localObject1, q.GF(), false, true);
                return;
              case 2: 
                ae.a(g.Ei().cachePath + localObject1, q.GF(), false, true);
                return;
              }
              ae.a(localObject1, q.GF(), false, true);
            }
            
            public final String toString()
            {
              return super.toString() + "|onPreAddMessage";
            }
          });
          break;
          if (i == 2)
          {
            localObject2 = (String)((Map)localObject1).get(".cmd.clearfile.$pd");
            File localFile = new File((String)localObject2);
            if (localFile.exists())
            {
              l = localFile.length();
              label688:
              x.i("MicroMsg.NetStatMsgExtension", "clearfile delete :[%s] length:%s", new Object[] { localObject2, Long.valueOf(l) });
              com.tencent.mm.a.e.deleteFile((String)localObject2);
              localFile = new File((String)localObject2);
              if (!localFile.exists()) {
                break label781;
              }
            }
            label781:
            for (l = localFile.length();; l = -1L)
            {
              x.i("MicroMsg.NetStatMsgExtension", "clearfile delete finish :[%s] length:%s", new Object[] { localObject2, Long.valueOf(l) });
              break;
              l = -1L;
              break label688;
            }
          }
          if (i == 3)
          {
            x.i("MicroMsg.NetStatMsgExtension", "running  clearfile start:" + g.Ei().DQ() + ".tem");
            com.tencent.mm.a.e.deleteFile(g.Ei().DQ() + ".tem");
            com.tencent.mm.a.e.deleteFile(g.Ei().DR() + ".tem");
            x.i("MicroMsg.NetStatMsgExtension", "running  clearfile end:" + g.Ei().DQ() + ".tem");
          }
        }
      }
      catch (Exception parama)
      {
        for (;;) {}
      }
    }
  }
  
  public final void h(bd parambd) {}
  
  public final void k(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!g.Eg().Dx()) {
      return;
    }
    if (!g.Ek().dqL.drf)
    {
      x.i("MicroMsg.NetStatMsgExtension", "kernel has not startup");
      return;
    }
    x.i("MicroMsg.NetStatMsgExtension", "reportNetFlow wifi[%d, %d] mobile[%d, %d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    if (paramInt1 > 0)
    {
      if (paramInt2 <= 0) {
        break label108;
      }
      label80:
      n.z(paramInt1, paramInt2, 0);
      if (paramInt3 <= 0) {
        break label113;
      }
      label90:
      if (paramInt4 <= 0) {
        break label118;
      }
    }
    for (;;)
    {
      n.A(paramInt3, paramInt4, 0);
      return;
      paramInt1 = 0;
      break;
      label108:
      paramInt2 = 0;
      break label80;
      label113:
      paramInt3 = 0;
      break label90;
      label118:
      paramInt4 = 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelstat/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */