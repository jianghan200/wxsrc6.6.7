package com.tencent.mm.plugin.emoji.c;

import com.tencent.mm.a.e;
import com.tencent.mm.g.a.be;
import com.tencent.mm.g.a.be.a;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.e.i;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public final class c
  extends com.tencent.mm.sdk.b.c<be>
{
  public c()
  {
    this.sFo = be.class.getName().hashCode();
  }
  
  private static boolean a(be parambe)
  {
    i locali;
    if (parambe.bIK.bIC == 37) {
      if ((parambe.bIK.bID == 5) && (parambe.bIK.bIH == 2))
      {
        locali = i.aEd();
        x.i("MicroMsg.emoji.EmojiResUpdateMgr", "delete emoji egg!");
      }
    }
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      au.HU();
      e.deleteFile(com.tencent.mm.model.c.Gp() + "eggingfo.ini");
      e.k(new File(i.getDataEmojiPath(), i.ifD));
      locali.ifU = null;
      if (parambe.bIK.bIH == 0) {
        x.i("MicroMsg.emoji.EmojiResUpdateOperationListener", "cache res type:%d subType:%d", new Object[] { Integer.valueOf(parambe.bIK.bIC), Integer.valueOf(parambe.bIK.bID) });
      }
      return false;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.emoji.EmojiResUpdateMgr", localException, "", new Object[0]);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/emoji/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */