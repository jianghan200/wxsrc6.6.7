package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.card.a.a;
import com.tencent.mm.plugin.card.a.b;
import com.tencent.mm.plugin.card.a.c;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.base.c;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.plugin.card.widget.CardTagTextView;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.bsf;
import com.tencent.mm.protocal.c.bwx;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class j
  implements c
{
  private ArrayList<Integer> hAA = new ArrayList();
  private ArrayList<String> hAB = new ArrayList();
  private ArrayList<String> hAC = new ArrayList();
  protected LinkedList<CardTagTextView> hAD = new LinkedList();
  private BaseAdapter hAv;
  private long hAw = 0L;
  private long hAx = 0L;
  private int hAy;
  private int hAz;
  private Context mContext;
  
  public j(Context paramContext, BaseAdapter paramBaseAdapter)
  {
    this.mContext = paramContext;
    this.hAv = paramBaseAdapter;
    this.hAy = this.mContext.getResources().getDimensionPixelSize(a.b.OneDPPadding);
    this.hAz = this.mContext.getResources().getDimensionPixelSize(a.b.MiddlePadding);
    this.hAA.clear();
    this.hAB.clear();
    this.hAC.clear();
  }
  
  private CardTagTextView ayb()
  {
    if (this.hAD.size() == 0) {
      return new CardTagTextView(this.mContext);
    }
    return (CardTagTextView)this.hAD.removeFirst();
  }
  
  public final View a(int paramInt, View paramView, com.tencent.mm.plugin.card.base.b paramb)
  {
    long l = System.currentTimeMillis();
    a locala;
    Object localObject1;
    int j;
    int i;
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, a.e.card_share_card_item, null);
      locala = new a();
      locala.hAE = ((LinearLayout)paramView.findViewById(a.d.card_tag_layout));
      locala.hAF = ((TextView)paramView.findViewById(a.d.card_item_category_title));
      locala.hAG = ((TextView)paramView.findViewById(a.d.card_item_subcategory_title));
      locala.hAH = ((RelativeLayout)paramView.findViewById(a.d.card_container_parent));
      locala.hAI = ((ImageView)paramView.findViewById(a.d.card_img));
      locala.hAJ = ((TextView)paramView.findViewById(a.d.card_brand_name));
      locala.hAK = ((TextView)paramView.findViewById(a.d.card_name));
      locala.hAO = paramView.findViewById(a.d.card_line);
      locala.hAL = ((TextView)paramView.findViewById(a.d.subtitle));
      locala.hAM = ((TextView)paramView.findViewById(a.d.card_announcement));
      locala.hAN = ((TextView)paramView.findViewById(a.d.card_not_support_tip));
      locala.hAP = ((TextView)paramView.findViewById(a.d.card_count_title));
      locala.hAL.setEllipsize(TextUtils.TruncateAt.MIDDLE);
      paramView.setTag(locala);
      localObject1 = (com.tencent.mm.plugin.card.base.b)this.hAv.getItem(paramInt);
      j = ((com.tencent.mm.plugin.card.base.b)localObject1).awv();
      if (!com.tencent.mm.plugin.card.sharecard.a.b.nL(((com.tencent.mm.plugin.card.base.b)localObject1).awv())) {
        break label1804;
      }
      if (paramInt != 0) {
        break label845;
      }
      if (TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject1).nF(j))) {
        break label1804;
      }
      i = 1;
    }
    for (;;)
    {
      label282:
      if (i != 0)
      {
        locala.hAF.setVisibility(0);
        locala.hAF.setText(((com.tencent.mm.plugin.card.base.b)localObject1).nF(j));
        if (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject1).awu()))
        {
          locala.hAG.setVisibility(0);
          locala.hAG.setText(((com.tencent.mm.plugin.card.base.b)localObject1).awu());
          label350:
          if (!paramb.avY()) {
            break label1643;
          }
          locala.hAI.setVisibility(0);
          locala.hAJ.setVisibility(0);
          locala.hAE.setVisibility(0);
          locala.hAK.setVisibility(0);
          locala.hAP.setVisibility(0);
          locala.hAO.setVisibility(0);
          locala.hAL.setVisibility(0);
          locala.hAM.setVisibility(0);
          locala.hAN.setVisibility(8);
          locala.hAJ.setText(paramb.awm().hwh);
          if (!paramb.avV()) {
            break label1033;
          }
          if ((paramb.awm().rnG == null) || (paramb.awm().rnG.size() != 1)) {
            break label921;
          }
          locala.hAK.setText(((pr)paramb.awm().rnG.get(0)).title);
          label522:
          i = this.mContext.getResources().getDimensionPixelSize(a.b.card_list_logo_height);
          m.a(locala.hAI, paramb.awm().huW, i, a.c.my_card_package_defaultlogo, true);
          locala.hAJ.setTextColor(this.mContext.getResources().getColor(a.a.card_black_color));
          localObject1 = com.tencent.mm.plugin.card.sharecard.a.b.xt(paramb.awr());
          if (TextUtils.isEmpty((CharSequence)localObject1)) {
            break label1053;
          }
          locala.hAM.setText((CharSequence)localObject1);
          label610:
          localObject1 = com.tencent.mm.plugin.card.sharecard.a.b.ld(paramb.awr());
          boolean bool = com.tencent.mm.plugin.card.sharecard.a.b.nL(paramb.awv());
          if ((TextUtils.isEmpty((CharSequence)localObject1)) || (!bool)) {
            break label1067;
          }
          locala.hAL.setText(com.tencent.mm.pluginsdk.ui.d.j.a(this.mContext, (CharSequence)localObject1, this.mContext.getResources().getDimensionPixelOffset(a.b.SmallerTextSize)));
          label675:
          i = com.tencent.mm.plugin.card.sharecard.a.b.xu(paramb.awr());
          if ((i <= 1) || (!bool)) {
            break label1183;
          }
          locala.hAP.setText("X" + i);
          locala.hAP.setVisibility(0);
        }
      }
      label732:
      label845:
      label921:
      label1033:
      label1053:
      label1067:
      label1183:
      Object localObject2;
      for (;;)
      {
        if (((paramb.awm().rnZ != null) && (!bi.cX(paramb.awm().rnZ.stj))) || (com.tencent.mm.plugin.card.sharecard.a.b.xw(paramb.awr())))
        {
          locala.hAE.setVisibility(0);
          i = 0;
          for (;;)
          {
            if (i < locala.hAE.getChildCount())
            {
              localObject1 = (CardTagTextView)locala.hAE.getChildAt(i);
              this.hAD.add(localObject1);
              i += 1;
              continue;
              locala = (a)paramView.getTag();
              break;
              if (j == ((com.tencent.mm.plugin.card.base.b)this.hAv.getItem(paramInt - 1)).awv()) {
                break label1804;
              }
              i = 1;
              break label282;
              locala.hAG.setVisibility(8);
              break label350;
              locala.hAF.setVisibility(8);
              locala.hAG.setVisibility(8);
              locala.hAF.setText("");
              break label350;
              if ((paramb.awm().rnG == null) || (paramb.awm().rnG.size() != 2)) {
                break label522;
              }
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append(((pr)paramb.awm().rnG.get(0)).title);
              ((StringBuilder)localObject1).append("-");
              ((StringBuilder)localObject1).append(((pr)paramb.awm().rnG.get(1)).title);
              locala.hAK.setText(((StringBuilder)localObject1).toString());
              break label522;
              locala.hAK.setText(paramb.awm().title);
              break label522;
              locala.hAM.setText("");
              break label610;
              if (!TextUtils.isEmpty(paramb.aws()))
              {
                localObject1 = l.xY(paramb.aws());
                if (!TextUtils.isEmpty((CharSequence)localObject1))
                {
                  localObject1 = this.mContext.getResources().getString(a.g.card_share_card_list_users, new Object[] { localObject1 });
                  locala.hAL.setText(com.tencent.mm.pluginsdk.ui.d.j.a(this.mContext, (CharSequence)localObject1, this.mContext.getResources().getDimensionPixelOffset(a.b.SmallerTextSize)));
                  break label675;
                }
                locala.hAL.setText("");
                break label675;
              }
              locala.hAL.setText("");
              break label675;
              locala.hAP.setVisibility(8);
              break label732;
            }
          }
          locala.hAE.removeAllViews();
          if (com.tencent.mm.plugin.card.sharecard.a.b.xw(paramb.awr()))
          {
            localObject1 = ayb();
            ((CardTagTextView)localObject1).setPadding(this.hAz, this.hAy, this.hAz, this.hAy);
            ((CardTagTextView)localObject1).setTextColor(this.mContext.getResources().getColor(a.a.red));
            ((CardTagTextView)localObject1).setText(this.mContext.getString(a.g.card_share_card_top_tips));
            ((CardTagTextView)localObject1).setTextSize(12.0F);
            localObject2 = new LinearLayout.LayoutParams(-2, -2);
            ((LinearLayout.LayoutParams)localObject2).rightMargin = this.mContext.getResources().getDimensionPixelOffset(a.b.LittlePadding);
            locala.hAE.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
          }
          if ((paramb.awm().rnZ == null) || (bi.cX(paramb.awm().rnZ.stj))) {
            break label1477;
          }
          localObject1 = paramb.awm().rnZ.stj.iterator();
        }
      }
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (bsf)((Iterator)localObject1).next();
        CardTagTextView localCardTagTextView = ayb();
        localCardTagTextView.setPadding(this.hAz, this.hAy, this.hAz, this.hAy);
        localCardTagTextView.setTextColor(l.xV(((bsf)localObject2).dxh));
        localCardTagTextView.setText(((bsf)localObject2).tag);
        localCardTagTextView.setTextSize(12.0F);
        locala.hAE.addView(localCardTagTextView);
        continue;
        locala.hAE.setVisibility(8);
      }
      label1477:
      if ((paramInt == this.hAv.getCount() - 1) && (locala.hAH != null))
      {
        localObject1 = (LinearLayout.LayoutParams)locala.hAH.getLayoutParams();
        if (((LinearLayout.LayoutParams)localObject1).bottomMargin != this.mContext.getResources().getDimensionPixelOffset(a.b.LittlePadding))
        {
          ((LinearLayout.LayoutParams)localObject1).bottomMargin = this.mContext.getResources().getDimensionPixelOffset(a.b.LittlePadding);
          locala.hAH.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        }
      }
      for (;;)
      {
        this.hAw = (System.currentTimeMillis() - l + this.hAw);
        this.hAx += 1L;
        if (!this.hAB.contains(paramb.awq()))
        {
          this.hAB.add(paramb.awq());
          this.hAC.add(paramb.awr());
          this.hAA.add(Integer.valueOf(paramInt));
        }
        return paramView;
        label1643:
        locala.hAI.setVisibility(8);
        locala.hAJ.setVisibility(8);
        locala.hAE.setVisibility(8);
        locala.hAK.setVisibility(8);
        locala.hAP.setVisibility(8);
        locala.hAO.setVisibility(8);
        locala.hAL.setVisibility(8);
        locala.hAM.setVisibility(8);
        locala.hAN.setVisibility(0);
        locala.hAN.setText(this.mContext.getResources().getString(a.g.card_not_support_card_type));
        break;
        if (locala.hAH != null)
        {
          localObject1 = (LinearLayout.LayoutParams)locala.hAH.getLayoutParams();
          if (((LinearLayout.LayoutParams)localObject1).bottomMargin != 0)
          {
            ((LinearLayout.LayoutParams)localObject1).bottomMargin = 0;
            locala.hAH.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          }
        }
      }
      label1804:
      i = 0;
    }
  }
  
  public final void a(View paramView, int paramInt, View.OnClickListener paramOnClickListener) {}
  
  public final void release()
  {
    this.mContext = null;
    this.hAv = null;
    if (this.hAx > 0L)
    {
      ArrayList localArrayList = new ArrayList();
      IDKey localIDKey1 = new IDKey();
      localIDKey1.SetID(281);
      localIDKey1.SetKey(5);
      localIDKey1.SetValue(1L);
      IDKey localIDKey2 = new IDKey();
      localIDKey2.SetID(281);
      localIDKey2.SetKey(6);
      localIDKey2.SetValue((int)(this.hAw / this.hAx));
      localArrayList.add(localIDKey1);
      localArrayList.add(localIDKey2);
      h.mEJ.b(localArrayList, true);
    }
    if ((this.hAA.size() == this.hAB.size()) && (this.hAB.size() == this.hAC.size()) && (this.hAA.size() > 0))
    {
      long l = System.currentTimeMillis();
      int i = 0;
      while (i < this.hAA.size())
      {
        h.mEJ.h(13220, new Object[] { this.hAC.get(i), this.hAB.get(i), this.hAA.get(i), Long.valueOf(l) });
        i += 1;
      }
    }
    this.hAA.clear();
    this.hAB.clear();
    this.hAC.clear();
    if (this.hAD != null) {
      this.hAD.clear();
    }
  }
  
  public final void v(View paramView, int paramInt) {}
  
  public final void w(View paramView, int paramInt) {}
  
  public final class a
  {
    public LinearLayout hAE;
    public TextView hAF;
    public TextView hAG;
    public RelativeLayout hAH;
    public ImageView hAI;
    public TextView hAJ;
    public TextView hAK;
    public TextView hAL;
    public TextView hAM;
    public TextView hAN;
    public View hAO;
    public TextView hAP;
    
    public a() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/ui/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */