package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.o;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.bottle.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.tools.l;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;

public class BottleWizardStep1
  extends MMActivity
{
  private ImageView hly = null;
  
  private void aut()
  {
    Bitmap localBitmap = com.tencent.mm.aa.c.a(ab.XV(com.tencent.mm.model.q.GF()), false, -1);
    if (localBitmap == null) {
      localBitmap = com.tencent.mm.aa.c.a(com.tencent.mm.model.q.GF(), false, -1);
    }
    for (;;)
    {
      this.hly = ((ImageView)findViewById(R.h.image_headimg_wizard));
      if (localBitmap != null) {
        this.hly.setImageBitmap(localBitmap);
      }
      return;
    }
  }
  
  private void auu()
  {
    if (!l.c(this, e.dgl, "microMsg." + System.currentTimeMillis() + ".jpg", 3)) {
      Toast.makeText(this, getString(R.l.selectcameraapp_none), 1).show();
    }
  }
  
  protected final int getLayoutId()
  {
    return R.i.bottle_wizard_step1;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.bottle_beach_title);
    ((LinearLayout)findViewById(R.h.image_headimg_wizard_btn)).setOnClickListener(new BottleWizardStep1.1(this));
    setBackBtn(new BottleWizardStep1.2(this));
    addTextOptionMenu(0, getString(R.l.app_nextstep), new BottleWizardStep1.3(this));
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    }
    do
    {
      Object localObject;
      do
      {
        do
        {
          do
          {
            return;
            localObject = getApplicationContext();
            au.HU();
            paramIntent = l.d((Context)localObject, paramIntent, com.tencent.mm.model.c.Gb());
          } while (paramIntent == null);
          localObject = new Intent();
          ((Intent)localObject).putExtra("CropImageMode", 1);
          ((Intent)localObject).putExtra("CropImage_OutputPath", paramIntent);
          ((Intent)localObject).putExtra("CropImage_ImgPath", paramIntent);
          a.ezn.a(this, (Intent)localObject, 4);
          return;
        } while (paramIntent == null);
        localObject = getApplicationContext();
        au.HU();
        localObject = l.d((Context)localObject, paramIntent, com.tencent.mm.model.c.Gb());
      } while (localObject == null);
      Intent localIntent = new Intent();
      localIntent.putExtra("CropImageMode", 1);
      localIntent.putExtra("CropImage_ImgPath", (String)localObject);
      localIntent.putExtra("CropImage_OutputPath", com.tencent.mm.aa.q.Kp().c(ab.XV(com.tencent.mm.model.q.GF()), true, false) + ".crop");
      a.ezn.a(localIntent, 4, this, paramIntent);
      return;
    } while (paramIntent == null);
    paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
    if (paramIntent == null)
    {
      x.e("MicroMsg.BottleWizardStep1", "crop picture failed");
      return;
    }
    new o(this.mController.tml, paramIntent).b(2, new BottleWizardStep1.6(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    x.i("MicroMsg.BottleWizardStep1", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
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
    h.a(this, getString(R.l.permission_camera_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new BottleWizardStep1.5(this), null);
  }
  
  protected void onResume()
  {
    super.onResume();
    initView();
    aut();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/BottleWizardStep1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */