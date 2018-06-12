package com.tencent.weui.base.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.mm.bw.a.c;
import com.tencent.mm.bw.a.e;
import com.tencent.mm.bw.a.f;
import com.tencent.mm.bw.a.g;
import com.tencent.mm.ui.ao;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public final class b
  extends BaseAdapter
  implements a
{
  private final Context context;
  private final SharedPreferences duR;
  private final LinkedList<String> tCU = new LinkedList();
  private final HashMap<String, Preference> tCV = new HashMap();
  private final HashSet<String> tCW = new HashSet();
  private final LinkedList<String> tCX = new LinkedList();
  private final HashMap<String, Integer> tCY = new HashMap();
  private final HashMap<String, String> tCZ = new HashMap();
  private int[] tDa = new int[0];
  boolean tDb = false;
  private boolean tDc = false;
  final c vzB;
  Preference.OnPreferenceChangeListener vzC;
  
  public b(Context paramContext, SharedPreferences paramSharedPreferences)
  {
    this.vzB = new c(paramContext);
    this.context = paramContext;
    this.duR = paramSharedPreferences;
  }
  
  private static boolean Ez(int paramInt)
  {
    return (paramInt == a.g.mm_preference) || (paramInt == a.g.mm_preference_summary_below) || (paramInt == a.g.mm_preference_summary_checkbox);
  }
  
  private void a(Preference paramPreference, int paramInt)
  {
    if ((paramPreference.getKey() != null) && (paramPreference.getKey().length() > 0)) {}
    for (String str = paramPreference.getKey();; str = "_anonymous_pref@" + paramPreference.hashCode())
    {
      this.tCV.put(str, paramPreference);
      LinkedList localLinkedList = this.tCU;
      int i = paramInt;
      if (paramInt == -1) {
        i = this.tCU.size();
      }
      localLinkedList.add(i, str);
      if ((!this.tCY.containsKey(b(paramPreference))) && (!this.tDc)) {
        this.tCY.put(b(paramPreference), Integer.valueOf(this.tCY.size()));
      }
      if (paramPreference.getDependency() != null) {
        this.tCZ.put(paramPreference.getDependency() + "|" + paramPreference.getKey(), paramPreference.getKey());
      }
      return;
    }
  }
  
  private static void a(Preference paramPreference, SharedPreferences paramSharedPreferences)
  {
    if ((paramPreference instanceof CheckBoxPreference))
    {
      CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)paramPreference;
      if (localCheckBoxPreference.isPersistent()) {
        localCheckBoxPreference.qpJ = paramSharedPreferences.getBoolean(paramPreference.getKey(), ((CheckBoxPreference)paramPreference).isChecked());
      }
    }
  }
  
  private static String b(Preference paramPreference)
  {
    return paramPreference.getClass().getName() + "L" + paramPreference.getLayoutResource() + "W" + paramPreference.getWidgetLayoutResource();
  }
  
  private void csn()
  {
    HashSet localHashSet = new HashSet();
    int i = 0;
    while (i < this.tCX.size())
    {
      this.tCV.get(this.tCX.get(i));
      if (i != 0) {
        this.tCV.get(this.tCX.get(i - 1));
      }
      i += 1;
    }
    this.tCX.removeAll(localHashSet);
  }
  
  public final void a(Preference paramPreference)
  {
    a(paramPreference, -1);
    if (!this.tDb) {
      notifyDataSetChanged();
    }
  }
  
  public final int getCount()
  {
    return this.tCX.size();
  }
  
  public final Object getItem(int paramInt)
  {
    return this.tCV.get(this.tCX.get(paramInt));
  }
  
  public final long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public final int getItemViewType(int paramInt)
  {
    if (paramInt > this.tCX.size()) {
      return -1;
    }
    Object localObject = (Preference)this.tCV.get(this.tCX.get(paramInt));
    localObject = (Integer)this.tCY.get(b((Preference)localObject));
    if (localObject == null) {
      return -1;
    }
    return ((Integer)localObject).intValue();
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramInt > this.tCX.size()) {}
    Object localObject;
    int i6;
    View localView;
    do
    {
      return paramView;
      localObject = (Preference)this.tCV.get(this.tCX.get(paramInt));
      if ((localObject instanceof CheckBoxPreference)) {
        ((Preference)localObject).setOnPreferenceChangeListener(this.vzC);
      }
      if (!this.tCY.containsKey(b((Preference)localObject))) {
        paramView = null;
      }
      paramViewGroup = ((Preference)localObject).getView(paramView, paramViewGroup);
      i6 = this.tDa[paramInt];
      localObject = paramViewGroup.findViewById(a.f.content);
      if (localObject == null)
      {
        ao.s("find content view error", new Object[0]);
        return paramViewGroup;
      }
      localView = paramViewGroup.findViewById(16908312);
      paramView = paramViewGroup;
    } while ((i6 & 0x4) != 0);
    int j = 0;
    int k = ((View)localObject).getPaddingLeft();
    int m = ((View)localObject).getPaddingRight();
    int n = ((View)localObject).getPaddingTop();
    int i1 = ((View)localObject).getPaddingBottom();
    int i = a.e.settings_line;
    int i2 = paramViewGroup.getPaddingLeft();
    int i3 = paramViewGroup.getPaddingRight();
    int i4 = paramViewGroup.getPaddingTop();
    int i5 = paramViewGroup.getPaddingBottom();
    if ((i6 & 0x8) != 0) {
      if ((paramInt == this.tCX.size() - 1) || ((paramInt == this.tCX.size() - 2) && ((getItem(this.tCX.size() - 1) instanceof PreferenceCategory))))
      {
        paramInt = a.e.mm_trans;
        j = a.c.white;
        i = paramInt;
        paramInt = j;
      }
    }
    for (;;)
    {
      ((View)localObject).setBackgroundResource(i);
      ((View)localObject).setPadding(k, n, m, i1);
      if (localView != null) {
        localView.setBackgroundResource(i);
      }
      paramViewGroup.setBackgroundResource(paramInt);
      paramViewGroup.setPadding(i2, i4, i3, i5);
      return paramViewGroup;
      if ((i6 & 0x2) != 0)
      {
        paramInt = a.e.mm_trans;
        break;
      }
      paramInt = a.e.list_item_normal;
      break;
      if (((i6 & 0x10) != 0) || ((i6 & 0x2) == 0))
      {
        j = a.e.list_item_normal;
        paramInt = i;
        i = j;
      }
      else
      {
        paramInt = i;
        i = j;
      }
    }
  }
  
  public final int getViewTypeCount()
  {
    if (!this.tDc) {
      this.tDc = true;
    }
    return Math.max(1, this.tCY.size());
  }
  
  public final void notifyDataSetChanged()
  {
    int i = 0;
    this.tCX.clear();
    Object localObject = this.tCU.iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      if (!this.tCW.contains(str)) {
        if (this.tCV.get(str) == null) {
          ao.v("not found pref by key " + str, new Object[0]);
        } else {
          this.tCX.add(str);
        }
      }
    }
    if ((!this.tCX.isEmpty()) && (Ez(((Preference)this.tCV.get(this.tCX.get(0))).getLayoutResource()))) {
      a(new PreferenceSmallCategory(this.context), 0);
    }
    csn();
    this.tDa = new int[this.tCX.size()];
    if (this.tDa.length <= 0) {
      return;
    }
    if (this.tDa.length == 1)
    {
      i = ((Preference)this.tCV.get(this.tCX.get(0))).getLayoutResource();
      localObject = (Preference)this.tCV.get(this.tCX.get(0));
      if (Ez(i)) {
        if ((localObject instanceof CheckBoxPreference))
        {
          localObject = this.tDa;
          localObject[0] |= 0x8;
        }
      }
      for (;;)
      {
        a((Preference)this.tCV.get(this.tCX.get(0)), this.duR);
        super.notifyDataSetChanged();
        return;
        this.tDa[0] = 3;
        continue;
        this.tDa[0] = 4;
      }
    }
    if (i < this.tCX.size())
    {
      a((Preference)this.tCV.get(this.tCX.get(i)), this.duR);
      localObject = (Preference)this.tCV.get(this.tCX.get(i));
      int j = ((Preference)localObject).getLayoutResource();
      if (Ez(j)) {
        if ((localObject instanceof CheckBoxPreference))
        {
          localObject = this.tDa;
          localObject[i] |= 0x8;
        }
      }
      for (;;)
      {
        i += 1;
        break;
        if (i == 0)
        {
          localObject = this.tDa;
          localObject[i] |= 0x1;
        }
        else
        {
          if (i == this.tCX.size() - 1)
          {
            localObject = this.tDa;
            localObject[i] |= 0x2;
          }
          j = ((Preference)this.tCV.get(this.tCX.get(i - 1))).getLayoutResource();
          if ((j != a.g.mm_preference) || (j == a.g.mm_preference_summary_below) || (j == a.g.mm_preference_summary_checkbox))
          {
            localObject = this.tDa;
            localObject[i] |= 0x1;
            continue;
            if (j == a.g.mm_preference_info)
            {
              if (i == 0)
              {
                localObject = this.tDa;
                localObject[i] |= 0x4;
              }
              else
              {
                localObject = this.tDa;
                localObject[i] |= 0x10;
                j = ((Preference)this.tCV.get(this.tCX.get(i - 1))).getLayoutResource();
                if ((j == a.g.mm_preference) || (j == a.g.mm_preference_summary_below) || (j == a.g.mm_preference_summary_checkbox))
                {
                  localObject = this.tDa;
                  j = i - 1;
                  localObject[j] |= 0x2;
                }
              }
            }
            else
            {
              localObject = this.tDa;
              localObject[i] |= 0x4;
              if (i != 0)
              {
                j = ((Preference)this.tCV.get(this.tCX.get(i - 1))).getLayoutResource();
                if ((Ez(j)) || (j == a.g.mm_preference_info))
                {
                  localObject = this.tDa;
                  j = i - 1;
                  localObject[j] |= 0x2;
                }
              }
            }
          }
        }
      }
    }
    super.notifyDataSetChanged();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/weui/base/preference/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */