package com.tencent.mm.plugin.account.bind.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.model.a.f;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.a.ab;
import com.tencent.mm.plugin.account.friend.a.al;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import java.util.List;

public class MobileFriendUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private ProgressDialog eHw = null;
  private ListView eIM;
  b eIN;
  private View eIO;
  private al eIP;
  String eIQ;
  private TextView eIR = null;
  private TextView emptyTipTv = null;
  
  private void getData()
  {
    if (!com.tencent.mm.plugin.account.friend.a.l.XB())
    {
      localObject = this.mController.tml;
      getString(a.j.app_tip);
      this.eHw = com.tencent.mm.ui.base.h.a((Context)localObject, getString(a.j.mobile_friend_loading), true, new MobileFriendUI.9(this));
      if (this.eIN.getCount() != 0) {
        break label100;
      }
      if ((!((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).syncAddrBook(new MobileFriendUI.10(this))) && (this.eHw != null))
      {
        this.eHw.dismiss();
        this.eHw = null;
      }
    }
    return;
    label100:
    Object localObject = com.tencent.mm.plugin.account.friend.a.l.XJ();
    List localList = com.tencent.mm.plugin.account.friend.a.l.XI();
    if ((((List)localObject).size() != 0) || (localList.size() != 0))
    {
      this.eIP = new al(com.tencent.mm.plugin.account.friend.a.l.XJ(), com.tencent.mm.plugin.account.friend.a.l.XI());
      com.tencent.mm.kernel.g.DF().a(this.eIP, 0);
      return;
    }
    localObject = new ab();
    com.tencent.mm.kernel.g.DF().a((com.tencent.mm.ab.l)localObject, 0);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.MobileFriendUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((paraml.getType() == 32) && (this.eHw != null))
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0)) {
      x.e("MicroMsg.MobileFriendUI", "onSceneEnd: errType = " + paramInt1 + ", errCode = " + paramInt2);
    }
    if (paraml.getType() == 133)
    {
      paramString = new ab();
      com.tencent.mm.kernel.g.DF().a(paramString, 0);
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (paraml.getType() == 32) {
        ((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).updateAllContact();
      }
      this.eIN.a(null, null);
    }
    while (paraml.getType() != 32) {
      return;
    }
    Toast.makeText(this, a.j.mobile_friend_err, 0).show();
  }
  
  public final void b(com.tencent.mm.plugin.account.friend.a.a parama)
  {
    if (bi.oW(parama.getUsername()))
    {
      x.e("MicroMsg.MobileFriendUI", "username is null");
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("Contact_User", parama.getUsername());
    localIntent.putExtra("Contact_Nick", parama.Xm());
    localIntent.putExtra("Contact_Mobile_MD5", parama.Xh());
    localIntent.putExtra("Contact_Alias", parama.eJM);
    localIntent.putExtra("Contact_Sex", parama.eJH);
    localIntent.putExtra("Contact_Signature", parama.eJK);
    localIntent.putExtra("Contact_RegionCode", RegionCodeDecoder.aq(parama.eJQ, parama.eJI, parama.eJJ));
    localIntent.putExtra("Contact_Scene", 13);
    localIntent.putExtra("Contact_ShowUserName", false);
    com.tencent.mm.plugin.account.a.a.ezn.d(localIntent, this);
  }
  
  protected final int getLayoutId()
  {
    return a.g.mobile_friend;
  }
  
  protected final void initView()
  {
    this.emptyTipTv = ((TextView)findViewById(a.f.mobile_friend_empty_msg_tip_tv));
    this.emptyTipTv.setText(a.j.mobile_friend_empty_qmsg_tip);
    this.eIR = ((TextView)findViewById(a.f.empty_mobile_friend_search_tip_tv));
    this.eIR.setText(a.j.mobile_search_no_friend);
    this.eIO = findViewById(a.f.mobile_friend_mobile_not_bind_ll);
    this.eIM = ((ListView)findViewById(a.f.mobile_friend_lv));
    Object localObject = new com.tencent.mm.ui.tools.o((byte)0);
    ((com.tencent.mm.ui.tools.o)localObject).uBw = new MobileFriendUI.11(this);
    a((com.tencent.mm.ui.tools.o)localObject);
    boolean bool;
    if (com.tencent.mm.model.a.g.IW().iP("2") != null)
    {
      localObject = com.tencent.mm.model.a.g.IW().iP("2").value;
      if (((String)localObject).equals("0"))
      {
        bool = false;
        f.iT("2");
      }
    }
    for (;;)
    {
      x.i("MicroMsg.MobileFriendUI", "ABTest Type, NEW(%B)", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {}
      for (this.eIN = new c(this, new MobileFriendUI.12(this));; this.eIN = new d(this, new MobileFriendUI.13(this)))
      {
        this.eIM.setAdapter(this.eIN);
        this.eIM.setOnItemClickListener(new MobileFriendUI.14(this));
        this.eIN.a(new MobileFriendUI.15(this));
        if ((com.tencent.mm.plugin.account.friend.a.l.XC() != l.a.eKt) && (com.tencent.mm.plugin.account.friend.a.l.XC() != l.a.eKu))
        {
          this.eIO = findViewById(a.f.mobile_friend_mobile_not_bind_ll);
          this.eIO.setVisibility(0);
          this.eIO.setOnClickListener(new MobileFriendUI.2(this));
          this.eIM.setVisibility(8);
        }
        setBackBtn(new MobileFriendUI.3(this));
        new MobileFriendUI.4(this);
        if ((!q.Hi()) || (com.tencent.mm.plugin.account.friend.a.l.XB())) {
          com.tencent.mm.ui.base.h.a(this, a.j.bind_mcontact_bind_alert_content, a.j.app_tip, a.j.app_ok, a.j.app_cancel, new MobileFriendUI.5(this), new MobileFriendUI.6(this));
        }
        return;
        if (!((String)localObject).equals("1")) {
          break label392;
        }
        bool = true;
        break;
      }
      label392:
      bool = true;
      break;
      bool = true;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.j.mobile_friend_title);
    ((com.tencent.mm.plugin.account.friend.a.b)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).dCZ.fV("qqlist", "update addr_upload2 set reserved4=0");
    com.tencent.mm.kernel.g.DF().a(32, this);
    com.tencent.mm.kernel.g.DF().a(133, this);
    initView();
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.READ_CONTACTS", 48, null, null);
    x.i("MicroMsg.MobileFriendUI", "summerper checkPermission checkContacts[%b]", new Object[] { Boolean.valueOf(bool) });
    if (!bool) {
      return;
    }
    getData();
  }
  
  public void onDestroy()
  {
    f.iU("2");
    com.tencent.mm.kernel.g.DF().b(32, this);
    com.tencent.mm.kernel.g.DF().b(133, this);
    this.eIN.aYc();
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    x.i("MicroMsg.MobileFriendUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default: 
      return;
    }
    if (paramArrayOfInt[0] == 0)
    {
      getData();
      return;
    }
    com.tencent.mm.ui.base.h.a(this, getString(a.j.permission_contacts_request_again_msg), getString(a.j.permission_tips_title), getString(a.j.jump_to_settings), getString(a.j.app_cancel), false, new MobileFriendUI.1(this), new MobileFriendUI.8(this));
  }
  
  protected void onResume()
  {
    super.onResume();
    this.eIN.notifyDataSetChanged();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/bind/ui/MobileFriendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */