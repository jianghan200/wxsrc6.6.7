package com.tencent.mm.plugin.emoji.e;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.plugin.emoji.b;
import com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI;
import com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI;
import com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class m
{
  private static void a(Context paramContext, tj paramtj, int paramInt1, int paramInt2)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(paramContext, EmojiStoreDetailUI.class);
    localIntent.putExtra("extra_id", paramtj.rem);
    localIntent.putExtra("extra_name", paramtj.bHD);
    localIntent.putExtra("extra_description", paramtj.jOS);
    localIntent.putExtra("preceding_scence", paramInt2);
    localIntent.putExtra("call_by", 1);
    localIntent.putExtra("download_entrance_scene", paramInt1);
    localIntent.putExtra("check_clickflag", true);
    paramContext.startActivity(localIntent);
  }
  
  public static void a(Context paramContext, tj paramtj, boolean paramBoolean)
  {
    if (paramtj == null)
    {
      x.i("MicroMsg.emoji.EmojiUINavigatorMgr", "banner is null. do nothing");
      return;
    }
    int i;
    String str1;
    String str2;
    Object localObject;
    String str3;
    Intent localIntent;
    switch (paramtj.rwJ)
    {
    default: 
      x.i("MicroMsg.emoji.EmojiUINavigatorMgr", "Unkown type do nothing. SetType:%d", new Object[] { Integer.valueOf(paramtj.rwJ) });
      return;
    case 0: 
      x.i("MicroMsg.emoji.EmojiUINavigatorMgr", "MM_EMOTION_BANNER_SET_NULL do nothing");
      h.mEJ.h(13223, new Object[] { Integer.valueOf(1), Integer.valueOf(paramtj.bzI), paramtj.bHD, Integer.valueOf(0), Integer.valueOf(0) });
      return;
    case 4: 
      i = paramtj.bzI;
      str1 = paramtj.bHD;
      str2 = paramtj.jOS;
      localObject = paramtj.jPG;
      str3 = paramtj.rwI;
      localIntent = new Intent();
      localIntent.putExtra("set_id", i);
      localIntent.putExtra("headurl", str3);
      localIntent.putExtra("set_title", str1);
      localIntent.putExtra("set_iconURL", (String)localObject);
      localIntent.putExtra("set_desc", str2);
      localIntent.setClass(paramContext, EmojiStoreV2SingleProductUI.class);
      paramContext.startActivity(localIntent);
      h.mEJ.h(13223, new Object[] { Integer.valueOf(1), Integer.valueOf(paramtj.bzI), paramtj.bHD, Integer.valueOf(0), Integer.valueOf(1) });
      return;
    case 3: 
      i = paramtj.bzI;
      str1 = paramtj.bHD;
      str2 = paramtj.jOS;
      localObject = paramtj.jPG;
      str3 = paramtj.rwI;
      localIntent = new Intent();
      localIntent.setClass(paramContext, EmojiStoreTopicUI.class);
      localIntent.putExtra("topic_id", i);
      localIntent.putExtra("topic_name", str1);
      localIntent.putExtra("topic_ad_url", str3);
      localIntent.putExtra("topic_icon_url", (String)localObject);
      localIntent.putExtra("topic_desc", str2);
      if (paramBoolean) {
        localIntent.putExtra("extra_scence", 15);
      }
      for (;;)
      {
        paramContext.startActivity(localIntent);
        h.mEJ.h(13223, new Object[] { Integer.valueOf(1), Integer.valueOf(paramtj.bzI), paramtj.bHD, Integer.valueOf(0), Integer.valueOf(2) });
        return;
        localIntent.putExtra("extra_scence", 3);
      }
    case 2: 
      str1 = paramtj.rwH;
      str2 = paramtj.bHD;
      localObject = new Intent();
      ((Intent)localObject).putExtra("rawUrl", str1);
      ((Intent)localObject).putExtra("title", str2);
      b.ezn.j((Intent)localObject, paramContext);
      h.mEJ.h(13223, new Object[] { Integer.valueOf(1), Integer.valueOf(paramtj.bzI), paramtj.bHD, Integer.valueOf(0), Integer.valueOf(3) });
      return;
    }
    if (paramBoolean) {
      a(paramContext, paramtj, 15, 8);
    }
    for (;;)
    {
      h.mEJ.h(13223, new Object[] { Integer.valueOf(1), Integer.valueOf(paramtj.bzI), paramtj.bHD, Integer.valueOf(0), Integer.valueOf(4) });
      return;
      a(paramContext, paramtj, 3, 5);
    }
  }
  
  public static void a(Context paramContext, ts paramts, int paramInt1, int paramInt2, int paramInt3, String paramString, int paramInt4)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(paramContext, EmojiStoreDetailUI.class);
    if (paramts != null)
    {
      localIntent.putExtra("extra_id", paramts.rem);
      localIntent.putExtra("extra_name", paramts.rwQ);
      localIntent.putExtra("extra_copyright", paramts.rxa);
      localIntent.putExtra("extra_coverurl", paramts.rwY);
      localIntent.putExtra("extra_description", paramts.rwR);
      localIntent.putExtra("extra_price", paramts.rwT);
      localIntent.putExtra("extra_type", paramts.rwU);
      localIntent.putExtra("extra_flag", paramts.rwV);
      localIntent.putExtra("preceding_scence", paramInt4);
      localIntent.putExtra("call_by", 1);
      localIntent.putExtra("check_clickflag", false);
      localIntent.putExtra("download_entrance_scene", paramInt1);
      if (paramInt2 != -1) {
        localIntent.putExtra("extra_status", paramInt2);
      }
      if (paramInt3 != -1) {
        localIntent.putExtra("extra_progress", -1);
      }
      if (!bi.oW(paramString)) {
        localIntent.putExtra("to_talker_name", paramString);
      }
    }
    for (;;)
    {
      paramContext.startActivity(localIntent);
      return;
      x.i("MicroMsg.emoji.EmojiUINavigatorMgr", "get detail intent failed. summary is null.");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/emoji/e/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */