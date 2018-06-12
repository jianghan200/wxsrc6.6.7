package com.tencent.mm.plugin.sight.decode.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sight.decode.a.b.g;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.MMTextureView;
import java.lang.ref.WeakReference;

@TargetApi(14)
public class SightPlayTextureView
  extends MMTextureView
  implements com.tencent.mm.plugin.sight.decode.a.a
{
  private Surface mSurface;
  private boolean ndF = false;
  private int ndK;
  private b ndx;
  private int ndz;
  private int videoHeight;
  private int videoWidth;
  
  public SightPlayTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SightPlayTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setOpaque(false);
    this.ndx = new b(this);
    setSurfaceTextureListener(new SightPlayTextureView.1(this));
  }
  
  private void w(double paramDouble)
  {
    final ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    if (localLayoutParams.height != (int)(this.ndz * paramDouble))
    {
      localLayoutParams.width = this.ndz;
      localLayoutParams.height = ((int)(this.ndz * paramDouble));
      if ((this.ndF) && (localLayoutParams.height < com.tencent.mm.bp.a.fromDPToPix(getContext(), 50))) {
        localLayoutParams.height = com.tencent.mm.bp.a.fromDPToPix(getContext(), 50);
      }
      x.i("MicroMsg.SightPlayTextureView", "params width %d height %d", new Object[] { Integer.valueOf(localLayoutParams.width), Integer.valueOf(localLayoutParams.height) });
      if (ah.isMainThread()) {
        setLayoutParams(localLayoutParams);
      }
    }
    else
    {
      return;
    }
    ah.A(new Runnable()
    {
      public final void run()
      {
        SightPlayTextureView.this.setLayoutParams(localLayoutParams);
      }
    });
  }
  
  public final void aO(String paramString, boolean paramBoolean)
  {
    this.ndx.aO(paramString, paramBoolean);
  }
  
  public final void bvE()
  {
    Bitmap localBitmap1 = b.b(getContext(), R.g.nosdcard_chatting_bg, this.ndz, 320, 240);
    Bitmap localBitmap2 = b.b(getContext(), this.ndK, this.ndz, 320, 240);
    SightVideoJNI.drawSurfaceThumb(this.mSurface, localBitmap1, localBitmap2);
  }
  
  public final boolean bvF()
  {
    return this.ndx.bvI();
  }
  
  public final void clear()
  {
    this.ndx.clear();
  }
  
  public final void dt(int paramInt1, int paramInt2)
  {
    ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    this.ndz = paramInt1;
    localLayoutParams.width = this.ndz;
    localLayoutParams.height = (this.ndz * paramInt2 / paramInt1);
    x.i("MicroMsg.SightPlayTextureView", "params width %d height %d", new Object[] { Integer.valueOf(localLayoutParams.width), Integer.valueOf(localLayoutParams.height) });
    if (ah.isMainThread())
    {
      setLayoutParams(localLayoutParams);
      return;
    }
    ah.A(new SightPlayTextureView.3(this, localLayoutParams));
  }
  
  public Object getTagObject()
  {
    return getTag();
  }
  
  public Context getUIContext()
  {
    return getContext();
  }
  
  public String getVideoPath()
  {
    return this.ndx.nck;
  }
  
  protected void onAttachedToWindow()
  {
    x.d("MicroMsg.SightPlayTextureView", "#0x%x on attached from window", new Object[] { Integer.valueOf(hashCode()) });
    super.onAttachedToWindow();
    com.tencent.mm.sdk.b.a.sFg.b(this.ndx.bvK());
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    x.i("MicroMsg.SightPlayTextureView", "#0x%x clear, on deattached to window", new Object[] { Integer.valueOf(hashCode()) });
    this.ndx.clear();
    com.tencent.mm.sdk.b.a.sFg.c(this.ndx.bvK());
  }
  
  public void setCanPlay(boolean paramBoolean)
  {
    this.ndx.ncF = paramBoolean;
  }
  
  public void setDrawableWidth(int paramInt)
  {
    this.ndz = paramInt;
    w(0.75D);
  }
  
  public void setForceRecordState(boolean paramBoolean) {}
  
  public void setIsWhatsNew(boolean paramBoolean)
  {
    this.ndx.ncI = paramBoolean;
  }
  
  public void setMaskID(int paramInt)
  {
    this.ndK = paramInt;
  }
  
  public void setOnCompletionListener(b.e parame)
  {
    this.ndx.ncQ = parame;
  }
  
  public void setOnDecodeDurationListener(b.f paramf)
  {
    this.ndx.ncR = paramf;
  }
  
  public void setOnSightCompletionAction(b.g paramg) {}
  
  public void setPosition(int paramInt)
  {
    this.ndx.position = paramInt;
  }
  
  public void setSightInfoView(TextView paramTextView)
  {
    this.ndx.setSightInfoView(paramTextView);
  }
  
  public void setTagObject(Object paramObject)
  {
    setTag(paramObject);
  }
  
  public void setThumbBgView(View paramView)
  {
    this.ndx.setThumbBgView(paramView);
  }
  
  public void setThumbBmp(Bitmap paramBitmap)
  {
    boolean bool1;
    boolean bool2;
    if (paramBitmap == null)
    {
      bool1 = true;
      if (this.mSurface != null) {
        break label172;
      }
      bool2 = true;
      label15:
      x.d("MicroMsg.SightPlayTextureView", "thumb is null? %B, surface is null? %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if (paramBitmap == null) {
        break label193;
      }
      x.d("MicroMsg.SightPlayTextureView", "thumb size [%d, %d]", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()) });
      if (this.ndF) {
        if (paramBitmap.getWidth() < paramBitmap.getHeight()) {
          break label177;
        }
      }
    }
    label172:
    label177:
    for (this.ndz = com.tencent.mm.bp.a.fromDPToPix(getContext(), 150);; this.ndz = com.tencent.mm.bp.a.fromDPToPix(getContext(), 85))
    {
      Bitmap localBitmap = b.b(getContext(), this.ndK, this.ndz, paramBitmap.getWidth(), paramBitmap.getHeight());
      w(paramBitmap.getHeight() / paramBitmap.getWidth());
      this.ndx.ncp = localBitmap;
      this.ndx.D(paramBitmap);
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label15;
    }
    label193:
    this.ndx.D(null);
  }
  
  private static final class a
    implements Runnable
  {
    Surface ndM = null;
    
    public final void run()
    {
      if (this.ndM == null) {
        return;
      }
      this.ndM.release();
    }
  }
  
  private static final class b
    extends b
  {
    private WeakReference<SightPlayTextureView> ndN;
    
    public b(SightPlayTextureView paramSightPlayTextureView)
    {
      super(paramSightPlayTextureView);
      this.ndN = new WeakReference(paramSightPlayTextureView);
    }
    
    public final void E(Bitmap paramBitmap) {}
    
    protected final int bvG()
    {
      return R.a.sight_loop;
    }
    
    public final void cl(int paramInt1, int paramInt2)
    {
      if (this.ndN.get() == null)
      {
        x.e("MicroMsg.SightPlayTextureView", "onGetVideoSizeEnd, textureView is null, do clear");
        clear();
        return;
      }
      SightPlayTextureView.a((SightPlayTextureView)this.ndN.get(), paramInt1);
      SightPlayTextureView.b((SightPlayTextureView)this.ndN.get(), paramInt2);
      x.d("MicroMsg.SightPlayTextureView", "on get video size %d*%d, needAutoResizeChatting: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(SightPlayTextureView.a((SightPlayTextureView)this.ndN.get())) });
      final ViewGroup.LayoutParams localLayoutParams = ((SightPlayTextureView)this.ndN.get()).getLayoutParams();
      if ((SightPlayTextureView.a((SightPlayTextureView)this.ndN.get())) && (paramInt1 > 0) && (paramInt2 > 0))
      {
        if (paramInt1 >= paramInt2) {
          SightPlayTextureView.c((SightPlayTextureView)this.ndN.get(), com.tencent.mm.bp.a.fromDPToPix(((SightPlayTextureView)this.ndN.get()).getContext(), 150));
        }
      }
      else if (localLayoutParams.height != SightPlayTextureView.b((SightPlayTextureView)this.ndN.get()) * paramInt2 / paramInt1)
      {
        localLayoutParams.width = SightPlayTextureView.b((SightPlayTextureView)this.ndN.get());
        localLayoutParams.height = (SightPlayTextureView.b((SightPlayTextureView)this.ndN.get()) * paramInt2 / paramInt1);
        if ((SightPlayTextureView.a((SightPlayTextureView)this.ndN.get())) && (localLayoutParams.height < com.tencent.mm.bp.a.fromDPToPix(((SightPlayTextureView)this.ndN.get()).getContext(), 50))) {
          localLayoutParams.height = com.tencent.mm.bp.a.fromDPToPix(((SightPlayTextureView)this.ndN.get()).getContext(), 50);
        }
        x.i("MicroMsg.SightPlayTextureView", "params width %d height %d", new Object[] { Integer.valueOf(localLayoutParams.width), Integer.valueOf(localLayoutParams.height) });
        if (!ah.isMainThread()) {
          break label432;
        }
        ((SightPlayTextureView)this.ndN.get()).setLayoutParams(localLayoutParams);
      }
      for (;;)
      {
        this.ncp = b.b(((SightPlayTextureView)this.ndN.get()).getContext(), SightPlayTextureView.c((SightPlayTextureView)this.ndN.get()), SightPlayTextureView.b((SightPlayTextureView)this.ndN.get()), paramInt1, paramInt2);
        return;
        SightPlayTextureView.c((SightPlayTextureView)this.ndN.get(), com.tencent.mm.bp.a.fromDPToPix(((SightPlayTextureView)this.ndN.get()).getContext(), 85));
        break;
        label432:
        ah.A(new Runnable()
        {
          public final void run()
          {
            ((SightPlayTextureView)SightPlayTextureView.b.a(SightPlayTextureView.b.this).get()).setLayoutParams(localLayoutParams);
          }
        });
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sight/decode/ui/SightPlayTextureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */