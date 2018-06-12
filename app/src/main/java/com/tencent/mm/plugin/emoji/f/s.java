package com.tencent.mm.plugin.emoji.f;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.bwk;
import com.tencent.mm.protocal.c.bwl;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class s
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private int eKI;
  private List<String> iiZ = new ArrayList();
  
  public s(List<String> paramList, int paramInt)
  {
    b.a locala = new b.a();
    locala.dIG = new bwk();
    locala.dIH = new bwl();
    locala.uri = "/cgi-bin/micromsg-bin/mmuploadmypanellist";
    locala.dIF = 717;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.iiZ = paramList;
    this.eKI = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    bwk localbwk = (bwk)this.diG.dID.dIL;
    localbwk.qZc = this.eKI;
    if (this.iiZ != null)
    {
      Iterator localIterator = this.iiZ.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        parame1 = str;
        if (!bi.oW(str))
        {
          parame1 = str;
          if (str.equals(String.valueOf(EmojiGroupInfo.tcy))) {
            parame1 = "com.tencent.xin.emoticon.tusiji";
          }
        }
        localbwk.ssL.add(parame1);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.NetSceneUploadMyPanelList", "product id is:%s", new Object[] { parame1 });
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneUploadMyPanelList", "opcode is:%d mProductIdList size:%s", new Object[] { Integer.valueOf(this.eKI), Integer.valueOf(this.iiZ.size()) });
    }
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NetSceneUploadMyPanelList", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      au.HU();
      c.DT().a(aa.a.sOR, Long.valueOf(System.currentTimeMillis()));
      au.HU();
      c.DT().a(aa.a.sOU, Boolean.valueOf(true));
      h.mEJ.a(165L, 0L, 1L, false);
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      au.HU();
      c.DT().a(aa.a.sOR, Long.valueOf(System.currentTimeMillis() - 86400000L + 3600000L));
      h.mEJ.a(165L, 1L, 1L, false);
    }
  }
  
  public final int getType()
  {
    return 717;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/emoji/f/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */