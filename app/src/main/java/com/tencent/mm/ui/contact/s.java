package com.tencent.mm.ui.contact;

import java.util.HashSet;

public final class s
{
  public static final int ukE = s(new int[] { 256, 16, 1, 2, 4 });
  public static final int ukF = s(new int[] { 16, 1, 2, 4, 64, 16384 });
  public static final int ukG = s(new int[] { 16, 1, 2, 4, 64, 4096 });
  public static final int ukH = s(new int[] { ukE, 64, 16384, 4096 });
  public static final int ukI = s(new int[] { 16, 2, 16384, 4 });
  public static final int ukJ = s(new int[] { ukE, 16384, 64, 4096 });
  public static final int ukK = s(new int[] { ukE, 16384, 64, 131072, 8192 });
  public static final int ukL = s(new int[] { 16, 32, 1, 4, 2, 64 });
  public static final int ukM = s(new int[] { ukF, 131072 });
  
  public static HashSet<String> cyA()
  {
    HashSet localHashSet = new HashSet();
    localHashSet.add("officialaccounts");
    localHashSet.add("newsapp");
    String[] arrayOfString = com.tencent.mm.model.s.dAV;
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      localHashSet.add(arrayOfString[i]);
      i += 1;
    }
    localHashSet.add("weibo");
    localHashSet.add("qqmail");
    localHashSet.add("fmessage");
    localHashSet.add("tmessage");
    localHashSet.add("floatbottle");
    localHashSet.add("lbsapp");
    localHashSet.add("shakeapp");
    localHashSet.add("medianote");
    localHashSet.add("qqfriend");
    localHashSet.add("readerapp");
    localHashSet.add("newsapp");
    localHashSet.add("blogapp");
    localHashSet.add("facebookapp");
    localHashSet.add("masssendapp");
    localHashSet.add("meishiapp");
    localHashSet.add("feedsapp");
    localHashSet.add("voipapp");
    localHashSet.add("filehelper");
    localHashSet.add("officialaccounts");
    localHashSet.add("helper_entry");
    localHashSet.add("pc_share");
    localHashSet.add("cardpackage");
    localHashSet.add("voicevoipapp");
    localHashSet.add("voiceinputapp");
    localHashSet.add("linkedinplugin");
    localHashSet.add("appbrandcustomerservicemsg");
    return localHashSet;
  }
  
  public static HashSet<String> cyz()
  {
    HashSet localHashSet = new HashSet();
    localHashSet.add("weixin");
    return localHashSet;
  }
  
  public static boolean fb(int paramInt1, int paramInt2)
  {
    return (paramInt1 & paramInt2) > 0;
  }
  
  public static int fc(int paramInt1, int paramInt2)
  {
    return (paramInt2 ^ 0xFFFFFFFF) & paramInt1;
  }
  
  public static void h(HashSet<String> paramHashSet)
  {
    paramHashSet.remove("filehelper");
  }
  
  public static int s(int... paramVarArgs)
  {
    int k = paramVarArgs.length;
    int j = 0;
    int m;
    for (int i = 0; j < k; i = m | i)
    {
      m = paramVarArgs[j];
      j += 1;
    }
    return i;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/contact/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */