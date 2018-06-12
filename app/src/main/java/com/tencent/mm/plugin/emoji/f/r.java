package com.tencent.mm.plugin.emoji.f;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bvu;
import com.tencent.mm.protocal.c.bvv;
import com.tencent.mm.protocal.c.fl;
import com.tencent.mm.protocal.c.tc;
import com.tencent.mm.protocal.c.td;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.y.h;
import java.util.LinkedList;
import junit.framework.Assert;

public final class r
  extends com.tencent.mm.ab.l
  implements k
{
  private EmojiInfo bIk;
  private long dTS = 0L;
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private boolean iiu = true;
  
  public r(String paramString1, String paramString2, EmojiInfo paramEmojiInfo, long paramLong)
  {
    this(paramString1, paramString2, paramEmojiInfo, paramLong, (byte)0);
  }
  
  private r(String paramString1, String paramString2, EmojiInfo paramEmojiInfo, long paramLong, byte paramByte)
  {
    boolean bool;
    Object localObject;
    tc localtc;
    if ((paramString2 != null) && (paramString2.length() > 0) && (paramEmojiInfo != null))
    {
      bool = true;
      Assert.assertTrue(bool);
      this.dTS = paramLong;
      this.bIk = paramEmojiInfo;
      localObject = new b.a();
      ((b.a)localObject).dIG = new bvu();
      ((b.a)localObject).dIH = new bvv();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendemoji";
      ((b.a)localObject).dIF = 175;
      ((b.a)localObject).dII = 68;
      ((b.a)localObject).dIJ = 1000000068;
      this.diG = ((b.a)localObject).KT();
      i.aEA().igx.a(ad.getContext(), paramEmojiInfo);
      localObject = (bvu)this.diG.dID.dIL;
      localtc = new tc();
      localtc.rwt = paramEmojiInfo.Xh();
      localtc.rwx = paramString1;
      localtc.jTu = paramString2;
      localtc.rdV = paramEmojiInfo.field_size;
      localtc.rwv = paramEmojiInfo.getContent();
      localtc.hcE = paramEmojiInfo.field_type;
      localtc.rco = bf.Ir();
      localtc.rwy = 0;
      if (paramString2.endsWith("@chatroom")) {
        paramByte = 2;
      }
      if (paramEmojiInfo.field_catalog != EmojiInfo.tcG) {
        break label299;
      }
      localtc.rww = ("56,2," + paramByte);
    }
    for (;;)
    {
      ((bvu)localObject).rwA.add(localtc);
      ((bvu)localObject).ssl = ((bvu)localObject).rwA.size();
      return;
      bool = false;
      break;
      label299:
      if (paramEmojiInfo.field_catalog == EmojiInfo.tcF) {
        localtc.rww = ("56,1," + paramByte);
      }
    }
  }
  
  protected final int Cc()
  {
    return 256;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    int i = 8192;
    this.diJ = parame1;
    tc localtc = (tc)((bvu)this.diG.dID.dIL).rwA.get(0);
    if (this.iiu)
    {
      x.d("MicroMsg.emoji.NetSceneUploadEmoji", "dispatcher, firstSend. md5=" + localtc.rwt);
      localtc.rwu = new bhy();
      localtc.rdW = 0;
      return a(parame, this.diG, this);
    }
    int j = this.bIk.field_size - this.bIk.field_start;
    if (j > 8192) {}
    for (;;)
    {
      if ((this.bIk.field_reserved4 & EmojiInfo.tcW) == EmojiInfo.tcW)
      {
        byte[] arrayOfByte = com.tencent.mm.plugin.emoji.e.e.aDM().a(this.bIk);
        if (!bi.bC(arrayOfByte))
        {
          parame1 = new byte[i];
          x.d("MicroMsg.emoji.NetSceneUploadEmoji", "total length:%d dataLen:%d", new Object[] { Integer.valueOf(arrayOfByte.length), Integer.valueOf(i) });
          System.arraycopy(arrayOfByte, this.bIk.field_start, parame1, 0, i);
        }
      }
      while ((EmojiLogic.ak(parame1) == EmojiInfo.tcx) && (this.iiu))
      {
        x.e("MicroMsg.emoji.NetSceneUploadEmoji", "Bitmap type error. delete emoji file.");
        this.bIk.cnw();
        return -1;
        x.w("MicroMsg.emoji.NetSceneUploadEmoji", "buffer is null.");
        parame1 = new byte[0];
        continue;
        parame1 = this.bIk.eI(this.bIk.field_start, i);
      }
      if ((parame1 == null) || (parame1.length <= 0))
      {
        x.e("MicroMsg.emoji.NetSceneUploadEmoji", "readFromFile is null.");
        return -1;
      }
      i = parame1.length;
      localtc.rdW = this.bIk.field_start;
      localtc.rwu = new bhy().b(com.tencent.mm.bk.b.bi(parame1));
      if (com.tencent.mm.ac.f.eZ(localtc.jTu))
      {
        au.HU();
        localtc.rco = com.tencent.mm.ac.a.e.lg(c.FT().dW(this.dTS).cqb);
        x.d("MicroMsg.emoji.NetSceneUploadEmoji", "MsgSource:%s", new Object[] { localtc.rco });
      }
      x.d("MicroMsg.emoji.NetSceneUploadEmoji", "dispatcher, start:" + this.bIk.field_start + ", total:" + this.bIk.field_size + ", len:" + i);
      return a(parame, this.diG, this);
      i = j;
    }
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      x.e("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd failed errtype:" + paramInt2 + " errcode:" + paramInt3);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
    do
    {
      return;
      paramArrayOfByte = (bvu)((com.tencent.mm.ab.b)paramq).dID.dIL;
      paramq = (bvv)((com.tencent.mm.ab.b)paramq).dIE.dIL;
      if (paramArrayOfByte.rwA.size() != paramq.rwA.size())
      {
        x.e("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd failed. RequestSize not equal RespSize. req size:" + paramq.rwA.size() + ", resp size:" + paramArrayOfByte.rwA.size());
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      paramString = (td)paramq.rwA.get(0);
      if ((paramString.rwt == null) || (!paramString.rwt.equals(this.bIk.Xh())) || (paramString.rdW < this.bIk.field_start))
      {
        x.e("MicroMsg.emoji.NetSceneUploadEmoji", "invalid server return value; start=" + paramString.rdW + ", size=" + this.bIk.field_size);
        this.diJ.a(4, -2, "", this);
        this.bIk.field_start = 0;
        i.aEA().igx.q(this.bIk);
        return;
      }
      if (paramq.six.rfn != 0)
      {
        x.e("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd failed. resp.BaseResponse.Ret:%d", new Object[] { Integer.valueOf(paramq.six.rfn) });
        this.diJ.a(4, -2, "", this);
        return;
      }
      if (this.iiu) {
        this.iiu = false;
      }
      if (paramString.rdW >= paramString.rdV)
      {
        x.d("MicroMsg.emoji.NetSceneUploadEmoji", "respInfo.getMsgID() " + paramString.rwz);
        au.HU();
        paramq = c.FT().dW(this.dTS);
        x.d("MicroMsg.emoji.NetSceneUploadEmoji", "dkmsgid  set svrmsgid %d -> %d", new Object[] { Integer.valueOf(paramString.rwz), Integer.valueOf(af.exn) });
        if ((10007 == af.exm) && (af.exn != 0))
        {
          paramString.rwz = af.exn;
          af.exn = 0;
        }
        paramq.ax(paramString.rwz);
        au.HU();
        c.FT().a(this.dTS, paramq);
        this.bIk.field_start = 0;
        this.bIk.field_lastUseTime = System.currentTimeMillis();
        this.bIk.field_state = EmojiInfo.tcP;
        i.aEA().igx.q(this.bIk);
        if (paramq.aQm()) {
          com.tencent.mm.modelstat.b.ehL.a(paramq, h.g(paramq));
        }
        for (;;)
        {
          this.diJ.a(paramInt2, paramInt3, "", this);
          return;
          com.tencent.mm.modelstat.b.ehL.f(paramq);
        }
      }
      this.bIk.field_start = paramString.rdW;
      this.bIk.field_lastUseTime = System.currentTimeMillis();
      i.aEA().igx.q(this.bIk);
    } while (a(this.dIX, this.diJ) >= 0);
    this.diJ.a(3, -1, "", this);
  }
  
  public final int getType()
  {
    return 175;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/emoji/f/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */