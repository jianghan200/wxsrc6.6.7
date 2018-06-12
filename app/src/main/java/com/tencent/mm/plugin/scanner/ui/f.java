package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.platformtools.y.a;
import com.tencent.mm.plugin.scanner.util.o;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.preference.Preference;

public final class f
  extends Preference
  implements y.a
{
  com.tencent.mm.ui.base.preference.f eOE;
  String ijO;
  private Context mContext;
  private ImageView mGO = null;
  private View mView = null;
  
  public f(Context paramContext)
  {
    super(paramContext);
    setLayoutResource(R.i.product_media_preference);
    y.a(this);
    this.mContext = paramContext;
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    return this.mView;
  }
  
  public final void m(String paramString, Bitmap paramBitmap)
  {
    if ((!bi.oW(paramString)) && (paramString.equals(this.ijO)) && (paramBitmap != null) && (!paramBitmap.isRecycled())) {
      ah.A(new f.1(this, paramBitmap));
    }
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.mGO = ((ImageView)paramView.findViewById(R.h.media_thumb));
    if (!bi.oW(this.ijO))
    {
      Bitmap localBitmap = y.a(new o(this.ijO));
      if ((localBitmap == null) || (localBitmap.isRecycled())) {
        break label86;
      }
      this.mGO.setImageBitmap(localBitmap);
      this.mGO.setBackgroundColor(0);
    }
    for (;;)
    {
      ((ImageView)paramView.findViewById(R.h.media_play_btn)).setVisibility(0);
      return;
      label86:
      this.mGO.setBackgroundColor(this.mContext.getResources().getColor(R.e.grid_preference_thumb_bg_color));
      this.mGO.setImageBitmap(null);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */