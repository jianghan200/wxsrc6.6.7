package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.widget.Toast;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.i.m;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.model.ax;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.LinkedList;
import java.util.List;

public class SettingSnsBackgroundUI
  extends MMPreference
{
  private SharedPreferences duR;
  private f eOE;
  protected String filePath;
  
  private void auu()
  {
    if (!com.tencent.mm.pluginsdk.ui.tools.l.c(this, com.tencent.mm.compatible.util.e.dgl, "microMsg." + System.currentTimeMillis() + ".jpg", 2)) {
      Toast.makeText(this, getString(i.j.selectcameraapp_none), 1).show();
    }
  }
  
  private void e(int paramInt, Intent paramIntent)
  {
    switch (paramInt)
    {
    case 3: 
    case 4: 
    default: 
      x.e("MicroMsg.SettingSnsBackgroundUI", "onActivityResult: not found this requestCode");
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              x.d("MicroMsg.SettingSnsBackgroundUI", "onActivityResult CONTEXT_MENU_TAKE_PICTURE");
              this.filePath = com.tencent.mm.pluginsdk.ui.tools.l.d(getApplicationContext(), paramIntent, af.getAccSnsTmpPath());
            } while (this.filePath == null);
            paramIntent = new Intent();
            paramIntent.putExtra("CropImageMode", 1);
            paramIntent.putExtra("CropImage_ImgPath", this.filePath);
            localObject1 = com.tencent.mm.a.g.u((this.filePath + System.currentTimeMillis()).getBytes());
            paramIntent.putExtra("CropImage_OutputPath", af.getAccSnsTmpPath() + (String)localObject1);
            com.tencent.mm.plugin.sns.c.a.ezn.a(this, paramIntent, 6);
            return;
            x.d("MicroMsg.SettingSnsBackgroundUI", "onActivityResult CONTEXT_MENU_IMAGE_BROUND");
          } while (paramIntent == null);
          this.filePath = com.tencent.mm.pluginsdk.ui.tools.l.d(getApplicationContext(), paramIntent, af.getAccSnsTmpPath());
        } while (this.filePath == null);
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("CropImageMode", 1);
        ((Intent)localObject1).putExtra("CropImage_ImgPath", this.filePath);
        com.tencent.mm.plugin.sns.c.a.ezn.a(this, paramIntent, (Intent)localObject1, af.getAccSnsTmpPath(), 6, new SettingSnsBackgroundUI.1(this));
        return;
        x.d("MicroMsg.SettingSnsBackgroundUI", "onActivityResult REQUEST_CODE_IMAGE_BROUND_SEND_COMFIRM");
        new ag(Looper.getMainLooper()).post(new SettingSnsBackgroundUI.2(this));
      } while (paramIntent == null);
      this.filePath = paramIntent.getStringExtra("CropImage_OutputPath");
    } while (this.filePath == null);
    x.d("MicroMsg.SettingSnsBackgroundUI", "REQUEST_CODE_IMAGE_BROUND_SEND_COMFIRM   " + this.filePath);
    Object localObject1 = af.byk();
    paramIntent = this.filePath;
    new LinkedList().add(new com.tencent.mm.plugin.sns.data.h(paramIntent, 2));
    if ((((aw)localObject1).bxU() != null) && (!((aw)localObject1).bxU().equals("")))
    {
      Object localObject2 = an.s(af.getAccSnsPath(), ((aw)localObject1).bxU());
      FileOp.mL((String)localObject2);
      FileOp.deleteFile((String)localObject2 + ((aw)localObject1).bxU() + "bg_");
      FileOp.y(paramIntent, (String)localObject2 + ((aw)localObject1).bxU() + "bg_");
      localObject2 = af.bys();
      com.tencent.mm.plugin.sns.storage.l locall = ((com.tencent.mm.plugin.sns.storage.m)localObject2).Np(((aw)localObject1).bxU());
      locall.field_bgId = "";
      ((com.tencent.mm.plugin.sns.storage.m)localObject2).c(locall);
    }
    ((aw)localObject1).byW();
    ((aw)localObject1).bxU();
    localObject1 = new ax(7);
    ((ax)localObject1).eD(paramIntent, "");
    ((ax)localObject1).wD(1);
    ((ax)localObject1).commit();
    setResult(-1);
    finish();
  }
  
  public final int Ys()
  {
    return i.m.settings_sns_background;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    x.i("MicroMsg.SettingSnsBackgroundUI", paramf + " item has been clicked!");
    if (paramf.equals("settings_sns_bg_select_from_album"))
    {
      com.tencent.mm.kernel.g.Ek();
      if (!com.tencent.mm.kernel.g.Ei().isSDCardAvailable()) {
        com.tencent.mm.ui.base.s.gH(this);
      }
    }
    do
    {
      boolean bool;
      do
      {
        return false;
        com.tencent.mm.pluginsdk.ui.tools.l.a(this, 5, null);
        return true;
        if (!paramf.equals("settings_sns_bg_take_photo")) {
          break;
        }
        com.tencent.mm.kernel.g.Ek();
        if (!com.tencent.mm.kernel.g.Ei().isSDCardAvailable())
        {
          com.tencent.mm.ui.base.s.gH(this);
          return false;
        }
        bool = com.tencent.mm.pluginsdk.permission.a.a(this.mController.tml, "android.permission.CAMERA", 16, "", "");
        x.i("MicroMsg.SettingSnsBackgroundUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this.mController.tml });
      } while (!bool);
      auu();
      return true;
    } while (!paramf.equals("settings_sns_bg_select_bg"));
    startActivity(new Intent(this, ArtistUI.class));
    return true;
  }
  
  protected final void initView()
  {
    setMMTitle(i.j.settings_sns_bg_title);
    SnsArtistPreference localSnsArtistPreference = (SnsArtistPreference)this.eOE.ZZ("settings_sns_bg_select_bg");
    if (localSnsArtistPreference != null)
    {
      String str = this.duR.getString("artist_name", "");
      x.d("MicroMsg.SettingSnsBackgroundUI", "artistName" + str);
      localSnsArtistPreference.nTn = str;
      localSnsArtistPreference.bCU();
      this.eOE.notifyDataSetChanged();
    }
    setBackBtn(new SettingSnsBackgroundUI.5(this));
  }
  
  protected void onActivityResult(final int paramInt1, final int paramInt2, final Intent paramIntent)
  {
    x.i("MicroMsg.SettingSnsBackgroundUI", "onAcvityResult requestCode:" + paramInt1 + " " + paramInt2);
    if (paramInt2 != -1)
    {
      if ((paramInt1 == 2) || (paramInt1 == 5) || (paramInt1 == 6)) {
        new ag(Looper.getMainLooper()).post(new SettingSnsBackgroundUI.3(this));
      }
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder("result ok ");
    com.tencent.mm.kernel.g.Ek();
    x.d("MicroMsg.SettingSnsBackgroundUI", com.tencent.mm.kernel.g.Eg().Dx());
    if (af.bxX())
    {
      new ag(Looper.myLooper()).postDelayed(new Runnable()
      {
        public final void run()
        {
          SettingSnsBackgroundUI.a(SettingSnsBackgroundUI.this, paramInt1, paramIntent);
        }
      }, 2000L);
      return;
    }
    x.d("MicroMsg.SettingSnsBackgroundUI", "isInValid ok");
    e(paramInt1, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    x.d("MicroMsg.SettingSnsBackgroundUI", "onCreate");
    super.onCreate(paramBundle);
    this.eOE = this.tCL;
    this.duR = getSharedPreferences(ad.chY(), 0);
    initView();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    x.d("MicroMsg.SettingSnsBackgroundUI", "onDestroy");
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    x.d("MicroMsg.SettingSnsBackgroundUI", "onNewIntent");
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    setResult(-1);
    finish();
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
    {
      x.i("MicroMsg.SettingSnsBackgroundUI", "summerper onRequestPermissionsResult grantResults[%s] invalid", new Object[] { paramArrayOfInt });
      return;
    }
    x.i("MicroMsg.SettingSnsBackgroundUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
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
    com.tencent.mm.ui.base.h.a(this, getString(i.j.permission_camera_request_again_msg), getString(i.j.permission_tips_title), getString(i.j.jump_to_settings), getString(i.j.app_cancel), false, new SettingSnsBackgroundUI.6(this), null);
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.eOE != null) {
      this.eOE.notifyDataSetChanged();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SettingSnsBackgroundUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */