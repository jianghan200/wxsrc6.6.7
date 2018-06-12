package com.tencent.mm.plugin.card.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ak.a.a;
import com.tencent.mm.ak.a.a.c;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.ak.a.c.g;
import com.tencent.mm.ak.o;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.card.a.a;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;

public final class m
{
  public static void a(final Context paramContext, ImageView paramImageView, String paramString, int paramInt1, final int paramInt2, final int paramInt3)
  {
    if ((paramImageView == null) || (TextUtils.isEmpty(paramString))) {
      return;
    }
    if (!TextUtils.isEmpty(paramString))
    {
      Object localObject = new c.a();
      ((c.a)localObject).dXB = e.bnE;
      o.Pk();
      ((c.a)localObject).dXU = null;
      ((c.a)localObject).dXA = com.tencent.mm.plugin.card.model.m.xr(paramString);
      ((c.a)localObject).dXy = true;
      ((c.a)localObject).dXW = false;
      ((c.a)localObject).dXw = true;
      ((c.a)localObject).dXF = paramInt1;
      ((c.a)localObject).dXE = paramInt1;
      ((c.a)localObject).dXN = paramInt2;
      localObject = ((c.a)localObject).Pt();
      o.Pj().a(paramString, paramImageView, (c)localObject, new g()
      {
        public final Bitmap a(String paramAnonymousString, com.tencent.mm.ak.a.d.b paramAnonymousb)
        {
          return null;
        }
        
        public final void a(String paramAnonymousString, View paramAnonymousView, com.tencent.mm.ak.a.d.b paramAnonymousb)
        {
          if (paramAnonymousb.bitmap != null)
          {
            ah.A(new m.1.1(this, paramAnonymousb.bitmap));
            return;
          }
          m.a(this.hIK, paramInt2, paramInt3);
        }
        
        public final void me(String paramAnonymousString) {}
      });
      return;
    }
    a(paramImageView, paramInt2, paramInt3);
  }
  
  public static void a(ImageView paramImageView, int paramInt1, int paramInt2)
  {
    ah.A(new m.2(paramImageView, paramInt1, paramInt2));
  }
  
  public static void a(ImageView paramImageView, String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if ((paramImageView == null) || (TextUtils.isEmpty(paramString))) {
      return;
    }
    if (!TextUtils.isEmpty(paramString))
    {
      Object localObject = new c.a();
      ((c.a)localObject).dXB = e.bnE;
      o.Pk();
      ((c.a)localObject).dXU = null;
      ((c.a)localObject).dXA = com.tencent.mm.plugin.card.model.m.xr(paramString);
      ((c.a)localObject).dXy = true;
      ((c.a)localObject).dXW = paramBoolean;
      ((c.a)localObject).dXw = true;
      ((c.a)localObject).dXF = paramInt1;
      ((c.a)localObject).dXE = paramInt1;
      ((c.a)localObject).dXN = paramInt2;
      localObject = ((c.a)localObject).Pt();
      o.Pj().a(paramString, paramImageView, (c)localObject);
      return;
    }
    paramImageView.setImageResource(paramInt2);
  }
  
  public static void a(MMActivity paramMMActivity, com.tencent.mm.plugin.card.base.b paramb)
  {
    paramMMActivity.lF(l.xV(paramb.awm().dxh));
  }
  
  public static void b(TextView paramTextView, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      paramTextView.setText(a.g.card_state_normal);
      return;
    case 1: 
      paramTextView.setText(a.g.card_state_consumed);
      return;
    case 2: 
      paramTextView.setText(a.g.card_state_expire);
      return;
    case 3: 
      paramTextView.setText(a.g.card_state_donation);
      return;
    case 4: 
      paramTextView.setText(a.g.card_state_received);
      return;
    case 5: 
      paramTextView.setText(a.g.card_state_timeout);
      return;
    case 6: 
      paramTextView.setText(a.g.card_state_deleted);
      return;
    }
    paramTextView.setText(a.g.card_state_lapsed);
  }
  
  public static void d(MMActivity paramMMActivity)
  {
    paramMMActivity.lF(paramMMActivity.getResources().getColor(a.a.white));
  }
  
  public static String yd(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.CardViewUtil", "toApply is null");
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < paramString.length())
    {
      localStringBuilder.append(paramString.charAt(i));
      if ((i + 1) % 4 == 0) {
        localStringBuilder.append(" ");
      }
      i += 1;
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/d/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */