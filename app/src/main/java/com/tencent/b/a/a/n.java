package com.tencent.b.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class n
  implements Runnable
{
  public static long bvM = -1L;
  private a bvK = null;
  int bvL = 0;
  private Context mContext = null;
  private int mType = 0;
  
  public n(Context paramContext, int paramInt)
  {
    this.mContext = paramContext;
    this.mType = paramInt;
  }
  
  private void c(JSONObject paramJSONObject)
  {
    if ((i.bvA == null) || (j.bvG == 1)) {
      return;
    }
    if ((j.bvH > 0) && (this.bvL > j.bvH))
    {
      new StringBuilder("limit dispatch:").append(j.bvH);
      return;
    }
    paramJSONObject = new m(this.mContext, paramJSONObject).tR().toString();
    i.bvA.cg("[" + paramJSONObject + "]");
    bvM = System.currentTimeMillis();
    this.bvL += 1;
  }
  
  private void tS()
  {
    g localg1 = r.aH(this.mContext).z(new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(1) })));
    g localg2 = r.aH(this.mContext).z(new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(2) })));
    g localg3 = r.aH(this.mContext).z(new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(4) })));
    if ((s.b(localg1, localg2)) && (s.b(localg1, localg3))) {
      return;
    }
    localg1 = s.a(s.a(localg1, localg2), s.a(localg1, localg3));
    new StringBuilder("local mid check failed, redress with mid:").append(localg1.toString());
    r.aH(this.mContext).b(localg1);
  }
  
  public final void run()
  {
    new StringBuilder("request type:").append(this.mType);
    switch (this.mType)
    {
    default: 
      new StringBuilder("wrong type:").append(this.mType);
    }
    for (;;)
    {
      return;
      c(null);
      return;
      if (this.bvK == null) {
        this.bvK = r.aH(this.mContext).tU();
      }
      long l1 = System.currentTimeMillis();
      if (i.bvB <= 0L) {
        i.bvB = PreferenceManager.getDefaultSharedPreferences(this.mContext).getLong("__MID_LAST_CHECK_TIME__", 0L);
      }
      long l2 = Math.abs(l1 - i.bvB);
      new StringBuilder("check entity: ").append(this.bvK.toString()).append(",duration:").append(l2);
      if ((this.bvK.bvc < 0) || (this.bvK.bvc > 100)) {
        this.bvK.bvc = 3;
      }
      long l3 = this.bvK.bvc * e.bvv;
      new StringBuilder("duration:").append(l2).append(",maxCheckDays:").append(l3).append(",mLastCheckTime:").append(i.bvB).append(",mCheckEntity:").append(this.bvK);
      if (l2 < l3)
      {
        if (l2 <= e.bvv) {
          continue;
        }
        tS();
        return;
      }
      tS();
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("dur", l2);
        localJSONObject.put("md", l3);
        localJSONObject.put("lct", i.bvB);
        localJSONObject.put("cur", l1);
        if (bvM > 0L) {
          continue;
        }
        c(localJSONObject);
        return;
      }
      catch (JSONException localJSONException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/b/a/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */