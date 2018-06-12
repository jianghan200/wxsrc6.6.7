package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.o;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.setting.a.c;
import com.tencent.mm.plugin.setting.a.e;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.GetHdHeadImageGalleryView;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;

public class PreviewHdHeadImg
  extends MMActivity
{
  private GetHdHeadImageGalleryView kXi;
  private final int mQn = 1;
  private final int mQo = 2;
  private com.tencent.mm.aa.g mQp;
  private String mQq;
  private String username;
  
  private void btu()
  {
    if (!com.tencent.mm.kernel.g.Ei().isSDCardAvailable())
    {
      com.tencent.mm.ui.base.s.gH(this.mController.tml);
      d(com.tencent.mm.aa.q.Kp().bJ(this.mController.tml), null);
      return;
    }
    Bitmap localBitmap2 = com.tencent.mm.aa.c.a(this.username, true, -1);
    Bitmap localBitmap1 = localBitmap2;
    if (localBitmap2 == null) {
      localBitmap1 = BitmapFactory.decodeResource(getResources(), a.e.default_avatar);
    }
    if ((localBitmap1 != null) && (!localBitmap1.isRecycled()))
    {
      x.i("MicroMsg.PreviewHdHeadImg", "The avatar of %s is in the cache", new Object[] { this.username });
      this.kXi.setThumbImage(localBitmap1);
    }
    for (;;)
    {
      localBitmap2 = com.tencent.mm.aa.q.Kp().jU(this.username);
      if ((localBitmap2 == null) || (localBitmap2.isRecycled())) {
        break;
      }
      x.i("MicroMsg.PreviewHdHeadImg", "The HDAvatar of %s is already exists", new Object[] { this.username });
      d(localBitmap2, com.tencent.mm.aa.q.Kp().c(this.username, true, false));
      return;
      x.i("MicroMsg.PreviewHdHeadImg", "The avatar of %s is not in the cache, use default avatar", new Object[] { this.username });
    }
    this.mQp = new com.tencent.mm.aa.g();
    this.mQp.a(this.username, new PreviewHdHeadImg.3(this, localBitmap1));
  }
  
  private void d(Bitmap paramBitmap, String paramString)
  {
    if (paramBitmap == null) {
      return;
    }
    for (;;)
    {
      try
      {
        if (paramBitmap.getWidth() < 480)
        {
          float f = 480.0F / paramBitmap.getWidth();
          localObject = new Matrix();
          ((Matrix)localObject).postScale(f, f);
          localObject = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
          x.d("MicroMsg.PreviewHdHeadImg", "dkhdbm old[%d %d] new[%d %d]", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()), Integer.valueOf(((Bitmap)localObject).getWidth()), Integer.valueOf(((Bitmap)localObject).getHeight()) });
          this.kXi.setHdHeadImage((Bitmap)localObject);
          this.kXi.setHdHeadImagePath(paramString);
          this.mQq = paramString;
          return;
        }
      }
      catch (Exception paramBitmap)
      {
        x.printErrStackTrace("MicroMsg.PreviewHdHeadImg", paramBitmap, "", new Object[0]);
        return;
      }
      Object localObject = paramBitmap;
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.get_hd_head_image_gallery_view;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.settings_avatar);
    lF(getResources().getColor(a.c.transparent));
    this.username = com.tencent.mm.model.q.GF();
    this.kXi = ((GetHdHeadImageGalleryView)findViewById(a.f.gallery));
    this.kXi.setUsername(this.username);
    btu();
    addIconOptionMenu(0, a.e.mm_title_btn_menu, new PreviewHdHeadImg.1(this));
    setBackBtn(new PreviewHdHeadImg.2(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.i("MicroMsg.PreviewHdHeadImg", "onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 != -1) {
      if ((paramInt1 == 2) || (paramInt1 == 4)) {
        new ag(Looper.getMainLooper()).post(new PreviewHdHeadImg.4(this));
      }
    }
    do
    {
      do
      {
        return;
        switch (paramInt1)
        {
        case 3: 
        default: 
          return;
        }
      } while (paramIntent == null);
      Intent localIntent = new Intent();
      localIntent.putExtra("CropImageMode", 1);
      localIntent.putExtra("CropImage_Filter", true);
      localIntent.putExtra("CropImage_OutputPath", com.tencent.mm.aa.q.Kp().c(com.tencent.mm.model.q.GF() + ".crop", true, false));
      localIntent.putExtra("CropImage_ImgPath", null);
      b.ezn.a(this, paramIntent, localIntent, com.tencent.mm.plugin.p.c.Gb(), 4, null);
      return;
      new ag(Looper.getMainLooper()).post(new PreviewHdHeadImg.5(this));
    } while (paramIntent == null);
    paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
    if (paramIntent == null)
    {
      x.e("MicroMsg.PreviewHdHeadImg", "crop picture failed");
      return;
    }
    new o(this.mController.tml, paramIntent).b(1, new PreviewHdHeadImg.6(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().getDecorView().setSystemUiVisibility(1280);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/PreviewHdHeadImg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */