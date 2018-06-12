package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.m;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public class PickedBottleImageView
  extends ImageView
{
  private float density;
  private Paint fBa = new Paint();
  private ag handler = new ag();
  private int hjQ;
  String hkb;
  private String hlY;
  private Rect hmr = new Rect();
  private RectF hms = new RectF();
  private View hmt;
  private Runnable hmu = new Runnable()
  {
    public final void run()
    {
      FrameLayout localFrameLayout = (FrameLayout)PickedBottleImageView.this.getParent();
      ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)PickedBottleImageView.a(PickedBottleImageView.this).getLayoutParams();
      if (localFrameLayout != null) {
        localMarginLayoutParams.setMargins(localFrameLayout.getWidth() / 2, localFrameLayout.getHeight() * 530 / 800, localMarginLayoutParams.rightMargin, localMarginLayoutParams.bottomMargin);
      }
      PickedBottleImageView.a(PickedBottleImageView.this).setLayoutParams(localMarginLayoutParams);
      PickedBottleImageView.a(PickedBottleImageView.this).setVisibility(0);
      PickedBottleImageView.this.clearAnimation();
    }
  };
  Bitmap iconBitmap;
  String iconUrl;
  
  public PickedBottleImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public PickedBottleImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public String getBottleTalker()
  {
    return this.hlY;
  }
  
  public String getIconUrl()
  {
    return this.iconUrl;
  }
  
  public String getRealUserName()
  {
    return this.hkb;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if ((19990 == this.hjQ) && (this.iconBitmap != null) && (!this.iconBitmap.isRecycled())) {
      paramCanvas.drawBitmap(this.iconBitmap, this.hmr, this.hms, this.fBa);
    }
    super.onDraw(paramCanvas);
  }
  
  public void setBottleTalker(String paramString)
  {
    this.hlY = paramString;
  }
  
  public void setDensity(float paramFloat)
  {
    this.density = paramFloat;
  }
  
  public void setIconUrl(String paramString)
  {
    this.iconUrl = paramString;
  }
  
  public void setRealUserName(String paramString)
  {
    this.hkb = paramString;
  }
  
  public void setVisibility(int paramInt)
  {
    if (paramInt == 8) {
      super.clearAnimation();
    }
    if ((paramInt == 8) && (this.hmt != null))
    {
      this.handler.removeCallbacks(this.hmu);
      this.hmt.setVisibility(paramInt);
    }
    super.setVisibility(paramInt);
  }
  
  public final void show(int paramInt)
  {
    this.hjQ = paramInt;
    if (paramInt == 1)
    {
      setImageResource(R.g.bottle_picked_text_msg);
      setContentDescription(getContext().getString(R.l.bottle_picked_result));
      this.iconBitmap = null;
    }
    for (;;)
    {
      FrameLayout localFrameLayout = (FrameLayout)getParent();
      if (this.hmt == null) {
        this.hmt = ((View)getParent()).findViewById(R.h.bottle_pick_open_hint_rl);
      }
      this.hmt.setVisibility(8);
      ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)getLayoutParams();
      localMarginLayoutParams.setMargins(localMarginLayoutParams.leftMargin, localMarginLayoutParams.topMargin, localMarginLayoutParams.rightMargin, localFrameLayout.getHeight() * 270 / 800);
      setLayoutParams(localMarginLayoutParams);
      startAnimation(AnimationUtils.loadAnimation(getContext(), R.a.bottle_rotate));
      this.handler.postDelayed(this.hmu, 3000L);
      setVisibility(0);
      return;
      if (paramInt == 3)
      {
        setImageResource(R.g.bottle_picked_voice_msg);
        setContentDescription(getContext().getString(R.l.bottle_picked_result));
        this.iconBitmap = null;
      }
      else if (paramInt == 19990)
      {
        setImageResource(R.g.bottle_brand_bg);
        this.iconBitmap = m.d(this.hkb, this.iconUrl, R.g.nosdcard_headimg);
        setContentDescription(getContext().getString(R.l.bottle_picked_result));
        this.fBa.setAntiAlias(true);
        update();
      }
      else
      {
        setImageResource(R.g.bottle_picked_nothing);
        this.iconBitmap = null;
        setContentDescription(getContext().getString(R.l.bottle_picked_result_null));
      }
    }
  }
  
  final void update()
  {
    boolean bool = true;
    if ((this.iconBitmap == null) || (this.iconBitmap.isRecycled())) {
      this.iconBitmap = BitmapFactory.decodeResource(getResources(), R.g.brand_default_head);
    }
    Object localObject1 = this.iconBitmap;
    Object localObject2 = new Matrix();
    ((Matrix)localObject2).setRotate(-60.0F, ((Bitmap)localObject1).getWidth() / 2.0F, ((Bitmap)localObject1).getHeight() / 2.0F);
    Bitmap localBitmap = Bitmap.createBitmap(((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localCanvas.drawBitmap((Bitmap)localObject1, (Matrix)localObject2, localPaint);
    localObject2 = new StringBuilder("resultBmp is null: ");
    if (localBitmap == null) {}
    for (;;)
    {
      x.d("MicroMsg.PickedBottleImageView", bool + "  degree:-60.0");
      if (localObject1 != localBitmap) {
        ((Bitmap)localObject1).recycle();
      }
      this.iconBitmap = localBitmap;
      localObject1 = this.hmr;
      this.hmr.top = 0;
      ((Rect)localObject1).left = 0;
      this.hmr.right = this.iconBitmap.getWidth();
      this.hmr.bottom = this.iconBitmap.getHeight();
      this.hms.left = (40.0F * this.density);
      this.hms.top = (30.0F * this.density);
      this.hms.right = (72.0F * this.density);
      this.hms.bottom = (62.0F * this.density);
      return;
      bool = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/PickedBottleImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */