package com.tencent.mm.plugin.emoji.h;

import android.app.Activity;
import android.content.Intent;
import com.tencent.mm.R.a;
import com.tencent.mm.bg.d;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  private final String TAG = "MicroMsg.emoji.UseSmileyTool";
  public int guC;
  public String ist;
  
  public b(int paramInt)
  {
    this.guC = paramInt;
  }
  
  public static void a(Intent paramIntent, String paramString, Activity paramActivity)
  {
    if (paramIntent == null) {
      return;
    }
    a(paramIntent.getStringExtra("Select_Conv_User"), paramString, paramActivity);
  }
  
  public static void a(String paramString1, String paramString2, Activity paramActivity)
  {
    if (bi.oW(paramString1))
    {
      x.d("MicroMsg.emoji.UseSmileyTool", "talker name is invalid so can't go to chat room use.");
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("Chat_User", paramString1);
    localIntent.putExtra("smiley_product_id", paramString2);
    com.tencent.mm.plugin.emoji.b.ezn.e(localIntent, paramActivity);
  }
  
  public final void p(Activity paramActivity)
  {
    x.d("MicroMsg.emoji.UseSmileyTool", "jacks sendToFriend emoji");
    Intent localIntent = new Intent();
    localIntent.putExtra("MMActivity.OverrideEnterAnimation", R.a.fast_faded_in);
    localIntent.putExtra("MMActivity.OverrideExitAnimation", R.a.push_down_out);
    d.b(paramActivity, ".ui.transmit.SelectConversationUI", localIntent, this.guC);
    paramActivity.overridePendingTransition(R.a.push_up_in, R.a.fast_faded_out);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/emoji/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */