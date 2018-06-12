package com.tencent.mm.ui.appbrand;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.modelappbrand.b.b.h;
import com.tencent.mm.plugin.appbrand.q.k;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.o;

public final class c
  implements b.h
{
  private ImageView bRk = null;
  private ProgressBar bRm = null;
  private Bitmap bitmap = null;
  private View contentView = null;
  private Context context;
  private View kHl;
  private View nHH;
  private TextView oan = null;
  private TextView oao = null;
  o qMQ;
  public boolean qMR = true;
  private long trh = 10000L;
  private ImageView tri = null;
  private String trj = null;
  private boolean trk = false;
  private boolean trl = false;
  public a trm;
  ag trn = null;
  
  public c(Context paramContext, View paramView1, View paramView2, boolean paramBoolean)
  {
    this.context = paramContext;
    this.nHH = paramView1;
    this.kHl = paramView2;
    this.trl = paramBoolean;
    this.contentView = View.inflate(this.context, R.i.chatting_footer_app_brand_image_bubble, null);
    this.oan = ((TextView)this.contentView.findViewById(R.h.image_tv_1));
    this.oao = ((TextView)this.contentView.findViewById(R.h.image_tv_2));
    this.bRk = ((ImageView)this.contentView.findViewById(R.h.image_iv));
    this.tri = ((ImageView)this.contentView.findViewById(R.h.error_iv));
    this.bRm = ((ProgressBar)this.contentView.findViewById(R.h.image_pb));
    this.qMQ = new o(this.contentView, -2, -2, true);
    this.qMQ.setBackgroundDrawable(new ColorDrawable(0));
    this.qMQ.setOutsideTouchable(true);
    this.qMQ.setFocusable(false);
    this.contentView.setOnClickListener(new c.1(this));
    this.trn = new c.2(this, this.context.getMainLooper());
  }
  
  public final void Kc()
  {
    x.d("MicroMsg.AppBrandServiceImageBubble", "beforeLoadBitmap");
    this.bRm.setVisibility(0);
    this.bRk.setVisibility(8);
    this.tri.setVisibility(8);
  }
  
  public final void Kd()
  {
    x.i("MicroMsg.AppBrandServiceImageBubble", "onLoadFailed");
    this.tri.setVisibility(0);
    this.bRm.setVisibility(8);
    this.bRk.setVisibility(8);
  }
  
  public final String Ke()
  {
    return k.bq(this);
  }
  
  public final void n(Bitmap paramBitmap)
  {
    x.d("MicroMsg.AppBrandServiceImageBubble", "onBitmapLoaded");
    if (paramBitmap == null)
    {
      x.w("MicroMsg.AppBrandServiceImageBubble", "bitmap is null");
      return;
    }
    this.bitmap = paramBitmap;
    this.bRm.setVisibility(8);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      this.bRk.setVisibility(0);
      this.bRk.setImageBitmap(paramBitmap);
      this.tri.setVisibility(8);
      return;
    }
    this.tri.setVisibility(0);
    this.bRk.setVisibility(8);
  }
  
  public static abstract interface a
  {
    public abstract void cra();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/appbrand/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */