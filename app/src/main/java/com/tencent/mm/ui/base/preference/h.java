package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.w.a.d;
import com.tencent.mm.w.a.f;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class h
  extends BaseAdapter
  implements f
{
  private final Context context;
  private final SharedPreferences duR;
  private Preference.a tBK;
  private final j tCT;
  private final LinkedList<String> tCU = new LinkedList();
  private final HashMap<String, Preference> tCV = new HashMap();
  private final HashSet<String> tCW = new HashSet();
  private final LinkedList<String> tCX = new LinkedList();
  private final HashMap<String, Integer> tCY = new HashMap();
  private final HashMap<String, String> tCZ = new HashMap();
  private int[] tDa = new int[0];
  private boolean tDb = false;
  private boolean tDc = false;
  
  public h(Context paramContext, SharedPreferences paramSharedPreferences)
  {
    this.tCT = new j(paramContext);
    this.context = paramContext;
    this.duR = paramSharedPreferences;
  }
  
  private static boolean Ez(int paramInt)
  {
    return (paramInt == a.h.mm_preference) || (paramInt == a.h.mm_preference_summary_below) || (paramInt == a.h.mm_preference_summary_checkbox);
  }
  
  private static void a(Preference paramPreference, SharedPreferences paramSharedPreferences)
  {
    Object localObject;
    if ((paramPreference instanceof CheckBoxPreference))
    {
      localObject = (CheckBoxPreference)paramPreference;
      if (((Preference)localObject).tDr) {
        ((CheckBoxPreference)localObject).qpJ = paramSharedPreferences.getBoolean(paramPreference.mKey, ((CheckBoxPreference)paramPreference).isChecked());
      }
    }
    if ((paramPreference instanceof DialogPreference))
    {
      localObject = (DialogPreference)paramPreference;
      if (((Preference)localObject).tDr) {
        ((DialogPreference)localObject).setValue(paramSharedPreferences.getString(paramPreference.mKey, null));
      }
    }
    if ((paramPreference instanceof EditPreference))
    {
      localObject = (EditPreference)paramPreference;
      if (((Preference)localObject).tDr)
      {
        ((EditPreference)localObject).value = paramSharedPreferences.getString(paramPreference.mKey, null);
        ((EditPreference)localObject).setSummary(((EditPreference)localObject).value);
      }
    }
  }
  
  private void b(Preference paramPreference, int paramInt)
  {
    String str = e(paramPreference);
    this.tCV.put(str, paramPreference);
    LinkedList localLinkedList = this.tCU;
    int i = paramInt;
    if (paramInt == -1) {
      i = this.tCU.size();
    }
    localLinkedList.add(i, str);
    if ((!this.tCY.containsKey(d(paramPreference))) && (!this.tDc)) {
      this.tCY.put(d(paramPreference), Integer.valueOf(this.tCY.size()));
    }
    if (paramPreference.tDs != null) {
      this.tCZ.put(paramPreference.tDs + "|" + paramPreference.mKey, paramPreference.mKey);
    }
  }
  
  private void csn()
  {
    HashSet localHashSet = new HashSet();
    int i = 0;
    if (i < this.tCX.size())
    {
      Preference localPreference1 = (Preference)this.tCV.get(this.tCX.get(i));
      if (((localPreference1 instanceof PreferenceCategory)) && (bi.oW(localPreference1.mKey)) && (i != 0))
      {
        Preference localPreference2 = (Preference)this.tCV.get(this.tCX.get(i - 1));
        if ((localPreference2 instanceof PreferenceCategory))
        {
          if ((!bi.oW(localPreference2.mKey)) || ((localPreference2.getTitle() != null) && (localPreference2.getTitle().toString().trim().length() > 0))) {
            break label148;
          }
          localHashSet.add(e(localPreference2));
        }
      }
      for (;;)
      {
        i += 1;
        break;
        label148:
        if ((bi.oW(localPreference1.mKey)) && ((localPreference1.getTitle() == null) || (localPreference1.getTitle().toString().trim().length() <= 0))) {
          localHashSet.add(e(localPreference1));
        }
      }
    }
    this.tCX.removeAll(localHashSet);
  }
  
  private static String d(Preference paramPreference)
  {
    return paramPreference.getClass().getName() + "L" + paramPreference.getLayoutResource() + "W" + paramPreference.tDx;
  }
  
  private static String e(Preference paramPreference)
  {
    if ((paramPreference.mKey != null) && (paramPreference.mKey.length() > 0)) {
      return paramPreference.mKey;
    }
    return "_anonymous_pref@" + paramPreference.hashCode();
  }
  
  public final Preference ZZ(String paramString)
  {
    return (Preference)this.tCV.get(paramString);
  }
  
  public final void a(Preference paramPreference)
  {
    a(paramPreference, -1);
  }
  
  public final void a(Preference paramPreference, int paramInt)
  {
    b(paramPreference, paramInt);
    if (!this.tDb) {
      notifyDataSetChanged();
    }
  }
  
  public final boolean aaa(String paramString)
  {
    return c(ZZ(paramString));
  }
  
  public final int aab(String paramString)
  {
    if (this.tCX == null) {
      return -1;
    }
    return this.tCX.indexOf(paramString);
  }
  
  /* Error */
  public final void addPreferencesFromResource(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield 63	com/tencent/mm/ui/base/preference/h:tDb	Z
    //   5: aload_0
    //   6: getfield 72	com/tencent/mm/ui/base/preference/h:tCT	Lcom/tencent/mm/ui/base/preference/j;
    //   9: astore 4
    //   11: aload 4
    //   13: getfield 288	com/tencent/mm/ui/base/preference/j:mContext	Landroid/content/Context;
    //   16: invokevirtual 294	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   19: iload_1
    //   20: invokevirtual 300	android/content/res/Resources:getXml	(I)Landroid/content/res/XmlResourceParser;
    //   23: astore_2
    //   24: aload 4
    //   26: getfield 304	com/tencent/mm/ui/base/preference/j:Fn	[Ljava/lang/Object;
    //   29: astore_3
    //   30: aload_3
    //   31: monitorenter
    //   32: aload_2
    //   33: invokestatic 310	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   36: astore 5
    //   38: aload 4
    //   40: getfield 304	com/tencent/mm/ui/base/preference/j:Fn	[Ljava/lang/Object;
    //   43: iconst_0
    //   44: aload 4
    //   46: getfield 288	com/tencent/mm/ui/base/preference/j:mContext	Landroid/content/Context;
    //   49: aastore
    //   50: aload_2
    //   51: invokeinterface 315 1 0
    //   56: istore_1
    //   57: iload_1
    //   58: iconst_2
    //   59: if_icmpeq +18 -> 77
    //   62: iload_1
    //   63: iconst_1
    //   64: if_icmpeq +13 -> 77
    //   67: aload_2
    //   68: invokeinterface 315 1 0
    //   73: istore_1
    //   74: goto -17 -> 57
    //   77: iload_1
    //   78: iconst_2
    //   79: if_icmpeq +57 -> 136
    //   82: new 281	android/view/InflateException
    //   85: dup
    //   86: new 173	java/lang/StringBuilder
    //   89: dup
    //   90: invokespecial 174	java/lang/StringBuilder:<init>	()V
    //   93: aload_2
    //   94: invokeinterface 318 1 0
    //   99: invokevirtual 178	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: ldc_w 320
    //   105: invokevirtual 178	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: invokevirtual 184	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   111: invokespecial 321	android/view/InflateException:<init>	(Ljava/lang/String;)V
    //   114: athrow
    //   115: astore 4
    //   117: aload 4
    //   119: athrow
    //   120: astore 4
    //   122: aload_3
    //   123: monitorexit
    //   124: aload 4
    //   126: athrow
    //   127: astore_3
    //   128: aload_2
    //   129: invokeinterface 326 1 0
    //   134: aload_3
    //   135: athrow
    //   136: aload 4
    //   138: aload_2
    //   139: invokeinterface 327 1 0
    //   144: aload 5
    //   146: invokevirtual 330	com/tencent/mm/ui/base/preference/j:a	(Ljava/lang/String;Landroid/util/AttributeSet;)Lcom/tencent/mm/ui/base/preference/Preference;
    //   149: pop
    //   150: aload 4
    //   152: aload_2
    //   153: aload_0
    //   154: aload 5
    //   156: invokevirtual 333	com/tencent/mm/ui/base/preference/j:a	(Lorg/xmlpull/v1/XmlPullParser;Lcom/tencent/mm/ui/base/preference/f;Landroid/util/AttributeSet;)V
    //   159: aload_3
    //   160: monitorexit
    //   161: aload_2
    //   162: invokeinterface 326 1 0
    //   167: aload_0
    //   168: iconst_0
    //   169: putfield 63	com/tencent/mm/ui/base/preference/h:tDb	Z
    //   172: aload_0
    //   173: invokevirtual 264	com/tencent/mm/ui/base/preference/h:notifyDataSetChanged	()V
    //   176: return
    //   177: astore 4
    //   179: new 281	android/view/InflateException
    //   182: dup
    //   183: aload 4
    //   185: invokevirtual 336	org/xmlpull/v1/XmlPullParserException:getMessage	()Ljava/lang/String;
    //   188: invokespecial 321	android/view/InflateException:<init>	(Ljava/lang/String;)V
    //   191: astore 5
    //   193: aload 5
    //   195: aload 4
    //   197: invokevirtual 340	android/view/InflateException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   200: pop
    //   201: aload 5
    //   203: athrow
    //   204: astore 4
    //   206: new 281	android/view/InflateException
    //   209: dup
    //   210: new 173	java/lang/StringBuilder
    //   213: dup
    //   214: invokespecial 174	java/lang/StringBuilder:<init>	()V
    //   217: aload_2
    //   218: invokeinterface 318 1 0
    //   223: invokevirtual 178	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: ldc_w 342
    //   229: invokevirtual 178	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: aload 4
    //   234: invokevirtual 343	java/io/IOException:getMessage	()Ljava/lang/String;
    //   237: invokevirtual 178	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: invokevirtual 184	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   243: invokespecial 321	android/view/InflateException:<init>	(Ljava/lang/String;)V
    //   246: astore 5
    //   248: aload 5
    //   250: aload 4
    //   252: invokevirtual 340	android/view/InflateException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   255: pop
    //   256: aload 5
    //   258: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	259	0	this	h
    //   0	259	1	paramInt	int
    //   23	195	2	localXmlResourceParser	android.content.res.XmlResourceParser
    //   127	33	3	localObject1	Object
    //   9	36	4	localj	j
    //   115	3	4	localInflateException	android.view.InflateException
    //   120	31	4	localObject2	Object
    //   177	19	4	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   204	47	4	localIOException	java.io.IOException
    //   36	221	5	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   50	57	115	android/view/InflateException
    //   67	74	115	android/view/InflateException
    //   82	115	115	android/view/InflateException
    //   136	159	115	android/view/InflateException
    //   32	50	120	finally
    //   50	57	120	finally
    //   67	74	120	finally
    //   82	115	120	finally
    //   117	120	120	finally
    //   122	124	120	finally
    //   136	159	120	finally
    //   159	161	120	finally
    //   179	204	120	finally
    //   206	259	120	finally
    //   24	32	127	finally
    //   124	127	127	finally
    //   50	57	177	org/xmlpull/v1/XmlPullParserException
    //   67	74	177	org/xmlpull/v1/XmlPullParserException
    //   82	115	177	org/xmlpull/v1/XmlPullParserException
    //   136	159	177	org/xmlpull/v1/XmlPullParserException
    //   50	57	204	java/io/IOException
    //   67	74	204	java/io/IOException
    //   82	115	204	java/io/IOException
    //   136	159	204	java/io/IOException
  }
  
  public final void b(Preference.a parama)
  {
    this.tBK = parama;
    notifyDataSetChanged();
  }
  
  public final void b(Preference paramPreference)
  {
    b(paramPreference, -1);
  }
  
  public final void bw(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      if (!this.tCW.contains(paramString)) {
        this.tCW.add(paramString);
      }
    }
    while (this.tCW.remove(paramString))
    {
      notifyDataSetChanged();
      return;
    }
  }
  
  public final boolean c(Preference paramPreference)
  {
    if (paramPreference == null) {
      return false;
    }
    String str = e(paramPreference);
    this.tCU.remove(str);
    this.tCV.remove(str);
    this.tCW.remove(paramPreference.mKey);
    notifyDataSetChanged();
    return true;
  }
  
  public int getCount()
  {
    return this.tCX.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.tCV.get(this.tCX.get(paramInt));
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public int getItemViewType(int paramInt)
  {
    if (paramInt > this.tCX.size()) {
      return -1;
    }
    Object localObject = (Preference)this.tCV.get(this.tCX.get(paramInt));
    localObject = (Integer)this.tCY.get(d((Preference)localObject));
    if (localObject == null) {
      return -1;
    }
    return ((Integer)localObject).intValue();
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
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
        ((Preference)localObject).a(this.tBK);
      }
      if (!this.tCY.containsKey(d((Preference)localObject))) {
        paramView = null;
      }
      paramViewGroup = ((Preference)localObject).getView(paramView, paramViewGroup);
      i6 = this.tDa[paramInt];
      localObject = paramViewGroup.findViewById(a.g.content);
      if (localObject == null)
      {
        x.d("MicroMsg.MMPreferenceAdapter", "find content view error");
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
    int i = a.f.settings_line;
    int i2 = paramViewGroup.getPaddingLeft();
    int i3 = paramViewGroup.getPaddingRight();
    int i4 = paramViewGroup.getPaddingTop();
    int i5 = paramViewGroup.getPaddingBottom();
    if ((i6 & 0x8) != 0) {
      if ((paramInt == this.tCX.size() - 1) || ((paramInt == this.tCX.size() - 2) && ((getItem(this.tCX.size() - 1) instanceof PreferenceCategory))))
      {
        paramInt = a.f.mm_trans;
        j = a.d.white;
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
        paramInt = a.f.mm_trans;
        break;
      }
      paramInt = a.f.list_item_normal;
      break;
      if (((i6 & 0x10) != 0) || ((i6 & 0x2) == 0))
      {
        j = a.f.list_item_normal;
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
  
  public int getViewTypeCount()
  {
    if (!this.tDc) {
      this.tDc = true;
    }
    return Math.max(1, this.tCY.size());
  }
  
  public final int indexOf(String paramString)
  {
    return this.tCU.indexOf(paramString);
  }
  
  public void notifyDataSetChanged()
  {
    int i = 0;
    this.tCX.clear();
    Object localObject = this.tCU.iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      if (!this.tCW.contains(str)) {
        if (this.tCV.get(str) == null) {
          x.e("MicroMsg.MMPreferenceAdapter", "not found pref by key " + str);
        } else {
          this.tCX.add(str);
        }
      }
    }
    if ((!this.tCX.isEmpty()) && (Ez(((Preference)this.tCV.get(this.tCX.get(0))).getLayoutResource()))) {
      b(new PreferenceSmallCategory(this.context), 0);
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
          if ((j != a.h.mm_preference) || (j == a.h.mm_preference_summary_below) || (j == a.h.mm_preference_summary_checkbox))
          {
            localObject = this.tDa;
            localObject[i] |= 0x1;
            continue;
            if (j == a.h.mm_preference_info)
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
                if ((j == a.h.mm_preference) || (j == a.h.mm_preference_summary_below) || (j == a.h.mm_preference_summary_checkbox))
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
                if ((Ez(j)) || (j == a.h.mm_preference_info))
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
  
  public final void removeAll()
  {
    this.tCX.clear();
    this.tCV.clear();
    this.tCU.clear();
    this.tCW.clear();
    notifyDataSetChanged();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/base/preference/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */