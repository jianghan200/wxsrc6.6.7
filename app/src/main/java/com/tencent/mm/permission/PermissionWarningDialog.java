package com.tencent.mm.permission;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.mm.ui.widget.a.e.a;

public class PermissionWarningDialog
  extends MMBaseActivity
{
  private c evj = null;
  
  private void Vl()
  {
    if (getIntent() == null) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.PermissionWarningDialog", "Intent is null");
    }
    int i;
    do
    {
      return;
      localObject = getIntent().getExtras();
      if (localObject == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.PermissionWarningDialog", "invalid params");
        return;
      }
      i = ((Bundle)localObject).getInt("warning_type", 0);
      c.a locala;
      if (1 == i)
      {
        locala = new c.a(this);
        locala.abt(((Bundle)localObject).getString("warning_title"));
        locala.abu(((Bundle)localObject).getString("warning_content"));
        locala.Gt(R.l.app_i_known).a(new PermissionWarningDialog.1(this));
        this.evj = locala.anj();
        this.evj.setCanceledOnTouchOutside(false);
        this.evj.show();
        return;
      }
      if (2 == i)
      {
        locala = new c.a(this);
        boolean bool1 = ((Bundle)localObject).getBoolean("warning_filter", false);
        boolean bool2 = ((Bundle)localObject).getBoolean("warning_due2Exception", false);
        locala.Gq(R.l.app_permission_tips_upload_title);
        locala.abu(getString(R.l.app_permission_tips_policy_tips));
        locala.Gu(R.l.app_cancel).b(new PermissionWarningDialog.2(this, bool2));
        locala.Gt(R.l.app_permission_allow_upload).a(new PermissionWarningDialog.3(this, bool1, bool2));
        this.evj = locala.anj();
        this.evj.setCanceledOnTouchOutside(false);
        this.evj.show();
        return;
      }
    } while (3 != i);
    Object localObject = new e.a(this).abA(getString(R.l.app_microphone_mute_dlg_message));
    ((e.a)localObject).uKu = getString(R.l.app_ignore);
    ((e.a)localObject).uKt = getString(R.l.app_microphone_mute_dlg_ok);
    ((e.a)localObject).a(new PermissionWarningDialog.4(this)).eIW.show();
  }
  
  public static void b(Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    Intent localIntent = new Intent(paramContext, PermissionWarningDialog.class);
    localIntent.putExtra("warning_type", 2);
    localIntent.putExtra("warning_filter", paramBoolean1);
    localIntent.putExtra("warning_due2Exception", paramBoolean2);
    localIntent.addFlags(805306368);
    paramContext.startActivity(localIntent);
  }
  
  public static void bV(Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, PermissionWarningDialog.class);
    localIntent.putExtra("warning_type", 3);
    localIntent.addFlags(805306368);
    paramContext.startActivity(localIntent);
  }
  
  public static void m(Context paramContext, String paramString1, String paramString2)
  {
    Intent localIntent = new Intent(paramContext, PermissionWarningDialog.class);
    localIntent.putExtra("warning_type", 1);
    localIntent.putExtra("warning_title", paramString1);
    localIntent.putExtra("warning_content", paramString2);
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
    com.tencent.mm.ui.base.x.b(false, null);
  }
  
  protected void onResume()
  {
    super.onResume();
    com.tencent.mm.ui.base.x.b(true, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/permission/PermissionWarningDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */