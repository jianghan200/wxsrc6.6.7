package com.tencent.mm.plugin.chatroom.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.l.a;
import com.tencent.mm.model.af;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.MMActivity;

@Deprecated
public class RoomUpgradeResultUI
  extends MMActivity
{
  private String chatroomName;
  private u hLB;
  private Button hNS;
  private View hNT;
  private ImageView hNU;
  private TextView hNV;
  private TextView hNW;
  private TextView hNX;
  
  private void goBack()
  {
    Intent localIntent = new Intent(this, RoomUpgradeUI.class);
    localIntent.addFlags(67108864);
    localIntent.putExtra("finish_self", true);
    startActivity(localIntent);
  }
  
  private void yo(String paramString)
  {
    au.HU();
    Object localObject = c.FR().Yg(paramString);
    if ((localObject != null) && ((int)((a)localObject).dhP > 0))
    {
      localObject = ((ab)localObject).BK();
      a.b.a(this.hNU, paramString);
      this.hNV.setVisibility(0);
      this.hNV.setText((CharSequence)localObject);
    }
  }
  
  protected final int getLayoutId()
  {
    return R.i.chatroom_upgrade;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.room_upgrade_entry_maxcount);
    setBackBtn(new RoomUpgradeResultUI.1(this));
    this.hNT = findViewById(R.h.upgrader_info_container);
    this.hNU = ((ImageView)findViewById(R.h.upgrader_avatar));
    this.hNV = ((TextView)findViewById(R.h.upgrader_nickname));
    this.hNW = ((TextView)findViewById(R.h.upgrade_intro));
    this.hNX = ((TextView)findViewById(R.h.upgrade_quota_left));
    this.hNS = ((Button)findViewById(R.h.how_to_upgrade_maxcount));
    this.hNS.setOnClickListener(new RoomUpgradeResultUI.2(this));
    this.hNS.setVisibility(0);
    String str = this.hLB.field_roomowner;
    au.HU();
    ab localab = c.FR().Yg(str);
    if ((localab != null) && ((int)localab.dhP <= 0)) {
      am.a.dBr.a(str, this.chatroomName, new RoomUpgradeResultUI.3(this, str));
    }
    for (;;)
    {
      int i = this.hLB.ckO();
      this.hNW.setVisibility(0);
      this.hNW.setText(getString(R.l.room_upgrade_intro_maxcount, new Object[] { Integer.valueOf(i) }));
      this.hNS.setText(R.l.room_upgrade_how_to_upgrade_maxcount_member_view);
      this.hNX.setVisibility(8);
      return;
      yo(str);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.chatroomName = getIntent().getStringExtra("chatroom");
    x.i("MicroMsg.RoomUpgradeResultUI", "the roomName is %s", new Object[] { this.chatroomName });
    au.HU();
    this.hLB = c.Ga().ih(this.chatroomName);
    if (this.hLB == null) {
      goBack();
    }
    initView();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/chatroom/ui/RoomUpgradeResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */