package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import java.util.ArrayList;

public final class u
{
  public static final ArrayList<t> qtA;
  public static final b qtv = new b();
  public static final j qtw = new j();
  public static final c qtx = new c();
  public static final l qty = new l();
  public static final h qtz = new h();
  
  static
  {
    ArrayList localArrayList = new ArrayList();
    qtA = localArrayList;
    localArrayList.add(qtv);
    qtA.add(qtx);
    qtA.add(qty);
    qtA.add(qtw);
  }
  
  private static void a(WXRTEditText paramWXRTEditText, o paramo, t... paramVarArgs)
  {
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      if (paramo == paramVarArgs[i]) {
        return;
      }
      i += 1;
    }
    paramo.a(paramWXRTEditText, null, null);
  }
  
  public static void a(WXRTEditText paramWXRTEditText, t... paramVarArgs)
  {
    a(paramWXRTEditText, qtz, paramVarArgs);
    a(paramWXRTEditText, qtx, paramVarArgs);
    a(paramWXRTEditText, qty, paramVarArgs);
    a(paramWXRTEditText, qtw, paramVarArgs);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/spans/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */