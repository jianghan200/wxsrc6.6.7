package com.tencent.mm.ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.RegionCodeDecoder.Region;
import com.tencent.mm.ui.base.preference.Preference;

public class ZonePreference
  extends Preference
{
  RegionCodeDecoder.Region uCD;
  private CharSequence uCE;
  private TextView uCF;
  
  public ZonePreference(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ZonePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ZonePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(R.i.mm_preference);
  }
  
  private void czW()
  {
    if (this.uCF == null) {
      return;
    }
    if ((this.uCE != null) && (!ai.oW(this.uCE.toString()))) {
      this.uCF.setVisibility(0);
    }
    for (;;)
    {
      this.uCF.setText(this.uCE);
      return;
      this.uCF.setVisibility(8);
    }
  }
  
  public final void a(RegionCodeDecoder.Region paramRegion)
  {
    if ((paramRegion == null) || (ai.oW(paramRegion.getName())) || (ai.oW(paramRegion.getCode())))
    {
      x.e("MicroMsg.ZonePreference", "setZoneItem item = null");
      return;
    }
    setKey(paramRegion.getCode() + paramRegion.isCity());
    this.uCD = paramRegion;
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    if (this.uCD == null) {
      return;
    }
    ((TextView)paramView.findViewById(R.h.zonename)).setText(this.uCD.getName());
    this.uCF = ((TextView)paramView.findViewById(R.h.summery));
    czW();
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.mm_preference_content_zone, localViewGroup);
    return paramViewGroup;
  }
  
  public final void setSummary(CharSequence paramCharSequence)
  {
    this.uCE = paramCharSequence;
    czW();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/tools/ZonePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */