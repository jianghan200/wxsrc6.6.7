package com.tencent.mm.plugin.emoji.ui.v2;

import com.tencent.mm.R.l;
import com.tencent.mm.plugin.emoji.a.a.a;
import com.tencent.mm.plugin.emoji.a.f;
import com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public class EmojiStoreV2RankUI
  extends BaseEmojiStoreUI
{
  protected final int aFd()
  {
    return 5;
  }
  
  protected final int aFe()
  {
    return 105;
  }
  
  protected final a aFf()
  {
    return new f(this.mController.tml);
  }
  
  protected final int aFm()
  {
    return 10;
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final void initView()
  {
    super.initView();
    setMMTitle(R.l.emoji_store_new_suggest);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RankUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */