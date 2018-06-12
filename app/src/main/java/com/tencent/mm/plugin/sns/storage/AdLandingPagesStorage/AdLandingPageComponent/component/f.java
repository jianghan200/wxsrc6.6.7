package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
  extends i
{
  ImageView bOA;
  ProgressBar eVR;
  boolean nDm = true;
  
  public f(Context paramContext, ViewGroup paramViewGroup)
  {
    this(paramContext, paramViewGroup, (byte)0);
  }
  
  private f(Context paramContext, ViewGroup paramViewGroup, byte paramByte)
  {
    super(paramContext, null, paramViewGroup);
  }
  
  public final boolean aa(JSONObject paramJSONObject)
  {
    if (!super.aa(paramJSONObject)) {
      return false;
    }
    try
    {
      if (!this.nDm)
      {
        String str = ac.ce(((p)this.nDt).nAL);
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("urlMd5", str);
        localJSONObject.put("needDownload", 1);
        paramJSONObject.put("imgUrlInfo", localJSONObject);
      }
      return true;
    }
    catch (JSONException paramJSONObject)
    {
      x.printErrStackTrace("AdLandingImageComp", paramJSONObject, "", new Object[0]);
    }
    return false;
  }
  
  public final View bzM()
  {
    View localView = this.contentView;
    this.bOA = ((ImageView)localView.findViewById(i.f.sns_ad_native_landing_pages_items_pure_image_img));
    this.eVR = ((ProgressBar)localView.findViewById(i.f.progressbar));
    return localView;
  }
  
  protected final void bzQ()
  {
    if ((this.contentView == null) || (this.bOA == null) || (this.eVR == null)) {}
    while ((p)this.nDt == null) {
      return;
    }
    float f1 = ((p)this.nDt).nAY;
    float f2 = ((p)this.nDt).nAZ;
    float f3 = ((p)this.nDt).nBa;
    float f4 = ((p)this.nDt).nBb;
    String str = ((p)this.nDt).nAL;
    float f5 = ((p)this.nDt).height;
    float f6 = ((p)this.nDt).width;
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.bOA.getLayoutParams();
    localLayoutParams.width = ((int)f6);
    localLayoutParams.height = ((int)f5);
    this.bOA.setLayoutParams(localLayoutParams);
    this.nDm = false;
    startLoading();
    d.a(str, ((p)this.nDt).nAX, new d.a()
    {
      public final void MX(String paramAnonymousString)
      {
        f localf;
        try
        {
          f.this.stopLoading();
          paramAnonymousString = BitmapFactory.decodeFile(paramAnonymousString);
          localf = f.this;
          if (paramAnonymousString == null)
          {
            x.e("AdLandingImageComp", "when set image the bmp is null!");
            return;
          }
          if (localf.bOA == null)
          {
            x.e("AdLandingImageComp", "when set image the imageView is null!");
            return;
          }
        }
        catch (Exception paramAnonymousString)
        {
          x.e("AdLandingImageComp", "%s" + bi.i(paramAnonymousString));
          return;
        }
        if (paramAnonymousString.getWidth() == 0)
        {
          x.e("AdLandingImageComp", "when set image the bmp.getWidth is 0!");
          return;
        }
        localf.bOA.setImageBitmap(paramAnonymousString);
        localf.eVR.setVisibility(8);
      }
      
      public final void bxo()
      {
        f.this.stopLoading();
      }
      
      public final void bzS()
      {
        f.this.startLoading();
      }
    });
    this.contentView.setPadding((int)f3, (int)f1, (int)f4, (int)f2);
    ij(false);
  }
  
  protected final int getLayout()
  {
    return i.g.sns_ad_native_landing_pages_item_image;
  }
  
  public final void startLoading()
  {
    this.eVR.setVisibility(0);
  }
  
  public final void stopLoading()
  {
    this.eVR.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */