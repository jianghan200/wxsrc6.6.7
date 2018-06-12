package com.tencent.mm.plugin.game.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.v;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelbiz.CreateChatroom.Resp;
import com.tencent.mm.opensdk.modelbiz.JoinChatroom.Resp;
import com.tencent.mm.plugin.game.d.an;
import com.tencent.mm.plugin.game.d.ao;
import com.tencent.mm.plugin.game.d.y;
import com.tencent.mm.plugin.game.d.z;
import com.tencent.mm.plugin.game.f.i;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;

@a(7)
public class CreateOrJoinChatroomUI
  extends MMBaseActivity
{
  private ProgressDialog dId = null;
  private String eWQ;
  private String jTW;
  private String jTX;
  private String jTY;
  private String jTZ;
  private int jUa = 1;
  private String mAppId;
  private String mPackageName;
  private String sS;
  
  private void aUK()
  {
    if ((this.dId != null) && (this.dId.isShowing())) {
      this.dId.cancel();
    }
  }
  
  private void qR(int paramInt)
  {
    Object localObject1 = g.bl(this.mAppId, true);
    Bundle localBundle = new Bundle();
    Object localObject2;
    if (this.sS.equals("action_create"))
    {
      localObject2 = new CreateChatroom.Resp();
      if (localObject1 != null) {
        ((CreateChatroom.Resp)localObject2).openId = ((f)localObject1).field_openId;
      }
      ((CreateChatroom.Resp)localObject2).transaction = this.jTW;
      ((CreateChatroom.Resp)localObject2).extMsg = this.jTZ;
      ((CreateChatroom.Resp)localObject2).errCode = paramInt;
      ((CreateChatroom.Resp)localObject2).toBundle(localBundle);
    }
    for (;;)
    {
      localObject1 = new MMessageActV2.Args();
      ((MMessageActV2.Args)localObject1).targetPkgName = this.mPackageName;
      ((MMessageActV2.Args)localObject1).bundle = localBundle;
      com.tencent.mm.pluginsdk.model.app.p.ae(localBundle);
      com.tencent.mm.pluginsdk.model.app.p.af(localBundle);
      MMessageActV2.send(ad.getContext(), (MMessageActV2.Args)localObject1);
      return;
      if (this.sS.equals("action_join"))
      {
        localObject2 = new JoinChatroom.Resp();
        if (localObject1 != null) {
          ((JoinChatroom.Resp)localObject2).openId = ((f)localObject1).field_openId;
        }
        ((JoinChatroom.Resp)localObject2).transaction = this.jTW;
        ((JoinChatroom.Resp)localObject2).extMsg = this.jTZ;
        ((JoinChatroom.Resp)localObject2).errCode = paramInt;
        ((JoinChatroom.Resp)localObject2).toBundle(localBundle);
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 5)
    {
      if (paramInt2 != 4) {
        break label20;
      }
      qR(0);
    }
    for (;;)
    {
      finish();
      return;
      label20:
      if (paramInt2 == 5)
      {
        if (paramIntent != null)
        {
          paramIntent = paramIntent.getStringExtra("rawUrl");
          p.a.qyl.b(this, paramIntent, true, null);
        }
      }
      else if (paramInt2 == 0) {
        qR(-2);
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    x.i("MicroMsg.CreateOrJoinChatroomUI", "onCreate");
    paramBundle = getIntent();
    this.sS = paramBundle.getStringExtra("action");
    this.mPackageName = paramBundle.getStringExtra("package_name");
    this.mAppId = paramBundle.getStringExtra("key_app_id");
    this.jTW = paramBundle.getStringExtra("key_transaction");
    this.jTX = paramBundle.getStringExtra("group_id");
    this.jTY = paramBundle.getStringExtra("chatroom_name");
    this.eWQ = paramBundle.getStringExtra("chatroom_nickname");
    this.jTZ = paramBundle.getStringExtra("ext_msg");
    if ((bi.oW(this.sS)) || (bi.oW(this.mAppId)) || (bi.oW(this.jTX)))
    {
      x.e("MicroMsg.CreateOrJoinChatroomUI", "Invalid args");
      finish();
    }
    label357:
    do
    {
      return;
      this.dId = h.a(this, getBaseContext().getString(f.i.game_verify_authority_tips_jumping), true, null);
      if (this.sS.equals("action_create"))
      {
        x.i("MicroMsg.CreateOrJoinChatroomUI", "createChatroom, appid = %s, groupId = %s, ChatRoomName = %s", new Object[] { this.mAppId, this.jTX, this.jTY });
        paramBundle = new b.a();
        paramBundle.dIG = new y();
        paramBundle.dIH = new z();
        paramBundle.uri = "/cgi-bin/mmgame-bin/gamecreatechatroom";
        paramBundle.dIF = 1205;
        localb = paramBundle.KT();
        localObject = (y)localb.dID.dIL;
        ((y)localObject).jPc = this.mAppId;
        ((y)localObject).jQk = this.jTX;
        if (this.jTY == null)
        {
          paramBundle = new byte[0];
          ((y)localObject).jQl = new com.tencent.mm.bk.b(paramBundle);
          if (this.eWQ != null) {
            break label357;
          }
        }
        for (paramBundle = new byte[0];; paramBundle = this.eWQ.getBytes())
        {
          ((y)localObject).jQm = new com.tencent.mm.bk.b(paramBundle);
          v.a(localb, new CreateOrJoinChatroomUI.1(this));
          return;
          paramBundle = this.jTY.getBytes();
          break;
        }
      }
    } while (!this.sS.equals("action_join"));
    paramBundle = new b.a();
    paramBundle.dIG = new an();
    paramBundle.dIH = new ao();
    paramBundle.uri = "/cgi-bin/mmgame-bin/gamejoinchatroom";
    paramBundle.dIF = 1206;
    com.tencent.mm.ab.b localb = paramBundle.KT();
    Object localObject = (an)localb.dID.dIL;
    ((an)localObject).jPc = this.mAppId;
    ((an)localObject).jQk = this.jTX;
    if (this.eWQ == null) {}
    for (paramBundle = new byte[0];; paramBundle = this.eWQ.getBytes())
    {
      ((an)localObject).jQm = new com.tencent.mm.bk.b(paramBundle);
      v.a(localb, new CreateOrJoinChatroomUI.2(this));
      return;
    }
  }
  
  protected void onDestroy()
  {
    aUK();
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/ui/CreateOrJoinChatroomUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */