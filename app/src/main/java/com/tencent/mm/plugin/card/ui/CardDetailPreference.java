package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.a;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.a.h;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.widget.CardTextPreference;
import com.tencent.mm.protocal.c.kx;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CardDetailPreference
  extends MMPreference
{
  private final String TAG = "MicroMsg.CardDetailPreference";
  f gua;
  private TextView hBA;
  private com.tencent.mm.plugin.card.base.b htQ;
  private List<com.tencent.mm.plugin.card.model.b> htU = new ArrayList();
  
  private void ayd()
  {
    int i = 0;
    while (i < this.htU.size())
    {
      com.tencent.mm.plugin.card.model.b localb = (com.tencent.mm.plugin.card.model.b)this.htU.get(i);
      Preference localPreference = new Preference(this);
      localPreference.setLayoutResource(a.e.mm_preference);
      localPreference.setKey(localb.title);
      localPreference.setTitle(localb.title);
      if (!TextUtils.isEmpty(localb.huX)) {
        localPreference.setSummary(localb.huX);
      }
      if (localb.hvi) {
        ayf();
      }
      this.gua.a(localPreference);
      i += 1;
    }
  }
  
  private void aye()
  {
    if ((this.htQ.awm().rnH != null) && (this.htQ.awm().rnH != null))
    {
      int i = 0;
      while (i < this.htQ.awm().rnH.size())
      {
        pr localpr = (pr)this.htQ.awm().rnH.get(i);
        if (!TextUtils.isEmpty(localpr.huX))
        {
          CardTextPreference localCardTextPreference = new CardTextPreference(this);
          localCardTextPreference.setLayoutResource(a.e.mm_preference);
          localCardTextPreference.setTitle(localpr.huX);
          localCardTextPreference.azW();
          xG(localpr.title);
          this.gua.a(localCardTextPreference);
        }
        i += 1;
      }
      ayf();
    }
  }
  
  private void ayf()
  {
    PreferenceSmallCategory localPreferenceSmallCategory = new PreferenceSmallCategory(this);
    this.gua.a(localPreferenceSmallCategory);
  }
  
  private void xG(String paramString)
  {
    PreferenceTitleCategory localPreferenceTitleCategory = new PreferenceTitleCategory(this);
    if (TextUtils.isEmpty(paramString)) {
      localPreferenceTitleCategory.setTitle(" ");
    }
    for (;;)
    {
      this.gua.a(localPreferenceTitleCategory);
      return;
      localPreferenceTitleCategory.setTitle(paramString);
    }
  }
  
  public final int Ys()
  {
    return a.h.card_pref;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if (paramPreference.mKey.equals("card_phone"))
    {
      paramf = this.htQ.awm().rnF;
      Intent localIntent = new Intent("android.intent.action.DIAL");
      localIntent.setFlags(268435456);
      localIntent.setData(Uri.parse("tel:" + paramf));
      startActivity(localIntent);
    }
    if (paramPreference.mKey.equals("key_pic_detail")) {
      com.tencent.mm.plugin.card.d.b.a(this, this.htQ.awm().rnI, 0);
    }
    label207:
    for (;;)
    {
      return false;
      int i = 0;
      for (;;)
      {
        if (i >= this.htU.size()) {
          break label207;
        }
        paramf = (com.tencent.mm.plugin.card.model.b)this.htU.get(i);
        if ((paramf.title != null) && (paramf.title.equals(paramPreference.mKey)) && (!TextUtils.isEmpty(paramf.url)))
        {
          if (com.tencent.mm.plugin.card.d.b.e(this.htQ.awq(), paramf.rnv, paramf.rnw, 1028, 0)) {
            break;
          }
          com.tencent.mm.plugin.card.d.b.a(this, paramf.url, 1);
        }
        i += 1;
      }
    }
  }
  
  public final View ayg()
  {
    View localView = getLayoutInflater().inflate(a.e.source_layout, null);
    this.hBA = ((TextView)localView.findViewById(a.d.source));
    this.hBA.setVisibility(8);
    return localView;
  }
  
  protected final void initView()
  {
    this.htQ = ((com.tencent.mm.plugin.card.base.b)getIntent().getParcelableExtra("key_card_info_data"));
    if ((this.htQ == null) || (this.htQ.awm() == null) || (this.htQ.awn() == null))
    {
      x.e("MicroMsg.CardDetailPreference", "mCardInfo == null or mCardInfo.getCardTpInfo() == null or mCardInfo.getDataInfo() == null");
      finish();
    }
    do
    {
      return;
      Object localObject = new StringBuilder();
      if (!TextUtils.isEmpty(this.htQ.awm().hwg)) {
        ((StringBuilder)localObject).append(this.htQ.awm().hwg);
      }
      ((StringBuilder)localObject).append(getString(a.g.card_detail_info));
      setMMTitle(((StringBuilder)localObject).toString());
      setBackBtn(new CardDetailPreference.1(this));
      this.gua = this.tCL;
      this.htU.clear();
      if ((this.htQ.awn().rmY != null) && (this.htQ.awn().rmY.size() > 0)) {
        this.htU.addAll(l.az(this.htQ.awn().rmY));
      }
      if ((this.htQ.awn().rmZ != null) && (this.htQ.awn().rmZ.size() > 0))
      {
        localObject = l.az(this.htQ.awn().rmZ);
        ((com.tencent.mm.plugin.card.model.b)((List)localObject).get(0)).hvi = true;
        this.htU.addAll((Collection)localObject);
      }
      ayf();
      aye();
      ayd();
      if (!TextUtils.isEmpty(this.htQ.awm().rnI))
      {
        localObject = new CardTextPreference(this);
        ((CardTextPreference)localObject).setLayoutResource(a.e.mm_preference);
        ((CardTextPreference)localObject).setTitle(getString(a.g.card_picture_detail));
        ((CardTextPreference)localObject).setKey("key_pic_detail");
        ((CardTextPreference)localObject).azW();
        ayf();
        this.gua.a((Preference)localObject);
      }
      if (!TextUtils.isEmpty(this.htQ.awm().rnF))
      {
        ayf();
        localObject = new CardTextPreference(this);
        ((CardTextPreference)localObject).setLayoutResource(a.e.mm_preference);
        ((CardTextPreference)localObject).setKey("card_phone");
        ((CardTextPreference)localObject).setTitle(a.g.card_mall_product_seller);
        ((CardTextPreference)localObject).setSummary(this.htQ.awm().rnF);
        ((CardTextPreference)localObject).hIZ = getResources().getColor(a.a.link_color);
        ((CardTextPreference)localObject).azV();
        this.gua.a((Preference)localObject);
        xG("");
      }
    } while ((this.htQ.awm() == null) || (TextUtils.isEmpty(this.htQ.awm().bhd)) || (this.hBA == null));
    this.hBA.setText(this.htQ.awm().bhd);
    this.hBA.setVisibility(0);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardDetailPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */