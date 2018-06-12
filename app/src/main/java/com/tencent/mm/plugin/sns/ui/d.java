package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.storage.a;
import com.tencent.mm.plugin.sns.storage.a.b;
import com.tencent.mm.plugin.sns.storage.a.b.a;
import com.tencent.mm.plugin.sns.storage.b.a;
import com.tencent.mm.plugin.sns.storage.b.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public final class d
  extends BaseAdapter
{
  public int fHo = 0;
  private String kCA = null;
  private final Context mContext;
  public com.tencent.mm.plugin.sns.data.b nKA = null;
  
  public d(Context paramContext, com.tencent.mm.plugin.sns.data.b paramb)
  {
    this.mContext = paramContext;
    this.nKA = paramb;
    this.kCA = w.fD(ad.getContext());
  }
  
  public final int getCount()
  {
    if (this.fHo == 1) {
      return this.nKA.nkH.ohp.nyo.bzl().size();
    }
    int i = 0;
    if (this.nKA.nkH.oho.nzw != null) {
      i = this.nKA.nkH.oho.nzw.list.size();
    }
    return i + 1;
  }
  
  public final Object getItem(int paramInt)
  {
    return this.nKA.nkH.ohp.nyo.bzl().get(paramInt);
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramView;
    if (paramView == null) {
      localView = View.inflate(this.mContext, i.g.ad_unlike_reason_item, null);
    }
    localView.setTag(this.nKA);
    paramViewGroup = "";
    Object localObject;
    if (this.fHo == 1)
    {
      localObject = (a.b.a)getItem(paramInt);
      if ("zh_CN".equals(this.kCA))
      {
        paramViewGroup = ((a.b.a)localObject).nyy;
        paramView = paramViewGroup;
        if (bi.oW(paramViewGroup)) {
          paramView = ((a.b.a)localObject).nyA;
        }
        label83:
        paramViewGroup = (TextView)localView.findViewById(i.f.ad_unlike_reason_tv);
        if (!this.nKA.nkH.ohp.nys) {
          break label451;
        }
        paramViewGroup.setTextColor(Color.parseColor("#3A3A3A"));
        label120:
        paramViewGroup.setText(paramView);
        paramView = localView.findViewById(i.f.ad_unlike_reason_sep);
        if (paramInt != getCount() - 1) {
          break label463;
        }
      }
    }
    label303:
    label451:
    label463:
    for (paramInt = 8;; paramInt = 0)
    {
      paramView.setVisibility(paramInt);
      return localView;
      if (("zh_TW".equals(this.kCA)) || ("zh_HK".equals(this.kCA)))
      {
        paramViewGroup = ((a.b.a)localObject).nyz;
        break;
      }
      paramViewGroup = ((a.b.a)localObject).nyA;
      break;
      if (paramInt == 0)
      {
        paramView = paramViewGroup;
        if (this.nKA == null) {
          break label83;
        }
        paramView = paramViewGroup;
        if (this.nKA.nkH.oho == null) {
          break label83;
        }
        paramView = this.nKA.nkH.ohp;
        if ("zh_CN".equals(this.kCA)) {
          paramView = paramView.nyp;
        }
        for (;;)
        {
          if (bi.oW(paramView)) {
            break label303;
          }
          break;
          if (("zh_TW".equals(this.kCA)) || ("zh_HK".equals(this.kCA))) {
            paramView = paramView.nyr;
          } else {
            paramView = paramView.nyq;
          }
        }
        paramView = this.mContext.getString(i.j.sns_ad_unlike);
        break label83;
      }
      localObject = this.nKA.nkH.oho.nzw;
      paramView = paramViewGroup;
      if (localObject == null) {
        break label83;
      }
      paramView = paramViewGroup;
      if (paramInt > ((b.a)localObject).list.size()) {
        break label83;
      }
      localObject = (b.b)((b.a)localObject).list.get(paramInt - 1);
      if ("zh_CN".equals(this.kCA)) {
        paramViewGroup = ((b.b)localObject).nzz;
      }
      for (;;)
      {
        paramView = paramViewGroup;
        if (!bi.oW(paramViewGroup)) {
          break;
        }
        paramView = ((b.b)localObject).ntt;
        break;
        if (("zh_TW".equals(this.kCA)) || ("zh_HK".equals(this.kCA))) {
          paramViewGroup = ((b.b)localObject).nzA;
        } else {
          paramViewGroup = ((b.b)localObject).ntt;
        }
      }
      paramViewGroup.setTextColor(Color.parseColor("#576B95"));
      break label120;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */