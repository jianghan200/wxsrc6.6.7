package com.tencent.mm.plugin.ipcall.ui;

import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.List;

public final class f
  extends BaseAdapter
{
  private String eIQ;
  private List<a> kuM = new ArrayList();
  private IPCallCountryCodeSelectUI kuN;
  int[] kuO;
  boolean kuP = false;
  boolean kuQ = false;
  private List<a> list;
  
  public f(IPCallCountryCodeSelectUI paramIPCallCountryCodeSelectUI, List<a> paramList)
  {
    this.kuN = paramIPCallCountryCodeSelectUI;
    this.list = paramList;
    aYg();
    aYh();
  }
  
  private void aYg()
  {
    int i = 0;
    int j = this.list.size();
    while (i < j)
    {
      this.kuM.add(this.list.get(i));
      i += 1;
    }
    this.kuN.kuE.setVisibility(8);
  }
  
  private void aYh()
  {
    this.kuO = new int[this.list.size()];
    int j = this.list.size();
    int i = 0;
    while (i < j)
    {
      this.kuO[i] = ((a)this.list.get(i)).aXZ();
      i += 1;
    }
  }
  
  private static String rB(int paramInt)
  {
    char c = (char)paramInt;
    String[] arrayOfString = IPCallCountryCodeScrollbar.kuT;
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      if (arrayOfString[i].equals(String.valueOf((char)paramInt))) {
        return String.valueOf(c);
      }
      i += 1;
    }
    return "#";
  }
  
  public final int getCount()
  {
    return this.list.size();
  }
  
  public final Object getItem(int paramInt)
  {
    return this.list.get(paramInt);
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject = (a)getItem(paramInt);
    int i;
    if (paramView == null)
    {
      paramView = View.inflate(this.kuN, R.i.ip_call_country_list_item, null);
      paramViewGroup = new a();
      paramViewGroup.kuR = ((TextView)paramView.findViewById(R.h.contactitem_catalog));
      paramViewGroup.eMf = ((TextView)paramView.findViewById(R.h.contactitem_nick));
      paramViewGroup.kuS = ((TextView)paramView.findViewById(R.h.contactitem_signature));
      paramView.setTag(paramViewGroup);
      if (paramInt <= 0) {
        break label228;
      }
      i = this.kuO[(paramInt - 1)];
      label95:
      if (paramInt != 0) {
        break label253;
      }
      paramViewGroup.kuR.setVisibility(0);
      if (!this.kuQ) {
        break label234;
      }
      paramViewGroup.kuR.setText(R.l.popular_country_header);
      label124:
      if (bi.oW(this.eIQ)) {
        break label307;
      }
      Spannable localSpannable = com.tencent.mm.plugin.fts.a.f.a(((a)localObject).dYy, this.eIQ);
      paramViewGroup.eMf.setText(localSpannable);
      localObject = com.tencent.mm.plugin.fts.a.f.a(" (+" + ((a)localObject).countryCode + ")", this.eIQ);
      paramViewGroup.kuS.setText((CharSequence)localObject);
    }
    for (;;)
    {
      if (!this.kuP) {
        break label354;
      }
      paramViewGroup.kuS.setVisibility(0);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label228:
      i = -1;
      break label95;
      label234:
      paramViewGroup.kuR.setText(rB(this.kuO[paramInt]));
      break label124;
      label253:
      if ((paramInt > 0) && (this.kuO[paramInt] != i))
      {
        paramViewGroup.kuR.setVisibility(0);
        paramViewGroup.kuR.setText(rB(this.kuO[paramInt]));
        break label124;
      }
      paramViewGroup.kuR.setVisibility(8);
      break label124;
      label307:
      paramViewGroup.eMf.setText(((a)localObject).dYy);
      paramViewGroup.kuS.setText(" (+" + ((a)localObject).countryCode + ")");
    }
    label354:
    paramViewGroup.kuS.setVisibility(4);
    return paramView;
  }
  
  public final void pi(String paramString)
  {
    if (paramString != null)
    {
      this.eIQ = paramString.trim();
      this.list.clear();
      int j = this.kuM.size();
      int i = 0;
      while (i < j)
      {
        if ((((a)this.kuM.get(i)).dYy.toUpperCase().contains(this.eIQ.toUpperCase())) || (((a)this.kuM.get(i)).dYz.toUpperCase().contains(this.eIQ.toUpperCase())) || (((a)this.kuM.get(i)).countryCode.contains(this.eIQ))) {
          this.list.add(this.kuM.get(i));
        }
        i += 1;
      }
      aYh();
      if (this.list.size() != 0) {
        break label187;
      }
      this.kuN.kuE.setVisibility(0);
    }
    for (;;)
    {
      super.notifyDataSetChanged();
      return;
      label187:
      this.kuN.kuE.setVisibility(8);
    }
  }
  
  static final class a
  {
    TextView eMf;
    TextView kuR;
    TextView kuS;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */