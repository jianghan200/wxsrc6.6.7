package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.tencent.mm.R.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.ui.tools.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.transmit.ShareImageSelectorUI;
import java.util.ArrayList;

@com.tencent.mm.ui.base.a(7)
public class ShareImageRedirectUI
  extends MMBaseActivity
{
  private String imagePath;
  
  private void auu()
  {
    l.c(this, e.dgl, "microMsg." + System.currentTimeMillis() + ".jpg", 0);
    getWindow().getDecorView().setOnTouchListener(new ShareImageRedirectUI.1(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject = null;
    getWindow().getDecorView().setOnTouchListener(null);
    if (paramInt2 != -1) {
      finish();
    }
    do
    {
      return;
      switch (paramInt1)
      {
      case 1: 
      default: 
        return;
      case 0: 
        localObject = getApplicationContext();
        au.HU();
        this.imagePath = l.d((Context)localObject, paramIntent, c.Gb());
      }
    } while (this.imagePath == null);
    paramIntent = new Intent(this, ShareImageSelectorUI.class);
    paramIntent.putExtra("intent_extra_image_path", this.imagePath);
    startActivityForResult(paramIntent, 2);
    return;
    if (paramIntent != null) {
      localObject = paramIntent.getStringArrayListExtra("Select_Contact");
    }
    if ((localObject != null) && (((ArrayList)localObject).size() == 1))
    {
      paramIntent = new Intent(this, ChattingUI.class);
      paramIntent.putExtra("Chat_User", (String)((ArrayList)localObject).get(0));
      startActivity(paramIntent);
      finish();
      return;
    }
    if ((localObject != null) && (((ArrayList)localObject).size() > 1))
    {
      finish();
      return;
    }
    paramIntent = new Intent();
    paramIntent.putExtra("Ksnsupload_type", 0);
    paramIntent.putExtra("sns_kemdia_path", this.imagePath);
    d.b(this, "sns", ".ui.SnsUploadUI", paramIntent);
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.CAMERA", 16, "", "");
    x.i("MicroMsg.ShareImageRedirectUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this });
    if (!bool) {
      return;
    }
    auu();
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    x.i("MicroMsg.ShareImageRedirectUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
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
    h.a(this, getString(R.l.permission_camera_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new ShareImageRedirectUI.2(this), new ShareImageRedirectUI.3(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/tools/ShareImageRedirectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */