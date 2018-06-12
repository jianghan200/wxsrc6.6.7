package com.tencent.mm.plugin.emoji.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.q;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.protocal.c.fs;
import com.tencent.mm.protocal.c.ft;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class c
  implements com.tencent.mm.ab.e
{
  private com.tencent.mm.ak.a.c.c ihc = new c.1(this);
  
  public static void bi(String paramString, int paramInt)
  {
    q localq = new q();
    localq.bGO.bGP = paramString;
    localq.bGO.status = paramInt;
    localq.bGO.bGQ = 0;
    com.tencent.mm.sdk.b.a.sFg.m(localq);
    x.d("MicroMsg.emoji.EmojiAppMsgDownloadService", "attachid:%s percentage:%d status:%d", new Object[] { paramString, Integer.valueOf(0), Integer.valueOf(paramInt) });
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    switch (paraml.getType())
    {
    default: 
      x.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "no download app attach scene");
    case 221: 
      return;
    }
    String str1 = "";
    Object localObject = (com.tencent.mm.plugin.emoji.f.e)paraml;
    if (((com.tencent.mm.plugin.emoji.f.e)localObject).iis == com.tencent.mm.plugin.emoji.f.e.iiq)
    {
      if (((com.tencent.mm.plugin.emoji.f.e)localObject).diG == null)
      {
        paraml = null;
        paramString = str1;
        if (paraml != null)
        {
          paramString = str1;
          if (paraml.rgB != null)
          {
            paramString = str1;
            if (paraml.rgB.size() > 0) {
              paramString = (String)paraml.rgB.get(0);
            }
          }
        }
        if ((paramInt1 != 0) || (paramInt2 != 0)) {
          break label448;
        }
        if (((com.tencent.mm.plugin.emoji.f.e)localObject).diG != null) {
          break label222;
        }
      }
      label222:
      for (paraml = null;; paraml = (ft)((com.tencent.mm.plugin.emoji.f.e)localObject).diG.dIE.dIL)
      {
        if ((paraml != null) && (paraml.rgD != null) && (paraml.rgD.size() > 0)) {
          break label241;
        }
        bi(paramString, 2);
        x.e("MicroMsg.emoji.EmojiAppMsgDownloadService", "NetSceneBatchEmojiDownLoad MD5 to URL failed.");
        return;
        paraml = (fs)((com.tencent.mm.plugin.emoji.f.e)localObject).diG.dID.dIL;
        break;
      }
      label241:
      paraml = (ta)paraml.rgD.get(0);
      au.HU();
      str1 = EmojiLogic.L(com.tencent.mm.model.c.Gg(), "", paraml.rwk);
      String str2;
      if ((!bi.oW(paraml.rwm)) && (!bi.oW(paraml.rwn)))
      {
        paramString = i.aDZ();
        localObject = paraml.rwm;
        str2 = paraml.rwm;
        paramString.a((String)localObject, f.p(str1 + "_encrypt", new Object[] { paraml, Boolean.valueOf(true) }), this.ihc);
        com.tencent.mm.plugin.emoji.c.cA(6L);
        return;
      }
      if (!bi.oW(paraml.jPK))
      {
        paramString = i.aDZ();
        localObject = paraml.jPK;
        str2 = paraml.jPK;
        paramString.a((String)localObject, f.o(str1, new Object[] { paraml, Boolean.valueOf(false) }), this.ihc);
        com.tencent.mm.plugin.emoji.c.cA(1L);
        return;
      }
      x.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "no url info. download faild.");
      bi(paramString, 2);
      return;
      label448:
      bi(paramString, 2);
      return;
    }
    x.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "no request type ");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */