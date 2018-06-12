package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.bq;
import java.util.ArrayList;

public class ProfileLabelView
  extends ProfileItemView
{
  public TextView lVq;
  public TextView qGq;
  
  public ProfileLabelView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ProfileLabelView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final boolean bnH()
  {
    if (this.qGq != null)
    {
      localObject = this.qGq.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).width = com.tencent.mm.bp.a.ad(getContext(), R.f.FixedTitleWidth);
      this.qGq.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    ArrayList localArrayList;
    if (com.tencent.mm.l.a.gd(this.ipd.field_type))
    {
      if (q.gQ(this.ipd.field_username))
      {
        setVisibility(8);
        return false;
      }
      localObject = this.ipd.field_contactLabelIds;
      localArrayList = (ArrayList)com.tencent.mm.plugin.label.a.a.aYK().FC((String)localObject);
      if ((!bi.oW((String)localObject)) && (localArrayList != null) && (localArrayList.size() > 0))
      {
        this.lVq.setText(j.a(getContext(), bi.c(localArrayList, getContext().getResources().getString(R.l.comma))));
        return true;
      }
      setVisibility(8);
      return false;
    }
    Object localObject = this.ipd.field_encryptUsername;
    if (!bi.oW((String)localObject)) {
      au.HU();
    }
    for (localObject = c.FS().Hh((String)localObject); localObject != null; localObject = c.FS().Hh(this.ipd.field_username))
    {
      localObject = ((bq)localObject).field_contactLabels;
      localArrayList = (ArrayList)com.tencent.mm.plugin.label.a.a.aYK().FB((String)localObject);
      if ((bi.oW((String)localObject)) || (localArrayList == null) || (localArrayList.size() <= 0)) {
        break;
      }
      this.lVq.setText(j.a(getContext(), bi.c(localArrayList, getContext().getResources().getString(R.l.comma))));
      return true;
      au.HU();
    }
    setVisibility(8);
    return false;
  }
  
  public int getLayout()
  {
    return R.i.profile_label_layout;
  }
  
  public final void init()
  {
    this.lVq = ((TextView)findViewById(R.h.contact_info_label));
    this.qGq = ((TextView)findViewById(R.h.contact_info_label_title));
    setClickable(true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/ProfileLabelView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */