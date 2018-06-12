package com.tencent.mm.plugin.product.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class a
  extends BaseAdapter
{
  private Context lSg;
  private List<com.tencent.mm.plugin.product.c.a> lSh;
  private List<Boolean> lSi;
  private int lSj = 1;
  
  public a(Context paramContext)
  {
    this.lSg = paramContext;
  }
  
  private com.tencent.mm.plugin.product.c.a uy(int paramInt)
  {
    return (com.tencent.mm.plugin.product.c.a)this.lSh.get(paramInt);
  }
  
  public final void a(Activity paramActivity, View paramView, int paramInt)
  {
    paramView = (b)paramView.getTag();
    x.i("MicroMsg.MallCustomActionAdapter", "onItemClick holder.type" + paramView.type);
    x.i("MicroMsg.MallCustomActionAdapter", "onItemClick holder.content" + paramView.lSn);
    switch (paramView.type)
    {
    case 3: 
    default: 
      x.w("MicroMsg.MallCustomActionAdapter", "not support type");
    case 0: 
    case 1: 
    case 2: 
    case 4: 
    case 6: 
      do
      {
        do
        {
          do
          {
            return;
          } while (!(paramView.lSn instanceof String));
          paramActivity = new Intent();
          paramActivity.putExtra("rawUrl", (String)paramView.lSn);
          paramActivity.putExtra("showShare", false);
          d.b(this.lSg, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramActivity, 10000);
          return;
        } while (!(paramView.lSn instanceof ArrayList));
        paramView = (ArrayList)paramView.lSn;
        localObject = new Intent(paramActivity, MallGalleryUI.class);
        ((Intent)localObject).putExtra("keys_img_urls", paramView);
        paramActivity.startActivity((Intent)localObject);
        return;
      } while (!(paramView.lSn instanceof String));
      Object localObject = (String)paramView.lSn;
      Intent localIntent = new Intent();
      localIntent.putExtra("title", paramView.title);
      localIntent.putExtra("neverGetA8Key", false);
      localIntent.putExtra("showShare", false);
      localIntent.putExtra("show_bottom", false);
      localIntent.putExtra("data", (String)localObject);
      localIntent.putExtra("QRDataFlag", false);
      d.b(paramActivity, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
      return;
    }
    if (((Boolean)this.lSi.get(paramInt)).booleanValue()) {
      this.lSi.set(paramInt, Boolean.valueOf(false));
    }
    for (;;)
    {
      notifyDataSetChanged();
      return;
      this.lSi.set(paramInt, Boolean.valueOf(true));
    }
  }
  
  public final void bG(List<com.tencent.mm.plugin.product.c.a> paramList)
  {
    this.lSh = paramList;
    this.lSj = 0;
    this.lSi = new ArrayList();
    if (this.lSh != null)
    {
      HashSet localHashSet = new HashSet();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.product.c.a locala = (com.tencent.mm.plugin.product.c.a)localIterator.next();
        this.lSi.add(Boolean.valueOf(false));
        localHashSet.add(Integer.valueOf(locala.hcE));
      }
      this.lSj = paramList.size();
    }
    if (this.lSj <= 0) {
      this.lSj = 1;
    }
  }
  
  public final int getCount()
  {
    if (this.lSh != null) {
      return this.lSh.size();
    }
    return 0;
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final int getItemViewType(int paramInt)
  {
    return uy(paramInt).hcE;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    com.tencent.mm.plugin.product.c.a locala;
    if (paramView == null)
    {
      paramView = View.inflate(this.lSg, a.g.product_item_view, null);
      paramViewGroup = new b();
      paramViewGroup.gsY = ((TextView)paramView.findViewById(a.f.title_tv));
      paramViewGroup.lSk = ((TextView)paramView.findViewById(a.f.summary_tv));
      paramViewGroup.lSl = ((ImageView)paramView.findViewById(a.f.indecator_iv));
      paramViewGroup.lSm = ((HtmlTextView)paramView.findViewById(a.f.detail_htv));
      paramView.setTag(paramViewGroup);
      locala = uy(paramInt);
      if (locala != null)
      {
        paramViewGroup.gsY.setText(locala.jPe);
        paramViewGroup.lSk.setText(locala.lRx);
        paramViewGroup.type = locala.hcE;
        paramViewGroup.lSn = locala.jSA;
        paramViewGroup.title = locala.jPe;
        switch (locala.hcE)
        {
        }
      }
    }
    for (;;)
    {
      return paramView;
      paramViewGroup = (b)paramView.getTag();
      break;
      paramViewGroup.lSl.setVisibility(8);
      return paramView;
      if (((Boolean)this.lSi.get(paramInt)).booleanValue()) {
        paramViewGroup.lSm.setVisibility(0);
      }
      while (!paramViewGroup.lSm.getText().equals(locala.jSA))
      {
        paramViewGroup.lSm.setText(locala.jSA);
        return paramView;
        paramViewGroup.lSm.setVisibility(8);
      }
    }
  }
  
  public final int getViewTypeCount()
  {
    return this.lSj;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/product/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */