package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.plugin.map.a.d;
import com.tencent.mm.plugin.map.a.e;
import com.tencent.mm.plugin.map.a.f;
import com.tencent.mm.plugin.r.d;

public class MyLocationButton
  extends FrameLayout
{
  public a.a cXs = new MyLocationButton.1(this);
  private Context context;
  private ImageButton kEF;
  private LinearLayout kEG;
  private d kEH;
  private boolean kEI = true;
  
  public MyLocationButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    init();
  }
  
  public MyLocationButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    init();
  }
  
  private void init()
  {
    View localView = View.inflate(this.context, a.f.my_location_btn, this);
    this.kEF = ((ImageButton)localView.findViewById(a.e.locate_btn));
    this.kEG = ((LinearLayout)localView.findViewById(a.e.progress_bar));
  }
  
  public final void aZy()
  {
    this.kEF.setImageResource(a.d.poi_mylocation_btn_icon_disable);
  }
  
  public final void aZz()
  {
    this.kEF.setImageResource(a.d.poi_mylocation_btn_icon_normal);
  }
  
  public ImageButton getMyLocationBtn()
  {
    return this.kEF;
  }
  
  public LinearLayout getProgressBar()
  {
    return this.kEG;
  }
  
  public void setAnimToSelf(boolean paramBoolean)
  {
    this.kEI = paramBoolean;
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.kEF.setOnClickListener(paramOnClickListener);
  }
  
  public void setProgressBar(d paramd)
  {
    this.kEH = paramd;
    this.kEG.setVisibility(0);
    this.kEF.setVisibility(8);
    c.OB().b(this.cXs, true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/location/ui/MyLocationButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */