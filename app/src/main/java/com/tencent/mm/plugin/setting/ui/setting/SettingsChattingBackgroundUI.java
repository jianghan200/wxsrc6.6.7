package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.mm.ar.n;
import com.tencent.mm.ar.r;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.p.c;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.tools.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;

public class SettingsChattingBackgroundUI
  extends MMPreference
{
  private f eOE;
  private boolean mRY;
  private String username;
  
  private void auu()
  {
    if (!l.c(this, com.tencent.mm.compatible.util.e.dgl, "microMsg." + System.currentTimeMillis() + ".jpg", 2)) {
      Toast.makeText(this, getString(a.i.selectcameraapp_none), 1).show();
    }
  }
  
  private String hA(boolean paramBoolean)
  {
    r.Qp();
    if (this.mRY) {
      return n.G("default", paramBoolean);
    }
    return n.G(this.username, paramBoolean);
  }
  
  public final int Ys()
  {
    return a.k.settings_chatting_background;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsChattingBackgroundUI", paramf + " item has been clicked!");
    if (paramf.equals("settings_chatting_bg_select_bg"))
    {
      paramf = new Intent();
      paramf.setClass(this, SettingsSelectBgUI.class);
      paramf.putExtra("isApplyToAll", this.mRY);
      paramf.putExtra("username", this.username);
      startActivityForResult(paramf, 3);
      return true;
    }
    if (paramf.equals("settings_chatting_bg_select_from_album"))
    {
      l.a(this, 1, null);
      return true;
    }
    if (paramf.equals("settings_chatting_bg_take_photo"))
    {
      boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this.mController.tml, "android.permission.CAMERA", 16, "", "");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsChattingBackgroundUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this.mController.tml });
      if (!bool) {
        return false;
      }
      auu();
      return true;
    }
    if (paramf.equals("settings_chatting_bg_apply_to_all"))
    {
      com.tencent.mm.ui.base.h.a(this.mController.tml, getString(a.i.settings_chatting_bg_apply_to_all), "", new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
      }, null);
      return true;
    }
    return false;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.settings_chatting_bg);
    this.eOE = this.tCL;
    this.mRY = getIntent().getBooleanExtra("isApplyToAll", true);
    if (!this.mRY)
    {
      Preference localPreference = this.eOE.ZZ("settings_chatting_bg_apply_to_all");
      if (localPreference != null) {
        this.eOE.c(localPreference);
      }
    }
    this.username = getIntent().getStringExtra("username");
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        SettingsChattingBackgroundUI.this.YC();
        SettingsChattingBackgroundUI.this.finish();
        return true;
      }
    });
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    }
    do
    {
      for (;;)
      {
        if (!this.mRY)
        {
          setResult(-1);
          finish();
        }
        do
        {
          do
          {
            return;
          } while (paramIntent == null);
          localObject = new Intent();
          ((Intent)localObject).putExtra("CropImageMode", 2);
          ((Intent)localObject).putExtra("CropImage_bg_vertical", hA(true));
          ((Intent)localObject).putExtra("CropImage_bg_horizontal", hA(false));
          com.tencent.mm.plugin.setting.b.ezn.a(this, paramIntent, (Intent)localObject, c.Gb(), 4, null);
          return;
          paramIntent = l.d(getApplicationContext(), paramIntent, c.Gb());
        } while (paramIntent == null);
        Object localObject = new Intent();
        ((Intent)localObject).putExtra("CropImageMode", 2);
        ((Intent)localObject).putExtra("CropImage_ImgPath", paramIntent);
        ((Intent)localObject).putExtra("CropImage_bg_vertical", hA(true));
        ((Intent)localObject).putExtra("CropImage_bg_horizontal", hA(false));
        com.tencent.mm.plugin.setting.b.ezn.a(this, (Intent)localObject, 4);
        return;
        if (paramInt2 == -1)
        {
          g.Ei().DT().set(66820, Integer.valueOf(-1));
          com.tencent.mm.plugin.report.service.h.mEJ.h(10198, new Object[] { Integer.valueOf(-1) });
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsChattingBackgroundUI", "set chating bg id:%d", new Object[] { Integer.valueOf(-1) });
          if (this.mRY)
          {
            g.Ei().DT().set(12311, Integer.valueOf(-1));
            r.Qp().ii(1);
          }
          else
          {
            paramIntent = r.Qq();
            localObject = paramIntent.mw(this.username);
            if (localObject == null)
            {
              localObject = new com.tencent.mm.ar.a();
              ((com.tencent.mm.ar.a)localObject).username = this.username;
              ((com.tencent.mm.ar.a)localObject).ecv = -1;
              paramIntent.a((com.tencent.mm.ar.a)localObject);
            }
            else
            {
              ((com.tencent.mm.ar.a)localObject).ecv = -1;
              paramIntent.b((com.tencent.mm.ar.a)localObject);
            }
          }
        }
      }
    } while (paramInt2 == -1);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsChattingBackgroundUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default: 
      return;
    }
    if (paramArrayOfInt[0] == 0)
    {
      auu();
      return;
    }
    com.tencent.mm.ui.base.h.a(this, getString(a.i.permission_camera_request_again_msg), getString(a.i.permission_tips_title), getString(a.i.jump_to_settings), getString(a.i.app_cancel), false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        SettingsChattingBackgroundUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
      }
    }, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsChattingBackgroundUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */