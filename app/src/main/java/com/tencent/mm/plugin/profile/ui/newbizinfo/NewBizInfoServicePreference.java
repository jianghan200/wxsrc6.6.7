package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.t;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.profile.ui.newbizinfo.c.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class NewBizInfoServicePreference
  extends Preference
{
  MMActivity bGc;
  private TextView fAK;
  ab guS;
  private RecyclerView gxh;
  private boolean iAc = false;
  private ProgressBar lYF;
  a lYU;
  List<com.tencent.mm.plugin.profile.ui.newbizinfo.b.d> lYV;
  com.tencent.mm.plugin.profile.ui.newbizinfo.b.c lYt;
  int state = 0;
  
  public NewBizInfoServicePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.bGc = ((MMActivity)paramContext);
    this.iAc = false;
  }
  
  public NewBizInfoServicePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.bGc = ((MMActivity)paramContext);
    this.iAc = false;
  }
  
  static List<com.tencent.mm.plugin.profile.ui.newbizinfo.b.d> bI(List<com.tencent.mm.plugin.profile.ui.newbizinfo.b.d> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramList == null)
    {
      x.e("MicroMsg.NewBizInfoServicePreference", "serviceInfoList is null, err");
      return localArrayList;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      com.tencent.mm.plugin.profile.ui.newbizinfo.b.d locald1 = (com.tencent.mm.plugin.profile.ui.newbizinfo.b.d)paramList.next();
      if (locald1.type == 0)
      {
        Object localObject = locald1.lZm;
        locald1.lZm = new ArrayList();
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          com.tencent.mm.plugin.profile.ui.newbizinfo.b.d locald2 = (com.tencent.mm.plugin.profile.ui.newbizinfo.b.d)((Iterator)localObject).next();
          if ((locald2.type == 2) || (locald2.type == 5)) {
            locald1.lZm.add(locald2);
          }
        }
        if (locald1.lZm.size() > 0) {
          localArrayList.add(locald1);
        }
      }
      else if (locald1.type == 2)
      {
        localArrayList.add(locald1);
      }
      else if (locald1.type == 5)
      {
        localArrayList.add(locald1);
      }
    }
    return localArrayList;
  }
  
  final void initView()
  {
    if (!this.iAc) {}
    do
    {
      return;
      if (this.state == 1)
      {
        this.gxh.setVisibility(8);
        this.lYF.setVisibility(0);
        this.fAK.setVisibility(8);
        return;
      }
      if (this.state == 2)
      {
        this.fAK.setText(this.bGc.getString(R.l.contact_info_biz_no_service));
        this.fAK.setVisibility(0);
        this.lYF.setVisibility(8);
        this.gxh.setVisibility(8);
        return;
      }
      if (this.state == 3)
      {
        this.gxh.setVisibility(0);
        this.gxh.setAdapter(this.lYU);
        this.fAK.setVisibility(8);
        this.lYF.setVisibility(8);
        return;
      }
    } while (this.state != 4);
    SpannableString localSpannableString = j.a(this.bGc, this.lYt.field_banReason, (int)this.fAK.getTextSize(), 1);
    this.fAK.setText(localSpannableString);
    this.fAK.setVisibility(0);
    this.lYF.setVisibility(8);
    this.gxh.setVisibility(8);
  }
  
  public final void onBindView(View paramView)
  {
    this.gxh = ((RecyclerView)paramView.findViewById(R.h.new_bizinfo_service_list));
    this.gxh.setLayoutManager(new LinearLayoutManager());
    this.fAK = ((TextView)paramView.findViewById(R.h.new_bizinfo_desc_tv));
    this.lYF = ((ProgressBar)paramView.findViewById(R.h.new_bizinfo_loading));
    this.iAc = true;
    initView();
  }
  
  public static final class a
    extends RecyclerView.a<a>
  {
    Context context;
    ab guS;
    List<com.tencent.mm.plugin.profile.ui.newbizinfo.b.d> lYW = new ArrayList();
    
    public a(Context paramContext, List<com.tencent.mm.plugin.profile.ui.newbizinfo.b.d> paramList, ab paramab)
    {
      this.context = paramContext;
      this.lYW = paramList;
      this.guS = paramab;
    }
    
    public final int getItemCount()
    {
      if (this.lYW == null) {
        return 0;
      }
      return this.lYW.size();
    }
    
    final class a
      extends RecyclerView.t
      implements View.OnClickListener
    {
      public TextView eBO;
      public View lYX;
      public com.tencent.mm.plugin.profile.ui.newbizinfo.b.d lYY;
      
      public a(View paramView)
      {
        super();
        this.eBO = ((TextView)paramView.findViewById(R.h.new_bizinfo_service_item_title));
        this.lYX = paramView.findViewById(R.h.new_bizinfo_service_item_line);
        paramView.setOnClickListener(this);
      }
      
      private void a(com.tencent.mm.plugin.profile.ui.newbizinfo.b.d paramd)
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("rawUrl", paramd.value);
        com.tencent.mm.bg.d.b(NewBizInfoServicePreference.a.this.context, "webview", ".ui.tools.WebViewUI", localIntent);
      }
      
      private void b(com.tencent.mm.plugin.profile.ui.newbizinfo.b.d paramd)
      {
        if (bi.oW(paramd.value))
        {
          x.d("MicroMsg.NewBizInfoServicePreference", "jumpToWeApp serviceInfo.id:%s value is null", new Object[] { paramd.id });
          return;
        }
        x.d("MicroMsg.NewBizInfoServicePreference", "jumpToWeApp value:%s", new Object[] { paramd.value });
        try
        {
          paramd = new JSONObject(paramd.value);
          AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
          localAppBrandStatObject.scene = 1102;
          localAppBrandStatObject.bGG = NewBizInfoServicePreference.a.this.guS.field_username;
          ((com.tencent.mm.plugin.appbrand.n.d)g.l(com.tencent.mm.plugin.appbrand.n.d.class)).a(NewBizInfoServicePreference.a.this.context, paramd.optString("userName"), null, 0, 0, paramd.optString("pagePath"), localAppBrandStatObject, null);
          return;
        }
        catch (JSONException paramd) {}
      }
      
      public final void onClick(View paramView)
      {
        if (this.lYY == null)
        {
          x.w("MicroMsg.NewBizInfoServicePreference", "onClick serviceInfo is null, err");
          return;
        }
        com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.bT(NewBizInfoServicePreference.a.this.guS.field_username, 1100);
        x.i("MicroMsg.NewBizInfoServicePreference", "onClick serviceInfo.type:%d", new Object[] { Integer.valueOf(this.lYY.type) });
        switch (this.lYY.type)
        {
        case 1: 
        case 3: 
        case 4: 
        default: 
          return;
        case 0: 
          paramView = this.lYY;
          com.tencent.mm.ui.widget.a.d locald = new com.tencent.mm.ui.widget.a.d(NewBizInfoServicePreference.a.this.context, 1, false);
          locald.ofp = new NewBizInfoServicePreference.a.a.1(this, paramView);
          locald.ofq = new NewBizInfoServicePreference.a.a.2(this, paramView);
          locald.bXO();
          return;
        case 2: 
          a(this.lYY);
          b.a(NewBizInfoServicePreference.a.this.guS.field_username, this.lYY.id, this.lYY.aAL, b.lZq, this.lYY.name, b.dl(NewBizInfoServicePreference.a.this.lYW.indexOf(this.lYY), -1), this.lYY.ceR);
          return;
        }
        b(this.lYY);
        b.a(NewBizInfoServicePreference.a.this.guS.field_username, this.lYY.id, this.lYY.aAL, b.lZq, this.lYY.name, b.dl(NewBizInfoServicePreference.a.this.lYW.indexOf(this.lYY), -1), this.lYY.value);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoServicePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */