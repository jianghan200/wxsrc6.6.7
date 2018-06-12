package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.plugin.account.friend.a.a;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.account.friend.a.ap;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.bd.a;

public final class e
{
  public static void a(Context paramContext, ab paramab, bd.a parama)
  {
    a(paramContext, paramab, parama, false, false, null, parama.eHT);
  }
  
  public static void a(Context paramContext, ab paramab, bd.a parama, boolean paramBoolean1, boolean paramBoolean2, Bundle paramBundle, String paramString)
  {
    if ((paramab == null) || (parama == null)) {}
    while ((paramab.field_username == null) || (paramab.field_username.length() <= 0)) {
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("Contact_User", paramab.field_username);
    localIntent.putExtra("Contact_Alias", paramab.wM());
    localIntent.putExtra("Contact_Nick", paramab.BK());
    localIntent.putExtra("Contact_QuanPin", paramab.wQ());
    localIntent.putExtra("Contact_PyInitial", paramab.wP());
    localIntent.putExtra("Contact_Sex", parama.sex);
    localIntent.putExtra("Contact_Province", parama.getProvince());
    localIntent.putExtra("Contact_City", parama.getCity());
    localIntent.putExtra("Contact_Signature", parama.signature);
    localIntent.putExtra("Contact_Uin", parama.lWQ);
    localIntent.putExtra("Contact_Mobile_MD5", parama.tbE);
    localIntent.putExtra("Contact_full_Mobile_MD5", parama.tbF);
    localIntent.putExtra("Contact_QQNick", parama.cmJ());
    localIntent.putExtra("User_From_Fmessage", true);
    localIntent.putExtra("Contact_Scene", parama.scene);
    localIntent.putExtra("Contact_from_msgType", 40);
    if (paramBoolean1) {
      localIntent.putExtra("Contact_ShowUserName", false);
    }
    if (paramBoolean2) {
      localIntent.putExtra("Contact_KSnsIFlag", 0);
    }
    if (paramBundle != null) {
      localIntent.putExtras(paramBundle);
    }
    if (!TextUtils.isEmpty(paramString)) {
      localIntent.putExtra("verify_gmail", paramString);
    }
    d.b(paramContext, "profile", ".ui.ContactInfoUI", localIntent);
  }
  
  public static void a(Context paramContext, bd.a parama)
  {
    a(paramContext, parama, false, false, null);
  }
  
  public static void a(Context paramContext, bd.a parama, boolean paramBoolean1, boolean paramBoolean2, Bundle paramBundle)
  {
    if ((paramContext == null) || (parama == null)) {
      return;
    }
    ab localab = new ab();
    localab.setUsername(parama.otZ);
    localab.dx(parama.getDisplayName());
    localab.dy(parama.eLz);
    localab.dz(parama.eLA);
    a(paramContext, localab, parama, paramBoolean1, paramBoolean2, paramBundle, parama.eHT);
  }
  
  public static void a(Intent paramIntent, String paramString)
  {
    if ((paramIntent == null) || (paramString == null) || (paramString.length() == 0)) {
      x.e("MicroMsg.ContactInfoUtil", "setLocalQQMobile fail, intent = " + paramIntent + ", username = " + paramString);
    }
    do
    {
      return;
      ao localao = com.tencent.mm.plugin.account.b.getQQListStg().pA(paramString);
      if (localao != null)
      {
        paramIntent.putExtra("Contact_Uin", localao.eLw);
        paramIntent.putExtra("Contact_QQNick", localao.getDisplayName());
      }
      paramString = com.tencent.mm.plugin.account.b.getAddrUploadStg().pp(paramString);
    } while (paramString == null);
    paramIntent.putExtra("Contact_Mobile_MD5", paramString.Xh());
  }
  
  public static void l(Intent paramIntent, String paramString)
  {
    paramIntent.putExtra("Contact_User", paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/contact/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */