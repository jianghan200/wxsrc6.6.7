package com.tencent.mm.plugin.webview.ui.tools.emojistore;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.x;

public class EmojiStoreSearchWebViewUI
  extends BaseEmojiStoreSearchWebViewUI
{
  protected final void t(int paramInt, Bundle paramBundle)
  {
    x.i("MicroMsg.emoji.EmojiStoreSearchWebViewUI", "handleEmojiStoreAction action:%d", new Object[] { Integer.valueOf(paramInt) });
    super.t(paramInt, paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/emojistore/EmojiStoreSearchWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */