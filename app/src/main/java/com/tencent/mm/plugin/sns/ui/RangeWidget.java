package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.base.h;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RangeWidget
  extends RelativeLayout
{
  private View contentView;
  private Activity ftd;
  SnsUploadConfigView nLD;
  private ImageView nLz;
  private TextView nOx;
  private TextView nQM;
  private boolean nQN = true;
  private int nQO = 0;
  String nQP = "";
  private String nQQ = "";
  private String nQR = "";
  public int style = 0;
  
  public RangeWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public RangeWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private static List<String> aE(List<String> paramList)
  {
    LinkedList localLinkedList = new LinkedList();
    g.Ek();
    if (!g.Eg().Dx()) {
      return localLinkedList;
    }
    if (paramList == null) {
      return localLinkedList;
    }
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      g.Ek();
      ab localab = ((i)g.l(i.class)).FR().Yg(str);
      paramList = str;
      if (localab != null)
      {
        paramList = str;
        if ((int)localab.dhP != 0) {
          paramList = localab.BL();
        }
      }
      localLinkedList.add(paramList);
    }
    return localLinkedList;
  }
  
  private void init(Context paramContext)
  {
    this.ftd = ((Activity)paramContext);
    this.contentView = View.inflate(paramContext, getLayoutResource(), this);
    this.nQM = ((TextView)this.contentView.findViewById(i.f.sns_tag_range_list));
    this.nOx = ((TextView)this.contentView.findViewById(i.f.left_tv));
    this.nLz = ((ImageView)this.contentView.findViewById(i.f.rang_icon));
    this.contentView.setOnClickListener(new RangeWidget.1(this));
  }
  
  public boolean a(int paramInt1, int paramInt2, Intent paramIntent, AtContactWidget paramAtContactWidget)
  {
    this.nQO = paramIntent.getIntExtra("Ktag_range_index", 0);
    this.nQQ = paramIntent.getStringExtra("Klabel_name_list");
    this.nQR = paramIntent.getStringExtra("Kother_user_name_list");
    paramInt1 = getMaxTagNameLen();
    Object localObject = "";
    if (!bi.oW(this.nQQ)) {
      localObject = "" + this.nQQ;
    }
    paramIntent = (Intent)localObject;
    if (!bi.oW(this.nQR))
    {
      paramIntent = bi.c(aE(Arrays.asList(this.nQR.split(","))), ",");
      if (((String)localObject).length() <= 0) {
        break label298;
      }
    }
    label298:
    for (paramIntent = (String)localObject + "," + paramIntent;; paramIntent = (String)localObject + paramIntent)
    {
      localObject = paramIntent;
      if (paramInt1 != -1)
      {
        localObject = paramIntent;
        if (paramIntent != null)
        {
          localObject = paramIntent;
          if (paramIntent.length() > paramInt1) {
            localObject = paramIntent.substring(0, paramInt1) + "...";
          }
        }
      }
      paramInt1 = this.nQO;
      if (this.nLz != null)
      {
        this.nLz.setImageResource(i.i.album_group_icon_pressed);
        this.nOx.setTextColor(getResources().getColor(i.c.green_text_color));
        this.nQM.setTextColor(getResources().getColor(i.c.green_text_color));
      }
      if (this.nLD != null) {
        this.nLD.setPrivated(false);
      }
      switch (paramInt1)
      {
      default: 
        return true;
      }
    }
    if (this.nLz != null)
    {
      this.nLz.setImageResource(i.i.album_group_icon_normal);
      this.nOx.setTextColor(getResources().getColor(i.c.normal_text_color));
      this.nQM.setTextColor(getResources().getColor(i.c.hint_text_color));
    }
    this.nQM.setText(i.j.sns_label_public);
    return true;
    if (this.nLD != null) {
      this.nLD.setPrivated(true);
    }
    if ((paramAtContactWidget != null) && (this.nLD != null) && (paramAtContactWidget.getAtList().size() > 0))
    {
      h.i(this.ftd, i.j.sns_tag_privacy_with_others_tip, i.j.app_tip);
      paramAtContactWidget.bBN();
      this.nLD.bEr();
    }
    this.nQM.setText(i.j.sns_label_private);
    return true;
    this.nQM.setText((CharSequence)localObject);
    return true;
    paramIntent = this.nQM;
    paramAtContactWidget = this.ftd.getString(i.j.sns_label_exclide_prefix);
    localObject = paramAtContactWidget + "  " + (String)localObject;
    SpannableString localSpannableString = new SpannableString((CharSequence)localObject);
    localSpannableString.setSpan(new ForegroundColorSpan(-65536), paramAtContactWidget.length() + 2, ((String)localObject).length(), 33);
    paramIntent.setText(localSpannableString);
    return true;
  }
  
  public int getLabelRange()
  {
    return this.nQO;
  }
  
  protected int getLayoutResource()
  {
    return i.g.rang_layout;
  }
  
  protected int getMaxTagNameLen()
  {
    return -1;
  }
  
  public void setEnablePrivate(boolean paramBoolean)
  {
    this.nQN = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/RangeWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */