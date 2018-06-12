package com.tencent.mm.plugin.subapp.ui.friend;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.R.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.af;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd.a;
import com.tencent.mm.storage.bd.d;
import com.tencent.mm.storage.u;
import junit.framework.Assert;

public final class a
  implements AdapterView.OnItemClickListener
{
  private Context context;
  private boolean dIK = false;
  private b orL;
  
  public a(Context paramContext, b paramb, boolean paramBoolean)
  {
    this.context = paramContext;
    this.orL = paramb;
    this.dIK = paramBoolean;
  }
  
  public static void a(Context paramContext, at paramat, boolean paramBoolean)
  {
    String str = paramat.field_msgContent;
    x.w("MicroMsg.FConversationOnItemClickListener", "dealClickVerifyMsgEvent : " + str);
    if ((str == null) || (str.length() <= 0)) {}
    bd.d locald;
    do
    {
      return;
      com.tencent.mm.model.au.HU();
      locald = c.FT().GQ(str);
    } while ((locald == null) || (bi.oW(locald.otZ)));
    boolean bool;
    ab localab;
    Intent localIntent;
    if (locald.otZ.length() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      com.tencent.mm.model.au.HU();
      localab = c.FR().Yg(locald.otZ);
      localIntent = new Intent();
      if (paramBoolean == true) {
        localIntent.putExtra("Accept_NewFriend_FromOutside", true);
      }
      localIntent.putExtra("Contact_ShowUserName", false);
      localIntent.putExtra("Contact_ShowFMessageList", true);
      localIntent.putExtra("Contact_Scene", locald.scene);
      localIntent.putExtra("Verify_ticket", locald.juZ);
      localIntent.putExtra("Contact_Source_FMessage", locald.scene);
      if ((localab == null) || ((int)localab.dhP <= 0) || (!com.tencent.mm.l.a.gd(localab.field_type))) {
        break label619;
      }
      localIntent.putExtra("Contact_User", localab.field_username);
      com.tencent.mm.plugin.subapp.b.ezo.a(localIntent, localab.field_username);
      label243:
      str = locald.content;
      paramat = str;
      if (bi.oV(str).length() <= 0) {
        switch (locald.scene)
        {
        }
      }
    }
    for (paramat = paramContext.getString(R.l.chatting_from_verify_contact_tip);; paramat = paramContext.getString(R.l.chatting_from_verify_lbs_tip))
    {
      localIntent.putExtra("Contact_Content", paramat);
      if ((locald.tbU == 1) && (!bi.oW(locald.tbW))) {
        localIntent.putExtra("Safety_Warning_Detail", locald.tbW);
      }
      localIntent.putExtra("Contact_verify_Scene", locald.scene);
      if (((locald.scene == 14) || (locald.scene == 8)) && (!bi.oW(locald.chatroomName)))
      {
        com.tencent.mm.model.au.HU();
        paramat = c.Ga().ih(locald.chatroomName);
        if (paramat != null) {
          localIntent.putExtra("Contact_RoomNickname", paramat.gT(locald.otZ));
        }
      }
      localIntent.putExtra("Contact_Uin", locald.lWQ);
      localIntent.putExtra("Contact_QQNick", locald.eLB);
      localIntent.putExtra("Contact_Mobile_MD5", locald.tbE);
      localIntent.putExtra("User_From_Fmessage", true);
      localIntent.putExtra("Contact_from_msgType", 37);
      if ((localab == null) || (!com.tencent.mm.l.a.gd(localab.field_type))) {
        localIntent.putExtra("Contact_KSnsIFlag", 0);
      }
      localIntent.putExtra("Contact_KSnsBgUrl", locald.tbS);
      localIntent.putExtra("verify_gmail", locald.eHT);
      localIntent.putExtra("source_from_user_name", locald.qIb);
      localIntent.putExtra("source_from_nick_name", locald.qIc);
      com.tencent.mm.bg.d.b(paramContext, "profile", ".ui.ContactInfoUI", localIntent);
      return;
      bool = false;
      break;
      label619:
      if ((paramat.field_type == 1) || (paramat.field_type == 2)) {
        localIntent.putExtra("User_Verify", true);
      }
      localIntent.putExtra("Contact_User", locald.otZ);
      localIntent.putExtra("Contact_Alias", locald.cCR);
      localIntent.putExtra("Contact_Nick", locald.nickname);
      localIntent.putExtra("Contact_QuanPin", locald.eLA);
      localIntent.putExtra("Contact_PyInitial", locald.eLz);
      localIntent.putExtra("Contact_Sex", locald.sex);
      localIntent.putExtra("Contact_Signature", locald.signature);
      localIntent.putExtra("Contact_FMessageCard", true);
      localIntent.putExtra("Contact_City", locald.getCity());
      localIntent.putExtra("Contact_Province", locald.getProvince());
      localIntent.putExtra("Contact_Mobile_MD5", locald.tbE);
      localIntent.putExtra("Contact_full_Mobile_MD5", locald.tbF);
      localIntent.putExtra("Contact_KSnsBgUrl", locald.tbS);
      break label243;
    }
  }
  
  public static void g(Context paramContext, String paramString, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      x.e("MicroMsg.FConversationOnItemClickListener", "dealOnClick fail, talker is null");
    }
    Object localObject;
    bd.a locala;
    do
    {
      return;
      x.d("MicroMsg.FConversationOnItemClickListener", "dealOnClick, talker = " + paramString);
      com.tencent.mm.az.d.SF().YK(paramString);
      localObject = com.tencent.mm.az.d.SE().YO(paramString);
      if (localObject == null)
      {
        x.e("MicroMsg.FConversationOnItemClickListener", "onItemClick, lastRecvFmsg is null, talker = " + paramString);
        return;
      }
      if (((at)localObject).field_type != 0) {
        break;
      }
      com.tencent.mm.model.au.HU();
      locala = c.FT().GR(((at)localObject).field_msgContent);
    } while ((locala == null) || (locala.otZ.length() <= 0));
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("Contact_ShowFMessageList", true);
    localBundle.putInt("Contact_Source_FMessage", locala.scene);
    com.tencent.mm.model.au.HU();
    ab localab = c.FR().Yg(locala.otZ);
    if ((localab != null) && ((int)localab.dhP > 0) && (com.tencent.mm.l.a.gd(localab.field_type)))
    {
      com.tencent.mm.plugin.subapp.b.ezo.a(paramContext, localab, locala, localBundle, "");
      return;
    }
    if (locala.lWQ > 0L)
    {
      if ((bi.oW(locala.eLE)) && (bi.oW(locala.eLB)) && (!bi.oW(locala.nickname))) {
        localBundle.putString("Contact_QQNick", locala.nickname);
      }
      com.tencent.mm.plugin.subapp.b.ezo.a(paramContext, locala, localBundle);
      return;
    }
    if ((!bi.oW(locala.tbE)) || (!bi.oW(locala.tbF)))
    {
      localObject = com.tencent.mm.plugin.account.b.getAddrUploadStg().pq(locala.tbE);
      if ((localObject != null) && (((com.tencent.mm.plugin.account.friend.a.a)localObject).Xh() != null))
      {
        paramString = (String)localObject;
        if (((com.tencent.mm.plugin.account.friend.a.a)localObject).Xh().length() > 0) {}
      }
      else
      {
        localObject = com.tencent.mm.plugin.account.b.getAddrUploadStg().pq(locala.tbF);
        if ((localObject != null) && (((com.tencent.mm.plugin.account.friend.a.a)localObject).Xh() != null))
        {
          paramString = (String)localObject;
          if (((com.tencent.mm.plugin.account.friend.a.a)localObject).Xh().length() > 0) {}
        }
        else
        {
          if ((localab != null) && ((int)localab.dhP > 0)) {
            com.tencent.mm.plugin.subapp.b.ezo.a(paramContext, localab, locala, localBundle, "");
          }
          for (;;)
          {
            x.e("MicroMsg.FConversationOnItemClickListener", "error : this is not the mobile contact, MD5 = " + locala.tbE + " fullMD5:" + locala.tbF);
            return;
            com.tencent.mm.plugin.subapp.b.ezo.a(paramContext, locala, localBundle);
          }
        }
      }
      if ((paramString.getUsername() == null) || (paramString.getUsername().length() <= 0))
      {
        paramString.username = locala.otZ;
        paramString.bWA = 128;
        if (com.tencent.mm.plugin.account.b.getAddrUploadStg().a(paramString.Xh(), paramString) == -1)
        {
          x.e("MicroMsg.FConversationOnItemClickListener", "update mobile contact username failed");
          return;
        }
      }
      com.tencent.mm.plugin.subapp.b.ezo.a(paramContext, locala, localBundle);
      return;
    }
    com.tencent.mm.plugin.subapp.b.ezo.a(paramContext, locala, localBundle);
    return;
    a(paramContext, (at)localObject, paramBoolean);
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = paramInt;
    if (this.dIK) {
      i = paramInt - 1;
    }
    paramAdapterView = (ar)this.orL.getItem(i);
    if (paramAdapterView == null)
    {
      x.e("MicroMsg.FConversationOnItemClickListener", "onItemClick, item is null, pos = " + i);
      return;
    }
    g(this.context, paramAdapterView.field_talker, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/friend/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */