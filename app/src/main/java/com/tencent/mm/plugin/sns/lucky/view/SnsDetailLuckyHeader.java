package com.tencent.mm.plugin.sns.lucky.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.lucky.a.m;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI;
import com.tencent.mm.plugin.sns.ui.TouchImageView;
import com.tencent.mm.plugin.sns.ui.b.b;
import com.tencent.mm.plugin.sns.ui.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.bou;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.protocal.c.bpn;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public class SnsDetailLuckyHeader
  extends LinearLayout
{
  private View ilW = null;
  private TextView nmi;
  private LinearLayout nmj;
  private LinearLayout nmk;
  
  public SnsDetailLuckyHeader(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public SnsDetailLuckyHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public SnsDetailLuckyHeader(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    View localView = View.inflate(getContext(), i.g.lucky_sns_detail_header, this);
    this.ilW = localView.findViewById(i.f.album_list_hb_fatherview);
    this.nmi = ((TextView)localView.findViewById(i.f.album_hb_reward_tip));
    this.nmj = ((LinearLayout)localView.findViewById(i.f.album_hb_reward_users));
    this.nmk = getLinearSeparator();
  }
  
  public final void a(n paramn, b paramb)
  {
    Object localObject2 = aj.n(paramn);
    Object localObject1 = ((boy)localObject2).smZ;
    if ((localObject1 == null) || (((bpn)localObject1).snC.size() == 0)) {
      setVisibility(8);
    }
    boolean bool;
    int k;
    int m;
    int i;
    int j;
    do
    {
      return;
      setVisibility(0);
      double d = m.b(paramn, (boy)localObject2);
      localObject2 = getContext().getString(i.j.sns_lucky_reward_tip_info, new Object[] { Integer.valueOf(((boy)localObject2).smZ.snB), bi.A(d * 1.0D / 100.0D) });
      this.nmi.setText((CharSequence)localObject2);
      this.ilW.setTag(paramn);
      this.ilW.setOnClickListener(paramb.okH);
      paramn = ((bpn)localObject1).snC;
      bool = ((bpn)localObject1).snC.isEmpty();
      k = BackwardSupportUtil.b.b(getContext(), 32.0F);
      m = BackwardSupportUtil.b.b(getContext(), 6.0F);
      i = BackwardSupportUtil.b.b(getContext(), 10.0F);
      j = BackwardSupportUtil.b.b(getContext(), 17.0F);
    } while (this.nmj == null);
    int n = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getWidth();
    float f = getResources().getDimension(i.d.NormalPadding);
    x.d("MicroMsg.SnsDetailLuckyHeader", "guess size %d %f", new Object[] { Integer.valueOf(n), Float.valueOf(f) });
    f = n - f * 2.0F;
    if (paramn.size() <= 0)
    {
      if (this.nmj.getParent() != null) {
        this.nmj.setVisibility(8);
      }
      this.nmj.removeAllViews();
      this.nmj.setVisibility(8);
      paramn = this.nmj;
      i = 8;
    }
    for (;;)
    {
      paramn.setVisibility(i);
      return;
      this.nmj.getParent();
      this.nmj.removeAllViews();
      this.nmj.setVisibility(0);
      this.nmj.setPadding(0, m, 0, m);
      localObject1 = new ImageView(getContext());
      ((ImageView)localObject1).setImageResource(i.i.friendactivity_luckymoney_icon);
      ((ImageView)localObject1).setPadding(i, j, i, 0);
      localObject2 = new LinearLayout.LayoutParams(-2, -2);
      ((LinearLayout.LayoutParams)localObject2).gravity = 49;
      ((ImageView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      ((ImageView)localObject1).setClickable(false);
      ((ImageView)localObject1).setFocusable(false);
      this.nmj.addView((View)localObject1);
      n = a.fromDPToPix(getContext(), SnsCommentDetailUI.nUo);
      j = (int)(f - n) / (m + k);
      i = j;
      if ((int)(f - n) % (m + k) > k) {
        i = j + 1;
      }
      x.d("MicroMsg.SnsDetailLuckyHeader", "guess size %d", new Object[] { Integer.valueOf(i) });
      localObject1 = new i(getContext());
      ((i)localObject1).setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
      ((i)localObject1).setLineMaxCounte(i);
      i = 0;
      while (i < paramn.size())
      {
        localObject2 = (bou)paramn.get(i);
        TouchImageView localTouchImageView = new TouchImageView(getContext());
        localTouchImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        localTouchImageView.setImageResource(i.e.friendactivity_personalportrait);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(k, k);
        localLayoutParams.setMargins(0, m, m, 0);
        localTouchImageView.setLayoutParams(localLayoutParams);
        localTouchImageView.setTag(((bou)localObject2).rdS);
        a.b.p(localTouchImageView, ((bou)localObject2).rdS);
        localTouchImageView.setOnClickListener(paramb.okw);
        ((i)localObject1).addView(localTouchImageView);
        i += 1;
      }
      this.nmj.addView((View)localObject1);
      paramn = this.nmk;
      if (bool) {
        i = 8;
      } else {
        i = 0;
      }
    }
  }
  
  public LinearLayout getLinearSeparator()
  {
    BackwardSupportUtil.b.b(getContext(), 2.0F);
    AbsListView.LayoutParams localLayoutParams = new AbsListView.LayoutParams(-1, 1);
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    localLinearLayout.setBackgroundResource(i.e.sns_divider_line);
    localLinearLayout.setLayoutParams(localLayoutParams);
    return localLinearLayout;
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (this.ilW != null) {
      this.ilW.setVisibility(paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/sns/lucky/view/SnsDetailLuckyHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */