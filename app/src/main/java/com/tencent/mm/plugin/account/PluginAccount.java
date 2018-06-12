package com.tencent.mm.plugin.account;

import android.app.Activity;
import android.content.Context;
import com.tencent.mm.bg.c;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.model.p;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.plugin.account.a.a.a;
import com.tencent.mm.plugin.account.friend.a.an;
import com.tencent.mm.plugin.account.friend.a.ap;
import com.tencent.mm.plugin.account.friend.a.h;
import com.tencent.mm.plugin.account.friend.a.k;
import com.tencent.mm.plugin.account.friend.a.o;
import com.tencent.mm.plugin.account.friend.a.q;
import com.tencent.mm.plugin.account.model.i;
import com.tencent.mm.protocal.c.arf;
import com.tencent.mm.sdk.platformtools.ad;
import java.util.LinkedList;

public class PluginAccount
  extends f
  implements a
{
  public void clearFriendData() {}
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    c.Um("account");
    pin(new p(i.class));
    pin(new p(b.class));
    pin(new p(com.tencent.mm.plugin.account.security.a.g.class));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PluginAccount", "execute PluginAccount");
  }
  
  public com.tencent.mm.plugin.account.friend.a.b getAddrUploadStg()
  {
    return b.getAddrUploadStg();
  }
  
  public h getFacebookFrdStg()
  {
    return b.getFacebookFrdStg();
  }
  
  public k getFrdExtStg()
  {
    return b.getFrdExtStg();
  }
  
  public LinkedList<arf> getFriendData()
  {
    return b.getFriendData();
  }
  
  public o getGoogleFriendStorage()
  {
    return b.getGoogleFriendStorage();
  }
  
  public q getInviteFriendOpenStg()
  {
    return b.getInviteFriendOpenStg();
  }
  
  public String getPhoneNum(Context paramContext, String paramString)
  {
    return j.getPhoneNum(paramContext, paramString);
  }
  
  public an getQQGroupStg()
  {
    return b.getQQGroupStg();
  }
  
  public ap getQQListStg()
  {
    return b.getQQListStg();
  }
  
  public void removeSelfAccount(Context paramContext)
  {
    com.tencent.mm.platformtools.x.ca(paramContext);
  }
  
  public void setFriendData(LinkedList paramLinkedList)
  {
    b.setFriendData(paramLinkedList);
  }
  
  public void showAddrBookUploadConfirm(Activity paramActivity, Runnable paramRunnable, boolean paramBoolean, int paramInt)
  {
    aa.showAddrBookUploadConfirm(paramActivity, paramRunnable, paramBoolean, paramInt);
  }
  
  public boolean syncAddrBook(com.tencent.mm.plugin.account.a.a.b paramb)
  {
    return com.tencent.mm.platformtools.b.syncAddrBook(paramb);
  }
  
  public void syncAddrBookAndUpload()
  {
    com.tencent.mm.platformtools.b.Vn();
  }
  
  public void syncUploadMContactStatus(boolean paramBoolean1, boolean paramBoolean2)
  {
    aa.syncUploadMContactStatus(paramBoolean1, paramBoolean2);
  }
  
  public void updateAllContact()
  {
    com.tencent.mm.platformtools.x.cb(ad.getContext());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/PluginAccount.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */