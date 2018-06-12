package com.tencent.mm.plugin.card.d;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.qu;
import com.tencent.mm.g.a.qu.a;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.card.ui.CardNewMsgUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.kx;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;

public final class b
{
  public static void a(MMActivity paramMMActivity, float paramFloat1, float paramFloat2, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("map_view_type", 2);
    localIntent.putExtra("kwebmap_slat", paramFloat1);
    localIntent.putExtra("kwebmap_lng", paramFloat2);
    localIntent.putExtra("Kwebmap_locaion", paramString);
    d.b(paramMMActivity, "location", ".ui.RedirectUI", localIntent);
  }
  
  public static void a(MMActivity paramMMActivity, int paramInt, MMActivity.a parama)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("select_is_ret", false);
    localIntent.putExtra("Select_Conv_Type", 3);
    d.a(paramMMActivity, ".ui.transmit.SelectConversationUI", localIntent, paramInt, parama);
  }
  
  public static void a(MMActivity paramMMActivity, int paramInt, String paramString, boolean paramBoolean, com.tencent.mm.plugin.card.base.b paramb)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("key_from_scene", 3);
    localIntent.putExtra("key_expire_time", paramInt);
    localIntent.putExtra("key_begin_time", System.currentTimeMillis());
    localIntent.putExtra("key_card_tips", paramString);
    localIntent.putExtra("key_is_mark", paramBoolean);
    localIntent.putExtra("key_card_id", paramb.awr());
    localIntent.putExtra("key_user_card_id", paramb.awq());
    localIntent.putExtra("key_card_code", paramb.awn().code);
    d.b(paramMMActivity, "offline", ".ui.WalletOfflineEntranceUI", localIntent);
    h.mEJ.h(11850, new Object[] { Integer.valueOf(5), Integer.valueOf(0) });
  }
  
  public static void a(MMActivity paramMMActivity, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("KEY_BRAND_NAME", paramString);
    d.b(paramMMActivity, "card", ".ui.CardShowWaringTransparentUI", localIntent);
  }
  
  public static void a(MMActivity paramMMActivity, String paramString, int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("stastic_scene", paramInt);
    d.b(paramMMActivity, "webview", ".ui.tools.WebViewUI", localIntent);
  }
  
  public static void a(MMActivity paramMMActivity, String paramString1, String paramString2)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString1);
    localIntent.putExtra("stastic_scene", 0);
    localIntent.putExtra("rawUrl", paramString1);
    localIntent.putExtra("title", paramString2);
    d.b(paramMMActivity, "webview", ".ui.tools.WebViewUI", localIntent);
  }
  
  public static void a(MMActivity paramMMActivity, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramMMActivity, CardNewMsgUI.class);
    localIntent.putExtra("from_menu", paramBoolean);
    paramMMActivity.startActivity(localIntent);
    x.v("MicroMsg.CardActivityHelper", "start CardNewMsgUI");
    h.mEJ.h(11324, new Object[] { "CardMsgCenterView", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), "" });
  }
  
  public static boolean a(String paramString, pr parampr, int paramInt1, int paramInt2)
  {
    if (parampr == null)
    {
      x.i("MicroMsg.CardActivityHelper", "gotoAppBrand commField is null");
      return false;
    }
    return e(paramString, parampr.rnv, parampr.rnw, paramInt1, paramInt2);
  }
  
  public static void ab(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      x.v("MicroMsg.CardActivityHelper", "username is null");
      return;
    }
    if (paramContext == null)
    {
      x.e("MicroMsg.CardActivityHelper", "context is null, err");
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("Contact_User", paramString);
    localIntent.putExtra("force_get_contact", true);
    d.b(paramContext, "profile", ".ui.ContactInfoUI", localIntent);
  }
  
  public static void ac(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      x.v("MicroMsg.CardActivityHelper", "username is null");
      return;
    }
    if (s.he(paramString))
    {
      if (TextUtils.isEmpty(paramString))
      {
        x.v("MicroMsg.CardActivityHelper", "username is null");
        return;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("Chat_User", paramString);
      localIntent.putExtra("finish_direct", true);
      d.e(paramContext, ".ui.chatting.ChattingUI", localIntent);
      return;
    }
    ab(paramContext, paramString);
  }
  
  public static boolean e(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    if (bi.oW(paramString2))
    {
      x.i("MicroMsg.CardActivityHelper", "gotoAppBrand commField.app_brand_user_name is null");
      return false;
    }
    qu localqu = new qu();
    localqu.cbq.userName = paramString2;
    localqu.cbq.cbs = bi.aG(paramString3, "");
    localqu.cbq.cbt = paramInt2;
    if (paramInt1 == 26) {}
    for (localqu.cbq.scene = 1029;; localqu.cbq.scene = 1028)
    {
      localqu.cbq.bGG = paramString1;
      localqu.cbq.cbx = true;
      a.sFg.m(localqu);
      x.i("MicroMsg.CardActivityHelper", "gotoAppBrand userName:%s, path:%s, scene:%d openType:%d", new Object[] { localqu.cbq.userName, localqu.cbq.cbs, Integer.valueOf(localqu.cbq.scene), Integer.valueOf(localqu.cbq.cbt) });
      return true;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/card/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */