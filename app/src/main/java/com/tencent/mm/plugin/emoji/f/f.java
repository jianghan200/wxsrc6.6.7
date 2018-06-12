package com.tencent.mm.plugin.emoji.f;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.g.a.cs;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.protocal.c.bvs;
import com.tencent.mm.protocal.c.bvt;
import com.tencent.mm.protocal.c.fl;
import com.tencent.mm.protocal.c.te;
import com.tencent.mm.protocal.c.tf;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import java.util.LinkedList;

public final class f
  extends com.tencent.mm.ab.l
  implements k
{
  private EmojiInfo bIk;
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private boolean iiu = true;
  
  public f(EmojiInfo paramEmojiInfo)
  {
    this.bIk = paramEmojiInfo;
    paramEmojiInfo = new b.a();
    paramEmojiInfo.dIG = new te();
    paramEmojiInfo.dIH = new tf();
    paramEmojiInfo.uri = "/cgi-bin/micromsg-bin/mmemojiupload";
    paramEmojiInfo.dIF = 703;
    paramEmojiInfo.dII = 0;
    paramEmojiInfo.dIJ = 0;
    this.diG = paramEmojiInfo.KT();
    paramEmojiInfo = (te)this.diG.dID.dIL;
    bvs localbvs = new bvs();
    if (this.bIk != null)
    {
      i.aEA().igx.a(ad.getContext(), this.bIk);
      localbvs.rwt = this.bIk.Xh();
      localbvs.rdV = this.bIk.field_size;
      paramEmojiInfo.rwA.add(localbvs);
    }
  }
  
  private void aEK()
  {
    this.bIk.field_start = 0;
    i.aEA().igx.p(this.bIk);
  }
  
  private static void d(EmojiInfo paramEmojiInfo, boolean paramBoolean)
  {
    if ((paramEmojiInfo != null) && (!bi.oW(paramEmojiInfo.Xh())))
    {
      x.i("MicroMsg.emoji.NetSceneEmojiUpload", "[cpan] publicEmojiSyncTaskEvent emoji md5:%s success:%b", new Object[] { paramEmojiInfo.Xh(), Boolean.valueOf(paramBoolean) });
      cs localcs = new cs();
      localcs.bKf.bKg = paramEmojiInfo.Xh();
      localcs.bKf.bIH = 0;
      localcs.bKf.success = paramBoolean;
      a.sFg.m(localcs);
    }
  }
  
  protected final int Cc()
  {
    return 256;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    int i = 8192;
    int j = -1;
    this.diJ = parame1;
    bvs localbvs = (bvs)((te)this.diG.dID.dIL).rwA.get(0);
    int k;
    if (this.iiu)
    {
      x.d("MicroMsg.emoji.NetSceneEmojiUpload", "dispatcher, firstSend. md5=" + localbvs.rwt);
      localbvs.rdW = 0;
      k = this.bIk.field_size + 0;
      if (k <= 8192) {
        break label666;
      }
    }
    for (;;)
    {
      byte[] arrayOfByte;
      if ((this.bIk.field_reserved4 & EmojiInfo.tcW) == EmojiInfo.tcW)
      {
        arrayOfByte = com.tencent.mm.plugin.emoji.e.e.aDM().a(this.bIk);
        if (!bi.bC(arrayOfByte))
        {
          parame1 = new byte[i];
          x.d("MicroMsg.emoji.NetSceneEmojiUpload", "total length:%d dataLen:%d ", new Object[] { Integer.valueOf(arrayOfByte.length), Integer.valueOf(i) });
          System.arraycopy(arrayOfByte, 0, parame1, 0, i);
        }
      }
      while ((parame1 == null) || (parame1.length <= 0))
      {
        x.e("MicroMsg.emoji.NetSceneEmojiUpload", "readFromFile is null.");
        return -1;
        x.w("MicroMsg.emoji.NetSceneEmojiUpload", "buffer is null.");
        parame1 = new byte[0];
        continue;
        parame1 = this.bIk.eI(0, i);
      }
      localbvs.rdW = 0;
      localbvs.ssk = new com.tencent.mm.bk.b(parame1);
      k = parame1.length;
      int m = localbvs.ssk.lR.length;
      if (this.bIk == null)
      {
        i = -1;
        if (this.bIk != null) {
          break label332;
        }
      }
      for (;;)
      {
        x.i("MicroMsg.emoji.NetSceneEmojiUpload", "buf len:%d, string len:%d dispatcher, first emoji start:%d emoji total:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(i), Integer.valueOf(j) });
        return a(parame, this.diG, this);
        i = this.bIk.field_start;
        break;
        label332:
        j = this.bIk.field_size;
      }
      if ((this.bIk == null) || (this.bIk.field_start == 0))
      {
        x.e("MicroMsg.emoji.NetSceneEmojiUpload", "emoji info is null. or start position is 0.");
        return -1;
      }
      j = this.bIk.field_size - this.bIk.field_start;
      if (j > 8192) {}
      for (;;)
      {
        if ((this.bIk.field_reserved4 & EmojiInfo.tcW) == EmojiInfo.tcW)
        {
          arrayOfByte = com.tencent.mm.plugin.emoji.e.e.aDM().a(this.bIk);
          if (!bi.bC(arrayOfByte))
          {
            parame1 = new byte[i];
            x.d("MicroMsg.emoji.NetSceneEmojiUpload", "total length:%d dataLen:%d", new Object[] { Integer.valueOf(arrayOfByte.length), Integer.valueOf(i) });
            System.arraycopy(arrayOfByte, this.bIk.field_start, parame1, 0, i);
          }
        }
        while ((parame1 == null) || (parame1.length <= 0))
        {
          x.e("MicroMsg.emoji.NetSceneEmojiUpload", "readFromFile is null.");
          return -1;
          x.w("MicroMsg.emoji.NetSceneEmojiUpload", "buffer is null.");
          parame1 = new byte[0];
          continue;
          parame1 = this.bIk.eI(this.bIk.field_start, i);
        }
        i = parame1.length;
        localbvs.rdW = this.bIk.field_start;
        localbvs.ssk = new com.tencent.mm.bk.b(parame1);
        x.i("MicroMsg.emoji.NetSceneEmojiUpload", "buf len:%d, string len:%d", new Object[] { Integer.valueOf(parame1.length), Integer.valueOf(localbvs.ssk.lR.length) });
        x.d("MicroMsg.emoji.NetSceneEmojiUpload", "dispatcher, start:" + this.bIk.field_start + ", total:" + this.bIk.field_size + ", len:" + i);
        return a(parame, this.diG, this);
        i = j;
      }
      label666:
      i = k;
    }
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.emoji.NetSceneEmojiUpload", "onGYNetEnd  errtype:" + paramInt2 + " errcode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      aEK();
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      d(this.bIk, false);
    }
    label311:
    label404:
    label415:
    do
    {
      return;
      te localte = (te)((com.tencent.mm.ab.b)paramq).dID.dIL;
      paramArrayOfByte = (tf)((com.tencent.mm.ab.b)paramq).dIE.dIL;
      if (localte.rwA.size() != paramArrayOfByte.rwA.size())
      {
        x.e("MicroMsg.emoji.NetSceneEmojiUpload", "onGYNetEnd failed. RequestSize not equal RespSize. req size:" + localte.rwA.size() + ", resp size:" + paramArrayOfByte.rwA.size());
        aEK();
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        d(this.bIk, false);
        return;
      }
      paramq = null;
      paramString = paramq;
      if (paramArrayOfByte.rwA != null)
      {
        paramString = paramq;
        if (paramArrayOfByte.rwA.size() > 0) {
          paramString = (bvt)paramArrayOfByte.rwA.get(0);
        }
      }
      int i;
      if ((paramString == null) || (paramString.rwt == null) || (!paramString.rwt.equals(this.bIk.Xh())) || (paramString.rdW < this.bIk.field_start))
      {
        paramq = paramString.rwt;
        i = paramString.rdV;
        if (paramString == null)
        {
          paramInt1 = -1;
          if (this.bIk != null) {
            break label404;
          }
          paramInt2 = -1;
          if (this.bIk != null) {
            break label415;
          }
        }
        for (paramInt3 = -1;; paramInt3 = this.bIk.field_size)
        {
          x.e("MicroMsg.emoji.NetSceneEmojiUpload", "md5:%s invalid server return value. respInfo.TotalLen:%d respInfo.StartPos:%d emoji.getStart():%d emoji total:%d", new Object[] { paramq, Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
          aEK();
          this.diJ.a(4, -2, "", this);
          d(this.bIk, false);
          return;
          paramInt1 = paramString.rdW;
          break;
          paramInt2 = this.bIk.field_start;
          break label311;
        }
      }
      if ((paramString != null) && (this.bIk != null) && (paramString.rfn != 0) && (paramString.rdW == paramString.rdV) && (paramString.rdW > 0))
      {
        x.i("MicroMsg.emoji.NetSceneEmojiUpload", "[cpan] emoji upload success, but md5 backup faild.try to do batch emoji backup. %s respInfo.Ret:%d respInfo.StartPos:%d respInfo.TotalLen:%d", new Object[] { this.bIk.Xh(), Integer.valueOf(paramString.rfn), Integer.valueOf(paramString.rdW), Integer.valueOf(paramString.rdV) });
        aEK();
        this.diJ.a(paramInt2, paramInt3, "", this);
        return;
      }
      if ((paramArrayOfByte.six.rfn != 0) || ((paramString != null) && (paramString.rfn != 0)))
      {
        i = paramArrayOfByte.six.rfn;
        if (paramString == null) {}
        for (paramInt1 = -1;; paramInt1 = paramString.rfn)
        {
          x.e("MicroMsg.emoji.NetSceneEmojiUpload", "onGYNetEnd failed. resp.BaseResponse.Ret:%d respInfo.Ret:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1) });
          aEK();
          this.diJ.a(paramInt2, paramInt3, "", this);
          return;
        }
      }
      if (this.iiu) {
        this.iiu = false;
      }
      if (paramString.rdW >= paramString.rdV)
      {
        this.bIk.field_start = 0;
        this.bIk.field_state = EmojiInfo.tcP;
        this.bIk.field_needupload = EmojiInfo.tcU;
        i.aEA().igx.p(this.bIk);
        this.diJ.a(paramInt2, paramInt3, "", this);
        d(this.bIk, true);
        x.i("MicroMsg.emoji.NetSceneEmojiUpload", "[cpan] emoji upload success.");
        return;
      }
      x.i("MicroMsg.emoji.NetSceneEmojiUpload", "next start pos is :%d", new Object[] { Integer.valueOf(paramString.rdW) });
      this.bIk.field_start = paramString.rdW;
      i.aEA().igx.p(this.bIk);
    } while (a(this.dIX, this.diJ) >= 0);
    this.diJ.a(3, -1, "", this);
    d(this.bIk, false);
  }
  
  public final int getType()
  {
    return 703;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */