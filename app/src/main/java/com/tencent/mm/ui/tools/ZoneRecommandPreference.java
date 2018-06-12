package com.tencent.mm.ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.storage.RegionCodeDecoder.Region;
import com.tencent.mm.ui.base.preference.Preference;

public class ZoneRecommandPreference
  extends Preference
{
  private TextView eBR;
  int status = 0;
  RegionCodeDecoder.Region uCG;
  RegionCodeDecoder.Region uCH;
  RegionCodeDecoder.Region uCI;
  private TextView uCJ;
  private ImageView uCK;
  
  public ZoneRecommandPreference(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ZoneRecommandPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ZoneRecommandPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(R.i.mm_preference);
  }
  
  final void czX()
  {
    if ((this.uCJ == null) || (this.eBR == null)) {
      return;
    }
    switch (this.status)
    {
    default: 
      return;
    case 0: 
      this.uCJ.setVisibility(8);
      this.eBR.setVisibility(0);
      this.eBR.setText(R.l.setting_zone_getting_location);
      this.uCK.setImageResource(R.k.get_location_icon);
      setEnabled(false);
      setSelectable(false);
      return;
    case 2: 
      this.uCJ.setVisibility(8);
      this.eBR.setVisibility(0);
      this.eBR.setText(R.l.setting_zone_cannot_get_location);
      this.uCK.setImageResource(R.k.get_location_failed_icon);
      setEnabled(false);
      setSelectable(false);
      return;
    }
    this.uCJ.setVisibility(0);
    this.eBR.setVisibility(8);
    this.uCK.setImageResource(R.k.get_location_icon);
    Object localObject2 = "";
    Object localObject1 = localObject2;
    if (this.uCG != null)
    {
      localObject1 = localObject2;
      if (!ai.oW(this.uCG.getName())) {
        localObject1 = "" + this.uCG.getName();
      }
    }
    localObject2 = localObject1;
    if (this.uCH != null)
    {
      localObject2 = localObject1;
      if (!ai.oW(this.uCH.getName())) {
        localObject2 = (String)localObject1 + " " + this.uCH.getName();
      }
    }
    localObject1 = localObject2;
    if (this.uCI != null)
    {
      localObject1 = localObject2;
      if (!ai.oW(this.uCI.getName())) {
        localObject1 = (String)localObject2 + " " + this.uCI.getName();
      }
    }
    this.uCJ.setText((CharSequence)localObject1);
    setEnabled(true);
    setSelectable(true);
  }
  
  public final void czY()
  {
    this.status = 2;
    czX();
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    czX();
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.mm_preference_content_zone_recommand, localViewGroup);
    this.uCJ = ((TextView)paramViewGroup.findViewById(R.h.zonename));
    this.eBR = ((TextView)paramViewGroup.findViewById(R.h.status));
    this.uCK = ((ImageView)paramViewGroup.findViewById(R.h.status_image));
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/tools/ZoneRecommandPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */