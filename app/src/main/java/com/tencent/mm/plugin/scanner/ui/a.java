package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.platformtools.y.a;
import com.tencent.mm.plugin.scanner.util.o;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public final class a
  extends Preference
  implements y.a
{
  private ImageView gER;
  private f gua;
  String iAb;
  private TextView mGL = null;
  String mGM = null;
  private View mView = null;
  
  public a(Context paramContext)
  {
    super(paramContext);
    setLayoutResource(R.i.scan_product_preference);
    y.a(this);
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
    if ((!bi.oW(paramString)) && (paramString.equals(this.iAb)) && (paramBitmap != null) && (!paramBitmap.isRecycled()) && (this.gER != null)) {
      ah.A(new a.1(this, paramBitmap));
    }
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.mGL = ((TextView)paramView.findViewById(R.h.digest));
    this.gER = ((ImageView)paramView.findViewById(R.h.actiontext_icon));
    if (!bi.oW(this.mGM))
    {
      this.mGL.setText(this.mGM);
      this.mGL.setVisibility(0);
    }
    for (;;)
    {
      if (!bi.oW(this.iAb))
      {
        paramView = y.a(new o(this.iAb));
        if ((paramView != null) && (!paramView.isRecycled()))
        {
          this.gER.setImageBitmap(paramView);
          this.gER.setVisibility(0);
        }
      }
      return;
      this.mGL.setVisibility(8);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */