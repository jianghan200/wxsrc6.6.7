package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.modelstat.k;
import com.tencent.mm.modelstat.m;
import com.tencent.mm.modelstat.q;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.j;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.Preference;

public class NetStatPreference
  extends Preference
{
  boolean mQa = false;
  
  public NetStatPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NetStatPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.j.NetStatPreference, paramInt, 0);
    if (paramAttributeSet.getInt(a.j.NetStatPreference_srcType, 0) == 1) {}
    for (boolean bool = true;; bool = false)
    {
      this.mQa = bool;
      paramAttributeSet.recycle();
      setSummary(paramContext.getString(a.i.settings_netstat_statistic_period, new Object[] { Integer.valueOf(15) }));
      return;
    }
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    LinearLayout localLinearLayout = (LinearLayout)paramView.findViewById(a.f.group);
    localLinearLayout.removeAllViews();
    int k = (int)(System.currentTimeMillis() / 86400000L);
    int i = 15;
    while (i > 0)
    {
      localNetStatGroup = new NetStatGroup(this.mContext);
      int m = k - i + 1;
      bool = this.mQa;
      localObject = DateFormat.format(localNetStatGroup.getContext().getString(a.i.fmt_date, new Object[] { "" }), m * 86400000L).toString();
      localNetStatGroup.mPZ.setText((CharSequence)localObject);
      x.d("MicroMsg.NetStatGroup", "NetStat dataTime = " + (String)localObject);
      localNetStatGroup.mPY.removeAllViews();
      int j = 0;
      if (j < 5)
      {
        localObject = new NetStatUnit(localNetStatGroup.getContext());
        k localk = q.Sj().it(m + j);
        int n;
        int i1;
        int i2;
        if (localk != null)
        {
          if (!bool) {
            break label323;
          }
          x.i("MicroMsg.NetStatUnit", "dknetflow peroid:%d wifi : %d %d %d %d", new Object[] { Integer.valueOf(localk.ejM), Integer.valueOf(localk.eki), Integer.valueOf(localk.ejW), Integer.valueOf(localk.ekk), Integer.valueOf(localk.ejY) });
          n = localk.eki;
          i1 = localk.ejW;
          i2 = localk.ekk;
          ((NetStatUnit)localObject).dr(n + i1, localk.ejY + i2);
        }
        for (;;)
        {
          ((NetStatUnit)localObject).setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0F));
          localNetStatGroup.mPY.addView((View)localObject);
          j += 1;
          break;
          label323:
          x.i("MicroMsg.NetStatUnit", "dknetflow peroid:%d mobile : %d %d %d %d", new Object[] { Integer.valueOf(localk.ejM), Integer.valueOf(localk.ekh), Integer.valueOf(localk.ejV), Integer.valueOf(localk.ekj), Integer.valueOf(localk.ejX) });
          n = localk.ekh;
          i1 = localk.ejV;
          i2 = localk.ekj;
          ((NetStatUnit)localObject).dr(n + i1, localk.ejX + i2);
        }
      }
      localLinearLayout.addView(localNetStatGroup, -2, -1);
      i -= 5;
    }
    localLinearLayout = (LinearLayout)paramView.findViewById(a.f.ruler);
    localLinearLayout.removeAllViews();
    NetStatGroup localNetStatGroup = new NetStatGroup(this.mContext);
    boolean bool = this.mQa;
    localNetStatGroup.removeAllViews();
    View.inflate(localNetStatGroup.getContext(), a.g.netstat_ruler, localNetStatGroup);
    localNetStatGroup.mPY = ((LinearLayout)localNetStatGroup.findViewById(a.f.group));
    Object localObject = new NetStatRuler(localNetStatGroup.getContext());
    if (bool) {}
    for (paramView = "wifi";; paramView = "mobile")
    {
      ((NetStatRuler)localObject).setTag(paramView);
      ((NetStatRuler)localObject).setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0F));
      localNetStatGroup.mPY.addView((View)localObject);
      localLinearLayout.addView(localNetStatGroup);
      return;
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.f.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, a.g.mm_preference_content_netstat, localViewGroup);
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/NetStatPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */