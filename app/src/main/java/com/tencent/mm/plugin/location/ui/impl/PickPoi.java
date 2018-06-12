package com.tencent.mm.plugin.location.ui.impl;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.mm.modelgeo.b;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.map.a.a;
import com.tencent.mm.plugin.map.a.e;
import com.tencent.mm.plugin.map.a.f;
import com.tencent.mm.plugin.map.a.h;

public class PickPoi
  extends RelativeLayout
{
  private Context context;
  Animation kEu;
  View kEv;
  protected b kHU;
  public b.a kIb = new PickPoi.1(this);
  private double kJi;
  private double kJj;
  private f kJk = new f();
  boolean kJl = true;
  private e kJm = null;
  
  public PickPoi(Context paramContext)
  {
    super(paramContext);
    this.context = paramContext;
    init();
  }
  
  public PickPoi(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    init();
  }
  
  public PickPoi(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    init();
  }
  
  private void init()
  {
    this.kHU = b.Oz();
    this.kEu = AnimationUtils.loadAnimation(this.context, a.a.translate_map);
    this.kEv = LayoutInflater.from(this.context).inflate(a.f.location_poi_pick, this, true).findViewById(a.e.location_here);
  }
  
  public f getPoi()
  {
    return this.kJk;
  }
  
  public final void m(double paramDouble1, double paramDouble2)
  {
    this.kJi = paramDouble1;
    this.kJj = paramDouble2;
    this.kJk = new f();
    this.kJk.type = 3;
    this.kJk.mName = this.context.getResources().getString(a.h.location_selected);
    this.kJk.bhC = paramDouble1;
    this.kJk.bhD = paramDouble2;
    this.kJk.kJu = "";
    this.kHU.a(this.kIb);
    this.kHU.a(paramDouble1, paramDouble2, this.kIb);
    this.kJl = true;
  }
  
  public void setAdapter(e parame)
  {
    this.kJm = parame;
  }
  
  public void setLocationArrow(int paramInt)
  {
    ((ImageView)this.kEv).setImageResource(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/location/ui/impl/PickPoi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */