package com.tencent.mm.plugin.emoji.g;

import com.tencent.mm.ab.d.a;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.a;
import java.util.Map;

public final class e
  implements bv.a
{
  public final void a(d.a parama)
  {
    parama = parama.dIN;
    if (parama.jQd == 10002)
    {
      parama = ab.a(parama.rcl);
      if (bi.oW(parama)) {
        x.w("MicroMsg.emoji.EmojiRecommnedSysCmdMsgListener", "msg content is null");
      }
      do
      {
        return;
        localObject = bl.z(parama, "sysmsg");
      } while ((localObject == null) || (((Map)localObject).size() <= 0));
      Object localObject = (String)((Map)localObject).get(".sysmsg.$type");
      if ((!bi.oW((String)localObject)) && (((String)localObject).equalsIgnoreCase("NewRecommendEmotion")))
      {
        parama = d.zH(parama);
        localObject = i.aEA().igy;
        String str = EmojiGroupInfo.tcv;
        ((a)localObject).diF.delete("EmojiGroupInfo", "recommand=? and type!=? and status!=?", new String[] { "1", str, "7" });
        localObject = i.aEA().igy;
        x.i("MicroMsg.emoji.EmojiGroupInfoStorage", "[insertRecommendEmojiGroupInfo]");
        ((a)localObject).ds(parama);
        return;
      }
      x.e("MicroMsg.emoji.EmojiRecommnedSysCmdMsgListener", "not emoji message type :" + (String)localObject);
      return;
    }
    x.i("MicroMsg.emoji.EmojiRecommnedSysCmdMsgListener", "not new xml type:%d ", new Object[] { Integer.valueOf(parama.jQd) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/emoji/g/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */