package com.tencent.mm.modelvideo;

import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bd.b;
import com.tencent.mm.model.m;
import com.tencent.mm.model.s;
import com.tencent.mm.modelcontrol.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.video.c;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.aa.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class i
  implements f.a
{
  LinkedList<com.tencent.mm.storage.bd> emG = new LinkedList();
  long emH = 0L;
  private int emI = 0;
  private int emJ = 0;
  public boolean emK = false;
  public boolean emL = false;
  private boolean emM = false;
  private boolean emN = false;
  f emO = null;
  long emP = 0L;
  
  public final void ST()
  {
    g.Em().H(new Runnable()
    {
      public final void run()
      {
        if (o.Tf().bFg) {
          break label9;
        }
        label9:
        Object localObject1;
        int i;
        for (;;)
        {
          return;
          if ((i.this.emO == null) && (!i.this.emK) && (!i.this.emL))
          {
            if (!i.this.emG.isEmpty()) {
              break;
            }
            localObject1 = i.this;
            if (bi.bG(((i)localObject1).emP) > 600L) {
              ((i)localObject1).emP = bi.VE();
            }
            for (i = 1; i != 0; i = 0)
            {
              i.a(i.this);
              return;
            }
          }
        }
        Object localObject5 = new PBool();
        for (;;)
        {
          Object localObject6;
          int j;
          synchronized (i.this.emG)
          {
            Iterator localIterator = i.this.emG.iterator();
            localObject1 = null;
            if (!localIterator.hasNext()) {
              break label709;
            }
            localObject1 = (com.tencent.mm.storage.bd)localIterator.next();
            localObject6 = i.this;
            if (localObject1 == null)
            {
              ((PBool)localObject5).value = true;
              i = 0;
              if (!((PBool)localObject5).value) {
                break label957;
              }
              localIterator.remove();
              break label957;
            }
            r localr = t.nW(((cm)localObject1).field_imgPath);
            if ((localr != null) && (localr.Tp()))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PreloadVideoService", "%d it finish download all file[%s], needn't preload", new Object[] { Integer.valueOf(localObject6.hashCode()), localr.getFileName() });
              Object localObject7 = bl.z(localr.Tm(), "msg");
              String str = (String)((Map)localObject7).get(".msg.videomsg.$newmd5");
              localObject7 = (String)((Map)localObject7).get(".msg.videomsg.$cdnvideourl");
              boolean bool = s.fq(localr.Tj());
              if (!bool) {
                break label964;
              }
              i = 2;
              long l = localr.dHI;
              if (!s.fq(localr.Tj())) {
                break label969;
              }
              j = m.gK(localr.Tj());
              ((i)localObject6).a(str, i, l, localr.Tk(), localr.Tj(), j, (String)localObject7, "", "");
              h.mEJ.a(354L, 146L, 1L, false);
              if (bool)
              {
                h.mEJ.a(354L, 126L, 1L, false);
                ((PBool)localObject5).value = true;
                i = 0;
                continue;
              }
              h.mEJ.a(354L, 125L, 1L, false);
            }
          }
          if (bi.bH(((cm)localObject2).field_createTime) >= 86400000L)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PreloadVideoService", "%d more than 1 day don't preload", new Object[] { Integer.valueOf(localObject6.hashCode()) });
            ((PBool)localObject5).value = true;
            i = 0;
          }
          else
          {
            if (((i)localObject6).bU(true)) {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PreloadVideoService", "%d check c2c video preload timestamp[%d]", new Object[] { Integer.valueOf(localObject6.hashCode()), Long.valueOf(((i)localObject6).emH) });
            }
            label696:
            for (;;)
            {
              ((PBool)localObject5).value = false;
              i = 0;
              break;
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PreloadVideoService", "%d check c2c video preload %d %s", new Object[] { Integer.valueOf(localObject6.hashCode()), Long.valueOf(((cm)localObject2).field_msgId), ((cm)localObject2).cqb });
              localObject6 = com.tencent.mm.model.bd.iF(((cm)localObject2).cqb);
              if (localObject6 == null)
              {
                ((PBool)localObject5).value = true;
                i = 0;
                break;
              }
              if (((bd.b)localObject6).dCB <= 0)
              {
                ((PBool)localObject5).value = true;
                i = 0;
                break;
              }
              if (!b.lz(((bd.b)localObject6).dCD))
              {
                if (ao.isWifi(ad.getContext())) {
                  i = ((bd.b)localObject6).dCC & 0x1;
                }
                for (;;)
                {
                  if (i <= 0) {
                    break label696;
                  }
                  ((PBool)localObject5).value = false;
                  i = 1;
                  break;
                  if (ao.is4G(ad.getContext()))
                  {
                    i = ((bd.b)localObject6).dCC & 0x2;
                  }
                  else
                  {
                    if (!ao.is3G(ad.getContext())) {
                      break label698;
                    }
                    i = ((bd.b)localObject6).dCC & 0x4;
                  }
                }
              }
            }
            label698:
            ((PBool)localObject5).value = false;
            i = 0;
            continue;
            label709:
            label957:
            do
            {
              if (localObject2 == null) {
                break;
              }
              i.this.emO = new f(((cm)localObject2).field_msgId);
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PreloadVideoService", "%s start to preload video[%s]", new Object[] { Integer.valueOf(i.this.hashCode()), i.this.emO.SS() });
              if (i.this.emO.a(i.this) >= 0) {
                break;
              }
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.PreloadVideoService", "%s curr preload task do scene error.", new Object[] { Integer.valueOf(i.this.hashCode()) });
              synchronized (i.this.emG)
              {
                ??? = i.this.emG.iterator();
                while (((Iterator)???).hasNext())
                {
                  localObject5 = (com.tencent.mm.storage.bd)((Iterator)???).next();
                  if ((localObject5 != null) && (((cm)localObject5).field_msgId == i.this.emO.bJC))
                  {
                    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PreloadVideoService", "%d find msg[%d], remove now", new Object[] { Integer.valueOf(i.this.hashCode()), Long.valueOf(i.this.emO.bJC) });
                    ((Iterator)???).remove();
                  }
                }
              }
              i.this.emO = null;
              return;
            } while (i != 0);
            continue;
            label964:
            i = 1;
            continue;
            label969:
            j = 0;
          }
        }
      }
    });
  }
  
  public final void a(final f paramf, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    if (paramf == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.PreloadVideoService", "%d on preload finish but scene is null?", new Object[] { Integer.valueOf(hashCode()) });
      return;
    }
    if (this.emO != paramf) {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.PreloadVideoService", "%d on preload finish, but scene callback not same object.", new Object[] { Integer.valueOf(hashCode()) });
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PreloadVideoService", "%d preload video[%s] finish success[%b] range[%d, %d]", new Object[] { Integer.valueOf(hashCode()), paramf.SS(), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    g.Em().H(new Runnable()
    {
      public final void run()
      {
        long l = paramf.bJC;
        synchronized (i.this.emG)
        {
          Iterator localIterator = i.this.emG.iterator();
          while (localIterator.hasNext())
          {
            com.tencent.mm.storage.bd localbd = (com.tencent.mm.storage.bd)localIterator.next();
            if ((localbd != null) && (localbd.field_msgId == l))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PreloadVideoService", "%d find msg[%d], remove now", new Object[] { Integer.valueOf(i.this.hashCode()), Long.valueOf(l) });
              localIterator.remove();
            }
          }
        }
        i.this.bT(true);
        if (i.this.emO != null) {
          i.this.emO.emp = null;
        }
        i.this.emO = null;
        i.a(i.this);
        i.this.ST();
      }
    });
  }
  
  public final void a(String paramString1, int paramInt1, long paramLong, String paramString2, String paramString3, int paramInt2, String paramString4, String paramString5, String paramString6)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(bi.VE()).append(",");
    localStringBuffer.append(bi.VE()).append(",");
    localStringBuffer.append(0).append(",");
    localStringBuffer.append(paramString1).append(",");
    localStringBuffer.append(paramInt1).append(",");
    localStringBuffer.append(0).append(",");
    localStringBuffer.append(paramLong).append(",");
    localStringBuffer.append(",");
    localStringBuffer.append(paramString2).append(",");
    localStringBuffer.append(paramString3).append(",");
    localStringBuffer.append(paramInt2).append(",");
    localStringBuffer.append(paramString4).append(",");
    localStringBuffer.append(paramString5).append(",");
    localStringBuffer.append(c.OC(paramString6));
    paramString1 = localStringBuffer.toString();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PreloadVideoService", "%d rpt content[%s]", new Object[] { Integer.valueOf(hashCode()), paramString1 });
    new com.tencent.mm.g.b.a.f(paramString1).RD();
  }
  
  public final void bT(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.emI = ((Integer)g.Ei().DT().get(aa.a.sXs, Integer.valueOf(0))).intValue();
      this.emI += 1;
      g.Ei().DT().a(aa.a.sXs, Integer.valueOf(this.emI));
      return;
    }
    this.emJ = ((Integer)g.Ei().DT().get(aa.a.sXt, Integer.valueOf(0))).intValue();
    this.emJ += 1;
    g.Ei().DT().a(aa.a.sXt, Integer.valueOf(this.emJ));
  }
  
  public final boolean bU(boolean paramBoolean)
  {
    int k = 100;
    this.emH = ((Long)g.Ei().DT().get(aa.a.sXr, Long.valueOf(-1L))).longValue();
    if (bi.bH(this.emH) >= 86400000L)
    {
      this.emH = bi.VF();
      g.Ei().DT().a(aa.a.sXr, Long.valueOf(this.emH));
      g.Ei().DT().a(aa.a.sXs, Integer.valueOf(0));
      g.Ei().DT().a(aa.a.sXt, Integer.valueOf(0));
      this.emN = false;
      this.emM = false;
    }
    this.emI = ((Integer)g.Ei().DT().get(aa.a.sXs, Integer.valueOf(0))).intValue();
    this.emJ = ((Integer)g.Ei().DT().get(aa.a.sXt, Integer.valueOf(0))).intValue();
    int j;
    int i;
    if (paramBoolean)
    {
      j = this.emI;
      i = ((a)g.l(a.class)).AT().getInt("C2CMaxPreloadVideo", 100);
      if (i > 0) {
        break label380;
      }
      i = k;
    }
    label212:
    label351:
    label380:
    for (;;)
    {
      boolean bool;
      if (j >= i)
      {
        bool = true;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PreloadVideoService", "%d check more preload count result[%b] config[%d] hadPreloadCount[%d %d %d] ", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(this.emI), Integer.valueOf(this.emJ) });
        if (bool)
        {
          if (!paramBoolean) {
            break label351;
          }
          if (!this.emM)
          {
            this.emM = true;
            h.mEJ.a(354L, 127L, 1L, false);
          }
        }
      }
      while (this.emN)
      {
        return bool;
        j = this.emJ;
        i = ((a)g.l(a.class)).AT().getInt("SnsMaxPreloadVideo", 100);
        break;
        bool = false;
        break label212;
      }
      this.emN = true;
      h.mEJ.a(354L, 128L, 1L, false);
      return bool;
    }
  }
  
  public final void stopDownload()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PreloadVideoService", "%d stop download", new Object[] { Integer.valueOf(hashCode()) });
    g.Em().H(new i.1(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/modelvideo/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */