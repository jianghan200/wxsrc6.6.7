package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.text.Spanned;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class j
  implements Serializable
{
  private static final Pattern qrl = Pattern.compile("\\r\\n|\\r|\\n");
  int qrm = 0;
  public final ArrayList<n> qrn = new ArrayList();
  
  public j(Spanned paramSpanned)
  {
    if (paramSpanned != null)
    {
      paramSpanned = paramSpanned.toString();
      this.qrm = 1;
      Matcher localMatcher = qrl.matcher(paramSpanned);
      int i = 0;
      int j;
      boolean bool1;
      if (localMatcher.find())
      {
        j = localMatcher.end();
        if (this.qrm == 1) {}
        for (bool1 = true;; bool1 = false)
        {
          n localn = new n(i, j, bool1, false);
          this.qrn.add(localn);
          i = localMatcher.end();
          this.qrm += 1;
          break;
        }
      }
      if (this.qrn.size() < this.qrm)
      {
        j = paramSpanned.length();
        bool1 = bool2;
        if (this.qrm == 1) {
          bool1 = true;
        }
        paramSpanned = new n(i, j, bool1, true);
        this.qrn.add(paramSpanned);
      }
    }
  }
  
  public final int getLineForOffset(int paramInt)
  {
    int i = 0;
    while ((i < this.qrm) && (paramInt >= ((n)this.qrn.get(i)).tK)) {
      i += 1;
    }
    return Math.min(Math.max(0, i), this.qrn.size() - 1);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    Iterator localIterator = this.qrn.iterator();
    int i = 1;
    if (localIterator.hasNext())
    {
      Object localObject = (n)localIterator.next();
      StringBuilder localStringBuilder2 = localStringBuilder1.append(i).append(": ").append(((e)localObject).Tw).append("-").append(((e)localObject).tK);
      if (((n)localObject).qsU) {}
      for (localObject = "";; localObject = ", ")
      {
        localStringBuilder2.append((String)localObject);
        i += 1;
        break;
      }
    }
    return localStringBuilder1.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/manager/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */