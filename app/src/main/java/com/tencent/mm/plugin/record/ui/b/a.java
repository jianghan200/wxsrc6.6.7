package com.tencent.mm.plugin.record.ui.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.g.a.mu;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.record.ui.a.b;
import com.tencent.mm.plugin.record.ui.h.a;
import com.tencent.mm.plugin.record.ui.h.a.b;
import com.tencent.mm.plugin.record.ui.h.b;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;

public final class a
  implements h.b
{
  private ListView CU;
  com.tencent.mm.ui.tools.k fUH;
  Map<String, mu> iYQ = new HashMap();
  private c iYS = new a.4(this);
  private View.OnClickListener iZP = new a.1(this);
  View.OnLongClickListener jcS = new a.2(this);
  h.a msR;
  int mtu;
  
  public a(h.a parama, ListView paramListView)
  {
    this.msR = parama;
    this.CU = paramListView;
    com.tencent.mm.sdk.b.a.sFg.b(this.iYS);
  }
  
  public final void a(View paramView, int paramInt, b paramb)
  {
    paramView = (ImageView)paramView.findViewById(R.h.record_listitem_content);
    paramView.setTag(paramb);
    paramView.setOnClickListener(this.iZP);
    if (paramb.bjS == 1) {
      paramView.setOnLongClickListener(this.jcS);
    }
    h.a.b localb = new h.a.b();
    if (paramb.bjS == 0) {
      localb.msT = paramb.bJC;
    }
    for (;;)
    {
      localb.bOz = paramb.bOz;
      localb.bOC = true;
      localb.maxWidth = this.mtu;
      Bitmap localBitmap = this.msR.a(localb);
      if (localBitmap == null) {
        break;
      }
      x.d("MicroMsg.ImageViewWrapper", "get from dataId %s, cache %s", new Object[] { localb.bOz.jdM, localBitmap });
      a(paramView, localBitmap, R.k.fav_list_img_default, paramb.bOz.jdM);
      return;
      if (paramb.bjS == 1) {
        localb.msT = paramb.msw.field_localId;
      }
    }
    au.Em().H(new a.3(this, paramb, paramView));
  }
  
  final void a(ImageView paramImageView, Bitmap paramBitmap, int paramInt, String paramString)
  {
    if (!((b)paramImageView.getTag()).bOz.jdM.equals(paramString))
    {
      x.d("MicroMsg.ImageViewWrapper", "scroll over to next img. old tag %s, now tag %s", new Object[] { paramString, paramImageView.getTag() });
      return;
    }
    if (paramBitmap == null)
    {
      paramBitmap = paramImageView.getLayoutParams();
      paramBitmap.height = 200;
      paramBitmap.width = 280;
      paramImageView.setImageResource(paramInt);
      paramImageView.setBackgroundResource(R.e.light_grey);
      return;
    }
    x.d("MicroMsg.ImageViewWrapper", "update view bmp[%d, %d], iv[%d, %d]", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()), Integer.valueOf(paramImageView.getWidth()), Integer.valueOf(paramImageView.getHeight()) });
    paramString = paramImageView.getLayoutParams();
    paramInt = paramBitmap.getWidth();
    int i = paramBitmap.getHeight();
    float f;
    if (i >= paramInt)
    {
      f = i / paramInt;
      if (f <= 2.5D) {
        break label428;
      }
      paramBitmap = Bitmap.createBitmap(paramBitmap, 0, (paramBitmap.getHeight() - (int)(paramBitmap.getWidth() * 2.5F)) / 2, paramBitmap.getWidth(), (int)(paramBitmap.getWidth() * 2.5F));
      f = 2.5F;
    }
    label428:
    for (;;)
    {
      if (f <= 2.0F)
      {
        paramInt = com.tencent.mm.bp.a.ae(paramImageView.getContext(), R.f.ChatImgLimitWidth);
        i = (int)(paramInt / f);
      }
      for (;;)
      {
        paramString.width = i;
        paramString.height = paramInt;
        paramImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        com.tencent.mm.sdk.platformtools.k.k(paramImageView, i, paramInt);
        if (paramImageView.getLayerType() == 1) {
          this.CU.setLayerType(1, null);
        }
        paramImageView.setImageBitmap(paramBitmap);
        paramImageView.setBackgroundResource(0);
        return;
        i = com.tencent.mm.bp.a.ae(paramImageView.getContext(), R.f.ChatImgMinWidth);
        paramInt = (int)(i * f);
      }
      f = paramInt / i;
      if (f > 2.5D)
      {
        paramBitmap = Bitmap.createBitmap(paramBitmap, (paramBitmap.getWidth() - (int)(paramBitmap.getHeight() * 2.5F)) / 2, 0, (int)(paramBitmap.getHeight() * 2.5F), paramBitmap.getHeight());
        f = 2.5F;
      }
      for (;;)
      {
        if (f <= 2.0F)
        {
          i = com.tencent.mm.bp.a.ae(paramImageView.getContext(), R.f.ChatImgLimitWidth);
          paramInt = (int)(i / f);
          break;
        }
        paramInt = com.tencent.mm.bp.a.ae(paramImageView.getContext(), R.f.ChatImgMinWidth);
        i = (int)(paramInt * f);
        break;
      }
    }
  }
  
  public final void destroy()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.iYS);
  }
  
  public final View eb(Context paramContext)
  {
    View localView = View.inflate(paramContext, R.i.record_listitem_image, null);
    this.mtu = com.tencent.mm.bp.a.fromDPToPix(paramContext, 200);
    return localView;
  }
  
  public final void pause() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/record/ui/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */