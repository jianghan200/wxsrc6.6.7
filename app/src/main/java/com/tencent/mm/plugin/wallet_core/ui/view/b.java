package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.model.q;
import com.tencent.mm.platformtools.y.a;
import com.tencent.mm.plugin.wallet_core.e.a;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.e;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  public static View a(Context paramContext, View paramView, Bankcard paramBankcard, int paramInt1, a parama, boolean paramBoolean, int paramInt2)
  {
    a locala;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = View.inflate(paramContext, paramInt1, null);
      locala = new a();
      locala.pcH = ((ImageView)paramView.findViewById(a.f.bank_logo));
      locala.pcD = ((TextView)paramView.findViewById(a.f.bank_name));
      locala.pcE = ((TextView)paramView.findViewById(a.f.bankcard_type));
      locala.pcC = ((TextView)paramView.findViewById(a.f.bankcard_id));
      locala.pcI = ((TextView)paramView.findViewById(a.f.bankcard_expired));
      locala.pzn = ((ViewGroup)paramView.findViewById(a.f.wallet_bankcard_rl));
      locala.pcG = ((ImageView)paramView.findViewById(a.f.bankcard_mask));
      locala.pcJ = ((TextView)paramView.findViewById(a.f.bankcard_default));
      locala.pzp = ((ViewGroup)paramView.findViewById(a.f.bankcard_desc_ll));
      locala.pzq = ((TextView)paramView.findViewById(a.f.bankcard_bottom_desc_tv));
      locala.pzr = ((ImageView)paramView.findViewById(a.f.bankcard_new));
      paramView.setTag(locala);
      if (paramBankcard.field_bankcardState != 1) {
        break label391;
      }
      locala.pcI.setVisibility(0);
      label215:
      if (locala.pzr != null)
      {
        if (!paramBoolean) {
          break label404;
        }
        locala.pzr.setVisibility(0);
      }
      label237:
      if (1 != paramInt2) {
        break label417;
      }
      locala.pcD.setVisibility(8);
      label253:
      if (!q.GS()) {
        break label441;
      }
      locala.pcE.setVisibility(8);
      label269:
      if (locala.pcC != null) {
        locala.pcC.setText(paramBankcard.field_bankcardTail);
      }
      if ((bi.oW(paramBankcard.field_card_bottom_wording)) || (locala.pzq == null)) {
        break label522;
      }
      locala.pzq.setText(paramBankcard.field_card_bottom_wording);
      locala.pzp.setVisibility(0);
    }
    for (;;)
    {
      parama.a(paramContext, paramBankcard, locala.pcH, locala.pzn, locala.pcG);
      if (locala.pcJ != null)
      {
        o.bOW();
        paramContext = paramBankcard.field_bindSerial;
        locala.pcJ.setVisibility(8);
      }
      return paramView;
      locala = (a)paramView.getTag();
      break;
      label391:
      locala.pcI.setVisibility(8);
      break label215;
      label404:
      locala.pzr.setVisibility(8);
      break label237;
      label417:
      locala.pcD.setVisibility(0);
      locala.pcD.setText(paramBankcard.field_bankName);
      break label253;
      label441:
      if (!bi.oW(paramBankcard.field_bankcardTypeName))
      {
        locala.pcE.setText(paramBankcard.field_bankcardTypeName);
        break label269;
      }
      if (paramBankcard.bOr())
      {
        locala.pcE.setText(a.i.wallet_wxcredit_card);
        break label269;
      }
      if (paramBankcard.bOu())
      {
        locala.pcE.setText(a.i.wallet_credit_card);
        break label269;
      }
      locala.pcE.setText(a.i.wallet_deposit_card);
      break label269;
      label522:
      locala.pzp.setVisibility(8);
    }
  }
  
  public static Drawable c(Context paramContext, Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return null;
    }
    try
    {
      byte[] arrayOfByte = paramBitmap.getNinePatchChunk();
      if (NinePatch.isNinePatchChunk(arrayOfByte))
      {
        paramContext = new NinePatchDrawable(paramContext.getResources(), paramBitmap, arrayOfByte, new Rect(), null);
        paramContext.setBounds(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
        return paramContext;
      }
    }
    catch (Exception paramContext)
    {
      x.f("MicroMsg.BankcardListAdapter", paramContext.getMessage());
      x.printErrStackTrace("MicroMsg.BankcardListAdapter", paramContext, "", new Object[0]);
      return null;
    }
    paramContext = new BitmapDrawable(paramBitmap);
    return paramContext;
  }
  
  static final class a
    implements y.a
  {
    public TextView pcC = null;
    public TextView pcD = null;
    public TextView pcE = null;
    public ImageView pcG = null;
    public ImageView pcH = null;
    public TextView pcI = null;
    public TextView pcJ = null;
    public TextView pcK = null;
    public ViewGroup pzn = null;
    public e pzo;
    public ViewGroup pzp = null;
    public TextView pzq = null;
    public ImageView pzr = null;
    
    public final void m(String paramString, Bitmap paramBitmap)
    {
      StringBuilder localStringBuilder = new StringBuilder().append(paramString).append(", bitmap = ");
      boolean bool;
      if (paramBitmap == null)
      {
        bool = true;
        x.d("MicroMsg.BankcardListAdapter", bool);
        if (this.pzo != null) {
          break label51;
        }
      }
      label51:
      do
      {
        return;
        bool = false;
        break;
        if (paramString.equals(this.pzo.lCU)) {
          this.pcH.post(new b.a.1(this, paramBitmap));
        }
      } while ((!paramString.equals(this.pzo.pmo)) || (this.pcG == null));
      this.pcG.post(new b.a.2(this, paramBitmap));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/view/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */