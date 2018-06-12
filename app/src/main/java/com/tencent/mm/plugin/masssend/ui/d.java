package com.tencent.mm.plugin.masssend.ui;

import android.content.Context;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.pluginsdk.ui.chat.j;
import com.tencent.mm.storage.emotion.EmojiInfo;

public final class d
  implements j
{
  private Context context;
  
  public d(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public final boolean bcO()
  {
    return false;
  }
  
  public final boolean bcP()
  {
    return false;
  }
  
  public final void bcQ() {}
  
  public final void l(EmojiInfo paramEmojiInfo)
  {
    Toast.makeText(this.context, this.context.getString(R.l.mass_send_custom_emoji_not_support), 0).show();
  }
  
  public final void m(EmojiInfo paramEmojiInfo)
  {
    Toast.makeText(this.context, this.context.getString(R.l.mass_send_custom_emoji_not_support), 0).show();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/masssend/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */