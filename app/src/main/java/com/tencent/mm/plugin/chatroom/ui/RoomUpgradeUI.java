package com.tencent.mm.plugin.chatroom.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.af;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.am.b.a;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.MMActivity;

public class RoomUpgradeUI
  extends MMActivity
  implements e
{
  private String chatroomName;
  private ProgressDialog eHw = null;
  private int hKY;
  private int hKZ;
  private u hLB;
  private View hNT;
  private ImageView hNU;
  private TextView hNV;
  private TextView hNW;
  private TextView hNX;
  private TextView hOb;
  private View hOc;
  private TextView hOd;
  private com.tencent.mm.plugin.chatroom.d.h hOe;
  private String hOf;
  private boolean hOg;
  private boolean hOh;
  private int status;
  
  private void Wj()
  {
    boolean bool = true;
    this.chatroomName = getIntent().getStringExtra("room_name");
    x.i("MicroMsg.RoomUpgradeProductsUI", "the roomName is %s", new Object[] { this.chatroomName });
    au.DF().a(519, this);
    au.HU();
    this.hLB = c.Ga().ih(this.chatroomName);
    if (this.hLB == null)
    {
      finish();
      return;
    }
    this.hOg = q.GF().equals(this.hLB.field_roomowner);
    if (!w.chM()) {}
    for (;;)
    {
      this.hOh = bool;
      return;
      bool = false;
    }
  }
  
  private void aAQ()
  {
    Intent localIntent = new Intent(this, RoomAlphaProcessUI.class);
    localIntent.addFlags(67108864);
    localIntent.addFlags(65536);
    localIntent.putExtra("RoomInfo_Id", this.chatroomName);
    startActivity(localIntent);
  }
  
  private void aAR()
  {
    final String str = this.hLB.field_roomowner;
    au.HU();
    ab localab = c.FR().Yg(str);
    if ((localab != null) && ((int)localab.dhP <= 0)) {
      am.a.dBr.a(str, this.chatroomName, new am.b.a()
      {
        public final void x(String paramAnonymousString, boolean paramAnonymousBoolean)
        {
          if (paramAnonymousBoolean) {
            RoomUpgradeUI.g(RoomUpgradeUI.this).post(new RoomUpgradeUI.4.1(this));
          }
        }
      });
    }
    for (;;)
    {
      int i = this.hLB.ckO();
      this.hNW.setVisibility(0);
      if (i > 40) {
        break;
      }
      this.hNW.setText(getString(R.l.room_upgrade_intro_maxcount, new Object[] { getString(R.l.room_upgrade_entry_maxcount_summary_normal) }));
      return;
      yo(str);
    }
    this.hNW.setText(getString(R.l.room_upgrade_intro_maxcount, new Object[] { getString(R.l.room_upgrade_entry_maxcount_summary_biggroup) }));
  }
  
  private void yo(String paramString)
  {
    Object localObject2 = null;
    au.HU();
    ab localab = c.FR().Yg(paramString);
    if ((localab != null) && ((int)localab.dhP > 0)) {}
    for (Object localObject1 = localab.field_conRemark;; localObject1 = null)
    {
      if (bi.oW((String)localObject1)) {
        if (this.hLB == null) {
          localObject1 = localObject2;
        }
      }
      for (;;)
      {
        localObject2 = localObject1;
        if (bi.oW((String)localObject1))
        {
          localObject2 = localObject1;
          if (localab != null)
          {
            localObject2 = localObject1;
            if ((int)localab.dhP > 0) {
              localObject2 = localab.BK();
            }
          }
        }
        localObject1 = localObject2;
        if (bi.oW((String)localObject2)) {
          localObject1 = paramString;
        }
        a.b.a(this.hNU, paramString);
        this.hNV.setVisibility(0);
        this.hNV.setText(j.a(this, (CharSequence)localObject1, (int)this.hNV.getTextSize()));
        return;
        localObject1 = this.hLB.gT(paramString);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.d("MicroMsg.RoomUpgradeProductsUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.eHw != null) {
      this.eHw.dismiss();
    }
    if ((paramInt1 != 0) || (paramInt2 != 0)) {
      com.tencent.mm.ui.base.h.a(this, getString(R.l.room_upgrade_info_err), getString(R.l.app_tip), false, new RoomUpgradeUI.6(this));
    }
    while ((paramInt1 != 0) || (paramInt2 != 0) || (paraml.getType() != 519)) {
      return;
    }
    paramString = (com.tencent.mm.plugin.chatroom.d.h)paraml;
    this.status = paramString.status;
    this.hKY = paramString.hKY;
    this.hKZ = paramString.hKZ;
    aAR();
    this.hNX.setVisibility(0);
    this.hOd.setText(getString(R.l.room_upgrade_button_bigchatroom));
    if (this.hKZ > 0) {
      this.hNX.setText(getString(R.l.room_upgrade_info_quota_left, new Object[] { Integer.valueOf(this.hKZ) }));
    }
    for (;;)
    {
      if (!this.hOh) {
        this.hOb.setVisibility(0);
      }
      switch (this.status)
      {
      default: 
        return;
      case 1: 
      case 2: 
      case 5: 
        this.hOd.setVisibility(0);
        this.hOb.setText(R.l.room_upgrade_how_to_upgrade_maxcount_owner_view);
        return;
        this.hNX.setText(getString(R.l.room_upgrade_info_quota_run_out));
      }
    }
    this.hOd.setVisibility(0);
    this.hOd.setEnabled(false);
    this.hOb.setText(R.l.room_upgrade_how_to_upgrade_maxcount_owner_view);
    return;
    this.hOd.setVisibility(8);
    this.hOb.setText(R.l.room_upgrade_how_to_upgrade_maxcount_member_view);
    this.hOd.setEnabled(false);
  }
  
  public final int getLayoutId()
  {
    return R.i.chatroom_upgrade;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.room_upgrade_entry_maxcount);
    setBackBtn(new RoomUpgradeUI.1(this));
    this.hNT = findViewById(R.h.upgrader_info_container);
    this.hOc = findViewById(R.h.upgrader_responsibility);
    this.hNU = ((ImageView)findViewById(R.h.upgrader_avatar));
    this.hNV = ((TextView)findViewById(R.h.upgrader_nickname));
    this.hNW = ((TextView)findViewById(R.h.upgrade_intro));
    this.hNX = ((TextView)findViewById(R.h.upgrade_quota_left));
    this.hOd = ((TextView)findViewById(R.h.upgrade_button));
    this.hOd.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        switch (RoomUpgradeUI.a(RoomUpgradeUI.this))
        {
        case 3: 
        case 4: 
        default: 
          return;
        case 1: 
          if (RoomUpgradeUI.b(RoomUpgradeUI.this))
          {
            a.a(RoomUpgradeUI.this, RoomUpgradeUI.c(RoomUpgradeUI.this), true);
            return;
          }
          RoomUpgradeUI.a(RoomUpgradeUI.this, true);
          return;
        }
        if (RoomUpgradeUI.b(RoomUpgradeUI.this))
        {
          RoomUpgradeUI.d(RoomUpgradeUI.this);
          return;
        }
        RoomUpgradeUI.a(RoomUpgradeUI.this, false);
      }
    });
    this.hOb = ((TextView)findViewById(R.h.how_to_upgrade_maxcount));
    this.hOb.setOnClickListener(new RoomUpgradeUI.3(this));
    if (this.hOg)
    {
      this.eHw = com.tencent.mm.ui.base.h.a(this, getString(R.l.loading_tips), true, new RoomUpgradeUI.5(this));
      this.hOe = new com.tencent.mm.plugin.chatroom.d.h(this.chatroomName);
      au.DF().a(this.hOe, 0);
    }
    for (;;)
    {
      if (this.hOh) {
        this.hOb.setVisibility(8);
      }
      return;
      aAR();
      if (!this.hOh) {
        this.hOb.setVisibility(0);
      }
      this.hOb.setText(R.l.room_upgrade_how_to_upgrade_maxcount_member_view);
      this.hOd.setVisibility(8);
      this.hNX.setVisibility(8);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.d("MicroMsg.RoomUpgradeProductsUI", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    switch (paramInt1)
    {
    default: 
      x.e("MicroMsg.RoomUpgradeProductsUI", "onActivityResult unknow request");
      return;
    }
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Wj();
    initView();
  }
  
  protected void onDestroy()
  {
    au.DF().c(this.hOe);
    au.DF().b(519, this);
    if (this.eHw != null) {
      this.eHw.dismiss();
    }
    super.onDestroy();
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    boolean bool;
    if (paramIntent.hasExtra("upgrade_success"))
    {
      bool = paramIntent.getBooleanExtra("upgrade_success", false);
      if (bool)
      {
        Wj();
        int i = paramIntent.getIntExtra("left_quota", 0);
        aAR();
        this.hOd.setVisibility(8);
        this.hKZ = i;
        if (this.hKZ <= 0) {
          break label160;
        }
        this.hNX.setText(getString(R.l.room_upgrade_info_quota_left, new Object[] { Integer.valueOf(this.hKZ) }));
      }
    }
    for (;;)
    {
      if (!this.hOh) {
        this.hOb.setVisibility(0);
      }
      this.hOb.setText(R.l.room_upgrade_how_to_upgrade_maxcount_member_view);
      return;
      if ((paramIntent.hasExtra("wizard_activity_result_code")) && (paramIntent.getIntExtra("wizard_activity_result_code", -1) == -1)) {
        aAQ();
      }
      if (paramIntent.hasExtra("announce_ok")) {
        aAQ();
      }
      bool = false;
      break;
      label160:
      this.hNX.setText(getString(R.l.room_upgrade_info_quota_run_out));
    }
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/chatroom/ui/RoomUpgradeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */