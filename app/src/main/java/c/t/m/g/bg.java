package c.t.m.g;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

final class bg
  extends LinkedHashMap<String, String>
{
  bg()
  {
    super(8, 1.0F, true);
  }
  
  protected final boolean removeEldestEntry(Map.Entry<String, String> paramEntry)
  {
    return size() > 8;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/c/t/m/g/bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */