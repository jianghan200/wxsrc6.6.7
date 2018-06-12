package com.tencent.mm.plugin.subapp.jdbiz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.x;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

public class JDRemindDialog
  extends MMBaseActivity
{
  private c evj = null;
  
  private void Vl()
  {
    if (getIntent() == null) {}
    Bundle localBundle;
    do
    {
      return;
      localBundle = getIntent().getExtras();
    } while (localBundle == null);
    c.a locala = new c.a(this);
    locala.abt("");
    locala.abu(localBundle.getString("alertcontent"));
    locala.abx(localBundle.getString("alertconfirm")).a(new JDRemindDialog.1(this));
    locala.aby(localBundle.getString("alert_cancel")).b(new JDRemindDialog.2(this));
    this.evj = locala.anj();
    this.evj.setCanceledOnTouchOutside(false);
    this.evj.show();
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    Intent localIntent = new Intent(paramContext, JDRemindDialog.class);
    localIntent.putExtra("alertcontent", paramString1);
    localIntent.putExtra("alertconfirm", paramString2);
    localIntent.putExtra("alert_cancel", paramString3);
    localIntent.putExtra("alertjumpurl", paramString4);
    localIntent.putExtra("alert_activityid", paramString5);
    localIntent.addFlags(805306368);
    paramContext.startActivity(localIntent);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    Vl();
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    if (this.evj != null)
    {
      this.evj.dismiss();
      this.evj = null;
    }
    Vl();
  }
  
  protected void onPause()
  {
    super.onPause();
    x.b(false, null);
  }
  
  protected void onResume()
  {
    super.onResume();
    x.b(true, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/subapp/jdbiz/JDRemindDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */