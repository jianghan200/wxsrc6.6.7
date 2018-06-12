package com.tencent.mm.plugin.nearlife.ui;

import android.content.Context;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import com.tencent.mm.protocal.c.aqq;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.LatLongData;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class a
  extends BaseAdapter
{
  View.OnClickListener iZP;
  protected String lCT = "";
  boolean lCX = false;
  ArrayList<com.tencent.mm.plugin.nearlife.b.a> lCY = new ArrayList();
  HashSet<String> lCZ = new HashSet();
  ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> lDa = null;
  private Map<BackwardSupportUtil.ExifHelper.LatLongData, bhy> lDb;
  private Map<BackwardSupportUtil.ExifHelper.LatLongData, Integer> lDc;
  Map<String, BackwardSupportUtil.ExifHelper.LatLongData> lDd;
  BackwardSupportUtil.ExifHelper.LatLongData lDe;
  boolean lDf = true;
  int lDg = 0;
  Context mContext;
  String mKey = "";
  
  public a(Context paramContext, View.OnClickListener paramOnClickListener, String paramString, boolean paramBoolean)
  {
    this.mContext = paramContext;
    this.iZP = paramOnClickListener;
    this.mKey = paramString;
    this.lCX = paramBoolean;
    this.lDa = new ArrayList();
    this.lDb = new HashMap();
    this.lDc = new HashMap();
    this.lDd = new HashMap();
  }
  
  public static String bC(List<bhz> paramList)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    while (i < paramList.size())
    {
      bhz localbhz = (bhz)paramList.get(i);
      if ((localbhz != null) && (localbhz.siM != null) && (!localbhz.siM.equals("")) && (!localbhz.siM.toLowerCase().equals("null")))
      {
        localStringBuffer.append(localbhz.siM);
        if (i < paramList.size() - 1) {
          localStringBuffer.append("·");
        }
      }
      i += 1;
    }
    return localStringBuffer.toString();
  }
  
  public final void G(ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> paramArrayList)
  {
    if (paramArrayList != null) {
      this.lDa = paramArrayList;
    }
  }
  
  public final void II(String paramString)
  {
    if (paramString != null) {
      this.lCT = paramString;
    }
  }
  
  public final BackwardSupportUtil.ExifHelper.LatLongData IJ(String paramString)
  {
    if (this.lDd.containsKey(paramString)) {
      return (BackwardSupportUtil.ExifHelper.LatLongData)this.lDd.get(paramString);
    }
    return null;
  }
  
  public final int IK(String paramString)
  {
    Iterator localIterator = this.lCY.iterator();
    int i = -1;
    int j;
    com.tencent.mm.plugin.nearlife.b.a locala;
    do
    {
      j = i;
      if (!localIterator.hasNext()) {
        break;
      }
      locala = (com.tencent.mm.plugin.nearlife.b.a)localIterator.next();
      j = i + 1;
      i = j;
    } while (!locala.lCG.equals(paramString));
    return j;
  }
  
  public final bhy a(BackwardSupportUtil.ExifHelper.LatLongData paramLatLongData)
  {
    if (this.lDb.containsKey(paramLatLongData)) {
      return (bhy)this.lDb.get(paramLatLongData);
    }
    return null;
  }
  
  public final void a(com.tencent.mm.plugin.nearlife.b.a parama, int paramInt)
  {
    if ((!this.lCZ.contains(parama.lCG)) && (paramInt <= this.lCY.size()))
    {
      this.lCY.add(paramInt, parama);
      this.lCZ.add(parama.lCG);
      this.lDd.put(parama.lCG, this.lDe);
    }
  }
  
  public final void a(BackwardSupportUtil.ExifHelper.LatLongData paramLatLongData, int paramInt, bhy parambhy)
  {
    int i = 0;
    float f1 = paramLatLongData.bSx;
    float f2 = paramLatLongData.dVI;
    if (parambhy == null) {}
    for (;;)
    {
      x.d("MicroMsg.BaseLifeAdapter", "set flag & buf, lat:%f long:%f flag:%d len:%d", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Integer.valueOf(paramInt), Integer.valueOf(i) });
      if ((this.lDa.contains(paramLatLongData)) || ((this.lDe != null) && (this.lDe.equals(paramLatLongData))))
      {
        this.lDc.put(paramLatLongData, Integer.valueOf(paramInt));
        this.lDb.put(paramLatLongData, parambhy);
      }
      return;
      i = parambhy.siI;
    }
  }
  
  public final void a(BackwardSupportUtil.ExifHelper.LatLongData paramLatLongData, List<com.tencent.mm.plugin.nearlife.b.a> paramList)
  {
    x.i("MicroMsg.BaseLifeAdapter", "mkey %s addlifes %d", new Object[] { this.mKey, Integer.valueOf(paramList.size()) });
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      com.tencent.mm.plugin.nearlife.b.a locala = (com.tencent.mm.plugin.nearlife.b.a)paramList.next();
      if (!this.lCZ.contains(locala.lCG))
      {
        this.lCY.add(locala);
        this.lCZ.add(locala.lCG);
        this.lDd.put(locala.lCG, paramLatLongData);
      }
    }
    notifyDataSetChanged();
  }
  
  public final int b(BackwardSupportUtil.ExifHelper.LatLongData paramLatLongData)
  {
    if (this.lDc.containsKey(paramLatLongData)) {
      return ((Integer)this.lDc.get(paramLatLongData)).intValue();
    }
    return 1;
  }
  
  public final void biY()
  {
    this.lCY.clear();
    this.lCZ.clear();
    this.lDc.clear();
    this.lDb.clear();
    this.lDd.clear();
    this.lDg = 0;
    notifyDataSetChanged();
  }
  
  public final String biZ()
  {
    return this.lCT;
  }
  
  public final boolean bja()
  {
    Iterator localIterator = this.lDa.iterator();
    while (localIterator.hasNext()) {
      if (b((BackwardSupportUtil.ExifHelper.LatLongData)localIterator.next()) > 0) {
        return true;
      }
    }
    if (this.lDf) {
      return b(this.lDe) > 0;
    }
    return false;
  }
  
  public int getCount()
  {
    return this.lCY.size();
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public final com.tencent.mm.plugin.nearlife.b.a tU(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.lCY.size())) {
      return (com.tencent.mm.plugin.nearlife.b.a)this.lCY.get(paramInt);
    }
    return new com.tencent.mm.plugin.nearlife.b.a("", new aqq());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/nearlife/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */