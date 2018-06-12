package c.t.m.g;

import android.net.wifi.ScanResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class dn
{
  private static List<String> a;
  
  static
  {
    ArrayList localArrayList = new ArrayList();
    a = localArrayList;
    localArrayList.add("mobile");
    a.add("16wifi");
    a.add("cmcc");
    a.add("360wifi");
    a.add("androidap");
    a.add("htcphone");
    a.add("xiaomi");
    a.add("lenovo");
    a.add("macbook");
  }
  
  public static void a(List<ScanResult> paramList)
  {
    HashSet localHashSet = new HashSet();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = ((ScanResult)paramList.next()).BSSID;
      if ((str == null) || (str.equals("000000000000")) || (str.equals("00-00-00-00-00-00")) || (str.equals("00:00:00:00:00:00"))) {
        paramList.remove();
      } else if (localHashSet.contains(str)) {
        paramList.remove();
      } else {
        localHashSet.add(str);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/c/t/m/g/dn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */