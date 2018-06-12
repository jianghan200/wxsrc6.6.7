package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.ak.a.a;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class DeviceProfileHeaderPreference
  extends Preference
{
  private String fNv;
  protected MMActivity fcq;
  String iAa;
  private String iAb;
  private boolean iAc = false;
  private ImageView izS;
  private TextView izT;
  private TextView izU;
  private TextView izV;
  private View izW;
  TextView izX;
  private boolean[] izY = new boolean[6];
  private View.OnClickListener[] izZ = new View.OnClickListener[6];
  private CharSequence sT;
  
  public DeviceProfileHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.fcq = ((MMActivity)paramContext);
    this.iAc = false;
  }
  
  public DeviceProfileHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.fcq = ((MMActivity)paramContext);
    this.iAc = false;
  }
  
  private void x(View paramView, int paramInt)
  {
    if (this.izY[paramInt] != 0) {}
    for (int i = 8;; i = 0)
    {
      paramView.setVisibility(i);
      paramView.setOnClickListener(this.izZ[paramInt]);
      return;
    }
  }
  
  public final void Ao(String paramString)
  {
    this.fNv = paramString;
    if (this.izV != null) {
      this.izV.setText(paramString);
    }
  }
  
  public final void H(int paramInt, boolean paramBoolean)
  {
    int i = 0;
    Object localObject;
    int j;
    switch (paramInt)
    {
    default: 
    case 0: 
      label60:
      do
      {
        return;
        localObject = this.izS;
        boolean[] arrayOfBoolean = this.izY;
        if (paramBoolean) {
          break;
        }
        j = 1;
        arrayOfBoolean[paramInt] = j;
      } while (localObject == null);
      if (!paramBoolean) {
        break;
      }
    }
    for (paramInt = i;; paramInt = 8)
    {
      ((View)localObject).setVisibility(paramInt);
      return;
      localObject = this.izT;
      break;
      localObject = this.izU;
      break;
      localObject = this.izV;
      break;
      localObject = this.izW;
      break;
      localObject = this.izX;
      break;
      j = 0;
      break label60;
    }
  }
  
  public final void a(int paramInt, View.OnClickListener paramOnClickListener)
  {
    Object localObject;
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      localObject = this.izS;
    }
    for (;;)
    {
      this.izZ[paramInt] = paramOnClickListener;
      if (localObject == null) {
        break;
      }
      ((View)localObject).setOnClickListener(paramOnClickListener);
      return;
      localObject = this.izT;
      continue;
      localObject = this.izU;
      continue;
      localObject = this.izV;
      continue;
      localObject = this.izW;
      continue;
      localObject = this.izX;
    }
  }
  
  public final void onBindView(View paramView)
  {
    x.d("MicroMsg.DeviceProfileHeaderPreference", "onBindView");
    this.izS = ((ImageView)paramView.findViewById(R.h.avatarIV));
    this.izT = ((TextView)paramView.findViewById(R.h.nameTV));
    this.izU = ((TextView)paramView.findViewById(R.h.editRemarkTV));
    this.izV = ((TextView)paramView.findViewById(R.h.deviceNameTV));
    this.izW = paramView.findViewById(R.h.editTV);
    this.izX = ((TextView)paramView.findViewById(R.h.deviceDescTV));
    x(this.izS, 0);
    x(this.izT, 2);
    x(this.izU, 1);
    x(this.izV, 3);
    x(this.izW, 4);
    x(this.izX, 5);
    this.iAc = true;
    if (!this.iAc) {
      x.w("MicroMsg.DeviceProfileHeaderPreference", "initView : bindView = " + this.iAc);
    }
    for (;;)
    {
      super.onBindView(paramView);
      return;
      this.izT.setText(this.sT);
      this.izV.setText(this.fNv);
      this.izX.setText(this.iAa);
      setIconUrl(this.iAb);
    }
  }
  
  public final void setIconUrl(String paramString)
  {
    this.iAb = paramString;
    if (this.izS != null)
    {
      c.a locala = new c.a();
      Bitmap localBitmap = c.CV(R.g.exdevice_my_device_default_icon);
      paramString = localBitmap;
      if (localBitmap != null)
      {
        paramString = localBitmap;
        if (!localBitmap.isRecycled())
        {
          localBitmap = c.a(localBitmap, true, 0.5F * localBitmap.getWidth());
          paramString = localBitmap;
          if (localBitmap != null)
          {
            paramString = localBitmap;
            if (!localBitmap.isRecycled())
            {
              locala.dXO = new BitmapDrawable(localBitmap);
              paramString = localBitmap;
            }
          }
        }
      }
      if ((paramString == null) || (paramString.isRecycled())) {
        locala.dXN = R.g.exdevice_my_device_default_icon;
      }
      locala.dXW = true;
      paramString = locala.Pt();
      o.Pj().a(this.iAb, this.izS, paramString);
    }
  }
  
  public final void setName(CharSequence paramCharSequence)
  {
    this.sT = paramCharSequence;
    if (this.izT != null) {
      this.izT.setText(paramCharSequence);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/ui/DeviceProfileHeaderPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */