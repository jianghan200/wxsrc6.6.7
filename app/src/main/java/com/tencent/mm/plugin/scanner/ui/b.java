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
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public final class b
  extends Preference
  implements y.a
{
  f eOE;
  String ijO;
  private Context mContext;
  private ImageView mGO = null;
  private View mView = null;
  
  public b(Context paramContext)
  {
    super(paramContext);
    setLayoutResource(R.i.product_banner_preference);
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
    if ((!bi.oW(paramString)) && (paramString.equals(this.ijO)) && (paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      this.mGO.setImageBitmap(paramBitmap);
      this.mGO.setBackgroundColor(0);
      if (this.eOE != null) {
        this.eOE.notifyDataSetChanged();
      }
    }
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.mGO = ((ImageView)paramView.findViewById(R.h.banner_thumb));
    if (!bi.oW(this.ijO))
    {
      paramView = y.a(new o(this.ijO));
      if ((paramView != null) && (!paramView.isRecycled()))
      {
        this.mGO.setImageBitmap(paramView);
        this.mGO.setBackgroundColor(0);
      }
    }
    else
    {
      return;
    }
    this.mGO.setBackgroundColor(this.mContext.getResources().getColor(R.e.grid_preference_thumb_bg_color));
    this.mGO.setImageBitmap(null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */