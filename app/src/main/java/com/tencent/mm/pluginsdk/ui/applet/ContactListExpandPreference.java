package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.plugin.comm.a.c;
import com.tencent.mm.plugin.comm.a.e;
import com.tencent.mm.plugin.comm.a.f;
import com.tencent.mm.pluginsdk.ui.d;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.ArrayList;
import java.util.List;

public class ContactListExpandPreference
  extends Preference
{
  public i qJA;
  public k qJB;
  private int qJz = -1;
  
  public ContactListExpandPreference(Context paramContext, int paramInt)
  {
    super(paramContext);
    if (paramInt == 0) {
      cdT();
    }
    for (;;)
    {
      setLayoutResource(a.f.mm_preference_contact_list_row);
      return;
      if (paramInt == 1)
      {
        this.qJz = 1;
        this.qJB = new k();
      }
    }
  }
  
  public ContactListExpandPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    cdT();
    setLayoutResource(a.f.mm_preference_contact_list_row);
  }
  
  public ContactListExpandPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    cdT();
    setLayoutResource(a.f.mm_preference_contact_list_row);
  }
  
  private void cdT()
  {
    this.qJz = 0;
    this.qJA = new i(this.mContext);
  }
  
  public final boolean Cb(int paramInt)
  {
    if (this.qJA != null) {
      return this.qJA.qIM.Cb(paramInt);
    }
    return false;
  }
  
  public final String Cc(int paramInt)
  {
    if ((this.qJA != null) && (this.qJA.qIM.Cb(paramInt))) {
      return ((ab)this.qJA.qIM.getItem(paramInt)).field_username;
    }
    return "";
  }
  
  public final String Cd(int paramInt)
  {
    if ((this.qJA != null) && (this.qJA.qIM.Cb(paramInt))) {
      return ((ab)this.qJA.qIM.getItem(paramInt)).field_nickname;
    }
    return "";
  }
  
  public final String Ce(int paramInt)
  {
    if ((this.qJA != null) && (this.qJA.qIM.Cb(paramInt))) {
      return ((ab)this.qJA.qIM.getItem(paramInt)).field_conRemark;
    }
    return "";
  }
  
  public final void TL(String paramString)
  {
    if (this.qJA != null) {
      this.qJA.qIM.qJo = paramString;
    }
  }
  
  public final void a(a parama)
  {
    if (this.qJA != null) {
      this.qJA.opw = parama;
    }
  }
  
  public final void a(k.b paramb)
  {
    if (this.qJA != null) {
      this.qJA.qIN = paramb;
    }
  }
  
  public final void a(d paramd)
  {
    if (this.qJA != null) {
      this.qJA.qIM.qJh = paramd;
    }
  }
  
  public final void a(f paramf, String paramString)
  {
    i locali;
    if (this.qJA != null)
    {
      locali = this.qJA;
      if ((paramf != null) && (paramString != null)) {}
    }
    else
    {
      return;
    }
    locali.eOE = paramf;
    locali.qII = paramString;
    paramf.bw(paramString, true);
  }
  
  public final void aa(ArrayList<ab> paramArrayList)
  {
    if (this.qJA != null)
    {
      i locali = this.qJA;
      locali.qIM.Z(paramArrayList);
      locali.FX(null);
    }
  }
  
  public final void bt(List<String> paramList)
  {
    if (this.qJA != null)
    {
      j localj = this.qJA.qIM;
      localj.co(paramList);
      localj.notifyChanged();
    }
  }
  
  public final void cdU()
  {
    if (this.qJA != null) {
      this.qJA.qIM.qJt = false;
    }
  }
  
  public final void cdV()
  {
    if (this.qJA != null)
    {
      j localj = this.qJA.qIM;
      localj.hNA = false;
      localj.notifyChanged();
    }
  }
  
  public final ContactListExpandPreference cdW()
  {
    if (this.qJA != null) {
      this.qJA.qIM.qJk = false;
    }
    return this;
  }
  
  public final void cdX()
  {
    boolean bool = false;
    if (this.qJA != null)
    {
      i locali = this.qJA;
      locali.qIK = false;
      if (locali.qIK) {
        bool = true;
      }
      locali.qIL = bool;
    }
  }
  
  public final Object getItem(int paramInt)
  {
    if ((this.qJA != null) && (this.qJA.qIM.Cb(paramInt))) {
      return this.qJA.qIM.getItem(paramInt);
    }
    return null;
  }
  
  public final ContactListExpandPreference kG(boolean paramBoolean)
  {
    if (this.qJA != null) {
      this.qJA.qIM.qJj = paramBoolean;
    }
    return this;
  }
  
  public final ContactListExpandPreference kH(boolean paramBoolean)
  {
    if (this.qJA != null) {
      this.qJA.qIM.qJi = paramBoolean;
    }
    return this;
  }
  
  public final void notifyChanged()
  {
    if (this.qJA != null) {
      this.qJA.bpx();
    }
  }
  
  public final void onBindView(View paramView)
  {
    ViewGroup localViewGroup;
    if (this.qJz == 1)
    {
      k localk = this.qJB;
      if (paramView.getId() == a.e.contact_list_content_layout)
      {
        localViewGroup = (ViewGroup)paramView;
        if (localk.row != 0) {
          break label235;
        }
        localViewGroup.setPadding(localViewGroup.getPaddingLeft(), localViewGroup.getResources().getDimensionPixelSize(a.c.ListPadding), localViewGroup.getPaddingRight(), localViewGroup.getResources().getDimensionPixelSize(a.c.MiddlePadding));
        label75:
        if (((localk.qIM.qJg % j.qIW != j.qIW - 1) && (localk.qIM.qJg % j.qIW != 0)) || (!localk.hLy) || (localk.row != localk.qIM.getCount() / j.qIW - 1)) {
          break label331;
        }
        localViewGroup.setPadding(localViewGroup.getPaddingLeft(), localViewGroup.getPaddingTop(), localViewGroup.getPaddingRight(), 0);
      }
      for (;;)
      {
        label161:
        if (localk.qIM != null)
        {
          localViewGroup.setOnClickListener(localk.mtE);
          int j;
          if (localViewGroup.getChildCount() > j.qIW)
          {
            j = localViewGroup.getChildCount();
            i = 0;
            for (;;)
            {
              if (i < j - j.qIW)
              {
                localViewGroup.removeViewAt(i);
                i += 1;
                continue;
                localViewGroup = (ViewGroup)paramView.findViewById(a.e.contact_list_content_layout);
                break;
                label235:
                if (localk.row == localk.qIM.getCount() / j.qIW - 1)
                {
                  localViewGroup.setPadding(localViewGroup.getPaddingLeft(), localViewGroup.getPaddingTop(), localViewGroup.getPaddingRight(), localViewGroup.getResources().getDimensionPixelSize(a.c.ListPadding));
                  break label75;
                }
                localViewGroup.setPadding(localViewGroup.getPaddingLeft(), localViewGroup.getResources().getDimensionPixelSize(a.c.MiddlePadding), localViewGroup.getPaddingRight(), localViewGroup.getResources().getDimensionPixelSize(a.c.MiddlePadding));
                break label75;
                label331:
                if ((localk.hLy) || (localk.qIM.qJg % j.qIW != 0) || (localk.row != localk.qIM.getCount() / j.qIW - 1)) {
                  break label161;
                }
                localViewGroup.setPadding(localViewGroup.getPaddingLeft(), localViewGroup.getPaddingTop(), localViewGroup.getPaddingRight(), (int)localViewGroup.getContext().getResources().getDimension(a.c.SmallPadding));
                break label161;
              }
            }
            localViewGroup.requestLayout();
          }
          int i = 0;
          if (i < localk.qJC)
          {
            View localView;
            label460:
            LinearLayout.LayoutParams localLayoutParams;
            if (localViewGroup.getChildAt(i) == null)
            {
              localView = View.inflate(localViewGroup.getContext(), a.f.roominfo_contact, null);
              localViewGroup.addView(localView);
              localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
              if (j.qIW != 4) {
                break label648;
              }
              j = localViewGroup.getResources().getDimensionPixelSize(a.c.NormalPadding);
              localLayoutParams.setMargins(j, 0, j, 0);
            }
            for (;;)
            {
              if ((!localk.qIM.cdR()) && (localk.qIM.qJg == 1))
              {
                j = localViewGroup.getResources().getDimensionPixelSize(a.c.BiggerPadding);
                localLayoutParams.setMargins(j, 0, j, 0);
              }
              localView.setLayoutParams(localLayoutParams);
              j = localk.row * localk.qJC + i;
              localk.qIM.getView(j, localView, localViewGroup);
              if (localk.qIS != null) {
                localView.setOnClickListener(new k.3(localk, localViewGroup, j));
              }
              if (localk.qJD != null) {
                localView.setOnLongClickListener(new k.4(localk, localViewGroup, j));
              }
              i += 1;
              break;
              localView = localViewGroup.getChildAt(i);
              break label460;
              label648:
              j = localViewGroup.getResources().getDimensionPixelSize(a.c.MiddlePadding);
              localLayoutParams.setMargins(j, 0, j, 0);
            }
          }
          if ((!localk.qIM.cdR()) && (localk.qIM.qJg <= 1)) {
            break label711;
          }
          ((LinearLayout)localViewGroup).setGravity(17);
        }
      }
    }
    for (;;)
    {
      super.onBindView(paramView);
      return;
      label711:
      ((LinearLayout)localViewGroup).setGravity(19);
    }
  }
  
  public final void p(String paramString, List<String> paramList)
  {
    if (this.qJA != null)
    {
      i locali = this.qJA;
      locali.username = paramString;
      Object localObject = paramList;
      if (paramList == null) {
        localObject = new ArrayList(0);
      }
      locali.qIM.co((List)localObject);
      locali.FX(paramString);
    }
  }
  
  public final void refresh()
  {
    if (this.qJA != null) {
      this.qJA.qIM.notifyChanged();
    }
  }
  
  public static abstract interface a
  {
    public abstract void aAK();
    
    public abstract void of(int paramInt);
    
    public abstract void og(int paramInt);
    
    public abstract void oh(int paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/applet/ContactListExpandPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */