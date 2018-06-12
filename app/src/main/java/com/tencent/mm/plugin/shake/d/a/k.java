package com.tencent.mm.plugin.shake.d.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.a.gw;
import com.tencent.mm.g.a.qu;
import com.tencent.mm.g.a.qu.a;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.k.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.shake.ui.TVInfoUI;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;

public final class k
{
  public static void a(com.tencent.mm.plugin.shake.b.d paramd, Context paramContext, boolean paramBoolean)
  {
    int i = 4;
    if (paramd == null) {}
    Object localObject2;
    do
    {
      return;
      switch (paramd.field_type)
      {
      case 11: 
      default: 
        return;
      case 6: 
        localObject1 = paramd.field_username;
        au.HU();
        localObject2 = c.FR().Yg((String)localObject1);
      }
    } while (localObject2 == null);
    Intent localIntent = new Intent();
    if ((com.tencent.mm.l.a.gd(((ai)localObject2).field_type)) && (((ab)localObject2).ckW()))
    {
      z.MY().kA((String)localObject1);
      if (paramd.field_distance.equals("1"))
      {
        localIntent.putExtra("Chat_User", (String)localObject1);
        localIntent.putExtra("finish_direct", true);
        com.tencent.mm.plugin.shake.a.ezn.e(localIntent, paramContext);
        return;
        localObject1 = new Intent();
        i = 18;
        if (paramBoolean) {
          i = 26;
        }
        ((Intent)localObject1).putExtra("geta8key_scene", i);
        ((Intent)localObject1).putExtra("stastic_scene", 6);
        ((Intent)localObject1).putExtra("KAppId", "wxaf060266bfa9a35c");
        localObject2 = new Bundle();
        ((Bundle)localObject2).putString("jsapi_args_appid", "wxaf060266bfa9a35c");
        ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject2);
        ((Intent)localObject1).putExtra("rawUrl", paramd.field_username);
        ((Intent)localObject1).putExtra("srcUsername", paramd.field_distance);
        com.tencent.mm.plugin.shake.a.ezn.j((Intent)localObject1, paramContext);
        return;
      }
    }
    localIntent.putExtra("Contact_User", (String)localObject1);
    localIntent.putExtra("force_get_contact", true);
    com.tencent.mm.bg.d.b(paramContext, "profile", ".ui.ContactInfoUI", localIntent);
    return;
    Object localObject1 = new Intent();
    ((Intent)localObject1).setClass(paramContext, TVInfoUI.class);
    ((Intent)localObject1).putExtra("key_TV_xml_bytes", paramd.field_lvbuffer);
    ((Intent)localObject1).putExtra("key_TV_come_from_shake", true);
    paramContext.startActivity((Intent)localObject1);
    return;
    localObject1 = new gw();
    ((gw)localObject1).bQd.actionCode = 11;
    ((gw)localObject1).bQd.result = paramd.field_username;
    ((gw)localObject1).bQd.context = paramContext;
    ((gw)localObject1).bJX = null;
    com.tencent.mm.sdk.b.a.sFg.a((b)localObject1, Looper.myLooper());
    return;
    localObject1 = new Intent();
    ((Intent)localObject1).putExtra("key_product_id", paramd.field_username);
    ((Intent)localObject1).putExtra("key_product_scene", 9);
    com.tencent.mm.bg.d.b(paramContext, "product", ".ui.MallProductUI", (Intent)localObject1);
    return;
    if (paramBoolean) {}
    for (;;)
    {
      a(paramd.field_distance, paramd.field_username, i, paramContext);
      return;
      i = 3;
    }
    paramContext = paramd.field_username;
    localObject1 = paramd.field_reserved3;
    i = paramd.field_reserved2;
    if (bi.oW(paramContext))
    {
      x.i("Micromsg.ShakeTVLogic", "gotoAppBrand commField.app_brand_user_name is null");
      return;
    }
    paramd = new qu();
    paramd.cbq.userName = paramContext;
    paramd.cbq.cbs = bi.aG((String)localObject1, "");
    paramd.cbq.cbt = 0;
    paramd.cbq.scene = 1039;
    paramd.cbq.cbu = i;
    com.tencent.mm.sdk.b.a.sFg.m(paramd);
    x.i("Micromsg.ShakeTVLogic", "gotoAppBrand userName:%s, path:%s, scene:%d openType:%d version:%d", new Object[] { paramd.cbq.userName, paramd.cbq.cbs, Integer.valueOf(paramd.cbq.scene), Integer.valueOf(paramd.cbq.cbt), Integer.valueOf(paramd.cbq.cbu) });
  }
  
  public static void a(String paramString1, String paramString2, int paramInt, Context paramContext)
  {
    if (!bi.oW(paramString2))
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.addCategory("android.intent.category.BROWSABLE");
      localIntent.setData(Uri.parse(paramString2));
      int i = 16;
      if ((paramInt == 3) || (paramInt == 4)) {
        i = 17;
      }
      localIntent.putExtra("translate_link_scene", i);
      paramContext.startActivity(localIntent);
      x.i("Micromsg.ShakeTVLogic", "doShakeTvHistoryItemClick start tempsession open deeplink");
      h.mEJ.h(12108, new Object[] { bi.oV(paramString1), Integer.valueOf(paramInt), Integer.valueOf(1) });
    }
  }
  
  public static boolean buA()
  {
    if (af.exd) {}
    String str;
    do
    {
      return true;
      str = g.AT().getValue("ShowShakeTV");
      x.d("Micromsg.ShakeTVLogic", "DynamicConfig Get ShowShakeTV: %s", new Object[] { str });
    } while ((!bi.oW(str)) && (str.equals("1")));
    return false;
  }
  
  public static boolean vY(int paramInt)
  {
    return (7 == paramInt) || (6 == paramInt) || (8 == paramInt) || (9 == paramInt) || (10 == paramInt) || (12 == paramInt) || (13 == paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/d/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */