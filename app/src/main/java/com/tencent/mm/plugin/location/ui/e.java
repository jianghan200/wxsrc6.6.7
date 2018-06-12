package com.tencent.mm.plugin.location.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.r.d;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends ImageView
{
  private static int kEU;
  private final String TAG = "MicroMsg.MyPoiPoint";
  private boolean bgH;
  private double bhG;
  public a.a cXs = new e.1(this);
  private a.a kEL;
  private Bitmap kEM;
  private boolean kEN;
  private double kEO;
  private double kEP;
  public com.tencent.mm.modelgeo.c kEQ;
  private d kER;
  private boolean kES = false;
  private final int kET = 689208551;
  private boolean kEV = false;
  private Activity mActivity;
  
  public e(Activity paramActivity, int paramInt, d paramd)
  {
    super(paramActivity);
    this.kER = paramd;
    this.kEL = null;
    this.mActivity = paramActivity;
    this.kEM = com.tencent.mm.sdk.platformtools.c.CV(paramInt);
    this.bgH = false;
    this.kEN = false;
    this.kEQ = com.tencent.mm.modelgeo.c.OB();
    kEU = BackwardSupportUtil.b.b(paramActivity, 80.0F);
    setImageResource(paramInt);
    setScaleType(ImageView.ScaleType.FIT_CENTER);
    x.d("MicroMsg.MyPoiPoint", "enableLocation");
    this.bgH = true;
    this.kEQ.a(this.cXs);
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    x.d("MicroMsg.MyPoiPoint", "onDraw");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/location/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */