package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.bq;

public class ProfileDescribeView
  extends ProfileItemView
{
  public TextView qGg;
  public TextView qGh;
  
  public ProfileDescribeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public ProfileDescribeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final boolean bnH()
  {
    if (this.qGh != null)
    {
      localObject1 = this.qGh.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).width = com.tencent.mm.bp.a.ad(getContext(), R.f.FixedTitleWidth);
      this.qGh.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    }
    if (this.ipd == null)
    {
      setVisibility(8);
      return false;
    }
    Object localObject2 = this.ipd.csT;
    int i;
    if (!bi.oW(this.ipd.csU)) {
      i = 1;
    }
    while (com.tencent.mm.l.a.gd(this.ipd.field_type)) {
      if ((!bi.oW((String)localObject2)) && (i != 0))
      {
        Drawable localDrawable = getContext().getResources().getDrawable(R.k.card_photoicon);
        localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
        localObject1 = new com.tencent.mm.ui.widget.a(localDrawable);
        ((com.tencent.mm.ui.widget.a)localObject1).uFY = ((int)((localDrawable.getIntrinsicHeight() - this.qGg.getTextSize()) / 2.0F));
        localObject2 = new SpannableString("  " + (String)localObject2);
        ((SpannableString)localObject2).setSpan(localObject1, 0, 1, 33);
        this.qGg.setText(j.a(getContext(), (CharSequence)localObject2, this.qGg.getTextSize()));
        return true;
        i = 0;
      }
      else
      {
        if ((!bi.oW((String)localObject2)) && (i == 0))
        {
          this.qGg.setText(j.a(getContext(), bi.oV((String)localObject2), this.qGg.getTextSize()));
          return true;
        }
        if ((bi.oW((String)localObject2)) && (i != 0))
        {
          localObject2 = getContext().getResources().getDrawable(R.k.card_photoicon);
          ((Drawable)localObject2).setBounds(0, 0, ((Drawable)localObject2).getIntrinsicWidth(), ((Drawable)localObject2).getIntrinsicHeight());
          localObject1 = new com.tencent.mm.ui.widget.a((Drawable)localObject2);
          ((com.tencent.mm.ui.widget.a)localObject1).uFY = ((int)((((Drawable)localObject2).getIntrinsicHeight() - this.qGg.getTextSize()) / 2.0F));
          localObject2 = new SpannableString("  " + getContext().getString(R.l.contact_info_remark_info_with_image));
          ((SpannableString)localObject2).setSpan(localObject1, 0, 1, 33);
          this.qGg.setText(j.a(getContext(), (CharSequence)localObject2, this.qGg.getTextSize()));
          return true;
        }
        if ((bi.oW((String)localObject2)) && (i == 0))
        {
          setVisibility(8);
          return false;
        }
        setVisibility(8);
        return false;
      }
    }
    Object localObject1 = this.ipd.field_encryptUsername;
    if (!bi.oW((String)localObject1)) {
      au.HU();
    }
    for (localObject1 = c.FS().Hh((String)localObject1); (localObject1 != null) && (!bi.oW(((bq)localObject1).field_conDescription)); localObject1 = c.FS().Hh(this.ipd.field_username))
    {
      this.qGg.setText(j.a(getContext(), bi.oV(((bq)localObject1).field_conDescription), this.qGg.getTextSize()));
      return true;
      au.HU();
    }
    setVisibility(8);
    return false;
  }
  
  public int getLayout()
  {
    return R.i.profile_describe_layout;
  }
  
  public final void init()
  {
    this.qGg = ((TextView)findViewById(R.h.contact_info_describe));
    this.qGh = ((TextView)findViewById(R.h.contact_info_describe_title));
    setClickable(true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/ProfileDescribeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */