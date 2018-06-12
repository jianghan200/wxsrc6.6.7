package com.tencent.mm.plugin.voip.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.MMBaseActivity;

public class InviteRemindDialog
  extends MMBaseActivity
{
  private TextView eGX;
  private TextView oPY;
  private String talker = "";
  private int type = 0;
  
  public static void k(Context paramContext, String paramString, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, InviteRemindDialog.class);
    localIntent.putExtra("InviteRemindDialog_User", paramString);
    localIntent.putExtra("InviteRemindDialog_Type", paramInt);
    paramContext.startActivity(localIntent);
  }
  
  public void finish()
  {
    super.finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.i.mm_voip_invite_alert);
    this.eGX = ((TextView)findViewById(R.h.mm_alert_msg_title));
    this.oPY = ((TextView)findViewById(R.h.mm_alert_msg_content));
    this.talker = getIntent().getStringExtra("InviteRemindDialog_User");
    this.type = getIntent().getIntExtra("InviteRemindDialog_Type", 0);
    if (this.type == 0)
    {
      this.eGX.setText(getString(R.l.voip_send_request_title));
      this.oPY.setText(getString(R.l.voip_invite_remind_tip));
    }
    for (;;)
    {
      findViewById(R.h.mm_alert_ok_btn).setOnClickListener(new InviteRemindDialog.1(this));
      findViewById(R.h.mm_alert_cancel_btn).setOnClickListener(new InviteRemindDialog.2(this));
      return;
      if (this.type == 1)
      {
        this.eGX.setText(getString(R.l.voip_voice_send_request_title));
        this.oPY.setText(getString(R.l.voip_voice_invite_remind_tip));
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voip/ui/InviteRemindDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */