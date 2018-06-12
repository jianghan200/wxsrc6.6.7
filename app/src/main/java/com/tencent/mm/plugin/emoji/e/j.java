package com.tencent.mm.plugin.emoji.e;

import android.database.Cursor;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.m;
import com.tencent.mm.storage.emotion.n;
import java.util.HashMap;

public final class j
{
  public int hou = 79;
  public boolean igc = true;
  public long igd = 863913600000L;
  public int ige = 19;
  public m igf;
  public HashMap<String, m> igg = new HashMap();
  
  public final void a(m paramm, boolean paramBoolean)
  {
    if (paramm == null)
    {
      x.w("MicroMsg.emoji.EmojiRewardTipMgr", "updateLastRewardTipInfo failed. reward tip info is null.");
      return;
    }
    if ((this.igf == null) || (this.igf.field_prodcutID.equalsIgnoreCase(paramm.field_prodcutID))) {}
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        this.igf.field_continuCount = 0;
        this.igg.put(this.igf.field_prodcutID, this.igf);
        i.aEA().igE.a(this.igf);
      }
      this.igf = paramm;
      if (!paramBoolean) {
        break;
      }
      this.igf.field_modifyTime = 0L;
      this.igf.field_showTipsTime = System.currentTimeMillis();
      this.igf.field_totalCount = 0;
      this.igf.field_continuCount = 0;
      this.igg.put(this.igf.field_prodcutID, this.igf);
      i.aEA().igE.a(this.igf);
      return;
    }
    if (i != 0) {}
    for (this.igf.field_continuCount += 1;; this.igf.field_continuCount = 1)
    {
      this.igf.field_totalCount += 1;
      this.igf.field_modifyTime = System.currentTimeMillis();
      break;
    }
  }
  
  public final void aEe()
  {
    if (this.igf != null)
    {
      this.igf.field_continuCount = 0;
      this.igg.put(this.igf.field_prodcutID, this.igf);
      i.aEA().igE.a(this.igf);
      this.igf = null;
    }
  }
  
  public final void bh(String paramString, int paramInt)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.emoji.EmojiRewardTipMgr", "updateProductFlag failed. no such product id.");
      return;
    }
    if ((this.igg != null) && (this.igg.containsKey(paramString)))
    {
      ((m)this.igg.get(paramString)).field_flag = paramInt;
      ((m)this.igg.get(paramString)).field_setFlagTime = System.currentTimeMillis();
      return;
    }
    x.i("MicroMsg.emoji.EmojiRewardTipMgr", "updateProductFlag map no contains this product id :%s", new Object[] { paramString });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/emoji/e/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */